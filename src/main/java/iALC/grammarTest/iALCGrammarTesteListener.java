// Generated from iALCGrammarTeste.g4 by ANTLR 4.8

   package iALC.grammarTest;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link iALCGrammarTesteParser}.
 */
public interface iALCGrammarTesteListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link iALCGrammarTesteParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(iALCGrammarTesteParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link iALCGrammarTesteParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(iALCGrammarTesteParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link iALCGrammarTesteParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(iALCGrammarTesteParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link iALCGrammarTesteParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(iALCGrammarTesteParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opFormula}
	 * labeled alternative in {@link iALCGrammarTesteParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterOpFormula(iALCGrammarTesteParser.OpFormulaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opFormula}
	 * labeled alternative in {@link iALCGrammarTesteParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitOpFormula(iALCGrammarTesteParser.OpFormulaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomFormula}
	 * labeled alternative in {@link iALCGrammarTesteParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterAtomFormula(iALCGrammarTesteParser.AtomFormulaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomFormula}
	 * labeled alternative in {@link iALCGrammarTesteParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitAtomFormula(iALCGrammarTesteParser.AtomFormulaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notFormula}
	 * labeled alternative in {@link iALCGrammarTesteParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterNotFormula(iALCGrammarTesteParser.NotFormulaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notFormula}
	 * labeled alternative in {@link iALCGrammarTesteParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitNotFormula(iALCGrammarTesteParser.NotFormulaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modalFormula}
	 * labeled alternative in {@link iALCGrammarTesteParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterModalFormula(iALCGrammarTesteParser.ModalFormulaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modalFormula}
	 * labeled alternative in {@link iALCGrammarTesteParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitModalFormula(iALCGrammarTesteParser.ModalFormulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link iALCGrammarTesteParser#role}.
	 * @param ctx the parse tree
	 */
	void enterRole(iALCGrammarTesteParser.RoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link iALCGrammarTesteParser#role}.
	 * @param ctx the parse tree
	 */
	void exitRole(iALCGrammarTesteParser.RoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link iALCGrammarTesteParser#concept}.
	 * @param ctx the parse tree
	 */
	void enterConcept(iALCGrammarTesteParser.ConceptContext ctx);
	/**
	 * Exit a parse tree produced by {@link iALCGrammarTesteParser#concept}.
	 * @param ctx the parse tree
	 */
	void exitConcept(iALCGrammarTesteParser.ConceptContext ctx);
	/**
	 * Enter a parse tree produced by {@link iALCGrammarTesteParser#atomic}.
	 * @param ctx the parse tree
	 */
	void enterAtomic(iALCGrammarTesteParser.AtomicContext ctx);
	/**
	 * Exit a parse tree produced by {@link iALCGrammarTesteParser#atomic}.
	 * @param ctx the parse tree
	 */
	void exitAtomic(iALCGrammarTesteParser.AtomicContext ctx);
	/**
	 * Enter a parse tree produced by {@link iALCGrammarTesteParser#lparen}.
	 * @param ctx the parse tree
	 */
	void enterLparen(iALCGrammarTesteParser.LparenContext ctx);
	/**
	 * Exit a parse tree produced by {@link iALCGrammarTesteParser#lparen}.
	 * @param ctx the parse tree
	 */
	void exitLparen(iALCGrammarTesteParser.LparenContext ctx);
	/**
	 * Enter a parse tree produced by {@link iALCGrammarTesteParser#rparen}.
	 * @param ctx the parse tree
	 */
	void enterRparen(iALCGrammarTesteParser.RparenContext ctx);
	/**
	 * Exit a parse tree produced by {@link iALCGrammarTesteParser#rparen}.
	 * @param ctx the parse tree
	 */
	void exitRparen(iALCGrammarTesteParser.RparenContext ctx);
	/**
	 * Enter a parse tree produced by {@link iALCGrammarTesteParser#modal}.
	 * @param ctx the parse tree
	 */
	void enterModal(iALCGrammarTesteParser.ModalContext ctx);
	/**
	 * Exit a parse tree produced by {@link iALCGrammarTesteParser#modal}.
	 * @param ctx the parse tree
	 */
	void exitModal(iALCGrammarTesteParser.ModalContext ctx);
	/**
	 * Enter a parse tree produced by {@link iALCGrammarTesteParser#bin_connective}.
	 * @param ctx the parse tree
	 */
	void enterBin_connective(iALCGrammarTesteParser.Bin_connectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link iALCGrammarTesteParser#bin_connective}.
	 * @param ctx the parse tree
	 */
	void exitBin_connective(iALCGrammarTesteParser.Bin_connectiveContext ctx);
}