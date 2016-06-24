package application;

import ast.AST;
import grammar.dslLexer;
import grammar.dslParser;
import models.SemanticModelFactory;
import models.Template;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import symbol.SymbolTable;
import visitor.Visitor;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String inputPath = args[0];
        String outputPath = "";
        if (args.length > 1){
            outputPath = args[1];
        }
        try (BufferedReader br = new BufferedReader(new FileReader(inputPath))){
            String inputString = "";
            String line;
            while ((line = br.readLine()) != null){
                inputString += line;
            }
            ANTLRInputStream input = new ANTLRInputStream(inputString);
            dslLexer lexer = new dslLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            dslParser parser = new dslParser(tokens);
            ParseTree tree = parser.class_stmt();

            Visitor visitor = new Visitor();
            AST ast = visitor.visit(tree);
            SymbolTable symbolTable = new SymbolTable();
            ast.loadSymbolTable(symbolTable);
            Template template = SemanticModelFactory.buildSemanticModelFromSymbolTable(symbolTable);
            String filepath = String.format(outputPath + "%s.java", symbolTable.getClassName());

            PrintWriter writer = new PrintWriter(filepath, "UTF-8");
            writer.println(template.getTemplate());
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
