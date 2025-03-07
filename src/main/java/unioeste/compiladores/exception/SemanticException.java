package unioeste.compiladores.exception;

import unioeste.compiladores.rustico.Token;

public class SemanticException extends Exception {
    public SemanticException(Token token, String message) {
        super(buildSemanticExceptionMessage(token, message));
    }

    private static String buildSemanticExceptionMessage(Token token, String message) {
        StringBuilder builder = new StringBuilder();

        builder.append(message);

        return builder.toString();
    }
}
