package org.xtext.ide.contentassist.antlr.internal;

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
import org.xtext.services.SynthesizerGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSynthesizerParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Rot'", "'Controls'", "'{'", "'}'", "'Sound'", "'Connections'", "'linear'", "'button'", "'('", "'x'", "'y'", "'width'", "'height'", "'frequency'", "')'", "'sawToothOscillator'", "'min'", "'max'", "'default'", "'sineOscillator'", "'amplitude'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
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
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSynthesizerParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSynthesizerParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSynthesizerParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSynthesizer.g"; }


    	private SynthesizerGrammarAccess grammarAccess;

    	public void setGrammarAccess(SynthesizerGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalSynthesizer.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalSynthesizer.g:54:1: ( ruleModel EOF )
            // InternalSynthesizer.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSynthesizer.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalSynthesizer.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalSynthesizer.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalSynthesizer.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalSynthesizer.g:69:3: ( rule__Model__Group__0 )
            // InternalSynthesizer.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleControlElement"
    // InternalSynthesizer.g:78:1: entryRuleControlElement : ruleControlElement EOF ;
    public final void entryRuleControlElement() throws RecognitionException {
        try {
            // InternalSynthesizer.g:79:1: ( ruleControlElement EOF )
            // InternalSynthesizer.g:80:1: ruleControlElement EOF
            {
             before(grammarAccess.getControlElementRule()); 
            pushFollow(FOLLOW_1);
            ruleControlElement();

            state._fsp--;

             after(grammarAccess.getControlElementRule()); 
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
    // $ANTLR end "entryRuleControlElement"


    // $ANTLR start "ruleControlElement"
    // InternalSynthesizer.g:87:1: ruleControlElement : ( ( rule__ControlElement__Alternatives ) ) ;
    public final void ruleControlElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:91:2: ( ( ( rule__ControlElement__Alternatives ) ) )
            // InternalSynthesizer.g:92:2: ( ( rule__ControlElement__Alternatives ) )
            {
            // InternalSynthesizer.g:92:2: ( ( rule__ControlElement__Alternatives ) )
            // InternalSynthesizer.g:93:3: ( rule__ControlElement__Alternatives )
            {
             before(grammarAccess.getControlElementAccess().getAlternatives()); 
            // InternalSynthesizer.g:94:3: ( rule__ControlElement__Alternatives )
            // InternalSynthesizer.g:94:4: rule__ControlElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ControlElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getControlElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleControlElement"


    // $ANTLR start "entryRuleSoundElement"
    // InternalSynthesizer.g:103:1: entryRuleSoundElement : ruleSoundElement EOF ;
    public final void entryRuleSoundElement() throws RecognitionException {
        try {
            // InternalSynthesizer.g:104:1: ( ruleSoundElement EOF )
            // InternalSynthesizer.g:105:1: ruleSoundElement EOF
            {
             before(grammarAccess.getSoundElementRule()); 
            pushFollow(FOLLOW_1);
            ruleSoundElement();

            state._fsp--;

             after(grammarAccess.getSoundElementRule()); 
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
    // $ANTLR end "entryRuleSoundElement"


    // $ANTLR start "ruleSoundElement"
    // InternalSynthesizer.g:112:1: ruleSoundElement : ( ( rule__SoundElement__Alternatives ) ) ;
    public final void ruleSoundElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:116:2: ( ( ( rule__SoundElement__Alternatives ) ) )
            // InternalSynthesizer.g:117:2: ( ( rule__SoundElement__Alternatives ) )
            {
            // InternalSynthesizer.g:117:2: ( ( rule__SoundElement__Alternatives ) )
            // InternalSynthesizer.g:118:3: ( rule__SoundElement__Alternatives )
            {
             before(grammarAccess.getSoundElementAccess().getAlternatives()); 
            // InternalSynthesizer.g:119:3: ( rule__SoundElement__Alternatives )
            // InternalSynthesizer.g:119:4: rule__SoundElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SoundElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSoundElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSoundElement"


    // $ANTLR start "entryRuleConnectionElement"
    // InternalSynthesizer.g:128:1: entryRuleConnectionElement : ruleConnectionElement EOF ;
    public final void entryRuleConnectionElement() throws RecognitionException {
        try {
            // InternalSynthesizer.g:129:1: ( ruleConnectionElement EOF )
            // InternalSynthesizer.g:130:1: ruleConnectionElement EOF
            {
             before(grammarAccess.getConnectionElementRule()); 
            pushFollow(FOLLOW_1);
            ruleConnectionElement();

            state._fsp--;

             after(grammarAccess.getConnectionElementRule()); 
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
    // $ANTLR end "entryRuleConnectionElement"


    // $ANTLR start "ruleConnectionElement"
    // InternalSynthesizer.g:137:1: ruleConnectionElement : ( ( rule__ConnectionElement__Group__0 ) ) ;
    public final void ruleConnectionElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:141:2: ( ( ( rule__ConnectionElement__Group__0 ) ) )
            // InternalSynthesizer.g:142:2: ( ( rule__ConnectionElement__Group__0 ) )
            {
            // InternalSynthesizer.g:142:2: ( ( rule__ConnectionElement__Group__0 ) )
            // InternalSynthesizer.g:143:3: ( rule__ConnectionElement__Group__0 )
            {
             before(grammarAccess.getConnectionElementAccess().getGroup()); 
            // InternalSynthesizer.g:144:3: ( rule__ConnectionElement__Group__0 )
            // InternalSynthesizer.g:144:4: rule__ConnectionElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConnectionElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConnectionElementAccess().getGroup()); 

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
    // $ANTLR end "ruleConnectionElement"


    // $ANTLR start "entryRuleRotaryKnob"
    // InternalSynthesizer.g:153:1: entryRuleRotaryKnob : ruleRotaryKnob EOF ;
    public final void entryRuleRotaryKnob() throws RecognitionException {
        try {
            // InternalSynthesizer.g:154:1: ( ruleRotaryKnob EOF )
            // InternalSynthesizer.g:155:1: ruleRotaryKnob EOF
            {
             before(grammarAccess.getRotaryKnobRule()); 
            pushFollow(FOLLOW_1);
            ruleRotaryKnob();

            state._fsp--;

             after(grammarAccess.getRotaryKnobRule()); 
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
    // $ANTLR end "entryRuleRotaryKnob"


    // $ANTLR start "ruleRotaryKnob"
    // InternalSynthesizer.g:162:1: ruleRotaryKnob : ( 'Rot' ) ;
    public final void ruleRotaryKnob() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:166:2: ( ( 'Rot' ) )
            // InternalSynthesizer.g:167:2: ( 'Rot' )
            {
            // InternalSynthesizer.g:167:2: ( 'Rot' )
            // InternalSynthesizer.g:168:3: 'Rot'
            {
             before(grammarAccess.getRotaryKnobAccess().getRotKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getRotaryKnobAccess().getRotKeyword()); 

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
    // $ANTLR end "ruleRotaryKnob"


    // $ANTLR start "entryRuleButton"
    // InternalSynthesizer.g:178:1: entryRuleButton : ruleButton EOF ;
    public final void entryRuleButton() throws RecognitionException {
        try {
            // InternalSynthesizer.g:179:1: ( ruleButton EOF )
            // InternalSynthesizer.g:180:1: ruleButton EOF
            {
             before(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_1);
            ruleButton();

            state._fsp--;

             after(grammarAccess.getButtonRule()); 
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
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // InternalSynthesizer.g:187:1: ruleButton : ( ( rule__Button__Group__0 ) ) ;
    public final void ruleButton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:191:2: ( ( ( rule__Button__Group__0 ) ) )
            // InternalSynthesizer.g:192:2: ( ( rule__Button__Group__0 ) )
            {
            // InternalSynthesizer.g:192:2: ( ( rule__Button__Group__0 ) )
            // InternalSynthesizer.g:193:3: ( rule__Button__Group__0 )
            {
             before(grammarAccess.getButtonAccess().getGroup()); 
            // InternalSynthesizer.g:194:3: ( rule__Button__Group__0 )
            // InternalSynthesizer.g:194:4: rule__Button__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Button__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getGroup()); 

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
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleSawToothOscillator"
    // InternalSynthesizer.g:203:1: entryRuleSawToothOscillator : ruleSawToothOscillator EOF ;
    public final void entryRuleSawToothOscillator() throws RecognitionException {
        try {
            // InternalSynthesizer.g:204:1: ( ruleSawToothOscillator EOF )
            // InternalSynthesizer.g:205:1: ruleSawToothOscillator EOF
            {
             before(grammarAccess.getSawToothOscillatorRule()); 
            pushFollow(FOLLOW_1);
            ruleSawToothOscillator();

            state._fsp--;

             after(grammarAccess.getSawToothOscillatorRule()); 
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
    // $ANTLR end "entryRuleSawToothOscillator"


    // $ANTLR start "ruleSawToothOscillator"
    // InternalSynthesizer.g:212:1: ruleSawToothOscillator : ( ( rule__SawToothOscillator__Group__0 ) ) ;
    public final void ruleSawToothOscillator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:216:2: ( ( ( rule__SawToothOscillator__Group__0 ) ) )
            // InternalSynthesizer.g:217:2: ( ( rule__SawToothOscillator__Group__0 ) )
            {
            // InternalSynthesizer.g:217:2: ( ( rule__SawToothOscillator__Group__0 ) )
            // InternalSynthesizer.g:218:3: ( rule__SawToothOscillator__Group__0 )
            {
             before(grammarAccess.getSawToothOscillatorAccess().getGroup()); 
            // InternalSynthesizer.g:219:3: ( rule__SawToothOscillator__Group__0 )
            // InternalSynthesizer.g:219:4: rule__SawToothOscillator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SawToothOscillator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSawToothOscillatorAccess().getGroup()); 

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
    // $ANTLR end "ruleSawToothOscillator"


    // $ANTLR start "entryRuleSineOscillator"
    // InternalSynthesizer.g:228:1: entryRuleSineOscillator : ruleSineOscillator EOF ;
    public final void entryRuleSineOscillator() throws RecognitionException {
        try {
            // InternalSynthesizer.g:229:1: ( ruleSineOscillator EOF )
            // InternalSynthesizer.g:230:1: ruleSineOscillator EOF
            {
             before(grammarAccess.getSineOscillatorRule()); 
            pushFollow(FOLLOW_1);
            ruleSineOscillator();

            state._fsp--;

             after(grammarAccess.getSineOscillatorRule()); 
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
    // $ANTLR end "entryRuleSineOscillator"


    // $ANTLR start "ruleSineOscillator"
    // InternalSynthesizer.g:237:1: ruleSineOscillator : ( ( rule__SineOscillator__Group__0 ) ) ;
    public final void ruleSineOscillator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:241:2: ( ( ( rule__SineOscillator__Group__0 ) ) )
            // InternalSynthesizer.g:242:2: ( ( rule__SineOscillator__Group__0 ) )
            {
            // InternalSynthesizer.g:242:2: ( ( rule__SineOscillator__Group__0 ) )
            // InternalSynthesizer.g:243:3: ( rule__SineOscillator__Group__0 )
            {
             before(grammarAccess.getSineOscillatorAccess().getGroup()); 
            // InternalSynthesizer.g:244:3: ( rule__SineOscillator__Group__0 )
            // InternalSynthesizer.g:244:4: rule__SineOscillator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SineOscillator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSineOscillatorAccess().getGroup()); 

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
    // $ANTLR end "ruleSineOscillator"


    // $ANTLR start "rule__ControlElement__Alternatives"
    // InternalSynthesizer.g:252:1: rule__ControlElement__Alternatives : ( ( ruleButton ) | ( ruleRotaryKnob ) );
    public final void rule__ControlElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:256:1: ( ( ruleButton ) | ( ruleRotaryKnob ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==18) ) {
                alt1=1;
            }
            else if ( (LA1_0==11) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSynthesizer.g:257:2: ( ruleButton )
                    {
                    // InternalSynthesizer.g:257:2: ( ruleButton )
                    // InternalSynthesizer.g:258:3: ruleButton
                    {
                     before(grammarAccess.getControlElementAccess().getButtonParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleButton();

                    state._fsp--;

                     after(grammarAccess.getControlElementAccess().getButtonParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSynthesizer.g:263:2: ( ruleRotaryKnob )
                    {
                    // InternalSynthesizer.g:263:2: ( ruleRotaryKnob )
                    // InternalSynthesizer.g:264:3: ruleRotaryKnob
                    {
                     before(grammarAccess.getControlElementAccess().getRotaryKnobParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRotaryKnob();

                    state._fsp--;

                     after(grammarAccess.getControlElementAccess().getRotaryKnobParserRuleCall_1()); 

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
    // $ANTLR end "rule__ControlElement__Alternatives"


    // $ANTLR start "rule__SoundElement__Alternatives"
    // InternalSynthesizer.g:273:1: rule__SoundElement__Alternatives : ( ( ruleSawToothOscillator ) | ( ruleSineOscillator ) );
    public final void rule__SoundElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:277:1: ( ( ruleSawToothOscillator ) | ( ruleSineOscillator ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==26) ) {
                alt2=1;
            }
            else if ( (LA2_0==30) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSynthesizer.g:278:2: ( ruleSawToothOscillator )
                    {
                    // InternalSynthesizer.g:278:2: ( ruleSawToothOscillator )
                    // InternalSynthesizer.g:279:3: ruleSawToothOscillator
                    {
                     before(grammarAccess.getSoundElementAccess().getSawToothOscillatorParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSawToothOscillator();

                    state._fsp--;

                     after(grammarAccess.getSoundElementAccess().getSawToothOscillatorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSynthesizer.g:284:2: ( ruleSineOscillator )
                    {
                    // InternalSynthesizer.g:284:2: ( ruleSineOscillator )
                    // InternalSynthesizer.g:285:3: ruleSineOscillator
                    {
                     before(grammarAccess.getSoundElementAccess().getSineOscillatorParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSineOscillator();

                    state._fsp--;

                     after(grammarAccess.getSoundElementAccess().getSineOscillatorParserRuleCall_1()); 

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
    // $ANTLR end "rule__SoundElement__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalSynthesizer.g:294:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:298:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalSynthesizer.g:299:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalSynthesizer.g:306:1: rule__Model__Group__0__Impl : ( 'Controls' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:310:1: ( ( 'Controls' ) )
            // InternalSynthesizer.g:311:1: ( 'Controls' )
            {
            // InternalSynthesizer.g:311:1: ( 'Controls' )
            // InternalSynthesizer.g:312:2: 'Controls'
            {
             before(grammarAccess.getModelAccess().getControlsKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getControlsKeyword_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalSynthesizer.g:321:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:325:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalSynthesizer.g:326:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalSynthesizer.g:333:1: rule__Model__Group__1__Impl : ( '{' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:337:1: ( ( '{' ) )
            // InternalSynthesizer.g:338:1: ( '{' )
            {
            // InternalSynthesizer.g:338:1: ( '{' )
            // InternalSynthesizer.g:339:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalSynthesizer.g:348:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:352:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalSynthesizer.g:353:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalSynthesizer.g:360:1: rule__Model__Group__2__Impl : ( ( rule__Model__ControlsAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:364:1: ( ( ( rule__Model__ControlsAssignment_2 )* ) )
            // InternalSynthesizer.g:365:1: ( ( rule__Model__ControlsAssignment_2 )* )
            {
            // InternalSynthesizer.g:365:1: ( ( rule__Model__ControlsAssignment_2 )* )
            // InternalSynthesizer.g:366:2: ( rule__Model__ControlsAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getControlsAssignment_2()); 
            // InternalSynthesizer.g:367:2: ( rule__Model__ControlsAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11||LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSynthesizer.g:367:3: rule__Model__ControlsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__ControlsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getControlsAssignment_2()); 

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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalSynthesizer.g:375:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:379:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalSynthesizer.g:380:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

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
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalSynthesizer.g:387:1: rule__Model__Group__3__Impl : ( '}' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:391:1: ( ( '}' ) )
            // InternalSynthesizer.g:392:1: ( '}' )
            {
            // InternalSynthesizer.g:392:1: ( '}' )
            // InternalSynthesizer.g:393:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalSynthesizer.g:402:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:406:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalSynthesizer.g:407:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__5();

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
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalSynthesizer.g:414:1: rule__Model__Group__4__Impl : ( ( rule__Model__Group_4__0 )? ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:418:1: ( ( ( rule__Model__Group_4__0 )? ) )
            // InternalSynthesizer.g:419:1: ( ( rule__Model__Group_4__0 )? )
            {
            // InternalSynthesizer.g:419:1: ( ( rule__Model__Group_4__0 )? )
            // InternalSynthesizer.g:420:2: ( rule__Model__Group_4__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_4()); 
            // InternalSynthesizer.g:421:2: ( rule__Model__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSynthesizer.g:421:3: rule__Model__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // InternalSynthesizer.g:429:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:433:1: ( rule__Model__Group__5__Impl )
            // InternalSynthesizer.g:434:2: rule__Model__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__5__Impl();

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
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // InternalSynthesizer.g:440:1: rule__Model__Group__5__Impl : ( ( rule__Model__Group_5__0 )? ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:444:1: ( ( ( rule__Model__Group_5__0 )? ) )
            // InternalSynthesizer.g:445:1: ( ( rule__Model__Group_5__0 )? )
            {
            // InternalSynthesizer.g:445:1: ( ( rule__Model__Group_5__0 )? )
            // InternalSynthesizer.g:446:2: ( rule__Model__Group_5__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_5()); 
            // InternalSynthesizer.g:447:2: ( rule__Model__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSynthesizer.g:447:3: rule__Model__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group_4__0"
    // InternalSynthesizer.g:456:1: rule__Model__Group_4__0 : rule__Model__Group_4__0__Impl rule__Model__Group_4__1 ;
    public final void rule__Model__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:460:1: ( rule__Model__Group_4__0__Impl rule__Model__Group_4__1 )
            // InternalSynthesizer.g:461:2: rule__Model__Group_4__0__Impl rule__Model__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_4__1();

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
    // $ANTLR end "rule__Model__Group_4__0"


    // $ANTLR start "rule__Model__Group_4__0__Impl"
    // InternalSynthesizer.g:468:1: rule__Model__Group_4__0__Impl : ( 'Sound' ) ;
    public final void rule__Model__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:472:1: ( ( 'Sound' ) )
            // InternalSynthesizer.g:473:1: ( 'Sound' )
            {
            // InternalSynthesizer.g:473:1: ( 'Sound' )
            // InternalSynthesizer.g:474:2: 'Sound'
            {
             before(grammarAccess.getModelAccess().getSoundKeyword_4_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getSoundKeyword_4_0()); 

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
    // $ANTLR end "rule__Model__Group_4__0__Impl"


    // $ANTLR start "rule__Model__Group_4__1"
    // InternalSynthesizer.g:483:1: rule__Model__Group_4__1 : rule__Model__Group_4__1__Impl rule__Model__Group_4__2 ;
    public final void rule__Model__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:487:1: ( rule__Model__Group_4__1__Impl rule__Model__Group_4__2 )
            // InternalSynthesizer.g:488:2: rule__Model__Group_4__1__Impl rule__Model__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__Model__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_4__2();

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
    // $ANTLR end "rule__Model__Group_4__1"


    // $ANTLR start "rule__Model__Group_4__1__Impl"
    // InternalSynthesizer.g:495:1: rule__Model__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Model__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:499:1: ( ( '{' ) )
            // InternalSynthesizer.g:500:1: ( '{' )
            {
            // InternalSynthesizer.g:500:1: ( '{' )
            // InternalSynthesizer.g:501:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__Model__Group_4__1__Impl"


    // $ANTLR start "rule__Model__Group_4__2"
    // InternalSynthesizer.g:510:1: rule__Model__Group_4__2 : rule__Model__Group_4__2__Impl rule__Model__Group_4__3 ;
    public final void rule__Model__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:514:1: ( rule__Model__Group_4__2__Impl rule__Model__Group_4__3 )
            // InternalSynthesizer.g:515:2: rule__Model__Group_4__2__Impl rule__Model__Group_4__3
            {
            pushFollow(FOLLOW_7);
            rule__Model__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_4__3();

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
    // $ANTLR end "rule__Model__Group_4__2"


    // $ANTLR start "rule__Model__Group_4__2__Impl"
    // InternalSynthesizer.g:522:1: rule__Model__Group_4__2__Impl : ( ( rule__Model__SoundsAssignment_4_2 )* ) ;
    public final void rule__Model__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:526:1: ( ( ( rule__Model__SoundsAssignment_4_2 )* ) )
            // InternalSynthesizer.g:527:1: ( ( rule__Model__SoundsAssignment_4_2 )* )
            {
            // InternalSynthesizer.g:527:1: ( ( rule__Model__SoundsAssignment_4_2 )* )
            // InternalSynthesizer.g:528:2: ( rule__Model__SoundsAssignment_4_2 )*
            {
             before(grammarAccess.getModelAccess().getSoundsAssignment_4_2()); 
            // InternalSynthesizer.g:529:2: ( rule__Model__SoundsAssignment_4_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==26||LA6_0==30) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSynthesizer.g:529:3: rule__Model__SoundsAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Model__SoundsAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getSoundsAssignment_4_2()); 

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
    // $ANTLR end "rule__Model__Group_4__2__Impl"


    // $ANTLR start "rule__Model__Group_4__3"
    // InternalSynthesizer.g:537:1: rule__Model__Group_4__3 : rule__Model__Group_4__3__Impl ;
    public final void rule__Model__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:541:1: ( rule__Model__Group_4__3__Impl )
            // InternalSynthesizer.g:542:2: rule__Model__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_4__3__Impl();

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
    // $ANTLR end "rule__Model__Group_4__3"


    // $ANTLR start "rule__Model__Group_4__3__Impl"
    // InternalSynthesizer.g:548:1: rule__Model__Group_4__3__Impl : ( '}' ) ;
    public final void rule__Model__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:552:1: ( ( '}' ) )
            // InternalSynthesizer.g:553:1: ( '}' )
            {
            // InternalSynthesizer.g:553:1: ( '}' )
            // InternalSynthesizer.g:554:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4_3()); 

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
    // $ANTLR end "rule__Model__Group_4__3__Impl"


    // $ANTLR start "rule__Model__Group_5__0"
    // InternalSynthesizer.g:564:1: rule__Model__Group_5__0 : rule__Model__Group_5__0__Impl rule__Model__Group_5__1 ;
    public final void rule__Model__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:568:1: ( rule__Model__Group_5__0__Impl rule__Model__Group_5__1 )
            // InternalSynthesizer.g:569:2: rule__Model__Group_5__0__Impl rule__Model__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_5__1();

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
    // $ANTLR end "rule__Model__Group_5__0"


    // $ANTLR start "rule__Model__Group_5__0__Impl"
    // InternalSynthesizer.g:576:1: rule__Model__Group_5__0__Impl : ( 'Connections' ) ;
    public final void rule__Model__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:580:1: ( ( 'Connections' ) )
            // InternalSynthesizer.g:581:1: ( 'Connections' )
            {
            // InternalSynthesizer.g:581:1: ( 'Connections' )
            // InternalSynthesizer.g:582:2: 'Connections'
            {
             before(grammarAccess.getModelAccess().getConnectionsKeyword_5_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getConnectionsKeyword_5_0()); 

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
    // $ANTLR end "rule__Model__Group_5__0__Impl"


    // $ANTLR start "rule__Model__Group_5__1"
    // InternalSynthesizer.g:591:1: rule__Model__Group_5__1 : rule__Model__Group_5__1__Impl rule__Model__Group_5__2 ;
    public final void rule__Model__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:595:1: ( rule__Model__Group_5__1__Impl rule__Model__Group_5__2 )
            // InternalSynthesizer.g:596:2: rule__Model__Group_5__1__Impl rule__Model__Group_5__2
            {
            pushFollow(FOLLOW_9);
            rule__Model__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_5__2();

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
    // $ANTLR end "rule__Model__Group_5__1"


    // $ANTLR start "rule__Model__Group_5__1__Impl"
    // InternalSynthesizer.g:603:1: rule__Model__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Model__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:607:1: ( ( '{' ) )
            // InternalSynthesizer.g:608:1: ( '{' )
            {
            // InternalSynthesizer.g:608:1: ( '{' )
            // InternalSynthesizer.g:609:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_5_1()); 

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
    // $ANTLR end "rule__Model__Group_5__1__Impl"


    // $ANTLR start "rule__Model__Group_5__2"
    // InternalSynthesizer.g:618:1: rule__Model__Group_5__2 : rule__Model__Group_5__2__Impl rule__Model__Group_5__3 ;
    public final void rule__Model__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:622:1: ( rule__Model__Group_5__2__Impl rule__Model__Group_5__3 )
            // InternalSynthesizer.g:623:2: rule__Model__Group_5__2__Impl rule__Model__Group_5__3
            {
            pushFollow(FOLLOW_9);
            rule__Model__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_5__3();

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
    // $ANTLR end "rule__Model__Group_5__2"


    // $ANTLR start "rule__Model__Group_5__2__Impl"
    // InternalSynthesizer.g:630:1: rule__Model__Group_5__2__Impl : ( ( rule__Model__ConnectionsAssignment_5_2 )* ) ;
    public final void rule__Model__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:634:1: ( ( ( rule__Model__ConnectionsAssignment_5_2 )* ) )
            // InternalSynthesizer.g:635:1: ( ( rule__Model__ConnectionsAssignment_5_2 )* )
            {
            // InternalSynthesizer.g:635:1: ( ( rule__Model__ConnectionsAssignment_5_2 )* )
            // InternalSynthesizer.g:636:2: ( rule__Model__ConnectionsAssignment_5_2 )*
            {
             before(grammarAccess.getModelAccess().getConnectionsAssignment_5_2()); 
            // InternalSynthesizer.g:637:2: ( rule__Model__ConnectionsAssignment_5_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSynthesizer.g:637:3: rule__Model__ConnectionsAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Model__ConnectionsAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getConnectionsAssignment_5_2()); 

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
    // $ANTLR end "rule__Model__Group_5__2__Impl"


    // $ANTLR start "rule__Model__Group_5__3"
    // InternalSynthesizer.g:645:1: rule__Model__Group_5__3 : rule__Model__Group_5__3__Impl ;
    public final void rule__Model__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:649:1: ( rule__Model__Group_5__3__Impl )
            // InternalSynthesizer.g:650:2: rule__Model__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_5__3__Impl();

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
    // $ANTLR end "rule__Model__Group_5__3"


    // $ANTLR start "rule__Model__Group_5__3__Impl"
    // InternalSynthesizer.g:656:1: rule__Model__Group_5__3__Impl : ( '}' ) ;
    public final void rule__Model__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:660:1: ( ( '}' ) )
            // InternalSynthesizer.g:661:1: ( '}' )
            {
            // InternalSynthesizer.g:661:1: ( '}' )
            // InternalSynthesizer.g:662:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5_3()); 

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
    // $ANTLR end "rule__Model__Group_5__3__Impl"


    // $ANTLR start "rule__ConnectionElement__Group__0"
    // InternalSynthesizer.g:672:1: rule__ConnectionElement__Group__0 : rule__ConnectionElement__Group__0__Impl rule__ConnectionElement__Group__1 ;
    public final void rule__ConnectionElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:676:1: ( rule__ConnectionElement__Group__0__Impl rule__ConnectionElement__Group__1 )
            // InternalSynthesizer.g:677:2: rule__ConnectionElement__Group__0__Impl rule__ConnectionElement__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__ConnectionElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectionElement__Group__1();

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
    // $ANTLR end "rule__ConnectionElement__Group__0"


    // $ANTLR start "rule__ConnectionElement__Group__0__Impl"
    // InternalSynthesizer.g:684:1: rule__ConnectionElement__Group__0__Impl : ( 'linear' ) ;
    public final void rule__ConnectionElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:688:1: ( ( 'linear' ) )
            // InternalSynthesizer.g:689:1: ( 'linear' )
            {
            // InternalSynthesizer.g:689:1: ( 'linear' )
            // InternalSynthesizer.g:690:2: 'linear'
            {
             before(grammarAccess.getConnectionElementAccess().getLinearKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getConnectionElementAccess().getLinearKeyword_0()); 

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
    // $ANTLR end "rule__ConnectionElement__Group__0__Impl"


    // $ANTLR start "rule__ConnectionElement__Group__1"
    // InternalSynthesizer.g:699:1: rule__ConnectionElement__Group__1 : rule__ConnectionElement__Group__1__Impl rule__ConnectionElement__Group__2 ;
    public final void rule__ConnectionElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:703:1: ( rule__ConnectionElement__Group__1__Impl rule__ConnectionElement__Group__2 )
            // InternalSynthesizer.g:704:2: rule__ConnectionElement__Group__1__Impl rule__ConnectionElement__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__ConnectionElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectionElement__Group__2();

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
    // $ANTLR end "rule__ConnectionElement__Group__1"


    // $ANTLR start "rule__ConnectionElement__Group__1__Impl"
    // InternalSynthesizer.g:711:1: rule__ConnectionElement__Group__1__Impl : ( ( rule__ConnectionElement__CeAssignment_1 ) ) ;
    public final void rule__ConnectionElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:715:1: ( ( ( rule__ConnectionElement__CeAssignment_1 ) ) )
            // InternalSynthesizer.g:716:1: ( ( rule__ConnectionElement__CeAssignment_1 ) )
            {
            // InternalSynthesizer.g:716:1: ( ( rule__ConnectionElement__CeAssignment_1 ) )
            // InternalSynthesizer.g:717:2: ( rule__ConnectionElement__CeAssignment_1 )
            {
             before(grammarAccess.getConnectionElementAccess().getCeAssignment_1()); 
            // InternalSynthesizer.g:718:2: ( rule__ConnectionElement__CeAssignment_1 )
            // InternalSynthesizer.g:718:3: rule__ConnectionElement__CeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ConnectionElement__CeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectionElementAccess().getCeAssignment_1()); 

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
    // $ANTLR end "rule__ConnectionElement__Group__1__Impl"


    // $ANTLR start "rule__ConnectionElement__Group__2"
    // InternalSynthesizer.g:726:1: rule__ConnectionElement__Group__2 : rule__ConnectionElement__Group__2__Impl ;
    public final void rule__ConnectionElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:730:1: ( rule__ConnectionElement__Group__2__Impl )
            // InternalSynthesizer.g:731:2: rule__ConnectionElement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConnectionElement__Group__2__Impl();

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
    // $ANTLR end "rule__ConnectionElement__Group__2"


    // $ANTLR start "rule__ConnectionElement__Group__2__Impl"
    // InternalSynthesizer.g:737:1: rule__ConnectionElement__Group__2__Impl : ( ( rule__ConnectionElement__SeAssignment_2 ) ) ;
    public final void rule__ConnectionElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:741:1: ( ( ( rule__ConnectionElement__SeAssignment_2 ) ) )
            // InternalSynthesizer.g:742:1: ( ( rule__ConnectionElement__SeAssignment_2 ) )
            {
            // InternalSynthesizer.g:742:1: ( ( rule__ConnectionElement__SeAssignment_2 ) )
            // InternalSynthesizer.g:743:2: ( rule__ConnectionElement__SeAssignment_2 )
            {
             before(grammarAccess.getConnectionElementAccess().getSeAssignment_2()); 
            // InternalSynthesizer.g:744:2: ( rule__ConnectionElement__SeAssignment_2 )
            // InternalSynthesizer.g:744:3: rule__ConnectionElement__SeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ConnectionElement__SeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConnectionElementAccess().getSeAssignment_2()); 

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
    // $ANTLR end "rule__ConnectionElement__Group__2__Impl"


    // $ANTLR start "rule__Button__Group__0"
    // InternalSynthesizer.g:753:1: rule__Button__Group__0 : rule__Button__Group__0__Impl rule__Button__Group__1 ;
    public final void rule__Button__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:757:1: ( rule__Button__Group__0__Impl rule__Button__Group__1 )
            // InternalSynthesizer.g:758:2: rule__Button__Group__0__Impl rule__Button__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Button__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__1();

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
    // $ANTLR end "rule__Button__Group__0"


    // $ANTLR start "rule__Button__Group__0__Impl"
    // InternalSynthesizer.g:765:1: rule__Button__Group__0__Impl : ( 'button' ) ;
    public final void rule__Button__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:769:1: ( ( 'button' ) )
            // InternalSynthesizer.g:770:1: ( 'button' )
            {
            // InternalSynthesizer.g:770:1: ( 'button' )
            // InternalSynthesizer.g:771:2: 'button'
            {
             before(grammarAccess.getButtonAccess().getButtonKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getButtonKeyword_0()); 

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
    // $ANTLR end "rule__Button__Group__0__Impl"


    // $ANTLR start "rule__Button__Group__1"
    // InternalSynthesizer.g:780:1: rule__Button__Group__1 : rule__Button__Group__1__Impl rule__Button__Group__2 ;
    public final void rule__Button__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:784:1: ( rule__Button__Group__1__Impl rule__Button__Group__2 )
            // InternalSynthesizer.g:785:2: rule__Button__Group__1__Impl rule__Button__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Button__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__2();

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
    // $ANTLR end "rule__Button__Group__1"


    // $ANTLR start "rule__Button__Group__1__Impl"
    // InternalSynthesizer.g:792:1: rule__Button__Group__1__Impl : ( ( rule__Button__NameAssignment_1 ) ) ;
    public final void rule__Button__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:796:1: ( ( ( rule__Button__NameAssignment_1 ) ) )
            // InternalSynthesizer.g:797:1: ( ( rule__Button__NameAssignment_1 ) )
            {
            // InternalSynthesizer.g:797:1: ( ( rule__Button__NameAssignment_1 ) )
            // InternalSynthesizer.g:798:2: ( rule__Button__NameAssignment_1 )
            {
             before(grammarAccess.getButtonAccess().getNameAssignment_1()); 
            // InternalSynthesizer.g:799:2: ( rule__Button__NameAssignment_1 )
            // InternalSynthesizer.g:799:3: rule__Button__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Button__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Button__Group__1__Impl"


    // $ANTLR start "rule__Button__Group__2"
    // InternalSynthesizer.g:807:1: rule__Button__Group__2 : rule__Button__Group__2__Impl rule__Button__Group__3 ;
    public final void rule__Button__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:811:1: ( rule__Button__Group__2__Impl rule__Button__Group__3 )
            // InternalSynthesizer.g:812:2: rule__Button__Group__2__Impl rule__Button__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Button__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__3();

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
    // $ANTLR end "rule__Button__Group__2"


    // $ANTLR start "rule__Button__Group__2__Impl"
    // InternalSynthesizer.g:819:1: rule__Button__Group__2__Impl : ( '(' ) ;
    public final void rule__Button__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:823:1: ( ( '(' ) )
            // InternalSynthesizer.g:824:1: ( '(' )
            {
            // InternalSynthesizer.g:824:1: ( '(' )
            // InternalSynthesizer.g:825:2: '('
            {
             before(grammarAccess.getButtonAccess().getLeftParenthesisKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Button__Group__2__Impl"


    // $ANTLR start "rule__Button__Group__3"
    // InternalSynthesizer.g:834:1: rule__Button__Group__3 : rule__Button__Group__3__Impl rule__Button__Group__4 ;
    public final void rule__Button__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:838:1: ( rule__Button__Group__3__Impl rule__Button__Group__4 )
            // InternalSynthesizer.g:839:2: rule__Button__Group__3__Impl rule__Button__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Button__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__4();

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
    // $ANTLR end "rule__Button__Group__3"


    // $ANTLR start "rule__Button__Group__3__Impl"
    // InternalSynthesizer.g:846:1: rule__Button__Group__3__Impl : ( 'x' ) ;
    public final void rule__Button__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:850:1: ( ( 'x' ) )
            // InternalSynthesizer.g:851:1: ( 'x' )
            {
            // InternalSynthesizer.g:851:1: ( 'x' )
            // InternalSynthesizer.g:852:2: 'x'
            {
             before(grammarAccess.getButtonAccess().getXKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getXKeyword_3()); 

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
    // $ANTLR end "rule__Button__Group__3__Impl"


    // $ANTLR start "rule__Button__Group__4"
    // InternalSynthesizer.g:861:1: rule__Button__Group__4 : rule__Button__Group__4__Impl rule__Button__Group__5 ;
    public final void rule__Button__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:865:1: ( rule__Button__Group__4__Impl rule__Button__Group__5 )
            // InternalSynthesizer.g:866:2: rule__Button__Group__4__Impl rule__Button__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Button__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__5();

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
    // $ANTLR end "rule__Button__Group__4"


    // $ANTLR start "rule__Button__Group__4__Impl"
    // InternalSynthesizer.g:873:1: rule__Button__Group__4__Impl : ( ( rule__Button__XAssignment_4 ) ) ;
    public final void rule__Button__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:877:1: ( ( ( rule__Button__XAssignment_4 ) ) )
            // InternalSynthesizer.g:878:1: ( ( rule__Button__XAssignment_4 ) )
            {
            // InternalSynthesizer.g:878:1: ( ( rule__Button__XAssignment_4 ) )
            // InternalSynthesizer.g:879:2: ( rule__Button__XAssignment_4 )
            {
             before(grammarAccess.getButtonAccess().getXAssignment_4()); 
            // InternalSynthesizer.g:880:2: ( rule__Button__XAssignment_4 )
            // InternalSynthesizer.g:880:3: rule__Button__XAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Button__XAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getXAssignment_4()); 

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
    // $ANTLR end "rule__Button__Group__4__Impl"


    // $ANTLR start "rule__Button__Group__5"
    // InternalSynthesizer.g:888:1: rule__Button__Group__5 : rule__Button__Group__5__Impl rule__Button__Group__6 ;
    public final void rule__Button__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:892:1: ( rule__Button__Group__5__Impl rule__Button__Group__6 )
            // InternalSynthesizer.g:893:2: rule__Button__Group__5__Impl rule__Button__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Button__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__6();

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
    // $ANTLR end "rule__Button__Group__5"


    // $ANTLR start "rule__Button__Group__5__Impl"
    // InternalSynthesizer.g:900:1: rule__Button__Group__5__Impl : ( 'y' ) ;
    public final void rule__Button__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:904:1: ( ( 'y' ) )
            // InternalSynthesizer.g:905:1: ( 'y' )
            {
            // InternalSynthesizer.g:905:1: ( 'y' )
            // InternalSynthesizer.g:906:2: 'y'
            {
             before(grammarAccess.getButtonAccess().getYKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getYKeyword_5()); 

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
    // $ANTLR end "rule__Button__Group__5__Impl"


    // $ANTLR start "rule__Button__Group__6"
    // InternalSynthesizer.g:915:1: rule__Button__Group__6 : rule__Button__Group__6__Impl rule__Button__Group__7 ;
    public final void rule__Button__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:919:1: ( rule__Button__Group__6__Impl rule__Button__Group__7 )
            // InternalSynthesizer.g:920:2: rule__Button__Group__6__Impl rule__Button__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__Button__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__7();

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
    // $ANTLR end "rule__Button__Group__6"


    // $ANTLR start "rule__Button__Group__6__Impl"
    // InternalSynthesizer.g:927:1: rule__Button__Group__6__Impl : ( ( rule__Button__YAssignment_6 ) ) ;
    public final void rule__Button__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:931:1: ( ( ( rule__Button__YAssignment_6 ) ) )
            // InternalSynthesizer.g:932:1: ( ( rule__Button__YAssignment_6 ) )
            {
            // InternalSynthesizer.g:932:1: ( ( rule__Button__YAssignment_6 ) )
            // InternalSynthesizer.g:933:2: ( rule__Button__YAssignment_6 )
            {
             before(grammarAccess.getButtonAccess().getYAssignment_6()); 
            // InternalSynthesizer.g:934:2: ( rule__Button__YAssignment_6 )
            // InternalSynthesizer.g:934:3: rule__Button__YAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Button__YAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getYAssignment_6()); 

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
    // $ANTLR end "rule__Button__Group__6__Impl"


    // $ANTLR start "rule__Button__Group__7"
    // InternalSynthesizer.g:942:1: rule__Button__Group__7 : rule__Button__Group__7__Impl rule__Button__Group__8 ;
    public final void rule__Button__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:946:1: ( rule__Button__Group__7__Impl rule__Button__Group__8 )
            // InternalSynthesizer.g:947:2: rule__Button__Group__7__Impl rule__Button__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__Button__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__8();

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
    // $ANTLR end "rule__Button__Group__7"


    // $ANTLR start "rule__Button__Group__7__Impl"
    // InternalSynthesizer.g:954:1: rule__Button__Group__7__Impl : ( 'width' ) ;
    public final void rule__Button__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:958:1: ( ( 'width' ) )
            // InternalSynthesizer.g:959:1: ( 'width' )
            {
            // InternalSynthesizer.g:959:1: ( 'width' )
            // InternalSynthesizer.g:960:2: 'width'
            {
             before(grammarAccess.getButtonAccess().getWidthKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getWidthKeyword_7()); 

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
    // $ANTLR end "rule__Button__Group__7__Impl"


    // $ANTLR start "rule__Button__Group__8"
    // InternalSynthesizer.g:969:1: rule__Button__Group__8 : rule__Button__Group__8__Impl rule__Button__Group__9 ;
    public final void rule__Button__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:973:1: ( rule__Button__Group__8__Impl rule__Button__Group__9 )
            // InternalSynthesizer.g:974:2: rule__Button__Group__8__Impl rule__Button__Group__9
            {
            pushFollow(FOLLOW_19);
            rule__Button__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__9();

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
    // $ANTLR end "rule__Button__Group__8"


    // $ANTLR start "rule__Button__Group__8__Impl"
    // InternalSynthesizer.g:981:1: rule__Button__Group__8__Impl : ( ( rule__Button__WidthAssignment_8 ) ) ;
    public final void rule__Button__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:985:1: ( ( ( rule__Button__WidthAssignment_8 ) ) )
            // InternalSynthesizer.g:986:1: ( ( rule__Button__WidthAssignment_8 ) )
            {
            // InternalSynthesizer.g:986:1: ( ( rule__Button__WidthAssignment_8 ) )
            // InternalSynthesizer.g:987:2: ( rule__Button__WidthAssignment_8 )
            {
             before(grammarAccess.getButtonAccess().getWidthAssignment_8()); 
            // InternalSynthesizer.g:988:2: ( rule__Button__WidthAssignment_8 )
            // InternalSynthesizer.g:988:3: rule__Button__WidthAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Button__WidthAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getWidthAssignment_8()); 

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
    // $ANTLR end "rule__Button__Group__8__Impl"


    // $ANTLR start "rule__Button__Group__9"
    // InternalSynthesizer.g:996:1: rule__Button__Group__9 : rule__Button__Group__9__Impl rule__Button__Group__10 ;
    public final void rule__Button__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1000:1: ( rule__Button__Group__9__Impl rule__Button__Group__10 )
            // InternalSynthesizer.g:1001:2: rule__Button__Group__9__Impl rule__Button__Group__10
            {
            pushFollow(FOLLOW_16);
            rule__Button__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__10();

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
    // $ANTLR end "rule__Button__Group__9"


    // $ANTLR start "rule__Button__Group__9__Impl"
    // InternalSynthesizer.g:1008:1: rule__Button__Group__9__Impl : ( 'height' ) ;
    public final void rule__Button__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1012:1: ( ( 'height' ) )
            // InternalSynthesizer.g:1013:1: ( 'height' )
            {
            // InternalSynthesizer.g:1013:1: ( 'height' )
            // InternalSynthesizer.g:1014:2: 'height'
            {
             before(grammarAccess.getButtonAccess().getHeightKeyword_9()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getHeightKeyword_9()); 

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
    // $ANTLR end "rule__Button__Group__9__Impl"


    // $ANTLR start "rule__Button__Group__10"
    // InternalSynthesizer.g:1023:1: rule__Button__Group__10 : rule__Button__Group__10__Impl rule__Button__Group__11 ;
    public final void rule__Button__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1027:1: ( rule__Button__Group__10__Impl rule__Button__Group__11 )
            // InternalSynthesizer.g:1028:2: rule__Button__Group__10__Impl rule__Button__Group__11
            {
            pushFollow(FOLLOW_20);
            rule__Button__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__11();

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
    // $ANTLR end "rule__Button__Group__10"


    // $ANTLR start "rule__Button__Group__10__Impl"
    // InternalSynthesizer.g:1035:1: rule__Button__Group__10__Impl : ( ( rule__Button__HeightAssignment_10 ) ) ;
    public final void rule__Button__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1039:1: ( ( ( rule__Button__HeightAssignment_10 ) ) )
            // InternalSynthesizer.g:1040:1: ( ( rule__Button__HeightAssignment_10 ) )
            {
            // InternalSynthesizer.g:1040:1: ( ( rule__Button__HeightAssignment_10 ) )
            // InternalSynthesizer.g:1041:2: ( rule__Button__HeightAssignment_10 )
            {
             before(grammarAccess.getButtonAccess().getHeightAssignment_10()); 
            // InternalSynthesizer.g:1042:2: ( rule__Button__HeightAssignment_10 )
            // InternalSynthesizer.g:1042:3: rule__Button__HeightAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Button__HeightAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getHeightAssignment_10()); 

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
    // $ANTLR end "rule__Button__Group__10__Impl"


    // $ANTLR start "rule__Button__Group__11"
    // InternalSynthesizer.g:1050:1: rule__Button__Group__11 : rule__Button__Group__11__Impl rule__Button__Group__12 ;
    public final void rule__Button__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1054:1: ( rule__Button__Group__11__Impl rule__Button__Group__12 )
            // InternalSynthesizer.g:1055:2: rule__Button__Group__11__Impl rule__Button__Group__12
            {
            pushFollow(FOLLOW_16);
            rule__Button__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__12();

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
    // $ANTLR end "rule__Button__Group__11"


    // $ANTLR start "rule__Button__Group__11__Impl"
    // InternalSynthesizer.g:1062:1: rule__Button__Group__11__Impl : ( 'frequency' ) ;
    public final void rule__Button__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1066:1: ( ( 'frequency' ) )
            // InternalSynthesizer.g:1067:1: ( 'frequency' )
            {
            // InternalSynthesizer.g:1067:1: ( 'frequency' )
            // InternalSynthesizer.g:1068:2: 'frequency'
            {
             before(grammarAccess.getButtonAccess().getFrequencyKeyword_11()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getFrequencyKeyword_11()); 

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
    // $ANTLR end "rule__Button__Group__11__Impl"


    // $ANTLR start "rule__Button__Group__12"
    // InternalSynthesizer.g:1077:1: rule__Button__Group__12 : rule__Button__Group__12__Impl rule__Button__Group__13 ;
    public final void rule__Button__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1081:1: ( rule__Button__Group__12__Impl rule__Button__Group__13 )
            // InternalSynthesizer.g:1082:2: rule__Button__Group__12__Impl rule__Button__Group__13
            {
            pushFollow(FOLLOW_21);
            rule__Button__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__13();

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
    // $ANTLR end "rule__Button__Group__12"


    // $ANTLR start "rule__Button__Group__12__Impl"
    // InternalSynthesizer.g:1089:1: rule__Button__Group__12__Impl : ( ( rule__Button__FrequencyAssignment_12 ) ) ;
    public final void rule__Button__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1093:1: ( ( ( rule__Button__FrequencyAssignment_12 ) ) )
            // InternalSynthesizer.g:1094:1: ( ( rule__Button__FrequencyAssignment_12 ) )
            {
            // InternalSynthesizer.g:1094:1: ( ( rule__Button__FrequencyAssignment_12 ) )
            // InternalSynthesizer.g:1095:2: ( rule__Button__FrequencyAssignment_12 )
            {
             before(grammarAccess.getButtonAccess().getFrequencyAssignment_12()); 
            // InternalSynthesizer.g:1096:2: ( rule__Button__FrequencyAssignment_12 )
            // InternalSynthesizer.g:1096:3: rule__Button__FrequencyAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Button__FrequencyAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getFrequencyAssignment_12()); 

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
    // $ANTLR end "rule__Button__Group__12__Impl"


    // $ANTLR start "rule__Button__Group__13"
    // InternalSynthesizer.g:1104:1: rule__Button__Group__13 : rule__Button__Group__13__Impl ;
    public final void rule__Button__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1108:1: ( rule__Button__Group__13__Impl )
            // InternalSynthesizer.g:1109:2: rule__Button__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Button__Group__13__Impl();

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
    // $ANTLR end "rule__Button__Group__13"


    // $ANTLR start "rule__Button__Group__13__Impl"
    // InternalSynthesizer.g:1115:1: rule__Button__Group__13__Impl : ( ')' ) ;
    public final void rule__Button__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1119:1: ( ( ')' ) )
            // InternalSynthesizer.g:1120:1: ( ')' )
            {
            // InternalSynthesizer.g:1120:1: ( ')' )
            // InternalSynthesizer.g:1121:2: ')'
            {
             before(grammarAccess.getButtonAccess().getRightParenthesisKeyword_13()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getRightParenthesisKeyword_13()); 

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
    // $ANTLR end "rule__Button__Group__13__Impl"


    // $ANTLR start "rule__SawToothOscillator__Group__0"
    // InternalSynthesizer.g:1131:1: rule__SawToothOscillator__Group__0 : rule__SawToothOscillator__Group__0__Impl rule__SawToothOscillator__Group__1 ;
    public final void rule__SawToothOscillator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1135:1: ( rule__SawToothOscillator__Group__0__Impl rule__SawToothOscillator__Group__1 )
            // InternalSynthesizer.g:1136:2: rule__SawToothOscillator__Group__0__Impl rule__SawToothOscillator__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__SawToothOscillator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SawToothOscillator__Group__1();

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
    // $ANTLR end "rule__SawToothOscillator__Group__0"


    // $ANTLR start "rule__SawToothOscillator__Group__0__Impl"
    // InternalSynthesizer.g:1143:1: rule__SawToothOscillator__Group__0__Impl : ( 'sawToothOscillator' ) ;
    public final void rule__SawToothOscillator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1147:1: ( ( 'sawToothOscillator' ) )
            // InternalSynthesizer.g:1148:1: ( 'sawToothOscillator' )
            {
            // InternalSynthesizer.g:1148:1: ( 'sawToothOscillator' )
            // InternalSynthesizer.g:1149:2: 'sawToothOscillator'
            {
             before(grammarAccess.getSawToothOscillatorAccess().getSawToothOscillatorKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSawToothOscillatorAccess().getSawToothOscillatorKeyword_0()); 

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
    // $ANTLR end "rule__SawToothOscillator__Group__0__Impl"


    // $ANTLR start "rule__SawToothOscillator__Group__1"
    // InternalSynthesizer.g:1158:1: rule__SawToothOscillator__Group__1 : rule__SawToothOscillator__Group__1__Impl rule__SawToothOscillator__Group__2 ;
    public final void rule__SawToothOscillator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1162:1: ( rule__SawToothOscillator__Group__1__Impl rule__SawToothOscillator__Group__2 )
            // InternalSynthesizer.g:1163:2: rule__SawToothOscillator__Group__1__Impl rule__SawToothOscillator__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__SawToothOscillator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SawToothOscillator__Group__2();

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
    // $ANTLR end "rule__SawToothOscillator__Group__1"


    // $ANTLR start "rule__SawToothOscillator__Group__1__Impl"
    // InternalSynthesizer.g:1170:1: rule__SawToothOscillator__Group__1__Impl : ( ( rule__SawToothOscillator__NameAssignment_1 ) ) ;
    public final void rule__SawToothOscillator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1174:1: ( ( ( rule__SawToothOscillator__NameAssignment_1 ) ) )
            // InternalSynthesizer.g:1175:1: ( ( rule__SawToothOscillator__NameAssignment_1 ) )
            {
            // InternalSynthesizer.g:1175:1: ( ( rule__SawToothOscillator__NameAssignment_1 ) )
            // InternalSynthesizer.g:1176:2: ( rule__SawToothOscillator__NameAssignment_1 )
            {
             before(grammarAccess.getSawToothOscillatorAccess().getNameAssignment_1()); 
            // InternalSynthesizer.g:1177:2: ( rule__SawToothOscillator__NameAssignment_1 )
            // InternalSynthesizer.g:1177:3: rule__SawToothOscillator__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SawToothOscillator__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSawToothOscillatorAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__SawToothOscillator__Group__1__Impl"


    // $ANTLR start "rule__SawToothOscillator__Group__2"
    // InternalSynthesizer.g:1185:1: rule__SawToothOscillator__Group__2 : rule__SawToothOscillator__Group__2__Impl rule__SawToothOscillator__Group__3 ;
    public final void rule__SawToothOscillator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1189:1: ( rule__SawToothOscillator__Group__2__Impl rule__SawToothOscillator__Group__3 )
            // InternalSynthesizer.g:1190:2: rule__SawToothOscillator__Group__2__Impl rule__SawToothOscillator__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__SawToothOscillator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SawToothOscillator__Group__3();

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
    // $ANTLR end "rule__SawToothOscillator__Group__2"


    // $ANTLR start "rule__SawToothOscillator__Group__2__Impl"
    // InternalSynthesizer.g:1197:1: rule__SawToothOscillator__Group__2__Impl : ( '(' ) ;
    public final void rule__SawToothOscillator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1201:1: ( ( '(' ) )
            // InternalSynthesizer.g:1202:1: ( '(' )
            {
            // InternalSynthesizer.g:1202:1: ( '(' )
            // InternalSynthesizer.g:1203:2: '('
            {
             before(grammarAccess.getSawToothOscillatorAccess().getLeftParenthesisKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSawToothOscillatorAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__SawToothOscillator__Group__2__Impl"


    // $ANTLR start "rule__SawToothOscillator__Group__3"
    // InternalSynthesizer.g:1212:1: rule__SawToothOscillator__Group__3 : rule__SawToothOscillator__Group__3__Impl rule__SawToothOscillator__Group__4 ;
    public final void rule__SawToothOscillator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1216:1: ( rule__SawToothOscillator__Group__3__Impl rule__SawToothOscillator__Group__4 )
            // InternalSynthesizer.g:1217:2: rule__SawToothOscillator__Group__3__Impl rule__SawToothOscillator__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__SawToothOscillator__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SawToothOscillator__Group__4();

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
    // $ANTLR end "rule__SawToothOscillator__Group__3"


    // $ANTLR start "rule__SawToothOscillator__Group__3__Impl"
    // InternalSynthesizer.g:1224:1: rule__SawToothOscillator__Group__3__Impl : ( 'min' ) ;
    public final void rule__SawToothOscillator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1228:1: ( ( 'min' ) )
            // InternalSynthesizer.g:1229:1: ( 'min' )
            {
            // InternalSynthesizer.g:1229:1: ( 'min' )
            // InternalSynthesizer.g:1230:2: 'min'
            {
             before(grammarAccess.getSawToothOscillatorAccess().getMinKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSawToothOscillatorAccess().getMinKeyword_3()); 

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
    // $ANTLR end "rule__SawToothOscillator__Group__3__Impl"


    // $ANTLR start "rule__SawToothOscillator__Group__4"
    // InternalSynthesizer.g:1239:1: rule__SawToothOscillator__Group__4 : rule__SawToothOscillator__Group__4__Impl rule__SawToothOscillator__Group__5 ;
    public final void rule__SawToothOscillator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1243:1: ( rule__SawToothOscillator__Group__4__Impl rule__SawToothOscillator__Group__5 )
            // InternalSynthesizer.g:1244:2: rule__SawToothOscillator__Group__4__Impl rule__SawToothOscillator__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__SawToothOscillator__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SawToothOscillator__Group__5();

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
    // $ANTLR end "rule__SawToothOscillator__Group__4"


    // $ANTLR start "rule__SawToothOscillator__Group__4__Impl"
    // InternalSynthesizer.g:1251:1: rule__SawToothOscillator__Group__4__Impl : ( ( rule__SawToothOscillator__MinAssignment_4 ) ) ;
    public final void rule__SawToothOscillator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1255:1: ( ( ( rule__SawToothOscillator__MinAssignment_4 ) ) )
            // InternalSynthesizer.g:1256:1: ( ( rule__SawToothOscillator__MinAssignment_4 ) )
            {
            // InternalSynthesizer.g:1256:1: ( ( rule__SawToothOscillator__MinAssignment_4 ) )
            // InternalSynthesizer.g:1257:2: ( rule__SawToothOscillator__MinAssignment_4 )
            {
             before(grammarAccess.getSawToothOscillatorAccess().getMinAssignment_4()); 
            // InternalSynthesizer.g:1258:2: ( rule__SawToothOscillator__MinAssignment_4 )
            // InternalSynthesizer.g:1258:3: rule__SawToothOscillator__MinAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SawToothOscillator__MinAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSawToothOscillatorAccess().getMinAssignment_4()); 

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
    // $ANTLR end "rule__SawToothOscillator__Group__4__Impl"


    // $ANTLR start "rule__SawToothOscillator__Group__5"
    // InternalSynthesizer.g:1266:1: rule__SawToothOscillator__Group__5 : rule__SawToothOscillator__Group__5__Impl rule__SawToothOscillator__Group__6 ;
    public final void rule__SawToothOscillator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1270:1: ( rule__SawToothOscillator__Group__5__Impl rule__SawToothOscillator__Group__6 )
            // InternalSynthesizer.g:1271:2: rule__SawToothOscillator__Group__5__Impl rule__SawToothOscillator__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__SawToothOscillator__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SawToothOscillator__Group__6();

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
    // $ANTLR end "rule__SawToothOscillator__Group__5"


    // $ANTLR start "rule__SawToothOscillator__Group__5__Impl"
    // InternalSynthesizer.g:1278:1: rule__SawToothOscillator__Group__5__Impl : ( 'max' ) ;
    public final void rule__SawToothOscillator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1282:1: ( ( 'max' ) )
            // InternalSynthesizer.g:1283:1: ( 'max' )
            {
            // InternalSynthesizer.g:1283:1: ( 'max' )
            // InternalSynthesizer.g:1284:2: 'max'
            {
             before(grammarAccess.getSawToothOscillatorAccess().getMaxKeyword_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSawToothOscillatorAccess().getMaxKeyword_5()); 

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
    // $ANTLR end "rule__SawToothOscillator__Group__5__Impl"


    // $ANTLR start "rule__SawToothOscillator__Group__6"
    // InternalSynthesizer.g:1293:1: rule__SawToothOscillator__Group__6 : rule__SawToothOscillator__Group__6__Impl rule__SawToothOscillator__Group__7 ;
    public final void rule__SawToothOscillator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1297:1: ( rule__SawToothOscillator__Group__6__Impl rule__SawToothOscillator__Group__7 )
            // InternalSynthesizer.g:1298:2: rule__SawToothOscillator__Group__6__Impl rule__SawToothOscillator__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__SawToothOscillator__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SawToothOscillator__Group__7();

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
    // $ANTLR end "rule__SawToothOscillator__Group__6"


    // $ANTLR start "rule__SawToothOscillator__Group__6__Impl"
    // InternalSynthesizer.g:1305:1: rule__SawToothOscillator__Group__6__Impl : ( ( rule__SawToothOscillator__MaxAssignment_6 ) ) ;
    public final void rule__SawToothOscillator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1309:1: ( ( ( rule__SawToothOscillator__MaxAssignment_6 ) ) )
            // InternalSynthesizer.g:1310:1: ( ( rule__SawToothOscillator__MaxAssignment_6 ) )
            {
            // InternalSynthesizer.g:1310:1: ( ( rule__SawToothOscillator__MaxAssignment_6 ) )
            // InternalSynthesizer.g:1311:2: ( rule__SawToothOscillator__MaxAssignment_6 )
            {
             before(grammarAccess.getSawToothOscillatorAccess().getMaxAssignment_6()); 
            // InternalSynthesizer.g:1312:2: ( rule__SawToothOscillator__MaxAssignment_6 )
            // InternalSynthesizer.g:1312:3: rule__SawToothOscillator__MaxAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__SawToothOscillator__MaxAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSawToothOscillatorAccess().getMaxAssignment_6()); 

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
    // $ANTLR end "rule__SawToothOscillator__Group__6__Impl"


    // $ANTLR start "rule__SawToothOscillator__Group__7"
    // InternalSynthesizer.g:1320:1: rule__SawToothOscillator__Group__7 : rule__SawToothOscillator__Group__7__Impl rule__SawToothOscillator__Group__8 ;
    public final void rule__SawToothOscillator__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1324:1: ( rule__SawToothOscillator__Group__7__Impl rule__SawToothOscillator__Group__8 )
            // InternalSynthesizer.g:1325:2: rule__SawToothOscillator__Group__7__Impl rule__SawToothOscillator__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__SawToothOscillator__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SawToothOscillator__Group__8();

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
    // $ANTLR end "rule__SawToothOscillator__Group__7"


    // $ANTLR start "rule__SawToothOscillator__Group__7__Impl"
    // InternalSynthesizer.g:1332:1: rule__SawToothOscillator__Group__7__Impl : ( 'default' ) ;
    public final void rule__SawToothOscillator__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1336:1: ( ( 'default' ) )
            // InternalSynthesizer.g:1337:1: ( 'default' )
            {
            // InternalSynthesizer.g:1337:1: ( 'default' )
            // InternalSynthesizer.g:1338:2: 'default'
            {
             before(grammarAccess.getSawToothOscillatorAccess().getDefaultKeyword_7()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSawToothOscillatorAccess().getDefaultKeyword_7()); 

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
    // $ANTLR end "rule__SawToothOscillator__Group__7__Impl"


    // $ANTLR start "rule__SawToothOscillator__Group__8"
    // InternalSynthesizer.g:1347:1: rule__SawToothOscillator__Group__8 : rule__SawToothOscillator__Group__8__Impl rule__SawToothOscillator__Group__9 ;
    public final void rule__SawToothOscillator__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1351:1: ( rule__SawToothOscillator__Group__8__Impl rule__SawToothOscillator__Group__9 )
            // InternalSynthesizer.g:1352:2: rule__SawToothOscillator__Group__8__Impl rule__SawToothOscillator__Group__9
            {
            pushFollow(FOLLOW_21);
            rule__SawToothOscillator__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SawToothOscillator__Group__9();

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
    // $ANTLR end "rule__SawToothOscillator__Group__8"


    // $ANTLR start "rule__SawToothOscillator__Group__8__Impl"
    // InternalSynthesizer.g:1359:1: rule__SawToothOscillator__Group__8__Impl : ( ( rule__SawToothOscillator__DefaultAssignment_8 ) ) ;
    public final void rule__SawToothOscillator__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1363:1: ( ( ( rule__SawToothOscillator__DefaultAssignment_8 ) ) )
            // InternalSynthesizer.g:1364:1: ( ( rule__SawToothOscillator__DefaultAssignment_8 ) )
            {
            // InternalSynthesizer.g:1364:1: ( ( rule__SawToothOscillator__DefaultAssignment_8 ) )
            // InternalSynthesizer.g:1365:2: ( rule__SawToothOscillator__DefaultAssignment_8 )
            {
             before(grammarAccess.getSawToothOscillatorAccess().getDefaultAssignment_8()); 
            // InternalSynthesizer.g:1366:2: ( rule__SawToothOscillator__DefaultAssignment_8 )
            // InternalSynthesizer.g:1366:3: rule__SawToothOscillator__DefaultAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__SawToothOscillator__DefaultAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getSawToothOscillatorAccess().getDefaultAssignment_8()); 

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
    // $ANTLR end "rule__SawToothOscillator__Group__8__Impl"


    // $ANTLR start "rule__SawToothOscillator__Group__9"
    // InternalSynthesizer.g:1374:1: rule__SawToothOscillator__Group__9 : rule__SawToothOscillator__Group__9__Impl ;
    public final void rule__SawToothOscillator__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1378:1: ( rule__SawToothOscillator__Group__9__Impl )
            // InternalSynthesizer.g:1379:2: rule__SawToothOscillator__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SawToothOscillator__Group__9__Impl();

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
    // $ANTLR end "rule__SawToothOscillator__Group__9"


    // $ANTLR start "rule__SawToothOscillator__Group__9__Impl"
    // InternalSynthesizer.g:1385:1: rule__SawToothOscillator__Group__9__Impl : ( ')' ) ;
    public final void rule__SawToothOscillator__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1389:1: ( ( ')' ) )
            // InternalSynthesizer.g:1390:1: ( ')' )
            {
            // InternalSynthesizer.g:1390:1: ( ')' )
            // InternalSynthesizer.g:1391:2: ')'
            {
             before(grammarAccess.getSawToothOscillatorAccess().getRightParenthesisKeyword_9()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSawToothOscillatorAccess().getRightParenthesisKeyword_9()); 

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
    // $ANTLR end "rule__SawToothOscillator__Group__9__Impl"


    // $ANTLR start "rule__SineOscillator__Group__0"
    // InternalSynthesizer.g:1401:1: rule__SineOscillator__Group__0 : rule__SineOscillator__Group__0__Impl rule__SineOscillator__Group__1 ;
    public final void rule__SineOscillator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1405:1: ( rule__SineOscillator__Group__0__Impl rule__SineOscillator__Group__1 )
            // InternalSynthesizer.g:1406:2: rule__SineOscillator__Group__0__Impl rule__SineOscillator__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__SineOscillator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SineOscillator__Group__1();

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
    // $ANTLR end "rule__SineOscillator__Group__0"


    // $ANTLR start "rule__SineOscillator__Group__0__Impl"
    // InternalSynthesizer.g:1413:1: rule__SineOscillator__Group__0__Impl : ( 'sineOscillator' ) ;
    public final void rule__SineOscillator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1417:1: ( ( 'sineOscillator' ) )
            // InternalSynthesizer.g:1418:1: ( 'sineOscillator' )
            {
            // InternalSynthesizer.g:1418:1: ( 'sineOscillator' )
            // InternalSynthesizer.g:1419:2: 'sineOscillator'
            {
             before(grammarAccess.getSineOscillatorAccess().getSineOscillatorKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSineOscillatorAccess().getSineOscillatorKeyword_0()); 

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
    // $ANTLR end "rule__SineOscillator__Group__0__Impl"


    // $ANTLR start "rule__SineOscillator__Group__1"
    // InternalSynthesizer.g:1428:1: rule__SineOscillator__Group__1 : rule__SineOscillator__Group__1__Impl rule__SineOscillator__Group__2 ;
    public final void rule__SineOscillator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1432:1: ( rule__SineOscillator__Group__1__Impl rule__SineOscillator__Group__2 )
            // InternalSynthesizer.g:1433:2: rule__SineOscillator__Group__1__Impl rule__SineOscillator__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__SineOscillator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SineOscillator__Group__2();

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
    // $ANTLR end "rule__SineOscillator__Group__1"


    // $ANTLR start "rule__SineOscillator__Group__1__Impl"
    // InternalSynthesizer.g:1440:1: rule__SineOscillator__Group__1__Impl : ( ( rule__SineOscillator__NameAssignment_1 ) ) ;
    public final void rule__SineOscillator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1444:1: ( ( ( rule__SineOscillator__NameAssignment_1 ) ) )
            // InternalSynthesizer.g:1445:1: ( ( rule__SineOscillator__NameAssignment_1 ) )
            {
            // InternalSynthesizer.g:1445:1: ( ( rule__SineOscillator__NameAssignment_1 ) )
            // InternalSynthesizer.g:1446:2: ( rule__SineOscillator__NameAssignment_1 )
            {
             before(grammarAccess.getSineOscillatorAccess().getNameAssignment_1()); 
            // InternalSynthesizer.g:1447:2: ( rule__SineOscillator__NameAssignment_1 )
            // InternalSynthesizer.g:1447:3: rule__SineOscillator__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SineOscillator__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSineOscillatorAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__SineOscillator__Group__1__Impl"


    // $ANTLR start "rule__SineOscillator__Group__2"
    // InternalSynthesizer.g:1455:1: rule__SineOscillator__Group__2 : rule__SineOscillator__Group__2__Impl rule__SineOscillator__Group__3 ;
    public final void rule__SineOscillator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1459:1: ( rule__SineOscillator__Group__2__Impl rule__SineOscillator__Group__3 )
            // InternalSynthesizer.g:1460:2: rule__SineOscillator__Group__2__Impl rule__SineOscillator__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__SineOscillator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SineOscillator__Group__3();

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
    // $ANTLR end "rule__SineOscillator__Group__2"


    // $ANTLR start "rule__SineOscillator__Group__2__Impl"
    // InternalSynthesizer.g:1467:1: rule__SineOscillator__Group__2__Impl : ( '(' ) ;
    public final void rule__SineOscillator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1471:1: ( ( '(' ) )
            // InternalSynthesizer.g:1472:1: ( '(' )
            {
            // InternalSynthesizer.g:1472:1: ( '(' )
            // InternalSynthesizer.g:1473:2: '('
            {
             before(grammarAccess.getSineOscillatorAccess().getLeftParenthesisKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSineOscillatorAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__SineOscillator__Group__2__Impl"


    // $ANTLR start "rule__SineOscillator__Group__3"
    // InternalSynthesizer.g:1482:1: rule__SineOscillator__Group__3 : rule__SineOscillator__Group__3__Impl rule__SineOscillator__Group__4 ;
    public final void rule__SineOscillator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1486:1: ( rule__SineOscillator__Group__3__Impl rule__SineOscillator__Group__4 )
            // InternalSynthesizer.g:1487:2: rule__SineOscillator__Group__3__Impl rule__SineOscillator__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__SineOscillator__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SineOscillator__Group__4();

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
    // $ANTLR end "rule__SineOscillator__Group__3"


    // $ANTLR start "rule__SineOscillator__Group__3__Impl"
    // InternalSynthesizer.g:1494:1: rule__SineOscillator__Group__3__Impl : ( 'frequency' ) ;
    public final void rule__SineOscillator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1498:1: ( ( 'frequency' ) )
            // InternalSynthesizer.g:1499:1: ( 'frequency' )
            {
            // InternalSynthesizer.g:1499:1: ( 'frequency' )
            // InternalSynthesizer.g:1500:2: 'frequency'
            {
             before(grammarAccess.getSineOscillatorAccess().getFrequencyKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSineOscillatorAccess().getFrequencyKeyword_3()); 

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
    // $ANTLR end "rule__SineOscillator__Group__3__Impl"


    // $ANTLR start "rule__SineOscillator__Group__4"
    // InternalSynthesizer.g:1509:1: rule__SineOscillator__Group__4 : rule__SineOscillator__Group__4__Impl rule__SineOscillator__Group__5 ;
    public final void rule__SineOscillator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1513:1: ( rule__SineOscillator__Group__4__Impl rule__SineOscillator__Group__5 )
            // InternalSynthesizer.g:1514:2: rule__SineOscillator__Group__4__Impl rule__SineOscillator__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__SineOscillator__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SineOscillator__Group__5();

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
    // $ANTLR end "rule__SineOscillator__Group__4"


    // $ANTLR start "rule__SineOscillator__Group__4__Impl"
    // InternalSynthesizer.g:1521:1: rule__SineOscillator__Group__4__Impl : ( ( rule__SineOscillator__FrequencyAssignment_4 ) ) ;
    public final void rule__SineOscillator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1525:1: ( ( ( rule__SineOscillator__FrequencyAssignment_4 ) ) )
            // InternalSynthesizer.g:1526:1: ( ( rule__SineOscillator__FrequencyAssignment_4 ) )
            {
            // InternalSynthesizer.g:1526:1: ( ( rule__SineOscillator__FrequencyAssignment_4 ) )
            // InternalSynthesizer.g:1527:2: ( rule__SineOscillator__FrequencyAssignment_4 )
            {
             before(grammarAccess.getSineOscillatorAccess().getFrequencyAssignment_4()); 
            // InternalSynthesizer.g:1528:2: ( rule__SineOscillator__FrequencyAssignment_4 )
            // InternalSynthesizer.g:1528:3: rule__SineOscillator__FrequencyAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SineOscillator__FrequencyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSineOscillatorAccess().getFrequencyAssignment_4()); 

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
    // $ANTLR end "rule__SineOscillator__Group__4__Impl"


    // $ANTLR start "rule__SineOscillator__Group__5"
    // InternalSynthesizer.g:1536:1: rule__SineOscillator__Group__5 : rule__SineOscillator__Group__5__Impl rule__SineOscillator__Group__6 ;
    public final void rule__SineOscillator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1540:1: ( rule__SineOscillator__Group__5__Impl rule__SineOscillator__Group__6 )
            // InternalSynthesizer.g:1541:2: rule__SineOscillator__Group__5__Impl rule__SineOscillator__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__SineOscillator__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SineOscillator__Group__6();

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
    // $ANTLR end "rule__SineOscillator__Group__5"


    // $ANTLR start "rule__SineOscillator__Group__5__Impl"
    // InternalSynthesizer.g:1548:1: rule__SineOscillator__Group__5__Impl : ( 'amplitude' ) ;
    public final void rule__SineOscillator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1552:1: ( ( 'amplitude' ) )
            // InternalSynthesizer.g:1553:1: ( 'amplitude' )
            {
            // InternalSynthesizer.g:1553:1: ( 'amplitude' )
            // InternalSynthesizer.g:1554:2: 'amplitude'
            {
             before(grammarAccess.getSineOscillatorAccess().getAmplitudeKeyword_5()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSineOscillatorAccess().getAmplitudeKeyword_5()); 

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
    // $ANTLR end "rule__SineOscillator__Group__5__Impl"


    // $ANTLR start "rule__SineOscillator__Group__6"
    // InternalSynthesizer.g:1563:1: rule__SineOscillator__Group__6 : rule__SineOscillator__Group__6__Impl rule__SineOscillator__Group__7 ;
    public final void rule__SineOscillator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1567:1: ( rule__SineOscillator__Group__6__Impl rule__SineOscillator__Group__7 )
            // InternalSynthesizer.g:1568:2: rule__SineOscillator__Group__6__Impl rule__SineOscillator__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__SineOscillator__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SineOscillator__Group__7();

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
    // $ANTLR end "rule__SineOscillator__Group__6"


    // $ANTLR start "rule__SineOscillator__Group__6__Impl"
    // InternalSynthesizer.g:1575:1: rule__SineOscillator__Group__6__Impl : ( ( rule__SineOscillator__AmplitudeAssignment_6 ) ) ;
    public final void rule__SineOscillator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1579:1: ( ( ( rule__SineOscillator__AmplitudeAssignment_6 ) ) )
            // InternalSynthesizer.g:1580:1: ( ( rule__SineOscillator__AmplitudeAssignment_6 ) )
            {
            // InternalSynthesizer.g:1580:1: ( ( rule__SineOscillator__AmplitudeAssignment_6 ) )
            // InternalSynthesizer.g:1581:2: ( rule__SineOscillator__AmplitudeAssignment_6 )
            {
             before(grammarAccess.getSineOscillatorAccess().getAmplitudeAssignment_6()); 
            // InternalSynthesizer.g:1582:2: ( rule__SineOscillator__AmplitudeAssignment_6 )
            // InternalSynthesizer.g:1582:3: rule__SineOscillator__AmplitudeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__SineOscillator__AmplitudeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSineOscillatorAccess().getAmplitudeAssignment_6()); 

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
    // $ANTLR end "rule__SineOscillator__Group__6__Impl"


    // $ANTLR start "rule__SineOscillator__Group__7"
    // InternalSynthesizer.g:1590:1: rule__SineOscillator__Group__7 : rule__SineOscillator__Group__7__Impl ;
    public final void rule__SineOscillator__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1594:1: ( rule__SineOscillator__Group__7__Impl )
            // InternalSynthesizer.g:1595:2: rule__SineOscillator__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SineOscillator__Group__7__Impl();

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
    // $ANTLR end "rule__SineOscillator__Group__7"


    // $ANTLR start "rule__SineOscillator__Group__7__Impl"
    // InternalSynthesizer.g:1601:1: rule__SineOscillator__Group__7__Impl : ( ')' ) ;
    public final void rule__SineOscillator__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1605:1: ( ( ')' ) )
            // InternalSynthesizer.g:1606:1: ( ')' )
            {
            // InternalSynthesizer.g:1606:1: ( ')' )
            // InternalSynthesizer.g:1607:2: ')'
            {
             before(grammarAccess.getSineOscillatorAccess().getRightParenthesisKeyword_7()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSineOscillatorAccess().getRightParenthesisKeyword_7()); 

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
    // $ANTLR end "rule__SineOscillator__Group__7__Impl"


    // $ANTLR start "rule__Model__ControlsAssignment_2"
    // InternalSynthesizer.g:1617:1: rule__Model__ControlsAssignment_2 : ( ruleControlElement ) ;
    public final void rule__Model__ControlsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1621:1: ( ( ruleControlElement ) )
            // InternalSynthesizer.g:1622:2: ( ruleControlElement )
            {
            // InternalSynthesizer.g:1622:2: ( ruleControlElement )
            // InternalSynthesizer.g:1623:3: ruleControlElement
            {
             before(grammarAccess.getModelAccess().getControlsControlElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleControlElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getControlsControlElementParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Model__ControlsAssignment_2"


    // $ANTLR start "rule__Model__SoundsAssignment_4_2"
    // InternalSynthesizer.g:1632:1: rule__Model__SoundsAssignment_4_2 : ( ruleSoundElement ) ;
    public final void rule__Model__SoundsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1636:1: ( ( ruleSoundElement ) )
            // InternalSynthesizer.g:1637:2: ( ruleSoundElement )
            {
            // InternalSynthesizer.g:1637:2: ( ruleSoundElement )
            // InternalSynthesizer.g:1638:3: ruleSoundElement
            {
             before(grammarAccess.getModelAccess().getSoundsSoundElementParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSoundElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSoundsSoundElementParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Model__SoundsAssignment_4_2"


    // $ANTLR start "rule__Model__ConnectionsAssignment_5_2"
    // InternalSynthesizer.g:1647:1: rule__Model__ConnectionsAssignment_5_2 : ( ruleConnectionElement ) ;
    public final void rule__Model__ConnectionsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1651:1: ( ( ruleConnectionElement ) )
            // InternalSynthesizer.g:1652:2: ( ruleConnectionElement )
            {
            // InternalSynthesizer.g:1652:2: ( ruleConnectionElement )
            // InternalSynthesizer.g:1653:3: ruleConnectionElement
            {
             before(grammarAccess.getModelAccess().getConnectionsConnectionElementParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConnectionElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getConnectionsConnectionElementParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__Model__ConnectionsAssignment_5_2"


    // $ANTLR start "rule__ConnectionElement__CeAssignment_1"
    // InternalSynthesizer.g:1662:1: rule__ConnectionElement__CeAssignment_1 : ( ruleControlElement ) ;
    public final void rule__ConnectionElement__CeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1666:1: ( ( ruleControlElement ) )
            // InternalSynthesizer.g:1667:2: ( ruleControlElement )
            {
            // InternalSynthesizer.g:1667:2: ( ruleControlElement )
            // InternalSynthesizer.g:1668:3: ruleControlElement
            {
             before(grammarAccess.getConnectionElementAccess().getCeControlElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleControlElement();

            state._fsp--;

             after(grammarAccess.getConnectionElementAccess().getCeControlElementParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ConnectionElement__CeAssignment_1"


    // $ANTLR start "rule__ConnectionElement__SeAssignment_2"
    // InternalSynthesizer.g:1677:1: rule__ConnectionElement__SeAssignment_2 : ( ruleSoundElement ) ;
    public final void rule__ConnectionElement__SeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1681:1: ( ( ruleSoundElement ) )
            // InternalSynthesizer.g:1682:2: ( ruleSoundElement )
            {
            // InternalSynthesizer.g:1682:2: ( ruleSoundElement )
            // InternalSynthesizer.g:1683:3: ruleSoundElement
            {
             before(grammarAccess.getConnectionElementAccess().getSeSoundElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSoundElement();

            state._fsp--;

             after(grammarAccess.getConnectionElementAccess().getSeSoundElementParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ConnectionElement__SeAssignment_2"


    // $ANTLR start "rule__Button__NameAssignment_1"
    // InternalSynthesizer.g:1692:1: rule__Button__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Button__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1696:1: ( ( RULE_ID ) )
            // InternalSynthesizer.g:1697:2: ( RULE_ID )
            {
            // InternalSynthesizer.g:1697:2: ( RULE_ID )
            // InternalSynthesizer.g:1698:3: RULE_ID
            {
             before(grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Button__NameAssignment_1"


    // $ANTLR start "rule__Button__XAssignment_4"
    // InternalSynthesizer.g:1707:1: rule__Button__XAssignment_4 : ( RULE_INT ) ;
    public final void rule__Button__XAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1711:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:1712:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:1712:2: ( RULE_INT )
            // InternalSynthesizer.g:1713:3: RULE_INT
            {
             before(grammarAccess.getButtonAccess().getXINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getXINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Button__XAssignment_4"


    // $ANTLR start "rule__Button__YAssignment_6"
    // InternalSynthesizer.g:1722:1: rule__Button__YAssignment_6 : ( RULE_INT ) ;
    public final void rule__Button__YAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1726:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:1727:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:1727:2: ( RULE_INT )
            // InternalSynthesizer.g:1728:3: RULE_INT
            {
             before(grammarAccess.getButtonAccess().getYINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getYINTTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__Button__YAssignment_6"


    // $ANTLR start "rule__Button__WidthAssignment_8"
    // InternalSynthesizer.g:1737:1: rule__Button__WidthAssignment_8 : ( RULE_INT ) ;
    public final void rule__Button__WidthAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1741:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:1742:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:1742:2: ( RULE_INT )
            // InternalSynthesizer.g:1743:3: RULE_INT
            {
             before(grammarAccess.getButtonAccess().getWidthINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getWidthINTTerminalRuleCall_8_0()); 

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
    // $ANTLR end "rule__Button__WidthAssignment_8"


    // $ANTLR start "rule__Button__HeightAssignment_10"
    // InternalSynthesizer.g:1752:1: rule__Button__HeightAssignment_10 : ( RULE_INT ) ;
    public final void rule__Button__HeightAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1756:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:1757:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:1757:2: ( RULE_INT )
            // InternalSynthesizer.g:1758:3: RULE_INT
            {
             before(grammarAccess.getButtonAccess().getHeightINTTerminalRuleCall_10_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getHeightINTTerminalRuleCall_10_0()); 

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
    // $ANTLR end "rule__Button__HeightAssignment_10"


    // $ANTLR start "rule__Button__FrequencyAssignment_12"
    // InternalSynthesizer.g:1767:1: rule__Button__FrequencyAssignment_12 : ( RULE_INT ) ;
    public final void rule__Button__FrequencyAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1771:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:1772:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:1772:2: ( RULE_INT )
            // InternalSynthesizer.g:1773:3: RULE_INT
            {
             before(grammarAccess.getButtonAccess().getFrequencyINTTerminalRuleCall_12_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getFrequencyINTTerminalRuleCall_12_0()); 

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
    // $ANTLR end "rule__Button__FrequencyAssignment_12"


    // $ANTLR start "rule__SawToothOscillator__NameAssignment_1"
    // InternalSynthesizer.g:1782:1: rule__SawToothOscillator__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SawToothOscillator__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1786:1: ( ( RULE_ID ) )
            // InternalSynthesizer.g:1787:2: ( RULE_ID )
            {
            // InternalSynthesizer.g:1787:2: ( RULE_ID )
            // InternalSynthesizer.g:1788:3: RULE_ID
            {
             before(grammarAccess.getSawToothOscillatorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSawToothOscillatorAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__SawToothOscillator__NameAssignment_1"


    // $ANTLR start "rule__SawToothOscillator__MinAssignment_4"
    // InternalSynthesizer.g:1797:1: rule__SawToothOscillator__MinAssignment_4 : ( RULE_INT ) ;
    public final void rule__SawToothOscillator__MinAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1801:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:1802:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:1802:2: ( RULE_INT )
            // InternalSynthesizer.g:1803:3: RULE_INT
            {
             before(grammarAccess.getSawToothOscillatorAccess().getMinINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSawToothOscillatorAccess().getMinINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__SawToothOscillator__MinAssignment_4"


    // $ANTLR start "rule__SawToothOscillator__MaxAssignment_6"
    // InternalSynthesizer.g:1812:1: rule__SawToothOscillator__MaxAssignment_6 : ( RULE_INT ) ;
    public final void rule__SawToothOscillator__MaxAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1816:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:1817:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:1817:2: ( RULE_INT )
            // InternalSynthesizer.g:1818:3: RULE_INT
            {
             before(grammarAccess.getSawToothOscillatorAccess().getMaxINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSawToothOscillatorAccess().getMaxINTTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__SawToothOscillator__MaxAssignment_6"


    // $ANTLR start "rule__SawToothOscillator__DefaultAssignment_8"
    // InternalSynthesizer.g:1827:1: rule__SawToothOscillator__DefaultAssignment_8 : ( RULE_INT ) ;
    public final void rule__SawToothOscillator__DefaultAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1831:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:1832:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:1832:2: ( RULE_INT )
            // InternalSynthesizer.g:1833:3: RULE_INT
            {
             before(grammarAccess.getSawToothOscillatorAccess().getDefaultINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSawToothOscillatorAccess().getDefaultINTTerminalRuleCall_8_0()); 

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
    // $ANTLR end "rule__SawToothOscillator__DefaultAssignment_8"


    // $ANTLR start "rule__SineOscillator__NameAssignment_1"
    // InternalSynthesizer.g:1842:1: rule__SineOscillator__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SineOscillator__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1846:1: ( ( RULE_ID ) )
            // InternalSynthesizer.g:1847:2: ( RULE_ID )
            {
            // InternalSynthesizer.g:1847:2: ( RULE_ID )
            // InternalSynthesizer.g:1848:3: RULE_ID
            {
             before(grammarAccess.getSineOscillatorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSineOscillatorAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__SineOscillator__NameAssignment_1"


    // $ANTLR start "rule__SineOscillator__FrequencyAssignment_4"
    // InternalSynthesizer.g:1857:1: rule__SineOscillator__FrequencyAssignment_4 : ( RULE_INT ) ;
    public final void rule__SineOscillator__FrequencyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1861:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:1862:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:1862:2: ( RULE_INT )
            // InternalSynthesizer.g:1863:3: RULE_INT
            {
             before(grammarAccess.getSineOscillatorAccess().getFrequencyINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSineOscillatorAccess().getFrequencyINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__SineOscillator__FrequencyAssignment_4"


    // $ANTLR start "rule__SineOscillator__AmplitudeAssignment_6"
    // InternalSynthesizer.g:1872:1: rule__SineOscillator__AmplitudeAssignment_6 : ( RULE_INT ) ;
    public final void rule__SineOscillator__AmplitudeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1876:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:1877:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:1877:2: ( RULE_INT )
            // InternalSynthesizer.g:1878:3: RULE_INT
            {
             before(grammarAccess.getSineOscillatorAccess().getAmplitudeINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSineOscillatorAccess().getAmplitudeINTTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__SineOscillator__AmplitudeAssignment_6"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000044800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040802L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000044004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000044000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});

}