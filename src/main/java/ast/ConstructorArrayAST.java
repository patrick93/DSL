package ast;

import symbol.SymbolTable;

import java.util.List;

public class ConstructorArrayAST implements AST {
    private final String CONSTRUCTOR_STMT = "\tpublic %s(%s){\n%s\t}";
    private final String CONSTRUCTOR_BODY_STMT = "\t\tthis.%s = %s;\n";
    private List<String> properties;

    public ConstructorArrayAST(List<String> properties) {
        this.properties = properties;
    }

    @Override
    public void loadSymbolTable(SymbolTable symbolTable) throws Exception {
        symbolTable.setConstructorProperties(properties);
    }
}
