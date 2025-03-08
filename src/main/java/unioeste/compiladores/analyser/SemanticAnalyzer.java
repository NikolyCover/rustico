package unioeste.compiladores.analyser;

import unioeste.compiladores.exception.SemanticException;
import unioeste.compiladores.rustico.Token;
import unioeste.compiladores.rustico.TokenWrapper;
import unioeste.compiladores.symbols.SymbolInfo;
import unioeste.compiladores.symbols.SymbolTable;

import java.util.HashSet;
import java.util.Set;

public class SemanticAnalyzer {
    private static final Set<String> NUMERIC_TYPES = new HashSet<>();
    static {
        NUMERIC_TYPES.add("u8");
        NUMERIC_TYPES.add("u16");
        NUMERIC_TYPES.add("u32");
        NUMERIC_TYPES.add("u64");
        NUMERIC_TYPES.add("u128");
        NUMERIC_TYPES.add("usize");
        NUMERIC_TYPES.add("i8");
        NUMERIC_TYPES.add("i16");
        NUMERIC_TYPES.add("i32");
        NUMERIC_TYPES.add("i64");
        NUMERIC_TYPES.add("i128");
        NUMERIC_TYPES.add("isize");
        NUMERIC_TYPES.add("f32");
        NUMERIC_TYPES.add("f64");
    }

    public static void updateSymbolTable(SymbolTable symbolTable, Token id, TokenWrapper typeWrapper, TokenWrapper expressionTypeWrapper, boolean isMutable) throws SemanticException {
        String declaredType = (typeWrapper.token != null) ? typeWrapper.token.image : null;
        String inferredType = (expressionTypeWrapper.token != null) ? expressionTypeWrapper.token.image : null;

        if (declaredType == null && inferredType == null) {
            throw new SemanticException(id, "A variável '" + id.image + "' precisa ter um tipo declarado ou um valor atribuído.");
        }

        if (declaredType != null && inferredType != null && !areCompatibleTypes(declaredType, inferredType)) {
            throw new SemanticException(id, "Tipos incompatíveis na declaração da variável '" + id.image + "'. "
                    + "Esperado '" + declaredType + "', mas foi atribuído um valor do tipo '" + inferredType + "'.");
        }

        String finalType = (declaredType != null) ? declaredType : inferredType;
        symbolTable.update(id.image, new SymbolInfo(id, finalType, isMutable, null));
    }


    private static boolean areCompatibleTypes(String declaredType, String inferredType) {
        if (declaredType == null || inferredType == null) {
            return false;
        }

        if (declaredType.equals(inferredType)) {
            return true;
        }

        if (NUMERIC_TYPES.contains(declaredType) && NUMERIC_TYPES.contains(inferredType)) {
            if ((declaredType.startsWith("i") && inferredType.startsWith("i")) ||
                    (declaredType.startsWith("u") && inferredType.startsWith("u")) ||
                    (declaredType.startsWith("f") && inferredType.startsWith("f"))) {
                return true;
            }
        }

        return false;
    }

    public static void checkMutability(SymbolTable symbolTable, Token id) throws SemanticException {
        SymbolInfo symbolInfo = symbolTable.getSymbol(id.image);

        if (symbolInfo == null) {
            throw new SemanticException(id, "A variável '" + id.image + "' não foi declarada.");
        }

        if (Boolean.FALSE.equals(symbolInfo.isMutable())) {
            throw new SemanticException(id, "A variável '" + id.image + "' não pode ser modificada porque não foi declarada como mutável.");
        }
    }

}
