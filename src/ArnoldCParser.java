// Generated from /Users/riccardo_corsini/Desktop/università/terzo anno/secondo semestre/linguaggi/laboratorio/ArnoldC/src/ArnoldC.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ArnoldCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NAT=1, TRUE=2, FALSE=3, STRING=4, PLUS=5, MINUS=6, MUL=7, DIV=8, MOD=9, 
		OR=10, AND=11, EQQ=12, GT=13, IF=14, ELSE=15, END_IF=16, WHILE=17, END_WHILE=18, 
		DECLARE_INT=19, SET_INITIAL_VALUE=20, PRINT=21, ASSING=22, SET_VALUE=23, 
		END_ASSING=24, DECLARE_METHOD=25, NON_VOID_METHOD=26, ARGS=27, RETURN=28, 
		END_METHOD=29, CALL_METHOD=30, ASSIGN_FROM_METHOD=31, BEGIN_MAIN=32, END_MAIN=33, 
		ID=34, WS=35;
	public static final int
		RULE_prog = 0, RULE_meth_decl = 1, RULE_stmt = 2, RULE_exp = 3, RULE_ops = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "meth_decl", "stmt", "exp", "ops"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'@NO PROBLEMO'", "'@I LIED'", null, "'GET UP'", "'GET DOWN'", 
			"'YOU'RE FIRED'", "'HE HAD TO SPLIT'", "'I LET HIM GO'", "'CONSIDER THAT A DIVORCE'", 
			"'KNOCK KNOCK'", "'YOU ARE NOT YOU YOU ARE ME'", "'LET OFF SOME STEAM BENNET'", 
			"'BECAUSE I'M GOING TO SAY PLEASE'", "'BULLSHIT'", "'YOU HAVE NO RESPECT FOR LOGIC'", 
			"'STICK AROUND'", "'CHILL'", "'HEY CHRISTMAS TREE'", "'YOU SET US UP'", 
			"'TALK TO THE HAND'", "'GET TO THE CHOPPER'", "'HERE IS MY INVITATION'", 
			"'ENOUGH TALK'", "'LISTEN TO ME VERY CAREFULLY'", "'GIVE THESE PEOPLE AIR'", 
			"'I NEED YOUR CLOTHES YOUR BOOTS AND YOUR MOTORCYCLE'", "'I'LL BE BACK'", 
			"'HASTA LA VISTA, BABY'", "'DO IT NOW'", "'GET YOUR ASS TO MARS'", "'IT'S SHOWTIME'", 
			"'YOU HAVE BEEN TERMINATED'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NAT", "TRUE", "FALSE", "STRING", "PLUS", "MINUS", "MUL", "DIV", 
			"MOD", "OR", "AND", "EQQ", "GT", "IF", "ELSE", "END_IF", "WHILE", "END_WHILE", 
			"DECLARE_INT", "SET_INITIAL_VALUE", "PRINT", "ASSING", "SET_VALUE", "END_ASSING", 
			"DECLARE_METHOD", "NON_VOID_METHOD", "ARGS", "RETURN", "END_METHOD", 
			"CALL_METHOD", "ASSIGN_FROM_METHOD", "BEGIN_MAIN", "END_MAIN", "ID", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ArnoldC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ArnoldCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode BEGIN_MAIN() { return getToken(ArnoldCParser.BEGIN_MAIN, 0); }
		public TerminalNode END_MAIN() { return getToken(ArnoldCParser.END_MAIN, 0); }
		public TerminalNode EOF() { return getToken(ArnoldCParser.EOF, 0); }
		public List<Meth_declContext> meth_decl() {
			return getRuleContexts(Meth_declContext.class);
		}
		public Meth_declContext meth_decl(int i) {
			return getRuleContext(Meth_declContext.class,i);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DECLARE_METHOD) {
				{
				{
				setState(10);
				meth_decl();
				}
				}
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(16);
			match(BEGIN_MAIN);
			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3228188672L) != 0)) {
				{
				setState(17);
				stmt(0);
				}
			}

			setState(20);
			match(END_MAIN);
			setState(21);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Meth_declContext extends ParserRuleContext {
		public Meth_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meth_decl; }
	 
		public Meth_declContext() { }
		public void copyFrom(Meth_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NonVoidMethodContext extends Meth_declContext {
		public TerminalNode DECLARE_METHOD() { return getToken(ArnoldCParser.DECLARE_METHOD, 0); }
		public List<TerminalNode> ID() { return getTokens(ArnoldCParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ArnoldCParser.ID, i);
		}
		public TerminalNode NON_VOID_METHOD() { return getToken(ArnoldCParser.NON_VOID_METHOD, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(ArnoldCParser.RETURN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode END_METHOD() { return getToken(ArnoldCParser.END_METHOD, 0); }
		public List<TerminalNode> ARGS() { return getTokens(ArnoldCParser.ARGS); }
		public TerminalNode ARGS(int i) {
			return getToken(ArnoldCParser.ARGS, i);
		}
		public NonVoidMethodContext(Meth_declContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitNonVoidMethod(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VoidMethodContext extends Meth_declContext {
		public TerminalNode DECLARE_METHOD() { return getToken(ArnoldCParser.DECLARE_METHOD, 0); }
		public List<TerminalNode> ID() { return getTokens(ArnoldCParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ArnoldCParser.ID, i);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode END_METHOD() { return getToken(ArnoldCParser.END_METHOD, 0); }
		public List<TerminalNode> ARGS() { return getTokens(ArnoldCParser.ARGS); }
		public TerminalNode ARGS(int i) {
			return getToken(ArnoldCParser.ARGS, i);
		}
		public VoidMethodContext(Meth_declContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitVoidMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Meth_declContext meth_decl() throws RecognitionException {
		Meth_declContext _localctx = new Meth_declContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_meth_decl);
		int _la;
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new VoidMethodContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				match(DECLARE_METHOD);
				setState(24);
				match(ID);
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARGS) {
					{
					{
					setState(25);
					match(ARGS);
					setState(26);
					match(ID);
					}
					}
					setState(31);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(32);
				stmt(0);
				setState(33);
				match(END_METHOD);
				}
				break;
			case 2:
				_localctx = new NonVoidMethodContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				match(DECLARE_METHOD);
				setState(36);
				match(ID);
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARGS) {
					{
					{
					setState(37);
					match(ARGS);
					setState(38);
					match(ID);
					}
					}
					setState(43);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(44);
				match(NON_VOID_METHOD);
				setState(45);
				stmt(0);
				setState(46);
				match(RETURN);
				setState(47);
				exp();
				setState(48);
				match(END_METHOD);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintstringContext extends StmtContext {
		public TerminalNode PRINT() { return getToken(ArnoldCParser.PRINT, 0); }
		public TerminalNode STRING() { return getToken(ArnoldCParser.STRING, 0); }
		public PrintstringContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitPrintstring(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintidContext extends StmtContext {
		public TerminalNode PRINT() { return getToken(ArnoldCParser.PRINT, 0); }
		public TerminalNode ID() { return getToken(ArnoldCParser.ID, 0); }
		public PrintidContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitPrintid(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Stmt_concatContext extends StmtContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Stmt_concatContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitStmt_concat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Var_assignContext extends StmtContext {
		public TerminalNode ASSING() { return getToken(ArnoldCParser.ASSING, 0); }
		public TerminalNode ID() { return getToken(ArnoldCParser.ID, 0); }
		public TerminalNode SET_VALUE() { return getToken(ArnoldCParser.SET_VALUE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode END_ASSING() { return getToken(ArnoldCParser.END_ASSING, 0); }
		public List<OpsContext> ops() {
			return getRuleContexts(OpsContext.class);
		}
		public OpsContext ops(int i) {
			return getRuleContext(OpsContext.class,i);
		}
		public Var_assignContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitVar_assign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Var_declContext extends StmtContext {
		public TerminalNode DECLARE_INT() { return getToken(ArnoldCParser.DECLARE_INT, 0); }
		public TerminalNode ID() { return getToken(ArnoldCParser.ID, 0); }
		public TerminalNode SET_INITIAL_VALUE() { return getToken(ArnoldCParser.SET_INITIAL_VALUE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Var_declContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondContext extends StmtContext {
		public TerminalNode IF() { return getToken(ArnoldCParser.IF, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode END_IF() { return getToken(ArnoldCParser.END_IF, 0); }
		public TerminalNode ELSE() { return getToken(ArnoldCParser.ELSE, 0); }
		public CondContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends StmtContext {
		public TerminalNode WHILE() { return getToken(ArnoldCParser.WHILE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode END_WHILE() { return getToken(ArnoldCParser.END_WHILE, 0); }
		public WhileContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Meth_callContext extends StmtContext {
		public TerminalNode CALL_METHOD() { return getToken(ArnoldCParser.CALL_METHOD, 0); }
		public List<TerminalNode> ID() { return getTokens(ArnoldCParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ArnoldCParser.ID, i);
		}
		public TerminalNode ASSIGN_FROM_METHOD() { return getToken(ArnoldCParser.ASSIGN_FROM_METHOD, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Meth_callContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitMeth_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		return stmt(0);
	}

	private StmtContext stmt(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StmtContext _localctx = new StmtContext(_ctx, _parentState);
		StmtContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_stmt, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new Var_declContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(53);
				match(DECLARE_INT);
				setState(54);
				match(ID);
				setState(55);
				match(SET_INITIAL_VALUE);
				setState(56);
				exp();
				}
				break;
			case 2:
				{
				_localctx = new Var_assignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(57);
				match(ASSING);
				setState(58);
				match(ID);
				setState(59);
				match(SET_VALUE);
				setState(60);
				exp();
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16352L) != 0)) {
					{
					{
					setState(61);
					ops();
					}
					}
					setState(66);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(67);
				match(END_ASSING);
				}
				break;
			case 3:
				{
				_localctx = new PrintidContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(69);
				match(PRINT);
				setState(70);
				match(ID);
				}
				break;
			case 4:
				{
				_localctx = new PrintstringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
				match(PRINT);
				setState(72);
				match(STRING);
				}
				break;
			case 5:
				{
				_localctx = new CondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(73);
				match(IF);
				setState(74);
				exp();
				setState(75);
				stmt(0);
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(76);
					match(ELSE);
					setState(77);
					stmt(0);
					}
				}

				setState(80);
				match(END_IF);
				}
				break;
			case 6:
				{
				_localctx = new WhileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82);
				match(WHILE);
				setState(83);
				exp();
				setState(84);
				stmt(0);
				setState(85);
				match(END_WHILE);
				}
				break;
			case 7:
				{
				_localctx = new Meth_callContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN_FROM_METHOD) {
					{
					setState(87);
					match(ASSIGN_FROM_METHOD);
					setState(88);
					match(ID);
					}
				}

				setState(91);
				match(CALL_METHOD);
				setState(92);
				match(ID);
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(93);
						exp();
						}
						} 
					}
					setState(98);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Stmt_concatContext(new StmtContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_stmt);
					setState(101);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(102);
					stmt(2);
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NatContext extends ExpContext {
		public TerminalNode NAT() { return getToken(ArnoldCParser.NAT, 0); }
		public NatContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitNat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolContext extends ExpContext {
		public Token op;
		public TerminalNode TRUE() { return getToken(ArnoldCParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ArnoldCParser.FALSE, 0); }
		public BoolContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ExpContext {
		public TerminalNode ID() { return getToken(ArnoldCParser.ID, 0); }
		public IdContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_exp);
		int _la;
		try {
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAT:
				_localctx = new NatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(NAT);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				((BoolContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
					((BoolContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case ID:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpsContext extends ParserRuleContext {
		public OpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ops; }
	 
		public OpsContext() { }
		public void copyFrom(OpsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivMulModContext extends OpsContext {
		public Token op;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode DIV() { return getToken(ArnoldCParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(ArnoldCParser.MUL, 0); }
		public TerminalNode MOD() { return getToken(ArnoldCParser.MOD, 0); }
		public DivMulModContext(OpsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitDivMulMod(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusMinusContext extends OpsContext {
		public Token op;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(ArnoldCParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ArnoldCParser.MINUS, 0); }
		public PlusMinusContext(OpsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicContext extends OpsContext {
		public Token op;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode AND() { return getToken(ArnoldCParser.AND, 0); }
		public TerminalNode OR() { return getToken(ArnoldCParser.OR, 0); }
		public LogicContext(OpsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitLogic(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqContext extends OpsContext {
		public TerminalNode EQQ() { return getToken(ArnoldCParser.EQQ, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public EqContext(OpsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitEq(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GtContext extends OpsContext {
		public TerminalNode GT() { return getToken(ArnoldCParser.GT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public GtContext(OpsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitGt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpsContext ops() throws RecognitionException {
		OpsContext _localctx = new OpsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ops);
		int _la;
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
			case DIV:
			case MOD:
				_localctx = new DivMulModContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				((DivMulModContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 896L) != 0)) ) {
					((DivMulModContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(114);
				exp();
				}
				break;
			case PLUS:
			case MINUS:
				_localctx = new PlusMinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				((PlusMinusContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((PlusMinusContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(116);
				exp();
				}
				break;
			case GT:
				_localctx = new GtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				match(GT);
				setState(118);
				exp();
				}
				break;
			case EQQ:
				_localctx = new EqContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
				match(EQQ);
				setState(120);
				exp();
				}
				break;
			case OR:
			case AND:
				_localctx = new LogicContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(121);
				((LogicContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==OR || _la==AND) ) {
					((LogicContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(122);
				exp();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return stmt_sempred((StmtContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean stmt_sempred(StmtContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001#~\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001\u0000"+
		"\u0005\u0000\f\b\u0000\n\u0000\f\u0000\u000f\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000\u0013\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u001c\b\u0001\n"+
		"\u0001\f\u0001\u001f\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001(\b\u0001\n\u0001"+
		"\f\u0001+\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u00013\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002?\b\u0002\n\u0002\f\u0002B\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002O\b"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002Z\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002_\b\u0002\n\u0002\f\u0002b\t"+
		"\u0002\u0003\u0002d\b\u0002\u0001\u0002\u0001\u0002\u0005\u0002h\b\u0002"+
		"\n\u0002\f\u0002k\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"p\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"|\b\u0004\u0001\u0004\u0000\u0001\u0004\u0005\u0000\u0002\u0004\u0006"+
		"\b\u0000\u0004\u0001\u0000\u0002\u0003\u0001\u0000\u0007\t\u0001\u0000"+
		"\u0005\u0006\u0001\u0000\n\u000b\u008e\u0000\r\u0001\u0000\u0000\u0000"+
		"\u00022\u0001\u0000\u0000\u0000\u0004c\u0001\u0000\u0000\u0000\u0006o"+
		"\u0001\u0000\u0000\u0000\b{\u0001\u0000\u0000\u0000\n\f\u0003\u0002\u0001"+
		"\u0000\u000b\n\u0001\u0000\u0000\u0000\f\u000f\u0001\u0000\u0000\u0000"+
		"\r\u000b\u0001\u0000\u0000\u0000\r\u000e\u0001\u0000\u0000\u0000\u000e"+
		"\u0010\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000\u0010\u0012"+
		"\u0005 \u0000\u0000\u0011\u0013\u0003\u0004\u0002\u0000\u0012\u0011\u0001"+
		"\u0000\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000\u0013\u0014\u0001"+
		"\u0000\u0000\u0000\u0014\u0015\u0005!\u0000\u0000\u0015\u0016\u0005\u0000"+
		"\u0000\u0001\u0016\u0001\u0001\u0000\u0000\u0000\u0017\u0018\u0005\u0019"+
		"\u0000\u0000\u0018\u001d\u0005\"\u0000\u0000\u0019\u001a\u0005\u001b\u0000"+
		"\u0000\u001a\u001c\u0005\"\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000"+
		"\u001c\u001f\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000"+
		"\u001d\u001e\u0001\u0000\u0000\u0000\u001e \u0001\u0000\u0000\u0000\u001f"+
		"\u001d\u0001\u0000\u0000\u0000 !\u0003\u0004\u0002\u0000!\"\u0005\u001d"+
		"\u0000\u0000\"3\u0001\u0000\u0000\u0000#$\u0005\u0019\u0000\u0000$)\u0005"+
		"\"\u0000\u0000%&\u0005\u001b\u0000\u0000&(\u0005\"\u0000\u0000\'%\u0001"+
		"\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000"+
		")*\u0001\u0000\u0000\u0000*,\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000"+
		"\u0000,-\u0005\u001a\u0000\u0000-.\u0003\u0004\u0002\u0000./\u0005\u001c"+
		"\u0000\u0000/0\u0003\u0006\u0003\u000001\u0005\u001d\u0000\u000013\u0001"+
		"\u0000\u0000\u00002\u0017\u0001\u0000\u0000\u00002#\u0001\u0000\u0000"+
		"\u00003\u0003\u0001\u0000\u0000\u000045\u0006\u0002\uffff\uffff\u0000"+
		"56\u0005\u0013\u0000\u000067\u0005\"\u0000\u000078\u0005\u0014\u0000\u0000"+
		"8d\u0003\u0006\u0003\u00009:\u0005\u0016\u0000\u0000:;\u0005\"\u0000\u0000"+
		";<\u0005\u0017\u0000\u0000<@\u0003\u0006\u0003\u0000=?\u0003\b\u0004\u0000"+
		">=\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000"+
		"\u0000@A\u0001\u0000\u0000\u0000AC\u0001\u0000\u0000\u0000B@\u0001\u0000"+
		"\u0000\u0000CD\u0005\u0018\u0000\u0000Dd\u0001\u0000\u0000\u0000EF\u0005"+
		"\u0015\u0000\u0000Fd\u0005\"\u0000\u0000GH\u0005\u0015\u0000\u0000Hd\u0005"+
		"\u0004\u0000\u0000IJ\u0005\u000e\u0000\u0000JK\u0003\u0006\u0003\u0000"+
		"KN\u0003\u0004\u0002\u0000LM\u0005\u000f\u0000\u0000MO\u0003\u0004\u0002"+
		"\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0001\u0000"+
		"\u0000\u0000PQ\u0005\u0010\u0000\u0000Qd\u0001\u0000\u0000\u0000RS\u0005"+
		"\u0011\u0000\u0000ST\u0003\u0006\u0003\u0000TU\u0003\u0004\u0002\u0000"+
		"UV\u0005\u0012\u0000\u0000Vd\u0001\u0000\u0000\u0000WX\u0005\u001f\u0000"+
		"\u0000XZ\u0005\"\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000"+
		"\u0000Z[\u0001\u0000\u0000\u0000[\\\u0005\u001e\u0000\u0000\\`\u0005\""+
		"\u0000\u0000]_\u0003\u0006\u0003\u0000^]\u0001\u0000\u0000\u0000_b\u0001"+
		"\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000"+
		"ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000c4\u0001\u0000\u0000"+
		"\u0000c9\u0001\u0000\u0000\u0000cE\u0001\u0000\u0000\u0000cG\u0001\u0000"+
		"\u0000\u0000cI\u0001\u0000\u0000\u0000cR\u0001\u0000\u0000\u0000cY\u0001"+
		"\u0000\u0000\u0000di\u0001\u0000\u0000\u0000ef\n\u0001\u0000\u0000fh\u0003"+
		"\u0004\u0002\u0002ge\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000"+
		"ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000j\u0005\u0001\u0000"+
		"\u0000\u0000ki\u0001\u0000\u0000\u0000lp\u0005\u0001\u0000\u0000mp\u0007"+
		"\u0000\u0000\u0000np\u0005\"\u0000\u0000ol\u0001\u0000\u0000\u0000om\u0001"+
		"\u0000\u0000\u0000on\u0001\u0000\u0000\u0000p\u0007\u0001\u0000\u0000"+
		"\u0000qr\u0007\u0001\u0000\u0000r|\u0003\u0006\u0003\u0000st\u0007\u0002"+
		"\u0000\u0000t|\u0003\u0006\u0003\u0000uv\u0005\r\u0000\u0000v|\u0003\u0006"+
		"\u0003\u0000wx\u0005\f\u0000\u0000x|\u0003\u0006\u0003\u0000yz\u0007\u0003"+
		"\u0000\u0000z|\u0003\u0006\u0003\u0000{q\u0001\u0000\u0000\u0000{s\u0001"+
		"\u0000\u0000\u0000{u\u0001\u0000\u0000\u0000{w\u0001\u0000\u0000\u0000"+
		"{y\u0001\u0000\u0000\u0000|\t\u0001\u0000\u0000\u0000\r\r\u0012\u001d"+
		")2@NY`cio{";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}