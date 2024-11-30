package unioeste.compiladores.symbols;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    private String value;
    private final List<TreeNode> children;

    public TreeNode(String value) {
        this.value = value;
        this.children = new ArrayList<>();
    }

    public void addChild(TreeNode node) {
        children.add(node);
    }

    private void print(int depth) {
        for (int i = 0; i < depth; i++) System.out.print("  ");
        System.out.println(value);
        for (TreeNode child : children) {
            child.print(depth + 1);
        }
    }

    public void print() {
        System.out.println("\n\nÁrvore de análise sintática:\n");
        print(0);
    }

    private void writeToFile(BufferedWriter writer, int depth) throws IOException {
        for (int i = 0; i < depth; i++) writer.write("  ");
        writer.write(value);
        writer.newLine();
        for (TreeNode child : children) {
            child.writeToFile(writer, depth + 1);
        }
    }

    public void writeToFile(String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writeToFile(writer, 0);
        }
    }
}
