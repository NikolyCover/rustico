package unioeste.compiladores;

import unioeste.compiladores.analyser.LexicalAnalyzer;
import unioeste.compiladores.analyser.SyntacticAnalyser;
import unioeste.compiladores.rustico.Rustico;
import unioeste.compiladores.symbols.SymbolTable;
import unioeste.compiladores.utils.RusticoUtilities;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do arquivo a ser analisado: ");
        String filename = scanner.nextLine();

        SymbolTable symbolTable = new SymbolTable();

        Rustico rustico = RusticoUtilities.createRustico(filename, symbolTable);

        LexicalAnalyzer lexicalAnalyzer = new LexicalAnalyzer(rustico);
        lexicalAnalyzer.startAnalysis();

        rustico = RusticoUtilities.createRustico(filename, symbolTable);

        SyntacticAnalyser syntacticAnalyser = new SyntacticAnalyser(rustico);
        syntacticAnalyser.startAnalysis();

        System.out.println("Arquivo fonte: " + filename);

        lexicalAnalyzer.getReservedKeysTable().show("Tabela de palavras reservadas");
        rustico.getSymbolTable().show("Tabela de símbolos");

        String outputFilename = "arvore_" + filename;
        syntacticAnalyser.getTree().writeToFile(outputFilename);

        System.out.println("\n\nAnálise léxica, sintática e semântica concluídas com sucesso!. Arvore sintática escrita no arquivo: '" + outputFilename + "'.");

    }
}