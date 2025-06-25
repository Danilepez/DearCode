package edu.upb.lp.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import edu.upb.lp.services.DearCodeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDearCodeParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "'Querido compilador:'", "'Con cari\\u00F1o,'", "'Tu programador'", "'.'", "'o quiz\\u00E1s'", "'y tambi\\u00E9n'", "'late al un\\u00EDsono con'", "'canta con un matiz distinto a'", "'susurra con menos fuerza que '", "'arde con mas pasion que'", "'unidos en un solo suspiro con'", "'fundidos en la llama de'", "'fortalecidos por el fuego de'", "'Separados entre los ecos de'", "'no lo creo'", "'('", "')'", "'siempre'", "'jam\\u00E1s'", "'a\\u00FAn me piensas'", "'tu voz me alcanza'", "'Si en tu corazon sientes que'", "'Si en tu alma nace el deseo de que'", "','", "'Y si el destino dijera lo contrario,'", "'Mientras aun me pienses'", "'Mientras a\\u00FAn sue\\u00F1es con este momento, haz que ocurra'", "'Cada dia, desde'", "'Por cada suspiro desde'", "'hasta'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

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

        public InternalDearCodeParser(TokenStream input, DearCodeGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected DearCodeGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalDearCode.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalDearCode.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalDearCode.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalDearCode.g:71:1: ruleProgram returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_cartas_2_0= ruleCarta ) )+ ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_cartas_2_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:77:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_cartas_2_0= ruleCarta ) )+ ) )
            // InternalDearCode.g:78:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_cartas_2_0= ruleCarta ) )+ )
            {
            // InternalDearCode.g:78:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_cartas_2_0= ruleCarta ) )+ )
            // InternalDearCode.g:79:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_cartas_2_0= ruleCarta ) )+
            {
            // InternalDearCode.g:79:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDearCode.g:80:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDearCode.g:80:4: (lv_name_0_0= RULE_ID )
            // InternalDearCode.g:81:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProgramRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getProgramAccess().getColonKeyword_1());
            		
            // InternalDearCode.g:101:3: ( (lv_cartas_2_0= ruleCarta ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDearCode.g:102:4: (lv_cartas_2_0= ruleCarta )
            	    {
            	    // InternalDearCode.g:102:4: (lv_cartas_2_0= ruleCarta )
            	    // InternalDearCode.g:103:5: lv_cartas_2_0= ruleCarta
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getCartasCartaParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_cartas_2_0=ruleCarta();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cartas",
            	    						lv_cartas_2_0,
            	    						"edu.upb.lp.DearCode.Carta");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleCarta"
    // InternalDearCode.g:124:1: entryRuleCarta returns [EObject current=null] : iv_ruleCarta= ruleCarta EOF ;
    public final EObject entryRuleCarta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCarta = null;


        try {
            // InternalDearCode.g:124:46: (iv_ruleCarta= ruleCarta EOF )
            // InternalDearCode.g:125:2: iv_ruleCarta= ruleCarta EOF
            {
             newCompositeNode(grammarAccess.getCartaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCarta=ruleCarta();

            state._fsp--;

             current =iv_ruleCarta; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCarta"


    // $ANTLR start "ruleCarta"
    // InternalDearCode.g:131:1: ruleCarta returns [EObject current=null] : ( ( (lv_saludo_0_0= ruleSaludo ) ) ( (lv_cuerpo_1_0= ruleCuerpo ) ) ( (lv_despedida_2_0= ruleDespedida ) ) ) ;
    public final EObject ruleCarta() throws RecognitionException {
        EObject current = null;

        EObject lv_saludo_0_0 = null;

        EObject lv_cuerpo_1_0 = null;

        EObject lv_despedida_2_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:137:2: ( ( ( (lv_saludo_0_0= ruleSaludo ) ) ( (lv_cuerpo_1_0= ruleCuerpo ) ) ( (lv_despedida_2_0= ruleDespedida ) ) ) )
            // InternalDearCode.g:138:2: ( ( (lv_saludo_0_0= ruleSaludo ) ) ( (lv_cuerpo_1_0= ruleCuerpo ) ) ( (lv_despedida_2_0= ruleDespedida ) ) )
            {
            // InternalDearCode.g:138:2: ( ( (lv_saludo_0_0= ruleSaludo ) ) ( (lv_cuerpo_1_0= ruleCuerpo ) ) ( (lv_despedida_2_0= ruleDespedida ) ) )
            // InternalDearCode.g:139:3: ( (lv_saludo_0_0= ruleSaludo ) ) ( (lv_cuerpo_1_0= ruleCuerpo ) ) ( (lv_despedida_2_0= ruleDespedida ) )
            {
            // InternalDearCode.g:139:3: ( (lv_saludo_0_0= ruleSaludo ) )
            // InternalDearCode.g:140:4: (lv_saludo_0_0= ruleSaludo )
            {
            // InternalDearCode.g:140:4: (lv_saludo_0_0= ruleSaludo )
            // InternalDearCode.g:141:5: lv_saludo_0_0= ruleSaludo
            {

            					newCompositeNode(grammarAccess.getCartaAccess().getSaludoSaludoParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_saludo_0_0=ruleSaludo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCartaRule());
            					}
            					set(
            						current,
            						"saludo",
            						lv_saludo_0_0,
            						"edu.upb.lp.DearCode.Saludo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDearCode.g:158:3: ( (lv_cuerpo_1_0= ruleCuerpo ) )
            // InternalDearCode.g:159:4: (lv_cuerpo_1_0= ruleCuerpo )
            {
            // InternalDearCode.g:159:4: (lv_cuerpo_1_0= ruleCuerpo )
            // InternalDearCode.g:160:5: lv_cuerpo_1_0= ruleCuerpo
            {

            					newCompositeNode(grammarAccess.getCartaAccess().getCuerpoCuerpoParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_cuerpo_1_0=ruleCuerpo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCartaRule());
            					}
            					set(
            						current,
            						"cuerpo",
            						lv_cuerpo_1_0,
            						"edu.upb.lp.DearCode.Cuerpo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDearCode.g:177:3: ( (lv_despedida_2_0= ruleDespedida ) )
            // InternalDearCode.g:178:4: (lv_despedida_2_0= ruleDespedida )
            {
            // InternalDearCode.g:178:4: (lv_despedida_2_0= ruleDespedida )
            // InternalDearCode.g:179:5: lv_despedida_2_0= ruleDespedida
            {

            					newCompositeNode(grammarAccess.getCartaAccess().getDespedidaDespedidaParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_despedida_2_0=ruleDespedida();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCartaRule());
            					}
            					set(
            						current,
            						"despedida",
            						lv_despedida_2_0,
            						"edu.upb.lp.DearCode.Despedida");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCarta"


    // $ANTLR start "entryRuleSaludo"
    // InternalDearCode.g:200:1: entryRuleSaludo returns [EObject current=null] : iv_ruleSaludo= ruleSaludo EOF ;
    public final EObject entryRuleSaludo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSaludo = null;


        try {
            // InternalDearCode.g:200:47: (iv_ruleSaludo= ruleSaludo EOF )
            // InternalDearCode.g:201:2: iv_ruleSaludo= ruleSaludo EOF
            {
             newCompositeNode(grammarAccess.getSaludoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSaludo=ruleSaludo();

            state._fsp--;

             current =iv_ruleSaludo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSaludo"


    // $ANTLR start "ruleSaludo"
    // InternalDearCode.g:207:1: ruleSaludo returns [EObject current=null] : (otherlv_0= 'Querido compilador:' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSaludo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDearCode.g:213:2: ( (otherlv_0= 'Querido compilador:' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalDearCode.g:214:2: (otherlv_0= 'Querido compilador:' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalDearCode.g:214:2: (otherlv_0= 'Querido compilador:' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalDearCode.g:215:3: otherlv_0= 'Querido compilador:' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getSaludoAccess().getQueridoCompiladorKeyword_0());
            		
            // InternalDearCode.g:219:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDearCode.g:220:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDearCode.g:220:4: (lv_name_1_0= RULE_ID )
            // InternalDearCode.g:221:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSaludoAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSaludoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSaludo"


    // $ANTLR start "entryRuleDespedida"
    // InternalDearCode.g:241:1: entryRuleDespedida returns [EObject current=null] : iv_ruleDespedida= ruleDespedida EOF ;
    public final EObject entryRuleDespedida() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDespedida = null;


        try {
            // InternalDearCode.g:241:50: (iv_ruleDespedida= ruleDespedida EOF )
            // InternalDearCode.g:242:2: iv_ruleDespedida= ruleDespedida EOF
            {
             newCompositeNode(grammarAccess.getDespedidaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDespedida=ruleDespedida();

            state._fsp--;

             current =iv_ruleDespedida; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDespedida"


    // $ANTLR start "ruleDespedida"
    // InternalDearCode.g:248:1: ruleDespedida returns [EObject current=null] : (otherlv_0= 'Con cari\\u00F1o,' otherlv_1= 'Tu programador' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '.' ) ;
    public final EObject ruleDespedida() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDearCode.g:254:2: ( (otherlv_0= 'Con cari\\u00F1o,' otherlv_1= 'Tu programador' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '.' ) )
            // InternalDearCode.g:255:2: (otherlv_0= 'Con cari\\u00F1o,' otherlv_1= 'Tu programador' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '.' )
            {
            // InternalDearCode.g:255:2: (otherlv_0= 'Con cari\\u00F1o,' otherlv_1= 'Tu programador' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '.' )
            // InternalDearCode.g:256:3: otherlv_0= 'Con cari\\u00F1o,' otherlv_1= 'Tu programador' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '.'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDespedidaAccess().getConCariOKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getDespedidaAccess().getTuProgramadorKeyword_1());
            		
            // InternalDearCode.g:264:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDearCode.g:265:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDearCode.g:265:4: (lv_name_2_0= RULE_ID )
            // InternalDearCode.g:266:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDespedidaAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDespedidaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDespedidaAccess().getFullStopKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDespedida"


    // $ANTLR start "entryRuleCuerpo"
    // InternalDearCode.g:290:1: entryRuleCuerpo returns [EObject current=null] : iv_ruleCuerpo= ruleCuerpo EOF ;
    public final EObject entryRuleCuerpo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCuerpo = null;


        try {
            // InternalDearCode.g:290:47: (iv_ruleCuerpo= ruleCuerpo EOF )
            // InternalDearCode.g:291:2: iv_ruleCuerpo= ruleCuerpo EOF
            {
             newCompositeNode(grammarAccess.getCuerpoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCuerpo=ruleCuerpo();

            state._fsp--;

             current =iv_ruleCuerpo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCuerpo"


    // $ANTLR start "ruleCuerpo"
    // InternalDearCode.g:297:1: ruleCuerpo returns [EObject current=null] : ( (lv_instrucciones_0_0= ruleInstruccion ) )* ;
    public final EObject ruleCuerpo() throws RecognitionException {
        EObject current = null;

        EObject lv_instrucciones_0_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:303:2: ( ( (lv_instrucciones_0_0= ruleInstruccion ) )* )
            // InternalDearCode.g:304:2: ( (lv_instrucciones_0_0= ruleInstruccion ) )*
            {
            // InternalDearCode.g:304:2: ( (lv_instrucciones_0_0= ruleInstruccion ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=33 && LA2_0<=34)||(LA2_0>=37 && LA2_0<=40)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDearCode.g:305:3: (lv_instrucciones_0_0= ruleInstruccion )
            	    {
            	    // InternalDearCode.g:305:3: (lv_instrucciones_0_0= ruleInstruccion )
            	    // InternalDearCode.g:306:4: lv_instrucciones_0_0= ruleInstruccion
            	    {

            	    				newCompositeNode(grammarAccess.getCuerpoAccess().getInstruccionesInstruccionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_10);
            	    lv_instrucciones_0_0=ruleInstruccion();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getCuerpoRule());
            	    				}
            	    				add(
            	    					current,
            	    					"instrucciones",
            	    					lv_instrucciones_0_0,
            	    					"edu.upb.lp.DearCode.Instruccion");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCuerpo"


    // $ANTLR start "entryRuleInstruccion"
    // InternalDearCode.g:326:1: entryRuleInstruccion returns [EObject current=null] : iv_ruleInstruccion= ruleInstruccion EOF ;
    public final EObject entryRuleInstruccion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruccion = null;


        try {
            // InternalDearCode.g:326:52: (iv_ruleInstruccion= ruleInstruccion EOF )
            // InternalDearCode.g:327:2: iv_ruleInstruccion= ruleInstruccion EOF
            {
             newCompositeNode(grammarAccess.getInstruccionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstruccion=ruleInstruccion();

            state._fsp--;

             current =iv_ruleInstruccion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstruccion"


    // $ANTLR start "ruleInstruccion"
    // InternalDearCode.g:333:1: ruleInstruccion returns [EObject current=null] : (this_Condicional_0= ruleCondicional | this_BucleWhile_1= ruleBucleWhile | this_BucleFor_2= ruleBucleFor ) ;
    public final EObject ruleInstruccion() throws RecognitionException {
        EObject current = null;

        EObject this_Condicional_0 = null;

        EObject this_BucleWhile_1 = null;

        EObject this_BucleFor_2 = null;



        	enterRule();

        try {
            // InternalDearCode.g:339:2: ( (this_Condicional_0= ruleCondicional | this_BucleWhile_1= ruleBucleWhile | this_BucleFor_2= ruleBucleFor ) )
            // InternalDearCode.g:340:2: (this_Condicional_0= ruleCondicional | this_BucleWhile_1= ruleBucleWhile | this_BucleFor_2= ruleBucleFor )
            {
            // InternalDearCode.g:340:2: (this_Condicional_0= ruleCondicional | this_BucleWhile_1= ruleBucleWhile | this_BucleFor_2= ruleBucleFor )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 33:
            case 34:
                {
                alt3=1;
                }
                break;
            case 37:
            case 38:
                {
                alt3=2;
                }
                break;
            case 39:
            case 40:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDearCode.g:341:3: this_Condicional_0= ruleCondicional
                    {

                    			newCompositeNode(grammarAccess.getInstruccionAccess().getCondicionalParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Condicional_0=ruleCondicional();

                    state._fsp--;


                    			current = this_Condicional_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:350:3: this_BucleWhile_1= ruleBucleWhile
                    {

                    			newCompositeNode(grammarAccess.getInstruccionAccess().getBucleWhileParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BucleWhile_1=ruleBucleWhile();

                    state._fsp--;


                    			current = this_BucleWhile_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDearCode.g:359:3: this_BucleFor_2= ruleBucleFor
                    {

                    			newCompositeNode(grammarAccess.getInstruccionAccess().getBucleForParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BucleFor_2=ruleBucleFor();

                    state._fsp--;


                    			current = this_BucleFor_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstruccion"


    // $ANTLR start "entryRuleCondicion"
    // InternalDearCode.g:371:1: entryRuleCondicion returns [EObject current=null] : iv_ruleCondicion= ruleCondicion EOF ;
    public final EObject entryRuleCondicion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondicion = null;


        try {
            // InternalDearCode.g:371:50: (iv_ruleCondicion= ruleCondicion EOF )
            // InternalDearCode.g:372:2: iv_ruleCondicion= ruleCondicion EOF
            {
             newCompositeNode(grammarAccess.getCondicionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondicion=ruleCondicion();

            state._fsp--;

             current =iv_ruleCondicion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondicion"


    // $ANTLR start "ruleCondicion"
    // InternalDearCode.g:378:1: ruleCondicion returns [EObject current=null] : this_Expression_0= ruleExpression ;
    public final EObject ruleCondicion() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:384:2: (this_Expression_0= ruleExpression )
            // InternalDearCode.g:385:2: this_Expression_0= ruleExpression
            {

            		newCompositeNode(grammarAccess.getCondicionAccess().getExpressionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Expression_0=ruleExpression();

            state._fsp--;


            		current = this_Expression_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondicion"


    // $ANTLR start "entryRuleExpression"
    // InternalDearCode.g:396:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalDearCode.g:396:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalDearCode.g:397:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalDearCode.g:403:1: ruleExpression returns [EObject current=null] : this_OrExpr_0= ruleOrExpr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpr_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:409:2: (this_OrExpr_0= ruleOrExpr )
            // InternalDearCode.g:410:2: this_OrExpr_0= ruleOrExpr
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getOrExprParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_OrExpr_0=ruleOrExpr();

            state._fsp--;


            		current = this_OrExpr_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOrExpr"
    // InternalDearCode.g:421:1: entryRuleOrExpr returns [EObject current=null] : iv_ruleOrExpr= ruleOrExpr EOF ;
    public final EObject entryRuleOrExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpr = null;


        try {
            // InternalDearCode.g:421:47: (iv_ruleOrExpr= ruleOrExpr EOF )
            // InternalDearCode.g:422:2: iv_ruleOrExpr= ruleOrExpr EOF
            {
             newCompositeNode(grammarAccess.getOrExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrExpr=ruleOrExpr();

            state._fsp--;

             current =iv_ruleOrExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrExpr"


    // $ANTLR start "ruleOrExpr"
    // InternalDearCode.g:428:1: ruleOrExpr returns [EObject current=null] : (this_AndExpr_0= ruleAndExpr ( () otherlv_2= 'o quiz\\u00E1s' ( (lv_right_3_0= ruleAndExpr ) ) )* ) ;
    public final EObject ruleOrExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:434:2: ( (this_AndExpr_0= ruleAndExpr ( () otherlv_2= 'o quiz\\u00E1s' ( (lv_right_3_0= ruleAndExpr ) ) )* ) )
            // InternalDearCode.g:435:2: (this_AndExpr_0= ruleAndExpr ( () otherlv_2= 'o quiz\\u00E1s' ( (lv_right_3_0= ruleAndExpr ) ) )* )
            {
            // InternalDearCode.g:435:2: (this_AndExpr_0= ruleAndExpr ( () otherlv_2= 'o quiz\\u00E1s' ( (lv_right_3_0= ruleAndExpr ) ) )* )
            // InternalDearCode.g:436:3: this_AndExpr_0= ruleAndExpr ( () otherlv_2= 'o quiz\\u00E1s' ( (lv_right_3_0= ruleAndExpr ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrExprAccess().getAndExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            this_AndExpr_0=ruleAndExpr();

            state._fsp--;


            			current = this_AndExpr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDearCode.g:444:3: ( () otherlv_2= 'o quiz\\u00E1s' ( (lv_right_3_0= ruleAndExpr ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDearCode.g:445:4: () otherlv_2= 'o quiz\\u00E1s' ( (lv_right_3_0= ruleAndExpr ) )
            	    {
            	    // InternalDearCode.g:445:4: ()
            	    // InternalDearCode.g:446:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrExprAccess().getOrExprLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,16,FOLLOW_12); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrExprAccess().getOQuizSKeyword_1_1());
            	    			
            	    // InternalDearCode.g:456:4: ( (lv_right_3_0= ruleAndExpr ) )
            	    // InternalDearCode.g:457:5: (lv_right_3_0= ruleAndExpr )
            	    {
            	    // InternalDearCode.g:457:5: (lv_right_3_0= ruleAndExpr )
            	    // InternalDearCode.g:458:6: lv_right_3_0= ruleAndExpr
            	    {

            	    						newCompositeNode(grammarAccess.getOrExprAccess().getRightAndExprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_right_3_0=ruleAndExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrExprRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"edu.upb.lp.DearCode.AndExpr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrExpr"


    // $ANTLR start "entryRuleAndExpr"
    // InternalDearCode.g:480:1: entryRuleAndExpr returns [EObject current=null] : iv_ruleAndExpr= ruleAndExpr EOF ;
    public final EObject entryRuleAndExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpr = null;


        try {
            // InternalDearCode.g:480:48: (iv_ruleAndExpr= ruleAndExpr EOF )
            // InternalDearCode.g:481:2: iv_ruleAndExpr= ruleAndExpr EOF
            {
             newCompositeNode(grammarAccess.getAndExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndExpr=ruleAndExpr();

            state._fsp--;

             current =iv_ruleAndExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndExpr"


    // $ANTLR start "ruleAndExpr"
    // InternalDearCode.g:487:1: ruleAndExpr returns [EObject current=null] : (this_EqualityExpr_0= ruleEqualityExpr ( () otherlv_2= 'y tambi\\u00E9n' ( (lv_right_3_0= ruleEqualityExpr ) ) )* ) ;
    public final EObject ruleAndExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EqualityExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:493:2: ( (this_EqualityExpr_0= ruleEqualityExpr ( () otherlv_2= 'y tambi\\u00E9n' ( (lv_right_3_0= ruleEqualityExpr ) ) )* ) )
            // InternalDearCode.g:494:2: (this_EqualityExpr_0= ruleEqualityExpr ( () otherlv_2= 'y tambi\\u00E9n' ( (lv_right_3_0= ruleEqualityExpr ) ) )* )
            {
            // InternalDearCode.g:494:2: (this_EqualityExpr_0= ruleEqualityExpr ( () otherlv_2= 'y tambi\\u00E9n' ( (lv_right_3_0= ruleEqualityExpr ) ) )* )
            // InternalDearCode.g:495:3: this_EqualityExpr_0= ruleEqualityExpr ( () otherlv_2= 'y tambi\\u00E9n' ( (lv_right_3_0= ruleEqualityExpr ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExprAccess().getEqualityExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_EqualityExpr_0=ruleEqualityExpr();

            state._fsp--;


            			current = this_EqualityExpr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDearCode.g:503:3: ( () otherlv_2= 'y tambi\\u00E9n' ( (lv_right_3_0= ruleEqualityExpr ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDearCode.g:504:4: () otherlv_2= 'y tambi\\u00E9n' ( (lv_right_3_0= ruleEqualityExpr ) )
            	    {
            	    // InternalDearCode.g:504:4: ()
            	    // InternalDearCode.g:505:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndExprAccess().getAndExprLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,17,FOLLOW_12); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndExprAccess().getYTambiNKeyword_1_1());
            	    			
            	    // InternalDearCode.g:515:4: ( (lv_right_3_0= ruleEqualityExpr ) )
            	    // InternalDearCode.g:516:5: (lv_right_3_0= ruleEqualityExpr )
            	    {
            	    // InternalDearCode.g:516:5: (lv_right_3_0= ruleEqualityExpr )
            	    // InternalDearCode.g:517:6: lv_right_3_0= ruleEqualityExpr
            	    {

            	    						newCompositeNode(grammarAccess.getAndExprAccess().getRightEqualityExprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_right_3_0=ruleEqualityExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndExprRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"edu.upb.lp.DearCode.EqualityExpr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndExpr"


    // $ANTLR start "entryRuleEqualityExpr"
    // InternalDearCode.g:539:1: entryRuleEqualityExpr returns [EObject current=null] : iv_ruleEqualityExpr= ruleEqualityExpr EOF ;
    public final EObject entryRuleEqualityExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpr = null;


        try {
            // InternalDearCode.g:539:53: (iv_ruleEqualityExpr= ruleEqualityExpr EOF )
            // InternalDearCode.g:540:2: iv_ruleEqualityExpr= ruleEqualityExpr EOF
            {
             newCompositeNode(grammarAccess.getEqualityExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEqualityExpr=ruleEqualityExpr();

            state._fsp--;

             current =iv_ruleEqualityExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEqualityExpr"


    // $ANTLR start "ruleEqualityExpr"
    // InternalDearCode.g:546:1: ruleEqualityExpr returns [EObject current=null] : (this_RelationalExpr_0= ruleRelationalExpr ( () (otherlv_2= 'late al un\\u00EDsono con' | otherlv_3= 'canta con un matiz distinto a' ) ( (lv_right_4_0= ruleRelationalExpr ) ) )* ) ;
    public final EObject ruleEqualityExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_RelationalExpr_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:552:2: ( (this_RelationalExpr_0= ruleRelationalExpr ( () (otherlv_2= 'late al un\\u00EDsono con' | otherlv_3= 'canta con un matiz distinto a' ) ( (lv_right_4_0= ruleRelationalExpr ) ) )* ) )
            // InternalDearCode.g:553:2: (this_RelationalExpr_0= ruleRelationalExpr ( () (otherlv_2= 'late al un\\u00EDsono con' | otherlv_3= 'canta con un matiz distinto a' ) ( (lv_right_4_0= ruleRelationalExpr ) ) )* )
            {
            // InternalDearCode.g:553:2: (this_RelationalExpr_0= ruleRelationalExpr ( () (otherlv_2= 'late al un\\u00EDsono con' | otherlv_3= 'canta con un matiz distinto a' ) ( (lv_right_4_0= ruleRelationalExpr ) ) )* )
            // InternalDearCode.g:554:3: this_RelationalExpr_0= ruleRelationalExpr ( () (otherlv_2= 'late al un\\u00EDsono con' | otherlv_3= 'canta con un matiz distinto a' ) ( (lv_right_4_0= ruleRelationalExpr ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityExprAccess().getRelationalExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_RelationalExpr_0=ruleRelationalExpr();

            state._fsp--;


            			current = this_RelationalExpr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDearCode.g:562:3: ( () (otherlv_2= 'late al un\\u00EDsono con' | otherlv_3= 'canta con un matiz distinto a' ) ( (lv_right_4_0= ruleRelationalExpr ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=18 && LA7_0<=19)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDearCode.g:563:4: () (otherlv_2= 'late al un\\u00EDsono con' | otherlv_3= 'canta con un matiz distinto a' ) ( (lv_right_4_0= ruleRelationalExpr ) )
            	    {
            	    // InternalDearCode.g:563:4: ()
            	    // InternalDearCode.g:564:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualityExprAccess().getEqualityExprLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDearCode.g:570:4: (otherlv_2= 'late al un\\u00EDsono con' | otherlv_3= 'canta con un matiz distinto a' )
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==18) ) {
            	        alt6=1;
            	    }
            	    else if ( (LA6_0==19) ) {
            	        alt6=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalDearCode.g:571:5: otherlv_2= 'late al un\\u00EDsono con'
            	            {
            	            otherlv_2=(Token)match(input,18,FOLLOW_12); 

            	            					newLeafNode(otherlv_2, grammarAccess.getEqualityExprAccess().getLateAlUnSonoConKeyword_1_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalDearCode.g:576:5: otherlv_3= 'canta con un matiz distinto a'
            	            {
            	            otherlv_3=(Token)match(input,19,FOLLOW_12); 

            	            					newLeafNode(otherlv_3, grammarAccess.getEqualityExprAccess().getCantaConUnMatizDistintoAKeyword_1_1_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalDearCode.g:581:4: ( (lv_right_4_0= ruleRelationalExpr ) )
            	    // InternalDearCode.g:582:5: (lv_right_4_0= ruleRelationalExpr )
            	    {
            	    // InternalDearCode.g:582:5: (lv_right_4_0= ruleRelationalExpr )
            	    // InternalDearCode.g:583:6: lv_right_4_0= ruleRelationalExpr
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityExprAccess().getRightRelationalExprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_right_4_0=ruleRelationalExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEqualityExprRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_4_0,
            	    							"edu.upb.lp.DearCode.RelationalExpr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEqualityExpr"


    // $ANTLR start "entryRuleRelationalExpr"
    // InternalDearCode.g:605:1: entryRuleRelationalExpr returns [EObject current=null] : iv_ruleRelationalExpr= ruleRelationalExpr EOF ;
    public final EObject entryRuleRelationalExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpr = null;


        try {
            // InternalDearCode.g:605:55: (iv_ruleRelationalExpr= ruleRelationalExpr EOF )
            // InternalDearCode.g:606:2: iv_ruleRelationalExpr= ruleRelationalExpr EOF
            {
             newCompositeNode(grammarAccess.getRelationalExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationalExpr=ruleRelationalExpr();

            state._fsp--;

             current =iv_ruleRelationalExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationalExpr"


    // $ANTLR start "ruleRelationalExpr"
    // InternalDearCode.g:612:1: ruleRelationalExpr returns [EObject current=null] : (this_AdditiveExpr_0= ruleAdditiveExpr ( () (otherlv_2= 'susurra con menos fuerza que ' | otherlv_3= 'arde con mas pasion que' ) ( (lv_right_4_0= ruleAdditiveExpr ) ) )* ) ;
    public final EObject ruleRelationalExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_AdditiveExpr_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:618:2: ( (this_AdditiveExpr_0= ruleAdditiveExpr ( () (otherlv_2= 'susurra con menos fuerza que ' | otherlv_3= 'arde con mas pasion que' ) ( (lv_right_4_0= ruleAdditiveExpr ) ) )* ) )
            // InternalDearCode.g:619:2: (this_AdditiveExpr_0= ruleAdditiveExpr ( () (otherlv_2= 'susurra con menos fuerza que ' | otherlv_3= 'arde con mas pasion que' ) ( (lv_right_4_0= ruleAdditiveExpr ) ) )* )
            {
            // InternalDearCode.g:619:2: (this_AdditiveExpr_0= ruleAdditiveExpr ( () (otherlv_2= 'susurra con menos fuerza que ' | otherlv_3= 'arde con mas pasion que' ) ( (lv_right_4_0= ruleAdditiveExpr ) ) )* )
            // InternalDearCode.g:620:3: this_AdditiveExpr_0= ruleAdditiveExpr ( () (otherlv_2= 'susurra con menos fuerza que ' | otherlv_3= 'arde con mas pasion que' ) ( (lv_right_4_0= ruleAdditiveExpr ) ) )*
            {

            			newCompositeNode(grammarAccess.getRelationalExprAccess().getAdditiveExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
            this_AdditiveExpr_0=ruleAdditiveExpr();

            state._fsp--;


            			current = this_AdditiveExpr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDearCode.g:628:3: ( () (otherlv_2= 'susurra con menos fuerza que ' | otherlv_3= 'arde con mas pasion que' ) ( (lv_right_4_0= ruleAdditiveExpr ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=20 && LA9_0<=21)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDearCode.g:629:4: () (otherlv_2= 'susurra con menos fuerza que ' | otherlv_3= 'arde con mas pasion que' ) ( (lv_right_4_0= ruleAdditiveExpr ) )
            	    {
            	    // InternalDearCode.g:629:4: ()
            	    // InternalDearCode.g:630:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getRelationalExprAccess().getRelationalExprLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDearCode.g:636:4: (otherlv_2= 'susurra con menos fuerza que ' | otherlv_3= 'arde con mas pasion que' )
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==20) ) {
            	        alt8=1;
            	    }
            	    else if ( (LA8_0==21) ) {
            	        alt8=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 8, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // InternalDearCode.g:637:5: otherlv_2= 'susurra con menos fuerza que '
            	            {
            	            otherlv_2=(Token)match(input,20,FOLLOW_12); 

            	            					newLeafNode(otherlv_2, grammarAccess.getRelationalExprAccess().getSusurraConMenosFuerzaQueKeyword_1_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalDearCode.g:642:5: otherlv_3= 'arde con mas pasion que'
            	            {
            	            otherlv_3=(Token)match(input,21,FOLLOW_12); 

            	            					newLeafNode(otherlv_3, grammarAccess.getRelationalExprAccess().getArdeConMasPasionQueKeyword_1_1_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalDearCode.g:647:4: ( (lv_right_4_0= ruleAdditiveExpr ) )
            	    // InternalDearCode.g:648:5: (lv_right_4_0= ruleAdditiveExpr )
            	    {
            	    // InternalDearCode.g:648:5: (lv_right_4_0= ruleAdditiveExpr )
            	    // InternalDearCode.g:649:6: lv_right_4_0= ruleAdditiveExpr
            	    {

            	    						newCompositeNode(grammarAccess.getRelationalExprAccess().getRightAdditiveExprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_right_4_0=ruleAdditiveExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRelationalExprRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_4_0,
            	    							"edu.upb.lp.DearCode.AdditiveExpr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationalExpr"


    // $ANTLR start "entryRuleAdditiveExpr"
    // InternalDearCode.g:671:1: entryRuleAdditiveExpr returns [EObject current=null] : iv_ruleAdditiveExpr= ruleAdditiveExpr EOF ;
    public final EObject entryRuleAdditiveExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpr = null;


        try {
            // InternalDearCode.g:671:53: (iv_ruleAdditiveExpr= ruleAdditiveExpr EOF )
            // InternalDearCode.g:672:2: iv_ruleAdditiveExpr= ruleAdditiveExpr EOF
            {
             newCompositeNode(grammarAccess.getAdditiveExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdditiveExpr=ruleAdditiveExpr();

            state._fsp--;

             current =iv_ruleAdditiveExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditiveExpr"


    // $ANTLR start "ruleAdditiveExpr"
    // InternalDearCode.g:678:1: ruleAdditiveExpr returns [EObject current=null] : (this_MultiplicativeExpr_0= ruleMultiplicativeExpr ( () (otherlv_2= 'unidos en un solo suspiro con' | otherlv_3= 'fundidos en la llama de' ) ( (lv_right_4_0= ruleMultiplicativeExpr ) ) )* ) ;
    public final EObject ruleAdditiveExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_MultiplicativeExpr_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:684:2: ( (this_MultiplicativeExpr_0= ruleMultiplicativeExpr ( () (otherlv_2= 'unidos en un solo suspiro con' | otherlv_3= 'fundidos en la llama de' ) ( (lv_right_4_0= ruleMultiplicativeExpr ) ) )* ) )
            // InternalDearCode.g:685:2: (this_MultiplicativeExpr_0= ruleMultiplicativeExpr ( () (otherlv_2= 'unidos en un solo suspiro con' | otherlv_3= 'fundidos en la llama de' ) ( (lv_right_4_0= ruleMultiplicativeExpr ) ) )* )
            {
            // InternalDearCode.g:685:2: (this_MultiplicativeExpr_0= ruleMultiplicativeExpr ( () (otherlv_2= 'unidos en un solo suspiro con' | otherlv_3= 'fundidos en la llama de' ) ( (lv_right_4_0= ruleMultiplicativeExpr ) ) )* )
            // InternalDearCode.g:686:3: this_MultiplicativeExpr_0= ruleMultiplicativeExpr ( () (otherlv_2= 'unidos en un solo suspiro con' | otherlv_3= 'fundidos en la llama de' ) ( (lv_right_4_0= ruleMultiplicativeExpr ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditiveExprAccess().getMultiplicativeExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_MultiplicativeExpr_0=ruleMultiplicativeExpr();

            state._fsp--;


            			current = this_MultiplicativeExpr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDearCode.g:694:3: ( () (otherlv_2= 'unidos en un solo suspiro con' | otherlv_3= 'fundidos en la llama de' ) ( (lv_right_4_0= ruleMultiplicativeExpr ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=22 && LA11_0<=23)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDearCode.g:695:4: () (otherlv_2= 'unidos en un solo suspiro con' | otherlv_3= 'fundidos en la llama de' ) ( (lv_right_4_0= ruleMultiplicativeExpr ) )
            	    {
            	    // InternalDearCode.g:695:4: ()
            	    // InternalDearCode.g:696:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditiveExprAccess().getAdditiveExprLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDearCode.g:702:4: (otherlv_2= 'unidos en un solo suspiro con' | otherlv_3= 'fundidos en la llama de' )
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==22) ) {
            	        alt10=1;
            	    }
            	    else if ( (LA10_0==23) ) {
            	        alt10=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalDearCode.g:703:5: otherlv_2= 'unidos en un solo suspiro con'
            	            {
            	            otherlv_2=(Token)match(input,22,FOLLOW_12); 

            	            					newLeafNode(otherlv_2, grammarAccess.getAdditiveExprAccess().getUnidosEnUnSoloSuspiroConKeyword_1_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalDearCode.g:708:5: otherlv_3= 'fundidos en la llama de'
            	            {
            	            otherlv_3=(Token)match(input,23,FOLLOW_12); 

            	            					newLeafNode(otherlv_3, grammarAccess.getAdditiveExprAccess().getFundidosEnLaLlamaDeKeyword_1_1_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalDearCode.g:713:4: ( (lv_right_4_0= ruleMultiplicativeExpr ) )
            	    // InternalDearCode.g:714:5: (lv_right_4_0= ruleMultiplicativeExpr )
            	    {
            	    // InternalDearCode.g:714:5: (lv_right_4_0= ruleMultiplicativeExpr )
            	    // InternalDearCode.g:715:6: lv_right_4_0= ruleMultiplicativeExpr
            	    {

            	    						newCompositeNode(grammarAccess.getAdditiveExprAccess().getRightMultiplicativeExprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_right_4_0=ruleMultiplicativeExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditiveExprRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_4_0,
            	    							"edu.upb.lp.DearCode.MultiplicativeExpr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditiveExpr"


    // $ANTLR start "entryRuleMultiplicativeExpr"
    // InternalDearCode.g:737:1: entryRuleMultiplicativeExpr returns [EObject current=null] : iv_ruleMultiplicativeExpr= ruleMultiplicativeExpr EOF ;
    public final EObject entryRuleMultiplicativeExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpr = null;


        try {
            // InternalDearCode.g:737:59: (iv_ruleMultiplicativeExpr= ruleMultiplicativeExpr EOF )
            // InternalDearCode.g:738:2: iv_ruleMultiplicativeExpr= ruleMultiplicativeExpr EOF
            {
             newCompositeNode(grammarAccess.getMultiplicativeExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicativeExpr=ruleMultiplicativeExpr();

            state._fsp--;

             current =iv_ruleMultiplicativeExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicativeExpr"


    // $ANTLR start "ruleMultiplicativeExpr"
    // InternalDearCode.g:744:1: ruleMultiplicativeExpr returns [EObject current=null] : (this_UnaryExpr_0= ruleUnaryExpr ( () (otherlv_2= 'fortalecidos por el fuego de' | otherlv_3= 'Separados entre los ecos de' ) ( (lv_right_4_0= ruleUnaryExpr ) ) )* ) ;
    public final EObject ruleMultiplicativeExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_UnaryExpr_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:750:2: ( (this_UnaryExpr_0= ruleUnaryExpr ( () (otherlv_2= 'fortalecidos por el fuego de' | otherlv_3= 'Separados entre los ecos de' ) ( (lv_right_4_0= ruleUnaryExpr ) ) )* ) )
            // InternalDearCode.g:751:2: (this_UnaryExpr_0= ruleUnaryExpr ( () (otherlv_2= 'fortalecidos por el fuego de' | otherlv_3= 'Separados entre los ecos de' ) ( (lv_right_4_0= ruleUnaryExpr ) ) )* )
            {
            // InternalDearCode.g:751:2: (this_UnaryExpr_0= ruleUnaryExpr ( () (otherlv_2= 'fortalecidos por el fuego de' | otherlv_3= 'Separados entre los ecos de' ) ( (lv_right_4_0= ruleUnaryExpr ) ) )* )
            // InternalDearCode.g:752:3: this_UnaryExpr_0= ruleUnaryExpr ( () (otherlv_2= 'fortalecidos por el fuego de' | otherlv_3= 'Separados entre los ecos de' ) ( (lv_right_4_0= ruleUnaryExpr ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicativeExprAccess().getUnaryExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_UnaryExpr_0=ruleUnaryExpr();

            state._fsp--;


            			current = this_UnaryExpr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDearCode.g:760:3: ( () (otherlv_2= 'fortalecidos por el fuego de' | otherlv_3= 'Separados entre los ecos de' ) ( (lv_right_4_0= ruleUnaryExpr ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=24 && LA13_0<=25)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDearCode.g:761:4: () (otherlv_2= 'fortalecidos por el fuego de' | otherlv_3= 'Separados entre los ecos de' ) ( (lv_right_4_0= ruleUnaryExpr ) )
            	    {
            	    // InternalDearCode.g:761:4: ()
            	    // InternalDearCode.g:762:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicativeExprAccess().getMultiplicativeExprLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDearCode.g:768:4: (otherlv_2= 'fortalecidos por el fuego de' | otherlv_3= 'Separados entre los ecos de' )
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==24) ) {
            	        alt12=1;
            	    }
            	    else if ( (LA12_0==25) ) {
            	        alt12=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // InternalDearCode.g:769:5: otherlv_2= 'fortalecidos por el fuego de'
            	            {
            	            otherlv_2=(Token)match(input,24,FOLLOW_12); 

            	            					newLeafNode(otherlv_2, grammarAccess.getMultiplicativeExprAccess().getFortalecidosPorElFuegoDeKeyword_1_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalDearCode.g:774:5: otherlv_3= 'Separados entre los ecos de'
            	            {
            	            otherlv_3=(Token)match(input,25,FOLLOW_12); 

            	            					newLeafNode(otherlv_3, grammarAccess.getMultiplicativeExprAccess().getSeparadosEntreLosEcosDeKeyword_1_1_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalDearCode.g:779:4: ( (lv_right_4_0= ruleUnaryExpr ) )
            	    // InternalDearCode.g:780:5: (lv_right_4_0= ruleUnaryExpr )
            	    {
            	    // InternalDearCode.g:780:5: (lv_right_4_0= ruleUnaryExpr )
            	    // InternalDearCode.g:781:6: lv_right_4_0= ruleUnaryExpr
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicativeExprAccess().getRightUnaryExprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_right_4_0=ruleUnaryExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicativeExprRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_4_0,
            	    							"edu.upb.lp.DearCode.UnaryExpr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicativeExpr"


    // $ANTLR start "entryRuleUnaryExpr"
    // InternalDearCode.g:803:1: entryRuleUnaryExpr returns [EObject current=null] : iv_ruleUnaryExpr= ruleUnaryExpr EOF ;
    public final EObject entryRuleUnaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpr = null;


        try {
            // InternalDearCode.g:803:50: (iv_ruleUnaryExpr= ruleUnaryExpr EOF )
            // InternalDearCode.g:804:2: iv_ruleUnaryExpr= ruleUnaryExpr EOF
            {
             newCompositeNode(grammarAccess.getUnaryExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnaryExpr=ruleUnaryExpr();

            state._fsp--;

             current =iv_ruleUnaryExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryExpr"


    // $ANTLR start "ruleUnaryExpr"
    // InternalDearCode.g:810:1: ruleUnaryExpr returns [EObject current=null] : ( ( () otherlv_1= 'no lo creo' ( (lv_expr_2_0= rulePrimaryExpr ) ) ) | this_PrimaryExpr_3= rulePrimaryExpr ) ;
    public final EObject ruleUnaryExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;

        EObject this_PrimaryExpr_3 = null;



        	enterRule();

        try {
            // InternalDearCode.g:816:2: ( ( ( () otherlv_1= 'no lo creo' ( (lv_expr_2_0= rulePrimaryExpr ) ) ) | this_PrimaryExpr_3= rulePrimaryExpr ) )
            // InternalDearCode.g:817:2: ( ( () otherlv_1= 'no lo creo' ( (lv_expr_2_0= rulePrimaryExpr ) ) ) | this_PrimaryExpr_3= rulePrimaryExpr )
            {
            // InternalDearCode.g:817:2: ( ( () otherlv_1= 'no lo creo' ( (lv_expr_2_0= rulePrimaryExpr ) ) ) | this_PrimaryExpr_3= rulePrimaryExpr )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_STRING)||LA14_0==27||(LA14_0>=29 && LA14_0<=32)) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalDearCode.g:818:3: ( () otherlv_1= 'no lo creo' ( (lv_expr_2_0= rulePrimaryExpr ) ) )
                    {
                    // InternalDearCode.g:818:3: ( () otherlv_1= 'no lo creo' ( (lv_expr_2_0= rulePrimaryExpr ) ) )
                    // InternalDearCode.g:819:4: () otherlv_1= 'no lo creo' ( (lv_expr_2_0= rulePrimaryExpr ) )
                    {
                    // InternalDearCode.g:819:4: ()
                    // InternalDearCode.g:820:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryExprAccess().getNotExprAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,26,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getUnaryExprAccess().getNoLoCreoKeyword_0_1());
                    			
                    // InternalDearCode.g:830:4: ( (lv_expr_2_0= rulePrimaryExpr ) )
                    // InternalDearCode.g:831:5: (lv_expr_2_0= rulePrimaryExpr )
                    {
                    // InternalDearCode.g:831:5: (lv_expr_2_0= rulePrimaryExpr )
                    // InternalDearCode.g:832:6: lv_expr_2_0= rulePrimaryExpr
                    {

                    						newCompositeNode(grammarAccess.getUnaryExprAccess().getExprPrimaryExprParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expr_2_0=rulePrimaryExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnaryExprRule());
                    						}
                    						set(
                    							current,
                    							"expr",
                    							lv_expr_2_0,
                    							"edu.upb.lp.DearCode.PrimaryExpr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDearCode.g:851:3: this_PrimaryExpr_3= rulePrimaryExpr
                    {

                    			newCompositeNode(grammarAccess.getUnaryExprAccess().getPrimaryExprParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimaryExpr_3=rulePrimaryExpr();

                    state._fsp--;


                    			current = this_PrimaryExpr_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryExpr"


    // $ANTLR start "entryRulePrimaryExpr"
    // InternalDearCode.g:863:1: entryRulePrimaryExpr returns [EObject current=null] : iv_rulePrimaryExpr= rulePrimaryExpr EOF ;
    public final EObject entryRulePrimaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpr = null;


        try {
            // InternalDearCode.g:863:52: (iv_rulePrimaryExpr= rulePrimaryExpr EOF )
            // InternalDearCode.g:864:2: iv_rulePrimaryExpr= rulePrimaryExpr EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExprRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpr=rulePrimaryExpr();

            state._fsp--;

             current =iv_rulePrimaryExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpr"


    // $ANTLR start "rulePrimaryExpr"
    // InternalDearCode.g:870:1: rulePrimaryExpr returns [EObject current=null] : (this_Literal_0= ruleLiteral | this_VariableRef_1= ruleVariableRef | this_SpecialBoolean_2= ruleSpecialBoolean | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) ) ;
    public final EObject rulePrimaryExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_Literal_0 = null;

        EObject this_VariableRef_1 = null;

        EObject this_SpecialBoolean_2 = null;

        EObject this_Expression_4 = null;



        	enterRule();

        try {
            // InternalDearCode.g:876:2: ( (this_Literal_0= ruleLiteral | this_VariableRef_1= ruleVariableRef | this_SpecialBoolean_2= ruleSpecialBoolean | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) ) )
            // InternalDearCode.g:877:2: (this_Literal_0= ruleLiteral | this_VariableRef_1= ruleVariableRef | this_SpecialBoolean_2= ruleSpecialBoolean | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) )
            {
            // InternalDearCode.g:877:2: (this_Literal_0= ruleLiteral | this_VariableRef_1= ruleVariableRef | this_SpecialBoolean_2= ruleSpecialBoolean | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_STRING:
            case 29:
            case 30:
                {
                alt15=1;
                }
                break;
            case RULE_ID:
                {
                alt15=2;
                }
                break;
            case 31:
            case 32:
                {
                alt15=3;
                }
                break;
            case 27:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalDearCode.g:878:3: this_Literal_0= ruleLiteral
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExprAccess().getLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Literal_0=ruleLiteral();

                    state._fsp--;


                    			current = this_Literal_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:887:3: this_VariableRef_1= ruleVariableRef
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExprAccess().getVariableRefParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableRef_1=ruleVariableRef();

                    state._fsp--;


                    			current = this_VariableRef_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDearCode.g:896:3: this_SpecialBoolean_2= ruleSpecialBoolean
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExprAccess().getSpecialBooleanParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SpecialBoolean_2=ruleSpecialBoolean();

                    state._fsp--;


                    			current = this_SpecialBoolean_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDearCode.g:905:3: (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' )
                    {
                    // InternalDearCode.g:905:3: (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' )
                    // InternalDearCode.g:906:4: otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryExprAccess().getLeftParenthesisKeyword_3_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExprAccess().getExpressionParserRuleCall_3_1());
                    			
                    pushFollow(FOLLOW_18);
                    this_Expression_4=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_4;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_5=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getPrimaryExprAccess().getRightParenthesisKeyword_3_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpr"


    // $ANTLR start "entryRuleLiteral"
    // InternalDearCode.g:927:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalDearCode.g:927:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalDearCode.g:928:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalDearCode.g:934:1: ruleLiteral returns [EObject current=null] : (this_IntLiteral_0= ruleIntLiteral | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_IntLiteral_0 = null;

        EObject this_StringLiteral_1 = null;

        EObject this_BooleanLiteral_2 = null;



        	enterRule();

        try {
            // InternalDearCode.g:940:2: ( (this_IntLiteral_0= ruleIntLiteral | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral ) )
            // InternalDearCode.g:941:2: (this_IntLiteral_0= ruleIntLiteral | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral )
            {
            // InternalDearCode.g:941:2: (this_IntLiteral_0= ruleIntLiteral | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral )
            int alt16=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt16=1;
                }
                break;
            case RULE_STRING:
                {
                alt16=2;
                }
                break;
            case 29:
            case 30:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalDearCode.g:942:3: this_IntLiteral_0= ruleIntLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntLiteral_0=ruleIntLiteral();

                    state._fsp--;


                    			current = this_IntLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:951:3: this_StringLiteral_1= ruleStringLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringLiteral_1=ruleStringLiteral();

                    state._fsp--;


                    			current = this_StringLiteral_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDearCode.g:960:3: this_BooleanLiteral_2= ruleBooleanLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanLiteral_2=ruleBooleanLiteral();

                    state._fsp--;


                    			current = this_BooleanLiteral_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalDearCode.g:972:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalDearCode.g:972:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalDearCode.g:973:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;

             current =iv_ruleIntLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalDearCode.g:979:1: ruleIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalDearCode.g:985:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalDearCode.g:986:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalDearCode.g:986:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // InternalDearCode.g:987:3: () ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalDearCode.g:987:3: ()
            // InternalDearCode.g:988:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntLiteralAccess().getIntLiteralAction_0(),
            					current);
            			

            }

            // InternalDearCode.g:994:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalDearCode.g:995:4: (lv_value_1_0= RULE_INT )
            {
            // InternalDearCode.g:995:4: (lv_value_1_0= RULE_INT )
            // InternalDearCode.g:996:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntLiteralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalDearCode.g:1016:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalDearCode.g:1016:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalDearCode.g:1017:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalDearCode.g:1023:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalDearCode.g:1029:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalDearCode.g:1030:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalDearCode.g:1030:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalDearCode.g:1031:3: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalDearCode.g:1031:3: ()
            // InternalDearCode.g:1032:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
            					current);
            			

            }

            // InternalDearCode.g:1038:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalDearCode.g:1039:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalDearCode.g:1039:4: (lv_value_1_0= RULE_STRING )
            // InternalDearCode.g:1040:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringLiteralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // InternalDearCode.g:1060:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalDearCode.g:1060:55: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalDearCode.g:1061:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
             newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;

             current =iv_ruleBooleanLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // InternalDearCode.g:1067:1: ruleBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_1= 'siempre' | lv_value_1_2= 'jam\\u00E1s' ) ) ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_1=null;
        Token lv_value_1_2=null;


        	enterRule();

        try {
            // InternalDearCode.g:1073:2: ( ( () ( ( (lv_value_1_1= 'siempre' | lv_value_1_2= 'jam\\u00E1s' ) ) ) ) )
            // InternalDearCode.g:1074:2: ( () ( ( (lv_value_1_1= 'siempre' | lv_value_1_2= 'jam\\u00E1s' ) ) ) )
            {
            // InternalDearCode.g:1074:2: ( () ( ( (lv_value_1_1= 'siempre' | lv_value_1_2= 'jam\\u00E1s' ) ) ) )
            // InternalDearCode.g:1075:3: () ( ( (lv_value_1_1= 'siempre' | lv_value_1_2= 'jam\\u00E1s' ) ) )
            {
            // InternalDearCode.g:1075:3: ()
            // InternalDearCode.g:1076:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0(),
            					current);
            			

            }

            // InternalDearCode.g:1082:3: ( ( (lv_value_1_1= 'siempre' | lv_value_1_2= 'jam\\u00E1s' ) ) )
            // InternalDearCode.g:1083:4: ( (lv_value_1_1= 'siempre' | lv_value_1_2= 'jam\\u00E1s' ) )
            {
            // InternalDearCode.g:1083:4: ( (lv_value_1_1= 'siempre' | lv_value_1_2= 'jam\\u00E1s' ) )
            // InternalDearCode.g:1084:5: (lv_value_1_1= 'siempre' | lv_value_1_2= 'jam\\u00E1s' )
            {
            // InternalDearCode.g:1084:5: (lv_value_1_1= 'siempre' | lv_value_1_2= 'jam\\u00E1s' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            else if ( (LA17_0==30) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalDearCode.g:1085:6: lv_value_1_1= 'siempre'
                    {
                    lv_value_1_1=(Token)match(input,29,FOLLOW_2); 

                    						newLeafNode(lv_value_1_1, grammarAccess.getBooleanLiteralAccess().getValueSiempreKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBooleanLiteralRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:1096:6: lv_value_1_2= 'jam\\u00E1s'
                    {
                    lv_value_1_2=(Token)match(input,30,FOLLOW_2); 

                    						newLeafNode(lv_value_1_2, grammarAccess.getBooleanLiteralAccess().getValueJamSKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBooleanLiteralRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_1_2, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleVariableRef"
    // InternalDearCode.g:1113:1: entryRuleVariableRef returns [EObject current=null] : iv_ruleVariableRef= ruleVariableRef EOF ;
    public final EObject entryRuleVariableRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableRef = null;


        try {
            // InternalDearCode.g:1113:52: (iv_ruleVariableRef= ruleVariableRef EOF )
            // InternalDearCode.g:1114:2: iv_ruleVariableRef= ruleVariableRef EOF
            {
             newCompositeNode(grammarAccess.getVariableRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableRef=ruleVariableRef();

            state._fsp--;

             current =iv_ruleVariableRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableRef"


    // $ANTLR start "ruleVariableRef"
    // InternalDearCode.g:1120:1: ruleVariableRef returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariableRef() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDearCode.g:1126:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalDearCode.g:1127:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalDearCode.g:1127:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDearCode.g:1128:3: (lv_name_0_0= RULE_ID )
            {
            // InternalDearCode.g:1128:3: (lv_name_0_0= RULE_ID )
            // InternalDearCode.g:1129:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getVariableRefAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableRefRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableRef"


    // $ANTLR start "entryRuleSpecialBoolean"
    // InternalDearCode.g:1148:1: entryRuleSpecialBoolean returns [EObject current=null] : iv_ruleSpecialBoolean= ruleSpecialBoolean EOF ;
    public final EObject entryRuleSpecialBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecialBoolean = null;


        try {
            // InternalDearCode.g:1148:55: (iv_ruleSpecialBoolean= ruleSpecialBoolean EOF )
            // InternalDearCode.g:1149:2: iv_ruleSpecialBoolean= ruleSpecialBoolean EOF
            {
             newCompositeNode(grammarAccess.getSpecialBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpecialBoolean=ruleSpecialBoolean();

            state._fsp--;

             current =iv_ruleSpecialBoolean; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpecialBoolean"


    // $ANTLR start "ruleSpecialBoolean"
    // InternalDearCode.g:1155:1: ruleSpecialBoolean returns [EObject current=null] : (otherlv_0= 'a\\u00FAn me piensas' | otherlv_1= 'tu voz me alcanza' ) ;
    public final EObject ruleSpecialBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDearCode.g:1161:2: ( (otherlv_0= 'a\\u00FAn me piensas' | otherlv_1= 'tu voz me alcanza' ) )
            // InternalDearCode.g:1162:2: (otherlv_0= 'a\\u00FAn me piensas' | otherlv_1= 'tu voz me alcanza' )
            {
            // InternalDearCode.g:1162:2: (otherlv_0= 'a\\u00FAn me piensas' | otherlv_1= 'tu voz me alcanza' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            else if ( (LA18_0==32) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalDearCode.g:1163:3: otherlv_0= 'a\\u00FAn me piensas'
                    {
                    otherlv_0=(Token)match(input,31,FOLLOW_2); 

                    			newLeafNode(otherlv_0, grammarAccess.getSpecialBooleanAccess().getANMePiensasKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:1168:3: otherlv_1= 'tu voz me alcanza'
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_2); 

                    			newLeafNode(otherlv_1, grammarAccess.getSpecialBooleanAccess().getTuVozMeAlcanzaKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpecialBoolean"


    // $ANTLR start "entryRuleCondicional"
    // InternalDearCode.g:1176:1: entryRuleCondicional returns [EObject current=null] : iv_ruleCondicional= ruleCondicional EOF ;
    public final EObject entryRuleCondicional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondicional = null;


        try {
            // InternalDearCode.g:1176:52: (iv_ruleCondicional= ruleCondicional EOF )
            // InternalDearCode.g:1177:2: iv_ruleCondicional= ruleCondicional EOF
            {
             newCompositeNode(grammarAccess.getCondicionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondicional=ruleCondicional();

            state._fsp--;

             current =iv_ruleCondicional; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondicional"


    // $ANTLR start "ruleCondicional"
    // InternalDearCode.g:1183:1: ruleCondicional returns [EObject current=null] : ( (otherlv_0= 'Si en tu corazon sientes que' | otherlv_1= 'Si en tu alma nace el deseo de que' ) ( (lv_condicion_2_0= ruleCondicion ) ) otherlv_3= ',' ( (lv_accion_4_0= ruleInstruccion ) ) (otherlv_5= 'Y si el destino dijera lo contrario,' ( (lv_accionElse_6_0= ruleInstruccion ) ) )? ) ;
    public final EObject ruleCondicional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_condicion_2_0 = null;

        EObject lv_accion_4_0 = null;

        EObject lv_accionElse_6_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:1189:2: ( ( (otherlv_0= 'Si en tu corazon sientes que' | otherlv_1= 'Si en tu alma nace el deseo de que' ) ( (lv_condicion_2_0= ruleCondicion ) ) otherlv_3= ',' ( (lv_accion_4_0= ruleInstruccion ) ) (otherlv_5= 'Y si el destino dijera lo contrario,' ( (lv_accionElse_6_0= ruleInstruccion ) ) )? ) )
            // InternalDearCode.g:1190:2: ( (otherlv_0= 'Si en tu corazon sientes que' | otherlv_1= 'Si en tu alma nace el deseo de que' ) ( (lv_condicion_2_0= ruleCondicion ) ) otherlv_3= ',' ( (lv_accion_4_0= ruleInstruccion ) ) (otherlv_5= 'Y si el destino dijera lo contrario,' ( (lv_accionElse_6_0= ruleInstruccion ) ) )? )
            {
            // InternalDearCode.g:1190:2: ( (otherlv_0= 'Si en tu corazon sientes que' | otherlv_1= 'Si en tu alma nace el deseo de que' ) ( (lv_condicion_2_0= ruleCondicion ) ) otherlv_3= ',' ( (lv_accion_4_0= ruleInstruccion ) ) (otherlv_5= 'Y si el destino dijera lo contrario,' ( (lv_accionElse_6_0= ruleInstruccion ) ) )? )
            // InternalDearCode.g:1191:3: (otherlv_0= 'Si en tu corazon sientes que' | otherlv_1= 'Si en tu alma nace el deseo de que' ) ( (lv_condicion_2_0= ruleCondicion ) ) otherlv_3= ',' ( (lv_accion_4_0= ruleInstruccion ) ) (otherlv_5= 'Y si el destino dijera lo contrario,' ( (lv_accionElse_6_0= ruleInstruccion ) ) )?
            {
            // InternalDearCode.g:1191:3: (otherlv_0= 'Si en tu corazon sientes que' | otherlv_1= 'Si en tu alma nace el deseo de que' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            else if ( (LA19_0==34) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalDearCode.g:1192:4: otherlv_0= 'Si en tu corazon sientes que'
                    {
                    otherlv_0=(Token)match(input,33,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getCondicionalAccess().getSiEnTuCorazonSientesQueKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:1197:4: otherlv_1= 'Si en tu alma nace el deseo de que'
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getCondicionalAccess().getSiEnTuAlmaNaceElDeseoDeQueKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalDearCode.g:1202:3: ( (lv_condicion_2_0= ruleCondicion ) )
            // InternalDearCode.g:1203:4: (lv_condicion_2_0= ruleCondicion )
            {
            // InternalDearCode.g:1203:4: (lv_condicion_2_0= ruleCondicion )
            // InternalDearCode.g:1204:5: lv_condicion_2_0= ruleCondicion
            {

            					newCompositeNode(grammarAccess.getCondicionalAccess().getCondicionCondicionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_condicion_2_0=ruleCondicion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCondicionalRule());
            					}
            					set(
            						current,
            						"condicion",
            						lv_condicion_2_0,
            						"edu.upb.lp.DearCode.Condicion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getCondicionalAccess().getCommaKeyword_2());
            		
            // InternalDearCode.g:1225:3: ( (lv_accion_4_0= ruleInstruccion ) )
            // InternalDearCode.g:1226:4: (lv_accion_4_0= ruleInstruccion )
            {
            // InternalDearCode.g:1226:4: (lv_accion_4_0= ruleInstruccion )
            // InternalDearCode.g:1227:5: lv_accion_4_0= ruleInstruccion
            {

            					newCompositeNode(grammarAccess.getCondicionalAccess().getAccionInstruccionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_accion_4_0=ruleInstruccion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCondicionalRule());
            					}
            					set(
            						current,
            						"accion",
            						lv_accion_4_0,
            						"edu.upb.lp.DearCode.Instruccion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDearCode.g:1244:3: (otherlv_5= 'Y si el destino dijera lo contrario,' ( (lv_accionElse_6_0= ruleInstruccion ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDearCode.g:1245:4: otherlv_5= 'Y si el destino dijera lo contrario,' ( (lv_accionElse_6_0= ruleInstruccion ) )
                    {
                    otherlv_5=(Token)match(input,36,FOLLOW_20); 

                    				newLeafNode(otherlv_5, grammarAccess.getCondicionalAccess().getYSiElDestinoDijeraLoContrarioKeyword_4_0());
                    			
                    // InternalDearCode.g:1249:4: ( (lv_accionElse_6_0= ruleInstruccion ) )
                    // InternalDearCode.g:1250:5: (lv_accionElse_6_0= ruleInstruccion )
                    {
                    // InternalDearCode.g:1250:5: (lv_accionElse_6_0= ruleInstruccion )
                    // InternalDearCode.g:1251:6: lv_accionElse_6_0= ruleInstruccion
                    {

                    						newCompositeNode(grammarAccess.getCondicionalAccess().getAccionElseInstruccionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_accionElse_6_0=ruleInstruccion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCondicionalRule());
                    						}
                    						set(
                    							current,
                    							"accionElse",
                    							lv_accionElse_6_0,
                    							"edu.upb.lp.DearCode.Instruccion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondicional"


    // $ANTLR start "entryRuleBucleWhile"
    // InternalDearCode.g:1273:1: entryRuleBucleWhile returns [EObject current=null] : iv_ruleBucleWhile= ruleBucleWhile EOF ;
    public final EObject entryRuleBucleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBucleWhile = null;


        try {
            // InternalDearCode.g:1273:51: (iv_ruleBucleWhile= ruleBucleWhile EOF )
            // InternalDearCode.g:1274:2: iv_ruleBucleWhile= ruleBucleWhile EOF
            {
             newCompositeNode(grammarAccess.getBucleWhileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBucleWhile=ruleBucleWhile();

            state._fsp--;

             current =iv_ruleBucleWhile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBucleWhile"


    // $ANTLR start "ruleBucleWhile"
    // InternalDearCode.g:1280:1: ruleBucleWhile returns [EObject current=null] : ( (otherlv_0= 'Mientras aun me pienses' | otherlv_1= 'Mientras a\\u00FAn sue\\u00F1es con este momento, haz que ocurra' ) ( (lv_condicion_2_0= ruleCondicion ) ) otherlv_3= ',' ( (lv_accion_4_0= ruleInstruccion ) ) ) ;
    public final EObject ruleBucleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condicion_2_0 = null;

        EObject lv_accion_4_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:1286:2: ( ( (otherlv_0= 'Mientras aun me pienses' | otherlv_1= 'Mientras a\\u00FAn sue\\u00F1es con este momento, haz que ocurra' ) ( (lv_condicion_2_0= ruleCondicion ) ) otherlv_3= ',' ( (lv_accion_4_0= ruleInstruccion ) ) ) )
            // InternalDearCode.g:1287:2: ( (otherlv_0= 'Mientras aun me pienses' | otherlv_1= 'Mientras a\\u00FAn sue\\u00F1es con este momento, haz que ocurra' ) ( (lv_condicion_2_0= ruleCondicion ) ) otherlv_3= ',' ( (lv_accion_4_0= ruleInstruccion ) ) )
            {
            // InternalDearCode.g:1287:2: ( (otherlv_0= 'Mientras aun me pienses' | otherlv_1= 'Mientras a\\u00FAn sue\\u00F1es con este momento, haz que ocurra' ) ( (lv_condicion_2_0= ruleCondicion ) ) otherlv_3= ',' ( (lv_accion_4_0= ruleInstruccion ) ) )
            // InternalDearCode.g:1288:3: (otherlv_0= 'Mientras aun me pienses' | otherlv_1= 'Mientras a\\u00FAn sue\\u00F1es con este momento, haz que ocurra' ) ( (lv_condicion_2_0= ruleCondicion ) ) otherlv_3= ',' ( (lv_accion_4_0= ruleInstruccion ) )
            {
            // InternalDearCode.g:1288:3: (otherlv_0= 'Mientras aun me pienses' | otherlv_1= 'Mientras a\\u00FAn sue\\u00F1es con este momento, haz que ocurra' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==37) ) {
                alt21=1;
            }
            else if ( (LA21_0==38) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalDearCode.g:1289:4: otherlv_0= 'Mientras aun me pienses'
                    {
                    otherlv_0=(Token)match(input,37,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getBucleWhileAccess().getMientrasAunMePiensesKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:1294:4: otherlv_1= 'Mientras a\\u00FAn sue\\u00F1es con este momento, haz que ocurra'
                    {
                    otherlv_1=(Token)match(input,38,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getBucleWhileAccess().getMientrasANSueEsConEsteMomentoHazQueOcurraKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalDearCode.g:1299:3: ( (lv_condicion_2_0= ruleCondicion ) )
            // InternalDearCode.g:1300:4: (lv_condicion_2_0= ruleCondicion )
            {
            // InternalDearCode.g:1300:4: (lv_condicion_2_0= ruleCondicion )
            // InternalDearCode.g:1301:5: lv_condicion_2_0= ruleCondicion
            {

            					newCompositeNode(grammarAccess.getBucleWhileAccess().getCondicionCondicionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_condicion_2_0=ruleCondicion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBucleWhileRule());
            					}
            					set(
            						current,
            						"condicion",
            						lv_condicion_2_0,
            						"edu.upb.lp.DearCode.Condicion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getBucleWhileAccess().getCommaKeyword_2());
            		
            // InternalDearCode.g:1322:3: ( (lv_accion_4_0= ruleInstruccion ) )
            // InternalDearCode.g:1323:4: (lv_accion_4_0= ruleInstruccion )
            {
            // InternalDearCode.g:1323:4: (lv_accion_4_0= ruleInstruccion )
            // InternalDearCode.g:1324:5: lv_accion_4_0= ruleInstruccion
            {

            					newCompositeNode(grammarAccess.getBucleWhileAccess().getAccionInstruccionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_accion_4_0=ruleInstruccion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBucleWhileRule());
            					}
            					set(
            						current,
            						"accion",
            						lv_accion_4_0,
            						"edu.upb.lp.DearCode.Instruccion");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBucleWhile"


    // $ANTLR start "entryRuleBucleFor"
    // InternalDearCode.g:1345:1: entryRuleBucleFor returns [EObject current=null] : iv_ruleBucleFor= ruleBucleFor EOF ;
    public final EObject entryRuleBucleFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBucleFor = null;


        try {
            // InternalDearCode.g:1345:49: (iv_ruleBucleFor= ruleBucleFor EOF )
            // InternalDearCode.g:1346:2: iv_ruleBucleFor= ruleBucleFor EOF
            {
             newCompositeNode(grammarAccess.getBucleForRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBucleFor=ruleBucleFor();

            state._fsp--;

             current =iv_ruleBucleFor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBucleFor"


    // $ANTLR start "ruleBucleFor"
    // InternalDearCode.g:1352:1: ruleBucleFor returns [EObject current=null] : ( (otherlv_0= 'Cada dia, desde' | otherlv_1= 'Por cada suspiro desde' ) ( (lv_condicion_2_0= ruleCondicion ) ) otherlv_3= 'hasta' ( (lv_accionStop_4_0= ruleInstruccion ) ) otherlv_5= ',' ( (lv_accion_6_0= ruleInstruccion ) ) ) ;
    public final EObject ruleBucleFor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_condicion_2_0 = null;

        EObject lv_accionStop_4_0 = null;

        EObject lv_accion_6_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:1358:2: ( ( (otherlv_0= 'Cada dia, desde' | otherlv_1= 'Por cada suspiro desde' ) ( (lv_condicion_2_0= ruleCondicion ) ) otherlv_3= 'hasta' ( (lv_accionStop_4_0= ruleInstruccion ) ) otherlv_5= ',' ( (lv_accion_6_0= ruleInstruccion ) ) ) )
            // InternalDearCode.g:1359:2: ( (otherlv_0= 'Cada dia, desde' | otherlv_1= 'Por cada suspiro desde' ) ( (lv_condicion_2_0= ruleCondicion ) ) otherlv_3= 'hasta' ( (lv_accionStop_4_0= ruleInstruccion ) ) otherlv_5= ',' ( (lv_accion_6_0= ruleInstruccion ) ) )
            {
            // InternalDearCode.g:1359:2: ( (otherlv_0= 'Cada dia, desde' | otherlv_1= 'Por cada suspiro desde' ) ( (lv_condicion_2_0= ruleCondicion ) ) otherlv_3= 'hasta' ( (lv_accionStop_4_0= ruleInstruccion ) ) otherlv_5= ',' ( (lv_accion_6_0= ruleInstruccion ) ) )
            // InternalDearCode.g:1360:3: (otherlv_0= 'Cada dia, desde' | otherlv_1= 'Por cada suspiro desde' ) ( (lv_condicion_2_0= ruleCondicion ) ) otherlv_3= 'hasta' ( (lv_accionStop_4_0= ruleInstruccion ) ) otherlv_5= ',' ( (lv_accion_6_0= ruleInstruccion ) )
            {
            // InternalDearCode.g:1360:3: (otherlv_0= 'Cada dia, desde' | otherlv_1= 'Por cada suspiro desde' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==39) ) {
                alt22=1;
            }
            else if ( (LA22_0==40) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalDearCode.g:1361:4: otherlv_0= 'Cada dia, desde'
                    {
                    otherlv_0=(Token)match(input,39,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getBucleForAccess().getCadaDiaDesdeKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:1366:4: otherlv_1= 'Por cada suspiro desde'
                    {
                    otherlv_1=(Token)match(input,40,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getBucleForAccess().getPorCadaSuspiroDesdeKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalDearCode.g:1371:3: ( (lv_condicion_2_0= ruleCondicion ) )
            // InternalDearCode.g:1372:4: (lv_condicion_2_0= ruleCondicion )
            {
            // InternalDearCode.g:1372:4: (lv_condicion_2_0= ruleCondicion )
            // InternalDearCode.g:1373:5: lv_condicion_2_0= ruleCondicion
            {

            					newCompositeNode(grammarAccess.getBucleForAccess().getCondicionCondicionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
            lv_condicion_2_0=ruleCondicion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBucleForRule());
            					}
            					set(
            						current,
            						"condicion",
            						lv_condicion_2_0,
            						"edu.upb.lp.DearCode.Condicion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,41,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getBucleForAccess().getHastaKeyword_2());
            		
            // InternalDearCode.g:1394:3: ( (lv_accionStop_4_0= ruleInstruccion ) )
            // InternalDearCode.g:1395:4: (lv_accionStop_4_0= ruleInstruccion )
            {
            // InternalDearCode.g:1395:4: (lv_accionStop_4_0= ruleInstruccion )
            // InternalDearCode.g:1396:5: lv_accionStop_4_0= ruleInstruccion
            {

            					newCompositeNode(grammarAccess.getBucleForAccess().getAccionStopInstruccionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_accionStop_4_0=ruleInstruccion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBucleForRule());
            					}
            					set(
            						current,
            						"accionStop",
            						lv_accionStop_4_0,
            						"edu.upb.lp.DearCode.Instruccion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,35,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getBucleForAccess().getCommaKeyword_4());
            		
            // InternalDearCode.g:1417:3: ( (lv_accion_6_0= ruleInstruccion ) )
            // InternalDearCode.g:1418:4: (lv_accion_6_0= ruleInstruccion )
            {
            // InternalDearCode.g:1418:4: (lv_accion_6_0= ruleInstruccion )
            // InternalDearCode.g:1419:5: lv_accion_6_0= ruleInstruccion
            {

            					newCompositeNode(grammarAccess.getBucleForAccess().getAccionInstruccionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_accion_6_0=ruleInstruccion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBucleForRule());
            					}
            					set(
            						current,
            						"accion",
            						lv_accion_6_0,
            						"edu.upb.lp.DearCode.Instruccion");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBucleFor"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000001E600002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000001E600000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000001EC000070L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000001E600000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000020000000000L});

}