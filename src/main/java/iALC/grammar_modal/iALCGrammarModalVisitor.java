// Generated from iALCGrammarModal.g4 by ANTLR 4.8

   package iALC.grammar_modal;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link iALCGrammarModalParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface iALCGrammarModalVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link iALCGrammarModalParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(iALCGrammarModalParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link iALCGrammarModalParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormula(iALCGrammarModalParser.FormulaContext ctx);
	/**
	 * Visit a parse tree produced by {@link iALCGrammarModalParser#modal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModal(iALCGrammarModalParser.ModalContext ctx);
	/**
	 * Visit a parse tree produced by {@link iALCGrammarModalParser#bin_connective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_connective(iALCGrammarModalParser.Bin_connectiveContext ctx);
}