package unioeste.compiladores.analyser;

import unioeste.compiladores.Main;
import unioeste.compiladores.exception.LexicalException;
import unioeste.compiladores.lex.Lexer;
import unioeste.compiladores.lex.LexerConstants;
import unioeste.compiladores.lex.Token;
import unioeste.compiladores.lex.TokenMgrError;
import unioeste.compiladores.symbols.SymbolTable;

import java.io.InputStream;

public class LexicalAnalyzer {
    private final String sourceFilename;
    private final Lexer lexer;

    private final SymbolTable reservedKeysTable;
    private final SymbolTable symbolTable;

    public LexicalAnalyzer(String sourceFilename) {
        InputStream sourceFile = readFile(sourceFilename);

        this.sourceFilename = sourceFilename;
        this.lexer = new Lexer(sourceFile);

        this.reservedKeysTable = new SymbolTable();
        this.symbolTable = new SymbolTable();
    }

    public void startAnalysis() {
        try{
            Token token = lexer.getNextToken();

            while (token.kind != LexerConstants.EOF) {
                handleSymbolTable(token);
                token = lexer.getNextToken();
            }
        }
        catch (TokenMgrError | LexicalException error){
            System.err.println(error.getMessage());
            System.exit(1);
        }
    }

    private static InputStream readFile(String filename) {
        ClassLoader classLoader = Main.class.getClassLoader();

        return classLoader.getResourceAsStream(filename);
    }

    private void handleSymbolTable(Token token) throws LexicalException {
        if(token.kind == LexerConstants.LINE_COMMENT || token.kind == LexerConstants.BLOCK_COMMENTS){
            return;
        }
        
        if(token.kind >= LexerConstants.KW_AS && token.kind <= LexerConstants.KW_TRY){
            reservedKeysTable.add(token.image, token);
            return;
        }

        if(token.kind >= LexerConstants.IDENTIFIER_ERROR_START && token.kind <= LexerConstants.PUNCTUATION_ERROR_INVALID){
            throw new LexicalException(token);
        }

        symbolTable.add(token.image, token);
    }

    public String getSourceFilename() {
        return sourceFilename;
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public SymbolTable getReservedKeysTable() {
        return reservedKeysTable;
    }
}
