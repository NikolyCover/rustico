package unioeste.compiladores;

import unioeste.compiladores.analyser.LexicalAnalyzer;
import unioeste.compiladores.analyser.SyntacticAnalyser;
import unioeste.compiladores.rustico.Rustico;
import unioeste.compiladores.utils.RusticoUtilities;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do arquivo a ser analisado: ");
        String filename = scanner.nextLine();

        Rustico rustico = RusticoUtilities.createRustico(filename);

        LexicalAnalyzer lexicalAnalyzer = new LexicalAnalyzer(rustico);

        lexicalAnalyzer.startAnalysis();

        System.out.println("Arquivo fonte: " + filename);

        lexicalAnalyzer.getReservedKeysTable().show("Tabela de palavras reservadas");
        lexicalAnalyzer.getSymbolTable().show("Tabela de símbolos");

        rustico = RusticoUtilities.createRustico(filename);

        SyntacticAnalyser syntacticAnalyser = new SyntacticAnalyser(rustico);

        syntacticAnalyser.startAnalysis();

        syntacticAnalyser.getTree().print();
        String outputFilename = "arvore_" + filename;
        syntacticAnalyser.getTree().writeToFile(outputFilename);

        System.out.println("\n\nAnálise léxica e sintática concluídas com sucesso!. Arvore sintática escrita no arquivo: '" + outputFilename + "'.");
    }
}