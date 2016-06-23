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
    public String execute(SymbolTable symbolTable) throws Exception {
        String result = "";
        for (String property : properties) {
            String propertyType = symbolTable.getPropertyType(property);
            String methodName = property.substring(0,1).toUpperCase() + property.substring(1);
            String getStatement = String.format(GET_BASE_STMT, propertyType, methodName, property);
            String setStatement = String.format(SET_BASE_STMT, methodName, propertyType, property, property, property);
            result += "\n" + getStatement + "\n\n" + setStatement + "\n";
        }
        return result;
    }

    @Override
    public void loadSymbolTable(SymbolTable symbolTable) throws Exception {

    }
}
