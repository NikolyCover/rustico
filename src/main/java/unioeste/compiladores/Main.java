package unioeste.compiladores;

import unioeste.compiladores.symbols.LexicalAnalyzer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do arquivo a ser analisado: ");
        String fileName = scanner.nextLine();

        LexicalAnalyzer analyzer = new LexicalAnalyzer(fileName);

        analyzer.startAnalysis();

        System.out.println("Arquivo fonte: " + analyzer.getSourceFilename());

        analyzer.getReservedKeysTable().show("Tabela de palavras reservadas");
        analyzer.getSymbolTable().show("Tabela de símbolos");
    }
}