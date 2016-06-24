// Generated from dsl.g4 by ANTLR 4.5

    package grammar;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link dslParser}.
 */
public interface dslListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code class}
	 * labeled alternative in {@link dslParser#class_stmt}.
	 * @param ctx the parse tree
	 */
	void enterClass(dslParser.ClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code class}
	 * labeled alternative in {@link dslParser#class_stmt}.
	 * @param ctx the parse tree
	 */
	void exitClass(dslParser.ClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code package}
	 * labeled alternative in {@link dslParser#package_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPackage(dslParser.PackageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code package}
	 * labeled alternative in {@link dslParser#package_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPackage(dslParser.PackageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code properties}
	 * labeled alternative in {@link dslParser#properties_stmt}.
	 * @param ctx the parse tree
	 */
	void enterProperties(dslParser.PropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code properties}
	 * labeled alternative in {@link dslParser#properties_stmt}.
	 * @param ctx the parse tree
	 */
	void exitProperties(dslParser.PropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code property}
	 * labeled alternative in {@link dslParser#property_stmt}.
	 * @param ctx the parse tree
	 */
	void enterProperty(dslParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code property}
	 * labeled alternative in {@link dslParser#property_stmt}.
	 * @param ctx the parse tree
	 */
	void exitProperty(dslParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constructor}
	 * labeled alternative in {@link dslParser#constructor_stmt}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(dslParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constructor}
	 * labeled alternative in {@link dslParser#constructor_stmt}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(dslParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constructor_all}
	 * labeled alternative in {@link dslParser#constructor_body_stmt}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_all(dslParser.Constructor_allContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constructor_all}
	 * labeled alternative in {@link dslParser#constructor_body_stmt}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_all(dslParser.Constructor_allContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constructor_array}
	 * labeled alternative in {@link dslParser#constructor_body_stmt}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_array(dslParser.Constructor_arrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constructor_array}
	 * labeled alternative in {@link dslParser#constructor_body_stmt}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_array(dslParser.Constructor_arrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constructor_none}
	 * labeled alternative in {@link dslParser#constructor_body_stmt}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_none(dslParser.Constructor_noneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constructor_none}
	 * labeled alternative in {@link dslParser#constructor_body_stmt}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_none(dslParser.Constructor_noneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getset}
	 * labeled alternative in {@link dslParser#getset_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGetset(dslParser.GetsetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getset}
	 * labeled alternative in {@link dslParser#getset_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGetset(dslParser.GetsetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getset_all}
	 * labeled alternative in {@link dslParser#getset_body_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGetset_all(dslParser.Getset_allContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getset_all}
	 * labeled alternative in {@link dslParser#getset_body_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGetset_all(dslParser.Getset_allContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getset_array}
	 * labeled alternative in {@link dslParser#getset_body_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGetset_array(dslParser.Getset_arrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getset_array}
	 * labeled alternative in {@link dslParser#getset_body_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGetset_array(dslParser.Getset_arrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getset_none}
	 * labeled alternative in {@link dslParser#getset_body_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGetset_none(dslParser.Getset_noneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getset_none}
	 * labeled alternative in {@link dslParser#getset_body_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGetset_none(dslParser.Getset_noneContext ctx);
}