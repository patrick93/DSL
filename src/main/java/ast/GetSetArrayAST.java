package ast;

import symbol.SymbolTable;

import java.util.List;

public class GetSetArrayAST implements AST {
    private final String GET_BASE_STMT = "\tpublic %s get%s(){\n\t\treturn %s;\n\t}";
    private final String SET_BASE_STMT = "\tpublic void set%s(%s %s){\n\t\tthis.%s = %s;\n\t}";
    private List<String> properties;

    public GetSetArrayAST(List<String> properties) {
        this.properties = properties;
    }

    @Override
    public void loadSymbolTable(SymbolTable symbolTable) throws Exception {
        symbolTable.setGetSetProperties(properties);
    }
}
