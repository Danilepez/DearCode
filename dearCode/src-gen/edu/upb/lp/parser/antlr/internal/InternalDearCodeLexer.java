package edu.upb.lp.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDearCodeLexer extends Lexer {
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

    public InternalDearCodeLexer() {;} 
    public InternalDearCodeLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDearCodeLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalDearCode.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:11:7: ( 'Querido' )
            // InternalDearCode.g:11:9: 'Querido'
            {
            match("Querido"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:12:7: ( 'Querida' )
            // InternalDearCode.g:12:9: 'Querida'
            {
            match("Querida"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:13:7: ( 'Inspiras un amor dentro de m\\u00ED' )
            // InternalDearCode.g:13:9: 'Inspiras un amor dentro de m\\u00ED'
            {
            match("Inspiras un amor dentro de m\u00ED"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:14:7: ( 'Eres la chispa de mi alma' )
            // InternalDearCode.g:14:9: 'Eres la chispa de mi alma'
            {
            match("Eres la chispa de mi alma"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:15:7: ( 'Tu luz despierta mi ser' )
            // InternalDearCode.g:15:9: 'Tu luz despierta mi ser'
            {
            match("Tu luz despierta mi ser"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:16:7: ( '.' )
            // InternalDearCode.g:16:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:17:7: ( 'Con cari\\u00F1o, Tu programador' )
            // InternalDearCode.g:17:9: 'Con cari\\u00F1o, Tu programador'
            {
            match("Con cari\u00F1o, Tu programador"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:18:7: ( 'Espero la noche para tenerte conmigo' )
            // InternalDearCode.g:18:9: 'Espero la noche para tenerte conmigo'
            {
            match("Espero la noche para tenerte conmigo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:19:7: ( 'Tengo la suerte de tenerte siempre' )
            // InternalDearCode.g:19:9: 'Tengo la suerte de tenerte siempre'
            {
            match("Tengo la suerte de tenerte siempre"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:20:7: ( 'Haces que mi coraz\\u00F3n se acelere' )
            // InternalDearCode.g:20:9: 'Haces que mi coraz\\u00F3n se acelere'
            {
            match("Haces que mi coraz\u00F3n se acelere"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:21:7: ( 'n\\u00FAmero' )
            // InternalDearCode.g:21:9: 'n\\u00FAmero'
            {
            match("n\u00FAmero"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:22:7: ( 'texto' )
            // InternalDearCode.g:22:9: 'texto'
            {
            match("texto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:23:7: ( 'booleano' )
            // InternalDearCode.g:23:9: 'booleano'
            {
            match("booleano"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:24:7: ( 'Le ped\\u00ED al lector que me dijera' )
            // InternalDearCode.g:24:9: 'Le ped\\u00ED al lector que me dijera'
            {
            match("Le ped\u00ED al lector que me dijera"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:25:7: ( 'Le' )
            // InternalDearCode.g:25:9: 'Le'
            {
            match("Le"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:26:7: ( 'Escucho tu voz en el viento' )
            // InternalDearCode.g:26:9: 'Escucho tu voz en el viento'
            {
            match("Escucho tu voz en el viento"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:27:7: ( 'Atrapo un suspiro tuyo' )
            // InternalDearCode.g:27:9: 'Atrapo un suspiro tuyo'
            {
            match("Atrapo un suspiro tuyo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:28:7: ( 'Recojo tus palabras como p\\u00E9talos al alba' )
            // InternalDearCode.g:28:9: 'Recojo tus palabras como p\\u00E9talos al alba'
            {
            match("Recojo tus palabras como p\u00E9talos al alba"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:29:7: ( 'Tu aliento me habla en silencio' )
            // InternalDearCode.g:29:9: 'Tu aliento me habla en silencio'
            {
            match("Tu aliento me habla en silencio"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:30:7: ( 'Acaricio el eco de tu voz' )
            // InternalDearCode.g:30:9: 'Acaricio el eco de tu voz'
            {
            match("Acaricio el eco de tu voz"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:31:7: ( 'Guardo tus secretos en mi pecho' )
            // InternalDearCode.g:31:9: 'Guardo tus secretos en mi pecho'
            {
            match("Guardo tus secretos en mi pecho"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:32:7: ( 'Espero tu susurro como un amanecer' )
            // InternalDearCode.g:32:9: 'Espero tu susurro como un amanecer'
            {
            match("Espero tu susurro como un amanecer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:33:7: ( 'en un susurro num\\u00E9rico' )
            // InternalDearCode.g:33:9: 'en un susurro num\\u00E9rico'
            {
            match("en un susurro num\u00E9rico"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:34:7: ( 'con palabras de terciopelo' )
            // InternalDearCode.g:34:9: 'con palabras de terciopelo'
            {
            match("con palabras de terciopelo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:35:7: ( 'con un eco num\\u00E9rico' )
            // InternalDearCode.g:35:9: 'con un eco num\\u00E9rico'
            {
            match("con un eco num\u00E9rico"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:36:7: ( 'en un latido suave' )
            // InternalDearCode.g:36:9: 'en un latido suave'
            {
            match("en un latido suave"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:37:7: ( 'como un verso escrito en el cielo' )
            // InternalDearCode.g:37:9: 'como un verso escrito en el cielo'
            {
            match("como un verso escrito en el cielo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:38:7: ( 'envuelto en la luz de tus ojos' )
            // InternalDearCode.g:38:9: 'envuelto en la luz de tus ojos'
            {
            match("envuelto en la luz de tus ojos"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:39:7: ( 'con el perfume de tu esencia' )
            // InternalDearCode.g:39:9: 'con el perfume de tu esencia'
            {
            match("con el perfume de tu esencia"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:40:7: ( 'danzando en el comp\\u00E1s de mi coraz\\u00F3n' )
            // InternalDearCode.g:40:9: 'danzando en el comp\\u00E1s de mi coraz\\u00F3n'
            {
            match("danzando en el comp\u00E1s de mi coraz\u00F3n"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:41:7: ( 'tejiendo sue\\u00F1os con tus letras' )
            // InternalDearCode.g:41:9: 'tejiendo sue\\u00F1os con tus letras'
            {
            match("tejiendo sue\u00F1os con tus letras"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:42:7: ( 'Hoy le quise contar al mundo sobre:' )
            // InternalDearCode.g:42:9: 'Hoy le quise contar al mundo sobre:'
            {
            match("Hoy le quise contar al mundo sobre:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:43:7: ( 'Dejo que el mundo sienta sobre:' )
            // InternalDearCode.g:43:9: 'Dejo que el mundo sienta sobre:'
            {
            match("Dejo que el mundo sienta sobre:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:44:7: ( 'Susurro al universo el secreto sobre:' )
            // InternalDearCode.g:44:9: 'Susurro al universo el secreto sobre:'
            {
            match("Susurro al universo el secreto sobre:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:45:7: ( 'Grabo en el firmamento mi verdad acerca de:' )
            // InternalDearCode.g:45:9: 'Grabo en el firmamento mi verdad acerca de:'
            {
            match("Grabo en el firmamento mi verdad acerca de:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:46:7: ( 'Canto al viento mi anhelo de:' )
            // InternalDearCode.g:46:9: 'Canto al viento mi anhelo de:'
            {
            match("Canto al viento mi anhelo de:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:47:7: ( 'Env\\u00EDo al horizonte mi pasi\\u00F3n sobre:' )
            // InternalDearCode.g:47:9: 'Env\\u00EDo al horizonte mi pasi\\u00F3n sobre:'
            {
            match("Env\u00EDo al horizonte mi pasi\u00F3n sobre:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:48:7: ( 'Dejo que las nubes abracen mi voz en:' )
            // InternalDearCode.g:48:9: 'Dejo que las nubes abracen mi voz en:'
            {
            match("Dejo que las nubes abracen mi voz en:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:49:7: ( 'Si en tu corazon sientes que' )
            // InternalDearCode.g:49:9: 'Si en tu corazon sientes que'
            {
            match("Si en tu corazon sientes que"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:50:7: ( 'Si tu alma susurra que' )
            // InternalDearCode.g:50:9: 'Si tu alma susurra que'
            {
            match("Si tu alma susurra que"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:51:7: ( 'Si el latido de mi alma dice que' )
            // InternalDearCode.g:51:9: 'Si el latido de mi alma dice que'
            {
            match("Si el latido de mi alma dice que"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:52:7: ( 'Si el destino nos susurra que' )
            // InternalDearCode.g:52:9: 'Si el destino nos susurra que'
            {
            match("Si el destino nos susurra que"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:53:7: ( 'Si la luna refleja que' )
            // InternalDearCode.g:53:9: 'Si la luna refleja que'
            {
            match("Si la luna refleja que"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:54:7: ( ',' )
            // InternalDearCode.g:54:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:55:7: ( 'entonces deja que estas palabras florezcan:' )
            // InternalDearCode.g:55:9: 'entonces deja que estas palabras florezcan:'
            {
            match("entonces deja que estas palabras florezcan:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:56:7: ( 'entonces que brote este amor:' )
            // InternalDearCode.g:56:9: 'entonces que brote este amor:'
            {
            match("entonces que brote este amor:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:57:7: ( 'entonces que nazca este sue\\u00F1o:' )
            // InternalDearCode.g:57:9: 'entonces que nazca este sue\\u00F1o:'
            {
            match("entonces que nazca este sue\u00F1o:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:58:7: ( 'entonces que el universo conspire:' )
            // InternalDearCode.g:58:9: 'entonces que el universo conspire:'
            {
            match("entonces que el universo conspire:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:59:7: ( 'entonces que mi voz te abrace:' )
            // InternalDearCode.g:59:9: 'entonces que mi voz te abrace:'
            {
            match("entonces que mi voz te abrace:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:60:7: ( 'Pero si la noche calla otra verdad,' )
            // InternalDearCode.g:60:9: 'Pero si la noche calla otra verdad,'
            {
            match("Pero si la noche calla otra verdad,"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:61:7: ( 'que surja este suspiro:' )
            // InternalDearCode.g:61:9: 'que surja este suspiro:'
            {
            match("que surja este suspiro:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:62:7: ( 'Pero si el viento trae otro mensaje,' )
            // InternalDearCode.g:62:9: 'Pero si el viento trae otro mensaje,'
            {
            match("Pero si el viento trae otro mensaje,"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:63:7: ( 'que despierte esta pasi\\u00F3n:' )
            // InternalDearCode.g:63:9: 'que despierte esta pasi\\u00F3n:'
            {
            match("que despierte esta pasi\u00F3n:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:64:7: ( 'Pero si el coraz\\u00F3n duda,' )
            // InternalDearCode.g:64:9: 'Pero si el coraz\\u00F3n duda,'
            {
            match("Pero si el coraz\u00F3n duda,"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:65:7: ( 'que renazca esta esperanza:' )
            // InternalDearCode.g:65:9: 'que renazca esta esperanza:'
            {
            match("que renazca esta esperanza:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:66:7: ( 'Y as\\u00ED el universo sigue su curso.' )
            // InternalDearCode.g:66:9: 'Y as\\u00ED el universo sigue su curso.'
            {
            match("Y as\u00ED el universo sigue su curso."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:67:7: ( 'As\\u00ED sigue el canto del coraz\\u00F3n.' )
            // InternalDearCode.g:67:9: 'As\\u00ED sigue el canto del coraz\\u00F3n.'
            {
            match("As\u00ED sigue el canto del coraz\u00F3n."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:68:7: ( 'Y as\\u00ED la melod\\u00EDa contin\\u00FAa.' )
            // InternalDearCode.g:68:9: 'Y as\\u00ED la melod\\u00EDa contin\\u00FAa.'
            {
            match("Y as\u00ED la melod\u00EDa contin\u00FAa."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:69:7: ( 'Y el eco de nuestro amor perdura.' )
            // InternalDearCode.g:69:9: 'Y el eco de nuestro amor perdura.'
            {
            match("Y el eco de nuestro amor perdura."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:70:7: ( 'Y la danza de las estrellas sigue.' )
            // InternalDearCode.g:70:9: 'Y la danza de las estrellas sigue.'
            {
            match("Y la danza de las estrellas sigue."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:71:7: ( 'Mientras aun me piensas' )
            // InternalDearCode.g:71:9: 'Mientras aun me piensas'
            {
            match("Mientras aun me piensas"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:72:7: ( 'Mientras a\\u00FAn sue\\u00F1es con este momento' )
            // InternalDearCode.g:72:9: 'Mientras a\\u00FAn sue\\u00F1es con este momento'
            {
            match("Mientras a\u00FAn sue\u00F1es con este momento"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:73:7: ( 'Mientras mi coraz\\u00F3n te anhele' )
            // InternalDearCode.g:73:9: 'Mientras mi coraz\\u00F3n te anhele'
            {
            match("Mientras mi coraz\u00F3n te anhele"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:74:7: ( 'Mientras tu luz me gu\\u00EDe' )
            // InternalDearCode.g:74:9: 'Mientras tu luz me gu\\u00EDe'
            {
            match("Mientras tu luz me gu\u00EDe"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:75:7: ( 'Mientras el fuego de mi amor arda' )
            // InternalDearCode.g:75:9: 'Mientras el fuego de mi amor arda'
            {
            match("Mientras el fuego de mi amor arda"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:76:7: ( 'Mientras la luna nos ilumine' )
            // InternalDearCode.g:76:9: 'Mientras la luna nos ilumine'
            {
            match("Mientras la luna nos ilumine"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:77:7: ( 'Mientras tus ojos me miren' )
            // InternalDearCode.g:77:9: 'Mientras tus ojos me miren'
            {
            match("Mientras tus ojos me miren"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:78:7: ( 'haz que suceda:' )
            // InternalDearCode.g:78:9: 'haz que suceda:'
            {
            match("haz que suceda:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:79:7: ( 'tejiendo este amor:' )
            // InternalDearCode.g:79:9: 'tejiendo este amor:'
            {
            match("tejiendo este amor:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:80:7: ( 'deja que el tiempo se detenga:' )
            // InternalDearCode.g:80:9: 'deja que el tiempo se detenga:'
            {
            match("deja que el tiempo se detenga:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:81:7: ( 'haz que el universo conspire:' )
            // InternalDearCode.g:81:9: 'haz que el universo conspire:'
            {
            match("haz que el universo conspire:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:82:7: ( 'permite que el destino nos una:' )
            // InternalDearCode.g:82:9: 'permite que el destino nos una:'
            {
            match("permite que el destino nos una:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:83:7: ( 'Y as\\u00ED el susurro descansa.' )
            // InternalDearCode.g:83:9: 'Y as\\u00ED el susurro descansa.'
            {
            match("Y as\u00ED el susurro descansa."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:84:7: ( 'hasta que el anhelo repose' )
            // InternalDearCode.g:84:9: 'hasta que el anhelo repose'
            {
            match("hasta que el anhelo repose"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:85:7: ( 'Y el silencio envuelve nuestro amor.' )
            // InternalDearCode.g:85:9: 'Y el silencio envuelve nuestro amor.'
            {
            match("Y el silencio envuelve nuestro amor."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:86:7: ( 'Hasta que la eternidad nos encuentre.' )
            // InternalDearCode.g:86:9: 'Hasta que la eternidad nos encuentre.'
            {
            match("Hasta que la eternidad nos encuentre."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:87:7: ( 'Y la pasi\\u00F3n se convierte en recuerdo.' )
            // InternalDearCode.g:87:9: 'Y la pasi\\u00F3n se convierte en recuerdo.'
            {
            match("Y la pasi\u00F3n se convierte en recuerdo."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:88:7: ( 'En cada suspiro' )
            // InternalDearCode.g:88:9: 'En cada suspiro'
            {
            match("En cada suspiro"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:89:7: ( 'Por cada latido' )
            // InternalDearCode.g:89:9: 'Por cada latido'
            {
            match("Por cada latido"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:90:7: ( 'Por cada estrella que nos mira' )
            // InternalDearCode.g:90:9: 'Por cada estrella que nos mira'
            {
            match("Por cada estrella que nos mira"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:91:7: ( 'En cada p\\u00E9talo de rosa' )
            // InternalDearCode.g:91:9: 'En cada p\\u00E9talo de rosa'
            {
            match("En cada p\u00E9talo de rosa"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:92:7: ( 'Por cada ola que besa la orilla' )
            // InternalDearCode.g:92:9: 'Por cada ola que besa la orilla'
            {
            match("Por cada ola que besa la orilla"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:93:7: ( 'desde' )
            // InternalDearCode.g:93:9: 'desde'
            {
            match("desde"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:94:7: ( 'hasta' )
            // InternalDearCode.g:94:9: 'hasta'
            {
            match("hasta"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:95:7: ( 'con paso' )
            // InternalDearCode.g:95:9: 'con paso'
            {
            match("con paso"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:96:7: ( 'deja que el universo cante:' )
            // InternalDearCode.g:96:9: 'deja que el universo cante:'
            {
            match("deja que el universo cante:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:97:7: ( 'resuena este amor' )
            // InternalDearCode.g:97:9: 'resuena este amor'
            {
            match("resuena este amor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:98:7: ( 'que el viento susurre nuestro nombre:' )
            // InternalDearCode.g:98:9: 'que el viento susurre nuestro nombre:'
            {
            match("que el viento susurre nuestro nombre:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:99:8: ( 'que el cielo pinte nuestro amor:' )
            // InternalDearCode.g:99:10: 'que el cielo pinte nuestro amor:'
            {
            match("que el cielo pinte nuestro amor:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:100:8: ( 'que la tierra tiemble con nuestra pasi\\u00F3n:' )
            // InternalDearCode.g:100:10: 'que la tierra tiemble con nuestra pasi\\u00F3n:'
            {
            match("que la tierra tiemble con nuestra pasi\u00F3n:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:101:8: ( 'Cuando el \\u00FAltimo eco se calle.' )
            // InternalDearCode.g:101:10: 'Cuando el \\u00FAltimo eco se calle.'
            {
            match("Cuando el \u00FAltimo eco se calle."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:102:8: ( 'Y el eco se desvanece.' )
            // InternalDearCode.g:102:10: 'Y el eco se desvanece.'
            {
            match("Y el eco se desvanece."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:103:8: ( 'Y la \\u00FAltima estrella se apague.' )
            // InternalDearCode.g:103:10: 'Y la \\u00FAltima estrella se apague.'
            {
            match("Y la \u00FAltima estrella se apague."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:104:8: ( 'Hasta que el \\u00FAltimo p\\u00E9talo caiga.' )
            // InternalDearCode.g:104:10: 'Hasta que el \\u00FAltimo p\\u00E9talo caiga.'
            {
            match("Hasta que el \u00FAltimo p\u00E9talo caiga."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:105:8: ( 'Cuando el mar se quede en silencio.' )
            // InternalDearCode.g:105:10: 'Cuando el mar se quede en silencio.'
            {
            match("Cuando el mar se quede en silencio."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:106:8: ( 'Dejo en estas l\\u00EDneas una promesa llamada' )
            // InternalDearCode.g:106:10: 'Dejo en estas l\\u00EDneas una promesa llamada'
            {
            match("Dejo en estas l\u00EDneas una promesa llamada"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:107:8: ( 'Escribo en estas l\\u00EDneas una intenci\\u00F3n llamada' )
            // InternalDearCode.g:107:10: 'Escribo en estas l\\u00EDneas una intenci\\u00F3n llamada'
            {
            match("Escribo en estas l\u00EDneas una intenci\u00F3n llamada"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:108:8: ( 'En la brisa escondo un deseo llamado' )
            // InternalDearCode.g:108:10: 'En la brisa escondo un deseo llamado'
            {
            match("En la brisa escondo un deseo llamado"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:109:8: ( 'Grabo en las estrellas una promesa llamada' )
            // InternalDearCode.g:109:10: 'Grabo en las estrellas una promesa llamada'
            {
            match("Grabo en las estrellas una promesa llamada"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:110:8: ( 'Susurro al universo un deseo llamado' )
            // InternalDearCode.g:110:10: 'Susurro al universo un deseo llamado'
            {
            match("Susurro al universo un deseo llamado"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:111:8: ( 'Tejo en el destino un juramento llamado' )
            // InternalDearCode.g:111:10: 'Tejo en el destino un juramento llamado'
            {
            match("Tejo en el destino un juramento llamado"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:112:8: ( 'Esculpo en el tiempo un anhelo llamado' )
            // InternalDearCode.g:112:10: 'Esculpo en el tiempo un anhelo llamado'
            {
            match("Esculpo en el tiempo un anhelo llamado"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:113:8: ( 'Susurro a la eternidad un sue\\u00F1o llamado' )
            // InternalDearCode.g:113:10: 'Susurro a la eternidad un sue\\u00F1o llamado'
            {
            match("Susurro a la eternidad un sue\u00F1o llamado"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:114:8: ( 'que guarda en su esencia' )
            // InternalDearCode.g:114:10: 'que guarda en su esencia'
            {
            match("que guarda en su esencia"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:115:8: ( 'tejiendo' )
            // InternalDearCode.g:115:10: 'tejiendo'
            {
            match("tejiendo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:116:8: ( 'que abraza en su ser' )
            // InternalDearCode.g:116:10: 'que abraza en su ser'
            {
            match("que abraza en su ser"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:117:8: ( 'que lleva en su alma' )
            // InternalDearCode.g:117:10: 'que lleva en su alma'
            {
            match("que lleva en su alma"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:118:8: ( 'que susurra en su coraz\\u00F3n' )
            // InternalDearCode.g:118:10: 'que susurra en su coraz\\u00F3n'
            {
            match("que susurra en su coraz\u00F3n"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:119:8: ( 'tambien' )
            // InternalDearCode.g:119:10: 'tambien'
            {
            match("tambien"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:120:8: ( 'llevando consigo' )
            // InternalDearCode.g:120:10: 'llevando consigo'
            {
            match("llevando consigo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:121:8: ( 'prometiendo devolver' )
            // InternalDearCode.g:121:10: 'prometiendo devolver'
            {
            match("prometiendo devolver"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:122:8: ( 'jurando devolver' )
            // InternalDearCode.g:122:10: 'jurando devolver'
            {
            match("jurando devolver"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:123:8: ( 'Cuando la promesa se cumple:' )
            // InternalDearCode.g:123:10: 'Cuando la promesa se cumple:'
            {
            match("Cuando la promesa se cumple:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:124:8: ( 'Cuando el amor se cumpla' )
            // InternalDearCode.g:124:10: 'Cuando el amor se cumpla'
            {
            match("Cuando el amor se cumpla"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:125:8: ( 'As\\u00ED se sella la promesa.' )
            // InternalDearCode.g:125:10: 'As\\u00ED se sella la promesa.'
            {
            match("As\u00ED se sella la promesa."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "T__127"
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:126:8: ( 'As\\u00ED se eterniza.' )
            // InternalDearCode.g:126:10: 'As\\u00ED se eterniza.'
            {
            match("As\u00ED se eterniza."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__127"

    // $ANTLR start "T__128"
    public final void mT__128() throws RecognitionException {
        try {
            int _type = T__128;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:127:8: ( 'Y as\\u00ED nuestro amor se inmortaliza.' )
            // InternalDearCode.g:127:10: 'Y as\\u00ED nuestro amor se inmortaliza.'
            {
            match("Y as\u00ED nuestro amor se inmortaliza."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__128"

    // $ANTLR start "T__129"
    public final void mT__129() throws RecognitionException {
        try {
            int _type = T__129;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:128:8: ( 'Y el universo guarda nuestro secreto.' )
            // InternalDearCode.g:128:10: 'Y el universo guarda nuestro secreto.'
            {
            match("Y el universo guarda nuestro secreto."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__129"

    // $ANTLR start "T__130"
    public final void mT__130() throws RecognitionException {
        try {
            int _type = T__130;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:129:8: ( 'Y la eternidad nos abraza.' )
            // InternalDearCode.g:129:10: 'Y la eternidad nos abraza.'
            {
            match("Y la eternidad nos abraza."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__130"

    // $ANTLR start "T__131"
    public final void mT__131() throws RecognitionException {
        try {
            int _type = T__131;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:130:8: ( 'Y entrego al viento' )
            // InternalDearCode.g:130:10: 'Y entrego al viento'
            {
            match("Y entrego al viento"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__131"

    // $ANTLR start "T__132"
    public final void mT__132() throws RecognitionException {
        try {
            int _type = T__132;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:131:8: ( 'Te entrego' )
            // InternalDearCode.g:131:10: 'Te entrego'
            {
            match("Te entrego"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__132"

    // $ANTLR start "T__133"
    public final void mT__133() throws RecognitionException {
        try {
            int _type = T__133;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:132:8: ( 'Te ofrezco con el alma' )
            // InternalDearCode.g:132:10: 'Te ofrezco con el alma'
            {
            match("Te ofrezco con el alma"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__133"

    // $ANTLR start "T__134"
    public final void mT__134() throws RecognitionException {
        try {
            int _type = T__134;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:133:8: ( 'Dejo en tus manos' )
            // InternalDearCode.g:133:10: 'Dejo en tus manos'
            {
            match("Dejo en tus manos"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__134"

    // $ANTLR start "T__135"
    public final void mT__135() throws RecognitionException {
        try {
            int _type = T__135;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:134:8: ( 'Susurro a tu coraz\\u00F3n' )
            // InternalDearCode.g:134:10: 'Susurro a tu coraz\\u00F3n'
            {
            match("Susurro a tu coraz\u00F3n"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__135"

    // $ANTLR start "T__136"
    public final void mT__136() throws RecognitionException {
        try {
            int _type = T__136;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:135:8: ( 'como promesa cumplida.' )
            // InternalDearCode.g:135:10: 'como promesa cumplida.'
            {
            match("como promesa cumplida."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__136"

    // $ANTLR start "T__137"
    public final void mT__137() throws RecognitionException {
        try {
            int _type = T__137;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:136:8: ( 'con un suspiro.' )
            // InternalDearCode.g:136:10: 'con un suspiro.'
            {
            match("con un suspiro."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__137"

    // $ANTLR start "T__138"
    public final void mT__138() throws RecognitionException {
        try {
            int _type = T__138;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:137:8: ( 'como un regalo eterno.' )
            // InternalDearCode.g:137:10: 'como un regalo eterno.'
            {
            match("como un regalo eterno."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__138"

    // $ANTLR start "T__139"
    public final void mT__139() throws RecognitionException {
        try {
            int _type = T__139;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:138:8: ( 'envuelto en mi amor.' )
            // InternalDearCode.g:138:10: 'envuelto en mi amor.'
            {
            match("envuelto en mi amor."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__139"

    // $ANTLR start "T__140"
    public final void mT__140() throws RecognitionException {
        try {
            int _type = T__140;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:139:8: ( 'con la esperanza de tu sonrisa.' )
            // InternalDearCode.g:139:10: 'con la esperanza de tu sonrisa.'
            {
            match("con la esperanza de tu sonrisa."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__140"

    // $ANTLR start "T__141"
    public final void mT__141() throws RecognitionException {
        try {
            int _type = T__141;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:140:8: ( 'o tal vez' )
            // InternalDearCode.g:140:10: 'o tal vez'
            {
            match("o tal vez"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__141"

    // $ANTLR start "T__142"
    public final void mT__142() throws RecognitionException {
        try {
            int _type = T__142;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:141:8: ( 'o quiz\\u00E1s' )
            // InternalDearCode.g:141:10: 'o quiz\\u00E1s'
            {
            match("o quiz\u00E1s"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__142"

    // $ANTLR start "T__143"
    public final void mT__143() throws RecognitionException {
        try {
            int _type = T__143;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:142:8: ( 'o acaso el amor permita' )
            // InternalDearCode.g:142:10: 'o acaso el amor permita'
            {
            match("o acaso el amor permita"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__143"

    // $ANTLR start "T__144"
    public final void mT__144() throws RecognitionException {
        try {
            int _type = T__144;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:143:8: ( 'o si la luna lo desea' )
            // InternalDearCode.g:143:10: 'o si la luna lo desea'
            {
            match("o si la luna lo desea"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__144"

    // $ANTLR start "T__145"
    public final void mT__145() throws RecognitionException {
        try {
            int _type = T__145;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:144:8: ( 'y tambi\\u00E9n' )
            // InternalDearCode.g:144:10: 'y tambi\\u00E9n'
            {
            match("y tambi\u00E9n"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__145"

    // $ANTLR start "T__146"
    public final void mT__146() throws RecognitionException {
        try {
            int _type = T__146;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:145:8: ( 'junto a' )
            // InternalDearCode.g:145:10: 'junto a'
            {
            match("junto a"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__146"

    // $ANTLR start "T__147"
    public final void mT__147() throws RecognitionException {
        try {
            int _type = T__147;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:146:8: ( 'y adem\\u00E1s' )
            // InternalDearCode.g:146:10: 'y adem\\u00E1s'
            {
            match("y adem\u00E1s"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__147"

    // $ANTLR start "T__148"
    public final void mT__148() throws RecognitionException {
        try {
            int _type = T__148;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:147:8: ( 'y al mismo tiempo que' )
            // InternalDearCode.g:147:10: 'y al mismo tiempo que'
            {
            match("y al mismo tiempo que"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__148"

    // $ANTLR start "T__149"
    public final void mT__149() throws RecognitionException {
        try {
            int _type = T__149;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:148:8: ( 'y junto con' )
            // InternalDearCode.g:148:10: 'y junto con'
            {
            match("y junto con"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__149"

    // $ANTLR start "T__150"
    public final void mT__150() throws RecognitionException {
        try {
            int _type = T__150;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:149:8: ( 'y en uni\\u00F3n con' )
            // InternalDearCode.g:149:10: 'y en uni\\u00F3n con'
            {
            match("y en uni\u00F3n con"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__150"

    // $ANTLR start "T__151"
    public final void mT__151() throws RecognitionException {
        try {
            int _type = T__151;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:150:8: ( 'late al un\\u00EDsono con' )
            // InternalDearCode.g:150:10: 'late al un\\u00EDsono con'
            {
            match("late al un\u00EDsono con"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__151"

    // $ANTLR start "T__152"
    public final void mT__152() throws RecognitionException {
        try {
            int _type = T__152;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:151:8: ( 'canta con un matiz distinto a' )
            // InternalDearCode.g:151:10: 'canta con un matiz distinto a'
            {
            match("canta con un matiz distinto a"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__152"

    // $ANTLR start "T__153"
    public final void mT__153() throws RecognitionException {
        try {
            int _type = T__153;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:152:8: ( 'late igual que' )
            // InternalDearCode.g:152:10: 'late igual que'
            {
            match("late igual que"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__153"

    // $ANTLR start "T__154"
    public final void mT__154() throws RecognitionException {
        try {
            int _type = T__154;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:153:8: ( 'se distingue de' )
            // InternalDearCode.g:153:10: 'se distingue de'
            {
            match("se distingue de"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__154"

    // $ANTLR start "T__155"
    public final void mT__155() throws RecognitionException {
        try {
            int _type = T__155;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:154:8: ( 'resuena igual que' )
            // InternalDearCode.g:154:10: 'resuena igual que'
            {
            match("resuena igual que"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__155"

    // $ANTLR start "T__156"
    public final void mT__156() throws RecognitionException {
        try {
            int _type = T__156;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:155:8: ( 'vibra al mismo ritmo que' )
            // InternalDearCode.g:155:10: 'vibra al mismo ritmo que'
            {
            match("vibra al mismo ritmo que"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__156"

    // $ANTLR start "T__157"
    public final void mT__157() throws RecognitionException {
        try {
            int _type = T__157;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:156:8: ( 'es id\\u00E9ntico a' )
            // InternalDearCode.g:156:10: 'es id\\u00E9ntico a'
            {
            match("es id\u00E9ntico a"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__157"

    // $ANTLR start "T__158"
    public final void mT__158() throws RecognitionException {
        try {
            int _type = T__158;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:157:8: ( 'se diferencia de' )
            // InternalDearCode.g:157:10: 'se diferencia de'
            {
            match("se diferencia de"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__158"

    // $ANTLR start "T__159"
    public final void mT__159() throws RecognitionException {
        try {
            int _type = T__159;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:158:8: ( 'no coincide con' )
            // InternalDearCode.g:158:10: 'no coincide con'
            {
            match("no coincide con"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__159"

    // $ANTLR start "T__160"
    public final void mT__160() throws RecognitionException {
        try {
            int _type = T__160;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:159:8: ( 'es distinto a' )
            // InternalDearCode.g:159:10: 'es distinto a'
            {
            match("es distinto a"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__160"

    // $ANTLR start "T__161"
    public final void mT__161() throws RecognitionException {
        try {
            int _type = T__161;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:160:8: ( 'susurra con menos fuerza que' )
            // InternalDearCode.g:160:10: 'susurra con menos fuerza que'
            {
            match("susurra con menos fuerza que"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__161"

    // $ANTLR start "T__162"
    public final void mT__162() throws RecognitionException {
        try {
            int _type = T__162;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:161:8: ( 'casi suspira al mismo nivel que' )
            // InternalDearCode.g:161:10: 'casi suspira al mismo nivel que'
            {
            match("casi suspira al mismo nivel que"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__162"

    // $ANTLR start "T__163"
    public final void mT__163() throws RecognitionException {
        try {
            int _type = T__163;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:162:8: ( 'arde con m\\u00E1s pasi\\u00F3n que' )
            // InternalDearCode.g:162:10: 'arde con m\\u00E1s pasi\\u00F3n que'
            {
            match("arde con m\u00E1s pasi\u00F3n que"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__163"

    // $ANTLR start "T__164"
    public final void mT__164() throws RecognitionException {
        try {
            int _type = T__164;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:163:8: ( 'rodea con tanta fuerza como' )
            // InternalDearCode.g:163:10: 'rodea con tanta fuerza como'
            {
            match("rodea con tanta fuerza como"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__164"

    // $ANTLR start "T__165"
    public final void mT__165() throws RecognitionException {
        try {
            int _type = T__165;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:164:8: ( 'susurra menos que' )
            // InternalDearCode.g:164:10: 'susurra menos que'
            {
            match("susurra menos que"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__165"

    // $ANTLR start "T__166"
    public final void mT__166() throws RecognitionException {
        try {
            int _type = T__166;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:165:8: ( 'casi igual que' )
            // InternalDearCode.g:165:10: 'casi igual que'
            {
            match("casi igual que"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__166"

    // $ANTLR start "T__167"
    public final void mT__167() throws RecognitionException {
        try {
            int _type = T__167;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:166:8: ( 'arde mas que' )
            // InternalDearCode.g:166:10: 'arde mas que'
            {
            match("arde mas que"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__167"

    // $ANTLR start "T__168"
    public final void mT__168() throws RecognitionException {
        try {
            int _type = T__168;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:167:8: ( 'abraza como' )
            // InternalDearCode.g:167:10: 'abraza como'
            {
            match("abraza como"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__168"

    // $ANTLR start "T__169"
    public final void mT__169() throws RecognitionException {
        try {
            int _type = T__169;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:168:8: ( 'susurra m\\u00E1s suavemente que' )
            // InternalDearCode.g:168:10: 'susurra m\\u00E1s suavemente que'
            {
            match("susurra m\u00E1s suavemente que"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__169"

    // $ANTLR start "T__170"
    public final void mT__170() throws RecognitionException {
        try {
            int _type = T__170;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:169:8: ( 'tiene menos latidos que' )
            // InternalDearCode.g:169:10: 'tiene menos latidos que'
            {
            match("tiene menos latidos que"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__170"

    // $ANTLR start "T__171"
    public final void mT__171() throws RecognitionException {
        try {
            int _type = T__171;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:170:8: ( 'susurra tan suavemente como' )
            // InternalDearCode.g:170:10: 'susurra tan suavemente como'
            {
            match("susurra tan suavemente como"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__171"

    // $ANTLR start "T__172"
    public final void mT__172() throws RecognitionException {
        try {
            int _type = T__172;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:171:8: ( 'no supera a' )
            // InternalDearCode.g:171:10: 'no supera a'
            {
            match("no supera a"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__172"

    // $ANTLR start "T__173"
    public final void mT__173() throws RecognitionException {
        try {
            int _type = T__173;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:172:8: ( 'susurra con m\\u00E1s fuerza que' )
            // InternalDearCode.g:172:10: 'susurra con m\\u00E1s fuerza que'
            {
            match("susurra con m\u00E1s fuerza que"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__173"

    // $ANTLR start "T__174"
    public final void mT__174() throws RecognitionException {
        try {
            int _type = T__174;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:173:8: ( 'tiene m\\u00E1s latidos que' )
            // InternalDearCode.g:173:10: 'tiene m\\u00E1s latidos que'
            {
            match("tiene m\u00E1s latidos que"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__174"

    // $ANTLR start "T__175"
    public final void mT__175() throws RecognitionException {
        try {
            int _type = T__175;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:174:8: ( 'susurra al menos con la misma fuerza que' )
            // InternalDearCode.g:174:10: 'susurra al menos con la misma fuerza que'
            {
            match("susurra al menos con la misma fuerza que"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__175"

    // $ANTLR start "T__176"
    public final void mT__176() throws RecognitionException {
        try {
            int _type = T__176;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:175:8: ( 'al menos iguala a' )
            // InternalDearCode.g:175:10: 'al menos iguala a'
            {
            match("al menos iguala a"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__176"

    // $ANTLR start "T__177"
    public final void mT__177() throws RecognitionException {
        try {
            int _type = T__177;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:176:8: ( 'unidos en un solo suspiro con' )
            // InternalDearCode.g:176:10: 'unidos en un solo suspiro con'
            {
            match("unidos en un solo suspiro con"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__177"

    // $ANTLR start "T__178"
    public final void mT__178() throws RecognitionException {
        try {
            int _type = T__178;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:177:8: ( 'fundidos en la llama de' )
            // InternalDearCode.g:177:10: 'fundidos en la llama de'
            {
            match("fundidos en la llama de"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__178"

    // $ANTLR start "T__179"
    public final void mT__179() throws RecognitionException {
        try {
            int _type = T__179;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:178:8: ( 'se une a' )
            // InternalDearCode.g:178:10: 'se une a'
            {
            match("se une a"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__179"

    // $ANTLR start "T__180"
    public final void mT__180() throws RecognitionException {
        try {
            int _type = T__180;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:179:8: ( 'se funde con' )
            // InternalDearCode.g:179:10: 'se funde con'
            {
            match("se funde con"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__180"

    // $ANTLR start "T__181"
    public final void mT__181() throws RecognitionException {
        try {
            int _type = T__181;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:180:8: ( 'sumado al latido de' )
            // InternalDearCode.g:180:10: 'sumado al latido de'
            {
            match("sumado al latido de"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__181"

    // $ANTLR start "T__182"
    public final void mT__182() throws RecognitionException {
        try {
            int _type = T__182;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:181:8: ( 'combinado con la pasi\\u00F3n de' )
            // InternalDearCode.g:181:10: 'combinado con la pasi\\u00F3n de'
            {
            match("combinado con la pasi\u00F3n de"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__182"

    // $ANTLR start "T__183"
    public final void mT__183() throws RecognitionException {
        try {
            int _type = T__183;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:182:8: ( 'entrelazado con' )
            // InternalDearCode.g:182:10: 'entrelazado con'
            {
            match("entrelazado con"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__183"

    // $ANTLR start "T__184"
    public final void mT__184() throws RecognitionException {
        try {
            int _type = T__184;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:183:8: ( 'a\\u00F1adido al suspiro de' )
            // InternalDearCode.g:183:10: 'a\\u00F1adido al suspiro de'
            {
            match("a\u00F1adido al suspiro de"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__184"

    // $ANTLR start "T__185"
    public final void mT__185() throws RecognitionException {
        try {
            int _type = T__185;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:184:8: ( 'fortalecidos por el fuego de' )
            // InternalDearCode.g:184:10: 'fortalecidos por el fuego de'
            {
            match("fortalecidos por el fuego de"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__185"

    // $ANTLR start "T__186"
    public final void mT__186() throws RecognitionException {
        try {
            int _type = T__186;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:185:8: ( 'separados entre los ecos de' )
            // InternalDearCode.g:185:10: 'separados entre los ecos de'
            {
            match("separados entre los ecos de"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__186"

    // $ANTLR start "T__187"
    public final void mT__187() throws RecognitionException {
        try {
            int _type = T__187;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:186:8: ( 'resuena con el eco de' )
            // InternalDearCode.g:186:10: 'resuena con el eco de'
            {
            match("resuena con el eco de"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__187"

    // $ANTLR start "T__188"
    public final void mT__188() throws RecognitionException {
        try {
            int _type = T__188;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:187:8: ( 'crece con' )
            // InternalDearCode.g:187:10: 'crece con'
            {
            match("crece con"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__188"

    // $ANTLR start "T__189"
    public final void mT__189() throws RecognitionException {
        try {
            int _type = T__189;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:188:8: ( 'resuena en' )
            // InternalDearCode.g:188:10: 'resuena en'
            {
            match("resuena en"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__189"

    // $ANTLR start "T__190"
    public final void mT__190() throws RecognitionException {
        try {
            int _type = T__190;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:189:8: ( 'se divide entre' )
            // InternalDearCode.g:189:10: 'se divide entre'
            {
            match("se divide entre"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__190"

    // $ANTLR start "T__191"
    public final void mT__191() throws RecognitionException {
        try {
            int _type = T__191;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:190:8: ( 'no creo que' )
            // InternalDearCode.g:190:10: 'no creo que'
            {
            match("no creo que"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__191"

    // $ANTLR start "T__192"
    public final void mT__192() throws RecognitionException {
        try {
            int _type = T__192;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:191:8: ( 'no siento que' )
            // InternalDearCode.g:191:10: 'no siento que'
            {
            match("no siento que"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__192"

    // $ANTLR start "T__193"
    public final void mT__193() throws RecognitionException {
        try {
            int _type = T__193;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:192:8: ( 'no me parece que' )
            // InternalDearCode.g:192:10: 'no me parece que'
            {
            match("no me parece que"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__193"

    // $ANTLR start "T__194"
    public final void mT__194() throws RecognitionException {
        try {
            int _type = T__194;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:193:8: ( 'no percibo que' )
            // InternalDearCode.g:193:10: 'no percibo que'
            {
            match("no percibo que"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__194"

    // $ANTLR start "T__195"
    public final void mT__195() throws RecognitionException {
        try {
            int _type = T__195;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:194:8: ( 'dudo que' )
            // InternalDearCode.g:194:10: 'dudo que'
            {
            match("dudo que"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__195"

    // $ANTLR start "T__196"
    public final void mT__196() throws RecognitionException {
        try {
            int _type = T__196;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:195:8: ( '(' )
            // InternalDearCode.g:195:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__196"

    // $ANTLR start "T__197"
    public final void mT__197() throws RecognitionException {
        try {
            int _type = T__197;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:196:8: ( ')' )
            // InternalDearCode.g:196:10: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__197"

    // $ANTLR start "T__198"
    public final void mT__198() throws RecognitionException {
        try {
            int _type = T__198;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:197:8: ( 'siempre' )
            // InternalDearCode.g:197:10: 'siempre'
            {
            match("siempre"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__198"

    // $ANTLR start "T__199"
    public final void mT__199() throws RecognitionException {
        try {
            int _type = T__199;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:198:8: ( 'jam\\u00E1s' )
            // InternalDearCode.g:198:10: 'jam\\u00E1s'
            {
            match("jam\u00E1s"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__199"

    // $ANTLR start "T__200"
    public final void mT__200() throws RecognitionException {
        try {
            int _type = T__200;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:199:8: ( 'invoco a' )
            // InternalDearCode.g:199:10: 'invoco a'
            {
            match("invoco a"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__200"

    // $ANTLR start "T__201"
    public final void mT__201() throws RecognitionException {
        try {
            int _type = T__201;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:200:8: ( 'susurro a' )
            // InternalDearCode.g:200:10: 'susurro a'
            {
            match("susurro a"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__201"

    // $ANTLR start "T__202"
    public final void mT__202() throws RecognitionException {
        try {
            int _type = T__202;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:201:8: ( 'murmuro a' )
            // InternalDearCode.g:201:10: 'murmuro a'
            {
            match("murmuro a"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__202"

    // $ANTLR start "T__203"
    public final void mT__203() throws RecognitionException {
        try {
            int _type = T__203;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:202:8: ( 'conjuro a' )
            // InternalDearCode.g:202:10: 'conjuro a'
            {
            match("conjuro a"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__203"

    // $ANTLR start "T__204"
    public final void mT__204() throws RecognitionException {
        try {
            int _type = T__204;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:203:8: ( 'con los regalos' )
            // InternalDearCode.g:203:10: 'con los regalos'
            {
            match("con los regalos"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__204"

    // $ANTLR start "T__205"
    public final void mT__205() throws RecognitionException {
        try {
            int _type = T__205;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:204:8: ( 'ofreciendo' )
            // InternalDearCode.g:204:10: 'ofreciendo'
            {
            match("ofreciendo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__205"

    // $ANTLR start "T__206"
    public final void mT__206() throws RecognitionException {
        try {
            int _type = T__206;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:205:8: ( 'con los dones' )
            // InternalDearCode.g:205:10: 'con los dones'
            {
            match("con los dones"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__206"

    // $ANTLR start "T__207"
    public final void mT__207() throws RecognitionException {
        try {
            int _type = T__207;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:206:8: ( 'presentando' )
            // InternalDearCode.g:206:10: 'presentando'
            {
            match("presentando"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__207"

    // $ANTLR start "T__208"
    public final void mT__208() throws RecognitionException {
        try {
            int _type = T__208;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:207:8: ( 'ofreciendo mis tesoros' )
            // InternalDearCode.g:207:10: 'ofreciendo mis tesoros'
            {
            match("ofreciendo mis tesoros"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__208"

    // $ANTLR start "T__209"
    public final void mT__209() throws RecognitionException {
        try {
            int _type = T__209;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:208:8: ( 'asimismo' )
            // InternalDearCode.g:208:10: 'asimismo'
            {
            match("asimismo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__209"

    // $ANTLR start "T__210"
    public final void mT__210() throws RecognitionException {
        try {
            int _type = T__210;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:209:8: ( 'adicionalmente' )
            // InternalDearCode.g:209:10: 'adicionalmente'
            {
            match("adicionalmente"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__210"

    // $ANTLR start "T__211"
    public final void mT__211() throws RecognitionException {
        try {
            int _type = T__211;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:210:8: ( 'en mi coraz\\u00F3n' )
            // InternalDearCode.g:210:10: 'en mi coraz\\u00F3n'
            {
            match("en mi coraz\u00F3n"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__211"

    // $ANTLR start "T__212"
    public final void mT__212() throws RecognitionException {
        try {
            int _type = T__212;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:211:8: ( 'en mi alma' )
            // InternalDearCode.g:211:10: 'en mi alma'
            {
            match("en mi alma"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__212"

    // $ANTLR start "T__213"
    public final void mT__213() throws RecognitionException {
        try {
            int _type = T__213;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:212:8: ( 'Te regalo' )
            // InternalDearCode.g:212:10: 'Te regalo'
            {
            match("Te regalo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__213"

    // $ANTLR start "T__214"
    public final void mT__214() throws RecognitionException {
        try {
            int _type = T__214;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:213:8: ( 'Te Ofrezco' )
            // InternalDearCode.g:213:10: 'Te Ofrezco'
            {
            match("Te Ofrezco"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__214"

    // $ANTLR start "T__215"
    public final void mT__215() throws RecognitionException {
        try {
            int _type = T__215;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:214:8: ( 'Obsequio' )
            // InternalDearCode.g:214:10: 'Obsequio'
            {
            match("Obsequio"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__215"

    // $ANTLR start "T__216"
    public final void mT__216() throws RecognitionException {
        try {
            int _type = T__216;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:215:8: ( 'Deposito en tu jard\\u00EDn' )
            // InternalDearCode.g:215:10: 'Deposito en tu jard\\u00EDn'
            {
            match("Deposito en tu jard\u00EDn"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__216"

    // $ANTLR start "T__217"
    public final void mT__217() throws RecognitionException {
        try {
            int _type = T__217;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:216:8: ( 'Te revelo' )
            // InternalDearCode.g:216:10: 'Te revelo'
            {
            match("Te revelo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__217"

    // $ANTLR start "T__218"
    public final void mT__218() throws RecognitionException {
        try {
            int _type = T__218;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:217:8: ( 'Te susurro' )
            // InternalDearCode.g:217:10: 'Te susurro'
            {
            match("Te susurro"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__218"

    // $ANTLR start "T__219"
    public final void mT__219() throws RecognitionException {
        try {
            int _type = T__219;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:218:8: ( 'Te conf\\u00EDo' )
            // InternalDearCode.g:218:10: 'Te conf\\u00EDo'
            {
            match("Te conf\u00EDo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__219"

    // $ANTLR start "T__220"
    public final void mT__220() throws RecognitionException {
        try {
            int _type = T__220;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:219:8: ( 'Te dedico' )
            // InternalDearCode.g:219:10: 'Te dedico'
            {
            match("Te dedico"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__220"

    // $ANTLR start "T__221"
    public final void mT__221() throws RecognitionException {
        try {
            int _type = T__221;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:220:8: ( 'Te brindo' )
            // InternalDearCode.g:220:10: 'Te brindo'
            {
            match("Te brindo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__221"

    // $ANTLR start "T__222"
    public final void mT__222() throws RecognitionException {
        try {
            int _type = T__222;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:221:8: ( 'Perm\\u00EDteme alimentar' )
            // InternalDearCode.g:221:10: 'Perm\\u00EDteme alimentar'
            {
            match("Perm\u00EDteme alimentar"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__222"

    // $ANTLR start "T__223"
    public final void mT__223() throws RecognitionException {
        try {
            int _type = T__223;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:222:8: ( 'Perm\\u00EDteme regar' )
            // InternalDearCode.g:222:10: 'Perm\\u00EDteme regar'
            {
            match("Perm\u00EDteme regar"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__223"

    // $ANTLR start "T__224"
    public final void mT__224() throws RecognitionException {
        try {
            int _type = T__224;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:223:8: ( 'Perm\\u00EDteme ajustar' )
            // InternalDearCode.g:223:10: 'Perm\\u00EDteme ajustar'
            {
            match("Perm\u00EDteme ajustar"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__224"

    // $ANTLR start "T__225"
    public final void mT__225() throws RecognitionException {
        try {
            int _type = T__225;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:224:8: ( 'Reavivo' )
            // InternalDearCode.g:224:10: 'Reavivo'
            {
            match("Reavivo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__225"

    // $ANTLR start "T__226"
    public final void mT__226() throws RecognitionException {
        try {
            int _type = T__226;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:225:8: ( 'Renuevo' )
            // InternalDearCode.g:225:10: 'Renuevo'
            {
            match("Renuevo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__226"

    // $ANTLR start "T__227"
    public final void mT__227() throws RecognitionException {
        try {
            int _type = T__227;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:226:8: ( 'Reafirmo' )
            // InternalDearCode.g:226:10: 'Reafirmo'
            {
            match("Reafirmo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__227"

    // $ANTLR start "T__228"
    public final void mT__228() throws RecognitionException {
        try {
            int _type = T__228;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:227:8: ( 'Perm\\u00EDteme transformar' )
            // InternalDearCode.g:227:10: 'Perm\\u00EDteme transformar'
            {
            match("Perm\u00EDteme transformar"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__228"

    // $ANTLR start "T__229"
    public final void mT__229() throws RecognitionException {
        try {
            int _type = T__229;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:228:8: ( 'Renuevo con pasi\\u00F3n' )
            // InternalDearCode.g:228:10: 'Renuevo con pasi\\u00F3n'
            {
            match("Renuevo con pasi\u00F3n"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__229"

    // $ANTLR start "T__230"
    public final void mT__230() throws RecognitionException {
        try {
            int _type = T__230;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:229:8: ( 'Modifico con amor' )
            // InternalDearCode.g:229:10: 'Modifico con amor'
            {
            match("Modifico con amor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__230"

    // $ANTLR start "T__231"
    public final void mT__231() throws RecognitionException {
        try {
            int _type = T__231;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:230:8: ( 'un' )
            // InternalDearCode.g:230:10: 'un'
            {
            match("un"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__231"

    // $ANTLR start "T__232"
    public final void mT__232() throws RecognitionException {
        try {
            int _type = T__232;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:231:8: ( 'una' )
            // InternalDearCode.g:231:10: 'una'
            {
            match("una"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__232"

    // $ANTLR start "T__233"
    public final void mT__233() throws RecognitionException {
        try {
            int _type = T__233;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:232:8: ( 'unos' )
            // InternalDearCode.g:232:10: 'unos'
            {
            match("unos"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__233"

    // $ANTLR start "T__234"
    public final void mT__234() throws RecognitionException {
        try {
            int _type = T__234;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:233:8: ( 'unas' )
            // InternalDearCode.g:233:10: 'unas'
            {
            match("unas"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__234"

    // $ANTLR start "RULE_ANYTEXT"
    public final void mRULE_ANYTEXT() throws RecognitionException {
        try {
            int _type = RULE_ANYTEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:3546:14: ( '~' (~ ( ( '~' | '\\n' | '\\r' ) ) )* '~' )
            // InternalDearCode.g:3546:16: '~' (~ ( ( '~' | '\\n' | '\\r' ) ) )* '~'
            {
            match('~'); 
            // InternalDearCode.g:3546:20: (~ ( ( '~' | '\\n' | '\\r' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='}')||(LA1_0>='\u007F' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDearCode.g:3546:20: ~ ( ( '~' | '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='}')||(input.LA(1)>='\u007F' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANYTEXT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:3548:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalDearCode.g:3548:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalDearCode.g:3548:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDearCode.g:3548:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalDearCode.g:3548:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDearCode.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:3550:10: ( ( '0' .. '9' )+ )
            // InternalDearCode.g:3550:12: ( '0' .. '9' )+
            {
            // InternalDearCode.g:3550:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDearCode.g:3550:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:3552:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalDearCode.g:3552:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalDearCode.g:3552:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDearCode.g:3552:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalDearCode.g:3552:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalDearCode.g:3552:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDearCode.g:3552:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:3552:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalDearCode.g:3552:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalDearCode.g:3552:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDearCode.g:3552:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:3554:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalDearCode.g:3554:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalDearCode.g:3554:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDearCode.g:3554:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:3556:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalDearCode.g:3556:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalDearCode.g:3556:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDearCode.g:3556:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalDearCode.g:3556:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDearCode.g:3556:41: ( '\\r' )? '\\n'
                    {
                    // InternalDearCode.g:3556:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalDearCode.g:3556:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:3558:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalDearCode.g:3558:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalDearCode.g:3558:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDearCode.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:3560:16: ( . )
            // InternalDearCode.g:3560:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalDearCode.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | T__168 | T__169 | T__170 | T__171 | T__172 | T__173 | T__174 | T__175 | T__176 | T__177 | T__178 | T__179 | T__180 | T__181 | T__182 | T__183 | T__184 | T__185 | T__186 | T__187 | T__188 | T__189 | T__190 | T__191 | T__192 | T__193 | T__194 | T__195 | T__196 | T__197 | T__198 | T__199 | T__200 | T__201 | T__202 | T__203 | T__204 | T__205 | T__206 | T__207 | T__208 | T__209 | T__210 | T__211 | T__212 | T__213 | T__214 | T__215 | T__216 | T__217 | T__218 | T__219 | T__220 | T__221 | T__222 | T__223 | T__224 | T__225 | T__226 | T__227 | T__228 | T__229 | T__230 | T__231 | T__232 | T__233 | T__234 | RULE_ANYTEXT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=231;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalDearCode.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalDearCode.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalDearCode.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalDearCode.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalDearCode.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalDearCode.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalDearCode.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalDearCode.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalDearCode.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalDearCode.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalDearCode.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalDearCode.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalDearCode.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalDearCode.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalDearCode.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalDearCode.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalDearCode.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalDearCode.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalDearCode.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalDearCode.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalDearCode.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalDearCode.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalDearCode.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalDearCode.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalDearCode.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalDearCode.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalDearCode.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalDearCode.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalDearCode.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // InternalDearCode.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // InternalDearCode.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // InternalDearCode.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // InternalDearCode.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // InternalDearCode.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // InternalDearCode.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // InternalDearCode.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // InternalDearCode.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // InternalDearCode.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // InternalDearCode.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // InternalDearCode.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // InternalDearCode.g:1:250: T__52
                {
                mT__52(); 

                }
                break;
            case 42 :
                // InternalDearCode.g:1:256: T__53
                {
                mT__53(); 

                }
                break;
            case 43 :
                // InternalDearCode.g:1:262: T__54
                {
                mT__54(); 

                }
                break;
            case 44 :
                // InternalDearCode.g:1:268: T__55
                {
                mT__55(); 

                }
                break;
            case 45 :
                // InternalDearCode.g:1:274: T__56
                {
                mT__56(); 

                }
                break;
            case 46 :
                // InternalDearCode.g:1:280: T__57
                {
                mT__57(); 

                }
                break;
            case 47 :
                // InternalDearCode.g:1:286: T__58
                {
                mT__58(); 

                }
                break;
            case 48 :
                // InternalDearCode.g:1:292: T__59
                {
                mT__59(); 

                }
                break;
            case 49 :
                // InternalDearCode.g:1:298: T__60
                {
                mT__60(); 

                }
                break;
            case 50 :
                // InternalDearCode.g:1:304: T__61
                {
                mT__61(); 

                }
                break;
            case 51 :
                // InternalDearCode.g:1:310: T__62
                {
                mT__62(); 

                }
                break;
            case 52 :
                // InternalDearCode.g:1:316: T__63
                {
                mT__63(); 

                }
                break;
            case 53 :
                // InternalDearCode.g:1:322: T__64
                {
                mT__64(); 

                }
                break;
            case 54 :
                // InternalDearCode.g:1:328: T__65
                {
                mT__65(); 

                }
                break;
            case 55 :
                // InternalDearCode.g:1:334: T__66
                {
                mT__66(); 

                }
                break;
            case 56 :
                // InternalDearCode.g:1:340: T__67
                {
                mT__67(); 

                }
                break;
            case 57 :
                // InternalDearCode.g:1:346: T__68
                {
                mT__68(); 

                }
                break;
            case 58 :
                // InternalDearCode.g:1:352: T__69
                {
                mT__69(); 

                }
                break;
            case 59 :
                // InternalDearCode.g:1:358: T__70
                {
                mT__70(); 

                }
                break;
            case 60 :
                // InternalDearCode.g:1:364: T__71
                {
                mT__71(); 

                }
                break;
            case 61 :
                // InternalDearCode.g:1:370: T__72
                {
                mT__72(); 

                }
                break;
            case 62 :
                // InternalDearCode.g:1:376: T__73
                {
                mT__73(); 

                }
                break;
            case 63 :
                // InternalDearCode.g:1:382: T__74
                {
                mT__74(); 

                }
                break;
            case 64 :
                // InternalDearCode.g:1:388: T__75
                {
                mT__75(); 

                }
                break;
            case 65 :
                // InternalDearCode.g:1:394: T__76
                {
                mT__76(); 

                }
                break;
            case 66 :
                // InternalDearCode.g:1:400: T__77
                {
                mT__77(); 

                }
                break;
            case 67 :
                // InternalDearCode.g:1:406: T__78
                {
                mT__78(); 

                }
                break;
            case 68 :
                // InternalDearCode.g:1:412: T__79
                {
                mT__79(); 

                }
                break;
            case 69 :
                // InternalDearCode.g:1:418: T__80
                {
                mT__80(); 

                }
                break;
            case 70 :
                // InternalDearCode.g:1:424: T__81
                {
                mT__81(); 

                }
                break;
            case 71 :
                // InternalDearCode.g:1:430: T__82
                {
                mT__82(); 

                }
                break;
            case 72 :
                // InternalDearCode.g:1:436: T__83
                {
                mT__83(); 

                }
                break;
            case 73 :
                // InternalDearCode.g:1:442: T__84
                {
                mT__84(); 

                }
                break;
            case 74 :
                // InternalDearCode.g:1:448: T__85
                {
                mT__85(); 

                }
                break;
            case 75 :
                // InternalDearCode.g:1:454: T__86
                {
                mT__86(); 

                }
                break;
            case 76 :
                // InternalDearCode.g:1:460: T__87
                {
                mT__87(); 

                }
                break;
            case 77 :
                // InternalDearCode.g:1:466: T__88
                {
                mT__88(); 

                }
                break;
            case 78 :
                // InternalDearCode.g:1:472: T__89
                {
                mT__89(); 

                }
                break;
            case 79 :
                // InternalDearCode.g:1:478: T__90
                {
                mT__90(); 

                }
                break;
            case 80 :
                // InternalDearCode.g:1:484: T__91
                {
                mT__91(); 

                }
                break;
            case 81 :
                // InternalDearCode.g:1:490: T__92
                {
                mT__92(); 

                }
                break;
            case 82 :
                // InternalDearCode.g:1:496: T__93
                {
                mT__93(); 

                }
                break;
            case 83 :
                // InternalDearCode.g:1:502: T__94
                {
                mT__94(); 

                }
                break;
            case 84 :
                // InternalDearCode.g:1:508: T__95
                {
                mT__95(); 

                }
                break;
            case 85 :
                // InternalDearCode.g:1:514: T__96
                {
                mT__96(); 

                }
                break;
            case 86 :
                // InternalDearCode.g:1:520: T__97
                {
                mT__97(); 

                }
                break;
            case 87 :
                // InternalDearCode.g:1:526: T__98
                {
                mT__98(); 

                }
                break;
            case 88 :
                // InternalDearCode.g:1:532: T__99
                {
                mT__99(); 

                }
                break;
            case 89 :
                // InternalDearCode.g:1:538: T__100
                {
                mT__100(); 

                }
                break;
            case 90 :
                // InternalDearCode.g:1:545: T__101
                {
                mT__101(); 

                }
                break;
            case 91 :
                // InternalDearCode.g:1:552: T__102
                {
                mT__102(); 

                }
                break;
            case 92 :
                // InternalDearCode.g:1:559: T__103
                {
                mT__103(); 

                }
                break;
            case 93 :
                // InternalDearCode.g:1:566: T__104
                {
                mT__104(); 

                }
                break;
            case 94 :
                // InternalDearCode.g:1:573: T__105
                {
                mT__105(); 

                }
                break;
            case 95 :
                // InternalDearCode.g:1:580: T__106
                {
                mT__106(); 

                }
                break;
            case 96 :
                // InternalDearCode.g:1:587: T__107
                {
                mT__107(); 

                }
                break;
            case 97 :
                // InternalDearCode.g:1:594: T__108
                {
                mT__108(); 

                }
                break;
            case 98 :
                // InternalDearCode.g:1:601: T__109
                {
                mT__109(); 

                }
                break;
            case 99 :
                // InternalDearCode.g:1:608: T__110
                {
                mT__110(); 

                }
                break;
            case 100 :
                // InternalDearCode.g:1:615: T__111
                {
                mT__111(); 

                }
                break;
            case 101 :
                // InternalDearCode.g:1:622: T__112
                {
                mT__112(); 

                }
                break;
            case 102 :
                // InternalDearCode.g:1:629: T__113
                {
                mT__113(); 

                }
                break;
            case 103 :
                // InternalDearCode.g:1:636: T__114
                {
                mT__114(); 

                }
                break;
            case 104 :
                // InternalDearCode.g:1:643: T__115
                {
                mT__115(); 

                }
                break;
            case 105 :
                // InternalDearCode.g:1:650: T__116
                {
                mT__116(); 

                }
                break;
            case 106 :
                // InternalDearCode.g:1:657: T__117
                {
                mT__117(); 

                }
                break;
            case 107 :
                // InternalDearCode.g:1:664: T__118
                {
                mT__118(); 

                }
                break;
            case 108 :
                // InternalDearCode.g:1:671: T__119
                {
                mT__119(); 

                }
                break;
            case 109 :
                // InternalDearCode.g:1:678: T__120
                {
                mT__120(); 

                }
                break;
            case 110 :
                // InternalDearCode.g:1:685: T__121
                {
                mT__121(); 

                }
                break;
            case 111 :
                // InternalDearCode.g:1:692: T__122
                {
                mT__122(); 

                }
                break;
            case 112 :
                // InternalDearCode.g:1:699: T__123
                {
                mT__123(); 

                }
                break;
            case 113 :
                // InternalDearCode.g:1:706: T__124
                {
                mT__124(); 

                }
                break;
            case 114 :
                // InternalDearCode.g:1:713: T__125
                {
                mT__125(); 

                }
                break;
            case 115 :
                // InternalDearCode.g:1:720: T__126
                {
                mT__126(); 

                }
                break;
            case 116 :
                // InternalDearCode.g:1:727: T__127
                {
                mT__127(); 

                }
                break;
            case 117 :
                // InternalDearCode.g:1:734: T__128
                {
                mT__128(); 

                }
                break;
            case 118 :
                // InternalDearCode.g:1:741: T__129
                {
                mT__129(); 

                }
                break;
            case 119 :
                // InternalDearCode.g:1:748: T__130
                {
                mT__130(); 

                }
                break;
            case 120 :
                // InternalDearCode.g:1:755: T__131
                {
                mT__131(); 

                }
                break;
            case 121 :
                // InternalDearCode.g:1:762: T__132
                {
                mT__132(); 

                }
                break;
            case 122 :
                // InternalDearCode.g:1:769: T__133
                {
                mT__133(); 

                }
                break;
            case 123 :
                // InternalDearCode.g:1:776: T__134
                {
                mT__134(); 

                }
                break;
            case 124 :
                // InternalDearCode.g:1:783: T__135
                {
                mT__135(); 

                }
                break;
            case 125 :
                // InternalDearCode.g:1:790: T__136
                {
                mT__136(); 

                }
                break;
            case 126 :
                // InternalDearCode.g:1:797: T__137
                {
                mT__137(); 

                }
                break;
            case 127 :
                // InternalDearCode.g:1:804: T__138
                {
                mT__138(); 

                }
                break;
            case 128 :
                // InternalDearCode.g:1:811: T__139
                {
                mT__139(); 

                }
                break;
            case 129 :
                // InternalDearCode.g:1:818: T__140
                {
                mT__140(); 

                }
                break;
            case 130 :
                // InternalDearCode.g:1:825: T__141
                {
                mT__141(); 

                }
                break;
            case 131 :
                // InternalDearCode.g:1:832: T__142
                {
                mT__142(); 

                }
                break;
            case 132 :
                // InternalDearCode.g:1:839: T__143
                {
                mT__143(); 

                }
                break;
            case 133 :
                // InternalDearCode.g:1:846: T__144
                {
                mT__144(); 

                }
                break;
            case 134 :
                // InternalDearCode.g:1:853: T__145
                {
                mT__145(); 

                }
                break;
            case 135 :
                // InternalDearCode.g:1:860: T__146
                {
                mT__146(); 

                }
                break;
            case 136 :
                // InternalDearCode.g:1:867: T__147
                {
                mT__147(); 

                }
                break;
            case 137 :
                // InternalDearCode.g:1:874: T__148
                {
                mT__148(); 

                }
                break;
            case 138 :
                // InternalDearCode.g:1:881: T__149
                {
                mT__149(); 

                }
                break;
            case 139 :
                // InternalDearCode.g:1:888: T__150
                {
                mT__150(); 

                }
                break;
            case 140 :
                // InternalDearCode.g:1:895: T__151
                {
                mT__151(); 

                }
                break;
            case 141 :
                // InternalDearCode.g:1:902: T__152
                {
                mT__152(); 

                }
                break;
            case 142 :
                // InternalDearCode.g:1:909: T__153
                {
                mT__153(); 

                }
                break;
            case 143 :
                // InternalDearCode.g:1:916: T__154
                {
                mT__154(); 

                }
                break;
            case 144 :
                // InternalDearCode.g:1:923: T__155
                {
                mT__155(); 

                }
                break;
            case 145 :
                // InternalDearCode.g:1:930: T__156
                {
                mT__156(); 

                }
                break;
            case 146 :
                // InternalDearCode.g:1:937: T__157
                {
                mT__157(); 

                }
                break;
            case 147 :
                // InternalDearCode.g:1:944: T__158
                {
                mT__158(); 

                }
                break;
            case 148 :
                // InternalDearCode.g:1:951: T__159
                {
                mT__159(); 

                }
                break;
            case 149 :
                // InternalDearCode.g:1:958: T__160
                {
                mT__160(); 

                }
                break;
            case 150 :
                // InternalDearCode.g:1:965: T__161
                {
                mT__161(); 

                }
                break;
            case 151 :
                // InternalDearCode.g:1:972: T__162
                {
                mT__162(); 

                }
                break;
            case 152 :
                // InternalDearCode.g:1:979: T__163
                {
                mT__163(); 

                }
                break;
            case 153 :
                // InternalDearCode.g:1:986: T__164
                {
                mT__164(); 

                }
                break;
            case 154 :
                // InternalDearCode.g:1:993: T__165
                {
                mT__165(); 

                }
                break;
            case 155 :
                // InternalDearCode.g:1:1000: T__166
                {
                mT__166(); 

                }
                break;
            case 156 :
                // InternalDearCode.g:1:1007: T__167
                {
                mT__167(); 

                }
                break;
            case 157 :
                // InternalDearCode.g:1:1014: T__168
                {
                mT__168(); 

                }
                break;
            case 158 :
                // InternalDearCode.g:1:1021: T__169
                {
                mT__169(); 

                }
                break;
            case 159 :
                // InternalDearCode.g:1:1028: T__170
                {
                mT__170(); 

                }
                break;
            case 160 :
                // InternalDearCode.g:1:1035: T__171
                {
                mT__171(); 

                }
                break;
            case 161 :
                // InternalDearCode.g:1:1042: T__172
                {
                mT__172(); 

                }
                break;
            case 162 :
                // InternalDearCode.g:1:1049: T__173
                {
                mT__173(); 

                }
                break;
            case 163 :
                // InternalDearCode.g:1:1056: T__174
                {
                mT__174(); 

                }
                break;
            case 164 :
                // InternalDearCode.g:1:1063: T__175
                {
                mT__175(); 

                }
                break;
            case 165 :
                // InternalDearCode.g:1:1070: T__176
                {
                mT__176(); 

                }
                break;
            case 166 :
                // InternalDearCode.g:1:1077: T__177
                {
                mT__177(); 

                }
                break;
            case 167 :
                // InternalDearCode.g:1:1084: T__178
                {
                mT__178(); 

                }
                break;
            case 168 :
                // InternalDearCode.g:1:1091: T__179
                {
                mT__179(); 

                }
                break;
            case 169 :
                // InternalDearCode.g:1:1098: T__180
                {
                mT__180(); 

                }
                break;
            case 170 :
                // InternalDearCode.g:1:1105: T__181
                {
                mT__181(); 

                }
                break;
            case 171 :
                // InternalDearCode.g:1:1112: T__182
                {
                mT__182(); 

                }
                break;
            case 172 :
                // InternalDearCode.g:1:1119: T__183
                {
                mT__183(); 

                }
                break;
            case 173 :
                // InternalDearCode.g:1:1126: T__184
                {
                mT__184(); 

                }
                break;
            case 174 :
                // InternalDearCode.g:1:1133: T__185
                {
                mT__185(); 

                }
                break;
            case 175 :
                // InternalDearCode.g:1:1140: T__186
                {
                mT__186(); 

                }
                break;
            case 176 :
                // InternalDearCode.g:1:1147: T__187
                {
                mT__187(); 

                }
                break;
            case 177 :
                // InternalDearCode.g:1:1154: T__188
                {
                mT__188(); 

                }
                break;
            case 178 :
                // InternalDearCode.g:1:1161: T__189
                {
                mT__189(); 

                }
                break;
            case 179 :
                // InternalDearCode.g:1:1168: T__190
                {
                mT__190(); 

                }
                break;
            case 180 :
                // InternalDearCode.g:1:1175: T__191
                {
                mT__191(); 

                }
                break;
            case 181 :
                // InternalDearCode.g:1:1182: T__192
                {
                mT__192(); 

                }
                break;
            case 182 :
                // InternalDearCode.g:1:1189: T__193
                {
                mT__193(); 

                }
                break;
            case 183 :
                // InternalDearCode.g:1:1196: T__194
                {
                mT__194(); 

                }
                break;
            case 184 :
                // InternalDearCode.g:1:1203: T__195
                {
                mT__195(); 

                }
                break;
            case 185 :
                // InternalDearCode.g:1:1210: T__196
                {
                mT__196(); 

                }
                break;
            case 186 :
                // InternalDearCode.g:1:1217: T__197
                {
                mT__197(); 

                }
                break;
            case 187 :
                // InternalDearCode.g:1:1224: T__198
                {
                mT__198(); 

                }
                break;
            case 188 :
                // InternalDearCode.g:1:1231: T__199
                {
                mT__199(); 

                }
                break;
            case 189 :
                // InternalDearCode.g:1:1238: T__200
                {
                mT__200(); 

                }
                break;
            case 190 :
                // InternalDearCode.g:1:1245: T__201
                {
                mT__201(); 

                }
                break;
            case 191 :
                // InternalDearCode.g:1:1252: T__202
                {
                mT__202(); 

                }
                break;
            case 192 :
                // InternalDearCode.g:1:1259: T__203
                {
                mT__203(); 

                }
                break;
            case 193 :
                // InternalDearCode.g:1:1266: T__204
                {
                mT__204(); 

                }
                break;
            case 194 :
                // InternalDearCode.g:1:1273: T__205
                {
                mT__205(); 

                }
                break;
            case 195 :
                // InternalDearCode.g:1:1280: T__206
                {
                mT__206(); 

                }
                break;
            case 196 :
                // InternalDearCode.g:1:1287: T__207
                {
                mT__207(); 

                }
                break;
            case 197 :
                // InternalDearCode.g:1:1294: T__208
                {
                mT__208(); 

                }
                break;
            case 198 :
                // InternalDearCode.g:1:1301: T__209
                {
                mT__209(); 

                }
                break;
            case 199 :
                // InternalDearCode.g:1:1308: T__210
                {
                mT__210(); 

                }
                break;
            case 200 :
                // InternalDearCode.g:1:1315: T__211
                {
                mT__211(); 

                }
                break;
            case 201 :
                // InternalDearCode.g:1:1322: T__212
                {
                mT__212(); 

                }
                break;
            case 202 :
                // InternalDearCode.g:1:1329: T__213
                {
                mT__213(); 

                }
                break;
            case 203 :
                // InternalDearCode.g:1:1336: T__214
                {
                mT__214(); 

                }
                break;
            case 204 :
                // InternalDearCode.g:1:1343: T__215
                {
                mT__215(); 

                }
                break;
            case 205 :
                // InternalDearCode.g:1:1350: T__216
                {
                mT__216(); 

                }
                break;
            case 206 :
                // InternalDearCode.g:1:1357: T__217
                {
                mT__217(); 

                }
                break;
            case 207 :
                // InternalDearCode.g:1:1364: T__218
                {
                mT__218(); 

                }
                break;
            case 208 :
                // InternalDearCode.g:1:1371: T__219
                {
                mT__219(); 

                }
                break;
            case 209 :
                // InternalDearCode.g:1:1378: T__220
                {
                mT__220(); 

                }
                break;
            case 210 :
                // InternalDearCode.g:1:1385: T__221
                {
                mT__221(); 

                }
                break;
            case 211 :
                // InternalDearCode.g:1:1392: T__222
                {
                mT__222(); 

                }
                break;
            case 212 :
                // InternalDearCode.g:1:1399: T__223
                {
                mT__223(); 

                }
                break;
            case 213 :
                // InternalDearCode.g:1:1406: T__224
                {
                mT__224(); 

                }
                break;
            case 214 :
                // InternalDearCode.g:1:1413: T__225
                {
                mT__225(); 

                }
                break;
            case 215 :
                // InternalDearCode.g:1:1420: T__226
                {
                mT__226(); 

                }
                break;
            case 216 :
                // InternalDearCode.g:1:1427: T__227
                {
                mT__227(); 

                }
                break;
            case 217 :
                // InternalDearCode.g:1:1434: T__228
                {
                mT__228(); 

                }
                break;
            case 218 :
                // InternalDearCode.g:1:1441: T__229
                {
                mT__229(); 

                }
                break;
            case 219 :
                // InternalDearCode.g:1:1448: T__230
                {
                mT__230(); 

                }
                break;
            case 220 :
                // InternalDearCode.g:1:1455: T__231
                {
                mT__231(); 

                }
                break;
            case 221 :
                // InternalDearCode.g:1:1462: T__232
                {
                mT__232(); 

                }
                break;
            case 222 :
                // InternalDearCode.g:1:1469: T__233
                {
                mT__233(); 

                }
                break;
            case 223 :
                // InternalDearCode.g:1:1476: T__234
                {
                mT__234(); 

                }
                break;
            case 224 :
                // InternalDearCode.g:1:1483: RULE_ANYTEXT
                {
                mRULE_ANYTEXT(); 

                }
                break;
            case 225 :
                // InternalDearCode.g:1:1496: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 226 :
                // InternalDearCode.g:1:1504: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 227 :
                // InternalDearCode.g:1:1513: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 228 :
                // InternalDearCode.g:1:1525: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 229 :
                // InternalDearCode.g:1:1541: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 230 :
                // InternalDearCode.g:1:1557: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 231 :
                // InternalDearCode.g:1:1565: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\4\64\1\uffff\16\64\1\uffff\20\64\2\uffff\3\64\2\62\2\uffff\3\62\2\uffff\1\64\1\uffff\6\64\1\uffff\5\64\1\uffff\5\64\1\u009c\21\64\1\uffff\3\64\1\uffff\13\64\1\uffff\1\64\1\uffff\7\64\1\uffff\2\64\1\u00e1\2\64\2\uffff\3\64\6\uffff\6\64\2\uffff\2\64\1\uffff\6\64\1\uffff\5\64\2\uffff\2\64\1\uffff\5\64\1\uffff\2\64\1\uffff\14\64\1\uffff\3\64\3\uffff\16\64\4\uffff\1\64\5\uffff\7\64\1\uffff\3\64\1\u0153\1\64\1\uffff\13\64\5\uffff\2\64\11\uffff\4\64\5\uffff\7\64\1\uffff\6\64\2\uffff\3\64\3\uffff\15\64\3\uffff\2\64\6\uffff\2\64\1\uffff\12\64\1\uffff\1\64\5\uffff\12\64\1\u01b9\1\uffff\1\u01ba\7\64\1\uffff\4\64\1\uffff\1\64\2\uffff\4\64\4\uffff\1\u01ce\6\64\1\uffff\6\64\2\uffff\3\64\4\uffff\1\64\1\uffff\2\64\1\uffff\2\64\1\uffff\1\u01f0\2\uffff\2\64\17\uffff\2\64\1\uffff\1\u0209\6\64\1\uffff\3\64\1\uffff\5\64\1\uffff\4\64\2\uffff\13\64\5\uffff\1\64\3\uffff\2\64\1\uffff\3\64\2\uffff\5\64\3\uffff\3\64\4\uffff\1\64\2\uffff\1\64\4\uffff\1\64\4\uffff\2\64\20\uffff\2\64\3\uffff\4\64\1\uffff\1\64\2\uffff\1\64\1\uffff\1\64\3\uffff\4\64\3\uffff\11\64\1\u0277\1\u0278\1\64\1\uffff\3\64\3\uffff\1\64\1\u0284\1\uffff\1\64\1\uffff\1\64\2\uffff\1\u028b\1\64\1\u028e\6\uffff\3\64\4\uffff\1\64\1\uffff\2\64\3\uffff\2\64\14\uffff\2\64\1\uffff\12\64\1\uffff\1\u02b3\1\uffff\2\64\1\uffff\2\64\1\uffff\2\64\2\uffff\1\64\11\uffff\1\u02c0\3\uffff\1\u02c1\1\64\3\uffff\1\u02c3\3\uffff\3\64\5\uffff\2\64\3\uffff\1\64\10\uffff\2\64\2\uffff\2\64\1\uffff\1\64\1\uffff\2\64\3\uffff\1\u02ea\3\64\1\uffff\1\u02ee\15\uffff\1\64\4\uffff\1\64\21\uffff\2\64\4\uffff\2\64\5\uffff\1\64\1\uffff\1\64\12\uffff\1\64\24\uffff\2\64\2\uffff\1\u032e\4\uffff\2\64\7\uffff\1\64\13\uffff\1\64\1\u033e\3\uffff\2\64\16\uffff\2\64\7\uffff\1\64\10\uffff\1\u0354\11\uffff";
    static final String DFA13_eofS =
        "\u035c\uffff";
    static final String DFA13_minS =
        "\1\0\1\165\2\156\1\145\1\uffff\2\141\1\157\1\141\1\157\1\145\1\143\1\145\1\162\1\156\2\141\1\145\1\151\1\uffff\1\145\1\165\1\40\1\151\1\141\2\145\2\141\2\40\1\145\1\151\1\142\1\156\1\157\2\uffff\1\156\1\165\1\142\1\0\1\101\2\uffff\2\0\1\52\2\uffff\1\145\1\uffff\1\163\1\145\1\143\3\40\1\uffff\2\156\1\141\1\143\1\171\1\uffff\1\40\1\152\1\155\1\145\1\157\1\40\1\162\1\141\1\u00ed\3\141\2\40\1\155\1\156\1\145\1\156\1\152\1\144\1\152\1\163\1\40\1\uffff\2\162\1\145\1\141\1\145\1\144\1\163\1\162\1\145\1\163\1\144\1\145\1\164\1\156\1\155\1\141\1\162\1\141\1\40\1\155\1\145\1\142\1\144\1\162\1\40\1\uffff\2\151\1\60\1\156\1\162\2\uffff\1\166\1\162\1\163\6\uffff\1\162\1\160\1\163\1\145\1\162\1\u00ed\1\143\1\141\1\147\1\157\1\117\1\40\1\164\1\156\1\145\1\164\1\40\1\143\1\164\1\151\1\142\1\156\1\154\2\uffff\1\141\1\162\1\40\1\157\1\146\1\165\1\162\1\142\1\155\1\165\1\157\1\144\1\40\1\142\1\164\1\151\1\143\1\172\1\141\1\144\3\157\1\165\1\145\1\155\2\40\1\163\1\154\1\141\1\156\1\151\1\40\1\164\2\155\1\163\1\165\1\145\1\166\1\145\1\141\1\164\1\u00e1\4\uffff\1\145\1\uffff\1\144\2\uffff\1\144\1\141\1\165\1\141\1\155\1\162\1\145\1\141\1\uffff\1\155\1\143\1\144\1\60\1\163\1\uffff\1\144\1\164\1\157\1\155\1\145\2\151\1\40\1\162\1\143\1\151\1\uffff\1\141\3\uffff\1\157\1\40\2\uffff\1\145\6\uffff\1\157\1\144\1\163\1\141\1\uffff\1\157\1\151\2\uffff\1\157\1\145\1\151\2\145\1\160\1\151\1\163\1\152\2\151\1\145\1\144\1\157\1\156\1\151\1\145\1\156\1\145\2\uffff\1\145\1\165\1\40\1\151\1\141\1\40\1\145\1\141\1\40\1\145\2\40\1\163\1\162\1\154\2\uffff\1\40\1\u00ed\1\143\1\141\1\u00ed\1\40\1\uffff\1\40\1\164\1\146\1\161\1\141\1\151\3\145\2\141\1\40\1\156\1\157\1\uffff\1\143\2\uffff\1\151\2\uffff\2\162\1\144\1\160\1\141\1\40\1\172\2\151\1\157\1\60\1\uffff\1\60\1\151\1\141\1\143\1\165\1\161\1\144\1\162\1\uffff\1\157\1\150\1\160\1\142\1\144\1\40\1\uffff\1\147\1\40\1\157\2\40\4\uffff\1\60\1\156\1\145\1\40\1\141\1\157\1\143\1\145\1\157\1\166\1\162\1\166\1\157\3\40\1\154\1\143\1\154\1\141\1\156\1\uffff\1\141\1\162\1\160\1\156\1\40\1\151\1\40\1\156\1\161\1\60\1\uffff\1\145\1\151\1\162\1\uffff\1\40\1\163\1\164\1\141\1\165\2\uffff\1\154\1\141\2\uffff\1\40\1\145\1\144\1\162\1\151\1\165\1\40\2\164\2\156\1\40\1\156\1\141\1\144\1\40\1\151\1\146\1\141\1\162\1\157\1\162\1\40\1\143\1\141\1\163\1\157\1\163\2\uffff\1\144\1\154\1\157\1\162\1\165\2\141\1\40\3\157\1\141\4\uffff\1\40\1\uffff\1\161\1\uffff\1\144\1\156\1\155\1\156\1\40\1\151\1\uffff\2\40\1\157\1\155\1\157\1\40\1\145\1\154\1\141\1\164\1\145\1\141\1\154\1\40\1\uffff\1\163\1\157\1\156\1\uffff\1\141\4\uffff\1\144\1\165\1\uffff\1\165\1\156\1\164\1\157\1\144\1\151\1\145\1\144\1\162\1\40\2\uffff\1\145\1\143\6\uffff\1\141\1\143\1\145\2\uffff\1\145\1\151\1\164\1\141\1\uffff\1\144\2\uffff\1\157\1\uffff\1\145\3\uffff\1\144\1\141\1\40\1\145\3\uffff\1\40\1\155\1\156\1\40\1\157\1\145\1\40\1\157\1\151\2\60\1\163\1\154\4\40\1\145\1\165\1\157\1\60\1\145\1\157\1\uffff\1\157\1\145\1\uffff\1\60\1\157\1\40\1\uffff\1\156\4\uffff\1\157\1\163\1\172\2\uffff\1\145\3\40\1\144\1\157\2\145\1\40\1\157\1\40\2\uffff\1\40\1\155\1\141\2\uffff\1\143\1\154\2\uffff\1\157\1\163\1\157\2\40\1\145\1\141\1\40\1\157\1\40\1\156\1\157\2\40\1\uffff\1\60\1\uffff\1\157\1\141\1\uffff\1\163\1\143\1\uffff\1\40\1\157\2\uffff\1\40\5\uffff\1\160\1\154\1\uffff\1\145\1\40\3\uffff\1\60\1\40\3\uffff\1\60\2\uffff\3\40\1\141\2\uffff\1\144\1\uffff\1\162\1\157\3\40\1\145\1\40\1\141\2\145\1\40\2\uffff\4\40\1\145\1\uffff\2\156\1\143\1\40\1\uffff\1\144\1\163\1\141\2\uffff\1\60\1\154\1\40\1\151\1\uffff\1\60\3\uffff\2\40\1\145\4\uffff\2\145\2\144\4\uffff\1\40\1\uffff\2\145\3\uffff\1\40\1\uffff\1\154\1\40\1\145\1\163\1\144\1\141\3\uffff\2\144\1\156\3\uffff\1\157\1\40\1\157\1\145\3\uffff\1\155\1\uffff\1\144\1\uffff\1\141\1\145\4\uffff\1\156\1\uffff\1\165\1\157\1\uffff\1\154\2\uffff\1\40\1\154\1\40\1\141\7\uffff\1\165\1\uffff\1\165\2\uffff\2\157\2\uffff\1\40\1\uffff\1\156\2\uffff\1\145\1\157\5\uffff\1\40\1\145\2\40\1\165\2\uffff\1\143\1\152\4\uffff\2\40\1\60\2\uffff\1\40\1\156\1\163\1\154\1\40\1\uffff\1\164\1\156\10\uffff\1\155\1\164\1\40\2\uffff\1\142\2\uffff\1\151\2\145\5\uffff\1\166\2\uffff\1\60\1\145\1\uffff\1\162\1\163\1\157\1\40\1\145\2\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\165\1\156\1\163\1\165\1\uffff\1\165\1\157\1\u00fa\1\151\1\157\1\145\1\164\1\145\1\165\1\163\1\162\1\165\1\145\1\165\1\uffff\1\157\1\165\1\40\1\157\1\141\1\162\1\157\1\154\1\165\1\146\1\40\1\165\1\151\1\u00f1\1\156\1\165\2\uffff\1\156\1\165\1\142\1\uffff\1\172\2\uffff\2\uffff\1\57\2\uffff\1\145\1\uffff\1\163\1\145\1\160\1\166\1\40\1\156\1\uffff\2\156\1\141\1\163\1\171\1\uffff\1\40\1\170\1\155\1\145\1\157\1\172\1\162\1\141\1\u00ed\1\156\2\141\1\166\1\40\1\156\1\163\1\145\1\156\1\163\1\144\1\160\1\163\1\40\1\uffff\2\162\1\145\1\154\1\145\1\144\1\172\1\162\1\157\1\163\1\144\1\145\1\164\1\162\1\155\1\164\1\162\1\164\1\160\1\163\1\145\1\142\1\144\1\162\1\40\1\uffff\2\151\1\172\1\156\1\162\2\uffff\1\166\1\162\1\163\6\uffff\1\162\1\160\1\163\1\145\1\165\1\u00ed\2\154\1\147\1\157\1\163\1\40\1\164\1\156\1\145\1\164\1\40\1\163\1\164\1\151\1\142\1\156\1\154\2\uffff\1\141\1\162\1\40\1\157\1\166\1\165\1\162\1\142\2\165\1\162\1\151\1\152\1\157\1\164\1\151\1\143\1\172\1\141\1\144\3\157\1\165\1\164\1\157\2\40\1\163\1\156\1\141\1\156\1\151\1\40\1\164\2\155\1\163\1\165\1\145\1\166\1\145\1\141\1\164\1\u00e1\4\uffff\1\145\1\uffff\1\154\2\uffff\1\165\1\141\1\165\1\141\1\155\1\162\1\145\1\141\1\uffff\1\155\1\143\1\144\1\172\1\163\1\uffff\1\144\1\164\1\157\1\155\1\145\2\151\1\40\1\162\1\154\1\151\1\uffff\1\141\3\uffff\1\157\1\40\2\uffff\1\145\6\uffff\1\157\1\144\1\163\1\141\1\uffff\1\162\1\165\2\uffff\1\157\1\145\1\151\2\145\1\160\1\151\1\163\1\152\2\151\1\145\1\144\1\157\1\156\1\151\1\145\1\156\1\145\2\uffff\2\165\1\40\1\151\1\141\1\40\1\145\1\141\1\40\1\145\2\40\1\163\1\162\1\156\2\uffff\1\40\1\u00ed\1\143\1\163\1\u00ed\1\40\1\uffff\1\40\1\164\1\146\1\161\1\141\1\151\3\145\2\141\1\40\1\156\1\157\1\uffff\1\143\2\uffff\1\151\2\uffff\2\162\1\144\1\160\1\141\1\40\1\172\2\151\1\157\1\172\1\uffff\1\172\1\151\1\141\1\143\1\165\1\161\1\144\1\162\1\uffff\1\157\1\150\1\160\1\142\1\144\1\40\1\uffff\1\166\1\40\1\157\2\40\4\uffff\1\172\1\156\1\145\1\40\1\141\1\157\1\143\1\151\1\157\1\166\1\162\1\166\1\157\3\40\1\154\1\143\1\154\1\141\1\156\1\uffff\1\157\1\162\1\165\1\156\1\40\1\163\1\40\1\156\1\161\1\172\1\uffff\1\161\1\151\1\162\1\uffff\1\40\1\163\1\164\1\141\1\165\2\uffff\2\154\2\uffff\1\40\1\165\1\u00fa\1\162\1\151\1\165\1\172\2\164\2\156\1\40\1\156\1\151\1\144\1\40\1\151\1\166\1\141\1\162\1\157\1\162\1\40\1\155\1\141\1\163\1\157\1\163\2\uffff\1\144\1\154\1\157\1\162\1\165\1\157\1\141\1\40\3\157\1\141\4\uffff\1\40\1\uffff\1\161\1\uffff\1\144\1\156\1\155\1\156\1\40\1\151\1\uffff\2\40\1\157\1\155\1\157\1\40\1\145\1\163\1\143\1\164\1\145\1\141\1\163\1\40\1\uffff\1\163\1\157\1\156\1\uffff\1\141\4\uffff\1\144\1\165\1\uffff\1\165\1\156\1\164\1\157\1\154\1\151\1\145\1\144\1\163\1\40\2\uffff\1\156\1\143\6\uffff\1\141\1\143\1\145\2\uffff\1\145\1\151\1\164\1\141\1\uffff\1\144\2\uffff\1\157\1\uffff\1\145\3\uffff\1\144\1\157\1\40\1\145\3\uffff\1\40\1\155\1\156\1\40\1\157\1\145\1\40\1\157\1\151\2\172\1\163\1\164\4\40\1\154\1\165\1\157\1\172\1\u00e1\1\157\1\uffff\1\157\1\163\1\uffff\1\172\1\157\1\172\1\uffff\1\156\4\uffff\1\157\1\163\1\172\2\uffff\1\163\3\40\1\144\1\157\2\145\1\40\1\157\1\40\2\uffff\1\40\1\155\1\141\2\uffff\1\166\1\154\2\uffff\1\157\1\163\1\157\2\40\1\145\1\141\1\40\1\157\1\40\1\156\1\157\2\40\1\uffff\1\172\1\uffff\1\157\1\141\1\uffff\1\163\1\143\1\uffff\1\40\1\157\2\uffff\1\40\5\uffff\1\163\1\154\1\uffff\1\145\1\172\3\uffff\1\172\1\40\3\uffff\1\172\2\uffff\3\40\1\141\2\uffff\1\162\1\uffff\1\166\1\157\3\40\1\164\1\40\1\141\1\154\1\145\1\40\2\uffff\4\40\1\163\1\uffff\2\156\1\151\1\40\1\uffff\1\144\1\163\1\164\2\uffff\1\172\1\154\1\40\1\151\1\uffff\1\172\3\uffff\2\40\1\163\4\uffff\1\154\1\145\1\161\1\144\4\uffff\1\40\1\uffff\1\145\1\154\3\uffff\1\154\1\uffff\1\154\1\40\1\157\1\165\1\163\1\164\3\uffff\2\144\1\163\3\uffff\1\157\1\40\1\157\1\u00e1\3\uffff\1\155\1\uffff\1\144\1\uffff\1\u00fa\1\154\4\uffff\1\156\1\uffff\1\165\1\157\1\uffff\1\154\2\uffff\1\40\1\164\1\40\1\164\7\uffff\1\u00fa\1\uffff\1\165\2\uffff\2\157\2\uffff\1\172\1\uffff\1\156\2\uffff\1\145\1\157\5\uffff\1\40\1\145\2\40\1\165\2\uffff\1\166\1\154\4\uffff\1\163\1\40\1\172\2\uffff\1\40\1\156\1\163\1\155\1\40\1\uffff\1\165\1\156\10\uffff\1\155\1\164\1\40\2\uffff\1\156\2\uffff\1\151\1\u00e1\1\145\5\uffff\1\166\2\uffff\1\172\1\145\1\uffff\1\162\1\163\1\157\1\40\1\165\2\uffff";
    static final String DFA13_acceptS =
        "\5\uffff\1\6\16\uffff\1\54\20\uffff\1\u00b9\1\u00ba\5\uffff\1\u00e1\1\u00e2\3\uffff\1\u00e6\1\u00e7\1\uffff\1\u00e1\6\uffff\1\6\5\uffff\1\13\27\uffff\1\54\31\uffff\1\u00ad\5\uffff\1\u00b9\1\u00ba\3\uffff\1\u00e0\1\u00e2\1\u00e3\1\u00e4\1\u00e5\1\u00e6\27\uffff\1\16\1\17\55\uffff\1\u0082\1\u0083\1\u0084\1\u0085\1\uffff\1\u0086\1\uffff\1\u008a\1\u008b\10\uffff\1\u00a5\5\uffff\1\u00dc\13\uffff\1\45\1\uffff\1\142\1\5\1\23\2\uffff\1\171\1\172\1\uffff\1\u00cb\1\u00cf\1\u00d0\1\u00d1\1\u00d2\1\7\4\uffff\1\40\2\uffff\1\u00b6\1\u00b7\23\uffff\1\u0092\1\u0095\17\uffff\1\50\1\53\6\uffff\1\170\16\uffff\1\u00bc\1\uffff\1\u0088\1\u0089\1\uffff\1\u00a8\1\u00a9\13\uffff\1\u00dd\10\uffff\1\4\6\uffff\1\145\5\uffff\1\u0094\1\u00b4\1\u00a1\1\u00b5\25\uffff\1\35\12\uffff\1\u00b8\3\uffff\1\47\5\uffff\1\65\1\67\2\uffff\1\150\1\152\34\uffff\1\u00df\1\u00de\14\uffff\1\11\1\u00ca\1\u00ce\1\44\1\uffff\1\12\1\uffff\1\14\6\uffff\1\71\16\uffff\1\u0081\3\uffff\1\175\1\uffff\1\u008d\1\u0097\1\u009b\1\u00b1\2\uffff\1\123\12\uffff\1\132\1\153\2\uffff\1\113\1\166\1\74\1\115\1\135\1\167\3\uffff\1\112\1\124\4\uffff\1\u0099\1\uffff\1\u008c\1\u008e\1\uffff\1\u0087\1\uffff\1\u008f\1\u0093\1\u00b3\4\uffff\1\u0091\1\u0098\1\u009c\27\uffff\1\21\2\uffff\1\22\3\uffff\1\25\1\uffff\1\27\1\32\1\u00c8\1\u00c9\3\uffff\1\30\1\125\13\uffff\1\51\1\52\3\uffff\1\63\1\154\2\uffff\1\72\1\165\16\uffff\1\u00aa\1\uffff\1\u009d\2\uffff\1\u00a6\2\uffff\1\u00bd\2\uffff\1\1\1\2\1\uffff\1\10\1\26\1\20\1\146\1\141\2\uffff\1\161\2\uffff\1\155\1\u009f\1\u00a3\2\uffff\1\163\1\164\1\u00d6\1\uffff\1\u00da\1\u00d7\4\uffff\1\31\1\176\1\uffff\1\u00c0\13\uffff\1\130\1\131\5\uffff\1\110\4\uffff\1\160\3\uffff\1\u00be\1\u00bb\4\uffff\1\u00bf\1\uffff\1\3\1\116\1\121\3\uffff\1\151\1\15\1\24\1\u00d8\4\uffff\1\u00c1\1\u00c3\1\33\1\177\1\uffff\1\36\2\uffff\1\140\1\173\1\u00cd\1\uffff\1\62\6\uffff\1\u00db\1\104\1\107\3\uffff\1\u0090\1\u00b0\1\156\4\uffff\1\u00a0\1\u00a4\1\u00c6\1\uffff\1\u00a7\1\uffff\1\u00cc\2\uffff\1\37\1\105\1\43\1\143\1\uffff\1\55\2\uffff\1\u00ab\1\uffff\1\41\1\46\4\uffff\1\117\1\120\1\122\1\70\1\111\1\73\1\134\1\uffff\1\77\1\uffff\1\101\1\102\2\uffff\1\127\1\u00b2\1\uffff\1\u00af\1\uffff\1\u009a\1\u009e\2\uffff\1\133\1\137\1\162\1\114\1\136\5\uffff\1\147\1\174\2\uffff\1\u00d4\1\u00d9\1\75\1\76\3\uffff\1\u00c5\1\u00c2\5\uffff\1\u00ac\2\uffff\1\64\1\66\1\u00d3\1\u00d5\1\100\1\103\1\157\1\u00c4\3\uffff\1\34\1\u0080\1\uffff\1\106\1\126\3\uffff\1\u00ae\1\56\1\57\1\60\1\61\1\uffff\1\u0096\1\u00a2\2\uffff\1\u00c7\5\uffff\1\42\1\144";
    static final String DFA13_specialS =
        "\1\3\51\uffff\1\1\3\uffff\1\0\1\2\u032c\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\62\2\61\2\62\1\61\22\62\1\61\1\62\1\56\4\62\1\57\1\45\1\46\2\62\1\24\1\62\1\5\1\60\12\55\7\62\1\14\1\54\1\6\1\22\1\3\1\54\1\16\1\7\1\2\2\54\1\13\1\30\1\54\1\51\1\25\1\1\1\15\1\23\1\4\4\54\1\27\1\54\3\62\1\53\1\54\1\62\1\42\1\12\1\20\1\21\1\17\1\44\1\54\1\31\1\47\1\35\1\54\1\34\1\50\1\10\1\36\1\32\1\26\1\33\1\40\1\11\1\43\1\41\2\54\1\37\1\54\3\62\1\52\uff81\62",
            "\1\63",
            "\1\65",
            "\1\70\3\uffff\1\66\1\67",
            "\1\72\17\uffff\1\71",
            "",
            "\1\75\15\uffff\1\74\5\uffff\1\76",
            "\1\77\15\uffff\1\100",
            "\1\102\u008a\uffff\1\101",
            "\1\104\3\uffff\1\103\3\uffff\1\105",
            "\1\106",
            "\1\107",
            "\1\111\17\uffff\1\112\1\110",
            "\1\113",
            "\1\115\2\uffff\1\114",
            "\1\116\4\uffff\1\117",
            "\1\121\15\uffff\1\120\2\uffff\1\122",
            "\1\123\3\uffff\1\124\17\uffff\1\125",
            "\1\126",
            "\1\130\13\uffff\1\127",
            "",
            "\1\132\11\uffff\1\133",
            "\1\134",
            "\1\135",
            "\1\136\5\uffff\1\137",
            "\1\140",
            "\1\141\14\uffff\1\142",
            "\1\143\11\uffff\1\144",
            "\1\146\12\uffff\1\145",
            "\1\150\23\uffff\1\147",
            "\1\151\105\uffff\1\152",
            "\1\153",
            "\1\154\3\uffff\1\156\13\uffff\1\155",
            "\1\157",
            "\1\161\1\uffff\1\165\7\uffff\1\162\5\uffff\1\160\1\164\175\uffff\1\163",
            "\1\166",
            "\1\170\5\uffff\1\167",
            "",
            "",
            "\1\173",
            "\1\174",
            "\1\175",
            "\12\176\1\uffff\2\176\1\uffff\ufff2\176",
            "\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\0\u0080",
            "\0\u0080",
            "\1\u0081\4\uffff\1\u0082",
            "",
            "",
            "\1\u0084",
            "",
            "\1\u0085",
            "\1\u0086",
            "\1\u0088\14\uffff\1\u0087",
            "\1\u008a\125\uffff\1\u0089",
            "\1\u008b",
            "\1\u008e\111\uffff\1\u008d\3\uffff\1\u008c",
            "",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092\17\uffff\1\u0093",
            "\1\u0094",
            "",
            "\1\u0095",
            "\1\u0097\15\uffff\1\u0096",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b\17\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a1\1\uffff\1\u00a0\12\uffff\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5\123\uffff\1\u00a7\1\uffff\1\u00a6",
            "\1\u00a8",
            "\1\u00aa\1\u00a9",
            "\1\u00ab\4\uffff\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af\10\uffff\1\u00b0",
            "\1\u00b1",
            "\1\u00b2\5\uffff\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9\3\uffff\1\u00ba\6\uffff\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00bf\6\uffff\1\u00be",
            "\1\u00c0",
            "\1\u00c2\11\uffff\1\u00c1",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c8\3\uffff\1\u00c7",
            "\1\u00c9",
            "\1\u00cc\17\uffff\1\u00cb\1\uffff\1\u00cd\1\u00ca",
            "\1\u00ce",
            "\1\u00d0\3\uffff\1\u00d2\4\uffff\1\u00d1\11\uffff\1\u00cf",
            "\1\u00d3\117\uffff\1\u00d4",
            "\1\u00d6\5\uffff\1\u00d5",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "",
            "\1\u00dc",
            "\1\u00dd",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u00df\7\64\1\u00de\5\64\1\u00e0\13\64",
            "\1\u00e2",
            "\1\u00e3",
            "",
            "",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00ec\2\uffff\1\u00eb",
            "\1\u00ed",
            "\1\u00ee\10\uffff\1\u00ef",
            "\1\u00f1\12\uffff\1\u00f0",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f7\22\uffff\1\u00fb\1\u00f9\1\u00fa\1\u00f4\11\uffff\1\u00f5\2\uffff\1\u00f6\1\u00f8",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102\11\uffff\1\u0104\2\uffff\1\u0105\2\uffff\1\u0103",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "",
            "",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u0110\17\uffff\1\u010f",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0115\7\uffff\1\u0114",
            "\1\u0116",
            "\1\u0117\2\uffff\1\u0118",
            "\1\u011a\4\uffff\1\u0119",
            "\1\u011b\111\uffff\1\u011c",
            "\1\u011e\14\uffff\1\u011d",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129\6\uffff\1\u012b\7\uffff\1\u012a",
            "\1\u012d\1\uffff\1\u012c",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131\1\uffff\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "",
            "",
            "",
            "",
            "\1\u0142",
            "",
            "\1\u0143\7\uffff\1\u0144",
            "",
            "",
            "\1\u0145\1\uffff\1\u0147\16\uffff\1\u0146",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\22\64\1\u0152\7\64",
            "\1\u0154",
            "",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e\10\uffff\1\u015f",
            "\1\u0160",
            "",
            "\1\u0161",
            "",
            "",
            "",
            "\1\u0162",
            "\1\u0163",
            "",
            "",
            "\1\u0164",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "",
            "\1\u0169\2\uffff\1\u016a",
            "\1\u016c\13\uffff\1\u016b",
            "",
            "",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "",
            "",
            "\1\u0182\6\uffff\1\u0183\3\uffff\1\u0180\4\uffff\1\u0181",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0192\1\uffff\1\u0191",
            "",
            "",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u019c\2\uffff\1\u0197\1\u0199\1\uffff\1\u019b\4\uffff\1\u019a\5\uffff\1\u0198\1\u0196",
            "\1\u019d",
            "\1\u019e",
            "",
            "\1\u019f",
            "\1\u01a0",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a8",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u01ac",
            "",
            "\1\u01ad",
            "",
            "",
            "\1\u01ae",
            "",
            "",
            "\1\u01af",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u01bb",
            "\1\u01bc",
            "\1\u01bd",
            "\1\u01be",
            "\1\u01bf",
            "\1\u01c0",
            "\1\u01c1",
            "",
            "\1\u01c2",
            "\1\u01c3",
            "\1\u01c4",
            "\1\u01c5",
            "\1\u01c6",
            "\1\u01c7",
            "",
            "\1\u01c8\16\uffff\1\u01c9",
            "\1\u01ca",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cd",
            "",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u01cf",
            "\1\u01d0",
            "\1\u01d1",
            "\1\u01d2",
            "\1\u01d3",
            "\1\u01d4",
            "\1\u01d6\3\uffff\1\u01d5",
            "\1\u01d7",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da",
            "\1\u01db",
            "\1\u01dc",
            "\1\u01dd",
            "\1\u01de",
            "\1\u01df",
            "\1\u01e0",
            "\1\u01e1",
            "\1\u01e2",
            "\1\u01e3",
            "",
            "\1\u01e4\15\uffff\1\u01e5",
            "\1\u01e6",
            "\1\u01e8\4\uffff\1\u01e7",
            "\1\u01e9",
            "\1\u01ea",
            "\1\u01ec\11\uffff\1\u01eb",
            "\1\u01ed",
            "\1\u01ee",
            "\1\u01ef",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u01f2\13\uffff\1\u01f1",
            "\1\u01f3",
            "\1\u01f4",
            "",
            "\1\u01f5",
            "\1\u01f6",
            "\1\u01f7",
            "\1\u01f8",
            "\1\u01f9",
            "",
            "",
            "\1\u01fa",
            "\1\u01fb\12\uffff\1\u01fc",
            "",
            "",
            "\1\u01fd",
            "\1\u01fe\15\uffff\1\u01ff\1\uffff\1\u0200",
            "\1\u0201\1\u0204\12\uffff\1\u0202\u0089\uffff\1\u0203",
            "\1\u0205",
            "\1\u0206",
            "\1\u0207",
            "\1\u0208\17\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u020a",
            "\1\u020b",
            "\1\u020c",
            "\1\u020d",
            "\1\u020e",
            "\1\u020f",
            "\1\u0210\7\uffff\1\u0211",
            "\1\u0212",
            "\1\u0213",
            "\1\u0214",
            "\1\u0216\14\uffff\1\u0215\2\uffff\1\u0217",
            "\1\u0218",
            "\1\u0219",
            "\1\u021a",
            "\1\u021b",
            "\1\u021c",
            "\1\u021d\11\uffff\1\u021e",
            "\1\u021f",
            "\1\u0220",
            "\1\u0221",
            "\1\u0222",
            "",
            "",
            "\1\u0223",
            "\1\u0224",
            "\1\u0225",
            "\1\u0226",
            "\1\u0227",
            "\1\u0229\15\uffff\1\u0228",
            "\1\u022a",
            "\1\u022b",
            "\1\u022c",
            "\1\u022d",
            "\1\u022e",
            "\1\u022f",
            "",
            "",
            "",
            "",
            "\1\u0230",
            "",
            "\1\u0231",
            "",
            "\1\u0232",
            "\1\u0233",
            "\1\u0234",
            "\1\u0235",
            "\1\u0236",
            "\1\u0237",
            "",
            "\1\u0238",
            "\1\u0239",
            "\1\u023a",
            "\1\u023b",
            "\1\u023c",
            "\1\u023d",
            "\1\u023e",
            "\1\u0240\6\uffff\1\u023f",
            "\1\u0242\1\uffff\1\u0241",
            "\1\u0243",
            "\1\u0244",
            "\1\u0245",
            "\1\u0246\6\uffff\1\u0247",
            "\1\u0248",
            "",
            "\1\u0249",
            "\1\u024a",
            "\1\u024b",
            "",
            "\1\u024c",
            "",
            "",
            "",
            "",
            "\1\u024d",
            "\1\u024e",
            "",
            "\1\u024f",
            "\1\u0250",
            "\1\u0251",
            "\1\u0252",
            "\1\u0254\7\uffff\1\u0253",
            "\1\u0255",
            "\1\u0256",
            "\1\u0257",
            "\1\u0258\1\u0259",
            "\1\u025a",
            "",
            "",
            "\1\u025b\6\uffff\1\u025c\1\uffff\1\u025d",
            "\1\u025e",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u025f",
            "\1\u0260",
            "\1\u0261",
            "",
            "",
            "\1\u0262",
            "\1\u0263",
            "\1\u0264",
            "\1\u0265",
            "",
            "\1\u0266",
            "",
            "",
            "\1\u0267",
            "",
            "\1\u0268",
            "",
            "",
            "",
            "\1\u0269",
            "\1\u026a\15\uffff\1\u026b",
            "\1\u026c",
            "\1\u026d",
            "",
            "",
            "",
            "\1\u026e",
            "\1\u026f",
            "\1\u0270",
            "\1\u0271",
            "\1\u0272",
            "\1\u0273",
            "\1\u0274",
            "\1\u0275",
            "\1\u0276",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0279",
            "\1\u027a\7\uffff\1\u027b",
            "\1\u027c",
            "\1\u027d",
            "\1\u027e",
            "\1\u027f",
            "\1\u0280\6\uffff\1\u0281",
            "\1\u0282",
            "\1\u0283",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0285\173\uffff\1\u0286",
            "\1\u0287",
            "",
            "\1\u0288",
            "\1\u028a\15\uffff\1\u0289",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u028c",
            "\1\u028d\17\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u028f",
            "",
            "",
            "",
            "",
            "\1\u0290",
            "\1\u0291",
            "\1\u0292",
            "",
            "",
            "\1\u0293\15\uffff\1\u0294",
            "\1\u0295",
            "\1\u0296",
            "\1\u0297",
            "\1\u0298",
            "\1\u0299",
            "\1\u029a",
            "\1\u029b",
            "\1\u029c",
            "\1\u029d",
            "\1\u029e",
            "",
            "",
            "\1\u029f",
            "\1\u02a0",
            "\1\u02a1",
            "",
            "",
            "\1\u02a3\22\uffff\1\u02a2",
            "\1\u02a4",
            "",
            "",
            "\1\u02a5",
            "\1\u02a6",
            "\1\u02a7",
            "\1\u02a8",
            "\1\u02a9",
            "\1\u02aa",
            "\1\u02ab",
            "\1\u02ac",
            "\1\u02ad",
            "\1\u02ae",
            "\1\u02af",
            "\1\u02b0",
            "\1\u02b1",
            "\1\u02b2",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u02b4",
            "\1\u02b5",
            "",
            "\1\u02b6",
            "\1\u02b7",
            "",
            "\1\u02b8",
            "\1\u02b9",
            "",
            "",
            "\1\u02ba",
            "",
            "",
            "",
            "",
            "",
            "\1\u02bc\2\uffff\1\u02bb",
            "\1\u02bd",
            "",
            "\1\u02be",
            "\1\u02bf\17\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u02c2",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u02c4",
            "\1\u02c5",
            "\1\u02c6",
            "\1\u02c7",
            "",
            "",
            "\1\u02c9\15\uffff\1\u02c8",
            "",
            "\1\u02cb\3\uffff\1\u02ca",
            "\1\u02cc",
            "\1\u02cd",
            "\1\u02ce",
            "\1\u02cf",
            "\1\u02d0\16\uffff\1\u02d1",
            "\1\u02d2",
            "\1\u02d3",
            "\1\u02d5\6\uffff\1\u02d4",
            "\1\u02d6",
            "\1\u02d7",
            "",
            "",
            "\1\u02d8",
            "\1\u02d9",
            "\1\u02da",
            "\1\u02db",
            "\1\u02dd\15\uffff\1\u02dc",
            "",
            "\1\u02de",
            "\1\u02df",
            "\1\u02e2\1\uffff\1\u02e0\3\uffff\1\u02e1",
            "\1\u02e3",
            "",
            "\1\u02e4",
            "\1\u02e5",
            "\1\u02e9\1\uffff\1\u02e6\11\uffff\1\u02e7\6\uffff\1\u02e8",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u02eb",
            "\1\u02ec",
            "\1\u02ed",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "\1\u02ef",
            "\1\u02f0",
            "\1\u02f2\15\uffff\1\u02f1",
            "",
            "",
            "",
            "",
            "\1\u02f3\6\uffff\1\u02f4",
            "\1\u02f5",
            "\1\u02f6\14\uffff\1\u02f7",
            "\1\u02f8",
            "",
            "",
            "",
            "",
            "\1\u02f9",
            "",
            "\1\u02fa",
            "\1\u02fb\6\uffff\1\u02fc",
            "",
            "",
            "",
            "\1\u02fe\113\uffff\1\u02fd",
            "",
            "\1\u02ff",
            "\1\u0300",
            "\1\u0302\6\uffff\1\u0301\2\uffff\1\u0303",
            "\1\u0305\1\uffff\1\u0304",
            "\1\u0306\16\uffff\1\u0307",
            "\1\u0308\3\uffff\1\u030b\6\uffff\1\u030c\1\u0309\6\uffff\1\u030a",
            "",
            "",
            "",
            "\1\u030d",
            "\1\u030e",
            "\1\u0310\4\uffff\1\u030f",
            "",
            "",
            "",
            "\1\u0311",
            "\1\u0312",
            "\1\u0313",
            "\1\u0314\173\uffff\1\u0315",
            "",
            "",
            "",
            "\1\u0316",
            "",
            "\1\u0317",
            "",
            "\1\u031a\13\uffff\1\u0319\u008c\uffff\1\u0318",
            "\1\u031c\6\uffff\1\u031b",
            "",
            "",
            "",
            "",
            "\1\u031d",
            "",
            "\1\u031e",
            "\1\u031f",
            "",
            "\1\u0320",
            "",
            "",
            "\1\u0321",
            "\1\u0322\7\uffff\1\u0323",
            "\1\u0324",
            "\1\u0325\20\uffff\1\u0326\1\uffff\1\u0327",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0328\u0084\uffff\1\u0329",
            "",
            "\1\u032a",
            "",
            "",
            "\1\u032b",
            "\1\u032c",
            "",
            "",
            "\1\u032d\17\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u032f",
            "",
            "",
            "\1\u0330",
            "\1\u0331",
            "",
            "",
            "",
            "",
            "",
            "\1\u0332",
            "\1\u0333",
            "\1\u0334",
            "\1\u0335",
            "\1\u0336",
            "",
            "",
            "\1\u0338\22\uffff\1\u0337",
            "\1\u033a\1\uffff\1\u0339",
            "",
            "",
            "",
            "",
            "\1\u033b\122\uffff\1\u033c",
            "\1\u033d",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u033f",
            "\1\u0340",
            "\1\u0341",
            "\1\u0342\1\u0343",
            "\1\u0344",
            "",
            "\1\u0345\1\u0346",
            "\1\u0347",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0348",
            "\1\u0349",
            "\1\u034a",
            "",
            "",
            "\1\u034b\2\uffff\1\u034d\7\uffff\1\u034e\1\u034c",
            "",
            "",
            "\1\u034f",
            "\1\u0350\173\uffff\1\u0351",
            "\1\u0352",
            "",
            "",
            "",
            "",
            "",
            "\1\u0353",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0355",
            "",
            "\1\u0356",
            "\1\u0357",
            "\1\u0358",
            "\1\u0359",
            "\1\u035a\17\uffff\1\u035b",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | T__168 | T__169 | T__170 | T__171 | T__172 | T__173 | T__174 | T__175 | T__176 | T__177 | T__178 | T__179 | T__180 | T__181 | T__182 | T__183 | T__184 | T__185 | T__186 | T__187 | T__188 | T__189 | T__190 | T__191 | T__192 | T__193 | T__194 | T__195 | T__196 | T__197 | T__198 | T__199 | T__200 | T__201 | T__202 | T__203 | T__204 | T__205 | T__206 | T__207 | T__208 | T__209 | T__210 | T__211 | T__212 | T__213 | T__214 | T__215 | T__216 | T__217 | T__218 | T__219 | T__220 | T__221 | T__222 | T__223 | T__224 | T__225 | T__226 | T__227 | T__228 | T__229 | T__230 | T__231 | T__232 | T__233 | T__234 | RULE_ANYTEXT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_46 = input.LA(1);

                        s = -1;
                        if ( ((LA13_46>='\u0000' && LA13_46<='\uFFFF')) ) {s = 128;}

                        else s = 50;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_42 = input.LA(1);

                        s = -1;
                        if ( ((LA13_42>='\u0000' && LA13_42<='\t')||(LA13_42>='\u000B' && LA13_42<='\f')||(LA13_42>='\u000E' && LA13_42<='\uFFFF')) ) {s = 126;}

                        else s = 50;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_47 = input.LA(1);

                        s = -1;
                        if ( ((LA13_47>='\u0000' && LA13_47<='\uFFFF')) ) {s = 128;}

                        else s = 50;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='Q') ) {s = 1;}

                        else if ( (LA13_0=='I') ) {s = 2;}

                        else if ( (LA13_0=='E') ) {s = 3;}

                        else if ( (LA13_0=='T') ) {s = 4;}

                        else if ( (LA13_0=='.') ) {s = 5;}

                        else if ( (LA13_0=='C') ) {s = 6;}

                        else if ( (LA13_0=='H') ) {s = 7;}

                        else if ( (LA13_0=='n') ) {s = 8;}

                        else if ( (LA13_0=='t') ) {s = 9;}

                        else if ( (LA13_0=='b') ) {s = 10;}

                        else if ( (LA13_0=='L') ) {s = 11;}

                        else if ( (LA13_0=='A') ) {s = 12;}

                        else if ( (LA13_0=='R') ) {s = 13;}

                        else if ( (LA13_0=='G') ) {s = 14;}

                        else if ( (LA13_0=='e') ) {s = 15;}

                        else if ( (LA13_0=='c') ) {s = 16;}

                        else if ( (LA13_0=='d') ) {s = 17;}

                        else if ( (LA13_0=='D') ) {s = 18;}

                        else if ( (LA13_0=='S') ) {s = 19;}

                        else if ( (LA13_0==',') ) {s = 20;}

                        else if ( (LA13_0=='P') ) {s = 21;}

                        else if ( (LA13_0=='q') ) {s = 22;}

                        else if ( (LA13_0=='Y') ) {s = 23;}

                        else if ( (LA13_0=='M') ) {s = 24;}

                        else if ( (LA13_0=='h') ) {s = 25;}

                        else if ( (LA13_0=='p') ) {s = 26;}

                        else if ( (LA13_0=='r') ) {s = 27;}

                        else if ( (LA13_0=='l') ) {s = 28;}

                        else if ( (LA13_0=='j') ) {s = 29;}

                        else if ( (LA13_0=='o') ) {s = 30;}

                        else if ( (LA13_0=='y') ) {s = 31;}

                        else if ( (LA13_0=='s') ) {s = 32;}

                        else if ( (LA13_0=='v') ) {s = 33;}

                        else if ( (LA13_0=='a') ) {s = 34;}

                        else if ( (LA13_0=='u') ) {s = 35;}

                        else if ( (LA13_0=='f') ) {s = 36;}

                        else if ( (LA13_0=='(') ) {s = 37;}

                        else if ( (LA13_0==')') ) {s = 38;}

                        else if ( (LA13_0=='i') ) {s = 39;}

                        else if ( (LA13_0=='m') ) {s = 40;}

                        else if ( (LA13_0=='O') ) {s = 41;}

                        else if ( (LA13_0=='~') ) {s = 42;}

                        else if ( (LA13_0=='^') ) {s = 43;}

                        else if ( (LA13_0=='B'||LA13_0=='F'||(LA13_0>='J' && LA13_0<='K')||LA13_0=='N'||(LA13_0>='U' && LA13_0<='X')||LA13_0=='Z'||LA13_0=='_'||LA13_0=='g'||LA13_0=='k'||(LA13_0>='w' && LA13_0<='x')||LA13_0=='z') ) {s = 44;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 45;}

                        else if ( (LA13_0=='\"') ) {s = 46;}

                        else if ( (LA13_0=='\'') ) {s = 47;}

                        else if ( (LA13_0=='/') ) {s = 48;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 49;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='*' && LA13_0<='+')||LA13_0=='-'||(LA13_0>=':' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||(LA13_0>='{' && LA13_0<='}')||(LA13_0>='\u007F' && LA13_0<='\uFFFF')) ) {s = 50;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}