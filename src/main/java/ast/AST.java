package ast;

import symbol.SymbolTable;

public interface AST {
    String execute(SymbolTable symbolTable) throws Exception;
    void loadSymbolTable(SymbolTable symbolTable) throws Exception;
}
