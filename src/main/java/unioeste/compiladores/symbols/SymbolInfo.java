package unioeste.compiladores.symbols;

import unioeste.compiladores.rustico.Token;
import java.util.List;

public class SymbolInfo {
    private final Token token;
    private final String type;
    private final Boolean mutable;
    private final Boolean initialized;

    public SymbolInfo(Token token, String type, Boolean mutable, Boolean initialized) {
        this.token = token;
        this.type = type;
        this.mutable = mutable;
        this.initialized = initialized;
    }

    public Token getToken() { return token; }
    public String getType() { return type; }
    public Boolean isMutable() { return mutable; }
    public Boolean isInitialized() { return initialized; }
}
