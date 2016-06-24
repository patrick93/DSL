package visitor;

import ast.*;
import grammar.dslBaseVisitor;
import grammar.dslParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class Visitor extends dslBaseVisitor<AST> {
    @Override
    public AST visitClass(dslParser.ClassContext ctx) {
        String className = ctx.ID().getText();
        AST packageAST = visit(ctx.package_stmt());
        AST propertiesAST = visit(ctx.properties_stmt());
        AST constructorAST = visit(ctx.constructor_stmt());
        AST getSetAST = visit(ctx.getset_stmt());
        AST classAST = new ClassAST(className, packageAST, propertiesAST, constructorAST, getSetAST);
        return classAST;
    }

    @Override
    public AST visitPackage(dslParser.PackageContext ctx) {
        String packageName = ctx.PACKAGE_NAME().getText();
        AST packageAST = new PackageAST(packageName);
        return packageAST;
    }

    @Override
    public AST visitProperties(dslParser.PropertiesContext ctx) {
        List<AST> propetiesAST = new ArrayList<AST>();
        for (dslParser.Property_stmtContext propertyContext: ctx.property_stmt()) {
            propetiesAST.add(visit(propertyContext));
        }
        AST propertyArrayAST = new PropertyArrayAST(propetiesAST);
        return propertyArrayAST;
    }

    @Override
    public AST visitProperty(dslParser.PropertyContext ctx) {
        String propertyName = ctx.ID(0).getText();
        String propertyType = ctx.ID(1).getText();
        AST propertyAST = new PropertyAST(propertyName, propertyType);
        return propertyAST;
    }

    @Override
    public AST visitConstructor(dslParser.ConstructorContext ctx) {
        return visit(ctx.constructor_body_stmt());
    }

    @Override
    public AST visitConstructor_all(dslParser.Constructor_allContext ctx) {
        AST constructorAll = new ConstructorAllAST();
        return constructorAll;
    }

    @Override
    public AST visitConstructor_array(dslParser.Constructor_arrayContext ctx) {
        List<String> properties = new ArrayList<String>();
        for (TerminalNode property: ctx.ID()) {
            properties.add(property.getText());
        }
        AST constructorArray = new ConstructorArrayAST(properties);
        return constructorArray;
    }

    @Override
    public AST visitConstructor_none(dslParser.Constructor_noneContext ctx) {
        AST constructorNone = new ConstructorNoneAST();
        return constructorNone;
    }

    @Override
    public AST visitGetset(dslParser.GetsetContext ctx) {
        return visit(ctx.getset_body_stmt());
    }

    @Override
    public AST visitGetset_all(dslParser.Getset_allContext ctx) {
        AST getSetAll = new GetSetAllAST();
        return getSetAll;
    }

    @Override
    public AST visitGetset_array(dslParser.Getset_arrayContext ctx) {
        List<String> properties = new ArrayList<String>();
        for (TerminalNode property: ctx.ID()) {
            properties.add(property.getText());
        }
        AST getSetArray = new GetSetArrayAST(properties);
        return getSetArray;
    }

    @Override
    public AST visitGetset_none(dslParser.Getset_noneContext ctx) {
        AST getSetNone = new GetSetNoneAST();
        return getSetNone;
    }
}
