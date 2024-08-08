package unioeste.compiladores.exception;

import unioeste.compiladores.lex.LexerConstants;
import unioeste.compiladores.lex.Token;

public class LexicalException extends Exception{
    public LexicalException(Token token) {
        super(getLexicalErrorMessage(token));
    }

    private static String getLexicalErrorMessage(Token token) {
        StringBuilder builder = new StringBuilder();
        String location = " (linha: " + token.beginLine + ", coluna: " + token.beginColumn + ").";

        builder.append("Erro léxico: ");

        switch (token.kind) {
            case LexerConstants.IDENTIFIER_ERROR -> {
                builder.append("Identificador mal formado encontrado: ").append(token.image).append(location);
            }
            default -> {
                builder.append(token.image).append(location);
            }
        }

        return builder.toString();
    }
}
