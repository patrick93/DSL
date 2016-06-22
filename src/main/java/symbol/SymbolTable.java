package symbol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SymbolTable {
    private String className;
    private HashMap<String, String> properties;

    public SymbolTable(HashMap<String, String> properties) {
        this.properties = properties;
    }

    public List<String> getAllPropertiesNames() {
        return new ArrayList<String>(properties.keySet());
    }

    public String getClassName() {
        return className;
    }

    public String getPropertyType(String property) {
        return properties.get(property);
    }

    public void addPropety(String propertyName, String propertyType) {
        properties.put(propertyName, propertyType);
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
