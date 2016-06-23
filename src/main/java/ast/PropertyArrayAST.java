package ast;

import symbol.SymbolTable;

import java.util.List;

public class PropertyArrayAST implements AST {
    private List<AST> propetiesAST;

    public PropertyArrayAST(List<AST> propetiesAST) {
        this.propetiesAST = propetiesAST;
    }

    @Override
    public String execute(SymbolTable symbolTable) throws Exception {
        String result = "";
        for (AST property : propetiesAST) {
            result += "\t" + property.execute(symbolTable) + "\n";
        }
        return result;
    }

    @Override
    public void loadSymbolTable(SymbolTable symbolTable) throws Exception {
        for (AST property: propetiesAST) {
            property.loadSymbolTable(symbolTable);
        }
    }
}
