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
    public void loadSymbolTable(SymbolTable symbolTable) throws Exception {
        symbolTable.addPropety(propertyName, propertyType);
    }
}
