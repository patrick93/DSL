package models;

import utils.KeywordValidation;

import java.util.List;

public class ClassTemplate implements Template{
    private String className;
    private Template packageTemplate;
    private List<Template> propertiesTemplate;
    private Template constructorTemplate;
    private Template getSetTemplate;
    private final String CLASS_STATEMENT = "%s\npublic class %s {\n%s\n%s\n%s\n}";

    public ClassTemplate(String className, Template packageTemplate, List<Template> propertiesTemplate,
                         Template constructorTemplate, Template getSetTemplate) throws Exception {
        if(KeywordValidation.isKeyword(className)){
            throw new Exception("Class: A class with name " + className + " is invalid because " + className + " is a keyword");
        }

        this.className = className;
        this.packageTemplate = packageTemplate;
        this.propertiesTemplate = propertiesTemplate;
        this.constructorTemplate = constructorTemplate;
        this.getSetTemplate = getSetTemplate;
    }

    @Override
    public String getTemplate() {
        String packageStmt = packageTemplate.getTemplate();
        String properties = "";
        for (Template propertyTemplate: propertiesTemplate) {
            properties += propertyTemplate.getTemplate();
        }
        String constructor = constructorTemplate.getTemplate();
        String getSet = getSetTemplate.getTemplate();
        String result = String.format(CLASS_STATEMENT, packageStmt, className, properties, constructor, getSet);

        return result;
    }
}
