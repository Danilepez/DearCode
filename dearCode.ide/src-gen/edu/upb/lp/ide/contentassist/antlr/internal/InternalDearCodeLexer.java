package edu.upb.lp.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDearCodeLexer extends Lexer {
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
            // InternalDearCode.g:13:7: ( 'cero' )
            // InternalDearCode.g:13:9: 'cero'
            {
            match("cero"); 


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
            // InternalDearCode.g:14:7: ( 'uno' )
            // InternalDearCode.g:14:9: 'uno'
            {
            match("uno"); 


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
            // InternalDearCode.g:15:7: ( 'dos' )
            // InternalDearCode.g:15:9: 'dos'
            {
            match("dos"); 


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
            // InternalDearCode.g:16:7: ( 'tres' )
            // InternalDearCode.g:16:9: 'tres'
            {
            match("tres"); 


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
            // InternalDearCode.g:17:7: ( 'cuatro' )
            // InternalDearCode.g:17:9: 'cuatro'
            {
            match("cuatro"); 


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
            // InternalDearCode.g:18:7: ( 'cinco' )
            // InternalDearCode.g:18:9: 'cinco'
            {
            match("cinco"); 


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
            // InternalDearCode.g:19:7: ( 'seis' )
            // InternalDearCode.g:19:9: 'seis'
            {
            match("seis"); 


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
            // InternalDearCode.g:20:7: ( 'siete' )
            // InternalDearCode.g:20:9: 'siete'
            {
            match("siete"); 


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
            // InternalDearCode.g:21:7: ( 'ocho' )
            // InternalDearCode.g:21:9: 'ocho'
            {
            match("ocho"); 


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
            // InternalDearCode.g:22:7: ( 'nueve' )
            // InternalDearCode.g:22:9: 'nueve'
            {
            match("nueve"); 


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
            // InternalDearCode.g:23:7: ( 'un' )
            // InternalDearCode.g:23:9: 'un'
            {
            match("un"); 


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
            // InternalDearCode.g:24:7: ( 'una' )
            // InternalDearCode.g:24:9: 'una'
            {
            match("una"); 


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
            // InternalDearCode.g:25:7: ( 'Te regalo' )
            // InternalDearCode.g:25:9: 'Te regalo'
            {
            match("Te regalo"); 


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
            // InternalDearCode.g:26:7: ( 'Ofrezco' )
            // InternalDearCode.g:26:9: 'Ofrezco'
            {
            match("Ofrezco"); 


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
            // InternalDearCode.g:27:7: ( 'Obsequio' )
            // InternalDearCode.g:27:9: 'Obsequio'
            {
            match("Obsequio"); 


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
            // InternalDearCode.g:28:7: ( 'Deposito en tu jard\\u00EDn' )
            // InternalDearCode.g:28:9: 'Deposito en tu jard\\u00EDn'
            {
            match("Deposito en tu jard\u00EDn"); 


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
            // InternalDearCode.g:29:7: ( 'Perm\\u00EDteme alimentar' )
            // InternalDearCode.g:29:9: 'Perm\\u00EDteme alimentar'
            {
            match("Perm\u00EDteme alimentar"); 


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
            // InternalDearCode.g:30:7: ( 'Perm\\u00EDteme regar' )
            // InternalDearCode.g:30:9: 'Perm\\u00EDteme regar'
            {
            match("Perm\u00EDteme regar"); 


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
            // InternalDearCode.g:31:7: ( 'Perm\\u00EDteme ajustar' )
            // InternalDearCode.g:31:9: 'Perm\\u00EDteme ajustar'
            {
            match("Perm\u00EDteme ajustar"); 


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
            // InternalDearCode.g:32:7: ( 'late al un\\u00EDsono con' )
            // InternalDearCode.g:32:9: 'late al un\\u00EDsono con'
            {
            match("late al un\u00EDsono con"); 


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
            // InternalDearCode.g:33:7: ( 'canta con un matiz distinto a' )
            // InternalDearCode.g:33:9: 'canta con un matiz distinto a'
            {
            match("canta con un matiz distinto a"); 


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
            // InternalDearCode.g:34:7: ( 'susurra con menos fuerza que' )
            // InternalDearCode.g:34:9: 'susurra con menos fuerza que'
            {
            match("susurra con menos fuerza que"); 


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
            // InternalDearCode.g:35:7: ( 'casi suspira al mismo nivel que' )
            // InternalDearCode.g:35:9: 'casi suspira al mismo nivel que'
            {
            match("casi suspira al mismo nivel que"); 


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
            // InternalDearCode.g:36:7: ( 'arde con m\\u00E1s pasi\\u00F3n que' )
            // InternalDearCode.g:36:9: 'arde con m\\u00E1s pasi\\u00F3n que'
            {
            match("arde con m\u00E1s pasi\u00F3n que"); 


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
            // InternalDearCode.g:37:7: ( 'rodea con tanta fuerza como' )
            // InternalDearCode.g:37:9: 'rodea con tanta fuerza como'
            {
            match("rodea con tanta fuerza como"); 


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
            // InternalDearCode.g:38:7: ( 'unidos en un solo suspiro con' )
            // InternalDearCode.g:38:9: 'unidos en un solo suspiro con'
            {
            match("unidos en un solo suspiro con"); 


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
            // InternalDearCode.g:39:7: ( 'fundidos en la llama de' )
            // InternalDearCode.g:39:9: 'fundidos en la llama de'
            {
            match("fundidos en la llama de"); 


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
            // InternalDearCode.g:40:7: ( 'fortalecidos por el fuego de' )
            // InternalDearCode.g:40:9: 'fortalecidos por el fuego de'
            {
            match("fortalecidos por el fuego de"); 


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
            // InternalDearCode.g:41:7: ( 'separados entre los ecos de' )
            // InternalDearCode.g:41:9: 'separados entre los ecos de'
            {
            match("separados entre los ecos de"); 


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
            // InternalDearCode.g:42:7: ( 'resuena con el eco de' )
            // InternalDearCode.g:42:9: 'resuena con el eco de'
            {
            match("resuena con el eco de"); 


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
            // InternalDearCode.g:43:7: ( 'siempre' )
            // InternalDearCode.g:43:9: 'siempre'
            {
            match("siempre"); 


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
            // InternalDearCode.g:44:7: ( 'jam\\u00E1s' )
            // InternalDearCode.g:44:9: 'jam\\u00E1s'
            {
            match("jam\u00E1s"); 


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
            // InternalDearCode.g:45:7: ( 'a\\u00FAn me piensas' )
            // InternalDearCode.g:45:9: 'a\\u00FAn me piensas'
            {
            match("a\u00FAn me piensas"); 


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
            // InternalDearCode.g:46:7: ( 'tu voz me alcanza' )
            // InternalDearCode.g:46:9: 'tu voz me alcanza'
            {
            match("tu voz me alcanza"); 


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
            // InternalDearCode.g:47:7: ( 'Mientras aun me pienses' )
            // InternalDearCode.g:47:9: 'Mientras aun me pienses'
            {
            match("Mientras aun me pienses"); 


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
            // InternalDearCode.g:48:7: ( 'Mientras a\\u00FAn sue\\u00F1es con este momento, haz que ocurra' )
            // InternalDearCode.g:48:9: 'Mientras a\\u00FAn sue\\u00F1es con este momento, haz que ocurra'
            {
            match("Mientras a\u00FAn sue\u00F1es con este momento, haz que ocurra"); 


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
            // InternalDearCode.g:49:7: ( 'Cada dia, desde' )
            // InternalDearCode.g:49:9: 'Cada dia, desde'
            {
            match("Cada dia, desde"); 


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
            // InternalDearCode.g:50:7: ( 'Por cada suspiro desde' )
            // InternalDearCode.g:50:9: 'Por cada suspiro desde'
            {
            match("Por cada suspiro desde"); 


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
            // InternalDearCode.g:51:7: ( 'Dejo en estas l\\u00EDneas una promesa llamada' )
            // InternalDearCode.g:51:9: 'Dejo en estas l\\u00EDneas una promesa llamada'
            {
            match("Dejo en estas l\u00EDneas una promesa llamada"); 


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
            // InternalDearCode.g:52:7: ( 'Escribo en estas l\\u00EDneas una intenci\\u00F3n llamada' )
            // InternalDearCode.g:52:9: 'Escribo en estas l\\u00EDneas una intenci\\u00F3n llamada'
            {
            match("Escribo en estas l\u00EDneas una intenci\u00F3n llamada"); 


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
            // InternalDearCode.g:53:7: ( 'En la brisa escondo un deseo llamado' )
            // InternalDearCode.g:53:9: 'En la brisa escondo un deseo llamado'
            {
            match("En la brisa escondo un deseo llamado"); 


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
            // InternalDearCode.g:54:7: ( '.' )
            // InternalDearCode.g:54:9: '.'
            {
            match('.'); 

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
            // InternalDearCode.g:55:7: ( 'Con cari\\u00F1o, Tu programador' )
            // InternalDearCode.g:55:9: 'Con cari\\u00F1o, Tu programador'
            {
            match("Con cari\u00F1o, Tu programador"); 


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
            // InternalDearCode.g:56:7: ( 'con' )
            // InternalDearCode.g:56:9: 'con'
            {
            match("con"); 


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
            // InternalDearCode.g:57:7: ( 'Le ped\\u00ED al lector que me dijera' )
            // InternalDearCode.g:57:9: 'Le ped\\u00ED al lector que me dijera'
            {
            match("Le ped\u00ED al lector que me dijera"); 


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
            // InternalDearCode.g:58:7: ( 'Hoy le quise contar al mundo sobre:' )
            // InternalDearCode.g:58:9: 'Hoy le quise contar al mundo sobre:'
            {
            match("Hoy le quise contar al mundo sobre:"); 


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
            // InternalDearCode.g:59:7: ( 'y' )
            // InternalDearCode.g:59:9: 'y'
            {
            match('y'); 

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
            // InternalDearCode.g:60:7: ( 'decena' )
            // InternalDearCode.g:60:9: 'decena'
            {
            match("decena"); 


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
            // InternalDearCode.g:61:7: ( 's' )
            // InternalDearCode.g:61:9: 's'
            {
            match('s'); 

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
            // InternalDearCode.g:62:7: ( 'centena' )
            // InternalDearCode.g:62:9: 'centena'
            {
            match("centena"); 


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
            // InternalDearCode.g:63:7: ( 'millar' )
            // InternalDearCode.g:63:9: 'millar'
            {
            match("millar"); 


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
            // InternalDearCode.g:64:7: ( 'es' )
            // InternalDearCode.g:64:9: 'es'
            {
            match("es"); 


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
            // InternalDearCode.g:65:7: ( 'o quiz\\u00E1s' )
            // InternalDearCode.g:65:9: 'o quiz\\u00E1s'
            {
            match("o quiz\u00E1s"); 


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
            // InternalDearCode.g:66:7: ( 'y tambi\\u00E9n' )
            // InternalDearCode.g:66:9: 'y tambi\\u00E9n'
            {
            match("y tambi\u00E9n"); 


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
            // InternalDearCode.g:67:7: ( 'no creo que' )
            // InternalDearCode.g:67:9: 'no creo que'
            {
            match("no creo que"); 


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
            // InternalDearCode.g:68:7: ( '(' )
            // InternalDearCode.g:68:9: '('
            {
            match('('); 

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
            // InternalDearCode.g:69:7: ( ')' )
            // InternalDearCode.g:69:9: ')'
            {
            match(')'); 

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
            // InternalDearCode.g:70:7: ( ',' )
            // InternalDearCode.g:70:9: ','
            {
            match(','); 

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
            // InternalDearCode.g:71:7: ( 'Si en tu corazon sientes que' )
            // InternalDearCode.g:71:9: 'Si en tu corazon sientes que'
            {
            match("Si en tu corazon sientes que"); 


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
            // InternalDearCode.g:72:7: ( 'entonces deja que estas palabras florezcan:' )
            // InternalDearCode.g:72:9: 'entonces deja que estas palabras florezcan:'
            {
            match("entonces deja que estas palabras florezcan:"); 


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
            // InternalDearCode.g:73:7: ( 'Y as\\u00ED el universo sigue su curso.' )
            // InternalDearCode.g:73:9: 'Y as\\u00ED el universo sigue su curso.'
            {
            match("Y as\u00ED el universo sigue su curso."); 


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
            // InternalDearCode.g:74:7: ( 'Pero si el destino dijera lo contrario,' )
            // InternalDearCode.g:74:9: 'Pero si el destino dijera lo contrario,'
            {
            match("Pero si el destino dijera lo contrario,"); 


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
            // InternalDearCode.g:75:7: ( 'que broten estas verdades:' )
            // InternalDearCode.g:75:9: 'que broten estas verdades:'
            {
            match("que broten estas verdades:"); 


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
            // InternalDearCode.g:76:7: ( 'haz que suceda:' )
            // InternalDearCode.g:76:9: 'haz que suceda:'
            {
            match("haz que suceda:"); 


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
            // InternalDearCode.g:77:7: ( 'Y as\\u00ED el susurro descansa.' )
            // InternalDearCode.g:77:9: 'Y as\\u00ED el susurro descansa.'
            {
            match("Y as\u00ED el susurro descansa."); 


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
            // InternalDearCode.g:78:7: ( 'hasta' )
            // InternalDearCode.g:78:9: 'hasta'
            {
            match("hasta"); 


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
            // InternalDearCode.g:79:7: ( 'y que gire el verso:' )
            // InternalDearCode.g:79:9: 'y que gire el verso:'
            {
            match("y que gire el verso:"); 


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
            // InternalDearCode.g:80:7: ( 'Cuando el eco se apague.' )
            // InternalDearCode.g:80:9: 'Cuando el eco se apague.'
            {
            match("Cuando el eco se apague."); 


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
            // InternalDearCode.g:81:7: ( 'Cuando la promesa se cumple:' )
            // InternalDearCode.g:81:9: 'Cuando la promesa se cumple:'
            {
            match("Cuando la promesa se cumple:"); 


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
            // InternalDearCode.g:82:7: ( 'As\\u00ED se sella la promesa.' )
            // InternalDearCode.g:82:9: 'As\\u00ED se sella la promesa.'
            {
            match("As\u00ED se sella la promesa."); 


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
            // InternalDearCode.g:83:7: ( 'que guarda en su esencia' )
            // InternalDearCode.g:83:9: 'que guarda en su esencia'
            {
            match("que guarda en su esencia"); 


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
            // InternalDearCode.g:84:7: ( 'Y al final, dejo volar' )
            // InternalDearCode.g:84:9: 'Y al final, dejo volar'
            {
            match("Y al final, dejo volar"); 


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
            // InternalDearCode.g:85:7: ( 'en un suspiro.' )
            // InternalDearCode.g:85:9: 'en un suspiro.'
            {
            match("en un suspiro."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "RULE_ANYTEXT"
    public final void mRULE_ANYTEXT() throws RecognitionException {
        try {
            int _type = RULE_ANYTEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:6070:14: ( '~' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '.' | '(' | ')' | '\\u00BF' | '?' | '\\u00A1' | '!' | '\\'' | '\\u2019' | ' ' )+ '_' )
            // InternalDearCode.g:6070:16: '~' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '.' | '(' | ')' | '\\u00BF' | '?' | '\\u00A1' | '!' | '\\'' | '\\u2019' | ' ' )+ '_'
            {
            match('~'); 
            // InternalDearCode.g:6070:20: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '.' | '(' | ')' | '\\u00BF' | '?' | '\\u00A1' | '!' | '\\'' | '\\u2019' | ' ' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=' ' && LA1_0<='!')||(LA1_0>='\'' && LA1_0<=')')||(LA1_0>='-' && LA1_0<='.')||(LA1_0>='0' && LA1_0<='9')||LA1_0=='?'||(LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')||LA1_0=='\u00A1'||LA1_0=='\u00BF'||LA1_0=='\u2019') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDearCode.g:
            	    {
            	    if ( (input.LA(1)>=' ' && input.LA(1)<='!')||(input.LA(1)>='\'' && input.LA(1)<=')')||(input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='?'||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00A1'||input.LA(1)=='\u00BF'||input.LA(1)=='\u2019' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

            match('_'); 

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
            // InternalDearCode.g:6072:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalDearCode.g:6072:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalDearCode.g:6072:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDearCode.g:6072:11: '^'
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

            // InternalDearCode.g:6072:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalDearCode.g:6074:10: ( ( '0' .. '9' )+ )
            // InternalDearCode.g:6074:12: ( '0' .. '9' )+
            {
            // InternalDearCode.g:6074:12: ( '0' .. '9' )+
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
            	    // InternalDearCode.g:6074:13: '0' .. '9'
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
            // InternalDearCode.g:6076:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalDearCode.g:6076:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalDearCode.g:6076:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalDearCode.g:6076:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalDearCode.g:6076:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalDearCode.g:6076:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDearCode.g:6076:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalDearCode.g:6076:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalDearCode.g:6076:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalDearCode.g:6076:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDearCode.g:6076:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalDearCode.g:6078:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalDearCode.g:6078:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalDearCode.g:6078:24: ( options {greedy=false; } : . )*
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
            	    // InternalDearCode.g:6078:52: .
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
            // InternalDearCode.g:6080:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalDearCode.g:6080:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalDearCode.g:6080:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDearCode.g:6080:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalDearCode.g:6080:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDearCode.g:6080:41: ( '\\r' )? '\\n'
                    {
                    // InternalDearCode.g:6080:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalDearCode.g:6080:41: '\\r'
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
            // InternalDearCode.g:6082:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalDearCode.g:6082:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalDearCode.g:6082:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalDearCode.g:6084:16: ( . )
            // InternalDearCode.g:6084:18: .
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
        // InternalDearCode.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | RULE_ANYTEXT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=83;
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
                // InternalDearCode.g:1:460: RULE_ANYTEXT
                {
                mRULE_ANYTEXT(); 

                }
                break;
            case 77 :
                // InternalDearCode.g:1:473: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 78 :
                // InternalDearCode.g:1:481: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 79 :
                // InternalDearCode.g:1:490: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 80 :
                // InternalDearCode.g:1:502: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 81 :
                // InternalDearCode.g:1:518: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 82 :
                // InternalDearCode.g:1:534: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 83 :
                // InternalDearCode.g:1:542: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\5\55\1\73\16\55\1\uffff\2\55\1\130\2\55\3\uffff\5\55\2\53\2\uffff\3\53\2\uffff\1\55\1\uffff\5\55\1\165\7\55\1\uffff\1\55\1\uffff\12\55\1\uffff\13\55\1\uffff\2\55\2\uffff\1\55\1\u009a\1\55\3\uffff\1\55\1\uffff\3\55\6\uffff\7\55\1\u00aa\1\u00ab\1\u00ac\1\55\1\uffff\1\u00ae\2\55\1\uffff\6\55\2\uffff\22\55\2\uffff\1\55\2\uffff\1\55\1\uffff\1\55\3\uffff\3\55\1\uffff\1\55\1\u00d4\5\55\3\uffff\1\55\1\uffff\1\55\1\u00dc\1\u00dd\4\55\1\u00e2\7\55\1\uffff\6\55\1\uffff\2\55\1\uffff\2\55\1\uffff\2\55\4\uffff\2\55\1\uffff\2\55\1\u00fd\1\55\1\uffff\2\55\2\uffff\1\55\1\u0102\2\55\1\uffff\1\u0105\3\55\5\uffff\5\55\1\uffff\4\55\3\uffff\1\u0114\2\55\1\u0118\2\uffff\1\55\1\u011a\1\55\1\uffff\2\55\1\uffff\3\55\2\uffff\6\55\1\u0128\1\55\2\uffff\1\u012b\1\u012c\1\u012d\3\uffff\1\55\1\u012f\1\55\1\u0131\2\55\1\uffff\4\55\1\uffff\1\55\1\uffff\1\55\4\uffff\1\55\3\uffff\1\u013f\1\55\2\uffff\3\55\3\uffff\1\55\1\uffff\1\55\4\uffff\1\55\5\uffff\1\55\5\uffff\1\55\4\uffff\1\55\1\uffff";
    static final String DFA13_eofS =
        "\u0156\uffff";
    static final String DFA13_minS =
        "\1\0\1\165\1\141\1\156\1\145\1\162\1\60\1\40\1\157\1\145\1\142\2\145\1\141\1\162\1\145\1\157\1\141\1\151\1\141\1\156\1\uffff\1\145\1\157\1\40\1\151\1\156\3\uffff\1\151\1\40\1\165\1\141\1\163\1\40\1\101\2\uffff\2\0\1\52\2\uffff\1\145\1\uffff\1\156\1\141\3\156\1\60\1\163\1\143\1\145\1\40\1\151\1\145\1\163\1\uffff\1\150\1\uffff\1\145\2\40\1\162\1\163\1\152\2\162\1\164\1\144\1\uffff\1\144\1\163\1\156\1\162\1\155\1\145\1\144\1\156\1\141\1\143\1\40\1\uffff\1\40\1\171\1\161\1\uffff\1\154\1\60\1\40\3\uffff\1\40\1\141\1\145\1\163\1\u00ed\6\uffff\1\162\1\157\2\164\1\143\1\164\1\151\3\60\1\144\1\uffff\1\60\1\145\1\163\1\uffff\1\163\1\141\1\155\1\165\1\157\1\166\2\uffff\2\145\2\157\1\155\1\40\3\145\1\165\1\144\1\164\1\u00e1\1\156\1\141\1\40\1\156\1\162\2\uffff\1\40\2\uffff\1\154\1\uffff\1\157\2\uffff\1\154\2\40\1\164\1\uffff\1\151\1\60\1\145\1\162\1\157\1\141\1\40\3\uffff\1\157\1\uffff\1\156\2\60\1\162\1\145\1\160\1\162\1\60\1\145\1\172\1\161\1\163\1\40\1\u00ed\1\40\1\uffff\2\40\1\141\1\145\1\151\1\141\1\uffff\1\164\1\40\1\uffff\1\144\1\151\1\uffff\1\141\1\156\1\u00ed\1\uffff\1\142\1\uffff\1\141\1\144\1\uffff\1\156\1\157\1\60\1\40\1\uffff\1\163\1\141\2\uffff\1\141\1\60\2\162\1\uffff\1\60\1\143\1\165\1\151\1\uffff\1\164\3\uffff\1\40\1\156\1\144\1\154\1\162\1\uffff\1\157\1\142\1\162\1\143\1\40\2\uffff\1\60\2\141\1\60\2\uffff\1\40\1\60\1\144\1\uffff\1\145\1\141\1\uffff\1\157\1\151\1\164\1\145\1\uffff\1\141\1\157\1\145\1\141\1\40\1\157\1\60\2\145\1\uffff\3\60\3\uffff\1\157\1\60\1\40\1\60\2\157\1\155\1\40\1\163\1\143\1\163\1\145\1\40\1\uffff\1\163\1\154\3\uffff\1\163\3\uffff\1\60\1\40\1\145\1\uffff\1\40\1\151\1\40\3\uffff\3\40\2\uffff\1\40\1\uffff\1\144\1\141\1\uffff\1\163\1\uffff\1\141\1\157\1\165\2\uffff\1\152\1\uffff\1\163\4\uffff\1\40\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\2\165\1\156\1\157\1\165\1\172\1\143\1\165\1\145\1\146\1\145\1\157\1\141\1\u00fa\1\157\1\165\1\141\1\151\1\165\1\163\1\uffff\1\145\1\157\1\172\1\151\1\163\3\uffff\1\151\1\40\1\165\1\141\1\163\1\u2019\1\172\2\uffff\2\uffff\1\57\2\uffff\1\145\1\uffff\1\162\1\141\1\156\1\163\1\156\1\172\1\163\1\143\1\145\1\40\1\160\1\145\1\163\1\uffff\1\150\1\uffff\1\145\2\40\1\162\1\163\1\160\2\162\1\164\1\144\1\uffff\1\144\1\163\1\156\1\162\1\155\1\145\1\144\1\156\1\141\1\143\1\40\1\uffff\1\40\1\171\1\164\1\uffff\1\154\1\172\1\164\3\uffff\1\40\1\141\1\145\1\172\1\u00ed\6\uffff\1\162\1\157\2\164\1\143\1\164\1\151\3\172\1\144\1\uffff\1\172\1\145\1\163\1\uffff\1\163\1\141\1\164\1\165\1\157\1\166\2\uffff\2\145\3\157\1\40\3\145\1\165\1\144\1\164\1\u00e1\1\156\1\141\1\40\1\156\1\162\2\uffff\1\40\2\uffff\1\154\1\uffff\1\157\2\uffff\1\163\2\40\1\164\1\uffff\1\151\1\172\1\145\1\162\1\157\1\141\1\40\3\uffff\1\157\1\uffff\1\156\2\172\1\162\1\145\1\160\1\162\1\172\1\145\1\172\1\161\1\163\1\40\1\u00ed\1\40\1\uffff\2\40\1\141\1\145\1\151\1\141\1\uffff\1\164\1\40\1\uffff\1\144\1\151\1\uffff\1\141\1\156\1\u00ed\1\uffff\1\147\1\uffff\1\141\1\144\1\uffff\1\156\1\157\1\172\1\40\1\uffff\1\163\1\141\2\uffff\1\141\1\172\2\162\1\uffff\1\172\1\143\1\165\1\151\1\uffff\1\164\3\uffff\1\40\1\156\1\144\1\154\1\162\1\uffff\1\157\1\142\1\162\1\143\1\40\2\uffff\1\172\1\157\1\141\1\172\2\uffff\1\40\1\172\1\144\1\uffff\1\145\1\141\1\uffff\1\157\1\151\1\164\1\145\1\uffff\1\141\1\157\1\145\1\141\1\40\1\157\1\172\2\145\1\uffff\3\172\3\uffff\1\157\1\172\1\40\1\172\2\157\1\155\1\40\1\163\1\143\1\163\1\154\1\40\1\uffff\1\163\1\154\3\uffff\1\163\3\uffff\1\172\1\40\1\145\1\uffff\1\40\1\151\1\40\3\uffff\3\40\2\uffff\1\40\1\uffff\1\144\1\141\1\uffff\1\165\1\uffff\1\162\1\157\1\u00fa\2\uffff\1\154\1\uffff\1\163\4\uffff\1\40\1\uffff";
    static final String DFA13_acceptS =
        "\25\uffff\1\54\5\uffff\1\72\1\73\1\74\7\uffff\1\115\1\116\3\uffff\1\122\1\123\1\uffff\1\115\15\uffff\1\63\1\uffff\1\67\12\uffff\1\43\13\uffff\1\54\3\uffff\1\61\3\uffff\1\72\1\73\1\74\5\uffff\1\114\1\116\1\117\1\120\1\121\1\122\13\uffff\1\15\3\uffff\1\44\6\uffff\1\71\1\17\22\uffff\1\53\1\57\1\uffff\1\70\1\105\1\uffff\1\66\1\uffff\1\113\1\75\4\uffff\1\110\7\uffff\1\56\1\4\1\16\1\uffff\1\5\17\uffff\1\50\6\uffff\1\42\2\uffff\1\55\2\uffff\1\60\3\uffff\1\112\1\uffff\1\102\2\uffff\1\3\4\uffff\1\31\2\uffff\1\6\1\11\4\uffff\1\13\4\uffff\1\51\1\uffff\1\100\1\26\1\32\5\uffff\1\47\5\uffff\1\101\1\111\4\uffff\1\10\1\27\3\uffff\1\12\2\uffff\1\14\4\uffff\1\33\11\uffff\1\104\3\uffff\1\7\1\34\1\62\15\uffff\1\65\2\uffff\1\1\1\2\1\64\1\uffff\1\41\1\30\1\20\3\uffff\1\40\3\uffff\1\106\1\107\1\52\3\uffff\1\21\1\22\1\uffff\1\35\2\uffff\1\76\1\uffff\1\37\3\uffff\1\77\1\103\1\uffff\1\24\1\uffff\1\45\1\46\1\23\1\25\1\uffff\1\36";
    static final String DFA13_specialS =
        "\1\2\46\uffff\1\0\1\1\u012d\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\53\2\52\2\53\1\52\22\53\1\52\1\53\1\47\4\53\1\50\1\33\1\34\2\53\1\35\1\53\1\25\1\51\12\46\7\53\1\42\1\45\1\23\1\13\1\24\2\45\1\27\3\45\1\26\1\22\1\45\1\12\1\14\1\1\1\45\1\36\1\11\4\45\1\37\1\45\3\53\1\44\1\45\1\53\1\16\1\45\1\2\1\4\1\32\1\20\1\45\1\41\1\45\1\21\1\45\1\15\1\31\1\10\1\7\1\45\1\40\1\17\1\6\1\5\1\3\3\45\1\30\1\45\3\53\1\43\uff81\53",
            "\1\54",
            "\1\61\3\uffff\1\56\3\uffff\1\60\5\uffff\1\62\5\uffff\1\57",
            "\1\63",
            "\1\65\11\uffff\1\64",
            "\1\66\2\uffff\1\67",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\70\3\55\1\71\13\55\1\72\5\55",
            "\1\75\102\uffff\1\74",
            "\1\77\5\uffff\1\76",
            "\1\100",
            "\1\102\3\uffff\1\101",
            "\1\103",
            "\1\104\11\uffff\1\105",
            "\1\106",
            "\1\107\u0087\uffff\1\110",
            "\1\112\11\uffff\1\111",
            "\1\114\5\uffff\1\113",
            "\1\115",
            "\1\116",
            "\1\117\15\uffff\1\120\5\uffff\1\121",
            "\1\123\4\uffff\1\122",
            "",
            "\1\125",
            "\1\126",
            "\1\127\17\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\131",
            "\1\133\4\uffff\1\132",
            "",
            "",
            "",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\2\144\5\uffff\3\144\3\uffff\2\144\1\uffff\12\144\5\uffff\1\144\1\uffff\32\144\6\uffff\32\144\46\uffff\1\144\35\uffff\1\144\u1f59\uffff\1\144",
            "\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\0\146",
            "\0\146",
            "\1\147\4\uffff\1\150",
            "",
            "",
            "\1\152",
            "",
            "\1\154\3\uffff\1\153",
            "\1\155",
            "\1\156",
            "\1\157\4\uffff\1\160",
            "\1\161",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\1\163\7\55\1\164\5\55\1\162\13\55",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172\6\uffff\1\173",
            "\1\174",
            "\1\175",
            "",
            "\1\176",
            "",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0085\5\uffff\1\u0084",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "",
            "\1\u0095",
            "\1\u0096",
            "\1\u0098\2\uffff\1\u0097",
            "",
            "\1\u0099",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u009c\123\uffff\1\u009b",
            "",
            "",
            "",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a1\6\uffff\1\u00a0",
            "\1\u00a2",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00ad",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00af",
            "\1\u00b0",
            "",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b4\6\uffff\1\u00b3",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "",
            "",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc\1\uffff\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "",
            "",
            "\1\u00cb",
            "",
            "",
            "\1\u00cc",
            "",
            "\1\u00cd",
            "",
            "",
            "\1\u00cf\6\uffff\1\u00ce",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "",
            "\1\u00d3",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "",
            "",
            "",
            "\1\u00da",
            "",
            "\1\u00db",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "",
            "\1\u00f0",
            "\1\u00f1",
            "",
            "\1\u00f2",
            "\1\u00f3",
            "",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "",
            "\1\u00f7\4\uffff\1\u00f8",
            "",
            "\1\u00f9",
            "\1\u00fa",
            "",
            "\1\u00fb",
            "\1\u00fc",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00fe",
            "",
            "\1\u00ff",
            "\1\u0100",
            "",
            "",
            "\1\u0101",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0103",
            "\1\u0104",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "",
            "\1\u0109",
            "",
            "",
            "",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0116\15\uffff\1\u0115",
            "\1\u0117",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\1\u0119",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u011b",
            "",
            "\1\u011c",
            "\1\u011d",
            "",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0129",
            "\1\u012a",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "\1\u012e",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0130",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139\6\uffff\1\u013a",
            "\1\u013b",
            "",
            "\1\u013c",
            "\1\u013d",
            "",
            "",
            "",
            "\1\u013e",
            "",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0140",
            "\1\u0141",
            "",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "",
            "",
            "",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "",
            "",
            "\1\u0148",
            "",
            "\1\u0149",
            "\1\u014a",
            "",
            "\1\u014c\1\uffff\1\u014b",
            "",
            "\1\u014d\20\uffff\1\u014e",
            "\1\u014f",
            "\1\u0150\u0084\uffff\1\u0151",
            "",
            "",
            "\1\u0153\1\uffff\1\u0152",
            "",
            "\1\u0154",
            "",
            "",
            "",
            "",
            "\1\u0155",
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
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | RULE_ANYTEXT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_39 = input.LA(1);

                        s = -1;
                        if ( ((LA13_39>='\u0000' && LA13_39<='\uFFFF')) ) {s = 102;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_40 = input.LA(1);

                        s = -1;
                        if ( ((LA13_40>='\u0000' && LA13_40<='\uFFFF')) ) {s = 102;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='Q') ) {s = 1;}

                        else if ( (LA13_0=='c') ) {s = 2;}

                        else if ( (LA13_0=='u') ) {s = 3;}

                        else if ( (LA13_0=='d') ) {s = 4;}

                        else if ( (LA13_0=='t') ) {s = 5;}

                        else if ( (LA13_0=='s') ) {s = 6;}

                        else if ( (LA13_0=='o') ) {s = 7;}

                        else if ( (LA13_0=='n') ) {s = 8;}

                        else if ( (LA13_0=='T') ) {s = 9;}

                        else if ( (LA13_0=='O') ) {s = 10;}

                        else if ( (LA13_0=='D') ) {s = 11;}

                        else if ( (LA13_0=='P') ) {s = 12;}

                        else if ( (LA13_0=='l') ) {s = 13;}

                        else if ( (LA13_0=='a') ) {s = 14;}

                        else if ( (LA13_0=='r') ) {s = 15;}

                        else if ( (LA13_0=='f') ) {s = 16;}

                        else if ( (LA13_0=='j') ) {s = 17;}

                        else if ( (LA13_0=='M') ) {s = 18;}

                        else if ( (LA13_0=='C') ) {s = 19;}

                        else if ( (LA13_0=='E') ) {s = 20;}

                        else if ( (LA13_0=='.') ) {s = 21;}

                        else if ( (LA13_0=='L') ) {s = 22;}

                        else if ( (LA13_0=='H') ) {s = 23;}

                        else if ( (LA13_0=='y') ) {s = 24;}

                        else if ( (LA13_0=='m') ) {s = 25;}

                        else if ( (LA13_0=='e') ) {s = 26;}

                        else if ( (LA13_0=='(') ) {s = 27;}

                        else if ( (LA13_0==')') ) {s = 28;}

                        else if ( (LA13_0==',') ) {s = 29;}

                        else if ( (LA13_0=='S') ) {s = 30;}

                        else if ( (LA13_0=='Y') ) {s = 31;}

                        else if ( (LA13_0=='q') ) {s = 32;}

                        else if ( (LA13_0=='h') ) {s = 33;}

                        else if ( (LA13_0=='A') ) {s = 34;}

                        else if ( (LA13_0=='~') ) {s = 35;}

                        else if ( (LA13_0=='^') ) {s = 36;}

                        else if ( (LA13_0=='B'||(LA13_0>='F' && LA13_0<='G')||(LA13_0>='I' && LA13_0<='K')||LA13_0=='N'||LA13_0=='R'||(LA13_0>='U' && LA13_0<='X')||LA13_0=='Z'||LA13_0=='_'||LA13_0=='b'||LA13_0=='g'||LA13_0=='i'||LA13_0=='k'||LA13_0=='p'||(LA13_0>='v' && LA13_0<='x')||LA13_0=='z') ) {s = 37;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 38;}

                        else if ( (LA13_0=='\"') ) {s = 39;}

                        else if ( (LA13_0=='\'') ) {s = 40;}

                        else if ( (LA13_0=='/') ) {s = 41;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 42;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='*' && LA13_0<='+')||LA13_0=='-'||(LA13_0>=':' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||(LA13_0>='{' && LA13_0<='}')||(LA13_0>='\u007F' && LA13_0<='\uFFFF')) ) {s = 43;}

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