package models;

import com.google.common.base.Joiner;
import symbol.PropertySymbol;

import java.util.ArrayList;
import java.util.List;

public class ConstructorTemplate implements Template {
    private String className;
    private List<PropertySymbol> constructorProperties;
    private final String CONSTRUCTOR_STMT = "\tpublic %s(%s){\n%s\t}";
    private final String CONSTRUCTOR_BODY_STMT = "\t\tthis.%s = %s;\n";

    public ConstructorTemplate(String className, List<PropertySymbol> constructorProperties) {
        this.className = className;
        this.constructorProperties = constructorProperties;
    }

    @Override
    public String getTemplate() {
        List<String> properties = new ArrayList<String>();
        String constructorBody = "";
        for (PropertySymbol property : constructorProperties) {
            properties.add(property.getPropertyType() + " " + property.getPropertyName());
            constructorBody += String.format(CONSTRUCTOR_BODY_STMT, property.getPropertyName(), property.getPropertyName());
        }
        String constructorParameters = Joiner.on(", ").join(properties);
        String result = String.format(CONSTRUCTOR_STMT, className, constructorParameters, constructorBody);
        return result;
    }
}
