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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ANYTEXT", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Querido'", "'Querida'", "'Con cari\\u00F1o, Tu programador'", "'.'", "'con'", "'cero'", "'uno'", "'dos'", "'tres'", "'cuatro'", "'cinco'", "'seis'", "'siete'", "'ocho'", "'nueve'", "'y'", "'decena'", "'s'", "'centena'", "'millar'", "'es'", "'un'", "'una'", "'Te regalo'", "'Ofrezco'", "'Obsequio'", "'Deposito en tu jard\\u00EDn'", "'Perm\\u00EDteme'", "'alimentar'", "'regar'", "'ajustar'", "'@'"
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
    // InternalDearCode.g:71:1: ruleProgram returns [EObject current=null] : ( (lv_cartas_0_0= ruleCarta ) )+ ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_cartas_0_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:77:2: ( ( (lv_cartas_0_0= ruleCarta ) )+ )
            // InternalDearCode.g:78:2: ( (lv_cartas_0_0= ruleCarta ) )+
            {
            // InternalDearCode.g:78:2: ( (lv_cartas_0_0= ruleCarta ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=12 && LA1_0<=13)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDearCode.g:79:3: (lv_cartas_0_0= ruleCarta )
            	    {
            	    // InternalDearCode.g:79:3: (lv_cartas_0_0= ruleCarta )
            	    // InternalDearCode.g:80:4: lv_cartas_0_0= ruleCarta
            	    {

            	    				newCompositeNode(grammarAccess.getProgramAccess().getCartasCartaParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_cartas_0_0=ruleCarta();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getProgramRule());
            	    				}
            	    				add(
            	    					current,
            	    					"cartas",
            	    					lv_cartas_0_0,
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
    // InternalDearCode.g:100:1: entryRuleCarta returns [EObject current=null] : iv_ruleCarta= ruleCarta EOF ;
    public final EObject entryRuleCarta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCarta = null;


        try {
            // InternalDearCode.g:100:46: (iv_ruleCarta= ruleCarta EOF )
            // InternalDearCode.g:101:2: iv_ruleCarta= ruleCarta EOF
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
    // InternalDearCode.g:107:1: ruleCarta returns [EObject current=null] : ( ( (lv_saludo_0_0= ruleSaludo ) ) ( (lv_cuerpo_1_0= ruleCuerpo ) ) ( (lv_despedida_2_0= ruleDespedida ) ) ) ;
    public final EObject ruleCarta() throws RecognitionException {
        EObject current = null;

        EObject lv_saludo_0_0 = null;

        EObject lv_cuerpo_1_0 = null;

        EObject lv_despedida_2_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:113:2: ( ( ( (lv_saludo_0_0= ruleSaludo ) ) ( (lv_cuerpo_1_0= ruleCuerpo ) ) ( (lv_despedida_2_0= ruleDespedida ) ) ) )
            // InternalDearCode.g:114:2: ( ( (lv_saludo_0_0= ruleSaludo ) ) ( (lv_cuerpo_1_0= ruleCuerpo ) ) ( (lv_despedida_2_0= ruleDespedida ) ) )
            {
            // InternalDearCode.g:114:2: ( ( (lv_saludo_0_0= ruleSaludo ) ) ( (lv_cuerpo_1_0= ruleCuerpo ) ) ( (lv_despedida_2_0= ruleDespedida ) ) )
            // InternalDearCode.g:115:3: ( (lv_saludo_0_0= ruleSaludo ) ) ( (lv_cuerpo_1_0= ruleCuerpo ) ) ( (lv_despedida_2_0= ruleDespedida ) )
            {
            // InternalDearCode.g:115:3: ( (lv_saludo_0_0= ruleSaludo ) )
            // InternalDearCode.g:116:4: (lv_saludo_0_0= ruleSaludo )
            {
            // InternalDearCode.g:116:4: (lv_saludo_0_0= ruleSaludo )
            // InternalDearCode.g:117:5: lv_saludo_0_0= ruleSaludo
            {

            					newCompositeNode(grammarAccess.getCartaAccess().getSaludoSaludoParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
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

            // InternalDearCode.g:134:3: ( (lv_cuerpo_1_0= ruleCuerpo ) )
            // InternalDearCode.g:135:4: (lv_cuerpo_1_0= ruleCuerpo )
            {
            // InternalDearCode.g:135:4: (lv_cuerpo_1_0= ruleCuerpo )
            // InternalDearCode.g:136:5: lv_cuerpo_1_0= ruleCuerpo
            {

            					newCompositeNode(grammarAccess.getCartaAccess().getCuerpoCuerpoParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
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

            // InternalDearCode.g:153:3: ( (lv_despedida_2_0= ruleDespedida ) )
            // InternalDearCode.g:154:4: (lv_despedida_2_0= ruleDespedida )
            {
            // InternalDearCode.g:154:4: (lv_despedida_2_0= ruleDespedida )
            // InternalDearCode.g:155:5: lv_despedida_2_0= ruleDespedida
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
    // InternalDearCode.g:176:1: entryRuleSaludo returns [EObject current=null] : iv_ruleSaludo= ruleSaludo EOF ;
    public final EObject entryRuleSaludo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSaludo = null;


        try {
            // InternalDearCode.g:176:47: (iv_ruleSaludo= ruleSaludo EOF )
            // InternalDearCode.g:177:2: iv_ruleSaludo= ruleSaludo EOF
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
    // InternalDearCode.g:183:1: ruleSaludo returns [EObject current=null] : ( (otherlv_0= 'Querido' | otherlv_1= 'Querida' ) ( (lv_name_2_0= RULE_ANYTEXT ) ) ) ;
    public final EObject ruleSaludo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalDearCode.g:189:2: ( ( (otherlv_0= 'Querido' | otherlv_1= 'Querida' ) ( (lv_name_2_0= RULE_ANYTEXT ) ) ) )
            // InternalDearCode.g:190:2: ( (otherlv_0= 'Querido' | otherlv_1= 'Querida' ) ( (lv_name_2_0= RULE_ANYTEXT ) ) )
            {
            // InternalDearCode.g:190:2: ( (otherlv_0= 'Querido' | otherlv_1= 'Querida' ) ( (lv_name_2_0= RULE_ANYTEXT ) ) )
            // InternalDearCode.g:191:3: (otherlv_0= 'Querido' | otherlv_1= 'Querida' ) ( (lv_name_2_0= RULE_ANYTEXT ) )
            {
            // InternalDearCode.g:191:3: (otherlv_0= 'Querido' | otherlv_1= 'Querida' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDearCode.g:192:4: otherlv_0= 'Querido'
                    {
                    otherlv_0=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_0, grammarAccess.getSaludoAccess().getQueridoKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:197:4: otherlv_1= 'Querida'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getSaludoAccess().getQueridaKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalDearCode.g:202:3: ( (lv_name_2_0= RULE_ANYTEXT ) )
            // InternalDearCode.g:203:4: (lv_name_2_0= RULE_ANYTEXT )
            {
            // InternalDearCode.g:203:4: (lv_name_2_0= RULE_ANYTEXT )
            // InternalDearCode.g:204:5: lv_name_2_0= RULE_ANYTEXT
            {
            lv_name_2_0=(Token)match(input,RULE_ANYTEXT,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSaludoAccess().getNameANYTEXTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSaludoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"edu.upb.lp.DearCode.ANYTEXT");
            				

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
    // InternalDearCode.g:224:1: entryRuleDespedida returns [EObject current=null] : iv_ruleDespedida= ruleDespedida EOF ;
    public final EObject entryRuleDespedida() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDespedida = null;


        try {
            // InternalDearCode.g:224:50: (iv_ruleDespedida= ruleDespedida EOF )
            // InternalDearCode.g:225:2: iv_ruleDespedida= ruleDespedida EOF
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
    // InternalDearCode.g:231:1: ruleDespedida returns [EObject current=null] : (otherlv_0= 'Con cari\\u00F1o, Tu programador' ( (lv_name_1_0= RULE_ANYTEXT ) ) ) ;
    public final EObject ruleDespedida() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDearCode.g:237:2: ( (otherlv_0= 'Con cari\\u00F1o, Tu programador' ( (lv_name_1_0= RULE_ANYTEXT ) ) ) )
            // InternalDearCode.g:238:2: (otherlv_0= 'Con cari\\u00F1o, Tu programador' ( (lv_name_1_0= RULE_ANYTEXT ) ) )
            {
            // InternalDearCode.g:238:2: (otherlv_0= 'Con cari\\u00F1o, Tu programador' ( (lv_name_1_0= RULE_ANYTEXT ) ) )
            // InternalDearCode.g:239:3: otherlv_0= 'Con cari\\u00F1o, Tu programador' ( (lv_name_1_0= RULE_ANYTEXT ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDespedidaAccess().getConCariOTuProgramadorKeyword_0());
            		
            // InternalDearCode.g:243:3: ( (lv_name_1_0= RULE_ANYTEXT ) )
            // InternalDearCode.g:244:4: (lv_name_1_0= RULE_ANYTEXT )
            {
            // InternalDearCode.g:244:4: (lv_name_1_0= RULE_ANYTEXT )
            // InternalDearCode.g:245:5: lv_name_1_0= RULE_ANYTEXT
            {
            lv_name_1_0=(Token)match(input,RULE_ANYTEXT,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDespedidaAccess().getNameANYTEXTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDespedidaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"edu.upb.lp.DearCode.ANYTEXT");
            				

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
    // $ANTLR end "ruleDespedida"


    // $ANTLR start "entryRuleCuerpo"
    // InternalDearCode.g:265:1: entryRuleCuerpo returns [EObject current=null] : iv_ruleCuerpo= ruleCuerpo EOF ;
    public final EObject entryRuleCuerpo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCuerpo = null;


        try {
            // InternalDearCode.g:265:47: (iv_ruleCuerpo= ruleCuerpo EOF )
            // InternalDearCode.g:266:2: iv_ruleCuerpo= ruleCuerpo EOF
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
    // InternalDearCode.g:272:1: ruleCuerpo returns [EObject current=null] : ( (lv_instrucciones_0_0= ruleInstruccion ) )+ ;
    public final EObject ruleCuerpo() throws RecognitionException {
        EObject current = null;

        EObject lv_instrucciones_0_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:278:2: ( ( (lv_instrucciones_0_0= ruleInstruccion ) )+ )
            // InternalDearCode.g:279:2: ( (lv_instrucciones_0_0= ruleInstruccion ) )+
            {
            // InternalDearCode.g:279:2: ( (lv_instrucciones_0_0= ruleInstruccion ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=35 && LA3_0<=39)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDearCode.g:280:3: (lv_instrucciones_0_0= ruleInstruccion )
            	    {
            	    // InternalDearCode.g:280:3: (lv_instrucciones_0_0= ruleInstruccion )
            	    // InternalDearCode.g:281:4: lv_instrucciones_0_0= ruleInstruccion
            	    {

            	    				newCompositeNode(grammarAccess.getCuerpoAccess().getInstruccionesInstruccionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_7);
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
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
    // InternalDearCode.g:301:1: entryRuleInstruccion returns [EObject current=null] : iv_ruleInstruccion= ruleInstruccion EOF ;
    public final EObject entryRuleInstruccion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruccion = null;


        try {
            // InternalDearCode.g:301:52: (iv_ruleInstruccion= ruleInstruccion EOF )
            // InternalDearCode.g:302:2: iv_ruleInstruccion= ruleInstruccion EOF
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
    // InternalDearCode.g:308:1: ruleInstruccion returns [EObject current=null] : (this_Declarar_0= ruleDeclarar | this_Reasignar_1= ruleReasignar ) ;
    public final EObject ruleInstruccion() throws RecognitionException {
        EObject current = null;

        EObject this_Declarar_0 = null;

        EObject this_Reasignar_1 = null;



        	enterRule();

        try {
            // InternalDearCode.g:314:2: ( (this_Declarar_0= ruleDeclarar | this_Reasignar_1= ruleReasignar ) )
            // InternalDearCode.g:315:2: (this_Declarar_0= ruleDeclarar | this_Reasignar_1= ruleReasignar )
            {
            // InternalDearCode.g:315:2: (this_Declarar_0= ruleDeclarar | this_Reasignar_1= ruleReasignar )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=35 && LA4_0<=38)) ) {
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
                    // InternalDearCode.g:316:3: this_Declarar_0= ruleDeclarar
                    {

                    			newCompositeNode(grammarAccess.getInstruccionAccess().getDeclararParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Declarar_0=ruleDeclarar();

                    state._fsp--;


                    			current = this_Declarar_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:325:3: this_Reasignar_1= ruleReasignar
                    {

                    			newCompositeNode(grammarAccess.getInstruccionAccess().getReasignarParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reasignar_1=ruleReasignar();

                    state._fsp--;


                    			current = this_Reasignar_1;
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


    // $ANTLR start "entryRuleDeclarar"
    // InternalDearCode.g:337:1: entryRuleDeclarar returns [EObject current=null] : iv_ruleDeclarar= ruleDeclarar EOF ;
    public final EObject entryRuleDeclarar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarar = null;


        try {
            // InternalDearCode.g:337:49: (iv_ruleDeclarar= ruleDeclarar EOF )
            // InternalDearCode.g:338:2: iv_ruleDeclarar= ruleDeclarar EOF
            {
             newCompositeNode(grammarAccess.getDeclararRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclarar=ruleDeclarar();

            state._fsp--;

             current =iv_ruleDeclarar; 
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
    // $ANTLR end "entryRuleDeclarar"


    // $ANTLR start "ruleDeclarar"
    // InternalDearCode.g:344:1: ruleDeclarar returns [EObject current=null] : ( ( (lv_verboDecl_0_0= ruleVerboDeclaracion ) ) ( (lv_articulo_1_0= ruleArticulo ) ) ( (lv_valor_2_0= ruleValor ) ) ( (lv_sustantivo_3_0= ruleMI_ID ) ) ( ( (lv_comentario_4_1= RULE_ANYTEXT | lv_comentario_4_2= RULE_STRING ) ) )? otherlv_5= '.' ) ;
    public final EObject ruleDeclarar() throws RecognitionException {
        EObject current = null;

        Token lv_comentario_4_1=null;
        Token lv_comentario_4_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_verboDecl_0_0 = null;

        AntlrDatatypeRuleToken lv_articulo_1_0 = null;

        EObject lv_valor_2_0 = null;

        EObject lv_sustantivo_3_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:350:2: ( ( ( (lv_verboDecl_0_0= ruleVerboDeclaracion ) ) ( (lv_articulo_1_0= ruleArticulo ) ) ( (lv_valor_2_0= ruleValor ) ) ( (lv_sustantivo_3_0= ruleMI_ID ) ) ( ( (lv_comentario_4_1= RULE_ANYTEXT | lv_comentario_4_2= RULE_STRING ) ) )? otherlv_5= '.' ) )
            // InternalDearCode.g:351:2: ( ( (lv_verboDecl_0_0= ruleVerboDeclaracion ) ) ( (lv_articulo_1_0= ruleArticulo ) ) ( (lv_valor_2_0= ruleValor ) ) ( (lv_sustantivo_3_0= ruleMI_ID ) ) ( ( (lv_comentario_4_1= RULE_ANYTEXT | lv_comentario_4_2= RULE_STRING ) ) )? otherlv_5= '.' )
            {
            // InternalDearCode.g:351:2: ( ( (lv_verboDecl_0_0= ruleVerboDeclaracion ) ) ( (lv_articulo_1_0= ruleArticulo ) ) ( (lv_valor_2_0= ruleValor ) ) ( (lv_sustantivo_3_0= ruleMI_ID ) ) ( ( (lv_comentario_4_1= RULE_ANYTEXT | lv_comentario_4_2= RULE_STRING ) ) )? otherlv_5= '.' )
            // InternalDearCode.g:352:3: ( (lv_verboDecl_0_0= ruleVerboDeclaracion ) ) ( (lv_articulo_1_0= ruleArticulo ) ) ( (lv_valor_2_0= ruleValor ) ) ( (lv_sustantivo_3_0= ruleMI_ID ) ) ( ( (lv_comentario_4_1= RULE_ANYTEXT | lv_comentario_4_2= RULE_STRING ) ) )? otherlv_5= '.'
            {
            // InternalDearCode.g:352:3: ( (lv_verboDecl_0_0= ruleVerboDeclaracion ) )
            // InternalDearCode.g:353:4: (lv_verboDecl_0_0= ruleVerboDeclaracion )
            {
            // InternalDearCode.g:353:4: (lv_verboDecl_0_0= ruleVerboDeclaracion )
            // InternalDearCode.g:354:5: lv_verboDecl_0_0= ruleVerboDeclaracion
            {

            					newCompositeNode(grammarAccess.getDeclararAccess().getVerboDeclVerboDeclaracionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_verboDecl_0_0=ruleVerboDeclaracion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclararRule());
            					}
            					set(
            						current,
            						"verboDecl",
            						lv_verboDecl_0_0,
            						"edu.upb.lp.DearCode.VerboDeclaracion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDearCode.g:371:3: ( (lv_articulo_1_0= ruleArticulo ) )
            // InternalDearCode.g:372:4: (lv_articulo_1_0= ruleArticulo )
            {
            // InternalDearCode.g:372:4: (lv_articulo_1_0= ruleArticulo )
            // InternalDearCode.g:373:5: lv_articulo_1_0= ruleArticulo
            {

            					newCompositeNode(grammarAccess.getDeclararAccess().getArticuloArticuloParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_articulo_1_0=ruleArticulo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclararRule());
            					}
            					set(
            						current,
            						"articulo",
            						lv_articulo_1_0,
            						"edu.upb.lp.DearCode.Articulo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDearCode.g:390:3: ( (lv_valor_2_0= ruleValor ) )
            // InternalDearCode.g:391:4: (lv_valor_2_0= ruleValor )
            {
            // InternalDearCode.g:391:4: (lv_valor_2_0= ruleValor )
            // InternalDearCode.g:392:5: lv_valor_2_0= ruleValor
            {

            					newCompositeNode(grammarAccess.getDeclararAccess().getValorValorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_valor_2_0=ruleValor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclararRule());
            					}
            					set(
            						current,
            						"valor",
            						lv_valor_2_0,
            						"edu.upb.lp.DearCode.Valor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDearCode.g:409:3: ( (lv_sustantivo_3_0= ruleMI_ID ) )
            // InternalDearCode.g:410:4: (lv_sustantivo_3_0= ruleMI_ID )
            {
            // InternalDearCode.g:410:4: (lv_sustantivo_3_0= ruleMI_ID )
            // InternalDearCode.g:411:5: lv_sustantivo_3_0= ruleMI_ID
            {

            					newCompositeNode(grammarAccess.getDeclararAccess().getSustantivoMI_IDParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_sustantivo_3_0=ruleMI_ID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclararRule());
            					}
            					set(
            						current,
            						"sustantivo",
            						lv_sustantivo_3_0,
            						"edu.upb.lp.DearCode.MI_ID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDearCode.g:428:3: ( ( (lv_comentario_4_1= RULE_ANYTEXT | lv_comentario_4_2= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_ANYTEXT && LA6_0<=RULE_STRING)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDearCode.g:429:4: ( (lv_comentario_4_1= RULE_ANYTEXT | lv_comentario_4_2= RULE_STRING ) )
                    {
                    // InternalDearCode.g:429:4: ( (lv_comentario_4_1= RULE_ANYTEXT | lv_comentario_4_2= RULE_STRING ) )
                    // InternalDearCode.g:430:5: (lv_comentario_4_1= RULE_ANYTEXT | lv_comentario_4_2= RULE_STRING )
                    {
                    // InternalDearCode.g:430:5: (lv_comentario_4_1= RULE_ANYTEXT | lv_comentario_4_2= RULE_STRING )
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
                            // InternalDearCode.g:431:6: lv_comentario_4_1= RULE_ANYTEXT
                            {
                            lv_comentario_4_1=(Token)match(input,RULE_ANYTEXT,FOLLOW_12); 

                            						newLeafNode(lv_comentario_4_1, grammarAccess.getDeclararAccess().getComentarioANYTEXTTerminalRuleCall_4_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getDeclararRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comentario",
                            							lv_comentario_4_1,
                            							"edu.upb.lp.DearCode.ANYTEXT");
                            					

                            }
                            break;
                        case 2 :
                            // InternalDearCode.g:446:6: lv_comentario_4_2= RULE_STRING
                            {
                            lv_comentario_4_2=(Token)match(input,RULE_STRING,FOLLOW_12); 

                            						newLeafNode(lv_comentario_4_2, grammarAccess.getDeclararAccess().getComentarioSTRINGTerminalRuleCall_4_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getDeclararRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comentario",
                            							lv_comentario_4_2,
                            							"org.eclipse.xtext.common.Terminals.STRING");
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDeclararAccess().getFullStopKeyword_5());
            		

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
    // $ANTLR end "ruleDeclarar"


    // $ANTLR start "entryRuleReasignar"
    // InternalDearCode.g:471:1: entryRuleReasignar returns [EObject current=null] : iv_ruleReasignar= ruleReasignar EOF ;
    public final EObject entryRuleReasignar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReasignar = null;


        try {
            // InternalDearCode.g:471:50: (iv_ruleReasignar= ruleReasignar EOF )
            // InternalDearCode.g:472:2: iv_ruleReasignar= ruleReasignar EOF
            {
             newCompositeNode(grammarAccess.getReasignarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReasignar=ruleReasignar();

            state._fsp--;

             current =iv_ruleReasignar; 
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
    // $ANTLR end "entryRuleReasignar"


    // $ANTLR start "ruleReasignar"
    // InternalDearCode.g:478:1: ruleReasignar returns [EObject current=null] : ( ( (lv_verboReas_0_0= ruleVerboReasignacion ) ) ( (lv_sustantivo_1_0= ruleMI_ID ) ) otherlv_2= 'con' ( (lv_valor_3_0= ruleValor ) ) ( ( (lv_comentario_4_1= RULE_ANYTEXT | lv_comentario_4_2= RULE_STRING ) ) )? otherlv_5= '.' ) ;
    public final EObject ruleReasignar() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_comentario_4_1=null;
        Token lv_comentario_4_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_verboReas_0_0 = null;

        EObject lv_sustantivo_1_0 = null;

        EObject lv_valor_3_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:484:2: ( ( ( (lv_verboReas_0_0= ruleVerboReasignacion ) ) ( (lv_sustantivo_1_0= ruleMI_ID ) ) otherlv_2= 'con' ( (lv_valor_3_0= ruleValor ) ) ( ( (lv_comentario_4_1= RULE_ANYTEXT | lv_comentario_4_2= RULE_STRING ) ) )? otherlv_5= '.' ) )
            // InternalDearCode.g:485:2: ( ( (lv_verboReas_0_0= ruleVerboReasignacion ) ) ( (lv_sustantivo_1_0= ruleMI_ID ) ) otherlv_2= 'con' ( (lv_valor_3_0= ruleValor ) ) ( ( (lv_comentario_4_1= RULE_ANYTEXT | lv_comentario_4_2= RULE_STRING ) ) )? otherlv_5= '.' )
            {
            // InternalDearCode.g:485:2: ( ( (lv_verboReas_0_0= ruleVerboReasignacion ) ) ( (lv_sustantivo_1_0= ruleMI_ID ) ) otherlv_2= 'con' ( (lv_valor_3_0= ruleValor ) ) ( ( (lv_comentario_4_1= RULE_ANYTEXT | lv_comentario_4_2= RULE_STRING ) ) )? otherlv_5= '.' )
            // InternalDearCode.g:486:3: ( (lv_verboReas_0_0= ruleVerboReasignacion ) ) ( (lv_sustantivo_1_0= ruleMI_ID ) ) otherlv_2= 'con' ( (lv_valor_3_0= ruleValor ) ) ( ( (lv_comentario_4_1= RULE_ANYTEXT | lv_comentario_4_2= RULE_STRING ) ) )? otherlv_5= '.'
            {
            // InternalDearCode.g:486:3: ( (lv_verboReas_0_0= ruleVerboReasignacion ) )
            // InternalDearCode.g:487:4: (lv_verboReas_0_0= ruleVerboReasignacion )
            {
            // InternalDearCode.g:487:4: (lv_verboReas_0_0= ruleVerboReasignacion )
            // InternalDearCode.g:488:5: lv_verboReas_0_0= ruleVerboReasignacion
            {

            					newCompositeNode(grammarAccess.getReasignarAccess().getVerboReasVerboReasignacionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_verboReas_0_0=ruleVerboReasignacion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReasignarRule());
            					}
            					set(
            						current,
            						"verboReas",
            						lv_verboReas_0_0,
            						"edu.upb.lp.DearCode.VerboReasignacion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDearCode.g:505:3: ( (lv_sustantivo_1_0= ruleMI_ID ) )
            // InternalDearCode.g:506:4: (lv_sustantivo_1_0= ruleMI_ID )
            {
            // InternalDearCode.g:506:4: (lv_sustantivo_1_0= ruleMI_ID )
            // InternalDearCode.g:507:5: lv_sustantivo_1_0= ruleMI_ID
            {

            					newCompositeNode(grammarAccess.getReasignarAccess().getSustantivoMI_IDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_sustantivo_1_0=ruleMI_ID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReasignarRule());
            					}
            					set(
            						current,
            						"sustantivo",
            						lv_sustantivo_1_0,
            						"edu.upb.lp.DearCode.MI_ID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getReasignarAccess().getConKeyword_2());
            		
            // InternalDearCode.g:528:3: ( (lv_valor_3_0= ruleValor ) )
            // InternalDearCode.g:529:4: (lv_valor_3_0= ruleValor )
            {
            // InternalDearCode.g:529:4: (lv_valor_3_0= ruleValor )
            // InternalDearCode.g:530:5: lv_valor_3_0= ruleValor
            {

            					newCompositeNode(grammarAccess.getReasignarAccess().getValorValorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_valor_3_0=ruleValor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReasignarRule());
            					}
            					set(
            						current,
            						"valor",
            						lv_valor_3_0,
            						"edu.upb.lp.DearCode.Valor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDearCode.g:547:3: ( ( (lv_comentario_4_1= RULE_ANYTEXT | lv_comentario_4_2= RULE_STRING ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_ANYTEXT && LA8_0<=RULE_STRING)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDearCode.g:548:4: ( (lv_comentario_4_1= RULE_ANYTEXT | lv_comentario_4_2= RULE_STRING ) )
                    {
                    // InternalDearCode.g:548:4: ( (lv_comentario_4_1= RULE_ANYTEXT | lv_comentario_4_2= RULE_STRING ) )
                    // InternalDearCode.g:549:5: (lv_comentario_4_1= RULE_ANYTEXT | lv_comentario_4_2= RULE_STRING )
                    {
                    // InternalDearCode.g:549:5: (lv_comentario_4_1= RULE_ANYTEXT | lv_comentario_4_2= RULE_STRING )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_ANYTEXT) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==RULE_STRING) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalDearCode.g:550:6: lv_comentario_4_1= RULE_ANYTEXT
                            {
                            lv_comentario_4_1=(Token)match(input,RULE_ANYTEXT,FOLLOW_12); 

                            						newLeafNode(lv_comentario_4_1, grammarAccess.getReasignarAccess().getComentarioANYTEXTTerminalRuleCall_4_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getReasignarRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comentario",
                            							lv_comentario_4_1,
                            							"edu.upb.lp.DearCode.ANYTEXT");
                            					

                            }
                            break;
                        case 2 :
                            // InternalDearCode.g:565:6: lv_comentario_4_2= RULE_STRING
                            {
                            lv_comentario_4_2=(Token)match(input,RULE_STRING,FOLLOW_12); 

                            						newLeafNode(lv_comentario_4_2, grammarAccess.getReasignarAccess().getComentarioSTRINGTerminalRuleCall_4_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getReasignarRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comentario",
                            							lv_comentario_4_2,
                            							"org.eclipse.xtext.common.Terminals.STRING");
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getReasignarAccess().getFullStopKeyword_5());
            		

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
    // $ANTLR end "ruleReasignar"


    // $ANTLR start "entryRuleValor"
    // InternalDearCode.g:590:1: entryRuleValor returns [EObject current=null] : iv_ruleValor= ruleValor EOF ;
    public final EObject entryRuleValor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValor = null;


        try {
            // InternalDearCode.g:590:46: (iv_ruleValor= ruleValor EOF )
            // InternalDearCode.g:591:2: iv_ruleValor= ruleValor EOF
            {
             newCompositeNode(grammarAccess.getValorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValor=ruleValor();

            state._fsp--;

             current =iv_ruleValor; 
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
    // $ANTLR end "entryRuleValor"


    // $ANTLR start "ruleValor"
    // InternalDearCode.g:597:1: ruleValor returns [EObject current=null] : (this_MI_ID_0= ruleMI_ID | this_NumeroLiteral_1= ruleNumeroLiteral ) ;
    public final EObject ruleValor() throws RecognitionException {
        EObject current = null;

        EObject this_MI_ID_0 = null;

        EObject this_NumeroLiteral_1 = null;



        	enterRule();

        try {
            // InternalDearCode.g:603:2: ( (this_MI_ID_0= ruleMI_ID | this_NumeroLiteral_1= ruleNumeroLiteral ) )
            // InternalDearCode.g:604:2: (this_MI_ID_0= ruleMI_ID | this_NumeroLiteral_1= ruleNumeroLiteral )
            {
            // InternalDearCode.g:604:2: (this_MI_ID_0= ruleMI_ID | this_NumeroLiteral_1= ruleNumeroLiteral )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==43) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=17 && LA9_0<=26)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalDearCode.g:605:3: this_MI_ID_0= ruleMI_ID
                    {

                    			newCompositeNode(grammarAccess.getValorAccess().getMI_IDParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MI_ID_0=ruleMI_ID();

                    state._fsp--;


                    			current = this_MI_ID_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:614:3: this_NumeroLiteral_1= ruleNumeroLiteral
                    {

                    			newCompositeNode(grammarAccess.getValorAccess().getNumeroLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumeroLiteral_1=ruleNumeroLiteral();

                    state._fsp--;


                    			current = this_NumeroLiteral_1;
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
    // $ANTLR end "ruleValor"


    // $ANTLR start "entryRuleNumeroLiteral"
    // InternalDearCode.g:626:1: entryRuleNumeroLiteral returns [EObject current=null] : iv_ruleNumeroLiteral= ruleNumeroLiteral EOF ;
    public final EObject entryRuleNumeroLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumeroLiteral = null;


        try {
            // InternalDearCode.g:626:54: (iv_ruleNumeroLiteral= ruleNumeroLiteral EOF )
            // InternalDearCode.g:627:2: iv_ruleNumeroLiteral= ruleNumeroLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumeroLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumeroLiteral=ruleNumeroLiteral();

            state._fsp--;

             current =iv_ruleNumeroLiteral; 
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
    // $ANTLR end "entryRuleNumeroLiteral"


    // $ANTLR start "ruleNumeroLiteral"
    // InternalDearCode.g:633:1: ruleNumeroLiteral returns [EObject current=null] : (this_Simple_0= ruleSimple | this_Compuesto_1= ruleCompuesto ) ;
    public final EObject ruleNumeroLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_Simple_0 = null;

        EObject this_Compuesto_1 = null;



        	enterRule();

        try {
            // InternalDearCode.g:639:2: ( (this_Simple_0= ruleSimple | this_Compuesto_1= ruleCompuesto ) )
            // InternalDearCode.g:640:2: (this_Simple_0= ruleSimple | this_Compuesto_1= ruleCompuesto )
            {
            // InternalDearCode.g:640:2: (this_Simple_0= ruleSimple | this_Compuesto_1= ruleCompuesto )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalDearCode.g:641:3: this_Simple_0= ruleSimple
                    {

                    			newCompositeNode(grammarAccess.getNumeroLiteralAccess().getSimpleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Simple_0=ruleSimple();

                    state._fsp--;


                    			current = this_Simple_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:650:3: this_Compuesto_1= ruleCompuesto
                    {

                    			newCompositeNode(grammarAccess.getNumeroLiteralAccess().getCompuestoParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Compuesto_1=ruleCompuesto();

                    state._fsp--;


                    			current = this_Compuesto_1;
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
    // $ANTLR end "ruleNumeroLiteral"


    // $ANTLR start "entryRuleSimple"
    // InternalDearCode.g:662:1: entryRuleSimple returns [EObject current=null] : iv_ruleSimple= ruleSimple EOF ;
    public final EObject entryRuleSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimple = null;


        try {
            // InternalDearCode.g:662:47: (iv_ruleSimple= ruleSimple EOF )
            // InternalDearCode.g:663:2: iv_ruleSimple= ruleSimple EOF
            {
             newCompositeNode(grammarAccess.getSimpleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimple=ruleSimple();

            state._fsp--;

             current =iv_ruleSimple; 
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
    // $ANTLR end "entryRuleSimple"


    // $ANTLR start "ruleSimple"
    // InternalDearCode.g:669:1: ruleSimple returns [EObject current=null] : ( ( (lv_value_0_1= 'cero' | lv_value_0_2= 'uno' | lv_value_0_3= 'dos' | lv_value_0_4= 'tres' | lv_value_0_5= 'cuatro' | lv_value_0_6= 'cinco' | lv_value_0_7= 'seis' | lv_value_0_8= 'siete' | lv_value_0_9= 'ocho' | lv_value_0_10= 'nueve' ) ) ) ;
    public final EObject ruleSimple() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;
        Token lv_value_0_3=null;
        Token lv_value_0_4=null;
        Token lv_value_0_5=null;
        Token lv_value_0_6=null;
        Token lv_value_0_7=null;
        Token lv_value_0_8=null;
        Token lv_value_0_9=null;
        Token lv_value_0_10=null;


        	enterRule();

        try {
            // InternalDearCode.g:675:2: ( ( ( (lv_value_0_1= 'cero' | lv_value_0_2= 'uno' | lv_value_0_3= 'dos' | lv_value_0_4= 'tres' | lv_value_0_5= 'cuatro' | lv_value_0_6= 'cinco' | lv_value_0_7= 'seis' | lv_value_0_8= 'siete' | lv_value_0_9= 'ocho' | lv_value_0_10= 'nueve' ) ) ) )
            // InternalDearCode.g:676:2: ( ( (lv_value_0_1= 'cero' | lv_value_0_2= 'uno' | lv_value_0_3= 'dos' | lv_value_0_4= 'tres' | lv_value_0_5= 'cuatro' | lv_value_0_6= 'cinco' | lv_value_0_7= 'seis' | lv_value_0_8= 'siete' | lv_value_0_9= 'ocho' | lv_value_0_10= 'nueve' ) ) )
            {
            // InternalDearCode.g:676:2: ( ( (lv_value_0_1= 'cero' | lv_value_0_2= 'uno' | lv_value_0_3= 'dos' | lv_value_0_4= 'tres' | lv_value_0_5= 'cuatro' | lv_value_0_6= 'cinco' | lv_value_0_7= 'seis' | lv_value_0_8= 'siete' | lv_value_0_9= 'ocho' | lv_value_0_10= 'nueve' ) ) )
            // InternalDearCode.g:677:3: ( (lv_value_0_1= 'cero' | lv_value_0_2= 'uno' | lv_value_0_3= 'dos' | lv_value_0_4= 'tres' | lv_value_0_5= 'cuatro' | lv_value_0_6= 'cinco' | lv_value_0_7= 'seis' | lv_value_0_8= 'siete' | lv_value_0_9= 'ocho' | lv_value_0_10= 'nueve' ) )
            {
            // InternalDearCode.g:677:3: ( (lv_value_0_1= 'cero' | lv_value_0_2= 'uno' | lv_value_0_3= 'dos' | lv_value_0_4= 'tres' | lv_value_0_5= 'cuatro' | lv_value_0_6= 'cinco' | lv_value_0_7= 'seis' | lv_value_0_8= 'siete' | lv_value_0_9= 'ocho' | lv_value_0_10= 'nueve' ) )
            // InternalDearCode.g:678:4: (lv_value_0_1= 'cero' | lv_value_0_2= 'uno' | lv_value_0_3= 'dos' | lv_value_0_4= 'tres' | lv_value_0_5= 'cuatro' | lv_value_0_6= 'cinco' | lv_value_0_7= 'seis' | lv_value_0_8= 'siete' | lv_value_0_9= 'ocho' | lv_value_0_10= 'nueve' )
            {
            // InternalDearCode.g:678:4: (lv_value_0_1= 'cero' | lv_value_0_2= 'uno' | lv_value_0_3= 'dos' | lv_value_0_4= 'tres' | lv_value_0_5= 'cuatro' | lv_value_0_6= 'cinco' | lv_value_0_7= 'seis' | lv_value_0_8= 'siete' | lv_value_0_9= 'ocho' | lv_value_0_10= 'nueve' )
            int alt11=10;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt11=1;
                }
                break;
            case 18:
                {
                alt11=2;
                }
                break;
            case 19:
                {
                alt11=3;
                }
                break;
            case 20:
                {
                alt11=4;
                }
                break;
            case 21:
                {
                alt11=5;
                }
                break;
            case 22:
                {
                alt11=6;
                }
                break;
            case 23:
                {
                alt11=7;
                }
                break;
            case 24:
                {
                alt11=8;
                }
                break;
            case 25:
                {
                alt11=9;
                }
                break;
            case 26:
                {
                alt11=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalDearCode.g:679:5: lv_value_0_1= 'cero'
                    {
                    lv_value_0_1=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getSimpleAccess().getValueCeroKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSimpleRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:690:5: lv_value_0_2= 'uno'
                    {
                    lv_value_0_2=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(lv_value_0_2, grammarAccess.getSimpleAccess().getValueUnoKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSimpleRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalDearCode.g:701:5: lv_value_0_3= 'dos'
                    {
                    lv_value_0_3=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(lv_value_0_3, grammarAccess.getSimpleAccess().getValueDosKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSimpleRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalDearCode.g:712:5: lv_value_0_4= 'tres'
                    {
                    lv_value_0_4=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(lv_value_0_4, grammarAccess.getSimpleAccess().getValueTresKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSimpleRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalDearCode.g:723:5: lv_value_0_5= 'cuatro'
                    {
                    lv_value_0_5=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_value_0_5, grammarAccess.getSimpleAccess().getValueCuatroKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSimpleRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalDearCode.g:734:5: lv_value_0_6= 'cinco'
                    {
                    lv_value_0_6=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_value_0_6, grammarAccess.getSimpleAccess().getValueCincoKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSimpleRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_6, null);
                    				

                    }
                    break;
                case 7 :
                    // InternalDearCode.g:745:5: lv_value_0_7= 'seis'
                    {
                    lv_value_0_7=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(lv_value_0_7, grammarAccess.getSimpleAccess().getValueSeisKeyword_0_6());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSimpleRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_7, null);
                    				

                    }
                    break;
                case 8 :
                    // InternalDearCode.g:756:5: lv_value_0_8= 'siete'
                    {
                    lv_value_0_8=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_value_0_8, grammarAccess.getSimpleAccess().getValueSieteKeyword_0_7());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSimpleRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_8, null);
                    				

                    }
                    break;
                case 9 :
                    // InternalDearCode.g:767:5: lv_value_0_9= 'ocho'
                    {
                    lv_value_0_9=(Token)match(input,25,FOLLOW_2); 

                    					newLeafNode(lv_value_0_9, grammarAccess.getSimpleAccess().getValueOchoKeyword_0_8());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSimpleRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_9, null);
                    				

                    }
                    break;
                case 10 :
                    // InternalDearCode.g:778:5: lv_value_0_10= 'nueve'
                    {
                    lv_value_0_10=(Token)match(input,26,FOLLOW_2); 

                    					newLeafNode(lv_value_0_10, grammarAccess.getSimpleAccess().getValueNueveKeyword_0_9());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSimpleRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_10, null);
                    				

                    }
                    break;

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
    // $ANTLR end "ruleSimple"


    // $ANTLR start "entryRuleCompuesto"
    // InternalDearCode.g:794:1: entryRuleCompuesto returns [EObject current=null] : iv_ruleCompuesto= ruleCompuesto EOF ;
    public final EObject entryRuleCompuesto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompuesto = null;


        try {
            // InternalDearCode.g:794:50: (iv_ruleCompuesto= ruleCompuesto EOF )
            // InternalDearCode.g:795:2: iv_ruleCompuesto= ruleCompuesto EOF
            {
             newCompositeNode(grammarAccess.getCompuestoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompuesto=ruleCompuesto();

            state._fsp--;

             current =iv_ruleCompuesto; 
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
    // $ANTLR end "entryRuleCompuesto"


    // $ANTLR start "ruleCompuesto"
    // InternalDearCode.g:801:1: ruleCompuesto returns [EObject current=null] : ( ( (lv_cantidad_0_0= ruleSimple ) ) ( (lv_multiplicador_1_0= ruleMultiplicador ) ) (otherlv_2= 'y' ( (lv_resto_3_0= ruleSimple ) ) )? ) ;
    public final EObject ruleCompuesto() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_cantidad_0_0 = null;

        AntlrDatatypeRuleToken lv_multiplicador_1_0 = null;

        EObject lv_resto_3_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:807:2: ( ( ( (lv_cantidad_0_0= ruleSimple ) ) ( (lv_multiplicador_1_0= ruleMultiplicador ) ) (otherlv_2= 'y' ( (lv_resto_3_0= ruleSimple ) ) )? ) )
            // InternalDearCode.g:808:2: ( ( (lv_cantidad_0_0= ruleSimple ) ) ( (lv_multiplicador_1_0= ruleMultiplicador ) ) (otherlv_2= 'y' ( (lv_resto_3_0= ruleSimple ) ) )? )
            {
            // InternalDearCode.g:808:2: ( ( (lv_cantidad_0_0= ruleSimple ) ) ( (lv_multiplicador_1_0= ruleMultiplicador ) ) (otherlv_2= 'y' ( (lv_resto_3_0= ruleSimple ) ) )? )
            // InternalDearCode.g:809:3: ( (lv_cantidad_0_0= ruleSimple ) ) ( (lv_multiplicador_1_0= ruleMultiplicador ) ) (otherlv_2= 'y' ( (lv_resto_3_0= ruleSimple ) ) )?
            {
            // InternalDearCode.g:809:3: ( (lv_cantidad_0_0= ruleSimple ) )
            // InternalDearCode.g:810:4: (lv_cantidad_0_0= ruleSimple )
            {
            // InternalDearCode.g:810:4: (lv_cantidad_0_0= ruleSimple )
            // InternalDearCode.g:811:5: lv_cantidad_0_0= ruleSimple
            {

            					newCompositeNode(grammarAccess.getCompuestoAccess().getCantidadSimpleParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_cantidad_0_0=ruleSimple();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompuestoRule());
            					}
            					set(
            						current,
            						"cantidad",
            						lv_cantidad_0_0,
            						"edu.upb.lp.DearCode.Simple");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDearCode.g:828:3: ( (lv_multiplicador_1_0= ruleMultiplicador ) )
            // InternalDearCode.g:829:4: (lv_multiplicador_1_0= ruleMultiplicador )
            {
            // InternalDearCode.g:829:4: (lv_multiplicador_1_0= ruleMultiplicador )
            // InternalDearCode.g:830:5: lv_multiplicador_1_0= ruleMultiplicador
            {

            					newCompositeNode(grammarAccess.getCompuestoAccess().getMultiplicadorMultiplicadorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_multiplicador_1_0=ruleMultiplicador();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompuestoRule());
            					}
            					set(
            						current,
            						"multiplicador",
            						lv_multiplicador_1_0,
            						"edu.upb.lp.DearCode.Multiplicador");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDearCode.g:847:3: (otherlv_2= 'y' ( (lv_resto_3_0= ruleSimple ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDearCode.g:848:4: otherlv_2= 'y' ( (lv_resto_3_0= ruleSimple ) )
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getCompuestoAccess().getYKeyword_2_0());
                    			
                    // InternalDearCode.g:852:4: ( (lv_resto_3_0= ruleSimple ) )
                    // InternalDearCode.g:853:5: (lv_resto_3_0= ruleSimple )
                    {
                    // InternalDearCode.g:853:5: (lv_resto_3_0= ruleSimple )
                    // InternalDearCode.g:854:6: lv_resto_3_0= ruleSimple
                    {

                    						newCompositeNode(grammarAccess.getCompuestoAccess().getRestoSimpleParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_resto_3_0=ruleSimple();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompuestoRule());
                    						}
                    						set(
                    							current,
                    							"resto",
                    							lv_resto_3_0,
                    							"edu.upb.lp.DearCode.Simple");
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
    // $ANTLR end "ruleCompuesto"


    // $ANTLR start "entryRuleMultiplicador"
    // InternalDearCode.g:876:1: entryRuleMultiplicador returns [String current=null] : iv_ruleMultiplicador= ruleMultiplicador EOF ;
    public final String entryRuleMultiplicador() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultiplicador = null;


        try {
            // InternalDearCode.g:876:53: (iv_ruleMultiplicador= ruleMultiplicador EOF )
            // InternalDearCode.g:877:2: iv_ruleMultiplicador= ruleMultiplicador EOF
            {
             newCompositeNode(grammarAccess.getMultiplicadorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicador=ruleMultiplicador();

            state._fsp--;

             current =iv_ruleMultiplicador.getText(); 
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
    // $ANTLR end "entryRuleMultiplicador"


    // $ANTLR start "ruleMultiplicador"
    // InternalDearCode.g:883:1: ruleMultiplicador returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'decena' (kw= 's' )? ) | (kw= 'centena' (kw= 's' )? ) | (kw= 'millar' (kw= 'es' )? ) ) ;
    public final AntlrDatatypeRuleToken ruleMultiplicador() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDearCode.g:889:2: ( ( (kw= 'decena' (kw= 's' )? ) | (kw= 'centena' (kw= 's' )? ) | (kw= 'millar' (kw= 'es' )? ) ) )
            // InternalDearCode.g:890:2: ( (kw= 'decena' (kw= 's' )? ) | (kw= 'centena' (kw= 's' )? ) | (kw= 'millar' (kw= 'es' )? ) )
            {
            // InternalDearCode.g:890:2: ( (kw= 'decena' (kw= 's' )? ) | (kw= 'centena' (kw= 's' )? ) | (kw= 'millar' (kw= 'es' )? ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt16=1;
                }
                break;
            case 30:
                {
                alt16=2;
                }
                break;
            case 31:
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
                    // InternalDearCode.g:891:3: (kw= 'decena' (kw= 's' )? )
                    {
                    // InternalDearCode.g:891:3: (kw= 'decena' (kw= 's' )? )
                    // InternalDearCode.g:892:4: kw= 'decena' (kw= 's' )?
                    {
                    kw=(Token)match(input,28,FOLLOW_17); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getMultiplicadorAccess().getDecenaKeyword_0_0());
                    			
                    // InternalDearCode.g:897:4: (kw= 's' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==29) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalDearCode.g:898:5: kw= 's'
                            {
                            kw=(Token)match(input,29,FOLLOW_2); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getMultiplicadorAccess().getSKeyword_0_1());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDearCode.g:906:3: (kw= 'centena' (kw= 's' )? )
                    {
                    // InternalDearCode.g:906:3: (kw= 'centena' (kw= 's' )? )
                    // InternalDearCode.g:907:4: kw= 'centena' (kw= 's' )?
                    {
                    kw=(Token)match(input,30,FOLLOW_17); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getMultiplicadorAccess().getCentenaKeyword_1_0());
                    			
                    // InternalDearCode.g:912:4: (kw= 's' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==29) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalDearCode.g:913:5: kw= 's'
                            {
                            kw=(Token)match(input,29,FOLLOW_2); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getMultiplicadorAccess().getSKeyword_1_1());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDearCode.g:921:3: (kw= 'millar' (kw= 'es' )? )
                    {
                    // InternalDearCode.g:921:3: (kw= 'millar' (kw= 'es' )? )
                    // InternalDearCode.g:922:4: kw= 'millar' (kw= 'es' )?
                    {
                    kw=(Token)match(input,31,FOLLOW_18); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getMultiplicadorAccess().getMillarKeyword_2_0());
                    			
                    // InternalDearCode.g:927:4: (kw= 'es' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==32) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalDearCode.g:928:5: kw= 'es'
                            {
                            kw=(Token)match(input,32,FOLLOW_2); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getMultiplicadorAccess().getEsKeyword_2_1());
                            				

                            }
                            break;

                    }


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
    // $ANTLR end "ruleMultiplicador"


    // $ANTLR start "entryRuleArticulo"
    // InternalDearCode.g:939:1: entryRuleArticulo returns [String current=null] : iv_ruleArticulo= ruleArticulo EOF ;
    public final String entryRuleArticulo() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArticulo = null;


        try {
            // InternalDearCode.g:939:48: (iv_ruleArticulo= ruleArticulo EOF )
            // InternalDearCode.g:940:2: iv_ruleArticulo= ruleArticulo EOF
            {
             newCompositeNode(grammarAccess.getArticuloRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArticulo=ruleArticulo();

            state._fsp--;

             current =iv_ruleArticulo.getText(); 
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
    // $ANTLR end "entryRuleArticulo"


    // $ANTLR start "ruleArticulo"
    // InternalDearCode.g:946:1: ruleArticulo returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'un' | kw= 'una' ) ;
    public final AntlrDatatypeRuleToken ruleArticulo() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDearCode.g:952:2: ( (kw= 'un' | kw= 'una' ) )
            // InternalDearCode.g:953:2: (kw= 'un' | kw= 'una' )
            {
            // InternalDearCode.g:953:2: (kw= 'un' | kw= 'una' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            else if ( (LA17_0==34) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalDearCode.g:954:3: kw= 'un'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArticuloAccess().getUnKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:960:3: kw= 'una'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArticuloAccess().getUnaKeyword_1());
                    		

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
    // $ANTLR end "ruleArticulo"


    // $ANTLR start "entryRuleVerboDeclaracion"
    // InternalDearCode.g:969:1: entryRuleVerboDeclaracion returns [String current=null] : iv_ruleVerboDeclaracion= ruleVerboDeclaracion EOF ;
    public final String entryRuleVerboDeclaracion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVerboDeclaracion = null;


        try {
            // InternalDearCode.g:969:56: (iv_ruleVerboDeclaracion= ruleVerboDeclaracion EOF )
            // InternalDearCode.g:970:2: iv_ruleVerboDeclaracion= ruleVerboDeclaracion EOF
            {
             newCompositeNode(grammarAccess.getVerboDeclaracionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVerboDeclaracion=ruleVerboDeclaracion();

            state._fsp--;

             current =iv_ruleVerboDeclaracion.getText(); 
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
    // $ANTLR end "entryRuleVerboDeclaracion"


    // $ANTLR start "ruleVerboDeclaracion"
    // InternalDearCode.g:976:1: ruleVerboDeclaracion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Te regalo' | kw= 'Ofrezco' | kw= 'Obsequio' | kw= 'Deposito en tu jard\\u00EDn' ) ;
    public final AntlrDatatypeRuleToken ruleVerboDeclaracion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDearCode.g:982:2: ( (kw= 'Te regalo' | kw= 'Ofrezco' | kw= 'Obsequio' | kw= 'Deposito en tu jard\\u00EDn' ) )
            // InternalDearCode.g:983:2: (kw= 'Te regalo' | kw= 'Ofrezco' | kw= 'Obsequio' | kw= 'Deposito en tu jard\\u00EDn' )
            {
            // InternalDearCode.g:983:2: (kw= 'Te regalo' | kw= 'Ofrezco' | kw= 'Obsequio' | kw= 'Deposito en tu jard\\u00EDn' )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt18=1;
                }
                break;
            case 36:
                {
                alt18=2;
                }
                break;
            case 37:
                {
                alt18=3;
                }
                break;
            case 38:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalDearCode.g:984:3: kw= 'Te regalo'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVerboDeclaracionAccess().getTeRegaloKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:990:3: kw= 'Ofrezco'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVerboDeclaracionAccess().getOfrezcoKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalDearCode.g:996:3: kw= 'Obsequio'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVerboDeclaracionAccess().getObsequioKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalDearCode.g:1002:3: kw= 'Deposito en tu jard\\u00EDn'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVerboDeclaracionAccess().getDepositoEnTuJardNKeyword_3());
                    		

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
    // $ANTLR end "ruleVerboDeclaracion"


    // $ANTLR start "entryRuleVerboReasignacion"
    // InternalDearCode.g:1011:1: entryRuleVerboReasignacion returns [String current=null] : iv_ruleVerboReasignacion= ruleVerboReasignacion EOF ;
    public final String entryRuleVerboReasignacion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVerboReasignacion = null;


        try {
            // InternalDearCode.g:1011:57: (iv_ruleVerboReasignacion= ruleVerboReasignacion EOF )
            // InternalDearCode.g:1012:2: iv_ruleVerboReasignacion= ruleVerboReasignacion EOF
            {
             newCompositeNode(grammarAccess.getVerboReasignacionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVerboReasignacion=ruleVerboReasignacion();

            state._fsp--;

             current =iv_ruleVerboReasignacion.getText(); 
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
    // $ANTLR end "entryRuleVerboReasignacion"


    // $ANTLR start "ruleVerboReasignacion"
    // InternalDearCode.g:1018:1: ruleVerboReasignacion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'Perm\\u00EDteme' kw= 'alimentar' ) | (kw= 'Perm\\u00EDteme' kw= 'regar' ) | (kw= 'Perm\\u00EDteme' kw= 'ajustar' ) ) ;
    public final AntlrDatatypeRuleToken ruleVerboReasignacion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDearCode.g:1024:2: ( ( (kw= 'Perm\\u00EDteme' kw= 'alimentar' ) | (kw= 'Perm\\u00EDteme' kw= 'regar' ) | (kw= 'Perm\\u00EDteme' kw= 'ajustar' ) ) )
            // InternalDearCode.g:1025:2: ( (kw= 'Perm\\u00EDteme' kw= 'alimentar' ) | (kw= 'Perm\\u00EDteme' kw= 'regar' ) | (kw= 'Perm\\u00EDteme' kw= 'ajustar' ) )
            {
            // InternalDearCode.g:1025:2: ( (kw= 'Perm\\u00EDteme' kw= 'alimentar' ) | (kw= 'Perm\\u00EDteme' kw= 'regar' ) | (kw= 'Perm\\u00EDteme' kw= 'ajustar' ) )
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==39) ) {
                switch ( input.LA(2) ) {
                case 40:
                    {
                    alt19=1;
                    }
                    break;
                case 42:
                    {
                    alt19=3;
                    }
                    break;
                case 41:
                    {
                    alt19=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalDearCode.g:1026:3: (kw= 'Perm\\u00EDteme' kw= 'alimentar' )
                    {
                    // InternalDearCode.g:1026:3: (kw= 'Perm\\u00EDteme' kw= 'alimentar' )
                    // InternalDearCode.g:1027:4: kw= 'Perm\\u00EDteme' kw= 'alimentar'
                    {
                    kw=(Token)match(input,39,FOLLOW_19); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getVerboReasignacionAccess().getPermTemeKeyword_0_0());
                    			
                    kw=(Token)match(input,40,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getVerboReasignacionAccess().getAlimentarKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDearCode.g:1039:3: (kw= 'Perm\\u00EDteme' kw= 'regar' )
                    {
                    // InternalDearCode.g:1039:3: (kw= 'Perm\\u00EDteme' kw= 'regar' )
                    // InternalDearCode.g:1040:4: kw= 'Perm\\u00EDteme' kw= 'regar'
                    {
                    kw=(Token)match(input,39,FOLLOW_20); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getVerboReasignacionAccess().getPermTemeKeyword_1_0());
                    			
                    kw=(Token)match(input,41,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getVerboReasignacionAccess().getRegarKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDearCode.g:1052:3: (kw= 'Perm\\u00EDteme' kw= 'ajustar' )
                    {
                    // InternalDearCode.g:1052:3: (kw= 'Perm\\u00EDteme' kw= 'ajustar' )
                    // InternalDearCode.g:1053:4: kw= 'Perm\\u00EDteme' kw= 'ajustar'
                    {
                    kw=(Token)match(input,39,FOLLOW_21); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getVerboReasignacionAccess().getPermTemeKeyword_2_0());
                    			
                    kw=(Token)match(input,42,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getVerboReasignacionAccess().getAjustarKeyword_2_1());
                    			

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
    // $ANTLR end "ruleVerboReasignacion"


    // $ANTLR start "entryRuleMI_ID"
    // InternalDearCode.g:1068:1: entryRuleMI_ID returns [EObject current=null] : iv_ruleMI_ID= ruleMI_ID EOF ;
    public final EObject entryRuleMI_ID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMI_ID = null;


        try {
            // InternalDearCode.g:1068:46: (iv_ruleMI_ID= ruleMI_ID EOF )
            // InternalDearCode.g:1069:2: iv_ruleMI_ID= ruleMI_ID EOF
            {
             newCompositeNode(grammarAccess.getMI_IDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMI_ID=ruleMI_ID();

            state._fsp--;

             current =iv_ruleMI_ID; 
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
    // $ANTLR end "entryRuleMI_ID"


    // $ANTLR start "ruleMI_ID"
    // InternalDearCode.g:1075:1: ruleMI_ID returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMI_ID() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDearCode.g:1081:2: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalDearCode.g:1082:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalDearCode.g:1082:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalDearCode.g:1083:3: otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getMI_IDAccess().getCommercialAtKeyword_0());
            		
            // InternalDearCode.g:1087:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDearCode.g:1088:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDearCode.g:1088:4: (lv_name_1_0= RULE_ID )
            // InternalDearCode.g:1089:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMI_IDAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMI_IDRule());
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
    // $ANTLR end "ruleMI_ID"

    // Delegated rules


    protected DFA10 dfa10 = new DFA10(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\uffff\12\13\2\uffff";
    static final String dfa_3s = "\1\21\12\4\2\uffff";
    static final String dfa_4s = "\1\32\12\53\2\uffff";
    static final String dfa_5s = "\13\uffff\1\1\1\2";
    static final String dfa_6s = "\15\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
            "\2\13\11\uffff\1\13\14\uffff\1\14\1\uffff\2\14\13\uffff\1\13",
            "\2\13\11\uffff\1\13\14\uffff\1\14\1\uffff\2\14\13\uffff\1\13",
            "\2\13\11\uffff\1\13\14\uffff\1\14\1\uffff\2\14\13\uffff\1\13",
            "\2\13\11\uffff\1\13\14\uffff\1\14\1\uffff\2\14\13\uffff\1\13",
            "\2\13\11\uffff\1\13\14\uffff\1\14\1\uffff\2\14\13\uffff\1\13",
            "\2\13\11\uffff\1\13\14\uffff\1\14\1\uffff\2\14\13\uffff\1\13",
            "\2\13\11\uffff\1\13\14\uffff\1\14\1\uffff\2\14\13\uffff\1\13",
            "\2\13\11\uffff\1\13\14\uffff\1\14\1\uffff\2\14\13\uffff\1\13",
            "\2\13\11\uffff\1\13\14\uffff\1\14\1\uffff\2\14\13\uffff\1\13",
            "\2\13\11\uffff\1\13\14\uffff\1\14\1\uffff\2\14\13\uffff\1\13",
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

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "640:2: (this_Simple_0= ruleSimple | this_Compuesto_1= ruleCompuesto )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000F800000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000F800000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000080007FE0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000D0000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000007FE0000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});

}