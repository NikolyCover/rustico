package unioeste.compiladores.analyser;

import unioeste.compiladores.exception.SyntacticException;
import unioeste.compiladores.lex.Lexer;
import unioeste.compiladores.lex.ParseException;
import unioeste.compiladores.symbols.TreeNode;

public class SyntacticAnalyser {
    private final Lexer lexer;

    public SyntacticAnalyser(Lexer lexer) {
        this.lexer = lexer;
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
        TreeNode treeNode = new TreeNode("start");

        try{
            lexer.start(treeNode);

            System.out.println("\n\nÁrvore de análise sintática:\n");
            treeNode.print(0);
        }
        catch (ParseException e){
            throw new SyntacticException(e.currentToken, e.expectedTokenSequences, e.tokenImage);
        }
    }
}
