package ast;

import symbol.SymbolTable;

public class ClassAST implements AST {
    private String className;
    private AST packageAST;
    private AST propertiesAST;
    private AST constructorAST;
    private AST getSetAST;
    private final String CLASS_STATEMENT = "%s\npublic class %s {\n%s\n%s\n%s\n}";
    private final String FILE_FORMAT = "%s.java";

    public ClassAST(String className, AST packageAST, AST propertiesAST, AST constructorAST, AST getSetAST) {
        this.className = className;
        this.packageAST = packageAST;
        this.propertiesAST = propertiesAST;
        this.constructorAST = constructorAST;
        this.getSetAST = getSetAST;
    }

    @Override
    public void loadSymbolTable(SymbolTable symbolTable) throws Exception {
        symbolTable.setClassName(className);
        packageAST.loadSymbolTable(symbolTable);
        propertiesAST.loadSymbolTable(symbolTable);
        constructorAST.loadSymbolTable(symbolTable);
        getSetAST.loadSymbolTable(symbolTable);
    }
}
