package unioeste.compiladores.symbols;

import de.vandermeer.asciitable.AsciiTable;
import de.vandermeer.skb.interfaces.transformers.textformat.TextAlignment;
import unioeste.compiladores.lex.Token;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Map;

public class SymbolTable {
    private final Hashtable<String, Token> hashTable = new Hashtable<>();

    public void add(String identifier, Token symbol) {
        hashTable.put(identifier, symbol);
    }

    public Token getSymbol(String identifier) {
        return hashTable.get(identifier);
    }

    public void remove(String identifier) {
        hashTable.remove(identifier);
    }

    public boolean isEmpty() {
        return hashTable.isEmpty();
    }

    public int getSize() {
        return hashTable.size();
    }

    private static LinkedList<Map.Entry<String, Token>> getEntriesAtIndex(int index, Hashtable<String, Token> hashtable) {
        LinkedList<Map.Entry<String, Token>> entries = new LinkedList<>();

        for (Map.Entry<String, Token> entry : hashtable.entrySet()) {
            if (Math.abs(entry.getKey().hashCode()) % hashtable.size() == index) {
                entries.add(entry);
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
            LinkedList<Map.Entry<String, Token>> entries = getEntriesAtIndex(index, hashTable);
            boolean firstEntry = true;

            for (Map.Entry<String, Token> entry : entries) {
                if (firstEntry) {
                    table.addRow(index, entry.getKey(), entry.getValue().toString());
                    firstEntry = false;
                } else {
                    table.addRow("", entry.getKey(), entry.getValue().toString());
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
