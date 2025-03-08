package unioeste.compiladores.symbols;

import unioeste.compiladores.rustico.Token;

public class SymbolInfo {
    private final Token token;
    private final String type;
    private final Boolean mutable;
    private final Boolean declared;

    public SymbolInfo(Token token, String type, Boolean mutable, Boolean declared) {
        this.token = token;
        this.type = type;
        this.mutable = mutable;
        this.declared = declared;
    }

    public Token getToken() { return token; }
    public String getType() { return type; }
    public Boolean isMutable() { return mutable; }
    public Boolean isDeclared() { return declared; }
}
