grammar dsl;

@header{
    package grammar;
}

class_stmt: ID ':' package_stmt ',' properties_stmt ',' constructor_stmt ',' getset_stmt  #class
    ;

package_stmt: 'package' '->' PACKAGE_NAME  #package
    ;

properties_stmt: 'properties' '->' '[' property_stmt (',' property_stmt)* ']' #properties
    ;

property_stmt: ID ':' ID #property
    ;

constructor_stmt: 'constructor' '->' constructor_body_stmt  #constructor
    ;

constructor_body_stmt: 'all' #constructor_all
   | '[' ID (',' ID)* ']' #constructor_array
   | 'none' #constructor_none
   ;

getset_stmt: 'getterSetter' '->' getset_body_stmt #getset
    ;

getset_body_stmt: 'all' #getset_all
    | '[' ID (',' ID)* ']' #getset_array
    | 'none' #getset_none
    ;

ID : ID_LETTER (ID_LETTER | DIGIT)*
    ;

PACKAGE_NAME: LOWER_ID ('.'LOWER_ID)*
    ;

LOWER_ID: LOWER_ID_LETTER (LOWER_ID_LETTER | DIGIT)*
    ;

fragment ID_LETTER: [a-zA-Z_];
fragment LOWER_ID_LETTER: [a-z_];
fragment DIGIT: [0-9];

WS : [ \t\n\r]+ -> skip ;

