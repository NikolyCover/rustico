package unioeste.compiladores.analyser;

import unioeste.compiladores.exception.LexicalException;
import unioeste.compiladores.lex.Lexer;
import unioeste.compiladores.lex.LexerConstants;
import unioeste.compiladores.lex.Token;
import unioeste.compiladores.lex.TokenMgrError;
import unioeste.compiladores.symbols.SymbolTable;
import unioeste.compiladores.utils.LexerUtilities;

public class LexicalAnalyzer {
    private final Lexer lexer;

    private final SymbolTable reservedKeysTable;
    private final SymbolTable symbolTable;

    public LexicalAnalyzer(Lexer lexer) {
        this.lexer = lexer;
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

    public Lexer getLexer(){
        return lexer;
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

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public SymbolTable getReservedKeysTable() {
        return reservedKeysTable;
    }
}
