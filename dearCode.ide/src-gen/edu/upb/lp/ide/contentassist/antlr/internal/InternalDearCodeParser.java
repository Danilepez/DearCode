package edu.upb.lp.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import edu.upb.lp.services.DearCodeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDearCodeParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ANYTEXT", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Querido'", "'Querida'", "'cero'", "'uno'", "'dos'", "'tres'", "'cuatro'", "'cinco'", "'seis'", "'siete'", "'ocho'", "'nueve'", "'un'", "'una'", "'Te regalo'", "'Ofrezco'", "'Obsequio'", "'Deposito en tu jard\\u00EDn'", "'Con cari\\u00F1o, Tu programador'", "'.'", "'con'", "'y'", "'decena'", "'s'", "'centena'", "'millar'", "'es'", "'Perm\\u00EDteme'", "'alimentar'", "'regar'", "'ajustar'", "'@'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_ANYTEXT=4;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalDearCodeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDearCodeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDearCodeParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDearCode.g"; }


    	private DearCodeGrammarAccess grammarAccess;

    	public void setGrammarAccess(DearCodeGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleProgram"
    // InternalDearCode.g:53:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalDearCode.g:54:1: ( ruleProgram EOF )
            // InternalDearCode.g:55:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalDearCode.g:62:1: ruleProgram : ( ( ( rule__Program__CartasAssignment ) ) ( ( rule__Program__CartasAssignment )* ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:66:2: ( ( ( ( rule__Program__CartasAssignment ) ) ( ( rule__Program__CartasAssignment )* ) ) )
            // InternalDearCode.g:67:2: ( ( ( rule__Program__CartasAssignment ) ) ( ( rule__Program__CartasAssignment )* ) )
            {
            // InternalDearCode.g:67:2: ( ( ( rule__Program__CartasAssignment ) ) ( ( rule__Program__CartasAssignment )* ) )
            // InternalDearCode.g:68:3: ( ( rule__Program__CartasAssignment ) ) ( ( rule__Program__CartasAssignment )* )
            {
            // InternalDearCode.g:68:3: ( ( rule__Program__CartasAssignment ) )
            // InternalDearCode.g:69:4: ( rule__Program__CartasAssignment )
            {
             before(grammarAccess.getProgramAccess().getCartasAssignment()); 
            // InternalDearCode.g:70:4: ( rule__Program__CartasAssignment )
            // InternalDearCode.g:70:5: rule__Program__CartasAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Program__CartasAssignment();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getCartasAssignment()); 

            }

            // InternalDearCode.g:73:3: ( ( rule__Program__CartasAssignment )* )
            // InternalDearCode.g:74:4: ( rule__Program__CartasAssignment )*
            {
             before(grammarAccess.getProgramAccess().getCartasAssignment()); 
            // InternalDearCode.g:75:4: ( rule__Program__CartasAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=12 && LA1_0<=13)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDearCode.g:75:5: rule__Program__CartasAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Program__CartasAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getCartasAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleCarta"
    // InternalDearCode.g:85:1: entryRuleCarta : ruleCarta EOF ;
    public final void entryRuleCarta() throws RecognitionException {
        try {
            // InternalDearCode.g:86:1: ( ruleCarta EOF )
            // InternalDearCode.g:87:1: ruleCarta EOF
            {
             before(grammarAccess.getCartaRule()); 
            pushFollow(FOLLOW_1);
            ruleCarta();

            state._fsp--;

             after(grammarAccess.getCartaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCarta"


    // $ANTLR start "ruleCarta"
    // InternalDearCode.g:94:1: ruleCarta : ( ( rule__Carta__Group__0 ) ) ;
    public final void ruleCarta() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:98:2: ( ( ( rule__Carta__Group__0 ) ) )
            // InternalDearCode.g:99:2: ( ( rule__Carta__Group__0 ) )
            {
            // InternalDearCode.g:99:2: ( ( rule__Carta__Group__0 ) )
            // InternalDearCode.g:100:3: ( rule__Carta__Group__0 )
            {
             before(grammarAccess.getCartaAccess().getGroup()); 
            // InternalDearCode.g:101:3: ( rule__Carta__Group__0 )
            // InternalDearCode.g:101:4: rule__Carta__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Carta__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCartaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCarta"


    // $ANTLR start "entryRuleSaludo"
    // InternalDearCode.g:110:1: entryRuleSaludo : ruleSaludo EOF ;
    public final void entryRuleSaludo() throws RecognitionException {
        try {
            // InternalDearCode.g:111:1: ( ruleSaludo EOF )
            // InternalDearCode.g:112:1: ruleSaludo EOF
            {
             before(grammarAccess.getSaludoRule()); 
            pushFollow(FOLLOW_1);
            ruleSaludo();

            state._fsp--;

             after(grammarAccess.getSaludoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSaludo"


    // $ANTLR start "ruleSaludo"
    // InternalDearCode.g:119:1: ruleSaludo : ( ( rule__Saludo__Group__0 ) ) ;
    public final void ruleSaludo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:123:2: ( ( ( rule__Saludo__Group__0 ) ) )
            // InternalDearCode.g:124:2: ( ( rule__Saludo__Group__0 ) )
            {
            // InternalDearCode.g:124:2: ( ( rule__Saludo__Group__0 ) )
            // InternalDearCode.g:125:3: ( rule__Saludo__Group__0 )
            {
             before(grammarAccess.getSaludoAccess().getGroup()); 
            // InternalDearCode.g:126:3: ( rule__Saludo__Group__0 )
            // InternalDearCode.g:126:4: rule__Saludo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Saludo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSaludoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSaludo"


    // $ANTLR start "entryRuleDespedida"
    // InternalDearCode.g:135:1: entryRuleDespedida : ruleDespedida EOF ;
    public final void entryRuleDespedida() throws RecognitionException {
        try {
            // InternalDearCode.g:136:1: ( ruleDespedida EOF )
            // InternalDearCode.g:137:1: ruleDespedida EOF
            {
             before(grammarAccess.getDespedidaRule()); 
            pushFollow(FOLLOW_1);
            ruleDespedida();

            state._fsp--;

             after(grammarAccess.getDespedidaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDespedida"


    // $ANTLR start "ruleDespedida"
    // InternalDearCode.g:144:1: ruleDespedida : ( ( rule__Despedida__Group__0 ) ) ;
    public final void ruleDespedida() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:148:2: ( ( ( rule__Despedida__Group__0 ) ) )
            // InternalDearCode.g:149:2: ( ( rule__Despedida__Group__0 ) )
            {
            // InternalDearCode.g:149:2: ( ( rule__Despedida__Group__0 ) )
            // InternalDearCode.g:150:3: ( rule__Despedida__Group__0 )
            {
             before(grammarAccess.getDespedidaAccess().getGroup()); 
            // InternalDearCode.g:151:3: ( rule__Despedida__Group__0 )
            // InternalDearCode.g:151:4: rule__Despedida__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Despedida__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDespedidaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDespedida"


    // $ANTLR start "entryRuleCuerpo"
    // InternalDearCode.g:160:1: entryRuleCuerpo : ruleCuerpo EOF ;
    public final void entryRuleCuerpo() throws RecognitionException {
        try {
            // InternalDearCode.g:161:1: ( ruleCuerpo EOF )
            // InternalDearCode.g:162:1: ruleCuerpo EOF
            {
             before(grammarAccess.getCuerpoRule()); 
            pushFollow(FOLLOW_1);
            ruleCuerpo();

            state._fsp--;

             after(grammarAccess.getCuerpoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCuerpo"


    // $ANTLR start "ruleCuerpo"
    // InternalDearCode.g:169:1: ruleCuerpo : ( ( ( rule__Cuerpo__InstruccionesAssignment ) ) ( ( rule__Cuerpo__InstruccionesAssignment )* ) ) ;
    public final void ruleCuerpo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:173:2: ( ( ( ( rule__Cuerpo__InstruccionesAssignment ) ) ( ( rule__Cuerpo__InstruccionesAssignment )* ) ) )
            // InternalDearCode.g:174:2: ( ( ( rule__Cuerpo__InstruccionesAssignment ) ) ( ( rule__Cuerpo__InstruccionesAssignment )* ) )
            {
            // InternalDearCode.g:174:2: ( ( ( rule__Cuerpo__InstruccionesAssignment ) ) ( ( rule__Cuerpo__InstruccionesAssignment )* ) )
            // InternalDearCode.g:175:3: ( ( rule__Cuerpo__InstruccionesAssignment ) ) ( ( rule__Cuerpo__InstruccionesAssignment )* )
            {
            // InternalDearCode.g:175:3: ( ( rule__Cuerpo__InstruccionesAssignment ) )
            // InternalDearCode.g:176:4: ( rule__Cuerpo__InstruccionesAssignment )
            {
             before(grammarAccess.getCuerpoAccess().getInstruccionesAssignment()); 
            // InternalDearCode.g:177:4: ( rule__Cuerpo__InstruccionesAssignment )
            // InternalDearCode.g:177:5: rule__Cuerpo__InstruccionesAssignment
            {
            pushFollow(FOLLOW_4);
            rule__Cuerpo__InstruccionesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCuerpoAccess().getInstruccionesAssignment()); 

            }

            // InternalDearCode.g:180:3: ( ( rule__Cuerpo__InstruccionesAssignment )* )
            // InternalDearCode.g:181:4: ( rule__Cuerpo__InstruccionesAssignment )*
            {
             before(grammarAccess.getCuerpoAccess().getInstruccionesAssignment()); 
            // InternalDearCode.g:182:4: ( rule__Cuerpo__InstruccionesAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=26 && LA2_0<=29)||LA2_0==39) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDearCode.g:182:5: rule__Cuerpo__InstruccionesAssignment
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Cuerpo__InstruccionesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getCuerpoAccess().getInstruccionesAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCuerpo"


    // $ANTLR start "entryRuleInstruccion"
    // InternalDearCode.g:192:1: entryRuleInstruccion : ruleInstruccion EOF ;
    public final void entryRuleInstruccion() throws RecognitionException {
        try {
            // InternalDearCode.g:193:1: ( ruleInstruccion EOF )
            // InternalDearCode.g:194:1: ruleInstruccion EOF
            {
             before(grammarAccess.getInstruccionRule()); 
            pushFollow(FOLLOW_1);
            ruleInstruccion();

            state._fsp--;

             after(grammarAccess.getInstruccionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstruccion"


    // $ANTLR start "ruleInstruccion"
    // InternalDearCode.g:201:1: ruleInstruccion : ( ( rule__Instruccion__Alternatives ) ) ;
    public final void ruleInstruccion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:205:2: ( ( ( rule__Instruccion__Alternatives ) ) )
            // InternalDearCode.g:206:2: ( ( rule__Instruccion__Alternatives ) )
            {
            // InternalDearCode.g:206:2: ( ( rule__Instruccion__Alternatives ) )
            // InternalDearCode.g:207:3: ( rule__Instruccion__Alternatives )
            {
             before(grammarAccess.getInstruccionAccess().getAlternatives()); 
            // InternalDearCode.g:208:3: ( rule__Instruccion__Alternatives )
            // InternalDearCode.g:208:4: rule__Instruccion__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Instruccion__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInstruccionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstruccion"


    // $ANTLR start "entryRuleDeclarar"
    // InternalDearCode.g:217:1: entryRuleDeclarar : ruleDeclarar EOF ;
    public final void entryRuleDeclarar() throws RecognitionException {
        try {
            // InternalDearCode.g:218:1: ( ruleDeclarar EOF )
            // InternalDearCode.g:219:1: ruleDeclarar EOF
            {
             before(grammarAccess.getDeclararRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclarar();

            state._fsp--;

             after(grammarAccess.getDeclararRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeclarar"


    // $ANTLR start "ruleDeclarar"
    // InternalDearCode.g:226:1: ruleDeclarar : ( ( rule__Declarar__Group__0 ) ) ;
    public final void ruleDeclarar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:230:2: ( ( ( rule__Declarar__Group__0 ) ) )
            // InternalDearCode.g:231:2: ( ( rule__Declarar__Group__0 ) )
            {
            // InternalDearCode.g:231:2: ( ( rule__Declarar__Group__0 ) )
            // InternalDearCode.g:232:3: ( rule__Declarar__Group__0 )
            {
             before(grammarAccess.getDeclararAccess().getGroup()); 
            // InternalDearCode.g:233:3: ( rule__Declarar__Group__0 )
            // InternalDearCode.g:233:4: rule__Declarar__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Declarar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeclararAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclarar"


    // $ANTLR start "entryRuleReasignar"
    // InternalDearCode.g:242:1: entryRuleReasignar : ruleReasignar EOF ;
    public final void entryRuleReasignar() throws RecognitionException {
        try {
            // InternalDearCode.g:243:1: ( ruleReasignar EOF )
            // InternalDearCode.g:244:1: ruleReasignar EOF
            {
             before(grammarAccess.getReasignarRule()); 
            pushFollow(FOLLOW_1);
            ruleReasignar();

            state._fsp--;

             after(grammarAccess.getReasignarRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReasignar"


    // $ANTLR start "ruleReasignar"
    // InternalDearCode.g:251:1: ruleReasignar : ( ( rule__Reasignar__Group__0 ) ) ;
    public final void ruleReasignar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:255:2: ( ( ( rule__Reasignar__Group__0 ) ) )
            // InternalDearCode.g:256:2: ( ( rule__Reasignar__Group__0 ) )
            {
            // InternalDearCode.g:256:2: ( ( rule__Reasignar__Group__0 ) )
            // InternalDearCode.g:257:3: ( rule__Reasignar__Group__0 )
            {
             before(grammarAccess.getReasignarAccess().getGroup()); 
            // InternalDearCode.g:258:3: ( rule__Reasignar__Group__0 )
            // InternalDearCode.g:258:4: rule__Reasignar__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Reasignar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReasignarAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReasignar"


    // $ANTLR start "entryRuleValor"
    // InternalDearCode.g:267:1: entryRuleValor : ruleValor EOF ;
    public final void entryRuleValor() throws RecognitionException {
        try {
            // InternalDearCode.g:268:1: ( ruleValor EOF )
            // InternalDearCode.g:269:1: ruleValor EOF
            {
             before(grammarAccess.getValorRule()); 
            pushFollow(FOLLOW_1);
            ruleValor();

            state._fsp--;

             after(grammarAccess.getValorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValor"


    // $ANTLR start "ruleValor"
    // InternalDearCode.g:276:1: ruleValor : ( ( rule__Valor__Alternatives ) ) ;
    public final void ruleValor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:280:2: ( ( ( rule__Valor__Alternatives ) ) )
            // InternalDearCode.g:281:2: ( ( rule__Valor__Alternatives ) )
            {
            // InternalDearCode.g:281:2: ( ( rule__Valor__Alternatives ) )
            // InternalDearCode.g:282:3: ( rule__Valor__Alternatives )
            {
             before(grammarAccess.getValorAccess().getAlternatives()); 
            // InternalDearCode.g:283:3: ( rule__Valor__Alternatives )
            // InternalDearCode.g:283:4: rule__Valor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Valor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValor"


    // $ANTLR start "entryRuleNumeroLiteral"
    // InternalDearCode.g:292:1: entryRuleNumeroLiteral : ruleNumeroLiteral EOF ;
    public final void entryRuleNumeroLiteral() throws RecognitionException {
        try {
            // InternalDearCode.g:293:1: ( ruleNumeroLiteral EOF )
            // InternalDearCode.g:294:1: ruleNumeroLiteral EOF
            {
             before(grammarAccess.getNumeroLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleNumeroLiteral();

            state._fsp--;

             after(grammarAccess.getNumeroLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumeroLiteral"


    // $ANTLR start "ruleNumeroLiteral"
    // InternalDearCode.g:301:1: ruleNumeroLiteral : ( ( rule__NumeroLiteral__Alternatives ) ) ;
    public final void ruleNumeroLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:305:2: ( ( ( rule__NumeroLiteral__Alternatives ) ) )
            // InternalDearCode.g:306:2: ( ( rule__NumeroLiteral__Alternatives ) )
            {
            // InternalDearCode.g:306:2: ( ( rule__NumeroLiteral__Alternatives ) )
            // InternalDearCode.g:307:3: ( rule__NumeroLiteral__Alternatives )
            {
             before(grammarAccess.getNumeroLiteralAccess().getAlternatives()); 
            // InternalDearCode.g:308:3: ( rule__NumeroLiteral__Alternatives )
            // InternalDearCode.g:308:4: rule__NumeroLiteral__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NumeroLiteral__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumeroLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumeroLiteral"


    // $ANTLR start "entryRuleSimple"
    // InternalDearCode.g:317:1: entryRuleSimple : ruleSimple EOF ;
    public final void entryRuleSimple() throws RecognitionException {
        try {
            // InternalDearCode.g:318:1: ( ruleSimple EOF )
            // InternalDearCode.g:319:1: ruleSimple EOF
            {
             before(grammarAccess.getSimpleRule()); 
            pushFollow(FOLLOW_1);
            ruleSimple();

            state._fsp--;

             after(grammarAccess.getSimpleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimple"


    // $ANTLR start "ruleSimple"
    // InternalDearCode.g:326:1: ruleSimple : ( ( rule__Simple__ValueAssignment ) ) ;
    public final void ruleSimple() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:330:2: ( ( ( rule__Simple__ValueAssignment ) ) )
            // InternalDearCode.g:331:2: ( ( rule__Simple__ValueAssignment ) )
            {
            // InternalDearCode.g:331:2: ( ( rule__Simple__ValueAssignment ) )
            // InternalDearCode.g:332:3: ( rule__Simple__ValueAssignment )
            {
             before(grammarAccess.getSimpleAccess().getValueAssignment()); 
            // InternalDearCode.g:333:3: ( rule__Simple__ValueAssignment )
            // InternalDearCode.g:333:4: rule__Simple__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Simple__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimple"


    // $ANTLR start "entryRuleCompuesto"
    // InternalDearCode.g:342:1: entryRuleCompuesto : ruleCompuesto EOF ;
    public final void entryRuleCompuesto() throws RecognitionException {
        try {
            // InternalDearCode.g:343:1: ( ruleCompuesto EOF )
            // InternalDearCode.g:344:1: ruleCompuesto EOF
            {
             before(grammarAccess.getCompuestoRule()); 
            pushFollow(FOLLOW_1);
            ruleCompuesto();

            state._fsp--;

             after(grammarAccess.getCompuestoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompuesto"


    // $ANTLR start "ruleCompuesto"
    // InternalDearCode.g:351:1: ruleCompuesto : ( ( rule__Compuesto__Group__0 ) ) ;
    public final void ruleCompuesto() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:355:2: ( ( ( rule__Compuesto__Group__0 ) ) )
            // InternalDearCode.g:356:2: ( ( rule__Compuesto__Group__0 ) )
            {
            // InternalDearCode.g:356:2: ( ( rule__Compuesto__Group__0 ) )
            // InternalDearCode.g:357:3: ( rule__Compuesto__Group__0 )
            {
             before(grammarAccess.getCompuestoAccess().getGroup()); 
            // InternalDearCode.g:358:3: ( rule__Compuesto__Group__0 )
            // InternalDearCode.g:358:4: rule__Compuesto__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Compuesto__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompuestoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompuesto"


    // $ANTLR start "entryRuleMultiplicador"
    // InternalDearCode.g:367:1: entryRuleMultiplicador : ruleMultiplicador EOF ;
    public final void entryRuleMultiplicador() throws RecognitionException {
        try {
            // InternalDearCode.g:368:1: ( ruleMultiplicador EOF )
            // InternalDearCode.g:369:1: ruleMultiplicador EOF
            {
             before(grammarAccess.getMultiplicadorRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplicador();

            state._fsp--;

             after(grammarAccess.getMultiplicadorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplicador"


    // $ANTLR start "ruleMultiplicador"
    // InternalDearCode.g:376:1: ruleMultiplicador : ( ( rule__Multiplicador__Alternatives ) ) ;
    public final void ruleMultiplicador() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:380:2: ( ( ( rule__Multiplicador__Alternatives ) ) )
            // InternalDearCode.g:381:2: ( ( rule__Multiplicador__Alternatives ) )
            {
            // InternalDearCode.g:381:2: ( ( rule__Multiplicador__Alternatives ) )
            // InternalDearCode.g:382:3: ( rule__Multiplicador__Alternatives )
            {
             before(grammarAccess.getMultiplicadorAccess().getAlternatives()); 
            // InternalDearCode.g:383:3: ( rule__Multiplicador__Alternatives )
            // InternalDearCode.g:383:4: rule__Multiplicador__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicador__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicadorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicador"


    // $ANTLR start "entryRuleArticulo"
    // InternalDearCode.g:392:1: entryRuleArticulo : ruleArticulo EOF ;
    public final void entryRuleArticulo() throws RecognitionException {
        try {
            // InternalDearCode.g:393:1: ( ruleArticulo EOF )
            // InternalDearCode.g:394:1: ruleArticulo EOF
            {
             before(grammarAccess.getArticuloRule()); 
            pushFollow(FOLLOW_1);
            ruleArticulo();

            state._fsp--;

             after(grammarAccess.getArticuloRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArticulo"


    // $ANTLR start "ruleArticulo"
    // InternalDearCode.g:401:1: ruleArticulo : ( ( rule__Articulo__Alternatives ) ) ;
    public final void ruleArticulo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:405:2: ( ( ( rule__Articulo__Alternatives ) ) )
            // InternalDearCode.g:406:2: ( ( rule__Articulo__Alternatives ) )
            {
            // InternalDearCode.g:406:2: ( ( rule__Articulo__Alternatives ) )
            // InternalDearCode.g:407:3: ( rule__Articulo__Alternatives )
            {
             before(grammarAccess.getArticuloAccess().getAlternatives()); 
            // InternalDearCode.g:408:3: ( rule__Articulo__Alternatives )
            // InternalDearCode.g:408:4: rule__Articulo__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Articulo__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getArticuloAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArticulo"


    // $ANTLR start "entryRuleVerboDeclaracion"
    // InternalDearCode.g:417:1: entryRuleVerboDeclaracion : ruleVerboDeclaracion EOF ;
    public final void entryRuleVerboDeclaracion() throws RecognitionException {
        try {
            // InternalDearCode.g:418:1: ( ruleVerboDeclaracion EOF )
            // InternalDearCode.g:419:1: ruleVerboDeclaracion EOF
            {
             before(grammarAccess.getVerboDeclaracionRule()); 
            pushFollow(FOLLOW_1);
            ruleVerboDeclaracion();

            state._fsp--;

             after(grammarAccess.getVerboDeclaracionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVerboDeclaracion"


    // $ANTLR start "ruleVerboDeclaracion"
    // InternalDearCode.g:426:1: ruleVerboDeclaracion : ( ( rule__VerboDeclaracion__Alternatives ) ) ;
    public final void ruleVerboDeclaracion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:430:2: ( ( ( rule__VerboDeclaracion__Alternatives ) ) )
            // InternalDearCode.g:431:2: ( ( rule__VerboDeclaracion__Alternatives ) )
            {
            // InternalDearCode.g:431:2: ( ( rule__VerboDeclaracion__Alternatives ) )
            // InternalDearCode.g:432:3: ( rule__VerboDeclaracion__Alternatives )
            {
             before(grammarAccess.getVerboDeclaracionAccess().getAlternatives()); 
            // InternalDearCode.g:433:3: ( rule__VerboDeclaracion__Alternatives )
            // InternalDearCode.g:433:4: rule__VerboDeclaracion__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VerboDeclaracion__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVerboDeclaracionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVerboDeclaracion"


    // $ANTLR start "entryRuleVerboReasignacion"
    // InternalDearCode.g:442:1: entryRuleVerboReasignacion : ruleVerboReasignacion EOF ;
    public final void entryRuleVerboReasignacion() throws RecognitionException {
        try {
            // InternalDearCode.g:443:1: ( ruleVerboReasignacion EOF )
            // InternalDearCode.g:444:1: ruleVerboReasignacion EOF
            {
             before(grammarAccess.getVerboReasignacionRule()); 
            pushFollow(FOLLOW_1);
            ruleVerboReasignacion();

            state._fsp--;

             after(grammarAccess.getVerboReasignacionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVerboReasignacion"


    // $ANTLR start "ruleVerboReasignacion"
    // InternalDearCode.g:451:1: ruleVerboReasignacion : ( ( rule__VerboReasignacion__Alternatives ) ) ;
    public final void ruleVerboReasignacion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:455:2: ( ( ( rule__VerboReasignacion__Alternatives ) ) )
            // InternalDearCode.g:456:2: ( ( rule__VerboReasignacion__Alternatives ) )
            {
            // InternalDearCode.g:456:2: ( ( rule__VerboReasignacion__Alternatives ) )
            // InternalDearCode.g:457:3: ( rule__VerboReasignacion__Alternatives )
            {
             before(grammarAccess.getVerboReasignacionAccess().getAlternatives()); 
            // InternalDearCode.g:458:3: ( rule__VerboReasignacion__Alternatives )
            // InternalDearCode.g:458:4: rule__VerboReasignacion__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VerboReasignacion__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVerboReasignacionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVerboReasignacion"


    // $ANTLR start "entryRuleMI_ID"
    // InternalDearCode.g:467:1: entryRuleMI_ID : ruleMI_ID EOF ;
    public final void entryRuleMI_ID() throws RecognitionException {
        try {
            // InternalDearCode.g:468:1: ( ruleMI_ID EOF )
            // InternalDearCode.g:469:1: ruleMI_ID EOF
            {
             before(grammarAccess.getMI_IDRule()); 
            pushFollow(FOLLOW_1);
            ruleMI_ID();

            state._fsp--;

             after(grammarAccess.getMI_IDRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMI_ID"


    // $ANTLR start "ruleMI_ID"
    // InternalDearCode.g:476:1: ruleMI_ID : ( ( rule__MI_ID__Group__0 ) ) ;
    public final void ruleMI_ID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:480:2: ( ( ( rule__MI_ID__Group__0 ) ) )
            // InternalDearCode.g:481:2: ( ( rule__MI_ID__Group__0 ) )
            {
            // InternalDearCode.g:481:2: ( ( rule__MI_ID__Group__0 ) )
            // InternalDearCode.g:482:3: ( rule__MI_ID__Group__0 )
            {
             before(grammarAccess.getMI_IDAccess().getGroup()); 
            // InternalDearCode.g:483:3: ( rule__MI_ID__Group__0 )
            // InternalDearCode.g:483:4: rule__MI_ID__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MI_ID__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMI_IDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMI_ID"


    // $ANTLR start "rule__Saludo__Alternatives_0"
    // InternalDearCode.g:491:1: rule__Saludo__Alternatives_0 : ( ( 'Querido' ) | ( 'Querida' ) );
    public final void rule__Saludo__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:495:1: ( ( 'Querido' ) | ( 'Querida' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDearCode.g:496:2: ( 'Querido' )
                    {
                    // InternalDearCode.g:496:2: ( 'Querido' )
                    // InternalDearCode.g:497:3: 'Querido'
                    {
                     before(grammarAccess.getSaludoAccess().getQueridoKeyword_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getSaludoAccess().getQueridoKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDearCode.g:502:2: ( 'Querida' )
                    {
                    // InternalDearCode.g:502:2: ( 'Querida' )
                    // InternalDearCode.g:503:3: 'Querida'
                    {
                     before(grammarAccess.getSaludoAccess().getQueridaKeyword_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSaludoAccess().getQueridaKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saludo__Alternatives_0"


    // $ANTLR start "rule__Instruccion__Alternatives"
    // InternalDearCode.g:512:1: rule__Instruccion__Alternatives : ( ( ruleDeclarar ) | ( ruleReasignar ) );
    public final void rule__Instruccion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:516:1: ( ( ruleDeclarar ) | ( ruleReasignar ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=26 && LA4_0<=29)) ) {
                alt4=1;
            }
            else if ( (LA4_0==39) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDearCode.g:517:2: ( ruleDeclarar )
                    {
                    // InternalDearCode.g:517:2: ( ruleDeclarar )
                    // InternalDearCode.g:518:3: ruleDeclarar
                    {
                     before(grammarAccess.getInstruccionAccess().getDeclararParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDeclarar();

                    state._fsp--;

                     after(grammarAccess.getInstruccionAccess().getDeclararParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDearCode.g:523:2: ( ruleReasignar )
                    {
                    // InternalDearCode.g:523:2: ( ruleReasignar )
                    // InternalDearCode.g:524:3: ruleReasignar
                    {
                     before(grammarAccess.getInstruccionAccess().getReasignarParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleReasignar();

                    state._fsp--;

                     after(grammarAccess.getInstruccionAccess().getReasignarParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Alternatives"


    // $ANTLR start "rule__Declarar__ComentarioAlternatives_4_0"
    // InternalDearCode.g:533:1: rule__Declarar__ComentarioAlternatives_4_0 : ( ( RULE_ANYTEXT ) | ( RULE_STRING ) );
    public final void rule__Declarar__ComentarioAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:537:1: ( ( RULE_ANYTEXT ) | ( RULE_STRING ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ANYTEXT) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_STRING) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDearCode.g:538:2: ( RULE_ANYTEXT )
                    {
                    // InternalDearCode.g:538:2: ( RULE_ANYTEXT )
                    // InternalDearCode.g:539:3: RULE_ANYTEXT
                    {
                     before(grammarAccess.getDeclararAccess().getComentarioANYTEXTTerminalRuleCall_4_0_0()); 
                    match(input,RULE_ANYTEXT,FOLLOW_2); 
                     after(grammarAccess.getDeclararAccess().getComentarioANYTEXTTerminalRuleCall_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDearCode.g:544:2: ( RULE_STRING )
                    {
                    // InternalDearCode.g:544:2: ( RULE_STRING )
                    // InternalDearCode.g:545:3: RULE_STRING
                    {
                     before(grammarAccess.getDeclararAccess().getComentarioSTRINGTerminalRuleCall_4_0_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getDeclararAccess().getComentarioSTRINGTerminalRuleCall_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarar__ComentarioAlternatives_4_0"


    // $ANTLR start "rule__Reasignar__ComentarioAlternatives_4_0"
    // InternalDearCode.g:554:1: rule__Reasignar__ComentarioAlternatives_4_0 : ( ( RULE_ANYTEXT ) | ( RULE_STRING ) );
    public final void rule__Reasignar__ComentarioAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:558:1: ( ( RULE_ANYTEXT ) | ( RULE_STRING ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ANYTEXT) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_STRING) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDearCode.g:559:2: ( RULE_ANYTEXT )
                    {
                    // InternalDearCode.g:559:2: ( RULE_ANYTEXT )
                    // InternalDearCode.g:560:3: RULE_ANYTEXT
                    {
                     before(grammarAccess.getReasignarAccess().getComentarioANYTEXTTerminalRuleCall_4_0_0()); 
                    match(input,RULE_ANYTEXT,FOLLOW_2); 
                     after(grammarAccess.getReasignarAccess().getComentarioANYTEXTTerminalRuleCall_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDearCode.g:565:2: ( RULE_STRING )
                    {
                    // InternalDearCode.g:565:2: ( RULE_STRING )
                    // InternalDearCode.g:566:3: RULE_STRING
                    {
                     before(grammarAccess.getReasignarAccess().getComentarioSTRINGTerminalRuleCall_4_0_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getReasignarAccess().getComentarioSTRINGTerminalRuleCall_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reasignar__ComentarioAlternatives_4_0"


    // $ANTLR start "rule__Valor__Alternatives"
    // InternalDearCode.g:575:1: rule__Valor__Alternatives : ( ( ruleMI_ID ) | ( ruleNumeroLiteral ) );
    public final void rule__Valor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:579:1: ( ( ruleMI_ID ) | ( ruleNumeroLiteral ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==43) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=14 && LA7_0<=23)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDearCode.g:580:2: ( ruleMI_ID )
                    {
                    // InternalDearCode.g:580:2: ( ruleMI_ID )
                    // InternalDearCode.g:581:3: ruleMI_ID
                    {
                     before(grammarAccess.getValorAccess().getMI_IDParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMI_ID();

                    state._fsp--;

                     after(grammarAccess.getValorAccess().getMI_IDParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDearCode.g:586:2: ( ruleNumeroLiteral )
                    {
                    // InternalDearCode.g:586:2: ( ruleNumeroLiteral )
                    // InternalDearCode.g:587:3: ruleNumeroLiteral
                    {
                     before(grammarAccess.getValorAccess().getNumeroLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNumeroLiteral();

                    state._fsp--;

                     after(grammarAccess.getValorAccess().getNumeroLiteralParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Valor__Alternatives"


    // $ANTLR start "rule__NumeroLiteral__Alternatives"
    // InternalDearCode.g:596:1: rule__NumeroLiteral__Alternatives : ( ( ruleSimple ) | ( ruleCompuesto ) );
    public final void rule__NumeroLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:600:1: ( ( ruleSimple ) | ( ruleCompuesto ) )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalDearCode.g:601:2: ( ruleSimple )
                    {
                    // InternalDearCode.g:601:2: ( ruleSimple )
                    // InternalDearCode.g:602:3: ruleSimple
                    {
                     before(grammarAccess.getNumeroLiteralAccess().getSimpleParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSimple();

                    state._fsp--;

                     after(grammarAccess.getNumeroLiteralAccess().getSimpleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDearCode.g:607:2: ( ruleCompuesto )
                    {
                    // InternalDearCode.g:607:2: ( ruleCompuesto )
                    // InternalDearCode.g:608:3: ruleCompuesto
                    {
                     before(grammarAccess.getNumeroLiteralAccess().getCompuestoParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCompuesto();

                    state._fsp--;

                     after(grammarAccess.getNumeroLiteralAccess().getCompuestoParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumeroLiteral__Alternatives"


    // $ANTLR start "rule__Simple__ValueAlternatives_0"
    // InternalDearCode.g:617:1: rule__Simple__ValueAlternatives_0 : ( ( 'cero' ) | ( 'uno' ) | ( 'dos' ) | ( 'tres' ) | ( 'cuatro' ) | ( 'cinco' ) | ( 'seis' ) | ( 'siete' ) | ( 'ocho' ) | ( 'nueve' ) );
    public final void rule__Simple__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:621:1: ( ( 'cero' ) | ( 'uno' ) | ( 'dos' ) | ( 'tres' ) | ( 'cuatro' ) | ( 'cinco' ) | ( 'seis' ) | ( 'siete' ) | ( 'ocho' ) | ( 'nueve' ) )
            int alt9=10;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt9=1;
                }
                break;
            case 15:
                {
                alt9=2;
                }
                break;
            case 16:
                {
                alt9=3;
                }
                break;
            case 17:
                {
                alt9=4;
                }
                break;
            case 18:
                {
                alt9=5;
                }
                break;
            case 19:
                {
                alt9=6;
                }
                break;
            case 20:
                {
                alt9=7;
                }
                break;
            case 21:
                {
                alt9=8;
                }
                break;
            case 22:
                {
                alt9=9;
                }
                break;
            case 23:
                {
                alt9=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalDearCode.g:622:2: ( 'cero' )
                    {
                    // InternalDearCode.g:622:2: ( 'cero' )
                    // InternalDearCode.g:623:3: 'cero'
                    {
                     before(grammarAccess.getSimpleAccess().getValueCeroKeyword_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getValueCeroKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDearCode.g:628:2: ( 'uno' )
                    {
                    // InternalDearCode.g:628:2: ( 'uno' )
                    // InternalDearCode.g:629:3: 'uno'
                    {
                     before(grammarAccess.getSimpleAccess().getValueUnoKeyword_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getValueUnoKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDearCode.g:634:2: ( 'dos' )
                    {
                    // InternalDearCode.g:634:2: ( 'dos' )
                    // InternalDearCode.g:635:3: 'dos'
                    {
                     before(grammarAccess.getSimpleAccess().getValueDosKeyword_0_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getValueDosKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDearCode.g:640:2: ( 'tres' )
                    {
                    // InternalDearCode.g:640:2: ( 'tres' )
                    // InternalDearCode.g:641:3: 'tres'
                    {
                     before(grammarAccess.getSimpleAccess().getValueTresKeyword_0_3()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getValueTresKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDearCode.g:646:2: ( 'cuatro' )
                    {
                    // InternalDearCode.g:646:2: ( 'cuatro' )
                    // InternalDearCode.g:647:3: 'cuatro'
                    {
                     before(grammarAccess.getSimpleAccess().getValueCuatroKeyword_0_4()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getValueCuatroKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDearCode.g:652:2: ( 'cinco' )
                    {
                    // InternalDearCode.g:652:2: ( 'cinco' )
                    // InternalDearCode.g:653:3: 'cinco'
                    {
                     before(grammarAccess.getSimpleAccess().getValueCincoKeyword_0_5()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getValueCincoKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDearCode.g:658:2: ( 'seis' )
                    {
                    // InternalDearCode.g:658:2: ( 'seis' )
                    // InternalDearCode.g:659:3: 'seis'
                    {
                     before(grammarAccess.getSimpleAccess().getValueSeisKeyword_0_6()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getValueSeisKeyword_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDearCode.g:664:2: ( 'siete' )
                    {
                    // InternalDearCode.g:664:2: ( 'siete' )
                    // InternalDearCode.g:665:3: 'siete'
                    {
                     before(grammarAccess.getSimpleAccess().getValueSieteKeyword_0_7()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getValueSieteKeyword_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalDearCode.g:670:2: ( 'ocho' )
                    {
                    // InternalDearCode.g:670:2: ( 'ocho' )
                    // InternalDearCode.g:671:3: 'ocho'
                    {
                     before(grammarAccess.getSimpleAccess().getValueOchoKeyword_0_8()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getValueOchoKeyword_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalDearCode.g:676:2: ( 'nueve' )
                    {
                    // InternalDearCode.g:676:2: ( 'nueve' )
                    // InternalDearCode.g:677:3: 'nueve'
                    {
                     before(grammarAccess.getSimpleAccess().getValueNueveKeyword_0_9()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getValueNueveKeyword_0_9()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__ValueAlternatives_0"


    // $ANTLR start "rule__Multiplicador__Alternatives"
    // InternalDearCode.g:686:1: rule__Multiplicador__Alternatives : ( ( ( rule__Multiplicador__Group_0__0 ) ) | ( ( rule__Multiplicador__Group_1__0 ) ) | ( ( rule__Multiplicador__Group_2__0 ) ) );
    public final void rule__Multiplicador__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:690:1: ( ( ( rule__Multiplicador__Group_0__0 ) ) | ( ( rule__Multiplicador__Group_1__0 ) ) | ( ( rule__Multiplicador__Group_2__0 ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt10=1;
                }
                break;
            case 36:
                {
                alt10=2;
                }
                break;
            case 37:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalDearCode.g:691:2: ( ( rule__Multiplicador__Group_0__0 ) )
                    {
                    // InternalDearCode.g:691:2: ( ( rule__Multiplicador__Group_0__0 ) )
                    // InternalDearCode.g:692:3: ( rule__Multiplicador__Group_0__0 )
                    {
                     before(grammarAccess.getMultiplicadorAccess().getGroup_0()); 
                    // InternalDearCode.g:693:3: ( rule__Multiplicador__Group_0__0 )
                    // InternalDearCode.g:693:4: rule__Multiplicador__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Multiplicador__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicadorAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDearCode.g:697:2: ( ( rule__Multiplicador__Group_1__0 ) )
                    {
                    // InternalDearCode.g:697:2: ( ( rule__Multiplicador__Group_1__0 ) )
                    // InternalDearCode.g:698:3: ( rule__Multiplicador__Group_1__0 )
                    {
                     before(grammarAccess.getMultiplicadorAccess().getGroup_1()); 
                    // InternalDearCode.g:699:3: ( rule__Multiplicador__Group_1__0 )
                    // InternalDearCode.g:699:4: rule__Multiplicador__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Multiplicador__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicadorAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDearCode.g:703:2: ( ( rule__Multiplicador__Group_2__0 ) )
                    {
                    // InternalDearCode.g:703:2: ( ( rule__Multiplicador__Group_2__0 ) )
                    // InternalDearCode.g:704:3: ( rule__Multiplicador__Group_2__0 )
                    {
                     before(grammarAccess.getMultiplicadorAccess().getGroup_2()); 
                    // InternalDearCode.g:705:3: ( rule__Multiplicador__Group_2__0 )
                    // InternalDearCode.g:705:4: rule__Multiplicador__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Multiplicador__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicadorAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicador__Alternatives"


    // $ANTLR start "rule__Articulo__Alternatives"
    // InternalDearCode.g:713:1: rule__Articulo__Alternatives : ( ( 'un' ) | ( 'una' ) );
    public final void rule__Articulo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:717:1: ( ( 'un' ) | ( 'una' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            else if ( (LA11_0==25) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalDearCode.g:718:2: ( 'un' )
                    {
                    // InternalDearCode.g:718:2: ( 'un' )
                    // InternalDearCode.g:719:3: 'un'
                    {
                     before(grammarAccess.getArticuloAccess().getUnKeyword_0()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getArticuloAccess().getUnKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDearCode.g:724:2: ( 'una' )
                    {
                    // InternalDearCode.g:724:2: ( 'una' )
                    // InternalDearCode.g:725:3: 'una'
                    {
                     before(grammarAccess.getArticuloAccess().getUnaKeyword_1()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getArticuloAccess().getUnaKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Articulo__Alternatives"


    // $ANTLR start "rule__VerboDeclaracion__Alternatives"
    // InternalDearCode.g:734:1: rule__VerboDeclaracion__Alternatives : ( ( 'Te regalo' ) | ( 'Ofrezco' ) | ( 'Obsequio' ) | ( 'Deposito en tu jard\\u00EDn' ) );
    public final void rule__VerboDeclaracion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:738:1: ( ( 'Te regalo' ) | ( 'Ofrezco' ) | ( 'Obsequio' ) | ( 'Deposito en tu jard\\u00EDn' ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt12=1;
                }
                break;
            case 27:
                {
                alt12=2;
                }
                break;
            case 28:
                {
                alt12=3;
                }
                break;
            case 29:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalDearCode.g:739:2: ( 'Te regalo' )
                    {
                    // InternalDearCode.g:739:2: ( 'Te regalo' )
                    // InternalDearCode.g:740:3: 'Te regalo'
                    {
                     before(grammarAccess.getVerboDeclaracionAccess().getTeRegaloKeyword_0()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getVerboDeclaracionAccess().getTeRegaloKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDearCode.g:745:2: ( 'Ofrezco' )
                    {
                    // InternalDearCode.g:745:2: ( 'Ofrezco' )
                    // InternalDearCode.g:746:3: 'Ofrezco'
                    {
                     before(grammarAccess.getVerboDeclaracionAccess().getOfrezcoKeyword_1()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getVerboDeclaracionAccess().getOfrezcoKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDearCode.g:751:2: ( 'Obsequio' )
                    {
                    // InternalDearCode.g:751:2: ( 'Obsequio' )
                    // InternalDearCode.g:752:3: 'Obsequio'
                    {
                     before(grammarAccess.getVerboDeclaracionAccess().getObsequioKeyword_2()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getVerboDeclaracionAccess().getObsequioKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDearCode.g:757:2: ( 'Deposito en tu jard\\u00EDn' )
                    {
                    // InternalDearCode.g:757:2: ( 'Deposito en tu jard\\u00EDn' )
                    // InternalDearCode.g:758:3: 'Deposito en tu jard\\u00EDn'
                    {
                     before(grammarAccess.getVerboDeclaracionAccess().getDepositoEnTuJardNKeyword_3()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getVerboDeclaracionAccess().getDepositoEnTuJardNKeyword_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerboDeclaracion__Alternatives"


    // $ANTLR start "rule__VerboReasignacion__Alternatives"
    // InternalDearCode.g:767:1: rule__VerboReasignacion__Alternatives : ( ( ( rule__VerboReasignacion__Group_0__0 ) ) | ( ( rule__VerboReasignacion__Group_1__0 ) ) | ( ( rule__VerboReasignacion__Group_2__0 ) ) );
    public final void rule__VerboReasignacion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:771:1: ( ( ( rule__VerboReasignacion__Group_0__0 ) ) | ( ( rule__VerboReasignacion__Group_1__0 ) ) | ( ( rule__VerboReasignacion__Group_2__0 ) ) )
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==39) ) {
                switch ( input.LA(2) ) {
                case 40:
                    {
                    alt13=1;
                    }
                    break;
                case 42:
                    {
                    alt13=3;
                    }
                    break;
                case 41:
                    {
                    alt13=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalDearCode.g:772:2: ( ( rule__VerboReasignacion__Group_0__0 ) )
                    {
                    // InternalDearCode.g:772:2: ( ( rule__VerboReasignacion__Group_0__0 ) )
                    // InternalDearCode.g:773:3: ( rule__VerboReasignacion__Group_0__0 )
                    {
                     before(grammarAccess.getVerboReasignacionAccess().getGroup_0()); 
                    // InternalDearCode.g:774:3: ( rule__VerboReasignacion__Group_0__0 )
                    // InternalDearCode.g:774:4: rule__VerboReasignacion__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VerboReasignacion__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVerboReasignacionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDearCode.g:778:2: ( ( rule__VerboReasignacion__Group_1__0 ) )
                    {
                    // InternalDearCode.g:778:2: ( ( rule__VerboReasignacion__Group_1__0 ) )
                    // InternalDearCode.g:779:3: ( rule__VerboReasignacion__Group_1__0 )
                    {
                     before(grammarAccess.getVerboReasignacionAccess().getGroup_1()); 
                    // InternalDearCode.g:780:3: ( rule__VerboReasignacion__Group_1__0 )
                    // InternalDearCode.g:780:4: rule__VerboReasignacion__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VerboReasignacion__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVerboReasignacionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDearCode.g:784:2: ( ( rule__VerboReasignacion__Group_2__0 ) )
                    {
                    // InternalDearCode.g:784:2: ( ( rule__VerboReasignacion__Group_2__0 ) )
                    // InternalDearCode.g:785:3: ( rule__VerboReasignacion__Group_2__0 )
                    {
                     before(grammarAccess.getVerboReasignacionAccess().getGroup_2()); 
                    // InternalDearCode.g:786:3: ( rule__VerboReasignacion__Group_2__0 )
                    // InternalDearCode.g:786:4: rule__VerboReasignacion__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VerboReasignacion__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVerboReasignacionAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerboReasignacion__Alternatives"


    // $ANTLR start "rule__Carta__Group__0"
    // InternalDearCode.g:794:1: rule__Carta__Group__0 : rule__Carta__Group__0__Impl rule__Carta__Group__1 ;
    public final void rule__Carta__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:798:1: ( rule__Carta__Group__0__Impl rule__Carta__Group__1 )
            // InternalDearCode.g:799:2: rule__Carta__Group__0__Impl rule__Carta__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Carta__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Carta__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Carta__Group__0"


    // $ANTLR start "rule__Carta__Group__0__Impl"
    // InternalDearCode.g:806:1: rule__Carta__Group__0__Impl : ( ( rule__Carta__SaludoAssignment_0 ) ) ;
    public final void rule__Carta__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:810:1: ( ( ( rule__Carta__SaludoAssignment_0 ) ) )
            // InternalDearCode.g:811:1: ( ( rule__Carta__SaludoAssignment_0 ) )
            {
            // InternalDearCode.g:811:1: ( ( rule__Carta__SaludoAssignment_0 ) )
            // InternalDearCode.g:812:2: ( rule__Carta__SaludoAssignment_0 )
            {
             before(grammarAccess.getCartaAccess().getSaludoAssignment_0()); 
            // InternalDearCode.g:813:2: ( rule__Carta__SaludoAssignment_0 )
            // InternalDearCode.g:813:3: rule__Carta__SaludoAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Carta__SaludoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCartaAccess().getSaludoAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Carta__Group__0__Impl"


    // $ANTLR start "rule__Carta__Group__1"
    // InternalDearCode.g:821:1: rule__Carta__Group__1 : rule__Carta__Group__1__Impl rule__Carta__Group__2 ;
    public final void rule__Carta__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:825:1: ( rule__Carta__Group__1__Impl rule__Carta__Group__2 )
            // InternalDearCode.g:826:2: rule__Carta__Group__1__Impl rule__Carta__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Carta__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Carta__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Carta__Group__1"


    // $ANTLR start "rule__Carta__Group__1__Impl"
    // InternalDearCode.g:833:1: rule__Carta__Group__1__Impl : ( ( rule__Carta__CuerpoAssignment_1 ) ) ;
    public final void rule__Carta__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:837:1: ( ( ( rule__Carta__CuerpoAssignment_1 ) ) )
            // InternalDearCode.g:838:1: ( ( rule__Carta__CuerpoAssignment_1 ) )
            {
            // InternalDearCode.g:838:1: ( ( rule__Carta__CuerpoAssignment_1 ) )
            // InternalDearCode.g:839:2: ( rule__Carta__CuerpoAssignment_1 )
            {
             before(grammarAccess.getCartaAccess().getCuerpoAssignment_1()); 
            // InternalDearCode.g:840:2: ( rule__Carta__CuerpoAssignment_1 )
            // InternalDearCode.g:840:3: rule__Carta__CuerpoAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Carta__CuerpoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCartaAccess().getCuerpoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Carta__Group__1__Impl"


    // $ANTLR start "rule__Carta__Group__2"
    // InternalDearCode.g:848:1: rule__Carta__Group__2 : rule__Carta__Group__2__Impl ;
    public final void rule__Carta__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:852:1: ( rule__Carta__Group__2__Impl )
            // InternalDearCode.g:853:2: rule__Carta__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Carta__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Carta__Group__2"


    // $ANTLR start "rule__Carta__Group__2__Impl"
    // InternalDearCode.g:859:1: rule__Carta__Group__2__Impl : ( ( rule__Carta__DespedidaAssignment_2 ) ) ;
    public final void rule__Carta__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:863:1: ( ( ( rule__Carta__DespedidaAssignment_2 ) ) )
            // InternalDearCode.g:864:1: ( ( rule__Carta__DespedidaAssignment_2 ) )
            {
            // InternalDearCode.g:864:1: ( ( rule__Carta__DespedidaAssignment_2 ) )
            // InternalDearCode.g:865:2: ( rule__Carta__DespedidaAssignment_2 )
            {
             before(grammarAccess.getCartaAccess().getDespedidaAssignment_2()); 
            // InternalDearCode.g:866:2: ( rule__Carta__DespedidaAssignment_2 )
            // InternalDearCode.g:866:3: rule__Carta__DespedidaAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Carta__DespedidaAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCartaAccess().getDespedidaAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Carta__Group__2__Impl"


    // $ANTLR start "rule__Saludo__Group__0"
    // InternalDearCode.g:875:1: rule__Saludo__Group__0 : rule__Saludo__Group__0__Impl rule__Saludo__Group__1 ;
    public final void rule__Saludo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:879:1: ( rule__Saludo__Group__0__Impl rule__Saludo__Group__1 )
            // InternalDearCode.g:880:2: rule__Saludo__Group__0__Impl rule__Saludo__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Saludo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Saludo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saludo__Group__0"


    // $ANTLR start "rule__Saludo__Group__0__Impl"
    // InternalDearCode.g:887:1: rule__Saludo__Group__0__Impl : ( ( rule__Saludo__Alternatives_0 ) ) ;
    public final void rule__Saludo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:891:1: ( ( ( rule__Saludo__Alternatives_0 ) ) )
            // InternalDearCode.g:892:1: ( ( rule__Saludo__Alternatives_0 ) )
            {
            // InternalDearCode.g:892:1: ( ( rule__Saludo__Alternatives_0 ) )
            // InternalDearCode.g:893:2: ( rule__Saludo__Alternatives_0 )
            {
             before(grammarAccess.getSaludoAccess().getAlternatives_0()); 
            // InternalDearCode.g:894:2: ( rule__Saludo__Alternatives_0 )
            // InternalDearCode.g:894:3: rule__Saludo__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Saludo__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getSaludoAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saludo__Group__0__Impl"


    // $ANTLR start "rule__Saludo__Group__1"
    // InternalDearCode.g:902:1: rule__Saludo__Group__1 : rule__Saludo__Group__1__Impl ;
    public final void rule__Saludo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:906:1: ( rule__Saludo__Group__1__Impl )
            // InternalDearCode.g:907:2: rule__Saludo__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Saludo__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saludo__Group__1"


    // $ANTLR start "rule__Saludo__Group__1__Impl"
    // InternalDearCode.g:913:1: rule__Saludo__Group__1__Impl : ( ( rule__Saludo__NameAssignment_1 ) ) ;
    public final void rule__Saludo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:917:1: ( ( ( rule__Saludo__NameAssignment_1 ) ) )
            // InternalDearCode.g:918:1: ( ( rule__Saludo__NameAssignment_1 ) )
            {
            // InternalDearCode.g:918:1: ( ( rule__Saludo__NameAssignment_1 ) )
            // InternalDearCode.g:919:2: ( rule__Saludo__NameAssignment_1 )
            {
             before(grammarAccess.getSaludoAccess().getNameAssignment_1()); 
            // InternalDearCode.g:920:2: ( rule__Saludo__NameAssignment_1 )
            // InternalDearCode.g:920:3: rule__Saludo__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Saludo__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSaludoAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saludo__Group__1__Impl"


    // $ANTLR start "rule__Despedida__Group__0"
    // InternalDearCode.g:929:1: rule__Despedida__Group__0 : rule__Despedida__Group__0__Impl rule__Despedida__Group__1 ;
    public final void rule__Despedida__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:933:1: ( rule__Despedida__Group__0__Impl rule__Despedida__Group__1 )
            // InternalDearCode.g:934:2: rule__Despedida__Group__0__Impl rule__Despedida__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Despedida__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Despedida__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Despedida__Group__0"


    // $ANTLR start "rule__Despedida__Group__0__Impl"
    // InternalDearCode.g:941:1: rule__Despedida__Group__0__Impl : ( 'Con cari\\u00F1o, Tu programador' ) ;
    public final void rule__Despedida__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:945:1: ( ( 'Con cari\\u00F1o, Tu programador' ) )
            // InternalDearCode.g:946:1: ( 'Con cari\\u00F1o, Tu programador' )
            {
            // InternalDearCode.g:946:1: ( 'Con cari\\u00F1o, Tu programador' )
            // InternalDearCode.g:947:2: 'Con cari\\u00F1o, Tu programador'
            {
             before(grammarAccess.getDespedidaAccess().getConCariOTuProgramadorKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDespedidaAccess().getConCariOTuProgramadorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Despedida__Group__0__Impl"


    // $ANTLR start "rule__Despedida__Group__1"
    // InternalDearCode.g:956:1: rule__Despedida__Group__1 : rule__Despedida__Group__1__Impl ;
    public final void rule__Despedida__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:960:1: ( rule__Despedida__Group__1__Impl )
            // InternalDearCode.g:961:2: rule__Despedida__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Despedida__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Despedida__Group__1"


    // $ANTLR start "rule__Despedida__Group__1__Impl"
    // InternalDearCode.g:967:1: rule__Despedida__Group__1__Impl : ( ( rule__Despedida__NameAssignment_1 ) ) ;
    public final void rule__Despedida__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:971:1: ( ( ( rule__Despedida__NameAssignment_1 ) ) )
            // InternalDearCode.g:972:1: ( ( rule__Despedida__NameAssignment_1 ) )
            {
            // InternalDearCode.g:972:1: ( ( rule__Despedida__NameAssignment_1 ) )
            // InternalDearCode.g:973:2: ( rule__Despedida__NameAssignment_1 )
            {
             before(grammarAccess.getDespedidaAccess().getNameAssignment_1()); 
            // InternalDearCode.g:974:2: ( rule__Despedida__NameAssignment_1 )
            // InternalDearCode.g:974:3: rule__Despedida__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Despedida__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDespedidaAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Despedida__Group__1__Impl"


    // $ANTLR start "rule__Declarar__Group__0"
    // InternalDearCode.g:983:1: rule__Declarar__Group__0 : rule__Declarar__Group__0__Impl rule__Declarar__Group__1 ;
    public final void rule__Declarar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:987:1: ( rule__Declarar__Group__0__Impl rule__Declarar__Group__1 )
            // InternalDearCode.g:988:2: rule__Declarar__Group__0__Impl rule__Declarar__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Declarar__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declarar__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarar__Group__0"


    // $ANTLR start "rule__Declarar__Group__0__Impl"
    // InternalDearCode.g:995:1: rule__Declarar__Group__0__Impl : ( ( rule__Declarar__VerboDeclAssignment_0 ) ) ;
    public final void rule__Declarar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:999:1: ( ( ( rule__Declarar__VerboDeclAssignment_0 ) ) )
            // InternalDearCode.g:1000:1: ( ( rule__Declarar__VerboDeclAssignment_0 ) )
            {
            // InternalDearCode.g:1000:1: ( ( rule__Declarar__VerboDeclAssignment_0 ) )
            // InternalDearCode.g:1001:2: ( rule__Declarar__VerboDeclAssignment_0 )
            {
             before(grammarAccess.getDeclararAccess().getVerboDeclAssignment_0()); 
            // InternalDearCode.g:1002:2: ( rule__Declarar__VerboDeclAssignment_0 )
            // InternalDearCode.g:1002:3: rule__Declarar__VerboDeclAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Declarar__VerboDeclAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDeclararAccess().getVerboDeclAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarar__Group__0__Impl"


    // $ANTLR start "rule__Declarar__Group__1"
    // InternalDearCode.g:1010:1: rule__Declarar__Group__1 : rule__Declarar__Group__1__Impl rule__Declarar__Group__2 ;
    public final void rule__Declarar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1014:1: ( rule__Declarar__Group__1__Impl rule__Declarar__Group__2 )
            // InternalDearCode.g:1015:2: rule__Declarar__Group__1__Impl rule__Declarar__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Declarar__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declarar__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarar__Group__1"


    // $ANTLR start "rule__Declarar__Group__1__Impl"
    // InternalDearCode.g:1022:1: rule__Declarar__Group__1__Impl : ( ( rule__Declarar__ArticuloAssignment_1 ) ) ;
    public final void rule__Declarar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1026:1: ( ( ( rule__Declarar__ArticuloAssignment_1 ) ) )
            // InternalDearCode.g:1027:1: ( ( rule__Declarar__ArticuloAssignment_1 ) )
            {
            // InternalDearCode.g:1027:1: ( ( rule__Declarar__ArticuloAssignment_1 ) )
            // InternalDearCode.g:1028:2: ( rule__Declarar__ArticuloAssignment_1 )
            {
             before(grammarAccess.getDeclararAccess().getArticuloAssignment_1()); 
            // InternalDearCode.g:1029:2: ( rule__Declarar__ArticuloAssignment_1 )
            // InternalDearCode.g:1029:3: rule__Declarar__ArticuloAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Declarar__ArticuloAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclararAccess().getArticuloAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarar__Group__1__Impl"


    // $ANTLR start "rule__Declarar__Group__2"
    // InternalDearCode.g:1037:1: rule__Declarar__Group__2 : rule__Declarar__Group__2__Impl rule__Declarar__Group__3 ;
    public final void rule__Declarar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1041:1: ( rule__Declarar__Group__2__Impl rule__Declarar__Group__3 )
            // InternalDearCode.g:1042:2: rule__Declarar__Group__2__Impl rule__Declarar__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Declarar__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declarar__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarar__Group__2"


    // $ANTLR start "rule__Declarar__Group__2__Impl"
    // InternalDearCode.g:1049:1: rule__Declarar__Group__2__Impl : ( ( rule__Declarar__ValorAssignment_2 ) ) ;
    public final void rule__Declarar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1053:1: ( ( ( rule__Declarar__ValorAssignment_2 ) ) )
            // InternalDearCode.g:1054:1: ( ( rule__Declarar__ValorAssignment_2 ) )
            {
            // InternalDearCode.g:1054:1: ( ( rule__Declarar__ValorAssignment_2 ) )
            // InternalDearCode.g:1055:2: ( rule__Declarar__ValorAssignment_2 )
            {
             before(grammarAccess.getDeclararAccess().getValorAssignment_2()); 
            // InternalDearCode.g:1056:2: ( rule__Declarar__ValorAssignment_2 )
            // InternalDearCode.g:1056:3: rule__Declarar__ValorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Declarar__ValorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDeclararAccess().getValorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarar__Group__2__Impl"


    // $ANTLR start "rule__Declarar__Group__3"
    // InternalDearCode.g:1064:1: rule__Declarar__Group__3 : rule__Declarar__Group__3__Impl rule__Declarar__Group__4 ;
    public final void rule__Declarar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1068:1: ( rule__Declarar__Group__3__Impl rule__Declarar__Group__4 )
            // InternalDearCode.g:1069:2: rule__Declarar__Group__3__Impl rule__Declarar__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Declarar__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declarar__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarar__Group__3"


    // $ANTLR start "rule__Declarar__Group__3__Impl"
    // InternalDearCode.g:1076:1: rule__Declarar__Group__3__Impl : ( ( rule__Declarar__SustantivoAssignment_3 ) ) ;
    public final void rule__Declarar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1080:1: ( ( ( rule__Declarar__SustantivoAssignment_3 ) ) )
            // InternalDearCode.g:1081:1: ( ( rule__Declarar__SustantivoAssignment_3 ) )
            {
            // InternalDearCode.g:1081:1: ( ( rule__Declarar__SustantivoAssignment_3 ) )
            // InternalDearCode.g:1082:2: ( rule__Declarar__SustantivoAssignment_3 )
            {
             before(grammarAccess.getDeclararAccess().getSustantivoAssignment_3()); 
            // InternalDearCode.g:1083:2: ( rule__Declarar__SustantivoAssignment_3 )
            // InternalDearCode.g:1083:3: rule__Declarar__SustantivoAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Declarar__SustantivoAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDeclararAccess().getSustantivoAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarar__Group__3__Impl"


    // $ANTLR start "rule__Declarar__Group__4"
    // InternalDearCode.g:1091:1: rule__Declarar__Group__4 : rule__Declarar__Group__4__Impl rule__Declarar__Group__5 ;
    public final void rule__Declarar__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1095:1: ( rule__Declarar__Group__4__Impl rule__Declarar__Group__5 )
            // InternalDearCode.g:1096:2: rule__Declarar__Group__4__Impl rule__Declarar__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Declarar__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declarar__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarar__Group__4"


    // $ANTLR start "rule__Declarar__Group__4__Impl"
    // InternalDearCode.g:1103:1: rule__Declarar__Group__4__Impl : ( ( rule__Declarar__ComentarioAssignment_4 )? ) ;
    public final void rule__Declarar__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1107:1: ( ( ( rule__Declarar__ComentarioAssignment_4 )? ) )
            // InternalDearCode.g:1108:1: ( ( rule__Declarar__ComentarioAssignment_4 )? )
            {
            // InternalDearCode.g:1108:1: ( ( rule__Declarar__ComentarioAssignment_4 )? )
            // InternalDearCode.g:1109:2: ( rule__Declarar__ComentarioAssignment_4 )?
            {
             before(grammarAccess.getDeclararAccess().getComentarioAssignment_4()); 
            // InternalDearCode.g:1110:2: ( rule__Declarar__ComentarioAssignment_4 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_ANYTEXT && LA14_0<=RULE_STRING)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDearCode.g:1110:3: rule__Declarar__ComentarioAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Declarar__ComentarioAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeclararAccess().getComentarioAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarar__Group__4__Impl"


    // $ANTLR start "rule__Declarar__Group__5"
    // InternalDearCode.g:1118:1: rule__Declarar__Group__5 : rule__Declarar__Group__5__Impl ;
    public final void rule__Declarar__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1122:1: ( rule__Declarar__Group__5__Impl )
            // InternalDearCode.g:1123:2: rule__Declarar__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Declarar__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarar__Group__5"


    // $ANTLR start "rule__Declarar__Group__5__Impl"
    // InternalDearCode.g:1129:1: rule__Declarar__Group__5__Impl : ( '.' ) ;
    public final void rule__Declarar__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1133:1: ( ( '.' ) )
            // InternalDearCode.g:1134:1: ( '.' )
            {
            // InternalDearCode.g:1134:1: ( '.' )
            // InternalDearCode.g:1135:2: '.'
            {
             before(grammarAccess.getDeclararAccess().getFullStopKeyword_5()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDeclararAccess().getFullStopKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarar__Group__5__Impl"


    // $ANTLR start "rule__Reasignar__Group__0"
    // InternalDearCode.g:1145:1: rule__Reasignar__Group__0 : rule__Reasignar__Group__0__Impl rule__Reasignar__Group__1 ;
    public final void rule__Reasignar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1149:1: ( rule__Reasignar__Group__0__Impl rule__Reasignar__Group__1 )
            // InternalDearCode.g:1150:2: rule__Reasignar__Group__0__Impl rule__Reasignar__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Reasignar__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reasignar__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reasignar__Group__0"


    // $ANTLR start "rule__Reasignar__Group__0__Impl"
    // InternalDearCode.g:1157:1: rule__Reasignar__Group__0__Impl : ( ( rule__Reasignar__VerboReasAssignment_0 ) ) ;
    public final void rule__Reasignar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1161:1: ( ( ( rule__Reasignar__VerboReasAssignment_0 ) ) )
            // InternalDearCode.g:1162:1: ( ( rule__Reasignar__VerboReasAssignment_0 ) )
            {
            // InternalDearCode.g:1162:1: ( ( rule__Reasignar__VerboReasAssignment_0 ) )
            // InternalDearCode.g:1163:2: ( rule__Reasignar__VerboReasAssignment_0 )
            {
             before(grammarAccess.getReasignarAccess().getVerboReasAssignment_0()); 
            // InternalDearCode.g:1164:2: ( rule__Reasignar__VerboReasAssignment_0 )
            // InternalDearCode.g:1164:3: rule__Reasignar__VerboReasAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Reasignar__VerboReasAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getReasignarAccess().getVerboReasAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reasignar__Group__0__Impl"


    // $ANTLR start "rule__Reasignar__Group__1"
    // InternalDearCode.g:1172:1: rule__Reasignar__Group__1 : rule__Reasignar__Group__1__Impl rule__Reasignar__Group__2 ;
    public final void rule__Reasignar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1176:1: ( rule__Reasignar__Group__1__Impl rule__Reasignar__Group__2 )
            // InternalDearCode.g:1177:2: rule__Reasignar__Group__1__Impl rule__Reasignar__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Reasignar__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reasignar__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reasignar__Group__1"


    // $ANTLR start "rule__Reasignar__Group__1__Impl"
    // InternalDearCode.g:1184:1: rule__Reasignar__Group__1__Impl : ( ( rule__Reasignar__SustantivoAssignment_1 ) ) ;
    public final void rule__Reasignar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1188:1: ( ( ( rule__Reasignar__SustantivoAssignment_1 ) ) )
            // InternalDearCode.g:1189:1: ( ( rule__Reasignar__SustantivoAssignment_1 ) )
            {
            // InternalDearCode.g:1189:1: ( ( rule__Reasignar__SustantivoAssignment_1 ) )
            // InternalDearCode.g:1190:2: ( rule__Reasignar__SustantivoAssignment_1 )
            {
             before(grammarAccess.getReasignarAccess().getSustantivoAssignment_1()); 
            // InternalDearCode.g:1191:2: ( rule__Reasignar__SustantivoAssignment_1 )
            // InternalDearCode.g:1191:3: rule__Reasignar__SustantivoAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Reasignar__SustantivoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReasignarAccess().getSustantivoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reasignar__Group__1__Impl"


    // $ANTLR start "rule__Reasignar__Group__2"
    // InternalDearCode.g:1199:1: rule__Reasignar__Group__2 : rule__Reasignar__Group__2__Impl rule__Reasignar__Group__3 ;
    public final void rule__Reasignar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1203:1: ( rule__Reasignar__Group__2__Impl rule__Reasignar__Group__3 )
            // InternalDearCode.g:1204:2: rule__Reasignar__Group__2__Impl rule__Reasignar__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Reasignar__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reasignar__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reasignar__Group__2"


    // $ANTLR start "rule__Reasignar__Group__2__Impl"
    // InternalDearCode.g:1211:1: rule__Reasignar__Group__2__Impl : ( 'con' ) ;
    public final void rule__Reasignar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1215:1: ( ( 'con' ) )
            // InternalDearCode.g:1216:1: ( 'con' )
            {
            // InternalDearCode.g:1216:1: ( 'con' )
            // InternalDearCode.g:1217:2: 'con'
            {
             before(grammarAccess.getReasignarAccess().getConKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getReasignarAccess().getConKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reasignar__Group__2__Impl"


    // $ANTLR start "rule__Reasignar__Group__3"
    // InternalDearCode.g:1226:1: rule__Reasignar__Group__3 : rule__Reasignar__Group__3__Impl rule__Reasignar__Group__4 ;
    public final void rule__Reasignar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1230:1: ( rule__Reasignar__Group__3__Impl rule__Reasignar__Group__4 )
            // InternalDearCode.g:1231:2: rule__Reasignar__Group__3__Impl rule__Reasignar__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Reasignar__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reasignar__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reasignar__Group__3"


    // $ANTLR start "rule__Reasignar__Group__3__Impl"
    // InternalDearCode.g:1238:1: rule__Reasignar__Group__3__Impl : ( ( rule__Reasignar__ValorAssignment_3 ) ) ;
    public final void rule__Reasignar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1242:1: ( ( ( rule__Reasignar__ValorAssignment_3 ) ) )
            // InternalDearCode.g:1243:1: ( ( rule__Reasignar__ValorAssignment_3 ) )
            {
            // InternalDearCode.g:1243:1: ( ( rule__Reasignar__ValorAssignment_3 ) )
            // InternalDearCode.g:1244:2: ( rule__Reasignar__ValorAssignment_3 )
            {
             before(grammarAccess.getReasignarAccess().getValorAssignment_3()); 
            // InternalDearCode.g:1245:2: ( rule__Reasignar__ValorAssignment_3 )
            // InternalDearCode.g:1245:3: rule__Reasignar__ValorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Reasignar__ValorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReasignarAccess().getValorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reasignar__Group__3__Impl"


    // $ANTLR start "rule__Reasignar__Group__4"
    // InternalDearCode.g:1253:1: rule__Reasignar__Group__4 : rule__Reasignar__Group__4__Impl rule__Reasignar__Group__5 ;
    public final void rule__Reasignar__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1257:1: ( rule__Reasignar__Group__4__Impl rule__Reasignar__Group__5 )
            // InternalDearCode.g:1258:2: rule__Reasignar__Group__4__Impl rule__Reasignar__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Reasignar__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reasignar__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reasignar__Group__4"


    // $ANTLR start "rule__Reasignar__Group__4__Impl"
    // InternalDearCode.g:1265:1: rule__Reasignar__Group__4__Impl : ( ( rule__Reasignar__ComentarioAssignment_4 )? ) ;
    public final void rule__Reasignar__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1269:1: ( ( ( rule__Reasignar__ComentarioAssignment_4 )? ) )
            // InternalDearCode.g:1270:1: ( ( rule__Reasignar__ComentarioAssignment_4 )? )
            {
            // InternalDearCode.g:1270:1: ( ( rule__Reasignar__ComentarioAssignment_4 )? )
            // InternalDearCode.g:1271:2: ( rule__Reasignar__ComentarioAssignment_4 )?
            {
             before(grammarAccess.getReasignarAccess().getComentarioAssignment_4()); 
            // InternalDearCode.g:1272:2: ( rule__Reasignar__ComentarioAssignment_4 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_ANYTEXT && LA15_0<=RULE_STRING)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDearCode.g:1272:3: rule__Reasignar__ComentarioAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reasignar__ComentarioAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReasignarAccess().getComentarioAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reasignar__Group__4__Impl"


    // $ANTLR start "rule__Reasignar__Group__5"
    // InternalDearCode.g:1280:1: rule__Reasignar__Group__5 : rule__Reasignar__Group__5__Impl ;
    public final void rule__Reasignar__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1284:1: ( rule__Reasignar__Group__5__Impl )
            // InternalDearCode.g:1285:2: rule__Reasignar__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reasignar__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reasignar__Group__5"


    // $ANTLR start "rule__Reasignar__Group__5__Impl"
    // InternalDearCode.g:1291:1: rule__Reasignar__Group__5__Impl : ( '.' ) ;
    public final void rule__Reasignar__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1295:1: ( ( '.' ) )
            // InternalDearCode.g:1296:1: ( '.' )
            {
            // InternalDearCode.g:1296:1: ( '.' )
            // InternalDearCode.g:1297:2: '.'
            {
             before(grammarAccess.getReasignarAccess().getFullStopKeyword_5()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getReasignarAccess().getFullStopKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reasignar__Group__5__Impl"


    // $ANTLR start "rule__Compuesto__Group__0"
    // InternalDearCode.g:1307:1: rule__Compuesto__Group__0 : rule__Compuesto__Group__0__Impl rule__Compuesto__Group__1 ;
    public final void rule__Compuesto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1311:1: ( rule__Compuesto__Group__0__Impl rule__Compuesto__Group__1 )
            // InternalDearCode.g:1312:2: rule__Compuesto__Group__0__Impl rule__Compuesto__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Compuesto__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compuesto__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compuesto__Group__0"


    // $ANTLR start "rule__Compuesto__Group__0__Impl"
    // InternalDearCode.g:1319:1: rule__Compuesto__Group__0__Impl : ( ( rule__Compuesto__CantidadAssignment_0 ) ) ;
    public final void rule__Compuesto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1323:1: ( ( ( rule__Compuesto__CantidadAssignment_0 ) ) )
            // InternalDearCode.g:1324:1: ( ( rule__Compuesto__CantidadAssignment_0 ) )
            {
            // InternalDearCode.g:1324:1: ( ( rule__Compuesto__CantidadAssignment_0 ) )
            // InternalDearCode.g:1325:2: ( rule__Compuesto__CantidadAssignment_0 )
            {
             before(grammarAccess.getCompuestoAccess().getCantidadAssignment_0()); 
            // InternalDearCode.g:1326:2: ( rule__Compuesto__CantidadAssignment_0 )
            // InternalDearCode.g:1326:3: rule__Compuesto__CantidadAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Compuesto__CantidadAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCompuestoAccess().getCantidadAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compuesto__Group__0__Impl"


    // $ANTLR start "rule__Compuesto__Group__1"
    // InternalDearCode.g:1334:1: rule__Compuesto__Group__1 : rule__Compuesto__Group__1__Impl rule__Compuesto__Group__2 ;
    public final void rule__Compuesto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1338:1: ( rule__Compuesto__Group__1__Impl rule__Compuesto__Group__2 )
            // InternalDearCode.g:1339:2: rule__Compuesto__Group__1__Impl rule__Compuesto__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Compuesto__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compuesto__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compuesto__Group__1"


    // $ANTLR start "rule__Compuesto__Group__1__Impl"
    // InternalDearCode.g:1346:1: rule__Compuesto__Group__1__Impl : ( ( rule__Compuesto__MultiplicadorAssignment_1 ) ) ;
    public final void rule__Compuesto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1350:1: ( ( ( rule__Compuesto__MultiplicadorAssignment_1 ) ) )
            // InternalDearCode.g:1351:1: ( ( rule__Compuesto__MultiplicadorAssignment_1 ) )
            {
            // InternalDearCode.g:1351:1: ( ( rule__Compuesto__MultiplicadorAssignment_1 ) )
            // InternalDearCode.g:1352:2: ( rule__Compuesto__MultiplicadorAssignment_1 )
            {
             before(grammarAccess.getCompuestoAccess().getMultiplicadorAssignment_1()); 
            // InternalDearCode.g:1353:2: ( rule__Compuesto__MultiplicadorAssignment_1 )
            // InternalDearCode.g:1353:3: rule__Compuesto__MultiplicadorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Compuesto__MultiplicadorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompuestoAccess().getMultiplicadorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compuesto__Group__1__Impl"


    // $ANTLR start "rule__Compuesto__Group__2"
    // InternalDearCode.g:1361:1: rule__Compuesto__Group__2 : rule__Compuesto__Group__2__Impl ;
    public final void rule__Compuesto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1365:1: ( rule__Compuesto__Group__2__Impl )
            // InternalDearCode.g:1366:2: rule__Compuesto__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Compuesto__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compuesto__Group__2"


    // $ANTLR start "rule__Compuesto__Group__2__Impl"
    // InternalDearCode.g:1372:1: rule__Compuesto__Group__2__Impl : ( ( rule__Compuesto__Group_2__0 )? ) ;
    public final void rule__Compuesto__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1376:1: ( ( ( rule__Compuesto__Group_2__0 )? ) )
            // InternalDearCode.g:1377:1: ( ( rule__Compuesto__Group_2__0 )? )
            {
            // InternalDearCode.g:1377:1: ( ( rule__Compuesto__Group_2__0 )? )
            // InternalDearCode.g:1378:2: ( rule__Compuesto__Group_2__0 )?
            {
             before(grammarAccess.getCompuestoAccess().getGroup_2()); 
            // InternalDearCode.g:1379:2: ( rule__Compuesto__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDearCode.g:1379:3: rule__Compuesto__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Compuesto__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompuestoAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compuesto__Group__2__Impl"


    // $ANTLR start "rule__Compuesto__Group_2__0"
    // InternalDearCode.g:1388:1: rule__Compuesto__Group_2__0 : rule__Compuesto__Group_2__0__Impl rule__Compuesto__Group_2__1 ;
    public final void rule__Compuesto__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1392:1: ( rule__Compuesto__Group_2__0__Impl rule__Compuesto__Group_2__1 )
            // InternalDearCode.g:1393:2: rule__Compuesto__Group_2__0__Impl rule__Compuesto__Group_2__1
            {
            pushFollow(FOLLOW_15);
            rule__Compuesto__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compuesto__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compuesto__Group_2__0"


    // $ANTLR start "rule__Compuesto__Group_2__0__Impl"
    // InternalDearCode.g:1400:1: rule__Compuesto__Group_2__0__Impl : ( 'y' ) ;
    public final void rule__Compuesto__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1404:1: ( ( 'y' ) )
            // InternalDearCode.g:1405:1: ( 'y' )
            {
            // InternalDearCode.g:1405:1: ( 'y' )
            // InternalDearCode.g:1406:2: 'y'
            {
             before(grammarAccess.getCompuestoAccess().getYKeyword_2_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCompuestoAccess().getYKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compuesto__Group_2__0__Impl"


    // $ANTLR start "rule__Compuesto__Group_2__1"
    // InternalDearCode.g:1415:1: rule__Compuesto__Group_2__1 : rule__Compuesto__Group_2__1__Impl ;
    public final void rule__Compuesto__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1419:1: ( rule__Compuesto__Group_2__1__Impl )
            // InternalDearCode.g:1420:2: rule__Compuesto__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Compuesto__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compuesto__Group_2__1"


    // $ANTLR start "rule__Compuesto__Group_2__1__Impl"
    // InternalDearCode.g:1426:1: rule__Compuesto__Group_2__1__Impl : ( ( rule__Compuesto__RestoAssignment_2_1 ) ) ;
    public final void rule__Compuesto__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1430:1: ( ( ( rule__Compuesto__RestoAssignment_2_1 ) ) )
            // InternalDearCode.g:1431:1: ( ( rule__Compuesto__RestoAssignment_2_1 ) )
            {
            // InternalDearCode.g:1431:1: ( ( rule__Compuesto__RestoAssignment_2_1 ) )
            // InternalDearCode.g:1432:2: ( rule__Compuesto__RestoAssignment_2_1 )
            {
             before(grammarAccess.getCompuestoAccess().getRestoAssignment_2_1()); 
            // InternalDearCode.g:1433:2: ( rule__Compuesto__RestoAssignment_2_1 )
            // InternalDearCode.g:1433:3: rule__Compuesto__RestoAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Compuesto__RestoAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCompuestoAccess().getRestoAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compuesto__Group_2__1__Impl"


    // $ANTLR start "rule__Multiplicador__Group_0__0"
    // InternalDearCode.g:1442:1: rule__Multiplicador__Group_0__0 : rule__Multiplicador__Group_0__0__Impl rule__Multiplicador__Group_0__1 ;
    public final void rule__Multiplicador__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1446:1: ( rule__Multiplicador__Group_0__0__Impl rule__Multiplicador__Group_0__1 )
            // InternalDearCode.g:1447:2: rule__Multiplicador__Group_0__0__Impl rule__Multiplicador__Group_0__1
            {
            pushFollow(FOLLOW_16);
            rule__Multiplicador__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplicador__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicador__Group_0__0"


    // $ANTLR start "rule__Multiplicador__Group_0__0__Impl"
    // InternalDearCode.g:1454:1: rule__Multiplicador__Group_0__0__Impl : ( 'decena' ) ;
    public final void rule__Multiplicador__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1458:1: ( ( 'decena' ) )
            // InternalDearCode.g:1459:1: ( 'decena' )
            {
            // InternalDearCode.g:1459:1: ( 'decena' )
            // InternalDearCode.g:1460:2: 'decena'
            {
             before(grammarAccess.getMultiplicadorAccess().getDecenaKeyword_0_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMultiplicadorAccess().getDecenaKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicador__Group_0__0__Impl"


    // $ANTLR start "rule__Multiplicador__Group_0__1"
    // InternalDearCode.g:1469:1: rule__Multiplicador__Group_0__1 : rule__Multiplicador__Group_0__1__Impl ;
    public final void rule__Multiplicador__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1473:1: ( rule__Multiplicador__Group_0__1__Impl )
            // InternalDearCode.g:1474:2: rule__Multiplicador__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicador__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicador__Group_0__1"


    // $ANTLR start "rule__Multiplicador__Group_0__1__Impl"
    // InternalDearCode.g:1480:1: rule__Multiplicador__Group_0__1__Impl : ( ( 's' )? ) ;
    public final void rule__Multiplicador__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1484:1: ( ( ( 's' )? ) )
            // InternalDearCode.g:1485:1: ( ( 's' )? )
            {
            // InternalDearCode.g:1485:1: ( ( 's' )? )
            // InternalDearCode.g:1486:2: ( 's' )?
            {
             before(grammarAccess.getMultiplicadorAccess().getSKeyword_0_1()); 
            // InternalDearCode.g:1487:2: ( 's' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDearCode.g:1487:3: 's'
                    {
                    match(input,35,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getMultiplicadorAccess().getSKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicador__Group_0__1__Impl"


    // $ANTLR start "rule__Multiplicador__Group_1__0"
    // InternalDearCode.g:1496:1: rule__Multiplicador__Group_1__0 : rule__Multiplicador__Group_1__0__Impl rule__Multiplicador__Group_1__1 ;
    public final void rule__Multiplicador__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1500:1: ( rule__Multiplicador__Group_1__0__Impl rule__Multiplicador__Group_1__1 )
            // InternalDearCode.g:1501:2: rule__Multiplicador__Group_1__0__Impl rule__Multiplicador__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__Multiplicador__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplicador__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicador__Group_1__0"


    // $ANTLR start "rule__Multiplicador__Group_1__0__Impl"
    // InternalDearCode.g:1508:1: rule__Multiplicador__Group_1__0__Impl : ( 'centena' ) ;
    public final void rule__Multiplicador__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1512:1: ( ( 'centena' ) )
            // InternalDearCode.g:1513:1: ( 'centena' )
            {
            // InternalDearCode.g:1513:1: ( 'centena' )
            // InternalDearCode.g:1514:2: 'centena'
            {
             before(grammarAccess.getMultiplicadorAccess().getCentenaKeyword_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getMultiplicadorAccess().getCentenaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicador__Group_1__0__Impl"


    // $ANTLR start "rule__Multiplicador__Group_1__1"
    // InternalDearCode.g:1523:1: rule__Multiplicador__Group_1__1 : rule__Multiplicador__Group_1__1__Impl ;
    public final void rule__Multiplicador__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1527:1: ( rule__Multiplicador__Group_1__1__Impl )
            // InternalDearCode.g:1528:2: rule__Multiplicador__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicador__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicador__Group_1__1"


    // $ANTLR start "rule__Multiplicador__Group_1__1__Impl"
    // InternalDearCode.g:1534:1: rule__Multiplicador__Group_1__1__Impl : ( ( 's' )? ) ;
    public final void rule__Multiplicador__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1538:1: ( ( ( 's' )? ) )
            // InternalDearCode.g:1539:1: ( ( 's' )? )
            {
            // InternalDearCode.g:1539:1: ( ( 's' )? )
            // InternalDearCode.g:1540:2: ( 's' )?
            {
             before(grammarAccess.getMultiplicadorAccess().getSKeyword_1_1()); 
            // InternalDearCode.g:1541:2: ( 's' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDearCode.g:1541:3: 's'
                    {
                    match(input,35,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getMultiplicadorAccess().getSKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicador__Group_1__1__Impl"


    // $ANTLR start "rule__Multiplicador__Group_2__0"
    // InternalDearCode.g:1550:1: rule__Multiplicador__Group_2__0 : rule__Multiplicador__Group_2__0__Impl rule__Multiplicador__Group_2__1 ;
    public final void rule__Multiplicador__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1554:1: ( rule__Multiplicador__Group_2__0__Impl rule__Multiplicador__Group_2__1 )
            // InternalDearCode.g:1555:2: rule__Multiplicador__Group_2__0__Impl rule__Multiplicador__Group_2__1
            {
            pushFollow(FOLLOW_17);
            rule__Multiplicador__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplicador__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicador__Group_2__0"


    // $ANTLR start "rule__Multiplicador__Group_2__0__Impl"
    // InternalDearCode.g:1562:1: rule__Multiplicador__Group_2__0__Impl : ( 'millar' ) ;
    public final void rule__Multiplicador__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1566:1: ( ( 'millar' ) )
            // InternalDearCode.g:1567:1: ( 'millar' )
            {
            // InternalDearCode.g:1567:1: ( 'millar' )
            // InternalDearCode.g:1568:2: 'millar'
            {
             before(grammarAccess.getMultiplicadorAccess().getMillarKeyword_2_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getMultiplicadorAccess().getMillarKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicador__Group_2__0__Impl"


    // $ANTLR start "rule__Multiplicador__Group_2__1"
    // InternalDearCode.g:1577:1: rule__Multiplicador__Group_2__1 : rule__Multiplicador__Group_2__1__Impl ;
    public final void rule__Multiplicador__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1581:1: ( rule__Multiplicador__Group_2__1__Impl )
            // InternalDearCode.g:1582:2: rule__Multiplicador__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicador__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicador__Group_2__1"


    // $ANTLR start "rule__Multiplicador__Group_2__1__Impl"
    // InternalDearCode.g:1588:1: rule__Multiplicador__Group_2__1__Impl : ( ( 'es' )? ) ;
    public final void rule__Multiplicador__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1592:1: ( ( ( 'es' )? ) )
            // InternalDearCode.g:1593:1: ( ( 'es' )? )
            {
            // InternalDearCode.g:1593:1: ( ( 'es' )? )
            // InternalDearCode.g:1594:2: ( 'es' )?
            {
             before(grammarAccess.getMultiplicadorAccess().getEsKeyword_2_1()); 
            // InternalDearCode.g:1595:2: ( 'es' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==38) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDearCode.g:1595:3: 'es'
                    {
                    match(input,38,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getMultiplicadorAccess().getEsKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicador__Group_2__1__Impl"


    // $ANTLR start "rule__VerboReasignacion__Group_0__0"
    // InternalDearCode.g:1604:1: rule__VerboReasignacion__Group_0__0 : rule__VerboReasignacion__Group_0__0__Impl rule__VerboReasignacion__Group_0__1 ;
    public final void rule__VerboReasignacion__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1608:1: ( rule__VerboReasignacion__Group_0__0__Impl rule__VerboReasignacion__Group_0__1 )
            // InternalDearCode.g:1609:2: rule__VerboReasignacion__Group_0__0__Impl rule__VerboReasignacion__Group_0__1
            {
            pushFollow(FOLLOW_18);
            rule__VerboReasignacion__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VerboReasignacion__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerboReasignacion__Group_0__0"


    // $ANTLR start "rule__VerboReasignacion__Group_0__0__Impl"
    // InternalDearCode.g:1616:1: rule__VerboReasignacion__Group_0__0__Impl : ( 'Perm\\u00EDteme' ) ;
    public final void rule__VerboReasignacion__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1620:1: ( ( 'Perm\\u00EDteme' ) )
            // InternalDearCode.g:1621:1: ( 'Perm\\u00EDteme' )
            {
            // InternalDearCode.g:1621:1: ( 'Perm\\u00EDteme' )
            // InternalDearCode.g:1622:2: 'Perm\\u00EDteme'
            {
             before(grammarAccess.getVerboReasignacionAccess().getPermTemeKeyword_0_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getVerboReasignacionAccess().getPermTemeKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerboReasignacion__Group_0__0__Impl"


    // $ANTLR start "rule__VerboReasignacion__Group_0__1"
    // InternalDearCode.g:1631:1: rule__VerboReasignacion__Group_0__1 : rule__VerboReasignacion__Group_0__1__Impl ;
    public final void rule__VerboReasignacion__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1635:1: ( rule__VerboReasignacion__Group_0__1__Impl )
            // InternalDearCode.g:1636:2: rule__VerboReasignacion__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VerboReasignacion__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerboReasignacion__Group_0__1"


    // $ANTLR start "rule__VerboReasignacion__Group_0__1__Impl"
    // InternalDearCode.g:1642:1: rule__VerboReasignacion__Group_0__1__Impl : ( 'alimentar' ) ;
    public final void rule__VerboReasignacion__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1646:1: ( ( 'alimentar' ) )
            // InternalDearCode.g:1647:1: ( 'alimentar' )
            {
            // InternalDearCode.g:1647:1: ( 'alimentar' )
            // InternalDearCode.g:1648:2: 'alimentar'
            {
             before(grammarAccess.getVerboReasignacionAccess().getAlimentarKeyword_0_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getVerboReasignacionAccess().getAlimentarKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerboReasignacion__Group_0__1__Impl"


    // $ANTLR start "rule__VerboReasignacion__Group_1__0"
    // InternalDearCode.g:1658:1: rule__VerboReasignacion__Group_1__0 : rule__VerboReasignacion__Group_1__0__Impl rule__VerboReasignacion__Group_1__1 ;
    public final void rule__VerboReasignacion__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1662:1: ( rule__VerboReasignacion__Group_1__0__Impl rule__VerboReasignacion__Group_1__1 )
            // InternalDearCode.g:1663:2: rule__VerboReasignacion__Group_1__0__Impl rule__VerboReasignacion__Group_1__1
            {
            pushFollow(FOLLOW_19);
            rule__VerboReasignacion__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VerboReasignacion__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerboReasignacion__Group_1__0"


    // $ANTLR start "rule__VerboReasignacion__Group_1__0__Impl"
    // InternalDearCode.g:1670:1: rule__VerboReasignacion__Group_1__0__Impl : ( 'Perm\\u00EDteme' ) ;
    public final void rule__VerboReasignacion__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1674:1: ( ( 'Perm\\u00EDteme' ) )
            // InternalDearCode.g:1675:1: ( 'Perm\\u00EDteme' )
            {
            // InternalDearCode.g:1675:1: ( 'Perm\\u00EDteme' )
            // InternalDearCode.g:1676:2: 'Perm\\u00EDteme'
            {
             before(grammarAccess.getVerboReasignacionAccess().getPermTemeKeyword_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getVerboReasignacionAccess().getPermTemeKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerboReasignacion__Group_1__0__Impl"


    // $ANTLR start "rule__VerboReasignacion__Group_1__1"
    // InternalDearCode.g:1685:1: rule__VerboReasignacion__Group_1__1 : rule__VerboReasignacion__Group_1__1__Impl ;
    public final void rule__VerboReasignacion__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1689:1: ( rule__VerboReasignacion__Group_1__1__Impl )
            // InternalDearCode.g:1690:2: rule__VerboReasignacion__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VerboReasignacion__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerboReasignacion__Group_1__1"


    // $ANTLR start "rule__VerboReasignacion__Group_1__1__Impl"
    // InternalDearCode.g:1696:1: rule__VerboReasignacion__Group_1__1__Impl : ( 'regar' ) ;
    public final void rule__VerboReasignacion__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1700:1: ( ( 'regar' ) )
            // InternalDearCode.g:1701:1: ( 'regar' )
            {
            // InternalDearCode.g:1701:1: ( 'regar' )
            // InternalDearCode.g:1702:2: 'regar'
            {
             before(grammarAccess.getVerboReasignacionAccess().getRegarKeyword_1_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getVerboReasignacionAccess().getRegarKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerboReasignacion__Group_1__1__Impl"


    // $ANTLR start "rule__VerboReasignacion__Group_2__0"
    // InternalDearCode.g:1712:1: rule__VerboReasignacion__Group_2__0 : rule__VerboReasignacion__Group_2__0__Impl rule__VerboReasignacion__Group_2__1 ;
    public final void rule__VerboReasignacion__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1716:1: ( rule__VerboReasignacion__Group_2__0__Impl rule__VerboReasignacion__Group_2__1 )
            // InternalDearCode.g:1717:2: rule__VerboReasignacion__Group_2__0__Impl rule__VerboReasignacion__Group_2__1
            {
            pushFollow(FOLLOW_20);
            rule__VerboReasignacion__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VerboReasignacion__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerboReasignacion__Group_2__0"


    // $ANTLR start "rule__VerboReasignacion__Group_2__0__Impl"
    // InternalDearCode.g:1724:1: rule__VerboReasignacion__Group_2__0__Impl : ( 'Perm\\u00EDteme' ) ;
    public final void rule__VerboReasignacion__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1728:1: ( ( 'Perm\\u00EDteme' ) )
            // InternalDearCode.g:1729:1: ( 'Perm\\u00EDteme' )
            {
            // InternalDearCode.g:1729:1: ( 'Perm\\u00EDteme' )
            // InternalDearCode.g:1730:2: 'Perm\\u00EDteme'
            {
             before(grammarAccess.getVerboReasignacionAccess().getPermTemeKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getVerboReasignacionAccess().getPermTemeKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerboReasignacion__Group_2__0__Impl"


    // $ANTLR start "rule__VerboReasignacion__Group_2__1"
    // InternalDearCode.g:1739:1: rule__VerboReasignacion__Group_2__1 : rule__VerboReasignacion__Group_2__1__Impl ;
    public final void rule__VerboReasignacion__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1743:1: ( rule__VerboReasignacion__Group_2__1__Impl )
            // InternalDearCode.g:1744:2: rule__VerboReasignacion__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VerboReasignacion__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerboReasignacion__Group_2__1"


    // $ANTLR start "rule__VerboReasignacion__Group_2__1__Impl"
    // InternalDearCode.g:1750:1: rule__VerboReasignacion__Group_2__1__Impl : ( 'ajustar' ) ;
    public final void rule__VerboReasignacion__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1754:1: ( ( 'ajustar' ) )
            // InternalDearCode.g:1755:1: ( 'ajustar' )
            {
            // InternalDearCode.g:1755:1: ( 'ajustar' )
            // InternalDearCode.g:1756:2: 'ajustar'
            {
             before(grammarAccess.getVerboReasignacionAccess().getAjustarKeyword_2_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getVerboReasignacionAccess().getAjustarKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerboReasignacion__Group_2__1__Impl"


    // $ANTLR start "rule__MI_ID__Group__0"
    // InternalDearCode.g:1766:1: rule__MI_ID__Group__0 : rule__MI_ID__Group__0__Impl rule__MI_ID__Group__1 ;
    public final void rule__MI_ID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1770:1: ( rule__MI_ID__Group__0__Impl rule__MI_ID__Group__1 )
            // InternalDearCode.g:1771:2: rule__MI_ID__Group__0__Impl rule__MI_ID__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__MI_ID__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MI_ID__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MI_ID__Group__0"


    // $ANTLR start "rule__MI_ID__Group__0__Impl"
    // InternalDearCode.g:1778:1: rule__MI_ID__Group__0__Impl : ( '@' ) ;
    public final void rule__MI_ID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1782:1: ( ( '@' ) )
            // InternalDearCode.g:1783:1: ( '@' )
            {
            // InternalDearCode.g:1783:1: ( '@' )
            // InternalDearCode.g:1784:2: '@'
            {
             before(grammarAccess.getMI_IDAccess().getCommercialAtKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getMI_IDAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MI_ID__Group__0__Impl"


    // $ANTLR start "rule__MI_ID__Group__1"
    // InternalDearCode.g:1793:1: rule__MI_ID__Group__1 : rule__MI_ID__Group__1__Impl ;
    public final void rule__MI_ID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1797:1: ( rule__MI_ID__Group__1__Impl )
            // InternalDearCode.g:1798:2: rule__MI_ID__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MI_ID__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MI_ID__Group__1"


    // $ANTLR start "rule__MI_ID__Group__1__Impl"
    // InternalDearCode.g:1804:1: rule__MI_ID__Group__1__Impl : ( ( rule__MI_ID__NameAssignment_1 ) ) ;
    public final void rule__MI_ID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1808:1: ( ( ( rule__MI_ID__NameAssignment_1 ) ) )
            // InternalDearCode.g:1809:1: ( ( rule__MI_ID__NameAssignment_1 ) )
            {
            // InternalDearCode.g:1809:1: ( ( rule__MI_ID__NameAssignment_1 ) )
            // InternalDearCode.g:1810:2: ( rule__MI_ID__NameAssignment_1 )
            {
             before(grammarAccess.getMI_IDAccess().getNameAssignment_1()); 
            // InternalDearCode.g:1811:2: ( rule__MI_ID__NameAssignment_1 )
            // InternalDearCode.g:1811:3: rule__MI_ID__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MI_ID__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMI_IDAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MI_ID__Group__1__Impl"


    // $ANTLR start "rule__Program__CartasAssignment"
    // InternalDearCode.g:1820:1: rule__Program__CartasAssignment : ( ruleCarta ) ;
    public final void rule__Program__CartasAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1824:1: ( ( ruleCarta ) )
            // InternalDearCode.g:1825:2: ( ruleCarta )
            {
            // InternalDearCode.g:1825:2: ( ruleCarta )
            // InternalDearCode.g:1826:3: ruleCarta
            {
             before(grammarAccess.getProgramAccess().getCartasCartaParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleCarta();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getCartasCartaParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__CartasAssignment"


    // $ANTLR start "rule__Carta__SaludoAssignment_0"
    // InternalDearCode.g:1835:1: rule__Carta__SaludoAssignment_0 : ( ruleSaludo ) ;
    public final void rule__Carta__SaludoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1839:1: ( ( ruleSaludo ) )
            // InternalDearCode.g:1840:2: ( ruleSaludo )
            {
            // InternalDearCode.g:1840:2: ( ruleSaludo )
            // InternalDearCode.g:1841:3: ruleSaludo
            {
             before(grammarAccess.getCartaAccess().getSaludoSaludoParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSaludo();

            state._fsp--;

             after(grammarAccess.getCartaAccess().getSaludoSaludoParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Carta__SaludoAssignment_0"


    // $ANTLR start "rule__Carta__CuerpoAssignment_1"
    // InternalDearCode.g:1850:1: rule__Carta__CuerpoAssignment_1 : ( ruleCuerpo ) ;
    public final void rule__Carta__CuerpoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1854:1: ( ( ruleCuerpo ) )
            // InternalDearCode.g:1855:2: ( ruleCuerpo )
            {
            // InternalDearCode.g:1855:2: ( ruleCuerpo )
            // InternalDearCode.g:1856:3: ruleCuerpo
            {
             before(grammarAccess.getCartaAccess().getCuerpoCuerpoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCuerpo();

            state._fsp--;

             after(grammarAccess.getCartaAccess().getCuerpoCuerpoParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Carta__CuerpoAssignment_1"


    // $ANTLR start "rule__Carta__DespedidaAssignment_2"
    // InternalDearCode.g:1865:1: rule__Carta__DespedidaAssignment_2 : ( ruleDespedida ) ;
    public final void rule__Carta__DespedidaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1869:1: ( ( ruleDespedida ) )
            // InternalDearCode.g:1870:2: ( ruleDespedida )
            {
            // InternalDearCode.g:1870:2: ( ruleDespedida )
            // InternalDearCode.g:1871:3: ruleDespedida
            {
             before(grammarAccess.getCartaAccess().getDespedidaDespedidaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDespedida();

            state._fsp--;

             after(grammarAccess.getCartaAccess().getDespedidaDespedidaParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Carta__DespedidaAssignment_2"


    // $ANTLR start "rule__Saludo__NameAssignment_1"
    // InternalDearCode.g:1880:1: rule__Saludo__NameAssignment_1 : ( RULE_ANYTEXT ) ;
    public final void rule__Saludo__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1884:1: ( ( RULE_ANYTEXT ) )
            // InternalDearCode.g:1885:2: ( RULE_ANYTEXT )
            {
            // InternalDearCode.g:1885:2: ( RULE_ANYTEXT )
            // InternalDearCode.g:1886:3: RULE_ANYTEXT
            {
             before(grammarAccess.getSaludoAccess().getNameANYTEXTTerminalRuleCall_1_0()); 
            match(input,RULE_ANYTEXT,FOLLOW_2); 
             after(grammarAccess.getSaludoAccess().getNameANYTEXTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saludo__NameAssignment_1"


    // $ANTLR start "rule__Despedida__NameAssignment_1"
    // InternalDearCode.g:1895:1: rule__Despedida__NameAssignment_1 : ( RULE_ANYTEXT ) ;
    public final void rule__Despedida__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1899:1: ( ( RULE_ANYTEXT ) )
            // InternalDearCode.g:1900:2: ( RULE_ANYTEXT )
            {
            // InternalDearCode.g:1900:2: ( RULE_ANYTEXT )
            // InternalDearCode.g:1901:3: RULE_ANYTEXT
            {
             before(grammarAccess.getDespedidaAccess().getNameANYTEXTTerminalRuleCall_1_0()); 
            match(input,RULE_ANYTEXT,FOLLOW_2); 
             after(grammarAccess.getDespedidaAccess().getNameANYTEXTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Despedida__NameAssignment_1"


    // $ANTLR start "rule__Cuerpo__InstruccionesAssignment"
    // InternalDearCode.g:1910:1: rule__Cuerpo__InstruccionesAssignment : ( ruleInstruccion ) ;
    public final void rule__Cuerpo__InstruccionesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1914:1: ( ( ruleInstruccion ) )
            // InternalDearCode.g:1915:2: ( ruleInstruccion )
            {
            // InternalDearCode.g:1915:2: ( ruleInstruccion )
            // InternalDearCode.g:1916:3: ruleInstruccion
            {
             before(grammarAccess.getCuerpoAccess().getInstruccionesInstruccionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleInstruccion();

            state._fsp--;

             after(grammarAccess.getCuerpoAccess().getInstruccionesInstruccionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuerpo__InstruccionesAssignment"


    // $ANTLR start "rule__Declarar__VerboDeclAssignment_0"
    // InternalDearCode.g:1925:1: rule__Declarar__VerboDeclAssignment_0 : ( ruleVerboDeclaracion ) ;
    public final void rule__Declarar__VerboDeclAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1929:1: ( ( ruleVerboDeclaracion ) )
            // InternalDearCode.g:1930:2: ( ruleVerboDeclaracion )
            {
            // InternalDearCode.g:1930:2: ( ruleVerboDeclaracion )
            // InternalDearCode.g:1931:3: ruleVerboDeclaracion
            {
             before(grammarAccess.getDeclararAccess().getVerboDeclVerboDeclaracionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVerboDeclaracion();

            state._fsp--;

             after(grammarAccess.getDeclararAccess().getVerboDeclVerboDeclaracionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarar__VerboDeclAssignment_0"


    // $ANTLR start "rule__Declarar__ArticuloAssignment_1"
    // InternalDearCode.g:1940:1: rule__Declarar__ArticuloAssignment_1 : ( ruleArticulo ) ;
    public final void rule__Declarar__ArticuloAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1944:1: ( ( ruleArticulo ) )
            // InternalDearCode.g:1945:2: ( ruleArticulo )
            {
            // InternalDearCode.g:1945:2: ( ruleArticulo )
            // InternalDearCode.g:1946:3: ruleArticulo
            {
             before(grammarAccess.getDeclararAccess().getArticuloArticuloParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArticulo();

            state._fsp--;

             after(grammarAccess.getDeclararAccess().getArticuloArticuloParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarar__ArticuloAssignment_1"


    // $ANTLR start "rule__Declarar__ValorAssignment_2"
    // InternalDearCode.g:1955:1: rule__Declarar__ValorAssignment_2 : ( ruleValor ) ;
    public final void rule__Declarar__ValorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1959:1: ( ( ruleValor ) )
            // InternalDearCode.g:1960:2: ( ruleValor )
            {
            // InternalDearCode.g:1960:2: ( ruleValor )
            // InternalDearCode.g:1961:3: ruleValor
            {
             before(grammarAccess.getDeclararAccess().getValorValorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValor();

            state._fsp--;

             after(grammarAccess.getDeclararAccess().getValorValorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarar__ValorAssignment_2"


    // $ANTLR start "rule__Declarar__SustantivoAssignment_3"
    // InternalDearCode.g:1970:1: rule__Declarar__SustantivoAssignment_3 : ( ruleMI_ID ) ;
    public final void rule__Declarar__SustantivoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1974:1: ( ( ruleMI_ID ) )
            // InternalDearCode.g:1975:2: ( ruleMI_ID )
            {
            // InternalDearCode.g:1975:2: ( ruleMI_ID )
            // InternalDearCode.g:1976:3: ruleMI_ID
            {
             before(grammarAccess.getDeclararAccess().getSustantivoMI_IDParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMI_ID();

            state._fsp--;

             after(grammarAccess.getDeclararAccess().getSustantivoMI_IDParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarar__SustantivoAssignment_3"


    // $ANTLR start "rule__Declarar__ComentarioAssignment_4"
    // InternalDearCode.g:1985:1: rule__Declarar__ComentarioAssignment_4 : ( ( rule__Declarar__ComentarioAlternatives_4_0 ) ) ;
    public final void rule__Declarar__ComentarioAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:1989:1: ( ( ( rule__Declarar__ComentarioAlternatives_4_0 ) ) )
            // InternalDearCode.g:1990:2: ( ( rule__Declarar__ComentarioAlternatives_4_0 ) )
            {
            // InternalDearCode.g:1990:2: ( ( rule__Declarar__ComentarioAlternatives_4_0 ) )
            // InternalDearCode.g:1991:3: ( rule__Declarar__ComentarioAlternatives_4_0 )
            {
             before(grammarAccess.getDeclararAccess().getComentarioAlternatives_4_0()); 
            // InternalDearCode.g:1992:3: ( rule__Declarar__ComentarioAlternatives_4_0 )
            // InternalDearCode.g:1992:4: rule__Declarar__ComentarioAlternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Declarar__ComentarioAlternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getDeclararAccess().getComentarioAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarar__ComentarioAssignment_4"


    // $ANTLR start "rule__Reasignar__VerboReasAssignment_0"
    // InternalDearCode.g:2000:1: rule__Reasignar__VerboReasAssignment_0 : ( ruleVerboReasignacion ) ;
    public final void rule__Reasignar__VerboReasAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:2004:1: ( ( ruleVerboReasignacion ) )
            // InternalDearCode.g:2005:2: ( ruleVerboReasignacion )
            {
            // InternalDearCode.g:2005:2: ( ruleVerboReasignacion )
            // InternalDearCode.g:2006:3: ruleVerboReasignacion
            {
             before(grammarAccess.getReasignarAccess().getVerboReasVerboReasignacionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVerboReasignacion();

            state._fsp--;

             after(grammarAccess.getReasignarAccess().getVerboReasVerboReasignacionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reasignar__VerboReasAssignment_0"


    // $ANTLR start "rule__Reasignar__SustantivoAssignment_1"
    // InternalDearCode.g:2015:1: rule__Reasignar__SustantivoAssignment_1 : ( ruleMI_ID ) ;
    public final void rule__Reasignar__SustantivoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:2019:1: ( ( ruleMI_ID ) )
            // InternalDearCode.g:2020:2: ( ruleMI_ID )
            {
            // InternalDearCode.g:2020:2: ( ruleMI_ID )
            // InternalDearCode.g:2021:3: ruleMI_ID
            {
             before(grammarAccess.getReasignarAccess().getSustantivoMI_IDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMI_ID();

            state._fsp--;

             after(grammarAccess.getReasignarAccess().getSustantivoMI_IDParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reasignar__SustantivoAssignment_1"


    // $ANTLR start "rule__Reasignar__ValorAssignment_3"
    // InternalDearCode.g:2030:1: rule__Reasignar__ValorAssignment_3 : ( ruleValor ) ;
    public final void rule__Reasignar__ValorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:2034:1: ( ( ruleValor ) )
            // InternalDearCode.g:2035:2: ( ruleValor )
            {
            // InternalDearCode.g:2035:2: ( ruleValor )
            // InternalDearCode.g:2036:3: ruleValor
            {
             before(grammarAccess.getReasignarAccess().getValorValorParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleValor();

            state._fsp--;

             after(grammarAccess.getReasignarAccess().getValorValorParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reasignar__ValorAssignment_3"


    // $ANTLR start "rule__Reasignar__ComentarioAssignment_4"
    // InternalDearCode.g:2045:1: rule__Reasignar__ComentarioAssignment_4 : ( ( rule__Reasignar__ComentarioAlternatives_4_0 ) ) ;
    public final void rule__Reasignar__ComentarioAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:2049:1: ( ( ( rule__Reasignar__ComentarioAlternatives_4_0 ) ) )
            // InternalDearCode.g:2050:2: ( ( rule__Reasignar__ComentarioAlternatives_4_0 ) )
            {
            // InternalDearCode.g:2050:2: ( ( rule__Reasignar__ComentarioAlternatives_4_0 ) )
            // InternalDearCode.g:2051:3: ( rule__Reasignar__ComentarioAlternatives_4_0 )
            {
             before(grammarAccess.getReasignarAccess().getComentarioAlternatives_4_0()); 
            // InternalDearCode.g:2052:3: ( rule__Reasignar__ComentarioAlternatives_4_0 )
            // InternalDearCode.g:2052:4: rule__Reasignar__ComentarioAlternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Reasignar__ComentarioAlternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getReasignarAccess().getComentarioAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reasignar__ComentarioAssignment_4"


    // $ANTLR start "rule__Simple__ValueAssignment"
    // InternalDearCode.g:2060:1: rule__Simple__ValueAssignment : ( ( rule__Simple__ValueAlternatives_0 ) ) ;
    public final void rule__Simple__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:2064:1: ( ( ( rule__Simple__ValueAlternatives_0 ) ) )
            // InternalDearCode.g:2065:2: ( ( rule__Simple__ValueAlternatives_0 ) )
            {
            // InternalDearCode.g:2065:2: ( ( rule__Simple__ValueAlternatives_0 ) )
            // InternalDearCode.g:2066:3: ( rule__Simple__ValueAlternatives_0 )
            {
             before(grammarAccess.getSimpleAccess().getValueAlternatives_0()); 
            // InternalDearCode.g:2067:3: ( rule__Simple__ValueAlternatives_0 )
            // InternalDearCode.g:2067:4: rule__Simple__ValueAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Simple__ValueAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAccess().getValueAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__ValueAssignment"


    // $ANTLR start "rule__Compuesto__CantidadAssignment_0"
    // InternalDearCode.g:2075:1: rule__Compuesto__CantidadAssignment_0 : ( ruleSimple ) ;
    public final void rule__Compuesto__CantidadAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:2079:1: ( ( ruleSimple ) )
            // InternalDearCode.g:2080:2: ( ruleSimple )
            {
            // InternalDearCode.g:2080:2: ( ruleSimple )
            // InternalDearCode.g:2081:3: ruleSimple
            {
             before(grammarAccess.getCompuestoAccess().getCantidadSimpleParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSimple();

            state._fsp--;

             after(grammarAccess.getCompuestoAccess().getCantidadSimpleParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compuesto__CantidadAssignment_0"


    // $ANTLR start "rule__Compuesto__MultiplicadorAssignment_1"
    // InternalDearCode.g:2090:1: rule__Compuesto__MultiplicadorAssignment_1 : ( ruleMultiplicador ) ;
    public final void rule__Compuesto__MultiplicadorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:2094:1: ( ( ruleMultiplicador ) )
            // InternalDearCode.g:2095:2: ( ruleMultiplicador )
            {
            // InternalDearCode.g:2095:2: ( ruleMultiplicador )
            // InternalDearCode.g:2096:3: ruleMultiplicador
            {
             before(grammarAccess.getCompuestoAccess().getMultiplicadorMultiplicadorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicador();

            state._fsp--;

             after(grammarAccess.getCompuestoAccess().getMultiplicadorMultiplicadorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compuesto__MultiplicadorAssignment_1"


    // $ANTLR start "rule__Compuesto__RestoAssignment_2_1"
    // InternalDearCode.g:2105:1: rule__Compuesto__RestoAssignment_2_1 : ( ruleSimple ) ;
    public final void rule__Compuesto__RestoAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:2109:1: ( ( ruleSimple ) )
            // InternalDearCode.g:2110:2: ( ruleSimple )
            {
            // InternalDearCode.g:2110:2: ( ruleSimple )
            // InternalDearCode.g:2111:3: ruleSimple
            {
             before(grammarAccess.getCompuestoAccess().getRestoSimpleParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSimple();

            state._fsp--;

             after(grammarAccess.getCompuestoAccess().getRestoSimpleParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compuesto__RestoAssignment_2_1"


    // $ANTLR start "rule__MI_ID__NameAssignment_1"
    // InternalDearCode.g:2120:1: rule__MI_ID__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MI_ID__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDearCode.g:2124:1: ( ( RULE_ID ) )
            // InternalDearCode.g:2125:2: ( RULE_ID )
            {
            // InternalDearCode.g:2125:2: ( RULE_ID )
            // InternalDearCode.g:2126:3: RULE_ID
            {
             before(grammarAccess.getMI_IDAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMI_IDAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MI_ID__NameAssignment_1"

    // Delegated rules


    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\uffff\12\14\2\uffff";
    static final String dfa_3s = "\1\16\12\4\2\uffff";
    static final String dfa_4s = "\1\27\12\53\2\uffff";
    static final String dfa_5s = "\13\uffff\1\2\1\1";
    static final String dfa_6s = "\15\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
            "\2\14\31\uffff\1\14\2\uffff\1\13\1\uffff\2\13\5\uffff\1\14",
            "\2\14\31\uffff\1\14\2\uffff\1\13\1\uffff\2\13\5\uffff\1\14",
            "\2\14\31\uffff\1\14\2\uffff\1\13\1\uffff\2\13\5\uffff\1\14",
            "\2\14\31\uffff\1\14\2\uffff\1\13\1\uffff\2\13\5\uffff\1\14",
            "\2\14\31\uffff\1\14\2\uffff\1\13\1\uffff\2\13\5\uffff\1\14",
            "\2\14\31\uffff\1\14\2\uffff\1\13\1\uffff\2\13\5\uffff\1\14",
            "\2\14\31\uffff\1\14\2\uffff\1\13\1\uffff\2\13\5\uffff\1\14",
            "\2\14\31\uffff\1\14\2\uffff\1\13\1\uffff\2\13\5\uffff\1\14",
            "\2\14\31\uffff\1\14\2\uffff\1\13\1\uffff\2\13\5\uffff\1\14",
            "\2\14\31\uffff\1\14\2\uffff\1\13\1\uffff\2\13\5\uffff\1\14",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "596:1: rule__NumeroLiteral__Alternatives : ( ( ruleSimple ) | ( ruleCompuesto ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000803C000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000803C000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000080000FFC000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000003400000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000FFC000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});

}