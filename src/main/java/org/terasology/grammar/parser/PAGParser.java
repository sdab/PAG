// Generated from src/main/antlr/org/terasology/grammar/PAG.g4 by ANTLR 4.0
package org.terasology.grammar.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PAGParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__46=1, T__45=2, T__44=3, T__43=4, T__42=5, T__41=6, T__40=7, T__39=8, 
		T__38=9, T__37=10, T__36=11, T__35=12, T__34=13, T__33=14, T__32=15, T__31=16, 
		T__30=17, T__29=18, T__28=19, T__27=20, T__26=21, T__25=22, T__24=23, 
		T__23=24, T__22=25, T__21=26, T__20=27, T__19=28, T__18=29, T__17=30, 
		T__16=31, T__15=32, T__14=33, T__13=34, T__12=35, T__11=36, T__10=37, 
		T__9=38, T__8=39, T__7=40, T__6=41, T__5=42, T__4=43, T__3=44, T__2=45, 
		T__1=46, T__0=47, BOOLEAN_LITERAL=48, NUMBER=49, STRING=50, ID=51, LINE_COMMENT=52, 
		COMMENT=53, WS=54;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "'Snap'", "'Random'", "','", "'['", "'occ'", "'-'", 
		"'*'", "':'", "'('", "'<'", "'!='", "'Rx'", "'<='", "'Divide'", "'Rz'", 
		"'I'", "'{'", "'Repeat'", "'}'", "'S'", "'Shape'", "'Set'", "'->'", "'%'", 
		"')'", "'.'", "'Priority'", "'+'", "'visible'", "'r'", "'grammar'", "';'", 
		"'Scope'", "'&&'", "'||'", "'Ry'", "'>'", "':='", "'/'", "'=='", "'#'", 
		"'>='", "'Split'", "'T'", "'!'", "'..'", "BOOLEAN_LITERAL", "NUMBER", 
		"STRING", "ID", "LINE_COMMENT", "COMMENT", "WS"
	};
	public static final int
		RULE_pag = 0, RULE_header = 1, RULE_declaration = 2, RULE_section = 3, 
		RULE_ruleStatement = 4, RULE_predecessor = 5, RULE_successor = 6, RULE_baseRule = 7, 
		RULE_setRule = 8, RULE_divideRule = 9, RULE_splitRule = 10, RULE_repeatRule = 11, 
		RULE_snapRule = 12, RULE_instantiationRule = 13, RULE_transformationRule = 14, 
		RULE_scaleRule = 15, RULE_translateRule = 16, RULE_rotateRule = 17, RULE_exprList = 18, 
		RULE_rangeExpr = 19, RULE_expr = 20, RULE_functionCall = 21, RULE_randomSelection = 22, 
		RULE_primary = 23, RULE_literal = 24;
	public static final String[] ruleNames = {
		"pag", "header", "declaration", "section", "ruleStatement", "predecessor", 
		"successor", "baseRule", "setRule", "divideRule", "splitRule", "repeatRule", 
		"snapRule", "instantiationRule", "transformationRule", "scaleRule", "translateRule", 
		"rotateRule", "exprList", "rangeExpr", "expr", "functionCall", "randomSelection", 
		"primary", "literal"
	};

	@Override
	public String getGrammarFileName() { return "PAG.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public PAGParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PagContext extends ParserRuleContext {
		public SectionContext section(int i) {
			return getRuleContext(SectionContext.class,i);
		}
		public TerminalNode ID() { return getToken(PAGParser.ID, 0); }
		public List<SectionContext> section() {
			return getRuleContexts(SectionContext.class);
		}
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public PagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).enterPag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).exitPag(this);
		}
	}

	public final PagContext pag() throws RecognitionException {
		PagContext _localctx = new PagContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_pag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); header();
			setState(51); match(32);
			setState(52); match(ID);
			setState(53); match(9);
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54); section();
				}
				}
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==28 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeaderContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).exitHeader(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==42 || _la==ID) {
				{
				{
				setState(59); declaration();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PAGParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_la = _input.LA(1);
			if (_la==42) {
				{
				setState(65); match(42);
				}
			}

			setState(68); match(ID);
			setState(69); match(39);
			setState(70); expr(0);
			setState(71); match(33);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SectionContext extends ParserRuleContext {
		public List<RuleStatementContext> ruleStatement() {
			return getRuleContexts(RuleStatementContext.class);
		}
		public RuleStatementContext ruleStatement(int i) {
			return getRuleContext(RuleStatementContext.class,i);
		}
		public TerminalNode NUMBER() { return getToken(PAGParser.NUMBER, 0); }
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).enterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).exitSection(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); match(28);
			setState(74); match(NUMBER);
			setState(75); match(9);
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76); ruleStatement();
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleStatementContext extends ParserRuleContext {
		public PredecessorContext predecessor() {
			return getRuleContext(PredecessorContext.class,0);
		}
		public List<SuccessorContext> successor() {
			return getRuleContexts(SuccessorContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public SuccessorContext successor(int i) {
			return getRuleContext(SuccessorContext.class,i);
		}
		public RuleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).enterRuleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).exitRuleStatement(this);
		}
	}

	public final RuleStatementContext ruleStatement() throws RecognitionException {
		RuleStatementContext _localctx = new RuleStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ruleStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); predecessor();
			setState(84);
			_la = _input.LA(1);
			if (_la==9) {
				{
				setState(82); match(9);
				setState(83); expr(0);
				}
			}

			setState(86); match(24);
			setState(87); successor();
			setState(90);
			_la = _input.LA(1);
			if (_la==9) {
				{
				setState(88); match(9);
				setState(89); expr(0);
				}
			}

			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==24) {
				{
				{
				setState(92); match(24);
				setState(93); successor();
				setState(96);
				_la = _input.LA(1);
				if (_la==9) {
					{
					setState(94); match(9);
					setState(95); expr(0);
					}
				}

				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103); match(33);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredecessorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PAGParser.ID, 0); }
		public PredecessorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predecessor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).enterPredecessor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).exitPredecessor(this);
		}
	}

	public final PredecessorContext predecessor() throws RecognitionException {
		PredecessorContext _localctx = new PredecessorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_predecessor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuccessorContext extends ParserRuleContext {
		public BaseRuleContext baseRule(int i) {
			return getRuleContext(BaseRuleContext.class,i);
		}
		public TerminalNode ID(int i) {
			return getToken(PAGParser.ID, i);
		}
		public List<TerminalNode> ID() { return getTokens(PAGParser.ID); }
		public List<BaseRuleContext> baseRule() {
			return getRuleContexts(BaseRuleContext.class);
		}
		public SuccessorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_successor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).enterSuccessor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).exitSuccessor(this);
		}
	}

	public final SuccessorContext successor() throws RecognitionException {
		SuccessorContext _localctx = new SuccessorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_successor);
		int _la;
		try {
			setState(118);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(107); match(ID);
				}
				break;
			case 2:
			case 13:
			case 15:
			case 16:
			case 17:
			case 19:
			case 21:
			case 23:
			case 37:
			case 44:
			case 45:
				enterOuterAlt(_localctx, 2);
				{
				setState(108); baseRule();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 3);
				{
				setState(109); match(18);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 13) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 19) | (1L << 21) | (1L << 23) | (1L << 37) | (1L << 44) | (1L << 45) | (1L << ID))) != 0)) {
					{
					setState(112);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(110); match(ID);
						}
						break;
					case 2:
					case 13:
					case 15:
					case 16:
					case 17:
					case 19:
					case 21:
					case 23:
					case 37:
					case 44:
					case 45:
						{
						setState(111); baseRule();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(117); match(20);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BaseRuleContext extends ParserRuleContext {
		public DivideRuleContext divideRule() {
			return getRuleContext(DivideRuleContext.class,0);
		}
		public SetRuleContext setRule() {
			return getRuleContext(SetRuleContext.class,0);
		}
		public InstantiationRuleContext instantiationRule() {
			return getRuleContext(InstantiationRuleContext.class,0);
		}
		public SplitRuleContext splitRule() {
			return getRuleContext(SplitRuleContext.class,0);
		}
		public TransformationRuleContext transformationRule() {
			return getRuleContext(TransformationRuleContext.class,0);
		}
		public SnapRuleContext snapRule() {
			return getRuleContext(SnapRuleContext.class,0);
		}
		public RepeatRuleContext repeatRule() {
			return getRuleContext(RepeatRuleContext.class,0);
		}
		public BaseRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).enterBaseRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).exitBaseRule(this);
		}
	}

	public final BaseRuleContext baseRule() throws RecognitionException {
		BaseRuleContext _localctx = new BaseRuleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_baseRule);
		try {
			setState(127);
			switch (_input.LA(1)) {
			case 23:
				enterOuterAlt(_localctx, 1);
				{
				setState(120); setRule();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 2);
				{
				setState(121); divideRule();
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 3);
				{
				setState(122); splitRule();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 4);
				{
				setState(123); repeatRule();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 5);
				{
				setState(124); snapRule();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 6);
				{
				setState(125); instantiationRule();
				}
				break;
			case 13:
			case 16:
			case 21:
			case 37:
			case 45:
				enterOuterAlt(_localctx, 7);
				{
				setState(126); transformationRule();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetRuleContext extends ParserRuleContext {
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public SetRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).enterSetRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).exitSetRule(this);
		}
	}

	public final SetRuleContext setRule() throws RecognitionException {
		SetRuleContext _localctx = new SetRuleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_setRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); match(23);
			setState(130); match(10);
			setState(131); expr(0);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==9) {
				{
				{
				setState(132); match(9);
				setState(133); expr(0);
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139); match(26);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DivideRuleContext extends ParserRuleContext {
		public List<SuccessorContext> successor() {
			return getRuleContexts(SuccessorContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SuccessorContext successor(int i) {
			return getRuleContext(SuccessorContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public DivideRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divideRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).enterDivideRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).exitDivideRule(this);
		}
	}

	public final DivideRuleContext divideRule() throws RecognitionException {
		DivideRuleContext _localctx = new DivideRuleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_divideRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); match(15);
			setState(142); expr(0);
			setState(143); match(18);
			setState(152); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(144); match(5);
				setState(145); expr(0);
				setState(147);
				_la = _input.LA(1);
				if (_la==31) {
					{
					setState(146); match(31);
					}
				}

				setState(149); match(1);
				setState(150); successor();
				}
				}
				setState(154); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==5 );
			setState(156); match(20);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SplitRuleContext extends ParserRuleContext {
		public List<SuccessorContext> successor() {
			return getRuleContexts(SuccessorContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SuccessorContext successor(int i) {
			return getRuleContext(SuccessorContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public SplitRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_splitRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).enterSplitRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).exitSplitRule(this);
		}
	}

	public final SplitRuleContext splitRule() throws RecognitionException {
		SplitRuleContext _localctx = new SplitRuleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_splitRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158); match(44);
			setState(159); match(18);
			setState(165); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(160); match(5);
				setState(161); expr(0);
				setState(162); match(1);
				setState(163); successor();
				}
				}
				setState(167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==5 );
			setState(169); match(20);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepeatRuleContext extends ParserRuleContext {
		public SuccessorContext successor() {
			return getRuleContext(SuccessorContext.class,0);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public RepeatRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).enterRepeatRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).exitRepeatRule(this);
		}
	}

	public final RepeatRuleContext repeatRule() throws RecognitionException {
		RepeatRuleContext _localctx = new RepeatRuleContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_repeatRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171); match(19);
			setState(172); expr(0);
			setState(173); match(5);
			setState(174); expr(0);
			setState(175); match(1);
			setState(176); successor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SnapRuleContext extends ParserRuleContext {
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public SnapRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_snapRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).enterSnapRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).exitSnapRule(this);
		}
	}

	public final SnapRuleContext snapRule() throws RecognitionException {
		SnapRuleContext _localctx = new SnapRuleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_snapRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178); match(2);
			setState(179); match(10);
			setState(180); expr(0);
			setState(183);
			_la = _input.LA(1);
			if (_la==4) {
				{
				setState(181); match(4);
				setState(182); expr(0);
				}
			}

			setState(185); match(26);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstantiationRuleContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InstantiationRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instantiationRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).enterInstantiationRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).exitInstantiationRule(this);
		}
	}

	public final InstantiationRuleContext instantiationRule() throws RecognitionException {
		InstantiationRuleContext _localctx = new InstantiationRuleContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_instantiationRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187); match(17);
			setState(188); match(10);
			setState(189); expr(0);
			setState(190); match(26);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransformationRuleContext extends ParserRuleContext {
		public TranslateRuleContext translateRule() {
			return getRuleContext(TranslateRuleContext.class,0);
		}
		public RotateRuleContext rotateRule() {
			return getRuleContext(RotateRuleContext.class,0);
		}
		public ScaleRuleContext scaleRule() {
			return getRuleContext(ScaleRuleContext.class,0);
		}
		public TransformationRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformationRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).enterTransformationRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).exitTransformationRule(this);
		}
	}

	public final TransformationRuleContext transformationRule() throws RecognitionException {
		TransformationRuleContext _localctx = new TransformationRuleContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_transformationRule);
		try {
			setState(195);
			switch (_input.LA(1)) {
			case 21:
				enterOuterAlt(_localctx, 1);
				{
				setState(192); scaleRule();
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 2);
				{
				setState(193); translateRule();
				}
				break;
			case 13:
			case 16:
			case 37:
				enterOuterAlt(_localctx, 3);
				{
				setState(194); rotateRule();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScaleRuleContext extends ParserRuleContext {
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ScaleRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scaleRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).enterScaleRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).exitScaleRule(this);
		}
	}

	public final ScaleRuleContext scaleRule() throws RecognitionException {
		ScaleRuleContext _localctx = new ScaleRuleContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_scaleRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197); match(21);
			setState(198); match(10);
			setState(199); expr(0);
			setState(205);
			_la = _input.LA(1);
			if (_la==4) {
				{
				setState(200); match(4);
				setState(201); expr(0);
				setState(202); match(4);
				setState(203); expr(0);
				}
			}

			setState(207); match(26);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TranslateRuleContext extends ParserRuleContext {
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TranslateRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translateRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).enterTranslateRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).exitTranslateRule(this);
		}
	}

	public final TranslateRuleContext translateRule() throws RecognitionException {
		TranslateRuleContext _localctx = new TranslateRuleContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_translateRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209); match(45);
			setState(210); match(10);
			setState(211); expr(0);
			setState(212); match(4);
			setState(213); expr(0);
			setState(214); match(4);
			setState(215); expr(0);
			setState(216); match(26);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RotateRuleContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RotateRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rotateRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).enterRotateRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).exitRotateRule(this);
		}
	}

	public final RotateRuleContext rotateRule() throws RecognitionException {
		RotateRuleContext _localctx = new RotateRuleContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_rotateRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 13) | (1L << 16) | (1L << 37))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(219); match(10);
			setState(220); expr(0);
			setState(221); match(26);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprListContext extends ParserRuleContext {
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).exitExprList(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223); expr(0);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(224); match(4);
				setState(225); expr(0);
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeExprContext extends ParserRuleContext {
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public RangeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).enterRangeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).exitRangeExpr(this);
		}
	}

	public final RangeExprContext rangeExpr() throws RecognitionException {
		RangeExprContext _localctx = new RangeExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_rangeExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231); expr(0);
			setState(232); match(47);
			setState(233); expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public int _p;
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState, _p);
		ExprContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, RULE_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			switch (_input.LA(1)) {
			case 7:
			case 29:
				{
				setState(236);
				_la = _input.LA(1);
				if ( !(_la==7 || _la==29) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(237); expr(8);
				}
				break;
			case 46:
				{
				setState(238); match(46);
				setState(239); expr(7);
				}
				break;
			case 10:
			case BOOLEAN_LITERAL:
			case NUMBER:
			case STRING:
			case ID:
				{
				setState(240); primary();
				}
				break;
			case 3:
				{
				setState(241); functionCall();
				}
				break;
			case 22:
			case 34:
				{
				setState(242);
				_la = _input.LA(1);
				if ( !(_la==22 || _la==34) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(243); match(27);
				setState(244);
				_la = _input.LA(1);
				if ( !(_la==6 || _la==30) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(245); match(10);
				setState(246); expr(0);
				setState(247); match(26);
				}
				break;
			case 5:
				{
				setState(249); match(5);
				setState(251);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 5) | (1L << 7) | (1L << 10) | (1L << 22) | (1L << 29) | (1L << 34) | (1L << 46) | (1L << BOOLEAN_LITERAL) | (1L << NUMBER) | (1L << STRING) | (1L << ID))) != 0)) {
					{
					setState(250); exprList();
					}
				}

				setState(253); match(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(276);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(274);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(256);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(257);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 25) | (1L << 40))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(258); expr(7);
						}
						break;

					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(259);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(260);
						_la = _input.LA(1);
						if ( !(_la==7 || _la==29) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(261); expr(6);
						}
						break;

					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(262);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(263);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 11) | (1L << 14) | (1L << 38) | (1L << 43))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(264); expr(5);
						}
						break;

					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(265);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(266);
						_la = _input.LA(1);
						if ( !(_la==12 || _la==41) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(267); expr(4);
						}
						break;

					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(268);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(269); match(35);
						setState(270); expr(3);
						}
						break;

					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(271);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(272); match(36);
						setState(273); expr(2);
						}
						break;
					}
					} 
				}
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public RandomSelectionContext randomSelection() {
			return getRuleContext(RandomSelectionContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279); randomSelection();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RandomSelectionContext extends ParserRuleContext {
		public RangeExprContext rangeExpr() {
			return getRuleContext(RangeExprContext.class,0);
		}
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public RandomSelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_randomSelection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).enterRandomSelection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).exitRandomSelection(this);
		}
	}

	public final RandomSelectionContext randomSelection() throws RecognitionException {
		RandomSelectionContext _localctx = new RandomSelectionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_randomSelection);
		try {
			setState(291);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281); match(3);
				setState(282); match(10);
				setState(283); exprList();
				setState(284); match(26);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286); match(3);
				setState(287); match(10);
				setState(288); rangeExpr();
				setState(289); match(26);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PAGParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_primary);
		try {
			setState(302);
			switch (_input.LA(1)) {
			case 10:
				enterOuterAlt(_localctx, 1);
				{
				setState(293); match(10);
				setState(294); expr(0);
				setState(295); match(26);
				}
				break;
			case BOOLEAN_LITERAL:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(297); literal();
				setState(299);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(298); match(31);
					}
					break;
				}
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(301); match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode BOOLEAN_LITERAL() { return getToken(PAGParser.BOOLEAN_LITERAL, 0); }
		public TerminalNode STRING() { return getToken(PAGParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(PAGParser.NUMBER, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAGListener ) ((PAGListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN_LITERAL) | (1L << NUMBER) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 6 >= _localctx._p;

		case 1: return 5 >= _localctx._p;

		case 2: return 4 >= _localctx._p;

		case 3: return 3 >= _localctx._p;

		case 4: return 2 >= _localctx._p;

		case 5: return 1 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\38\u0135\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\2\6\2:\n\2\r\2\16\2;"+
		"\3\3\7\3?\n\3\f\3\16\3B\13\3\3\4\5\4E\n\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\6\5P\n\5\r\5\16\5Q\3\6\3\6\3\6\5\6W\n\6\3\6\3\6\3\6\3\6\5\6]"+
		"\n\6\3\6\3\6\3\6\3\6\5\6c\n\6\7\6e\n\6\f\6\16\6h\13\6\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\7\bs\n\b\f\b\16\bv\13\b\3\b\5\by\n\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\t\u0082\n\t\3\n\3\n\3\n\3\n\3\n\7\n\u0089\n\n\f\n\16"+
		"\n\u008c\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0096\n\13\3"+
		"\13\3\13\3\13\6\13\u009b\n\13\r\13\16\13\u009c\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\6\f\u00a8\n\f\r\f\16\f\u00a9\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16\u00ba\n\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\5\20\u00c6\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u00d0\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\7\24\u00e5\n\24"+
		"\f\24\16\24\u00e8\13\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00fe\n\26"+
		"\3\26\5\26\u0101\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0115\n\26\f\26\16\26\u0118"+
		"\13\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u0126\n\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u012e\n\31\3\31\5\31\u0131"+
		"\n\31\3\32\3\32\3\32\2\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,.\60\62\2\13\5\17\17\22\22\'\'\4\t\t\37\37\4\30\30$$\4\b\b  \5\n\n"+
		"\33\33**\4\t\t\37\37\6\r\r\20\20((--\4\16\16++\3\62\64\u0146\2\64\3\2"+
		"\2\2\4@\3\2\2\2\6D\3\2\2\2\bK\3\2\2\2\nS\3\2\2\2\fk\3\2\2\2\16x\3\2\2"+
		"\2\20\u0081\3\2\2\2\22\u0083\3\2\2\2\24\u008f\3\2\2\2\26\u00a0\3\2\2\2"+
		"\30\u00ad\3\2\2\2\32\u00b4\3\2\2\2\34\u00bd\3\2\2\2\36\u00c5\3\2\2\2 "+
		"\u00c7\3\2\2\2\"\u00d3\3\2\2\2$\u00dc\3\2\2\2&\u00e1\3\2\2\2(\u00e9\3"+
		"\2\2\2*\u0100\3\2\2\2,\u0119\3\2\2\2.\u0125\3\2\2\2\60\u0130\3\2\2\2\62"+
		"\u0132\3\2\2\2\64\65\5\4\3\2\65\66\7\"\2\2\66\67\7\65\2\2\679\7\13\2\2"+
		"8:\5\b\5\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\3\3\2\2\2=?\5\6\4"+
		"\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\5\3\2\2\2B@\3\2\2\2CE\7,\2"+
		"\2DC\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\7\65\2\2GH\7)\2\2HI\5*\26\2IJ\7#\2"+
		"\2J\7\3\2\2\2KL\7\36\2\2LM\7\63\2\2MO\7\13\2\2NP\5\n\6\2ON\3\2\2\2PQ\3"+
		"\2\2\2QO\3\2\2\2QR\3\2\2\2R\t\3\2\2\2SV\5\f\7\2TU\7\13\2\2UW\5*\26\2V"+
		"T\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY\7\32\2\2Y\\\5\16\b\2Z[\7\13\2\2[]\5*\26"+
		"\2\\Z\3\2\2\2\\]\3\2\2\2]f\3\2\2\2^_\7\32\2\2_b\5\16\b\2`a\7\13\2\2ac"+
		"\5*\26\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2d^\3\2\2\2eh\3\2\2\2fd\3\2\2\2f"+
		"g\3\2\2\2gi\3\2\2\2hf\3\2\2\2ij\7#\2\2j\13\3\2\2\2kl\7\65\2\2l\r\3\2\2"+
		"\2my\7\65\2\2ny\5\20\t\2ot\7\24\2\2ps\7\65\2\2qs\5\20\t\2rp\3\2\2\2rq"+
		"\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2wy\7\26\2\2"+
		"xm\3\2\2\2xn\3\2\2\2xo\3\2\2\2y\17\3\2\2\2z\u0082\5\22\n\2{\u0082\5\24"+
		"\13\2|\u0082\5\26\f\2}\u0082\5\30\r\2~\u0082\5\32\16\2\177\u0082\5\34"+
		"\17\2\u0080\u0082\5\36\20\2\u0081z\3\2\2\2\u0081{\3\2\2\2\u0081|\3\2\2"+
		"\2\u0081}\3\2\2\2\u0081~\3\2\2\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2"+
		"\u0082\21\3\2\2\2\u0083\u0084\7\31\2\2\u0084\u0085\7\f\2\2\u0085\u008a"+
		"\5*\26\2\u0086\u0087\7\13\2\2\u0087\u0089\5*\26\2\u0088\u0086\3\2\2\2"+
		"\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d"+
		"\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7\34\2\2\u008e\23\3\2\2\2\u008f"+
		"\u0090\7\21\2\2\u0090\u0091\5*\26\2\u0091\u009a\7\24\2\2\u0092\u0093\7"+
		"\7\2\2\u0093\u0095\5*\26\2\u0094\u0096\7!\2\2\u0095\u0094\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\7\3\2\2\u0098\u0099\5\16"+
		"\b\2\u0099\u009b\3\2\2\2\u009a\u0092\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\7\26"+
		"\2\2\u009f\25\3\2\2\2\u00a0\u00a1\7.\2\2\u00a1\u00a7\7\24\2\2\u00a2\u00a3"+
		"\7\7\2\2\u00a3\u00a4\5*\26\2\u00a4\u00a5\7\3\2\2\u00a5\u00a6\5\16\b\2"+
		"\u00a6\u00a8\3\2\2\2\u00a7\u00a2\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\7\26\2\2"+
		"\u00ac\27\3\2\2\2\u00ad\u00ae\7\25\2\2\u00ae\u00af\5*\26\2\u00af\u00b0"+
		"\7\7\2\2\u00b0\u00b1\5*\26\2\u00b1\u00b2\7\3\2\2\u00b2\u00b3\5\16\b\2"+
		"\u00b3\31\3\2\2\2\u00b4\u00b5\7\4\2\2\u00b5\u00b6\7\f\2\2\u00b6\u00b9"+
		"\5*\26\2\u00b7\u00b8\7\6\2\2\u00b8\u00ba\5*\26\2\u00b9\u00b7\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\7\34\2\2\u00bc\33\3\2\2"+
		"\2\u00bd\u00be\7\23\2\2\u00be\u00bf\7\f\2\2\u00bf\u00c0\5*\26\2\u00c0"+
		"\u00c1\7\34\2\2\u00c1\35\3\2\2\2\u00c2\u00c6\5 \21\2\u00c3\u00c6\5\"\22"+
		"\2\u00c4\u00c6\5$\23\2\u00c5\u00c2\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c4"+
		"\3\2\2\2\u00c6\37\3\2\2\2\u00c7\u00c8\7\27\2\2\u00c8\u00c9\7\f\2\2\u00c9"+
		"\u00cf\5*\26\2\u00ca\u00cb\7\6\2\2\u00cb\u00cc\5*\26\2\u00cc\u00cd\7\6"+
		"\2\2\u00cd\u00ce\5*\26\2\u00ce\u00d0\3\2\2\2\u00cf\u00ca\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\7\34\2\2\u00d2!\3\2\2\2"+
		"\u00d3\u00d4\7/\2\2\u00d4\u00d5\7\f\2\2\u00d5\u00d6\5*\26\2\u00d6\u00d7"+
		"\7\6\2\2\u00d7\u00d8\5*\26\2\u00d8\u00d9\7\6\2\2\u00d9\u00da\5*\26\2\u00da"+
		"\u00db\7\34\2\2\u00db#\3\2\2\2\u00dc\u00dd\t\2\2\2\u00dd\u00de\7\f\2\2"+
		"\u00de\u00df\5*\26\2\u00df\u00e0\7\34\2\2\u00e0%\3\2\2\2\u00e1\u00e6\5"+
		"*\26\2\u00e2\u00e3\7\6\2\2\u00e3\u00e5\5*\26\2\u00e4\u00e2\3\2\2\2\u00e5"+
		"\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\'\3\2\2\2"+
		"\u00e8\u00e6\3\2\2\2\u00e9\u00ea\5*\26\2\u00ea\u00eb\7\61\2\2\u00eb\u00ec"+
		"\5*\26\2\u00ec)\3\2\2\2\u00ed\u00ee\b\26\1\2\u00ee\u00ef\t\3\2\2\u00ef"+
		"\u0101\5*\26\2\u00f0\u00f1\7\60\2\2\u00f1\u0101\5*\26\2\u00f2\u0101\5"+
		"\60\31\2\u00f3\u0101\5,\27\2\u00f4\u00f5\t\4\2\2\u00f5\u00f6\7\35\2\2"+
		"\u00f6\u00f7\t\5\2\2\u00f7\u00f8\7\f\2\2\u00f8\u00f9\5*\26\2\u00f9\u00fa"+
		"\7\34\2\2\u00fa\u0101\3\2\2\2\u00fb\u00fd\7\7\2\2\u00fc\u00fe\5&\24\2"+
		"\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101"+
		"\7\3\2\2\u0100\u00ed\3\2\2\2\u0100\u00f0\3\2\2\2\u0100\u00f2\3\2\2\2\u0100"+
		"\u00f3\3\2\2\2\u0100\u00f4\3\2\2\2\u0100\u00fb\3\2\2\2\u0101\u0116\3\2"+
		"\2\2\u0102\u0103\6\26\2\3\u0103\u0104\t\6\2\2\u0104\u0115\5*\26\2\u0105"+
		"\u0106\6\26\3\3\u0106\u0107\t\7\2\2\u0107\u0115\5*\26\2\u0108\u0109\6"+
		"\26\4\3\u0109\u010a\t\b\2\2\u010a\u0115\5*\26\2\u010b\u010c\6\26\5\3\u010c"+
		"\u010d\t\t\2\2\u010d\u0115\5*\26\2\u010e\u010f\6\26\6\3\u010f\u0110\7"+
		"%\2\2\u0110\u0115\5*\26\2\u0111\u0112\6\26\7\3\u0112\u0113\7&\2\2\u0113"+
		"\u0115\5*\26\2\u0114\u0102\3\2\2\2\u0114\u0105\3\2\2\2\u0114\u0108\3\2"+
		"\2\2\u0114\u010b\3\2\2\2\u0114\u010e\3\2\2\2\u0114\u0111\3\2\2\2\u0115"+
		"\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117+\3\2\2\2"+
		"\u0118\u0116\3\2\2\2\u0119\u011a\5.\30\2\u011a-\3\2\2\2\u011b\u011c\7"+
		"\5\2\2\u011c\u011d\7\f\2\2\u011d\u011e\5&\24\2\u011e\u011f\7\34\2\2\u011f"+
		"\u0126\3\2\2\2\u0120\u0121\7\5\2\2\u0121\u0122\7\f\2\2\u0122\u0123\5("+
		"\25\2\u0123\u0124\7\34\2\2\u0124\u0126\3\2\2\2\u0125\u011b\3\2\2\2\u0125"+
		"\u0120\3\2\2\2\u0126/\3\2\2\2\u0127\u0128\7\f\2\2\u0128\u0129\5*\26\2"+
		"\u0129\u012a\7\34\2\2\u012a\u0131\3\2\2\2\u012b\u012d\5\62\32\2\u012c"+
		"\u012e\7!\2\2\u012d\u012c\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0131\3\2"+
		"\2\2\u012f\u0131\7\65\2\2\u0130\u0127\3\2\2\2\u0130\u012b\3\2\2\2\u0130"+
		"\u012f\3\2\2\2\u0131\61\3\2\2\2\u0132\u0133\t\n\2\2\u0133\63\3\2\2\2\35"+
		";@DQV\\bfrtx\u0081\u008a\u0095\u009c\u00a9\u00b9\u00c5\u00cf\u00e6\u00fd"+
		"\u0100\u0114\u0116\u0125\u012d\u0130";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}