package unioeste.compiladores.symbols;

import de.vandermeer.asciitable.AsciiTable;
import de.vandermeer.skb.interfaces.transformers.textformat.TextAlignment;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Map;

public class SymbolTable {
    private final Hashtable<String, SymbolInfo> hashTable = new Hashtable<>();

    public void add(String identifier, SymbolInfo symbol) {
        if (!hashTable.containsKey(identifier)) {
            hashTable.put(identifier, symbol);
        }
    }

    public void update(String identifier, String type, Boolean mutable, Boolean declared) {
        if (hashTable.containsKey(identifier)) {
            SymbolInfo existingSymbol = hashTable.get(identifier);

            SymbolInfo updatedSymbol = new SymbolInfo(
                    existingSymbol.getToken(),
                    type != null ? type : existingSymbol.getType(),
                    mutable != null ? mutable : existingSymbol.isMutable(),
                    declared != null ? declared : existingSymbol.isDeclared()
            );

            hashTable.put(identifier, updatedSymbol);
        }
    }


    public SymbolInfo getSymbol(String identifier) {
        return hashTable.get(identifier);
    }

    private static LinkedList<Map.Entry<String, SymbolInfo>> getEntriesAtIndex(int index, Hashtable<String, SymbolInfo> hashtable) {
        LinkedList<Map.Entry<String, SymbolInfo>> entries = new LinkedList<>();

        for (Map.Entry<String, SymbolInfo> entry : hashtable.entrySet()) {
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
        table.addRow("Índice", "Chave", "Tipo", "Mutável", "Declarado");
        table.addRule();

        for (int index = 0; index < hashTable.size(); index++) {
            LinkedList<Map.Entry<String, SymbolInfo>> entries = getEntriesAtIndex(index, hashTable);
            boolean firstEntry = true;

            for (Map.Entry<String, SymbolInfo> entry : entries) {
                SymbolInfo symbol = entry.getValue();

                if (firstEntry) {
                    table.addRow(
                            index,
                            entry.getKey(),
                            symbol.getType() != null ? symbol.getType() : "-",
                            symbol.isMutable() != null ? (symbol.isMutable() ? "Sim" : "Não") : "-",
                            symbol.isDeclared() != null ? (symbol.isDeclared() ? "Sim" : "Não") : "-"
                    );
                    firstEntry = false;
                } else {
                    table.addRow(
                            "",
                            entry.getKey(),
                            symbol.getType() != null ? symbol.getType() : "-",
                            symbol.isMutable() != null ? (symbol.isMutable() ? "Sim" : "Não") : "-",
                            symbol.isDeclared() != null ? (symbol.isDeclared() ? "Sim" : "Não") : "-"
                    );
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
