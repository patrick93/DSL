package ast;

import symbol.SymbolTable;

import java.io.PrintWriter;

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
    public String execute(SymbolTable symbolTable) throws Exception {
        String filepath = String.format(FILE_FORMAT, className);
        String packageStmt = packageAST.execute(symbolTable);
        String properties = propertiesAST.execute(symbolTable);
        String constructor = constructorAST.execute(symbolTable);
        String getSet = getSetAST.execute(symbolTable);
        String result = String.format(CLASS_STATEMENT, packageStmt, className, properties, constructor, getSet);

        PrintWriter writer = new PrintWriter(filepath, "UTF-8");
        writer.println(result);
        writer.close();

        return "Created java class " + className + " successfull";
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
