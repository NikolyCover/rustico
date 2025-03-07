package unioeste.compiladores.analyser;

import unioeste.compiladores.exception.SemanticException;
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
        } catch (SyntacticException | ParseException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }

    private void parseStart() throws SyntacticException, ParseException {
        try{
            rustico.start(tree);
        }
        catch (ParseException e){
            if (e.getMessage().contains("Erro semântico") | e.getMessage().contains("Erro sintático")) {
                throw e;
            } else {
                throw new SyntacticException(e.currentToken, e.expectedTokenSequences, e.tokenImage, e.getMessage());
            }
        }
    }

    public TreeNode getTree(){ return this.tree; }
}
