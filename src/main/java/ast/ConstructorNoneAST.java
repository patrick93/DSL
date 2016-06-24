package ast;

import symbol.SymbolTable;

import java.util.ArrayList;

public class ConstructorNoneAST implements AST {

    @Override
    public void loadSymbolTable(SymbolTable symbolTable) throws Exception {
        symbolTable.setConstructorProperties(new ArrayList<String>());
    }
}
