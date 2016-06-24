package models;

import symbol.PropertySymbol;

import java.util.List;

public class GetSetTemplate implements Template {
    private List<PropertySymbol> getSetProperties;
    private final String GET_BASE_STMT = "\tpublic %s get%s(){\n\t\treturn %s;\n\t}";
    private final String SET_BASE_STMT = "\tpublic void set%s(%s %s){\n\t\tthis.%s = %s;\n\t}";

    public GetSetTemplate(List<PropertySymbol> getSetProperties) {
        this.getSetProperties = getSetProperties;
    }

    @Override
    public String getTemplate() {
        String result = "";
        for (PropertySymbol property : getSetProperties) {
            String methodName = property.getPropertyName().substring(0,1).toUpperCase() + property.getPropertyName().substring(1);
            String getStatement = String.format(GET_BASE_STMT, property.getPropertyType(), methodName, property.getPropertyName());
            String setStatement = String.format(SET_BASE_STMT, methodName, property.getPropertyType(), property.getPropertyName(),
                    property.getPropertyName(), property.getPropertyName());
            result += "\n" + getStatement + "\n\n" + setStatement + "\n";
        }
        return result;
    }
}
