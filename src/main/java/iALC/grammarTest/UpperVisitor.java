// Generated from Upper.g4 by ANTLR 4.8

   package iALC.grammarTest;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link UpperParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface UpperVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link UpperParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(UpperParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link UpperParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(UpperParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UpperParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormula(UpperParser.FormulaContext ctx);
}