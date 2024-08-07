package unioeste.compiladores.symbols;

import unioeste.compiladores.lex.LexerConstants;
import unioeste.compiladores.lex.Token;

public class SymbolTableHandler {
    public static void handleSymbolTable(Token token, SymbolTable reservedKeysTable, SymbolTable symbolTable){
        if(token.kind >= LexerConstants.KW_AS && token.kind <= LexerConstants.KW_TRY){
            reservedKeysTable.add(token.image, token);
            return;
        }

        if(token.kind >= LexerConstants.PLUS && token.kind <= LexerConstants.TILDE){
            reservedKeysTable.add(token.image, token);
            return;
        }

        if(token.kind >= LexerConstants.LBRACE && token.kind <= LexerConstants.RPAREN){
            reservedKeysTable.add(token.image, token);
            return;
        }

        symbolTable.add(token.image, token);
    }
}
