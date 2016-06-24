package ast;

import symbol.SymbolTable;

import java.util.List;

public class GetSetAllAST implements AST {
    private final String GET_BASE_STMT = "\tpublic %s get%s(){\n\t\treturn %s;\n\t}";
    private final String SET_BASE_STMT = "\tpublic void set%s(%s %s){\n\t\tthis.%s = %s;\n\t}";

    @Override
    public void loadSymbolTable(SymbolTable symbolTable) throws Exception {
        List<String> getSetProperties = symbolTable.getAllPropertiesNames();
        symbolTable.setGetSetProperties(getSetProperties);
    }
}
