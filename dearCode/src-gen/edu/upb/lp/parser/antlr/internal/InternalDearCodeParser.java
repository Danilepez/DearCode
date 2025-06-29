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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ANYTEXT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Querido'", "'Querida'", "'.'", "'Con cari\\u00F1o, Tu programador'", "'Le ped\\u00ED al lector que me dijera'", "'en un susurro num\\u00E9rico'", "'con palabras de terciopelo'", "'Hoy le quise contar al mundo sobre:'", "'Si en tu corazon sientes que'", "','", "'entonces deja que estas palabras florezcan:'", "'Pero si el destino dijera lo contrario,'", "'que broten estas verdades:'", "'Y as\\u00ED el universo sigue su curso.'", "'Mientras aun me piensas'", "'Mientras a\\u00FAn sue\\u00F1es con este momento'", "'haz que suceda:'", "'Y as\\u00ED el susurro descansa.'", "'En cada suspiro'", "'desde'", "'hasta'", "'con paso'", "'deja que el universo cante:'", "'Cuando el \\u00FAltimo eco se calle.'", "'Dejo en estas l\\u00EDneas una promesa llamada'", "'Escribo en estas l\\u00EDneas una intenci\\u00F3n llamada'", "'En la brisa escondo un deseo llamado'", "'que guarda en su esencia'", "'prometiendo devolver'", "'Cuando la promesa se cumple:'", "'As\\u00ED se sella la promesa.'", "'Y entrego al viento'", "'como promesa cumplida.'", "' o quiz\\u00E1s '", "' o quiz\\u00E1s'", "' y tambi\\u00E9n '", "' y tambi\\u00E9n'", "'late al un\\u00EDsono con'", "'canta con un matiz distinto a'", "'susurra con menos fuerza que'", "'casi suspira al mismo nivel que'", "'arde con m\\u00E1s pasi\\u00F3n que'", "'rodea con tanta fuerza como'", "'unidos en un solo suspiro con'", "'fundidos en la llama de'", "'fortalecidos por el fuego de'", "'separados entre los ecos de'", "'resuena con el eco de'", "'no creo que'", "'('", "')'", "'siempre'", "'jam\\u00E1s'", "'invoco a'", "'con los regalos'", "'y'", "'en mi coraz\\u00F3n'", "'n\\u00FAmero'", "'texto'", "'booleano'", "'nada'", "'Te regalo'", "'Ofrezco'", "'Obsequio'", "'Deposito en tu jard\\u00EDn'", "'Perm\\u00EDteme alimentar'", "'Perm\\u00EDteme regar'", "'Perm\\u00EDteme ajustar'", "'un'", "'una'"
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
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
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
    public static final int RULE_STRING=6;
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
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_ANYTEXT=7;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
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
    // InternalDearCode.g:71:1: ruleProgram returns [EObject current=null] : ( (lv_carta_0_0= ruleCarta ) ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_carta_0_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:77:2: ( ( (lv_carta_0_0= ruleCarta ) ) )
            // InternalDearCode.g:78:2: ( (lv_carta_0_0= ruleCarta ) )
            {
            // InternalDearCode.g:78:2: ( (lv_carta_0_0= ruleCarta ) )
            // InternalDearCode.g:79:3: (lv_carta_0_0= ruleCarta )
            {
            // InternalDearCode.g:79:3: (lv_carta_0_0= ruleCarta )
            // InternalDearCode.g:80:4: lv_carta_0_0= ruleCarta
            {

            				newCompositeNode(grammarAccess.getProgramAccess().getCartaCartaParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_carta_0_0=ruleCarta();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getProgramRule());
            				}
            				set(
            					current,
            					"carta",
            					lv_carta_0_0,
            					"edu.upb.lp.DearCode.Carta");
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
            				
            pushFollow(FOLLOW_3);
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
            				
            pushFollow(FOLLOW_4);
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
    // InternalDearCode.g:183:1: ruleSaludo returns [EObject current=null] : ( (otherlv_0= 'Querido' | otherlv_1= 'Querida' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '.' ) ;
    public final EObject ruleSaludo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDearCode.g:189:2: ( ( (otherlv_0= 'Querido' | otherlv_1= 'Querida' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '.' ) )
            // InternalDearCode.g:190:2: ( (otherlv_0= 'Querido' | otherlv_1= 'Querida' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '.' )
            {
            // InternalDearCode.g:190:2: ( (otherlv_0= 'Querido' | otherlv_1= 'Querida' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '.' )
            // InternalDearCode.g:191:3: (otherlv_0= 'Querido' | otherlv_1= 'Querida' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '.'
            {
            // InternalDearCode.g:191:3: (otherlv_0= 'Querido' | otherlv_1= 'Querida' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==13) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDearCode.g:192:4: otherlv_0= 'Querido'
                    {
                    otherlv_0=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getSaludoAccess().getQueridoKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:197:4: otherlv_1= 'Querida'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getSaludoAccess().getQueridaKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalDearCode.g:202:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDearCode.g:203:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDearCode.g:203:4: (lv_name_2_0= RULE_ID )
            // InternalDearCode.g:204:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSaludoAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSaludoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // InternalDearCode.g:235:1: ruleDespedida returns [EObject current=null] : (otherlv_0= 'Con cari\\u00F1o, Tu programador' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '.' ) ;
    public final EObject ruleDespedida() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDearCode.g:241:2: ( (otherlv_0= 'Con cari\\u00F1o, Tu programador' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '.' ) )
            // InternalDearCode.g:242:2: (otherlv_0= 'Con cari\\u00F1o, Tu programador' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '.' )
            {
            // InternalDearCode.g:242:2: (otherlv_0= 'Con cari\\u00F1o, Tu programador' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '.' )
            // InternalDearCode.g:243:3: otherlv_0= 'Con cari\\u00F1o, Tu programador' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '.'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDespedidaAccess().getConCariOTuProgramadorKeyword_0());
            		
            // InternalDearCode.g:247:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDearCode.g:248:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDearCode.g:248:4: (lv_name_1_0= RULE_ID )
            // InternalDearCode.g:249:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDespedidaAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDespedidaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16||(LA2_0>=19 && LA2_0<=20)||(LA2_0>=26 && LA2_0<=27)||LA2_0==30||(LA2_0>=36 && LA2_0<=38)||LA2_0==65||(LA2_0>=73 && LA2_0<=79)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDearCode.g:288:3: (lv_instrucciones_0_0= ruleInstruccion )
            	    {
            	    // InternalDearCode.g:288:3: (lv_instrucciones_0_0= ruleInstruccion )
            	    // InternalDearCode.g:289:4: lv_instrucciones_0_0= ruleInstruccion
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // InternalDearCode.g:316:1: ruleInstruccion returns [EObject current=null] : (this_Declarar_0= ruleDeclarar | this_Reasignar_1= ruleReasignar | this_Condicional_2= ruleCondicional | this_BucleWhile_3= ruleBucleWhile | this_BucleFor_4= ruleBucleFor | this_Entrada_5= ruleEntrada | this_Salida_6= ruleSalida | this_Funcion_7= ruleFuncion | this_FunctionCall_8= ruleFunctionCall ) ;
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

        EObject this_FunctionCall_8 = null;



        	enterRule();

        try {
            // InternalDearCode.g:322:2: ( (this_Declarar_0= ruleDeclarar | this_Reasignar_1= ruleReasignar | this_Condicional_2= ruleCondicional | this_BucleWhile_3= ruleBucleWhile | this_BucleFor_4= ruleBucleFor | this_Entrada_5= ruleEntrada | this_Salida_6= ruleSalida | this_Funcion_7= ruleFuncion | this_FunctionCall_8= ruleFunctionCall ) )
            // InternalDearCode.g:323:2: (this_Declarar_0= ruleDeclarar | this_Reasignar_1= ruleReasignar | this_Condicional_2= ruleCondicional | this_BucleWhile_3= ruleBucleWhile | this_BucleFor_4= ruleBucleFor | this_Entrada_5= ruleEntrada | this_Salida_6= ruleSalida | this_Funcion_7= ruleFuncion | this_FunctionCall_8= ruleFunctionCall )
            {
            // InternalDearCode.g:323:2: (this_Declarar_0= ruleDeclarar | this_Reasignar_1= ruleReasignar | this_Condicional_2= ruleCondicional | this_BucleWhile_3= ruleBucleWhile | this_BucleFor_4= ruleBucleFor | this_Entrada_5= ruleEntrada | this_Salida_6= ruleSalida | this_Funcion_7= ruleFuncion | this_FunctionCall_8= ruleFunctionCall )
            int alt3=9;
            switch ( input.LA(1) ) {
            case 73:
            case 74:
            case 75:
            case 76:
                {
                alt3=1;
                }
                break;
            case 77:
            case 78:
            case 79:
                {
                alt3=2;
                }
                break;
            case 20:
                {
                alt3=3;
                }
                break;
            case 26:
            case 27:
                {
                alt3=4;
                }
                break;
            case 30:
                {
                alt3=5;
                }
                break;
            case 16:
                {
                alt3=6;
                }
                break;
            case 19:
                {
                alt3=7;
                }
                break;
            case 36:
            case 37:
            case 38:
                {
                alt3=8;
                }
                break;
            case 65:
                {
                alt3=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
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
                case 9 :
                    // InternalDearCode.g:396:3: this_FunctionCall_8= ruleFunctionCall
                    {

                    			newCompositeNode(grammarAccess.getInstruccionAccess().getFunctionCallParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunctionCall_8=ruleFunctionCall();

                    state._fsp--;


                    			current = this_FunctionCall_8;
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
    // InternalDearCode.g:408:1: entryRuleDeclarar returns [EObject current=null] : iv_ruleDeclarar= ruleDeclarar EOF ;
    public final EObject entryRuleDeclarar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarar = null;


        try {
            // InternalDearCode.g:408:49: (iv_ruleDeclarar= ruleDeclarar EOF )
            // InternalDearCode.g:409:2: iv_ruleDeclarar= ruleDeclarar EOF
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
    // InternalDearCode.g:415:1: ruleDeclarar returns [EObject current=null] : ( ( (lv_verboDecl_0_0= ruleVerboDeclaracion ) ) ( (lv_articulo_1_0= ruleArticulo ) ) ( (lv_sustantivo_2_0= ruleMI_ID ) ) ( (lv_preComentario_3_0= ruleComment ) )? ( (lv_valor_4_0= ruleExpression ) ) ( (lv_postComentario_5_0= ruleComment ) )? otherlv_6= '.' ) ;
    public final EObject ruleDeclarar() throws RecognitionException {
        EObject current = null;

        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_verboDecl_0_0 = null;

        AntlrDatatypeRuleToken lv_articulo_1_0 = null;

        EObject lv_sustantivo_2_0 = null;

        EObject lv_preComentario_3_0 = null;

        EObject lv_valor_4_0 = null;

        EObject lv_postComentario_5_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:421:2: ( ( ( (lv_verboDecl_0_0= ruleVerboDeclaracion ) ) ( (lv_articulo_1_0= ruleArticulo ) ) ( (lv_sustantivo_2_0= ruleMI_ID ) ) ( (lv_preComentario_3_0= ruleComment ) )? ( (lv_valor_4_0= ruleExpression ) ) ( (lv_postComentario_5_0= ruleComment ) )? otherlv_6= '.' ) )
            // InternalDearCode.g:422:2: ( ( (lv_verboDecl_0_0= ruleVerboDeclaracion ) ) ( (lv_articulo_1_0= ruleArticulo ) ) ( (lv_sustantivo_2_0= ruleMI_ID ) ) ( (lv_preComentario_3_0= ruleComment ) )? ( (lv_valor_4_0= ruleExpression ) ) ( (lv_postComentario_5_0= ruleComment ) )? otherlv_6= '.' )
            {
            // InternalDearCode.g:422:2: ( ( (lv_verboDecl_0_0= ruleVerboDeclaracion ) ) ( (lv_articulo_1_0= ruleArticulo ) ) ( (lv_sustantivo_2_0= ruleMI_ID ) ) ( (lv_preComentario_3_0= ruleComment ) )? ( (lv_valor_4_0= ruleExpression ) ) ( (lv_postComentario_5_0= ruleComment ) )? otherlv_6= '.' )
            // InternalDearCode.g:423:3: ( (lv_verboDecl_0_0= ruleVerboDeclaracion ) ) ( (lv_articulo_1_0= ruleArticulo ) ) ( (lv_sustantivo_2_0= ruleMI_ID ) ) ( (lv_preComentario_3_0= ruleComment ) )? ( (lv_valor_4_0= ruleExpression ) ) ( (lv_postComentario_5_0= ruleComment ) )? otherlv_6= '.'
            {
            // InternalDearCode.g:423:3: ( (lv_verboDecl_0_0= ruleVerboDeclaracion ) )
            // InternalDearCode.g:424:4: (lv_verboDecl_0_0= ruleVerboDeclaracion )
            {
            // InternalDearCode.g:424:4: (lv_verboDecl_0_0= ruleVerboDeclaracion )
            // InternalDearCode.g:425:5: lv_verboDecl_0_0= ruleVerboDeclaracion
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

            // InternalDearCode.g:442:3: ( (lv_articulo_1_0= ruleArticulo ) )
            // InternalDearCode.g:443:4: (lv_articulo_1_0= ruleArticulo )
            {
            // InternalDearCode.g:443:4: (lv_articulo_1_0= ruleArticulo )
            // InternalDearCode.g:444:5: lv_articulo_1_0= ruleArticulo
            {

            					newCompositeNode(grammarAccess.getDeclararAccess().getArticuloArticuloParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
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

            // InternalDearCode.g:461:3: ( (lv_sustantivo_2_0= ruleMI_ID ) )
            // InternalDearCode.g:462:4: (lv_sustantivo_2_0= ruleMI_ID )
            {
            // InternalDearCode.g:462:4: (lv_sustantivo_2_0= ruleMI_ID )
            // InternalDearCode.g:463:5: lv_sustantivo_2_0= ruleMI_ID
            {

            					newCompositeNode(grammarAccess.getDeclararAccess().getSustantivoMI_IDParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
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

            // InternalDearCode.g:480:3: ( (lv_preComentario_3_0= ruleComment ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ANYTEXT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDearCode.g:481:4: (lv_preComentario_3_0= ruleComment )
                    {
                    // InternalDearCode.g:481:4: (lv_preComentario_3_0= ruleComment )
                    // InternalDearCode.g:482:5: lv_preComentario_3_0= ruleComment
                    {

                    					newCompositeNode(grammarAccess.getDeclararAccess().getPreComentarioCommentParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_preComentario_3_0=ruleComment();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeclararRule());
                    					}
                    					set(
                    						current,
                    						"preComentario",
                    						lv_preComentario_3_0,
                    						"edu.upb.lp.DearCode.Comment");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDearCode.g:499:3: ( (lv_valor_4_0= ruleExpression ) )
            // InternalDearCode.g:500:4: (lv_valor_4_0= ruleExpression )
            {
            // InternalDearCode.g:500:4: (lv_valor_4_0= ruleExpression )
            // InternalDearCode.g:501:5: lv_valor_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getDeclararAccess().getValorExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_valor_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclararRule());
            					}
            					set(
            						current,
            						"valor",
            						lv_valor_4_0,
            						"edu.upb.lp.DearCode.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDearCode.g:518:3: ( (lv_postComentario_5_0= ruleComment ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ANYTEXT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDearCode.g:519:4: (lv_postComentario_5_0= ruleComment )
                    {
                    // InternalDearCode.g:519:4: (lv_postComentario_5_0= ruleComment )
                    // InternalDearCode.g:520:5: lv_postComentario_5_0= ruleComment
                    {

                    					newCompositeNode(grammarAccess.getDeclararAccess().getPostComentarioCommentParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_postComentario_5_0=ruleComment();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeclararRule());
                    					}
                    					set(
                    						current,
                    						"postComentario",
                    						lv_postComentario_5_0,
                    						"edu.upb.lp.DearCode.Comment");
                    					afterParserOrEnumRuleCall();
                    				

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
    // InternalDearCode.g:545:1: entryRuleReasignar returns [EObject current=null] : iv_ruleReasignar= ruleReasignar EOF ;
    public final EObject entryRuleReasignar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReasignar = null;


        try {
            // InternalDearCode.g:545:50: (iv_ruleReasignar= ruleReasignar EOF )
            // InternalDearCode.g:546:2: iv_ruleReasignar= ruleReasignar EOF
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
    // InternalDearCode.g:552:1: ruleReasignar returns [EObject current=null] : ( ( (lv_verboReas_0_0= ruleVerboReasignacion ) ) ( (lv_preComentario_1_0= ruleComment ) )? ( (lv_sustantivo_2_0= ruleMI_ID ) ) ( (lv_postComentario_3_0= ruleComment ) )? ( (lv_valor_4_0= ruleExpression ) ) ( (lv_comentario_5_0= ruleComment ) )? otherlv_6= '.' ) ;
    public final EObject ruleReasignar() throws RecognitionException {
        EObject current = null;

        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_verboReas_0_0 = null;

        EObject lv_preComentario_1_0 = null;

        EObject lv_sustantivo_2_0 = null;

        EObject lv_postComentario_3_0 = null;

        EObject lv_valor_4_0 = null;

        EObject lv_comentario_5_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:558:2: ( ( ( (lv_verboReas_0_0= ruleVerboReasignacion ) ) ( (lv_preComentario_1_0= ruleComment ) )? ( (lv_sustantivo_2_0= ruleMI_ID ) ) ( (lv_postComentario_3_0= ruleComment ) )? ( (lv_valor_4_0= ruleExpression ) ) ( (lv_comentario_5_0= ruleComment ) )? otherlv_6= '.' ) )
            // InternalDearCode.g:559:2: ( ( (lv_verboReas_0_0= ruleVerboReasignacion ) ) ( (lv_preComentario_1_0= ruleComment ) )? ( (lv_sustantivo_2_0= ruleMI_ID ) ) ( (lv_postComentario_3_0= ruleComment ) )? ( (lv_valor_4_0= ruleExpression ) ) ( (lv_comentario_5_0= ruleComment ) )? otherlv_6= '.' )
            {
            // InternalDearCode.g:559:2: ( ( (lv_verboReas_0_0= ruleVerboReasignacion ) ) ( (lv_preComentario_1_0= ruleComment ) )? ( (lv_sustantivo_2_0= ruleMI_ID ) ) ( (lv_postComentario_3_0= ruleComment ) )? ( (lv_valor_4_0= ruleExpression ) ) ( (lv_comentario_5_0= ruleComment ) )? otherlv_6= '.' )
            // InternalDearCode.g:560:3: ( (lv_verboReas_0_0= ruleVerboReasignacion ) ) ( (lv_preComentario_1_0= ruleComment ) )? ( (lv_sustantivo_2_0= ruleMI_ID ) ) ( (lv_postComentario_3_0= ruleComment ) )? ( (lv_valor_4_0= ruleExpression ) ) ( (lv_comentario_5_0= ruleComment ) )? otherlv_6= '.'
            {
            // InternalDearCode.g:560:3: ( (lv_verboReas_0_0= ruleVerboReasignacion ) )
            // InternalDearCode.g:561:4: (lv_verboReas_0_0= ruleVerboReasignacion )
            {
            // InternalDearCode.g:561:4: (lv_verboReas_0_0= ruleVerboReasignacion )
            // InternalDearCode.g:562:5: lv_verboReas_0_0= ruleVerboReasignacion
            {

            					newCompositeNode(grammarAccess.getReasignarAccess().getVerboReasVerboReasignacionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
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

            // InternalDearCode.g:579:3: ( (lv_preComentario_1_0= ruleComment ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ANYTEXT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDearCode.g:580:4: (lv_preComentario_1_0= ruleComment )
                    {
                    // InternalDearCode.g:580:4: (lv_preComentario_1_0= ruleComment )
                    // InternalDearCode.g:581:5: lv_preComentario_1_0= ruleComment
                    {

                    					newCompositeNode(grammarAccess.getReasignarAccess().getPreComentarioCommentParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_preComentario_1_0=ruleComment();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getReasignarRule());
                    					}
                    					set(
                    						current,
                    						"preComentario",
                    						lv_preComentario_1_0,
                    						"edu.upb.lp.DearCode.Comment");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDearCode.g:598:3: ( (lv_sustantivo_2_0= ruleMI_ID ) )
            // InternalDearCode.g:599:4: (lv_sustantivo_2_0= ruleMI_ID )
            {
            // InternalDearCode.g:599:4: (lv_sustantivo_2_0= ruleMI_ID )
            // InternalDearCode.g:600:5: lv_sustantivo_2_0= ruleMI_ID
            {

            					newCompositeNode(grammarAccess.getReasignarAccess().getSustantivoMI_IDParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
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

            // InternalDearCode.g:617:3: ( (lv_postComentario_3_0= ruleComment ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ANYTEXT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDearCode.g:618:4: (lv_postComentario_3_0= ruleComment )
                    {
                    // InternalDearCode.g:618:4: (lv_postComentario_3_0= ruleComment )
                    // InternalDearCode.g:619:5: lv_postComentario_3_0= ruleComment
                    {

                    					newCompositeNode(grammarAccess.getReasignarAccess().getPostComentarioCommentParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_postComentario_3_0=ruleComment();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getReasignarRule());
                    					}
                    					set(
                    						current,
                    						"postComentario",
                    						lv_postComentario_3_0,
                    						"edu.upb.lp.DearCode.Comment");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDearCode.g:636:3: ( (lv_valor_4_0= ruleExpression ) )
            // InternalDearCode.g:637:4: (lv_valor_4_0= ruleExpression )
            {
            // InternalDearCode.g:637:4: (lv_valor_4_0= ruleExpression )
            // InternalDearCode.g:638:5: lv_valor_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getReasignarAccess().getValorExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_valor_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReasignarRule());
            					}
            					set(
            						current,
            						"valor",
            						lv_valor_4_0,
            						"edu.upb.lp.DearCode.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDearCode.g:655:3: ( (lv_comentario_5_0= ruleComment ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ANYTEXT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDearCode.g:656:4: (lv_comentario_5_0= ruleComment )
                    {
                    // InternalDearCode.g:656:4: (lv_comentario_5_0= ruleComment )
                    // InternalDearCode.g:657:5: lv_comentario_5_0= ruleComment
                    {

                    					newCompositeNode(grammarAccess.getReasignarAccess().getComentarioCommentParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_comentario_5_0=ruleComment();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getReasignarRule());
                    					}
                    					set(
                    						current,
                    						"comentario",
                    						lv_comentario_5_0,
                    						"edu.upb.lp.DearCode.Comment");
                    					afterParserOrEnumRuleCall();
                    				

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
    // InternalDearCode.g:682:1: entryRuleEntrada returns [EObject current=null] : iv_ruleEntrada= ruleEntrada EOF ;
    public final EObject entryRuleEntrada() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntrada = null;


        try {
            // InternalDearCode.g:682:48: (iv_ruleEntrada= ruleEntrada EOF )
            // InternalDearCode.g:683:2: iv_ruleEntrada= ruleEntrada EOF
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
    // InternalDearCode.g:689:1: ruleEntrada returns [EObject current=null] : (otherlv_0= 'Le ped\\u00ED al lector que me dijera' ( (lv_variable_1_0= ruleMI_ID ) ) (otherlv_2= 'en un susurro num\\u00E9rico' | otherlv_3= 'con palabras de terciopelo' )? otherlv_4= '.' ) ;
    public final EObject ruleEntrada() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_variable_1_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:695:2: ( (otherlv_0= 'Le ped\\u00ED al lector que me dijera' ( (lv_variable_1_0= ruleMI_ID ) ) (otherlv_2= 'en un susurro num\\u00E9rico' | otherlv_3= 'con palabras de terciopelo' )? otherlv_4= '.' ) )
            // InternalDearCode.g:696:2: (otherlv_0= 'Le ped\\u00ED al lector que me dijera' ( (lv_variable_1_0= ruleMI_ID ) ) (otherlv_2= 'en un susurro num\\u00E9rico' | otherlv_3= 'con palabras de terciopelo' )? otherlv_4= '.' )
            {
            // InternalDearCode.g:696:2: (otherlv_0= 'Le ped\\u00ED al lector que me dijera' ( (lv_variable_1_0= ruleMI_ID ) ) (otherlv_2= 'en un susurro num\\u00E9rico' | otherlv_3= 'con palabras de terciopelo' )? otherlv_4= '.' )
            // InternalDearCode.g:697:3: otherlv_0= 'Le ped\\u00ED al lector que me dijera' ( (lv_variable_1_0= ruleMI_ID ) ) (otherlv_2= 'en un susurro num\\u00E9rico' | otherlv_3= 'con palabras de terciopelo' )? otherlv_4= '.'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEntradaAccess().getLePedAlLectorQueMeDijeraKeyword_0());
            		
            // InternalDearCode.g:701:3: ( (lv_variable_1_0= ruleMI_ID ) )
            // InternalDearCode.g:702:4: (lv_variable_1_0= ruleMI_ID )
            {
            // InternalDearCode.g:702:4: (lv_variable_1_0= ruleMI_ID )
            // InternalDearCode.g:703:5: lv_variable_1_0= ruleMI_ID
            {

            					newCompositeNode(grammarAccess.getEntradaAccess().getVariableMI_IDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
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

            // InternalDearCode.g:720:3: (otherlv_2= 'en un susurro num\\u00E9rico' | otherlv_3= 'con palabras de terciopelo' )?
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            else if ( (LA9_0==18) ) {
                alt9=2;
            }
            switch (alt9) {
                case 1 :
                    // InternalDearCode.g:721:4: otherlv_2= 'en un susurro num\\u00E9rico'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getEntradaAccess().getEnUnSusurroNumRicoKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:726:4: otherlv_3= 'con palabras de terciopelo'
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getEntradaAccess().getConPalabrasDeTerciopeloKeyword_2_1());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEntradaAccess().getFullStopKeyword_3());
            		

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
    // InternalDearCode.g:739:1: entryRuleSalida returns [EObject current=null] : iv_ruleSalida= ruleSalida EOF ;
    public final EObject entryRuleSalida() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSalida = null;


        try {
            // InternalDearCode.g:739:47: (iv_ruleSalida= ruleSalida EOF )
            // InternalDearCode.g:740:2: iv_ruleSalida= ruleSalida EOF
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
    // InternalDearCode.g:746:1: ruleSalida returns [EObject current=null] : (otherlv_0= 'Hoy le quise contar al mundo sobre:' ( (lv_expresion_1_0= ruleExpression ) ) otherlv_2= '.' ) ;
    public final EObject ruleSalida() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expresion_1_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:752:2: ( (otherlv_0= 'Hoy le quise contar al mundo sobre:' ( (lv_expresion_1_0= ruleExpression ) ) otherlv_2= '.' ) )
            // InternalDearCode.g:753:2: (otherlv_0= 'Hoy le quise contar al mundo sobre:' ( (lv_expresion_1_0= ruleExpression ) ) otherlv_2= '.' )
            {
            // InternalDearCode.g:753:2: (otherlv_0= 'Hoy le quise contar al mundo sobre:' ( (lv_expresion_1_0= ruleExpression ) ) otherlv_2= '.' )
            // InternalDearCode.g:754:3: otherlv_0= 'Hoy le quise contar al mundo sobre:' ( (lv_expresion_1_0= ruleExpression ) ) otherlv_2= '.'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSalidaAccess().getHoyLeQuiseContarAlMundoSobreKeyword_0());
            		
            // InternalDearCode.g:758:3: ( (lv_expresion_1_0= ruleExpression ) )
            // InternalDearCode.g:759:4: (lv_expresion_1_0= ruleExpression )
            {
            // InternalDearCode.g:759:4: (lv_expresion_1_0= ruleExpression )
            // InternalDearCode.g:760:5: lv_expresion_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSalidaAccess().getExpresionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
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


    // $ANTLR start "entryRuleElementoBloque"
    // InternalDearCode.g:785:1: entryRuleElementoBloque returns [EObject current=null] : iv_ruleElementoBloque= ruleElementoBloque EOF ;
    public final EObject entryRuleElementoBloque() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementoBloque = null;


        try {
            // InternalDearCode.g:785:55: (iv_ruleElementoBloque= ruleElementoBloque EOF )
            // InternalDearCode.g:786:2: iv_ruleElementoBloque= ruleElementoBloque EOF
            {
             newCompositeNode(grammarAccess.getElementoBloqueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementoBloque=ruleElementoBloque();

            state._fsp--;

             current =iv_ruleElementoBloque; 
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
    // $ANTLR end "entryRuleElementoBloque"


    // $ANTLR start "ruleElementoBloque"
    // InternalDearCode.g:792:1: ruleElementoBloque returns [EObject current=null] : (this_Instruccion_0= ruleInstruccion | this_Return_1= ruleReturn ) ;
    public final EObject ruleElementoBloque() throws RecognitionException {
        EObject current = null;

        EObject this_Instruccion_0 = null;

        EObject this_Return_1 = null;



        	enterRule();

        try {
            // InternalDearCode.g:798:2: ( (this_Instruccion_0= ruleInstruccion | this_Return_1= ruleReturn ) )
            // InternalDearCode.g:799:2: (this_Instruccion_0= ruleInstruccion | this_Return_1= ruleReturn )
            {
            // InternalDearCode.g:799:2: (this_Instruccion_0= ruleInstruccion | this_Return_1= ruleReturn )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16||(LA10_0>=19 && LA10_0<=20)||(LA10_0>=26 && LA10_0<=27)||LA10_0==30||(LA10_0>=36 && LA10_0<=38)||LA10_0==65||(LA10_0>=73 && LA10_0<=79)) ) {
                alt10=1;
            }
            else if ( (LA10_0==43) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDearCode.g:800:3: this_Instruccion_0= ruleInstruccion
                    {

                    			newCompositeNode(grammarAccess.getElementoBloqueAccess().getInstruccionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Instruccion_0=ruleInstruccion();

                    state._fsp--;


                    			current = this_Instruccion_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:809:3: this_Return_1= ruleReturn
                    {

                    			newCompositeNode(grammarAccess.getElementoBloqueAccess().getReturnParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Return_1=ruleReturn();

                    state._fsp--;


                    			current = this_Return_1;
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
    // $ANTLR end "ruleElementoBloque"


    // $ANTLR start "entryRuleCondicional"
    // InternalDearCode.g:821:1: entryRuleCondicional returns [EObject current=null] : iv_ruleCondicional= ruleCondicional EOF ;
    public final EObject entryRuleCondicional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondicional = null;


        try {
            // InternalDearCode.g:821:52: (iv_ruleCondicional= ruleCondicional EOF )
            // InternalDearCode.g:822:2: iv_ruleCondicional= ruleCondicional EOF
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
    // InternalDearCode.g:828:1: ruleCondicional returns [EObject current=null] : (otherlv_0= 'Si en tu corazon sientes que' ( (lv_condicion_1_0= ruleExpression ) ) otherlv_2= ',' otherlv_3= 'entonces deja que estas palabras florezcan:' ( (lv_instruccionesThen_4_0= ruleElementoBloque ) )+ (otherlv_5= 'Pero si el destino dijera lo contrario,' otherlv_6= 'que broten estas verdades:' ( (lv_instruccionesElse_7_0= ruleElementoBloque ) )+ )? otherlv_8= 'Y as\\u00ED el universo sigue su curso.' ) ;
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
            // InternalDearCode.g:834:2: ( (otherlv_0= 'Si en tu corazon sientes que' ( (lv_condicion_1_0= ruleExpression ) ) otherlv_2= ',' otherlv_3= 'entonces deja que estas palabras florezcan:' ( (lv_instruccionesThen_4_0= ruleElementoBloque ) )+ (otherlv_5= 'Pero si el destino dijera lo contrario,' otherlv_6= 'que broten estas verdades:' ( (lv_instruccionesElse_7_0= ruleElementoBloque ) )+ )? otherlv_8= 'Y as\\u00ED el universo sigue su curso.' ) )
            // InternalDearCode.g:835:2: (otherlv_0= 'Si en tu corazon sientes que' ( (lv_condicion_1_0= ruleExpression ) ) otherlv_2= ',' otherlv_3= 'entonces deja que estas palabras florezcan:' ( (lv_instruccionesThen_4_0= ruleElementoBloque ) )+ (otherlv_5= 'Pero si el destino dijera lo contrario,' otherlv_6= 'que broten estas verdades:' ( (lv_instruccionesElse_7_0= ruleElementoBloque ) )+ )? otherlv_8= 'Y as\\u00ED el universo sigue su curso.' )
            {
            // InternalDearCode.g:835:2: (otherlv_0= 'Si en tu corazon sientes que' ( (lv_condicion_1_0= ruleExpression ) ) otherlv_2= ',' otherlv_3= 'entonces deja que estas palabras florezcan:' ( (lv_instruccionesThen_4_0= ruleElementoBloque ) )+ (otherlv_5= 'Pero si el destino dijera lo contrario,' otherlv_6= 'que broten estas verdades:' ( (lv_instruccionesElse_7_0= ruleElementoBloque ) )+ )? otherlv_8= 'Y as\\u00ED el universo sigue su curso.' )
            // InternalDearCode.g:836:3: otherlv_0= 'Si en tu corazon sientes que' ( (lv_condicion_1_0= ruleExpression ) ) otherlv_2= ',' otherlv_3= 'entonces deja que estas palabras florezcan:' ( (lv_instruccionesThen_4_0= ruleElementoBloque ) )+ (otherlv_5= 'Pero si el destino dijera lo contrario,' otherlv_6= 'que broten estas verdades:' ( (lv_instruccionesElse_7_0= ruleElementoBloque ) )+ )? otherlv_8= 'Y as\\u00ED el universo sigue su curso.'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getCondicionalAccess().getSiEnTuCorazonSientesQueKeyword_0());
            		
            // InternalDearCode.g:840:3: ( (lv_condicion_1_0= ruleExpression ) )
            // InternalDearCode.g:841:4: (lv_condicion_1_0= ruleExpression )
            {
            // InternalDearCode.g:841:4: (lv_condicion_1_0= ruleExpression )
            // InternalDearCode.g:842:5: lv_condicion_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getCondicionalAccess().getCondicionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_condicion_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCondicionalRule());
            					}
            					set(
            						current,
            						"condicion",
            						lv_condicion_1_0,
            						"edu.upb.lp.DearCode.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getCondicionalAccess().getCommaKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getCondicionalAccess().getEntoncesDejaQueEstasPalabrasFlorezcanKeyword_3());
            		
            // InternalDearCode.g:867:3: ( (lv_instruccionesThen_4_0= ruleElementoBloque ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16||(LA11_0>=19 && LA11_0<=20)||(LA11_0>=26 && LA11_0<=27)||LA11_0==30||(LA11_0>=36 && LA11_0<=38)||LA11_0==43||LA11_0==65||(LA11_0>=73 && LA11_0<=79)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDearCode.g:868:4: (lv_instruccionesThen_4_0= ruleElementoBloque )
            	    {
            	    // InternalDearCode.g:868:4: (lv_instruccionesThen_4_0= ruleElementoBloque )
            	    // InternalDearCode.g:869:5: lv_instruccionesThen_4_0= ruleElementoBloque
            	    {

            	    					newCompositeNode(grammarAccess.getCondicionalAccess().getInstruccionesThenElementoBloqueParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_instruccionesThen_4_0=ruleElementoBloque();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCondicionalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instruccionesThen",
            	    						lv_instruccionesThen_4_0,
            	    						"edu.upb.lp.DearCode.ElementoBloque");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            // InternalDearCode.g:886:3: (otherlv_5= 'Pero si el destino dijera lo contrario,' otherlv_6= 'que broten estas verdades:' ( (lv_instruccionesElse_7_0= ruleElementoBloque ) )+ )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDearCode.g:887:4: otherlv_5= 'Pero si el destino dijera lo contrario,' otherlv_6= 'que broten estas verdades:' ( (lv_instruccionesElse_7_0= ruleElementoBloque ) )+
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getCondicionalAccess().getPeroSiElDestinoDijeraLoContrarioKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,24,FOLLOW_15); 

                    				newLeafNode(otherlv_6, grammarAccess.getCondicionalAccess().getQueBrotenEstasVerdadesKeyword_5_1());
                    			
                    // InternalDearCode.g:895:4: ( (lv_instruccionesElse_7_0= ruleElementoBloque ) )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==16||(LA12_0>=19 && LA12_0<=20)||(LA12_0>=26 && LA12_0<=27)||LA12_0==30||(LA12_0>=36 && LA12_0<=38)||LA12_0==43||LA12_0==65||(LA12_0>=73 && LA12_0<=79)) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalDearCode.g:896:5: (lv_instruccionesElse_7_0= ruleElementoBloque )
                    	    {
                    	    // InternalDearCode.g:896:5: (lv_instruccionesElse_7_0= ruleElementoBloque )
                    	    // InternalDearCode.g:897:6: lv_instruccionesElse_7_0= ruleElementoBloque
                    	    {

                    	    						newCompositeNode(grammarAccess.getCondicionalAccess().getInstruccionesElseElementoBloqueParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_18);
                    	    lv_instruccionesElse_7_0=ruleElementoBloque();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCondicionalRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"instruccionesElse",
                    	    							lv_instruccionesElse_7_0,
                    	    							"edu.upb.lp.DearCode.ElementoBloque");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,25,FOLLOW_2); 

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
    // InternalDearCode.g:923:1: entryRuleBucleWhile returns [EObject current=null] : iv_ruleBucleWhile= ruleBucleWhile EOF ;
    public final EObject entryRuleBucleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBucleWhile = null;


        try {
            // InternalDearCode.g:923:51: (iv_ruleBucleWhile= ruleBucleWhile EOF )
            // InternalDearCode.g:924:2: iv_ruleBucleWhile= ruleBucleWhile EOF
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
    // InternalDearCode.g:930:1: ruleBucleWhile returns [EObject current=null] : ( (otherlv_0= 'Mientras aun me piensas' | otherlv_1= 'Mientras a\\u00FAn sue\\u00F1es con este momento' ) ( (lv_condicion_2_0= ruleExpression ) ) otherlv_3= ',' otherlv_4= 'haz que suceda:' ( (lv_loopBody_5_0= ruleElementoBloque ) )+ otherlv_6= 'Y as\\u00ED el susurro descansa.' ) ;
    public final EObject ruleBucleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_condicion_2_0 = null;

        EObject lv_loopBody_5_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:936:2: ( ( (otherlv_0= 'Mientras aun me piensas' | otherlv_1= 'Mientras a\\u00FAn sue\\u00F1es con este momento' ) ( (lv_condicion_2_0= ruleExpression ) ) otherlv_3= ',' otherlv_4= 'haz que suceda:' ( (lv_loopBody_5_0= ruleElementoBloque ) )+ otherlv_6= 'Y as\\u00ED el susurro descansa.' ) )
            // InternalDearCode.g:937:2: ( (otherlv_0= 'Mientras aun me piensas' | otherlv_1= 'Mientras a\\u00FAn sue\\u00F1es con este momento' ) ( (lv_condicion_2_0= ruleExpression ) ) otherlv_3= ',' otherlv_4= 'haz que suceda:' ( (lv_loopBody_5_0= ruleElementoBloque ) )+ otherlv_6= 'Y as\\u00ED el susurro descansa.' )
            {
            // InternalDearCode.g:937:2: ( (otherlv_0= 'Mientras aun me piensas' | otherlv_1= 'Mientras a\\u00FAn sue\\u00F1es con este momento' ) ( (lv_condicion_2_0= ruleExpression ) ) otherlv_3= ',' otherlv_4= 'haz que suceda:' ( (lv_loopBody_5_0= ruleElementoBloque ) )+ otherlv_6= 'Y as\\u00ED el susurro descansa.' )
            // InternalDearCode.g:938:3: (otherlv_0= 'Mientras aun me piensas' | otherlv_1= 'Mientras a\\u00FAn sue\\u00F1es con este momento' ) ( (lv_condicion_2_0= ruleExpression ) ) otherlv_3= ',' otherlv_4= 'haz que suceda:' ( (lv_loopBody_5_0= ruleElementoBloque ) )+ otherlv_6= 'Y as\\u00ED el susurro descansa.'
            {
            // InternalDearCode.g:938:3: (otherlv_0= 'Mientras aun me piensas' | otherlv_1= 'Mientras a\\u00FAn sue\\u00F1es con este momento' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            else if ( (LA14_0==27) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalDearCode.g:939:4: otherlv_0= 'Mientras aun me piensas'
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getBucleWhileAccess().getMientrasAunMePiensasKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:944:4: otherlv_1= 'Mientras a\\u00FAn sue\\u00F1es con este momento'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getBucleWhileAccess().getMientrasANSueEsConEsteMomentoKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalDearCode.g:949:3: ( (lv_condicion_2_0= ruleExpression ) )
            // InternalDearCode.g:950:4: (lv_condicion_2_0= ruleExpression )
            {
            // InternalDearCode.g:950:4: (lv_condicion_2_0= ruleExpression )
            // InternalDearCode.g:951:5: lv_condicion_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getBucleWhileAccess().getCondicionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_condicion_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBucleWhileRule());
            					}
            					set(
            						current,
            						"condicion",
            						lv_condicion_2_0,
            						"edu.upb.lp.DearCode.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getBucleWhileAccess().getCommaKeyword_2());
            		
            otherlv_4=(Token)match(input,28,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getBucleWhileAccess().getHazQueSucedaKeyword_3());
            		
            // InternalDearCode.g:976:3: ( (lv_loopBody_5_0= ruleElementoBloque ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==16||(LA15_0>=19 && LA15_0<=20)||(LA15_0>=26 && LA15_0<=27)||LA15_0==30||(LA15_0>=36 && LA15_0<=38)||LA15_0==43||LA15_0==65||(LA15_0>=73 && LA15_0<=79)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDearCode.g:977:4: (lv_loopBody_5_0= ruleElementoBloque )
            	    {
            	    // InternalDearCode.g:977:4: (lv_loopBody_5_0= ruleElementoBloque )
            	    // InternalDearCode.g:978:5: lv_loopBody_5_0= ruleElementoBloque
            	    {

            	    					newCompositeNode(grammarAccess.getBucleWhileAccess().getLoopBodyElementoBloqueParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_loopBody_5_0=ruleElementoBloque();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBucleWhileRule());
            	    					}
            	    					add(
            	    						current,
            	    						"loopBody",
            	    						lv_loopBody_5_0,
            	    						"edu.upb.lp.DearCode.ElementoBloque");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            otherlv_6=(Token)match(input,29,FOLLOW_2); 

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
    // InternalDearCode.g:1003:1: entryRuleBucleFor returns [EObject current=null] : iv_ruleBucleFor= ruleBucleFor EOF ;
    public final EObject entryRuleBucleFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBucleFor = null;


        try {
            // InternalDearCode.g:1003:49: (iv_ruleBucleFor= ruleBucleFor EOF )
            // InternalDearCode.g:1004:2: iv_ruleBucleFor= ruleBucleFor EOF
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
    // InternalDearCode.g:1010:1: ruleBucleFor returns [EObject current=null] : (otherlv_0= 'En cada suspiro' ( (lv_variable_1_0= ruleMI_ID ) ) otherlv_2= 'desde' ( (lv_inicio_3_0= ruleExpression ) ) otherlv_4= 'hasta' ( (lv_fin_5_0= ruleExpression ) ) (otherlv_6= 'con paso' ( (lv_paso_7_0= ruleExpression ) ) )? otherlv_8= 'deja que el universo cante:' ( (lv_loopBody_9_0= ruleElementoBloque ) )+ otherlv_10= 'Cuando el \\u00FAltimo eco se calle.' ) ;
    public final EObject ruleBucleFor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_variable_1_0 = null;

        EObject lv_inicio_3_0 = null;

        EObject lv_fin_5_0 = null;

        EObject lv_paso_7_0 = null;

        EObject lv_loopBody_9_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:1016:2: ( (otherlv_0= 'En cada suspiro' ( (lv_variable_1_0= ruleMI_ID ) ) otherlv_2= 'desde' ( (lv_inicio_3_0= ruleExpression ) ) otherlv_4= 'hasta' ( (lv_fin_5_0= ruleExpression ) ) (otherlv_6= 'con paso' ( (lv_paso_7_0= ruleExpression ) ) )? otherlv_8= 'deja que el universo cante:' ( (lv_loopBody_9_0= ruleElementoBloque ) )+ otherlv_10= 'Cuando el \\u00FAltimo eco se calle.' ) )
            // InternalDearCode.g:1017:2: (otherlv_0= 'En cada suspiro' ( (lv_variable_1_0= ruleMI_ID ) ) otherlv_2= 'desde' ( (lv_inicio_3_0= ruleExpression ) ) otherlv_4= 'hasta' ( (lv_fin_5_0= ruleExpression ) ) (otherlv_6= 'con paso' ( (lv_paso_7_0= ruleExpression ) ) )? otherlv_8= 'deja que el universo cante:' ( (lv_loopBody_9_0= ruleElementoBloque ) )+ otherlv_10= 'Cuando el \\u00FAltimo eco se calle.' )
            {
            // InternalDearCode.g:1017:2: (otherlv_0= 'En cada suspiro' ( (lv_variable_1_0= ruleMI_ID ) ) otherlv_2= 'desde' ( (lv_inicio_3_0= ruleExpression ) ) otherlv_4= 'hasta' ( (lv_fin_5_0= ruleExpression ) ) (otherlv_6= 'con paso' ( (lv_paso_7_0= ruleExpression ) ) )? otherlv_8= 'deja que el universo cante:' ( (lv_loopBody_9_0= ruleElementoBloque ) )+ otherlv_10= 'Cuando el \\u00FAltimo eco se calle.' )
            // InternalDearCode.g:1018:3: otherlv_0= 'En cada suspiro' ( (lv_variable_1_0= ruleMI_ID ) ) otherlv_2= 'desde' ( (lv_inicio_3_0= ruleExpression ) ) otherlv_4= 'hasta' ( (lv_fin_5_0= ruleExpression ) ) (otherlv_6= 'con paso' ( (lv_paso_7_0= ruleExpression ) ) )? otherlv_8= 'deja que el universo cante:' ( (lv_loopBody_9_0= ruleElementoBloque ) )+ otherlv_10= 'Cuando el \\u00FAltimo eco se calle.'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getBucleForAccess().getEnCadaSuspiroKeyword_0());
            		
            // InternalDearCode.g:1022:3: ( (lv_variable_1_0= ruleMI_ID ) )
            // InternalDearCode.g:1023:4: (lv_variable_1_0= ruleMI_ID )
            {
            // InternalDearCode.g:1023:4: (lv_variable_1_0= ruleMI_ID )
            // InternalDearCode.g:1024:5: lv_variable_1_0= ruleMI_ID
            {

            					newCompositeNode(grammarAccess.getBucleForAccess().getVariableMI_IDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
            lv_variable_1_0=ruleMI_ID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBucleForRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_1_0,
            						"edu.upb.lp.DearCode.MI_ID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getBucleForAccess().getDesdeKeyword_2());
            		
            // InternalDearCode.g:1045:3: ( (lv_inicio_3_0= ruleExpression ) )
            // InternalDearCode.g:1046:4: (lv_inicio_3_0= ruleExpression )
            {
            // InternalDearCode.g:1046:4: (lv_inicio_3_0= ruleExpression )
            // InternalDearCode.g:1047:5: lv_inicio_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getBucleForAccess().getInicioExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_inicio_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBucleForRule());
            					}
            					set(
            						current,
            						"inicio",
            						lv_inicio_3_0,
            						"edu.upb.lp.DearCode.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getBucleForAccess().getHastaKeyword_4());
            		
            // InternalDearCode.g:1068:3: ( (lv_fin_5_0= ruleExpression ) )
            // InternalDearCode.g:1069:4: (lv_fin_5_0= ruleExpression )
            {
            // InternalDearCode.g:1069:4: (lv_fin_5_0= ruleExpression )
            // InternalDearCode.g:1070:5: lv_fin_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getBucleForAccess().getFinExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_23);
            lv_fin_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBucleForRule());
            					}
            					set(
            						current,
            						"fin",
            						lv_fin_5_0,
            						"edu.upb.lp.DearCode.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDearCode.g:1087:3: (otherlv_6= 'con paso' ( (lv_paso_7_0= ruleExpression ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDearCode.g:1088:4: otherlv_6= 'con paso' ( (lv_paso_7_0= ruleExpression ) )
                    {
                    otherlv_6=(Token)match(input,33,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getBucleForAccess().getConPasoKeyword_6_0());
                    			
                    // InternalDearCode.g:1092:4: ( (lv_paso_7_0= ruleExpression ) )
                    // InternalDearCode.g:1093:5: (lv_paso_7_0= ruleExpression )
                    {
                    // InternalDearCode.g:1093:5: (lv_paso_7_0= ruleExpression )
                    // InternalDearCode.g:1094:6: lv_paso_7_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getBucleForAccess().getPasoExpressionParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_paso_7_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBucleForRule());
                    						}
                    						set(
                    							current,
                    							"paso",
                    							lv_paso_7_0,
                    							"edu.upb.lp.DearCode.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,34,FOLLOW_15); 

            			newLeafNode(otherlv_8, grammarAccess.getBucleForAccess().getDejaQueElUniversoCanteKeyword_7());
            		
            // InternalDearCode.g:1116:3: ( (lv_loopBody_9_0= ruleElementoBloque ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==16||(LA17_0>=19 && LA17_0<=20)||(LA17_0>=26 && LA17_0<=27)||LA17_0==30||(LA17_0>=36 && LA17_0<=38)||LA17_0==43||LA17_0==65||(LA17_0>=73 && LA17_0<=79)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDearCode.g:1117:4: (lv_loopBody_9_0= ruleElementoBloque )
            	    {
            	    // InternalDearCode.g:1117:4: (lv_loopBody_9_0= ruleElementoBloque )
            	    // InternalDearCode.g:1118:5: lv_loopBody_9_0= ruleElementoBloque
            	    {

            	    					newCompositeNode(grammarAccess.getBucleForAccess().getLoopBodyElementoBloqueParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_loopBody_9_0=ruleElementoBloque();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBucleForRule());
            	    					}
            	    					add(
            	    						current,
            	    						"loopBody",
            	    						lv_loopBody_9_0,
            	    						"edu.upb.lp.DearCode.ElementoBloque");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            otherlv_10=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getBucleForAccess().getCuandoElLtimoEcoSeCalleKeyword_9());
            		

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
    // InternalDearCode.g:1143:1: entryRuleFuncion returns [EObject current=null] : iv_ruleFuncion= ruleFuncion EOF ;
    public final EObject entryRuleFuncion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncion = null;


        try {
            // InternalDearCode.g:1143:48: (iv_ruleFuncion= ruleFuncion EOF )
            // InternalDearCode.g:1144:2: iv_ruleFuncion= ruleFuncion EOF
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
    // InternalDearCode.g:1150:1: ruleFuncion returns [EObject current=null] : ( (otherlv_0= 'Dejo en estas l\\u00EDneas una promesa llamada' | otherlv_1= 'Escribo en estas l\\u00EDneas una intenci\\u00F3n llamada' | otherlv_2= 'En la brisa escondo un deseo llamado' ) ( (lv_name_3_0= ruleMI_ID ) ) (otherlv_4= 'que guarda en su esencia' ( (lv_parametros_5_0= ruleMI_ID ) ) (otherlv_6= ',' ( (lv_parametros_7_0= ruleMI_ID ) ) )* )? (otherlv_8= 'prometiendo devolver' ( (lv_tipo_9_0= ruleType ) ) )? otherlv_10= 'Cuando la promesa se cumple:' ( (lv_instrucciones_11_0= ruleElementoBloque ) )+ otherlv_12= 'As\\u00ED se sella la promesa.' ) ;
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
        EObject lv_name_3_0 = null;

        EObject lv_parametros_5_0 = null;

        EObject lv_parametros_7_0 = null;

        AntlrDatatypeRuleToken lv_tipo_9_0 = null;

        EObject lv_instrucciones_11_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:1156:2: ( ( (otherlv_0= 'Dejo en estas l\\u00EDneas una promesa llamada' | otherlv_1= 'Escribo en estas l\\u00EDneas una intenci\\u00F3n llamada' | otherlv_2= 'En la brisa escondo un deseo llamado' ) ( (lv_name_3_0= ruleMI_ID ) ) (otherlv_4= 'que guarda en su esencia' ( (lv_parametros_5_0= ruleMI_ID ) ) (otherlv_6= ',' ( (lv_parametros_7_0= ruleMI_ID ) ) )* )? (otherlv_8= 'prometiendo devolver' ( (lv_tipo_9_0= ruleType ) ) )? otherlv_10= 'Cuando la promesa se cumple:' ( (lv_instrucciones_11_0= ruleElementoBloque ) )+ otherlv_12= 'As\\u00ED se sella la promesa.' ) )
            // InternalDearCode.g:1157:2: ( (otherlv_0= 'Dejo en estas l\\u00EDneas una promesa llamada' | otherlv_1= 'Escribo en estas l\\u00EDneas una intenci\\u00F3n llamada' | otherlv_2= 'En la brisa escondo un deseo llamado' ) ( (lv_name_3_0= ruleMI_ID ) ) (otherlv_4= 'que guarda en su esencia' ( (lv_parametros_5_0= ruleMI_ID ) ) (otherlv_6= ',' ( (lv_parametros_7_0= ruleMI_ID ) ) )* )? (otherlv_8= 'prometiendo devolver' ( (lv_tipo_9_0= ruleType ) ) )? otherlv_10= 'Cuando la promesa se cumple:' ( (lv_instrucciones_11_0= ruleElementoBloque ) )+ otherlv_12= 'As\\u00ED se sella la promesa.' )
            {
            // InternalDearCode.g:1157:2: ( (otherlv_0= 'Dejo en estas l\\u00EDneas una promesa llamada' | otherlv_1= 'Escribo en estas l\\u00EDneas una intenci\\u00F3n llamada' | otherlv_2= 'En la brisa escondo un deseo llamado' ) ( (lv_name_3_0= ruleMI_ID ) ) (otherlv_4= 'que guarda en su esencia' ( (lv_parametros_5_0= ruleMI_ID ) ) (otherlv_6= ',' ( (lv_parametros_7_0= ruleMI_ID ) ) )* )? (otherlv_8= 'prometiendo devolver' ( (lv_tipo_9_0= ruleType ) ) )? otherlv_10= 'Cuando la promesa se cumple:' ( (lv_instrucciones_11_0= ruleElementoBloque ) )+ otherlv_12= 'As\\u00ED se sella la promesa.' )
            // InternalDearCode.g:1158:3: (otherlv_0= 'Dejo en estas l\\u00EDneas una promesa llamada' | otherlv_1= 'Escribo en estas l\\u00EDneas una intenci\\u00F3n llamada' | otherlv_2= 'En la brisa escondo un deseo llamado' ) ( (lv_name_3_0= ruleMI_ID ) ) (otherlv_4= 'que guarda en su esencia' ( (lv_parametros_5_0= ruleMI_ID ) ) (otherlv_6= ',' ( (lv_parametros_7_0= ruleMI_ID ) ) )* )? (otherlv_8= 'prometiendo devolver' ( (lv_tipo_9_0= ruleType ) ) )? otherlv_10= 'Cuando la promesa se cumple:' ( (lv_instrucciones_11_0= ruleElementoBloque ) )+ otherlv_12= 'As\\u00ED se sella la promesa.'
            {
            // InternalDearCode.g:1158:3: (otherlv_0= 'Dejo en estas l\\u00EDneas una promesa llamada' | otherlv_1= 'Escribo en estas l\\u00EDneas una intenci\\u00F3n llamada' | otherlv_2= 'En la brisa escondo un deseo llamado' )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt18=1;
                }
                break;
            case 37:
                {
                alt18=2;
                }
                break;
            case 38:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalDearCode.g:1159:4: otherlv_0= 'Dejo en estas l\\u00EDneas una promesa llamada'
                    {
                    otherlv_0=(Token)match(input,36,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getFuncionAccess().getDejoEnEstasLNeasUnaPromesaLlamadaKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:1164:4: otherlv_1= 'Escribo en estas l\\u00EDneas una intenci\\u00F3n llamada'
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getFuncionAccess().getEscriboEnEstasLNeasUnaIntenciNLlamadaKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalDearCode.g:1169:4: otherlv_2= 'En la brisa escondo un deseo llamado'
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getFuncionAccess().getEnLaBrisaEscondoUnDeseoLlamadoKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalDearCode.g:1174:3: ( (lv_name_3_0= ruleMI_ID ) )
            // InternalDearCode.g:1175:4: (lv_name_3_0= ruleMI_ID )
            {
            // InternalDearCode.g:1175:4: (lv_name_3_0= ruleMI_ID )
            // InternalDearCode.g:1176:5: lv_name_3_0= ruleMI_ID
            {

            					newCompositeNode(grammarAccess.getFuncionAccess().getNameMI_IDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
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

            // InternalDearCode.g:1193:3: (otherlv_4= 'que guarda en su esencia' ( (lv_parametros_5_0= ruleMI_ID ) ) (otherlv_6= ',' ( (lv_parametros_7_0= ruleMI_ID ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==39) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDearCode.g:1194:4: otherlv_4= 'que guarda en su esencia' ( (lv_parametros_5_0= ruleMI_ID ) ) (otherlv_6= ',' ( (lv_parametros_7_0= ruleMI_ID ) ) )*
                    {
                    otherlv_4=(Token)match(input,39,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getFuncionAccess().getQueGuardaEnSuEsenciaKeyword_2_0());
                    			
                    // InternalDearCode.g:1198:4: ( (lv_parametros_5_0= ruleMI_ID ) )
                    // InternalDearCode.g:1199:5: (lv_parametros_5_0= ruleMI_ID )
                    {
                    // InternalDearCode.g:1199:5: (lv_parametros_5_0= ruleMI_ID )
                    // InternalDearCode.g:1200:6: lv_parametros_5_0= ruleMI_ID
                    {

                    						newCompositeNode(grammarAccess.getFuncionAccess().getParametrosMI_IDParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_27);
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

                    // InternalDearCode.g:1217:4: (otherlv_6= ',' ( (lv_parametros_7_0= ruleMI_ID ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==21) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalDearCode.g:1218:5: otherlv_6= ',' ( (lv_parametros_7_0= ruleMI_ID ) )
                    	    {
                    	    otherlv_6=(Token)match(input,21,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getFuncionAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalDearCode.g:1222:5: ( (lv_parametros_7_0= ruleMI_ID ) )
                    	    // InternalDearCode.g:1223:6: (lv_parametros_7_0= ruleMI_ID )
                    	    {
                    	    // InternalDearCode.g:1223:6: (lv_parametros_7_0= ruleMI_ID )
                    	    // InternalDearCode.g:1224:7: lv_parametros_7_0= ruleMI_ID
                    	    {

                    	    							newCompositeNode(grammarAccess.getFuncionAccess().getParametrosMI_IDParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
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
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalDearCode.g:1243:3: (otherlv_8= 'prometiendo devolver' ( (lv_tipo_9_0= ruleType ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==40) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDearCode.g:1244:4: otherlv_8= 'prometiendo devolver' ( (lv_tipo_9_0= ruleType ) )
                    {
                    otherlv_8=(Token)match(input,40,FOLLOW_28); 

                    				newLeafNode(otherlv_8, grammarAccess.getFuncionAccess().getPrometiendoDevolverKeyword_3_0());
                    			
                    // InternalDearCode.g:1248:4: ( (lv_tipo_9_0= ruleType ) )
                    // InternalDearCode.g:1249:5: (lv_tipo_9_0= ruleType )
                    {
                    // InternalDearCode.g:1249:5: (lv_tipo_9_0= ruleType )
                    // InternalDearCode.g:1250:6: lv_tipo_9_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getFuncionAccess().getTipoTypeParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_tipo_9_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFuncionRule());
                    						}
                    						set(
                    							current,
                    							"tipo",
                    							lv_tipo_9_0,
                    							"edu.upb.lp.DearCode.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,41,FOLLOW_15); 

            			newLeafNode(otherlv_10, grammarAccess.getFuncionAccess().getCuandoLaPromesaSeCumpleKeyword_4());
            		
            // InternalDearCode.g:1272:3: ( (lv_instrucciones_11_0= ruleElementoBloque ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==16||(LA22_0>=19 && LA22_0<=20)||(LA22_0>=26 && LA22_0<=27)||LA22_0==30||(LA22_0>=36 && LA22_0<=38)||LA22_0==43||LA22_0==65||(LA22_0>=73 && LA22_0<=79)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalDearCode.g:1273:4: (lv_instrucciones_11_0= ruleElementoBloque )
            	    {
            	    // InternalDearCode.g:1273:4: (lv_instrucciones_11_0= ruleElementoBloque )
            	    // InternalDearCode.g:1274:5: lv_instrucciones_11_0= ruleElementoBloque
            	    {

            	    					newCompositeNode(grammarAccess.getFuncionAccess().getInstruccionesElementoBloqueParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_30);
            	    lv_instrucciones_11_0=ruleElementoBloque();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFuncionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instrucciones",
            	    						lv_instrucciones_11_0,
            	    						"edu.upb.lp.DearCode.ElementoBloque");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            otherlv_12=(Token)match(input,42,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getFuncionAccess().getAsSeSellaLaPromesaKeyword_6());
            		

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


    // $ANTLR start "entryRuleReturn"
    // InternalDearCode.g:1299:1: entryRuleReturn returns [EObject current=null] : iv_ruleReturn= ruleReturn EOF ;
    public final EObject entryRuleReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturn = null;


        try {
            // InternalDearCode.g:1299:47: (iv_ruleReturn= ruleReturn EOF )
            // InternalDearCode.g:1300:2: iv_ruleReturn= ruleReturn EOF
            {
             newCompositeNode(grammarAccess.getReturnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReturn=ruleReturn();

            state._fsp--;

             current =iv_ruleReturn; 
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
    // $ANTLR end "entryRuleReturn"


    // $ANTLR start "ruleReturn"
    // InternalDearCode.g:1306:1: ruleReturn returns [EObject current=null] : (otherlv_0= 'Y entrego al viento' ( (lv_expresion_1_0= ruleExpression ) ) otherlv_2= 'como promesa cumplida.' ) ;
    public final EObject ruleReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expresion_1_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:1312:2: ( (otherlv_0= 'Y entrego al viento' ( (lv_expresion_1_0= ruleExpression ) ) otherlv_2= 'como promesa cumplida.' ) )
            // InternalDearCode.g:1313:2: (otherlv_0= 'Y entrego al viento' ( (lv_expresion_1_0= ruleExpression ) ) otherlv_2= 'como promesa cumplida.' )
            {
            // InternalDearCode.g:1313:2: (otherlv_0= 'Y entrego al viento' ( (lv_expresion_1_0= ruleExpression ) ) otherlv_2= 'como promesa cumplida.' )
            // InternalDearCode.g:1314:3: otherlv_0= 'Y entrego al viento' ( (lv_expresion_1_0= ruleExpression ) ) otherlv_2= 'como promesa cumplida.'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getReturnAccess().getYEntregoAlVientoKeyword_0());
            		
            // InternalDearCode.g:1318:3: ( (lv_expresion_1_0= ruleExpression ) )
            // InternalDearCode.g:1319:4: (lv_expresion_1_0= ruleExpression )
            {
            // InternalDearCode.g:1319:4: (lv_expresion_1_0= ruleExpression )
            // InternalDearCode.g:1320:5: lv_expresion_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getReturnAccess().getExpresionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_31);
            lv_expresion_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReturnRule());
            					}
            					set(
            						current,
            						"expresion",
            						lv_expresion_1_0,
            						"edu.upb.lp.DearCode.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,44,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getReturnAccess().getComoPromesaCumplidaKeyword_2());
            		

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
    // $ANTLR end "ruleReturn"


    // $ANTLR start "entryRuleExpression"
    // InternalDearCode.g:1345:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalDearCode.g:1345:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalDearCode.g:1346:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalDearCode.g:1352:1: ruleExpression returns [EObject current=null] : this_OrExpression_0= ruleOrExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:1358:2: (this_OrExpression_0= ruleOrExpression )
            // InternalDearCode.g:1359:2: this_OrExpression_0= ruleOrExpression
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getOrExpressionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;


            		current = this_OrExpression_0;
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


    // $ANTLR start "entryRuleOrExpression"
    // InternalDearCode.g:1370:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalDearCode.g:1370:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalDearCode.g:1371:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
             newCompositeNode(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;

             current =iv_ruleOrExpression; 
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
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalDearCode.g:1377:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= ' o quiz\\u00E1s ' | otherlv_3= ' o quiz\\u00E1s' ) ( (lv_right_4_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:1383:2: ( (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= ' o quiz\\u00E1s ' | otherlv_3= ' o quiz\\u00E1s' ) ( (lv_right_4_0= ruleAndExpression ) ) )* ) )
            // InternalDearCode.g:1384:2: (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= ' o quiz\\u00E1s ' | otherlv_3= ' o quiz\\u00E1s' ) ( (lv_right_4_0= ruleAndExpression ) ) )* )
            {
            // InternalDearCode.g:1384:2: (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= ' o quiz\\u00E1s ' | otherlv_3= ' o quiz\\u00E1s' ) ( (lv_right_4_0= ruleAndExpression ) ) )* )
            // InternalDearCode.g:1385:3: this_AndExpression_0= ruleAndExpression ( () (otherlv_2= ' o quiz\\u00E1s ' | otherlv_3= ' o quiz\\u00E1s' ) ( (lv_right_4_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_32);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;


            			current = this_AndExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDearCode.g:1393:3: ( () (otherlv_2= ' o quiz\\u00E1s ' | otherlv_3= ' o quiz\\u00E1s' ) ( (lv_right_4_0= ruleAndExpression ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=45 && LA24_0<=46)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalDearCode.g:1394:4: () (otherlv_2= ' o quiz\\u00E1s ' | otherlv_3= ' o quiz\\u00E1s' ) ( (lv_right_4_0= ruleAndExpression ) )
            	    {
            	    // InternalDearCode.g:1394:4: ()
            	    // InternalDearCode.g:1395:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDearCode.g:1401:4: (otherlv_2= ' o quiz\\u00E1s ' | otherlv_3= ' o quiz\\u00E1s' )
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==45) ) {
            	        alt23=1;
            	    }
            	    else if ( (LA23_0==46) ) {
            	        alt23=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // InternalDearCode.g:1402:5: otherlv_2= ' o quiz\\u00E1s '
            	            {
            	            otherlv_2=(Token)match(input,45,FOLLOW_9); 

            	            					newLeafNode(otherlv_2, grammarAccess.getOrExpressionAccess().getOQuizSKeyword_1_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalDearCode.g:1407:5: otherlv_3= ' o quiz\\u00E1s'
            	            {
            	            otherlv_3=(Token)match(input,46,FOLLOW_9); 

            	            					newLeafNode(otherlv_3, grammarAccess.getOrExpressionAccess().getOQuizSKeyword_1_1_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalDearCode.g:1412:4: ( (lv_right_4_0= ruleAndExpression ) )
            	    // InternalDearCode.g:1413:5: (lv_right_4_0= ruleAndExpression )
            	    {
            	    // InternalDearCode.g:1413:5: (lv_right_4_0= ruleAndExpression )
            	    // InternalDearCode.g:1414:6: lv_right_4_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_right_4_0=ruleAndExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_4_0,
            	    							"edu.upb.lp.DearCode.AndExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalDearCode.g:1436:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalDearCode.g:1436:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalDearCode.g:1437:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;

             current =iv_ruleAndExpression; 
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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalDearCode.g:1443:1: ruleAndExpression returns [EObject current=null] : (this_EqualityExpression_0= ruleEqualityExpression ( () (otherlv_2= ' y tambi\\u00E9n ' | otherlv_3= ' y tambi\\u00E9n' ) ( (lv_right_4_0= ruleEqualityExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_EqualityExpression_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:1449:2: ( (this_EqualityExpression_0= ruleEqualityExpression ( () (otherlv_2= ' y tambi\\u00E9n ' | otherlv_3= ' y tambi\\u00E9n' ) ( (lv_right_4_0= ruleEqualityExpression ) ) )* ) )
            // InternalDearCode.g:1450:2: (this_EqualityExpression_0= ruleEqualityExpression ( () (otherlv_2= ' y tambi\\u00E9n ' | otherlv_3= ' y tambi\\u00E9n' ) ( (lv_right_4_0= ruleEqualityExpression ) ) )* )
            {
            // InternalDearCode.g:1450:2: (this_EqualityExpression_0= ruleEqualityExpression ( () (otherlv_2= ' y tambi\\u00E9n ' | otherlv_3= ' y tambi\\u00E9n' ) ( (lv_right_4_0= ruleEqualityExpression ) ) )* )
            // InternalDearCode.g:1451:3: this_EqualityExpression_0= ruleEqualityExpression ( () (otherlv_2= ' y tambi\\u00E9n ' | otherlv_3= ' y tambi\\u00E9n' ) ( (lv_right_4_0= ruleEqualityExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_33);
            this_EqualityExpression_0=ruleEqualityExpression();

            state._fsp--;


            			current = this_EqualityExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDearCode.g:1459:3: ( () (otherlv_2= ' y tambi\\u00E9n ' | otherlv_3= ' y tambi\\u00E9n' ) ( (lv_right_4_0= ruleEqualityExpression ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=47 && LA26_0<=48)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalDearCode.g:1460:4: () (otherlv_2= ' y tambi\\u00E9n ' | otherlv_3= ' y tambi\\u00E9n' ) ( (lv_right_4_0= ruleEqualityExpression ) )
            	    {
            	    // InternalDearCode.g:1460:4: ()
            	    // InternalDearCode.g:1461:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDearCode.g:1467:4: (otherlv_2= ' y tambi\\u00E9n ' | otherlv_3= ' y tambi\\u00E9n' )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==47) ) {
            	        alt25=1;
            	    }
            	    else if ( (LA25_0==48) ) {
            	        alt25=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // InternalDearCode.g:1468:5: otherlv_2= ' y tambi\\u00E9n '
            	            {
            	            otherlv_2=(Token)match(input,47,FOLLOW_9); 

            	            					newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getYTambiNKeyword_1_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalDearCode.g:1473:5: otherlv_3= ' y tambi\\u00E9n'
            	            {
            	            otherlv_3=(Token)match(input,48,FOLLOW_9); 

            	            					newLeafNode(otherlv_3, grammarAccess.getAndExpressionAccess().getYTambiNKeyword_1_1_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalDearCode.g:1478:4: ( (lv_right_4_0= ruleEqualityExpression ) )
            	    // InternalDearCode.g:1479:5: (lv_right_4_0= ruleEqualityExpression )
            	    {
            	    // InternalDearCode.g:1479:5: (lv_right_4_0= ruleEqualityExpression )
            	    // InternalDearCode.g:1480:6: lv_right_4_0= ruleEqualityExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightEqualityExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    lv_right_4_0=ruleEqualityExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_4_0,
            	    							"edu.upb.lp.DearCode.EqualityExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleEqualityExpression"
    // InternalDearCode.g:1502:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // InternalDearCode.g:1502:59: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // InternalDearCode.g:1503:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
            {
             newCompositeNode(grammarAccess.getEqualityExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEqualityExpression=ruleEqualityExpression();

            state._fsp--;

             current =iv_ruleEqualityExpression; 
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
    // $ANTLR end "entryRuleEqualityExpression"


    // $ANTLR start "ruleEqualityExpression"
    // InternalDearCode.g:1509:1: ruleEqualityExpression returns [EObject current=null] : (this_RelationalExpression_0= ruleRelationalExpression ( () ( ( (lv_op_2_1= 'late al un\\u00EDsono con' | lv_op_2_2= 'canta con un matiz distinto a' ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_RelationalExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:1515:2: ( (this_RelationalExpression_0= ruleRelationalExpression ( () ( ( (lv_op_2_1= 'late al un\\u00EDsono con' | lv_op_2_2= 'canta con un matiz distinto a' ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* ) )
            // InternalDearCode.g:1516:2: (this_RelationalExpression_0= ruleRelationalExpression ( () ( ( (lv_op_2_1= 'late al un\\u00EDsono con' | lv_op_2_2= 'canta con un matiz distinto a' ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* )
            {
            // InternalDearCode.g:1516:2: (this_RelationalExpression_0= ruleRelationalExpression ( () ( ( (lv_op_2_1= 'late al un\\u00EDsono con' | lv_op_2_2= 'canta con un matiz distinto a' ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* )
            // InternalDearCode.g:1517:3: this_RelationalExpression_0= ruleRelationalExpression ( () ( ( (lv_op_2_1= 'late al un\\u00EDsono con' | lv_op_2_2= 'canta con un matiz distinto a' ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRelationalExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_34);
            this_RelationalExpression_0=ruleRelationalExpression();

            state._fsp--;


            			current = this_RelationalExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDearCode.g:1525:3: ( () ( ( (lv_op_2_1= 'late al un\\u00EDsono con' | lv_op_2_2= 'canta con un matiz distinto a' ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=49 && LA28_0<=50)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalDearCode.g:1526:4: () ( ( (lv_op_2_1= 'late al un\\u00EDsono con' | lv_op_2_2= 'canta con un matiz distinto a' ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) )
            	    {
            	    // InternalDearCode.g:1526:4: ()
            	    // InternalDearCode.g:1527:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDearCode.g:1533:4: ( ( (lv_op_2_1= 'late al un\\u00EDsono con' | lv_op_2_2= 'canta con un matiz distinto a' ) ) )
            	    // InternalDearCode.g:1534:5: ( (lv_op_2_1= 'late al un\\u00EDsono con' | lv_op_2_2= 'canta con un matiz distinto a' ) )
            	    {
            	    // InternalDearCode.g:1534:5: ( (lv_op_2_1= 'late al un\\u00EDsono con' | lv_op_2_2= 'canta con un matiz distinto a' ) )
            	    // InternalDearCode.g:1535:6: (lv_op_2_1= 'late al un\\u00EDsono con' | lv_op_2_2= 'canta con un matiz distinto a' )
            	    {
            	    // InternalDearCode.g:1535:6: (lv_op_2_1= 'late al un\\u00EDsono con' | lv_op_2_2= 'canta con un matiz distinto a' )
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==49) ) {
            	        alt27=1;
            	    }
            	    else if ( (LA27_0==50) ) {
            	        alt27=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // InternalDearCode.g:1536:7: lv_op_2_1= 'late al un\\u00EDsono con'
            	            {
            	            lv_op_2_1=(Token)match(input,49,FOLLOW_9); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getEqualityExpressionAccess().getOpLateAlUnSonoConKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalDearCode.g:1547:7: lv_op_2_2= 'canta con un matiz distinto a'
            	            {
            	            lv_op_2_2=(Token)match(input,50,FOLLOW_9); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getEqualityExpressionAccess().getOpCantaConUnMatizDistintoAKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalDearCode.g:1560:4: ( (lv_right_3_0= ruleRelationalExpression ) )
            	    // InternalDearCode.g:1561:5: (lv_right_3_0= ruleRelationalExpression )
            	    {
            	    // InternalDearCode.g:1561:5: (lv_right_3_0= ruleRelationalExpression )
            	    // InternalDearCode.g:1562:6: lv_right_3_0= ruleRelationalExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRightRelationalExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_34);
            	    lv_right_3_0=ruleRelationalExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"edu.upb.lp.DearCode.RelationalExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // $ANTLR end "ruleEqualityExpression"


    // $ANTLR start "entryRuleRelationalExpression"
    // InternalDearCode.g:1584:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // InternalDearCode.g:1584:61: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // InternalDearCode.g:1585:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
             newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;

             current =iv_ruleRelationalExpression; 
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
    // $ANTLR end "entryRuleRelationalExpression"


    // $ANTLR start "ruleRelationalExpression"
    // InternalDearCode.g:1591:1: ruleRelationalExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( ( (lv_op_2_1= 'susurra con menos fuerza que' | lv_op_2_2= 'casi suspira al mismo nivel que' | lv_op_2_3= 'arde con m\\u00E1s pasi\\u00F3n que' | lv_op_2_4= 'rodea con tanta fuerza como' ) ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* ) ;
    public final EObject ruleRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_AdditiveExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:1597:2: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( ( (lv_op_2_1= 'susurra con menos fuerza que' | lv_op_2_2= 'casi suspira al mismo nivel que' | lv_op_2_3= 'arde con m\\u00E1s pasi\\u00F3n que' | lv_op_2_4= 'rodea con tanta fuerza como' ) ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* ) )
            // InternalDearCode.g:1598:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( ( (lv_op_2_1= 'susurra con menos fuerza que' | lv_op_2_2= 'casi suspira al mismo nivel que' | lv_op_2_3= 'arde con m\\u00E1s pasi\\u00F3n que' | lv_op_2_4= 'rodea con tanta fuerza como' ) ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* )
            {
            // InternalDearCode.g:1598:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( ( (lv_op_2_1= 'susurra con menos fuerza que' | lv_op_2_2= 'casi suspira al mismo nivel que' | lv_op_2_3= 'arde con m\\u00E1s pasi\\u00F3n que' | lv_op_2_4= 'rodea con tanta fuerza como' ) ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* )
            // InternalDearCode.g:1599:3: this_AdditiveExpression_0= ruleAdditiveExpression ( () ( ( (lv_op_2_1= 'susurra con menos fuerza que' | lv_op_2_2= 'casi suspira al mismo nivel que' | lv_op_2_3= 'arde con m\\u00E1s pasi\\u00F3n que' | lv_op_2_4= 'rodea con tanta fuerza como' ) ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getRelationalExpressionAccess().getAdditiveExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_35);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;


            			current = this_AdditiveExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDearCode.g:1607:3: ( () ( ( (lv_op_2_1= 'susurra con menos fuerza que' | lv_op_2_2= 'casi suspira al mismo nivel que' | lv_op_2_3= 'arde con m\\u00E1s pasi\\u00F3n que' | lv_op_2_4= 'rodea con tanta fuerza como' ) ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=51 && LA30_0<=54)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalDearCode.g:1608:4: () ( ( (lv_op_2_1= 'susurra con menos fuerza que' | lv_op_2_2= 'casi suspira al mismo nivel que' | lv_op_2_3= 'arde con m\\u00E1s pasi\\u00F3n que' | lv_op_2_4= 'rodea con tanta fuerza como' ) ) ) ( (lv_right_3_0= ruleAdditiveExpression ) )
            	    {
            	    // InternalDearCode.g:1608:4: ()
            	    // InternalDearCode.g:1609:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDearCode.g:1615:4: ( ( (lv_op_2_1= 'susurra con menos fuerza que' | lv_op_2_2= 'casi suspira al mismo nivel que' | lv_op_2_3= 'arde con m\\u00E1s pasi\\u00F3n que' | lv_op_2_4= 'rodea con tanta fuerza como' ) ) )
            	    // InternalDearCode.g:1616:5: ( (lv_op_2_1= 'susurra con menos fuerza que' | lv_op_2_2= 'casi suspira al mismo nivel que' | lv_op_2_3= 'arde con m\\u00E1s pasi\\u00F3n que' | lv_op_2_4= 'rodea con tanta fuerza como' ) )
            	    {
            	    // InternalDearCode.g:1616:5: ( (lv_op_2_1= 'susurra con menos fuerza que' | lv_op_2_2= 'casi suspira al mismo nivel que' | lv_op_2_3= 'arde con m\\u00E1s pasi\\u00F3n que' | lv_op_2_4= 'rodea con tanta fuerza como' ) )
            	    // InternalDearCode.g:1617:6: (lv_op_2_1= 'susurra con menos fuerza que' | lv_op_2_2= 'casi suspira al mismo nivel que' | lv_op_2_3= 'arde con m\\u00E1s pasi\\u00F3n que' | lv_op_2_4= 'rodea con tanta fuerza como' )
            	    {
            	    // InternalDearCode.g:1617:6: (lv_op_2_1= 'susurra con menos fuerza que' | lv_op_2_2= 'casi suspira al mismo nivel que' | lv_op_2_3= 'arde con m\\u00E1s pasi\\u00F3n que' | lv_op_2_4= 'rodea con tanta fuerza como' )
            	    int alt29=4;
            	    switch ( input.LA(1) ) {
            	    case 51:
            	        {
            	        alt29=1;
            	        }
            	        break;
            	    case 52:
            	        {
            	        alt29=2;
            	        }
            	        break;
            	    case 53:
            	        {
            	        alt29=3;
            	        }
            	        break;
            	    case 54:
            	        {
            	        alt29=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt29) {
            	        case 1 :
            	            // InternalDearCode.g:1618:7: lv_op_2_1= 'susurra con menos fuerza que'
            	            {
            	            lv_op_2_1=(Token)match(input,51,FOLLOW_9); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getRelationalExpressionAccess().getOpSusurraConMenosFuerzaQueKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalDearCode.g:1629:7: lv_op_2_2= 'casi suspira al mismo nivel que'
            	            {
            	            lv_op_2_2=(Token)match(input,52,FOLLOW_9); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getRelationalExpressionAccess().getOpCasiSuspiraAlMismoNivelQueKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalDearCode.g:1640:7: lv_op_2_3= 'arde con m\\u00E1s pasi\\u00F3n que'
            	            {
            	            lv_op_2_3=(Token)match(input,53,FOLLOW_9); 

            	            							newLeafNode(lv_op_2_3, grammarAccess.getRelationalExpressionAccess().getOpArdeConMSPasiNQueKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalDearCode.g:1651:7: lv_op_2_4= 'rodea con tanta fuerza como'
            	            {
            	            lv_op_2_4=(Token)match(input,54,FOLLOW_9); 

            	            							newLeafNode(lv_op_2_4, grammarAccess.getRelationalExpressionAccess().getOpRodeaConTantaFuerzaComoKeyword_1_1_0_3());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_4, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalDearCode.g:1664:4: ( (lv_right_3_0= ruleAdditiveExpression ) )
            	    // InternalDearCode.g:1665:5: (lv_right_3_0= ruleAdditiveExpression )
            	    {
            	    // InternalDearCode.g:1665:5: (lv_right_3_0= ruleAdditiveExpression )
            	    // InternalDearCode.g:1666:6: lv_right_3_0= ruleAdditiveExpression
            	    {

            	    						newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightAdditiveExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_35);
            	    lv_right_3_0=ruleAdditiveExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"edu.upb.lp.DearCode.AdditiveExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleAdditiveExpression"
    // InternalDearCode.g:1688:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // InternalDearCode.g:1688:59: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalDearCode.g:1689:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
             newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;

             current =iv_ruleAdditiveExpression; 
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
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // InternalDearCode.g:1695:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_op_2_1= 'unidos en un solo suspiro con' | lv_op_2_2= 'fundidos en la llama de' ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_MultiplicativeExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:1701:2: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_op_2_1= 'unidos en un solo suspiro con' | lv_op_2_2= 'fundidos en la llama de' ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // InternalDearCode.g:1702:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_op_2_1= 'unidos en un solo suspiro con' | lv_op_2_2= 'fundidos en la llama de' ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // InternalDearCode.g:1702:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_op_2_1= 'unidos en un solo suspiro con' | lv_op_2_2= 'fundidos en la llama de' ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // InternalDearCode.g:1703:3: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_op_2_1= 'unidos en un solo suspiro con' | lv_op_2_2= 'fundidos en la llama de' ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_36);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;


            			current = this_MultiplicativeExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDearCode.g:1711:3: ( () ( ( (lv_op_2_1= 'unidos en un solo suspiro con' | lv_op_2_2= 'fundidos en la llama de' ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=55 && LA32_0<=56)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalDearCode.g:1712:4: () ( ( (lv_op_2_1= 'unidos en un solo suspiro con' | lv_op_2_2= 'fundidos en la llama de' ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // InternalDearCode.g:1712:4: ()
            	    // InternalDearCode.g:1713:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDearCode.g:1719:4: ( ( (lv_op_2_1= 'unidos en un solo suspiro con' | lv_op_2_2= 'fundidos en la llama de' ) ) )
            	    // InternalDearCode.g:1720:5: ( (lv_op_2_1= 'unidos en un solo suspiro con' | lv_op_2_2= 'fundidos en la llama de' ) )
            	    {
            	    // InternalDearCode.g:1720:5: ( (lv_op_2_1= 'unidos en un solo suspiro con' | lv_op_2_2= 'fundidos en la llama de' ) )
            	    // InternalDearCode.g:1721:6: (lv_op_2_1= 'unidos en un solo suspiro con' | lv_op_2_2= 'fundidos en la llama de' )
            	    {
            	    // InternalDearCode.g:1721:6: (lv_op_2_1= 'unidos en un solo suspiro con' | lv_op_2_2= 'fundidos en la llama de' )
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==55) ) {
            	        alt31=1;
            	    }
            	    else if ( (LA31_0==56) ) {
            	        alt31=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 31, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // InternalDearCode.g:1722:7: lv_op_2_1= 'unidos en un solo suspiro con'
            	            {
            	            lv_op_2_1=(Token)match(input,55,FOLLOW_9); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getAdditiveExpressionAccess().getOpUnidosEnUnSoloSuspiroConKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditiveExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalDearCode.g:1733:7: lv_op_2_2= 'fundidos en la llama de'
            	            {
            	            lv_op_2_2=(Token)match(input,56,FOLLOW_9); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getAdditiveExpressionAccess().getOpFundidosEnLaLlamaDeKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditiveExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalDearCode.g:1746:4: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // InternalDearCode.g:1747:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // InternalDearCode.g:1747:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // InternalDearCode.g:1748:6: lv_right_3_0= ruleMultiplicativeExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_36);
            	    lv_right_3_0=ruleMultiplicativeExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"edu.upb.lp.DearCode.MultiplicativeExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // InternalDearCode.g:1770:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalDearCode.g:1770:65: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalDearCode.g:1771:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
             newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;

             current =iv_ruleMultiplicativeExpression; 
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
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // InternalDearCode.g:1777:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( (lv_op_2_1= 'fortalecidos por el fuego de' | lv_op_2_2= 'separados entre los ecos de' | lv_op_2_3= 'resuena con el eco de' ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        EObject this_UnaryExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:1783:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( (lv_op_2_1= 'fortalecidos por el fuego de' | lv_op_2_2= 'separados entre los ecos de' | lv_op_2_3= 'resuena con el eco de' ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* ) )
            // InternalDearCode.g:1784:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( (lv_op_2_1= 'fortalecidos por el fuego de' | lv_op_2_2= 'separados entre los ecos de' | lv_op_2_3= 'resuena con el eco de' ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* )
            {
            // InternalDearCode.g:1784:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( (lv_op_2_1= 'fortalecidos por el fuego de' | lv_op_2_2= 'separados entre los ecos de' | lv_op_2_3= 'resuena con el eco de' ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* )
            // InternalDearCode.g:1785:3: this_UnaryExpression_0= ruleUnaryExpression ( () ( ( (lv_op_2_1= 'fortalecidos por el fuego de' | lv_op_2_2= 'separados entre los ecos de' | lv_op_2_3= 'resuena con el eco de' ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getUnaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_37);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;


            			current = this_UnaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDearCode.g:1793:3: ( () ( ( (lv_op_2_1= 'fortalecidos por el fuego de' | lv_op_2_2= 'separados entre los ecos de' | lv_op_2_3= 'resuena con el eco de' ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=57 && LA34_0<=59)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalDearCode.g:1794:4: () ( ( (lv_op_2_1= 'fortalecidos por el fuego de' | lv_op_2_2= 'separados entre los ecos de' | lv_op_2_3= 'resuena con el eco de' ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) )
            	    {
            	    // InternalDearCode.g:1794:4: ()
            	    // InternalDearCode.g:1795:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDearCode.g:1801:4: ( ( (lv_op_2_1= 'fortalecidos por el fuego de' | lv_op_2_2= 'separados entre los ecos de' | lv_op_2_3= 'resuena con el eco de' ) ) )
            	    // InternalDearCode.g:1802:5: ( (lv_op_2_1= 'fortalecidos por el fuego de' | lv_op_2_2= 'separados entre los ecos de' | lv_op_2_3= 'resuena con el eco de' ) )
            	    {
            	    // InternalDearCode.g:1802:5: ( (lv_op_2_1= 'fortalecidos por el fuego de' | lv_op_2_2= 'separados entre los ecos de' | lv_op_2_3= 'resuena con el eco de' ) )
            	    // InternalDearCode.g:1803:6: (lv_op_2_1= 'fortalecidos por el fuego de' | lv_op_2_2= 'separados entre los ecos de' | lv_op_2_3= 'resuena con el eco de' )
            	    {
            	    // InternalDearCode.g:1803:6: (lv_op_2_1= 'fortalecidos por el fuego de' | lv_op_2_2= 'separados entre los ecos de' | lv_op_2_3= 'resuena con el eco de' )
            	    int alt33=3;
            	    switch ( input.LA(1) ) {
            	    case 57:
            	        {
            	        alt33=1;
            	        }
            	        break;
            	    case 58:
            	        {
            	        alt33=2;
            	        }
            	        break;
            	    case 59:
            	        {
            	        alt33=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 33, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt33) {
            	        case 1 :
            	            // InternalDearCode.g:1804:7: lv_op_2_1= 'fortalecidos por el fuego de'
            	            {
            	            lv_op_2_1=(Token)match(input,57,FOLLOW_9); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getMultiplicativeExpressionAccess().getOpFortalecidosPorElFuegoDeKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicativeExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalDearCode.g:1815:7: lv_op_2_2= 'separados entre los ecos de'
            	            {
            	            lv_op_2_2=(Token)match(input,58,FOLLOW_9); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getMultiplicativeExpressionAccess().getOpSeparadosEntreLosEcosDeKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicativeExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalDearCode.g:1826:7: lv_op_2_3= 'resuena con el eco de'
            	            {
            	            lv_op_2_3=(Token)match(input,59,FOLLOW_9); 

            	            							newLeafNode(lv_op_2_3, grammarAccess.getMultiplicativeExpressionAccess().getOpResuenaConElEcoDeKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicativeExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalDearCode.g:1839:4: ( (lv_right_3_0= ruleUnaryExpression ) )
            	    // InternalDearCode.g:1840:5: (lv_right_3_0= ruleUnaryExpression )
            	    {
            	    // InternalDearCode.g:1840:5: (lv_right_3_0= ruleUnaryExpression )
            	    // InternalDearCode.g:1841:6: lv_right_3_0= ruleUnaryExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightUnaryExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_37);
            	    lv_right_3_0=ruleUnaryExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"edu.upb.lp.DearCode.UnaryExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalDearCode.g:1863:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalDearCode.g:1863:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalDearCode.g:1864:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
             newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;

             current =iv_ruleUnaryExpression; 
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
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // InternalDearCode.g:1870:1: ruleUnaryExpression returns [EObject current=null] : ( ( () ( (lv_op_1_0= 'no creo que' ) ) ( (lv_expression_2_0= ruleUnaryExpression ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_0=null;
        EObject lv_expression_2_0 = null;

        EObject this_PrimaryExpression_3 = null;



        	enterRule();

        try {
            // InternalDearCode.g:1876:2: ( ( ( () ( (lv_op_1_0= 'no creo que' ) ) ( (lv_expression_2_0= ruleUnaryExpression ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression ) )
            // InternalDearCode.g:1877:2: ( ( () ( (lv_op_1_0= 'no creo que' ) ) ( (lv_expression_2_0= ruleUnaryExpression ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression )
            {
            // InternalDearCode.g:1877:2: ( ( () ( (lv_op_1_0= 'no creo que' ) ) ( (lv_expression_2_0= ruleUnaryExpression ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==60) ) {
                alt35=1;
            }
            else if ( ((LA35_0>=RULE_ID && LA35_0<=RULE_STRING)||LA35_0==61||(LA35_0>=63 && LA35_0<=65)) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalDearCode.g:1878:3: ( () ( (lv_op_1_0= 'no creo que' ) ) ( (lv_expression_2_0= ruleUnaryExpression ) ) )
                    {
                    // InternalDearCode.g:1878:3: ( () ( (lv_op_1_0= 'no creo que' ) ) ( (lv_expression_2_0= ruleUnaryExpression ) ) )
                    // InternalDearCode.g:1879:4: () ( (lv_op_1_0= 'no creo que' ) ) ( (lv_expression_2_0= ruleUnaryExpression ) )
                    {
                    // InternalDearCode.g:1879:4: ()
                    // InternalDearCode.g:1880:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryExpressionAccess().getUnaryExpressionAction_0_0(),
                    						current);
                    				

                    }

                    // InternalDearCode.g:1886:4: ( (lv_op_1_0= 'no creo que' ) )
                    // InternalDearCode.g:1887:5: (lv_op_1_0= 'no creo que' )
                    {
                    // InternalDearCode.g:1887:5: (lv_op_1_0= 'no creo que' )
                    // InternalDearCode.g:1888:6: lv_op_1_0= 'no creo que'
                    {
                    lv_op_1_0=(Token)match(input,60,FOLLOW_9); 

                    						newLeafNode(lv_op_1_0, grammarAccess.getUnaryExpressionAccess().getOpNoCreoQueKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUnaryExpressionRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_1_0, "no creo que");
                    					

                    }


                    }

                    // InternalDearCode.g:1900:4: ( (lv_expression_2_0= ruleUnaryExpression ) )
                    // InternalDearCode.g:1901:5: (lv_expression_2_0= ruleUnaryExpression )
                    {
                    // InternalDearCode.g:1901:5: (lv_expression_2_0= ruleUnaryExpression )
                    // InternalDearCode.g:1902:6: lv_expression_2_0= ruleUnaryExpression
                    {

                    						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getExpressionUnaryExpressionParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_2_0=ruleUnaryExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_2_0,
                    							"edu.upb.lp.DearCode.UnaryExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDearCode.g:1921:3: this_PrimaryExpression_3= rulePrimaryExpression
                    {

                    			newCompositeNode(grammarAccess.getUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimaryExpression_3=rulePrimaryExpression();

                    state._fsp--;


                    			current = this_PrimaryExpression_3;
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
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalDearCode.g:1933:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalDearCode.g:1933:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalDearCode.g:1934:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalDearCode.g:1940:1: rulePrimaryExpression returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_valueInt_4_0= RULE_INT ) ) ) | ( () ( (lv_valueString_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_valueBoolean_8_1= 'siempre' | lv_valueBoolean_8_2= 'jam\\u00E1s' ) ) ) ) | ( () ( (lv_name_10_0= RULE_ID ) ) ) | this_FunctionCall_11= ruleFunctionCall ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_valueInt_4_0=null;
        Token lv_valueString_6_0=null;
        Token lv_valueBoolean_8_1=null;
        Token lv_valueBoolean_8_2=null;
        Token lv_name_10_0=null;
        EObject this_Expression_1 = null;

        EObject this_FunctionCall_11 = null;



        	enterRule();

        try {
            // InternalDearCode.g:1946:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_valueInt_4_0= RULE_INT ) ) ) | ( () ( (lv_valueString_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_valueBoolean_8_1= 'siempre' | lv_valueBoolean_8_2= 'jam\\u00E1s' ) ) ) ) | ( () ( (lv_name_10_0= RULE_ID ) ) ) | this_FunctionCall_11= ruleFunctionCall ) )
            // InternalDearCode.g:1947:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_valueInt_4_0= RULE_INT ) ) ) | ( () ( (lv_valueString_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_valueBoolean_8_1= 'siempre' | lv_valueBoolean_8_2= 'jam\\u00E1s' ) ) ) ) | ( () ( (lv_name_10_0= RULE_ID ) ) ) | this_FunctionCall_11= ruleFunctionCall )
            {
            // InternalDearCode.g:1947:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_valueInt_4_0= RULE_INT ) ) ) | ( () ( (lv_valueString_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_valueBoolean_8_1= 'siempre' | lv_valueBoolean_8_2= 'jam\\u00E1s' ) ) ) ) | ( () ( (lv_name_10_0= RULE_ID ) ) ) | this_FunctionCall_11= ruleFunctionCall )
            int alt37=6;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt37=1;
                }
                break;
            case RULE_INT:
                {
                alt37=2;
                }
                break;
            case RULE_STRING:
                {
                alt37=3;
                }
                break;
            case 63:
            case 64:
                {
                alt37=4;
                }
                break;
            case RULE_ID:
                {
                alt37=5;
                }
                break;
            case 65:
                {
                alt37=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalDearCode.g:1948:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalDearCode.g:1948:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalDearCode.g:1949:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,61,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_38);
                    this_Expression_1=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,62,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDearCode.g:1967:3: ( () ( (lv_valueInt_4_0= RULE_INT ) ) )
                    {
                    // InternalDearCode.g:1967:3: ( () ( (lv_valueInt_4_0= RULE_INT ) ) )
                    // InternalDearCode.g:1968:4: () ( (lv_valueInt_4_0= RULE_INT ) )
                    {
                    // InternalDearCode.g:1968:4: ()
                    // InternalDearCode.g:1969:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getNumberLiteralAction_1_0(),
                    						current);
                    				

                    }

                    // InternalDearCode.g:1975:4: ( (lv_valueInt_4_0= RULE_INT ) )
                    // InternalDearCode.g:1976:5: (lv_valueInt_4_0= RULE_INT )
                    {
                    // InternalDearCode.g:1976:5: (lv_valueInt_4_0= RULE_INT )
                    // InternalDearCode.g:1977:6: lv_valueInt_4_0= RULE_INT
                    {
                    lv_valueInt_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_valueInt_4_0, grammarAccess.getPrimaryExpressionAccess().getValueIntINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"valueInt",
                    							lv_valueInt_4_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDearCode.g:1995:3: ( () ( (lv_valueString_6_0= RULE_STRING ) ) )
                    {
                    // InternalDearCode.g:1995:3: ( () ( (lv_valueString_6_0= RULE_STRING ) ) )
                    // InternalDearCode.g:1996:4: () ( (lv_valueString_6_0= RULE_STRING ) )
                    {
                    // InternalDearCode.g:1996:4: ()
                    // InternalDearCode.g:1997:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getStringLiteralAction_2_0(),
                    						current);
                    				

                    }

                    // InternalDearCode.g:2003:4: ( (lv_valueString_6_0= RULE_STRING ) )
                    // InternalDearCode.g:2004:5: (lv_valueString_6_0= RULE_STRING )
                    {
                    // InternalDearCode.g:2004:5: (lv_valueString_6_0= RULE_STRING )
                    // InternalDearCode.g:2005:6: lv_valueString_6_0= RULE_STRING
                    {
                    lv_valueString_6_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_valueString_6_0, grammarAccess.getPrimaryExpressionAccess().getValueStringSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"valueString",
                    							lv_valueString_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDearCode.g:2023:3: ( () ( ( (lv_valueBoolean_8_1= 'siempre' | lv_valueBoolean_8_2= 'jam\\u00E1s' ) ) ) )
                    {
                    // InternalDearCode.g:2023:3: ( () ( ( (lv_valueBoolean_8_1= 'siempre' | lv_valueBoolean_8_2= 'jam\\u00E1s' ) ) ) )
                    // InternalDearCode.g:2024:4: () ( ( (lv_valueBoolean_8_1= 'siempre' | lv_valueBoolean_8_2= 'jam\\u00E1s' ) ) )
                    {
                    // InternalDearCode.g:2024:4: ()
                    // InternalDearCode.g:2025:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getBooleanLiteralAction_3_0(),
                    						current);
                    				

                    }

                    // InternalDearCode.g:2031:4: ( ( (lv_valueBoolean_8_1= 'siempre' | lv_valueBoolean_8_2= 'jam\\u00E1s' ) ) )
                    // InternalDearCode.g:2032:5: ( (lv_valueBoolean_8_1= 'siempre' | lv_valueBoolean_8_2= 'jam\\u00E1s' ) )
                    {
                    // InternalDearCode.g:2032:5: ( (lv_valueBoolean_8_1= 'siempre' | lv_valueBoolean_8_2= 'jam\\u00E1s' ) )
                    // InternalDearCode.g:2033:6: (lv_valueBoolean_8_1= 'siempre' | lv_valueBoolean_8_2= 'jam\\u00E1s' )
                    {
                    // InternalDearCode.g:2033:6: (lv_valueBoolean_8_1= 'siempre' | lv_valueBoolean_8_2= 'jam\\u00E1s' )
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
                            // InternalDearCode.g:2034:7: lv_valueBoolean_8_1= 'siempre'
                            {
                            lv_valueBoolean_8_1=(Token)match(input,63,FOLLOW_2); 

                            							newLeafNode(lv_valueBoolean_8_1, grammarAccess.getPrimaryExpressionAccess().getValueBooleanSiempreKeyword_3_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                            							}
                            							setWithLastConsumed(current, "valueBoolean", lv_valueBoolean_8_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalDearCode.g:2045:7: lv_valueBoolean_8_2= 'jam\\u00E1s'
                            {
                            lv_valueBoolean_8_2=(Token)match(input,64,FOLLOW_2); 

                            							newLeafNode(lv_valueBoolean_8_2, grammarAccess.getPrimaryExpressionAccess().getValueBooleanJamSKeyword_3_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                            							}
                            							setWithLastConsumed(current, "valueBoolean", lv_valueBoolean_8_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalDearCode.g:2060:3: ( () ( (lv_name_10_0= RULE_ID ) ) )
                    {
                    // InternalDearCode.g:2060:3: ( () ( (lv_name_10_0= RULE_ID ) ) )
                    // InternalDearCode.g:2061:4: () ( (lv_name_10_0= RULE_ID ) )
                    {
                    // InternalDearCode.g:2061:4: ()
                    // InternalDearCode.g:2062:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getVariableReferenceAction_4_0(),
                    						current);
                    				

                    }

                    // InternalDearCode.g:2068:4: ( (lv_name_10_0= RULE_ID ) )
                    // InternalDearCode.g:2069:5: (lv_name_10_0= RULE_ID )
                    {
                    // InternalDearCode.g:2069:5: (lv_name_10_0= RULE_ID )
                    // InternalDearCode.g:2070:6: lv_name_10_0= RULE_ID
                    {
                    lv_name_10_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_name_10_0, grammarAccess.getPrimaryExpressionAccess().getNameIDTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_10_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalDearCode.g:2088:3: this_FunctionCall_11= ruleFunctionCall
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFunctionCallParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunctionCall_11=ruleFunctionCall();

                    state._fsp--;


                    			current = this_FunctionCall_11;
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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalDearCode.g:2100:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalDearCode.g:2100:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalDearCode.g:2101:2: iv_ruleFunctionCall= ruleFunctionCall EOF
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
    // InternalDearCode.g:2107:1: ruleFunctionCall returns [EObject current=null] : ( () otherlv_1= 'invoco a' ( (otherlv_2= RULE_ID ) ) ( (lv_comentario_3_0= ruleComment ) )? (otherlv_4= 'con los regalos' ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= 'y' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= 'en mi coraz\\u00F3n' ) ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_comentario_3_0 = null;

        EObject lv_args_5_0 = null;

        EObject lv_args_7_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:2113:2: ( ( () otherlv_1= 'invoco a' ( (otherlv_2= RULE_ID ) ) ( (lv_comentario_3_0= ruleComment ) )? (otherlv_4= 'con los regalos' ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= 'y' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= 'en mi coraz\\u00F3n' ) ) )
            // InternalDearCode.g:2114:2: ( () otherlv_1= 'invoco a' ( (otherlv_2= RULE_ID ) ) ( (lv_comentario_3_0= ruleComment ) )? (otherlv_4= 'con los regalos' ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= 'y' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= 'en mi coraz\\u00F3n' ) )
            {
            // InternalDearCode.g:2114:2: ( () otherlv_1= 'invoco a' ( (otherlv_2= RULE_ID ) ) ( (lv_comentario_3_0= ruleComment ) )? (otherlv_4= 'con los regalos' ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= 'y' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= 'en mi coraz\\u00F3n' ) )
            // InternalDearCode.g:2115:3: () otherlv_1= 'invoco a' ( (otherlv_2= RULE_ID ) ) ( (lv_comentario_3_0= ruleComment ) )? (otherlv_4= 'con los regalos' ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= 'y' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= 'en mi coraz\\u00F3n' )
            {
            // InternalDearCode.g:2115:3: ()
            // InternalDearCode.g:2116:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFunctionCallAccess().getFunctionCallAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,65,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getInvocoAKeyword_1());
            		
            // InternalDearCode.g:2126:3: ( (otherlv_2= RULE_ID ) )
            // InternalDearCode.g:2127:4: (otherlv_2= RULE_ID )
            {
            // InternalDearCode.g:2127:4: (otherlv_2= RULE_ID )
            // InternalDearCode.g:2128:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionCallRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_39); 

            					newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getNameFuncionMI_IDCrossReference_2_0());
            				

            }


            }

            // InternalDearCode.g:2139:3: ( (lv_comentario_3_0= ruleComment ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ANYTEXT) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDearCode.g:2140:4: (lv_comentario_3_0= ruleComment )
                    {
                    // InternalDearCode.g:2140:4: (lv_comentario_3_0= ruleComment )
                    // InternalDearCode.g:2141:5: lv_comentario_3_0= ruleComment
                    {

                    					newCompositeNode(grammarAccess.getFunctionCallAccess().getComentarioCommentParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_40);
                    lv_comentario_3_0=ruleComment();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    					}
                    					set(
                    						current,
                    						"comentario",
                    						lv_comentario_3_0,
                    						"edu.upb.lp.DearCode.Comment");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDearCode.g:2158:3: (otherlv_4= 'con los regalos' ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= 'y' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= 'en mi coraz\\u00F3n' )
            // InternalDearCode.g:2159:4: otherlv_4= 'con los regalos' ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= 'y' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= 'en mi coraz\\u00F3n'
            {
            otherlv_4=(Token)match(input,66,FOLLOW_41); 

            				newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getConLosRegalosKeyword_4_0());
            			
            // InternalDearCode.g:2163:4: ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= 'y' ( (lv_args_7_0= ruleExpression ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_ID && LA40_0<=RULE_STRING)||(LA40_0>=60 && LA40_0<=61)||(LA40_0>=63 && LA40_0<=65)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalDearCode.g:2164:5: ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= 'y' ( (lv_args_7_0= ruleExpression ) ) )*
                    {
                    // InternalDearCode.g:2164:5: ( (lv_args_5_0= ruleExpression ) )
                    // InternalDearCode.g:2165:6: (lv_args_5_0= ruleExpression )
                    {
                    // InternalDearCode.g:2165:6: (lv_args_5_0= ruleExpression )
                    // InternalDearCode.g:2166:7: lv_args_5_0= ruleExpression
                    {

                    							newCompositeNode(grammarAccess.getFunctionCallAccess().getArgsExpressionParserRuleCall_4_1_0_0());
                    						
                    pushFollow(FOLLOW_42);
                    lv_args_5_0=ruleExpression();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    							}
                    							add(
                    								current,
                    								"args",
                    								lv_args_5_0,
                    								"edu.upb.lp.DearCode.Expression");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalDearCode.g:2183:5: (otherlv_6= 'y' ( (lv_args_7_0= ruleExpression ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==67) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalDearCode.g:2184:6: otherlv_6= 'y' ( (lv_args_7_0= ruleExpression ) )
                    	    {
                    	    otherlv_6=(Token)match(input,67,FOLLOW_9); 

                    	    						newLeafNode(otherlv_6, grammarAccess.getFunctionCallAccess().getYKeyword_4_1_1_0());
                    	    					
                    	    // InternalDearCode.g:2188:6: ( (lv_args_7_0= ruleExpression ) )
                    	    // InternalDearCode.g:2189:7: (lv_args_7_0= ruleExpression )
                    	    {
                    	    // InternalDearCode.g:2189:7: (lv_args_7_0= ruleExpression )
                    	    // InternalDearCode.g:2190:8: lv_args_7_0= ruleExpression
                    	    {

                    	    								newCompositeNode(grammarAccess.getFunctionCallAccess().getArgsExpressionParserRuleCall_4_1_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_42);
                    	    lv_args_7_0=ruleExpression();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"args",
                    	    									lv_args_7_0,
                    	    									"edu.upb.lp.DearCode.Expression");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,68,FOLLOW_2); 

            				newLeafNode(otherlv_8, grammarAccess.getFunctionCallAccess().getEnMiCorazNKeyword_4_2());
            			

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
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleType"
    // InternalDearCode.g:2218:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalDearCode.g:2218:44: (iv_ruleType= ruleType EOF )
            // InternalDearCode.g:2219:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalDearCode.g:2225:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'n\\u00FAmero' | kw= 'texto' | kw= 'booleano' | kw= 'nada' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDearCode.g:2231:2: ( (kw= 'n\\u00FAmero' | kw= 'texto' | kw= 'booleano' | kw= 'nada' ) )
            // InternalDearCode.g:2232:2: (kw= 'n\\u00FAmero' | kw= 'texto' | kw= 'booleano' | kw= 'nada' )
            {
            // InternalDearCode.g:2232:2: (kw= 'n\\u00FAmero' | kw= 'texto' | kw= 'booleano' | kw= 'nada' )
            int alt41=4;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt41=1;
                }
                break;
            case 70:
                {
                alt41=2;
                }
                break;
            case 71:
                {
                alt41=3;
                }
                break;
            case 72:
                {
                alt41=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalDearCode.g:2233:3: kw= 'n\\u00FAmero'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getNMeroKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:2239:3: kw= 'texto'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getTextoKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalDearCode.g:2245:3: kw= 'booleano'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getBooleanoKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalDearCode.g:2251:3: kw= 'nada'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getNadaKeyword_3());
                    		

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleComment"
    // InternalDearCode.g:2260:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalDearCode.g:2260:48: (iv_ruleComment= ruleComment EOF )
            // InternalDearCode.g:2261:2: iv_ruleComment= ruleComment EOF
            {
             newCompositeNode(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComment=ruleComment();

            state._fsp--;

             current =iv_ruleComment; 
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
    // $ANTLR end "entryRuleComment"


    // $ANTLR start "ruleComment"
    // InternalDearCode.g:2267:1: ruleComment returns [EObject current=null] : ( (lv_value_0_0= RULE_ANYTEXT ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDearCode.g:2273:2: ( ( (lv_value_0_0= RULE_ANYTEXT ) ) )
            // InternalDearCode.g:2274:2: ( (lv_value_0_0= RULE_ANYTEXT ) )
            {
            // InternalDearCode.g:2274:2: ( (lv_value_0_0= RULE_ANYTEXT ) )
            // InternalDearCode.g:2275:3: (lv_value_0_0= RULE_ANYTEXT )
            {
            // InternalDearCode.g:2275:3: (lv_value_0_0= RULE_ANYTEXT )
            // InternalDearCode.g:2276:4: lv_value_0_0= RULE_ANYTEXT
            {
            lv_value_0_0=(Token)match(input,RULE_ANYTEXT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getCommentAccess().getValueANYTEXTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getCommentRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"edu.upb.lp.DearCode.ANYTEXT");
            			

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
    // $ANTLR end "ruleComment"


    // $ANTLR start "entryRuleMI_ID"
    // InternalDearCode.g:2295:1: entryRuleMI_ID returns [EObject current=null] : iv_ruleMI_ID= ruleMI_ID EOF ;
    public final EObject entryRuleMI_ID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMI_ID = null;


        try {
            // InternalDearCode.g:2295:46: (iv_ruleMI_ID= ruleMI_ID EOF )
            // InternalDearCode.g:2296:2: iv_ruleMI_ID= ruleMI_ID EOF
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
    // InternalDearCode.g:2302:1: ruleMI_ID returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleMI_ID() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDearCode.g:2308:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalDearCode.g:2309:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalDearCode.g:2309:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDearCode.g:2310:3: (lv_name_0_0= RULE_ID )
            {
            // InternalDearCode.g:2310:3: (lv_name_0_0= RULE_ID )
            // InternalDearCode.g:2311:4: lv_name_0_0= RULE_ID
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


    // $ANTLR start "entryRuleVerboDeclaracion"
    // InternalDearCode.g:2330:1: entryRuleVerboDeclaracion returns [String current=null] : iv_ruleVerboDeclaracion= ruleVerboDeclaracion EOF ;
    public final String entryRuleVerboDeclaracion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVerboDeclaracion = null;


        try {
            // InternalDearCode.g:2330:56: (iv_ruleVerboDeclaracion= ruleVerboDeclaracion EOF )
            // InternalDearCode.g:2331:2: iv_ruleVerboDeclaracion= ruleVerboDeclaracion EOF
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
    // InternalDearCode.g:2337:1: ruleVerboDeclaracion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Te regalo' | kw= 'Ofrezco' | kw= 'Obsequio' | kw= 'Deposito en tu jard\\u00EDn' ) ;
    public final AntlrDatatypeRuleToken ruleVerboDeclaracion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDearCode.g:2343:2: ( (kw= 'Te regalo' | kw= 'Ofrezco' | kw= 'Obsequio' | kw= 'Deposito en tu jard\\u00EDn' ) )
            // InternalDearCode.g:2344:2: (kw= 'Te regalo' | kw= 'Ofrezco' | kw= 'Obsequio' | kw= 'Deposito en tu jard\\u00EDn' )
            {
            // InternalDearCode.g:2344:2: (kw= 'Te regalo' | kw= 'Ofrezco' | kw= 'Obsequio' | kw= 'Deposito en tu jard\\u00EDn' )
            int alt42=4;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt42=1;
                }
                break;
            case 74:
                {
                alt42=2;
                }
                break;
            case 75:
                {
                alt42=3;
                }
                break;
            case 76:
                {
                alt42=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalDearCode.g:2345:3: kw= 'Te regalo'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVerboDeclaracionAccess().getTeRegaloKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:2351:3: kw= 'Ofrezco'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVerboDeclaracionAccess().getOfrezcoKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalDearCode.g:2357:3: kw= 'Obsequio'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVerboDeclaracionAccess().getObsequioKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalDearCode.g:2363:3: kw= 'Deposito en tu jard\\u00EDn'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); 

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
    // InternalDearCode.g:2372:1: entryRuleVerboReasignacion returns [String current=null] : iv_ruleVerboReasignacion= ruleVerboReasignacion EOF ;
    public final String entryRuleVerboReasignacion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVerboReasignacion = null;


        try {
            // InternalDearCode.g:2372:57: (iv_ruleVerboReasignacion= ruleVerboReasignacion EOF )
            // InternalDearCode.g:2373:2: iv_ruleVerboReasignacion= ruleVerboReasignacion EOF
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
    // InternalDearCode.g:2379:1: ruleVerboReasignacion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Perm\\u00EDteme alimentar' | kw= 'Perm\\u00EDteme regar' | kw= 'Perm\\u00EDteme ajustar' ) ;
    public final AntlrDatatypeRuleToken ruleVerboReasignacion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDearCode.g:2385:2: ( (kw= 'Perm\\u00EDteme alimentar' | kw= 'Perm\\u00EDteme regar' | kw= 'Perm\\u00EDteme ajustar' ) )
            // InternalDearCode.g:2386:2: (kw= 'Perm\\u00EDteme alimentar' | kw= 'Perm\\u00EDteme regar' | kw= 'Perm\\u00EDteme ajustar' )
            {
            // InternalDearCode.g:2386:2: (kw= 'Perm\\u00EDteme alimentar' | kw= 'Perm\\u00EDteme regar' | kw= 'Perm\\u00EDteme ajustar' )
            int alt43=3;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt43=1;
                }
                break;
            case 78:
                {
                alt43=2;
                }
                break;
            case 79:
                {
                alt43=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalDearCode.g:2387:3: kw= 'Perm\\u00EDteme alimentar'
                    {
                    kw=(Token)match(input,77,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVerboReasignacionAccess().getPermTemeAlimentarKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:2393:3: kw= 'Perm\\u00EDteme regar'
                    {
                    kw=(Token)match(input,78,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVerboReasignacionAccess().getPermTemeRegarKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalDearCode.g:2399:3: kw= 'Perm\\u00EDteme ajustar'
                    {
                    kw=(Token)match(input,79,FOLLOW_2); 

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


    // $ANTLR start "entryRuleArticulo"
    // InternalDearCode.g:2408:1: entryRuleArticulo returns [String current=null] : iv_ruleArticulo= ruleArticulo EOF ;
    public final String entryRuleArticulo() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArticulo = null;


        try {
            // InternalDearCode.g:2408:48: (iv_ruleArticulo= ruleArticulo EOF )
            // InternalDearCode.g:2409:2: iv_ruleArticulo= ruleArticulo EOF
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
    // InternalDearCode.g:2415:1: ruleArticulo returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'un' | kw= 'una' ) ;
    public final AntlrDatatypeRuleToken ruleArticulo() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDearCode.g:2421:2: ( (kw= 'un' | kw= 'una' ) )
            // InternalDearCode.g:2422:2: (kw= 'un' | kw= 'una' )
            {
            // InternalDearCode.g:2422:2: (kw= 'un' | kw= 'una' )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==80) ) {
                alt44=1;
            }
            else if ( (LA44_0==81) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalDearCode.g:2423:3: kw= 'un'
                    {
                    kw=(Token)match(input,80,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArticuloAccess().getUnKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:2429:3: kw= 'una'
                    {
                    kw=(Token)match(input,81,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000704C190000L,0x000000000000FE02L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000704C190002L,0x000000000000FE02L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0000000000030000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0xB00000704C1900F0L,0x000000000000FE03L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004080L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000064000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000008704C190000L,0x000000000000FE02L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000008704E990000L,0x000000000000FE02L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000008704E190000L,0x000000000000FE02L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000008706C190000L,0x000000000000FE02L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000008784C190000L,0x000000000000FE02L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000030000200000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000C704C190000L,0x000000000000FE02L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0078000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0E00000000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000004L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0xB00000704C1900F0L,0x000000000000FE13L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});

}