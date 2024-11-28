package unioeste.compiladores.symbols;

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

    public void print(int depth) {
        for (int i = 0; i < depth; i++) System.out.print("  ");
        System.out.println(value);
        for (TreeNode child : children) {
            child.print(depth + 1);
        }
    }
}
