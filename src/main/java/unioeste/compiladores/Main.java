package unioeste.compiladores;

import unioeste.compiladores.lex.Lexer;
import unioeste.compiladores.lex.LexerConstants;
import unioeste.compiladores.lex.Token;
import unioeste.compiladores.symbols.SymbolTable;
import unioeste.compiladores.symbols.SymbolTableHandler;

import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do arquivo a ser analisado:");
        String fileName = scanner.nextLine();

        SymbolTable symbolTable = new SymbolTable();
        SymbolTable reservedSymbolTable = new SymbolTable();

        ClassLoader classLoader = Main.class.getClassLoader();
        InputStream file = classLoader.getResourceAsStream(fileName);

        Lexer lexer = new Lexer(file);

        Token token = lexer.getNextToken();

        while (token.kind != LexerConstants.EOF) {
            System.out.println(token);

            SymbolTableHandler.handleSymbolTable(token, reservedSymbolTable, symbolTable);

            token = lexer.getNextToken();
        }

        reservedSymbolTable.show("Tabela de palavras reservadas");
        symbolTable.show("Tabela de símbolos");
    }
}