package unioeste.compiladores.symbols;

import unioeste.compiladores.exception.LexicalException;
import unioeste.compiladores.lex.LexerConstants;
import unioeste.compiladores.lex.Token;

public class SymbolTableHandler {
    public static void handleSymbolTable(Token token, SymbolTable reservedKeysTable, SymbolTable symbolTable) throws LexicalException {
        if(token.kind == LexerConstants.LINE_COMMENT){
            return;
        }
        
        if(token.kind >= LexerConstants.KW_AS && token.kind <= LexerConstants.KW_TRY){
            reservedKeysTable.add(token.image, token);
            return;
        }

        if(token.kind == LexerConstants.IDENTIFIER_ERROR){
            throw new LexicalException(token);
        }

        System.out.println(token);
        symbolTable.add(token.image, token);
    }
}
