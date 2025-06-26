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
            // InternalDearCode.g:13:7: ( 'Con cari\\u00F1o, Tu programador' )
            // InternalDearCode.g:13:9: 'Con cari\\u00F1o, Tu programador'
            {
            match("Con cari\u00F1o, Tu programador"); 


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
            // InternalDearCode.g:14:7: ( '.' )
            // InternalDearCode.g:14:9: '.'
            {
            match('.'); 

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
            // InternalDearCode.g:15:7: ( 'con' )
            // InternalDearCode.g:15:9: 'con'
            {
            match("con"); 


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
            // InternalDearCode.g:16:7: ( 'cero' )
            // InternalDearCode.g:16:9: 'cero'
            {
            match("cero"); 


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
            // InternalDearCode.g:17:7: ( 'uno' )
            // InternalDearCode.g:17:9: 'uno'
            {
            match("uno"); 


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
            // InternalDearCode.g:18:7: ( 'dos' )
            // InternalDearCode.g:18:9: 'dos'
            {
            match("dos"); 


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
            // InternalDearCode.g:19:7: ( 'tres' )
            // InternalDearCode.g:19:9: 'tres'
            {
            match("tres"); 


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
            // InternalDearCode.g:20:7: ( 'cuatro' )
            // InternalDearCode.g:20:9: 'cuatro'
            {
            match("cuatro"); 


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
            // InternalDearCode.g:21:7: ( 'cinco' )
            // InternalDearCode.g:21:9: 'cinco'
            {
            match("cinco"); 


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
            // InternalDearCode.g:22:7: ( 'seis' )
            // InternalDearCode.g:22:9: 'seis'
            {
            match("seis"); 


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
            // InternalDearCode.g:23:7: ( 'siete' )
            // InternalDearCode.g:23:9: 'siete'
            {
            match("siete"); 


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
            // InternalDearCode.g:24:7: ( 'ocho' )
            // InternalDearCode.g:24:9: 'ocho'
            {
            match("ocho"); 


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
            // InternalDearCode.g:25:7: ( 'nueve' )
            // InternalDearCode.g:25:9: 'nueve'
            {
            match("nueve"); 


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
            // InternalDearCode.g:26:7: ( 'y' )
            // InternalDearCode.g:26:9: 'y'
            {
            match('y'); 

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
            // InternalDearCode.g:27:7: ( 'decena' )
            // InternalDearCode.g:27:9: 'decena'
            {
            match("decena"); 


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
            // InternalDearCode.g:28:7: ( 's' )
            // InternalDearCode.g:28:9: 's'
            {
            match('s'); 

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
            // InternalDearCode.g:29:7: ( 'centena' )
            // InternalDearCode.g:29:9: 'centena'
            {
            match("centena"); 


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
            // InternalDearCode.g:30:7: ( 'millar' )
            // InternalDearCode.g:30:9: 'millar'
            {
            match("millar"); 


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
            // InternalDearCode.g:31:7: ( 'es' )
            // InternalDearCode.g:31:9: 'es'
            {
            match("es"); 


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
            // InternalDearCode.g:32:7: ( 'un' )
            // InternalDearCode.g:32:9: 'un'
            {
            match("un"); 


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
            // InternalDearCode.g:33:7: ( 'una' )
            // InternalDearCode.g:33:9: 'una'
            {
            match("una"); 


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
            // InternalDearCode.g:34:7: ( 'Te regalo' )
            // InternalDearCode.g:34:9: 'Te regalo'
            {
            match("Te regalo"); 


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
            // InternalDearCode.g:35:7: ( 'Ofrezco' )
            // InternalDearCode.g:35:9: 'Ofrezco'
            {
            match("Ofrezco"); 


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
            // InternalDearCode.g:36:7: ( 'Obsequio' )
            // InternalDearCode.g:36:9: 'Obsequio'
            {
            match("Obsequio"); 


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
            // InternalDearCode.g:37:7: ( 'Deposito en tu jard\\u00EDn' )
            // InternalDearCode.g:37:9: 'Deposito en tu jard\\u00EDn'
            {
            match("Deposito en tu jard\u00EDn"); 


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
            // InternalDearCode.g:38:7: ( 'Perm\\u00EDteme' )
            // InternalDearCode.g:38:9: 'Perm\\u00EDteme'
            {
            match("Perm\u00EDteme"); 


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
            // InternalDearCode.g:39:7: ( 'alimentar' )
            // InternalDearCode.g:39:9: 'alimentar'
            {
            match("alimentar"); 


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
            // InternalDearCode.g:40:7: ( 'regar' )
            // InternalDearCode.g:40:9: 'regar'
            {
            match("regar"); 


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
            // InternalDearCode.g:41:7: ( 'ajustar' )
            // InternalDearCode.g:41:9: 'ajustar'
            {
            match("ajustar"); 


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
            // InternalDearCode.g:42:7: ( '@' )
            // InternalDearCode.g:42:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "RULE_ANYTEXT"
    public final void mRULE_ANYTEXT() throws RecognitionException {
        try {
            int _type = RULE_ANYTEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:1108:14: ( '_' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '.' | '(' | ')' | '\\u00BF' | '?' | '\\u00A1' | '!' | '\\'' | '\\u2019' | ' ' )+ ( '...' | '.' | ':' ) )
            // InternalDearCode.g:1108:16: '_' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '.' | '(' | ')' | '\\u00BF' | '?' | '\\u00A1' | '!' | '\\'' | '\\u2019' | ' ' )+ ( '...' | '.' | ':' )
            {
            match('_'); 
            // InternalDearCode.g:1108:20: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '.' | '(' | ')' | '\\u00BF' | '?' | '\\u00A1' | '!' | '\\'' | '\\u2019' | ' ' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='.') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='.') ) {
                        int LA1_4 = input.LA(3);

                        if ( ((LA1_4>=' ' && LA1_4<='!')||(LA1_4>='\'' && LA1_4<=')')||LA1_4=='-'||(LA1_4>='0' && LA1_4<='9')||LA1_4=='?'||(LA1_4>='A' && LA1_4<='Z')||(LA1_4>='a' && LA1_4<='z')||LA1_4=='\u00A1'||LA1_4=='\u00BF'||LA1_4=='\u2019') ) {
                            alt1=1;
                        }

                        else {
                            alt1=1;
                        }

                    }
                    else if ( ((LA1_1>=' ' && LA1_1<='!')||(LA1_1>='\'' && LA1_1<=')')||LA1_1=='-'||(LA1_1>='0' && LA1_1<=':')||LA1_1=='?'||(LA1_1>='A' && LA1_1<='Z')||(LA1_1>='a' && LA1_1<='z')||LA1_1=='\u00A1'||LA1_1=='\u00BF'||LA1_1=='\u2019') ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>=' ' && LA1_0<='!')||(LA1_0>='\'' && LA1_0<=')')||LA1_0=='-'||(LA1_0>='0' && LA1_0<='9')||LA1_0=='?'||(LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')||LA1_0=='\u00A1'||LA1_0=='\u00BF'||LA1_0=='\u2019') ) {
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

            // InternalDearCode.g:1108:110: ( '...' | '.' | ':' )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='.') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='.') ) {
                    alt2=1;
                }
                else {
                    alt2=2;}
            }
            else if ( (LA2_0==':') ) {
                alt2=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDearCode.g:1108:111: '...'
                    {
                    match("..."); 


                    }
                    break;
                case 2 :
                    // InternalDearCode.g:1108:117: '.'
                    {
                    match('.'); 

                    }
                    break;
                case 3 :
                    // InternalDearCode.g:1108:121: ':'
                    {
                    match(':'); 

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
    // $ANTLR end "RULE_ANYTEXT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDearCode.g:1110:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalDearCode.g:1110:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalDearCode.g:1110:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDearCode.g:1110:11: '^'
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

            // InternalDearCode.g:1110:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
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
            	    break loop4;
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
            // InternalDearCode.g:1112:10: ( ( '0' .. '9' )+ )
            // InternalDearCode.g:1112:12: ( '0' .. '9' )+
            {
            // InternalDearCode.g:1112:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDearCode.g:1112:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
            // InternalDearCode.g:1114:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalDearCode.g:1114:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalDearCode.g:1114:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalDearCode.g:1114:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalDearCode.g:1114:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalDearCode.g:1114:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDearCode.g:1114:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalDearCode.g:1114:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalDearCode.g:1114:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalDearCode.g:1114:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDearCode.g:1114:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop7;
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
            // InternalDearCode.g:1116:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalDearCode.g:1116:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalDearCode.g:1116:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDearCode.g:1116:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
            // InternalDearCode.g:1118:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalDearCode.g:1118:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalDearCode.g:1118:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDearCode.g:1118:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop10;
                }
            } while (true);

            // InternalDearCode.g:1118:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDearCode.g:1118:41: ( '\\r' )? '\\n'
                    {
                    // InternalDearCode.g:1118:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalDearCode.g:1118:41: '\\r'
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
            // InternalDearCode.g:1120:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalDearCode.g:1120:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalDearCode.g:1120:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // InternalDearCode.g:1122:16: ( . )
            // InternalDearCode.g:1122:18: .
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
        // InternalDearCode.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_ANYTEXT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=40;
        alt14 = dfa14.predict(input);
        switch (alt14) {
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
                // InternalDearCode.g:1:202: RULE_ANYTEXT
                {
                mRULE_ANYTEXT(); 

                }
                break;
            case 34 :
                // InternalDearCode.g:1:215: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 35 :
                // InternalDearCode.g:1:223: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 36 :
                // InternalDearCode.g:1:232: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 37 :
                // InternalDearCode.g:1:244: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 38 :
                // InternalDearCode.g:1:260: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 39 :
                // InternalDearCode.g:1:276: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 40 :
                // InternalDearCode.g:1:284: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\2\37\1\uffff\4\37\1\54\2\37\1\57\10\37\1\uffff\1\37\1\35\2\uffff\3\35\2\uffff\1\37\1\uffff\1\37\1\uffff\4\37\1\113\5\37\1\uffff\2\37\1\uffff\1\37\1\124\10\37\1\uffff\1\37\6\uffff\2\37\1\137\4\37\1\144\1\145\1\uffff\1\146\7\37\2\uffff\10\37\2\uffff\1\166\3\37\3\uffff\1\37\1\173\1\174\1\37\1\176\12\37\1\uffff\2\37\1\u008b\1\37\2\uffff\1\u008d\1\uffff\1\u008e\4\37\1\uffff\2\37\1\u0095\2\37\1\u0099\1\uffff\1\u009a\2\uffff\1\u009b\5\37\1\uffff\1\u00a1\1\u00a2\1\u00a3\3\uffff\1\u00a4\3\37\1\u00a8\4\uffff\1\u00a9\2\37\3\uffff\1\u00ac\1\uffff";
    static final String DFA14_eofS =
        "\u00ad\uffff";
    static final String DFA14_minS =
        "\1\0\1\165\1\157\1\uffff\1\145\1\156\1\145\1\162\1\60\1\143\1\165\1\60\1\151\1\163\1\145\1\142\2\145\1\152\1\145\1\uffff\1\40\1\101\2\uffff\2\0\1\52\2\uffff\1\145\1\uffff\1\156\1\uffff\2\156\1\141\1\156\1\60\1\163\1\143\1\145\1\151\1\145\1\uffff\1\150\1\145\1\uffff\1\154\1\60\1\40\1\162\1\163\1\160\1\162\1\151\1\165\1\147\1\uffff\1\40\6\uffff\1\162\1\40\1\60\1\157\2\164\1\143\2\60\1\uffff\1\60\1\145\2\163\1\164\1\157\1\166\1\154\2\uffff\2\145\1\157\2\155\1\163\1\141\1\151\2\uffff\1\60\1\145\1\162\1\157\3\uffff\1\156\2\60\1\145\1\60\1\145\1\141\1\172\1\161\1\163\1\u00ed\1\145\1\164\1\162\1\144\1\uffff\1\156\1\157\1\60\1\141\2\uffff\1\60\1\uffff\1\60\1\162\1\143\1\165\1\151\1\uffff\1\156\1\141\1\60\2\141\1\60\1\uffff\1\60\2\uffff\1\60\1\157\1\151\2\164\1\162\1\uffff\3\60\3\uffff\1\60\2\157\1\141\1\60\4\uffff\1\60\1\40\1\162\3\uffff\1\60\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\165\1\157\1\uffff\1\165\1\156\1\157\1\162\1\172\1\143\1\165\1\172\1\151\1\163\1\145\1\146\2\145\1\154\1\145\1\uffff\1\u2019\1\172\2\uffff\2\uffff\1\57\2\uffff\1\145\1\uffff\1\156\1\uffff\1\156\1\162\1\141\1\156\1\172\1\163\1\143\1\145\1\151\1\145\1\uffff\1\150\1\145\1\uffff\1\154\1\172\1\40\1\162\1\163\1\160\1\162\1\151\1\165\1\147\1\uffff\1\u2019\6\uffff\1\162\1\40\1\172\1\157\2\164\1\143\2\172\1\uffff\1\172\1\145\2\163\1\164\1\157\1\166\1\154\2\uffff\2\145\1\157\2\155\1\163\1\141\1\151\2\uffff\1\172\1\145\1\162\1\157\3\uffff\1\156\2\172\1\145\1\172\1\145\1\141\1\172\1\161\1\163\1\u00ed\1\145\1\164\1\162\1\144\1\uffff\1\156\1\157\1\172\1\141\2\uffff\1\172\1\uffff\1\172\1\162\1\143\1\165\1\151\1\uffff\1\156\1\141\1\172\1\157\1\141\1\172\1\uffff\1\172\2\uffff\1\172\1\157\1\151\2\164\1\162\1\uffff\3\172\3\uffff\1\172\2\157\1\141\1\172\4\uffff\1\172\1\40\1\162\3\uffff\1\172\1\uffff";
    static final String DFA14_acceptS =
        "\3\uffff\1\4\20\uffff\1\40\2\uffff\1\42\1\43\3\uffff\1\47\1\50\1\uffff\1\42\1\uffff\1\4\12\uffff\1\22\2\uffff\1\20\12\uffff\1\40\1\uffff\1\41\1\43\1\44\1\45\1\46\1\47\11\uffff\1\26\10\uffff\1\25\1\30\10\uffff\1\3\1\5\4\uffff\1\7\1\27\1\10\17\uffff\1\6\4\uffff\1\11\1\14\1\uffff\1\16\5\uffff\1\34\6\uffff\1\13\1\uffff\1\15\1\17\6\uffff\1\36\3\uffff\1\12\1\21\1\24\5\uffff\1\1\1\2\1\23\1\31\3\uffff\1\37\1\32\1\33\1\uffff\1\35";
    static final String DFA14_specialS =
        "\1\1\30\uffff\1\2\1\0\u0092\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\35\2\34\2\35\1\34\22\35\1\34\1\35\1\31\4\35\1\32\6\35\1\3\1\33\12\30\6\35\1\24\2\27\1\2\1\20\12\27\1\17\1\21\1\1\2\27\1\16\6\27\3\35\1\26\1\25\1\35\1\22\1\27\1\4\1\6\1\15\7\27\1\14\1\12\1\11\2\27\1\23\1\10\1\7\1\5\3\27\1\13\1\27\uff85\35",
            "\1\36",
            "\1\40",
            "",
            "\1\43\3\uffff\1\45\5\uffff\1\42\5\uffff\1\44",
            "\1\46",
            "\1\50\11\uffff\1\47",
            "\1\51",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\4\37\1\52\3\37\1\53\21\37",
            "\1\55",
            "\1\56",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\64\3\uffff\1\63",
            "\1\65",
            "\1\66",
            "\1\70\1\uffff\1\67",
            "\1\71",
            "",
            "\2\74\5\uffff\3\74\3\uffff\2\74\1\uffff\12\73\5\uffff\1\74\1\uffff\32\73\6\uffff\32\73\46\uffff\1\74\35\uffff\1\74\u1f59\uffff\1\74",
            "\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\0\76",
            "\0\76",
            "\1\77\4\uffff\1\100",
            "",
            "",
            "\1\102",
            "",
            "\1\103",
            "",
            "\1\104",
            "\1\106\3\uffff\1\105",
            "\1\107",
            "\1\110",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\1\112\15\37\1\111\13\37",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "",
            "\1\121",
            "\1\122",
            "",
            "\1\123",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "",
            "\2\74\5\uffff\3\74\3\uffff\2\74\1\uffff\12\73\1\74\4\uffff\1\74\1\uffff\32\73\6\uffff\32\73\46\uffff\1\74\35\uffff\1\74\u1f59\uffff\1\74",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\135",
            "\1\136",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "",
            "",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\167",
            "\1\170",
            "\1\171",
            "",
            "",
            "",
            "\1\172",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\175",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "",
            "\1\u0089",
            "\1\u008a",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u008c",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "",
            "\1\u0093",
            "\1\u0094",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0097\15\uffff\1\u0096",
            "\1\u0098",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00aa",
            "\1\u00ab",
            "",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_ANYTEXT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_26 = input.LA(1);

                        s = -1;
                        if ( ((LA14_26>='\u0000' && LA14_26<='\uFFFF')) ) {s = 62;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='Q') ) {s = 1;}

                        else if ( (LA14_0=='C') ) {s = 2;}

                        else if ( (LA14_0=='.') ) {s = 3;}

                        else if ( (LA14_0=='c') ) {s = 4;}

                        else if ( (LA14_0=='u') ) {s = 5;}

                        else if ( (LA14_0=='d') ) {s = 6;}

                        else if ( (LA14_0=='t') ) {s = 7;}

                        else if ( (LA14_0=='s') ) {s = 8;}

                        else if ( (LA14_0=='o') ) {s = 9;}

                        else if ( (LA14_0=='n') ) {s = 10;}

                        else if ( (LA14_0=='y') ) {s = 11;}

                        else if ( (LA14_0=='m') ) {s = 12;}

                        else if ( (LA14_0=='e') ) {s = 13;}

                        else if ( (LA14_0=='T') ) {s = 14;}

                        else if ( (LA14_0=='O') ) {s = 15;}

                        else if ( (LA14_0=='D') ) {s = 16;}

                        else if ( (LA14_0=='P') ) {s = 17;}

                        else if ( (LA14_0=='a') ) {s = 18;}

                        else if ( (LA14_0=='r') ) {s = 19;}

                        else if ( (LA14_0=='@') ) {s = 20;}

                        else if ( (LA14_0=='_') ) {s = 21;}

                        else if ( (LA14_0=='^') ) {s = 22;}

                        else if ( ((LA14_0>='A' && LA14_0<='B')||(LA14_0>='E' && LA14_0<='N')||(LA14_0>='R' && LA14_0<='S')||(LA14_0>='U' && LA14_0<='Z')||LA14_0=='b'||(LA14_0>='f' && LA14_0<='l')||(LA14_0>='p' && LA14_0<='q')||(LA14_0>='v' && LA14_0<='x')||LA14_0=='z') ) {s = 23;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 24;}

                        else if ( (LA14_0=='\"') ) {s = 25;}

                        else if ( (LA14_0=='\'') ) {s = 26;}

                        else if ( (LA14_0=='/') ) {s = 27;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 28;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='-')||(LA14_0>=':' && LA14_0<='?')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_25 = input.LA(1);

                        s = -1;
                        if ( ((LA14_25>='\u0000' && LA14_25<='\uFFFF')) ) {s = 62;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}