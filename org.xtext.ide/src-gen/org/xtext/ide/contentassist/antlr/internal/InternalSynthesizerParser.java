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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'frequency'", "'variance'", "'amplitude'", "'Controls'", "'{'", "'}'", "'Sound'", "'Connections'", "'rotaryKnob'", "'('", "'x'", "'y'", "'width'", "'height'", "')'", "'slider'", "'sound'", "'effect'", "'button'", "'linear'", "'sawToothOscillator'", "'sineOscillator'"
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


    // $ANTLR start "entryRuleEffect"
    // InternalSynthesizer.g:153:1: entryRuleEffect : ruleEffect EOF ;
    public final void entryRuleEffect() throws RecognitionException {
        try {
            // InternalSynthesizer.g:154:1: ( ruleEffect EOF )
            // InternalSynthesizer.g:155:1: ruleEffect EOF
            {
             before(grammarAccess.getEffectRule()); 
            pushFollow(FOLLOW_1);
            ruleEffect();

            state._fsp--;

             after(grammarAccess.getEffectRule()); 
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
    // $ANTLR end "entryRuleEffect"


    // $ANTLR start "ruleEffect"
    // InternalSynthesizer.g:162:1: ruleEffect : ( ( rule__Effect__Alternatives ) ) ;
    public final void ruleEffect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:166:2: ( ( ( rule__Effect__Alternatives ) ) )
            // InternalSynthesizer.g:167:2: ( ( rule__Effect__Alternatives ) )
            {
            // InternalSynthesizer.g:167:2: ( ( rule__Effect__Alternatives ) )
            // InternalSynthesizer.g:168:3: ( rule__Effect__Alternatives )
            {
             before(grammarAccess.getEffectAccess().getAlternatives()); 
            // InternalSynthesizer.g:169:3: ( rule__Effect__Alternatives )
            // InternalSynthesizer.g:169:4: rule__Effect__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Effect__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEffectAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEffect"


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


    // $ANTLR start "entryRuleButton"
    // InternalSynthesizer.g:203:1: entryRuleButton : ruleButton EOF ;
    public final void entryRuleButton() throws RecognitionException {
        try {
            // InternalSynthesizer.g:204:1: ( ruleButton EOF )
            // InternalSynthesizer.g:205:1: ruleButton EOF
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
    // InternalSynthesizer.g:212:1: ruleButton : ( ( rule__Button__Group__0 ) ) ;
    public final void ruleButton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:216:2: ( ( ( rule__Button__Group__0 ) ) )
            // InternalSynthesizer.g:217:2: ( ( rule__Button__Group__0 ) )
            {
            // InternalSynthesizer.g:217:2: ( ( rule__Button__Group__0 ) )
            // InternalSynthesizer.g:218:3: ( rule__Button__Group__0 )
            {
             before(grammarAccess.getButtonAccess().getGroup()); 
            // InternalSynthesizer.g:219:3: ( rule__Button__Group__0 )
            // InternalSynthesizer.g:219:4: rule__Button__Group__0
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


    // $ANTLR start "entryRuleConnectionElement"
    // InternalSynthesizer.g:228:1: entryRuleConnectionElement : ruleConnectionElement EOF ;
    public final void entryRuleConnectionElement() throws RecognitionException {
        try {
            // InternalSynthesizer.g:229:1: ( ruleConnectionElement EOF )
            // InternalSynthesizer.g:230:1: ruleConnectionElement EOF
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
    // InternalSynthesizer.g:237:1: ruleConnectionElement : ( ( rule__ConnectionElement__Group__0 ) ) ;
    public final void ruleConnectionElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:241:2: ( ( ( rule__ConnectionElement__Group__0 ) ) )
            // InternalSynthesizer.g:242:2: ( ( rule__ConnectionElement__Group__0 ) )
            {
            // InternalSynthesizer.g:242:2: ( ( rule__ConnectionElement__Group__0 ) )
            // InternalSynthesizer.g:243:3: ( rule__ConnectionElement__Group__0 )
            {
             before(grammarAccess.getConnectionElementAccess().getGroup()); 
            // InternalSynthesizer.g:244:3: ( rule__ConnectionElement__Group__0 )
            // InternalSynthesizer.g:244:4: rule__ConnectionElement__Group__0
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
    // InternalSynthesizer.g:253:1: entryRuleSawToothOscillator : ruleSawToothOscillator EOF ;
    public final void entryRuleSawToothOscillator() throws RecognitionException {
        try {
            // InternalSynthesizer.g:254:1: ( ruleSawToothOscillator EOF )
            // InternalSynthesizer.g:255:1: ruleSawToothOscillator EOF
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
    // InternalSynthesizer.g:262:1: ruleSawToothOscillator : ( ( rule__SawToothOscillator__Group__0 ) ) ;
    public final void ruleSawToothOscillator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:266:2: ( ( ( rule__SawToothOscillator__Group__0 ) ) )
            // InternalSynthesizer.g:267:2: ( ( rule__SawToothOscillator__Group__0 ) )
            {
            // InternalSynthesizer.g:267:2: ( ( rule__SawToothOscillator__Group__0 ) )
            // InternalSynthesizer.g:268:3: ( rule__SawToothOscillator__Group__0 )
            {
             before(grammarAccess.getSawToothOscillatorAccess().getGroup()); 
            // InternalSynthesizer.g:269:3: ( rule__SawToothOscillator__Group__0 )
            // InternalSynthesizer.g:269:4: rule__SawToothOscillator__Group__0
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
    // InternalSynthesizer.g:278:1: entryRuleSineOscillator : ruleSineOscillator EOF ;
    public final void entryRuleSineOscillator() throws RecognitionException {
        try {
            // InternalSynthesizer.g:279:1: ( ruleSineOscillator EOF )
            // InternalSynthesizer.g:280:1: ruleSineOscillator EOF
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
    // InternalSynthesizer.g:287:1: ruleSineOscillator : ( ( rule__SineOscillator__Group__0 ) ) ;
    public final void ruleSineOscillator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:291:2: ( ( ( rule__SineOscillator__Group__0 ) ) )
            // InternalSynthesizer.g:292:2: ( ( rule__SineOscillator__Group__0 ) )
            {
            // InternalSynthesizer.g:292:2: ( ( rule__SineOscillator__Group__0 ) )
            // InternalSynthesizer.g:293:3: ( rule__SineOscillator__Group__0 )
            {
             before(grammarAccess.getSineOscillatorAccess().getGroup()); 
            // InternalSynthesizer.g:294:3: ( rule__SineOscillator__Group__0 )
            // InternalSynthesizer.g:294:4: rule__SineOscillator__Group__0
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
    // InternalSynthesizer.g:302:1: rule__ControlElement__Alternatives : ( ( ruleButton ) | ( ruleRotaryKnob ) | ( ruleSlider ) );
    public final void rule__ControlElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:306:1: ( ( ruleButton ) | ( ruleRotaryKnob ) | ( ruleSlider ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt1=1;
                }
                break;
            case 19:
                {
                alt1=2;
                }
                break;
            case 26:
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
                    // InternalSynthesizer.g:307:2: ( ruleButton )
                    {
                    // InternalSynthesizer.g:307:2: ( ruleButton )
                    // InternalSynthesizer.g:308:3: ruleButton
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
                    // InternalSynthesizer.g:313:2: ( ruleRotaryKnob )
                    {
                    // InternalSynthesizer.g:313:2: ( ruleRotaryKnob )
                    // InternalSynthesizer.g:314:3: ruleRotaryKnob
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
                    // InternalSynthesizer.g:319:2: ( ruleSlider )
                    {
                    // InternalSynthesizer.g:319:2: ( ruleSlider )
                    // InternalSynthesizer.g:320:3: ruleSlider
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


    // $ANTLR start "rule__Effect__Alternatives"
    // InternalSynthesizer.g:329:1: rule__Effect__Alternatives : ( ( 'frequency' ) | ( 'variance' ) | ( 'amplitude' ) );
    public final void rule__Effect__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:333:1: ( ( 'frequency' ) | ( 'variance' ) | ( 'amplitude' ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSynthesizer.g:334:2: ( 'frequency' )
                    {
                    // InternalSynthesizer.g:334:2: ( 'frequency' )
                    // InternalSynthesizer.g:335:3: 'frequency'
                    {
                     before(grammarAccess.getEffectAccess().getFrequencyKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEffectAccess().getFrequencyKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSynthesizer.g:340:2: ( 'variance' )
                    {
                    // InternalSynthesizer.g:340:2: ( 'variance' )
                    // InternalSynthesizer.g:341:3: 'variance'
                    {
                     before(grammarAccess.getEffectAccess().getVarianceKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEffectAccess().getVarianceKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSynthesizer.g:346:2: ( 'amplitude' )
                    {
                    // InternalSynthesizer.g:346:2: ( 'amplitude' )
                    // InternalSynthesizer.g:347:3: 'amplitude'
                    {
                     before(grammarAccess.getEffectAccess().getAmplitudeKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEffectAccess().getAmplitudeKeyword_2()); 

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
    // $ANTLR end "rule__Effect__Alternatives"


    // $ANTLR start "rule__SoundElement__Alternatives"
    // InternalSynthesizer.g:356:1: rule__SoundElement__Alternatives : ( ( ruleSawToothOscillator ) | ( ruleSineOscillator ) );
    public final void rule__SoundElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:360:1: ( ( ruleSawToothOscillator ) | ( ruleSineOscillator ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==31) ) {
                alt3=1;
            }
            else if ( (LA3_0==32) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSynthesizer.g:361:2: ( ruleSawToothOscillator )
                    {
                    // InternalSynthesizer.g:361:2: ( ruleSawToothOscillator )
                    // InternalSynthesizer.g:362:3: ruleSawToothOscillator
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
                    // InternalSynthesizer.g:367:2: ( ruleSineOscillator )
                    {
                    // InternalSynthesizer.g:367:2: ( ruleSineOscillator )
                    // InternalSynthesizer.g:368:3: ruleSineOscillator
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
    // InternalSynthesizer.g:377:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:381:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalSynthesizer.g:382:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalSynthesizer.g:389:1: rule__Model__Group__0__Impl : ( 'Controls' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:393:1: ( ( 'Controls' ) )
            // InternalSynthesizer.g:394:1: ( 'Controls' )
            {
            // InternalSynthesizer.g:394:1: ( 'Controls' )
            // InternalSynthesizer.g:395:2: 'Controls'
            {
             before(grammarAccess.getModelAccess().getControlsKeyword_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalSynthesizer.g:404:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:408:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalSynthesizer.g:409:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalSynthesizer.g:416:1: rule__Model__Group__1__Impl : ( '{' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:420:1: ( ( '{' ) )
            // InternalSynthesizer.g:421:1: ( '{' )
            {
            // InternalSynthesizer.g:421:1: ( '{' )
            // InternalSynthesizer.g:422:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
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
    // InternalSynthesizer.g:431:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:435:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalSynthesizer.g:436:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalSynthesizer.g:443:1: rule__Model__Group__2__Impl : ( ( rule__Model__ControlsAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:447:1: ( ( ( rule__Model__ControlsAssignment_2 )* ) )
            // InternalSynthesizer.g:448:1: ( ( rule__Model__ControlsAssignment_2 )* )
            {
            // InternalSynthesizer.g:448:1: ( ( rule__Model__ControlsAssignment_2 )* )
            // InternalSynthesizer.g:449:2: ( rule__Model__ControlsAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getControlsAssignment_2()); 
            // InternalSynthesizer.g:450:2: ( rule__Model__ControlsAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19||LA4_0==26||LA4_0==29) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSynthesizer.g:450:3: rule__Model__ControlsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__ControlsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalSynthesizer.g:458:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:462:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalSynthesizer.g:463:2: rule__Model__Group__3__Impl rule__Model__Group__4
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
    // InternalSynthesizer.g:470:1: rule__Model__Group__3__Impl : ( '}' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:474:1: ( ( '}' ) )
            // InternalSynthesizer.g:475:1: ( '}' )
            {
            // InternalSynthesizer.g:475:1: ( '}' )
            // InternalSynthesizer.g:476:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
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
    // InternalSynthesizer.g:485:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:489:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalSynthesizer.g:490:2: rule__Model__Group__4__Impl rule__Model__Group__5
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
    // InternalSynthesizer.g:497:1: rule__Model__Group__4__Impl : ( ( rule__Model__Group_4__0 )? ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:501:1: ( ( ( rule__Model__Group_4__0 )? ) )
            // InternalSynthesizer.g:502:1: ( ( rule__Model__Group_4__0 )? )
            {
            // InternalSynthesizer.g:502:1: ( ( rule__Model__Group_4__0 )? )
            // InternalSynthesizer.g:503:2: ( rule__Model__Group_4__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_4()); 
            // InternalSynthesizer.g:504:2: ( rule__Model__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSynthesizer.g:504:3: rule__Model__Group_4__0
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
    // InternalSynthesizer.g:512:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:516:1: ( rule__Model__Group__5__Impl )
            // InternalSynthesizer.g:517:2: rule__Model__Group__5__Impl
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
    // InternalSynthesizer.g:523:1: rule__Model__Group__5__Impl : ( ( rule__Model__Group_5__0 )? ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:527:1: ( ( ( rule__Model__Group_5__0 )? ) )
            // InternalSynthesizer.g:528:1: ( ( rule__Model__Group_5__0 )? )
            {
            // InternalSynthesizer.g:528:1: ( ( rule__Model__Group_5__0 )? )
            // InternalSynthesizer.g:529:2: ( rule__Model__Group_5__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_5()); 
            // InternalSynthesizer.g:530:2: ( rule__Model__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSynthesizer.g:530:3: rule__Model__Group_5__0
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
    // InternalSynthesizer.g:539:1: rule__Model__Group_4__0 : rule__Model__Group_4__0__Impl rule__Model__Group_4__1 ;
    public final void rule__Model__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:543:1: ( rule__Model__Group_4__0__Impl rule__Model__Group_4__1 )
            // InternalSynthesizer.g:544:2: rule__Model__Group_4__0__Impl rule__Model__Group_4__1
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
    // InternalSynthesizer.g:551:1: rule__Model__Group_4__0__Impl : ( 'Sound' ) ;
    public final void rule__Model__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:555:1: ( ( 'Sound' ) )
            // InternalSynthesizer.g:556:1: ( 'Sound' )
            {
            // InternalSynthesizer.g:556:1: ( 'Sound' )
            // InternalSynthesizer.g:557:2: 'Sound'
            {
             before(grammarAccess.getModelAccess().getSoundKeyword_4_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalSynthesizer.g:566:1: rule__Model__Group_4__1 : rule__Model__Group_4__1__Impl rule__Model__Group_4__2 ;
    public final void rule__Model__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:570:1: ( rule__Model__Group_4__1__Impl rule__Model__Group_4__2 )
            // InternalSynthesizer.g:571:2: rule__Model__Group_4__1__Impl rule__Model__Group_4__2
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
    // InternalSynthesizer.g:578:1: rule__Model__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Model__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:582:1: ( ( '{' ) )
            // InternalSynthesizer.g:583:1: ( '{' )
            {
            // InternalSynthesizer.g:583:1: ( '{' )
            // InternalSynthesizer.g:584:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,15,FOLLOW_2); 
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
    // InternalSynthesizer.g:593:1: rule__Model__Group_4__2 : rule__Model__Group_4__2__Impl rule__Model__Group_4__3 ;
    public final void rule__Model__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:597:1: ( rule__Model__Group_4__2__Impl rule__Model__Group_4__3 )
            // InternalSynthesizer.g:598:2: rule__Model__Group_4__2__Impl rule__Model__Group_4__3
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
    // InternalSynthesizer.g:605:1: rule__Model__Group_4__2__Impl : ( ( rule__Model__SoundsAssignment_4_2 )* ) ;
    public final void rule__Model__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:609:1: ( ( ( rule__Model__SoundsAssignment_4_2 )* ) )
            // InternalSynthesizer.g:610:1: ( ( rule__Model__SoundsAssignment_4_2 )* )
            {
            // InternalSynthesizer.g:610:1: ( ( rule__Model__SoundsAssignment_4_2 )* )
            // InternalSynthesizer.g:611:2: ( rule__Model__SoundsAssignment_4_2 )*
            {
             before(grammarAccess.getModelAccess().getSoundsAssignment_4_2()); 
            // InternalSynthesizer.g:612:2: ( rule__Model__SoundsAssignment_4_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=31 && LA7_0<=32)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSynthesizer.g:612:3: rule__Model__SoundsAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Model__SoundsAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalSynthesizer.g:620:1: rule__Model__Group_4__3 : rule__Model__Group_4__3__Impl ;
    public final void rule__Model__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:624:1: ( rule__Model__Group_4__3__Impl )
            // InternalSynthesizer.g:625:2: rule__Model__Group_4__3__Impl
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
    // InternalSynthesizer.g:631:1: rule__Model__Group_4__3__Impl : ( '}' ) ;
    public final void rule__Model__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:635:1: ( ( '}' ) )
            // InternalSynthesizer.g:636:1: ( '}' )
            {
            // InternalSynthesizer.g:636:1: ( '}' )
            // InternalSynthesizer.g:637:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,16,FOLLOW_2); 
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
    // InternalSynthesizer.g:647:1: rule__Model__Group_5__0 : rule__Model__Group_5__0__Impl rule__Model__Group_5__1 ;
    public final void rule__Model__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:651:1: ( rule__Model__Group_5__0__Impl rule__Model__Group_5__1 )
            // InternalSynthesizer.g:652:2: rule__Model__Group_5__0__Impl rule__Model__Group_5__1
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
    // InternalSynthesizer.g:659:1: rule__Model__Group_5__0__Impl : ( 'Connections' ) ;
    public final void rule__Model__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:663:1: ( ( 'Connections' ) )
            // InternalSynthesizer.g:664:1: ( 'Connections' )
            {
            // InternalSynthesizer.g:664:1: ( 'Connections' )
            // InternalSynthesizer.g:665:2: 'Connections'
            {
             before(grammarAccess.getModelAccess().getConnectionsKeyword_5_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalSynthesizer.g:674:1: rule__Model__Group_5__1 : rule__Model__Group_5__1__Impl rule__Model__Group_5__2 ;
    public final void rule__Model__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:678:1: ( rule__Model__Group_5__1__Impl rule__Model__Group_5__2 )
            // InternalSynthesizer.g:679:2: rule__Model__Group_5__1__Impl rule__Model__Group_5__2
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
    // InternalSynthesizer.g:686:1: rule__Model__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Model__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:690:1: ( ( '{' ) )
            // InternalSynthesizer.g:691:1: ( '{' )
            {
            // InternalSynthesizer.g:691:1: ( '{' )
            // InternalSynthesizer.g:692:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,15,FOLLOW_2); 
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
    // InternalSynthesizer.g:701:1: rule__Model__Group_5__2 : rule__Model__Group_5__2__Impl rule__Model__Group_5__3 ;
    public final void rule__Model__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:705:1: ( rule__Model__Group_5__2__Impl rule__Model__Group_5__3 )
            // InternalSynthesizer.g:706:2: rule__Model__Group_5__2__Impl rule__Model__Group_5__3
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
    // InternalSynthesizer.g:713:1: rule__Model__Group_5__2__Impl : ( ( rule__Model__ConnectionsAssignment_5_2 )* ) ;
    public final void rule__Model__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:717:1: ( ( ( rule__Model__ConnectionsAssignment_5_2 )* ) )
            // InternalSynthesizer.g:718:1: ( ( rule__Model__ConnectionsAssignment_5_2 )* )
            {
            // InternalSynthesizer.g:718:1: ( ( rule__Model__ConnectionsAssignment_5_2 )* )
            // InternalSynthesizer.g:719:2: ( rule__Model__ConnectionsAssignment_5_2 )*
            {
             before(grammarAccess.getModelAccess().getConnectionsAssignment_5_2()); 
            // InternalSynthesizer.g:720:2: ( rule__Model__ConnectionsAssignment_5_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==30) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSynthesizer.g:720:3: rule__Model__ConnectionsAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Model__ConnectionsAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalSynthesizer.g:728:1: rule__Model__Group_5__3 : rule__Model__Group_5__3__Impl ;
    public final void rule__Model__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:732:1: ( rule__Model__Group_5__3__Impl )
            // InternalSynthesizer.g:733:2: rule__Model__Group_5__3__Impl
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
    // InternalSynthesizer.g:739:1: rule__Model__Group_5__3__Impl : ( '}' ) ;
    public final void rule__Model__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:743:1: ( ( '}' ) )
            // InternalSynthesizer.g:744:1: ( '}' )
            {
            // InternalSynthesizer.g:744:1: ( '}' )
            // InternalSynthesizer.g:745:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5_3()); 
            match(input,16,FOLLOW_2); 
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
    // InternalSynthesizer.g:755:1: rule__RotaryKnob__Group__0 : rule__RotaryKnob__Group__0__Impl rule__RotaryKnob__Group__1 ;
    public final void rule__RotaryKnob__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:759:1: ( rule__RotaryKnob__Group__0__Impl rule__RotaryKnob__Group__1 )
            // InternalSynthesizer.g:760:2: rule__RotaryKnob__Group__0__Impl rule__RotaryKnob__Group__1
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
    // InternalSynthesizer.g:767:1: rule__RotaryKnob__Group__0__Impl : ( 'rotaryKnob' ) ;
    public final void rule__RotaryKnob__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:771:1: ( ( 'rotaryKnob' ) )
            // InternalSynthesizer.g:772:1: ( 'rotaryKnob' )
            {
            // InternalSynthesizer.g:772:1: ( 'rotaryKnob' )
            // InternalSynthesizer.g:773:2: 'rotaryKnob'
            {
             before(grammarAccess.getRotaryKnobAccess().getRotaryKnobKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalSynthesizer.g:782:1: rule__RotaryKnob__Group__1 : rule__RotaryKnob__Group__1__Impl rule__RotaryKnob__Group__2 ;
    public final void rule__RotaryKnob__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:786:1: ( rule__RotaryKnob__Group__1__Impl rule__RotaryKnob__Group__2 )
            // InternalSynthesizer.g:787:2: rule__RotaryKnob__Group__1__Impl rule__RotaryKnob__Group__2
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
    // InternalSynthesizer.g:794:1: rule__RotaryKnob__Group__1__Impl : ( ( rule__RotaryKnob__NameAssignment_1 ) ) ;
    public final void rule__RotaryKnob__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:798:1: ( ( ( rule__RotaryKnob__NameAssignment_1 ) ) )
            // InternalSynthesizer.g:799:1: ( ( rule__RotaryKnob__NameAssignment_1 ) )
            {
            // InternalSynthesizer.g:799:1: ( ( rule__RotaryKnob__NameAssignment_1 ) )
            // InternalSynthesizer.g:800:2: ( rule__RotaryKnob__NameAssignment_1 )
            {
             before(grammarAccess.getRotaryKnobAccess().getNameAssignment_1()); 
            // InternalSynthesizer.g:801:2: ( rule__RotaryKnob__NameAssignment_1 )
            // InternalSynthesizer.g:801:3: rule__RotaryKnob__NameAssignment_1
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
    // InternalSynthesizer.g:809:1: rule__RotaryKnob__Group__2 : rule__RotaryKnob__Group__2__Impl rule__RotaryKnob__Group__3 ;
    public final void rule__RotaryKnob__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:813:1: ( rule__RotaryKnob__Group__2__Impl rule__RotaryKnob__Group__3 )
            // InternalSynthesizer.g:814:2: rule__RotaryKnob__Group__2__Impl rule__RotaryKnob__Group__3
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
    // InternalSynthesizer.g:821:1: rule__RotaryKnob__Group__2__Impl : ( '(' ) ;
    public final void rule__RotaryKnob__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:825:1: ( ( '(' ) )
            // InternalSynthesizer.g:826:1: ( '(' )
            {
            // InternalSynthesizer.g:826:1: ( '(' )
            // InternalSynthesizer.g:827:2: '('
            {
             before(grammarAccess.getRotaryKnobAccess().getLeftParenthesisKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalSynthesizer.g:836:1: rule__RotaryKnob__Group__3 : rule__RotaryKnob__Group__3__Impl rule__RotaryKnob__Group__4 ;
    public final void rule__RotaryKnob__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:840:1: ( rule__RotaryKnob__Group__3__Impl rule__RotaryKnob__Group__4 )
            // InternalSynthesizer.g:841:2: rule__RotaryKnob__Group__3__Impl rule__RotaryKnob__Group__4
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
    // InternalSynthesizer.g:848:1: rule__RotaryKnob__Group__3__Impl : ( 'x' ) ;
    public final void rule__RotaryKnob__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:852:1: ( ( 'x' ) )
            // InternalSynthesizer.g:853:1: ( 'x' )
            {
            // InternalSynthesizer.g:853:1: ( 'x' )
            // InternalSynthesizer.g:854:2: 'x'
            {
             before(grammarAccess.getRotaryKnobAccess().getXKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSynthesizer.g:863:1: rule__RotaryKnob__Group__4 : rule__RotaryKnob__Group__4__Impl rule__RotaryKnob__Group__5 ;
    public final void rule__RotaryKnob__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:867:1: ( rule__RotaryKnob__Group__4__Impl rule__RotaryKnob__Group__5 )
            // InternalSynthesizer.g:868:2: rule__RotaryKnob__Group__4__Impl rule__RotaryKnob__Group__5
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
    // InternalSynthesizer.g:875:1: rule__RotaryKnob__Group__4__Impl : ( ( rule__RotaryKnob__XAssignment_4 ) ) ;
    public final void rule__RotaryKnob__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:879:1: ( ( ( rule__RotaryKnob__XAssignment_4 ) ) )
            // InternalSynthesizer.g:880:1: ( ( rule__RotaryKnob__XAssignment_4 ) )
            {
            // InternalSynthesizer.g:880:1: ( ( rule__RotaryKnob__XAssignment_4 ) )
            // InternalSynthesizer.g:881:2: ( rule__RotaryKnob__XAssignment_4 )
            {
             before(grammarAccess.getRotaryKnobAccess().getXAssignment_4()); 
            // InternalSynthesizer.g:882:2: ( rule__RotaryKnob__XAssignment_4 )
            // InternalSynthesizer.g:882:3: rule__RotaryKnob__XAssignment_4
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
    // InternalSynthesizer.g:890:1: rule__RotaryKnob__Group__5 : rule__RotaryKnob__Group__5__Impl rule__RotaryKnob__Group__6 ;
    public final void rule__RotaryKnob__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:894:1: ( rule__RotaryKnob__Group__5__Impl rule__RotaryKnob__Group__6 )
            // InternalSynthesizer.g:895:2: rule__RotaryKnob__Group__5__Impl rule__RotaryKnob__Group__6
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
    // InternalSynthesizer.g:902:1: rule__RotaryKnob__Group__5__Impl : ( 'y' ) ;
    public final void rule__RotaryKnob__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:906:1: ( ( 'y' ) )
            // InternalSynthesizer.g:907:1: ( 'y' )
            {
            // InternalSynthesizer.g:907:1: ( 'y' )
            // InternalSynthesizer.g:908:2: 'y'
            {
             before(grammarAccess.getRotaryKnobAccess().getYKeyword_5()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSynthesizer.g:917:1: rule__RotaryKnob__Group__6 : rule__RotaryKnob__Group__6__Impl rule__RotaryKnob__Group__7 ;
    public final void rule__RotaryKnob__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:921:1: ( rule__RotaryKnob__Group__6__Impl rule__RotaryKnob__Group__7 )
            // InternalSynthesizer.g:922:2: rule__RotaryKnob__Group__6__Impl rule__RotaryKnob__Group__7
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
    // InternalSynthesizer.g:929:1: rule__RotaryKnob__Group__6__Impl : ( ( rule__RotaryKnob__YAssignment_6 ) ) ;
    public final void rule__RotaryKnob__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:933:1: ( ( ( rule__RotaryKnob__YAssignment_6 ) ) )
            // InternalSynthesizer.g:934:1: ( ( rule__RotaryKnob__YAssignment_6 ) )
            {
            // InternalSynthesizer.g:934:1: ( ( rule__RotaryKnob__YAssignment_6 ) )
            // InternalSynthesizer.g:935:2: ( rule__RotaryKnob__YAssignment_6 )
            {
             before(grammarAccess.getRotaryKnobAccess().getYAssignment_6()); 
            // InternalSynthesizer.g:936:2: ( rule__RotaryKnob__YAssignment_6 )
            // InternalSynthesizer.g:936:3: rule__RotaryKnob__YAssignment_6
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
    // InternalSynthesizer.g:944:1: rule__RotaryKnob__Group__7 : rule__RotaryKnob__Group__7__Impl rule__RotaryKnob__Group__8 ;
    public final void rule__RotaryKnob__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:948:1: ( rule__RotaryKnob__Group__7__Impl rule__RotaryKnob__Group__8 )
            // InternalSynthesizer.g:949:2: rule__RotaryKnob__Group__7__Impl rule__RotaryKnob__Group__8
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
    // InternalSynthesizer.g:956:1: rule__RotaryKnob__Group__7__Impl : ( 'width' ) ;
    public final void rule__RotaryKnob__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:960:1: ( ( 'width' ) )
            // InternalSynthesizer.g:961:1: ( 'width' )
            {
            // InternalSynthesizer.g:961:1: ( 'width' )
            // InternalSynthesizer.g:962:2: 'width'
            {
             before(grammarAccess.getRotaryKnobAccess().getWidthKeyword_7()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSynthesizer.g:971:1: rule__RotaryKnob__Group__8 : rule__RotaryKnob__Group__8__Impl rule__RotaryKnob__Group__9 ;
    public final void rule__RotaryKnob__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:975:1: ( rule__RotaryKnob__Group__8__Impl rule__RotaryKnob__Group__9 )
            // InternalSynthesizer.g:976:2: rule__RotaryKnob__Group__8__Impl rule__RotaryKnob__Group__9
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
    // InternalSynthesizer.g:983:1: rule__RotaryKnob__Group__8__Impl : ( ( rule__RotaryKnob__WidthAssignment_8 ) ) ;
    public final void rule__RotaryKnob__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:987:1: ( ( ( rule__RotaryKnob__WidthAssignment_8 ) ) )
            // InternalSynthesizer.g:988:1: ( ( rule__RotaryKnob__WidthAssignment_8 ) )
            {
            // InternalSynthesizer.g:988:1: ( ( rule__RotaryKnob__WidthAssignment_8 ) )
            // InternalSynthesizer.g:989:2: ( rule__RotaryKnob__WidthAssignment_8 )
            {
             before(grammarAccess.getRotaryKnobAccess().getWidthAssignment_8()); 
            // InternalSynthesizer.g:990:2: ( rule__RotaryKnob__WidthAssignment_8 )
            // InternalSynthesizer.g:990:3: rule__RotaryKnob__WidthAssignment_8
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
    // InternalSynthesizer.g:998:1: rule__RotaryKnob__Group__9 : rule__RotaryKnob__Group__9__Impl rule__RotaryKnob__Group__10 ;
    public final void rule__RotaryKnob__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1002:1: ( rule__RotaryKnob__Group__9__Impl rule__RotaryKnob__Group__10 )
            // InternalSynthesizer.g:1003:2: rule__RotaryKnob__Group__9__Impl rule__RotaryKnob__Group__10
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
    // InternalSynthesizer.g:1010:1: rule__RotaryKnob__Group__9__Impl : ( 'height' ) ;
    public final void rule__RotaryKnob__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1014:1: ( ( 'height' ) )
            // InternalSynthesizer.g:1015:1: ( 'height' )
            {
            // InternalSynthesizer.g:1015:1: ( 'height' )
            // InternalSynthesizer.g:1016:2: 'height'
            {
             before(grammarAccess.getRotaryKnobAccess().getHeightKeyword_9()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSynthesizer.g:1025:1: rule__RotaryKnob__Group__10 : rule__RotaryKnob__Group__10__Impl rule__RotaryKnob__Group__11 ;
    public final void rule__RotaryKnob__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1029:1: ( rule__RotaryKnob__Group__10__Impl rule__RotaryKnob__Group__11 )
            // InternalSynthesizer.g:1030:2: rule__RotaryKnob__Group__10__Impl rule__RotaryKnob__Group__11
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
    // InternalSynthesizer.g:1037:1: rule__RotaryKnob__Group__10__Impl : ( ( rule__RotaryKnob__HeightAssignment_10 ) ) ;
    public final void rule__RotaryKnob__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1041:1: ( ( ( rule__RotaryKnob__HeightAssignment_10 ) ) )
            // InternalSynthesizer.g:1042:1: ( ( rule__RotaryKnob__HeightAssignment_10 ) )
            {
            // InternalSynthesizer.g:1042:1: ( ( rule__RotaryKnob__HeightAssignment_10 ) )
            // InternalSynthesizer.g:1043:2: ( rule__RotaryKnob__HeightAssignment_10 )
            {
             before(grammarAccess.getRotaryKnobAccess().getHeightAssignment_10()); 
            // InternalSynthesizer.g:1044:2: ( rule__RotaryKnob__HeightAssignment_10 )
            // InternalSynthesizer.g:1044:3: rule__RotaryKnob__HeightAssignment_10
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
    // InternalSynthesizer.g:1052:1: rule__RotaryKnob__Group__11 : rule__RotaryKnob__Group__11__Impl ;
    public final void rule__RotaryKnob__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1056:1: ( rule__RotaryKnob__Group__11__Impl )
            // InternalSynthesizer.g:1057:2: rule__RotaryKnob__Group__11__Impl
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
    // InternalSynthesizer.g:1063:1: rule__RotaryKnob__Group__11__Impl : ( ')' ) ;
    public final void rule__RotaryKnob__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1067:1: ( ( ')' ) )
            // InternalSynthesizer.g:1068:1: ( ')' )
            {
            // InternalSynthesizer.g:1068:1: ( ')' )
            // InternalSynthesizer.g:1069:2: ')'
            {
             before(grammarAccess.getRotaryKnobAccess().getRightParenthesisKeyword_11()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSynthesizer.g:1079:1: rule__Slider__Group__0 : rule__Slider__Group__0__Impl rule__Slider__Group__1 ;
    public final void rule__Slider__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1083:1: ( rule__Slider__Group__0__Impl rule__Slider__Group__1 )
            // InternalSynthesizer.g:1084:2: rule__Slider__Group__0__Impl rule__Slider__Group__1
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
    // InternalSynthesizer.g:1091:1: rule__Slider__Group__0__Impl : ( 'slider' ) ;
    public final void rule__Slider__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1095:1: ( ( 'slider' ) )
            // InternalSynthesizer.g:1096:1: ( 'slider' )
            {
            // InternalSynthesizer.g:1096:1: ( 'slider' )
            // InternalSynthesizer.g:1097:2: 'slider'
            {
             before(grammarAccess.getSliderAccess().getSliderKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSynthesizer.g:1106:1: rule__Slider__Group__1 : rule__Slider__Group__1__Impl rule__Slider__Group__2 ;
    public final void rule__Slider__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1110:1: ( rule__Slider__Group__1__Impl rule__Slider__Group__2 )
            // InternalSynthesizer.g:1111:2: rule__Slider__Group__1__Impl rule__Slider__Group__2
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
    // InternalSynthesizer.g:1118:1: rule__Slider__Group__1__Impl : ( ( rule__Slider__NameAssignment_1 ) ) ;
    public final void rule__Slider__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1122:1: ( ( ( rule__Slider__NameAssignment_1 ) ) )
            // InternalSynthesizer.g:1123:1: ( ( rule__Slider__NameAssignment_1 ) )
            {
            // InternalSynthesizer.g:1123:1: ( ( rule__Slider__NameAssignment_1 ) )
            // InternalSynthesizer.g:1124:2: ( rule__Slider__NameAssignment_1 )
            {
             before(grammarAccess.getSliderAccess().getNameAssignment_1()); 
            // InternalSynthesizer.g:1125:2: ( rule__Slider__NameAssignment_1 )
            // InternalSynthesizer.g:1125:3: rule__Slider__NameAssignment_1
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
    // InternalSynthesizer.g:1133:1: rule__Slider__Group__2 : rule__Slider__Group__2__Impl rule__Slider__Group__3 ;
    public final void rule__Slider__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1137:1: ( rule__Slider__Group__2__Impl rule__Slider__Group__3 )
            // InternalSynthesizer.g:1138:2: rule__Slider__Group__2__Impl rule__Slider__Group__3
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
    // InternalSynthesizer.g:1145:1: rule__Slider__Group__2__Impl : ( '(' ) ;
    public final void rule__Slider__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1149:1: ( ( '(' ) )
            // InternalSynthesizer.g:1150:1: ( '(' )
            {
            // InternalSynthesizer.g:1150:1: ( '(' )
            // InternalSynthesizer.g:1151:2: '('
            {
             before(grammarAccess.getSliderAccess().getLeftParenthesisKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalSynthesizer.g:1160:1: rule__Slider__Group__3 : rule__Slider__Group__3__Impl rule__Slider__Group__4 ;
    public final void rule__Slider__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1164:1: ( rule__Slider__Group__3__Impl rule__Slider__Group__4 )
            // InternalSynthesizer.g:1165:2: rule__Slider__Group__3__Impl rule__Slider__Group__4
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
    // InternalSynthesizer.g:1172:1: rule__Slider__Group__3__Impl : ( 'x' ) ;
    public final void rule__Slider__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1176:1: ( ( 'x' ) )
            // InternalSynthesizer.g:1177:1: ( 'x' )
            {
            // InternalSynthesizer.g:1177:1: ( 'x' )
            // InternalSynthesizer.g:1178:2: 'x'
            {
             before(grammarAccess.getSliderAccess().getXKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSynthesizer.g:1187:1: rule__Slider__Group__4 : rule__Slider__Group__4__Impl rule__Slider__Group__5 ;
    public final void rule__Slider__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1191:1: ( rule__Slider__Group__4__Impl rule__Slider__Group__5 )
            // InternalSynthesizer.g:1192:2: rule__Slider__Group__4__Impl rule__Slider__Group__5
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
    // InternalSynthesizer.g:1199:1: rule__Slider__Group__4__Impl : ( ( rule__Slider__XAssignment_4 ) ) ;
    public final void rule__Slider__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1203:1: ( ( ( rule__Slider__XAssignment_4 ) ) )
            // InternalSynthesizer.g:1204:1: ( ( rule__Slider__XAssignment_4 ) )
            {
            // InternalSynthesizer.g:1204:1: ( ( rule__Slider__XAssignment_4 ) )
            // InternalSynthesizer.g:1205:2: ( rule__Slider__XAssignment_4 )
            {
             before(grammarAccess.getSliderAccess().getXAssignment_4()); 
            // InternalSynthesizer.g:1206:2: ( rule__Slider__XAssignment_4 )
            // InternalSynthesizer.g:1206:3: rule__Slider__XAssignment_4
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
    // InternalSynthesizer.g:1214:1: rule__Slider__Group__5 : rule__Slider__Group__5__Impl rule__Slider__Group__6 ;
    public final void rule__Slider__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1218:1: ( rule__Slider__Group__5__Impl rule__Slider__Group__6 )
            // InternalSynthesizer.g:1219:2: rule__Slider__Group__5__Impl rule__Slider__Group__6
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
    // InternalSynthesizer.g:1226:1: rule__Slider__Group__5__Impl : ( 'y' ) ;
    public final void rule__Slider__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1230:1: ( ( 'y' ) )
            // InternalSynthesizer.g:1231:1: ( 'y' )
            {
            // InternalSynthesizer.g:1231:1: ( 'y' )
            // InternalSynthesizer.g:1232:2: 'y'
            {
             before(grammarAccess.getSliderAccess().getYKeyword_5()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSynthesizer.g:1241:1: rule__Slider__Group__6 : rule__Slider__Group__6__Impl rule__Slider__Group__7 ;
    public final void rule__Slider__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1245:1: ( rule__Slider__Group__6__Impl rule__Slider__Group__7 )
            // InternalSynthesizer.g:1246:2: rule__Slider__Group__6__Impl rule__Slider__Group__7
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
    // InternalSynthesizer.g:1253:1: rule__Slider__Group__6__Impl : ( ( rule__Slider__YAssignment_6 ) ) ;
    public final void rule__Slider__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1257:1: ( ( ( rule__Slider__YAssignment_6 ) ) )
            // InternalSynthesizer.g:1258:1: ( ( rule__Slider__YAssignment_6 ) )
            {
            // InternalSynthesizer.g:1258:1: ( ( rule__Slider__YAssignment_6 ) )
            // InternalSynthesizer.g:1259:2: ( rule__Slider__YAssignment_6 )
            {
             before(grammarAccess.getSliderAccess().getYAssignment_6()); 
            // InternalSynthesizer.g:1260:2: ( rule__Slider__YAssignment_6 )
            // InternalSynthesizer.g:1260:3: rule__Slider__YAssignment_6
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
    // InternalSynthesizer.g:1268:1: rule__Slider__Group__7 : rule__Slider__Group__7__Impl rule__Slider__Group__8 ;
    public final void rule__Slider__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1272:1: ( rule__Slider__Group__7__Impl rule__Slider__Group__8 )
            // InternalSynthesizer.g:1273:2: rule__Slider__Group__7__Impl rule__Slider__Group__8
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
    // InternalSynthesizer.g:1280:1: rule__Slider__Group__7__Impl : ( 'width' ) ;
    public final void rule__Slider__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1284:1: ( ( 'width' ) )
            // InternalSynthesizer.g:1285:1: ( 'width' )
            {
            // InternalSynthesizer.g:1285:1: ( 'width' )
            // InternalSynthesizer.g:1286:2: 'width'
            {
             before(grammarAccess.getSliderAccess().getWidthKeyword_7()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSynthesizer.g:1295:1: rule__Slider__Group__8 : rule__Slider__Group__8__Impl rule__Slider__Group__9 ;
    public final void rule__Slider__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1299:1: ( rule__Slider__Group__8__Impl rule__Slider__Group__9 )
            // InternalSynthesizer.g:1300:2: rule__Slider__Group__8__Impl rule__Slider__Group__9
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
    // InternalSynthesizer.g:1307:1: rule__Slider__Group__8__Impl : ( ( rule__Slider__WidthAssignment_8 ) ) ;
    public final void rule__Slider__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1311:1: ( ( ( rule__Slider__WidthAssignment_8 ) ) )
            // InternalSynthesizer.g:1312:1: ( ( rule__Slider__WidthAssignment_8 ) )
            {
            // InternalSynthesizer.g:1312:1: ( ( rule__Slider__WidthAssignment_8 ) )
            // InternalSynthesizer.g:1313:2: ( rule__Slider__WidthAssignment_8 )
            {
             before(grammarAccess.getSliderAccess().getWidthAssignment_8()); 
            // InternalSynthesizer.g:1314:2: ( rule__Slider__WidthAssignment_8 )
            // InternalSynthesizer.g:1314:3: rule__Slider__WidthAssignment_8
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
    // InternalSynthesizer.g:1322:1: rule__Slider__Group__9 : rule__Slider__Group__9__Impl rule__Slider__Group__10 ;
    public final void rule__Slider__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1326:1: ( rule__Slider__Group__9__Impl rule__Slider__Group__10 )
            // InternalSynthesizer.g:1327:2: rule__Slider__Group__9__Impl rule__Slider__Group__10
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
    // InternalSynthesizer.g:1334:1: rule__Slider__Group__9__Impl : ( 'height' ) ;
    public final void rule__Slider__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1338:1: ( ( 'height' ) )
            // InternalSynthesizer.g:1339:1: ( 'height' )
            {
            // InternalSynthesizer.g:1339:1: ( 'height' )
            // InternalSynthesizer.g:1340:2: 'height'
            {
             before(grammarAccess.getSliderAccess().getHeightKeyword_9()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSynthesizer.g:1349:1: rule__Slider__Group__10 : rule__Slider__Group__10__Impl rule__Slider__Group__11 ;
    public final void rule__Slider__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1353:1: ( rule__Slider__Group__10__Impl rule__Slider__Group__11 )
            // InternalSynthesizer.g:1354:2: rule__Slider__Group__10__Impl rule__Slider__Group__11
            {
            pushFollow(FOLLOW_19);
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
    // InternalSynthesizer.g:1361:1: rule__Slider__Group__10__Impl : ( ( rule__Slider__HeightAssignment_10 ) ) ;
    public final void rule__Slider__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1365:1: ( ( ( rule__Slider__HeightAssignment_10 ) ) )
            // InternalSynthesizer.g:1366:1: ( ( rule__Slider__HeightAssignment_10 ) )
            {
            // InternalSynthesizer.g:1366:1: ( ( rule__Slider__HeightAssignment_10 ) )
            // InternalSynthesizer.g:1367:2: ( rule__Slider__HeightAssignment_10 )
            {
             before(grammarAccess.getSliderAccess().getHeightAssignment_10()); 
            // InternalSynthesizer.g:1368:2: ( rule__Slider__HeightAssignment_10 )
            // InternalSynthesizer.g:1368:3: rule__Slider__HeightAssignment_10
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
    // InternalSynthesizer.g:1376:1: rule__Slider__Group__11 : rule__Slider__Group__11__Impl rule__Slider__Group__12 ;
    public final void rule__Slider__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1380:1: ( rule__Slider__Group__11__Impl rule__Slider__Group__12 )
            // InternalSynthesizer.g:1381:2: rule__Slider__Group__11__Impl rule__Slider__Group__12
            {
            pushFollow(FOLLOW_11);
            rule__Slider__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Slider__Group__12();

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
    // InternalSynthesizer.g:1388:1: rule__Slider__Group__11__Impl : ( 'sound' ) ;
    public final void rule__Slider__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1392:1: ( ( 'sound' ) )
            // InternalSynthesizer.g:1393:1: ( 'sound' )
            {
            // InternalSynthesizer.g:1393:1: ( 'sound' )
            // InternalSynthesizer.g:1394:2: 'sound'
            {
             before(grammarAccess.getSliderAccess().getSoundKeyword_11()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSliderAccess().getSoundKeyword_11()); 

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


    // $ANTLR start "rule__Slider__Group__12"
    // InternalSynthesizer.g:1403:1: rule__Slider__Group__12 : rule__Slider__Group__12__Impl rule__Slider__Group__13 ;
    public final void rule__Slider__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1407:1: ( rule__Slider__Group__12__Impl rule__Slider__Group__13 )
            // InternalSynthesizer.g:1408:2: rule__Slider__Group__12__Impl rule__Slider__Group__13
            {
            pushFollow(FOLLOW_20);
            rule__Slider__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Slider__Group__13();

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
    // $ANTLR end "rule__Slider__Group__12"


    // $ANTLR start "rule__Slider__Group__12__Impl"
    // InternalSynthesizer.g:1415:1: rule__Slider__Group__12__Impl : ( ( rule__Slider__SoundAssignment_12 ) ) ;
    public final void rule__Slider__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1419:1: ( ( ( rule__Slider__SoundAssignment_12 ) ) )
            // InternalSynthesizer.g:1420:1: ( ( rule__Slider__SoundAssignment_12 ) )
            {
            // InternalSynthesizer.g:1420:1: ( ( rule__Slider__SoundAssignment_12 ) )
            // InternalSynthesizer.g:1421:2: ( rule__Slider__SoundAssignment_12 )
            {
             before(grammarAccess.getSliderAccess().getSoundAssignment_12()); 
            // InternalSynthesizer.g:1422:2: ( rule__Slider__SoundAssignment_12 )
            // InternalSynthesizer.g:1422:3: rule__Slider__SoundAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Slider__SoundAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getSliderAccess().getSoundAssignment_12()); 

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
    // $ANTLR end "rule__Slider__Group__12__Impl"


    // $ANTLR start "rule__Slider__Group__13"
    // InternalSynthesizer.g:1430:1: rule__Slider__Group__13 : rule__Slider__Group__13__Impl rule__Slider__Group__14 ;
    public final void rule__Slider__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1434:1: ( rule__Slider__Group__13__Impl rule__Slider__Group__14 )
            // InternalSynthesizer.g:1435:2: rule__Slider__Group__13__Impl rule__Slider__Group__14
            {
            pushFollow(FOLLOW_21);
            rule__Slider__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Slider__Group__14();

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
    // $ANTLR end "rule__Slider__Group__13"


    // $ANTLR start "rule__Slider__Group__13__Impl"
    // InternalSynthesizer.g:1442:1: rule__Slider__Group__13__Impl : ( 'effect' ) ;
    public final void rule__Slider__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1446:1: ( ( 'effect' ) )
            // InternalSynthesizer.g:1447:1: ( 'effect' )
            {
            // InternalSynthesizer.g:1447:1: ( 'effect' )
            // InternalSynthesizer.g:1448:2: 'effect'
            {
             before(grammarAccess.getSliderAccess().getEffectKeyword_13()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSliderAccess().getEffectKeyword_13()); 

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
    // $ANTLR end "rule__Slider__Group__13__Impl"


    // $ANTLR start "rule__Slider__Group__14"
    // InternalSynthesizer.g:1457:1: rule__Slider__Group__14 : rule__Slider__Group__14__Impl rule__Slider__Group__15 ;
    public final void rule__Slider__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1461:1: ( rule__Slider__Group__14__Impl rule__Slider__Group__15 )
            // InternalSynthesizer.g:1462:2: rule__Slider__Group__14__Impl rule__Slider__Group__15
            {
            pushFollow(FOLLOW_18);
            rule__Slider__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Slider__Group__15();

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
    // $ANTLR end "rule__Slider__Group__14"


    // $ANTLR start "rule__Slider__Group__14__Impl"
    // InternalSynthesizer.g:1469:1: rule__Slider__Group__14__Impl : ( ( rule__Slider__TypeAssignment_14 ) ) ;
    public final void rule__Slider__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1473:1: ( ( ( rule__Slider__TypeAssignment_14 ) ) )
            // InternalSynthesizer.g:1474:1: ( ( rule__Slider__TypeAssignment_14 ) )
            {
            // InternalSynthesizer.g:1474:1: ( ( rule__Slider__TypeAssignment_14 ) )
            // InternalSynthesizer.g:1475:2: ( rule__Slider__TypeAssignment_14 )
            {
             before(grammarAccess.getSliderAccess().getTypeAssignment_14()); 
            // InternalSynthesizer.g:1476:2: ( rule__Slider__TypeAssignment_14 )
            // InternalSynthesizer.g:1476:3: rule__Slider__TypeAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__Slider__TypeAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getSliderAccess().getTypeAssignment_14()); 

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
    // $ANTLR end "rule__Slider__Group__14__Impl"


    // $ANTLR start "rule__Slider__Group__15"
    // InternalSynthesizer.g:1484:1: rule__Slider__Group__15 : rule__Slider__Group__15__Impl ;
    public final void rule__Slider__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1488:1: ( rule__Slider__Group__15__Impl )
            // InternalSynthesizer.g:1489:2: rule__Slider__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Slider__Group__15__Impl();

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
    // $ANTLR end "rule__Slider__Group__15"


    // $ANTLR start "rule__Slider__Group__15__Impl"
    // InternalSynthesizer.g:1495:1: rule__Slider__Group__15__Impl : ( ')' ) ;
    public final void rule__Slider__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1499:1: ( ( ')' ) )
            // InternalSynthesizer.g:1500:1: ( ')' )
            {
            // InternalSynthesizer.g:1500:1: ( ')' )
            // InternalSynthesizer.g:1501:2: ')'
            {
             before(grammarAccess.getSliderAccess().getRightParenthesisKeyword_15()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSliderAccess().getRightParenthesisKeyword_15()); 

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
    // $ANTLR end "rule__Slider__Group__15__Impl"


    // $ANTLR start "rule__Button__Group__0"
    // InternalSynthesizer.g:1511:1: rule__Button__Group__0 : rule__Button__Group__0__Impl rule__Button__Group__1 ;
    public final void rule__Button__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1515:1: ( rule__Button__Group__0__Impl rule__Button__Group__1 )
            // InternalSynthesizer.g:1516:2: rule__Button__Group__0__Impl rule__Button__Group__1
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
    // InternalSynthesizer.g:1523:1: rule__Button__Group__0__Impl : ( 'button' ) ;
    public final void rule__Button__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1527:1: ( ( 'button' ) )
            // InternalSynthesizer.g:1528:1: ( 'button' )
            {
            // InternalSynthesizer.g:1528:1: ( 'button' )
            // InternalSynthesizer.g:1529:2: 'button'
            {
             before(grammarAccess.getButtonAccess().getButtonKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSynthesizer.g:1538:1: rule__Button__Group__1 : rule__Button__Group__1__Impl rule__Button__Group__2 ;
    public final void rule__Button__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1542:1: ( rule__Button__Group__1__Impl rule__Button__Group__2 )
            // InternalSynthesizer.g:1543:2: rule__Button__Group__1__Impl rule__Button__Group__2
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
    // InternalSynthesizer.g:1550:1: rule__Button__Group__1__Impl : ( ( rule__Button__NameAssignment_1 ) ) ;
    public final void rule__Button__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1554:1: ( ( ( rule__Button__NameAssignment_1 ) ) )
            // InternalSynthesizer.g:1555:1: ( ( rule__Button__NameAssignment_1 ) )
            {
            // InternalSynthesizer.g:1555:1: ( ( rule__Button__NameAssignment_1 ) )
            // InternalSynthesizer.g:1556:2: ( rule__Button__NameAssignment_1 )
            {
             before(grammarAccess.getButtonAccess().getNameAssignment_1()); 
            // InternalSynthesizer.g:1557:2: ( rule__Button__NameAssignment_1 )
            // InternalSynthesizer.g:1557:3: rule__Button__NameAssignment_1
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
    // InternalSynthesizer.g:1565:1: rule__Button__Group__2 : rule__Button__Group__2__Impl rule__Button__Group__3 ;
    public final void rule__Button__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1569:1: ( rule__Button__Group__2__Impl rule__Button__Group__3 )
            // InternalSynthesizer.g:1570:2: rule__Button__Group__2__Impl rule__Button__Group__3
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
    // InternalSynthesizer.g:1577:1: rule__Button__Group__2__Impl : ( '(' ) ;
    public final void rule__Button__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1581:1: ( ( '(' ) )
            // InternalSynthesizer.g:1582:1: ( '(' )
            {
            // InternalSynthesizer.g:1582:1: ( '(' )
            // InternalSynthesizer.g:1583:2: '('
            {
             before(grammarAccess.getButtonAccess().getLeftParenthesisKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalSynthesizer.g:1592:1: rule__Button__Group__3 : rule__Button__Group__3__Impl rule__Button__Group__4 ;
    public final void rule__Button__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1596:1: ( rule__Button__Group__3__Impl rule__Button__Group__4 )
            // InternalSynthesizer.g:1597:2: rule__Button__Group__3__Impl rule__Button__Group__4
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
    // InternalSynthesizer.g:1604:1: rule__Button__Group__3__Impl : ( 'x' ) ;
    public final void rule__Button__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1608:1: ( ( 'x' ) )
            // InternalSynthesizer.g:1609:1: ( 'x' )
            {
            // InternalSynthesizer.g:1609:1: ( 'x' )
            // InternalSynthesizer.g:1610:2: 'x'
            {
             before(grammarAccess.getButtonAccess().getXKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSynthesizer.g:1619:1: rule__Button__Group__4 : rule__Button__Group__4__Impl rule__Button__Group__5 ;
    public final void rule__Button__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1623:1: ( rule__Button__Group__4__Impl rule__Button__Group__5 )
            // InternalSynthesizer.g:1624:2: rule__Button__Group__4__Impl rule__Button__Group__5
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
    // InternalSynthesizer.g:1631:1: rule__Button__Group__4__Impl : ( ( rule__Button__XAssignment_4 ) ) ;
    public final void rule__Button__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1635:1: ( ( ( rule__Button__XAssignment_4 ) ) )
            // InternalSynthesizer.g:1636:1: ( ( rule__Button__XAssignment_4 ) )
            {
            // InternalSynthesizer.g:1636:1: ( ( rule__Button__XAssignment_4 ) )
            // InternalSynthesizer.g:1637:2: ( rule__Button__XAssignment_4 )
            {
             before(grammarAccess.getButtonAccess().getXAssignment_4()); 
            // InternalSynthesizer.g:1638:2: ( rule__Button__XAssignment_4 )
            // InternalSynthesizer.g:1638:3: rule__Button__XAssignment_4
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
    // InternalSynthesizer.g:1646:1: rule__Button__Group__5 : rule__Button__Group__5__Impl rule__Button__Group__6 ;
    public final void rule__Button__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1650:1: ( rule__Button__Group__5__Impl rule__Button__Group__6 )
            // InternalSynthesizer.g:1651:2: rule__Button__Group__5__Impl rule__Button__Group__6
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
    // InternalSynthesizer.g:1658:1: rule__Button__Group__5__Impl : ( 'y' ) ;
    public final void rule__Button__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1662:1: ( ( 'y' ) )
            // InternalSynthesizer.g:1663:1: ( 'y' )
            {
            // InternalSynthesizer.g:1663:1: ( 'y' )
            // InternalSynthesizer.g:1664:2: 'y'
            {
             before(grammarAccess.getButtonAccess().getYKeyword_5()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSynthesizer.g:1673:1: rule__Button__Group__6 : rule__Button__Group__6__Impl rule__Button__Group__7 ;
    public final void rule__Button__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1677:1: ( rule__Button__Group__6__Impl rule__Button__Group__7 )
            // InternalSynthesizer.g:1678:2: rule__Button__Group__6__Impl rule__Button__Group__7
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
    // InternalSynthesizer.g:1685:1: rule__Button__Group__6__Impl : ( ( rule__Button__YAssignment_6 ) ) ;
    public final void rule__Button__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1689:1: ( ( ( rule__Button__YAssignment_6 ) ) )
            // InternalSynthesizer.g:1690:1: ( ( rule__Button__YAssignment_6 ) )
            {
            // InternalSynthesizer.g:1690:1: ( ( rule__Button__YAssignment_6 ) )
            // InternalSynthesizer.g:1691:2: ( rule__Button__YAssignment_6 )
            {
             before(grammarAccess.getButtonAccess().getYAssignment_6()); 
            // InternalSynthesizer.g:1692:2: ( rule__Button__YAssignment_6 )
            // InternalSynthesizer.g:1692:3: rule__Button__YAssignment_6
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
    // InternalSynthesizer.g:1700:1: rule__Button__Group__7 : rule__Button__Group__7__Impl rule__Button__Group__8 ;
    public final void rule__Button__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1704:1: ( rule__Button__Group__7__Impl rule__Button__Group__8 )
            // InternalSynthesizer.g:1705:2: rule__Button__Group__7__Impl rule__Button__Group__8
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
    // InternalSynthesizer.g:1712:1: rule__Button__Group__7__Impl : ( 'width' ) ;
    public final void rule__Button__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1716:1: ( ( 'width' ) )
            // InternalSynthesizer.g:1717:1: ( 'width' )
            {
            // InternalSynthesizer.g:1717:1: ( 'width' )
            // InternalSynthesizer.g:1718:2: 'width'
            {
             before(grammarAccess.getButtonAccess().getWidthKeyword_7()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSynthesizer.g:1727:1: rule__Button__Group__8 : rule__Button__Group__8__Impl rule__Button__Group__9 ;
    public final void rule__Button__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1731:1: ( rule__Button__Group__8__Impl rule__Button__Group__9 )
            // InternalSynthesizer.g:1732:2: rule__Button__Group__8__Impl rule__Button__Group__9
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
    // InternalSynthesizer.g:1739:1: rule__Button__Group__8__Impl : ( ( rule__Button__WidthAssignment_8 ) ) ;
    public final void rule__Button__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1743:1: ( ( ( rule__Button__WidthAssignment_8 ) ) )
            // InternalSynthesizer.g:1744:1: ( ( rule__Button__WidthAssignment_8 ) )
            {
            // InternalSynthesizer.g:1744:1: ( ( rule__Button__WidthAssignment_8 ) )
            // InternalSynthesizer.g:1745:2: ( rule__Button__WidthAssignment_8 )
            {
             before(grammarAccess.getButtonAccess().getWidthAssignment_8()); 
            // InternalSynthesizer.g:1746:2: ( rule__Button__WidthAssignment_8 )
            // InternalSynthesizer.g:1746:3: rule__Button__WidthAssignment_8
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
    // InternalSynthesizer.g:1754:1: rule__Button__Group__9 : rule__Button__Group__9__Impl rule__Button__Group__10 ;
    public final void rule__Button__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1758:1: ( rule__Button__Group__9__Impl rule__Button__Group__10 )
            // InternalSynthesizer.g:1759:2: rule__Button__Group__9__Impl rule__Button__Group__10
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
    // InternalSynthesizer.g:1766:1: rule__Button__Group__9__Impl : ( 'height' ) ;
    public final void rule__Button__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1770:1: ( ( 'height' ) )
            // InternalSynthesizer.g:1771:1: ( 'height' )
            {
            // InternalSynthesizer.g:1771:1: ( 'height' )
            // InternalSynthesizer.g:1772:2: 'height'
            {
             before(grammarAccess.getButtonAccess().getHeightKeyword_9()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSynthesizer.g:1781:1: rule__Button__Group__10 : rule__Button__Group__10__Impl rule__Button__Group__11 ;
    public final void rule__Button__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1785:1: ( rule__Button__Group__10__Impl rule__Button__Group__11 )
            // InternalSynthesizer.g:1786:2: rule__Button__Group__10__Impl rule__Button__Group__11
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
    // InternalSynthesizer.g:1793:1: rule__Button__Group__10__Impl : ( ( rule__Button__HeightAssignment_10 ) ) ;
    public final void rule__Button__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1797:1: ( ( ( rule__Button__HeightAssignment_10 ) ) )
            // InternalSynthesizer.g:1798:1: ( ( rule__Button__HeightAssignment_10 ) )
            {
            // InternalSynthesizer.g:1798:1: ( ( rule__Button__HeightAssignment_10 ) )
            // InternalSynthesizer.g:1799:2: ( rule__Button__HeightAssignment_10 )
            {
             before(grammarAccess.getButtonAccess().getHeightAssignment_10()); 
            // InternalSynthesizer.g:1800:2: ( rule__Button__HeightAssignment_10 )
            // InternalSynthesizer.g:1800:3: rule__Button__HeightAssignment_10
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
    // InternalSynthesizer.g:1808:1: rule__Button__Group__11 : rule__Button__Group__11__Impl rule__Button__Group__12 ;
    public final void rule__Button__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1812:1: ( rule__Button__Group__11__Impl rule__Button__Group__12 )
            // InternalSynthesizer.g:1813:2: rule__Button__Group__11__Impl rule__Button__Group__12
            {
            pushFollow(FOLLOW_11);
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
    // InternalSynthesizer.g:1820:1: rule__Button__Group__11__Impl : ( 'sound' ) ;
    public final void rule__Button__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1824:1: ( ( 'sound' ) )
            // InternalSynthesizer.g:1825:1: ( 'sound' )
            {
            // InternalSynthesizer.g:1825:1: ( 'sound' )
            // InternalSynthesizer.g:1826:2: 'sound'
            {
             before(grammarAccess.getButtonAccess().getSoundKeyword_11()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getSoundKeyword_11()); 

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
    // InternalSynthesizer.g:1835:1: rule__Button__Group__12 : rule__Button__Group__12__Impl rule__Button__Group__13 ;
    public final void rule__Button__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1839:1: ( rule__Button__Group__12__Impl rule__Button__Group__13 )
            // InternalSynthesizer.g:1840:2: rule__Button__Group__12__Impl rule__Button__Group__13
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
    // InternalSynthesizer.g:1847:1: rule__Button__Group__12__Impl : ( ( rule__Button__SoundAssignment_12 ) ) ;
    public final void rule__Button__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1851:1: ( ( ( rule__Button__SoundAssignment_12 ) ) )
            // InternalSynthesizer.g:1852:1: ( ( rule__Button__SoundAssignment_12 ) )
            {
            // InternalSynthesizer.g:1852:1: ( ( rule__Button__SoundAssignment_12 ) )
            // InternalSynthesizer.g:1853:2: ( rule__Button__SoundAssignment_12 )
            {
             before(grammarAccess.getButtonAccess().getSoundAssignment_12()); 
            // InternalSynthesizer.g:1854:2: ( rule__Button__SoundAssignment_12 )
            // InternalSynthesizer.g:1854:3: rule__Button__SoundAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Button__SoundAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getSoundAssignment_12()); 

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
    // InternalSynthesizer.g:1862:1: rule__Button__Group__13 : rule__Button__Group__13__Impl ;
    public final void rule__Button__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1866:1: ( rule__Button__Group__13__Impl )
            // InternalSynthesizer.g:1867:2: rule__Button__Group__13__Impl
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
    // InternalSynthesizer.g:1873:1: rule__Button__Group__13__Impl : ( ')' ) ;
    public final void rule__Button__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1877:1: ( ( ')' ) )
            // InternalSynthesizer.g:1878:1: ( ')' )
            {
            // InternalSynthesizer.g:1878:1: ( ')' )
            // InternalSynthesizer.g:1879:2: ')'
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


    // $ANTLR start "rule__ConnectionElement__Group__0"
    // InternalSynthesizer.g:1889:1: rule__ConnectionElement__Group__0 : rule__ConnectionElement__Group__0__Impl rule__ConnectionElement__Group__1 ;
    public final void rule__ConnectionElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1893:1: ( rule__ConnectionElement__Group__0__Impl rule__ConnectionElement__Group__1 )
            // InternalSynthesizer.g:1894:2: rule__ConnectionElement__Group__0__Impl rule__ConnectionElement__Group__1
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
    // InternalSynthesizer.g:1901:1: rule__ConnectionElement__Group__0__Impl : ( 'linear' ) ;
    public final void rule__ConnectionElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1905:1: ( ( 'linear' ) )
            // InternalSynthesizer.g:1906:1: ( 'linear' )
            {
            // InternalSynthesizer.g:1906:1: ( 'linear' )
            // InternalSynthesizer.g:1907:2: 'linear'
            {
             before(grammarAccess.getConnectionElementAccess().getLinearKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSynthesizer.g:1916:1: rule__ConnectionElement__Group__1 : rule__ConnectionElement__Group__1__Impl rule__ConnectionElement__Group__2 ;
    public final void rule__ConnectionElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1920:1: ( rule__ConnectionElement__Group__1__Impl rule__ConnectionElement__Group__2 )
            // InternalSynthesizer.g:1921:2: rule__ConnectionElement__Group__1__Impl rule__ConnectionElement__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalSynthesizer.g:1928:1: rule__ConnectionElement__Group__1__Impl : ( ( rule__ConnectionElement__CeAssignment_1 ) ) ;
    public final void rule__ConnectionElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1932:1: ( ( ( rule__ConnectionElement__CeAssignment_1 ) ) )
            // InternalSynthesizer.g:1933:1: ( ( rule__ConnectionElement__CeAssignment_1 ) )
            {
            // InternalSynthesizer.g:1933:1: ( ( rule__ConnectionElement__CeAssignment_1 ) )
            // InternalSynthesizer.g:1934:2: ( rule__ConnectionElement__CeAssignment_1 )
            {
             before(grammarAccess.getConnectionElementAccess().getCeAssignment_1()); 
            // InternalSynthesizer.g:1935:2: ( rule__ConnectionElement__CeAssignment_1 )
            // InternalSynthesizer.g:1935:3: rule__ConnectionElement__CeAssignment_1
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
    // InternalSynthesizer.g:1943:1: rule__ConnectionElement__Group__2 : rule__ConnectionElement__Group__2__Impl ;
    public final void rule__ConnectionElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1947:1: ( rule__ConnectionElement__Group__2__Impl )
            // InternalSynthesizer.g:1948:2: rule__ConnectionElement__Group__2__Impl
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
    // InternalSynthesizer.g:1954:1: rule__ConnectionElement__Group__2__Impl : ( ( rule__ConnectionElement__SeAssignment_2 ) ) ;
    public final void rule__ConnectionElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1958:1: ( ( ( rule__ConnectionElement__SeAssignment_2 ) ) )
            // InternalSynthesizer.g:1959:1: ( ( rule__ConnectionElement__SeAssignment_2 ) )
            {
            // InternalSynthesizer.g:1959:1: ( ( rule__ConnectionElement__SeAssignment_2 ) )
            // InternalSynthesizer.g:1960:2: ( rule__ConnectionElement__SeAssignment_2 )
            {
             before(grammarAccess.getConnectionElementAccess().getSeAssignment_2()); 
            // InternalSynthesizer.g:1961:2: ( rule__ConnectionElement__SeAssignment_2 )
            // InternalSynthesizer.g:1961:3: rule__ConnectionElement__SeAssignment_2
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
    // InternalSynthesizer.g:1970:1: rule__SawToothOscillator__Group__0 : rule__SawToothOscillator__Group__0__Impl rule__SawToothOscillator__Group__1 ;
    public final void rule__SawToothOscillator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1974:1: ( rule__SawToothOscillator__Group__0__Impl rule__SawToothOscillator__Group__1 )
            // InternalSynthesizer.g:1975:2: rule__SawToothOscillator__Group__0__Impl rule__SawToothOscillator__Group__1
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
    // InternalSynthesizer.g:1982:1: rule__SawToothOscillator__Group__0__Impl : ( 'sawToothOscillator' ) ;
    public final void rule__SawToothOscillator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1986:1: ( ( 'sawToothOscillator' ) )
            // InternalSynthesizer.g:1987:1: ( 'sawToothOscillator' )
            {
            // InternalSynthesizer.g:1987:1: ( 'sawToothOscillator' )
            // InternalSynthesizer.g:1988:2: 'sawToothOscillator'
            {
             before(grammarAccess.getSawToothOscillatorAccess().getSawToothOscillatorKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSynthesizer.g:1997:1: rule__SawToothOscillator__Group__1 : rule__SawToothOscillator__Group__1__Impl rule__SawToothOscillator__Group__2 ;
    public final void rule__SawToothOscillator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2001:1: ( rule__SawToothOscillator__Group__1__Impl rule__SawToothOscillator__Group__2 )
            // InternalSynthesizer.g:2002:2: rule__SawToothOscillator__Group__1__Impl rule__SawToothOscillator__Group__2
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
    // InternalSynthesizer.g:2009:1: rule__SawToothOscillator__Group__1__Impl : ( ( rule__SawToothOscillator__NameAssignment_1 ) ) ;
    public final void rule__SawToothOscillator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2013:1: ( ( ( rule__SawToothOscillator__NameAssignment_1 ) ) )
            // InternalSynthesizer.g:2014:1: ( ( rule__SawToothOscillator__NameAssignment_1 ) )
            {
            // InternalSynthesizer.g:2014:1: ( ( rule__SawToothOscillator__NameAssignment_1 ) )
            // InternalSynthesizer.g:2015:2: ( rule__SawToothOscillator__NameAssignment_1 )
            {
             before(grammarAccess.getSawToothOscillatorAccess().getNameAssignment_1()); 
            // InternalSynthesizer.g:2016:2: ( rule__SawToothOscillator__NameAssignment_1 )
            // InternalSynthesizer.g:2016:3: rule__SawToothOscillator__NameAssignment_1
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
    // InternalSynthesizer.g:2024:1: rule__SawToothOscillator__Group__2 : rule__SawToothOscillator__Group__2__Impl rule__SawToothOscillator__Group__3 ;
    public final void rule__SawToothOscillator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2028:1: ( rule__SawToothOscillator__Group__2__Impl rule__SawToothOscillator__Group__3 )
            // InternalSynthesizer.g:2029:2: rule__SawToothOscillator__Group__2__Impl rule__SawToothOscillator__Group__3
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
    // InternalSynthesizer.g:2036:1: rule__SawToothOscillator__Group__2__Impl : ( '(' ) ;
    public final void rule__SawToothOscillator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2040:1: ( ( '(' ) )
            // InternalSynthesizer.g:2041:1: ( '(' )
            {
            // InternalSynthesizer.g:2041:1: ( '(' )
            // InternalSynthesizer.g:2042:2: '('
            {
             before(grammarAccess.getSawToothOscillatorAccess().getLeftParenthesisKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalSynthesizer.g:2051:1: rule__SawToothOscillator__Group__3 : rule__SawToothOscillator__Group__3__Impl rule__SawToothOscillator__Group__4 ;
    public final void rule__SawToothOscillator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2055:1: ( rule__SawToothOscillator__Group__3__Impl rule__SawToothOscillator__Group__4 )
            // InternalSynthesizer.g:2056:2: rule__SawToothOscillator__Group__3__Impl rule__SawToothOscillator__Group__4
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
    // InternalSynthesizer.g:2063:1: rule__SawToothOscillator__Group__3__Impl : ( 'frequency' ) ;
    public final void rule__SawToothOscillator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2067:1: ( ( 'frequency' ) )
            // InternalSynthesizer.g:2068:1: ( 'frequency' )
            {
            // InternalSynthesizer.g:2068:1: ( 'frequency' )
            // InternalSynthesizer.g:2069:2: 'frequency'
            {
             before(grammarAccess.getSawToothOscillatorAccess().getFrequencyKeyword_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getSawToothOscillatorAccess().getFrequencyKeyword_3()); 

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
    // InternalSynthesizer.g:2078:1: rule__SawToothOscillator__Group__4 : rule__SawToothOscillator__Group__4__Impl rule__SawToothOscillator__Group__5 ;
    public final void rule__SawToothOscillator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2082:1: ( rule__SawToothOscillator__Group__4__Impl rule__SawToothOscillator__Group__5 )
            // InternalSynthesizer.g:2083:2: rule__SawToothOscillator__Group__4__Impl rule__SawToothOscillator__Group__5
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
    // InternalSynthesizer.g:2090:1: rule__SawToothOscillator__Group__4__Impl : ( ( rule__SawToothOscillator__FrequencyAssignment_4 ) ) ;
    public final void rule__SawToothOscillator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2094:1: ( ( ( rule__SawToothOscillator__FrequencyAssignment_4 ) ) )
            // InternalSynthesizer.g:2095:1: ( ( rule__SawToothOscillator__FrequencyAssignment_4 ) )
            {
            // InternalSynthesizer.g:2095:1: ( ( rule__SawToothOscillator__FrequencyAssignment_4 ) )
            // InternalSynthesizer.g:2096:2: ( rule__SawToothOscillator__FrequencyAssignment_4 )
            {
             before(grammarAccess.getSawToothOscillatorAccess().getFrequencyAssignment_4()); 
            // InternalSynthesizer.g:2097:2: ( rule__SawToothOscillator__FrequencyAssignment_4 )
            // InternalSynthesizer.g:2097:3: rule__SawToothOscillator__FrequencyAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SawToothOscillator__FrequencyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSawToothOscillatorAccess().getFrequencyAssignment_4()); 

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
    // InternalSynthesizer.g:2105:1: rule__SawToothOscillator__Group__5 : rule__SawToothOscillator__Group__5__Impl rule__SawToothOscillator__Group__6 ;
    public final void rule__SawToothOscillator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2109:1: ( rule__SawToothOscillator__Group__5__Impl rule__SawToothOscillator__Group__6 )
            // InternalSynthesizer.g:2110:2: rule__SawToothOscillator__Group__5__Impl rule__SawToothOscillator__Group__6
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
    // InternalSynthesizer.g:2117:1: rule__SawToothOscillator__Group__5__Impl : ( 'amplitude' ) ;
    public final void rule__SawToothOscillator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2121:1: ( ( 'amplitude' ) )
            // InternalSynthesizer.g:2122:1: ( 'amplitude' )
            {
            // InternalSynthesizer.g:2122:1: ( 'amplitude' )
            // InternalSynthesizer.g:2123:2: 'amplitude'
            {
             before(grammarAccess.getSawToothOscillatorAccess().getAmplitudeKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSawToothOscillatorAccess().getAmplitudeKeyword_5()); 

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
    // InternalSynthesizer.g:2132:1: rule__SawToothOscillator__Group__6 : rule__SawToothOscillator__Group__6__Impl rule__SawToothOscillator__Group__7 ;
    public final void rule__SawToothOscillator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2136:1: ( rule__SawToothOscillator__Group__6__Impl rule__SawToothOscillator__Group__7 )
            // InternalSynthesizer.g:2137:2: rule__SawToothOscillator__Group__6__Impl rule__SawToothOscillator__Group__7
            {
            pushFollow(FOLLOW_18);
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
    // InternalSynthesizer.g:2144:1: rule__SawToothOscillator__Group__6__Impl : ( ( rule__SawToothOscillator__AmplitudeAssignment_6 ) ) ;
    public final void rule__SawToothOscillator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2148:1: ( ( ( rule__SawToothOscillator__AmplitudeAssignment_6 ) ) )
            // InternalSynthesizer.g:2149:1: ( ( rule__SawToothOscillator__AmplitudeAssignment_6 ) )
            {
            // InternalSynthesizer.g:2149:1: ( ( rule__SawToothOscillator__AmplitudeAssignment_6 ) )
            // InternalSynthesizer.g:2150:2: ( rule__SawToothOscillator__AmplitudeAssignment_6 )
            {
             before(grammarAccess.getSawToothOscillatorAccess().getAmplitudeAssignment_6()); 
            // InternalSynthesizer.g:2151:2: ( rule__SawToothOscillator__AmplitudeAssignment_6 )
            // InternalSynthesizer.g:2151:3: rule__SawToothOscillator__AmplitudeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__SawToothOscillator__AmplitudeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSawToothOscillatorAccess().getAmplitudeAssignment_6()); 

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
    // InternalSynthesizer.g:2159:1: rule__SawToothOscillator__Group__7 : rule__SawToothOscillator__Group__7__Impl ;
    public final void rule__SawToothOscillator__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2163:1: ( rule__SawToothOscillator__Group__7__Impl )
            // InternalSynthesizer.g:2164:2: rule__SawToothOscillator__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SawToothOscillator__Group__7__Impl();

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
    // InternalSynthesizer.g:2170:1: rule__SawToothOscillator__Group__7__Impl : ( ')' ) ;
    public final void rule__SawToothOscillator__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2174:1: ( ( ')' ) )
            // InternalSynthesizer.g:2175:1: ( ')' )
            {
            // InternalSynthesizer.g:2175:1: ( ')' )
            // InternalSynthesizer.g:2176:2: ')'
            {
             before(grammarAccess.getSawToothOscillatorAccess().getRightParenthesisKeyword_7()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSawToothOscillatorAccess().getRightParenthesisKeyword_7()); 

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


    // $ANTLR start "rule__SineOscillator__Group__0"
    // InternalSynthesizer.g:2186:1: rule__SineOscillator__Group__0 : rule__SineOscillator__Group__0__Impl rule__SineOscillator__Group__1 ;
    public final void rule__SineOscillator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2190:1: ( rule__SineOscillator__Group__0__Impl rule__SineOscillator__Group__1 )
            // InternalSynthesizer.g:2191:2: rule__SineOscillator__Group__0__Impl rule__SineOscillator__Group__1
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
    // InternalSynthesizer.g:2198:1: rule__SineOscillator__Group__0__Impl : ( 'sineOscillator' ) ;
    public final void rule__SineOscillator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2202:1: ( ( 'sineOscillator' ) )
            // InternalSynthesizer.g:2203:1: ( 'sineOscillator' )
            {
            // InternalSynthesizer.g:2203:1: ( 'sineOscillator' )
            // InternalSynthesizer.g:2204:2: 'sineOscillator'
            {
             before(grammarAccess.getSineOscillatorAccess().getSineOscillatorKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSynthesizer.g:2213:1: rule__SineOscillator__Group__1 : rule__SineOscillator__Group__1__Impl rule__SineOscillator__Group__2 ;
    public final void rule__SineOscillator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2217:1: ( rule__SineOscillator__Group__1__Impl rule__SineOscillator__Group__2 )
            // InternalSynthesizer.g:2218:2: rule__SineOscillator__Group__1__Impl rule__SineOscillator__Group__2
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
    // InternalSynthesizer.g:2225:1: rule__SineOscillator__Group__1__Impl : ( ( rule__SineOscillator__NameAssignment_1 ) ) ;
    public final void rule__SineOscillator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2229:1: ( ( ( rule__SineOscillator__NameAssignment_1 ) ) )
            // InternalSynthesizer.g:2230:1: ( ( rule__SineOscillator__NameAssignment_1 ) )
            {
            // InternalSynthesizer.g:2230:1: ( ( rule__SineOscillator__NameAssignment_1 ) )
            // InternalSynthesizer.g:2231:2: ( rule__SineOscillator__NameAssignment_1 )
            {
             before(grammarAccess.getSineOscillatorAccess().getNameAssignment_1()); 
            // InternalSynthesizer.g:2232:2: ( rule__SineOscillator__NameAssignment_1 )
            // InternalSynthesizer.g:2232:3: rule__SineOscillator__NameAssignment_1
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
    // InternalSynthesizer.g:2240:1: rule__SineOscillator__Group__2 : rule__SineOscillator__Group__2__Impl rule__SineOscillator__Group__3 ;
    public final void rule__SineOscillator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2244:1: ( rule__SineOscillator__Group__2__Impl rule__SineOscillator__Group__3 )
            // InternalSynthesizer.g:2245:2: rule__SineOscillator__Group__2__Impl rule__SineOscillator__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalSynthesizer.g:2252:1: rule__SineOscillator__Group__2__Impl : ( '(' ) ;
    public final void rule__SineOscillator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2256:1: ( ( '(' ) )
            // InternalSynthesizer.g:2257:1: ( '(' )
            {
            // InternalSynthesizer.g:2257:1: ( '(' )
            // InternalSynthesizer.g:2258:2: '('
            {
             before(grammarAccess.getSineOscillatorAccess().getLeftParenthesisKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalSynthesizer.g:2267:1: rule__SineOscillator__Group__3 : rule__SineOscillator__Group__3__Impl rule__SineOscillator__Group__4 ;
    public final void rule__SineOscillator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2271:1: ( rule__SineOscillator__Group__3__Impl rule__SineOscillator__Group__4 )
            // InternalSynthesizer.g:2272:2: rule__SineOscillator__Group__3__Impl rule__SineOscillator__Group__4
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
    // InternalSynthesizer.g:2279:1: rule__SineOscillator__Group__3__Impl : ( 'frequency' ) ;
    public final void rule__SineOscillator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2283:1: ( ( 'frequency' ) )
            // InternalSynthesizer.g:2284:1: ( 'frequency' )
            {
            // InternalSynthesizer.g:2284:1: ( 'frequency' )
            // InternalSynthesizer.g:2285:2: 'frequency'
            {
             before(grammarAccess.getSineOscillatorAccess().getFrequencyKeyword_3()); 
            match(input,11,FOLLOW_2); 
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
    // InternalSynthesizer.g:2294:1: rule__SineOscillator__Group__4 : rule__SineOscillator__Group__4__Impl rule__SineOscillator__Group__5 ;
    public final void rule__SineOscillator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2298:1: ( rule__SineOscillator__Group__4__Impl rule__SineOscillator__Group__5 )
            // InternalSynthesizer.g:2299:2: rule__SineOscillator__Group__4__Impl rule__SineOscillator__Group__5
            {
            pushFollow(FOLLOW_23);
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
    // InternalSynthesizer.g:2306:1: rule__SineOscillator__Group__4__Impl : ( ( rule__SineOscillator__FrequencyAssignment_4 ) ) ;
    public final void rule__SineOscillator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2310:1: ( ( ( rule__SineOscillator__FrequencyAssignment_4 ) ) )
            // InternalSynthesizer.g:2311:1: ( ( rule__SineOscillator__FrequencyAssignment_4 ) )
            {
            // InternalSynthesizer.g:2311:1: ( ( rule__SineOscillator__FrequencyAssignment_4 ) )
            // InternalSynthesizer.g:2312:2: ( rule__SineOscillator__FrequencyAssignment_4 )
            {
             before(grammarAccess.getSineOscillatorAccess().getFrequencyAssignment_4()); 
            // InternalSynthesizer.g:2313:2: ( rule__SineOscillator__FrequencyAssignment_4 )
            // InternalSynthesizer.g:2313:3: rule__SineOscillator__FrequencyAssignment_4
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
    // InternalSynthesizer.g:2321:1: rule__SineOscillator__Group__5 : rule__SineOscillator__Group__5__Impl rule__SineOscillator__Group__6 ;
    public final void rule__SineOscillator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2325:1: ( rule__SineOscillator__Group__5__Impl rule__SineOscillator__Group__6 )
            // InternalSynthesizer.g:2326:2: rule__SineOscillator__Group__5__Impl rule__SineOscillator__Group__6
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
    // InternalSynthesizer.g:2333:1: rule__SineOscillator__Group__5__Impl : ( 'amplitude' ) ;
    public final void rule__SineOscillator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2337:1: ( ( 'amplitude' ) )
            // InternalSynthesizer.g:2338:1: ( 'amplitude' )
            {
            // InternalSynthesizer.g:2338:1: ( 'amplitude' )
            // InternalSynthesizer.g:2339:2: 'amplitude'
            {
             before(grammarAccess.getSineOscillatorAccess().getAmplitudeKeyword_5()); 
            match(input,13,FOLLOW_2); 
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
    // InternalSynthesizer.g:2348:1: rule__SineOscillator__Group__6 : rule__SineOscillator__Group__6__Impl rule__SineOscillator__Group__7 ;
    public final void rule__SineOscillator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2352:1: ( rule__SineOscillator__Group__6__Impl rule__SineOscillator__Group__7 )
            // InternalSynthesizer.g:2353:2: rule__SineOscillator__Group__6__Impl rule__SineOscillator__Group__7
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
    // InternalSynthesizer.g:2360:1: rule__SineOscillator__Group__6__Impl : ( ( rule__SineOscillator__AmplitudeAssignment_6 ) ) ;
    public final void rule__SineOscillator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2364:1: ( ( ( rule__SineOscillator__AmplitudeAssignment_6 ) ) )
            // InternalSynthesizer.g:2365:1: ( ( rule__SineOscillator__AmplitudeAssignment_6 ) )
            {
            // InternalSynthesizer.g:2365:1: ( ( rule__SineOscillator__AmplitudeAssignment_6 ) )
            // InternalSynthesizer.g:2366:2: ( rule__SineOscillator__AmplitudeAssignment_6 )
            {
             before(grammarAccess.getSineOscillatorAccess().getAmplitudeAssignment_6()); 
            // InternalSynthesizer.g:2367:2: ( rule__SineOscillator__AmplitudeAssignment_6 )
            // InternalSynthesizer.g:2367:3: rule__SineOscillator__AmplitudeAssignment_6
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
    // InternalSynthesizer.g:2375:1: rule__SineOscillator__Group__7 : rule__SineOscillator__Group__7__Impl ;
    public final void rule__SineOscillator__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2379:1: ( rule__SineOscillator__Group__7__Impl )
            // InternalSynthesizer.g:2380:2: rule__SineOscillator__Group__7__Impl
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
    // InternalSynthesizer.g:2386:1: rule__SineOscillator__Group__7__Impl : ( ')' ) ;
    public final void rule__SineOscillator__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2390:1: ( ( ')' ) )
            // InternalSynthesizer.g:2391:1: ( ')' )
            {
            // InternalSynthesizer.g:2391:1: ( ')' )
            // InternalSynthesizer.g:2392:2: ')'
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
    // InternalSynthesizer.g:2402:1: rule__Model__ControlsAssignment_2 : ( ruleControlElement ) ;
    public final void rule__Model__ControlsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2406:1: ( ( ruleControlElement ) )
            // InternalSynthesizer.g:2407:2: ( ruleControlElement )
            {
            // InternalSynthesizer.g:2407:2: ( ruleControlElement )
            // InternalSynthesizer.g:2408:3: ruleControlElement
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
    // InternalSynthesizer.g:2417:1: rule__Model__SoundsAssignment_4_2 : ( ruleSoundElement ) ;
    public final void rule__Model__SoundsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2421:1: ( ( ruleSoundElement ) )
            // InternalSynthesizer.g:2422:2: ( ruleSoundElement )
            {
            // InternalSynthesizer.g:2422:2: ( ruleSoundElement )
            // InternalSynthesizer.g:2423:3: ruleSoundElement
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
    // InternalSynthesizer.g:2432:1: rule__Model__ConnectionsAssignment_5_2 : ( ruleConnectionElement ) ;
    public final void rule__Model__ConnectionsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2436:1: ( ( ruleConnectionElement ) )
            // InternalSynthesizer.g:2437:2: ( ruleConnectionElement )
            {
            // InternalSynthesizer.g:2437:2: ( ruleConnectionElement )
            // InternalSynthesizer.g:2438:3: ruleConnectionElement
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
    // InternalSynthesizer.g:2447:1: rule__RotaryKnob__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RotaryKnob__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2451:1: ( ( RULE_ID ) )
            // InternalSynthesizer.g:2452:2: ( RULE_ID )
            {
            // InternalSynthesizer.g:2452:2: ( RULE_ID )
            // InternalSynthesizer.g:2453:3: RULE_ID
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
    // InternalSynthesizer.g:2462:1: rule__RotaryKnob__XAssignment_4 : ( RULE_INT ) ;
    public final void rule__RotaryKnob__XAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2466:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:2467:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:2467:2: ( RULE_INT )
            // InternalSynthesizer.g:2468:3: RULE_INT
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
    // InternalSynthesizer.g:2477:1: rule__RotaryKnob__YAssignment_6 : ( RULE_INT ) ;
    public final void rule__RotaryKnob__YAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2481:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:2482:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:2482:2: ( RULE_INT )
            // InternalSynthesizer.g:2483:3: RULE_INT
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
    // InternalSynthesizer.g:2492:1: rule__RotaryKnob__WidthAssignment_8 : ( RULE_INT ) ;
    public final void rule__RotaryKnob__WidthAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2496:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:2497:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:2497:2: ( RULE_INT )
            // InternalSynthesizer.g:2498:3: RULE_INT
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
    // InternalSynthesizer.g:2507:1: rule__RotaryKnob__HeightAssignment_10 : ( RULE_INT ) ;
    public final void rule__RotaryKnob__HeightAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2511:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:2512:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:2512:2: ( RULE_INT )
            // InternalSynthesizer.g:2513:3: RULE_INT
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
    // InternalSynthesizer.g:2522:1: rule__Slider__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Slider__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2526:1: ( ( RULE_ID ) )
            // InternalSynthesizer.g:2527:2: ( RULE_ID )
            {
            // InternalSynthesizer.g:2527:2: ( RULE_ID )
            // InternalSynthesizer.g:2528:3: RULE_ID
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
    // InternalSynthesizer.g:2537:1: rule__Slider__XAssignment_4 : ( RULE_INT ) ;
    public final void rule__Slider__XAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2541:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:2542:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:2542:2: ( RULE_INT )
            // InternalSynthesizer.g:2543:3: RULE_INT
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
    // InternalSynthesizer.g:2552:1: rule__Slider__YAssignment_6 : ( RULE_INT ) ;
    public final void rule__Slider__YAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2556:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:2557:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:2557:2: ( RULE_INT )
            // InternalSynthesizer.g:2558:3: RULE_INT
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
    // InternalSynthesizer.g:2567:1: rule__Slider__WidthAssignment_8 : ( RULE_INT ) ;
    public final void rule__Slider__WidthAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2571:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:2572:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:2572:2: ( RULE_INT )
            // InternalSynthesizer.g:2573:3: RULE_INT
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
    // InternalSynthesizer.g:2582:1: rule__Slider__HeightAssignment_10 : ( RULE_INT ) ;
    public final void rule__Slider__HeightAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2586:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:2587:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:2587:2: ( RULE_INT )
            // InternalSynthesizer.g:2588:3: RULE_INT
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


    // $ANTLR start "rule__Slider__SoundAssignment_12"
    // InternalSynthesizer.g:2597:1: rule__Slider__SoundAssignment_12 : ( ( RULE_ID ) ) ;
    public final void rule__Slider__SoundAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2601:1: ( ( ( RULE_ID ) ) )
            // InternalSynthesizer.g:2602:2: ( ( RULE_ID ) )
            {
            // InternalSynthesizer.g:2602:2: ( ( RULE_ID ) )
            // InternalSynthesizer.g:2603:3: ( RULE_ID )
            {
             before(grammarAccess.getSliderAccess().getSoundSoundElementCrossReference_12_0()); 
            // InternalSynthesizer.g:2604:3: ( RULE_ID )
            // InternalSynthesizer.g:2605:4: RULE_ID
            {
             before(grammarAccess.getSliderAccess().getSoundSoundElementIDTerminalRuleCall_12_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSliderAccess().getSoundSoundElementIDTerminalRuleCall_12_0_1()); 

            }

             after(grammarAccess.getSliderAccess().getSoundSoundElementCrossReference_12_0()); 

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
    // $ANTLR end "rule__Slider__SoundAssignment_12"


    // $ANTLR start "rule__Slider__TypeAssignment_14"
    // InternalSynthesizer.g:2616:1: rule__Slider__TypeAssignment_14 : ( ruleEffect ) ;
    public final void rule__Slider__TypeAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2620:1: ( ( ruleEffect ) )
            // InternalSynthesizer.g:2621:2: ( ruleEffect )
            {
            // InternalSynthesizer.g:2621:2: ( ruleEffect )
            // InternalSynthesizer.g:2622:3: ruleEffect
            {
             before(grammarAccess.getSliderAccess().getTypeEffectParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleEffect();

            state._fsp--;

             after(grammarAccess.getSliderAccess().getTypeEffectParserRuleCall_14_0()); 

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
    // $ANTLR end "rule__Slider__TypeAssignment_14"


    // $ANTLR start "rule__Button__NameAssignment_1"
    // InternalSynthesizer.g:2631:1: rule__Button__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Button__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2635:1: ( ( RULE_ID ) )
            // InternalSynthesizer.g:2636:2: ( RULE_ID )
            {
            // InternalSynthesizer.g:2636:2: ( RULE_ID )
            // InternalSynthesizer.g:2637:3: RULE_ID
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
    // InternalSynthesizer.g:2646:1: rule__Button__XAssignment_4 : ( RULE_INT ) ;
    public final void rule__Button__XAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2650:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:2651:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:2651:2: ( RULE_INT )
            // InternalSynthesizer.g:2652:3: RULE_INT
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
    // InternalSynthesizer.g:2661:1: rule__Button__YAssignment_6 : ( RULE_INT ) ;
    public final void rule__Button__YAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2665:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:2666:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:2666:2: ( RULE_INT )
            // InternalSynthesizer.g:2667:3: RULE_INT
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
    // InternalSynthesizer.g:2676:1: rule__Button__WidthAssignment_8 : ( RULE_INT ) ;
    public final void rule__Button__WidthAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2680:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:2681:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:2681:2: ( RULE_INT )
            // InternalSynthesizer.g:2682:3: RULE_INT
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
    // InternalSynthesizer.g:2691:1: rule__Button__HeightAssignment_10 : ( RULE_INT ) ;
    public final void rule__Button__HeightAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2695:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:2696:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:2696:2: ( RULE_INT )
            // InternalSynthesizer.g:2697:3: RULE_INT
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


    // $ANTLR start "rule__Button__SoundAssignment_12"
    // InternalSynthesizer.g:2706:1: rule__Button__SoundAssignment_12 : ( ( RULE_ID ) ) ;
    public final void rule__Button__SoundAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2710:1: ( ( ( RULE_ID ) ) )
            // InternalSynthesizer.g:2711:2: ( ( RULE_ID ) )
            {
            // InternalSynthesizer.g:2711:2: ( ( RULE_ID ) )
            // InternalSynthesizer.g:2712:3: ( RULE_ID )
            {
             before(grammarAccess.getButtonAccess().getSoundSoundElementCrossReference_12_0()); 
            // InternalSynthesizer.g:2713:3: ( RULE_ID )
            // InternalSynthesizer.g:2714:4: RULE_ID
            {
             before(grammarAccess.getButtonAccess().getSoundSoundElementIDTerminalRuleCall_12_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getSoundSoundElementIDTerminalRuleCall_12_0_1()); 

            }

             after(grammarAccess.getButtonAccess().getSoundSoundElementCrossReference_12_0()); 

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
    // $ANTLR end "rule__Button__SoundAssignment_12"


    // $ANTLR start "rule__ConnectionElement__CeAssignment_1"
    // InternalSynthesizer.g:2725:1: rule__ConnectionElement__CeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ConnectionElement__CeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2729:1: ( ( ( RULE_ID ) ) )
            // InternalSynthesizer.g:2730:2: ( ( RULE_ID ) )
            {
            // InternalSynthesizer.g:2730:2: ( ( RULE_ID ) )
            // InternalSynthesizer.g:2731:3: ( RULE_ID )
            {
             before(grammarAccess.getConnectionElementAccess().getCeControlElementCrossReference_1_0()); 
            // InternalSynthesizer.g:2732:3: ( RULE_ID )
            // InternalSynthesizer.g:2733:4: RULE_ID
            {
             before(grammarAccess.getConnectionElementAccess().getCeControlElementIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConnectionElementAccess().getCeControlElementIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getConnectionElementAccess().getCeControlElementCrossReference_1_0()); 

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
    // InternalSynthesizer.g:2744:1: rule__ConnectionElement__SeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ConnectionElement__SeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2748:1: ( ( ( RULE_ID ) ) )
            // InternalSynthesizer.g:2749:2: ( ( RULE_ID ) )
            {
            // InternalSynthesizer.g:2749:2: ( ( RULE_ID ) )
            // InternalSynthesizer.g:2750:3: ( RULE_ID )
            {
             before(grammarAccess.getConnectionElementAccess().getSeSoundElementCrossReference_2_0()); 
            // InternalSynthesizer.g:2751:3: ( RULE_ID )
            // InternalSynthesizer.g:2752:4: RULE_ID
            {
             before(grammarAccess.getConnectionElementAccess().getSeSoundElementIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConnectionElementAccess().getSeSoundElementIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getConnectionElementAccess().getSeSoundElementCrossReference_2_0()); 

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
    // InternalSynthesizer.g:2763:1: rule__SawToothOscillator__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SawToothOscillator__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2767:1: ( ( RULE_ID ) )
            // InternalSynthesizer.g:2768:2: ( RULE_ID )
            {
            // InternalSynthesizer.g:2768:2: ( RULE_ID )
            // InternalSynthesizer.g:2769:3: RULE_ID
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


    // $ANTLR start "rule__SawToothOscillator__FrequencyAssignment_4"
    // InternalSynthesizer.g:2778:1: rule__SawToothOscillator__FrequencyAssignment_4 : ( RULE_INT ) ;
    public final void rule__SawToothOscillator__FrequencyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2782:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:2783:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:2783:2: ( RULE_INT )
            // InternalSynthesizer.g:2784:3: RULE_INT
            {
             before(grammarAccess.getSawToothOscillatorAccess().getFrequencyINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSawToothOscillatorAccess().getFrequencyINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__SawToothOscillator__FrequencyAssignment_4"


    // $ANTLR start "rule__SawToothOscillator__AmplitudeAssignment_6"
    // InternalSynthesizer.g:2793:1: rule__SawToothOscillator__AmplitudeAssignment_6 : ( RULE_INT ) ;
    public final void rule__SawToothOscillator__AmplitudeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2797:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:2798:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:2798:2: ( RULE_INT )
            // InternalSynthesizer.g:2799:3: RULE_INT
            {
             before(grammarAccess.getSawToothOscillatorAccess().getAmplitudeINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSawToothOscillatorAccess().getAmplitudeINTTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__SawToothOscillator__AmplitudeAssignment_6"


    // $ANTLR start "rule__SineOscillator__NameAssignment_1"
    // InternalSynthesizer.g:2808:1: rule__SineOscillator__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SineOscillator__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2812:1: ( ( RULE_ID ) )
            // InternalSynthesizer.g:2813:2: ( RULE_ID )
            {
            // InternalSynthesizer.g:2813:2: ( RULE_ID )
            // InternalSynthesizer.g:2814:3: RULE_ID
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
    // InternalSynthesizer.g:2823:1: rule__SineOscillator__FrequencyAssignment_4 : ( RULE_INT ) ;
    public final void rule__SineOscillator__FrequencyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2827:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:2828:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:2828:2: ( RULE_INT )
            // InternalSynthesizer.g:2829:3: RULE_INT
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
    // InternalSynthesizer.g:2838:1: rule__SineOscillator__AmplitudeAssignment_6 : ( RULE_INT ) ;
    public final void rule__SineOscillator__AmplitudeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2842:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:2843:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:2843:2: ( RULE_INT )
            // InternalSynthesizer.g:2844:3: RULE_INT
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000024090000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000024080002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000180010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000002000L});

}