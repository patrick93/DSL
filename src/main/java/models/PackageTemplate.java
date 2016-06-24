package models;

import utils.KeywordValidation;

public class PackageTemplate implements Template {
    private String packageName;
    private final String PACKAGE_STATEMENT = "package %s\n";

    public PackageTemplate(String packageName) throws Exception {
        validate(packageName);
        this.packageName = packageName;
    }

    private void validate(String packageName) throws Exception {
        String[] packagesParts = packageName.split("\\.");
        for (String part: packagesParts) {
            if (KeywordValidation.isKeyword(part)){
                throw new Exception("Package: A package name cannot contain " + part + " because " + part + " is a keyword");
            }
        }
    }

    @Override
    public String getTemplate() {
        String result = String.format(PACKAGE_STATEMENT, packageName);
        return result;
    }
    
    
}
