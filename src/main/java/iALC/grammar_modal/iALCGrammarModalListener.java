// Generated from iALCGrammarModal.g4 by ANTLR 4.8

   package iALC.grammar_modal;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link iALCGrammarModalParser}.
 */
public interface iALCGrammarModalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link iALCGrammarModalParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(iALCGrammarModalParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link iALCGrammarModalParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(iALCGrammarModalParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link iALCGrammarModalParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterFormula(iALCGrammarModalParser.FormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link iALCGrammarModalParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitFormula(iALCGrammarModalParser.FormulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link iALCGrammarModalParser#modal}.
	 * @param ctx the parse tree
	 */
	void enterModal(iALCGrammarModalParser.ModalContext ctx);
	/**
	 * Exit a parse tree produced by {@link iALCGrammarModalParser#modal}.
	 * @param ctx the parse tree
	 */
	void exitModal(iALCGrammarModalParser.ModalContext ctx);
	/**
	 * Enter a parse tree produced by {@link iALCGrammarModalParser#bin_connective}.
	 * @param ctx the parse tree
	 */
	void enterBin_connective(iALCGrammarModalParser.Bin_connectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link iALCGrammarModalParser#bin_connective}.
	 * @param ctx the parse tree
	 */
	void exitBin_connective(iALCGrammarModalParser.Bin_connectiveContext ctx);
}