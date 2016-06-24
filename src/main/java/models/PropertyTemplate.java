package models;

import utils.KeywordValidation;

public class PropertyTemplate implements Template {
    private String propertyName;
    private String propertyType;
    private final String PROPERTY_STATEMENT = "\tprivate %s %s;\n";

    public PropertyTemplate(String propertyName, String propertyType) throws Exception {
        if (KeywordValidation.isKeyword(propertyName)){
            throw new Exception("Property: A property with name " + propertyName + " is invalid because " + propertyName + " is a keyword");
        }
        this.propertyName = propertyName;
        this.propertyType = propertyType;
    }

    @Override
    public String getTemplate() {
        String result = String.format(PROPERTY_STATEMENT, propertyType, propertyName);
        return result;
    }
}
