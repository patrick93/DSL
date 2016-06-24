package utils;

public class KeywordValidation {
    public static final String[] KEYWORDS = {
            "abstract","continue","for","new","switch", "assert",
            "default", "if", "package", "synchronized", "boolean",
            "do", "goto", "private", "this", "break", "double", "implements",
            "protected", "throw", "byte", "else", "import", "public", "throws",
            "case", "enum", "instanceof", "return", "transient", "catch", "extends",
            "int","short", "try", "char", "final", "interface", "static", "void",
            "class", "finally", "long", "strictfp", "volatile", "const", "float", "native", "super", "while"
    };

    public static boolean isKeyword(String name){
        boolean result = false;
        for (String keyword : KeywordValidation.KEYWORDS) {
            if (keyword.equals(name)){
                result = true;
                break;
            }
        }
        return result;
    }
}
