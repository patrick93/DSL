package ast;

import symbol.SymbolTable;

import java.util.List;

public class ConstructorAllAST implements AST {
    private final String CONSTRUCTOR_STMT = "\tpublic %s(%s){\n%s\t}";
    private final String CONSTRUCTOR_BODY_STMT = "\t\tthis.%s = %s;\n";

    @Override
    public void loadSymbolTable(SymbolTable symbolTable) throws Exception {
        List<String> constructorProperties = symbolTable.getAllPropertiesNames();
        symbolTable.setConstructorProperties(constructorProperties);
    }
}
