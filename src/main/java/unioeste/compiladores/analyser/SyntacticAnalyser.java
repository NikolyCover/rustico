package unioeste.compiladores.analyser;

import unioeste.compiladores.exception.SyntacticException;
import unioeste.compiladores.rustico.Rustico;
import unioeste.compiladores.rustico.ParseException;
import unioeste.compiladores.symbols.TreeNode;

public class SyntacticAnalyser {
    private final Rustico rustico;
    private final TreeNode tree;

    public SyntacticAnalyser(Rustico rustico) {
        this.rustico = rustico;
        this.tree = new TreeNode("start");
    }

    public void startAnalysis(){
        try {
            parseStart();
        } catch (SyntacticException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }

    private void parseStart() throws SyntacticException {
        try{
            rustico.start(tree);
        }
        catch (ParseException e){
            throw new SyntacticException(e.currentToken, e.expectedTokenSequences, e.tokenImage, e.getMessage());
        }
    }

    public TreeNode getTree(){ return this.tree; }
}
