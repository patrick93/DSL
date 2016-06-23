package symbol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SymbolTable {
    private String className;
    private String packageName;
    private HashMap<String, String> properties;
    private String[] keywords = {
            "abstract","continue","for","new","switch", "assert",
            "default", "if", "package", "synchronized", "boolean",
            "do", "goto", "private", "this", "break", "double", "implements",
            "protected", "throw", "byte", "else", "import", "public", "throws",
            "case", "enum", "instanceof", "return", "transient", "catch", "extends",
            "int","short", "try", "char", "final", "interface", "static", "void",
            "class", "finally", "long", "strictfp", "volatile", "const", "float", "native", "super", "while"
    };

    public SymbolTable(HashMap<String, String> properties) {
        this.properties = properties;
    }

    public List<String> getAllPropertiesNames() {
        return new ArrayList<String>(properties.keySet());
    }

    public String getClassName() {
        return className;
    }

    public String getPropertyType(String property) throws Exception {
        String propertyType = properties.get(property);
        if (propertyType == null){
            throw new Exception("Don't exists a property with name " + property);
        }
        return properties.get(property);
    }

    public void addPropety(String propertyName, String propertyType) throws Exception {
        if (isNotKeyword(propertyName)){
            if (properties.get(propertyName) == null){
                properties.put(propertyName, propertyType);
            } else {
                throw new Exception("Already exists a property with name " + propertyName);
            }
        } else {
            throw new Exception("Property name cannot be a keyword");
        }
    }

    public void setClassName(String className) throws Exception {
        if (isNotKeyword(className)){
            this.className = className;
        } else{
            throw new Exception("Class name cannot be " + className);
        }
    }

    private boolean isNotKeyword(String name) {
        boolean result = true;
        for (String keyword : keywords) {
            if (keyword.equals(name)){
                result = false;
                break;
            }
        }
        return result;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) throws Exception {
        String[] packagesParts = packageName.split("\\.");
        for (String part: packagesParts) {
            if (!isNotKeyword(part)){
                throw new Exception("Package name cannot contain a keyword");
            }
        }
        this.packageName = packageName;
    }
}
