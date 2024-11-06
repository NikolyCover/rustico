package unioeste.compiladores.exception;

import unioeste.compiladores.lex.ParseException;
import unioeste.compiladores.lex.Token;
import unioeste.compiladores.lex.LexerConstants;

import java.util.Arrays;

public class SyntacticException extends Exception {
    public SyntacticException(Token token, int[][] expectedTokenSequences, String[] tokenImage) {
        super(buildExceptionMessage(token, expectedTokenSequences, tokenImage));
    }

    private static String buildExceptionMessage(Token token, int[][] expectedTokenSequences, String[] tokenImage) {
        StringBuilder builder = new StringBuilder();
        String location = " (linha: " + token.beginLine + ", coluna: " + token.beginColumn + ").";

        builder.append("Erro sintático: Ocorreu um erro de sintaxe perto do token \"")
                .append(token.image).append("\"").append(location).append("\n");

        builder.append("Esperado um dos seguintes tokens: ");

        for (int[] expectedSequence : expectedTokenSequences) {
            for (int tokenId : expectedSequence) {
                builder.append(tokenImage[tokenId]).append(" ");
            }
        }

        return builder.toString();
    }
}
