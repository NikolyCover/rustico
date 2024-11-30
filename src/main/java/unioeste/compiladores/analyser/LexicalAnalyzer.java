package unioeste.compiladores.analyser;

import unioeste.compiladores.exception.LexicalException;
import unioeste.compiladores.rustico.Rustico;
import unioeste.compiladores.rustico.RusticoConstants;
import unioeste.compiladores.rustico.Token;
import unioeste.compiladores.rustico.TokenMgrError;
import unioeste.compiladores.symbols.SymbolTable;

public class LexicalAnalyzer {
    private final Rustico rustico;

    private final SymbolTable reservedKeysTable;
    private final SymbolTable symbolTable;

    public LexicalAnalyzer(Rustico rustico) {
        this.rustico = rustico;
        this.reservedKeysTable = new SymbolTable();
        this.symbolTable = new SymbolTable();
    }

    public void startAnalysis() {
        try{
            Token token = rustico.getNextToken();

            while (token.kind != RusticoConstants.EOF) {
                handleSymbolTable(token);
                token = rustico.getNextToken();
            }
        }
        catch (TokenMgrError | LexicalException error){
            System.err.println(error.getMessage());
            System.exit(1);
        }
    }

    public Rustico getRustico(){
        return rustico;
    }

    private void handleSymbolTable(Token token) throws LexicalException {
        if(token.kind == RusticoConstants.LINE_COMMENT || token.kind == RusticoConstants.BLOCK_COMMENT){
            return;
        }
        
        if(token.kind >= RusticoConstants.KW_AS && token.kind <= RusticoConstants.KW_TRY){
            reservedKeysTable.add(token.image, token);
            return;
        }

        if(token.kind >= RusticoConstants.IDENTIFIER_ERROR_START && token.kind <= RusticoConstants.PUNCTUATION_ERROR_INVALID){
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
