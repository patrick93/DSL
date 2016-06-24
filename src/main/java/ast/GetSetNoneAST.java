package ast;

import symbol.SymbolTable;

import java.util.ArrayList;

public class GetSetNoneAST implements AST {

    @Override
    public void loadSymbolTable(SymbolTable symbolTable) throws Exception {
        symbolTable.setGetSetProperties(new ArrayList<String>());
    }
}
