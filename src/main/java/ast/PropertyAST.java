package ast;

import symbol.SymbolTable;

public class PropertyAST implements AST {
    private String propertyName;
    private String propertyType;
    private final String PROPERTY_STATEMENT = "private %s %s;";

    public PropertyAST(String propertyName, String propertyType) {
        this.propertyName = propertyName;
        this.propertyType = propertyType;
    }

    @Override
    public String execute(SymbolTable symbolTable) {
        String result = String.format(PROPERTY_STATEMENT, propertyType, propertyName);
        return result;
    }

    @Override
    public void loadSymbolTable(SymbolTable symbolTable) throws Exception {
        symbolTable.addPropety(propertyName, propertyType);
    }
}
