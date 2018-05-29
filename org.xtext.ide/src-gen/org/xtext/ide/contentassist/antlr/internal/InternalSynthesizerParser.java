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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Controls'", "'{'", "'}'", "'Sound'", "'Connections'", "'rotaryKnob'", "'('", "'x'", "'y'", "'width'", "'height'", "')'", "'slider'", "'button'", "'frequency'", "'linear'", "'sawToothOscillator'", "'min'", "'max'", "'default'", "'sineOscillator'", "'amplitude'"
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


    // $ANTLR start "entryRuleRotaryKnob"
    // InternalSynthesizer.g:103:1: entryRuleRotaryKnob : ruleRotaryKnob EOF ;
    public final void entryRuleRotaryKnob() throws RecognitionException {
        try {
            // InternalSynthesizer.g:104:1: ( ruleRotaryKnob EOF )
            // InternalSynthesizer.g:105:1: ruleRotaryKnob EOF
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
    // InternalSynthesizer.g:112:1: ruleRotaryKnob : ( ( rule__RotaryKnob__Group__0 ) ) ;
    public final void ruleRotaryKnob() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:116:2: ( ( ( rule__RotaryKnob__Group__0 ) ) )
            // InternalSynthesizer.g:117:2: ( ( rule__RotaryKnob__Group__0 ) )
            {
            // InternalSynthesizer.g:117:2: ( ( rule__RotaryKnob__Group__0 ) )
            // InternalSynthesizer.g:118:3: ( rule__RotaryKnob__Group__0 )
            {
             before(grammarAccess.getRotaryKnobAccess().getGroup()); 
            // InternalSynthesizer.g:119:3: ( rule__RotaryKnob__Group__0 )
            // InternalSynthesizer.g:119:4: rule__RotaryKnob__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RotaryKnob__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRotaryKnobAccess().getGroup()); 

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


    // $ANTLR start "entryRuleSlider"
    // InternalSynthesizer.g:128:1: entryRuleSlider : ruleSlider EOF ;
    public final void entryRuleSlider() throws RecognitionException {
        try {
            // InternalSynthesizer.g:129:1: ( ruleSlider EOF )
            // InternalSynthesizer.g:130:1: ruleSlider EOF
            {
             before(grammarAccess.getSliderRule()); 
            pushFollow(FOLLOW_1);
            ruleSlider();

            state._fsp--;

             after(grammarAccess.getSliderRule()); 
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
    // $ANTLR end "entryRuleSlider"


    // $ANTLR start "ruleSlider"
    // InternalSynthesizer.g:137:1: ruleSlider : ( ( rule__Slider__Group__0 ) ) ;
    public final void ruleSlider() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:141:2: ( ( ( rule__Slider__Group__0 ) ) )
            // InternalSynthesizer.g:142:2: ( ( rule__Slider__Group__0 ) )
            {
            // InternalSynthesizer.g:142:2: ( ( rule__Slider__Group__0 ) )
            // InternalSynthesizer.g:143:3: ( rule__Slider__Group__0 )
            {
             before(grammarAccess.getSliderAccess().getGroup()); 
            // InternalSynthesizer.g:144:3: ( rule__Slider__Group__0 )
            // InternalSynthesizer.g:144:4: rule__Slider__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Slider__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSliderAccess().getGroup()); 

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
    // $ANTLR end "ruleSlider"


    // $ANTLR start "entryRuleButton"
    // InternalSynthesizer.g:153:1: entryRuleButton : ruleButton EOF ;
    public final void entryRuleButton() throws RecognitionException {
        try {
            // InternalSynthesizer.g:154:1: ( ruleButton EOF )
            // InternalSynthesizer.g:155:1: ruleButton EOF
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
    // InternalSynthesizer.g:162:1: ruleButton : ( ( rule__Button__Group__0 ) ) ;
    public final void ruleButton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:166:2: ( ( ( rule__Button__Group__0 ) ) )
            // InternalSynthesizer.g:167:2: ( ( rule__Button__Group__0 ) )
            {
            // InternalSynthesizer.g:167:2: ( ( rule__Button__Group__0 ) )
            // InternalSynthesizer.g:168:3: ( rule__Button__Group__0 )
            {
             before(grammarAccess.getButtonAccess().getGroup()); 
            // InternalSynthesizer.g:169:3: ( rule__Button__Group__0 )
            // InternalSynthesizer.g:169:4: rule__Button__Group__0
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


    // $ANTLR start "entryRuleSoundElement"
    // InternalSynthesizer.g:178:1: entryRuleSoundElement : ruleSoundElement EOF ;
    public final void entryRuleSoundElement() throws RecognitionException {
        try {
            // InternalSynthesizer.g:179:1: ( ruleSoundElement EOF )
            // InternalSynthesizer.g:180:1: ruleSoundElement EOF
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
    // InternalSynthesizer.g:187:1: ruleSoundElement : ( ( rule__SoundElement__Alternatives ) ) ;
    public final void ruleSoundElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:191:2: ( ( ( rule__SoundElement__Alternatives ) ) )
            // InternalSynthesizer.g:192:2: ( ( rule__SoundElement__Alternatives ) )
            {
            // InternalSynthesizer.g:192:2: ( ( rule__SoundElement__Alternatives ) )
            // InternalSynthesizer.g:193:3: ( rule__SoundElement__Alternatives )
            {
             before(grammarAccess.getSoundElementAccess().getAlternatives()); 
            // InternalSynthesizer.g:194:3: ( rule__SoundElement__Alternatives )
            // InternalSynthesizer.g:194:4: rule__SoundElement__Alternatives
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
    // InternalSynthesizer.g:203:1: entryRuleConnectionElement : ruleConnectionElement EOF ;
    public final void entryRuleConnectionElement() throws RecognitionException {
        try {
            // InternalSynthesizer.g:204:1: ( ruleConnectionElement EOF )
            // InternalSynthesizer.g:205:1: ruleConnectionElement EOF
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
    // InternalSynthesizer.g:212:1: ruleConnectionElement : ( ( rule__ConnectionElement__Group__0 ) ) ;
    public final void ruleConnectionElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:216:2: ( ( ( rule__ConnectionElement__Group__0 ) ) )
            // InternalSynthesizer.g:217:2: ( ( rule__ConnectionElement__Group__0 ) )
            {
            // InternalSynthesizer.g:217:2: ( ( rule__ConnectionElement__Group__0 ) )
            // InternalSynthesizer.g:218:3: ( rule__ConnectionElement__Group__0 )
            {
             before(grammarAccess.getConnectionElementAccess().getGroup()); 
            // InternalSynthesizer.g:219:3: ( rule__ConnectionElement__Group__0 )
            // InternalSynthesizer.g:219:4: rule__ConnectionElement__Group__0
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


    // $ANTLR start "entryRuleSawToothOscillator"
    // InternalSynthesizer.g:228:1: entryRuleSawToothOscillator : ruleSawToothOscillator EOF ;
    public final void entryRuleSawToothOscillator() throws RecognitionException {
        try {
            // InternalSynthesizer.g:229:1: ( ruleSawToothOscillator EOF )
            // InternalSynthesizer.g:230:1: ruleSawToothOscillator EOF
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
    // InternalSynthesizer.g:237:1: ruleSawToothOscillator : ( ( rule__SawToothOscillator__Group__0 ) ) ;
    public final void ruleSawToothOscillator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:241:2: ( ( ( rule__SawToothOscillator__Group__0 ) ) )
            // InternalSynthesizer.g:242:2: ( ( rule__SawToothOscillator__Group__0 ) )
            {
            // InternalSynthesizer.g:242:2: ( ( rule__SawToothOscillator__Group__0 ) )
            // InternalSynthesizer.g:243:3: ( rule__SawToothOscillator__Group__0 )
            {
             before(grammarAccess.getSawToothOscillatorAccess().getGroup()); 
            // InternalSynthesizer.g:244:3: ( rule__SawToothOscillator__Group__0 )
            // InternalSynthesizer.g:244:4: rule__SawToothOscillator__Group__0
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
    // InternalSynthesizer.g:253:1: entryRuleSineOscillator : ruleSineOscillator EOF ;
    public final void entryRuleSineOscillator() throws RecognitionException {
        try {
            // InternalSynthesizer.g:254:1: ( ruleSineOscillator EOF )
            // InternalSynthesizer.g:255:1: ruleSineOscillator EOF
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
    // InternalSynthesizer.g:262:1: ruleSineOscillator : ( ( rule__SineOscillator__Group__0 ) ) ;
    public final void ruleSineOscillator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:266:2: ( ( ( rule__SineOscillator__Group__0 ) ) )
            // InternalSynthesizer.g:267:2: ( ( rule__SineOscillator__Group__0 ) )
            {
            // InternalSynthesizer.g:267:2: ( ( rule__SineOscillator__Group__0 ) )
            // InternalSynthesizer.g:268:3: ( rule__SineOscillator__Group__0 )
            {
             before(grammarAccess.getSineOscillatorAccess().getGroup()); 
            // InternalSynthesizer.g:269:3: ( rule__SineOscillator__Group__0 )
            // InternalSynthesizer.g:269:4: rule__SineOscillator__Group__0
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
    // InternalSynthesizer.g:277:1: rule__ControlElement__Alternatives : ( ( ruleButton ) | ( ruleRotaryKnob ) | ( ruleSlider ) );
    public final void rule__ControlElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:281:1: ( ( ruleButton ) | ( ruleRotaryKnob ) | ( ruleSlider ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt1=1;
                }
                break;
            case 16:
                {
                alt1=2;
                }
                break;
            case 23:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalSynthesizer.g:282:2: ( ruleButton )
                    {
                    // InternalSynthesizer.g:282:2: ( ruleButton )
                    // InternalSynthesizer.g:283:3: ruleButton
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
                    // InternalSynthesizer.g:288:2: ( ruleRotaryKnob )
                    {
                    // InternalSynthesizer.g:288:2: ( ruleRotaryKnob )
                    // InternalSynthesizer.g:289:3: ruleRotaryKnob
                    {
                     before(grammarAccess.getControlElementAccess().getRotaryKnobParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRotaryKnob();

                    state._fsp--;

                     after(grammarAccess.getControlElementAccess().getRotaryKnobParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSynthesizer.g:294:2: ( ruleSlider )
                    {
                    // InternalSynthesizer.g:294:2: ( ruleSlider )
                    // InternalSynthesizer.g:295:3: ruleSlider
                    {
                     before(grammarAccess.getControlElementAccess().getSliderParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSlider();

                    state._fsp--;

                     after(grammarAccess.getControlElementAccess().getSliderParserRuleCall_2()); 

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
    // InternalSynthesizer.g:304:1: rule__SoundElement__Alternatives : ( ( ruleSawToothOscillator ) | ( ruleSineOscillator ) );
    public final void rule__SoundElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:308:1: ( ( ruleSawToothOscillator ) | ( ruleSineOscillator ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==27) ) {
                alt2=1;
            }
            else if ( (LA2_0==31) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSynthesizer.g:309:2: ( ruleSawToothOscillator )
                    {
                    // InternalSynthesizer.g:309:2: ( ruleSawToothOscillator )
                    // InternalSynthesizer.g:310:3: ruleSawToothOscillator
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
                    // InternalSynthesizer.g:315:2: ( ruleSineOscillator )
                    {
                    // InternalSynthesizer.g:315:2: ( ruleSineOscillator )
                    // InternalSynthesizer.g:316:3: ruleSineOscillator
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
    // InternalSynthesizer.g:325:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:329:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalSynthesizer.g:330:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalSynthesizer.g:337:1: rule__Model__Group__0__Impl : ( 'Controls' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:341:1: ( ( 'Controls' ) )
            // InternalSynthesizer.g:342:1: ( 'Controls' )
            {
            // InternalSynthesizer.g:342:1: ( 'Controls' )
            // InternalSynthesizer.g:343:2: 'Controls'
            {
             before(grammarAccess.getModelAccess().getControlsKeyword_0()); 
            match(input,11,FOLLOW_2); 
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
    // InternalSynthesizer.g:352:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:356:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalSynthesizer.g:357:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalSynthesizer.g:364:1: rule__Model__Group__1__Impl : ( '{' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:368:1: ( ( '{' ) )
            // InternalSynthesizer.g:369:1: ( '{' )
            {
            // InternalSynthesizer.g:369:1: ( '{' )
            // InternalSynthesizer.g:370:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalSynthesizer.g:379:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:383:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalSynthesizer.g:384:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalSynthesizer.g:391:1: rule__Model__Group__2__Impl : ( ( rule__Model__ControlsAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:395:1: ( ( ( rule__Model__ControlsAssignment_2 )* ) )
            // InternalSynthesizer.g:396:1: ( ( rule__Model__ControlsAssignment_2 )* )
            {
            // InternalSynthesizer.g:396:1: ( ( rule__Model__ControlsAssignment_2 )* )
            // InternalSynthesizer.g:397:2: ( rule__Model__ControlsAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getControlsAssignment_2()); 
            // InternalSynthesizer.g:398:2: ( rule__Model__ControlsAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16||(LA3_0>=23 && LA3_0<=24)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSynthesizer.g:398:3: rule__Model__ControlsAssignment_2
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
    // InternalSynthesizer.g:406:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:410:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalSynthesizer.g:411:2: rule__Model__Group__3__Impl rule__Model__Group__4
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
    // InternalSynthesizer.g:418:1: rule__Model__Group__3__Impl : ( '}' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:422:1: ( ( '}' ) )
            // InternalSynthesizer.g:423:1: ( '}' )
            {
            // InternalSynthesizer.g:423:1: ( '}' )
            // InternalSynthesizer.g:424:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
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
    // InternalSynthesizer.g:433:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:437:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalSynthesizer.g:438:2: rule__Model__Group__4__Impl rule__Model__Group__5
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
    // InternalSynthesizer.g:445:1: rule__Model__Group__4__Impl : ( ( rule__Model__Group_4__0 )? ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:449:1: ( ( ( rule__Model__Group_4__0 )? ) )
            // InternalSynthesizer.g:450:1: ( ( rule__Model__Group_4__0 )? )
            {
            // InternalSynthesizer.g:450:1: ( ( rule__Model__Group_4__0 )? )
            // InternalSynthesizer.g:451:2: ( rule__Model__Group_4__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_4()); 
            // InternalSynthesizer.g:452:2: ( rule__Model__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSynthesizer.g:452:3: rule__Model__Group_4__0
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
    // InternalSynthesizer.g:460:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:464:1: ( rule__Model__Group__5__Impl )
            // InternalSynthesizer.g:465:2: rule__Model__Group__5__Impl
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
    // InternalSynthesizer.g:471:1: rule__Model__Group__5__Impl : ( ( rule__Model__Group_5__0 )? ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:475:1: ( ( ( rule__Model__Group_5__0 )? ) )
            // InternalSynthesizer.g:476:1: ( ( rule__Model__Group_5__0 )? )
            {
            // InternalSynthesizer.g:476:1: ( ( rule__Model__Group_5__0 )? )
            // InternalSynthesizer.g:477:2: ( rule__Model__Group_5__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_5()); 
            // InternalSynthesizer.g:478:2: ( rule__Model__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSynthesizer.g:478:3: rule__Model__Group_5__0
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
    // InternalSynthesizer.g:487:1: rule__Model__Group_4__0 : rule__Model__Group_4__0__Impl rule__Model__Group_4__1 ;
    public final void rule__Model__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:491:1: ( rule__Model__Group_4__0__Impl rule__Model__Group_4__1 )
            // InternalSynthesizer.g:492:2: rule__Model__Group_4__0__Impl rule__Model__Group_4__1
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
    // InternalSynthesizer.g:499:1: rule__Model__Group_4__0__Impl : ( 'Sound' ) ;
    public final void rule__Model__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:503:1: ( ( 'Sound' ) )
            // InternalSynthesizer.g:504:1: ( 'Sound' )
            {
            // InternalSynthesizer.g:504:1: ( 'Sound' )
            // InternalSynthesizer.g:505:2: 'Sound'
            {
             before(grammarAccess.getModelAccess().getSoundKeyword_4_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalSynthesizer.g:514:1: rule__Model__Group_4__1 : rule__Model__Group_4__1__Impl rule__Model__Group_4__2 ;
    public final void rule__Model__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:518:1: ( rule__Model__Group_4__1__Impl rule__Model__Group_4__2 )
            // InternalSynthesizer.g:519:2: rule__Model__Group_4__1__Impl rule__Model__Group_4__2
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
    // InternalSynthesizer.g:526:1: rule__Model__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Model__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:530:1: ( ( '{' ) )
            // InternalSynthesizer.g:531:1: ( '{' )
            {
            // InternalSynthesizer.g:531:1: ( '{' )
            // InternalSynthesizer.g:532:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalSynthesizer.g:541:1: rule__Model__Group_4__2 : rule__Model__Group_4__2__Impl rule__Model__Group_4__3 ;
    public final void rule__Model__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:545:1: ( rule__Model__Group_4__2__Impl rule__Model__Group_4__3 )
            // InternalSynthesizer.g:546:2: rule__Model__Group_4__2__Impl rule__Model__Group_4__3
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
    // InternalSynthesizer.g:553:1: rule__Model__Group_4__2__Impl : ( ( rule__Model__SoundsAssignment_4_2 )* ) ;
    public final void rule__Model__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:557:1: ( ( ( rule__Model__SoundsAssignment_4_2 )* ) )
            // InternalSynthesizer.g:558:1: ( ( rule__Model__SoundsAssignment_4_2 )* )
            {
            // InternalSynthesizer.g:558:1: ( ( rule__Model__SoundsAssignment_4_2 )* )
            // InternalSynthesizer.g:559:2: ( rule__Model__SoundsAssignment_4_2 )*
            {
             before(grammarAccess.getModelAccess().getSoundsAssignment_4_2()); 
            // InternalSynthesizer.g:560:2: ( rule__Model__SoundsAssignment_4_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==27||LA6_0==31) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSynthesizer.g:560:3: rule__Model__SoundsAssignment_4_2
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
    // InternalSynthesizer.g:568:1: rule__Model__Group_4__3 : rule__Model__Group_4__3__Impl ;
    public final void rule__Model__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:572:1: ( rule__Model__Group_4__3__Impl )
            // InternalSynthesizer.g:573:2: rule__Model__Group_4__3__Impl
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
    // InternalSynthesizer.g:579:1: rule__Model__Group_4__3__Impl : ( '}' ) ;
    public final void rule__Model__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:583:1: ( ( '}' ) )
            // InternalSynthesizer.g:584:1: ( '}' )
            {
            // InternalSynthesizer.g:584:1: ( '}' )
            // InternalSynthesizer.g:585:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,13,FOLLOW_2); 
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
    // InternalSynthesizer.g:595:1: rule__Model__Group_5__0 : rule__Model__Group_5__0__Impl rule__Model__Group_5__1 ;
    public final void rule__Model__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:599:1: ( rule__Model__Group_5__0__Impl rule__Model__Group_5__1 )
            // InternalSynthesizer.g:600:2: rule__Model__Group_5__0__Impl rule__Model__Group_5__1
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
    // InternalSynthesizer.g:607:1: rule__Model__Group_5__0__Impl : ( 'Connections' ) ;
    public final void rule__Model__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:611:1: ( ( 'Connections' ) )
            // InternalSynthesizer.g:612:1: ( 'Connections' )
            {
            // InternalSynthesizer.g:612:1: ( 'Connections' )
            // InternalSynthesizer.g:613:2: 'Connections'
            {
             before(grammarAccess.getModelAccess().getConnectionsKeyword_5_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalSynthesizer.g:622:1: rule__Model__Group_5__1 : rule__Model__Group_5__1__Impl rule__Model__Group_5__2 ;
    public final void rule__Model__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:626:1: ( rule__Model__Group_5__1__Impl rule__Model__Group_5__2 )
            // InternalSynthesizer.g:627:2: rule__Model__Group_5__1__Impl rule__Model__Group_5__2
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
    // InternalSynthesizer.g:634:1: rule__Model__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Model__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:638:1: ( ( '{' ) )
            // InternalSynthesizer.g:639:1: ( '{' )
            {
            // InternalSynthesizer.g:639:1: ( '{' )
            // InternalSynthesizer.g:640:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalSynthesizer.g:649:1: rule__Model__Group_5__2 : rule__Model__Group_5__2__Impl rule__Model__Group_5__3 ;
    public final void rule__Model__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:653:1: ( rule__Model__Group_5__2__Impl rule__Model__Group_5__3 )
            // InternalSynthesizer.g:654:2: rule__Model__Group_5__2__Impl rule__Model__Group_5__3
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
    // InternalSynthesizer.g:661:1: rule__Model__Group_5__2__Impl : ( ( rule__Model__ConnectionsAssignment_5_2 )* ) ;
    public final void rule__Model__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:665:1: ( ( ( rule__Model__ConnectionsAssignment_5_2 )* ) )
            // InternalSynthesizer.g:666:1: ( ( rule__Model__ConnectionsAssignment_5_2 )* )
            {
            // InternalSynthesizer.g:666:1: ( ( rule__Model__ConnectionsAssignment_5_2 )* )
            // InternalSynthesizer.g:667:2: ( rule__Model__ConnectionsAssignment_5_2 )*
            {
             before(grammarAccess.getModelAccess().getConnectionsAssignment_5_2()); 
            // InternalSynthesizer.g:668:2: ( rule__Model__ConnectionsAssignment_5_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==26) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSynthesizer.g:668:3: rule__Model__ConnectionsAssignment_5_2
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
    // InternalSynthesizer.g:676:1: rule__Model__Group_5__3 : rule__Model__Group_5__3__Impl ;
    public final void rule__Model__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:680:1: ( rule__Model__Group_5__3__Impl )
            // InternalSynthesizer.g:681:2: rule__Model__Group_5__3__Impl
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
    // InternalSynthesizer.g:687:1: rule__Model__Group_5__3__Impl : ( '}' ) ;
    public final void rule__Model__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:691:1: ( ( '}' ) )
            // InternalSynthesizer.g:692:1: ( '}' )
            {
            // InternalSynthesizer.g:692:1: ( '}' )
            // InternalSynthesizer.g:693:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5_3()); 
            match(input,13,FOLLOW_2); 
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


    // $ANTLR start "rule__RotaryKnob__Group__0"
    // InternalSynthesizer.g:703:1: rule__RotaryKnob__Group__0 : rule__RotaryKnob__Group__0__Impl rule__RotaryKnob__Group__1 ;
    public final void rule__RotaryKnob__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:707:1: ( rule__RotaryKnob__Group__0__Impl rule__RotaryKnob__Group__1 )
            // InternalSynthesizer.g:708:2: rule__RotaryKnob__Group__0__Impl rule__RotaryKnob__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__RotaryKnob__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotaryKnob__Group__1();

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
    // $ANTLR end "rule__RotaryKnob__Group__0"


    // $ANTLR start "rule__RotaryKnob__Group__0__Impl"
    // InternalSynthesizer.g:715:1: rule__RotaryKnob__Group__0__Impl : ( 'rotaryKnob' ) ;
    public final void rule__RotaryKnob__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:719:1: ( ( 'rotaryKnob' ) )
            // InternalSynthesizer.g:720:1: ( 'rotaryKnob' )
            {
            // InternalSynthesizer.g:720:1: ( 'rotaryKnob' )
            // InternalSynthesizer.g:721:2: 'rotaryKnob'
            {
             before(grammarAccess.getRotaryKnobAccess().getRotaryKnobKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRotaryKnobAccess().getRotaryKnobKeyword_0()); 

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
    // $ANTLR end "rule__RotaryKnob__Group__0__Impl"


    // $ANTLR start "rule__RotaryKnob__Group__1"
    // InternalSynthesizer.g:730:1: rule__RotaryKnob__Group__1 : rule__RotaryKnob__Group__1__Impl rule__RotaryKnob__Group__2 ;
    public final void rule__RotaryKnob__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:734:1: ( rule__RotaryKnob__Group__1__Impl rule__RotaryKnob__Group__2 )
            // InternalSynthesizer.g:735:2: rule__RotaryKnob__Group__1__Impl rule__RotaryKnob__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__RotaryKnob__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotaryKnob__Group__2();

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
    // $ANTLR end "rule__RotaryKnob__Group__1"


    // $ANTLR start "rule__RotaryKnob__Group__1__Impl"
    // InternalSynthesizer.g:742:1: rule__RotaryKnob__Group__1__Impl : ( ( rule__RotaryKnob__NameAssignment_1 ) ) ;
    public final void rule__RotaryKnob__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:746:1: ( ( ( rule__RotaryKnob__NameAssignment_1 ) ) )
            // InternalSynthesizer.g:747:1: ( ( rule__RotaryKnob__NameAssignment_1 ) )
            {
            // InternalSynthesizer.g:747:1: ( ( rule__RotaryKnob__NameAssignment_1 ) )
            // InternalSynthesizer.g:748:2: ( rule__RotaryKnob__NameAssignment_1 )
            {
             before(grammarAccess.getRotaryKnobAccess().getNameAssignment_1()); 
            // InternalSynthesizer.g:749:2: ( rule__RotaryKnob__NameAssignment_1 )
            // InternalSynthesizer.g:749:3: rule__RotaryKnob__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RotaryKnob__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRotaryKnobAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__RotaryKnob__Group__1__Impl"


    // $ANTLR start "rule__RotaryKnob__Group__2"
    // InternalSynthesizer.g:757:1: rule__RotaryKnob__Group__2 : rule__RotaryKnob__Group__2__Impl rule__RotaryKnob__Group__3 ;
    public final void rule__RotaryKnob__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:761:1: ( rule__RotaryKnob__Group__2__Impl rule__RotaryKnob__Group__3 )
            // InternalSynthesizer.g:762:2: rule__RotaryKnob__Group__2__Impl rule__RotaryKnob__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__RotaryKnob__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotaryKnob__Group__3();

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
    // $ANTLR end "rule__RotaryKnob__Group__2"


    // $ANTLR start "rule__RotaryKnob__Group__2__Impl"
    // InternalSynthesizer.g:769:1: rule__RotaryKnob__Group__2__Impl : ( '(' ) ;
    public final void rule__RotaryKnob__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:773:1: ( ( '(' ) )
            // InternalSynthesizer.g:774:1: ( '(' )
            {
            // InternalSynthesizer.g:774:1: ( '(' )
            // InternalSynthesizer.g:775:2: '('
            {
             before(grammarAccess.getRotaryKnobAccess().getLeftParenthesisKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRotaryKnobAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__RotaryKnob__Group__2__Impl"


    // $ANTLR start "rule__RotaryKnob__Group__3"
    // InternalSynthesizer.g:784:1: rule__RotaryKnob__Group__3 : rule__RotaryKnob__Group__3__Impl rule__RotaryKnob__Group__4 ;
    public final void rule__RotaryKnob__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:788:1: ( rule__RotaryKnob__Group__3__Impl rule__RotaryKnob__Group__4 )
            // InternalSynthesizer.g:789:2: rule__RotaryKnob__Group__3__Impl rule__RotaryKnob__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__RotaryKnob__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotaryKnob__Group__4();

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
    // $ANTLR end "rule__RotaryKnob__Group__3"


    // $ANTLR start "rule__RotaryKnob__Group__3__Impl"
    // InternalSynthesizer.g:796:1: rule__RotaryKnob__Group__3__Impl : ( 'x' ) ;
    public final void rule__RotaryKnob__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:800:1: ( ( 'x' ) )
            // InternalSynthesizer.g:801:1: ( 'x' )
            {
            // InternalSynthesizer.g:801:1: ( 'x' )
            // InternalSynthesizer.g:802:2: 'x'
            {
             before(grammarAccess.getRotaryKnobAccess().getXKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRotaryKnobAccess().getXKeyword_3()); 

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
    // $ANTLR end "rule__RotaryKnob__Group__3__Impl"


    // $ANTLR start "rule__RotaryKnob__Group__4"
    // InternalSynthesizer.g:811:1: rule__RotaryKnob__Group__4 : rule__RotaryKnob__Group__4__Impl rule__RotaryKnob__Group__5 ;
    public final void rule__RotaryKnob__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:815:1: ( rule__RotaryKnob__Group__4__Impl rule__RotaryKnob__Group__5 )
            // InternalSynthesizer.g:816:2: rule__RotaryKnob__Group__4__Impl rule__RotaryKnob__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__RotaryKnob__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotaryKnob__Group__5();

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
    // $ANTLR end "rule__RotaryKnob__Group__4"


    // $ANTLR start "rule__RotaryKnob__Group__4__Impl"
    // InternalSynthesizer.g:823:1: rule__RotaryKnob__Group__4__Impl : ( ( rule__RotaryKnob__XAssignment_4 ) ) ;
    public final void rule__RotaryKnob__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:827:1: ( ( ( rule__RotaryKnob__XAssignment_4 ) ) )
            // InternalSynthesizer.g:828:1: ( ( rule__RotaryKnob__XAssignment_4 ) )
            {
            // InternalSynthesizer.g:828:1: ( ( rule__RotaryKnob__XAssignment_4 ) )
            // InternalSynthesizer.g:829:2: ( rule__RotaryKnob__XAssignment_4 )
            {
             before(grammarAccess.getRotaryKnobAccess().getXAssignment_4()); 
            // InternalSynthesizer.g:830:2: ( rule__RotaryKnob__XAssignment_4 )
            // InternalSynthesizer.g:830:3: rule__RotaryKnob__XAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RotaryKnob__XAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRotaryKnobAccess().getXAssignment_4()); 

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
    // $ANTLR end "rule__RotaryKnob__Group__4__Impl"


    // $ANTLR start "rule__RotaryKnob__Group__5"
    // InternalSynthesizer.g:838:1: rule__RotaryKnob__Group__5 : rule__RotaryKnob__Group__5__Impl rule__RotaryKnob__Group__6 ;
    public final void rule__RotaryKnob__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:842:1: ( rule__RotaryKnob__Group__5__Impl rule__RotaryKnob__Group__6 )
            // InternalSynthesizer.g:843:2: rule__RotaryKnob__Group__5__Impl rule__RotaryKnob__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__RotaryKnob__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotaryKnob__Group__6();

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
    // $ANTLR end "rule__RotaryKnob__Group__5"


    // $ANTLR start "rule__RotaryKnob__Group__5__Impl"
    // InternalSynthesizer.g:850:1: rule__RotaryKnob__Group__5__Impl : ( 'y' ) ;
    public final void rule__RotaryKnob__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:854:1: ( ( 'y' ) )
            // InternalSynthesizer.g:855:1: ( 'y' )
            {
            // InternalSynthesizer.g:855:1: ( 'y' )
            // InternalSynthesizer.g:856:2: 'y'
            {
             before(grammarAccess.getRotaryKnobAccess().getYKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRotaryKnobAccess().getYKeyword_5()); 

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
    // $ANTLR end "rule__RotaryKnob__Group__5__Impl"


    // $ANTLR start "rule__RotaryKnob__Group__6"
    // InternalSynthesizer.g:865:1: rule__RotaryKnob__Group__6 : rule__RotaryKnob__Group__6__Impl rule__RotaryKnob__Group__7 ;
    public final void rule__RotaryKnob__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:869:1: ( rule__RotaryKnob__Group__6__Impl rule__RotaryKnob__Group__7 )
            // InternalSynthesizer.g:870:2: rule__RotaryKnob__Group__6__Impl rule__RotaryKnob__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__RotaryKnob__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotaryKnob__Group__7();

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
    // $ANTLR end "rule__RotaryKnob__Group__6"


    // $ANTLR start "rule__RotaryKnob__Group__6__Impl"
    // InternalSynthesizer.g:877:1: rule__RotaryKnob__Group__6__Impl : ( ( rule__RotaryKnob__YAssignment_6 ) ) ;
    public final void rule__RotaryKnob__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:881:1: ( ( ( rule__RotaryKnob__YAssignment_6 ) ) )
            // InternalSynthesizer.g:882:1: ( ( rule__RotaryKnob__YAssignment_6 ) )
            {
            // InternalSynthesizer.g:882:1: ( ( rule__RotaryKnob__YAssignment_6 ) )
            // InternalSynthesizer.g:883:2: ( rule__RotaryKnob__YAssignment_6 )
            {
             before(grammarAccess.getRotaryKnobAccess().getYAssignment_6()); 
            // InternalSynthesizer.g:884:2: ( rule__RotaryKnob__YAssignment_6 )
            // InternalSynthesizer.g:884:3: rule__RotaryKnob__YAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__RotaryKnob__YAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRotaryKnobAccess().getYAssignment_6()); 

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
    // $ANTLR end "rule__RotaryKnob__Group__6__Impl"


    // $ANTLR start "rule__RotaryKnob__Group__7"
    // InternalSynthesizer.g:892:1: rule__RotaryKnob__Group__7 : rule__RotaryKnob__Group__7__Impl rule__RotaryKnob__Group__8 ;
    public final void rule__RotaryKnob__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:896:1: ( rule__RotaryKnob__Group__7__Impl rule__RotaryKnob__Group__8 )
            // InternalSynthesizer.g:897:2: rule__RotaryKnob__Group__7__Impl rule__RotaryKnob__Group__8
            {
            pushFollow(FOLLOW_14);
            rule__RotaryKnob__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotaryKnob__Group__8();

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
    // $ANTLR end "rule__RotaryKnob__Group__7"


    // $ANTLR start "rule__RotaryKnob__Group__7__Impl"
    // InternalSynthesizer.g:904:1: rule__RotaryKnob__Group__7__Impl : ( 'width' ) ;
    public final void rule__RotaryKnob__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:908:1: ( ( 'width' ) )
            // InternalSynthesizer.g:909:1: ( 'width' )
            {
            // InternalSynthesizer.g:909:1: ( 'width' )
            // InternalSynthesizer.g:910:2: 'width'
            {
             before(grammarAccess.getRotaryKnobAccess().getWidthKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRotaryKnobAccess().getWidthKeyword_7()); 

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
    // $ANTLR end "rule__RotaryKnob__Group__7__Impl"


    // $ANTLR start "rule__RotaryKnob__Group__8"
    // InternalSynthesizer.g:919:1: rule__RotaryKnob__Group__8 : rule__RotaryKnob__Group__8__Impl rule__RotaryKnob__Group__9 ;
    public final void rule__RotaryKnob__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:923:1: ( rule__RotaryKnob__Group__8__Impl rule__RotaryKnob__Group__9 )
            // InternalSynthesizer.g:924:2: rule__RotaryKnob__Group__8__Impl rule__RotaryKnob__Group__9
            {
            pushFollow(FOLLOW_17);
            rule__RotaryKnob__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotaryKnob__Group__9();

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
    // $ANTLR end "rule__RotaryKnob__Group__8"


    // $ANTLR start "rule__RotaryKnob__Group__8__Impl"
    // InternalSynthesizer.g:931:1: rule__RotaryKnob__Group__8__Impl : ( ( rule__RotaryKnob__WidthAssignment_8 ) ) ;
    public final void rule__RotaryKnob__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:935:1: ( ( ( rule__RotaryKnob__WidthAssignment_8 ) ) )
            // InternalSynthesizer.g:936:1: ( ( rule__RotaryKnob__WidthAssignment_8 ) )
            {
            // InternalSynthesizer.g:936:1: ( ( rule__RotaryKnob__WidthAssignment_8 ) )
            // InternalSynthesizer.g:937:2: ( rule__RotaryKnob__WidthAssignment_8 )
            {
             before(grammarAccess.getRotaryKnobAccess().getWidthAssignment_8()); 
            // InternalSynthesizer.g:938:2: ( rule__RotaryKnob__WidthAssignment_8 )
            // InternalSynthesizer.g:938:3: rule__RotaryKnob__WidthAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__RotaryKnob__WidthAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRotaryKnobAccess().getWidthAssignment_8()); 

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
    // $ANTLR end "rule__RotaryKnob__Group__8__Impl"


    // $ANTLR start "rule__RotaryKnob__Group__9"
    // InternalSynthesizer.g:946:1: rule__RotaryKnob__Group__9 : rule__RotaryKnob__Group__9__Impl rule__RotaryKnob__Group__10 ;
    public final void rule__RotaryKnob__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:950:1: ( rule__RotaryKnob__Group__9__Impl rule__RotaryKnob__Group__10 )
            // InternalSynthesizer.g:951:2: rule__RotaryKnob__Group__9__Impl rule__RotaryKnob__Group__10
            {
            pushFollow(FOLLOW_14);
            rule__RotaryKnob__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotaryKnob__Group__10();

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
    // $ANTLR end "rule__RotaryKnob__Group__9"


    // $ANTLR start "rule__RotaryKnob__Group__9__Impl"
    // InternalSynthesizer.g:958:1: rule__RotaryKnob__Group__9__Impl : ( 'height' ) ;
    public final void rule__RotaryKnob__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:962:1: ( ( 'height' ) )
            // InternalSynthesizer.g:963:1: ( 'height' )
            {
            // InternalSynthesizer.g:963:1: ( 'height' )
            // InternalSynthesizer.g:964:2: 'height'
            {
             before(grammarAccess.getRotaryKnobAccess().getHeightKeyword_9()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRotaryKnobAccess().getHeightKeyword_9()); 

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
    // $ANTLR end "rule__RotaryKnob__Group__9__Impl"


    // $ANTLR start "rule__RotaryKnob__Group__10"
    // InternalSynthesizer.g:973:1: rule__RotaryKnob__Group__10 : rule__RotaryKnob__Group__10__Impl rule__RotaryKnob__Group__11 ;
    public final void rule__RotaryKnob__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:977:1: ( rule__RotaryKnob__Group__10__Impl rule__RotaryKnob__Group__11 )
            // InternalSynthesizer.g:978:2: rule__RotaryKnob__Group__10__Impl rule__RotaryKnob__Group__11
            {
            pushFollow(FOLLOW_18);
            rule__RotaryKnob__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotaryKnob__Group__11();

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
    // $ANTLR end "rule__RotaryKnob__Group__10"


    // $ANTLR start "rule__RotaryKnob__Group__10__Impl"
    // InternalSynthesizer.g:985:1: rule__RotaryKnob__Group__10__Impl : ( ( rule__RotaryKnob__HeightAssignment_10 ) ) ;
    public final void rule__RotaryKnob__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:989:1: ( ( ( rule__RotaryKnob__HeightAssignment_10 ) ) )
            // InternalSynthesizer.g:990:1: ( ( rule__RotaryKnob__HeightAssignment_10 ) )
            {
            // InternalSynthesizer.g:990:1: ( ( rule__RotaryKnob__HeightAssignment_10 ) )
            // InternalSynthesizer.g:991:2: ( rule__RotaryKnob__HeightAssignment_10 )
            {
             before(grammarAccess.getRotaryKnobAccess().getHeightAssignment_10()); 
            // InternalSynthesizer.g:992:2: ( rule__RotaryKnob__HeightAssignment_10 )
            // InternalSynthesizer.g:992:3: rule__RotaryKnob__HeightAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__RotaryKnob__HeightAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getRotaryKnobAccess().getHeightAssignment_10()); 

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
    // $ANTLR end "rule__RotaryKnob__Group__10__Impl"


    // $ANTLR start "rule__RotaryKnob__Group__11"
    // InternalSynthesizer.g:1000:1: rule__RotaryKnob__Group__11 : rule__RotaryKnob__Group__11__Impl ;
    public final void rule__RotaryKnob__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1004:1: ( rule__RotaryKnob__Group__11__Impl )
            // InternalSynthesizer.g:1005:2: rule__RotaryKnob__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RotaryKnob__Group__11__Impl();

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
    // $ANTLR end "rule__RotaryKnob__Group__11"


    // $ANTLR start "rule__RotaryKnob__Group__11__Impl"
    // InternalSynthesizer.g:1011:1: rule__RotaryKnob__Group__11__Impl : ( ')' ) ;
    public final void rule__RotaryKnob__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1015:1: ( ( ')' ) )
            // InternalSynthesizer.g:1016:1: ( ')' )
            {
            // InternalSynthesizer.g:1016:1: ( ')' )
            // InternalSynthesizer.g:1017:2: ')'
            {
             before(grammarAccess.getRotaryKnobAccess().getRightParenthesisKeyword_11()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRotaryKnobAccess().getRightParenthesisKeyword_11()); 

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
    // $ANTLR end "rule__RotaryKnob__Group__11__Impl"


    // $ANTLR start "rule__Slider__Group__0"
    // InternalSynthesizer.g:1027:1: rule__Slider__Group__0 : rule__Slider__Group__0__Impl rule__Slider__Group__1 ;
    public final void rule__Slider__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1031:1: ( rule__Slider__Group__0__Impl rule__Slider__Group__1 )
            // InternalSynthesizer.g:1032:2: rule__Slider__Group__0__Impl rule__Slider__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Slider__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Slider__Group__1();

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
    // $ANTLR end "rule__Slider__Group__0"


    // $ANTLR start "rule__Slider__Group__0__Impl"
    // InternalSynthesizer.g:1039:1: rule__Slider__Group__0__Impl : ( 'slider' ) ;
    public final void rule__Slider__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1043:1: ( ( 'slider' ) )
            // InternalSynthesizer.g:1044:1: ( 'slider' )
            {
            // InternalSynthesizer.g:1044:1: ( 'slider' )
            // InternalSynthesizer.g:1045:2: 'slider'
            {
             before(grammarAccess.getSliderAccess().getSliderKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSliderAccess().getSliderKeyword_0()); 

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
    // $ANTLR end "rule__Slider__Group__0__Impl"


    // $ANTLR start "rule__Slider__Group__1"
    // InternalSynthesizer.g:1054:1: rule__Slider__Group__1 : rule__Slider__Group__1__Impl rule__Slider__Group__2 ;
    public final void rule__Slider__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1058:1: ( rule__Slider__Group__1__Impl rule__Slider__Group__2 )
            // InternalSynthesizer.g:1059:2: rule__Slider__Group__1__Impl rule__Slider__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Slider__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Slider__Group__2();

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
    // $ANTLR end "rule__Slider__Group__1"


    // $ANTLR start "rule__Slider__Group__1__Impl"
    // InternalSynthesizer.g:1066:1: rule__Slider__Group__1__Impl : ( ( rule__Slider__NameAssignment_1 ) ) ;
    public final void rule__Slider__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1070:1: ( ( ( rule__Slider__NameAssignment_1 ) ) )
            // InternalSynthesizer.g:1071:1: ( ( rule__Slider__NameAssignment_1 ) )
            {
            // InternalSynthesizer.g:1071:1: ( ( rule__Slider__NameAssignment_1 ) )
            // InternalSynthesizer.g:1072:2: ( rule__Slider__NameAssignment_1 )
            {
             before(grammarAccess.getSliderAccess().getNameAssignment_1()); 
            // InternalSynthesizer.g:1073:2: ( rule__Slider__NameAssignment_1 )
            // InternalSynthesizer.g:1073:3: rule__Slider__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Slider__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSliderAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Slider__Group__1__Impl"


    // $ANTLR start "rule__Slider__Group__2"
    // InternalSynthesizer.g:1081:1: rule__Slider__Group__2 : rule__Slider__Group__2__Impl rule__Slider__Group__3 ;
    public final void rule__Slider__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1085:1: ( rule__Slider__Group__2__Impl rule__Slider__Group__3 )
            // InternalSynthesizer.g:1086:2: rule__Slider__Group__2__Impl rule__Slider__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Slider__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Slider__Group__3();

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
    // $ANTLR end "rule__Slider__Group__2"


    // $ANTLR start "rule__Slider__Group__2__Impl"
    // InternalSynthesizer.g:1093:1: rule__Slider__Group__2__Impl : ( '(' ) ;
    public final void rule__Slider__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1097:1: ( ( '(' ) )
            // InternalSynthesizer.g:1098:1: ( '(' )
            {
            // InternalSynthesizer.g:1098:1: ( '(' )
            // InternalSynthesizer.g:1099:2: '('
            {
             before(grammarAccess.getSliderAccess().getLeftParenthesisKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSliderAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Slider__Group__2__Impl"


    // $ANTLR start "rule__Slider__Group__3"
    // InternalSynthesizer.g:1108:1: rule__Slider__Group__3 : rule__Slider__Group__3__Impl rule__Slider__Group__4 ;
    public final void rule__Slider__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1112:1: ( rule__Slider__Group__3__Impl rule__Slider__Group__4 )
            // InternalSynthesizer.g:1113:2: rule__Slider__Group__3__Impl rule__Slider__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Slider__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Slider__Group__4();

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
    // $ANTLR end "rule__Slider__Group__3"


    // $ANTLR start "rule__Slider__Group__3__Impl"
    // InternalSynthesizer.g:1120:1: rule__Slider__Group__3__Impl : ( 'x' ) ;
    public final void rule__Slider__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1124:1: ( ( 'x' ) )
            // InternalSynthesizer.g:1125:1: ( 'x' )
            {
            // InternalSynthesizer.g:1125:1: ( 'x' )
            // InternalSynthesizer.g:1126:2: 'x'
            {
             before(grammarAccess.getSliderAccess().getXKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSliderAccess().getXKeyword_3()); 

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
    // $ANTLR end "rule__Slider__Group__3__Impl"


    // $ANTLR start "rule__Slider__Group__4"
    // InternalSynthesizer.g:1135:1: rule__Slider__Group__4 : rule__Slider__Group__4__Impl rule__Slider__Group__5 ;
    public final void rule__Slider__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1139:1: ( rule__Slider__Group__4__Impl rule__Slider__Group__5 )
            // InternalSynthesizer.g:1140:2: rule__Slider__Group__4__Impl rule__Slider__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Slider__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Slider__Group__5();

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
    // $ANTLR end "rule__Slider__Group__4"


    // $ANTLR start "rule__Slider__Group__4__Impl"
    // InternalSynthesizer.g:1147:1: rule__Slider__Group__4__Impl : ( ( rule__Slider__XAssignment_4 ) ) ;
    public final void rule__Slider__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1151:1: ( ( ( rule__Slider__XAssignment_4 ) ) )
            // InternalSynthesizer.g:1152:1: ( ( rule__Slider__XAssignment_4 ) )
            {
            // InternalSynthesizer.g:1152:1: ( ( rule__Slider__XAssignment_4 ) )
            // InternalSynthesizer.g:1153:2: ( rule__Slider__XAssignment_4 )
            {
             before(grammarAccess.getSliderAccess().getXAssignment_4()); 
            // InternalSynthesizer.g:1154:2: ( rule__Slider__XAssignment_4 )
            // InternalSynthesizer.g:1154:3: rule__Slider__XAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Slider__XAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSliderAccess().getXAssignment_4()); 

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
    // $ANTLR end "rule__Slider__Group__4__Impl"


    // $ANTLR start "rule__Slider__Group__5"
    // InternalSynthesizer.g:1162:1: rule__Slider__Group__5 : rule__Slider__Group__5__Impl rule__Slider__Group__6 ;
    public final void rule__Slider__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1166:1: ( rule__Slider__Group__5__Impl rule__Slider__Group__6 )
            // InternalSynthesizer.g:1167:2: rule__Slider__Group__5__Impl rule__Slider__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Slider__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Slider__Group__6();

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
    // $ANTLR end "rule__Slider__Group__5"


    // $ANTLR start "rule__Slider__Group__5__Impl"
    // InternalSynthesizer.g:1174:1: rule__Slider__Group__5__Impl : ( 'y' ) ;
    public final void rule__Slider__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1178:1: ( ( 'y' ) )
            // InternalSynthesizer.g:1179:1: ( 'y' )
            {
            // InternalSynthesizer.g:1179:1: ( 'y' )
            // InternalSynthesizer.g:1180:2: 'y'
            {
             before(grammarAccess.getSliderAccess().getYKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSliderAccess().getYKeyword_5()); 

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
    // $ANTLR end "rule__Slider__Group__5__Impl"


    // $ANTLR start "rule__Slider__Group__6"
    // InternalSynthesizer.g:1189:1: rule__Slider__Group__6 : rule__Slider__Group__6__Impl rule__Slider__Group__7 ;
    public final void rule__Slider__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1193:1: ( rule__Slider__Group__6__Impl rule__Slider__Group__7 )
            // InternalSynthesizer.g:1194:2: rule__Slider__Group__6__Impl rule__Slider__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__Slider__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Slider__Group__7();

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
    // $ANTLR end "rule__Slider__Group__6"


    // $ANTLR start "rule__Slider__Group__6__Impl"
    // InternalSynthesizer.g:1201:1: rule__Slider__Group__6__Impl : ( ( rule__Slider__YAssignment_6 ) ) ;
    public final void rule__Slider__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1205:1: ( ( ( rule__Slider__YAssignment_6 ) ) )
            // InternalSynthesizer.g:1206:1: ( ( rule__Slider__YAssignment_6 ) )
            {
            // InternalSynthesizer.g:1206:1: ( ( rule__Slider__YAssignment_6 ) )
            // InternalSynthesizer.g:1207:2: ( rule__Slider__YAssignment_6 )
            {
             before(grammarAccess.getSliderAccess().getYAssignment_6()); 
            // InternalSynthesizer.g:1208:2: ( rule__Slider__YAssignment_6 )
            // InternalSynthesizer.g:1208:3: rule__Slider__YAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Slider__YAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSliderAccess().getYAssignment_6()); 

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
    // $ANTLR end "rule__Slider__Group__6__Impl"


    // $ANTLR start "rule__Slider__Group__7"
    // InternalSynthesizer.g:1216:1: rule__Slider__Group__7 : rule__Slider__Group__7__Impl rule__Slider__Group__8 ;
    public final void rule__Slider__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1220:1: ( rule__Slider__Group__7__Impl rule__Slider__Group__8 )
            // InternalSynthesizer.g:1221:2: rule__Slider__Group__7__Impl rule__Slider__Group__8
            {
            pushFollow(FOLLOW_14);
            rule__Slider__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Slider__Group__8();

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
    // $ANTLR end "rule__Slider__Group__7"


    // $ANTLR start "rule__Slider__Group__7__Impl"
    // InternalSynthesizer.g:1228:1: rule__Slider__Group__7__Impl : ( 'width' ) ;
    public final void rule__Slider__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1232:1: ( ( 'width' ) )
            // InternalSynthesizer.g:1233:1: ( 'width' )
            {
            // InternalSynthesizer.g:1233:1: ( 'width' )
            // InternalSynthesizer.g:1234:2: 'width'
            {
             before(grammarAccess.getSliderAccess().getWidthKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSliderAccess().getWidthKeyword_7()); 

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
    // $ANTLR end "rule__Slider__Group__7__Impl"


    // $ANTLR start "rule__Slider__Group__8"
    // InternalSynthesizer.g:1243:1: rule__Slider__Group__8 : rule__Slider__Group__8__Impl rule__Slider__Group__9 ;
    public final void rule__Slider__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1247:1: ( rule__Slider__Group__8__Impl rule__Slider__Group__9 )
            // InternalSynthesizer.g:1248:2: rule__Slider__Group__8__Impl rule__Slider__Group__9
            {
            pushFollow(FOLLOW_17);
            rule__Slider__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Slider__Group__9();

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
    // $ANTLR end "rule__Slider__Group__8"


    // $ANTLR start "rule__Slider__Group__8__Impl"
    // InternalSynthesizer.g:1255:1: rule__Slider__Group__8__Impl : ( ( rule__Slider__WidthAssignment_8 ) ) ;
    public final void rule__Slider__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1259:1: ( ( ( rule__Slider__WidthAssignment_8 ) ) )
            // InternalSynthesizer.g:1260:1: ( ( rule__Slider__WidthAssignment_8 ) )
            {
            // InternalSynthesizer.g:1260:1: ( ( rule__Slider__WidthAssignment_8 ) )
            // InternalSynthesizer.g:1261:2: ( rule__Slider__WidthAssignment_8 )
            {
             before(grammarAccess.getSliderAccess().getWidthAssignment_8()); 
            // InternalSynthesizer.g:1262:2: ( rule__Slider__WidthAssignment_8 )
            // InternalSynthesizer.g:1262:3: rule__Slider__WidthAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Slider__WidthAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getSliderAccess().getWidthAssignment_8()); 

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
    // $ANTLR end "rule__Slider__Group__8__Impl"


    // $ANTLR start "rule__Slider__Group__9"
    // InternalSynthesizer.g:1270:1: rule__Slider__Group__9 : rule__Slider__Group__9__Impl rule__Slider__Group__10 ;
    public final void rule__Slider__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1274:1: ( rule__Slider__Group__9__Impl rule__Slider__Group__10 )
            // InternalSynthesizer.g:1275:2: rule__Slider__Group__9__Impl rule__Slider__Group__10
            {
            pushFollow(FOLLOW_14);
            rule__Slider__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Slider__Group__10();

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
    // $ANTLR end "rule__Slider__Group__9"


    // $ANTLR start "rule__Slider__Group__9__Impl"
    // InternalSynthesizer.g:1282:1: rule__Slider__Group__9__Impl : ( 'height' ) ;
    public final void rule__Slider__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1286:1: ( ( 'height' ) )
            // InternalSynthesizer.g:1287:1: ( 'height' )
            {
            // InternalSynthesizer.g:1287:1: ( 'height' )
            // InternalSynthesizer.g:1288:2: 'height'
            {
             before(grammarAccess.getSliderAccess().getHeightKeyword_9()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSliderAccess().getHeightKeyword_9()); 

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
    // $ANTLR end "rule__Slider__Group__9__Impl"


    // $ANTLR start "rule__Slider__Group__10"
    // InternalSynthesizer.g:1297:1: rule__Slider__Group__10 : rule__Slider__Group__10__Impl rule__Slider__Group__11 ;
    public final void rule__Slider__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1301:1: ( rule__Slider__Group__10__Impl rule__Slider__Group__11 )
            // InternalSynthesizer.g:1302:2: rule__Slider__Group__10__Impl rule__Slider__Group__11
            {
            pushFollow(FOLLOW_18);
            rule__Slider__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Slider__Group__11();

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
    // $ANTLR end "rule__Slider__Group__10"


    // $ANTLR start "rule__Slider__Group__10__Impl"
    // InternalSynthesizer.g:1309:1: rule__Slider__Group__10__Impl : ( ( rule__Slider__HeightAssignment_10 ) ) ;
    public final void rule__Slider__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1313:1: ( ( ( rule__Slider__HeightAssignment_10 ) ) )
            // InternalSynthesizer.g:1314:1: ( ( rule__Slider__HeightAssignment_10 ) )
            {
            // InternalSynthesizer.g:1314:1: ( ( rule__Slider__HeightAssignment_10 ) )
            // InternalSynthesizer.g:1315:2: ( rule__Slider__HeightAssignment_10 )
            {
             before(grammarAccess.getSliderAccess().getHeightAssignment_10()); 
            // InternalSynthesizer.g:1316:2: ( rule__Slider__HeightAssignment_10 )
            // InternalSynthesizer.g:1316:3: rule__Slider__HeightAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Slider__HeightAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getSliderAccess().getHeightAssignment_10()); 

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
    // $ANTLR end "rule__Slider__Group__10__Impl"


    // $ANTLR start "rule__Slider__Group__11"
    // InternalSynthesizer.g:1324:1: rule__Slider__Group__11 : rule__Slider__Group__11__Impl ;
    public final void rule__Slider__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1328:1: ( rule__Slider__Group__11__Impl )
            // InternalSynthesizer.g:1329:2: rule__Slider__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Slider__Group__11__Impl();

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
    // $ANTLR end "rule__Slider__Group__11"


    // $ANTLR start "rule__Slider__Group__11__Impl"
    // InternalSynthesizer.g:1335:1: rule__Slider__Group__11__Impl : ( ')' ) ;
    public final void rule__Slider__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1339:1: ( ( ')' ) )
            // InternalSynthesizer.g:1340:1: ( ')' )
            {
            // InternalSynthesizer.g:1340:1: ( ')' )
            // InternalSynthesizer.g:1341:2: ')'
            {
             before(grammarAccess.getSliderAccess().getRightParenthesisKeyword_11()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSliderAccess().getRightParenthesisKeyword_11()); 

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
    // $ANTLR end "rule__Slider__Group__11__Impl"


    // $ANTLR start "rule__Button__Group__0"
    // InternalSynthesizer.g:1351:1: rule__Button__Group__0 : rule__Button__Group__0__Impl rule__Button__Group__1 ;
    public final void rule__Button__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1355:1: ( rule__Button__Group__0__Impl rule__Button__Group__1 )
            // InternalSynthesizer.g:1356:2: rule__Button__Group__0__Impl rule__Button__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalSynthesizer.g:1363:1: rule__Button__Group__0__Impl : ( 'button' ) ;
    public final void rule__Button__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1367:1: ( ( 'button' ) )
            // InternalSynthesizer.g:1368:1: ( 'button' )
            {
            // InternalSynthesizer.g:1368:1: ( 'button' )
            // InternalSynthesizer.g:1369:2: 'button'
            {
             before(grammarAccess.getButtonAccess().getButtonKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSynthesizer.g:1378:1: rule__Button__Group__1 : rule__Button__Group__1__Impl rule__Button__Group__2 ;
    public final void rule__Button__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1382:1: ( rule__Button__Group__1__Impl rule__Button__Group__2 )
            // InternalSynthesizer.g:1383:2: rule__Button__Group__1__Impl rule__Button__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalSynthesizer.g:1390:1: rule__Button__Group__1__Impl : ( ( rule__Button__NameAssignment_1 ) ) ;
    public final void rule__Button__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1394:1: ( ( ( rule__Button__NameAssignment_1 ) ) )
            // InternalSynthesizer.g:1395:1: ( ( rule__Button__NameAssignment_1 ) )
            {
            // InternalSynthesizer.g:1395:1: ( ( rule__Button__NameAssignment_1 ) )
            // InternalSynthesizer.g:1396:2: ( rule__Button__NameAssignment_1 )
            {
             before(grammarAccess.getButtonAccess().getNameAssignment_1()); 
            // InternalSynthesizer.g:1397:2: ( rule__Button__NameAssignment_1 )
            // InternalSynthesizer.g:1397:3: rule__Button__NameAssignment_1
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
    // InternalSynthesizer.g:1405:1: rule__Button__Group__2 : rule__Button__Group__2__Impl rule__Button__Group__3 ;
    public final void rule__Button__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1409:1: ( rule__Button__Group__2__Impl rule__Button__Group__3 )
            // InternalSynthesizer.g:1410:2: rule__Button__Group__2__Impl rule__Button__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalSynthesizer.g:1417:1: rule__Button__Group__2__Impl : ( '(' ) ;
    public final void rule__Button__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1421:1: ( ( '(' ) )
            // InternalSynthesizer.g:1422:1: ( '(' )
            {
            // InternalSynthesizer.g:1422:1: ( '(' )
            // InternalSynthesizer.g:1423:2: '('
            {
             before(grammarAccess.getButtonAccess().getLeftParenthesisKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalSynthesizer.g:1432:1: rule__Button__Group__3 : rule__Button__Group__3__Impl rule__Button__Group__4 ;
    public final void rule__Button__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1436:1: ( rule__Button__Group__3__Impl rule__Button__Group__4 )
            // InternalSynthesizer.g:1437:2: rule__Button__Group__3__Impl rule__Button__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalSynthesizer.g:1444:1: rule__Button__Group__3__Impl : ( 'x' ) ;
    public final void rule__Button__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1448:1: ( ( 'x' ) )
            // InternalSynthesizer.g:1449:1: ( 'x' )
            {
            // InternalSynthesizer.g:1449:1: ( 'x' )
            // InternalSynthesizer.g:1450:2: 'x'
            {
             before(grammarAccess.getButtonAccess().getXKeyword_3()); 
            match(input,18,FOLLOW_2); 
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
    // InternalSynthesizer.g:1459:1: rule__Button__Group__4 : rule__Button__Group__4__Impl rule__Button__Group__5 ;
    public final void rule__Button__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1463:1: ( rule__Button__Group__4__Impl rule__Button__Group__5 )
            // InternalSynthesizer.g:1464:2: rule__Button__Group__4__Impl rule__Button__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalSynthesizer.g:1471:1: rule__Button__Group__4__Impl : ( ( rule__Button__XAssignment_4 ) ) ;
    public final void rule__Button__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1475:1: ( ( ( rule__Button__XAssignment_4 ) ) )
            // InternalSynthesizer.g:1476:1: ( ( rule__Button__XAssignment_4 ) )
            {
            // InternalSynthesizer.g:1476:1: ( ( rule__Button__XAssignment_4 ) )
            // InternalSynthesizer.g:1477:2: ( rule__Button__XAssignment_4 )
            {
             before(grammarAccess.getButtonAccess().getXAssignment_4()); 
            // InternalSynthesizer.g:1478:2: ( rule__Button__XAssignment_4 )
            // InternalSynthesizer.g:1478:3: rule__Button__XAssignment_4
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
    // InternalSynthesizer.g:1486:1: rule__Button__Group__5 : rule__Button__Group__5__Impl rule__Button__Group__6 ;
    public final void rule__Button__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1490:1: ( rule__Button__Group__5__Impl rule__Button__Group__6 )
            // InternalSynthesizer.g:1491:2: rule__Button__Group__5__Impl rule__Button__Group__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalSynthesizer.g:1498:1: rule__Button__Group__5__Impl : ( 'y' ) ;
    public final void rule__Button__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1502:1: ( ( 'y' ) )
            // InternalSynthesizer.g:1503:1: ( 'y' )
            {
            // InternalSynthesizer.g:1503:1: ( 'y' )
            // InternalSynthesizer.g:1504:2: 'y'
            {
             before(grammarAccess.getButtonAccess().getYKeyword_5()); 
            match(input,19,FOLLOW_2); 
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
    // InternalSynthesizer.g:1513:1: rule__Button__Group__6 : rule__Button__Group__6__Impl rule__Button__Group__7 ;
    public final void rule__Button__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1517:1: ( rule__Button__Group__6__Impl rule__Button__Group__7 )
            // InternalSynthesizer.g:1518:2: rule__Button__Group__6__Impl rule__Button__Group__7
            {
            pushFollow(FOLLOW_16);
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
    // InternalSynthesizer.g:1525:1: rule__Button__Group__6__Impl : ( ( rule__Button__YAssignment_6 ) ) ;
    public final void rule__Button__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1529:1: ( ( ( rule__Button__YAssignment_6 ) ) )
            // InternalSynthesizer.g:1530:1: ( ( rule__Button__YAssignment_6 ) )
            {
            // InternalSynthesizer.g:1530:1: ( ( rule__Button__YAssignment_6 ) )
            // InternalSynthesizer.g:1531:2: ( rule__Button__YAssignment_6 )
            {
             before(grammarAccess.getButtonAccess().getYAssignment_6()); 
            // InternalSynthesizer.g:1532:2: ( rule__Button__YAssignment_6 )
            // InternalSynthesizer.g:1532:3: rule__Button__YAssignment_6
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
    // InternalSynthesizer.g:1540:1: rule__Button__Group__7 : rule__Button__Group__7__Impl rule__Button__Group__8 ;
    public final void rule__Button__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1544:1: ( rule__Button__Group__7__Impl rule__Button__Group__8 )
            // InternalSynthesizer.g:1545:2: rule__Button__Group__7__Impl rule__Button__Group__8
            {
            pushFollow(FOLLOW_14);
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
    // InternalSynthesizer.g:1552:1: rule__Button__Group__7__Impl : ( 'width' ) ;
    public final void rule__Button__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1556:1: ( ( 'width' ) )
            // InternalSynthesizer.g:1557:1: ( 'width' )
            {
            // InternalSynthesizer.g:1557:1: ( 'width' )
            // InternalSynthesizer.g:1558:2: 'width'
            {
             before(grammarAccess.getButtonAccess().getWidthKeyword_7()); 
            match(input,20,FOLLOW_2); 
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
    // InternalSynthesizer.g:1567:1: rule__Button__Group__8 : rule__Button__Group__8__Impl rule__Button__Group__9 ;
    public final void rule__Button__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1571:1: ( rule__Button__Group__8__Impl rule__Button__Group__9 )
            // InternalSynthesizer.g:1572:2: rule__Button__Group__8__Impl rule__Button__Group__9
            {
            pushFollow(FOLLOW_17);
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
    // InternalSynthesizer.g:1579:1: rule__Button__Group__8__Impl : ( ( rule__Button__WidthAssignment_8 ) ) ;
    public final void rule__Button__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1583:1: ( ( ( rule__Button__WidthAssignment_8 ) ) )
            // InternalSynthesizer.g:1584:1: ( ( rule__Button__WidthAssignment_8 ) )
            {
            // InternalSynthesizer.g:1584:1: ( ( rule__Button__WidthAssignment_8 ) )
            // InternalSynthesizer.g:1585:2: ( rule__Button__WidthAssignment_8 )
            {
             before(grammarAccess.getButtonAccess().getWidthAssignment_8()); 
            // InternalSynthesizer.g:1586:2: ( rule__Button__WidthAssignment_8 )
            // InternalSynthesizer.g:1586:3: rule__Button__WidthAssignment_8
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
    // InternalSynthesizer.g:1594:1: rule__Button__Group__9 : rule__Button__Group__9__Impl rule__Button__Group__10 ;
    public final void rule__Button__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1598:1: ( rule__Button__Group__9__Impl rule__Button__Group__10 )
            // InternalSynthesizer.g:1599:2: rule__Button__Group__9__Impl rule__Button__Group__10
            {
            pushFollow(FOLLOW_14);
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
    // InternalSynthesizer.g:1606:1: rule__Button__Group__9__Impl : ( 'height' ) ;
    public final void rule__Button__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1610:1: ( ( 'height' ) )
            // InternalSynthesizer.g:1611:1: ( 'height' )
            {
            // InternalSynthesizer.g:1611:1: ( 'height' )
            // InternalSynthesizer.g:1612:2: 'height'
            {
             before(grammarAccess.getButtonAccess().getHeightKeyword_9()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSynthesizer.g:1621:1: rule__Button__Group__10 : rule__Button__Group__10__Impl rule__Button__Group__11 ;
    public final void rule__Button__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1625:1: ( rule__Button__Group__10__Impl rule__Button__Group__11 )
            // InternalSynthesizer.g:1626:2: rule__Button__Group__10__Impl rule__Button__Group__11
            {
            pushFollow(FOLLOW_19);
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
    // InternalSynthesizer.g:1633:1: rule__Button__Group__10__Impl : ( ( rule__Button__HeightAssignment_10 ) ) ;
    public final void rule__Button__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1637:1: ( ( ( rule__Button__HeightAssignment_10 ) ) )
            // InternalSynthesizer.g:1638:1: ( ( rule__Button__HeightAssignment_10 ) )
            {
            // InternalSynthesizer.g:1638:1: ( ( rule__Button__HeightAssignment_10 ) )
            // InternalSynthesizer.g:1639:2: ( rule__Button__HeightAssignment_10 )
            {
             before(grammarAccess.getButtonAccess().getHeightAssignment_10()); 
            // InternalSynthesizer.g:1640:2: ( rule__Button__HeightAssignment_10 )
            // InternalSynthesizer.g:1640:3: rule__Button__HeightAssignment_10
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
    // InternalSynthesizer.g:1648:1: rule__Button__Group__11 : rule__Button__Group__11__Impl rule__Button__Group__12 ;
    public final void rule__Button__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1652:1: ( rule__Button__Group__11__Impl rule__Button__Group__12 )
            // InternalSynthesizer.g:1653:2: rule__Button__Group__11__Impl rule__Button__Group__12
            {
            pushFollow(FOLLOW_14);
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
    // InternalSynthesizer.g:1660:1: rule__Button__Group__11__Impl : ( 'frequency' ) ;
    public final void rule__Button__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1664:1: ( ( 'frequency' ) )
            // InternalSynthesizer.g:1665:1: ( 'frequency' )
            {
            // InternalSynthesizer.g:1665:1: ( 'frequency' )
            // InternalSynthesizer.g:1666:2: 'frequency'
            {
             before(grammarAccess.getButtonAccess().getFrequencyKeyword_11()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSynthesizer.g:1675:1: rule__Button__Group__12 : rule__Button__Group__12__Impl rule__Button__Group__13 ;
    public final void rule__Button__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1679:1: ( rule__Button__Group__12__Impl rule__Button__Group__13 )
            // InternalSynthesizer.g:1680:2: rule__Button__Group__12__Impl rule__Button__Group__13
            {
            pushFollow(FOLLOW_18);
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
    // InternalSynthesizer.g:1687:1: rule__Button__Group__12__Impl : ( ( rule__Button__FrequencyAssignment_12 ) ) ;
    public final void rule__Button__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1691:1: ( ( ( rule__Button__FrequencyAssignment_12 ) ) )
            // InternalSynthesizer.g:1692:1: ( ( rule__Button__FrequencyAssignment_12 ) )
            {
            // InternalSynthesizer.g:1692:1: ( ( rule__Button__FrequencyAssignment_12 ) )
            // InternalSynthesizer.g:1693:2: ( rule__Button__FrequencyAssignment_12 )
            {
             before(grammarAccess.getButtonAccess().getFrequencyAssignment_12()); 
            // InternalSynthesizer.g:1694:2: ( rule__Button__FrequencyAssignment_12 )
            // InternalSynthesizer.g:1694:3: rule__Button__FrequencyAssignment_12
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
    // InternalSynthesizer.g:1702:1: rule__Button__Group__13 : rule__Button__Group__13__Impl ;
    public final void rule__Button__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1706:1: ( rule__Button__Group__13__Impl )
            // InternalSynthesizer.g:1707:2: rule__Button__Group__13__Impl
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
    // InternalSynthesizer.g:1713:1: rule__Button__Group__13__Impl : ( ')' ) ;
    public final void rule__Button__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1717:1: ( ( ')' ) )
            // InternalSynthesizer.g:1718:1: ( ')' )
            {
            // InternalSynthesizer.g:1718:1: ( ')' )
            // InternalSynthesizer.g:1719:2: ')'
            {
             before(grammarAccess.getButtonAccess().getRightParenthesisKeyword_13()); 
            match(input,22,FOLLOW_2); 
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


    // $ANTLR start "rule__ConnectionElement__Group__0"
    // InternalSynthesizer.g:1729:1: rule__ConnectionElement__Group__0 : rule__ConnectionElement__Group__0__Impl rule__ConnectionElement__Group__1 ;
    public final void rule__ConnectionElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1733:1: ( rule__ConnectionElement__Group__0__Impl rule__ConnectionElement__Group__1 )
            // InternalSynthesizer.g:1734:2: rule__ConnectionElement__Group__0__Impl rule__ConnectionElement__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalSynthesizer.g:1741:1: rule__ConnectionElement__Group__0__Impl : ( 'linear' ) ;
    public final void rule__ConnectionElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1745:1: ( ( 'linear' ) )
            // InternalSynthesizer.g:1746:1: ( 'linear' )
            {
            // InternalSynthesizer.g:1746:1: ( 'linear' )
            // InternalSynthesizer.g:1747:2: 'linear'
            {
             before(grammarAccess.getConnectionElementAccess().getLinearKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSynthesizer.g:1756:1: rule__ConnectionElement__Group__1 : rule__ConnectionElement__Group__1__Impl rule__ConnectionElement__Group__2 ;
    public final void rule__ConnectionElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1760:1: ( rule__ConnectionElement__Group__1__Impl rule__ConnectionElement__Group__2 )
            // InternalSynthesizer.g:1761:2: rule__ConnectionElement__Group__1__Impl rule__ConnectionElement__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalSynthesizer.g:1768:1: rule__ConnectionElement__Group__1__Impl : ( ( rule__ConnectionElement__CeAssignment_1 ) ) ;
    public final void rule__ConnectionElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1772:1: ( ( ( rule__ConnectionElement__CeAssignment_1 ) ) )
            // InternalSynthesizer.g:1773:1: ( ( rule__ConnectionElement__CeAssignment_1 ) )
            {
            // InternalSynthesizer.g:1773:1: ( ( rule__ConnectionElement__CeAssignment_1 ) )
            // InternalSynthesizer.g:1774:2: ( rule__ConnectionElement__CeAssignment_1 )
            {
             before(grammarAccess.getConnectionElementAccess().getCeAssignment_1()); 
            // InternalSynthesizer.g:1775:2: ( rule__ConnectionElement__CeAssignment_1 )
            // InternalSynthesizer.g:1775:3: rule__ConnectionElement__CeAssignment_1
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
    // InternalSynthesizer.g:1783:1: rule__ConnectionElement__Group__2 : rule__ConnectionElement__Group__2__Impl ;
    public final void rule__ConnectionElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1787:1: ( rule__ConnectionElement__Group__2__Impl )
            // InternalSynthesizer.g:1788:2: rule__ConnectionElement__Group__2__Impl
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
    // InternalSynthesizer.g:1794:1: rule__ConnectionElement__Group__2__Impl : ( ( rule__ConnectionElement__SeAssignment_2 ) ) ;
    public final void rule__ConnectionElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1798:1: ( ( ( rule__ConnectionElement__SeAssignment_2 ) ) )
            // InternalSynthesizer.g:1799:1: ( ( rule__ConnectionElement__SeAssignment_2 ) )
            {
            // InternalSynthesizer.g:1799:1: ( ( rule__ConnectionElement__SeAssignment_2 ) )
            // InternalSynthesizer.g:1800:2: ( rule__ConnectionElement__SeAssignment_2 )
            {
             before(grammarAccess.getConnectionElementAccess().getSeAssignment_2()); 
            // InternalSynthesizer.g:1801:2: ( rule__ConnectionElement__SeAssignment_2 )
            // InternalSynthesizer.g:1801:3: rule__ConnectionElement__SeAssignment_2
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


    // $ANTLR start "rule__SawToothOscillator__Group__0"
    // InternalSynthesizer.g:1810:1: rule__SawToothOscillator__Group__0 : rule__SawToothOscillator__Group__0__Impl rule__SawToothOscillator__Group__1 ;
    public final void rule__SawToothOscillator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1814:1: ( rule__SawToothOscillator__Group__0__Impl rule__SawToothOscillator__Group__1 )
            // InternalSynthesizer.g:1815:2: rule__SawToothOscillator__Group__0__Impl rule__SawToothOscillator__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalSynthesizer.g:1822:1: rule__SawToothOscillator__Group__0__Impl : ( 'sawToothOscillator' ) ;
    public final void rule__SawToothOscillator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1826:1: ( ( 'sawToothOscillator' ) )
            // InternalSynthesizer.g:1827:1: ( 'sawToothOscillator' )
            {
            // InternalSynthesizer.g:1827:1: ( 'sawToothOscillator' )
            // InternalSynthesizer.g:1828:2: 'sawToothOscillator'
            {
             before(grammarAccess.getSawToothOscillatorAccess().getSawToothOscillatorKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSynthesizer.g:1837:1: rule__SawToothOscillator__Group__1 : rule__SawToothOscillator__Group__1__Impl rule__SawToothOscillator__Group__2 ;
    public final void rule__SawToothOscillator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1841:1: ( rule__SawToothOscillator__Group__1__Impl rule__SawToothOscillator__Group__2 )
            // InternalSynthesizer.g:1842:2: rule__SawToothOscillator__Group__1__Impl rule__SawToothOscillator__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalSynthesizer.g:1849:1: rule__SawToothOscillator__Group__1__Impl : ( ( rule__SawToothOscillator__NameAssignment_1 ) ) ;
    public final void rule__SawToothOscillator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1853:1: ( ( ( rule__SawToothOscillator__NameAssignment_1 ) ) )
            // InternalSynthesizer.g:1854:1: ( ( rule__SawToothOscillator__NameAssignment_1 ) )
            {
            // InternalSynthesizer.g:1854:1: ( ( rule__SawToothOscillator__NameAssignment_1 ) )
            // InternalSynthesizer.g:1855:2: ( rule__SawToothOscillator__NameAssignment_1 )
            {
             before(grammarAccess.getSawToothOscillatorAccess().getNameAssignment_1()); 
            // InternalSynthesizer.g:1856:2: ( rule__SawToothOscillator__NameAssignment_1 )
            // InternalSynthesizer.g:1856:3: rule__SawToothOscillator__NameAssignment_1
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
    // InternalSynthesizer.g:1864:1: rule__SawToothOscillator__Group__2 : rule__SawToothOscillator__Group__2__Impl rule__SawToothOscillator__Group__3 ;
    public final void rule__SawToothOscillator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1868:1: ( rule__SawToothOscillator__Group__2__Impl rule__SawToothOscillator__Group__3 )
            // InternalSynthesizer.g:1869:2: rule__SawToothOscillator__Group__2__Impl rule__SawToothOscillator__Group__3
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
    // InternalSynthesizer.g:1876:1: rule__SawToothOscillator__Group__2__Impl : ( '(' ) ;
    public final void rule__SawToothOscillator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1880:1: ( ( '(' ) )
            // InternalSynthesizer.g:1881:1: ( '(' )
            {
            // InternalSynthesizer.g:1881:1: ( '(' )
            // InternalSynthesizer.g:1882:2: '('
            {
             before(grammarAccess.getSawToothOscillatorAccess().getLeftParenthesisKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalSynthesizer.g:1891:1: rule__SawToothOscillator__Group__3 : rule__SawToothOscillator__Group__3__Impl rule__SawToothOscillator__Group__4 ;
    public final void rule__SawToothOscillator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1895:1: ( rule__SawToothOscillator__Group__3__Impl rule__SawToothOscillator__Group__4 )
            // InternalSynthesizer.g:1896:2: rule__SawToothOscillator__Group__3__Impl rule__SawToothOscillator__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalSynthesizer.g:1903:1: rule__SawToothOscillator__Group__3__Impl : ( 'min' ) ;
    public final void rule__SawToothOscillator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1907:1: ( ( 'min' ) )
            // InternalSynthesizer.g:1908:1: ( 'min' )
            {
            // InternalSynthesizer.g:1908:1: ( 'min' )
            // InternalSynthesizer.g:1909:2: 'min'
            {
             before(grammarAccess.getSawToothOscillatorAccess().getMinKeyword_3()); 
            match(input,28,FOLLOW_2); 
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
    // InternalSynthesizer.g:1918:1: rule__SawToothOscillator__Group__4 : rule__SawToothOscillator__Group__4__Impl rule__SawToothOscillator__Group__5 ;
    public final void rule__SawToothOscillator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1922:1: ( rule__SawToothOscillator__Group__4__Impl rule__SawToothOscillator__Group__5 )
            // InternalSynthesizer.g:1923:2: rule__SawToothOscillator__Group__4__Impl rule__SawToothOscillator__Group__5
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
    // InternalSynthesizer.g:1930:1: rule__SawToothOscillator__Group__4__Impl : ( ( rule__SawToothOscillator__MinAssignment_4 ) ) ;
    public final void rule__SawToothOscillator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1934:1: ( ( ( rule__SawToothOscillator__MinAssignment_4 ) ) )
            // InternalSynthesizer.g:1935:1: ( ( rule__SawToothOscillator__MinAssignment_4 ) )
            {
            // InternalSynthesizer.g:1935:1: ( ( rule__SawToothOscillator__MinAssignment_4 ) )
            // InternalSynthesizer.g:1936:2: ( rule__SawToothOscillator__MinAssignment_4 )
            {
             before(grammarAccess.getSawToothOscillatorAccess().getMinAssignment_4()); 
            // InternalSynthesizer.g:1937:2: ( rule__SawToothOscillator__MinAssignment_4 )
            // InternalSynthesizer.g:1937:3: rule__SawToothOscillator__MinAssignment_4
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
    // InternalSynthesizer.g:1945:1: rule__SawToothOscillator__Group__5 : rule__SawToothOscillator__Group__5__Impl rule__SawToothOscillator__Group__6 ;
    public final void rule__SawToothOscillator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1949:1: ( rule__SawToothOscillator__Group__5__Impl rule__SawToothOscillator__Group__6 )
            // InternalSynthesizer.g:1950:2: rule__SawToothOscillator__Group__5__Impl rule__SawToothOscillator__Group__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalSynthesizer.g:1957:1: rule__SawToothOscillator__Group__5__Impl : ( 'max' ) ;
    public final void rule__SawToothOscillator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1961:1: ( ( 'max' ) )
            // InternalSynthesizer.g:1962:1: ( 'max' )
            {
            // InternalSynthesizer.g:1962:1: ( 'max' )
            // InternalSynthesizer.g:1963:2: 'max'
            {
             before(grammarAccess.getSawToothOscillatorAccess().getMaxKeyword_5()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSynthesizer.g:1972:1: rule__SawToothOscillator__Group__6 : rule__SawToothOscillator__Group__6__Impl rule__SawToothOscillator__Group__7 ;
    public final void rule__SawToothOscillator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1976:1: ( rule__SawToothOscillator__Group__6__Impl rule__SawToothOscillator__Group__7 )
            // InternalSynthesizer.g:1977:2: rule__SawToothOscillator__Group__6__Impl rule__SawToothOscillator__Group__7
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
    // InternalSynthesizer.g:1984:1: rule__SawToothOscillator__Group__6__Impl : ( ( rule__SawToothOscillator__MaxAssignment_6 ) ) ;
    public final void rule__SawToothOscillator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1988:1: ( ( ( rule__SawToothOscillator__MaxAssignment_6 ) ) )
            // InternalSynthesizer.g:1989:1: ( ( rule__SawToothOscillator__MaxAssignment_6 ) )
            {
            // InternalSynthesizer.g:1989:1: ( ( rule__SawToothOscillator__MaxAssignment_6 ) )
            // InternalSynthesizer.g:1990:2: ( rule__SawToothOscillator__MaxAssignment_6 )
            {
             before(grammarAccess.getSawToothOscillatorAccess().getMaxAssignment_6()); 
            // InternalSynthesizer.g:1991:2: ( rule__SawToothOscillator__MaxAssignment_6 )
            // InternalSynthesizer.g:1991:3: rule__SawToothOscillator__MaxAssignment_6
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
    // InternalSynthesizer.g:1999:1: rule__SawToothOscillator__Group__7 : rule__SawToothOscillator__Group__7__Impl rule__SawToothOscillator__Group__8 ;
    public final void rule__SawToothOscillator__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2003:1: ( rule__SawToothOscillator__Group__7__Impl rule__SawToothOscillator__Group__8 )
            // InternalSynthesizer.g:2004:2: rule__SawToothOscillator__Group__7__Impl rule__SawToothOscillator__Group__8
            {
            pushFollow(FOLLOW_14);
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
    // InternalSynthesizer.g:2011:1: rule__SawToothOscillator__Group__7__Impl : ( 'default' ) ;
    public final void rule__SawToothOscillator__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2015:1: ( ( 'default' ) )
            // InternalSynthesizer.g:2016:1: ( 'default' )
            {
            // InternalSynthesizer.g:2016:1: ( 'default' )
            // InternalSynthesizer.g:2017:2: 'default'
            {
             before(grammarAccess.getSawToothOscillatorAccess().getDefaultKeyword_7()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSynthesizer.g:2026:1: rule__SawToothOscillator__Group__8 : rule__SawToothOscillator__Group__8__Impl rule__SawToothOscillator__Group__9 ;
    public final void rule__SawToothOscillator__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2030:1: ( rule__SawToothOscillator__Group__8__Impl rule__SawToothOscillator__Group__9 )
            // InternalSynthesizer.g:2031:2: rule__SawToothOscillator__Group__8__Impl rule__SawToothOscillator__Group__9
            {
            pushFollow(FOLLOW_18);
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
    // InternalSynthesizer.g:2038:1: rule__SawToothOscillator__Group__8__Impl : ( ( rule__SawToothOscillator__DefaultAssignment_8 ) ) ;
    public final void rule__SawToothOscillator__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2042:1: ( ( ( rule__SawToothOscillator__DefaultAssignment_8 ) ) )
            // InternalSynthesizer.g:2043:1: ( ( rule__SawToothOscillator__DefaultAssignment_8 ) )
            {
            // InternalSynthesizer.g:2043:1: ( ( rule__SawToothOscillator__DefaultAssignment_8 ) )
            // InternalSynthesizer.g:2044:2: ( rule__SawToothOscillator__DefaultAssignment_8 )
            {
             before(grammarAccess.getSawToothOscillatorAccess().getDefaultAssignment_8()); 
            // InternalSynthesizer.g:2045:2: ( rule__SawToothOscillator__DefaultAssignment_8 )
            // InternalSynthesizer.g:2045:3: rule__SawToothOscillator__DefaultAssignment_8
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
    // InternalSynthesizer.g:2053:1: rule__SawToothOscillator__Group__9 : rule__SawToothOscillator__Group__9__Impl ;
    public final void rule__SawToothOscillator__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2057:1: ( rule__SawToothOscillator__Group__9__Impl )
            // InternalSynthesizer.g:2058:2: rule__SawToothOscillator__Group__9__Impl
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
    // InternalSynthesizer.g:2064:1: rule__SawToothOscillator__Group__9__Impl : ( ')' ) ;
    public final void rule__SawToothOscillator__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2068:1: ( ( ')' ) )
            // InternalSynthesizer.g:2069:1: ( ')' )
            {
            // InternalSynthesizer.g:2069:1: ( ')' )
            // InternalSynthesizer.g:2070:2: ')'
            {
             before(grammarAccess.getSawToothOscillatorAccess().getRightParenthesisKeyword_9()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSynthesizer.g:2080:1: rule__SineOscillator__Group__0 : rule__SineOscillator__Group__0__Impl rule__SineOscillator__Group__1 ;
    public final void rule__SineOscillator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2084:1: ( rule__SineOscillator__Group__0__Impl rule__SineOscillator__Group__1 )
            // InternalSynthesizer.g:2085:2: rule__SineOscillator__Group__0__Impl rule__SineOscillator__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalSynthesizer.g:2092:1: rule__SineOscillator__Group__0__Impl : ( 'sineOscillator' ) ;
    public final void rule__SineOscillator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2096:1: ( ( 'sineOscillator' ) )
            // InternalSynthesizer.g:2097:1: ( 'sineOscillator' )
            {
            // InternalSynthesizer.g:2097:1: ( 'sineOscillator' )
            // InternalSynthesizer.g:2098:2: 'sineOscillator'
            {
             before(grammarAccess.getSineOscillatorAccess().getSineOscillatorKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSynthesizer.g:2107:1: rule__SineOscillator__Group__1 : rule__SineOscillator__Group__1__Impl rule__SineOscillator__Group__2 ;
    public final void rule__SineOscillator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2111:1: ( rule__SineOscillator__Group__1__Impl rule__SineOscillator__Group__2 )
            // InternalSynthesizer.g:2112:2: rule__SineOscillator__Group__1__Impl rule__SineOscillator__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalSynthesizer.g:2119:1: rule__SineOscillator__Group__1__Impl : ( ( rule__SineOscillator__NameAssignment_1 ) ) ;
    public final void rule__SineOscillator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2123:1: ( ( ( rule__SineOscillator__NameAssignment_1 ) ) )
            // InternalSynthesizer.g:2124:1: ( ( rule__SineOscillator__NameAssignment_1 ) )
            {
            // InternalSynthesizer.g:2124:1: ( ( rule__SineOscillator__NameAssignment_1 ) )
            // InternalSynthesizer.g:2125:2: ( rule__SineOscillator__NameAssignment_1 )
            {
             before(grammarAccess.getSineOscillatorAccess().getNameAssignment_1()); 
            // InternalSynthesizer.g:2126:2: ( rule__SineOscillator__NameAssignment_1 )
            // InternalSynthesizer.g:2126:3: rule__SineOscillator__NameAssignment_1
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
    // InternalSynthesizer.g:2134:1: rule__SineOscillator__Group__2 : rule__SineOscillator__Group__2__Impl rule__SineOscillator__Group__3 ;
    public final void rule__SineOscillator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2138:1: ( rule__SineOscillator__Group__2__Impl rule__SineOscillator__Group__3 )
            // InternalSynthesizer.g:2139:2: rule__SineOscillator__Group__2__Impl rule__SineOscillator__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalSynthesizer.g:2146:1: rule__SineOscillator__Group__2__Impl : ( '(' ) ;
    public final void rule__SineOscillator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2150:1: ( ( '(' ) )
            // InternalSynthesizer.g:2151:1: ( '(' )
            {
            // InternalSynthesizer.g:2151:1: ( '(' )
            // InternalSynthesizer.g:2152:2: '('
            {
             before(grammarAccess.getSineOscillatorAccess().getLeftParenthesisKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalSynthesizer.g:2161:1: rule__SineOscillator__Group__3 : rule__SineOscillator__Group__3__Impl rule__SineOscillator__Group__4 ;
    public final void rule__SineOscillator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2165:1: ( rule__SineOscillator__Group__3__Impl rule__SineOscillator__Group__4 )
            // InternalSynthesizer.g:2166:2: rule__SineOscillator__Group__3__Impl rule__SineOscillator__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalSynthesizer.g:2173:1: rule__SineOscillator__Group__3__Impl : ( 'frequency' ) ;
    public final void rule__SineOscillator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2177:1: ( ( 'frequency' ) )
            // InternalSynthesizer.g:2178:1: ( 'frequency' )
            {
            // InternalSynthesizer.g:2178:1: ( 'frequency' )
            // InternalSynthesizer.g:2179:2: 'frequency'
            {
             before(grammarAccess.getSineOscillatorAccess().getFrequencyKeyword_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSynthesizer.g:2188:1: rule__SineOscillator__Group__4 : rule__SineOscillator__Group__4__Impl rule__SineOscillator__Group__5 ;
    public final void rule__SineOscillator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2192:1: ( rule__SineOscillator__Group__4__Impl rule__SineOscillator__Group__5 )
            // InternalSynthesizer.g:2193:2: rule__SineOscillator__Group__4__Impl rule__SineOscillator__Group__5
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
    // InternalSynthesizer.g:2200:1: rule__SineOscillator__Group__4__Impl : ( ( rule__SineOscillator__FrequencyAssignment_4 ) ) ;
    public final void rule__SineOscillator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2204:1: ( ( ( rule__SineOscillator__FrequencyAssignment_4 ) ) )
            // InternalSynthesizer.g:2205:1: ( ( rule__SineOscillator__FrequencyAssignment_4 ) )
            {
            // InternalSynthesizer.g:2205:1: ( ( rule__SineOscillator__FrequencyAssignment_4 ) )
            // InternalSynthesizer.g:2206:2: ( rule__SineOscillator__FrequencyAssignment_4 )
            {
             before(grammarAccess.getSineOscillatorAccess().getFrequencyAssignment_4()); 
            // InternalSynthesizer.g:2207:2: ( rule__SineOscillator__FrequencyAssignment_4 )
            // InternalSynthesizer.g:2207:3: rule__SineOscillator__FrequencyAssignment_4
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
    // InternalSynthesizer.g:2215:1: rule__SineOscillator__Group__5 : rule__SineOscillator__Group__5__Impl rule__SineOscillator__Group__6 ;
    public final void rule__SineOscillator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2219:1: ( rule__SineOscillator__Group__5__Impl rule__SineOscillator__Group__6 )
            // InternalSynthesizer.g:2220:2: rule__SineOscillator__Group__5__Impl rule__SineOscillator__Group__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalSynthesizer.g:2227:1: rule__SineOscillator__Group__5__Impl : ( 'amplitude' ) ;
    public final void rule__SineOscillator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2231:1: ( ( 'amplitude' ) )
            // InternalSynthesizer.g:2232:1: ( 'amplitude' )
            {
            // InternalSynthesizer.g:2232:1: ( 'amplitude' )
            // InternalSynthesizer.g:2233:2: 'amplitude'
            {
             before(grammarAccess.getSineOscillatorAccess().getAmplitudeKeyword_5()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSynthesizer.g:2242:1: rule__SineOscillator__Group__6 : rule__SineOscillator__Group__6__Impl rule__SineOscillator__Group__7 ;
    public final void rule__SineOscillator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2246:1: ( rule__SineOscillator__Group__6__Impl rule__SineOscillator__Group__7 )
            // InternalSynthesizer.g:2247:2: rule__SineOscillator__Group__6__Impl rule__SineOscillator__Group__7
            {
            pushFollow(FOLLOW_18);
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
    // InternalSynthesizer.g:2254:1: rule__SineOscillator__Group__6__Impl : ( ( rule__SineOscillator__AmplitudeAssignment_6 ) ) ;
    public final void rule__SineOscillator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2258:1: ( ( ( rule__SineOscillator__AmplitudeAssignment_6 ) ) )
            // InternalSynthesizer.g:2259:1: ( ( rule__SineOscillator__AmplitudeAssignment_6 ) )
            {
            // InternalSynthesizer.g:2259:1: ( ( rule__SineOscillator__AmplitudeAssignment_6 ) )
            // InternalSynthesizer.g:2260:2: ( rule__SineOscillator__AmplitudeAssignment_6 )
            {
             before(grammarAccess.getSineOscillatorAccess().getAmplitudeAssignment_6()); 
            // InternalSynthesizer.g:2261:2: ( rule__SineOscillator__AmplitudeAssignment_6 )
            // InternalSynthesizer.g:2261:3: rule__SineOscillator__AmplitudeAssignment_6
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
    // InternalSynthesizer.g:2269:1: rule__SineOscillator__Group__7 : rule__SineOscillator__Group__7__Impl ;
    public final void rule__SineOscillator__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2273:1: ( rule__SineOscillator__Group__7__Impl )
            // InternalSynthesizer.g:2274:2: rule__SineOscillator__Group__7__Impl
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
    // InternalSynthesizer.g:2280:1: rule__SineOscillator__Group__7__Impl : ( ')' ) ;
    public final void rule__SineOscillator__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2284:1: ( ( ')' ) )
            // InternalSynthesizer.g:2285:1: ( ')' )
            {
            // InternalSynthesizer.g:2285:1: ( ')' )
            // InternalSynthesizer.g:2286:2: ')'
            {
             before(grammarAccess.getSineOscillatorAccess().getRightParenthesisKeyword_7()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSynthesizer.g:2296:1: rule__Model__ControlsAssignment_2 : ( ruleControlElement ) ;
    public final void rule__Model__ControlsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2300:1: ( ( ruleControlElement ) )
            // InternalSynthesizer.g:2301:2: ( ruleControlElement )
            {
            // InternalSynthesizer.g:2301:2: ( ruleControlElement )
            // InternalSynthesizer.g:2302:3: ruleControlElement
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
    // InternalSynthesizer.g:2311:1: rule__Model__SoundsAssignment_4_2 : ( ruleSoundElement ) ;
    public final void rule__Model__SoundsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2315:1: ( ( ruleSoundElement ) )
            // InternalSynthesizer.g:2316:2: ( ruleSoundElement )
            {
            // InternalSynthesizer.g:2316:2: ( ruleSoundElement )
            // InternalSynthesizer.g:2317:3: ruleSoundElement
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
    // InternalSynthesizer.g:2326:1: rule__Model__ConnectionsAssignment_5_2 : ( ruleConnectionElement ) ;
    public final void rule__Model__ConnectionsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2330:1: ( ( ruleConnectionElement ) )
            // InternalSynthesizer.g:2331:2: ( ruleConnectionElement )
            {
            // InternalSynthesizer.g:2331:2: ( ruleConnectionElement )
            // InternalSynthesizer.g:2332:3: ruleConnectionElement
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


    // $ANTLR start "rule__RotaryKnob__NameAssignment_1"
    // InternalSynthesizer.g:2341:1: rule__RotaryKnob__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RotaryKnob__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2345:1: ( ( RULE_ID ) )
            // InternalSynthesizer.g:2346:2: ( RULE_ID )
            {
            // InternalSynthesizer.g:2346:2: ( RULE_ID )
            // InternalSynthesizer.g:2347:3: RULE_ID
            {
             before(grammarAccess.getRotaryKnobAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRotaryKnobAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__RotaryKnob__NameAssignment_1"


    // $ANTLR start "rule__RotaryKnob__XAssignment_4"
    // InternalSynthesizer.g:2356:1: rule__RotaryKnob__XAssignment_4 : ( RULE_INT ) ;
    public final void rule__RotaryKnob__XAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2360:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:2361:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:2361:2: ( RULE_INT )
            // InternalSynthesizer.g:2362:3: RULE_INT
            {
             before(grammarAccess.getRotaryKnobAccess().getXINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRotaryKnobAccess().getXINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__RotaryKnob__XAssignment_4"


    // $ANTLR start "rule__RotaryKnob__YAssignment_6"
    // InternalSynthesizer.g:2371:1: rule__RotaryKnob__YAssignment_6 : ( RULE_INT ) ;
    public final void rule__RotaryKnob__YAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2375:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:2376:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:2376:2: ( RULE_INT )
            // InternalSynthesizer.g:2377:3: RULE_INT
            {
             before(grammarAccess.getRotaryKnobAccess().getYINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRotaryKnobAccess().getYINTTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__RotaryKnob__YAssignment_6"


    // $ANTLR start "rule__RotaryKnob__WidthAssignment_8"
    // InternalSynthesizer.g:2386:1: rule__RotaryKnob__WidthAssignment_8 : ( RULE_INT ) ;
    public final void rule__RotaryKnob__WidthAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2390:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:2391:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:2391:2: ( RULE_INT )
            // InternalSynthesizer.g:2392:3: RULE_INT
            {
             before(grammarAccess.getRotaryKnobAccess().getWidthINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRotaryKnobAccess().getWidthINTTerminalRuleCall_8_0()); 

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
    // $ANTLR end "rule__RotaryKnob__WidthAssignment_8"


    // $ANTLR start "rule__RotaryKnob__HeightAssignment_10"
    // InternalSynthesizer.g:2401:1: rule__RotaryKnob__HeightAssignment_10 : ( RULE_INT ) ;
    public final void rule__RotaryKnob__HeightAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2405:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:2406:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:2406:2: ( RULE_INT )
            // InternalSynthesizer.g:2407:3: RULE_INT
            {
             before(grammarAccess.getRotaryKnobAccess().getHeightINTTerminalRuleCall_10_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRotaryKnobAccess().getHeightINTTerminalRuleCall_10_0()); 

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
    // $ANTLR end "rule__RotaryKnob__HeightAssignment_10"


    // $ANTLR start "rule__Slider__NameAssignment_1"
    // InternalSynthesizer.g:2416:1: rule__Slider__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Slider__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2420:1: ( ( RULE_ID ) )
            // InternalSynthesizer.g:2421:2: ( RULE_ID )
            {
            // InternalSynthesizer.g:2421:2: ( RULE_ID )
            // InternalSynthesizer.g:2422:3: RULE_ID
            {
             before(grammarAccess.getSliderAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSliderAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Slider__NameAssignment_1"


    // $ANTLR start "rule__Slider__XAssignment_4"
    // InternalSynthesizer.g:2431:1: rule__Slider__XAssignment_4 : ( RULE_INT ) ;
    public final void rule__Slider__XAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2435:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:2436:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:2436:2: ( RULE_INT )
            // InternalSynthesizer.g:2437:3: RULE_INT
            {
             before(grammarAccess.getSliderAccess().getXINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSliderAccess().getXINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Slider__XAssignment_4"


    // $ANTLR start "rule__Slider__YAssignment_6"
    // InternalSynthesizer.g:2446:1: rule__Slider__YAssignment_6 : ( RULE_INT ) ;
    public final void rule__Slider__YAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2450:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:2451:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:2451:2: ( RULE_INT )
            // InternalSynthesizer.g:2452:3: RULE_INT
            {
             before(grammarAccess.getSliderAccess().getYINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSliderAccess().getYINTTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__Slider__YAssignment_6"


    // $ANTLR start "rule__Slider__WidthAssignment_8"
    // InternalSynthesizer.g:2461:1: rule__Slider__WidthAssignment_8 : ( RULE_INT ) ;
    public final void rule__Slider__WidthAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2465:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:2466:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:2466:2: ( RULE_INT )
            // InternalSynthesizer.g:2467:3: RULE_INT
            {
             before(grammarAccess.getSliderAccess().getWidthINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSliderAccess().getWidthINTTerminalRuleCall_8_0()); 

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
    // $ANTLR end "rule__Slider__WidthAssignment_8"


    // $ANTLR start "rule__Slider__HeightAssignment_10"
    // InternalSynthesizer.g:2476:1: rule__Slider__HeightAssignment_10 : ( RULE_INT ) ;
    public final void rule__Slider__HeightAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2480:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:2481:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:2481:2: ( RULE_INT )
            // InternalSynthesizer.g:2482:3: RULE_INT
            {
             before(grammarAccess.getSliderAccess().getHeightINTTerminalRuleCall_10_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSliderAccess().getHeightINTTerminalRuleCall_10_0()); 

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
    // $ANTLR end "rule__Slider__HeightAssignment_10"


    // $ANTLR start "rule__Button__NameAssignment_1"
    // InternalSynthesizer.g:2491:1: rule__Button__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Button__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2495:1: ( ( RULE_ID ) )
            // InternalSynthesizer.g:2496:2: ( RULE_ID )
            {
            // InternalSynthesizer.g:2496:2: ( RULE_ID )
            // InternalSynthesizer.g:2497:3: RULE_ID
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
    // InternalSynthesizer.g:2506:1: rule__Button__XAssignment_4 : ( RULE_INT ) ;
    public final void rule__Button__XAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2510:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:2511:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:2511:2: ( RULE_INT )
            // InternalSynthesizer.g:2512:3: RULE_INT
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
    // InternalSynthesizer.g:2521:1: rule__Button__YAssignment_6 : ( RULE_INT ) ;
    public final void rule__Button__YAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2525:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:2526:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:2526:2: ( RULE_INT )
            // InternalSynthesizer.g:2527:3: RULE_INT
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
    // InternalSynthesizer.g:2536:1: rule__Button__WidthAssignment_8 : ( RULE_INT ) ;
    public final void rule__Button__WidthAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2540:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:2541:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:2541:2: ( RULE_INT )
            // InternalSynthesizer.g:2542:3: RULE_INT
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
    // InternalSynthesizer.g:2551:1: rule__Button__HeightAssignment_10 : ( RULE_INT ) ;
    public final void rule__Button__HeightAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2555:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:2556:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:2556:2: ( RULE_INT )
            // InternalSynthesizer.g:2557:3: RULE_INT
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
    // InternalSynthesizer.g:2566:1: rule__Button__FrequencyAssignment_12 : ( RULE_INT ) ;
    public final void rule__Button__FrequencyAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2570:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:2571:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:2571:2: ( RULE_INT )
            // InternalSynthesizer.g:2572:3: RULE_INT
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


    // $ANTLR start "rule__ConnectionElement__CeAssignment_1"
    // InternalSynthesizer.g:2581:1: rule__ConnectionElement__CeAssignment_1 : ( ruleControlElement ) ;
    public final void rule__ConnectionElement__CeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2585:1: ( ( ruleControlElement ) )
            // InternalSynthesizer.g:2586:2: ( ruleControlElement )
            {
            // InternalSynthesizer.g:2586:2: ( ruleControlElement )
            // InternalSynthesizer.g:2587:3: ruleControlElement
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
    // InternalSynthesizer.g:2596:1: rule__ConnectionElement__SeAssignment_2 : ( ruleSoundElement ) ;
    public final void rule__ConnectionElement__SeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2600:1: ( ( ruleSoundElement ) )
            // InternalSynthesizer.g:2601:2: ( ruleSoundElement )
            {
            // InternalSynthesizer.g:2601:2: ( ruleSoundElement )
            // InternalSynthesizer.g:2602:3: ruleSoundElement
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


    // $ANTLR start "rule__SawToothOscillator__NameAssignment_1"
    // InternalSynthesizer.g:2611:1: rule__SawToothOscillator__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SawToothOscillator__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2615:1: ( ( RULE_ID ) )
            // InternalSynthesizer.g:2616:2: ( RULE_ID )
            {
            // InternalSynthesizer.g:2616:2: ( RULE_ID )
            // InternalSynthesizer.g:2617:3: RULE_ID
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
    // InternalSynthesizer.g:2626:1: rule__SawToothOscillator__MinAssignment_4 : ( RULE_INT ) ;
    public final void rule__SawToothOscillator__MinAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2630:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:2631:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:2631:2: ( RULE_INT )
            // InternalSynthesizer.g:2632:3: RULE_INT
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
    // InternalSynthesizer.g:2641:1: rule__SawToothOscillator__MaxAssignment_6 : ( RULE_INT ) ;
    public final void rule__SawToothOscillator__MaxAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2645:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:2646:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:2646:2: ( RULE_INT )
            // InternalSynthesizer.g:2647:3: RULE_INT
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
    // InternalSynthesizer.g:2656:1: rule__SawToothOscillator__DefaultAssignment_8 : ( RULE_INT ) ;
    public final void rule__SawToothOscillator__DefaultAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2660:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:2661:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:2661:2: ( RULE_INT )
            // InternalSynthesizer.g:2662:3: RULE_INT
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
    // InternalSynthesizer.g:2671:1: rule__SineOscillator__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SineOscillator__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2675:1: ( ( RULE_ID ) )
            // InternalSynthesizer.g:2676:2: ( RULE_ID )
            {
            // InternalSynthesizer.g:2676:2: ( RULE_ID )
            // InternalSynthesizer.g:2677:3: RULE_ID
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
    // InternalSynthesizer.g:2686:1: rule__SineOscillator__FrequencyAssignment_4 : ( RULE_INT ) ;
    public final void rule__SineOscillator__FrequencyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2690:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:2691:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:2691:2: ( RULE_INT )
            // InternalSynthesizer.g:2692:3: RULE_INT
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
    // InternalSynthesizer.g:2701:1: rule__SineOscillator__AmplitudeAssignment_6 : ( RULE_INT ) ;
    public final void rule__SineOscillator__AmplitudeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2705:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:2706:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:2706:2: ( RULE_INT )
            // InternalSynthesizer.g:2707:3: RULE_INT
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001812000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001810002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000088002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000088000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001810000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});

}