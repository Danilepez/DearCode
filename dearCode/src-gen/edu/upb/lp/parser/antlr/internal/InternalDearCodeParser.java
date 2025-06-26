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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ANYTEXT", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Querido'", "'Querida'", "'.'", "'Con cari\\u00F1o, Tu programador'", "'con'", "'Le ped\\u00ED al lector que me dijera'", "'Hoy le quise contar al mundo sobre:'", "'cero'", "'uno'", "'dos'", "'tres'", "'cuatro'", "'cinco'", "'seis'", "'siete'", "'ocho'", "'nueve'", "'y'", "'decena'", "'s'", "'centena'", "'millar'", "'es'", "'un'", "'una'", "'Te regalo'", "'Ofrezco'", "'Obsequio'", "'Deposito en tu jard\\u00EDn'", "'Perm\\u00EDteme alimentar'", "'Perm\\u00EDteme regar'", "'Perm\\u00EDteme ajustar'", "'o quiz\\u00E1s'", "'y tambi\\u00E9n'", "'late al un\\u00EDsono con'", "'canta con un matiz distinto a'", "'susurra con menos fuerza que'", "'casi suspira al mismo nivel que'", "'arde con m\\u00E1s pasi\\u00F3n que'", "'rodea con tanta fuerza como'", "'unidos en un solo suspiro con'", "'fundidos en la llama de'", "'fortalecidos por el fuego de'", "'separados entre los ecos de'", "'resuena con el eco de'", "'no creo que'", "'('", "','", "')'", "'siempre'", "'jam\\u00E1s'", "'a\\u00FAn me piensas'", "'tu voz me alcanza'", "'Si en tu corazon sientes que'", "'entonces deja que estas palabras florezcan:'", "'Pero si el destino dijera lo contrario,'", "'que broten estas verdades:'", "'Y as\\u00ED el universo sigue su curso.'", "'Mientras aun me pienses'", "'Mientras a\\u00FAn sue\\u00F1es con este momento, haz que ocurra'", "'haz que suceda:'", "'Y as\\u00ED el susurro descansa.'", "'Cada dia, desde'", "'Por cada suspiro desde'", "'hasta'", "'y que gire el verso:'", "'Cuando el eco se apague.'", "'Dejo en estas l\\u00EDneas una promesa llamada'", "'Escribo en estas l\\u00EDneas una intenci\\u00F3n llamada'", "'En la brisa escondo un deseo llamado'", "'que guarda en su esencia'", "'Cuando la promesa se cumple:'", "'Y al final, dejo volar'", "'en un suspiro.'", "'As\\u00ED se sella la promesa.'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_ANYTEXT=4;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
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
    // InternalDearCode.g:183:1: ruleSaludo returns [EObject current=null] : ( (otherlv_0= 'Querido' | otherlv_1= 'Querida' ) ( (lv_name_2_0= RULE_ANYTEXT ) ) otherlv_3= '.' ) ;
    public final EObject ruleSaludo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDearCode.g:189:2: ( ( (otherlv_0= 'Querido' | otherlv_1= 'Querida' ) ( (lv_name_2_0= RULE_ANYTEXT ) ) otherlv_3= '.' ) )
            // InternalDearCode.g:190:2: ( (otherlv_0= 'Querido' | otherlv_1= 'Querida' ) ( (lv_name_2_0= RULE_ANYTEXT ) ) otherlv_3= '.' )
            {
            // InternalDearCode.g:190:2: ( (otherlv_0= 'Querido' | otherlv_1= 'Querida' ) ( (lv_name_2_0= RULE_ANYTEXT ) ) otherlv_3= '.' )
            // InternalDearCode.g:191:3: (otherlv_0= 'Querido' | otherlv_1= 'Querida' ) ( (lv_name_2_0= RULE_ANYTEXT ) ) otherlv_3= '.'
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
            lv_name_2_0=(Token)match(input,RULE_ANYTEXT,FOLLOW_7); 

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

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSaludoAccess().getFullStopKeyword_2());
            		

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
    // InternalDearCode.g:228:1: entryRuleDespedida returns [EObject current=null] : iv_ruleDespedida= ruleDespedida EOF ;
    public final EObject entryRuleDespedida() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDespedida = null;


        try {
            // InternalDearCode.g:228:50: (iv_ruleDespedida= ruleDespedida EOF )
            // InternalDearCode.g:229:2: iv_ruleDespedida= ruleDespedida EOF
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
    // InternalDearCode.g:235:1: ruleDespedida returns [EObject current=null] : (otherlv_0= 'Con cari\\u00F1o, Tu programador' ( (lv_name_1_0= RULE_ANYTEXT ) ) otherlv_2= '.' ) ;
    public final EObject ruleDespedida() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDearCode.g:241:2: ( (otherlv_0= 'Con cari\\u00F1o, Tu programador' ( (lv_name_1_0= RULE_ANYTEXT ) ) otherlv_2= '.' ) )
            // InternalDearCode.g:242:2: (otherlv_0= 'Con cari\\u00F1o, Tu programador' ( (lv_name_1_0= RULE_ANYTEXT ) ) otherlv_2= '.' )
            {
            // InternalDearCode.g:242:2: (otherlv_0= 'Con cari\\u00F1o, Tu programador' ( (lv_name_1_0= RULE_ANYTEXT ) ) otherlv_2= '.' )
            // InternalDearCode.g:243:3: otherlv_0= 'Con cari\\u00F1o, Tu programador' ( (lv_name_1_0= RULE_ANYTEXT ) ) otherlv_2= '.'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDespedidaAccess().getConCariOTuProgramadorKeyword_0());
            		
            // InternalDearCode.g:247:3: ( (lv_name_1_0= RULE_ANYTEXT ) )
            // InternalDearCode.g:248:4: (lv_name_1_0= RULE_ANYTEXT )
            {
            // InternalDearCode.g:248:4: (lv_name_1_0= RULE_ANYTEXT )
            // InternalDearCode.g:249:5: lv_name_1_0= RULE_ANYTEXT
            {
            lv_name_1_0=(Token)match(input,RULE_ANYTEXT,FOLLOW_7); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getDespedidaAccess().getFullStopKeyword_2());
            		

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
    // InternalDearCode.g:273:1: entryRuleCuerpo returns [EObject current=null] : iv_ruleCuerpo= ruleCuerpo EOF ;
    public final EObject entryRuleCuerpo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCuerpo = null;


        try {
            // InternalDearCode.g:273:47: (iv_ruleCuerpo= ruleCuerpo EOF )
            // InternalDearCode.g:274:2: iv_ruleCuerpo= ruleCuerpo EOF
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
    // InternalDearCode.g:280:1: ruleCuerpo returns [EObject current=null] : ( (lv_instrucciones_0_0= ruleInstruccion ) )+ ;
    public final EObject ruleCuerpo() throws RecognitionException {
        EObject current = null;

        EObject lv_instrucciones_0_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:286:2: ( ( (lv_instrucciones_0_0= ruleInstruccion ) )+ )
            // InternalDearCode.g:287:2: ( (lv_instrucciones_0_0= ruleInstruccion ) )+
            {
            // InternalDearCode.g:287:2: ( (lv_instrucciones_0_0= ruleInstruccion ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=17 && LA3_0<=18)||(LA3_0>=37 && LA3_0<=43)||LA3_0==65||(LA3_0>=70 && LA3_0<=71)||(LA3_0>=74 && LA3_0<=75)||(LA3_0>=79 && LA3_0<=81)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDearCode.g:288:3: (lv_instrucciones_0_0= ruleInstruccion )
            	    {
            	    // InternalDearCode.g:288:3: (lv_instrucciones_0_0= ruleInstruccion )
            	    // InternalDearCode.g:289:4: lv_instrucciones_0_0= ruleInstruccion
            	    {

            	    				newCompositeNode(grammarAccess.getCuerpoAccess().getInstruccionesInstruccionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_8);
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
    // InternalDearCode.g:309:1: entryRuleInstruccion returns [EObject current=null] : iv_ruleInstruccion= ruleInstruccion EOF ;
    public final EObject entryRuleInstruccion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruccion = null;


        try {
            // InternalDearCode.g:309:52: (iv_ruleInstruccion= ruleInstruccion EOF )
            // InternalDearCode.g:310:2: iv_ruleInstruccion= ruleInstruccion EOF
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
    // InternalDearCode.g:316:1: ruleInstruccion returns [EObject current=null] : (this_Declarar_0= ruleDeclarar | this_Reasignar_1= ruleReasignar | this_Condicional_2= ruleCondicional | this_BucleWhile_3= ruleBucleWhile | this_BucleFor_4= ruleBucleFor | this_Entrada_5= ruleEntrada | this_Salida_6= ruleSalida | this_Funcion_7= ruleFuncion ) ;
    public final EObject ruleInstruccion() throws RecognitionException {
        EObject current = null;

        EObject this_Declarar_0 = null;

        EObject this_Reasignar_1 = null;

        EObject this_Condicional_2 = null;

        EObject this_BucleWhile_3 = null;

        EObject this_BucleFor_4 = null;

        EObject this_Entrada_5 = null;

        EObject this_Salida_6 = null;

        EObject this_Funcion_7 = null;



        	enterRule();

        try {
            // InternalDearCode.g:322:2: ( (this_Declarar_0= ruleDeclarar | this_Reasignar_1= ruleReasignar | this_Condicional_2= ruleCondicional | this_BucleWhile_3= ruleBucleWhile | this_BucleFor_4= ruleBucleFor | this_Entrada_5= ruleEntrada | this_Salida_6= ruleSalida | this_Funcion_7= ruleFuncion ) )
            // InternalDearCode.g:323:2: (this_Declarar_0= ruleDeclarar | this_Reasignar_1= ruleReasignar | this_Condicional_2= ruleCondicional | this_BucleWhile_3= ruleBucleWhile | this_BucleFor_4= ruleBucleFor | this_Entrada_5= ruleEntrada | this_Salida_6= ruleSalida | this_Funcion_7= ruleFuncion )
            {
            // InternalDearCode.g:323:2: (this_Declarar_0= ruleDeclarar | this_Reasignar_1= ruleReasignar | this_Condicional_2= ruleCondicional | this_BucleWhile_3= ruleBucleWhile | this_BucleFor_4= ruleBucleFor | this_Entrada_5= ruleEntrada | this_Salida_6= ruleSalida | this_Funcion_7= ruleFuncion )
            int alt4=8;
            switch ( input.LA(1) ) {
            case 37:
            case 38:
            case 39:
            case 40:
                {
                alt4=1;
                }
                break;
            case 41:
            case 42:
            case 43:
                {
                alt4=2;
                }
                break;
            case 65:
                {
                alt4=3;
                }
                break;
            case 70:
            case 71:
                {
                alt4=4;
                }
                break;
            case 74:
            case 75:
                {
                alt4=5;
                }
                break;
            case 17:
                {
                alt4=6;
                }
                break;
            case 18:
                {
                alt4=7;
                }
                break;
            case 79:
            case 80:
            case 81:
                {
                alt4=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDearCode.g:324:3: this_Declarar_0= ruleDeclarar
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
                    // InternalDearCode.g:333:3: this_Reasignar_1= ruleReasignar
                    {

                    			newCompositeNode(grammarAccess.getInstruccionAccess().getReasignarParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reasignar_1=ruleReasignar();

                    state._fsp--;


                    			current = this_Reasignar_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDearCode.g:342:3: this_Condicional_2= ruleCondicional
                    {

                    			newCompositeNode(grammarAccess.getInstruccionAccess().getCondicionalParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Condicional_2=ruleCondicional();

                    state._fsp--;


                    			current = this_Condicional_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDearCode.g:351:3: this_BucleWhile_3= ruleBucleWhile
                    {

                    			newCompositeNode(grammarAccess.getInstruccionAccess().getBucleWhileParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_BucleWhile_3=ruleBucleWhile();

                    state._fsp--;


                    			current = this_BucleWhile_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDearCode.g:360:3: this_BucleFor_4= ruleBucleFor
                    {

                    			newCompositeNode(grammarAccess.getInstruccionAccess().getBucleForParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_BucleFor_4=ruleBucleFor();

                    state._fsp--;


                    			current = this_BucleFor_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalDearCode.g:369:3: this_Entrada_5= ruleEntrada
                    {

                    			newCompositeNode(grammarAccess.getInstruccionAccess().getEntradaParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entrada_5=ruleEntrada();

                    state._fsp--;


                    			current = this_Entrada_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalDearCode.g:378:3: this_Salida_6= ruleSalida
                    {

                    			newCompositeNode(grammarAccess.getInstruccionAccess().getSalidaParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Salida_6=ruleSalida();

                    state._fsp--;


                    			current = this_Salida_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalDearCode.g:387:3: this_Funcion_7= ruleFuncion
                    {

                    			newCompositeNode(grammarAccess.getInstruccionAccess().getFuncionParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Funcion_7=ruleFuncion();

                    state._fsp--;


                    			current = this_Funcion_7;
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
    // InternalDearCode.g:399:1: entryRuleDeclarar returns [EObject current=null] : iv_ruleDeclarar= ruleDeclarar EOF ;
    public final EObject entryRuleDeclarar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarar = null;


        try {
            // InternalDearCode.g:399:49: (iv_ruleDeclarar= ruleDeclarar EOF )
            // InternalDearCode.g:400:2: iv_ruleDeclarar= ruleDeclarar EOF
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
    // InternalDearCode.g:406:1: ruleDeclarar returns [EObject current=null] : ( ( (lv_verboDecl_0_0= ruleVerboDeclaracion ) ) ( (lv_articulo_1_0= ruleArticulo ) ) ( (lv_sustantivo_2_0= ruleMI_ID ) ) ( (lv_conector_3_0= RULE_ANYTEXT ) ) ( (lv_valor_4_0= ruleValor ) ) ( ( (lv_comentario_5_1= RULE_ANYTEXT | lv_comentario_5_2= RULE_STRING ) ) )? otherlv_6= '.' ) ;
    public final EObject ruleDeclarar() throws RecognitionException {
        EObject current = null;

        Token lv_conector_3_0=null;
        Token lv_comentario_5_1=null;
        Token lv_comentario_5_2=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_verboDecl_0_0 = null;

        AntlrDatatypeRuleToken lv_articulo_1_0 = null;

        EObject lv_sustantivo_2_0 = null;

        EObject lv_valor_4_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:412:2: ( ( ( (lv_verboDecl_0_0= ruleVerboDeclaracion ) ) ( (lv_articulo_1_0= ruleArticulo ) ) ( (lv_sustantivo_2_0= ruleMI_ID ) ) ( (lv_conector_3_0= RULE_ANYTEXT ) ) ( (lv_valor_4_0= ruleValor ) ) ( ( (lv_comentario_5_1= RULE_ANYTEXT | lv_comentario_5_2= RULE_STRING ) ) )? otherlv_6= '.' ) )
            // InternalDearCode.g:413:2: ( ( (lv_verboDecl_0_0= ruleVerboDeclaracion ) ) ( (lv_articulo_1_0= ruleArticulo ) ) ( (lv_sustantivo_2_0= ruleMI_ID ) ) ( (lv_conector_3_0= RULE_ANYTEXT ) ) ( (lv_valor_4_0= ruleValor ) ) ( ( (lv_comentario_5_1= RULE_ANYTEXT | lv_comentario_5_2= RULE_STRING ) ) )? otherlv_6= '.' )
            {
            // InternalDearCode.g:413:2: ( ( (lv_verboDecl_0_0= ruleVerboDeclaracion ) ) ( (lv_articulo_1_0= ruleArticulo ) ) ( (lv_sustantivo_2_0= ruleMI_ID ) ) ( (lv_conector_3_0= RULE_ANYTEXT ) ) ( (lv_valor_4_0= ruleValor ) ) ( ( (lv_comentario_5_1= RULE_ANYTEXT | lv_comentario_5_2= RULE_STRING ) ) )? otherlv_6= '.' )
            // InternalDearCode.g:414:3: ( (lv_verboDecl_0_0= ruleVerboDeclaracion ) ) ( (lv_articulo_1_0= ruleArticulo ) ) ( (lv_sustantivo_2_0= ruleMI_ID ) ) ( (lv_conector_3_0= RULE_ANYTEXT ) ) ( (lv_valor_4_0= ruleValor ) ) ( ( (lv_comentario_5_1= RULE_ANYTEXT | lv_comentario_5_2= RULE_STRING ) ) )? otherlv_6= '.'
            {
            // InternalDearCode.g:414:3: ( (lv_verboDecl_0_0= ruleVerboDeclaracion ) )
            // InternalDearCode.g:415:4: (lv_verboDecl_0_0= ruleVerboDeclaracion )
            {
            // InternalDearCode.g:415:4: (lv_verboDecl_0_0= ruleVerboDeclaracion )
            // InternalDearCode.g:416:5: lv_verboDecl_0_0= ruleVerboDeclaracion
            {

            					newCompositeNode(grammarAccess.getDeclararAccess().getVerboDeclVerboDeclaracionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
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

            // InternalDearCode.g:433:3: ( (lv_articulo_1_0= ruleArticulo ) )
            // InternalDearCode.g:434:4: (lv_articulo_1_0= ruleArticulo )
            {
            // InternalDearCode.g:434:4: (lv_articulo_1_0= ruleArticulo )
            // InternalDearCode.g:435:5: lv_articulo_1_0= ruleArticulo
            {

            					newCompositeNode(grammarAccess.getDeclararAccess().getArticuloArticuloParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
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

            // InternalDearCode.g:452:3: ( (lv_sustantivo_2_0= ruleMI_ID ) )
            // InternalDearCode.g:453:4: (lv_sustantivo_2_0= ruleMI_ID )
            {
            // InternalDearCode.g:453:4: (lv_sustantivo_2_0= ruleMI_ID )
            // InternalDearCode.g:454:5: lv_sustantivo_2_0= ruleMI_ID
            {

            					newCompositeNode(grammarAccess.getDeclararAccess().getSustantivoMI_IDParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_sustantivo_2_0=ruleMI_ID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclararRule());
            					}
            					set(
            						current,
            						"sustantivo",
            						lv_sustantivo_2_0,
            						"edu.upb.lp.DearCode.MI_ID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDearCode.g:471:3: ( (lv_conector_3_0= RULE_ANYTEXT ) )
            // InternalDearCode.g:472:4: (lv_conector_3_0= RULE_ANYTEXT )
            {
            // InternalDearCode.g:472:4: (lv_conector_3_0= RULE_ANYTEXT )
            // InternalDearCode.g:473:5: lv_conector_3_0= RULE_ANYTEXT
            {
            lv_conector_3_0=(Token)match(input,RULE_ANYTEXT,FOLLOW_11); 

            					newLeafNode(lv_conector_3_0, grammarAccess.getDeclararAccess().getConectorANYTEXTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeclararRule());
            					}
            					setWithLastConsumed(
            						current,
            						"conector",
            						lv_conector_3_0,
            						"edu.upb.lp.DearCode.ANYTEXT");
            				

            }


            }

            // InternalDearCode.g:489:3: ( (lv_valor_4_0= ruleValor ) )
            // InternalDearCode.g:490:4: (lv_valor_4_0= ruleValor )
            {
            // InternalDearCode.g:490:4: (lv_valor_4_0= ruleValor )
            // InternalDearCode.g:491:5: lv_valor_4_0= ruleValor
            {

            					newCompositeNode(grammarAccess.getDeclararAccess().getValorValorParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
            lv_valor_4_0=ruleValor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclararRule());
            					}
            					set(
            						current,
            						"valor",
            						lv_valor_4_0,
            						"edu.upb.lp.DearCode.Valor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDearCode.g:508:3: ( ( (lv_comentario_5_1= RULE_ANYTEXT | lv_comentario_5_2= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_ANYTEXT && LA6_0<=RULE_STRING)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDearCode.g:509:4: ( (lv_comentario_5_1= RULE_ANYTEXT | lv_comentario_5_2= RULE_STRING ) )
                    {
                    // InternalDearCode.g:509:4: ( (lv_comentario_5_1= RULE_ANYTEXT | lv_comentario_5_2= RULE_STRING ) )
                    // InternalDearCode.g:510:5: (lv_comentario_5_1= RULE_ANYTEXT | lv_comentario_5_2= RULE_STRING )
                    {
                    // InternalDearCode.g:510:5: (lv_comentario_5_1= RULE_ANYTEXT | lv_comentario_5_2= RULE_STRING )
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
                            // InternalDearCode.g:511:6: lv_comentario_5_1= RULE_ANYTEXT
                            {
                            lv_comentario_5_1=(Token)match(input,RULE_ANYTEXT,FOLLOW_7); 

                            						newLeafNode(lv_comentario_5_1, grammarAccess.getDeclararAccess().getComentarioANYTEXTTerminalRuleCall_5_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getDeclararRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comentario",
                            							lv_comentario_5_1,
                            							"edu.upb.lp.DearCode.ANYTEXT");
                            					

                            }
                            break;
                        case 2 :
                            // InternalDearCode.g:526:6: lv_comentario_5_2= RULE_STRING
                            {
                            lv_comentario_5_2=(Token)match(input,RULE_STRING,FOLLOW_7); 

                            						newLeafNode(lv_comentario_5_2, grammarAccess.getDeclararAccess().getComentarioSTRINGTerminalRuleCall_5_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getDeclararRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comentario",
                            							lv_comentario_5_2,
                            							"org.eclipse.xtext.common.Terminals.STRING");
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDeclararAccess().getFullStopKeyword_6());
            		

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
    // InternalDearCode.g:551:1: entryRuleReasignar returns [EObject current=null] : iv_ruleReasignar= ruleReasignar EOF ;
    public final EObject entryRuleReasignar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReasignar = null;


        try {
            // InternalDearCode.g:551:50: (iv_ruleReasignar= ruleReasignar EOF )
            // InternalDearCode.g:552:2: iv_ruleReasignar= ruleReasignar EOF
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
    // InternalDearCode.g:558:1: ruleReasignar returns [EObject current=null] : ( ( (lv_verboReas_0_0= ruleVerboReasignacion ) ) ( (lv_conector_1_0= RULE_ANYTEXT ) ) ( (lv_sustantivo_2_0= ruleMI_ID ) ) otherlv_3= 'con' ( (lv_valor_4_0= ruleValor ) ) ( ( (lv_comentario_5_1= RULE_ANYTEXT | lv_comentario_5_2= RULE_STRING ) ) )? otherlv_6= '.' ) ;
    public final EObject ruleReasignar() throws RecognitionException {
        EObject current = null;

        Token lv_conector_1_0=null;
        Token otherlv_3=null;
        Token lv_comentario_5_1=null;
        Token lv_comentario_5_2=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_verboReas_0_0 = null;

        EObject lv_sustantivo_2_0 = null;

        EObject lv_valor_4_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:564:2: ( ( ( (lv_verboReas_0_0= ruleVerboReasignacion ) ) ( (lv_conector_1_0= RULE_ANYTEXT ) ) ( (lv_sustantivo_2_0= ruleMI_ID ) ) otherlv_3= 'con' ( (lv_valor_4_0= ruleValor ) ) ( ( (lv_comentario_5_1= RULE_ANYTEXT | lv_comentario_5_2= RULE_STRING ) ) )? otherlv_6= '.' ) )
            // InternalDearCode.g:565:2: ( ( (lv_verboReas_0_0= ruleVerboReasignacion ) ) ( (lv_conector_1_0= RULE_ANYTEXT ) ) ( (lv_sustantivo_2_0= ruleMI_ID ) ) otherlv_3= 'con' ( (lv_valor_4_0= ruleValor ) ) ( ( (lv_comentario_5_1= RULE_ANYTEXT | lv_comentario_5_2= RULE_STRING ) ) )? otherlv_6= '.' )
            {
            // InternalDearCode.g:565:2: ( ( (lv_verboReas_0_0= ruleVerboReasignacion ) ) ( (lv_conector_1_0= RULE_ANYTEXT ) ) ( (lv_sustantivo_2_0= ruleMI_ID ) ) otherlv_3= 'con' ( (lv_valor_4_0= ruleValor ) ) ( ( (lv_comentario_5_1= RULE_ANYTEXT | lv_comentario_5_2= RULE_STRING ) ) )? otherlv_6= '.' )
            // InternalDearCode.g:566:3: ( (lv_verboReas_0_0= ruleVerboReasignacion ) ) ( (lv_conector_1_0= RULE_ANYTEXT ) ) ( (lv_sustantivo_2_0= ruleMI_ID ) ) otherlv_3= 'con' ( (lv_valor_4_0= ruleValor ) ) ( ( (lv_comentario_5_1= RULE_ANYTEXT | lv_comentario_5_2= RULE_STRING ) ) )? otherlv_6= '.'
            {
            // InternalDearCode.g:566:3: ( (lv_verboReas_0_0= ruleVerboReasignacion ) )
            // InternalDearCode.g:567:4: (lv_verboReas_0_0= ruleVerboReasignacion )
            {
            // InternalDearCode.g:567:4: (lv_verboReas_0_0= ruleVerboReasignacion )
            // InternalDearCode.g:568:5: lv_verboReas_0_0= ruleVerboReasignacion
            {

            					newCompositeNode(grammarAccess.getReasignarAccess().getVerboReasVerboReasignacionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
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

            // InternalDearCode.g:585:3: ( (lv_conector_1_0= RULE_ANYTEXT ) )
            // InternalDearCode.g:586:4: (lv_conector_1_0= RULE_ANYTEXT )
            {
            // InternalDearCode.g:586:4: (lv_conector_1_0= RULE_ANYTEXT )
            // InternalDearCode.g:587:5: lv_conector_1_0= RULE_ANYTEXT
            {
            lv_conector_1_0=(Token)match(input,RULE_ANYTEXT,FOLLOW_10); 

            					newLeafNode(lv_conector_1_0, grammarAccess.getReasignarAccess().getConectorANYTEXTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReasignarRule());
            					}
            					setWithLastConsumed(
            						current,
            						"conector",
            						lv_conector_1_0,
            						"edu.upb.lp.DearCode.ANYTEXT");
            				

            }


            }

            // InternalDearCode.g:603:3: ( (lv_sustantivo_2_0= ruleMI_ID ) )
            // InternalDearCode.g:604:4: (lv_sustantivo_2_0= ruleMI_ID )
            {
            // InternalDearCode.g:604:4: (lv_sustantivo_2_0= ruleMI_ID )
            // InternalDearCode.g:605:5: lv_sustantivo_2_0= ruleMI_ID
            {

            					newCompositeNode(grammarAccess.getReasignarAccess().getSustantivoMI_IDParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_sustantivo_2_0=ruleMI_ID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReasignarRule());
            					}
            					set(
            						current,
            						"sustantivo",
            						lv_sustantivo_2_0,
            						"edu.upb.lp.DearCode.MI_ID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getReasignarAccess().getConKeyword_3());
            		
            // InternalDearCode.g:626:3: ( (lv_valor_4_0= ruleValor ) )
            // InternalDearCode.g:627:4: (lv_valor_4_0= ruleValor )
            {
            // InternalDearCode.g:627:4: (lv_valor_4_0= ruleValor )
            // InternalDearCode.g:628:5: lv_valor_4_0= ruleValor
            {

            					newCompositeNode(grammarAccess.getReasignarAccess().getValorValorParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
            lv_valor_4_0=ruleValor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReasignarRule());
            					}
            					set(
            						current,
            						"valor",
            						lv_valor_4_0,
            						"edu.upb.lp.DearCode.Valor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDearCode.g:645:3: ( ( (lv_comentario_5_1= RULE_ANYTEXT | lv_comentario_5_2= RULE_STRING ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_ANYTEXT && LA8_0<=RULE_STRING)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDearCode.g:646:4: ( (lv_comentario_5_1= RULE_ANYTEXT | lv_comentario_5_2= RULE_STRING ) )
                    {
                    // InternalDearCode.g:646:4: ( (lv_comentario_5_1= RULE_ANYTEXT | lv_comentario_5_2= RULE_STRING ) )
                    // InternalDearCode.g:647:5: (lv_comentario_5_1= RULE_ANYTEXT | lv_comentario_5_2= RULE_STRING )
                    {
                    // InternalDearCode.g:647:5: (lv_comentario_5_1= RULE_ANYTEXT | lv_comentario_5_2= RULE_STRING )
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
                            // InternalDearCode.g:648:6: lv_comentario_5_1= RULE_ANYTEXT
                            {
                            lv_comentario_5_1=(Token)match(input,RULE_ANYTEXT,FOLLOW_7); 

                            						newLeafNode(lv_comentario_5_1, grammarAccess.getReasignarAccess().getComentarioANYTEXTTerminalRuleCall_5_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getReasignarRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comentario",
                            							lv_comentario_5_1,
                            							"edu.upb.lp.DearCode.ANYTEXT");
                            					

                            }
                            break;
                        case 2 :
                            // InternalDearCode.g:663:6: lv_comentario_5_2= RULE_STRING
                            {
                            lv_comentario_5_2=(Token)match(input,RULE_STRING,FOLLOW_7); 

                            						newLeafNode(lv_comentario_5_2, grammarAccess.getReasignarAccess().getComentarioSTRINGTerminalRuleCall_5_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getReasignarRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comentario",
                            							lv_comentario_5_2,
                            							"org.eclipse.xtext.common.Terminals.STRING");
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getReasignarAccess().getFullStopKeyword_6());
            		

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


    // $ANTLR start "entryRuleEntrada"
    // InternalDearCode.g:688:1: entryRuleEntrada returns [EObject current=null] : iv_ruleEntrada= ruleEntrada EOF ;
    public final EObject entryRuleEntrada() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntrada = null;


        try {
            // InternalDearCode.g:688:48: (iv_ruleEntrada= ruleEntrada EOF )
            // InternalDearCode.g:689:2: iv_ruleEntrada= ruleEntrada EOF
            {
             newCompositeNode(grammarAccess.getEntradaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntrada=ruleEntrada();

            state._fsp--;

             current =iv_ruleEntrada; 
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
    // $ANTLR end "entryRuleEntrada"


    // $ANTLR start "ruleEntrada"
    // InternalDearCode.g:695:1: ruleEntrada returns [EObject current=null] : (otherlv_0= 'Le ped\\u00ED al lector que me dijera' ( (lv_variable_1_0= ruleMI_ID ) ) otherlv_2= '.' ) ;
    public final EObject ruleEntrada() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_variable_1_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:701:2: ( (otherlv_0= 'Le ped\\u00ED al lector que me dijera' ( (lv_variable_1_0= ruleMI_ID ) ) otherlv_2= '.' ) )
            // InternalDearCode.g:702:2: (otherlv_0= 'Le ped\\u00ED al lector que me dijera' ( (lv_variable_1_0= ruleMI_ID ) ) otherlv_2= '.' )
            {
            // InternalDearCode.g:702:2: (otherlv_0= 'Le ped\\u00ED al lector que me dijera' ( (lv_variable_1_0= ruleMI_ID ) ) otherlv_2= '.' )
            // InternalDearCode.g:703:3: otherlv_0= 'Le ped\\u00ED al lector que me dijera' ( (lv_variable_1_0= ruleMI_ID ) ) otherlv_2= '.'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getEntradaAccess().getLePedAlLectorQueMeDijeraKeyword_0());
            		
            // InternalDearCode.g:707:3: ( (lv_variable_1_0= ruleMI_ID ) )
            // InternalDearCode.g:708:4: (lv_variable_1_0= ruleMI_ID )
            {
            // InternalDearCode.g:708:4: (lv_variable_1_0= ruleMI_ID )
            // InternalDearCode.g:709:5: lv_variable_1_0= ruleMI_ID
            {

            					newCompositeNode(grammarAccess.getEntradaAccess().getVariableMI_IDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_variable_1_0=ruleMI_ID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntradaRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_1_0,
            						"edu.upb.lp.DearCode.MI_ID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getEntradaAccess().getFullStopKeyword_2());
            		

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
    // $ANTLR end "ruleEntrada"


    // $ANTLR start "entryRuleSalida"
    // InternalDearCode.g:734:1: entryRuleSalida returns [EObject current=null] : iv_ruleSalida= ruleSalida EOF ;
    public final EObject entryRuleSalida() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSalida = null;


        try {
            // InternalDearCode.g:734:47: (iv_ruleSalida= ruleSalida EOF )
            // InternalDearCode.g:735:2: iv_ruleSalida= ruleSalida EOF
            {
             newCompositeNode(grammarAccess.getSalidaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSalida=ruleSalida();

            state._fsp--;

             current =iv_ruleSalida; 
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
    // $ANTLR end "entryRuleSalida"


    // $ANTLR start "ruleSalida"
    // InternalDearCode.g:741:1: ruleSalida returns [EObject current=null] : (otherlv_0= 'Hoy le quise contar al mundo sobre:' ( (lv_expresion_1_0= ruleExpression ) ) otherlv_2= '.' ) ;
    public final EObject ruleSalida() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expresion_1_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:747:2: ( (otherlv_0= 'Hoy le quise contar al mundo sobre:' ( (lv_expresion_1_0= ruleExpression ) ) otherlv_2= '.' ) )
            // InternalDearCode.g:748:2: (otherlv_0= 'Hoy le quise contar al mundo sobre:' ( (lv_expresion_1_0= ruleExpression ) ) otherlv_2= '.' )
            {
            // InternalDearCode.g:748:2: (otherlv_0= 'Hoy le quise contar al mundo sobre:' ( (lv_expresion_1_0= ruleExpression ) ) otherlv_2= '.' )
            // InternalDearCode.g:749:3: otherlv_0= 'Hoy le quise contar al mundo sobre:' ( (lv_expresion_1_0= ruleExpression ) ) otherlv_2= '.'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getSalidaAccess().getHoyLeQuiseContarAlMundoSobreKeyword_0());
            		
            // InternalDearCode.g:753:3: ( (lv_expresion_1_0= ruleExpression ) )
            // InternalDearCode.g:754:4: (lv_expresion_1_0= ruleExpression )
            {
            // InternalDearCode.g:754:4: (lv_expresion_1_0= ruleExpression )
            // InternalDearCode.g:755:5: lv_expresion_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSalidaAccess().getExpresionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_expresion_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSalidaRule());
            					}
            					set(
            						current,
            						"expresion",
            						lv_expresion_1_0,
            						"edu.upb.lp.DearCode.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getSalidaAccess().getFullStopKeyword_2());
            		

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
    // $ANTLR end "ruleSalida"


    // $ANTLR start "entryRuleValor"
    // InternalDearCode.g:780:1: entryRuleValor returns [EObject current=null] : iv_ruleValor= ruleValor EOF ;
    public final EObject entryRuleValor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValor = null;


        try {
            // InternalDearCode.g:780:46: (iv_ruleValor= ruleValor EOF )
            // InternalDearCode.g:781:2: iv_ruleValor= ruleValor EOF
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
    // InternalDearCode.g:787:1: ruleValor returns [EObject current=null] : (this_NumeroLiteral_0= ruleNumeroLiteral | this_Expression_1= ruleExpression ) ;
    public final EObject ruleValor() throws RecognitionException {
        EObject current = null;

        EObject this_NumeroLiteral_0 = null;

        EObject this_Expression_1 = null;



        	enterRule();

        try {
            // InternalDearCode.g:793:2: ( (this_NumeroLiteral_0= ruleNumeroLiteral | this_Expression_1= ruleExpression ) )
            // InternalDearCode.g:794:2: (this_NumeroLiteral_0= ruleNumeroLiteral | this_Expression_1= ruleExpression )
            {
            // InternalDearCode.g:794:2: (this_NumeroLiteral_0= ruleNumeroLiteral | this_Expression_1= ruleExpression )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=19 && LA9_0<=28)) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_INT)||(LA9_0>=57 && LA9_0<=58)||(LA9_0>=61 && LA9_0<=64)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalDearCode.g:795:3: this_NumeroLiteral_0= ruleNumeroLiteral
                    {

                    			newCompositeNode(grammarAccess.getValorAccess().getNumeroLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumeroLiteral_0=ruleNumeroLiteral();

                    state._fsp--;


                    			current = this_NumeroLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:804:3: this_Expression_1= ruleExpression
                    {

                    			newCompositeNode(grammarAccess.getValorAccess().getExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Expression_1=ruleExpression();

                    state._fsp--;


                    			current = this_Expression_1;
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
    // InternalDearCode.g:816:1: entryRuleNumeroLiteral returns [EObject current=null] : iv_ruleNumeroLiteral= ruleNumeroLiteral EOF ;
    public final EObject entryRuleNumeroLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumeroLiteral = null;


        try {
            // InternalDearCode.g:816:54: (iv_ruleNumeroLiteral= ruleNumeroLiteral EOF )
            // InternalDearCode.g:817:2: iv_ruleNumeroLiteral= ruleNumeroLiteral EOF
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
    // InternalDearCode.g:823:1: ruleNumeroLiteral returns [EObject current=null] : (this_Simple_0= ruleSimple | this_Compuesto_1= ruleCompuesto ) ;
    public final EObject ruleNumeroLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_Simple_0 = null;

        EObject this_Compuesto_1 = null;



        	enterRule();

        try {
            // InternalDearCode.g:829:2: ( (this_Simple_0= ruleSimple | this_Compuesto_1= ruleCompuesto ) )
            // InternalDearCode.g:830:2: (this_Simple_0= ruleSimple | this_Compuesto_1= ruleCompuesto )
            {
            // InternalDearCode.g:830:2: (this_Simple_0= ruleSimple | this_Compuesto_1= ruleCompuesto )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalDearCode.g:831:3: this_Simple_0= ruleSimple
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
                    // InternalDearCode.g:840:3: this_Compuesto_1= ruleCompuesto
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
    // InternalDearCode.g:852:1: entryRuleSimple returns [EObject current=null] : iv_ruleSimple= ruleSimple EOF ;
    public final EObject entryRuleSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimple = null;


        try {
            // InternalDearCode.g:852:47: (iv_ruleSimple= ruleSimple EOF )
            // InternalDearCode.g:853:2: iv_ruleSimple= ruleSimple EOF
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
    // InternalDearCode.g:859:1: ruleSimple returns [EObject current=null] : ( ( (lv_value_0_1= 'cero' | lv_value_0_2= 'uno' | lv_value_0_3= 'dos' | lv_value_0_4= 'tres' | lv_value_0_5= 'cuatro' | lv_value_0_6= 'cinco' | lv_value_0_7= 'seis' | lv_value_0_8= 'siete' | lv_value_0_9= 'ocho' | lv_value_0_10= 'nueve' ) ) ) ;
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
            // InternalDearCode.g:865:2: ( ( ( (lv_value_0_1= 'cero' | lv_value_0_2= 'uno' | lv_value_0_3= 'dos' | lv_value_0_4= 'tres' | lv_value_0_5= 'cuatro' | lv_value_0_6= 'cinco' | lv_value_0_7= 'seis' | lv_value_0_8= 'siete' | lv_value_0_9= 'ocho' | lv_value_0_10= 'nueve' ) ) ) )
            // InternalDearCode.g:866:2: ( ( (lv_value_0_1= 'cero' | lv_value_0_2= 'uno' | lv_value_0_3= 'dos' | lv_value_0_4= 'tres' | lv_value_0_5= 'cuatro' | lv_value_0_6= 'cinco' | lv_value_0_7= 'seis' | lv_value_0_8= 'siete' | lv_value_0_9= 'ocho' | lv_value_0_10= 'nueve' ) ) )
            {
            // InternalDearCode.g:866:2: ( ( (lv_value_0_1= 'cero' | lv_value_0_2= 'uno' | lv_value_0_3= 'dos' | lv_value_0_4= 'tres' | lv_value_0_5= 'cuatro' | lv_value_0_6= 'cinco' | lv_value_0_7= 'seis' | lv_value_0_8= 'siete' | lv_value_0_9= 'ocho' | lv_value_0_10= 'nueve' ) ) )
            // InternalDearCode.g:867:3: ( (lv_value_0_1= 'cero' | lv_value_0_2= 'uno' | lv_value_0_3= 'dos' | lv_value_0_4= 'tres' | lv_value_0_5= 'cuatro' | lv_value_0_6= 'cinco' | lv_value_0_7= 'seis' | lv_value_0_8= 'siete' | lv_value_0_9= 'ocho' | lv_value_0_10= 'nueve' ) )
            {
            // InternalDearCode.g:867:3: ( (lv_value_0_1= 'cero' | lv_value_0_2= 'uno' | lv_value_0_3= 'dos' | lv_value_0_4= 'tres' | lv_value_0_5= 'cuatro' | lv_value_0_6= 'cinco' | lv_value_0_7= 'seis' | lv_value_0_8= 'siete' | lv_value_0_9= 'ocho' | lv_value_0_10= 'nueve' ) )
            // InternalDearCode.g:868:4: (lv_value_0_1= 'cero' | lv_value_0_2= 'uno' | lv_value_0_3= 'dos' | lv_value_0_4= 'tres' | lv_value_0_5= 'cuatro' | lv_value_0_6= 'cinco' | lv_value_0_7= 'seis' | lv_value_0_8= 'siete' | lv_value_0_9= 'ocho' | lv_value_0_10= 'nueve' )
            {
            // InternalDearCode.g:868:4: (lv_value_0_1= 'cero' | lv_value_0_2= 'uno' | lv_value_0_3= 'dos' | lv_value_0_4= 'tres' | lv_value_0_5= 'cuatro' | lv_value_0_6= 'cinco' | lv_value_0_7= 'seis' | lv_value_0_8= 'siete' | lv_value_0_9= 'ocho' | lv_value_0_10= 'nueve' )
            int alt11=10;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt11=1;
                }
                break;
            case 20:
                {
                alt11=2;
                }
                break;
            case 21:
                {
                alt11=3;
                }
                break;
            case 22:
                {
                alt11=4;
                }
                break;
            case 23:
                {
                alt11=5;
                }
                break;
            case 24:
                {
                alt11=6;
                }
                break;
            case 25:
                {
                alt11=7;
                }
                break;
            case 26:
                {
                alt11=8;
                }
                break;
            case 27:
                {
                alt11=9;
                }
                break;
            case 28:
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
                    // InternalDearCode.g:869:5: lv_value_0_1= 'cero'
                    {
                    lv_value_0_1=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getSimpleAccess().getValueCeroKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSimpleRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:880:5: lv_value_0_2= 'uno'
                    {
                    lv_value_0_2=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(lv_value_0_2, grammarAccess.getSimpleAccess().getValueUnoKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSimpleRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalDearCode.g:891:5: lv_value_0_3= 'dos'
                    {
                    lv_value_0_3=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_value_0_3, grammarAccess.getSimpleAccess().getValueDosKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSimpleRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalDearCode.g:902:5: lv_value_0_4= 'tres'
                    {
                    lv_value_0_4=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_value_0_4, grammarAccess.getSimpleAccess().getValueTresKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSimpleRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalDearCode.g:913:5: lv_value_0_5= 'cuatro'
                    {
                    lv_value_0_5=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(lv_value_0_5, grammarAccess.getSimpleAccess().getValueCuatroKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSimpleRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalDearCode.g:924:5: lv_value_0_6= 'cinco'
                    {
                    lv_value_0_6=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_value_0_6, grammarAccess.getSimpleAccess().getValueCincoKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSimpleRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_6, null);
                    				

                    }
                    break;
                case 7 :
                    // InternalDearCode.g:935:5: lv_value_0_7= 'seis'
                    {
                    lv_value_0_7=(Token)match(input,25,FOLLOW_2); 

                    					newLeafNode(lv_value_0_7, grammarAccess.getSimpleAccess().getValueSeisKeyword_0_6());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSimpleRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_7, null);
                    				

                    }
                    break;
                case 8 :
                    // InternalDearCode.g:946:5: lv_value_0_8= 'siete'
                    {
                    lv_value_0_8=(Token)match(input,26,FOLLOW_2); 

                    					newLeafNode(lv_value_0_8, grammarAccess.getSimpleAccess().getValueSieteKeyword_0_7());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSimpleRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_8, null);
                    				

                    }
                    break;
                case 9 :
                    // InternalDearCode.g:957:5: lv_value_0_9= 'ocho'
                    {
                    lv_value_0_9=(Token)match(input,27,FOLLOW_2); 

                    					newLeafNode(lv_value_0_9, grammarAccess.getSimpleAccess().getValueOchoKeyword_0_8());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSimpleRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_9, null);
                    				

                    }
                    break;
                case 10 :
                    // InternalDearCode.g:968:5: lv_value_0_10= 'nueve'
                    {
                    lv_value_0_10=(Token)match(input,28,FOLLOW_2); 

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
    // InternalDearCode.g:984:1: entryRuleCompuesto returns [EObject current=null] : iv_ruleCompuesto= ruleCompuesto EOF ;
    public final EObject entryRuleCompuesto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompuesto = null;


        try {
            // InternalDearCode.g:984:50: (iv_ruleCompuesto= ruleCompuesto EOF )
            // InternalDearCode.g:985:2: iv_ruleCompuesto= ruleCompuesto EOF
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
    // InternalDearCode.g:991:1: ruleCompuesto returns [EObject current=null] : ( ( (lv_cantidad_0_0= ruleSimple ) ) ( (lv_multiplicador_1_0= ruleMultiplicador ) ) (otherlv_2= 'y' ( (lv_resto_3_0= ruleSimple ) ) )? ) ;
    public final EObject ruleCompuesto() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_cantidad_0_0 = null;

        AntlrDatatypeRuleToken lv_multiplicador_1_0 = null;

        EObject lv_resto_3_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:997:2: ( ( ( (lv_cantidad_0_0= ruleSimple ) ) ( (lv_multiplicador_1_0= ruleMultiplicador ) ) (otherlv_2= 'y' ( (lv_resto_3_0= ruleSimple ) ) )? ) )
            // InternalDearCode.g:998:2: ( ( (lv_cantidad_0_0= ruleSimple ) ) ( (lv_multiplicador_1_0= ruleMultiplicador ) ) (otherlv_2= 'y' ( (lv_resto_3_0= ruleSimple ) ) )? )
            {
            // InternalDearCode.g:998:2: ( ( (lv_cantidad_0_0= ruleSimple ) ) ( (lv_multiplicador_1_0= ruleMultiplicador ) ) (otherlv_2= 'y' ( (lv_resto_3_0= ruleSimple ) ) )? )
            // InternalDearCode.g:999:3: ( (lv_cantidad_0_0= ruleSimple ) ) ( (lv_multiplicador_1_0= ruleMultiplicador ) ) (otherlv_2= 'y' ( (lv_resto_3_0= ruleSimple ) ) )?
            {
            // InternalDearCode.g:999:3: ( (lv_cantidad_0_0= ruleSimple ) )
            // InternalDearCode.g:1000:4: (lv_cantidad_0_0= ruleSimple )
            {
            // InternalDearCode.g:1000:4: (lv_cantidad_0_0= ruleSimple )
            // InternalDearCode.g:1001:5: lv_cantidad_0_0= ruleSimple
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

            // InternalDearCode.g:1018:3: ( (lv_multiplicador_1_0= ruleMultiplicador ) )
            // InternalDearCode.g:1019:4: (lv_multiplicador_1_0= ruleMultiplicador )
            {
            // InternalDearCode.g:1019:4: (lv_multiplicador_1_0= ruleMultiplicador )
            // InternalDearCode.g:1020:5: lv_multiplicador_1_0= ruleMultiplicador
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

            // InternalDearCode.g:1037:3: (otherlv_2= 'y' ( (lv_resto_3_0= ruleSimple ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDearCode.g:1038:4: otherlv_2= 'y' ( (lv_resto_3_0= ruleSimple ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getCompuestoAccess().getYKeyword_2_0());
                    			
                    // InternalDearCode.g:1042:4: ( (lv_resto_3_0= ruleSimple ) )
                    // InternalDearCode.g:1043:5: (lv_resto_3_0= ruleSimple )
                    {
                    // InternalDearCode.g:1043:5: (lv_resto_3_0= ruleSimple )
                    // InternalDearCode.g:1044:6: lv_resto_3_0= ruleSimple
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
    // InternalDearCode.g:1066:1: entryRuleMultiplicador returns [String current=null] : iv_ruleMultiplicador= ruleMultiplicador EOF ;
    public final String entryRuleMultiplicador() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultiplicador = null;


        try {
            // InternalDearCode.g:1066:53: (iv_ruleMultiplicador= ruleMultiplicador EOF )
            // InternalDearCode.g:1067:2: iv_ruleMultiplicador= ruleMultiplicador EOF
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
    // InternalDearCode.g:1073:1: ruleMultiplicador returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'decena' (kw= 's' )? ) | (kw= 'centena' (kw= 's' )? ) | (kw= 'millar' (kw= 'es' )? ) ) ;
    public final AntlrDatatypeRuleToken ruleMultiplicador() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDearCode.g:1079:2: ( ( (kw= 'decena' (kw= 's' )? ) | (kw= 'centena' (kw= 's' )? ) | (kw= 'millar' (kw= 'es' )? ) ) )
            // InternalDearCode.g:1080:2: ( (kw= 'decena' (kw= 's' )? ) | (kw= 'centena' (kw= 's' )? ) | (kw= 'millar' (kw= 'es' )? ) )
            {
            // InternalDearCode.g:1080:2: ( (kw= 'decena' (kw= 's' )? ) | (kw= 'centena' (kw= 's' )? ) | (kw= 'millar' (kw= 'es' )? ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt16=1;
                }
                break;
            case 32:
                {
                alt16=2;
                }
                break;
            case 33:
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
                    // InternalDearCode.g:1081:3: (kw= 'decena' (kw= 's' )? )
                    {
                    // InternalDearCode.g:1081:3: (kw= 'decena' (kw= 's' )? )
                    // InternalDearCode.g:1082:4: kw= 'decena' (kw= 's' )?
                    {
                    kw=(Token)match(input,30,FOLLOW_17); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getMultiplicadorAccess().getDecenaKeyword_0_0());
                    			
                    // InternalDearCode.g:1087:4: (kw= 's' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==31) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalDearCode.g:1088:5: kw= 's'
                            {
                            kw=(Token)match(input,31,FOLLOW_2); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getMultiplicadorAccess().getSKeyword_0_1());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDearCode.g:1096:3: (kw= 'centena' (kw= 's' )? )
                    {
                    // InternalDearCode.g:1096:3: (kw= 'centena' (kw= 's' )? )
                    // InternalDearCode.g:1097:4: kw= 'centena' (kw= 's' )?
                    {
                    kw=(Token)match(input,32,FOLLOW_17); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getMultiplicadorAccess().getCentenaKeyword_1_0());
                    			
                    // InternalDearCode.g:1102:4: (kw= 's' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==31) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalDearCode.g:1103:5: kw= 's'
                            {
                            kw=(Token)match(input,31,FOLLOW_2); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getMultiplicadorAccess().getSKeyword_1_1());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDearCode.g:1111:3: (kw= 'millar' (kw= 'es' )? )
                    {
                    // InternalDearCode.g:1111:3: (kw= 'millar' (kw= 'es' )? )
                    // InternalDearCode.g:1112:4: kw= 'millar' (kw= 'es' )?
                    {
                    kw=(Token)match(input,33,FOLLOW_18); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getMultiplicadorAccess().getMillarKeyword_2_0());
                    			
                    // InternalDearCode.g:1117:4: (kw= 'es' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==34) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalDearCode.g:1118:5: kw= 'es'
                            {
                            kw=(Token)match(input,34,FOLLOW_2); 

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
    // InternalDearCode.g:1129:1: entryRuleArticulo returns [String current=null] : iv_ruleArticulo= ruleArticulo EOF ;
    public final String entryRuleArticulo() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArticulo = null;


        try {
            // InternalDearCode.g:1129:48: (iv_ruleArticulo= ruleArticulo EOF )
            // InternalDearCode.g:1130:2: iv_ruleArticulo= ruleArticulo EOF
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
    // InternalDearCode.g:1136:1: ruleArticulo returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'un' | kw= 'una' ) ;
    public final AntlrDatatypeRuleToken ruleArticulo() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDearCode.g:1142:2: ( (kw= 'un' | kw= 'una' ) )
            // InternalDearCode.g:1143:2: (kw= 'un' | kw= 'una' )
            {
            // InternalDearCode.g:1143:2: (kw= 'un' | kw= 'una' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            else if ( (LA17_0==36) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalDearCode.g:1144:3: kw= 'un'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArticuloAccess().getUnKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:1150:3: kw= 'una'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

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
    // InternalDearCode.g:1159:1: entryRuleVerboDeclaracion returns [String current=null] : iv_ruleVerboDeclaracion= ruleVerboDeclaracion EOF ;
    public final String entryRuleVerboDeclaracion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVerboDeclaracion = null;


        try {
            // InternalDearCode.g:1159:56: (iv_ruleVerboDeclaracion= ruleVerboDeclaracion EOF )
            // InternalDearCode.g:1160:2: iv_ruleVerboDeclaracion= ruleVerboDeclaracion EOF
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
    // InternalDearCode.g:1166:1: ruleVerboDeclaracion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Te regalo' | kw= 'Ofrezco' | kw= 'Obsequio' | kw= 'Deposito en tu jard\\u00EDn' ) ;
    public final AntlrDatatypeRuleToken ruleVerboDeclaracion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDearCode.g:1172:2: ( (kw= 'Te regalo' | kw= 'Ofrezco' | kw= 'Obsequio' | kw= 'Deposito en tu jard\\u00EDn' ) )
            // InternalDearCode.g:1173:2: (kw= 'Te regalo' | kw= 'Ofrezco' | kw= 'Obsequio' | kw= 'Deposito en tu jard\\u00EDn' )
            {
            // InternalDearCode.g:1173:2: (kw= 'Te regalo' | kw= 'Ofrezco' | kw= 'Obsequio' | kw= 'Deposito en tu jard\\u00EDn' )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt18=1;
                }
                break;
            case 38:
                {
                alt18=2;
                }
                break;
            case 39:
                {
                alt18=3;
                }
                break;
            case 40:
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
                    // InternalDearCode.g:1174:3: kw= 'Te regalo'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVerboDeclaracionAccess().getTeRegaloKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:1180:3: kw= 'Ofrezco'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVerboDeclaracionAccess().getOfrezcoKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalDearCode.g:1186:3: kw= 'Obsequio'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVerboDeclaracionAccess().getObsequioKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalDearCode.g:1192:3: kw= 'Deposito en tu jard\\u00EDn'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

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
    // InternalDearCode.g:1201:1: entryRuleVerboReasignacion returns [String current=null] : iv_ruleVerboReasignacion= ruleVerboReasignacion EOF ;
    public final String entryRuleVerboReasignacion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVerboReasignacion = null;


        try {
            // InternalDearCode.g:1201:57: (iv_ruleVerboReasignacion= ruleVerboReasignacion EOF )
            // InternalDearCode.g:1202:2: iv_ruleVerboReasignacion= ruleVerboReasignacion EOF
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
    // InternalDearCode.g:1208:1: ruleVerboReasignacion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Perm\\u00EDteme alimentar' | kw= 'Perm\\u00EDteme regar' | kw= 'Perm\\u00EDteme ajustar' ) ;
    public final AntlrDatatypeRuleToken ruleVerboReasignacion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDearCode.g:1214:2: ( (kw= 'Perm\\u00EDteme alimentar' | kw= 'Perm\\u00EDteme regar' | kw= 'Perm\\u00EDteme ajustar' ) )
            // InternalDearCode.g:1215:2: (kw= 'Perm\\u00EDteme alimentar' | kw= 'Perm\\u00EDteme regar' | kw= 'Perm\\u00EDteme ajustar' )
            {
            // InternalDearCode.g:1215:2: (kw= 'Perm\\u00EDteme alimentar' | kw= 'Perm\\u00EDteme regar' | kw= 'Perm\\u00EDteme ajustar' )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt19=1;
                }
                break;
            case 42:
                {
                alt19=2;
                }
                break;
            case 43:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalDearCode.g:1216:3: kw= 'Perm\\u00EDteme alimentar'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVerboReasignacionAccess().getPermTemeAlimentarKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:1222:3: kw= 'Perm\\u00EDteme regar'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVerboReasignacionAccess().getPermTemeRegarKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalDearCode.g:1228:3: kw= 'Perm\\u00EDteme ajustar'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVerboReasignacionAccess().getPermTemeAjustarKeyword_2());
                    		

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
    // InternalDearCode.g:1237:1: entryRuleMI_ID returns [EObject current=null] : iv_ruleMI_ID= ruleMI_ID EOF ;
    public final EObject entryRuleMI_ID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMI_ID = null;


        try {
            // InternalDearCode.g:1237:46: (iv_ruleMI_ID= ruleMI_ID EOF )
            // InternalDearCode.g:1238:2: iv_ruleMI_ID= ruleMI_ID EOF
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
    // InternalDearCode.g:1244:1: ruleMI_ID returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleMI_ID() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDearCode.g:1250:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalDearCode.g:1251:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalDearCode.g:1251:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDearCode.g:1252:3: (lv_name_0_0= RULE_ID )
            {
            // InternalDearCode.g:1252:3: (lv_name_0_0= RULE_ID )
            // InternalDearCode.g:1253:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getMI_IDAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getMI_IDRule());
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
    // $ANTLR end "ruleMI_ID"


    // $ANTLR start "entryRuleCondicion"
    // InternalDearCode.g:1272:1: entryRuleCondicion returns [EObject current=null] : iv_ruleCondicion= ruleCondicion EOF ;
    public final EObject entryRuleCondicion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondicion = null;


        try {
            // InternalDearCode.g:1272:50: (iv_ruleCondicion= ruleCondicion EOF )
            // InternalDearCode.g:1273:2: iv_ruleCondicion= ruleCondicion EOF
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
    // InternalDearCode.g:1279:1: ruleCondicion returns [EObject current=null] : this_Expression_0= ruleExpression ;
    public final EObject ruleCondicion() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:1285:2: (this_Expression_0= ruleExpression )
            // InternalDearCode.g:1286:2: this_Expression_0= ruleExpression
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
    // InternalDearCode.g:1297:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalDearCode.g:1297:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalDearCode.g:1298:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalDearCode.g:1304:1: ruleExpression returns [EObject current=null] : this_OrExpr_0= ruleOrExpr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpr_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:1310:2: (this_OrExpr_0= ruleOrExpr )
            // InternalDearCode.g:1311:2: this_OrExpr_0= ruleOrExpr
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
    // InternalDearCode.g:1322:1: entryRuleOrExpr returns [EObject current=null] : iv_ruleOrExpr= ruleOrExpr EOF ;
    public final EObject entryRuleOrExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpr = null;


        try {
            // InternalDearCode.g:1322:47: (iv_ruleOrExpr= ruleOrExpr EOF )
            // InternalDearCode.g:1323:2: iv_ruleOrExpr= ruleOrExpr EOF
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
    // InternalDearCode.g:1329:1: ruleOrExpr returns [EObject current=null] : (this_AndExpr_0= ruleAndExpr ( () otherlv_2= 'o quiz\\u00E1s' ( (lv_right_3_0= ruleAndExpr ) ) )* ) ;
    public final EObject ruleOrExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:1335:2: ( (this_AndExpr_0= ruleAndExpr ( () otherlv_2= 'o quiz\\u00E1s' ( (lv_right_3_0= ruleAndExpr ) ) )* ) )
            // InternalDearCode.g:1336:2: (this_AndExpr_0= ruleAndExpr ( () otherlv_2= 'o quiz\\u00E1s' ( (lv_right_3_0= ruleAndExpr ) ) )* )
            {
            // InternalDearCode.g:1336:2: (this_AndExpr_0= ruleAndExpr ( () otherlv_2= 'o quiz\\u00E1s' ( (lv_right_3_0= ruleAndExpr ) ) )* )
            // InternalDearCode.g:1337:3: this_AndExpr_0= ruleAndExpr ( () otherlv_2= 'o quiz\\u00E1s' ( (lv_right_3_0= ruleAndExpr ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrExprAccess().getAndExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_AndExpr_0=ruleAndExpr();

            state._fsp--;


            			current = this_AndExpr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDearCode.g:1345:3: ( () otherlv_2= 'o quiz\\u00E1s' ( (lv_right_3_0= ruleAndExpr ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==44) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalDearCode.g:1346:4: () otherlv_2= 'o quiz\\u00E1s' ( (lv_right_3_0= ruleAndExpr ) )
            	    {
            	    // InternalDearCode.g:1346:4: ()
            	    // InternalDearCode.g:1347:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrExprAccess().getOrExprLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,44,FOLLOW_11); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrExprAccess().getOQuizSKeyword_1_1());
            	    			
            	    // InternalDearCode.g:1357:4: ( (lv_right_3_0= ruleAndExpr ) )
            	    // InternalDearCode.g:1358:5: (lv_right_3_0= ruleAndExpr )
            	    {
            	    // InternalDearCode.g:1358:5: (lv_right_3_0= ruleAndExpr )
            	    // InternalDearCode.g:1359:6: lv_right_3_0= ruleAndExpr
            	    {

            	    						newCompositeNode(grammarAccess.getOrExprAccess().getRightAndExprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_19);
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
            	    break loop20;
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
    // InternalDearCode.g:1381:1: entryRuleAndExpr returns [EObject current=null] : iv_ruleAndExpr= ruleAndExpr EOF ;
    public final EObject entryRuleAndExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpr = null;


        try {
            // InternalDearCode.g:1381:48: (iv_ruleAndExpr= ruleAndExpr EOF )
            // InternalDearCode.g:1382:2: iv_ruleAndExpr= ruleAndExpr EOF
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
    // InternalDearCode.g:1388:1: ruleAndExpr returns [EObject current=null] : (this_EqualityExpr_0= ruleEqualityExpr ( () otherlv_2= 'y tambi\\u00E9n' ( (lv_right_3_0= ruleEqualityExpr ) ) )* ) ;
    public final EObject ruleAndExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EqualityExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:1394:2: ( (this_EqualityExpr_0= ruleEqualityExpr ( () otherlv_2= 'y tambi\\u00E9n' ( (lv_right_3_0= ruleEqualityExpr ) ) )* ) )
            // InternalDearCode.g:1395:2: (this_EqualityExpr_0= ruleEqualityExpr ( () otherlv_2= 'y tambi\\u00E9n' ( (lv_right_3_0= ruleEqualityExpr ) ) )* )
            {
            // InternalDearCode.g:1395:2: (this_EqualityExpr_0= ruleEqualityExpr ( () otherlv_2= 'y tambi\\u00E9n' ( (lv_right_3_0= ruleEqualityExpr ) ) )* )
            // InternalDearCode.g:1396:3: this_EqualityExpr_0= ruleEqualityExpr ( () otherlv_2= 'y tambi\\u00E9n' ( (lv_right_3_0= ruleEqualityExpr ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExprAccess().getEqualityExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_EqualityExpr_0=ruleEqualityExpr();

            state._fsp--;


            			current = this_EqualityExpr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDearCode.g:1404:3: ( () otherlv_2= 'y tambi\\u00E9n' ( (lv_right_3_0= ruleEqualityExpr ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==45) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDearCode.g:1405:4: () otherlv_2= 'y tambi\\u00E9n' ( (lv_right_3_0= ruleEqualityExpr ) )
            	    {
            	    // InternalDearCode.g:1405:4: ()
            	    // InternalDearCode.g:1406:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndExprAccess().getAndExprLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,45,FOLLOW_11); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndExprAccess().getYTambiNKeyword_1_1());
            	    			
            	    // InternalDearCode.g:1416:4: ( (lv_right_3_0= ruleEqualityExpr ) )
            	    // InternalDearCode.g:1417:5: (lv_right_3_0= ruleEqualityExpr )
            	    {
            	    // InternalDearCode.g:1417:5: (lv_right_3_0= ruleEqualityExpr )
            	    // InternalDearCode.g:1418:6: lv_right_3_0= ruleEqualityExpr
            	    {

            	    						newCompositeNode(grammarAccess.getAndExprAccess().getRightEqualityExprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_20);
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
            	    break loop21;
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
    // InternalDearCode.g:1440:1: entryRuleEqualityExpr returns [EObject current=null] : iv_ruleEqualityExpr= ruleEqualityExpr EOF ;
    public final EObject entryRuleEqualityExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpr = null;


        try {
            // InternalDearCode.g:1440:53: (iv_ruleEqualityExpr= ruleEqualityExpr EOF )
            // InternalDearCode.g:1441:2: iv_ruleEqualityExpr= ruleEqualityExpr EOF
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
    // InternalDearCode.g:1447:1: ruleEqualityExpr returns [EObject current=null] : (this_RelationalExpr_0= ruleRelationalExpr ( () (otherlv_2= 'late al un\\u00EDsono con' | otherlv_3= 'canta con un matiz distinto a' ) ( (lv_right_4_0= ruleRelationalExpr ) ) )* ) ;
    public final EObject ruleEqualityExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_RelationalExpr_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:1453:2: ( (this_RelationalExpr_0= ruleRelationalExpr ( () (otherlv_2= 'late al un\\u00EDsono con' | otherlv_3= 'canta con un matiz distinto a' ) ( (lv_right_4_0= ruleRelationalExpr ) ) )* ) )
            // InternalDearCode.g:1454:2: (this_RelationalExpr_0= ruleRelationalExpr ( () (otherlv_2= 'late al un\\u00EDsono con' | otherlv_3= 'canta con un matiz distinto a' ) ( (lv_right_4_0= ruleRelationalExpr ) ) )* )
            {
            // InternalDearCode.g:1454:2: (this_RelationalExpr_0= ruleRelationalExpr ( () (otherlv_2= 'late al un\\u00EDsono con' | otherlv_3= 'canta con un matiz distinto a' ) ( (lv_right_4_0= ruleRelationalExpr ) ) )* )
            // InternalDearCode.g:1455:3: this_RelationalExpr_0= ruleRelationalExpr ( () (otherlv_2= 'late al un\\u00EDsono con' | otherlv_3= 'canta con un matiz distinto a' ) ( (lv_right_4_0= ruleRelationalExpr ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityExprAccess().getRelationalExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_RelationalExpr_0=ruleRelationalExpr();

            state._fsp--;


            			current = this_RelationalExpr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDearCode.g:1463:3: ( () (otherlv_2= 'late al un\\u00EDsono con' | otherlv_3= 'canta con un matiz distinto a' ) ( (lv_right_4_0= ruleRelationalExpr ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=46 && LA23_0<=47)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalDearCode.g:1464:4: () (otherlv_2= 'late al un\\u00EDsono con' | otherlv_3= 'canta con un matiz distinto a' ) ( (lv_right_4_0= ruleRelationalExpr ) )
            	    {
            	    // InternalDearCode.g:1464:4: ()
            	    // InternalDearCode.g:1465:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualityExprAccess().getEqualityExprLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDearCode.g:1471:4: (otherlv_2= 'late al un\\u00EDsono con' | otherlv_3= 'canta con un matiz distinto a' )
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==46) ) {
            	        alt22=1;
            	    }
            	    else if ( (LA22_0==47) ) {
            	        alt22=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // InternalDearCode.g:1472:5: otherlv_2= 'late al un\\u00EDsono con'
            	            {
            	            otherlv_2=(Token)match(input,46,FOLLOW_11); 

            	            					newLeafNode(otherlv_2, grammarAccess.getEqualityExprAccess().getLateAlUnSonoConKeyword_1_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalDearCode.g:1477:5: otherlv_3= 'canta con un matiz distinto a'
            	            {
            	            otherlv_3=(Token)match(input,47,FOLLOW_11); 

            	            					newLeafNode(otherlv_3, grammarAccess.getEqualityExprAccess().getCantaConUnMatizDistintoAKeyword_1_1_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalDearCode.g:1482:4: ( (lv_right_4_0= ruleRelationalExpr ) )
            	    // InternalDearCode.g:1483:5: (lv_right_4_0= ruleRelationalExpr )
            	    {
            	    // InternalDearCode.g:1483:5: (lv_right_4_0= ruleRelationalExpr )
            	    // InternalDearCode.g:1484:6: lv_right_4_0= ruleRelationalExpr
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityExprAccess().getRightRelationalExprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_21);
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
            	    break loop23;
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
    // InternalDearCode.g:1506:1: entryRuleRelationalExpr returns [EObject current=null] : iv_ruleRelationalExpr= ruleRelationalExpr EOF ;
    public final EObject entryRuleRelationalExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpr = null;


        try {
            // InternalDearCode.g:1506:55: (iv_ruleRelationalExpr= ruleRelationalExpr EOF )
            // InternalDearCode.g:1507:2: iv_ruleRelationalExpr= ruleRelationalExpr EOF
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
    // InternalDearCode.g:1513:1: ruleRelationalExpr returns [EObject current=null] : (this_AdditiveExpr_0= ruleAdditiveExpr ( () ( (lv_op_2_0= ruleRelationalOp ) ) ( (lv_right_3_0= ruleAdditiveExpr ) ) )? ) ;
    public final EObject ruleRelationalExpr() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpr_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:1519:2: ( (this_AdditiveExpr_0= ruleAdditiveExpr ( () ( (lv_op_2_0= ruleRelationalOp ) ) ( (lv_right_3_0= ruleAdditiveExpr ) ) )? ) )
            // InternalDearCode.g:1520:2: (this_AdditiveExpr_0= ruleAdditiveExpr ( () ( (lv_op_2_0= ruleRelationalOp ) ) ( (lv_right_3_0= ruleAdditiveExpr ) ) )? )
            {
            // InternalDearCode.g:1520:2: (this_AdditiveExpr_0= ruleAdditiveExpr ( () ( (lv_op_2_0= ruleRelationalOp ) ) ( (lv_right_3_0= ruleAdditiveExpr ) ) )? )
            // InternalDearCode.g:1521:3: this_AdditiveExpr_0= ruleAdditiveExpr ( () ( (lv_op_2_0= ruleRelationalOp ) ) ( (lv_right_3_0= ruleAdditiveExpr ) ) )?
            {

            			newCompositeNode(grammarAccess.getRelationalExprAccess().getAdditiveExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_AdditiveExpr_0=ruleAdditiveExpr();

            state._fsp--;


            			current = this_AdditiveExpr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDearCode.g:1529:3: ( () ( (lv_op_2_0= ruleRelationalOp ) ) ( (lv_right_3_0= ruleAdditiveExpr ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=48 && LA24_0<=51)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDearCode.g:1530:4: () ( (lv_op_2_0= ruleRelationalOp ) ) ( (lv_right_3_0= ruleAdditiveExpr ) )
                    {
                    // InternalDearCode.g:1530:4: ()
                    // InternalDearCode.g:1531:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getRelationalExprAccess().getBinaryRelationLeftAction_1_0(),
                    						current);
                    				

                    }

                    // InternalDearCode.g:1537:4: ( (lv_op_2_0= ruleRelationalOp ) )
                    // InternalDearCode.g:1538:5: (lv_op_2_0= ruleRelationalOp )
                    {
                    // InternalDearCode.g:1538:5: (lv_op_2_0= ruleRelationalOp )
                    // InternalDearCode.g:1539:6: lv_op_2_0= ruleRelationalOp
                    {

                    						newCompositeNode(grammarAccess.getRelationalExprAccess().getOpRelationalOpParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_op_2_0=ruleRelationalOp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelationalExprRule());
                    						}
                    						set(
                    							current,
                    							"op",
                    							lv_op_2_0,
                    							"edu.upb.lp.DearCode.RelationalOp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDearCode.g:1556:4: ( (lv_right_3_0= ruleAdditiveExpr ) )
                    // InternalDearCode.g:1557:5: (lv_right_3_0= ruleAdditiveExpr )
                    {
                    // InternalDearCode.g:1557:5: (lv_right_3_0= ruleAdditiveExpr )
                    // InternalDearCode.g:1558:6: lv_right_3_0= ruleAdditiveExpr
                    {

                    						newCompositeNode(grammarAccess.getRelationalExprAccess().getRightAdditiveExprParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleAdditiveExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelationalExprRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_3_0,
                    							"edu.upb.lp.DearCode.AdditiveExpr");
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
    // $ANTLR end "ruleRelationalExpr"


    // $ANTLR start "entryRuleRelationalOp"
    // InternalDearCode.g:1580:1: entryRuleRelationalOp returns [String current=null] : iv_ruleRelationalOp= ruleRelationalOp EOF ;
    public final String entryRuleRelationalOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelationalOp = null;


        try {
            // InternalDearCode.g:1580:52: (iv_ruleRelationalOp= ruleRelationalOp EOF )
            // InternalDearCode.g:1581:2: iv_ruleRelationalOp= ruleRelationalOp EOF
            {
             newCompositeNode(grammarAccess.getRelationalOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationalOp=ruleRelationalOp();

            state._fsp--;

             current =iv_ruleRelationalOp.getText(); 
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
    // $ANTLR end "entryRuleRelationalOp"


    // $ANTLR start "ruleRelationalOp"
    // InternalDearCode.g:1587:1: ruleRelationalOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'susurra con menos fuerza que' | kw= 'casi suspira al mismo nivel que' | kw= 'arde con m\\u00E1s pasi\\u00F3n que' | kw= 'rodea con tanta fuerza como' ) ;
    public final AntlrDatatypeRuleToken ruleRelationalOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDearCode.g:1593:2: ( (kw= 'susurra con menos fuerza que' | kw= 'casi suspira al mismo nivel que' | kw= 'arde con m\\u00E1s pasi\\u00F3n que' | kw= 'rodea con tanta fuerza como' ) )
            // InternalDearCode.g:1594:2: (kw= 'susurra con menos fuerza que' | kw= 'casi suspira al mismo nivel que' | kw= 'arde con m\\u00E1s pasi\\u00F3n que' | kw= 'rodea con tanta fuerza como' )
            {
            // InternalDearCode.g:1594:2: (kw= 'susurra con menos fuerza que' | kw= 'casi suspira al mismo nivel que' | kw= 'arde con m\\u00E1s pasi\\u00F3n que' | kw= 'rodea con tanta fuerza como' )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt25=1;
                }
                break;
            case 49:
                {
                alt25=2;
                }
                break;
            case 50:
                {
                alt25=3;
                }
                break;
            case 51:
                {
                alt25=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalDearCode.g:1595:3: kw= 'susurra con menos fuerza que'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationalOpAccess().getSusurraConMenosFuerzaQueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:1601:3: kw= 'casi suspira al mismo nivel que'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationalOpAccess().getCasiSuspiraAlMismoNivelQueKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalDearCode.g:1607:3: kw= 'arde con m\\u00E1s pasi\\u00F3n que'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationalOpAccess().getArdeConMSPasiNQueKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalDearCode.g:1613:3: kw= 'rodea con tanta fuerza como'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationalOpAccess().getRodeaConTantaFuerzaComoKeyword_3());
                    		

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
    // $ANTLR end "ruleRelationalOp"


    // $ANTLR start "entryRuleAdditiveExpr"
    // InternalDearCode.g:1622:1: entryRuleAdditiveExpr returns [EObject current=null] : iv_ruleAdditiveExpr= ruleAdditiveExpr EOF ;
    public final EObject entryRuleAdditiveExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpr = null;


        try {
            // InternalDearCode.g:1622:53: (iv_ruleAdditiveExpr= ruleAdditiveExpr EOF )
            // InternalDearCode.g:1623:2: iv_ruleAdditiveExpr= ruleAdditiveExpr EOF
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
    // InternalDearCode.g:1629:1: ruleAdditiveExpr returns [EObject current=null] : (this_MultiplicativeExpr_0= ruleMultiplicativeExpr ( () (otherlv_2= 'unidos en un solo suspiro con' | otherlv_3= 'fundidos en la llama de' ) ( (lv_right_4_0= ruleMultiplicativeExpr ) ) )* ) ;
    public final EObject ruleAdditiveExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_MultiplicativeExpr_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:1635:2: ( (this_MultiplicativeExpr_0= ruleMultiplicativeExpr ( () (otherlv_2= 'unidos en un solo suspiro con' | otherlv_3= 'fundidos en la llama de' ) ( (lv_right_4_0= ruleMultiplicativeExpr ) ) )* ) )
            // InternalDearCode.g:1636:2: (this_MultiplicativeExpr_0= ruleMultiplicativeExpr ( () (otherlv_2= 'unidos en un solo suspiro con' | otherlv_3= 'fundidos en la llama de' ) ( (lv_right_4_0= ruleMultiplicativeExpr ) ) )* )
            {
            // InternalDearCode.g:1636:2: (this_MultiplicativeExpr_0= ruleMultiplicativeExpr ( () (otherlv_2= 'unidos en un solo suspiro con' | otherlv_3= 'fundidos en la llama de' ) ( (lv_right_4_0= ruleMultiplicativeExpr ) ) )* )
            // InternalDearCode.g:1637:3: this_MultiplicativeExpr_0= ruleMultiplicativeExpr ( () (otherlv_2= 'unidos en un solo suspiro con' | otherlv_3= 'fundidos en la llama de' ) ( (lv_right_4_0= ruleMultiplicativeExpr ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditiveExprAccess().getMultiplicativeExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_MultiplicativeExpr_0=ruleMultiplicativeExpr();

            state._fsp--;


            			current = this_MultiplicativeExpr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDearCode.g:1645:3: ( () (otherlv_2= 'unidos en un solo suspiro con' | otherlv_3= 'fundidos en la llama de' ) ( (lv_right_4_0= ruleMultiplicativeExpr ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=52 && LA27_0<=53)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalDearCode.g:1646:4: () (otherlv_2= 'unidos en un solo suspiro con' | otherlv_3= 'fundidos en la llama de' ) ( (lv_right_4_0= ruleMultiplicativeExpr ) )
            	    {
            	    // InternalDearCode.g:1646:4: ()
            	    // InternalDearCode.g:1647:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditiveExprAccess().getAdditiveExprLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDearCode.g:1653:4: (otherlv_2= 'unidos en un solo suspiro con' | otherlv_3= 'fundidos en la llama de' )
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==52) ) {
            	        alt26=1;
            	    }
            	    else if ( (LA26_0==53) ) {
            	        alt26=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // InternalDearCode.g:1654:5: otherlv_2= 'unidos en un solo suspiro con'
            	            {
            	            otherlv_2=(Token)match(input,52,FOLLOW_11); 

            	            					newLeafNode(otherlv_2, grammarAccess.getAdditiveExprAccess().getUnidosEnUnSoloSuspiroConKeyword_1_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalDearCode.g:1659:5: otherlv_3= 'fundidos en la llama de'
            	            {
            	            otherlv_3=(Token)match(input,53,FOLLOW_11); 

            	            					newLeafNode(otherlv_3, grammarAccess.getAdditiveExprAccess().getFundidosEnLaLlamaDeKeyword_1_1_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalDearCode.g:1664:4: ( (lv_right_4_0= ruleMultiplicativeExpr ) )
            	    // InternalDearCode.g:1665:5: (lv_right_4_0= ruleMultiplicativeExpr )
            	    {
            	    // InternalDearCode.g:1665:5: (lv_right_4_0= ruleMultiplicativeExpr )
            	    // InternalDearCode.g:1666:6: lv_right_4_0= ruleMultiplicativeExpr
            	    {

            	    						newCompositeNode(grammarAccess.getAdditiveExprAccess().getRightMultiplicativeExprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_23);
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
            	    break loop27;
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
    // InternalDearCode.g:1688:1: entryRuleMultiplicativeExpr returns [EObject current=null] : iv_ruleMultiplicativeExpr= ruleMultiplicativeExpr EOF ;
    public final EObject entryRuleMultiplicativeExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpr = null;


        try {
            // InternalDearCode.g:1688:59: (iv_ruleMultiplicativeExpr= ruleMultiplicativeExpr EOF )
            // InternalDearCode.g:1689:2: iv_ruleMultiplicativeExpr= ruleMultiplicativeExpr EOF
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
    // InternalDearCode.g:1695:1: ruleMultiplicativeExpr returns [EObject current=null] : (this_UnaryExpr_0= ruleUnaryExpr ( () (otherlv_2= 'fortalecidos por el fuego de' | otherlv_3= 'separados entre los ecos de' | otherlv_4= 'resuena con el eco de' ) ( (lv_right_5_0= ruleUnaryExpr ) ) )* ) ;
    public final EObject ruleMultiplicativeExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject this_UnaryExpr_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:1701:2: ( (this_UnaryExpr_0= ruleUnaryExpr ( () (otherlv_2= 'fortalecidos por el fuego de' | otherlv_3= 'separados entre los ecos de' | otherlv_4= 'resuena con el eco de' ) ( (lv_right_5_0= ruleUnaryExpr ) ) )* ) )
            // InternalDearCode.g:1702:2: (this_UnaryExpr_0= ruleUnaryExpr ( () (otherlv_2= 'fortalecidos por el fuego de' | otherlv_3= 'separados entre los ecos de' | otherlv_4= 'resuena con el eco de' ) ( (lv_right_5_0= ruleUnaryExpr ) ) )* )
            {
            // InternalDearCode.g:1702:2: (this_UnaryExpr_0= ruleUnaryExpr ( () (otherlv_2= 'fortalecidos por el fuego de' | otherlv_3= 'separados entre los ecos de' | otherlv_4= 'resuena con el eco de' ) ( (lv_right_5_0= ruleUnaryExpr ) ) )* )
            // InternalDearCode.g:1703:3: this_UnaryExpr_0= ruleUnaryExpr ( () (otherlv_2= 'fortalecidos por el fuego de' | otherlv_3= 'separados entre los ecos de' | otherlv_4= 'resuena con el eco de' ) ( (lv_right_5_0= ruleUnaryExpr ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicativeExprAccess().getUnaryExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_UnaryExpr_0=ruleUnaryExpr();

            state._fsp--;


            			current = this_UnaryExpr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDearCode.g:1711:3: ( () (otherlv_2= 'fortalecidos por el fuego de' | otherlv_3= 'separados entre los ecos de' | otherlv_4= 'resuena con el eco de' ) ( (lv_right_5_0= ruleUnaryExpr ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=54 && LA29_0<=56)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalDearCode.g:1712:4: () (otherlv_2= 'fortalecidos por el fuego de' | otherlv_3= 'separados entre los ecos de' | otherlv_4= 'resuena con el eco de' ) ( (lv_right_5_0= ruleUnaryExpr ) )
            	    {
            	    // InternalDearCode.g:1712:4: ()
            	    // InternalDearCode.g:1713:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicativeExprAccess().getMultiplicativeExprLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDearCode.g:1719:4: (otherlv_2= 'fortalecidos por el fuego de' | otherlv_3= 'separados entre los ecos de' | otherlv_4= 'resuena con el eco de' )
            	    int alt28=3;
            	    switch ( input.LA(1) ) {
            	    case 54:
            	        {
            	        alt28=1;
            	        }
            	        break;
            	    case 55:
            	        {
            	        alt28=2;
            	        }
            	        break;
            	    case 56:
            	        {
            	        alt28=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt28) {
            	        case 1 :
            	            // InternalDearCode.g:1720:5: otherlv_2= 'fortalecidos por el fuego de'
            	            {
            	            otherlv_2=(Token)match(input,54,FOLLOW_11); 

            	            					newLeafNode(otherlv_2, grammarAccess.getMultiplicativeExprAccess().getFortalecidosPorElFuegoDeKeyword_1_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalDearCode.g:1725:5: otherlv_3= 'separados entre los ecos de'
            	            {
            	            otherlv_3=(Token)match(input,55,FOLLOW_11); 

            	            					newLeafNode(otherlv_3, grammarAccess.getMultiplicativeExprAccess().getSeparadosEntreLosEcosDeKeyword_1_1_1());
            	            				

            	            }
            	            break;
            	        case 3 :
            	            // InternalDearCode.g:1730:5: otherlv_4= 'resuena con el eco de'
            	            {
            	            otherlv_4=(Token)match(input,56,FOLLOW_11); 

            	            					newLeafNode(otherlv_4, grammarAccess.getMultiplicativeExprAccess().getResuenaConElEcoDeKeyword_1_1_2());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalDearCode.g:1735:4: ( (lv_right_5_0= ruleUnaryExpr ) )
            	    // InternalDearCode.g:1736:5: (lv_right_5_0= ruleUnaryExpr )
            	    {
            	    // InternalDearCode.g:1736:5: (lv_right_5_0= ruleUnaryExpr )
            	    // InternalDearCode.g:1737:6: lv_right_5_0= ruleUnaryExpr
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicativeExprAccess().getRightUnaryExprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_right_5_0=ruleUnaryExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicativeExprRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"edu.upb.lp.DearCode.UnaryExpr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalDearCode.g:1759:1: entryRuleUnaryExpr returns [EObject current=null] : iv_ruleUnaryExpr= ruleUnaryExpr EOF ;
    public final EObject entryRuleUnaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpr = null;


        try {
            // InternalDearCode.g:1759:50: (iv_ruleUnaryExpr= ruleUnaryExpr EOF )
            // InternalDearCode.g:1760:2: iv_ruleUnaryExpr= ruleUnaryExpr EOF
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
    // InternalDearCode.g:1766:1: ruleUnaryExpr returns [EObject current=null] : ( ( () otherlv_1= 'no creo que' ( (lv_expr_2_0= rulePrimaryExpr ) ) ) | this_PrimaryExpr_3= rulePrimaryExpr ) ;
    public final EObject ruleUnaryExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;

        EObject this_PrimaryExpr_3 = null;



        	enterRule();

        try {
            // InternalDearCode.g:1772:2: ( ( ( () otherlv_1= 'no creo que' ( (lv_expr_2_0= rulePrimaryExpr ) ) ) | this_PrimaryExpr_3= rulePrimaryExpr ) )
            // InternalDearCode.g:1773:2: ( ( () otherlv_1= 'no creo que' ( (lv_expr_2_0= rulePrimaryExpr ) ) ) | this_PrimaryExpr_3= rulePrimaryExpr )
            {
            // InternalDearCode.g:1773:2: ( ( () otherlv_1= 'no creo que' ( (lv_expr_2_0= rulePrimaryExpr ) ) ) | this_PrimaryExpr_3= rulePrimaryExpr )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==57) ) {
                alt30=1;
            }
            else if ( ((LA30_0>=RULE_STRING && LA30_0<=RULE_INT)||LA30_0==58||(LA30_0>=61 && LA30_0<=64)) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalDearCode.g:1774:3: ( () otherlv_1= 'no creo que' ( (lv_expr_2_0= rulePrimaryExpr ) ) )
                    {
                    // InternalDearCode.g:1774:3: ( () otherlv_1= 'no creo que' ( (lv_expr_2_0= rulePrimaryExpr ) ) )
                    // InternalDearCode.g:1775:4: () otherlv_1= 'no creo que' ( (lv_expr_2_0= rulePrimaryExpr ) )
                    {
                    // InternalDearCode.g:1775:4: ()
                    // InternalDearCode.g:1776:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryExprAccess().getNotExprAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,57,FOLLOW_11); 

                    				newLeafNode(otherlv_1, grammarAccess.getUnaryExprAccess().getNoCreoQueKeyword_0_1());
                    			
                    // InternalDearCode.g:1786:4: ( (lv_expr_2_0= rulePrimaryExpr ) )
                    // InternalDearCode.g:1787:5: (lv_expr_2_0= rulePrimaryExpr )
                    {
                    // InternalDearCode.g:1787:5: (lv_expr_2_0= rulePrimaryExpr )
                    // InternalDearCode.g:1788:6: lv_expr_2_0= rulePrimaryExpr
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
                    // InternalDearCode.g:1807:3: this_PrimaryExpr_3= rulePrimaryExpr
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


    // $ANTLR start "entryRuleFunctionCall"
    // InternalDearCode.g:1819:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalDearCode.g:1819:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalDearCode.g:1820:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
             newCompositeNode(grammarAccess.getFunctionCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;

             current =iv_ruleFunctionCall; 
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
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // InternalDearCode.g:1826:1: ruleFunctionCall returns [EObject current=null] : ( ( (lv_name_0_0= ruleMI_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_name_0_0 = null;

        EObject lv_args_2_0 = null;

        EObject lv_args_4_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:1832:2: ( ( ( (lv_name_0_0= ruleMI_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) )
            // InternalDearCode.g:1833:2: ( ( (lv_name_0_0= ruleMI_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            {
            // InternalDearCode.g:1833:2: ( ( (lv_name_0_0= ruleMI_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            // InternalDearCode.g:1834:3: ( (lv_name_0_0= ruleMI_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpression ) ) )* )? otherlv_5= ')'
            {
            // InternalDearCode.g:1834:3: ( (lv_name_0_0= ruleMI_ID ) )
            // InternalDearCode.g:1835:4: (lv_name_0_0= ruleMI_ID )
            {
            // InternalDearCode.g:1835:4: (lv_name_0_0= ruleMI_ID )
            // InternalDearCode.g:1836:5: lv_name_0_0= ruleMI_ID
            {

            					newCompositeNode(grammarAccess.getFunctionCallAccess().getNameMI_IDParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
            lv_name_0_0=ruleMI_ID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionCallRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"edu.upb.lp.DearCode.MI_ID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,58,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDearCode.g:1857:3: ( ( (lv_args_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpression ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_STRING && LA32_0<=RULE_INT)||(LA32_0>=57 && LA32_0<=58)||(LA32_0>=61 && LA32_0<=64)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDearCode.g:1858:4: ( (lv_args_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpression ) ) )*
                    {
                    // InternalDearCode.g:1858:4: ( (lv_args_2_0= ruleExpression ) )
                    // InternalDearCode.g:1859:5: (lv_args_2_0= ruleExpression )
                    {
                    // InternalDearCode.g:1859:5: (lv_args_2_0= ruleExpression )
                    // InternalDearCode.g:1860:6: lv_args_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getFunctionCallAccess().getArgsExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_args_2_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_2_0,
                    							"edu.upb.lp.DearCode.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDearCode.g:1877:4: (otherlv_3= ',' ( (lv_args_4_0= ruleExpression ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==59) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalDearCode.g:1878:5: otherlv_3= ',' ( (lv_args_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,59,FOLLOW_11); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalDearCode.g:1882:5: ( (lv_args_4_0= ruleExpression ) )
                    	    // InternalDearCode.g:1883:6: (lv_args_4_0= ruleExpression )
                    	    {
                    	    // InternalDearCode.g:1883:6: (lv_args_4_0= ruleExpression )
                    	    // InternalDearCode.g:1884:7: lv_args_4_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getFunctionCallAccess().getArgsExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_args_4_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"args",
                    	    								lv_args_4_0,
                    	    								"edu.upb.lp.DearCode.Expression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,60,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRulePrimaryExpr"
    // InternalDearCode.g:1911:1: entryRulePrimaryExpr returns [EObject current=null] : iv_rulePrimaryExpr= rulePrimaryExpr EOF ;
    public final EObject entryRulePrimaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpr = null;


        try {
            // InternalDearCode.g:1911:52: (iv_rulePrimaryExpr= rulePrimaryExpr EOF )
            // InternalDearCode.g:1912:2: iv_rulePrimaryExpr= rulePrimaryExpr EOF
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
    // InternalDearCode.g:1918:1: rulePrimaryExpr returns [EObject current=null] : (this_Literal_0= ruleLiteral | this_VariableRef_1= ruleVariableRef | this_SpecialBoolean_2= ruleSpecialBoolean | this_FunctionCall_3= ruleFunctionCall | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) ;
    public final EObject rulePrimaryExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_Literal_0 = null;

        EObject this_VariableRef_1 = null;

        EObject this_SpecialBoolean_2 = null;

        EObject this_FunctionCall_3 = null;

        EObject this_Expression_5 = null;



        	enterRule();

        try {
            // InternalDearCode.g:1924:2: ( (this_Literal_0= ruleLiteral | this_VariableRef_1= ruleVariableRef | this_SpecialBoolean_2= ruleSpecialBoolean | this_FunctionCall_3= ruleFunctionCall | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) )
            // InternalDearCode.g:1925:2: (this_Literal_0= ruleLiteral | this_VariableRef_1= ruleVariableRef | this_SpecialBoolean_2= ruleSpecialBoolean | this_FunctionCall_3= ruleFunctionCall | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
            {
            // InternalDearCode.g:1925:2: (this_Literal_0= ruleLiteral | this_VariableRef_1= ruleVariableRef | this_SpecialBoolean_2= ruleSpecialBoolean | this_FunctionCall_3= ruleFunctionCall | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
            int alt33=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case 61:
            case 62:
                {
                alt33=1;
                }
                break;
            case RULE_ID:
                {
                int LA33_2 = input.LA(2);

                if ( (LA33_2==58) ) {
                    alt33=4;
                }
                else if ( (LA33_2==EOF||(LA33_2>=RULE_ANYTEXT && LA33_2<=RULE_STRING)||LA33_2==14||(LA33_2>=44 && LA33_2<=56)||(LA33_2>=59 && LA33_2<=60)||LA33_2==76) ) {
                    alt33=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 2, input);

                    throw nvae;
                }
                }
                break;
            case 63:
            case 64:
                {
                alt33=3;
                }
                break;
            case 58:
                {
                alt33=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalDearCode.g:1926:3: this_Literal_0= ruleLiteral
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
                    // InternalDearCode.g:1935:3: this_VariableRef_1= ruleVariableRef
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
                    // InternalDearCode.g:1944:3: this_SpecialBoolean_2= ruleSpecialBoolean
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
                    // InternalDearCode.g:1953:3: this_FunctionCall_3= ruleFunctionCall
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExprAccess().getFunctionCallParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunctionCall_3=ruleFunctionCall();

                    state._fsp--;


                    			current = this_FunctionCall_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDearCode.g:1962:3: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    {
                    // InternalDearCode.g:1962:3: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    // InternalDearCode.g:1963:4: otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,58,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryExprAccess().getLeftParenthesisKeyword_4_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExprAccess().getExpressionParserRuleCall_4_1());
                    			
                    pushFollow(FOLLOW_28);
                    this_Expression_5=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_5;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_6=(Token)match(input,60,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getPrimaryExprAccess().getRightParenthesisKeyword_4_2());
                    			

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
    // InternalDearCode.g:1984:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalDearCode.g:1984:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalDearCode.g:1985:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalDearCode.g:1991:1: ruleLiteral returns [EObject current=null] : (this_IntLiteral_0= ruleIntLiteral | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_IntLiteral_0 = null;

        EObject this_StringLiteral_1 = null;

        EObject this_BooleanLiteral_2 = null;



        	enterRule();

        try {
            // InternalDearCode.g:1997:2: ( (this_IntLiteral_0= ruleIntLiteral | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral ) )
            // InternalDearCode.g:1998:2: (this_IntLiteral_0= ruleIntLiteral | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral )
            {
            // InternalDearCode.g:1998:2: (this_IntLiteral_0= ruleIntLiteral | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral )
            int alt34=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt34=1;
                }
                break;
            case RULE_STRING:
                {
                alt34=2;
                }
                break;
            case 61:
            case 62:
                {
                alt34=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalDearCode.g:1999:3: this_IntLiteral_0= ruleIntLiteral
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
                    // InternalDearCode.g:2008:3: this_StringLiteral_1= ruleStringLiteral
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
                    // InternalDearCode.g:2017:3: this_BooleanLiteral_2= ruleBooleanLiteral
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
    // InternalDearCode.g:2029:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalDearCode.g:2029:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalDearCode.g:2030:2: iv_ruleIntLiteral= ruleIntLiteral EOF
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
    // InternalDearCode.g:2036:1: ruleIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalDearCode.g:2042:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalDearCode.g:2043:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalDearCode.g:2043:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // InternalDearCode.g:2044:3: () ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalDearCode.g:2044:3: ()
            // InternalDearCode.g:2045:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntLiteralAccess().getIntLiteralAction_0(),
            					current);
            			

            }

            // InternalDearCode.g:2051:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalDearCode.g:2052:4: (lv_value_1_0= RULE_INT )
            {
            // InternalDearCode.g:2052:4: (lv_value_1_0= RULE_INT )
            // InternalDearCode.g:2053:5: lv_value_1_0= RULE_INT
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
    // InternalDearCode.g:2073:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalDearCode.g:2073:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalDearCode.g:2074:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalDearCode.g:2080:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalDearCode.g:2086:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalDearCode.g:2087:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalDearCode.g:2087:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalDearCode.g:2088:3: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalDearCode.g:2088:3: ()
            // InternalDearCode.g:2089:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
            					current);
            			

            }

            // InternalDearCode.g:2095:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalDearCode.g:2096:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalDearCode.g:2096:4: (lv_value_1_0= RULE_STRING )
            // InternalDearCode.g:2097:5: lv_value_1_0= RULE_STRING
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
    // InternalDearCode.g:2117:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalDearCode.g:2117:55: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalDearCode.g:2118:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
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
    // InternalDearCode.g:2124:1: ruleBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_1= 'siempre' | lv_value_1_2= 'jam\\u00E1s' ) ) ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_1=null;
        Token lv_value_1_2=null;


        	enterRule();

        try {
            // InternalDearCode.g:2130:2: ( ( () ( ( (lv_value_1_1= 'siempre' | lv_value_1_2= 'jam\\u00E1s' ) ) ) ) )
            // InternalDearCode.g:2131:2: ( () ( ( (lv_value_1_1= 'siempre' | lv_value_1_2= 'jam\\u00E1s' ) ) ) )
            {
            // InternalDearCode.g:2131:2: ( () ( ( (lv_value_1_1= 'siempre' | lv_value_1_2= 'jam\\u00E1s' ) ) ) )
            // InternalDearCode.g:2132:3: () ( ( (lv_value_1_1= 'siempre' | lv_value_1_2= 'jam\\u00E1s' ) ) )
            {
            // InternalDearCode.g:2132:3: ()
            // InternalDearCode.g:2133:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0(),
            					current);
            			

            }

            // InternalDearCode.g:2139:3: ( ( (lv_value_1_1= 'siempre' | lv_value_1_2= 'jam\\u00E1s' ) ) )
            // InternalDearCode.g:2140:4: ( (lv_value_1_1= 'siempre' | lv_value_1_2= 'jam\\u00E1s' ) )
            {
            // InternalDearCode.g:2140:4: ( (lv_value_1_1= 'siempre' | lv_value_1_2= 'jam\\u00E1s' ) )
            // InternalDearCode.g:2141:5: (lv_value_1_1= 'siempre' | lv_value_1_2= 'jam\\u00E1s' )
            {
            // InternalDearCode.g:2141:5: (lv_value_1_1= 'siempre' | lv_value_1_2= 'jam\\u00E1s' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==61) ) {
                alt35=1;
            }
            else if ( (LA35_0==62) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalDearCode.g:2142:6: lv_value_1_1= 'siempre'
                    {
                    lv_value_1_1=(Token)match(input,61,FOLLOW_2); 

                    						newLeafNode(lv_value_1_1, grammarAccess.getBooleanLiteralAccess().getValueSiempreKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBooleanLiteralRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:2153:6: lv_value_1_2= 'jam\\u00E1s'
                    {
                    lv_value_1_2=(Token)match(input,62,FOLLOW_2); 

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
    // InternalDearCode.g:2170:1: entryRuleVariableRef returns [EObject current=null] : iv_ruleVariableRef= ruleVariableRef EOF ;
    public final EObject entryRuleVariableRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableRef = null;


        try {
            // InternalDearCode.g:2170:52: (iv_ruleVariableRef= ruleVariableRef EOF )
            // InternalDearCode.g:2171:2: iv_ruleVariableRef= ruleVariableRef EOF
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
    // InternalDearCode.g:2177:1: ruleVariableRef returns [EObject current=null] : ( (lv_name_0_0= ruleMI_ID ) ) ;
    public final EObject ruleVariableRef() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:2183:2: ( ( (lv_name_0_0= ruleMI_ID ) ) )
            // InternalDearCode.g:2184:2: ( (lv_name_0_0= ruleMI_ID ) )
            {
            // InternalDearCode.g:2184:2: ( (lv_name_0_0= ruleMI_ID ) )
            // InternalDearCode.g:2185:3: (lv_name_0_0= ruleMI_ID )
            {
            // InternalDearCode.g:2185:3: (lv_name_0_0= ruleMI_ID )
            // InternalDearCode.g:2186:4: lv_name_0_0= ruleMI_ID
            {

            				newCompositeNode(grammarAccess.getVariableRefAccess().getNameMI_IDParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleMI_ID();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getVariableRefRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"edu.upb.lp.DearCode.MI_ID");
            				afterParserOrEnumRuleCall();
            			

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
    // InternalDearCode.g:2206:1: entryRuleSpecialBoolean returns [EObject current=null] : iv_ruleSpecialBoolean= ruleSpecialBoolean EOF ;
    public final EObject entryRuleSpecialBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecialBoolean = null;


        try {
            // InternalDearCode.g:2206:55: (iv_ruleSpecialBoolean= ruleSpecialBoolean EOF )
            // InternalDearCode.g:2207:2: iv_ruleSpecialBoolean= ruleSpecialBoolean EOF
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
    // InternalDearCode.g:2213:1: ruleSpecialBoolean returns [EObject current=null] : (otherlv_0= 'a\\u00FAn me piensas' | otherlv_1= 'tu voz me alcanza' ) ;
    public final EObject ruleSpecialBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDearCode.g:2219:2: ( (otherlv_0= 'a\\u00FAn me piensas' | otherlv_1= 'tu voz me alcanza' ) )
            // InternalDearCode.g:2220:2: (otherlv_0= 'a\\u00FAn me piensas' | otherlv_1= 'tu voz me alcanza' )
            {
            // InternalDearCode.g:2220:2: (otherlv_0= 'a\\u00FAn me piensas' | otherlv_1= 'tu voz me alcanza' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==63) ) {
                alt36=1;
            }
            else if ( (LA36_0==64) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalDearCode.g:2221:3: otherlv_0= 'a\\u00FAn me piensas'
                    {
                    otherlv_0=(Token)match(input,63,FOLLOW_2); 

                    			newLeafNode(otherlv_0, grammarAccess.getSpecialBooleanAccess().getANMePiensasKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:2226:3: otherlv_1= 'tu voz me alcanza'
                    {
                    otherlv_1=(Token)match(input,64,FOLLOW_2); 

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
    // InternalDearCode.g:2234:1: entryRuleCondicional returns [EObject current=null] : iv_ruleCondicional= ruleCondicional EOF ;
    public final EObject entryRuleCondicional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondicional = null;


        try {
            // InternalDearCode.g:2234:52: (iv_ruleCondicional= ruleCondicional EOF )
            // InternalDearCode.g:2235:2: iv_ruleCondicional= ruleCondicional EOF
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
    // InternalDearCode.g:2241:1: ruleCondicional returns [EObject current=null] : (otherlv_0= 'Si en tu corazon sientes que' ( (lv_condicion_1_0= ruleCondicion ) ) otherlv_2= ',' otherlv_3= 'entonces deja que estas palabras florezcan:' ( (lv_instruccionesThen_4_0= ruleInstruccion ) )+ (otherlv_5= 'Pero si el destino dijera lo contrario,' otherlv_6= 'que broten estas verdades:' ( (lv_instruccionesElse_7_0= ruleInstruccion ) )+ )? otherlv_8= 'Y as\\u00ED el universo sigue su curso.' ) ;
    public final EObject ruleCondicional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_condicion_1_0 = null;

        EObject lv_instruccionesThen_4_0 = null;

        EObject lv_instruccionesElse_7_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:2247:2: ( (otherlv_0= 'Si en tu corazon sientes que' ( (lv_condicion_1_0= ruleCondicion ) ) otherlv_2= ',' otherlv_3= 'entonces deja que estas palabras florezcan:' ( (lv_instruccionesThen_4_0= ruleInstruccion ) )+ (otherlv_5= 'Pero si el destino dijera lo contrario,' otherlv_6= 'que broten estas verdades:' ( (lv_instruccionesElse_7_0= ruleInstruccion ) )+ )? otherlv_8= 'Y as\\u00ED el universo sigue su curso.' ) )
            // InternalDearCode.g:2248:2: (otherlv_0= 'Si en tu corazon sientes que' ( (lv_condicion_1_0= ruleCondicion ) ) otherlv_2= ',' otherlv_3= 'entonces deja que estas palabras florezcan:' ( (lv_instruccionesThen_4_0= ruleInstruccion ) )+ (otherlv_5= 'Pero si el destino dijera lo contrario,' otherlv_6= 'que broten estas verdades:' ( (lv_instruccionesElse_7_0= ruleInstruccion ) )+ )? otherlv_8= 'Y as\\u00ED el universo sigue su curso.' )
            {
            // InternalDearCode.g:2248:2: (otherlv_0= 'Si en tu corazon sientes que' ( (lv_condicion_1_0= ruleCondicion ) ) otherlv_2= ',' otherlv_3= 'entonces deja que estas palabras florezcan:' ( (lv_instruccionesThen_4_0= ruleInstruccion ) )+ (otherlv_5= 'Pero si el destino dijera lo contrario,' otherlv_6= 'que broten estas verdades:' ( (lv_instruccionesElse_7_0= ruleInstruccion ) )+ )? otherlv_8= 'Y as\\u00ED el universo sigue su curso.' )
            // InternalDearCode.g:2249:3: otherlv_0= 'Si en tu corazon sientes que' ( (lv_condicion_1_0= ruleCondicion ) ) otherlv_2= ',' otherlv_3= 'entonces deja que estas palabras florezcan:' ( (lv_instruccionesThen_4_0= ruleInstruccion ) )+ (otherlv_5= 'Pero si el destino dijera lo contrario,' otherlv_6= 'que broten estas verdades:' ( (lv_instruccionesElse_7_0= ruleInstruccion ) )+ )? otherlv_8= 'Y as\\u00ED el universo sigue su curso.'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getCondicionalAccess().getSiEnTuCorazonSientesQueKeyword_0());
            		
            // InternalDearCode.g:2253:3: ( (lv_condicion_1_0= ruleCondicion ) )
            // InternalDearCode.g:2254:4: (lv_condicion_1_0= ruleCondicion )
            {
            // InternalDearCode.g:2254:4: (lv_condicion_1_0= ruleCondicion )
            // InternalDearCode.g:2255:5: lv_condicion_1_0= ruleCondicion
            {

            					newCompositeNode(grammarAccess.getCondicionalAccess().getCondicionCondicionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_29);
            lv_condicion_1_0=ruleCondicion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCondicionalRule());
            					}
            					set(
            						current,
            						"condicion",
            						lv_condicion_1_0,
            						"edu.upb.lp.DearCode.Condicion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,59,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getCondicionalAccess().getCommaKeyword_2());
            		
            otherlv_3=(Token)match(input,66,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getCondicionalAccess().getEntoncesDejaQueEstasPalabrasFlorezcanKeyword_3());
            		
            // InternalDearCode.g:2280:3: ( (lv_instruccionesThen_4_0= ruleInstruccion ) )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=17 && LA37_0<=18)||(LA37_0>=37 && LA37_0<=43)||LA37_0==65||(LA37_0>=70 && LA37_0<=71)||(LA37_0>=74 && LA37_0<=75)||(LA37_0>=79 && LA37_0<=81)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalDearCode.g:2281:4: (lv_instruccionesThen_4_0= ruleInstruccion )
            	    {
            	    // InternalDearCode.g:2281:4: (lv_instruccionesThen_4_0= ruleInstruccion )
            	    // InternalDearCode.g:2282:5: lv_instruccionesThen_4_0= ruleInstruccion
            	    {

            	    					newCompositeNode(grammarAccess.getCondicionalAccess().getInstruccionesThenInstruccionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_31);
            	    lv_instruccionesThen_4_0=ruleInstruccion();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCondicionalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instruccionesThen",
            	    						lv_instruccionesThen_4_0,
            	    						"edu.upb.lp.DearCode.Instruccion");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);

            // InternalDearCode.g:2299:3: (otherlv_5= 'Pero si el destino dijera lo contrario,' otherlv_6= 'que broten estas verdades:' ( (lv_instruccionesElse_7_0= ruleInstruccion ) )+ )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==67) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDearCode.g:2300:4: otherlv_5= 'Pero si el destino dijera lo contrario,' otherlv_6= 'que broten estas verdades:' ( (lv_instruccionesElse_7_0= ruleInstruccion ) )+
                    {
                    otherlv_5=(Token)match(input,67,FOLLOW_32); 

                    				newLeafNode(otherlv_5, grammarAccess.getCondicionalAccess().getPeroSiElDestinoDijeraLoContrarioKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,68,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getCondicionalAccess().getQueBrotenEstasVerdadesKeyword_5_1());
                    			
                    // InternalDearCode.g:2308:4: ( (lv_instruccionesElse_7_0= ruleInstruccion ) )+
                    int cnt38=0;
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( ((LA38_0>=17 && LA38_0<=18)||(LA38_0>=37 && LA38_0<=43)||LA38_0==65||(LA38_0>=70 && LA38_0<=71)||(LA38_0>=74 && LA38_0<=75)||(LA38_0>=79 && LA38_0<=81)) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalDearCode.g:2309:5: (lv_instruccionesElse_7_0= ruleInstruccion )
                    	    {
                    	    // InternalDearCode.g:2309:5: (lv_instruccionesElse_7_0= ruleInstruccion )
                    	    // InternalDearCode.g:2310:6: lv_instruccionesElse_7_0= ruleInstruccion
                    	    {

                    	    						newCompositeNode(grammarAccess.getCondicionalAccess().getInstruccionesElseInstruccionParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_33);
                    	    lv_instruccionesElse_7_0=ruleInstruccion();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCondicionalRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"instruccionesElse",
                    	    							lv_instruccionesElse_7_0,
                    	    							"edu.upb.lp.DearCode.Instruccion");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt38 >= 1 ) break loop38;
                                EarlyExitException eee =
                                    new EarlyExitException(38, input);
                                throw eee;
                        }
                        cnt38++;
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,69,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getCondicionalAccess().getYAsElUniversoSigueSuCursoKeyword_6());
            		

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
    // InternalDearCode.g:2336:1: entryRuleBucleWhile returns [EObject current=null] : iv_ruleBucleWhile= ruleBucleWhile EOF ;
    public final EObject entryRuleBucleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBucleWhile = null;


        try {
            // InternalDearCode.g:2336:51: (iv_ruleBucleWhile= ruleBucleWhile EOF )
            // InternalDearCode.g:2337:2: iv_ruleBucleWhile= ruleBucleWhile EOF
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
    // InternalDearCode.g:2343:1: ruleBucleWhile returns [EObject current=null] : ( (otherlv_0= 'Mientras aun me pienses' | otherlv_1= 'Mientras a\\u00FAn sue\\u00F1es con este momento, haz que ocurra' ) ( (lv_condicion_2_0= ruleCondicion ) ) otherlv_3= ',' otherlv_4= 'haz que suceda:' ( (lv_instrucciones_5_0= ruleInstruccion ) )+ otherlv_6= 'Y as\\u00ED el susurro descansa.' ) ;
    public final EObject ruleBucleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_condicion_2_0 = null;

        EObject lv_instrucciones_5_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:2349:2: ( ( (otherlv_0= 'Mientras aun me pienses' | otherlv_1= 'Mientras a\\u00FAn sue\\u00F1es con este momento, haz que ocurra' ) ( (lv_condicion_2_0= ruleCondicion ) ) otherlv_3= ',' otherlv_4= 'haz que suceda:' ( (lv_instrucciones_5_0= ruleInstruccion ) )+ otherlv_6= 'Y as\\u00ED el susurro descansa.' ) )
            // InternalDearCode.g:2350:2: ( (otherlv_0= 'Mientras aun me pienses' | otherlv_1= 'Mientras a\\u00FAn sue\\u00F1es con este momento, haz que ocurra' ) ( (lv_condicion_2_0= ruleCondicion ) ) otherlv_3= ',' otherlv_4= 'haz que suceda:' ( (lv_instrucciones_5_0= ruleInstruccion ) )+ otherlv_6= 'Y as\\u00ED el susurro descansa.' )
            {
            // InternalDearCode.g:2350:2: ( (otherlv_0= 'Mientras aun me pienses' | otherlv_1= 'Mientras a\\u00FAn sue\\u00F1es con este momento, haz que ocurra' ) ( (lv_condicion_2_0= ruleCondicion ) ) otherlv_3= ',' otherlv_4= 'haz que suceda:' ( (lv_instrucciones_5_0= ruleInstruccion ) )+ otherlv_6= 'Y as\\u00ED el susurro descansa.' )
            // InternalDearCode.g:2351:3: (otherlv_0= 'Mientras aun me pienses' | otherlv_1= 'Mientras a\\u00FAn sue\\u00F1es con este momento, haz que ocurra' ) ( (lv_condicion_2_0= ruleCondicion ) ) otherlv_3= ',' otherlv_4= 'haz que suceda:' ( (lv_instrucciones_5_0= ruleInstruccion ) )+ otherlv_6= 'Y as\\u00ED el susurro descansa.'
            {
            // InternalDearCode.g:2351:3: (otherlv_0= 'Mientras aun me pienses' | otherlv_1= 'Mientras a\\u00FAn sue\\u00F1es con este momento, haz que ocurra' )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==70) ) {
                alt40=1;
            }
            else if ( (LA40_0==71) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalDearCode.g:2352:4: otherlv_0= 'Mientras aun me pienses'
                    {
                    otherlv_0=(Token)match(input,70,FOLLOW_11); 

                    				newLeafNode(otherlv_0, grammarAccess.getBucleWhileAccess().getMientrasAunMePiensesKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:2357:4: otherlv_1= 'Mientras a\\u00FAn sue\\u00F1es con este momento, haz que ocurra'
                    {
                    otherlv_1=(Token)match(input,71,FOLLOW_11); 

                    				newLeafNode(otherlv_1, grammarAccess.getBucleWhileAccess().getMientrasANSueEsConEsteMomentoHazQueOcurraKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalDearCode.g:2362:3: ( (lv_condicion_2_0= ruleCondicion ) )
            // InternalDearCode.g:2363:4: (lv_condicion_2_0= ruleCondicion )
            {
            // InternalDearCode.g:2363:4: (lv_condicion_2_0= ruleCondicion )
            // InternalDearCode.g:2364:5: lv_condicion_2_0= ruleCondicion
            {

            					newCompositeNode(grammarAccess.getBucleWhileAccess().getCondicionCondicionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_29);
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

            otherlv_3=(Token)match(input,59,FOLLOW_34); 

            			newLeafNode(otherlv_3, grammarAccess.getBucleWhileAccess().getCommaKeyword_2());
            		
            otherlv_4=(Token)match(input,72,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getBucleWhileAccess().getHazQueSucedaKeyword_3());
            		
            // InternalDearCode.g:2389:3: ( (lv_instrucciones_5_0= ruleInstruccion ) )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=17 && LA41_0<=18)||(LA41_0>=37 && LA41_0<=43)||LA41_0==65||(LA41_0>=70 && LA41_0<=71)||(LA41_0>=74 && LA41_0<=75)||(LA41_0>=79 && LA41_0<=81)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalDearCode.g:2390:4: (lv_instrucciones_5_0= ruleInstruccion )
            	    {
            	    // InternalDearCode.g:2390:4: (lv_instrucciones_5_0= ruleInstruccion )
            	    // InternalDearCode.g:2391:5: lv_instrucciones_5_0= ruleInstruccion
            	    {

            	    					newCompositeNode(grammarAccess.getBucleWhileAccess().getInstruccionesInstruccionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_35);
            	    lv_instrucciones_5_0=ruleInstruccion();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBucleWhileRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instrucciones",
            	    						lv_instrucciones_5_0,
            	    						"edu.upb.lp.DearCode.Instruccion");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt41 >= 1 ) break loop41;
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
            } while (true);

            otherlv_6=(Token)match(input,73,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getBucleWhileAccess().getYAsElSusurroDescansaKeyword_5());
            		

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
    // InternalDearCode.g:2416:1: entryRuleBucleFor returns [EObject current=null] : iv_ruleBucleFor= ruleBucleFor EOF ;
    public final EObject entryRuleBucleFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBucleFor = null;


        try {
            // InternalDearCode.g:2416:49: (iv_ruleBucleFor= ruleBucleFor EOF )
            // InternalDearCode.g:2417:2: iv_ruleBucleFor= ruleBucleFor EOF
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
    // InternalDearCode.g:2423:1: ruleBucleFor returns [EObject current=null] : ( (otherlv_0= 'Cada dia, desde' | otherlv_1= 'Por cada suspiro desde' ) ( (lv_condicion_2_0= ruleCondicion ) ) otherlv_3= 'hasta' ( (lv_accionStop_4_0= ruleInstruccion ) ) otherlv_5= ',' otherlv_6= 'y que gire el verso:' ( (lv_instrucciones_7_0= ruleInstruccion ) )+ otherlv_8= 'Cuando el eco se apague.' ) ;
    public final EObject ruleBucleFor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_condicion_2_0 = null;

        EObject lv_accionStop_4_0 = null;

        EObject lv_instrucciones_7_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:2429:2: ( ( (otherlv_0= 'Cada dia, desde' | otherlv_1= 'Por cada suspiro desde' ) ( (lv_condicion_2_0= ruleCondicion ) ) otherlv_3= 'hasta' ( (lv_accionStop_4_0= ruleInstruccion ) ) otherlv_5= ',' otherlv_6= 'y que gire el verso:' ( (lv_instrucciones_7_0= ruleInstruccion ) )+ otherlv_8= 'Cuando el eco se apague.' ) )
            // InternalDearCode.g:2430:2: ( (otherlv_0= 'Cada dia, desde' | otherlv_1= 'Por cada suspiro desde' ) ( (lv_condicion_2_0= ruleCondicion ) ) otherlv_3= 'hasta' ( (lv_accionStop_4_0= ruleInstruccion ) ) otherlv_5= ',' otherlv_6= 'y que gire el verso:' ( (lv_instrucciones_7_0= ruleInstruccion ) )+ otherlv_8= 'Cuando el eco se apague.' )
            {
            // InternalDearCode.g:2430:2: ( (otherlv_0= 'Cada dia, desde' | otherlv_1= 'Por cada suspiro desde' ) ( (lv_condicion_2_0= ruleCondicion ) ) otherlv_3= 'hasta' ( (lv_accionStop_4_0= ruleInstruccion ) ) otherlv_5= ',' otherlv_6= 'y que gire el verso:' ( (lv_instrucciones_7_0= ruleInstruccion ) )+ otherlv_8= 'Cuando el eco se apague.' )
            // InternalDearCode.g:2431:3: (otherlv_0= 'Cada dia, desde' | otherlv_1= 'Por cada suspiro desde' ) ( (lv_condicion_2_0= ruleCondicion ) ) otherlv_3= 'hasta' ( (lv_accionStop_4_0= ruleInstruccion ) ) otherlv_5= ',' otherlv_6= 'y que gire el verso:' ( (lv_instrucciones_7_0= ruleInstruccion ) )+ otherlv_8= 'Cuando el eco se apague.'
            {
            // InternalDearCode.g:2431:3: (otherlv_0= 'Cada dia, desde' | otherlv_1= 'Por cada suspiro desde' )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==74) ) {
                alt42=1;
            }
            else if ( (LA42_0==75) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalDearCode.g:2432:4: otherlv_0= 'Cada dia, desde'
                    {
                    otherlv_0=(Token)match(input,74,FOLLOW_11); 

                    				newLeafNode(otherlv_0, grammarAccess.getBucleForAccess().getCadaDiaDesdeKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:2437:4: otherlv_1= 'Por cada suspiro desde'
                    {
                    otherlv_1=(Token)match(input,75,FOLLOW_11); 

                    				newLeafNode(otherlv_1, grammarAccess.getBucleForAccess().getPorCadaSuspiroDesdeKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalDearCode.g:2442:3: ( (lv_condicion_2_0= ruleCondicion ) )
            // InternalDearCode.g:2443:4: (lv_condicion_2_0= ruleCondicion )
            {
            // InternalDearCode.g:2443:4: (lv_condicion_2_0= ruleCondicion )
            // InternalDearCode.g:2444:5: lv_condicion_2_0= ruleCondicion
            {

            					newCompositeNode(grammarAccess.getBucleForAccess().getCondicionCondicionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_36);
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

            otherlv_3=(Token)match(input,76,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getBucleForAccess().getHastaKeyword_2());
            		
            // InternalDearCode.g:2465:3: ( (lv_accionStop_4_0= ruleInstruccion ) )
            // InternalDearCode.g:2466:4: (lv_accionStop_4_0= ruleInstruccion )
            {
            // InternalDearCode.g:2466:4: (lv_accionStop_4_0= ruleInstruccion )
            // InternalDearCode.g:2467:5: lv_accionStop_4_0= ruleInstruccion
            {

            					newCompositeNode(grammarAccess.getBucleForAccess().getAccionStopInstruccionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_29);
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

            otherlv_5=(Token)match(input,59,FOLLOW_37); 

            			newLeafNode(otherlv_5, grammarAccess.getBucleForAccess().getCommaKeyword_4());
            		
            otherlv_6=(Token)match(input,77,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getBucleForAccess().getYQueGireElVersoKeyword_5());
            		
            // InternalDearCode.g:2492:3: ( (lv_instrucciones_7_0= ruleInstruccion ) )+
            int cnt43=0;
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=17 && LA43_0<=18)||(LA43_0>=37 && LA43_0<=43)||LA43_0==65||(LA43_0>=70 && LA43_0<=71)||(LA43_0>=74 && LA43_0<=75)||(LA43_0>=79 && LA43_0<=81)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalDearCode.g:2493:4: (lv_instrucciones_7_0= ruleInstruccion )
            	    {
            	    // InternalDearCode.g:2493:4: (lv_instrucciones_7_0= ruleInstruccion )
            	    // InternalDearCode.g:2494:5: lv_instrucciones_7_0= ruleInstruccion
            	    {

            	    					newCompositeNode(grammarAccess.getBucleForAccess().getInstruccionesInstruccionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_38);
            	    lv_instrucciones_7_0=ruleInstruccion();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBucleForRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instrucciones",
            	    						lv_instrucciones_7_0,
            	    						"edu.upb.lp.DearCode.Instruccion");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt43 >= 1 ) break loop43;
                        EarlyExitException eee =
                            new EarlyExitException(43, input);
                        throw eee;
                }
                cnt43++;
            } while (true);

            otherlv_8=(Token)match(input,78,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getBucleForAccess().getCuandoElEcoSeApagueKeyword_7());
            		

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


    // $ANTLR start "entryRuleFuncion"
    // InternalDearCode.g:2519:1: entryRuleFuncion returns [EObject current=null] : iv_ruleFuncion= ruleFuncion EOF ;
    public final EObject entryRuleFuncion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncion = null;


        try {
            // InternalDearCode.g:2519:48: (iv_ruleFuncion= ruleFuncion EOF )
            // InternalDearCode.g:2520:2: iv_ruleFuncion= ruleFuncion EOF
            {
             newCompositeNode(grammarAccess.getFuncionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuncion=ruleFuncion();

            state._fsp--;

             current =iv_ruleFuncion; 
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
    // $ANTLR end "entryRuleFuncion"


    // $ANTLR start "ruleFuncion"
    // InternalDearCode.g:2526:1: ruleFuncion returns [EObject current=null] : ( ( (otherlv_0= 'Dejo en estas l\\u00EDneas una promesa llamada' | otherlv_1= 'Escribo en estas l\\u00EDneas una intenci\\u00F3n llamada' | otherlv_2= 'En la brisa escondo un deseo llamado' ) ( (lv_name_3_0= ruleMI_ID ) ) ) (otherlv_4= 'que guarda en su esencia' ( (lv_parametros_5_0= ruleMI_ID ) ) (otherlv_6= ',' ( (lv_parametros_7_0= ruleMI_ID ) ) )* )? otherlv_8= 'Cuando la promesa se cumple:' ( (lv_instrucciones_9_0= ruleInstruccion ) )+ (otherlv_10= 'Y al final, dejo volar' ( (lv_retorno_11_0= ruleMI_ID ) ) otherlv_12= 'en un suspiro.' )? otherlv_13= 'As\\u00ED se sella la promesa.' ) ;
    public final EObject ruleFuncion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_name_3_0 = null;

        EObject lv_parametros_5_0 = null;

        EObject lv_parametros_7_0 = null;

        EObject lv_instrucciones_9_0 = null;

        EObject lv_retorno_11_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:2532:2: ( ( ( (otherlv_0= 'Dejo en estas l\\u00EDneas una promesa llamada' | otherlv_1= 'Escribo en estas l\\u00EDneas una intenci\\u00F3n llamada' | otherlv_2= 'En la brisa escondo un deseo llamado' ) ( (lv_name_3_0= ruleMI_ID ) ) ) (otherlv_4= 'que guarda en su esencia' ( (lv_parametros_5_0= ruleMI_ID ) ) (otherlv_6= ',' ( (lv_parametros_7_0= ruleMI_ID ) ) )* )? otherlv_8= 'Cuando la promesa se cumple:' ( (lv_instrucciones_9_0= ruleInstruccion ) )+ (otherlv_10= 'Y al final, dejo volar' ( (lv_retorno_11_0= ruleMI_ID ) ) otherlv_12= 'en un suspiro.' )? otherlv_13= 'As\\u00ED se sella la promesa.' ) )
            // InternalDearCode.g:2533:2: ( ( (otherlv_0= 'Dejo en estas l\\u00EDneas una promesa llamada' | otherlv_1= 'Escribo en estas l\\u00EDneas una intenci\\u00F3n llamada' | otherlv_2= 'En la brisa escondo un deseo llamado' ) ( (lv_name_3_0= ruleMI_ID ) ) ) (otherlv_4= 'que guarda en su esencia' ( (lv_parametros_5_0= ruleMI_ID ) ) (otherlv_6= ',' ( (lv_parametros_7_0= ruleMI_ID ) ) )* )? otherlv_8= 'Cuando la promesa se cumple:' ( (lv_instrucciones_9_0= ruleInstruccion ) )+ (otherlv_10= 'Y al final, dejo volar' ( (lv_retorno_11_0= ruleMI_ID ) ) otherlv_12= 'en un suspiro.' )? otherlv_13= 'As\\u00ED se sella la promesa.' )
            {
            // InternalDearCode.g:2533:2: ( ( (otherlv_0= 'Dejo en estas l\\u00EDneas una promesa llamada' | otherlv_1= 'Escribo en estas l\\u00EDneas una intenci\\u00F3n llamada' | otherlv_2= 'En la brisa escondo un deseo llamado' ) ( (lv_name_3_0= ruleMI_ID ) ) ) (otherlv_4= 'que guarda en su esencia' ( (lv_parametros_5_0= ruleMI_ID ) ) (otherlv_6= ',' ( (lv_parametros_7_0= ruleMI_ID ) ) )* )? otherlv_8= 'Cuando la promesa se cumple:' ( (lv_instrucciones_9_0= ruleInstruccion ) )+ (otherlv_10= 'Y al final, dejo volar' ( (lv_retorno_11_0= ruleMI_ID ) ) otherlv_12= 'en un suspiro.' )? otherlv_13= 'As\\u00ED se sella la promesa.' )
            // InternalDearCode.g:2534:3: ( (otherlv_0= 'Dejo en estas l\\u00EDneas una promesa llamada' | otherlv_1= 'Escribo en estas l\\u00EDneas una intenci\\u00F3n llamada' | otherlv_2= 'En la brisa escondo un deseo llamado' ) ( (lv_name_3_0= ruleMI_ID ) ) ) (otherlv_4= 'que guarda en su esencia' ( (lv_parametros_5_0= ruleMI_ID ) ) (otherlv_6= ',' ( (lv_parametros_7_0= ruleMI_ID ) ) )* )? otherlv_8= 'Cuando la promesa se cumple:' ( (lv_instrucciones_9_0= ruleInstruccion ) )+ (otherlv_10= 'Y al final, dejo volar' ( (lv_retorno_11_0= ruleMI_ID ) ) otherlv_12= 'en un suspiro.' )? otherlv_13= 'As\\u00ED se sella la promesa.'
            {
            // InternalDearCode.g:2534:3: ( (otherlv_0= 'Dejo en estas l\\u00EDneas una promesa llamada' | otherlv_1= 'Escribo en estas l\\u00EDneas una intenci\\u00F3n llamada' | otherlv_2= 'En la brisa escondo un deseo llamado' ) ( (lv_name_3_0= ruleMI_ID ) ) )
            // InternalDearCode.g:2535:4: (otherlv_0= 'Dejo en estas l\\u00EDneas una promesa llamada' | otherlv_1= 'Escribo en estas l\\u00EDneas una intenci\\u00F3n llamada' | otherlv_2= 'En la brisa escondo un deseo llamado' ) ( (lv_name_3_0= ruleMI_ID ) )
            {
            // InternalDearCode.g:2535:4: (otherlv_0= 'Dejo en estas l\\u00EDneas una promesa llamada' | otherlv_1= 'Escribo en estas l\\u00EDneas una intenci\\u00F3n llamada' | otherlv_2= 'En la brisa escondo un deseo llamado' )
            int alt44=3;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt44=1;
                }
                break;
            case 80:
                {
                alt44=2;
                }
                break;
            case 81:
                {
                alt44=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalDearCode.g:2536:5: otherlv_0= 'Dejo en estas l\\u00EDneas una promesa llamada'
                    {
                    otherlv_0=(Token)match(input,79,FOLLOW_10); 

                    					newLeafNode(otherlv_0, grammarAccess.getFuncionAccess().getDejoEnEstasLNeasUnaPromesaLlamadaKeyword_0_0_0());
                    				

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:2541:5: otherlv_1= 'Escribo en estas l\\u00EDneas una intenci\\u00F3n llamada'
                    {
                    otherlv_1=(Token)match(input,80,FOLLOW_10); 

                    					newLeafNode(otherlv_1, grammarAccess.getFuncionAccess().getEscriboEnEstasLNeasUnaIntenciNLlamadaKeyword_0_0_1());
                    				

                    }
                    break;
                case 3 :
                    // InternalDearCode.g:2546:5: otherlv_2= 'En la brisa escondo un deseo llamado'
                    {
                    otherlv_2=(Token)match(input,81,FOLLOW_10); 

                    					newLeafNode(otherlv_2, grammarAccess.getFuncionAccess().getEnLaBrisaEscondoUnDeseoLlamadoKeyword_0_0_2());
                    				

                    }
                    break;

            }

            // InternalDearCode.g:2551:4: ( (lv_name_3_0= ruleMI_ID ) )
            // InternalDearCode.g:2552:5: (lv_name_3_0= ruleMI_ID )
            {
            // InternalDearCode.g:2552:5: (lv_name_3_0= ruleMI_ID )
            // InternalDearCode.g:2553:6: lv_name_3_0= ruleMI_ID
            {

            						newCompositeNode(grammarAccess.getFuncionAccess().getNameMI_IDParserRuleCall_0_1_0());
            					
            pushFollow(FOLLOW_39);
            lv_name_3_0=ruleMI_ID();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getFuncionRule());
            						}
            						set(
            							current,
            							"name",
            							lv_name_3_0,
            							"edu.upb.lp.DearCode.MI_ID");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalDearCode.g:2571:3: (otherlv_4= 'que guarda en su esencia' ( (lv_parametros_5_0= ruleMI_ID ) ) (otherlv_6= ',' ( (lv_parametros_7_0= ruleMI_ID ) ) )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==82) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalDearCode.g:2572:4: otherlv_4= 'que guarda en su esencia' ( (lv_parametros_5_0= ruleMI_ID ) ) (otherlv_6= ',' ( (lv_parametros_7_0= ruleMI_ID ) ) )*
                    {
                    otherlv_4=(Token)match(input,82,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getFuncionAccess().getQueGuardaEnSuEsenciaKeyword_1_0());
                    			
                    // InternalDearCode.g:2576:4: ( (lv_parametros_5_0= ruleMI_ID ) )
                    // InternalDearCode.g:2577:5: (lv_parametros_5_0= ruleMI_ID )
                    {
                    // InternalDearCode.g:2577:5: (lv_parametros_5_0= ruleMI_ID )
                    // InternalDearCode.g:2578:6: lv_parametros_5_0= ruleMI_ID
                    {

                    						newCompositeNode(grammarAccess.getFuncionAccess().getParametrosMI_IDParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_parametros_5_0=ruleMI_ID();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFuncionRule());
                    						}
                    						add(
                    							current,
                    							"parametros",
                    							lv_parametros_5_0,
                    							"edu.upb.lp.DearCode.MI_ID");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDearCode.g:2595:4: (otherlv_6= ',' ( (lv_parametros_7_0= ruleMI_ID ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==59) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalDearCode.g:2596:5: otherlv_6= ',' ( (lv_parametros_7_0= ruleMI_ID ) )
                    	    {
                    	    otherlv_6=(Token)match(input,59,FOLLOW_10); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getFuncionAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalDearCode.g:2600:5: ( (lv_parametros_7_0= ruleMI_ID ) )
                    	    // InternalDearCode.g:2601:6: (lv_parametros_7_0= ruleMI_ID )
                    	    {
                    	    // InternalDearCode.g:2601:6: (lv_parametros_7_0= ruleMI_ID )
                    	    // InternalDearCode.g:2602:7: lv_parametros_7_0= ruleMI_ID
                    	    {

                    	    							newCompositeNode(grammarAccess.getFuncionAccess().getParametrosMI_IDParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_40);
                    	    lv_parametros_7_0=ruleMI_ID();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFuncionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parametros",
                    	    								lv_parametros_7_0,
                    	    								"edu.upb.lp.DearCode.MI_ID");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,83,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getFuncionAccess().getCuandoLaPromesaSeCumpleKeyword_2());
            		
            // InternalDearCode.g:2625:3: ( (lv_instrucciones_9_0= ruleInstruccion ) )+
            int cnt47=0;
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=17 && LA47_0<=18)||(LA47_0>=37 && LA47_0<=43)||LA47_0==65||(LA47_0>=70 && LA47_0<=71)||(LA47_0>=74 && LA47_0<=75)||(LA47_0>=79 && LA47_0<=81)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalDearCode.g:2626:4: (lv_instrucciones_9_0= ruleInstruccion )
            	    {
            	    // InternalDearCode.g:2626:4: (lv_instrucciones_9_0= ruleInstruccion )
            	    // InternalDearCode.g:2627:5: lv_instrucciones_9_0= ruleInstruccion
            	    {

            	    					newCompositeNode(grammarAccess.getFuncionAccess().getInstruccionesInstruccionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_41);
            	    lv_instrucciones_9_0=ruleInstruccion();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFuncionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instrucciones",
            	    						lv_instrucciones_9_0,
            	    						"edu.upb.lp.DearCode.Instruccion");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt47 >= 1 ) break loop47;
                        EarlyExitException eee =
                            new EarlyExitException(47, input);
                        throw eee;
                }
                cnt47++;
            } while (true);

            // InternalDearCode.g:2644:3: (otherlv_10= 'Y al final, dejo volar' ( (lv_retorno_11_0= ruleMI_ID ) ) otherlv_12= 'en un suspiro.' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==84) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalDearCode.g:2645:4: otherlv_10= 'Y al final, dejo volar' ( (lv_retorno_11_0= ruleMI_ID ) ) otherlv_12= 'en un suspiro.'
                    {
                    otherlv_10=(Token)match(input,84,FOLLOW_10); 

                    				newLeafNode(otherlv_10, grammarAccess.getFuncionAccess().getYAlFinalDejoVolarKeyword_4_0());
                    			
                    // InternalDearCode.g:2649:4: ( (lv_retorno_11_0= ruleMI_ID ) )
                    // InternalDearCode.g:2650:5: (lv_retorno_11_0= ruleMI_ID )
                    {
                    // InternalDearCode.g:2650:5: (lv_retorno_11_0= ruleMI_ID )
                    // InternalDearCode.g:2651:6: lv_retorno_11_0= ruleMI_ID
                    {

                    						newCompositeNode(grammarAccess.getFuncionAccess().getRetornoMI_IDParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_retorno_11_0=ruleMI_ID();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFuncionRule());
                    						}
                    						set(
                    							current,
                    							"retorno",
                    							lv_retorno_11_0,
                    							"edu.upb.lp.DearCode.MI_ID");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,85,FOLLOW_43); 

                    				newLeafNode(otherlv_12, grammarAccess.getFuncionAccess().getEnUnSuspiroKeyword_4_2());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,86,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getFuncionAccess().getAsSeSellaLaPromesaKeyword_5());
            		

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
    // $ANTLR end "ruleFuncion"

    // Delegated rules


    protected DFA10 dfa10 = new DFA10(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\uffff\12\14\2\uffff";
    static final String dfa_3s = "\1\23\12\4\2\uffff";
    static final String dfa_4s = "\1\34\12\41\2\uffff";
    static final String dfa_5s = "\13\uffff\1\2\1\1";
    static final String dfa_6s = "\15\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
            "\2\14\10\uffff\1\14\17\uffff\1\13\1\uffff\2\13",
            "\2\14\10\uffff\1\14\17\uffff\1\13\1\uffff\2\13",
            "\2\14\10\uffff\1\14\17\uffff\1\13\1\uffff\2\13",
            "\2\14\10\uffff\1\14\17\uffff\1\13\1\uffff\2\13",
            "\2\14\10\uffff\1\14\17\uffff\1\13\1\uffff\2\13",
            "\2\14\10\uffff\1\14\17\uffff\1\13\1\uffff\2\13",
            "\2\14\10\uffff\1\14\17\uffff\1\13\1\uffff\2\13",
            "\2\14\10\uffff\1\14\17\uffff\1\13\1\uffff\2\13",
            "\2\14\10\uffff\1\14\17\uffff\1\13\1\uffff\2\13",
            "\2\14\10\uffff\1\14\17\uffff\1\13\1\uffff\2\13",
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
            return "830:2: (this_Simple_0= ruleSimple | this_Compuesto_1= ruleCompuesto )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000FE000060000L,0x0000000000038CC2L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000FE000060002L,0x0000000000038CC2L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0xE60000001FF800E0L,0x0000000000000001L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000340000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000001FF80000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000F000000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x01C0000000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0xF60000001FF800E0L,0x0000000000000001L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000FE000060000L,0x0000000000038CEAL});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000FE000060000L,0x0000000000038CE2L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000FE000060000L,0x0000000000038EC2L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00000FE000060000L,0x000000000003CCC2L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0800000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x00000FE000060000L,0x0000000000538CC2L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});

}