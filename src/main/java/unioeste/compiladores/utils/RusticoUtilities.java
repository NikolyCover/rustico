package unioeste.compiladores.utils;

import unioeste.compiladores.Main;
import unioeste.compiladores.rustico.Rustico;
import unioeste.compiladores.rustico.Token;
import unioeste.compiladores.symbols.SymbolTable;

import java.io.InputStream;

public class RusticoUtilities {
    private static InputStream readFile(String filename) {
        ClassLoader classLoader = Main.class.getClassLoader();

        return classLoader.getResourceAsStream(filename);
    }

    public static Rustico createRustico(String filename, SymbolTable symbolTable) {
        return new Rustico(symbolTable, readFile(filename));
    }

    public static String getErrorMessage(Token token, String message) {
        return message + " (linha: " + token.beginLine + ", coluna: " + token.beginColumn + ").";
    }
}
