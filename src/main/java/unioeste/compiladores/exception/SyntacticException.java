package unioeste.compiladores.exception;

import unioeste.compiladores.rustico.Token;

public class SyntacticException extends Exception {
    public SyntacticException(Token token, int[][] expectedTokenSequences, String[] tokenImage, String parseExceptionMessage) {
        super(buildSyntacticExceptionMessage(token, expectedTokenSequences, tokenImage, parseExceptionMessage));
    }

    private static String buildSyntacticExceptionMessage(Token token, int[][] expectedTokenSequences, String[] tokenImage, String parseExceptionMessage) {
        StringBuilder builder = new StringBuilder();

        if (token == null) {
            builder.append(parseExceptionMessage).append("\n");
        } else {
            String location = " (linha: " + token.beginLine + ", coluna: " + token.beginColumn + ").";
            builder.append("Erro sintático: Ocorreu um erro de sintaxe perto do token \"")
                    .append(token.image).append("\"").append(location).append("\n");

            builder.append("Esperado um dos seguintes tokens: ");
            for (int[] expectedSequence : expectedTokenSequences) {
                for (int tokenId : expectedSequence) {
                    builder.append(tokenImage[tokenId]).append(" ");
                }
            }
        }

        return builder.toString();
    }

}
