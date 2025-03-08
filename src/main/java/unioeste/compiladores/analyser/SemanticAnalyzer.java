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

    public static void checkVariableDeclaration(Token id, TokenWrapper typeWrapper, TokenWrapper expressionTypeWrapper) throws SemanticException {
        String declaredType = (typeWrapper.token != null) ? typeWrapper.token.image : null;
        String inferredType = (expressionTypeWrapper.token != null) ? expressionTypeWrapper.token.image : null;

        if (declaredType == null && inferredType == null) {
            throw new SemanticException(id, "A variável '" + id.image + "' precisa ter um tipo declarado ou um valor atribuído.");
        }

        if (declaredType != null && inferredType != null && areIncompatibleTypes(declaredType, inferredType)) {
            throw new SemanticException(id, "Tipos incompatíveis na declaração da variável '" + id.image + "'. "
                    + "Esperado '" + declaredType + "', mas foi atribuído um valor do tipo '" + inferredType + "'.");
        }
    }

    private static boolean areIncompatibleTypes(String declaredType, String inferredType) {
        if (declaredType == null || inferredType == null) {
            return true;
        }

        if (declaredType.equals(inferredType)) {
            return false;
        }

        if (NUMERIC_TYPES.contains(declaredType) && NUMERIC_TYPES.contains(inferredType)) {
            return (!declaredType.startsWith("i") || !inferredType.startsWith("i")) &&
                    (!declaredType.startsWith("u") || !inferredType.startsWith("u")) &&
                    (!declaredType.startsWith("f") || !inferredType.startsWith("f"));
        }

        return true;
    }

    public static void checkAssignmentStatement(SymbolTable symbolTable, Token id, TokenWrapper expressionTypeWrapper) throws SemanticException {
        SymbolInfo symbolInfo = symbolTable.getSymbol(id.image);

        if (symbolInfo == null) {
            throw new SemanticException(id, "A variável '" + id.image + "' não foi declarada, portanto não pode ser usada.");
        }

        if (Boolean.FALSE.equals(symbolInfo.isMutable())) {
            throw new SemanticException(id, "A variável '" + id.image + "' não pode ser modificada porque não foi declarada como mutável.");
        }

        String declaredType = symbolInfo.getType();
        String assignedType = (expressionTypeWrapper.token != null) ? expressionTypeWrapper.token.image : null;

        if (declaredType != null && assignedType != null && areIncompatibleTypes(declaredType, assignedType)) {
            throw new SemanticException(id, "Tipos incompatíveis na atribuição para a variável '" + id.image + "'. "
                    + "Esperado '" + declaredType + "', mas foi atribuído um valor do tipo '" + assignedType + "'.");
        }
    }


    public static void checkFunctionCallStatement(SymbolTable symbolTable, Token id) throws SemanticException {
        SymbolInfo symbolInfo = symbolTable.getSymbol(id.image);

        if (symbolInfo.isDeclared() == null || !symbolInfo.isDeclared()) {
            throw new SemanticException(id, "A função '" + id.image + "' não foi declarada, portanto não pode ser usada.");
        }
    }

    public static void checkIdentifierDeclared(SymbolTable symbolTable, Token id) throws SemanticException {
        SymbolInfo symbolInfo = symbolTable.getSymbol(id.image);

        if (symbolInfo.isDeclared() == null || !symbolInfo.isDeclared()) {
            throw new SemanticException(id, "A variável '" + id.image + "' não foi declarada, portanto não pode ser usada.");
        }
    }

    public static void checkFunctionReturnType(Token id, TokenWrapper declaredReturnType, TokenWrapper actualReturnType) throws SemanticException {
        String declaredType = (declaredReturnType.token != null) ? declaredReturnType.token.image : "void";
        String actualType = (actualReturnType.token != null) ? actualReturnType.token.image : "void";

        if (areIncompatibleTypes(declaredType, actualType)) {
            throw new SemanticException(id, "O tipo de retorno da função '" + id.image + "' é incompatível. "
                    + "Esperado: '" + declaredType + "', mas retornado: '" + actualType + "'.");
        }
    }
}
