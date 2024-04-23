// Generated from Upper.g4 by ANTLR 4.8

   package iALC.grammarTest;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link UpperParser}.
 */
public interface UpperListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link UpperParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(UpperParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link UpperParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(UpperParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link UpperParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(UpperParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UpperParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(UpperParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UpperParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterFormula(UpperParser.FormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link UpperParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitFormula(UpperParser.FormulaContext ctx);
}