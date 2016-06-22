package ast;

import symbol.SymbolTable;

import java.util.List;

public class PropertyArrayAST implements AST {
    private List<AST> propetiesAST;

    public PropertyArrayAST(List<AST> propetiesAST) {
        this.propetiesAST = propetiesAST;
    }

    @Override
    public String execute(SymbolTable symbolTable) {
        String result = "";
        for (AST property : propetiesAST) {
            result += "\t" + property.execute(symbolTable) + "\n";
        }
        return result;
    }
}
