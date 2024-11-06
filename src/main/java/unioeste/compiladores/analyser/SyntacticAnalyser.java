package unioeste.compiladores.analyser;

import unioeste.compiladores.exception.SyntacticException;
import unioeste.compiladores.lex.Lexer;
import unioeste.compiladores.lex.ParseException;

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
        try{
            lexer.start();
            System.out.println("Parsing completed successfully.");
        }
        catch (ParseException e){
            throw new SyntacticException(e.currentToken, e.expectedTokenSequences, e.tokenImage);
        }
    }
}
