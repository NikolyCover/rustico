package unioeste.compiladores.symbols;

import de.vandermeer.asciitable.AsciiTable;
import de.vandermeer.skb.interfaces.transformers.textformat.TextAlignment;
import unioeste.compiladores.lex.LexerConstants;
import unioeste.compiladores.lex.Token;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Map;

public class SymbolTable {
    private final Hashtable<String, Token> hashTable = new Hashtable<>();

    public void add(String identifier, Token symbol) {
//        if(symbol.kind >= LexerConstants.DIGIT && symbol.kind <= LexerConstants.REAL){
//            if(!hashTable.containsKey(identifier)) {
//                hashTable.put(identifier, symbol);
//            }
//
//            return;
//        }

        hashTable.put(identifier, symbol);
    }

    public Token getSymbol(String identifier) {
        return hashTable.get(identifier);
    }

    public void remove(String identifier) {
        hashTable.remove(identifier);
    }

    public boolean isEmpty(){
        return hashTable.isEmpty();
    }

    public int getSize(){
        return hashTable.size();
    }

    private static LinkedList<Map.Entry<String, String>> getEntriesAtIndex(int index, Hashtable<?, ?> hashtable) {
        LinkedList<Map.Entry<String, String>> entries = new LinkedList<>();

        for (Map.Entry<?, ?> entry : hashtable.entrySet()) {
            if (entry.getKey().hashCode() % hashtable.size() == index) {
                entries.add((Map.Entry<String, String>) entry);
            }
        }

        return entries;
    }

    public void show(String title) {
        AsciiTable titleTable = new AsciiTable();
        AsciiTable table = new AsciiTable();

        titleTable.addRule();
        titleTable.addRow(title);
        titleTable.addRule();

        table.addRule();
        table.addRow("Índice", "Chave", "Token");
        table.addRule();

        for (int index = 0; index < hashTable.size(); index++) {
            LinkedList<Map.Entry<String, String>> entries = getEntriesAtIndex(index, hashTable);
            boolean firstEntry = true;

            for (Map.Entry<?, ?> entry : entries) {
                if (firstEntry) {
                    table.addRow(index, entry.getKey(), entry.getValue());
                    firstEntry = false;
                } else {
                    table.addRow("", entry.getKey(), entry.getValue());
                }
                table.addRule();
            }
        }

        table.setTextAlignment(TextAlignment.CENTER);
        titleTable.setTextAlignment(TextAlignment.CENTER);

        System.out.println(titleTable.render());
        System.out.println(table.render());
    }
}
