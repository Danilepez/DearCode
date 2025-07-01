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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ANYTEXT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Querido'", "'Querida'", "'Inspiras un amor dentro de m\\u00ED'", "'Eres la chispa de mi alma'", "'Tu luz despierta mi ser'", "'.'", "'Con cari\\u00F1o, Tu programador'", "'Espero la noche para tenerte conmigo'", "'Tengo la suerte de tenerte siempre'", "'Haces que mi coraz\\u00F3n se acelere'", "'n\\u00FAmero'", "'texto'", "'booleano'", "'Le ped\\u00ED al lector que me dijera'", "'Le'", "'Escucho tu voz en el viento'", "'Atrapo un suspiro tuyo'", "'Recojo tus palabras como p\\u00E9talos al alba'", "'Tu aliento me habla en silencio'", "'Acaricio el eco de tu voz'", "'Guardo tus secretos en mi pecho'", "'Espero tu susurro como un amanecer'", "'en un susurro num\\u00E9rico'", "'con palabras de terciopelo'", "'con un eco num\\u00E9rico'", "'en un latido suave'", "'como un verso escrito en el cielo'", "'envuelto en la luz de tus ojos'", "'con el perfume de tu esencia'", "'danzando en el comp\\u00E1s de mi coraz\\u00F3n'", "'tejiendo sue\\u00F1os con tus letras'", "'Hoy le quise contar al mundo sobre:'", "'Dejo que el mundo sienta sobre:'", "'Susurro al universo el secreto sobre:'", "'Grabo en el firmamento mi verdad acerca de:'", "'Canto al viento mi anhelo de:'", "'Env\\u00EDo al horizonte mi pasi\\u00F3n sobre:'", "'Dejo que las nubes abracen mi voz en:'", "'Si en tu corazon sientes que'", "'Si tu alma susurra que'", "'Si el latido de mi alma dice que'", "'Si el destino nos susurra que'", "'Si la luna refleja que'", "','", "'entonces deja que estas palabras florezcan:'", "'entonces que brote este amor:'", "'entonces que nazca este sue\\u00F1o:'", "'entonces que el universo conspire:'", "'entonces que mi voz te abrace:'", "'Pero si la noche calla otra verdad,'", "'que surja este suspiro:'", "'Pero si el viento trae otro mensaje,'", "'que despierte esta pasi\\u00F3n:'", "'Pero si el coraz\\u00F3n duda,'", "'que renazca esta esperanza:'", "'Y as\\u00ED el universo sigue su curso.'", "'As\\u00ED sigue el canto del coraz\\u00F3n.'", "'Y as\\u00ED la melod\\u00EDa contin\\u00FAa.'", "'Y el eco de nuestro amor perdura.'", "'Y la danza de las estrellas sigue.'", "'Mientras aun me piensas'", "'Mientras a\\u00FAn sue\\u00F1es con este momento'", "'Mientras mi coraz\\u00F3n te anhele'", "'Mientras tu luz me gu\\u00EDe'", "'Mientras el fuego de mi amor arda'", "'Mientras la luna nos ilumine'", "'Mientras tus ojos me miren'", "'haz que suceda:'", "'tejiendo este amor:'", "'deja que el tiempo se detenga:'", "'haz que el universo conspire:'", "'permite que el destino nos una:'", "'Y as\\u00ED el susurro descansa.'", "'hasta que el anhelo repose'", "'Y el silencio envuelve nuestro amor.'", "'Hasta que la eternidad nos encuentre.'", "'Y la pasi\\u00F3n se convierte en recuerdo.'", "'En cada suspiro'", "'Por cada latido'", "'Por cada estrella que nos mira'", "'En cada p\\u00E9talo de rosa'", "'Por cada ola que besa la orilla'", "'desde'", "'hasta'", "'con paso'", "'deja que el universo cante:'", "'resuena este amor'", "'que el viento susurre nuestro nombre:'", "'que el cielo pinte nuestro amor:'", "'que la tierra tiemble con nuestra pasi\\u00F3n:'", "'Cuando el \\u00FAltimo eco se calle.'", "'Y el eco se desvanece.'", "'Y la \\u00FAltima estrella se apague.'", "'Hasta que el \\u00FAltimo p\\u00E9talo caiga.'", "'Cuando el mar se quede en silencio.'", "'Dejo en estas l\\u00EDneas una promesa llamada'", "'Escribo en estas l\\u00EDneas una intenci\\u00F3n llamada'", "'En la brisa escondo un deseo llamado'", "'Grabo en las estrellas una promesa llamada'", "'Susurro al universo un deseo llamado'", "'Tejo en el destino un juramento llamado'", "'Esculpo en el tiempo un anhelo llamado'", "'Susurro a la eternidad un sue\\u00F1o llamado'", "'que guarda en su esencia'", "'tejiendo'", "'que abraza en su ser'", "'que lleva en su alma'", "'que susurra en su coraz\\u00F3n'", "'tambien'", "'llevando consigo'", "'prometiendo devolver'", "'jurando devolver'", "'Cuando la promesa se cumple:'", "'Cuando el amor se cumpla'", "'As\\u00ED se sella la promesa.'", "'As\\u00ED se eterniza.'", "'Y as\\u00ED nuestro amor se inmortaliza.'", "'Y el universo guarda nuestro secreto.'", "'Y la eternidad nos abraza.'", "'Y entrego al viento'", "'Te entrego'", "'Te ofrezco con el alma'", "'Dejo en tus manos'", "'Susurro a tu coraz\\u00F3n'", "'como promesa cumplida.'", "'con un suspiro.'", "'como un regalo eterno.'", "'envuelto en mi amor.'", "'con la esperanza de tu sonrisa.'", "'o tal vez'", "'o quiz\\u00E1s'", "'o acaso el amor permita'", "'o si la luna lo desea'", "'y tambi\\u00E9n'", "'junto a'", "'y adem\\u00E1s'", "'y al mismo tiempo que'", "'y junto con'", "'y en uni\\u00F3n con'", "'late al un\\u00EDsono con'", "'canta con un matiz distinto a'", "'late igual que'", "'se distingue de'", "'resuena igual que'", "'vibra al mismo ritmo que'", "'es id\\u00E9ntico a'", "'se diferencia de'", "'no coincide con'", "'es distinto a'", "'susurra con menos fuerza que'", "'casi suspira al mismo nivel que'", "'arde con m\\u00E1s pasi\\u00F3n que'", "'rodea con tanta fuerza como'", "'susurra menos que'", "'casi igual que'", "'arde mas que'", "'abraza como'", "'susurra m\\u00E1s suavemente que'", "'tiene menos latidos que'", "'susurra tan suavemente como'", "'no supera a'", "'susurra con m\\u00E1s fuerza que'", "'tiene m\\u00E1s latidos que'", "'susurra al menos con la misma fuerza que'", "'al menos iguala a'", "'unidos en un solo suspiro con'", "'fundidos en la llama de'", "'se une a'", "'se funde con'", "'sumado al latido de'", "'combinado con la pasi\\u00F3n de'", "'entrelazado con'", "'a\\u00F1adido al suspiro de'", "'fortalecidos por el fuego de'", "'separados entre los ecos de'", "'resuena con el eco de'", "'crece con'", "'resuena en'", "'se divide entre'", "'no creo que'", "'no siento que'", "'no me parece que'", "'no percibo que'", "'dudo que'", "'('", "')'", "'siempre'", "'jam\\u00E1s'", "'invoco a'", "'susurro a'", "'murmuro a'", "'conjuro a'", "'con los regalos'", "'ofreciendo'", "'con los dones'", "'presentando'", "'ofreciendo mis tesoros'", "'asimismo'", "'adicionalmente'", "'en mi coraz\\u00F3n'", "'en mi alma'", "'Te regalo'", "'Te Ofrezco'", "'Obsequio'", "'Deposito en tu jard\\u00EDn'", "'Te revelo'", "'Te susurro'", "'Te conf\\u00EDo'", "'Te dedico'", "'Te brindo'", "'Perm\\u00EDteme alimentar'", "'Perm\\u00EDteme regar'", "'Perm\\u00EDteme ajustar'", "'Reavivo'", "'Renuevo'", "'Reafirmo'", "'Perm\\u00EDteme transformar'", "'Renuevo con pasi\\u00F3n'", "'Modifico con amor'", "'un'", "'una'", "'unos'", "'unas'"
    };
    public static final int T__144=144;
    public static final int T__143=143;
    public static final int T__146=146;
    public static final int T__50=50;
    public static final int T__145=145;
    public static final int T__140=140;
    public static final int T__142=142;
    public static final int T__141=141;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__137=137;
    public static final int T__52=52;
    public static final int T__136=136;
    public static final int T__53=53;
    public static final int T__139=139;
    public static final int T__54=54;
    public static final int T__138=138;
    public static final int T__133=133;
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__135=135;
    public static final int T__61=61;
    public static final int T__134=134;
    public static final int RULE_ID=4;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_INT=5;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__129=129;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__128=128;
    public static final int T__65=65;
    public static final int T__127=127;
    public static final int T__166=166;
    public static final int T__165=165;
    public static final int T__168=168;
    public static final int T__167=167;
    public static final int T__162=162;
    public static final int T__161=161;
    public static final int T__164=164;
    public static final int T__163=163;
    public static final int T__160=160;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__159=159;
    public static final int T__30=30;
    public static final int T__158=158;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__155=155;
    public static final int T__154=154;
    public static final int T__157=157;
    public static final int T__156=156;
    public static final int T__151=151;
    public static final int T__150=150;
    public static final int T__153=153;
    public static final int T__152=152;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__148=148;
    public static final int T__41=41;
    public static final int T__147=147;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__149=149;
    public static final int T__100=100;
    public static final int T__221=221;
    public static final int T__220=220;
    public static final int T__102=102;
    public static final int T__223=223;
    public static final int T__101=101;
    public static final int T__222=222;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__218=218;
    public static final int T__12=12;
    public static final int T__217=217;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__219=219;
    public static final int T__214=214;
    public static final int T__213=213;
    public static final int T__216=216;
    public static final int T__215=215;
    public static final int T__210=210;
    public static final int T__212=212;
    public static final int T__211=211;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__207=207;
    public static final int T__23=23;
    public static final int T__206=206;
    public static final int T__24=24;
    public static final int T__209=209;
    public static final int T__25=25;
    public static final int T__208=208;
    public static final int T__203=203;
    public static final int T__202=202;
    public static final int T__20=20;
    public static final int T__205=205;
    public static final int T__21=21;
    public static final int T__204=204;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__119=119;
    public static final int T__118=118;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__114=114;
    public static final int T__117=117;
    public static final int T__116=116;
    public static final int T__111=111;
    public static final int T__232=232;
    public static final int T__110=110;
    public static final int T__231=231;
    public static final int T__113=113;
    public static final int T__234=234;
    public static final int T__112=112;
    public static final int T__233=233;
    public static final int T__230=230;
    public static final int RULE_ANYTEXT=7;
    public static final int T__108=108;
    public static final int T__229=229;
    public static final int T__107=107;
    public static final int T__228=228;
    public static final int T__109=109;
    public static final int T__104=104;
    public static final int T__225=225;
    public static final int T__103=103;
    public static final int T__224=224;
    public static final int T__106=106;
    public static final int T__227=227;
    public static final int T__105=105;
    public static final int T__226=226;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__201=201;
    public static final int T__200=200;
    public static final int T__91=91;
    public static final int T__188=188;
    public static final int T__92=92;
    public static final int T__187=187;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__189=189;
    public static final int T__184=184;
    public static final int T__183=183;
    public static final int T__186=186;
    public static final int T__90=90;
    public static final int T__185=185;
    public static final int T__180=180;
    public static final int T__182=182;
    public static final int T__181=181;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__177=177;
    public static final int T__176=176;
    public static final int T__179=179;
    public static final int T__178=178;
    public static final int T__173=173;
    public static final int T__172=172;
    public static final int T__175=175;
    public static final int T__174=174;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int T__169=169;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__199=199;
    public static final int T__81=81;
    public static final int T__198=198;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__195=195;
    public static final int T__194=194;
    public static final int RULE_WS=10;
    public static final int T__197=197;
    public static final int T__196=196;
    public static final int T__191=191;
    public static final int T__190=190;
    public static final int T__193=193;
    public static final int T__192=192;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

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
    // InternalDearCode.g:183:1: ruleSaludo returns [EObject current=null] : ( (otherlv_0= 'Querido' | otherlv_1= 'Querida' | otherlv_2= 'Inspiras un amor dentro de m\\u00ED' | otherlv_3= 'Eres la chispa de mi alma' | otherlv_4= 'Tu luz despierta mi ser' ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '.' ) ;
    public final EObject ruleSaludo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalDearCode.g:189:2: ( ( (otherlv_0= 'Querido' | otherlv_1= 'Querida' | otherlv_2= 'Inspiras un amor dentro de m\\u00ED' | otherlv_3= 'Eres la chispa de mi alma' | otherlv_4= 'Tu luz despierta mi ser' ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '.' ) )
            // InternalDearCode.g:190:2: ( (otherlv_0= 'Querido' | otherlv_1= 'Querida' | otherlv_2= 'Inspiras un amor dentro de m\\u00ED' | otherlv_3= 'Eres la chispa de mi alma' | otherlv_4= 'Tu luz despierta mi ser' ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '.' )
            {
            // InternalDearCode.g:190:2: ( (otherlv_0= 'Querido' | otherlv_1= 'Querida' | otherlv_2= 'Inspiras un amor dentro de m\\u00ED' | otherlv_3= 'Eres la chispa de mi alma' | otherlv_4= 'Tu luz despierta mi ser' ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '.' )
            // InternalDearCode.g:191:3: (otherlv_0= 'Querido' | otherlv_1= 'Querida' | otherlv_2= 'Inspiras un amor dentro de m\\u00ED' | otherlv_3= 'Eres la chispa de mi alma' | otherlv_4= 'Tu luz despierta mi ser' ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '.'
            {
            // InternalDearCode.g:191:3: (otherlv_0= 'Querido' | otherlv_1= 'Querida' | otherlv_2= 'Inspiras un amor dentro de m\\u00ED' | otherlv_3= 'Eres la chispa de mi alma' | otherlv_4= 'Tu luz despierta mi ser' )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt1=1;
                }
                break;
            case 13:
                {
                alt1=2;
                }
                break;
            case 14:
                {
                alt1=3;
                }
                break;
            case 15:
                {
                alt1=4;
                }
                break;
            case 16:
                {
                alt1=5;
                }
                break;
            default:
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
                case 3 :
                    // InternalDearCode.g:202:4: otherlv_2= 'Inspiras un amor dentro de m\\u00ED'
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getSaludoAccess().getInspirasUnAmorDentroDeMKeyword_0_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalDearCode.g:207:4: otherlv_3= 'Eres la chispa de mi alma'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getSaludoAccess().getEresLaChispaDeMiAlmaKeyword_0_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalDearCode.g:212:4: otherlv_4= 'Tu luz despierta mi ser'
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getSaludoAccess().getTuLuzDespiertaMiSerKeyword_0_4());
                    			

                    }
                    break;

            }

            // InternalDearCode.g:217:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalDearCode.g:218:4: (lv_name_5_0= RULE_ID )
            {
            // InternalDearCode.g:218:4: (lv_name_5_0= RULE_ID )
            // InternalDearCode.g:219:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_5_0, grammarAccess.getSaludoAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSaludoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSaludoAccess().getFullStopKeyword_2());
            		

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
    // InternalDearCode.g:243:1: entryRuleDespedida returns [EObject current=null] : iv_ruleDespedida= ruleDespedida EOF ;
    public final EObject entryRuleDespedida() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDespedida = null;


        try {
            // InternalDearCode.g:243:50: (iv_ruleDespedida= ruleDespedida EOF )
            // InternalDearCode.g:244:2: iv_ruleDespedida= ruleDespedida EOF
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
    // InternalDearCode.g:250:1: ruleDespedida returns [EObject current=null] : ( (otherlv_0= 'Con cari\\u00F1o, Tu programador' | otherlv_1= 'Espero la noche para tenerte conmigo' | otherlv_2= 'Tengo la suerte de tenerte siempre' | otherlv_3= 'Haces que mi coraz\\u00F3n se acelere' ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '.' ) ;
    public final EObject ruleDespedida() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalDearCode.g:256:2: ( ( (otherlv_0= 'Con cari\\u00F1o, Tu programador' | otherlv_1= 'Espero la noche para tenerte conmigo' | otherlv_2= 'Tengo la suerte de tenerte siempre' | otherlv_3= 'Haces que mi coraz\\u00F3n se acelere' ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '.' ) )
            // InternalDearCode.g:257:2: ( (otherlv_0= 'Con cari\\u00F1o, Tu programador' | otherlv_1= 'Espero la noche para tenerte conmigo' | otherlv_2= 'Tengo la suerte de tenerte siempre' | otherlv_3= 'Haces que mi coraz\\u00F3n se acelere' ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '.' )
            {
            // InternalDearCode.g:257:2: ( (otherlv_0= 'Con cari\\u00F1o, Tu programador' | otherlv_1= 'Espero la noche para tenerte conmigo' | otherlv_2= 'Tengo la suerte de tenerte siempre' | otherlv_3= 'Haces que mi coraz\\u00F3n se acelere' ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '.' )
            // InternalDearCode.g:258:3: (otherlv_0= 'Con cari\\u00F1o, Tu programador' | otherlv_1= 'Espero la noche para tenerte conmigo' | otherlv_2= 'Tengo la suerte de tenerte siempre' | otherlv_3= 'Haces que mi coraz\\u00F3n se acelere' ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '.'
            {
            // InternalDearCode.g:258:3: (otherlv_0= 'Con cari\\u00F1o, Tu programador' | otherlv_1= 'Espero la noche para tenerte conmigo' | otherlv_2= 'Tengo la suerte de tenerte siempre' | otherlv_3= 'Haces que mi coraz\\u00F3n se acelere' )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 20:
                {
                alt2=3;
                }
                break;
            case 21:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDearCode.g:259:4: otherlv_0= 'Con cari\\u00F1o, Tu programador'
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getDespedidaAccess().getConCariOTuProgramadorKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:264:4: otherlv_1= 'Espero la noche para tenerte conmigo'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getDespedidaAccess().getEsperoLaNocheParaTenerteConmigoKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalDearCode.g:269:4: otherlv_2= 'Tengo la suerte de tenerte siempre'
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getDespedidaAccess().getTengoLaSuerteDeTenerteSiempreKeyword_0_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalDearCode.g:274:4: otherlv_3= 'Haces que mi coraz\\u00F3n se acelere'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getDespedidaAccess().getHacesQueMiCorazNSeAcelereKeyword_0_3());
                    			

                    }
                    break;

            }

            // InternalDearCode.g:279:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalDearCode.g:280:4: (lv_name_4_0= RULE_ID )
            {
            // InternalDearCode.g:280:4: (lv_name_4_0= RULE_ID )
            // InternalDearCode.g:281:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_4_0, grammarAccess.getDespedidaAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDespedidaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDespedidaAccess().getFullStopKeyword_2());
            		

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
    // InternalDearCode.g:305:1: entryRuleCuerpo returns [EObject current=null] : iv_ruleCuerpo= ruleCuerpo EOF ;
    public final EObject entryRuleCuerpo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCuerpo = null;


        try {
            // InternalDearCode.g:305:47: (iv_ruleCuerpo= ruleCuerpo EOF )
            // InternalDearCode.g:306:2: iv_ruleCuerpo= ruleCuerpo EOF
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
    // InternalDearCode.g:312:1: ruleCuerpo returns [EObject current=null] : ( (lv_instrucciones_0_0= ruleInstruccion ) )+ ;
    public final EObject ruleCuerpo() throws RecognitionException {
        EObject current = null;

        EObject lv_instrucciones_0_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:318:2: ( ( (lv_instrucciones_0_0= ruleInstruccion ) )+ )
            // InternalDearCode.g:319:2: ( (lv_instrucciones_0_0= ruleInstruccion ) )+
            {
            // InternalDearCode.g:319:2: ( (lv_instrucciones_0_0= ruleInstruccion ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=25 && LA3_0<=33)||(LA3_0>=43 && LA3_0<=54)||(LA3_0>=72 && LA3_0<=78)||(LA3_0>=89 && LA3_0<=93)||(LA3_0>=107 && LA3_0<=114)||(LA3_0>=200 && LA3_0<=203)||(LA3_0>=213 && LA3_0<=230)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDearCode.g:320:3: (lv_instrucciones_0_0= ruleInstruccion )
            	    {
            	    // InternalDearCode.g:320:3: (lv_instrucciones_0_0= ruleInstruccion )
            	    // InternalDearCode.g:321:4: lv_instrucciones_0_0= ruleInstruccion
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
    // InternalDearCode.g:341:1: entryRuleInstruccion returns [EObject current=null] : iv_ruleInstruccion= ruleInstruccion EOF ;
    public final EObject entryRuleInstruccion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruccion = null;


        try {
            // InternalDearCode.g:341:52: (iv_ruleInstruccion= ruleInstruccion EOF )
            // InternalDearCode.g:342:2: iv_ruleInstruccion= ruleInstruccion EOF
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
    // InternalDearCode.g:348:1: ruleInstruccion returns [EObject current=null] : (this_Declarar_0= ruleDeclarar | this_Reasignar_1= ruleReasignar | this_Condicional_2= ruleCondicional | this_BucleWhile_3= ruleBucleWhile | this_BucleFor_4= ruleBucleFor | this_Entrada_5= ruleEntrada | this_Salida_6= ruleSalida | this_Funcion_7= ruleFuncion | this_FunctionCall_8= ruleFunctionCall ) ;
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
            // InternalDearCode.g:354:2: ( (this_Declarar_0= ruleDeclarar | this_Reasignar_1= ruleReasignar | this_Condicional_2= ruleCondicional | this_BucleWhile_3= ruleBucleWhile | this_BucleFor_4= ruleBucleFor | this_Entrada_5= ruleEntrada | this_Salida_6= ruleSalida | this_Funcion_7= ruleFuncion | this_FunctionCall_8= ruleFunctionCall ) )
            // InternalDearCode.g:355:2: (this_Declarar_0= ruleDeclarar | this_Reasignar_1= ruleReasignar | this_Condicional_2= ruleCondicional | this_BucleWhile_3= ruleBucleWhile | this_BucleFor_4= ruleBucleFor | this_Entrada_5= ruleEntrada | this_Salida_6= ruleSalida | this_Funcion_7= ruleFuncion | this_FunctionCall_8= ruleFunctionCall )
            {
            // InternalDearCode.g:355:2: (this_Declarar_0= ruleDeclarar | this_Reasignar_1= ruleReasignar | this_Condicional_2= ruleCondicional | this_BucleWhile_3= ruleBucleWhile | this_BucleFor_4= ruleBucleFor | this_Entrada_5= ruleEntrada | this_Salida_6= ruleSalida | this_Funcion_7= ruleFuncion | this_FunctionCall_8= ruleFunctionCall )
            int alt4=9;
            switch ( input.LA(1) ) {
            case 213:
            case 214:
            case 215:
            case 216:
            case 217:
            case 218:
            case 219:
            case 220:
            case 221:
                {
                alt4=1;
                }
                break;
            case 222:
            case 223:
            case 224:
            case 225:
            case 226:
            case 227:
            case 228:
            case 229:
            case 230:
                {
                alt4=2;
                }
                break;
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
                {
                alt4=3;
                }
                break;
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
                {
                alt4=4;
                }
                break;
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
                {
                alt4=5;
                }
                break;
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
                {
                alt4=6;
                }
                break;
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                {
                alt4=7;
                }
                break;
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
                {
                alt4=8;
                }
                break;
            case 200:
            case 201:
            case 202:
            case 203:
                {
                alt4=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDearCode.g:356:3: this_Declarar_0= ruleDeclarar
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
                    // InternalDearCode.g:365:3: this_Reasignar_1= ruleReasignar
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
                    // InternalDearCode.g:374:3: this_Condicional_2= ruleCondicional
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
                    // InternalDearCode.g:383:3: this_BucleWhile_3= ruleBucleWhile
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
                    // InternalDearCode.g:392:3: this_BucleFor_4= ruleBucleFor
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
                    // InternalDearCode.g:401:3: this_Entrada_5= ruleEntrada
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
                    // InternalDearCode.g:410:3: this_Salida_6= ruleSalida
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
                    // InternalDearCode.g:419:3: this_Funcion_7= ruleFuncion
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
                    // InternalDearCode.g:428:3: this_FunctionCall_8= ruleFunctionCall
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


    // $ANTLR start "entryRuleType"
    // InternalDearCode.g:440:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalDearCode.g:440:44: (iv_ruleType= ruleType EOF )
            // InternalDearCode.g:441:2: iv_ruleType= ruleType EOF
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
    // InternalDearCode.g:447:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'n\\u00FAmero' | kw= 'texto' | kw= 'booleano' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDearCode.g:453:2: ( (kw= 'n\\u00FAmero' | kw= 'texto' | kw= 'booleano' ) )
            // InternalDearCode.g:454:2: (kw= 'n\\u00FAmero' | kw= 'texto' | kw= 'booleano' )
            {
            // InternalDearCode.g:454:2: (kw= 'n\\u00FAmero' | kw= 'texto' | kw= 'booleano' )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt5=1;
                }
                break;
            case 23:
                {
                alt5=2;
                }
                break;
            case 24:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDearCode.g:455:3: kw= 'n\\u00FAmero'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getNMeroKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:461:3: kw= 'texto'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getTextoKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalDearCode.g:467:3: kw= 'booleano'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getBooleanoKeyword_2());
                    		

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


    // $ANTLR start "entryRuleDeclarar"
    // InternalDearCode.g:476:1: entryRuleDeclarar returns [EObject current=null] : iv_ruleDeclarar= ruleDeclarar EOF ;
    public final EObject entryRuleDeclarar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarar = null;


        try {
            // InternalDearCode.g:476:49: (iv_ruleDeclarar= ruleDeclarar EOF )
            // InternalDearCode.g:477:2: iv_ruleDeclarar= ruleDeclarar EOF
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
    // InternalDearCode.g:483:1: ruleDeclarar returns [EObject current=null] : ( ( (lv_verboDecl_0_0= ruleVerboDeclaracion ) ) ( (lv_articulo_1_0= ruleArticulo ) ) ( (lv_tipo_2_0= ruleType ) )? ( (lv_sustantivo_3_0= ruleMI_ID ) ) ( (lv_preComentario_4_0= ruleComment ) )? ( (lv_valor_5_0= ruleExpression ) ) ( (lv_postComentario_6_0= ruleComment ) )? ) ;
    public final EObject ruleDeclarar() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_verboDecl_0_0 = null;

        AntlrDatatypeRuleToken lv_articulo_1_0 = null;

        AntlrDatatypeRuleToken lv_tipo_2_0 = null;

        EObject lv_sustantivo_3_0 = null;

        EObject lv_preComentario_4_0 = null;

        EObject lv_valor_5_0 = null;

        EObject lv_postComentario_6_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:489:2: ( ( ( (lv_verboDecl_0_0= ruleVerboDeclaracion ) ) ( (lv_articulo_1_0= ruleArticulo ) ) ( (lv_tipo_2_0= ruleType ) )? ( (lv_sustantivo_3_0= ruleMI_ID ) ) ( (lv_preComentario_4_0= ruleComment ) )? ( (lv_valor_5_0= ruleExpression ) ) ( (lv_postComentario_6_0= ruleComment ) )? ) )
            // InternalDearCode.g:490:2: ( ( (lv_verboDecl_0_0= ruleVerboDeclaracion ) ) ( (lv_articulo_1_0= ruleArticulo ) ) ( (lv_tipo_2_0= ruleType ) )? ( (lv_sustantivo_3_0= ruleMI_ID ) ) ( (lv_preComentario_4_0= ruleComment ) )? ( (lv_valor_5_0= ruleExpression ) ) ( (lv_postComentario_6_0= ruleComment ) )? )
            {
            // InternalDearCode.g:490:2: ( ( (lv_verboDecl_0_0= ruleVerboDeclaracion ) ) ( (lv_articulo_1_0= ruleArticulo ) ) ( (lv_tipo_2_0= ruleType ) )? ( (lv_sustantivo_3_0= ruleMI_ID ) ) ( (lv_preComentario_4_0= ruleComment ) )? ( (lv_valor_5_0= ruleExpression ) ) ( (lv_postComentario_6_0= ruleComment ) )? )
            // InternalDearCode.g:491:3: ( (lv_verboDecl_0_0= ruleVerboDeclaracion ) ) ( (lv_articulo_1_0= ruleArticulo ) ) ( (lv_tipo_2_0= ruleType ) )? ( (lv_sustantivo_3_0= ruleMI_ID ) ) ( (lv_preComentario_4_0= ruleComment ) )? ( (lv_valor_5_0= ruleExpression ) ) ( (lv_postComentario_6_0= ruleComment ) )?
            {
            // InternalDearCode.g:491:3: ( (lv_verboDecl_0_0= ruleVerboDeclaracion ) )
            // InternalDearCode.g:492:4: (lv_verboDecl_0_0= ruleVerboDeclaracion )
            {
            // InternalDearCode.g:492:4: (lv_verboDecl_0_0= ruleVerboDeclaracion )
            // InternalDearCode.g:493:5: lv_verboDecl_0_0= ruleVerboDeclaracion
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

            // InternalDearCode.g:510:3: ( (lv_articulo_1_0= ruleArticulo ) )
            // InternalDearCode.g:511:4: (lv_articulo_1_0= ruleArticulo )
            {
            // InternalDearCode.g:511:4: (lv_articulo_1_0= ruleArticulo )
            // InternalDearCode.g:512:5: lv_articulo_1_0= ruleArticulo
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

            // InternalDearCode.g:529:3: ( (lv_tipo_2_0= ruleType ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=22 && LA6_0<=24)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDearCode.g:530:4: (lv_tipo_2_0= ruleType )
                    {
                    // InternalDearCode.g:530:4: (lv_tipo_2_0= ruleType )
                    // InternalDearCode.g:531:5: lv_tipo_2_0= ruleType
                    {

                    					newCompositeNode(grammarAccess.getDeclararAccess().getTipoTypeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_tipo_2_0=ruleType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeclararRule());
                    					}
                    					set(
                    						current,
                    						"tipo",
                    						lv_tipo_2_0,
                    						"edu.upb.lp.DearCode.Type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDearCode.g:548:3: ( (lv_sustantivo_3_0= ruleMI_ID ) )
            // InternalDearCode.g:549:4: (lv_sustantivo_3_0= ruleMI_ID )
            {
            // InternalDearCode.g:549:4: (lv_sustantivo_3_0= ruleMI_ID )
            // InternalDearCode.g:550:5: lv_sustantivo_3_0= ruleMI_ID
            {

            					newCompositeNode(grammarAccess.getDeclararAccess().getSustantivoMI_IDParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
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

            // InternalDearCode.g:567:3: ( (lv_preComentario_4_0= ruleComment ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ANYTEXT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDearCode.g:568:4: (lv_preComentario_4_0= ruleComment )
                    {
                    // InternalDearCode.g:568:4: (lv_preComentario_4_0= ruleComment )
                    // InternalDearCode.g:569:5: lv_preComentario_4_0= ruleComment
                    {

                    					newCompositeNode(grammarAccess.getDeclararAccess().getPreComentarioCommentParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_preComentario_4_0=ruleComment();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeclararRule());
                    					}
                    					set(
                    						current,
                    						"preComentario",
                    						lv_preComentario_4_0,
                    						"edu.upb.lp.DearCode.Comment");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDearCode.g:586:3: ( (lv_valor_5_0= ruleExpression ) )
            // InternalDearCode.g:587:4: (lv_valor_5_0= ruleExpression )
            {
            // InternalDearCode.g:587:4: (lv_valor_5_0= ruleExpression )
            // InternalDearCode.g:588:5: lv_valor_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getDeclararAccess().getValorExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_11);
            lv_valor_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclararRule());
            					}
            					set(
            						current,
            						"valor",
            						lv_valor_5_0,
            						"edu.upb.lp.DearCode.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDearCode.g:605:3: ( (lv_postComentario_6_0= ruleComment ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ANYTEXT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDearCode.g:606:4: (lv_postComentario_6_0= ruleComment )
                    {
                    // InternalDearCode.g:606:4: (lv_postComentario_6_0= ruleComment )
                    // InternalDearCode.g:607:5: lv_postComentario_6_0= ruleComment
                    {

                    					newCompositeNode(grammarAccess.getDeclararAccess().getPostComentarioCommentParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_postComentario_6_0=ruleComment();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeclararRule());
                    					}
                    					set(
                    						current,
                    						"postComentario",
                    						lv_postComentario_6_0,
                    						"edu.upb.lp.DearCode.Comment");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleDeclarar"


    // $ANTLR start "entryRuleReasignar"
    // InternalDearCode.g:628:1: entryRuleReasignar returns [EObject current=null] : iv_ruleReasignar= ruleReasignar EOF ;
    public final EObject entryRuleReasignar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReasignar = null;


        try {
            // InternalDearCode.g:628:50: (iv_ruleReasignar= ruleReasignar EOF )
            // InternalDearCode.g:629:2: iv_ruleReasignar= ruleReasignar EOF
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
    // InternalDearCode.g:635:1: ruleReasignar returns [EObject current=null] : ( ( (lv_verboReas_0_0= ruleVerboReasignacion ) ) ( (lv_preComentario_1_0= ruleComment ) )? ( (lv_sustantivo_2_0= ruleMI_ID ) ) ( (lv_postComentario_3_0= ruleComment ) )? ( (lv_valor_4_0= ruleExpression ) ) ( (lv_comentario_5_0= ruleComment ) )? ) ;
    public final EObject ruleReasignar() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_verboReas_0_0 = null;

        EObject lv_preComentario_1_0 = null;

        EObject lv_sustantivo_2_0 = null;

        EObject lv_postComentario_3_0 = null;

        EObject lv_valor_4_0 = null;

        EObject lv_comentario_5_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:641:2: ( ( ( (lv_verboReas_0_0= ruleVerboReasignacion ) ) ( (lv_preComentario_1_0= ruleComment ) )? ( (lv_sustantivo_2_0= ruleMI_ID ) ) ( (lv_postComentario_3_0= ruleComment ) )? ( (lv_valor_4_0= ruleExpression ) ) ( (lv_comentario_5_0= ruleComment ) )? ) )
            // InternalDearCode.g:642:2: ( ( (lv_verboReas_0_0= ruleVerboReasignacion ) ) ( (lv_preComentario_1_0= ruleComment ) )? ( (lv_sustantivo_2_0= ruleMI_ID ) ) ( (lv_postComentario_3_0= ruleComment ) )? ( (lv_valor_4_0= ruleExpression ) ) ( (lv_comentario_5_0= ruleComment ) )? )
            {
            // InternalDearCode.g:642:2: ( ( (lv_verboReas_0_0= ruleVerboReasignacion ) ) ( (lv_preComentario_1_0= ruleComment ) )? ( (lv_sustantivo_2_0= ruleMI_ID ) ) ( (lv_postComentario_3_0= ruleComment ) )? ( (lv_valor_4_0= ruleExpression ) ) ( (lv_comentario_5_0= ruleComment ) )? )
            // InternalDearCode.g:643:3: ( (lv_verboReas_0_0= ruleVerboReasignacion ) ) ( (lv_preComentario_1_0= ruleComment ) )? ( (lv_sustantivo_2_0= ruleMI_ID ) ) ( (lv_postComentario_3_0= ruleComment ) )? ( (lv_valor_4_0= ruleExpression ) ) ( (lv_comentario_5_0= ruleComment ) )?
            {
            // InternalDearCode.g:643:3: ( (lv_verboReas_0_0= ruleVerboReasignacion ) )
            // InternalDearCode.g:644:4: (lv_verboReas_0_0= ruleVerboReasignacion )
            {
            // InternalDearCode.g:644:4: (lv_verboReas_0_0= ruleVerboReasignacion )
            // InternalDearCode.g:645:5: lv_verboReas_0_0= ruleVerboReasignacion
            {

            					newCompositeNode(grammarAccess.getReasignarAccess().getVerboReasVerboReasignacionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
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

            // InternalDearCode.g:662:3: ( (lv_preComentario_1_0= ruleComment ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ANYTEXT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDearCode.g:663:4: (lv_preComentario_1_0= ruleComment )
                    {
                    // InternalDearCode.g:663:4: (lv_preComentario_1_0= ruleComment )
                    // InternalDearCode.g:664:5: lv_preComentario_1_0= ruleComment
                    {

                    					newCompositeNode(grammarAccess.getReasignarAccess().getPreComentarioCommentParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_9);
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

            // InternalDearCode.g:681:3: ( (lv_sustantivo_2_0= ruleMI_ID ) )
            // InternalDearCode.g:682:4: (lv_sustantivo_2_0= ruleMI_ID )
            {
            // InternalDearCode.g:682:4: (lv_sustantivo_2_0= ruleMI_ID )
            // InternalDearCode.g:683:5: lv_sustantivo_2_0= ruleMI_ID
            {

            					newCompositeNode(grammarAccess.getReasignarAccess().getSustantivoMI_IDParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
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

            // InternalDearCode.g:700:3: ( (lv_postComentario_3_0= ruleComment ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ANYTEXT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDearCode.g:701:4: (lv_postComentario_3_0= ruleComment )
                    {
                    // InternalDearCode.g:701:4: (lv_postComentario_3_0= ruleComment )
                    // InternalDearCode.g:702:5: lv_postComentario_3_0= ruleComment
                    {

                    					newCompositeNode(grammarAccess.getReasignarAccess().getPostComentarioCommentParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_10);
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

            // InternalDearCode.g:719:3: ( (lv_valor_4_0= ruleExpression ) )
            // InternalDearCode.g:720:4: (lv_valor_4_0= ruleExpression )
            {
            // InternalDearCode.g:720:4: (lv_valor_4_0= ruleExpression )
            // InternalDearCode.g:721:5: lv_valor_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getReasignarAccess().getValorExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
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

            // InternalDearCode.g:738:3: ( (lv_comentario_5_0= ruleComment ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ANYTEXT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDearCode.g:739:4: (lv_comentario_5_0= ruleComment )
                    {
                    // InternalDearCode.g:739:4: (lv_comentario_5_0= ruleComment )
                    // InternalDearCode.g:740:5: lv_comentario_5_0= ruleComment
                    {

                    					newCompositeNode(grammarAccess.getReasignarAccess().getComentarioCommentParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
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
    // InternalDearCode.g:761:1: entryRuleEntrada returns [EObject current=null] : iv_ruleEntrada= ruleEntrada EOF ;
    public final EObject entryRuleEntrada() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntrada = null;


        try {
            // InternalDearCode.g:761:48: (iv_ruleEntrada= ruleEntrada EOF )
            // InternalDearCode.g:762:2: iv_ruleEntrada= ruleEntrada EOF
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
    // InternalDearCode.g:768:1: ruleEntrada returns [EObject current=null] : ( (otherlv_0= 'Le ped\\u00ED al lector que me dijera' | otherlv_1= 'Le' | otherlv_2= 'Escucho tu voz en el viento' | otherlv_3= 'Atrapo un suspiro tuyo' | otherlv_4= 'Recojo tus palabras como p\\u00E9talos al alba' | otherlv_5= 'Tu aliento me habla en silencio' | otherlv_6= 'Acaricio el eco de tu voz' | otherlv_7= 'Guardo tus secretos en mi pecho' | otherlv_8= 'Espero tu susurro como un amanecer' ) ( (lv_variable_9_0= ruleMI_ID ) ) (otherlv_10= 'en un susurro num\\u00E9rico' | otherlv_11= 'con palabras de terciopelo' | otherlv_12= 'con un eco num\\u00E9rico' | otherlv_13= 'en un latido suave' | otherlv_14= 'como un verso escrito en el cielo' | otherlv_15= 'envuelto en la luz de tus ojos' | otherlv_16= 'con el perfume de tu esencia' | otherlv_17= 'danzando en el comp\\u00E1s de mi coraz\\u00F3n' | otherlv_18= 'tejiendo sue\\u00F1os con tus letras' )? otherlv_19= '.' ) ;
    public final EObject ruleEntrada() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        EObject lv_variable_9_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:774:2: ( ( (otherlv_0= 'Le ped\\u00ED al lector que me dijera' | otherlv_1= 'Le' | otherlv_2= 'Escucho tu voz en el viento' | otherlv_3= 'Atrapo un suspiro tuyo' | otherlv_4= 'Recojo tus palabras como p\\u00E9talos al alba' | otherlv_5= 'Tu aliento me habla en silencio' | otherlv_6= 'Acaricio el eco de tu voz' | otherlv_7= 'Guardo tus secretos en mi pecho' | otherlv_8= 'Espero tu susurro como un amanecer' ) ( (lv_variable_9_0= ruleMI_ID ) ) (otherlv_10= 'en un susurro num\\u00E9rico' | otherlv_11= 'con palabras de terciopelo' | otherlv_12= 'con un eco num\\u00E9rico' | otherlv_13= 'en un latido suave' | otherlv_14= 'como un verso escrito en el cielo' | otherlv_15= 'envuelto en la luz de tus ojos' | otherlv_16= 'con el perfume de tu esencia' | otherlv_17= 'danzando en el comp\\u00E1s de mi coraz\\u00F3n' | otherlv_18= 'tejiendo sue\\u00F1os con tus letras' )? otherlv_19= '.' ) )
            // InternalDearCode.g:775:2: ( (otherlv_0= 'Le ped\\u00ED al lector que me dijera' | otherlv_1= 'Le' | otherlv_2= 'Escucho tu voz en el viento' | otherlv_3= 'Atrapo un suspiro tuyo' | otherlv_4= 'Recojo tus palabras como p\\u00E9talos al alba' | otherlv_5= 'Tu aliento me habla en silencio' | otherlv_6= 'Acaricio el eco de tu voz' | otherlv_7= 'Guardo tus secretos en mi pecho' | otherlv_8= 'Espero tu susurro como un amanecer' ) ( (lv_variable_9_0= ruleMI_ID ) ) (otherlv_10= 'en un susurro num\\u00E9rico' | otherlv_11= 'con palabras de terciopelo' | otherlv_12= 'con un eco num\\u00E9rico' | otherlv_13= 'en un latido suave' | otherlv_14= 'como un verso escrito en el cielo' | otherlv_15= 'envuelto en la luz de tus ojos' | otherlv_16= 'con el perfume de tu esencia' | otherlv_17= 'danzando en el comp\\u00E1s de mi coraz\\u00F3n' | otherlv_18= 'tejiendo sue\\u00F1os con tus letras' )? otherlv_19= '.' )
            {
            // InternalDearCode.g:775:2: ( (otherlv_0= 'Le ped\\u00ED al lector que me dijera' | otherlv_1= 'Le' | otherlv_2= 'Escucho tu voz en el viento' | otherlv_3= 'Atrapo un suspiro tuyo' | otherlv_4= 'Recojo tus palabras como p\\u00E9talos al alba' | otherlv_5= 'Tu aliento me habla en silencio' | otherlv_6= 'Acaricio el eco de tu voz' | otherlv_7= 'Guardo tus secretos en mi pecho' | otherlv_8= 'Espero tu susurro como un amanecer' ) ( (lv_variable_9_0= ruleMI_ID ) ) (otherlv_10= 'en un susurro num\\u00E9rico' | otherlv_11= 'con palabras de terciopelo' | otherlv_12= 'con un eco num\\u00E9rico' | otherlv_13= 'en un latido suave' | otherlv_14= 'como un verso escrito en el cielo' | otherlv_15= 'envuelto en la luz de tus ojos' | otherlv_16= 'con el perfume de tu esencia' | otherlv_17= 'danzando en el comp\\u00E1s de mi coraz\\u00F3n' | otherlv_18= 'tejiendo sue\\u00F1os con tus letras' )? otherlv_19= '.' )
            // InternalDearCode.g:776:3: (otherlv_0= 'Le ped\\u00ED al lector que me dijera' | otherlv_1= 'Le' | otherlv_2= 'Escucho tu voz en el viento' | otherlv_3= 'Atrapo un suspiro tuyo' | otherlv_4= 'Recojo tus palabras como p\\u00E9talos al alba' | otherlv_5= 'Tu aliento me habla en silencio' | otherlv_6= 'Acaricio el eco de tu voz' | otherlv_7= 'Guardo tus secretos en mi pecho' | otherlv_8= 'Espero tu susurro como un amanecer' ) ( (lv_variable_9_0= ruleMI_ID ) ) (otherlv_10= 'en un susurro num\\u00E9rico' | otherlv_11= 'con palabras de terciopelo' | otherlv_12= 'con un eco num\\u00E9rico' | otherlv_13= 'en un latido suave' | otherlv_14= 'como un verso escrito en el cielo' | otherlv_15= 'envuelto en la luz de tus ojos' | otherlv_16= 'con el perfume de tu esencia' | otherlv_17= 'danzando en el comp\\u00E1s de mi coraz\\u00F3n' | otherlv_18= 'tejiendo sue\\u00F1os con tus letras' )? otherlv_19= '.'
            {
            // InternalDearCode.g:776:3: (otherlv_0= 'Le ped\\u00ED al lector que me dijera' | otherlv_1= 'Le' | otherlv_2= 'Escucho tu voz en el viento' | otherlv_3= 'Atrapo un suspiro tuyo' | otherlv_4= 'Recojo tus palabras como p\\u00E9talos al alba' | otherlv_5= 'Tu aliento me habla en silencio' | otherlv_6= 'Acaricio el eco de tu voz' | otherlv_7= 'Guardo tus secretos en mi pecho' | otherlv_8= 'Espero tu susurro como un amanecer' )
            int alt12=9;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt12=1;
                }
                break;
            case 26:
                {
                alt12=2;
                }
                break;
            case 27:
                {
                alt12=3;
                }
                break;
            case 28:
                {
                alt12=4;
                }
                break;
            case 29:
                {
                alt12=5;
                }
                break;
            case 30:
                {
                alt12=6;
                }
                break;
            case 31:
                {
                alt12=7;
                }
                break;
            case 32:
                {
                alt12=8;
                }
                break;
            case 33:
                {
                alt12=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalDearCode.g:777:4: otherlv_0= 'Le ped\\u00ED al lector que me dijera'
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getEntradaAccess().getLePedAlLectorQueMeDijeraKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:782:4: otherlv_1= 'Le'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getEntradaAccess().getLeKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalDearCode.g:787:4: otherlv_2= 'Escucho tu voz en el viento'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getEntradaAccess().getEscuchoTuVozEnElVientoKeyword_0_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalDearCode.g:792:4: otherlv_3= 'Atrapo un suspiro tuyo'
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getEntradaAccess().getAtrapoUnSuspiroTuyoKeyword_0_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalDearCode.g:797:4: otherlv_4= 'Recojo tus palabras como p\\u00E9talos al alba'
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getEntradaAccess().getRecojoTusPalabrasComoPTalosAlAlbaKeyword_0_4());
                    			

                    }
                    break;
                case 6 :
                    // InternalDearCode.g:802:4: otherlv_5= 'Tu aliento me habla en silencio'
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getEntradaAccess().getTuAlientoMeHablaEnSilencioKeyword_0_5());
                    			

                    }
                    break;
                case 7 :
                    // InternalDearCode.g:807:4: otherlv_6= 'Acaricio el eco de tu voz'
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getEntradaAccess().getAcaricioElEcoDeTuVozKeyword_0_6());
                    			

                    }
                    break;
                case 8 :
                    // InternalDearCode.g:812:4: otherlv_7= 'Guardo tus secretos en mi pecho'
                    {
                    otherlv_7=(Token)match(input,32,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getEntradaAccess().getGuardoTusSecretosEnMiPechoKeyword_0_7());
                    			

                    }
                    break;
                case 9 :
                    // InternalDearCode.g:817:4: otherlv_8= 'Espero tu susurro como un amanecer'
                    {
                    otherlv_8=(Token)match(input,33,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getEntradaAccess().getEsperoTuSusurroComoUnAmanecerKeyword_0_8());
                    			

                    }
                    break;

            }

            // InternalDearCode.g:822:3: ( (lv_variable_9_0= ruleMI_ID ) )
            // InternalDearCode.g:823:4: (lv_variable_9_0= ruleMI_ID )
            {
            // InternalDearCode.g:823:4: (lv_variable_9_0= ruleMI_ID )
            // InternalDearCode.g:824:5: lv_variable_9_0= ruleMI_ID
            {

            					newCompositeNode(grammarAccess.getEntradaAccess().getVariableMI_IDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_variable_9_0=ruleMI_ID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntradaRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_9_0,
            						"edu.upb.lp.DearCode.MI_ID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDearCode.g:841:3: (otherlv_10= 'en un susurro num\\u00E9rico' | otherlv_11= 'con palabras de terciopelo' | otherlv_12= 'con un eco num\\u00E9rico' | otherlv_13= 'en un latido suave' | otherlv_14= 'como un verso escrito en el cielo' | otherlv_15= 'envuelto en la luz de tus ojos' | otherlv_16= 'con el perfume de tu esencia' | otherlv_17= 'danzando en el comp\\u00E1s de mi coraz\\u00F3n' | otherlv_18= 'tejiendo sue\\u00F1os con tus letras' )?
            int alt13=10;
            switch ( input.LA(1) ) {
                case 34:
                    {
                    alt13=1;
                    }
                    break;
                case 35:
                    {
                    alt13=2;
                    }
                    break;
                case 36:
                    {
                    alt13=3;
                    }
                    break;
                case 37:
                    {
                    alt13=4;
                    }
                    break;
                case 38:
                    {
                    alt13=5;
                    }
                    break;
                case 39:
                    {
                    alt13=6;
                    }
                    break;
                case 40:
                    {
                    alt13=7;
                    }
                    break;
                case 41:
                    {
                    alt13=8;
                    }
                    break;
                case 42:
                    {
                    alt13=9;
                    }
                    break;
            }

            switch (alt13) {
                case 1 :
                    // InternalDearCode.g:842:4: otherlv_10= 'en un susurro num\\u00E9rico'
                    {
                    otherlv_10=(Token)match(input,34,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getEntradaAccess().getEnUnSusurroNumRicoKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:847:4: otherlv_11= 'con palabras de terciopelo'
                    {
                    otherlv_11=(Token)match(input,35,FOLLOW_6); 

                    				newLeafNode(otherlv_11, grammarAccess.getEntradaAccess().getConPalabrasDeTerciopeloKeyword_2_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalDearCode.g:852:4: otherlv_12= 'con un eco num\\u00E9rico'
                    {
                    otherlv_12=(Token)match(input,36,FOLLOW_6); 

                    				newLeafNode(otherlv_12, grammarAccess.getEntradaAccess().getConUnEcoNumRicoKeyword_2_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalDearCode.g:857:4: otherlv_13= 'en un latido suave'
                    {
                    otherlv_13=(Token)match(input,37,FOLLOW_6); 

                    				newLeafNode(otherlv_13, grammarAccess.getEntradaAccess().getEnUnLatidoSuaveKeyword_2_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalDearCode.g:862:4: otherlv_14= 'como un verso escrito en el cielo'
                    {
                    otherlv_14=(Token)match(input,38,FOLLOW_6); 

                    				newLeafNode(otherlv_14, grammarAccess.getEntradaAccess().getComoUnVersoEscritoEnElCieloKeyword_2_4());
                    			

                    }
                    break;
                case 6 :
                    // InternalDearCode.g:867:4: otherlv_15= 'envuelto en la luz de tus ojos'
                    {
                    otherlv_15=(Token)match(input,39,FOLLOW_6); 

                    				newLeafNode(otherlv_15, grammarAccess.getEntradaAccess().getEnvueltoEnLaLuzDeTusOjosKeyword_2_5());
                    			

                    }
                    break;
                case 7 :
                    // InternalDearCode.g:872:4: otherlv_16= 'con el perfume de tu esencia'
                    {
                    otherlv_16=(Token)match(input,40,FOLLOW_6); 

                    				newLeafNode(otherlv_16, grammarAccess.getEntradaAccess().getConElPerfumeDeTuEsenciaKeyword_2_6());
                    			

                    }
                    break;
                case 8 :
                    // InternalDearCode.g:877:4: otherlv_17= 'danzando en el comp\\u00E1s de mi coraz\\u00F3n'
                    {
                    otherlv_17=(Token)match(input,41,FOLLOW_6); 

                    				newLeafNode(otherlv_17, grammarAccess.getEntradaAccess().getDanzandoEnElCompSDeMiCorazNKeyword_2_7());
                    			

                    }
                    break;
                case 9 :
                    // InternalDearCode.g:882:4: otherlv_18= 'tejiendo sue\\u00F1os con tus letras'
                    {
                    otherlv_18=(Token)match(input,42,FOLLOW_6); 

                    				newLeafNode(otherlv_18, grammarAccess.getEntradaAccess().getTejiendoSueOsConTusLetrasKeyword_2_8());
                    			

                    }
                    break;

            }

            otherlv_19=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getEntradaAccess().getFullStopKeyword_3());
            		

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
    // InternalDearCode.g:895:1: entryRuleSalida returns [EObject current=null] : iv_ruleSalida= ruleSalida EOF ;
    public final EObject entryRuleSalida() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSalida = null;


        try {
            // InternalDearCode.g:895:47: (iv_ruleSalida= ruleSalida EOF )
            // InternalDearCode.g:896:2: iv_ruleSalida= ruleSalida EOF
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
    // InternalDearCode.g:902:1: ruleSalida returns [EObject current=null] : ( (otherlv_0= 'Hoy le quise contar al mundo sobre:' | otherlv_1= 'Dejo que el mundo sienta sobre:' | otherlv_2= 'Susurro al universo el secreto sobre:' | otherlv_3= 'Grabo en el firmamento mi verdad acerca de:' | otherlv_4= 'Canto al viento mi anhelo de:' | otherlv_5= 'Env\\u00EDo al horizonte mi pasi\\u00F3n sobre:' | otherlv_6= 'Dejo que las nubes abracen mi voz en:' ) ( (lv_expresion_7_0= ruleExpression ) ) ) ;
    public final EObject ruleSalida() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_expresion_7_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:908:2: ( ( (otherlv_0= 'Hoy le quise contar al mundo sobre:' | otherlv_1= 'Dejo que el mundo sienta sobre:' | otherlv_2= 'Susurro al universo el secreto sobre:' | otherlv_3= 'Grabo en el firmamento mi verdad acerca de:' | otherlv_4= 'Canto al viento mi anhelo de:' | otherlv_5= 'Env\\u00EDo al horizonte mi pasi\\u00F3n sobre:' | otherlv_6= 'Dejo que las nubes abracen mi voz en:' ) ( (lv_expresion_7_0= ruleExpression ) ) ) )
            // InternalDearCode.g:909:2: ( (otherlv_0= 'Hoy le quise contar al mundo sobre:' | otherlv_1= 'Dejo que el mundo sienta sobre:' | otherlv_2= 'Susurro al universo el secreto sobre:' | otherlv_3= 'Grabo en el firmamento mi verdad acerca de:' | otherlv_4= 'Canto al viento mi anhelo de:' | otherlv_5= 'Env\\u00EDo al horizonte mi pasi\\u00F3n sobre:' | otherlv_6= 'Dejo que las nubes abracen mi voz en:' ) ( (lv_expresion_7_0= ruleExpression ) ) )
            {
            // InternalDearCode.g:909:2: ( (otherlv_0= 'Hoy le quise contar al mundo sobre:' | otherlv_1= 'Dejo que el mundo sienta sobre:' | otherlv_2= 'Susurro al universo el secreto sobre:' | otherlv_3= 'Grabo en el firmamento mi verdad acerca de:' | otherlv_4= 'Canto al viento mi anhelo de:' | otherlv_5= 'Env\\u00EDo al horizonte mi pasi\\u00F3n sobre:' | otherlv_6= 'Dejo que las nubes abracen mi voz en:' ) ( (lv_expresion_7_0= ruleExpression ) ) )
            // InternalDearCode.g:910:3: (otherlv_0= 'Hoy le quise contar al mundo sobre:' | otherlv_1= 'Dejo que el mundo sienta sobre:' | otherlv_2= 'Susurro al universo el secreto sobre:' | otherlv_3= 'Grabo en el firmamento mi verdad acerca de:' | otherlv_4= 'Canto al viento mi anhelo de:' | otherlv_5= 'Env\\u00EDo al horizonte mi pasi\\u00F3n sobre:' | otherlv_6= 'Dejo que las nubes abracen mi voz en:' ) ( (lv_expresion_7_0= ruleExpression ) )
            {
            // InternalDearCode.g:910:3: (otherlv_0= 'Hoy le quise contar al mundo sobre:' | otherlv_1= 'Dejo que el mundo sienta sobre:' | otherlv_2= 'Susurro al universo el secreto sobre:' | otherlv_3= 'Grabo en el firmamento mi verdad acerca de:' | otherlv_4= 'Canto al viento mi anhelo de:' | otherlv_5= 'Env\\u00EDo al horizonte mi pasi\\u00F3n sobre:' | otherlv_6= 'Dejo que las nubes abracen mi voz en:' )
            int alt14=7;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt14=1;
                }
                break;
            case 44:
                {
                alt14=2;
                }
                break;
            case 45:
                {
                alt14=3;
                }
                break;
            case 46:
                {
                alt14=4;
                }
                break;
            case 47:
                {
                alt14=5;
                }
                break;
            case 48:
                {
                alt14=6;
                }
                break;
            case 49:
                {
                alt14=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalDearCode.g:911:4: otherlv_0= 'Hoy le quise contar al mundo sobre:'
                    {
                    otherlv_0=(Token)match(input,43,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getSalidaAccess().getHoyLeQuiseContarAlMundoSobreKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:916:4: otherlv_1= 'Dejo que el mundo sienta sobre:'
                    {
                    otherlv_1=(Token)match(input,44,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getSalidaAccess().getDejoQueElMundoSientaSobreKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalDearCode.g:921:4: otherlv_2= 'Susurro al universo el secreto sobre:'
                    {
                    otherlv_2=(Token)match(input,45,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getSalidaAccess().getSusurroAlUniversoElSecretoSobreKeyword_0_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalDearCode.g:926:4: otherlv_3= 'Grabo en el firmamento mi verdad acerca de:'
                    {
                    otherlv_3=(Token)match(input,46,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getSalidaAccess().getGraboEnElFirmamentoMiVerdadAcercaDeKeyword_0_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalDearCode.g:931:4: otherlv_4= 'Canto al viento mi anhelo de:'
                    {
                    otherlv_4=(Token)match(input,47,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getSalidaAccess().getCantoAlVientoMiAnheloDeKeyword_0_4());
                    			

                    }
                    break;
                case 6 :
                    // InternalDearCode.g:936:4: otherlv_5= 'Env\\u00EDo al horizonte mi pasi\\u00F3n sobre:'
                    {
                    otherlv_5=(Token)match(input,48,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getSalidaAccess().getEnvOAlHorizonteMiPasiNSobreKeyword_0_5());
                    			

                    }
                    break;
                case 7 :
                    // InternalDearCode.g:941:4: otherlv_6= 'Dejo que las nubes abracen mi voz en:'
                    {
                    otherlv_6=(Token)match(input,49,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getSalidaAccess().getDejoQueLasNubesAbracenMiVozEnKeyword_0_6());
                    			

                    }
                    break;

            }

            // InternalDearCode.g:946:3: ( (lv_expresion_7_0= ruleExpression ) )
            // InternalDearCode.g:947:4: (lv_expresion_7_0= ruleExpression )
            {
            // InternalDearCode.g:947:4: (lv_expresion_7_0= ruleExpression )
            // InternalDearCode.g:948:5: lv_expresion_7_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSalidaAccess().getExpresionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_expresion_7_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSalidaRule());
            					}
            					set(
            						current,
            						"expresion",
            						lv_expresion_7_0,
            						"edu.upb.lp.DearCode.Expression");
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
    // $ANTLR end "ruleSalida"


    // $ANTLR start "entryRuleElementoBloque"
    // InternalDearCode.g:969:1: entryRuleElementoBloque returns [EObject current=null] : iv_ruleElementoBloque= ruleElementoBloque EOF ;
    public final EObject entryRuleElementoBloque() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementoBloque = null;


        try {
            // InternalDearCode.g:969:55: (iv_ruleElementoBloque= ruleElementoBloque EOF )
            // InternalDearCode.g:970:2: iv_ruleElementoBloque= ruleElementoBloque EOF
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
    // InternalDearCode.g:976:1: ruleElementoBloque returns [EObject current=null] : (this_Instruccion_0= ruleInstruccion | this_Return_1= ruleReturn ) ;
    public final EObject ruleElementoBloque() throws RecognitionException {
        EObject current = null;

        EObject this_Instruccion_0 = null;

        EObject this_Return_1 = null;



        	enterRule();

        try {
            // InternalDearCode.g:982:2: ( (this_Instruccion_0= ruleInstruccion | this_Return_1= ruleReturn ) )
            // InternalDearCode.g:983:2: (this_Instruccion_0= ruleInstruccion | this_Return_1= ruleReturn )
            {
            // InternalDearCode.g:983:2: (this_Instruccion_0= ruleInstruccion | this_Return_1= ruleReturn )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=25 && LA15_0<=33)||(LA15_0>=43 && LA15_0<=54)||(LA15_0>=72 && LA15_0<=78)||(LA15_0>=89 && LA15_0<=93)||(LA15_0>=107 && LA15_0<=114)||(LA15_0>=200 && LA15_0<=203)||(LA15_0>=213 && LA15_0<=230)) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=131 && LA15_0<=135)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalDearCode.g:984:3: this_Instruccion_0= ruleInstruccion
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
                    // InternalDearCode.g:993:3: this_Return_1= ruleReturn
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
    // InternalDearCode.g:1005:1: entryRuleCondicional returns [EObject current=null] : iv_ruleCondicional= ruleCondicional EOF ;
    public final EObject entryRuleCondicional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondicional = null;


        try {
            // InternalDearCode.g:1005:52: (iv_ruleCondicional= ruleCondicional EOF )
            // InternalDearCode.g:1006:2: iv_ruleCondicional= ruleCondicional EOF
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
    // InternalDearCode.g:1012:1: ruleCondicional returns [EObject current=null] : ( (otherlv_0= 'Si en tu corazon sientes que' | otherlv_1= 'Si tu alma susurra que' | otherlv_2= 'Si el latido de mi alma dice que' | otherlv_3= 'Si el destino nos susurra que' | otherlv_4= 'Si la luna refleja que' ) ( (lv_condicion_5_0= ruleExpression ) ) otherlv_6= ',' ( (lv_comment_7_0= ruleComment ) )? (otherlv_8= 'entonces deja que estas palabras florezcan:' | otherlv_9= 'entonces que brote este amor:' | otherlv_10= 'entonces que nazca este sue\\u00F1o:' | otherlv_11= 'entonces que el universo conspire:' | otherlv_12= 'entonces que mi voz te abrace:' ) ( (lv_instruccionesThen_13_0= ruleElementoBloque ) )+ ( ( (otherlv_14= 'Pero si la noche calla otra verdad,' otherlv_15= 'que surja este suspiro:' ) | (otherlv_16= 'Pero si el viento trae otro mensaje,' otherlv_17= 'que despierte esta pasi\\u00F3n:' ) | (otherlv_18= 'Pero si el coraz\\u00F3n duda,' otherlv_19= 'que renazca esta esperanza:' ) ) ( (lv_instruccionesElse_20_0= ruleElementoBloque ) )+ )? (otherlv_21= 'Y as\\u00ED el universo sigue su curso.' | otherlv_22= 'As\\u00ED sigue el canto del coraz\\u00F3n.' | otherlv_23= 'Y as\\u00ED la melod\\u00EDa contin\\u00FAa.' | otherlv_24= 'Y el eco de nuestro amor perdura.' | otherlv_25= 'Y la danza de las estrellas sigue.' ) ) ;
    public final EObject ruleCondicional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        EObject lv_condicion_5_0 = null;

        EObject lv_comment_7_0 = null;

        EObject lv_instruccionesThen_13_0 = null;

        EObject lv_instruccionesElse_20_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:1018:2: ( ( (otherlv_0= 'Si en tu corazon sientes que' | otherlv_1= 'Si tu alma susurra que' | otherlv_2= 'Si el latido de mi alma dice que' | otherlv_3= 'Si el destino nos susurra que' | otherlv_4= 'Si la luna refleja que' ) ( (lv_condicion_5_0= ruleExpression ) ) otherlv_6= ',' ( (lv_comment_7_0= ruleComment ) )? (otherlv_8= 'entonces deja que estas palabras florezcan:' | otherlv_9= 'entonces que brote este amor:' | otherlv_10= 'entonces que nazca este sue\\u00F1o:' | otherlv_11= 'entonces que el universo conspire:' | otherlv_12= 'entonces que mi voz te abrace:' ) ( (lv_instruccionesThen_13_0= ruleElementoBloque ) )+ ( ( (otherlv_14= 'Pero si la noche calla otra verdad,' otherlv_15= 'que surja este suspiro:' ) | (otherlv_16= 'Pero si el viento trae otro mensaje,' otherlv_17= 'que despierte esta pasi\\u00F3n:' ) | (otherlv_18= 'Pero si el coraz\\u00F3n duda,' otherlv_19= 'que renazca esta esperanza:' ) ) ( (lv_instruccionesElse_20_0= ruleElementoBloque ) )+ )? (otherlv_21= 'Y as\\u00ED el universo sigue su curso.' | otherlv_22= 'As\\u00ED sigue el canto del coraz\\u00F3n.' | otherlv_23= 'Y as\\u00ED la melod\\u00EDa contin\\u00FAa.' | otherlv_24= 'Y el eco de nuestro amor perdura.' | otherlv_25= 'Y la danza de las estrellas sigue.' ) ) )
            // InternalDearCode.g:1019:2: ( (otherlv_0= 'Si en tu corazon sientes que' | otherlv_1= 'Si tu alma susurra que' | otherlv_2= 'Si el latido de mi alma dice que' | otherlv_3= 'Si el destino nos susurra que' | otherlv_4= 'Si la luna refleja que' ) ( (lv_condicion_5_0= ruleExpression ) ) otherlv_6= ',' ( (lv_comment_7_0= ruleComment ) )? (otherlv_8= 'entonces deja que estas palabras florezcan:' | otherlv_9= 'entonces que brote este amor:' | otherlv_10= 'entonces que nazca este sue\\u00F1o:' | otherlv_11= 'entonces que el universo conspire:' | otherlv_12= 'entonces que mi voz te abrace:' ) ( (lv_instruccionesThen_13_0= ruleElementoBloque ) )+ ( ( (otherlv_14= 'Pero si la noche calla otra verdad,' otherlv_15= 'que surja este suspiro:' ) | (otherlv_16= 'Pero si el viento trae otro mensaje,' otherlv_17= 'que despierte esta pasi\\u00F3n:' ) | (otherlv_18= 'Pero si el coraz\\u00F3n duda,' otherlv_19= 'que renazca esta esperanza:' ) ) ( (lv_instruccionesElse_20_0= ruleElementoBloque ) )+ )? (otherlv_21= 'Y as\\u00ED el universo sigue su curso.' | otherlv_22= 'As\\u00ED sigue el canto del coraz\\u00F3n.' | otherlv_23= 'Y as\\u00ED la melod\\u00EDa contin\\u00FAa.' | otherlv_24= 'Y el eco de nuestro amor perdura.' | otherlv_25= 'Y la danza de las estrellas sigue.' ) )
            {
            // InternalDearCode.g:1019:2: ( (otherlv_0= 'Si en tu corazon sientes que' | otherlv_1= 'Si tu alma susurra que' | otherlv_2= 'Si el latido de mi alma dice que' | otherlv_3= 'Si el destino nos susurra que' | otherlv_4= 'Si la luna refleja que' ) ( (lv_condicion_5_0= ruleExpression ) ) otherlv_6= ',' ( (lv_comment_7_0= ruleComment ) )? (otherlv_8= 'entonces deja que estas palabras florezcan:' | otherlv_9= 'entonces que brote este amor:' | otherlv_10= 'entonces que nazca este sue\\u00F1o:' | otherlv_11= 'entonces que el universo conspire:' | otherlv_12= 'entonces que mi voz te abrace:' ) ( (lv_instruccionesThen_13_0= ruleElementoBloque ) )+ ( ( (otherlv_14= 'Pero si la noche calla otra verdad,' otherlv_15= 'que surja este suspiro:' ) | (otherlv_16= 'Pero si el viento trae otro mensaje,' otherlv_17= 'que despierte esta pasi\\u00F3n:' ) | (otherlv_18= 'Pero si el coraz\\u00F3n duda,' otherlv_19= 'que renazca esta esperanza:' ) ) ( (lv_instruccionesElse_20_0= ruleElementoBloque ) )+ )? (otherlv_21= 'Y as\\u00ED el universo sigue su curso.' | otherlv_22= 'As\\u00ED sigue el canto del coraz\\u00F3n.' | otherlv_23= 'Y as\\u00ED la melod\\u00EDa contin\\u00FAa.' | otherlv_24= 'Y el eco de nuestro amor perdura.' | otherlv_25= 'Y la danza de las estrellas sigue.' ) )
            // InternalDearCode.g:1020:3: (otherlv_0= 'Si en tu corazon sientes que' | otherlv_1= 'Si tu alma susurra que' | otherlv_2= 'Si el latido de mi alma dice que' | otherlv_3= 'Si el destino nos susurra que' | otherlv_4= 'Si la luna refleja que' ) ( (lv_condicion_5_0= ruleExpression ) ) otherlv_6= ',' ( (lv_comment_7_0= ruleComment ) )? (otherlv_8= 'entonces deja que estas palabras florezcan:' | otherlv_9= 'entonces que brote este amor:' | otherlv_10= 'entonces que nazca este sue\\u00F1o:' | otherlv_11= 'entonces que el universo conspire:' | otherlv_12= 'entonces que mi voz te abrace:' ) ( (lv_instruccionesThen_13_0= ruleElementoBloque ) )+ ( ( (otherlv_14= 'Pero si la noche calla otra verdad,' otherlv_15= 'que surja este suspiro:' ) | (otherlv_16= 'Pero si el viento trae otro mensaje,' otherlv_17= 'que despierte esta pasi\\u00F3n:' ) | (otherlv_18= 'Pero si el coraz\\u00F3n duda,' otherlv_19= 'que renazca esta esperanza:' ) ) ( (lv_instruccionesElse_20_0= ruleElementoBloque ) )+ )? (otherlv_21= 'Y as\\u00ED el universo sigue su curso.' | otherlv_22= 'As\\u00ED sigue el canto del coraz\\u00F3n.' | otherlv_23= 'Y as\\u00ED la melod\\u00EDa contin\\u00FAa.' | otherlv_24= 'Y el eco de nuestro amor perdura.' | otherlv_25= 'Y la danza de las estrellas sigue.' )
            {
            // InternalDearCode.g:1020:3: (otherlv_0= 'Si en tu corazon sientes que' | otherlv_1= 'Si tu alma susurra que' | otherlv_2= 'Si el latido de mi alma dice que' | otherlv_3= 'Si el destino nos susurra que' | otherlv_4= 'Si la luna refleja que' )
            int alt16=5;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt16=1;
                }
                break;
            case 51:
                {
                alt16=2;
                }
                break;
            case 52:
                {
                alt16=3;
                }
                break;
            case 53:
                {
                alt16=4;
                }
                break;
            case 54:
                {
                alt16=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalDearCode.g:1021:4: otherlv_0= 'Si en tu corazon sientes que'
                    {
                    otherlv_0=(Token)match(input,50,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getCondicionalAccess().getSiEnTuCorazonSientesQueKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:1026:4: otherlv_1= 'Si tu alma susurra que'
                    {
                    otherlv_1=(Token)match(input,51,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getCondicionalAccess().getSiTuAlmaSusurraQueKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalDearCode.g:1031:4: otherlv_2= 'Si el latido de mi alma dice que'
                    {
                    otherlv_2=(Token)match(input,52,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getCondicionalAccess().getSiElLatidoDeMiAlmaDiceQueKeyword_0_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalDearCode.g:1036:4: otherlv_3= 'Si el destino nos susurra que'
                    {
                    otherlv_3=(Token)match(input,53,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getCondicionalAccess().getSiElDestinoNosSusurraQueKeyword_0_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalDearCode.g:1041:4: otherlv_4= 'Si la luna refleja que'
                    {
                    otherlv_4=(Token)match(input,54,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getCondicionalAccess().getSiLaLunaReflejaQueKeyword_0_4());
                    			

                    }
                    break;

            }

            // InternalDearCode.g:1046:3: ( (lv_condicion_5_0= ruleExpression ) )
            // InternalDearCode.g:1047:4: (lv_condicion_5_0= ruleExpression )
            {
            // InternalDearCode.g:1047:4: (lv_condicion_5_0= ruleExpression )
            // InternalDearCode.g:1048:5: lv_condicion_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getCondicionalAccess().getCondicionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_condicion_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCondicionalRule());
            					}
            					set(
            						current,
            						"condicion",
            						lv_condicion_5_0,
            						"edu.upb.lp.DearCode.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,55,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getCondicionalAccess().getCommaKeyword_2());
            		
            // InternalDearCode.g:1069:3: ( (lv_comment_7_0= ruleComment ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ANYTEXT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDearCode.g:1070:4: (lv_comment_7_0= ruleComment )
                    {
                    // InternalDearCode.g:1070:4: (lv_comment_7_0= ruleComment )
                    // InternalDearCode.g:1071:5: lv_comment_7_0= ruleComment
                    {

                    					newCompositeNode(grammarAccess.getCondicionalAccess().getCommentCommentParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_16);
                    lv_comment_7_0=ruleComment();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCondicionalRule());
                    					}
                    					add(
                    						current,
                    						"comment",
                    						lv_comment_7_0,
                    						"edu.upb.lp.DearCode.Comment");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDearCode.g:1088:3: (otherlv_8= 'entonces deja que estas palabras florezcan:' | otherlv_9= 'entonces que brote este amor:' | otherlv_10= 'entonces que nazca este sue\\u00F1o:' | otherlv_11= 'entonces que el universo conspire:' | otherlv_12= 'entonces que mi voz te abrace:' )
            int alt18=5;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt18=1;
                }
                break;
            case 57:
                {
                alt18=2;
                }
                break;
            case 58:
                {
                alt18=3;
                }
                break;
            case 59:
                {
                alt18=4;
                }
                break;
            case 60:
                {
                alt18=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalDearCode.g:1089:4: otherlv_8= 'entonces deja que estas palabras florezcan:'
                    {
                    otherlv_8=(Token)match(input,56,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getCondicionalAccess().getEntoncesDejaQueEstasPalabrasFlorezcanKeyword_4_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:1094:4: otherlv_9= 'entonces que brote este amor:'
                    {
                    otherlv_9=(Token)match(input,57,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getCondicionalAccess().getEntoncesQueBroteEsteAmorKeyword_4_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalDearCode.g:1099:4: otherlv_10= 'entonces que nazca este sue\\u00F1o:'
                    {
                    otherlv_10=(Token)match(input,58,FOLLOW_17); 

                    				newLeafNode(otherlv_10, grammarAccess.getCondicionalAccess().getEntoncesQueNazcaEsteSueOKeyword_4_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalDearCode.g:1104:4: otherlv_11= 'entonces que el universo conspire:'
                    {
                    otherlv_11=(Token)match(input,59,FOLLOW_17); 

                    				newLeafNode(otherlv_11, grammarAccess.getCondicionalAccess().getEntoncesQueElUniversoConspireKeyword_4_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalDearCode.g:1109:4: otherlv_12= 'entonces que mi voz te abrace:'
                    {
                    otherlv_12=(Token)match(input,60,FOLLOW_17); 

                    				newLeafNode(otherlv_12, grammarAccess.getCondicionalAccess().getEntoncesQueMiVozTeAbraceKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalDearCode.g:1114:3: ( (lv_instruccionesThen_13_0= ruleElementoBloque ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=25 && LA19_0<=33)||(LA19_0>=43 && LA19_0<=54)||(LA19_0>=72 && LA19_0<=78)||(LA19_0>=89 && LA19_0<=93)||(LA19_0>=107 && LA19_0<=114)||(LA19_0>=131 && LA19_0<=135)||(LA19_0>=200 && LA19_0<=203)||(LA19_0>=213 && LA19_0<=230)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDearCode.g:1115:4: (lv_instruccionesThen_13_0= ruleElementoBloque )
            	    {
            	    // InternalDearCode.g:1115:4: (lv_instruccionesThen_13_0= ruleElementoBloque )
            	    // InternalDearCode.g:1116:5: lv_instruccionesThen_13_0= ruleElementoBloque
            	    {

            	    					newCompositeNode(grammarAccess.getCondicionalAccess().getInstruccionesThenElementoBloqueParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_instruccionesThen_13_0=ruleElementoBloque();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCondicionalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instruccionesThen",
            	    						lv_instruccionesThen_13_0,
            	    						"edu.upb.lp.DearCode.ElementoBloque");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);

            // InternalDearCode.g:1133:3: ( ( (otherlv_14= 'Pero si la noche calla otra verdad,' otherlv_15= 'que surja este suspiro:' ) | (otherlv_16= 'Pero si el viento trae otro mensaje,' otherlv_17= 'que despierte esta pasi\\u00F3n:' ) | (otherlv_18= 'Pero si el coraz\\u00F3n duda,' otherlv_19= 'que renazca esta esperanza:' ) ) ( (lv_instruccionesElse_20_0= ruleElementoBloque ) )+ )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==61||LA22_0==63||LA22_0==65) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDearCode.g:1134:4: ( (otherlv_14= 'Pero si la noche calla otra verdad,' otherlv_15= 'que surja este suspiro:' ) | (otherlv_16= 'Pero si el viento trae otro mensaje,' otherlv_17= 'que despierte esta pasi\\u00F3n:' ) | (otherlv_18= 'Pero si el coraz\\u00F3n duda,' otherlv_19= 'que renazca esta esperanza:' ) ) ( (lv_instruccionesElse_20_0= ruleElementoBloque ) )+
                    {
                    // InternalDearCode.g:1134:4: ( (otherlv_14= 'Pero si la noche calla otra verdad,' otherlv_15= 'que surja este suspiro:' ) | (otherlv_16= 'Pero si el viento trae otro mensaje,' otherlv_17= 'que despierte esta pasi\\u00F3n:' ) | (otherlv_18= 'Pero si el coraz\\u00F3n duda,' otherlv_19= 'que renazca esta esperanza:' ) )
                    int alt20=3;
                    switch ( input.LA(1) ) {
                    case 61:
                        {
                        alt20=1;
                        }
                        break;
                    case 63:
                        {
                        alt20=2;
                        }
                        break;
                    case 65:
                        {
                        alt20=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }

                    switch (alt20) {
                        case 1 :
                            // InternalDearCode.g:1135:5: (otherlv_14= 'Pero si la noche calla otra verdad,' otherlv_15= 'que surja este suspiro:' )
                            {
                            // InternalDearCode.g:1135:5: (otherlv_14= 'Pero si la noche calla otra verdad,' otherlv_15= 'que surja este suspiro:' )
                            // InternalDearCode.g:1136:6: otherlv_14= 'Pero si la noche calla otra verdad,' otherlv_15= 'que surja este suspiro:'
                            {
                            otherlv_14=(Token)match(input,61,FOLLOW_19); 

                            						newLeafNode(otherlv_14, grammarAccess.getCondicionalAccess().getPeroSiLaNocheCallaOtraVerdadKeyword_6_0_0_0());
                            					
                            otherlv_15=(Token)match(input,62,FOLLOW_17); 

                            						newLeafNode(otherlv_15, grammarAccess.getCondicionalAccess().getQueSurjaEsteSuspiroKeyword_6_0_0_1());
                            					

                            }


                            }
                            break;
                        case 2 :
                            // InternalDearCode.g:1146:5: (otherlv_16= 'Pero si el viento trae otro mensaje,' otherlv_17= 'que despierte esta pasi\\u00F3n:' )
                            {
                            // InternalDearCode.g:1146:5: (otherlv_16= 'Pero si el viento trae otro mensaje,' otherlv_17= 'que despierte esta pasi\\u00F3n:' )
                            // InternalDearCode.g:1147:6: otherlv_16= 'Pero si el viento trae otro mensaje,' otherlv_17= 'que despierte esta pasi\\u00F3n:'
                            {
                            otherlv_16=(Token)match(input,63,FOLLOW_20); 

                            						newLeafNode(otherlv_16, grammarAccess.getCondicionalAccess().getPeroSiElVientoTraeOtroMensajeKeyword_6_0_1_0());
                            					
                            otherlv_17=(Token)match(input,64,FOLLOW_17); 

                            						newLeafNode(otherlv_17, grammarAccess.getCondicionalAccess().getQueDespierteEstaPasiNKeyword_6_0_1_1());
                            					

                            }


                            }
                            break;
                        case 3 :
                            // InternalDearCode.g:1157:5: (otherlv_18= 'Pero si el coraz\\u00F3n duda,' otherlv_19= 'que renazca esta esperanza:' )
                            {
                            // InternalDearCode.g:1157:5: (otherlv_18= 'Pero si el coraz\\u00F3n duda,' otherlv_19= 'que renazca esta esperanza:' )
                            // InternalDearCode.g:1158:6: otherlv_18= 'Pero si el coraz\\u00F3n duda,' otherlv_19= 'que renazca esta esperanza:'
                            {
                            otherlv_18=(Token)match(input,65,FOLLOW_21); 

                            						newLeafNode(otherlv_18, grammarAccess.getCondicionalAccess().getPeroSiElCorazNDudaKeyword_6_0_2_0());
                            					
                            otherlv_19=(Token)match(input,66,FOLLOW_17); 

                            						newLeafNode(otherlv_19, grammarAccess.getCondicionalAccess().getQueRenazcaEstaEsperanzaKeyword_6_0_2_1());
                            					

                            }


                            }
                            break;

                    }

                    // InternalDearCode.g:1168:4: ( (lv_instruccionesElse_20_0= ruleElementoBloque ) )+
                    int cnt21=0;
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( ((LA21_0>=25 && LA21_0<=33)||(LA21_0>=43 && LA21_0<=54)||(LA21_0>=72 && LA21_0<=78)||(LA21_0>=89 && LA21_0<=93)||(LA21_0>=107 && LA21_0<=114)||(LA21_0>=131 && LA21_0<=135)||(LA21_0>=200 && LA21_0<=203)||(LA21_0>=213 && LA21_0<=230)) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalDearCode.g:1169:5: (lv_instruccionesElse_20_0= ruleElementoBloque )
                    	    {
                    	    // InternalDearCode.g:1169:5: (lv_instruccionesElse_20_0= ruleElementoBloque )
                    	    // InternalDearCode.g:1170:6: lv_instruccionesElse_20_0= ruleElementoBloque
                    	    {

                    	    						newCompositeNode(grammarAccess.getCondicionalAccess().getInstruccionesElseElementoBloqueParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_22);
                    	    lv_instruccionesElse_20_0=ruleElementoBloque();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCondicionalRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"instruccionesElse",
                    	    							lv_instruccionesElse_20_0,
                    	    							"edu.upb.lp.DearCode.ElementoBloque");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt21 >= 1 ) break loop21;
                                EarlyExitException eee =
                                    new EarlyExitException(21, input);
                                throw eee;
                        }
                        cnt21++;
                    } while (true);


                    }
                    break;

            }

            // InternalDearCode.g:1188:3: (otherlv_21= 'Y as\\u00ED el universo sigue su curso.' | otherlv_22= 'As\\u00ED sigue el canto del coraz\\u00F3n.' | otherlv_23= 'Y as\\u00ED la melod\\u00EDa contin\\u00FAa.' | otherlv_24= 'Y el eco de nuestro amor perdura.' | otherlv_25= 'Y la danza de las estrellas sigue.' )
            int alt23=5;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt23=1;
                }
                break;
            case 68:
                {
                alt23=2;
                }
                break;
            case 69:
                {
                alt23=3;
                }
                break;
            case 70:
                {
                alt23=4;
                }
                break;
            case 71:
                {
                alt23=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalDearCode.g:1189:4: otherlv_21= 'Y as\\u00ED el universo sigue su curso.'
                    {
                    otherlv_21=(Token)match(input,67,FOLLOW_2); 

                    				newLeafNode(otherlv_21, grammarAccess.getCondicionalAccess().getYAsElUniversoSigueSuCursoKeyword_7_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:1194:4: otherlv_22= 'As\\u00ED sigue el canto del coraz\\u00F3n.'
                    {
                    otherlv_22=(Token)match(input,68,FOLLOW_2); 

                    				newLeafNode(otherlv_22, grammarAccess.getCondicionalAccess().getAsSigueElCantoDelCorazNKeyword_7_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalDearCode.g:1199:4: otherlv_23= 'Y as\\u00ED la melod\\u00EDa contin\\u00FAa.'
                    {
                    otherlv_23=(Token)match(input,69,FOLLOW_2); 

                    				newLeafNode(otherlv_23, grammarAccess.getCondicionalAccess().getYAsLaMelodAContinAKeyword_7_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalDearCode.g:1204:4: otherlv_24= 'Y el eco de nuestro amor perdura.'
                    {
                    otherlv_24=(Token)match(input,70,FOLLOW_2); 

                    				newLeafNode(otherlv_24, grammarAccess.getCondicionalAccess().getYElEcoDeNuestroAmorPerduraKeyword_7_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalDearCode.g:1209:4: otherlv_25= 'Y la danza de las estrellas sigue.'
                    {
                    otherlv_25=(Token)match(input,71,FOLLOW_2); 

                    				newLeafNode(otherlv_25, grammarAccess.getCondicionalAccess().getYLaDanzaDeLasEstrellasSigueKeyword_7_4());
                    			

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
    // InternalDearCode.g:1218:1: entryRuleBucleWhile returns [EObject current=null] : iv_ruleBucleWhile= ruleBucleWhile EOF ;
    public final EObject entryRuleBucleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBucleWhile = null;


        try {
            // InternalDearCode.g:1218:51: (iv_ruleBucleWhile= ruleBucleWhile EOF )
            // InternalDearCode.g:1219:2: iv_ruleBucleWhile= ruleBucleWhile EOF
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
    // InternalDearCode.g:1225:1: ruleBucleWhile returns [EObject current=null] : ( (otherlv_0= 'Mientras aun me piensas' | otherlv_1= 'Mientras a\\u00FAn sue\\u00F1es con este momento' | otherlv_2= 'Mientras mi coraz\\u00F3n te anhele' | otherlv_3= 'Mientras tu luz me gu\\u00EDe' | otherlv_4= 'Mientras el fuego de mi amor arda' | otherlv_5= 'Mientras la luna nos ilumine' | otherlv_6= 'Mientras tus ojos me miren' ) ( (lv_condicion_7_0= ruleExpression ) ) otherlv_8= ',' (otherlv_9= 'haz que suceda:' | otherlv_10= 'tejiendo este amor:' | otherlv_11= 'deja que el tiempo se detenga:' | otherlv_12= 'haz que el universo conspire:' | otherlv_13= 'permite que el destino nos una:' ) ( (lv_loopBody_14_0= ruleElementoBloque ) )+ (otherlv_15= 'Y as\\u00ED el susurro descansa.' | otherlv_16= 'hasta que el anhelo repose' | otherlv_17= 'Y el silencio envuelve nuestro amor.' | otherlv_18= 'Hasta que la eternidad nos encuentre.' | otherlv_19= 'Y la pasi\\u00F3n se convierte en recuerdo.' ) ) ;
    public final EObject ruleBucleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        EObject lv_condicion_7_0 = null;

        EObject lv_loopBody_14_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:1231:2: ( ( (otherlv_0= 'Mientras aun me piensas' | otherlv_1= 'Mientras a\\u00FAn sue\\u00F1es con este momento' | otherlv_2= 'Mientras mi coraz\\u00F3n te anhele' | otherlv_3= 'Mientras tu luz me gu\\u00EDe' | otherlv_4= 'Mientras el fuego de mi amor arda' | otherlv_5= 'Mientras la luna nos ilumine' | otherlv_6= 'Mientras tus ojos me miren' ) ( (lv_condicion_7_0= ruleExpression ) ) otherlv_8= ',' (otherlv_9= 'haz que suceda:' | otherlv_10= 'tejiendo este amor:' | otherlv_11= 'deja que el tiempo se detenga:' | otherlv_12= 'haz que el universo conspire:' | otherlv_13= 'permite que el destino nos una:' ) ( (lv_loopBody_14_0= ruleElementoBloque ) )+ (otherlv_15= 'Y as\\u00ED el susurro descansa.' | otherlv_16= 'hasta que el anhelo repose' | otherlv_17= 'Y el silencio envuelve nuestro amor.' | otherlv_18= 'Hasta que la eternidad nos encuentre.' | otherlv_19= 'Y la pasi\\u00F3n se convierte en recuerdo.' ) ) )
            // InternalDearCode.g:1232:2: ( (otherlv_0= 'Mientras aun me piensas' | otherlv_1= 'Mientras a\\u00FAn sue\\u00F1es con este momento' | otherlv_2= 'Mientras mi coraz\\u00F3n te anhele' | otherlv_3= 'Mientras tu luz me gu\\u00EDe' | otherlv_4= 'Mientras el fuego de mi amor arda' | otherlv_5= 'Mientras la luna nos ilumine' | otherlv_6= 'Mientras tus ojos me miren' ) ( (lv_condicion_7_0= ruleExpression ) ) otherlv_8= ',' (otherlv_9= 'haz que suceda:' | otherlv_10= 'tejiendo este amor:' | otherlv_11= 'deja que el tiempo se detenga:' | otherlv_12= 'haz que el universo conspire:' | otherlv_13= 'permite que el destino nos una:' ) ( (lv_loopBody_14_0= ruleElementoBloque ) )+ (otherlv_15= 'Y as\\u00ED el susurro descansa.' | otherlv_16= 'hasta que el anhelo repose' | otherlv_17= 'Y el silencio envuelve nuestro amor.' | otherlv_18= 'Hasta que la eternidad nos encuentre.' | otherlv_19= 'Y la pasi\\u00F3n se convierte en recuerdo.' ) )
            {
            // InternalDearCode.g:1232:2: ( (otherlv_0= 'Mientras aun me piensas' | otherlv_1= 'Mientras a\\u00FAn sue\\u00F1es con este momento' | otherlv_2= 'Mientras mi coraz\\u00F3n te anhele' | otherlv_3= 'Mientras tu luz me gu\\u00EDe' | otherlv_4= 'Mientras el fuego de mi amor arda' | otherlv_5= 'Mientras la luna nos ilumine' | otherlv_6= 'Mientras tus ojos me miren' ) ( (lv_condicion_7_0= ruleExpression ) ) otherlv_8= ',' (otherlv_9= 'haz que suceda:' | otherlv_10= 'tejiendo este amor:' | otherlv_11= 'deja que el tiempo se detenga:' | otherlv_12= 'haz que el universo conspire:' | otherlv_13= 'permite que el destino nos una:' ) ( (lv_loopBody_14_0= ruleElementoBloque ) )+ (otherlv_15= 'Y as\\u00ED el susurro descansa.' | otherlv_16= 'hasta que el anhelo repose' | otherlv_17= 'Y el silencio envuelve nuestro amor.' | otherlv_18= 'Hasta que la eternidad nos encuentre.' | otherlv_19= 'Y la pasi\\u00F3n se convierte en recuerdo.' ) )
            // InternalDearCode.g:1233:3: (otherlv_0= 'Mientras aun me piensas' | otherlv_1= 'Mientras a\\u00FAn sue\\u00F1es con este momento' | otherlv_2= 'Mientras mi coraz\\u00F3n te anhele' | otherlv_3= 'Mientras tu luz me gu\\u00EDe' | otherlv_4= 'Mientras el fuego de mi amor arda' | otherlv_5= 'Mientras la luna nos ilumine' | otherlv_6= 'Mientras tus ojos me miren' ) ( (lv_condicion_7_0= ruleExpression ) ) otherlv_8= ',' (otherlv_9= 'haz que suceda:' | otherlv_10= 'tejiendo este amor:' | otherlv_11= 'deja que el tiempo se detenga:' | otherlv_12= 'haz que el universo conspire:' | otherlv_13= 'permite que el destino nos una:' ) ( (lv_loopBody_14_0= ruleElementoBloque ) )+ (otherlv_15= 'Y as\\u00ED el susurro descansa.' | otherlv_16= 'hasta que el anhelo repose' | otherlv_17= 'Y el silencio envuelve nuestro amor.' | otherlv_18= 'Hasta que la eternidad nos encuentre.' | otherlv_19= 'Y la pasi\\u00F3n se convierte en recuerdo.' )
            {
            // InternalDearCode.g:1233:3: (otherlv_0= 'Mientras aun me piensas' | otherlv_1= 'Mientras a\\u00FAn sue\\u00F1es con este momento' | otherlv_2= 'Mientras mi coraz\\u00F3n te anhele' | otherlv_3= 'Mientras tu luz me gu\\u00EDe' | otherlv_4= 'Mientras el fuego de mi amor arda' | otherlv_5= 'Mientras la luna nos ilumine' | otherlv_6= 'Mientras tus ojos me miren' )
            int alt24=7;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt24=1;
                }
                break;
            case 73:
                {
                alt24=2;
                }
                break;
            case 74:
                {
                alt24=3;
                }
                break;
            case 75:
                {
                alt24=4;
                }
                break;
            case 76:
                {
                alt24=5;
                }
                break;
            case 77:
                {
                alt24=6;
                }
                break;
            case 78:
                {
                alt24=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalDearCode.g:1234:4: otherlv_0= 'Mientras aun me piensas'
                    {
                    otherlv_0=(Token)match(input,72,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getBucleWhileAccess().getMientrasAunMePiensasKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:1239:4: otherlv_1= 'Mientras a\\u00FAn sue\\u00F1es con este momento'
                    {
                    otherlv_1=(Token)match(input,73,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getBucleWhileAccess().getMientrasANSueEsConEsteMomentoKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalDearCode.g:1244:4: otherlv_2= 'Mientras mi coraz\\u00F3n te anhele'
                    {
                    otherlv_2=(Token)match(input,74,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getBucleWhileAccess().getMientrasMiCorazNTeAnheleKeyword_0_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalDearCode.g:1249:4: otherlv_3= 'Mientras tu luz me gu\\u00EDe'
                    {
                    otherlv_3=(Token)match(input,75,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getBucleWhileAccess().getMientrasTuLuzMeGuEKeyword_0_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalDearCode.g:1254:4: otherlv_4= 'Mientras el fuego de mi amor arda'
                    {
                    otherlv_4=(Token)match(input,76,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getBucleWhileAccess().getMientrasElFuegoDeMiAmorArdaKeyword_0_4());
                    			

                    }
                    break;
                case 6 :
                    // InternalDearCode.g:1259:4: otherlv_5= 'Mientras la luna nos ilumine'
                    {
                    otherlv_5=(Token)match(input,77,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getBucleWhileAccess().getMientrasLaLunaNosIlumineKeyword_0_5());
                    			

                    }
                    break;
                case 7 :
                    // InternalDearCode.g:1264:4: otherlv_6= 'Mientras tus ojos me miren'
                    {
                    otherlv_6=(Token)match(input,78,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getBucleWhileAccess().getMientrasTusOjosMeMirenKeyword_0_6());
                    			

                    }
                    break;

            }

            // InternalDearCode.g:1269:3: ( (lv_condicion_7_0= ruleExpression ) )
            // InternalDearCode.g:1270:4: (lv_condicion_7_0= ruleExpression )
            {
            // InternalDearCode.g:1270:4: (lv_condicion_7_0= ruleExpression )
            // InternalDearCode.g:1271:5: lv_condicion_7_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getBucleWhileAccess().getCondicionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_condicion_7_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBucleWhileRule());
            					}
            					set(
            						current,
            						"condicion",
            						lv_condicion_7_0,
            						"edu.upb.lp.DearCode.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,55,FOLLOW_23); 

            			newLeafNode(otherlv_8, grammarAccess.getBucleWhileAccess().getCommaKeyword_2());
            		
            // InternalDearCode.g:1292:3: (otherlv_9= 'haz que suceda:' | otherlv_10= 'tejiendo este amor:' | otherlv_11= 'deja que el tiempo se detenga:' | otherlv_12= 'haz que el universo conspire:' | otherlv_13= 'permite que el destino nos una:' )
            int alt25=5;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt25=1;
                }
                break;
            case 80:
                {
                alt25=2;
                }
                break;
            case 81:
                {
                alt25=3;
                }
                break;
            case 82:
                {
                alt25=4;
                }
                break;
            case 83:
                {
                alt25=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalDearCode.g:1293:4: otherlv_9= 'haz que suceda:'
                    {
                    otherlv_9=(Token)match(input,79,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getBucleWhileAccess().getHazQueSucedaKeyword_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:1298:4: otherlv_10= 'tejiendo este amor:'
                    {
                    otherlv_10=(Token)match(input,80,FOLLOW_17); 

                    				newLeafNode(otherlv_10, grammarAccess.getBucleWhileAccess().getTejiendoEsteAmorKeyword_3_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalDearCode.g:1303:4: otherlv_11= 'deja que el tiempo se detenga:'
                    {
                    otherlv_11=(Token)match(input,81,FOLLOW_17); 

                    				newLeafNode(otherlv_11, grammarAccess.getBucleWhileAccess().getDejaQueElTiempoSeDetengaKeyword_3_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalDearCode.g:1308:4: otherlv_12= 'haz que el universo conspire:'
                    {
                    otherlv_12=(Token)match(input,82,FOLLOW_17); 

                    				newLeafNode(otherlv_12, grammarAccess.getBucleWhileAccess().getHazQueElUniversoConspireKeyword_3_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalDearCode.g:1313:4: otherlv_13= 'permite que el destino nos una:'
                    {
                    otherlv_13=(Token)match(input,83,FOLLOW_17); 

                    				newLeafNode(otherlv_13, grammarAccess.getBucleWhileAccess().getPermiteQueElDestinoNosUnaKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalDearCode.g:1318:3: ( (lv_loopBody_14_0= ruleElementoBloque ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=25 && LA26_0<=33)||(LA26_0>=43 && LA26_0<=54)||(LA26_0>=72 && LA26_0<=78)||(LA26_0>=89 && LA26_0<=93)||(LA26_0>=107 && LA26_0<=114)||(LA26_0>=131 && LA26_0<=135)||(LA26_0>=200 && LA26_0<=203)||(LA26_0>=213 && LA26_0<=230)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalDearCode.g:1319:4: (lv_loopBody_14_0= ruleElementoBloque )
            	    {
            	    // InternalDearCode.g:1319:4: (lv_loopBody_14_0= ruleElementoBloque )
            	    // InternalDearCode.g:1320:5: lv_loopBody_14_0= ruleElementoBloque
            	    {

            	    					newCompositeNode(grammarAccess.getBucleWhileAccess().getLoopBodyElementoBloqueParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_loopBody_14_0=ruleElementoBloque();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBucleWhileRule());
            	    					}
            	    					add(
            	    						current,
            	    						"loopBody",
            	    						lv_loopBody_14_0,
            	    						"edu.upb.lp.DearCode.ElementoBloque");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            // InternalDearCode.g:1337:3: (otherlv_15= 'Y as\\u00ED el susurro descansa.' | otherlv_16= 'hasta que el anhelo repose' | otherlv_17= 'Y el silencio envuelve nuestro amor.' | otherlv_18= 'Hasta que la eternidad nos encuentre.' | otherlv_19= 'Y la pasi\\u00F3n se convierte en recuerdo.' )
            int alt27=5;
            switch ( input.LA(1) ) {
            case 84:
                {
                alt27=1;
                }
                break;
            case 85:
                {
                alt27=2;
                }
                break;
            case 86:
                {
                alt27=3;
                }
                break;
            case 87:
                {
                alt27=4;
                }
                break;
            case 88:
                {
                alt27=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalDearCode.g:1338:4: otherlv_15= 'Y as\\u00ED el susurro descansa.'
                    {
                    otherlv_15=(Token)match(input,84,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getBucleWhileAccess().getYAsElSusurroDescansaKeyword_5_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:1343:4: otherlv_16= 'hasta que el anhelo repose'
                    {
                    otherlv_16=(Token)match(input,85,FOLLOW_2); 

                    				newLeafNode(otherlv_16, grammarAccess.getBucleWhileAccess().getHastaQueElAnheloReposeKeyword_5_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalDearCode.g:1348:4: otherlv_17= 'Y el silencio envuelve nuestro amor.'
                    {
                    otherlv_17=(Token)match(input,86,FOLLOW_2); 

                    				newLeafNode(otherlv_17, grammarAccess.getBucleWhileAccess().getYElSilencioEnvuelveNuestroAmorKeyword_5_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalDearCode.g:1353:4: otherlv_18= 'Hasta que la eternidad nos encuentre.'
                    {
                    otherlv_18=(Token)match(input,87,FOLLOW_2); 

                    				newLeafNode(otherlv_18, grammarAccess.getBucleWhileAccess().getHastaQueLaEternidadNosEncuentreKeyword_5_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalDearCode.g:1358:4: otherlv_19= 'Y la pasi\\u00F3n se convierte en recuerdo.'
                    {
                    otherlv_19=(Token)match(input,88,FOLLOW_2); 

                    				newLeafNode(otherlv_19, grammarAccess.getBucleWhileAccess().getYLaPasiNSeConvierteEnRecuerdoKeyword_5_4());
                    			

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
    // $ANTLR end "ruleBucleWhile"


    // $ANTLR start "entryRuleBucleFor"
    // InternalDearCode.g:1367:1: entryRuleBucleFor returns [EObject current=null] : iv_ruleBucleFor= ruleBucleFor EOF ;
    public final EObject entryRuleBucleFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBucleFor = null;


        try {
            // InternalDearCode.g:1367:49: (iv_ruleBucleFor= ruleBucleFor EOF )
            // InternalDearCode.g:1368:2: iv_ruleBucleFor= ruleBucleFor EOF
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
    // InternalDearCode.g:1374:1: ruleBucleFor returns [EObject current=null] : ( (otherlv_0= 'En cada suspiro' | otherlv_1= 'Por cada latido' | otherlv_2= 'Por cada estrella que nos mira' | otherlv_3= 'En cada p\\u00E9talo de rosa' | otherlv_4= 'Por cada ola que besa la orilla' ) ( (lv_variable_5_0= ruleMI_ID ) ) otherlv_6= 'desde' ( (lv_inicio_7_0= ruleExpression ) ) otherlv_8= 'hasta' ( (lv_fin_9_0= ruleExpression ) ) (otherlv_10= 'con paso' ( (lv_paso_11_0= ruleExpression ) ) )? (otherlv_12= 'deja que el universo cante:' | otherlv_13= 'resuena este amor' | otherlv_14= 'que el viento susurre nuestro nombre:' | otherlv_15= 'que el cielo pinte nuestro amor:' | otherlv_16= 'que la tierra tiemble con nuestra pasi\\u00F3n:' ) ( (lv_loopBody_17_0= ruleElementoBloque ) )+ (otherlv_18= 'Cuando el \\u00FAltimo eco se calle.' | otherlv_19= 'Y el eco se desvanece.' | otherlv_20= 'Y la \\u00FAltima estrella se apague.' | otherlv_21= 'Hasta que el \\u00FAltimo p\\u00E9talo caiga.' | otherlv_22= 'Cuando el mar se quede en silencio.' ) ) ;
    public final EObject ruleBucleFor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        EObject lv_variable_5_0 = null;

        EObject lv_inicio_7_0 = null;

        EObject lv_fin_9_0 = null;

        EObject lv_paso_11_0 = null;

        EObject lv_loopBody_17_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:1380:2: ( ( (otherlv_0= 'En cada suspiro' | otherlv_1= 'Por cada latido' | otherlv_2= 'Por cada estrella que nos mira' | otherlv_3= 'En cada p\\u00E9talo de rosa' | otherlv_4= 'Por cada ola que besa la orilla' ) ( (lv_variable_5_0= ruleMI_ID ) ) otherlv_6= 'desde' ( (lv_inicio_7_0= ruleExpression ) ) otherlv_8= 'hasta' ( (lv_fin_9_0= ruleExpression ) ) (otherlv_10= 'con paso' ( (lv_paso_11_0= ruleExpression ) ) )? (otherlv_12= 'deja que el universo cante:' | otherlv_13= 'resuena este amor' | otherlv_14= 'que el viento susurre nuestro nombre:' | otherlv_15= 'que el cielo pinte nuestro amor:' | otherlv_16= 'que la tierra tiemble con nuestra pasi\\u00F3n:' ) ( (lv_loopBody_17_0= ruleElementoBloque ) )+ (otherlv_18= 'Cuando el \\u00FAltimo eco se calle.' | otherlv_19= 'Y el eco se desvanece.' | otherlv_20= 'Y la \\u00FAltima estrella se apague.' | otherlv_21= 'Hasta que el \\u00FAltimo p\\u00E9talo caiga.' | otherlv_22= 'Cuando el mar se quede en silencio.' ) ) )
            // InternalDearCode.g:1381:2: ( (otherlv_0= 'En cada suspiro' | otherlv_1= 'Por cada latido' | otherlv_2= 'Por cada estrella que nos mira' | otherlv_3= 'En cada p\\u00E9talo de rosa' | otherlv_4= 'Por cada ola que besa la orilla' ) ( (lv_variable_5_0= ruleMI_ID ) ) otherlv_6= 'desde' ( (lv_inicio_7_0= ruleExpression ) ) otherlv_8= 'hasta' ( (lv_fin_9_0= ruleExpression ) ) (otherlv_10= 'con paso' ( (lv_paso_11_0= ruleExpression ) ) )? (otherlv_12= 'deja que el universo cante:' | otherlv_13= 'resuena este amor' | otherlv_14= 'que el viento susurre nuestro nombre:' | otherlv_15= 'que el cielo pinte nuestro amor:' | otherlv_16= 'que la tierra tiemble con nuestra pasi\\u00F3n:' ) ( (lv_loopBody_17_0= ruleElementoBloque ) )+ (otherlv_18= 'Cuando el \\u00FAltimo eco se calle.' | otherlv_19= 'Y el eco se desvanece.' | otherlv_20= 'Y la \\u00FAltima estrella se apague.' | otherlv_21= 'Hasta que el \\u00FAltimo p\\u00E9talo caiga.' | otherlv_22= 'Cuando el mar se quede en silencio.' ) )
            {
            // InternalDearCode.g:1381:2: ( (otherlv_0= 'En cada suspiro' | otherlv_1= 'Por cada latido' | otherlv_2= 'Por cada estrella que nos mira' | otherlv_3= 'En cada p\\u00E9talo de rosa' | otherlv_4= 'Por cada ola que besa la orilla' ) ( (lv_variable_5_0= ruleMI_ID ) ) otherlv_6= 'desde' ( (lv_inicio_7_0= ruleExpression ) ) otherlv_8= 'hasta' ( (lv_fin_9_0= ruleExpression ) ) (otherlv_10= 'con paso' ( (lv_paso_11_0= ruleExpression ) ) )? (otherlv_12= 'deja que el universo cante:' | otherlv_13= 'resuena este amor' | otherlv_14= 'que el viento susurre nuestro nombre:' | otherlv_15= 'que el cielo pinte nuestro amor:' | otherlv_16= 'que la tierra tiemble con nuestra pasi\\u00F3n:' ) ( (lv_loopBody_17_0= ruleElementoBloque ) )+ (otherlv_18= 'Cuando el \\u00FAltimo eco se calle.' | otherlv_19= 'Y el eco se desvanece.' | otherlv_20= 'Y la \\u00FAltima estrella se apague.' | otherlv_21= 'Hasta que el \\u00FAltimo p\\u00E9talo caiga.' | otherlv_22= 'Cuando el mar se quede en silencio.' ) )
            // InternalDearCode.g:1382:3: (otherlv_0= 'En cada suspiro' | otherlv_1= 'Por cada latido' | otherlv_2= 'Por cada estrella que nos mira' | otherlv_3= 'En cada p\\u00E9talo de rosa' | otherlv_4= 'Por cada ola que besa la orilla' ) ( (lv_variable_5_0= ruleMI_ID ) ) otherlv_6= 'desde' ( (lv_inicio_7_0= ruleExpression ) ) otherlv_8= 'hasta' ( (lv_fin_9_0= ruleExpression ) ) (otherlv_10= 'con paso' ( (lv_paso_11_0= ruleExpression ) ) )? (otherlv_12= 'deja que el universo cante:' | otherlv_13= 'resuena este amor' | otherlv_14= 'que el viento susurre nuestro nombre:' | otherlv_15= 'que el cielo pinte nuestro amor:' | otherlv_16= 'que la tierra tiemble con nuestra pasi\\u00F3n:' ) ( (lv_loopBody_17_0= ruleElementoBloque ) )+ (otherlv_18= 'Cuando el \\u00FAltimo eco se calle.' | otherlv_19= 'Y el eco se desvanece.' | otherlv_20= 'Y la \\u00FAltima estrella se apague.' | otherlv_21= 'Hasta que el \\u00FAltimo p\\u00E9talo caiga.' | otherlv_22= 'Cuando el mar se quede en silencio.' )
            {
            // InternalDearCode.g:1382:3: (otherlv_0= 'En cada suspiro' | otherlv_1= 'Por cada latido' | otherlv_2= 'Por cada estrella que nos mira' | otherlv_3= 'En cada p\\u00E9talo de rosa' | otherlv_4= 'Por cada ola que besa la orilla' )
            int alt28=5;
            switch ( input.LA(1) ) {
            case 89:
                {
                alt28=1;
                }
                break;
            case 90:
                {
                alt28=2;
                }
                break;
            case 91:
                {
                alt28=3;
                }
                break;
            case 92:
                {
                alt28=4;
                }
                break;
            case 93:
                {
                alt28=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalDearCode.g:1383:4: otherlv_0= 'En cada suspiro'
                    {
                    otherlv_0=(Token)match(input,89,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getBucleForAccess().getEnCadaSuspiroKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:1388:4: otherlv_1= 'Por cada latido'
                    {
                    otherlv_1=(Token)match(input,90,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getBucleForAccess().getPorCadaLatidoKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalDearCode.g:1393:4: otherlv_2= 'Por cada estrella que nos mira'
                    {
                    otherlv_2=(Token)match(input,91,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getBucleForAccess().getPorCadaEstrellaQueNosMiraKeyword_0_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalDearCode.g:1398:4: otherlv_3= 'En cada p\\u00E9talo de rosa'
                    {
                    otherlv_3=(Token)match(input,92,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getBucleForAccess().getEnCadaPTaloDeRosaKeyword_0_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalDearCode.g:1403:4: otherlv_4= 'Por cada ola que besa la orilla'
                    {
                    otherlv_4=(Token)match(input,93,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getBucleForAccess().getPorCadaOlaQueBesaLaOrillaKeyword_0_4());
                    			

                    }
                    break;

            }

            // InternalDearCode.g:1408:3: ( (lv_variable_5_0= ruleMI_ID ) )
            // InternalDearCode.g:1409:4: (lv_variable_5_0= ruleMI_ID )
            {
            // InternalDearCode.g:1409:4: (lv_variable_5_0= ruleMI_ID )
            // InternalDearCode.g:1410:5: lv_variable_5_0= ruleMI_ID
            {

            					newCompositeNode(grammarAccess.getBucleForAccess().getVariableMI_IDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_25);
            lv_variable_5_0=ruleMI_ID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBucleForRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_5_0,
            						"edu.upb.lp.DearCode.MI_ID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,94,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getBucleForAccess().getDesdeKeyword_2());
            		
            // InternalDearCode.g:1431:3: ( (lv_inicio_7_0= ruleExpression ) )
            // InternalDearCode.g:1432:4: (lv_inicio_7_0= ruleExpression )
            {
            // InternalDearCode.g:1432:4: (lv_inicio_7_0= ruleExpression )
            // InternalDearCode.g:1433:5: lv_inicio_7_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getBucleForAccess().getInicioExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_26);
            lv_inicio_7_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBucleForRule());
            					}
            					set(
            						current,
            						"inicio",
            						lv_inicio_7_0,
            						"edu.upb.lp.DearCode.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,95,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getBucleForAccess().getHastaKeyword_4());
            		
            // InternalDearCode.g:1454:3: ( (lv_fin_9_0= ruleExpression ) )
            // InternalDearCode.g:1455:4: (lv_fin_9_0= ruleExpression )
            {
            // InternalDearCode.g:1455:4: (lv_fin_9_0= ruleExpression )
            // InternalDearCode.g:1456:5: lv_fin_9_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getBucleForAccess().getFinExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_27);
            lv_fin_9_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBucleForRule());
            					}
            					set(
            						current,
            						"fin",
            						lv_fin_9_0,
            						"edu.upb.lp.DearCode.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDearCode.g:1473:3: (otherlv_10= 'con paso' ( (lv_paso_11_0= ruleExpression ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==96) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDearCode.g:1474:4: otherlv_10= 'con paso' ( (lv_paso_11_0= ruleExpression ) )
                    {
                    otherlv_10=(Token)match(input,96,FOLLOW_10); 

                    				newLeafNode(otherlv_10, grammarAccess.getBucleForAccess().getConPasoKeyword_6_0());
                    			
                    // InternalDearCode.g:1478:4: ( (lv_paso_11_0= ruleExpression ) )
                    // InternalDearCode.g:1479:5: (lv_paso_11_0= ruleExpression )
                    {
                    // InternalDearCode.g:1479:5: (lv_paso_11_0= ruleExpression )
                    // InternalDearCode.g:1480:6: lv_paso_11_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getBucleForAccess().getPasoExpressionParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_paso_11_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBucleForRule());
                    						}
                    						set(
                    							current,
                    							"paso",
                    							lv_paso_11_0,
                    							"edu.upb.lp.DearCode.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDearCode.g:1498:3: (otherlv_12= 'deja que el universo cante:' | otherlv_13= 'resuena este amor' | otherlv_14= 'que el viento susurre nuestro nombre:' | otherlv_15= 'que el cielo pinte nuestro amor:' | otherlv_16= 'que la tierra tiemble con nuestra pasi\\u00F3n:' )
            int alt30=5;
            switch ( input.LA(1) ) {
            case 97:
                {
                alt30=1;
                }
                break;
            case 98:
                {
                alt30=2;
                }
                break;
            case 99:
                {
                alt30=3;
                }
                break;
            case 100:
                {
                alt30=4;
                }
                break;
            case 101:
                {
                alt30=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalDearCode.g:1499:4: otherlv_12= 'deja que el universo cante:'
                    {
                    otherlv_12=(Token)match(input,97,FOLLOW_17); 

                    				newLeafNode(otherlv_12, grammarAccess.getBucleForAccess().getDejaQueElUniversoCanteKeyword_7_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:1504:4: otherlv_13= 'resuena este amor'
                    {
                    otherlv_13=(Token)match(input,98,FOLLOW_17); 

                    				newLeafNode(otherlv_13, grammarAccess.getBucleForAccess().getResuenaEsteAmorKeyword_7_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalDearCode.g:1509:4: otherlv_14= 'que el viento susurre nuestro nombre:'
                    {
                    otherlv_14=(Token)match(input,99,FOLLOW_17); 

                    				newLeafNode(otherlv_14, grammarAccess.getBucleForAccess().getQueElVientoSusurreNuestroNombreKeyword_7_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalDearCode.g:1514:4: otherlv_15= 'que el cielo pinte nuestro amor:'
                    {
                    otherlv_15=(Token)match(input,100,FOLLOW_17); 

                    				newLeafNode(otherlv_15, grammarAccess.getBucleForAccess().getQueElCieloPinteNuestroAmorKeyword_7_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalDearCode.g:1519:4: otherlv_16= 'que la tierra tiemble con nuestra pasi\\u00F3n:'
                    {
                    otherlv_16=(Token)match(input,101,FOLLOW_17); 

                    				newLeafNode(otherlv_16, grammarAccess.getBucleForAccess().getQueLaTierraTiembleConNuestraPasiNKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalDearCode.g:1524:3: ( (lv_loopBody_17_0= ruleElementoBloque ) )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=25 && LA31_0<=33)||(LA31_0>=43 && LA31_0<=54)||(LA31_0>=72 && LA31_0<=78)||(LA31_0>=89 && LA31_0<=93)||(LA31_0>=107 && LA31_0<=114)||(LA31_0>=131 && LA31_0<=135)||(LA31_0>=200 && LA31_0<=203)||(LA31_0>=213 && LA31_0<=230)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalDearCode.g:1525:4: (lv_loopBody_17_0= ruleElementoBloque )
            	    {
            	    // InternalDearCode.g:1525:4: (lv_loopBody_17_0= ruleElementoBloque )
            	    // InternalDearCode.g:1526:5: lv_loopBody_17_0= ruleElementoBloque
            	    {

            	    					newCompositeNode(grammarAccess.getBucleForAccess().getLoopBodyElementoBloqueParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_loopBody_17_0=ruleElementoBloque();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBucleForRule());
            	    					}
            	    					add(
            	    						current,
            	    						"loopBody",
            	    						lv_loopBody_17_0,
            	    						"edu.upb.lp.DearCode.ElementoBloque");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);

            // InternalDearCode.g:1543:3: (otherlv_18= 'Cuando el \\u00FAltimo eco se calle.' | otherlv_19= 'Y el eco se desvanece.' | otherlv_20= 'Y la \\u00FAltima estrella se apague.' | otherlv_21= 'Hasta que el \\u00FAltimo p\\u00E9talo caiga.' | otherlv_22= 'Cuando el mar se quede en silencio.' )
            int alt32=5;
            switch ( input.LA(1) ) {
            case 102:
                {
                alt32=1;
                }
                break;
            case 103:
                {
                alt32=2;
                }
                break;
            case 104:
                {
                alt32=3;
                }
                break;
            case 105:
                {
                alt32=4;
                }
                break;
            case 106:
                {
                alt32=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalDearCode.g:1544:4: otherlv_18= 'Cuando el \\u00FAltimo eco se calle.'
                    {
                    otherlv_18=(Token)match(input,102,FOLLOW_2); 

                    				newLeafNode(otherlv_18, grammarAccess.getBucleForAccess().getCuandoElLtimoEcoSeCalleKeyword_9_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:1549:4: otherlv_19= 'Y el eco se desvanece.'
                    {
                    otherlv_19=(Token)match(input,103,FOLLOW_2); 

                    				newLeafNode(otherlv_19, grammarAccess.getBucleForAccess().getYElEcoSeDesvaneceKeyword_9_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalDearCode.g:1554:4: otherlv_20= 'Y la \\u00FAltima estrella se apague.'
                    {
                    otherlv_20=(Token)match(input,104,FOLLOW_2); 

                    				newLeafNode(otherlv_20, grammarAccess.getBucleForAccess().getYLaLtimaEstrellaSeApagueKeyword_9_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalDearCode.g:1559:4: otherlv_21= 'Hasta que el \\u00FAltimo p\\u00E9talo caiga.'
                    {
                    otherlv_21=(Token)match(input,105,FOLLOW_2); 

                    				newLeafNode(otherlv_21, grammarAccess.getBucleForAccess().getHastaQueElLtimoPTaloCaigaKeyword_9_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalDearCode.g:1564:4: otherlv_22= 'Cuando el mar se quede en silencio.'
                    {
                    otherlv_22=(Token)match(input,106,FOLLOW_2); 

                    				newLeafNode(otherlv_22, grammarAccess.getBucleForAccess().getCuandoElMarSeQuedeEnSilencioKeyword_9_4());
                    			

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
    // $ANTLR end "ruleBucleFor"


    // $ANTLR start "entryRuleFuncion"
    // InternalDearCode.g:1573:1: entryRuleFuncion returns [EObject current=null] : iv_ruleFuncion= ruleFuncion EOF ;
    public final EObject entryRuleFuncion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncion = null;


        try {
            // InternalDearCode.g:1573:48: (iv_ruleFuncion= ruleFuncion EOF )
            // InternalDearCode.g:1574:2: iv_ruleFuncion= ruleFuncion EOF
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
    // InternalDearCode.g:1580:1: ruleFuncion returns [EObject current=null] : ( (otherlv_0= 'Dejo en estas l\\u00EDneas una promesa llamada' | otherlv_1= 'Escribo en estas l\\u00EDneas una intenci\\u00F3n llamada' | otherlv_2= 'En la brisa escondo un deseo llamado' | otherlv_3= 'Grabo en las estrellas una promesa llamada' | otherlv_4= 'Susurro al universo un deseo llamado' | otherlv_5= 'Tejo en el destino un juramento llamado' | otherlv_6= 'Esculpo en el tiempo un anhelo llamado' | otherlv_7= 'Susurro a la eternidad un sue\\u00F1o llamado' ) ( (lv_name_8_0= ruleMI_ID ) ) ( (otherlv_9= 'que guarda en su esencia' | otherlv_10= 'tejiendo' | otherlv_11= 'que abraza en su ser' | otherlv_12= 'que lleva en su alma' | otherlv_13= 'que susurra en su coraz\\u00F3n' ) ( (lv_parametros_14_0= ruleParametroDecl ) ) ( (otherlv_15= 'tambien' | otherlv_16= 'llevando consigo' ) ( (lv_parametros_17_0= ruleParametroDecl ) ) )* )? (otherlv_18= 'prometiendo devolver' | otherlv_19= 'jurando devolver' )? ( (lv_tipo_20_0= ruleType ) )? (otherlv_21= 'Cuando la promesa se cumple:' | otherlv_22= 'Cuando el amor se cumpla' ) ( (lv_instrucciones_23_0= ruleElementoBloque ) )+ (otherlv_24= 'As\\u00ED se sella la promesa.' | otherlv_25= 'As\\u00ED se eterniza.' | otherlv_26= 'Y as\\u00ED nuestro amor se inmortaliza.' | otherlv_27= 'Y el universo guarda nuestro secreto.' | otherlv_28= 'Y la eternidad nos abraza.' ) ) ;
    public final EObject ruleFuncion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        EObject lv_name_8_0 = null;

        EObject lv_parametros_14_0 = null;

        EObject lv_parametros_17_0 = null;

        AntlrDatatypeRuleToken lv_tipo_20_0 = null;

        EObject lv_instrucciones_23_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:1586:2: ( ( (otherlv_0= 'Dejo en estas l\\u00EDneas una promesa llamada' | otherlv_1= 'Escribo en estas l\\u00EDneas una intenci\\u00F3n llamada' | otherlv_2= 'En la brisa escondo un deseo llamado' | otherlv_3= 'Grabo en las estrellas una promesa llamada' | otherlv_4= 'Susurro al universo un deseo llamado' | otherlv_5= 'Tejo en el destino un juramento llamado' | otherlv_6= 'Esculpo en el tiempo un anhelo llamado' | otherlv_7= 'Susurro a la eternidad un sue\\u00F1o llamado' ) ( (lv_name_8_0= ruleMI_ID ) ) ( (otherlv_9= 'que guarda en su esencia' | otherlv_10= 'tejiendo' | otherlv_11= 'que abraza en su ser' | otherlv_12= 'que lleva en su alma' | otherlv_13= 'que susurra en su coraz\\u00F3n' ) ( (lv_parametros_14_0= ruleParametroDecl ) ) ( (otherlv_15= 'tambien' | otherlv_16= 'llevando consigo' ) ( (lv_parametros_17_0= ruleParametroDecl ) ) )* )? (otherlv_18= 'prometiendo devolver' | otherlv_19= 'jurando devolver' )? ( (lv_tipo_20_0= ruleType ) )? (otherlv_21= 'Cuando la promesa se cumple:' | otherlv_22= 'Cuando el amor se cumpla' ) ( (lv_instrucciones_23_0= ruleElementoBloque ) )+ (otherlv_24= 'As\\u00ED se sella la promesa.' | otherlv_25= 'As\\u00ED se eterniza.' | otherlv_26= 'Y as\\u00ED nuestro amor se inmortaliza.' | otherlv_27= 'Y el universo guarda nuestro secreto.' | otherlv_28= 'Y la eternidad nos abraza.' ) ) )
            // InternalDearCode.g:1587:2: ( (otherlv_0= 'Dejo en estas l\\u00EDneas una promesa llamada' | otherlv_1= 'Escribo en estas l\\u00EDneas una intenci\\u00F3n llamada' | otherlv_2= 'En la brisa escondo un deseo llamado' | otherlv_3= 'Grabo en las estrellas una promesa llamada' | otherlv_4= 'Susurro al universo un deseo llamado' | otherlv_5= 'Tejo en el destino un juramento llamado' | otherlv_6= 'Esculpo en el tiempo un anhelo llamado' | otherlv_7= 'Susurro a la eternidad un sue\\u00F1o llamado' ) ( (lv_name_8_0= ruleMI_ID ) ) ( (otherlv_9= 'que guarda en su esencia' | otherlv_10= 'tejiendo' | otherlv_11= 'que abraza en su ser' | otherlv_12= 'que lleva en su alma' | otherlv_13= 'que susurra en su coraz\\u00F3n' ) ( (lv_parametros_14_0= ruleParametroDecl ) ) ( (otherlv_15= 'tambien' | otherlv_16= 'llevando consigo' ) ( (lv_parametros_17_0= ruleParametroDecl ) ) )* )? (otherlv_18= 'prometiendo devolver' | otherlv_19= 'jurando devolver' )? ( (lv_tipo_20_0= ruleType ) )? (otherlv_21= 'Cuando la promesa se cumple:' | otherlv_22= 'Cuando el amor se cumpla' ) ( (lv_instrucciones_23_0= ruleElementoBloque ) )+ (otherlv_24= 'As\\u00ED se sella la promesa.' | otherlv_25= 'As\\u00ED se eterniza.' | otherlv_26= 'Y as\\u00ED nuestro amor se inmortaliza.' | otherlv_27= 'Y el universo guarda nuestro secreto.' | otherlv_28= 'Y la eternidad nos abraza.' ) )
            {
            // InternalDearCode.g:1587:2: ( (otherlv_0= 'Dejo en estas l\\u00EDneas una promesa llamada' | otherlv_1= 'Escribo en estas l\\u00EDneas una intenci\\u00F3n llamada' | otherlv_2= 'En la brisa escondo un deseo llamado' | otherlv_3= 'Grabo en las estrellas una promesa llamada' | otherlv_4= 'Susurro al universo un deseo llamado' | otherlv_5= 'Tejo en el destino un juramento llamado' | otherlv_6= 'Esculpo en el tiempo un anhelo llamado' | otherlv_7= 'Susurro a la eternidad un sue\\u00F1o llamado' ) ( (lv_name_8_0= ruleMI_ID ) ) ( (otherlv_9= 'que guarda en su esencia' | otherlv_10= 'tejiendo' | otherlv_11= 'que abraza en su ser' | otherlv_12= 'que lleva en su alma' | otherlv_13= 'que susurra en su coraz\\u00F3n' ) ( (lv_parametros_14_0= ruleParametroDecl ) ) ( (otherlv_15= 'tambien' | otherlv_16= 'llevando consigo' ) ( (lv_parametros_17_0= ruleParametroDecl ) ) )* )? (otherlv_18= 'prometiendo devolver' | otherlv_19= 'jurando devolver' )? ( (lv_tipo_20_0= ruleType ) )? (otherlv_21= 'Cuando la promesa se cumple:' | otherlv_22= 'Cuando el amor se cumpla' ) ( (lv_instrucciones_23_0= ruleElementoBloque ) )+ (otherlv_24= 'As\\u00ED se sella la promesa.' | otherlv_25= 'As\\u00ED se eterniza.' | otherlv_26= 'Y as\\u00ED nuestro amor se inmortaliza.' | otherlv_27= 'Y el universo guarda nuestro secreto.' | otherlv_28= 'Y la eternidad nos abraza.' ) )
            // InternalDearCode.g:1588:3: (otherlv_0= 'Dejo en estas l\\u00EDneas una promesa llamada' | otherlv_1= 'Escribo en estas l\\u00EDneas una intenci\\u00F3n llamada' | otherlv_2= 'En la brisa escondo un deseo llamado' | otherlv_3= 'Grabo en las estrellas una promesa llamada' | otherlv_4= 'Susurro al universo un deseo llamado' | otherlv_5= 'Tejo en el destino un juramento llamado' | otherlv_6= 'Esculpo en el tiempo un anhelo llamado' | otherlv_7= 'Susurro a la eternidad un sue\\u00F1o llamado' ) ( (lv_name_8_0= ruleMI_ID ) ) ( (otherlv_9= 'que guarda en su esencia' | otherlv_10= 'tejiendo' | otherlv_11= 'que abraza en su ser' | otherlv_12= 'que lleva en su alma' | otherlv_13= 'que susurra en su coraz\\u00F3n' ) ( (lv_parametros_14_0= ruleParametroDecl ) ) ( (otherlv_15= 'tambien' | otherlv_16= 'llevando consigo' ) ( (lv_parametros_17_0= ruleParametroDecl ) ) )* )? (otherlv_18= 'prometiendo devolver' | otherlv_19= 'jurando devolver' )? ( (lv_tipo_20_0= ruleType ) )? (otherlv_21= 'Cuando la promesa se cumple:' | otherlv_22= 'Cuando el amor se cumpla' ) ( (lv_instrucciones_23_0= ruleElementoBloque ) )+ (otherlv_24= 'As\\u00ED se sella la promesa.' | otherlv_25= 'As\\u00ED se eterniza.' | otherlv_26= 'Y as\\u00ED nuestro amor se inmortaliza.' | otherlv_27= 'Y el universo guarda nuestro secreto.' | otherlv_28= 'Y la eternidad nos abraza.' )
            {
            // InternalDearCode.g:1588:3: (otherlv_0= 'Dejo en estas l\\u00EDneas una promesa llamada' | otherlv_1= 'Escribo en estas l\\u00EDneas una intenci\\u00F3n llamada' | otherlv_2= 'En la brisa escondo un deseo llamado' | otherlv_3= 'Grabo en las estrellas una promesa llamada' | otherlv_4= 'Susurro al universo un deseo llamado' | otherlv_5= 'Tejo en el destino un juramento llamado' | otherlv_6= 'Esculpo en el tiempo un anhelo llamado' | otherlv_7= 'Susurro a la eternidad un sue\\u00F1o llamado' )
            int alt33=8;
            switch ( input.LA(1) ) {
            case 107:
                {
                alt33=1;
                }
                break;
            case 108:
                {
                alt33=2;
                }
                break;
            case 109:
                {
                alt33=3;
                }
                break;
            case 110:
                {
                alt33=4;
                }
                break;
            case 111:
                {
                alt33=5;
                }
                break;
            case 112:
                {
                alt33=6;
                }
                break;
            case 113:
                {
                alt33=7;
                }
                break;
            case 114:
                {
                alt33=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalDearCode.g:1589:4: otherlv_0= 'Dejo en estas l\\u00EDneas una promesa llamada'
                    {
                    otherlv_0=(Token)match(input,107,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getFuncionAccess().getDejoEnEstasLNeasUnaPromesaLlamadaKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:1594:4: otherlv_1= 'Escribo en estas l\\u00EDneas una intenci\\u00F3n llamada'
                    {
                    otherlv_1=(Token)match(input,108,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getFuncionAccess().getEscriboEnEstasLNeasUnaIntenciNLlamadaKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalDearCode.g:1599:4: otherlv_2= 'En la brisa escondo un deseo llamado'
                    {
                    otherlv_2=(Token)match(input,109,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getFuncionAccess().getEnLaBrisaEscondoUnDeseoLlamadoKeyword_0_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalDearCode.g:1604:4: otherlv_3= 'Grabo en las estrellas una promesa llamada'
                    {
                    otherlv_3=(Token)match(input,110,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getFuncionAccess().getGraboEnLasEstrellasUnaPromesaLlamadaKeyword_0_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalDearCode.g:1609:4: otherlv_4= 'Susurro al universo un deseo llamado'
                    {
                    otherlv_4=(Token)match(input,111,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getFuncionAccess().getSusurroAlUniversoUnDeseoLlamadoKeyword_0_4());
                    			

                    }
                    break;
                case 6 :
                    // InternalDearCode.g:1614:4: otherlv_5= 'Tejo en el destino un juramento llamado'
                    {
                    otherlv_5=(Token)match(input,112,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getFuncionAccess().getTejoEnElDestinoUnJuramentoLlamadoKeyword_0_5());
                    			

                    }
                    break;
                case 7 :
                    // InternalDearCode.g:1619:4: otherlv_6= 'Esculpo en el tiempo un anhelo llamado'
                    {
                    otherlv_6=(Token)match(input,113,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getFuncionAccess().getEsculpoEnElTiempoUnAnheloLlamadoKeyword_0_6());
                    			

                    }
                    break;
                case 8 :
                    // InternalDearCode.g:1624:4: otherlv_7= 'Susurro a la eternidad un sue\\u00F1o llamado'
                    {
                    otherlv_7=(Token)match(input,114,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getFuncionAccess().getSusurroALaEternidadUnSueOLlamadoKeyword_0_7());
                    			

                    }
                    break;

            }

            // InternalDearCode.g:1629:3: ( (lv_name_8_0= ruleMI_ID ) )
            // InternalDearCode.g:1630:4: (lv_name_8_0= ruleMI_ID )
            {
            // InternalDearCode.g:1630:4: (lv_name_8_0= ruleMI_ID )
            // InternalDearCode.g:1631:5: lv_name_8_0= ruleMI_ID
            {

            					newCompositeNode(grammarAccess.getFuncionAccess().getNameMI_IDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_30);
            lv_name_8_0=ruleMI_ID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuncionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_8_0,
            						"edu.upb.lp.DearCode.MI_ID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDearCode.g:1648:3: ( (otherlv_9= 'que guarda en su esencia' | otherlv_10= 'tejiendo' | otherlv_11= 'que abraza en su ser' | otherlv_12= 'que lleva en su alma' | otherlv_13= 'que susurra en su coraz\\u00F3n' ) ( (lv_parametros_14_0= ruleParametroDecl ) ) ( (otherlv_15= 'tambien' | otherlv_16= 'llevando consigo' ) ( (lv_parametros_17_0= ruleParametroDecl ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=115 && LA37_0<=119)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDearCode.g:1649:4: (otherlv_9= 'que guarda en su esencia' | otherlv_10= 'tejiendo' | otherlv_11= 'que abraza en su ser' | otherlv_12= 'que lleva en su alma' | otherlv_13= 'que susurra en su coraz\\u00F3n' ) ( (lv_parametros_14_0= ruleParametroDecl ) ) ( (otherlv_15= 'tambien' | otherlv_16= 'llevando consigo' ) ( (lv_parametros_17_0= ruleParametroDecl ) ) )*
                    {
                    // InternalDearCode.g:1649:4: (otherlv_9= 'que guarda en su esencia' | otherlv_10= 'tejiendo' | otherlv_11= 'que abraza en su ser' | otherlv_12= 'que lleva en su alma' | otherlv_13= 'que susurra en su coraz\\u00F3n' )
                    int alt34=5;
                    switch ( input.LA(1) ) {
                    case 115:
                        {
                        alt34=1;
                        }
                        break;
                    case 116:
                        {
                        alt34=2;
                        }
                        break;
                    case 117:
                        {
                        alt34=3;
                        }
                        break;
                    case 118:
                        {
                        alt34=4;
                        }
                        break;
                    case 119:
                        {
                        alt34=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }

                    switch (alt34) {
                        case 1 :
                            // InternalDearCode.g:1650:5: otherlv_9= 'que guarda en su esencia'
                            {
                            otherlv_9=(Token)match(input,115,FOLLOW_12); 

                            					newLeafNode(otherlv_9, grammarAccess.getFuncionAccess().getQueGuardaEnSuEsenciaKeyword_2_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDearCode.g:1655:5: otherlv_10= 'tejiendo'
                            {
                            otherlv_10=(Token)match(input,116,FOLLOW_12); 

                            					newLeafNode(otherlv_10, grammarAccess.getFuncionAccess().getTejiendoKeyword_2_0_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalDearCode.g:1660:5: otherlv_11= 'que abraza en su ser'
                            {
                            otherlv_11=(Token)match(input,117,FOLLOW_12); 

                            					newLeafNode(otherlv_11, grammarAccess.getFuncionAccess().getQueAbrazaEnSuSerKeyword_2_0_2());
                            				

                            }
                            break;
                        case 4 :
                            // InternalDearCode.g:1665:5: otherlv_12= 'que lleva en su alma'
                            {
                            otherlv_12=(Token)match(input,118,FOLLOW_12); 

                            					newLeafNode(otherlv_12, grammarAccess.getFuncionAccess().getQueLlevaEnSuAlmaKeyword_2_0_3());
                            				

                            }
                            break;
                        case 5 :
                            // InternalDearCode.g:1670:5: otherlv_13= 'que susurra en su coraz\\u00F3n'
                            {
                            otherlv_13=(Token)match(input,119,FOLLOW_12); 

                            					newLeafNode(otherlv_13, grammarAccess.getFuncionAccess().getQueSusurraEnSuCorazNKeyword_2_0_4());
                            				

                            }
                            break;

                    }

                    // InternalDearCode.g:1675:4: ( (lv_parametros_14_0= ruleParametroDecl ) )
                    // InternalDearCode.g:1676:5: (lv_parametros_14_0= ruleParametroDecl )
                    {
                    // InternalDearCode.g:1676:5: (lv_parametros_14_0= ruleParametroDecl )
                    // InternalDearCode.g:1677:6: lv_parametros_14_0= ruleParametroDecl
                    {

                    						newCompositeNode(grammarAccess.getFuncionAccess().getParametrosParametroDeclParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_parametros_14_0=ruleParametroDecl();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFuncionRule());
                    						}
                    						add(
                    							current,
                    							"parametros",
                    							lv_parametros_14_0,
                    							"edu.upb.lp.DearCode.ParametroDecl");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDearCode.g:1694:4: ( (otherlv_15= 'tambien' | otherlv_16= 'llevando consigo' ) ( (lv_parametros_17_0= ruleParametroDecl ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( ((LA36_0>=120 && LA36_0<=121)) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalDearCode.g:1695:5: (otherlv_15= 'tambien' | otherlv_16= 'llevando consigo' ) ( (lv_parametros_17_0= ruleParametroDecl ) )
                    	    {
                    	    // InternalDearCode.g:1695:5: (otherlv_15= 'tambien' | otherlv_16= 'llevando consigo' )
                    	    int alt35=2;
                    	    int LA35_0 = input.LA(1);

                    	    if ( (LA35_0==120) ) {
                    	        alt35=1;
                    	    }
                    	    else if ( (LA35_0==121) ) {
                    	        alt35=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 35, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt35) {
                    	        case 1 :
                    	            // InternalDearCode.g:1696:6: otherlv_15= 'tambien'
                    	            {
                    	            otherlv_15=(Token)match(input,120,FOLLOW_12); 

                    	            						newLeafNode(otherlv_15, grammarAccess.getFuncionAccess().getTambienKeyword_2_2_0_0());
                    	            					

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalDearCode.g:1701:6: otherlv_16= 'llevando consigo'
                    	            {
                    	            otherlv_16=(Token)match(input,121,FOLLOW_12); 

                    	            						newLeafNode(otherlv_16, grammarAccess.getFuncionAccess().getLlevandoConsigoKeyword_2_2_0_1());
                    	            					

                    	            }
                    	            break;

                    	    }

                    	    // InternalDearCode.g:1706:5: ( (lv_parametros_17_0= ruleParametroDecl ) )
                    	    // InternalDearCode.g:1707:6: (lv_parametros_17_0= ruleParametroDecl )
                    	    {
                    	    // InternalDearCode.g:1707:6: (lv_parametros_17_0= ruleParametroDecl )
                    	    // InternalDearCode.g:1708:7: lv_parametros_17_0= ruleParametroDecl
                    	    {

                    	    							newCompositeNode(grammarAccess.getFuncionAccess().getParametrosParametroDeclParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
                    	    lv_parametros_17_0=ruleParametroDecl();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFuncionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parametros",
                    	    								lv_parametros_17_0,
                    	    								"edu.upb.lp.DearCode.ParametroDecl");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalDearCode.g:1727:3: (otherlv_18= 'prometiendo devolver' | otherlv_19= 'jurando devolver' )?
            int alt38=3;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==122) ) {
                alt38=1;
            }
            else if ( (LA38_0==123) ) {
                alt38=2;
            }
            switch (alt38) {
                case 1 :
                    // InternalDearCode.g:1728:4: otherlv_18= 'prometiendo devolver'
                    {
                    otherlv_18=(Token)match(input,122,FOLLOW_32); 

                    				newLeafNode(otherlv_18, grammarAccess.getFuncionAccess().getPrometiendoDevolverKeyword_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:1733:4: otherlv_19= 'jurando devolver'
                    {
                    otherlv_19=(Token)match(input,123,FOLLOW_32); 

                    				newLeafNode(otherlv_19, grammarAccess.getFuncionAccess().getJurandoDevolverKeyword_3_1());
                    			

                    }
                    break;

            }

            // InternalDearCode.g:1738:3: ( (lv_tipo_20_0= ruleType ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=22 && LA39_0<=24)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDearCode.g:1739:4: (lv_tipo_20_0= ruleType )
                    {
                    // InternalDearCode.g:1739:4: (lv_tipo_20_0= ruleType )
                    // InternalDearCode.g:1740:5: lv_tipo_20_0= ruleType
                    {

                    					newCompositeNode(grammarAccess.getFuncionAccess().getTipoTypeParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_33);
                    lv_tipo_20_0=ruleType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFuncionRule());
                    					}
                    					set(
                    						current,
                    						"tipo",
                    						lv_tipo_20_0,
                    						"edu.upb.lp.DearCode.Type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDearCode.g:1757:3: (otherlv_21= 'Cuando la promesa se cumple:' | otherlv_22= 'Cuando el amor se cumpla' )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==124) ) {
                alt40=1;
            }
            else if ( (LA40_0==125) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalDearCode.g:1758:4: otherlv_21= 'Cuando la promesa se cumple:'
                    {
                    otherlv_21=(Token)match(input,124,FOLLOW_17); 

                    				newLeafNode(otherlv_21, grammarAccess.getFuncionAccess().getCuandoLaPromesaSeCumpleKeyword_5_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:1763:4: otherlv_22= 'Cuando el amor se cumpla'
                    {
                    otherlv_22=(Token)match(input,125,FOLLOW_17); 

                    				newLeafNode(otherlv_22, grammarAccess.getFuncionAccess().getCuandoElAmorSeCumplaKeyword_5_1());
                    			

                    }
                    break;

            }

            // InternalDearCode.g:1768:3: ( (lv_instrucciones_23_0= ruleElementoBloque ) )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=25 && LA41_0<=33)||(LA41_0>=43 && LA41_0<=54)||(LA41_0>=72 && LA41_0<=78)||(LA41_0>=89 && LA41_0<=93)||(LA41_0>=107 && LA41_0<=114)||(LA41_0>=131 && LA41_0<=135)||(LA41_0>=200 && LA41_0<=203)||(LA41_0>=213 && LA41_0<=230)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalDearCode.g:1769:4: (lv_instrucciones_23_0= ruleElementoBloque )
            	    {
            	    // InternalDearCode.g:1769:4: (lv_instrucciones_23_0= ruleElementoBloque )
            	    // InternalDearCode.g:1770:5: lv_instrucciones_23_0= ruleElementoBloque
            	    {

            	    					newCompositeNode(grammarAccess.getFuncionAccess().getInstruccionesElementoBloqueParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_34);
            	    lv_instrucciones_23_0=ruleElementoBloque();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFuncionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instrucciones",
            	    						lv_instrucciones_23_0,
            	    						"edu.upb.lp.DearCode.ElementoBloque");
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

            // InternalDearCode.g:1787:3: (otherlv_24= 'As\\u00ED se sella la promesa.' | otherlv_25= 'As\\u00ED se eterniza.' | otherlv_26= 'Y as\\u00ED nuestro amor se inmortaliza.' | otherlv_27= 'Y el universo guarda nuestro secreto.' | otherlv_28= 'Y la eternidad nos abraza.' )
            int alt42=5;
            switch ( input.LA(1) ) {
            case 126:
                {
                alt42=1;
                }
                break;
            case 127:
                {
                alt42=2;
                }
                break;
            case 128:
                {
                alt42=3;
                }
                break;
            case 129:
                {
                alt42=4;
                }
                break;
            case 130:
                {
                alt42=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalDearCode.g:1788:4: otherlv_24= 'As\\u00ED se sella la promesa.'
                    {
                    otherlv_24=(Token)match(input,126,FOLLOW_2); 

                    				newLeafNode(otherlv_24, grammarAccess.getFuncionAccess().getAsSeSellaLaPromesaKeyword_7_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:1793:4: otherlv_25= 'As\\u00ED se eterniza.'
                    {
                    otherlv_25=(Token)match(input,127,FOLLOW_2); 

                    				newLeafNode(otherlv_25, grammarAccess.getFuncionAccess().getAsSeEternizaKeyword_7_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalDearCode.g:1798:4: otherlv_26= 'Y as\\u00ED nuestro amor se inmortaliza.'
                    {
                    otherlv_26=(Token)match(input,128,FOLLOW_2); 

                    				newLeafNode(otherlv_26, grammarAccess.getFuncionAccess().getYAsNuestroAmorSeInmortalizaKeyword_7_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalDearCode.g:1803:4: otherlv_27= 'Y el universo guarda nuestro secreto.'
                    {
                    otherlv_27=(Token)match(input,129,FOLLOW_2); 

                    				newLeafNode(otherlv_27, grammarAccess.getFuncionAccess().getYElUniversoGuardaNuestroSecretoKeyword_7_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalDearCode.g:1808:4: otherlv_28= 'Y la eternidad nos abraza.'
                    {
                    otherlv_28=(Token)match(input,130,FOLLOW_2); 

                    				newLeafNode(otherlv_28, grammarAccess.getFuncionAccess().getYLaEternidadNosAbrazaKeyword_7_4());
                    			

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
    // $ANTLR end "ruleFuncion"


    // $ANTLR start "entryRuleParametroDecl"
    // InternalDearCode.g:1817:1: entryRuleParametroDecl returns [EObject current=null] : iv_ruleParametroDecl= ruleParametroDecl EOF ;
    public final EObject entryRuleParametroDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametroDecl = null;


        try {
            // InternalDearCode.g:1817:54: (iv_ruleParametroDecl= ruleParametroDecl EOF )
            // InternalDearCode.g:1818:2: iv_ruleParametroDecl= ruleParametroDecl EOF
            {
             newCompositeNode(grammarAccess.getParametroDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParametroDecl=ruleParametroDecl();

            state._fsp--;

             current =iv_ruleParametroDecl; 
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
    // $ANTLR end "entryRuleParametroDecl"


    // $ANTLR start "ruleParametroDecl"
    // InternalDearCode.g:1824:1: ruleParametroDecl returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleType ) )? ( (lv_comment_1_0= ruleComment ) )? ( (lv_name_2_0= ruleMI_ID ) ) ) ;
    public final EObject ruleParametroDecl() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_tipo_0_0 = null;

        EObject lv_comment_1_0 = null;

        EObject lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:1830:2: ( ( ( (lv_tipo_0_0= ruleType ) )? ( (lv_comment_1_0= ruleComment ) )? ( (lv_name_2_0= ruleMI_ID ) ) ) )
            // InternalDearCode.g:1831:2: ( ( (lv_tipo_0_0= ruleType ) )? ( (lv_comment_1_0= ruleComment ) )? ( (lv_name_2_0= ruleMI_ID ) ) )
            {
            // InternalDearCode.g:1831:2: ( ( (lv_tipo_0_0= ruleType ) )? ( (lv_comment_1_0= ruleComment ) )? ( (lv_name_2_0= ruleMI_ID ) ) )
            // InternalDearCode.g:1832:3: ( (lv_tipo_0_0= ruleType ) )? ( (lv_comment_1_0= ruleComment ) )? ( (lv_name_2_0= ruleMI_ID ) )
            {
            // InternalDearCode.g:1832:3: ( (lv_tipo_0_0= ruleType ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=22 && LA43_0<=24)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalDearCode.g:1833:4: (lv_tipo_0_0= ruleType )
                    {
                    // InternalDearCode.g:1833:4: (lv_tipo_0_0= ruleType )
                    // InternalDearCode.g:1834:5: lv_tipo_0_0= ruleType
                    {

                    					newCompositeNode(grammarAccess.getParametroDeclAccess().getTipoTypeParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_tipo_0_0=ruleType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getParametroDeclRule());
                    					}
                    					set(
                    						current,
                    						"tipo",
                    						lv_tipo_0_0,
                    						"edu.upb.lp.DearCode.Type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDearCode.g:1851:3: ( (lv_comment_1_0= ruleComment ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ANYTEXT) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalDearCode.g:1852:4: (lv_comment_1_0= ruleComment )
                    {
                    // InternalDearCode.g:1852:4: (lv_comment_1_0= ruleComment )
                    // InternalDearCode.g:1853:5: lv_comment_1_0= ruleComment
                    {

                    					newCompositeNode(grammarAccess.getParametroDeclAccess().getCommentCommentParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_comment_1_0=ruleComment();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getParametroDeclRule());
                    					}
                    					add(
                    						current,
                    						"comment",
                    						lv_comment_1_0,
                    						"edu.upb.lp.DearCode.Comment");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDearCode.g:1870:3: ( (lv_name_2_0= ruleMI_ID ) )
            // InternalDearCode.g:1871:4: (lv_name_2_0= ruleMI_ID )
            {
            // InternalDearCode.g:1871:4: (lv_name_2_0= ruleMI_ID )
            // InternalDearCode.g:1872:5: lv_name_2_0= ruleMI_ID
            {

            					newCompositeNode(grammarAccess.getParametroDeclAccess().getNameMI_IDParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleMI_ID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParametroDeclRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"edu.upb.lp.DearCode.MI_ID");
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
    // $ANTLR end "ruleParametroDecl"


    // $ANTLR start "entryRuleReturn"
    // InternalDearCode.g:1893:1: entryRuleReturn returns [EObject current=null] : iv_ruleReturn= ruleReturn EOF ;
    public final EObject entryRuleReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturn = null;


        try {
            // InternalDearCode.g:1893:47: (iv_ruleReturn= ruleReturn EOF )
            // InternalDearCode.g:1894:2: iv_ruleReturn= ruleReturn EOF
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
    // InternalDearCode.g:1900:1: ruleReturn returns [EObject current=null] : ( (otherlv_0= 'Y entrego al viento' | otherlv_1= 'Te entrego' | otherlv_2= 'Te ofrezco con el alma' | otherlv_3= 'Dejo en tus manos' | otherlv_4= 'Susurro a tu coraz\\u00F3n' ) ( (lv_expresion_5_0= ruleExpression ) ) (otherlv_6= 'como promesa cumplida.' | otherlv_7= 'con un suspiro.' | otherlv_8= 'como un regalo eterno.' | otherlv_9= 'envuelto en mi amor.' | otherlv_10= 'con la esperanza de tu sonrisa.' ) ) ;
    public final EObject ruleReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_expresion_5_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:1906:2: ( ( (otherlv_0= 'Y entrego al viento' | otherlv_1= 'Te entrego' | otherlv_2= 'Te ofrezco con el alma' | otherlv_3= 'Dejo en tus manos' | otherlv_4= 'Susurro a tu coraz\\u00F3n' ) ( (lv_expresion_5_0= ruleExpression ) ) (otherlv_6= 'como promesa cumplida.' | otherlv_7= 'con un suspiro.' | otherlv_8= 'como un regalo eterno.' | otherlv_9= 'envuelto en mi amor.' | otherlv_10= 'con la esperanza de tu sonrisa.' ) ) )
            // InternalDearCode.g:1907:2: ( (otherlv_0= 'Y entrego al viento' | otherlv_1= 'Te entrego' | otherlv_2= 'Te ofrezco con el alma' | otherlv_3= 'Dejo en tus manos' | otherlv_4= 'Susurro a tu coraz\\u00F3n' ) ( (lv_expresion_5_0= ruleExpression ) ) (otherlv_6= 'como promesa cumplida.' | otherlv_7= 'con un suspiro.' | otherlv_8= 'como un regalo eterno.' | otherlv_9= 'envuelto en mi amor.' | otherlv_10= 'con la esperanza de tu sonrisa.' ) )
            {
            // InternalDearCode.g:1907:2: ( (otherlv_0= 'Y entrego al viento' | otherlv_1= 'Te entrego' | otherlv_2= 'Te ofrezco con el alma' | otherlv_3= 'Dejo en tus manos' | otherlv_4= 'Susurro a tu coraz\\u00F3n' ) ( (lv_expresion_5_0= ruleExpression ) ) (otherlv_6= 'como promesa cumplida.' | otherlv_7= 'con un suspiro.' | otherlv_8= 'como un regalo eterno.' | otherlv_9= 'envuelto en mi amor.' | otherlv_10= 'con la esperanza de tu sonrisa.' ) )
            // InternalDearCode.g:1908:3: (otherlv_0= 'Y entrego al viento' | otherlv_1= 'Te entrego' | otherlv_2= 'Te ofrezco con el alma' | otherlv_3= 'Dejo en tus manos' | otherlv_4= 'Susurro a tu coraz\\u00F3n' ) ( (lv_expresion_5_0= ruleExpression ) ) (otherlv_6= 'como promesa cumplida.' | otherlv_7= 'con un suspiro.' | otherlv_8= 'como un regalo eterno.' | otherlv_9= 'envuelto en mi amor.' | otherlv_10= 'con la esperanza de tu sonrisa.' )
            {
            // InternalDearCode.g:1908:3: (otherlv_0= 'Y entrego al viento' | otherlv_1= 'Te entrego' | otherlv_2= 'Te ofrezco con el alma' | otherlv_3= 'Dejo en tus manos' | otherlv_4= 'Susurro a tu coraz\\u00F3n' )
            int alt45=5;
            switch ( input.LA(1) ) {
            case 131:
                {
                alt45=1;
                }
                break;
            case 132:
                {
                alt45=2;
                }
                break;
            case 133:
                {
                alt45=3;
                }
                break;
            case 134:
                {
                alt45=4;
                }
                break;
            case 135:
                {
                alt45=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalDearCode.g:1909:4: otherlv_0= 'Y entrego al viento'
                    {
                    otherlv_0=(Token)match(input,131,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getReturnAccess().getYEntregoAlVientoKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:1914:4: otherlv_1= 'Te entrego'
                    {
                    otherlv_1=(Token)match(input,132,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getReturnAccess().getTeEntregoKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalDearCode.g:1919:4: otherlv_2= 'Te ofrezco con el alma'
                    {
                    otherlv_2=(Token)match(input,133,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getReturnAccess().getTeOfrezcoConElAlmaKeyword_0_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalDearCode.g:1924:4: otherlv_3= 'Dejo en tus manos'
                    {
                    otherlv_3=(Token)match(input,134,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getReturnAccess().getDejoEnTusManosKeyword_0_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalDearCode.g:1929:4: otherlv_4= 'Susurro a tu coraz\\u00F3n'
                    {
                    otherlv_4=(Token)match(input,135,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getReturnAccess().getSusurroATuCorazNKeyword_0_4());
                    			

                    }
                    break;

            }

            // InternalDearCode.g:1934:3: ( (lv_expresion_5_0= ruleExpression ) )
            // InternalDearCode.g:1935:4: (lv_expresion_5_0= ruleExpression )
            {
            // InternalDearCode.g:1935:4: (lv_expresion_5_0= ruleExpression )
            // InternalDearCode.g:1936:5: lv_expresion_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getReturnAccess().getExpresionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_35);
            lv_expresion_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReturnRule());
            					}
            					set(
            						current,
            						"expresion",
            						lv_expresion_5_0,
            						"edu.upb.lp.DearCode.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDearCode.g:1953:3: (otherlv_6= 'como promesa cumplida.' | otherlv_7= 'con un suspiro.' | otherlv_8= 'como un regalo eterno.' | otherlv_9= 'envuelto en mi amor.' | otherlv_10= 'con la esperanza de tu sonrisa.' )
            int alt46=5;
            switch ( input.LA(1) ) {
            case 136:
                {
                alt46=1;
                }
                break;
            case 137:
                {
                alt46=2;
                }
                break;
            case 138:
                {
                alt46=3;
                }
                break;
            case 139:
                {
                alt46=4;
                }
                break;
            case 140:
                {
                alt46=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalDearCode.g:1954:4: otherlv_6= 'como promesa cumplida.'
                    {
                    otherlv_6=(Token)match(input,136,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getReturnAccess().getComoPromesaCumplidaKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:1959:4: otherlv_7= 'con un suspiro.'
                    {
                    otherlv_7=(Token)match(input,137,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getReturnAccess().getConUnSuspiroKeyword_2_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalDearCode.g:1964:4: otherlv_8= 'como un regalo eterno.'
                    {
                    otherlv_8=(Token)match(input,138,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getReturnAccess().getComoUnRegaloEternoKeyword_2_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalDearCode.g:1969:4: otherlv_9= 'envuelto en mi amor.'
                    {
                    otherlv_9=(Token)match(input,139,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getReturnAccess().getEnvueltoEnMiAmorKeyword_2_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalDearCode.g:1974:4: otherlv_10= 'con la esperanza de tu sonrisa.'
                    {
                    otherlv_10=(Token)match(input,140,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getReturnAccess().getConLaEsperanzaDeTuSonrisaKeyword_2_4());
                    			

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
    // $ANTLR end "ruleReturn"


    // $ANTLR start "entryRuleExpression"
    // InternalDearCode.g:1983:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalDearCode.g:1983:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalDearCode.g:1984:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalDearCode.g:1990:1: ruleExpression returns [EObject current=null] : this_OrExpression_0= ruleOrExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:1996:2: (this_OrExpression_0= ruleOrExpression )
            // InternalDearCode.g:1997:2: this_OrExpression_0= ruleOrExpression
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
    // InternalDearCode.g:2008:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalDearCode.g:2008:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalDearCode.g:2009:2: iv_ruleOrExpression= ruleOrExpression EOF
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
    // InternalDearCode.g:2015:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= 'o tal vez' | otherlv_3= 'o quiz\\u00E1s' | otherlv_4= 'o acaso el amor permita' | otherlv_5= 'o si la luna lo desea' ) ( (lv_right_6_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:2021:2: ( (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= 'o tal vez' | otherlv_3= 'o quiz\\u00E1s' | otherlv_4= 'o acaso el amor permita' | otherlv_5= 'o si la luna lo desea' ) ( (lv_right_6_0= ruleAndExpression ) ) )* ) )
            // InternalDearCode.g:2022:2: (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= 'o tal vez' | otherlv_3= 'o quiz\\u00E1s' | otherlv_4= 'o acaso el amor permita' | otherlv_5= 'o si la luna lo desea' ) ( (lv_right_6_0= ruleAndExpression ) ) )* )
            {
            // InternalDearCode.g:2022:2: (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= 'o tal vez' | otherlv_3= 'o quiz\\u00E1s' | otherlv_4= 'o acaso el amor permita' | otherlv_5= 'o si la luna lo desea' ) ( (lv_right_6_0= ruleAndExpression ) ) )* )
            // InternalDearCode.g:2023:3: this_AndExpression_0= ruleAndExpression ( () (otherlv_2= 'o tal vez' | otherlv_3= 'o quiz\\u00E1s' | otherlv_4= 'o acaso el amor permita' | otherlv_5= 'o si la luna lo desea' ) ( (lv_right_6_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_36);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;


            			current = this_AndExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDearCode.g:2031:3: ( () (otherlv_2= 'o tal vez' | otherlv_3= 'o quiz\\u00E1s' | otherlv_4= 'o acaso el amor permita' | otherlv_5= 'o si la luna lo desea' ) ( (lv_right_6_0= ruleAndExpression ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=141 && LA48_0<=144)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalDearCode.g:2032:4: () (otherlv_2= 'o tal vez' | otherlv_3= 'o quiz\\u00E1s' | otherlv_4= 'o acaso el amor permita' | otherlv_5= 'o si la luna lo desea' ) ( (lv_right_6_0= ruleAndExpression ) )
            	    {
            	    // InternalDearCode.g:2032:4: ()
            	    // InternalDearCode.g:2033:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDearCode.g:2039:4: (otherlv_2= 'o tal vez' | otherlv_3= 'o quiz\\u00E1s' | otherlv_4= 'o acaso el amor permita' | otherlv_5= 'o si la luna lo desea' )
            	    int alt47=4;
            	    switch ( input.LA(1) ) {
            	    case 141:
            	        {
            	        alt47=1;
            	        }
            	        break;
            	    case 142:
            	        {
            	        alt47=2;
            	        }
            	        break;
            	    case 143:
            	        {
            	        alt47=3;
            	        }
            	        break;
            	    case 144:
            	        {
            	        alt47=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 47, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt47) {
            	        case 1 :
            	            // InternalDearCode.g:2040:5: otherlv_2= 'o tal vez'
            	            {
            	            otherlv_2=(Token)match(input,141,FOLLOW_10); 

            	            					newLeafNode(otherlv_2, grammarAccess.getOrExpressionAccess().getOTalVezKeyword_1_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalDearCode.g:2045:5: otherlv_3= 'o quiz\\u00E1s'
            	            {
            	            otherlv_3=(Token)match(input,142,FOLLOW_10); 

            	            					newLeafNode(otherlv_3, grammarAccess.getOrExpressionAccess().getOQuizSKeyword_1_1_1());
            	            				

            	            }
            	            break;
            	        case 3 :
            	            // InternalDearCode.g:2050:5: otherlv_4= 'o acaso el amor permita'
            	            {
            	            otherlv_4=(Token)match(input,143,FOLLOW_10); 

            	            					newLeafNode(otherlv_4, grammarAccess.getOrExpressionAccess().getOAcasoElAmorPermitaKeyword_1_1_2());
            	            				

            	            }
            	            break;
            	        case 4 :
            	            // InternalDearCode.g:2055:5: otherlv_5= 'o si la luna lo desea'
            	            {
            	            otherlv_5=(Token)match(input,144,FOLLOW_10); 

            	            					newLeafNode(otherlv_5, grammarAccess.getOrExpressionAccess().getOSiLaLunaLoDeseaKeyword_1_1_3());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalDearCode.g:2060:4: ( (lv_right_6_0= ruleAndExpression ) )
            	    // InternalDearCode.g:2061:5: (lv_right_6_0= ruleAndExpression )
            	    {
            	    // InternalDearCode.g:2061:5: (lv_right_6_0= ruleAndExpression )
            	    // InternalDearCode.g:2062:6: lv_right_6_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_36);
            	    lv_right_6_0=ruleAndExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_6_0,
            	    							"edu.upb.lp.DearCode.AndExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
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
    // InternalDearCode.g:2084:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalDearCode.g:2084:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalDearCode.g:2085:2: iv_ruleAndExpression= ruleAndExpression EOF
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
    // InternalDearCode.g:2091:1: ruleAndExpression returns [EObject current=null] : (this_EqualityExpression_0= ruleEqualityExpression ( () (otherlv_2= 'y tambi\\u00E9n' | otherlv_3= 'junto a' | otherlv_4= 'y adem\\u00E1s' | otherlv_5= 'y al mismo tiempo que' | otherlv_6= 'y junto con' | otherlv_7= 'y en uni\\u00F3n con' ) ( (lv_right_8_0= ruleEqualityExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject this_EqualityExpression_0 = null;

        EObject lv_right_8_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:2097:2: ( (this_EqualityExpression_0= ruleEqualityExpression ( () (otherlv_2= 'y tambi\\u00E9n' | otherlv_3= 'junto a' | otherlv_4= 'y adem\\u00E1s' | otherlv_5= 'y al mismo tiempo que' | otherlv_6= 'y junto con' | otherlv_7= 'y en uni\\u00F3n con' ) ( (lv_right_8_0= ruleEqualityExpression ) ) )* ) )
            // InternalDearCode.g:2098:2: (this_EqualityExpression_0= ruleEqualityExpression ( () (otherlv_2= 'y tambi\\u00E9n' | otherlv_3= 'junto a' | otherlv_4= 'y adem\\u00E1s' | otherlv_5= 'y al mismo tiempo que' | otherlv_6= 'y junto con' | otherlv_7= 'y en uni\\u00F3n con' ) ( (lv_right_8_0= ruleEqualityExpression ) ) )* )
            {
            // InternalDearCode.g:2098:2: (this_EqualityExpression_0= ruleEqualityExpression ( () (otherlv_2= 'y tambi\\u00E9n' | otherlv_3= 'junto a' | otherlv_4= 'y adem\\u00E1s' | otherlv_5= 'y al mismo tiempo que' | otherlv_6= 'y junto con' | otherlv_7= 'y en uni\\u00F3n con' ) ( (lv_right_8_0= ruleEqualityExpression ) ) )* )
            // InternalDearCode.g:2099:3: this_EqualityExpression_0= ruleEqualityExpression ( () (otherlv_2= 'y tambi\\u00E9n' | otherlv_3= 'junto a' | otherlv_4= 'y adem\\u00E1s' | otherlv_5= 'y al mismo tiempo que' | otherlv_6= 'y junto con' | otherlv_7= 'y en uni\\u00F3n con' ) ( (lv_right_8_0= ruleEqualityExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_37);
            this_EqualityExpression_0=ruleEqualityExpression();

            state._fsp--;


            			current = this_EqualityExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDearCode.g:2107:3: ( () (otherlv_2= 'y tambi\\u00E9n' | otherlv_3= 'junto a' | otherlv_4= 'y adem\\u00E1s' | otherlv_5= 'y al mismo tiempo que' | otherlv_6= 'y junto con' | otherlv_7= 'y en uni\\u00F3n con' ) ( (lv_right_8_0= ruleEqualityExpression ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=145 && LA50_0<=150)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalDearCode.g:2108:4: () (otherlv_2= 'y tambi\\u00E9n' | otherlv_3= 'junto a' | otherlv_4= 'y adem\\u00E1s' | otherlv_5= 'y al mismo tiempo que' | otherlv_6= 'y junto con' | otherlv_7= 'y en uni\\u00F3n con' ) ( (lv_right_8_0= ruleEqualityExpression ) )
            	    {
            	    // InternalDearCode.g:2108:4: ()
            	    // InternalDearCode.g:2109:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDearCode.g:2115:4: (otherlv_2= 'y tambi\\u00E9n' | otherlv_3= 'junto a' | otherlv_4= 'y adem\\u00E1s' | otherlv_5= 'y al mismo tiempo que' | otherlv_6= 'y junto con' | otherlv_7= 'y en uni\\u00F3n con' )
            	    int alt49=6;
            	    switch ( input.LA(1) ) {
            	    case 145:
            	        {
            	        alt49=1;
            	        }
            	        break;
            	    case 146:
            	        {
            	        alt49=2;
            	        }
            	        break;
            	    case 147:
            	        {
            	        alt49=3;
            	        }
            	        break;
            	    case 148:
            	        {
            	        alt49=4;
            	        }
            	        break;
            	    case 149:
            	        {
            	        alt49=5;
            	        }
            	        break;
            	    case 150:
            	        {
            	        alt49=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 49, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt49) {
            	        case 1 :
            	            // InternalDearCode.g:2116:5: otherlv_2= 'y tambi\\u00E9n'
            	            {
            	            otherlv_2=(Token)match(input,145,FOLLOW_10); 

            	            					newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getYTambiNKeyword_1_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalDearCode.g:2121:5: otherlv_3= 'junto a'
            	            {
            	            otherlv_3=(Token)match(input,146,FOLLOW_10); 

            	            					newLeafNode(otherlv_3, grammarAccess.getAndExpressionAccess().getJuntoAKeyword_1_1_1());
            	            				

            	            }
            	            break;
            	        case 3 :
            	            // InternalDearCode.g:2126:5: otherlv_4= 'y adem\\u00E1s'
            	            {
            	            otherlv_4=(Token)match(input,147,FOLLOW_10); 

            	            					newLeafNode(otherlv_4, grammarAccess.getAndExpressionAccess().getYAdemSKeyword_1_1_2());
            	            				

            	            }
            	            break;
            	        case 4 :
            	            // InternalDearCode.g:2131:5: otherlv_5= 'y al mismo tiempo que'
            	            {
            	            otherlv_5=(Token)match(input,148,FOLLOW_10); 

            	            					newLeafNode(otherlv_5, grammarAccess.getAndExpressionAccess().getYAlMismoTiempoQueKeyword_1_1_3());
            	            				

            	            }
            	            break;
            	        case 5 :
            	            // InternalDearCode.g:2136:5: otherlv_6= 'y junto con'
            	            {
            	            otherlv_6=(Token)match(input,149,FOLLOW_10); 

            	            					newLeafNode(otherlv_6, grammarAccess.getAndExpressionAccess().getYJuntoConKeyword_1_1_4());
            	            				

            	            }
            	            break;
            	        case 6 :
            	            // InternalDearCode.g:2141:5: otherlv_7= 'y en uni\\u00F3n con'
            	            {
            	            otherlv_7=(Token)match(input,150,FOLLOW_10); 

            	            					newLeafNode(otherlv_7, grammarAccess.getAndExpressionAccess().getYEnUniNConKeyword_1_1_5());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalDearCode.g:2146:4: ( (lv_right_8_0= ruleEqualityExpression ) )
            	    // InternalDearCode.g:2147:5: (lv_right_8_0= ruleEqualityExpression )
            	    {
            	    // InternalDearCode.g:2147:5: (lv_right_8_0= ruleEqualityExpression )
            	    // InternalDearCode.g:2148:6: lv_right_8_0= ruleEqualityExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightEqualityExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_37);
            	    lv_right_8_0=ruleEqualityExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_8_0,
            	    							"edu.upb.lp.DearCode.EqualityExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
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
    // InternalDearCode.g:2170:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // InternalDearCode.g:2170:59: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // InternalDearCode.g:2171:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
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
    // InternalDearCode.g:2177:1: ruleEqualityExpression returns [EObject current=null] : (this_RelationalExpression_0= ruleRelationalExpression ( () ( ( (lv_op_2_1= 'late al un\\u00EDsono con' | lv_op_2_2= 'canta con un matiz distinto a' | lv_op_2_3= 'late igual que' | lv_op_2_4= 'se distingue de' | lv_op_2_5= 'resuena igual que' | lv_op_2_6= 'vibra al mismo ritmo que' | lv_op_2_7= 'es id\\u00E9ntico a' | lv_op_2_8= 'se diferencia de' | lv_op_2_9= 'no coincide con' | lv_op_2_10= 'es distinto a' ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        Token lv_op_2_5=null;
        Token lv_op_2_6=null;
        Token lv_op_2_7=null;
        Token lv_op_2_8=null;
        Token lv_op_2_9=null;
        Token lv_op_2_10=null;
        EObject this_RelationalExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:2183:2: ( (this_RelationalExpression_0= ruleRelationalExpression ( () ( ( (lv_op_2_1= 'late al un\\u00EDsono con' | lv_op_2_2= 'canta con un matiz distinto a' | lv_op_2_3= 'late igual que' | lv_op_2_4= 'se distingue de' | lv_op_2_5= 'resuena igual que' | lv_op_2_6= 'vibra al mismo ritmo que' | lv_op_2_7= 'es id\\u00E9ntico a' | lv_op_2_8= 'se diferencia de' | lv_op_2_9= 'no coincide con' | lv_op_2_10= 'es distinto a' ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* ) )
            // InternalDearCode.g:2184:2: (this_RelationalExpression_0= ruleRelationalExpression ( () ( ( (lv_op_2_1= 'late al un\\u00EDsono con' | lv_op_2_2= 'canta con un matiz distinto a' | lv_op_2_3= 'late igual que' | lv_op_2_4= 'se distingue de' | lv_op_2_5= 'resuena igual que' | lv_op_2_6= 'vibra al mismo ritmo que' | lv_op_2_7= 'es id\\u00E9ntico a' | lv_op_2_8= 'se diferencia de' | lv_op_2_9= 'no coincide con' | lv_op_2_10= 'es distinto a' ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* )
            {
            // InternalDearCode.g:2184:2: (this_RelationalExpression_0= ruleRelationalExpression ( () ( ( (lv_op_2_1= 'late al un\\u00EDsono con' | lv_op_2_2= 'canta con un matiz distinto a' | lv_op_2_3= 'late igual que' | lv_op_2_4= 'se distingue de' | lv_op_2_5= 'resuena igual que' | lv_op_2_6= 'vibra al mismo ritmo que' | lv_op_2_7= 'es id\\u00E9ntico a' | lv_op_2_8= 'se diferencia de' | lv_op_2_9= 'no coincide con' | lv_op_2_10= 'es distinto a' ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* )
            // InternalDearCode.g:2185:3: this_RelationalExpression_0= ruleRelationalExpression ( () ( ( (lv_op_2_1= 'late al un\\u00EDsono con' | lv_op_2_2= 'canta con un matiz distinto a' | lv_op_2_3= 'late igual que' | lv_op_2_4= 'se distingue de' | lv_op_2_5= 'resuena igual que' | lv_op_2_6= 'vibra al mismo ritmo que' | lv_op_2_7= 'es id\\u00E9ntico a' | lv_op_2_8= 'se diferencia de' | lv_op_2_9= 'no coincide con' | lv_op_2_10= 'es distinto a' ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRelationalExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_38);
            this_RelationalExpression_0=ruleRelationalExpression();

            state._fsp--;


            			current = this_RelationalExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDearCode.g:2193:3: ( () ( ( (lv_op_2_1= 'late al un\\u00EDsono con' | lv_op_2_2= 'canta con un matiz distinto a' | lv_op_2_3= 'late igual que' | lv_op_2_4= 'se distingue de' | lv_op_2_5= 'resuena igual que' | lv_op_2_6= 'vibra al mismo ritmo que' | lv_op_2_7= 'es id\\u00E9ntico a' | lv_op_2_8= 'se diferencia de' | lv_op_2_9= 'no coincide con' | lv_op_2_10= 'es distinto a' ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( ((LA52_0>=151 && LA52_0<=160)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalDearCode.g:2194:4: () ( ( (lv_op_2_1= 'late al un\\u00EDsono con' | lv_op_2_2= 'canta con un matiz distinto a' | lv_op_2_3= 'late igual que' | lv_op_2_4= 'se distingue de' | lv_op_2_5= 'resuena igual que' | lv_op_2_6= 'vibra al mismo ritmo que' | lv_op_2_7= 'es id\\u00E9ntico a' | lv_op_2_8= 'se diferencia de' | lv_op_2_9= 'no coincide con' | lv_op_2_10= 'es distinto a' ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) )
            	    {
            	    // InternalDearCode.g:2194:4: ()
            	    // InternalDearCode.g:2195:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDearCode.g:2201:4: ( ( (lv_op_2_1= 'late al un\\u00EDsono con' | lv_op_2_2= 'canta con un matiz distinto a' | lv_op_2_3= 'late igual que' | lv_op_2_4= 'se distingue de' | lv_op_2_5= 'resuena igual que' | lv_op_2_6= 'vibra al mismo ritmo que' | lv_op_2_7= 'es id\\u00E9ntico a' | lv_op_2_8= 'se diferencia de' | lv_op_2_9= 'no coincide con' | lv_op_2_10= 'es distinto a' ) ) )
            	    // InternalDearCode.g:2202:5: ( (lv_op_2_1= 'late al un\\u00EDsono con' | lv_op_2_2= 'canta con un matiz distinto a' | lv_op_2_3= 'late igual que' | lv_op_2_4= 'se distingue de' | lv_op_2_5= 'resuena igual que' | lv_op_2_6= 'vibra al mismo ritmo que' | lv_op_2_7= 'es id\\u00E9ntico a' | lv_op_2_8= 'se diferencia de' | lv_op_2_9= 'no coincide con' | lv_op_2_10= 'es distinto a' ) )
            	    {
            	    // InternalDearCode.g:2202:5: ( (lv_op_2_1= 'late al un\\u00EDsono con' | lv_op_2_2= 'canta con un matiz distinto a' | lv_op_2_3= 'late igual que' | lv_op_2_4= 'se distingue de' | lv_op_2_5= 'resuena igual que' | lv_op_2_6= 'vibra al mismo ritmo que' | lv_op_2_7= 'es id\\u00E9ntico a' | lv_op_2_8= 'se diferencia de' | lv_op_2_9= 'no coincide con' | lv_op_2_10= 'es distinto a' ) )
            	    // InternalDearCode.g:2203:6: (lv_op_2_1= 'late al un\\u00EDsono con' | lv_op_2_2= 'canta con un matiz distinto a' | lv_op_2_3= 'late igual que' | lv_op_2_4= 'se distingue de' | lv_op_2_5= 'resuena igual que' | lv_op_2_6= 'vibra al mismo ritmo que' | lv_op_2_7= 'es id\\u00E9ntico a' | lv_op_2_8= 'se diferencia de' | lv_op_2_9= 'no coincide con' | lv_op_2_10= 'es distinto a' )
            	    {
            	    // InternalDearCode.g:2203:6: (lv_op_2_1= 'late al un\\u00EDsono con' | lv_op_2_2= 'canta con un matiz distinto a' | lv_op_2_3= 'late igual que' | lv_op_2_4= 'se distingue de' | lv_op_2_5= 'resuena igual que' | lv_op_2_6= 'vibra al mismo ritmo que' | lv_op_2_7= 'es id\\u00E9ntico a' | lv_op_2_8= 'se diferencia de' | lv_op_2_9= 'no coincide con' | lv_op_2_10= 'es distinto a' )
            	    int alt51=10;
            	    switch ( input.LA(1) ) {
            	    case 151:
            	        {
            	        alt51=1;
            	        }
            	        break;
            	    case 152:
            	        {
            	        alt51=2;
            	        }
            	        break;
            	    case 153:
            	        {
            	        alt51=3;
            	        }
            	        break;
            	    case 154:
            	        {
            	        alt51=4;
            	        }
            	        break;
            	    case 155:
            	        {
            	        alt51=5;
            	        }
            	        break;
            	    case 156:
            	        {
            	        alt51=6;
            	        }
            	        break;
            	    case 157:
            	        {
            	        alt51=7;
            	        }
            	        break;
            	    case 158:
            	        {
            	        alt51=8;
            	        }
            	        break;
            	    case 159:
            	        {
            	        alt51=9;
            	        }
            	        break;
            	    case 160:
            	        {
            	        alt51=10;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 51, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt51) {
            	        case 1 :
            	            // InternalDearCode.g:2204:7: lv_op_2_1= 'late al un\\u00EDsono con'
            	            {
            	            lv_op_2_1=(Token)match(input,151,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getEqualityExpressionAccess().getOpLateAlUnSonoConKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalDearCode.g:2215:7: lv_op_2_2= 'canta con un matiz distinto a'
            	            {
            	            lv_op_2_2=(Token)match(input,152,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getEqualityExpressionAccess().getOpCantaConUnMatizDistintoAKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalDearCode.g:2226:7: lv_op_2_3= 'late igual que'
            	            {
            	            lv_op_2_3=(Token)match(input,153,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_3, grammarAccess.getEqualityExpressionAccess().getOpLateIgualQueKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalDearCode.g:2237:7: lv_op_2_4= 'se distingue de'
            	            {
            	            lv_op_2_4=(Token)match(input,154,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_4, grammarAccess.getEqualityExpressionAccess().getOpSeDistingueDeKeyword_1_1_0_3());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_4, null);
            	            						

            	            }
            	            break;
            	        case 5 :
            	            // InternalDearCode.g:2248:7: lv_op_2_5= 'resuena igual que'
            	            {
            	            lv_op_2_5=(Token)match(input,155,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_5, grammarAccess.getEqualityExpressionAccess().getOpResuenaIgualQueKeyword_1_1_0_4());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_5, null);
            	            						

            	            }
            	            break;
            	        case 6 :
            	            // InternalDearCode.g:2259:7: lv_op_2_6= 'vibra al mismo ritmo que'
            	            {
            	            lv_op_2_6=(Token)match(input,156,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_6, grammarAccess.getEqualityExpressionAccess().getOpVibraAlMismoRitmoQueKeyword_1_1_0_5());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_6, null);
            	            						

            	            }
            	            break;
            	        case 7 :
            	            // InternalDearCode.g:2270:7: lv_op_2_7= 'es id\\u00E9ntico a'
            	            {
            	            lv_op_2_7=(Token)match(input,157,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_7, grammarAccess.getEqualityExpressionAccess().getOpEsIdNticoAKeyword_1_1_0_6());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_7, null);
            	            						

            	            }
            	            break;
            	        case 8 :
            	            // InternalDearCode.g:2281:7: lv_op_2_8= 'se diferencia de'
            	            {
            	            lv_op_2_8=(Token)match(input,158,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_8, grammarAccess.getEqualityExpressionAccess().getOpSeDiferenciaDeKeyword_1_1_0_7());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_8, null);
            	            						

            	            }
            	            break;
            	        case 9 :
            	            // InternalDearCode.g:2292:7: lv_op_2_9= 'no coincide con'
            	            {
            	            lv_op_2_9=(Token)match(input,159,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_9, grammarAccess.getEqualityExpressionAccess().getOpNoCoincideConKeyword_1_1_0_8());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_9, null);
            	            						

            	            }
            	            break;
            	        case 10 :
            	            // InternalDearCode.g:2303:7: lv_op_2_10= 'es distinto a'
            	            {
            	            lv_op_2_10=(Token)match(input,160,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_10, grammarAccess.getEqualityExpressionAccess().getOpEsDistintoAKeyword_1_1_0_9());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_10, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalDearCode.g:2316:4: ( (lv_right_3_0= ruleRelationalExpression ) )
            	    // InternalDearCode.g:2317:5: (lv_right_3_0= ruleRelationalExpression )
            	    {
            	    // InternalDearCode.g:2317:5: (lv_right_3_0= ruleRelationalExpression )
            	    // InternalDearCode.g:2318:6: lv_right_3_0= ruleRelationalExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRightRelationalExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_38);
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
            	    break loop52;
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
    // InternalDearCode.g:2340:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // InternalDearCode.g:2340:61: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // InternalDearCode.g:2341:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
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
    // InternalDearCode.g:2347:1: ruleRelationalExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( ( (lv_op_2_1= 'susurra con menos fuerza que' | lv_op_2_2= 'casi suspira al mismo nivel que' | lv_op_2_3= 'arde con m\\u00E1s pasi\\u00F3n que' | lv_op_2_4= 'rodea con tanta fuerza como' | lv_op_2_5= 'susurra menos que' | lv_op_2_6= 'casi igual que' | lv_op_2_7= 'arde mas que' | lv_op_2_8= 'abraza como' | lv_op_2_9= 'susurra m\\u00E1s suavemente que' | lv_op_2_10= 'tiene menos latidos que' | lv_op_2_11= 'susurra tan suavemente como' | lv_op_2_12= 'no supera a' | lv_op_2_13= 'susurra con m\\u00E1s fuerza que' | lv_op_2_14= 'tiene m\\u00E1s latidos que' | lv_op_2_15= 'susurra al menos con la misma fuerza que' | lv_op_2_16= 'al menos iguala a' ) ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* ) ;
    public final EObject ruleRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        Token lv_op_2_5=null;
        Token lv_op_2_6=null;
        Token lv_op_2_7=null;
        Token lv_op_2_8=null;
        Token lv_op_2_9=null;
        Token lv_op_2_10=null;
        Token lv_op_2_11=null;
        Token lv_op_2_12=null;
        Token lv_op_2_13=null;
        Token lv_op_2_14=null;
        Token lv_op_2_15=null;
        Token lv_op_2_16=null;
        EObject this_AdditiveExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:2353:2: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( ( (lv_op_2_1= 'susurra con menos fuerza que' | lv_op_2_2= 'casi suspira al mismo nivel que' | lv_op_2_3= 'arde con m\\u00E1s pasi\\u00F3n que' | lv_op_2_4= 'rodea con tanta fuerza como' | lv_op_2_5= 'susurra menos que' | lv_op_2_6= 'casi igual que' | lv_op_2_7= 'arde mas que' | lv_op_2_8= 'abraza como' | lv_op_2_9= 'susurra m\\u00E1s suavemente que' | lv_op_2_10= 'tiene menos latidos que' | lv_op_2_11= 'susurra tan suavemente como' | lv_op_2_12= 'no supera a' | lv_op_2_13= 'susurra con m\\u00E1s fuerza que' | lv_op_2_14= 'tiene m\\u00E1s latidos que' | lv_op_2_15= 'susurra al menos con la misma fuerza que' | lv_op_2_16= 'al menos iguala a' ) ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* ) )
            // InternalDearCode.g:2354:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( ( (lv_op_2_1= 'susurra con menos fuerza que' | lv_op_2_2= 'casi suspira al mismo nivel que' | lv_op_2_3= 'arde con m\\u00E1s pasi\\u00F3n que' | lv_op_2_4= 'rodea con tanta fuerza como' | lv_op_2_5= 'susurra menos que' | lv_op_2_6= 'casi igual que' | lv_op_2_7= 'arde mas que' | lv_op_2_8= 'abraza como' | lv_op_2_9= 'susurra m\\u00E1s suavemente que' | lv_op_2_10= 'tiene menos latidos que' | lv_op_2_11= 'susurra tan suavemente como' | lv_op_2_12= 'no supera a' | lv_op_2_13= 'susurra con m\\u00E1s fuerza que' | lv_op_2_14= 'tiene m\\u00E1s latidos que' | lv_op_2_15= 'susurra al menos con la misma fuerza que' | lv_op_2_16= 'al menos iguala a' ) ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* )
            {
            // InternalDearCode.g:2354:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( ( (lv_op_2_1= 'susurra con menos fuerza que' | lv_op_2_2= 'casi suspira al mismo nivel que' | lv_op_2_3= 'arde con m\\u00E1s pasi\\u00F3n que' | lv_op_2_4= 'rodea con tanta fuerza como' | lv_op_2_5= 'susurra menos que' | lv_op_2_6= 'casi igual que' | lv_op_2_7= 'arde mas que' | lv_op_2_8= 'abraza como' | lv_op_2_9= 'susurra m\\u00E1s suavemente que' | lv_op_2_10= 'tiene menos latidos que' | lv_op_2_11= 'susurra tan suavemente como' | lv_op_2_12= 'no supera a' | lv_op_2_13= 'susurra con m\\u00E1s fuerza que' | lv_op_2_14= 'tiene m\\u00E1s latidos que' | lv_op_2_15= 'susurra al menos con la misma fuerza que' | lv_op_2_16= 'al menos iguala a' ) ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* )
            // InternalDearCode.g:2355:3: this_AdditiveExpression_0= ruleAdditiveExpression ( () ( ( (lv_op_2_1= 'susurra con menos fuerza que' | lv_op_2_2= 'casi suspira al mismo nivel que' | lv_op_2_3= 'arde con m\\u00E1s pasi\\u00F3n que' | lv_op_2_4= 'rodea con tanta fuerza como' | lv_op_2_5= 'susurra menos que' | lv_op_2_6= 'casi igual que' | lv_op_2_7= 'arde mas que' | lv_op_2_8= 'abraza como' | lv_op_2_9= 'susurra m\\u00E1s suavemente que' | lv_op_2_10= 'tiene menos latidos que' | lv_op_2_11= 'susurra tan suavemente como' | lv_op_2_12= 'no supera a' | lv_op_2_13= 'susurra con m\\u00E1s fuerza que' | lv_op_2_14= 'tiene m\\u00E1s latidos que' | lv_op_2_15= 'susurra al menos con la misma fuerza que' | lv_op_2_16= 'al menos iguala a' ) ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getRelationalExpressionAccess().getAdditiveExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_39);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;


            			current = this_AdditiveExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDearCode.g:2363:3: ( () ( ( (lv_op_2_1= 'susurra con menos fuerza que' | lv_op_2_2= 'casi suspira al mismo nivel que' | lv_op_2_3= 'arde con m\\u00E1s pasi\\u00F3n que' | lv_op_2_4= 'rodea con tanta fuerza como' | lv_op_2_5= 'susurra menos que' | lv_op_2_6= 'casi igual que' | lv_op_2_7= 'arde mas que' | lv_op_2_8= 'abraza como' | lv_op_2_9= 'susurra m\\u00E1s suavemente que' | lv_op_2_10= 'tiene menos latidos que' | lv_op_2_11= 'susurra tan suavemente como' | lv_op_2_12= 'no supera a' | lv_op_2_13= 'susurra con m\\u00E1s fuerza que' | lv_op_2_14= 'tiene m\\u00E1s latidos que' | lv_op_2_15= 'susurra al menos con la misma fuerza que' | lv_op_2_16= 'al menos iguala a' ) ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=161 && LA54_0<=176)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalDearCode.g:2364:4: () ( ( (lv_op_2_1= 'susurra con menos fuerza que' | lv_op_2_2= 'casi suspira al mismo nivel que' | lv_op_2_3= 'arde con m\\u00E1s pasi\\u00F3n que' | lv_op_2_4= 'rodea con tanta fuerza como' | lv_op_2_5= 'susurra menos que' | lv_op_2_6= 'casi igual que' | lv_op_2_7= 'arde mas que' | lv_op_2_8= 'abraza como' | lv_op_2_9= 'susurra m\\u00E1s suavemente que' | lv_op_2_10= 'tiene menos latidos que' | lv_op_2_11= 'susurra tan suavemente como' | lv_op_2_12= 'no supera a' | lv_op_2_13= 'susurra con m\\u00E1s fuerza que' | lv_op_2_14= 'tiene m\\u00E1s latidos que' | lv_op_2_15= 'susurra al menos con la misma fuerza que' | lv_op_2_16= 'al menos iguala a' ) ) ) ( (lv_right_3_0= ruleAdditiveExpression ) )
            	    {
            	    // InternalDearCode.g:2364:4: ()
            	    // InternalDearCode.g:2365:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDearCode.g:2371:4: ( ( (lv_op_2_1= 'susurra con menos fuerza que' | lv_op_2_2= 'casi suspira al mismo nivel que' | lv_op_2_3= 'arde con m\\u00E1s pasi\\u00F3n que' | lv_op_2_4= 'rodea con tanta fuerza como' | lv_op_2_5= 'susurra menos que' | lv_op_2_6= 'casi igual que' | lv_op_2_7= 'arde mas que' | lv_op_2_8= 'abraza como' | lv_op_2_9= 'susurra m\\u00E1s suavemente que' | lv_op_2_10= 'tiene menos latidos que' | lv_op_2_11= 'susurra tan suavemente como' | lv_op_2_12= 'no supera a' | lv_op_2_13= 'susurra con m\\u00E1s fuerza que' | lv_op_2_14= 'tiene m\\u00E1s latidos que' | lv_op_2_15= 'susurra al menos con la misma fuerza que' | lv_op_2_16= 'al menos iguala a' ) ) )
            	    // InternalDearCode.g:2372:5: ( (lv_op_2_1= 'susurra con menos fuerza que' | lv_op_2_2= 'casi suspira al mismo nivel que' | lv_op_2_3= 'arde con m\\u00E1s pasi\\u00F3n que' | lv_op_2_4= 'rodea con tanta fuerza como' | lv_op_2_5= 'susurra menos que' | lv_op_2_6= 'casi igual que' | lv_op_2_7= 'arde mas que' | lv_op_2_8= 'abraza como' | lv_op_2_9= 'susurra m\\u00E1s suavemente que' | lv_op_2_10= 'tiene menos latidos que' | lv_op_2_11= 'susurra tan suavemente como' | lv_op_2_12= 'no supera a' | lv_op_2_13= 'susurra con m\\u00E1s fuerza que' | lv_op_2_14= 'tiene m\\u00E1s latidos que' | lv_op_2_15= 'susurra al menos con la misma fuerza que' | lv_op_2_16= 'al menos iguala a' ) )
            	    {
            	    // InternalDearCode.g:2372:5: ( (lv_op_2_1= 'susurra con menos fuerza que' | lv_op_2_2= 'casi suspira al mismo nivel que' | lv_op_2_3= 'arde con m\\u00E1s pasi\\u00F3n que' | lv_op_2_4= 'rodea con tanta fuerza como' | lv_op_2_5= 'susurra menos que' | lv_op_2_6= 'casi igual que' | lv_op_2_7= 'arde mas que' | lv_op_2_8= 'abraza como' | lv_op_2_9= 'susurra m\\u00E1s suavemente que' | lv_op_2_10= 'tiene menos latidos que' | lv_op_2_11= 'susurra tan suavemente como' | lv_op_2_12= 'no supera a' | lv_op_2_13= 'susurra con m\\u00E1s fuerza que' | lv_op_2_14= 'tiene m\\u00E1s latidos que' | lv_op_2_15= 'susurra al menos con la misma fuerza que' | lv_op_2_16= 'al menos iguala a' ) )
            	    // InternalDearCode.g:2373:6: (lv_op_2_1= 'susurra con menos fuerza que' | lv_op_2_2= 'casi suspira al mismo nivel que' | lv_op_2_3= 'arde con m\\u00E1s pasi\\u00F3n que' | lv_op_2_4= 'rodea con tanta fuerza como' | lv_op_2_5= 'susurra menos que' | lv_op_2_6= 'casi igual que' | lv_op_2_7= 'arde mas que' | lv_op_2_8= 'abraza como' | lv_op_2_9= 'susurra m\\u00E1s suavemente que' | lv_op_2_10= 'tiene menos latidos que' | lv_op_2_11= 'susurra tan suavemente como' | lv_op_2_12= 'no supera a' | lv_op_2_13= 'susurra con m\\u00E1s fuerza que' | lv_op_2_14= 'tiene m\\u00E1s latidos que' | lv_op_2_15= 'susurra al menos con la misma fuerza que' | lv_op_2_16= 'al menos iguala a' )
            	    {
            	    // InternalDearCode.g:2373:6: (lv_op_2_1= 'susurra con menos fuerza que' | lv_op_2_2= 'casi suspira al mismo nivel que' | lv_op_2_3= 'arde con m\\u00E1s pasi\\u00F3n que' | lv_op_2_4= 'rodea con tanta fuerza como' | lv_op_2_5= 'susurra menos que' | lv_op_2_6= 'casi igual que' | lv_op_2_7= 'arde mas que' | lv_op_2_8= 'abraza como' | lv_op_2_9= 'susurra m\\u00E1s suavemente que' | lv_op_2_10= 'tiene menos latidos que' | lv_op_2_11= 'susurra tan suavemente como' | lv_op_2_12= 'no supera a' | lv_op_2_13= 'susurra con m\\u00E1s fuerza que' | lv_op_2_14= 'tiene m\\u00E1s latidos que' | lv_op_2_15= 'susurra al menos con la misma fuerza que' | lv_op_2_16= 'al menos iguala a' )
            	    int alt53=16;
            	    switch ( input.LA(1) ) {
            	    case 161:
            	        {
            	        alt53=1;
            	        }
            	        break;
            	    case 162:
            	        {
            	        alt53=2;
            	        }
            	        break;
            	    case 163:
            	        {
            	        alt53=3;
            	        }
            	        break;
            	    case 164:
            	        {
            	        alt53=4;
            	        }
            	        break;
            	    case 165:
            	        {
            	        alt53=5;
            	        }
            	        break;
            	    case 166:
            	        {
            	        alt53=6;
            	        }
            	        break;
            	    case 167:
            	        {
            	        alt53=7;
            	        }
            	        break;
            	    case 168:
            	        {
            	        alt53=8;
            	        }
            	        break;
            	    case 169:
            	        {
            	        alt53=9;
            	        }
            	        break;
            	    case 170:
            	        {
            	        alt53=10;
            	        }
            	        break;
            	    case 171:
            	        {
            	        alt53=11;
            	        }
            	        break;
            	    case 172:
            	        {
            	        alt53=12;
            	        }
            	        break;
            	    case 173:
            	        {
            	        alt53=13;
            	        }
            	        break;
            	    case 174:
            	        {
            	        alt53=14;
            	        }
            	        break;
            	    case 175:
            	        {
            	        alt53=15;
            	        }
            	        break;
            	    case 176:
            	        {
            	        alt53=16;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 53, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt53) {
            	        case 1 :
            	            // InternalDearCode.g:2374:7: lv_op_2_1= 'susurra con menos fuerza que'
            	            {
            	            lv_op_2_1=(Token)match(input,161,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getRelationalExpressionAccess().getOpSusurraConMenosFuerzaQueKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalDearCode.g:2385:7: lv_op_2_2= 'casi suspira al mismo nivel que'
            	            {
            	            lv_op_2_2=(Token)match(input,162,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getRelationalExpressionAccess().getOpCasiSuspiraAlMismoNivelQueKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalDearCode.g:2396:7: lv_op_2_3= 'arde con m\\u00E1s pasi\\u00F3n que'
            	            {
            	            lv_op_2_3=(Token)match(input,163,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_3, grammarAccess.getRelationalExpressionAccess().getOpArdeConMSPasiNQueKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalDearCode.g:2407:7: lv_op_2_4= 'rodea con tanta fuerza como'
            	            {
            	            lv_op_2_4=(Token)match(input,164,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_4, grammarAccess.getRelationalExpressionAccess().getOpRodeaConTantaFuerzaComoKeyword_1_1_0_3());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_4, null);
            	            						

            	            }
            	            break;
            	        case 5 :
            	            // InternalDearCode.g:2418:7: lv_op_2_5= 'susurra menos que'
            	            {
            	            lv_op_2_5=(Token)match(input,165,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_5, grammarAccess.getRelationalExpressionAccess().getOpSusurraMenosQueKeyword_1_1_0_4());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_5, null);
            	            						

            	            }
            	            break;
            	        case 6 :
            	            // InternalDearCode.g:2429:7: lv_op_2_6= 'casi igual que'
            	            {
            	            lv_op_2_6=(Token)match(input,166,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_6, grammarAccess.getRelationalExpressionAccess().getOpCasiIgualQueKeyword_1_1_0_5());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_6, null);
            	            						

            	            }
            	            break;
            	        case 7 :
            	            // InternalDearCode.g:2440:7: lv_op_2_7= 'arde mas que'
            	            {
            	            lv_op_2_7=(Token)match(input,167,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_7, grammarAccess.getRelationalExpressionAccess().getOpArdeMasQueKeyword_1_1_0_6());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_7, null);
            	            						

            	            }
            	            break;
            	        case 8 :
            	            // InternalDearCode.g:2451:7: lv_op_2_8= 'abraza como'
            	            {
            	            lv_op_2_8=(Token)match(input,168,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_8, grammarAccess.getRelationalExpressionAccess().getOpAbrazaComoKeyword_1_1_0_7());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_8, null);
            	            						

            	            }
            	            break;
            	        case 9 :
            	            // InternalDearCode.g:2462:7: lv_op_2_9= 'susurra m\\u00E1s suavemente que'
            	            {
            	            lv_op_2_9=(Token)match(input,169,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_9, grammarAccess.getRelationalExpressionAccess().getOpSusurraMSSuavementeQueKeyword_1_1_0_8());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_9, null);
            	            						

            	            }
            	            break;
            	        case 10 :
            	            // InternalDearCode.g:2473:7: lv_op_2_10= 'tiene menos latidos que'
            	            {
            	            lv_op_2_10=(Token)match(input,170,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_10, grammarAccess.getRelationalExpressionAccess().getOpTieneMenosLatidosQueKeyword_1_1_0_9());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_10, null);
            	            						

            	            }
            	            break;
            	        case 11 :
            	            // InternalDearCode.g:2484:7: lv_op_2_11= 'susurra tan suavemente como'
            	            {
            	            lv_op_2_11=(Token)match(input,171,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_11, grammarAccess.getRelationalExpressionAccess().getOpSusurraTanSuavementeComoKeyword_1_1_0_10());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_11, null);
            	            						

            	            }
            	            break;
            	        case 12 :
            	            // InternalDearCode.g:2495:7: lv_op_2_12= 'no supera a'
            	            {
            	            lv_op_2_12=(Token)match(input,172,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_12, grammarAccess.getRelationalExpressionAccess().getOpNoSuperaAKeyword_1_1_0_11());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_12, null);
            	            						

            	            }
            	            break;
            	        case 13 :
            	            // InternalDearCode.g:2506:7: lv_op_2_13= 'susurra con m\\u00E1s fuerza que'
            	            {
            	            lv_op_2_13=(Token)match(input,173,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_13, grammarAccess.getRelationalExpressionAccess().getOpSusurraConMSFuerzaQueKeyword_1_1_0_12());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_13, null);
            	            						

            	            }
            	            break;
            	        case 14 :
            	            // InternalDearCode.g:2517:7: lv_op_2_14= 'tiene m\\u00E1s latidos que'
            	            {
            	            lv_op_2_14=(Token)match(input,174,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_14, grammarAccess.getRelationalExpressionAccess().getOpTieneMSLatidosQueKeyword_1_1_0_13());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_14, null);
            	            						

            	            }
            	            break;
            	        case 15 :
            	            // InternalDearCode.g:2528:7: lv_op_2_15= 'susurra al menos con la misma fuerza que'
            	            {
            	            lv_op_2_15=(Token)match(input,175,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_15, grammarAccess.getRelationalExpressionAccess().getOpSusurraAlMenosConLaMismaFuerzaQueKeyword_1_1_0_14());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_15, null);
            	            						

            	            }
            	            break;
            	        case 16 :
            	            // InternalDearCode.g:2539:7: lv_op_2_16= 'al menos iguala a'
            	            {
            	            lv_op_2_16=(Token)match(input,176,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_16, grammarAccess.getRelationalExpressionAccess().getOpAlMenosIgualaAKeyword_1_1_0_15());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_16, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalDearCode.g:2552:4: ( (lv_right_3_0= ruleAdditiveExpression ) )
            	    // InternalDearCode.g:2553:5: (lv_right_3_0= ruleAdditiveExpression )
            	    {
            	    // InternalDearCode.g:2553:5: (lv_right_3_0= ruleAdditiveExpression )
            	    // InternalDearCode.g:2554:6: lv_right_3_0= ruleAdditiveExpression
            	    {

            	    						newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightAdditiveExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_39);
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
            	    break loop54;
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
    // InternalDearCode.g:2576:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // InternalDearCode.g:2576:59: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalDearCode.g:2577:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
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
    // InternalDearCode.g:2583:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_op_2_1= 'unidos en un solo suspiro con' | lv_op_2_2= 'fundidos en la llama de' | lv_op_2_3= 'se une a' | lv_op_2_4= 'se funde con' | lv_op_2_5= 'sumado al latido de' | lv_op_2_6= 'combinado con la pasi\\u00F3n de' | lv_op_2_7= 'entrelazado con' | lv_op_2_8= 'a\\u00F1adido al suspiro de' ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        Token lv_op_2_5=null;
        Token lv_op_2_6=null;
        Token lv_op_2_7=null;
        Token lv_op_2_8=null;
        EObject this_MultiplicativeExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:2589:2: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_op_2_1= 'unidos en un solo suspiro con' | lv_op_2_2= 'fundidos en la llama de' | lv_op_2_3= 'se une a' | lv_op_2_4= 'se funde con' | lv_op_2_5= 'sumado al latido de' | lv_op_2_6= 'combinado con la pasi\\u00F3n de' | lv_op_2_7= 'entrelazado con' | lv_op_2_8= 'a\\u00F1adido al suspiro de' ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // InternalDearCode.g:2590:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_op_2_1= 'unidos en un solo suspiro con' | lv_op_2_2= 'fundidos en la llama de' | lv_op_2_3= 'se une a' | lv_op_2_4= 'se funde con' | lv_op_2_5= 'sumado al latido de' | lv_op_2_6= 'combinado con la pasi\\u00F3n de' | lv_op_2_7= 'entrelazado con' | lv_op_2_8= 'a\\u00F1adido al suspiro de' ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // InternalDearCode.g:2590:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_op_2_1= 'unidos en un solo suspiro con' | lv_op_2_2= 'fundidos en la llama de' | lv_op_2_3= 'se une a' | lv_op_2_4= 'se funde con' | lv_op_2_5= 'sumado al latido de' | lv_op_2_6= 'combinado con la pasi\\u00F3n de' | lv_op_2_7= 'entrelazado con' | lv_op_2_8= 'a\\u00F1adido al suspiro de' ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // InternalDearCode.g:2591:3: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_op_2_1= 'unidos en un solo suspiro con' | lv_op_2_2= 'fundidos en la llama de' | lv_op_2_3= 'se une a' | lv_op_2_4= 'se funde con' | lv_op_2_5= 'sumado al latido de' | lv_op_2_6= 'combinado con la pasi\\u00F3n de' | lv_op_2_7= 'entrelazado con' | lv_op_2_8= 'a\\u00F1adido al suspiro de' ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_40);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;


            			current = this_MultiplicativeExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDearCode.g:2599:3: ( () ( ( (lv_op_2_1= 'unidos en un solo suspiro con' | lv_op_2_2= 'fundidos en la llama de' | lv_op_2_3= 'se une a' | lv_op_2_4= 'se funde con' | lv_op_2_5= 'sumado al latido de' | lv_op_2_6= 'combinado con la pasi\\u00F3n de' | lv_op_2_7= 'entrelazado con' | lv_op_2_8= 'a\\u00F1adido al suspiro de' ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>=177 && LA56_0<=184)) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalDearCode.g:2600:4: () ( ( (lv_op_2_1= 'unidos en un solo suspiro con' | lv_op_2_2= 'fundidos en la llama de' | lv_op_2_3= 'se une a' | lv_op_2_4= 'se funde con' | lv_op_2_5= 'sumado al latido de' | lv_op_2_6= 'combinado con la pasi\\u00F3n de' | lv_op_2_7= 'entrelazado con' | lv_op_2_8= 'a\\u00F1adido al suspiro de' ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // InternalDearCode.g:2600:4: ()
            	    // InternalDearCode.g:2601:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDearCode.g:2607:4: ( ( (lv_op_2_1= 'unidos en un solo suspiro con' | lv_op_2_2= 'fundidos en la llama de' | lv_op_2_3= 'se une a' | lv_op_2_4= 'se funde con' | lv_op_2_5= 'sumado al latido de' | lv_op_2_6= 'combinado con la pasi\\u00F3n de' | lv_op_2_7= 'entrelazado con' | lv_op_2_8= 'a\\u00F1adido al suspiro de' ) ) )
            	    // InternalDearCode.g:2608:5: ( (lv_op_2_1= 'unidos en un solo suspiro con' | lv_op_2_2= 'fundidos en la llama de' | lv_op_2_3= 'se une a' | lv_op_2_4= 'se funde con' | lv_op_2_5= 'sumado al latido de' | lv_op_2_6= 'combinado con la pasi\\u00F3n de' | lv_op_2_7= 'entrelazado con' | lv_op_2_8= 'a\\u00F1adido al suspiro de' ) )
            	    {
            	    // InternalDearCode.g:2608:5: ( (lv_op_2_1= 'unidos en un solo suspiro con' | lv_op_2_2= 'fundidos en la llama de' | lv_op_2_3= 'se une a' | lv_op_2_4= 'se funde con' | lv_op_2_5= 'sumado al latido de' | lv_op_2_6= 'combinado con la pasi\\u00F3n de' | lv_op_2_7= 'entrelazado con' | lv_op_2_8= 'a\\u00F1adido al suspiro de' ) )
            	    // InternalDearCode.g:2609:6: (lv_op_2_1= 'unidos en un solo suspiro con' | lv_op_2_2= 'fundidos en la llama de' | lv_op_2_3= 'se une a' | lv_op_2_4= 'se funde con' | lv_op_2_5= 'sumado al latido de' | lv_op_2_6= 'combinado con la pasi\\u00F3n de' | lv_op_2_7= 'entrelazado con' | lv_op_2_8= 'a\\u00F1adido al suspiro de' )
            	    {
            	    // InternalDearCode.g:2609:6: (lv_op_2_1= 'unidos en un solo suspiro con' | lv_op_2_2= 'fundidos en la llama de' | lv_op_2_3= 'se une a' | lv_op_2_4= 'se funde con' | lv_op_2_5= 'sumado al latido de' | lv_op_2_6= 'combinado con la pasi\\u00F3n de' | lv_op_2_7= 'entrelazado con' | lv_op_2_8= 'a\\u00F1adido al suspiro de' )
            	    int alt55=8;
            	    switch ( input.LA(1) ) {
            	    case 177:
            	        {
            	        alt55=1;
            	        }
            	        break;
            	    case 178:
            	        {
            	        alt55=2;
            	        }
            	        break;
            	    case 179:
            	        {
            	        alt55=3;
            	        }
            	        break;
            	    case 180:
            	        {
            	        alt55=4;
            	        }
            	        break;
            	    case 181:
            	        {
            	        alt55=5;
            	        }
            	        break;
            	    case 182:
            	        {
            	        alt55=6;
            	        }
            	        break;
            	    case 183:
            	        {
            	        alt55=7;
            	        }
            	        break;
            	    case 184:
            	        {
            	        alt55=8;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 55, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt55) {
            	        case 1 :
            	            // InternalDearCode.g:2610:7: lv_op_2_1= 'unidos en un solo suspiro con'
            	            {
            	            lv_op_2_1=(Token)match(input,177,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getAdditiveExpressionAccess().getOpUnidosEnUnSoloSuspiroConKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditiveExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalDearCode.g:2621:7: lv_op_2_2= 'fundidos en la llama de'
            	            {
            	            lv_op_2_2=(Token)match(input,178,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getAdditiveExpressionAccess().getOpFundidosEnLaLlamaDeKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditiveExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalDearCode.g:2632:7: lv_op_2_3= 'se une a'
            	            {
            	            lv_op_2_3=(Token)match(input,179,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_3, grammarAccess.getAdditiveExpressionAccess().getOpSeUneAKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditiveExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalDearCode.g:2643:7: lv_op_2_4= 'se funde con'
            	            {
            	            lv_op_2_4=(Token)match(input,180,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_4, grammarAccess.getAdditiveExpressionAccess().getOpSeFundeConKeyword_1_1_0_3());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditiveExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_4, null);
            	            						

            	            }
            	            break;
            	        case 5 :
            	            // InternalDearCode.g:2654:7: lv_op_2_5= 'sumado al latido de'
            	            {
            	            lv_op_2_5=(Token)match(input,181,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_5, grammarAccess.getAdditiveExpressionAccess().getOpSumadoAlLatidoDeKeyword_1_1_0_4());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditiveExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_5, null);
            	            						

            	            }
            	            break;
            	        case 6 :
            	            // InternalDearCode.g:2665:7: lv_op_2_6= 'combinado con la pasi\\u00F3n de'
            	            {
            	            lv_op_2_6=(Token)match(input,182,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_6, grammarAccess.getAdditiveExpressionAccess().getOpCombinadoConLaPasiNDeKeyword_1_1_0_5());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditiveExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_6, null);
            	            						

            	            }
            	            break;
            	        case 7 :
            	            // InternalDearCode.g:2676:7: lv_op_2_7= 'entrelazado con'
            	            {
            	            lv_op_2_7=(Token)match(input,183,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_7, grammarAccess.getAdditiveExpressionAccess().getOpEntrelazadoConKeyword_1_1_0_6());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditiveExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_7, null);
            	            						

            	            }
            	            break;
            	        case 8 :
            	            // InternalDearCode.g:2687:7: lv_op_2_8= 'a\\u00F1adido al suspiro de'
            	            {
            	            lv_op_2_8=(Token)match(input,184,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_8, grammarAccess.getAdditiveExpressionAccess().getOpAAdidoAlSuspiroDeKeyword_1_1_0_7());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditiveExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_8, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalDearCode.g:2700:4: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // InternalDearCode.g:2701:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // InternalDearCode.g:2701:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // InternalDearCode.g:2702:6: lv_right_3_0= ruleMultiplicativeExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_40);
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
            	    break loop56;
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
    // InternalDearCode.g:2724:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalDearCode.g:2724:65: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalDearCode.g:2725:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
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
    // InternalDearCode.g:2731:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( (lv_op_2_1= 'fortalecidos por el fuego de' | lv_op_2_2= 'separados entre los ecos de' | lv_op_2_3= 'resuena con el eco de' | lv_op_2_4= 'crece con' | lv_op_2_5= 'resuena en' | lv_op_2_6= 'se divide entre' ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        Token lv_op_2_5=null;
        Token lv_op_2_6=null;
        EObject this_UnaryExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:2737:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( (lv_op_2_1= 'fortalecidos por el fuego de' | lv_op_2_2= 'separados entre los ecos de' | lv_op_2_3= 'resuena con el eco de' | lv_op_2_4= 'crece con' | lv_op_2_5= 'resuena en' | lv_op_2_6= 'se divide entre' ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* ) )
            // InternalDearCode.g:2738:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( (lv_op_2_1= 'fortalecidos por el fuego de' | lv_op_2_2= 'separados entre los ecos de' | lv_op_2_3= 'resuena con el eco de' | lv_op_2_4= 'crece con' | lv_op_2_5= 'resuena en' | lv_op_2_6= 'se divide entre' ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* )
            {
            // InternalDearCode.g:2738:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( (lv_op_2_1= 'fortalecidos por el fuego de' | lv_op_2_2= 'separados entre los ecos de' | lv_op_2_3= 'resuena con el eco de' | lv_op_2_4= 'crece con' | lv_op_2_5= 'resuena en' | lv_op_2_6= 'se divide entre' ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* )
            // InternalDearCode.g:2739:3: this_UnaryExpression_0= ruleUnaryExpression ( () ( ( (lv_op_2_1= 'fortalecidos por el fuego de' | lv_op_2_2= 'separados entre los ecos de' | lv_op_2_3= 'resuena con el eco de' | lv_op_2_4= 'crece con' | lv_op_2_5= 'resuena en' | lv_op_2_6= 'se divide entre' ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getUnaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_41);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;


            			current = this_UnaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDearCode.g:2747:3: ( () ( ( (lv_op_2_1= 'fortalecidos por el fuego de' | lv_op_2_2= 'separados entre los ecos de' | lv_op_2_3= 'resuena con el eco de' | lv_op_2_4= 'crece con' | lv_op_2_5= 'resuena en' | lv_op_2_6= 'se divide entre' ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( ((LA58_0>=185 && LA58_0<=190)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalDearCode.g:2748:4: () ( ( (lv_op_2_1= 'fortalecidos por el fuego de' | lv_op_2_2= 'separados entre los ecos de' | lv_op_2_3= 'resuena con el eco de' | lv_op_2_4= 'crece con' | lv_op_2_5= 'resuena en' | lv_op_2_6= 'se divide entre' ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) )
            	    {
            	    // InternalDearCode.g:2748:4: ()
            	    // InternalDearCode.g:2749:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDearCode.g:2755:4: ( ( (lv_op_2_1= 'fortalecidos por el fuego de' | lv_op_2_2= 'separados entre los ecos de' | lv_op_2_3= 'resuena con el eco de' | lv_op_2_4= 'crece con' | lv_op_2_5= 'resuena en' | lv_op_2_6= 'se divide entre' ) ) )
            	    // InternalDearCode.g:2756:5: ( (lv_op_2_1= 'fortalecidos por el fuego de' | lv_op_2_2= 'separados entre los ecos de' | lv_op_2_3= 'resuena con el eco de' | lv_op_2_4= 'crece con' | lv_op_2_5= 'resuena en' | lv_op_2_6= 'se divide entre' ) )
            	    {
            	    // InternalDearCode.g:2756:5: ( (lv_op_2_1= 'fortalecidos por el fuego de' | lv_op_2_2= 'separados entre los ecos de' | lv_op_2_3= 'resuena con el eco de' | lv_op_2_4= 'crece con' | lv_op_2_5= 'resuena en' | lv_op_2_6= 'se divide entre' ) )
            	    // InternalDearCode.g:2757:6: (lv_op_2_1= 'fortalecidos por el fuego de' | lv_op_2_2= 'separados entre los ecos de' | lv_op_2_3= 'resuena con el eco de' | lv_op_2_4= 'crece con' | lv_op_2_5= 'resuena en' | lv_op_2_6= 'se divide entre' )
            	    {
            	    // InternalDearCode.g:2757:6: (lv_op_2_1= 'fortalecidos por el fuego de' | lv_op_2_2= 'separados entre los ecos de' | lv_op_2_3= 'resuena con el eco de' | lv_op_2_4= 'crece con' | lv_op_2_5= 'resuena en' | lv_op_2_6= 'se divide entre' )
            	    int alt57=6;
            	    switch ( input.LA(1) ) {
            	    case 185:
            	        {
            	        alt57=1;
            	        }
            	        break;
            	    case 186:
            	        {
            	        alt57=2;
            	        }
            	        break;
            	    case 187:
            	        {
            	        alt57=3;
            	        }
            	        break;
            	    case 188:
            	        {
            	        alt57=4;
            	        }
            	        break;
            	    case 189:
            	        {
            	        alt57=5;
            	        }
            	        break;
            	    case 190:
            	        {
            	        alt57=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 57, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt57) {
            	        case 1 :
            	            // InternalDearCode.g:2758:7: lv_op_2_1= 'fortalecidos por el fuego de'
            	            {
            	            lv_op_2_1=(Token)match(input,185,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getMultiplicativeExpressionAccess().getOpFortalecidosPorElFuegoDeKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicativeExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalDearCode.g:2769:7: lv_op_2_2= 'separados entre los ecos de'
            	            {
            	            lv_op_2_2=(Token)match(input,186,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getMultiplicativeExpressionAccess().getOpSeparadosEntreLosEcosDeKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicativeExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalDearCode.g:2780:7: lv_op_2_3= 'resuena con el eco de'
            	            {
            	            lv_op_2_3=(Token)match(input,187,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_3, grammarAccess.getMultiplicativeExpressionAccess().getOpResuenaConElEcoDeKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicativeExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalDearCode.g:2791:7: lv_op_2_4= 'crece con'
            	            {
            	            lv_op_2_4=(Token)match(input,188,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_4, grammarAccess.getMultiplicativeExpressionAccess().getOpCreceConKeyword_1_1_0_3());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicativeExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_4, null);
            	            						

            	            }
            	            break;
            	        case 5 :
            	            // InternalDearCode.g:2802:7: lv_op_2_5= 'resuena en'
            	            {
            	            lv_op_2_5=(Token)match(input,189,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_5, grammarAccess.getMultiplicativeExpressionAccess().getOpResuenaEnKeyword_1_1_0_4());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicativeExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_5, null);
            	            						

            	            }
            	            break;
            	        case 6 :
            	            // InternalDearCode.g:2813:7: lv_op_2_6= 'se divide entre'
            	            {
            	            lv_op_2_6=(Token)match(input,190,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_6, grammarAccess.getMultiplicativeExpressionAccess().getOpSeDivideEntreKeyword_1_1_0_5());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicativeExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_6, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalDearCode.g:2826:4: ( (lv_right_3_0= ruleUnaryExpression ) )
            	    // InternalDearCode.g:2827:5: (lv_right_3_0= ruleUnaryExpression )
            	    {
            	    // InternalDearCode.g:2827:5: (lv_right_3_0= ruleUnaryExpression )
            	    // InternalDearCode.g:2828:6: lv_right_3_0= ruleUnaryExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightUnaryExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_41);
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
            	    break loop58;
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
    // InternalDearCode.g:2850:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalDearCode.g:2850:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalDearCode.g:2851:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
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
    // InternalDearCode.g:2857:1: ruleUnaryExpression returns [EObject current=null] : ( ( () ( ( (lv_op_1_1= 'no creo que' | lv_op_1_2= 'no siento que' | lv_op_1_3= 'no me parece que' | lv_op_1_4= 'no percibo que' | lv_op_1_5= 'dudo que' ) ) ) ( (lv_expression_2_0= ruleUnaryExpression ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_1=null;
        Token lv_op_1_2=null;
        Token lv_op_1_3=null;
        Token lv_op_1_4=null;
        Token lv_op_1_5=null;
        EObject lv_expression_2_0 = null;

        EObject this_PrimaryExpression_3 = null;



        	enterRule();

        try {
            // InternalDearCode.g:2863:2: ( ( ( () ( ( (lv_op_1_1= 'no creo que' | lv_op_1_2= 'no siento que' | lv_op_1_3= 'no me parece que' | lv_op_1_4= 'no percibo que' | lv_op_1_5= 'dudo que' ) ) ) ( (lv_expression_2_0= ruleUnaryExpression ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression ) )
            // InternalDearCode.g:2864:2: ( ( () ( ( (lv_op_1_1= 'no creo que' | lv_op_1_2= 'no siento que' | lv_op_1_3= 'no me parece que' | lv_op_1_4= 'no percibo que' | lv_op_1_5= 'dudo que' ) ) ) ( (lv_expression_2_0= ruleUnaryExpression ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression )
            {
            // InternalDearCode.g:2864:2: ( ( () ( ( (lv_op_1_1= 'no creo que' | lv_op_1_2= 'no siento que' | lv_op_1_3= 'no me parece que' | lv_op_1_4= 'no percibo que' | lv_op_1_5= 'dudo que' ) ) ) ( (lv_expression_2_0= ruleUnaryExpression ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=191 && LA60_0<=195)) ) {
                alt60=1;
            }
            else if ( ((LA60_0>=RULE_ID && LA60_0<=RULE_STRING)||LA60_0==196||(LA60_0>=198 && LA60_0<=203)) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalDearCode.g:2865:3: ( () ( ( (lv_op_1_1= 'no creo que' | lv_op_1_2= 'no siento que' | lv_op_1_3= 'no me parece que' | lv_op_1_4= 'no percibo que' | lv_op_1_5= 'dudo que' ) ) ) ( (lv_expression_2_0= ruleUnaryExpression ) ) )
                    {
                    // InternalDearCode.g:2865:3: ( () ( ( (lv_op_1_1= 'no creo que' | lv_op_1_2= 'no siento que' | lv_op_1_3= 'no me parece que' | lv_op_1_4= 'no percibo que' | lv_op_1_5= 'dudo que' ) ) ) ( (lv_expression_2_0= ruleUnaryExpression ) ) )
                    // InternalDearCode.g:2866:4: () ( ( (lv_op_1_1= 'no creo que' | lv_op_1_2= 'no siento que' | lv_op_1_3= 'no me parece que' | lv_op_1_4= 'no percibo que' | lv_op_1_5= 'dudo que' ) ) ) ( (lv_expression_2_0= ruleUnaryExpression ) )
                    {
                    // InternalDearCode.g:2866:4: ()
                    // InternalDearCode.g:2867:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryExpressionAccess().getUnaryExpressionAction_0_0(),
                    						current);
                    				

                    }

                    // InternalDearCode.g:2873:4: ( ( (lv_op_1_1= 'no creo que' | lv_op_1_2= 'no siento que' | lv_op_1_3= 'no me parece que' | lv_op_1_4= 'no percibo que' | lv_op_1_5= 'dudo que' ) ) )
                    // InternalDearCode.g:2874:5: ( (lv_op_1_1= 'no creo que' | lv_op_1_2= 'no siento que' | lv_op_1_3= 'no me parece que' | lv_op_1_4= 'no percibo que' | lv_op_1_5= 'dudo que' ) )
                    {
                    // InternalDearCode.g:2874:5: ( (lv_op_1_1= 'no creo que' | lv_op_1_2= 'no siento que' | lv_op_1_3= 'no me parece que' | lv_op_1_4= 'no percibo que' | lv_op_1_5= 'dudo que' ) )
                    // InternalDearCode.g:2875:6: (lv_op_1_1= 'no creo que' | lv_op_1_2= 'no siento que' | lv_op_1_3= 'no me parece que' | lv_op_1_4= 'no percibo que' | lv_op_1_5= 'dudo que' )
                    {
                    // InternalDearCode.g:2875:6: (lv_op_1_1= 'no creo que' | lv_op_1_2= 'no siento que' | lv_op_1_3= 'no me parece que' | lv_op_1_4= 'no percibo que' | lv_op_1_5= 'dudo que' )
                    int alt59=5;
                    switch ( input.LA(1) ) {
                    case 191:
                        {
                        alt59=1;
                        }
                        break;
                    case 192:
                        {
                        alt59=2;
                        }
                        break;
                    case 193:
                        {
                        alt59=3;
                        }
                        break;
                    case 194:
                        {
                        alt59=4;
                        }
                        break;
                    case 195:
                        {
                        alt59=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 59, 0, input);

                        throw nvae;
                    }

                    switch (alt59) {
                        case 1 :
                            // InternalDearCode.g:2876:7: lv_op_1_1= 'no creo que'
                            {
                            lv_op_1_1=(Token)match(input,191,FOLLOW_10); 

                            							newLeafNode(lv_op_1_1, grammarAccess.getUnaryExpressionAccess().getOpNoCreoQueKeyword_0_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getUnaryExpressionRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_1_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalDearCode.g:2887:7: lv_op_1_2= 'no siento que'
                            {
                            lv_op_1_2=(Token)match(input,192,FOLLOW_10); 

                            							newLeafNode(lv_op_1_2, grammarAccess.getUnaryExpressionAccess().getOpNoSientoQueKeyword_0_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getUnaryExpressionRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_1_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalDearCode.g:2898:7: lv_op_1_3= 'no me parece que'
                            {
                            lv_op_1_3=(Token)match(input,193,FOLLOW_10); 

                            							newLeafNode(lv_op_1_3, grammarAccess.getUnaryExpressionAccess().getOpNoMePareceQueKeyword_0_1_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getUnaryExpressionRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_1_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalDearCode.g:2909:7: lv_op_1_4= 'no percibo que'
                            {
                            lv_op_1_4=(Token)match(input,194,FOLLOW_10); 

                            							newLeafNode(lv_op_1_4, grammarAccess.getUnaryExpressionAccess().getOpNoPerciboQueKeyword_0_1_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getUnaryExpressionRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_1_4, null);
                            						

                            }
                            break;
                        case 5 :
                            // InternalDearCode.g:2920:7: lv_op_1_5= 'dudo que'
                            {
                            lv_op_1_5=(Token)match(input,195,FOLLOW_10); 

                            							newLeafNode(lv_op_1_5, grammarAccess.getUnaryExpressionAccess().getOpDudoQueKeyword_0_1_0_4());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getUnaryExpressionRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_1_5, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalDearCode.g:2933:4: ( (lv_expression_2_0= ruleUnaryExpression ) )
                    // InternalDearCode.g:2934:5: (lv_expression_2_0= ruleUnaryExpression )
                    {
                    // InternalDearCode.g:2934:5: (lv_expression_2_0= ruleUnaryExpression )
                    // InternalDearCode.g:2935:6: lv_expression_2_0= ruleUnaryExpression
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
                    // InternalDearCode.g:2954:3: this_PrimaryExpression_3= rulePrimaryExpression
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
    // InternalDearCode.g:2966:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalDearCode.g:2966:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalDearCode.g:2967:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalDearCode.g:2973:1: rulePrimaryExpression returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_valueInt_4_0= RULE_INT ) ) ) | ( () ( (lv_valueString_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_valueBoolean_8_1= 'siempre' | lv_valueBoolean_8_2= 'jam\\u00E1s' ) ) ) ) | ( () ( (lv_name_10_0= RULE_ID ) ) ) | this_FunctionCall_11= ruleFunctionCall ) ;
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
            // InternalDearCode.g:2979:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_valueInt_4_0= RULE_INT ) ) ) | ( () ( (lv_valueString_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_valueBoolean_8_1= 'siempre' | lv_valueBoolean_8_2= 'jam\\u00E1s' ) ) ) ) | ( () ( (lv_name_10_0= RULE_ID ) ) ) | this_FunctionCall_11= ruleFunctionCall ) )
            // InternalDearCode.g:2980:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_valueInt_4_0= RULE_INT ) ) ) | ( () ( (lv_valueString_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_valueBoolean_8_1= 'siempre' | lv_valueBoolean_8_2= 'jam\\u00E1s' ) ) ) ) | ( () ( (lv_name_10_0= RULE_ID ) ) ) | this_FunctionCall_11= ruleFunctionCall )
            {
            // InternalDearCode.g:2980:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_valueInt_4_0= RULE_INT ) ) ) | ( () ( (lv_valueString_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_valueBoolean_8_1= 'siempre' | lv_valueBoolean_8_2= 'jam\\u00E1s' ) ) ) ) | ( () ( (lv_name_10_0= RULE_ID ) ) ) | this_FunctionCall_11= ruleFunctionCall )
            int alt62=6;
            switch ( input.LA(1) ) {
            case 196:
                {
                alt62=1;
                }
                break;
            case RULE_INT:
                {
                alt62=2;
                }
                break;
            case RULE_STRING:
                {
                alt62=3;
                }
                break;
            case 198:
            case 199:
                {
                alt62=4;
                }
                break;
            case RULE_ID:
                {
                alt62=5;
                }
                break;
            case 200:
            case 201:
            case 202:
            case 203:
                {
                alt62=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // InternalDearCode.g:2981:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalDearCode.g:2981:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalDearCode.g:2982:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,196,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_42);
                    this_Expression_1=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,197,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDearCode.g:3000:3: ( () ( (lv_valueInt_4_0= RULE_INT ) ) )
                    {
                    // InternalDearCode.g:3000:3: ( () ( (lv_valueInt_4_0= RULE_INT ) ) )
                    // InternalDearCode.g:3001:4: () ( (lv_valueInt_4_0= RULE_INT ) )
                    {
                    // InternalDearCode.g:3001:4: ()
                    // InternalDearCode.g:3002:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getNumberLiteralAction_1_0(),
                    						current);
                    				

                    }

                    // InternalDearCode.g:3008:4: ( (lv_valueInt_4_0= RULE_INT ) )
                    // InternalDearCode.g:3009:5: (lv_valueInt_4_0= RULE_INT )
                    {
                    // InternalDearCode.g:3009:5: (lv_valueInt_4_0= RULE_INT )
                    // InternalDearCode.g:3010:6: lv_valueInt_4_0= RULE_INT
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
                    // InternalDearCode.g:3028:3: ( () ( (lv_valueString_6_0= RULE_STRING ) ) )
                    {
                    // InternalDearCode.g:3028:3: ( () ( (lv_valueString_6_0= RULE_STRING ) ) )
                    // InternalDearCode.g:3029:4: () ( (lv_valueString_6_0= RULE_STRING ) )
                    {
                    // InternalDearCode.g:3029:4: ()
                    // InternalDearCode.g:3030:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getStringLiteralAction_2_0(),
                    						current);
                    				

                    }

                    // InternalDearCode.g:3036:4: ( (lv_valueString_6_0= RULE_STRING ) )
                    // InternalDearCode.g:3037:5: (lv_valueString_6_0= RULE_STRING )
                    {
                    // InternalDearCode.g:3037:5: (lv_valueString_6_0= RULE_STRING )
                    // InternalDearCode.g:3038:6: lv_valueString_6_0= RULE_STRING
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
                    // InternalDearCode.g:3056:3: ( () ( ( (lv_valueBoolean_8_1= 'siempre' | lv_valueBoolean_8_2= 'jam\\u00E1s' ) ) ) )
                    {
                    // InternalDearCode.g:3056:3: ( () ( ( (lv_valueBoolean_8_1= 'siempre' | lv_valueBoolean_8_2= 'jam\\u00E1s' ) ) ) )
                    // InternalDearCode.g:3057:4: () ( ( (lv_valueBoolean_8_1= 'siempre' | lv_valueBoolean_8_2= 'jam\\u00E1s' ) ) )
                    {
                    // InternalDearCode.g:3057:4: ()
                    // InternalDearCode.g:3058:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getBooleanLiteralAction_3_0(),
                    						current);
                    				

                    }

                    // InternalDearCode.g:3064:4: ( ( (lv_valueBoolean_8_1= 'siempre' | lv_valueBoolean_8_2= 'jam\\u00E1s' ) ) )
                    // InternalDearCode.g:3065:5: ( (lv_valueBoolean_8_1= 'siempre' | lv_valueBoolean_8_2= 'jam\\u00E1s' ) )
                    {
                    // InternalDearCode.g:3065:5: ( (lv_valueBoolean_8_1= 'siempre' | lv_valueBoolean_8_2= 'jam\\u00E1s' ) )
                    // InternalDearCode.g:3066:6: (lv_valueBoolean_8_1= 'siempre' | lv_valueBoolean_8_2= 'jam\\u00E1s' )
                    {
                    // InternalDearCode.g:3066:6: (lv_valueBoolean_8_1= 'siempre' | lv_valueBoolean_8_2= 'jam\\u00E1s' )
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==198) ) {
                        alt61=1;
                    }
                    else if ( (LA61_0==199) ) {
                        alt61=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 61, 0, input);

                        throw nvae;
                    }
                    switch (alt61) {
                        case 1 :
                            // InternalDearCode.g:3067:7: lv_valueBoolean_8_1= 'siempre'
                            {
                            lv_valueBoolean_8_1=(Token)match(input,198,FOLLOW_2); 

                            							newLeafNode(lv_valueBoolean_8_1, grammarAccess.getPrimaryExpressionAccess().getValueBooleanSiempreKeyword_3_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                            							}
                            							setWithLastConsumed(current, "valueBoolean", lv_valueBoolean_8_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalDearCode.g:3078:7: lv_valueBoolean_8_2= 'jam\\u00E1s'
                            {
                            lv_valueBoolean_8_2=(Token)match(input,199,FOLLOW_2); 

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
                    // InternalDearCode.g:3093:3: ( () ( (lv_name_10_0= RULE_ID ) ) )
                    {
                    // InternalDearCode.g:3093:3: ( () ( (lv_name_10_0= RULE_ID ) ) )
                    // InternalDearCode.g:3094:4: () ( (lv_name_10_0= RULE_ID ) )
                    {
                    // InternalDearCode.g:3094:4: ()
                    // InternalDearCode.g:3095:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getVariableReferenceAction_4_0(),
                    						current);
                    				

                    }

                    // InternalDearCode.g:3101:4: ( (lv_name_10_0= RULE_ID ) )
                    // InternalDearCode.g:3102:5: (lv_name_10_0= RULE_ID )
                    {
                    // InternalDearCode.g:3102:5: (lv_name_10_0= RULE_ID )
                    // InternalDearCode.g:3103:6: lv_name_10_0= RULE_ID
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
                    // InternalDearCode.g:3121:3: this_FunctionCall_11= ruleFunctionCall
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
    // InternalDearCode.g:3133:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalDearCode.g:3133:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalDearCode.g:3134:2: iv_ruleFunctionCall= ruleFunctionCall EOF
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
    // InternalDearCode.g:3140:1: ruleFunctionCall returns [EObject current=null] : ( () (otherlv_1= 'invoco a' | otherlv_2= 'susurro a' | otherlv_3= 'murmuro a' | otherlv_4= 'conjuro a' ) ( (lv_nameFuncion_5_0= ruleMI_ID ) ) ( (otherlv_6= 'con los regalos' | otherlv_7= 'ofreciendo' | otherlv_8= 'con los dones' | otherlv_9= 'presentando' | otherlv_10= 'ofreciendo mis tesoros' ) ( ( (lv_args_11_0= ruleExpression ) ) (otherlv_12= 'asimismo' | (otherlv_13= 'adicionalmente' ( (lv_args_14_0= ruleExpression ) ) ) )* )? (otherlv_15= 'en mi coraz\\u00F3n' | otherlv_16= 'en mi alma' ) )? ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_nameFuncion_5_0 = null;

        EObject lv_args_11_0 = null;

        EObject lv_args_14_0 = null;



        	enterRule();

        try {
            // InternalDearCode.g:3146:2: ( ( () (otherlv_1= 'invoco a' | otherlv_2= 'susurro a' | otherlv_3= 'murmuro a' | otherlv_4= 'conjuro a' ) ( (lv_nameFuncion_5_0= ruleMI_ID ) ) ( (otherlv_6= 'con los regalos' | otherlv_7= 'ofreciendo' | otherlv_8= 'con los dones' | otherlv_9= 'presentando' | otherlv_10= 'ofreciendo mis tesoros' ) ( ( (lv_args_11_0= ruleExpression ) ) (otherlv_12= 'asimismo' | (otherlv_13= 'adicionalmente' ( (lv_args_14_0= ruleExpression ) ) ) )* )? (otherlv_15= 'en mi coraz\\u00F3n' | otherlv_16= 'en mi alma' ) )? ) )
            // InternalDearCode.g:3147:2: ( () (otherlv_1= 'invoco a' | otherlv_2= 'susurro a' | otherlv_3= 'murmuro a' | otherlv_4= 'conjuro a' ) ( (lv_nameFuncion_5_0= ruleMI_ID ) ) ( (otherlv_6= 'con los regalos' | otherlv_7= 'ofreciendo' | otherlv_8= 'con los dones' | otherlv_9= 'presentando' | otherlv_10= 'ofreciendo mis tesoros' ) ( ( (lv_args_11_0= ruleExpression ) ) (otherlv_12= 'asimismo' | (otherlv_13= 'adicionalmente' ( (lv_args_14_0= ruleExpression ) ) ) )* )? (otherlv_15= 'en mi coraz\\u00F3n' | otherlv_16= 'en mi alma' ) )? )
            {
            // InternalDearCode.g:3147:2: ( () (otherlv_1= 'invoco a' | otherlv_2= 'susurro a' | otherlv_3= 'murmuro a' | otherlv_4= 'conjuro a' ) ( (lv_nameFuncion_5_0= ruleMI_ID ) ) ( (otherlv_6= 'con los regalos' | otherlv_7= 'ofreciendo' | otherlv_8= 'con los dones' | otherlv_9= 'presentando' | otherlv_10= 'ofreciendo mis tesoros' ) ( ( (lv_args_11_0= ruleExpression ) ) (otherlv_12= 'asimismo' | (otherlv_13= 'adicionalmente' ( (lv_args_14_0= ruleExpression ) ) ) )* )? (otherlv_15= 'en mi coraz\\u00F3n' | otherlv_16= 'en mi alma' ) )? )
            // InternalDearCode.g:3148:3: () (otherlv_1= 'invoco a' | otherlv_2= 'susurro a' | otherlv_3= 'murmuro a' | otherlv_4= 'conjuro a' ) ( (lv_nameFuncion_5_0= ruleMI_ID ) ) ( (otherlv_6= 'con los regalos' | otherlv_7= 'ofreciendo' | otherlv_8= 'con los dones' | otherlv_9= 'presentando' | otherlv_10= 'ofreciendo mis tesoros' ) ( ( (lv_args_11_0= ruleExpression ) ) (otherlv_12= 'asimismo' | (otherlv_13= 'adicionalmente' ( (lv_args_14_0= ruleExpression ) ) ) )* )? (otherlv_15= 'en mi coraz\\u00F3n' | otherlv_16= 'en mi alma' ) )?
            {
            // InternalDearCode.g:3148:3: ()
            // InternalDearCode.g:3149:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFunctionCallAccess().getFunctionCallAction_0(),
            					current);
            			

            }

            // InternalDearCode.g:3155:3: (otherlv_1= 'invoco a' | otherlv_2= 'susurro a' | otherlv_3= 'murmuro a' | otherlv_4= 'conjuro a' )
            int alt63=4;
            switch ( input.LA(1) ) {
            case 200:
                {
                alt63=1;
                }
                break;
            case 201:
                {
                alt63=2;
                }
                break;
            case 202:
                {
                alt63=3;
                }
                break;
            case 203:
                {
                alt63=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // InternalDearCode.g:3156:4: otherlv_1= 'invoco a'
                    {
                    otherlv_1=(Token)match(input,200,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getInvocoAKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:3161:4: otherlv_2= 'susurro a'
                    {
                    otherlv_2=(Token)match(input,201,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getSusurroAKeyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalDearCode.g:3166:4: otherlv_3= 'murmuro a'
                    {
                    otherlv_3=(Token)match(input,202,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getMurmuroAKeyword_1_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalDearCode.g:3171:4: otherlv_4= 'conjuro a'
                    {
                    otherlv_4=(Token)match(input,203,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getConjuroAKeyword_1_3());
                    			

                    }
                    break;

            }

            // InternalDearCode.g:3176:3: ( (lv_nameFuncion_5_0= ruleMI_ID ) )
            // InternalDearCode.g:3177:4: (lv_nameFuncion_5_0= ruleMI_ID )
            {
            // InternalDearCode.g:3177:4: (lv_nameFuncion_5_0= ruleMI_ID )
            // InternalDearCode.g:3178:5: lv_nameFuncion_5_0= ruleMI_ID
            {

            					newCompositeNode(grammarAccess.getFunctionCallAccess().getNameFuncionMI_IDParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_43);
            lv_nameFuncion_5_0=ruleMI_ID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionCallRule());
            					}
            					set(
            						current,
            						"nameFuncion",
            						lv_nameFuncion_5_0,
            						"edu.upb.lp.DearCode.MI_ID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDearCode.g:3195:3: ( (otherlv_6= 'con los regalos' | otherlv_7= 'ofreciendo' | otherlv_8= 'con los dones' | otherlv_9= 'presentando' | otherlv_10= 'ofreciendo mis tesoros' ) ( ( (lv_args_11_0= ruleExpression ) ) (otherlv_12= 'asimismo' | (otherlv_13= 'adicionalmente' ( (lv_args_14_0= ruleExpression ) ) ) )* )? (otherlv_15= 'en mi coraz\\u00F3n' | otherlv_16= 'en mi alma' ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=204 && LA68_0<=208)) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalDearCode.g:3196:4: (otherlv_6= 'con los regalos' | otherlv_7= 'ofreciendo' | otherlv_8= 'con los dones' | otherlv_9= 'presentando' | otherlv_10= 'ofreciendo mis tesoros' ) ( ( (lv_args_11_0= ruleExpression ) ) (otherlv_12= 'asimismo' | (otherlv_13= 'adicionalmente' ( (lv_args_14_0= ruleExpression ) ) ) )* )? (otherlv_15= 'en mi coraz\\u00F3n' | otherlv_16= 'en mi alma' )
                    {
                    // InternalDearCode.g:3196:4: (otherlv_6= 'con los regalos' | otherlv_7= 'ofreciendo' | otherlv_8= 'con los dones' | otherlv_9= 'presentando' | otherlv_10= 'ofreciendo mis tesoros' )
                    int alt64=5;
                    switch ( input.LA(1) ) {
                    case 204:
                        {
                        alt64=1;
                        }
                        break;
                    case 205:
                        {
                        alt64=2;
                        }
                        break;
                    case 206:
                        {
                        alt64=3;
                        }
                        break;
                    case 207:
                        {
                        alt64=4;
                        }
                        break;
                    case 208:
                        {
                        alt64=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 0, input);

                        throw nvae;
                    }

                    switch (alt64) {
                        case 1 :
                            // InternalDearCode.g:3197:5: otherlv_6= 'con los regalos'
                            {
                            otherlv_6=(Token)match(input,204,FOLLOW_44); 

                            					newLeafNode(otherlv_6, grammarAccess.getFunctionCallAccess().getConLosRegalosKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDearCode.g:3202:5: otherlv_7= 'ofreciendo'
                            {
                            otherlv_7=(Token)match(input,205,FOLLOW_44); 

                            					newLeafNode(otherlv_7, grammarAccess.getFunctionCallAccess().getOfreciendoKeyword_3_0_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalDearCode.g:3207:5: otherlv_8= 'con los dones'
                            {
                            otherlv_8=(Token)match(input,206,FOLLOW_44); 

                            					newLeafNode(otherlv_8, grammarAccess.getFunctionCallAccess().getConLosDonesKeyword_3_0_2());
                            				

                            }
                            break;
                        case 4 :
                            // InternalDearCode.g:3212:5: otherlv_9= 'presentando'
                            {
                            otherlv_9=(Token)match(input,207,FOLLOW_44); 

                            					newLeafNode(otherlv_9, grammarAccess.getFunctionCallAccess().getPresentandoKeyword_3_0_3());
                            				

                            }
                            break;
                        case 5 :
                            // InternalDearCode.g:3217:5: otherlv_10= 'ofreciendo mis tesoros'
                            {
                            otherlv_10=(Token)match(input,208,FOLLOW_44); 

                            					newLeafNode(otherlv_10, grammarAccess.getFunctionCallAccess().getOfreciendoMisTesorosKeyword_3_0_4());
                            				

                            }
                            break;

                    }

                    // InternalDearCode.g:3222:4: ( ( (lv_args_11_0= ruleExpression ) ) (otherlv_12= 'asimismo' | (otherlv_13= 'adicionalmente' ( (lv_args_14_0= ruleExpression ) ) ) )* )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( ((LA66_0>=RULE_ID && LA66_0<=RULE_STRING)||(LA66_0>=191 && LA66_0<=196)||(LA66_0>=198 && LA66_0<=203)) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // InternalDearCode.g:3223:5: ( (lv_args_11_0= ruleExpression ) ) (otherlv_12= 'asimismo' | (otherlv_13= 'adicionalmente' ( (lv_args_14_0= ruleExpression ) ) ) )*
                            {
                            // InternalDearCode.g:3223:5: ( (lv_args_11_0= ruleExpression ) )
                            // InternalDearCode.g:3224:6: (lv_args_11_0= ruleExpression )
                            {
                            // InternalDearCode.g:3224:6: (lv_args_11_0= ruleExpression )
                            // InternalDearCode.g:3225:7: lv_args_11_0= ruleExpression
                            {

                            							newCompositeNode(grammarAccess.getFunctionCallAccess().getArgsExpressionParserRuleCall_3_1_0_0());
                            						
                            pushFollow(FOLLOW_45);
                            lv_args_11_0=ruleExpression();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                            							}
                            							add(
                            								current,
                            								"args",
                            								lv_args_11_0,
                            								"edu.upb.lp.DearCode.Expression");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalDearCode.g:3242:5: (otherlv_12= 'asimismo' | (otherlv_13= 'adicionalmente' ( (lv_args_14_0= ruleExpression ) ) ) )*
                            loop65:
                            do {
                                int alt65=3;
                                int LA65_0 = input.LA(1);

                                if ( (LA65_0==209) ) {
                                    alt65=1;
                                }
                                else if ( (LA65_0==210) ) {
                                    alt65=2;
                                }


                                switch (alt65) {
                            	case 1 :
                            	    // InternalDearCode.g:3243:6: otherlv_12= 'asimismo'
                            	    {
                            	    otherlv_12=(Token)match(input,209,FOLLOW_45); 

                            	    						newLeafNode(otherlv_12, grammarAccess.getFunctionCallAccess().getAsimismoKeyword_3_1_1_0());
                            	    					

                            	    }
                            	    break;
                            	case 2 :
                            	    // InternalDearCode.g:3248:6: (otherlv_13= 'adicionalmente' ( (lv_args_14_0= ruleExpression ) ) )
                            	    {
                            	    // InternalDearCode.g:3248:6: (otherlv_13= 'adicionalmente' ( (lv_args_14_0= ruleExpression ) ) )
                            	    // InternalDearCode.g:3249:7: otherlv_13= 'adicionalmente' ( (lv_args_14_0= ruleExpression ) )
                            	    {
                            	    otherlv_13=(Token)match(input,210,FOLLOW_10); 

                            	    							newLeafNode(otherlv_13, grammarAccess.getFunctionCallAccess().getAdicionalmenteKeyword_3_1_1_1_0());
                            	    						
                            	    // InternalDearCode.g:3253:7: ( (lv_args_14_0= ruleExpression ) )
                            	    // InternalDearCode.g:3254:8: (lv_args_14_0= ruleExpression )
                            	    {
                            	    // InternalDearCode.g:3254:8: (lv_args_14_0= ruleExpression )
                            	    // InternalDearCode.g:3255:9: lv_args_14_0= ruleExpression
                            	    {

                            	    									newCompositeNode(grammarAccess.getFunctionCallAccess().getArgsExpressionParserRuleCall_3_1_1_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_45);
                            	    lv_args_14_0=ruleExpression();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"args",
                            	    										lv_args_14_0,
                            	    										"edu.upb.lp.DearCode.Expression");
                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop65;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // InternalDearCode.g:3275:4: (otherlv_15= 'en mi coraz\\u00F3n' | otherlv_16= 'en mi alma' )
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==211) ) {
                        alt67=1;
                    }
                    else if ( (LA67_0==212) ) {
                        alt67=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 67, 0, input);

                        throw nvae;
                    }
                    switch (alt67) {
                        case 1 :
                            // InternalDearCode.g:3276:5: otherlv_15= 'en mi coraz\\u00F3n'
                            {
                            otherlv_15=(Token)match(input,211,FOLLOW_2); 

                            					newLeafNode(otherlv_15, grammarAccess.getFunctionCallAccess().getEnMiCorazNKeyword_3_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDearCode.g:3281:5: otherlv_16= 'en mi alma'
                            {
                            otherlv_16=(Token)match(input,212,FOLLOW_2); 

                            					newLeafNode(otherlv_16, grammarAccess.getFunctionCallAccess().getEnMiAlmaKeyword_3_2_1());
                            				

                            }
                            break;

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
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleComment"
    // InternalDearCode.g:3291:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalDearCode.g:3291:48: (iv_ruleComment= ruleComment EOF )
            // InternalDearCode.g:3292:2: iv_ruleComment= ruleComment EOF
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
    // InternalDearCode.g:3298:1: ruleComment returns [EObject current=null] : ( (lv_value_0_0= RULE_ANYTEXT ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDearCode.g:3304:2: ( ( (lv_value_0_0= RULE_ANYTEXT ) ) )
            // InternalDearCode.g:3305:2: ( (lv_value_0_0= RULE_ANYTEXT ) )
            {
            // InternalDearCode.g:3305:2: ( (lv_value_0_0= RULE_ANYTEXT ) )
            // InternalDearCode.g:3306:3: (lv_value_0_0= RULE_ANYTEXT )
            {
            // InternalDearCode.g:3306:3: (lv_value_0_0= RULE_ANYTEXT )
            // InternalDearCode.g:3307:4: lv_value_0_0= RULE_ANYTEXT
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
    // InternalDearCode.g:3326:1: entryRuleMI_ID returns [EObject current=null] : iv_ruleMI_ID= ruleMI_ID EOF ;
    public final EObject entryRuleMI_ID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMI_ID = null;


        try {
            // InternalDearCode.g:3326:46: (iv_ruleMI_ID= ruleMI_ID EOF )
            // InternalDearCode.g:3327:2: iv_ruleMI_ID= ruleMI_ID EOF
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
    // InternalDearCode.g:3333:1: ruleMI_ID returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleMI_ID() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDearCode.g:3339:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalDearCode.g:3340:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalDearCode.g:3340:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDearCode.g:3341:3: (lv_name_0_0= RULE_ID )
            {
            // InternalDearCode.g:3341:3: (lv_name_0_0= RULE_ID )
            // InternalDearCode.g:3342:4: lv_name_0_0= RULE_ID
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
    // InternalDearCode.g:3361:1: entryRuleVerboDeclaracion returns [String current=null] : iv_ruleVerboDeclaracion= ruleVerboDeclaracion EOF ;
    public final String entryRuleVerboDeclaracion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVerboDeclaracion = null;


        try {
            // InternalDearCode.g:3361:56: (iv_ruleVerboDeclaracion= ruleVerboDeclaracion EOF )
            // InternalDearCode.g:3362:2: iv_ruleVerboDeclaracion= ruleVerboDeclaracion EOF
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
    // InternalDearCode.g:3368:1: ruleVerboDeclaracion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Te regalo' | kw= 'Te Ofrezco' | kw= 'Obsequio' | kw= 'Deposito en tu jard\\u00EDn' | kw= 'Te revelo' | kw= 'Te susurro' | kw= 'Te conf\\u00EDo' | kw= 'Te dedico' | kw= 'Te brindo' ) ;
    public final AntlrDatatypeRuleToken ruleVerboDeclaracion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDearCode.g:3374:2: ( (kw= 'Te regalo' | kw= 'Te Ofrezco' | kw= 'Obsequio' | kw= 'Deposito en tu jard\\u00EDn' | kw= 'Te revelo' | kw= 'Te susurro' | kw= 'Te conf\\u00EDo' | kw= 'Te dedico' | kw= 'Te brindo' ) )
            // InternalDearCode.g:3375:2: (kw= 'Te regalo' | kw= 'Te Ofrezco' | kw= 'Obsequio' | kw= 'Deposito en tu jard\\u00EDn' | kw= 'Te revelo' | kw= 'Te susurro' | kw= 'Te conf\\u00EDo' | kw= 'Te dedico' | kw= 'Te brindo' )
            {
            // InternalDearCode.g:3375:2: (kw= 'Te regalo' | kw= 'Te Ofrezco' | kw= 'Obsequio' | kw= 'Deposito en tu jard\\u00EDn' | kw= 'Te revelo' | kw= 'Te susurro' | kw= 'Te conf\\u00EDo' | kw= 'Te dedico' | kw= 'Te brindo' )
            int alt69=9;
            switch ( input.LA(1) ) {
            case 213:
                {
                alt69=1;
                }
                break;
            case 214:
                {
                alt69=2;
                }
                break;
            case 215:
                {
                alt69=3;
                }
                break;
            case 216:
                {
                alt69=4;
                }
                break;
            case 217:
                {
                alt69=5;
                }
                break;
            case 218:
                {
                alt69=6;
                }
                break;
            case 219:
                {
                alt69=7;
                }
                break;
            case 220:
                {
                alt69=8;
                }
                break;
            case 221:
                {
                alt69=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // InternalDearCode.g:3376:3: kw= 'Te regalo'
                    {
                    kw=(Token)match(input,213,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVerboDeclaracionAccess().getTeRegaloKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:3382:3: kw= 'Te Ofrezco'
                    {
                    kw=(Token)match(input,214,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVerboDeclaracionAccess().getTeOfrezcoKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalDearCode.g:3388:3: kw= 'Obsequio'
                    {
                    kw=(Token)match(input,215,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVerboDeclaracionAccess().getObsequioKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalDearCode.g:3394:3: kw= 'Deposito en tu jard\\u00EDn'
                    {
                    kw=(Token)match(input,216,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVerboDeclaracionAccess().getDepositoEnTuJardNKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalDearCode.g:3400:3: kw= 'Te revelo'
                    {
                    kw=(Token)match(input,217,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVerboDeclaracionAccess().getTeReveloKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalDearCode.g:3406:3: kw= 'Te susurro'
                    {
                    kw=(Token)match(input,218,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVerboDeclaracionAccess().getTeSusurroKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalDearCode.g:3412:3: kw= 'Te conf\\u00EDo'
                    {
                    kw=(Token)match(input,219,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVerboDeclaracionAccess().getTeConfOKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalDearCode.g:3418:3: kw= 'Te dedico'
                    {
                    kw=(Token)match(input,220,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVerboDeclaracionAccess().getTeDedicoKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalDearCode.g:3424:3: kw= 'Te brindo'
                    {
                    kw=(Token)match(input,221,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVerboDeclaracionAccess().getTeBrindoKeyword_8());
                    		

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
    // InternalDearCode.g:3433:1: entryRuleVerboReasignacion returns [String current=null] : iv_ruleVerboReasignacion= ruleVerboReasignacion EOF ;
    public final String entryRuleVerboReasignacion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVerboReasignacion = null;


        try {
            // InternalDearCode.g:3433:57: (iv_ruleVerboReasignacion= ruleVerboReasignacion EOF )
            // InternalDearCode.g:3434:2: iv_ruleVerboReasignacion= ruleVerboReasignacion EOF
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
    // InternalDearCode.g:3440:1: ruleVerboReasignacion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Perm\\u00EDteme alimentar' | kw= 'Perm\\u00EDteme regar' | kw= 'Perm\\u00EDteme ajustar' | kw= 'Reavivo' | kw= 'Renuevo' | kw= 'Reafirmo' | kw= 'Perm\\u00EDteme transformar' | kw= 'Renuevo con pasi\\u00F3n' | kw= 'Modifico con amor' ) ;
    public final AntlrDatatypeRuleToken ruleVerboReasignacion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDearCode.g:3446:2: ( (kw= 'Perm\\u00EDteme alimentar' | kw= 'Perm\\u00EDteme regar' | kw= 'Perm\\u00EDteme ajustar' | kw= 'Reavivo' | kw= 'Renuevo' | kw= 'Reafirmo' | kw= 'Perm\\u00EDteme transformar' | kw= 'Renuevo con pasi\\u00F3n' | kw= 'Modifico con amor' ) )
            // InternalDearCode.g:3447:2: (kw= 'Perm\\u00EDteme alimentar' | kw= 'Perm\\u00EDteme regar' | kw= 'Perm\\u00EDteme ajustar' | kw= 'Reavivo' | kw= 'Renuevo' | kw= 'Reafirmo' | kw= 'Perm\\u00EDteme transformar' | kw= 'Renuevo con pasi\\u00F3n' | kw= 'Modifico con amor' )
            {
            // InternalDearCode.g:3447:2: (kw= 'Perm\\u00EDteme alimentar' | kw= 'Perm\\u00EDteme regar' | kw= 'Perm\\u00EDteme ajustar' | kw= 'Reavivo' | kw= 'Renuevo' | kw= 'Reafirmo' | kw= 'Perm\\u00EDteme transformar' | kw= 'Renuevo con pasi\\u00F3n' | kw= 'Modifico con amor' )
            int alt70=9;
            switch ( input.LA(1) ) {
            case 222:
                {
                alt70=1;
                }
                break;
            case 223:
                {
                alt70=2;
                }
                break;
            case 224:
                {
                alt70=3;
                }
                break;
            case 225:
                {
                alt70=4;
                }
                break;
            case 226:
                {
                alt70=5;
                }
                break;
            case 227:
                {
                alt70=6;
                }
                break;
            case 228:
                {
                alt70=7;
                }
                break;
            case 229:
                {
                alt70=8;
                }
                break;
            case 230:
                {
                alt70=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // InternalDearCode.g:3448:3: kw= 'Perm\\u00EDteme alimentar'
                    {
                    kw=(Token)match(input,222,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVerboReasignacionAccess().getPermTemeAlimentarKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:3454:3: kw= 'Perm\\u00EDteme regar'
                    {
                    kw=(Token)match(input,223,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVerboReasignacionAccess().getPermTemeRegarKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalDearCode.g:3460:3: kw= 'Perm\\u00EDteme ajustar'
                    {
                    kw=(Token)match(input,224,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVerboReasignacionAccess().getPermTemeAjustarKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalDearCode.g:3466:3: kw= 'Reavivo'
                    {
                    kw=(Token)match(input,225,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVerboReasignacionAccess().getReavivoKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalDearCode.g:3472:3: kw= 'Renuevo'
                    {
                    kw=(Token)match(input,226,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVerboReasignacionAccess().getRenuevoKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalDearCode.g:3478:3: kw= 'Reafirmo'
                    {
                    kw=(Token)match(input,227,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVerboReasignacionAccess().getReafirmoKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalDearCode.g:3484:3: kw= 'Perm\\u00EDteme transformar'
                    {
                    kw=(Token)match(input,228,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVerboReasignacionAccess().getPermTemeTransformarKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalDearCode.g:3490:3: kw= 'Renuevo con pasi\\u00F3n'
                    {
                    kw=(Token)match(input,229,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVerboReasignacionAccess().getRenuevoConPasiNKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalDearCode.g:3496:3: kw= 'Modifico con amor'
                    {
                    kw=(Token)match(input,230,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVerboReasignacionAccess().getModificoConAmorKeyword_8());
                    		

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
    // InternalDearCode.g:3505:1: entryRuleArticulo returns [String current=null] : iv_ruleArticulo= ruleArticulo EOF ;
    public final String entryRuleArticulo() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArticulo = null;


        try {
            // InternalDearCode.g:3505:48: (iv_ruleArticulo= ruleArticulo EOF )
            // InternalDearCode.g:3506:2: iv_ruleArticulo= ruleArticulo EOF
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
    // InternalDearCode.g:3512:1: ruleArticulo returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'un' | kw= 'una' | kw= 'unos' | kw= 'unas' ) ;
    public final AntlrDatatypeRuleToken ruleArticulo() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDearCode.g:3518:2: ( (kw= 'un' | kw= 'una' | kw= 'unos' | kw= 'unas' ) )
            // InternalDearCode.g:3519:2: (kw= 'un' | kw= 'una' | kw= 'unos' | kw= 'unas' )
            {
            // InternalDearCode.g:3519:2: (kw= 'un' | kw= 'una' | kw= 'unos' | kw= 'unas' )
            int alt71=4;
            switch ( input.LA(1) ) {
            case 231:
                {
                alt71=1;
                }
                break;
            case 232:
                {
                alt71=2;
                }
                break;
            case 233:
                {
                alt71=3;
                }
                break;
            case 234:
                {
                alt71=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // InternalDearCode.g:3520:3: kw= 'un'
                    {
                    kw=(Token)match(input,231,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArticuloAccess().getUnKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:3526:3: kw= 'una'
                    {
                    kw=(Token)match(input,232,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArticuloAccess().getUnaKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalDearCode.g:3532:3: kw= 'unos'
                    {
                    kw=(Token)match(input,233,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArticuloAccess().getUnosKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalDearCode.g:3538:3: kw= 'unas'
                    {
                    kw=(Token)match(input,234,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArticuloAccess().getUnasKeyword_3());
                    		

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x007FF803FE000000L,0x0007F8003E007F00L,0x0000000000000000L,0x0000007FFFE00F00L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x007FF803FE000002L,0x0007F8003E007F00L,0x0000000000000000L,0x0000007FFFE00F00L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000078000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001C00010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x007FF803FE0000F0L,0x0007F8003E007F00L,0x8000000000000000L,0x0000007FFFE00FDFL});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001C00090L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000007FC00020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x1F00000000000080L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x1F00000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x007FF803FE000000L,0x0007F8003E007F00L,0x00000000000000F8L,0x0000007FFFE00F00L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0xA07FF803FE000000L,0x0007F8003E007FFAL,0x00000000000000F8L,0x0000007FFFE00F00L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x007FF803FE000000L,0x0007F8003E007FF8L,0x00000000000000F8L,0x0000007FFFE00F00L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x00000000000F8000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x007FF803FE000000L,0x0007F8003FF07F00L,0x00000000000000F8L,0x0000007FFFE00F00L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000003F00000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000003E00000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x007FF803FE000000L,0x0007FFC03E007F00L,0x00000000000000F8L,0x0000007FFFE00F00L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000001C00000L,0x3CF8000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000001C00000L,0x3F00000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000001C00000L,0x3000000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x3000000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x007FF803FE000000L,0xC007F8003E007F00L,0x00000000000000FFL,0x0000007FFFE00F00L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001F00L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000001E000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000000007E0000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000001FF800000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0001FFFE00000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x01FE000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x7E00000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x000000000001F000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x007FF803FE0000F0L,0x0007F8003E007F00L,0x8000000000000000L,0x0000007FFFF80FDFL});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000001E0000L});

}