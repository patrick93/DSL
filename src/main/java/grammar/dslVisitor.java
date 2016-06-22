// Generated from dsl.g4 by ANTLR 4.5

    package grammar;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link dslParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface dslVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code class}
	 * labeled alternative in {@link dslParser#class_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(dslParser.ClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code package}
	 * labeled alternative in {@link dslParser#package_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage(dslParser.PackageContext ctx);
	/**
	 * Visit a parse tree produced by the {@code properties}
	 * labeled alternative in {@link dslParser#properties_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperties(dslParser.PropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code property}
	 * labeled alternative in {@link dslParser#property_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(dslParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constructor_all}
	 * labeled alternative in {@link dslParser#constructor_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_all(dslParser.Constructor_allContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constructor_array}
	 * labeled alternative in {@link dslParser#constructor_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_array(dslParser.Constructor_arrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constructor_none}
	 * labeled alternative in {@link dslParser#constructor_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_none(dslParser.Constructor_noneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getset_all}
	 * labeled alternative in {@link dslParser#getset_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetset_all(dslParser.Getset_allContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getset_array}
	 * labeled alternative in {@link dslParser#getset_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetset_array(dslParser.Getset_arrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getset_none}
	 * labeled alternative in {@link dslParser#getset_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetset_none(dslParser.Getset_noneContext ctx);
}