package ast;

import symbol.SymbolTable;

public interface AST {
    void loadSymbolTable(SymbolTable symbolTable) throws Exception;
}
