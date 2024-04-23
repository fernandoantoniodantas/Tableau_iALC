// Generated from iALCGrammar.g4 by ANTLR 4.8

   package iALC.grammar;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link iALCGrammarParser}.
 */
public interface iALCGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link iALCGrammarParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(iALCGrammarParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link iALCGrammarParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(iALCGrammarParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link iALCGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(iALCGrammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link iALCGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(iALCGrammarParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenFormula}
	 * labeled alternative in {@link iALCGrammarParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterParenFormula(iALCGrammarParser.ParenFormulaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenFormula}
	 * labeled alternative in {@link iALCGrammarParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitParenFormula(iALCGrammarParser.ParenFormulaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forallFormula}
	 * labeled alternative in {@link iALCGrammarParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterForallFormula(iALCGrammarParser.ForallFormulaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forallFormula}
	 * labeled alternative in {@link iALCGrammarParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitForallFormula(iALCGrammarParser.ForallFormulaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opFormula}
	 * labeled alternative in {@link iALCGrammarParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterOpFormula(iALCGrammarParser.OpFormulaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opFormula}
	 * labeled alternative in {@link iALCGrammarParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitOpFormula(iALCGrammarParser.OpFormulaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomFormula}
	 * labeled alternative in {@link iALCGrammarParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterAtomFormula(iALCGrammarParser.AtomFormulaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomFormula}
	 * labeled alternative in {@link iALCGrammarParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitAtomFormula(iALCGrammarParser.AtomFormulaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConceptAtomico}
	 * labeled alternative in {@link iALCGrammarParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterConceptAtomico(iALCGrammarParser.ConceptAtomicoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConceptAtomico}
	 * labeled alternative in {@link iALCGrammarParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitConceptAtomico(iALCGrammarParser.ConceptAtomicoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forallAtomico}
	 * labeled alternative in {@link iALCGrammarParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterForallAtomico(iALCGrammarParser.ForallAtomicoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forallAtomico}
	 * labeled alternative in {@link iALCGrammarParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitForallAtomico(iALCGrammarParser.ForallAtomicoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code existFormula}
	 * labeled alternative in {@link iALCGrammarParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterExistFormula(iALCGrammarParser.ExistFormulaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code existFormula}
	 * labeled alternative in {@link iALCGrammarParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitExistFormula(iALCGrammarParser.ExistFormulaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notFormula}
	 * labeled alternative in {@link iALCGrammarParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterNotFormula(iALCGrammarParser.NotFormulaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notFormula}
	 * labeled alternative in {@link iALCGrammarParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitNotFormula(iALCGrammarParser.NotFormulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link iALCGrammarParser#asser}.
	 * @param ctx the parse tree
	 */
	void enterAsser(iALCGrammarParser.AsserContext ctx);
	/**
	 * Exit a parse tree produced by {@link iALCGrammarParser#asser}.
	 * @param ctx the parse tree
	 */
	void exitAsser(iALCGrammarParser.AsserContext ctx);
	/**
	 * Enter a parse tree produced by {@link iALCGrammarParser#modal}.
	 * @param ctx the parse tree
	 */
	void enterModal(iALCGrammarParser.ModalContext ctx);
	/**
	 * Exit a parse tree produced by {@link iALCGrammarParser#modal}.
	 * @param ctx the parse tree
	 */
	void exitModal(iALCGrammarParser.ModalContext ctx);
	/**
	 * Enter a parse tree produced by {@link iALCGrammarParser#bin_connective}.
	 * @param ctx the parse tree
	 */
	void enterBin_connective(iALCGrammarParser.Bin_connectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link iALCGrammarParser#bin_connective}.
	 * @param ctx the parse tree
	 */
	void exitBin_connective(iALCGrammarParser.Bin_connectiveContext ctx);
}