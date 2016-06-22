package ast;

import com.google.common.base.Joiner;
import symbol.SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class ConstructorAllAST implements AST {
    private final String CONSTRUCTOR_STMT = "\tpublic %s(%s){\n%s\t}";
    private final String CONSTRUCTOR_BODY_STMT = "\t\tthis.%s = %s;\n";

    @Override
    public String execute(SymbolTable symbolTable) {
        String className = symbolTable.getClassName();
        List<String> propertiesNames = symbolTable.getAllPropertiesNames();
        List<String> constructorProperties = new ArrayList<String>();
        String constructorBody = "";
        for (String property : propertiesNames) {
            String propertyType = symbolTable.getPropertyType(property);
            constructorProperties.add(propertyType + " " + property);
            constructorBody += String.format(CONSTRUCTOR_BODY_STMT, property, property);
        }
        String constructorParameters = Joiner.on(", ").join(constructorProperties);
        String result = String.format(CONSTRUCTOR_STMT, className, constructorParameters, constructorBody);
        return result;
    }
}
