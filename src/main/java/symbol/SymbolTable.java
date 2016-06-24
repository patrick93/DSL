package symbol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SymbolTable {
    private String className;
    private String packageName;
    private HashMap<String, PropertySymbol> properties = new HashMap<String, PropertySymbol>();
    private List<String> constructorProperties;
    private List<String> getSetProperties;

    public List<String> getAllPropertiesNames() {
        return new ArrayList<String>(properties.keySet());
    }

    public String getClassName() {
        return className;
    }

    public PropertySymbol getProperty(String property){
        return properties.get(property);
    }

    public void addPropety(String propertyName, String propertyType) throws Exception {
        if (properties.get(propertyName) == null){
            properties.put(propertyName, new PropertySymbol(propertyName, propertyType));
        } else {
            throw new Exception("Duplicate property with name " + propertyName);
        }
    }

    public void setClassName(String className) throws Exception {
        this.className = className;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) throws Exception {
        this.packageName = packageName;
    }

    public void setConstructorProperties(List<String> constructorProperties) {
        this.constructorProperties = constructorProperties;
    }

    public void setGetSetProperties(List<String> getSetProperties) {
        this.getSetProperties = getSetProperties;
    }

    public List<String> getConstructorProperties() {
        return constructorProperties;
    }

    public List<String> getGetSetProperties() {
        return getSetProperties;
    }
}
