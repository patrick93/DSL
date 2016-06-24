package ast;

import symbol.SymbolTable;

import java.util.List;

public class PropertyArrayAST implements AST {
    private List<AST> propetiesAST;

    public PropertyArrayAST(List<AST> propetiesAST) {
        this.propetiesAST = propetiesAST;
    }

    @Override
    public void loadSymbolTable(SymbolTable symbolTable) throws Exception {
        for (AST property: propetiesAST) {
            property.loadSymbolTable(symbolTable);
        }
    }
}
