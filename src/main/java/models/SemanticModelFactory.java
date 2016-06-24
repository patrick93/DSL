package models;

import symbol.PropertySymbol;
import symbol.SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class SemanticModelFactory {
    public static Template buildSemanticModelFromSymbolTable(SymbolTable symbolTable) throws Exception {
        Template packageTemplate = new PackageTemplate(symbolTable.getPackageName());

        List<Template> propertiesTemplate = new ArrayList<Template>();
        for (String propertyName: symbolTable.getAllPropertiesNames()) {
            PropertySymbol property = symbolTable.getProperty(propertyName);
            propertiesTemplate.add(new PropertyTemplate(property.getPropertyName(), property.getPropertyType()));
        }

        List<PropertySymbol> constructorProperties = new ArrayList<PropertySymbol>();
        for (String propertyName : symbolTable.getConstructorProperties()) {
            PropertySymbol property = symbolTable.getProperty(propertyName);
            if (property != null){
                constructorProperties.add(property);
            } else {
                throw new Exception("Constructor: could not find a property with name " + propertyName);
            }
        }

        List<PropertySymbol> getSetProperties = new ArrayList<PropertySymbol>();
        for (String propertyName : symbolTable.getGetSetProperties()) {
            PropertySymbol property = symbolTable.getProperty(propertyName);
            if (property != null){
                getSetProperties.add(property);
            } else {
                throw new Exception("GetterSetter: could not find a property with name " + propertyName);
            }
        }

        Template constructorTemplate = new ConstructorTemplate(symbolTable.getClassName(), constructorProperties);

        Template getSetTemplate = new GetSetTemplate(getSetProperties);

        ClassTemplate classTemplate = new ClassTemplate(symbolTable.getClassName(), packageTemplate, propertiesTemplate,
                constructorTemplate, getSetTemplate);

        return classTemplate;
    }
}
