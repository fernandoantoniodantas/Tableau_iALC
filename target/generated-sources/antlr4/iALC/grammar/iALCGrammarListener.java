// Generated from iALCGrammar.g4 by ANTLR 4.4

   package iALC.grammar;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link iALCGrammarParser}.
 */
public interface iALCGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code parenFormula}
	 * labeled alternative in {@link iALCGrammarParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterParenFormula(@NotNull iALCGrammarParser.ParenFormulaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenFormula}
	 * labeled alternative in {@link iALCGrammarParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitParenFormula(@NotNull iALCGrammarParser.ParenFormulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link iALCGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull iALCGrammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link iALCGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull iALCGrammarParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forallFormula}
	 * labeled alternative in {@link iALCGrammarParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterForallFormula(@NotNull iALCGrammarParser.ForallFormulaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forallFormula}
	 * labeled alternative in {@link iALCGrammarParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitForallFormula(@NotNull iALCGrammarParser.ForallFormulaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opFormula}
	 * labeled alternative in {@link iALCGrammarParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterOpFormula(@NotNull iALCGrammarParser.OpFormulaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opFormula}
	 * labeled alternative in {@link iALCGrammarParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitOpFormula(@NotNull iALCGrammarParser.OpFormulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link iALCGrammarParser#asser}.
	 * @param ctx the parse tree
	 */
	void enterAsser(@NotNull iALCGrammarParser.AsserContext ctx);
	/**
	 * Exit a parse tree produced by {@link iALCGrammarParser#asser}.
	 * @param ctx the parse tree
	 */
	void exitAsser(@NotNull iALCGrammarParser.AsserContext ctx);
	/**
	 * Enter a parse tree produced by {@link iALCGrammarParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(@NotNull iALCGrammarParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link iALCGrammarParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(@NotNull iALCGrammarParser.SContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomFormula}
	 * labeled alternative in {@link iALCGrammarParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterAtomFormula(@NotNull iALCGrammarParser.AtomFormulaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomFormula}
	 * labeled alternative in {@link iALCGrammarParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitAtomFormula(@NotNull iALCGrammarParser.AtomFormulaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code existFormula}
	 * labeled alternative in {@link iALCGrammarParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterExistFormula(@NotNull iALCGrammarParser.ExistFormulaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code existFormula}
	 * labeled alternative in {@link iALCGrammarParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitExistFormula(@NotNull iALCGrammarParser.ExistFormulaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notFormula}
	 * labeled alternative in {@link iALCGrammarParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterNotFormula(@NotNull iALCGrammarParser.NotFormulaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notFormula}
	 * labeled alternative in {@link iALCGrammarParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitNotFormula(@NotNull iALCGrammarParser.NotFormulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link iALCGrammarParser#bin_connective}.
	 * @param ctx the parse tree
	 */
	void enterBin_connective(@NotNull iALCGrammarParser.Bin_connectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link iALCGrammarParser#bin_connective}.
	 * @param ctx the parse tree
	 */
	void exitBin_connective(@NotNull iALCGrammarParser.Bin_connectiveContext ctx);
}