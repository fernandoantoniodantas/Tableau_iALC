// Generated from iALCGrammarTeste.g4 by ANTLR 4.8

   package iALC.grammarTest;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link iALCGrammarTesteParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface iALCGrammarTesteVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link iALCGrammarTesteParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(iALCGrammarTesteParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link iALCGrammarTesteParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(iALCGrammarTesteParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opFormula}
	 * labeled alternative in {@link iALCGrammarTesteParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpFormula(iALCGrammarTesteParser.OpFormulaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomFormula}
	 * labeled alternative in {@link iALCGrammarTesteParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomFormula(iALCGrammarTesteParser.AtomFormulaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notFormula}
	 * labeled alternative in {@link iALCGrammarTesteParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotFormula(iALCGrammarTesteParser.NotFormulaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code modalFormula}
	 * labeled alternative in {@link iALCGrammarTesteParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModalFormula(iALCGrammarTesteParser.ModalFormulaContext ctx);
	/**
	 * Visit a parse tree produced by {@link iALCGrammarTesteParser#role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRole(iALCGrammarTesteParser.RoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link iALCGrammarTesteParser#concept}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcept(iALCGrammarTesteParser.ConceptContext ctx);
	/**
	 * Visit a parse tree produced by {@link iALCGrammarTesteParser#atomic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomic(iALCGrammarTesteParser.AtomicContext ctx);
	/**
	 * Visit a parse tree produced by {@link iALCGrammarTesteParser#lparen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLparen(iALCGrammarTesteParser.LparenContext ctx);
	/**
	 * Visit a parse tree produced by {@link iALCGrammarTesteParser#rparen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRparen(iALCGrammarTesteParser.RparenContext ctx);
	/**
	 * Visit a parse tree produced by {@link iALCGrammarTesteParser#modal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModal(iALCGrammarTesteParser.ModalContext ctx);
	/**
	 * Visit a parse tree produced by {@link iALCGrammarTesteParser#bin_connective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_connective(iALCGrammarTesteParser.Bin_connectiveContext ctx);
}