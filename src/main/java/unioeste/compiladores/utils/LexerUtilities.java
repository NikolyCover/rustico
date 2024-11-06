package unioeste.compiladores.utils;

import unioeste.compiladores.Main;
import unioeste.compiladores.lex.Lexer;

import java.io.InputStream;

public class LexerUtilities {
    private static InputStream readFile(String filename) {
        ClassLoader classLoader = Main.class.getClassLoader();

        return classLoader.getResourceAsStream(filename);
    }

    public static Lexer createLexer(String filename) {
        return new Lexer(readFile(filename));
    }
}
