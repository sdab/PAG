// Generated from src/main/antlr/org/terasology/grammar/PAG.g4 by ANTLR 4.0
package org.terasology.grammar.parser;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface PAGListener extends ParseTreeListener {
	void enterDivideRule(PAGParser.DivideRuleContext ctx);
	void exitDivideRule(PAGParser.DivideRuleContext ctx);

	void enterSuccessor(PAGParser.SuccessorContext ctx);
	void exitSuccessor(PAGParser.SuccessorContext ctx);

	void enterExpr(PAGParser.ExprContext ctx);
	void exitExpr(PAGParser.ExprContext ctx);

	void enterRepeatRule(PAGParser.RepeatRuleContext ctx);
	void exitRepeatRule(PAGParser.RepeatRuleContext ctx);

	void enterPredecessor(PAGParser.PredecessorContext ctx);
	void exitPredecessor(PAGParser.PredecessorContext ctx);

	void enterFunctionCall(PAGParser.FunctionCallContext ctx);
	void exitFunctionCall(PAGParser.FunctionCallContext ctx);

	void enterPrimary(PAGParser.PrimaryContext ctx);
	void exitPrimary(PAGParser.PrimaryContext ctx);

	void enterTransformationRule(PAGParser.TransformationRuleContext ctx);
	void exitTransformationRule(PAGParser.TransformationRuleContext ctx);

	void enterBaseRule(PAGParser.BaseRuleContext ctx);
	void exitBaseRule(PAGParser.BaseRuleContext ctx);

	void enterSnapRule(PAGParser.SnapRuleContext ctx);
	void exitSnapRule(PAGParser.SnapRuleContext ctx);

	void enterExprList(PAGParser.ExprListContext ctx);
	void exitExprList(PAGParser.ExprListContext ctx);

	void enterRuleStatement(PAGParser.RuleStatementContext ctx);
	void exitRuleStatement(PAGParser.RuleStatementContext ctx);

	void enterDeclaration(PAGParser.DeclarationContext ctx);
	void exitDeclaration(PAGParser.DeclarationContext ctx);

	void enterPag(PAGParser.PagContext ctx);
	void exitPag(PAGParser.PagContext ctx);

	void enterRangeExpr(PAGParser.RangeExprContext ctx);
	void exitRangeExpr(PAGParser.RangeExprContext ctx);

	void enterSplitRule(PAGParser.SplitRuleContext ctx);
	void exitSplitRule(PAGParser.SplitRuleContext ctx);

	void enterRandomSelection(PAGParser.RandomSelectionContext ctx);
	void exitRandomSelection(PAGParser.RandomSelectionContext ctx);

	void enterSection(PAGParser.SectionContext ctx);
	void exitSection(PAGParser.SectionContext ctx);

	void enterHeader(PAGParser.HeaderContext ctx);
	void exitHeader(PAGParser.HeaderContext ctx);

	void enterTranslateRule(PAGParser.TranslateRuleContext ctx);
	void exitTranslateRule(PAGParser.TranslateRuleContext ctx);

	void enterSetRule(PAGParser.SetRuleContext ctx);
	void exitSetRule(PAGParser.SetRuleContext ctx);

	void enterRotateRule(PAGParser.RotateRuleContext ctx);
	void exitRotateRule(PAGParser.RotateRuleContext ctx);

	void enterInstantiationRule(PAGParser.InstantiationRuleContext ctx);
	void exitInstantiationRule(PAGParser.InstantiationRuleContext ctx);

	void enterScaleRule(PAGParser.ScaleRuleContext ctx);
	void exitScaleRule(PAGParser.ScaleRuleContext ctx);

	void enterLiteral(PAGParser.LiteralContext ctx);
	void exitLiteral(PAGParser.LiteralContext ctx);
}