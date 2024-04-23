// Generated from iALCGrammar.g4 by ANTLR 4.8

   package iALC.grammar;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link iALCGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface iALCGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link iALCGrammarParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(iALCGrammarParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link iALCGrammarParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(iALCGrammarParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenFormula}
	 * labeled alternative in {@link iALCGrammarParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenFormula(iALCGrammarParser.ParenFormulaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forallFormula}
	 * labeled alternative in {@link iALCGrammarParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForallFormula(iALCGrammarParser.ForallFormulaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opFormula}
	 * labeled alternative in {@link iALCGrammarParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpFormula(iALCGrammarParser.OpFormulaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomFormula}
	 * labeled alternative in {@link iALCGrammarParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomFormula(iALCGrammarParser.AtomFormulaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConceptAtomico}
	 * labeled alternative in {@link iALCGrammarParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConceptAtomico(iALCGrammarParser.ConceptAtomicoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forallAtomico}
	 * labeled alternative in {@link iALCGrammarParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForallAtomico(iALCGrammarParser.ForallAtomicoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code existFormula}
	 * labeled alternative in {@link iALCGrammarParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistFormula(iALCGrammarParser.ExistFormulaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notFormula}
	 * labeled alternative in {@link iALCGrammarParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotFormula(iALCGrammarParser.NotFormulaContext ctx);
	/**
	 * Visit a parse tree produced by {@link iALCGrammarParser#asser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsser(iALCGrammarParser.AsserContext ctx);
	/**
	 * Visit a parse tree produced by {@link iALCGrammarParser#modal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModal(iALCGrammarParser.ModalContext ctx);
	/**
	 * Visit a parse tree produced by {@link iALCGrammarParser#bin_connective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_connective(iALCGrammarParser.Bin_connectiveContext ctx);
}