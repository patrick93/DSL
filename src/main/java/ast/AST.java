package ast;

import symbol.SymbolTable;

public interface AST {
    String execute(SymbolTable symbolTable);
}
