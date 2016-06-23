package ast;

import symbol.SymbolTable;

public class ConstructorNoneAST implements AST {
    @Override
    public String execute(SymbolTable symbolTable) {
        return "";
    }

    @Override
    public void loadSymbolTable(SymbolTable symbolTable) throws Exception {

    }
}
