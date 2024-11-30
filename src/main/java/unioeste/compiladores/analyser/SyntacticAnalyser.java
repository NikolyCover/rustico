package unioeste.compiladores.analyser;

import unioeste.compiladores.exception.SyntacticException;
import unioeste.compiladores.lex.Lexer;
import unioeste.compiladores.lex.ParseException;
import unioeste.compiladores.symbols.TreeNode;

public class SyntacticAnalyser {
    private final Lexer lexer;
    private final TreeNode tree;

    public SyntacticAnalyser(Lexer lexer) {
        this.lexer = lexer;
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
            lexer.start(tree);
        }
        catch (ParseException e){
            throw new SyntacticException(e.currentToken, e.expectedTokenSequences, e.tokenImage);
        }
    }

    public TreeNode getTree(){ return this.tree; }
}
