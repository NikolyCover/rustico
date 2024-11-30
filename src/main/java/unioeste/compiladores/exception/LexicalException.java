package unioeste.compiladores.exception;

import unioeste.compiladores.rustico.RusticoConstants;
import unioeste.compiladores.rustico.Token;

public class LexicalException extends Exception{
    public LexicalException(Token token) {
        super(getLexicalErrorMessage(token));
    }

    private static String getLexicalErrorMessage(Token token) {
        StringBuilder builder = new StringBuilder();
        String location = " (linha: " + token.beginLine + ", coluna: " + token.beginColumn + ").";

        builder.append("Erro léxico: ");

        switch (token.kind) {
            case RusticoConstants.IDENTIFIER_ERROR_START -> {
                builder.append("Identificador inválido encontrado: ").append(token.image).append(location);
            }
            case RusticoConstants.PUNCTUATION_ERROR_INVALID -> {
                builder.append("Operador invalido encontrado: ").append(token.image).append(location);
            }
            case RusticoConstants.REAL_NUMBER_ERROR_MALFORMED -> {
                builder.append("Número real inválido encontrado: ").append(token.image).append(location);
            }
            case RusticoConstants.STRING_ERROR_UNTERMINATED -> {
                builder.append("String sem término encontrada: ").append(token.image).append(location);
            }
            default -> {
                builder.append(token.image).append(location);
            }
        }

        return builder.toString();
    }
}
