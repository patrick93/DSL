package ast;

import symbol.SymbolTable;

public class PackageAST implements AST {
    private final String PACKAGE_STATEMENT = "package %s\n";
    private String packageName;

    public PackageAST(String packageName) {
        this.packageName = packageName;
    }

    @Override
    public void loadSymbolTable(SymbolTable symbolTable) throws Exception {
        symbolTable.setPackageName(packageName);
    }
}
