package unioeste.compiladores.symbols;

import unioeste.compiladores.lex.Token;

import java.util.ArrayList;
import java.util.List;

public class SyntacticAnalysisTreeNode {
    private final Token value;
    private final List<SyntacticAnalysisTreeNode> children;

    public SyntacticAnalysisTreeNode(Token value) {
        this.value = value;
        this.children = new ArrayList<>();
    }

    public void append(SyntacticAnalysisTreeNode node) {
        children.add(node);
    }

    public List<SyntacticAnalysisTreeNode> getChildren() {
        return children;
    }

    public Token getValue() {
        return value;
    }

}
