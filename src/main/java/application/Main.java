package application;

import ast.AST;
import grammar.dslLexer;
import grammar.dslParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import symbol.SymbolTable;
import visitor.Visitor;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/input.txt"))){
            String inputString = "";
            String line;
            while ((line = br.readLine()) != null){
                inputString += line;
            }
            ANTLRInputStream input = new ANTLRInputStream(inputString);
            dslLexer lexer = new dslLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            dslParser parser = new dslParser(tokens);
            ParseTree tree = parser.class_stmt(); // load; start at prog

            Visitor visitor = new Visitor();
            AST ast = visitor.visit(tree);
            SymbolTable symbolTable = new SymbolTable(new HashMap<String, String>());
            ast.loadSymbolTable(symbolTable);
            ast.execute(symbolTable);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
