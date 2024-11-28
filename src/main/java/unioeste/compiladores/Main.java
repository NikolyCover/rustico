package unioeste.compiladores;

import unioeste.compiladores.analyser.LexicalAnalyzer;
import unioeste.compiladores.analyser.SyntacticAnalyser;
import unioeste.compiladores.lex.Lexer;
import unioeste.compiladores.utils.LexerUtilities;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do arquivo a ser analisado: ");
        String filename = scanner.nextLine();

        Lexer lexer = LexerUtilities.createLexer(filename);

        LexicalAnalyzer lexicalAnalyzer = new LexicalAnalyzer(lexer);

        lexicalAnalyzer.startAnalysis();

        System.out.println("Arquivo fonte: " + filename);

        lexicalAnalyzer.getReservedKeysTable().show("Tabela de palavras reservadas");
        lexicalAnalyzer.getSymbolTable().show("Tabela de símbolos");

        lexer = LexerUtilities.createLexer(filename);

        SyntacticAnalyser syntacticAnalyser = new SyntacticAnalyser(lexer);

        syntacticAnalyser.startAnalysis();

        System.out.println("\n\nAnálise léxica e sintática concluídas com sucesso!.");
    }
}