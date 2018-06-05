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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'frequency'", "'amplitude'", "'Controls'", "'{'", "'}'", "'Sound'", "'Connections'", "'rotaryKnob'", "'('", "'x'", "'y'", "'width'", "'height'", "')'", "'slider'", "'sound'", "'effect'", "'button'", "'linear'", "'sawToothOscillator'", "'sineOscillator'", "'triangleOscillator'", "'squareOscillator'", "'pulseOscillator'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
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


    // $ANTLR start "entryRuleTriangleOscillator"
    // InternalSynthesizer.g:303:1: entryRuleTriangleOscillator : ruleTriangleOscillator EOF ;
    public final void entryRuleTriangleOscillator() throws RecognitionException {
        try {
            // InternalSynthesizer.g:304:1: ( ruleTriangleOscillator EOF )
            // InternalSynthesizer.g:305:1: ruleTriangleOscillator EOF
            {
             before(grammarAccess.getTriangleOscillatorRule()); 
            pushFollow(FOLLOW_1);
            ruleTriangleOscillator();

            state._fsp--;

             after(grammarAccess.getTriangleOscillatorRule()); 
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
    // $ANTLR end "entryRuleTriangleOscillator"


    // $ANTLR start "ruleTriangleOscillator"
    // InternalSynthesizer.g:312:1: ruleTriangleOscillator : ( ( rule__TriangleOscillator__Group__0 ) ) ;
    public final void ruleTriangleOscillator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:316:2: ( ( ( rule__TriangleOscillator__Group__0 ) ) )
            // InternalSynthesizer.g:317:2: ( ( rule__TriangleOscillator__Group__0 ) )
            {
            // InternalSynthesizer.g:317:2: ( ( rule__TriangleOscillator__Group__0 ) )
            // InternalSynthesizer.g:318:3: ( rule__TriangleOscillator__Group__0 )
            {
             before(grammarAccess.getTriangleOscillatorAccess().getGroup()); 
            // InternalSynthesizer.g:319:3: ( rule__TriangleOscillator__Group__0 )
            // InternalSynthesizer.g:319:4: rule__TriangleOscillator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TriangleOscillator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTriangleOscillatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTriangleOscillator"


    // $ANTLR start "entryRuleSquareOscillator"
    // InternalSynthesizer.g:328:1: entryRuleSquareOscillator : ruleSquareOscillator EOF ;
    public final void entryRuleSquareOscillator() throws RecognitionException {
        try {
            // InternalSynthesizer.g:329:1: ( ruleSquareOscillator EOF )
            // InternalSynthesizer.g:330:1: ruleSquareOscillator EOF
            {
             before(grammarAccess.getSquareOscillatorRule()); 
            pushFollow(FOLLOW_1);
            ruleSquareOscillator();

            state._fsp--;

             after(grammarAccess.getSquareOscillatorRule()); 
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
    // $ANTLR end "entryRuleSquareOscillator"


    // $ANTLR start "ruleSquareOscillator"
    // InternalSynthesizer.g:337:1: ruleSquareOscillator : ( ( rule__SquareOscillator__Group__0 ) ) ;
    public final void ruleSquareOscillator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:341:2: ( ( ( rule__SquareOscillator__Group__0 ) ) )
            // InternalSynthesizer.g:342:2: ( ( rule__SquareOscillator__Group__0 ) )
            {
            // InternalSynthesizer.g:342:2: ( ( rule__SquareOscillator__Group__0 ) )
            // InternalSynthesizer.g:343:3: ( rule__SquareOscillator__Group__0 )
            {
             before(grammarAccess.getSquareOscillatorAccess().getGroup()); 
            // InternalSynthesizer.g:344:3: ( rule__SquareOscillator__Group__0 )
            // InternalSynthesizer.g:344:4: rule__SquareOscillator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SquareOscillator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSquareOscillatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSquareOscillator"


    // $ANTLR start "entryRulePulseOscillator"
    // InternalSynthesizer.g:353:1: entryRulePulseOscillator : rulePulseOscillator EOF ;
    public final void entryRulePulseOscillator() throws RecognitionException {
        try {
            // InternalSynthesizer.g:354:1: ( rulePulseOscillator EOF )
            // InternalSynthesizer.g:355:1: rulePulseOscillator EOF
            {
             before(grammarAccess.getPulseOscillatorRule()); 
            pushFollow(FOLLOW_1);
            rulePulseOscillator();

            state._fsp--;

             after(grammarAccess.getPulseOscillatorRule()); 
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
    // $ANTLR end "entryRulePulseOscillator"


    // $ANTLR start "rulePulseOscillator"
    // InternalSynthesizer.g:362:1: rulePulseOscillator : ( ( rule__PulseOscillator__Group__0 ) ) ;
    public final void rulePulseOscillator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:366:2: ( ( ( rule__PulseOscillator__Group__0 ) ) )
            // InternalSynthesizer.g:367:2: ( ( rule__PulseOscillator__Group__0 ) )
            {
            // InternalSynthesizer.g:367:2: ( ( rule__PulseOscillator__Group__0 ) )
            // InternalSynthesizer.g:368:3: ( rule__PulseOscillator__Group__0 )
            {
             before(grammarAccess.getPulseOscillatorAccess().getGroup()); 
            // InternalSynthesizer.g:369:3: ( rule__PulseOscillator__Group__0 )
            // InternalSynthesizer.g:369:4: rule__PulseOscillator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PulseOscillator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPulseOscillatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePulseOscillator"


    // $ANTLR start "rule__ControlElement__Alternatives"
    // InternalSynthesizer.g:377:1: rule__ControlElement__Alternatives : ( ( ruleButton ) | ( ruleRotaryKnob ) | ( ruleSlider ) );
    public final void rule__ControlElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:381:1: ( ( ruleButton ) | ( ruleRotaryKnob ) | ( ruleSlider ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt1=1;
                }
                break;
            case 18:
                {
                alt1=2;
                }
                break;
            case 25:
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
                    // InternalSynthesizer.g:382:2: ( ruleButton )
                    {
                    // InternalSynthesizer.g:382:2: ( ruleButton )
                    // InternalSynthesizer.g:383:3: ruleButton
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
                    // InternalSynthesizer.g:388:2: ( ruleRotaryKnob )
                    {
                    // InternalSynthesizer.g:388:2: ( ruleRotaryKnob )
                    // InternalSynthesizer.g:389:3: ruleRotaryKnob
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
                    // InternalSynthesizer.g:394:2: ( ruleSlider )
                    {
                    // InternalSynthesizer.g:394:2: ( ruleSlider )
                    // InternalSynthesizer.g:395:3: ruleSlider
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
    // InternalSynthesizer.g:404:1: rule__Effect__Alternatives : ( ( 'frequency' ) | ( 'amplitude' ) );
    public final void rule__Effect__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:408:1: ( ( 'frequency' ) | ( 'amplitude' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSynthesizer.g:409:2: ( 'frequency' )
                    {
                    // InternalSynthesizer.g:409:2: ( 'frequency' )
                    // InternalSynthesizer.g:410:3: 'frequency'
                    {
                     before(grammarAccess.getEffectAccess().getFrequencyKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEffectAccess().getFrequencyKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSynthesizer.g:415:2: ( 'amplitude' )
                    {
                    // InternalSynthesizer.g:415:2: ( 'amplitude' )
                    // InternalSynthesizer.g:416:3: 'amplitude'
                    {
                     before(grammarAccess.getEffectAccess().getAmplitudeKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEffectAccess().getAmplitudeKeyword_1()); 

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
    // InternalSynthesizer.g:425:1: rule__SoundElement__Alternatives : ( ( ruleSawToothOscillator ) | ( ruleSineOscillator ) | ( ruleTriangleOscillator ) | ( ruleSquareOscillator ) | ( rulePulseOscillator ) );
    public final void rule__SoundElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:429:1: ( ( ruleSawToothOscillator ) | ( ruleSineOscillator ) | ( ruleTriangleOscillator ) | ( ruleSquareOscillator ) | ( rulePulseOscillator ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt3=1;
                }
                break;
            case 31:
                {
                alt3=2;
                }
                break;
            case 32:
                {
                alt3=3;
                }
                break;
            case 33:
                {
                alt3=4;
                }
                break;
            case 34:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSynthesizer.g:430:2: ( ruleSawToothOscillator )
                    {
                    // InternalSynthesizer.g:430:2: ( ruleSawToothOscillator )
                    // InternalSynthesizer.g:431:3: ruleSawToothOscillator
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
                    // InternalSynthesizer.g:436:2: ( ruleSineOscillator )
                    {
                    // InternalSynthesizer.g:436:2: ( ruleSineOscillator )
                    // InternalSynthesizer.g:437:3: ruleSineOscillator
                    {
                     before(grammarAccess.getSoundElementAccess().getSineOscillatorParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSineOscillator();

                    state._fsp--;

                     after(grammarAccess.getSoundElementAccess().getSineOscillatorParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSynthesizer.g:442:2: ( ruleTriangleOscillator )
                    {
                    // InternalSynthesizer.g:442:2: ( ruleTriangleOscillator )
                    // InternalSynthesizer.g:443:3: ruleTriangleOscillator
                    {
                     before(grammarAccess.getSoundElementAccess().getTriangleOscillatorParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTriangleOscillator();

                    state._fsp--;

                     after(grammarAccess.getSoundElementAccess().getTriangleOscillatorParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSynthesizer.g:448:2: ( ruleSquareOscillator )
                    {
                    // InternalSynthesizer.g:448:2: ( ruleSquareOscillator )
                    // InternalSynthesizer.g:449:3: ruleSquareOscillator
                    {
                     before(grammarAccess.getSoundElementAccess().getSquareOscillatorParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSquareOscillator();

                    state._fsp--;

                     after(grammarAccess.getSoundElementAccess().getSquareOscillatorParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSynthesizer.g:454:2: ( rulePulseOscillator )
                    {
                    // InternalSynthesizer.g:454:2: ( rulePulseOscillator )
                    // InternalSynthesizer.g:455:3: rulePulseOscillator
                    {
                     before(grammarAccess.getSoundElementAccess().getPulseOscillatorParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    rulePulseOscillator();

                    state._fsp--;

                     after(grammarAccess.getSoundElementAccess().getPulseOscillatorParserRuleCall_4()); 

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
    // InternalSynthesizer.g:464:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:468:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalSynthesizer.g:469:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalSynthesizer.g:476:1: rule__Model__Group__0__Impl : ( 'Controls' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:480:1: ( ( 'Controls' ) )
            // InternalSynthesizer.g:481:1: ( 'Controls' )
            {
            // InternalSynthesizer.g:481:1: ( 'Controls' )
            // InternalSynthesizer.g:482:2: 'Controls'
            {
             before(grammarAccess.getModelAccess().getControlsKeyword_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalSynthesizer.g:491:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:495:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalSynthesizer.g:496:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalSynthesizer.g:503:1: rule__Model__Group__1__Impl : ( '{' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:507:1: ( ( '{' ) )
            // InternalSynthesizer.g:508:1: ( '{' )
            {
            // InternalSynthesizer.g:508:1: ( '{' )
            // InternalSynthesizer.g:509:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
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
    // InternalSynthesizer.g:518:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:522:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalSynthesizer.g:523:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalSynthesizer.g:530:1: rule__Model__Group__2__Impl : ( ( rule__Model__ControlsAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:534:1: ( ( ( rule__Model__ControlsAssignment_2 )* ) )
            // InternalSynthesizer.g:535:1: ( ( rule__Model__ControlsAssignment_2 )* )
            {
            // InternalSynthesizer.g:535:1: ( ( rule__Model__ControlsAssignment_2 )* )
            // InternalSynthesizer.g:536:2: ( rule__Model__ControlsAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getControlsAssignment_2()); 
            // InternalSynthesizer.g:537:2: ( rule__Model__ControlsAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18||LA4_0==25||LA4_0==28) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSynthesizer.g:537:3: rule__Model__ControlsAssignment_2
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
    // InternalSynthesizer.g:545:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:549:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalSynthesizer.g:550:2: rule__Model__Group__3__Impl rule__Model__Group__4
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
    // InternalSynthesizer.g:557:1: rule__Model__Group__3__Impl : ( '}' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:561:1: ( ( '}' ) )
            // InternalSynthesizer.g:562:1: ( '}' )
            {
            // InternalSynthesizer.g:562:1: ( '}' )
            // InternalSynthesizer.g:563:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
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
    // InternalSynthesizer.g:572:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:576:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalSynthesizer.g:577:2: rule__Model__Group__4__Impl rule__Model__Group__5
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
    // InternalSynthesizer.g:584:1: rule__Model__Group__4__Impl : ( ( rule__Model__Group_4__0 )? ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:588:1: ( ( ( rule__Model__Group_4__0 )? ) )
            // InternalSynthesizer.g:589:1: ( ( rule__Model__Group_4__0 )? )
            {
            // InternalSynthesizer.g:589:1: ( ( rule__Model__Group_4__0 )? )
            // InternalSynthesizer.g:590:2: ( rule__Model__Group_4__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_4()); 
            // InternalSynthesizer.g:591:2: ( rule__Model__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSynthesizer.g:591:3: rule__Model__Group_4__0
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
    // InternalSynthesizer.g:599:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:603:1: ( rule__Model__Group__5__Impl )
            // InternalSynthesizer.g:604:2: rule__Model__Group__5__Impl
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
    // InternalSynthesizer.g:610:1: rule__Model__Group__5__Impl : ( ( rule__Model__Group_5__0 )? ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:614:1: ( ( ( rule__Model__Group_5__0 )? ) )
            // InternalSynthesizer.g:615:1: ( ( rule__Model__Group_5__0 )? )
            {
            // InternalSynthesizer.g:615:1: ( ( rule__Model__Group_5__0 )? )
            // InternalSynthesizer.g:616:2: ( rule__Model__Group_5__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_5()); 
            // InternalSynthesizer.g:617:2: ( rule__Model__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSynthesizer.g:617:3: rule__Model__Group_5__0
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
    // InternalSynthesizer.g:626:1: rule__Model__Group_4__0 : rule__Model__Group_4__0__Impl rule__Model__Group_4__1 ;
    public final void rule__Model__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:630:1: ( rule__Model__Group_4__0__Impl rule__Model__Group_4__1 )
            // InternalSynthesizer.g:631:2: rule__Model__Group_4__0__Impl rule__Model__Group_4__1
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
    // InternalSynthesizer.g:638:1: rule__Model__Group_4__0__Impl : ( 'Sound' ) ;
    public final void rule__Model__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:642:1: ( ( 'Sound' ) )
            // InternalSynthesizer.g:643:1: ( 'Sound' )
            {
            // InternalSynthesizer.g:643:1: ( 'Sound' )
            // InternalSynthesizer.g:644:2: 'Sound'
            {
             before(grammarAccess.getModelAccess().getSoundKeyword_4_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalSynthesizer.g:653:1: rule__Model__Group_4__1 : rule__Model__Group_4__1__Impl rule__Model__Group_4__2 ;
    public final void rule__Model__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:657:1: ( rule__Model__Group_4__1__Impl rule__Model__Group_4__2 )
            // InternalSynthesizer.g:658:2: rule__Model__Group_4__1__Impl rule__Model__Group_4__2
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
    // InternalSynthesizer.g:665:1: rule__Model__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Model__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:669:1: ( ( '{' ) )
            // InternalSynthesizer.g:670:1: ( '{' )
            {
            // InternalSynthesizer.g:670:1: ( '{' )
            // InternalSynthesizer.g:671:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,14,FOLLOW_2); 
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
    // InternalSynthesizer.g:680:1: rule__Model__Group_4__2 : rule__Model__Group_4__2__Impl rule__Model__Group_4__3 ;
    public final void rule__Model__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:684:1: ( rule__Model__Group_4__2__Impl rule__Model__Group_4__3 )
            // InternalSynthesizer.g:685:2: rule__Model__Group_4__2__Impl rule__Model__Group_4__3
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
    // InternalSynthesizer.g:692:1: rule__Model__Group_4__2__Impl : ( ( rule__Model__SoundsAssignment_4_2 )* ) ;
    public final void rule__Model__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:696:1: ( ( ( rule__Model__SoundsAssignment_4_2 )* ) )
            // InternalSynthesizer.g:697:1: ( ( rule__Model__SoundsAssignment_4_2 )* )
            {
            // InternalSynthesizer.g:697:1: ( ( rule__Model__SoundsAssignment_4_2 )* )
            // InternalSynthesizer.g:698:2: ( rule__Model__SoundsAssignment_4_2 )*
            {
             before(grammarAccess.getModelAccess().getSoundsAssignment_4_2()); 
            // InternalSynthesizer.g:699:2: ( rule__Model__SoundsAssignment_4_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=30 && LA7_0<=34)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSynthesizer.g:699:3: rule__Model__SoundsAssignment_4_2
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
    // InternalSynthesizer.g:707:1: rule__Model__Group_4__3 : rule__Model__Group_4__3__Impl ;
    public final void rule__Model__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:711:1: ( rule__Model__Group_4__3__Impl )
            // InternalSynthesizer.g:712:2: rule__Model__Group_4__3__Impl
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
    // InternalSynthesizer.g:718:1: rule__Model__Group_4__3__Impl : ( '}' ) ;
    public final void rule__Model__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:722:1: ( ( '}' ) )
            // InternalSynthesizer.g:723:1: ( '}' )
            {
            // InternalSynthesizer.g:723:1: ( '}' )
            // InternalSynthesizer.g:724:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,15,FOLLOW_2); 
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
    // InternalSynthesizer.g:734:1: rule__Model__Group_5__0 : rule__Model__Group_5__0__Impl rule__Model__Group_5__1 ;
    public final void rule__Model__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:738:1: ( rule__Model__Group_5__0__Impl rule__Model__Group_5__1 )
            // InternalSynthesizer.g:739:2: rule__Model__Group_5__0__Impl rule__Model__Group_5__1
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
    // InternalSynthesizer.g:746:1: rule__Model__Group_5__0__Impl : ( 'Connections' ) ;
    public final void rule__Model__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:750:1: ( ( 'Connections' ) )
            // InternalSynthesizer.g:751:1: ( 'Connections' )
            {
            // InternalSynthesizer.g:751:1: ( 'Connections' )
            // InternalSynthesizer.g:752:2: 'Connections'
            {
             before(grammarAccess.getModelAccess().getConnectionsKeyword_5_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalSynthesizer.g:761:1: rule__Model__Group_5__1 : rule__Model__Group_5__1__Impl rule__Model__Group_5__2 ;
    public final void rule__Model__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:765:1: ( rule__Model__Group_5__1__Impl rule__Model__Group_5__2 )
            // InternalSynthesizer.g:766:2: rule__Model__Group_5__1__Impl rule__Model__Group_5__2
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
    // InternalSynthesizer.g:773:1: rule__Model__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Model__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:777:1: ( ( '{' ) )
            // InternalSynthesizer.g:778:1: ( '{' )
            {
            // InternalSynthesizer.g:778:1: ( '{' )
            // InternalSynthesizer.g:779:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,14,FOLLOW_2); 
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
    // InternalSynthesizer.g:788:1: rule__Model__Group_5__2 : rule__Model__Group_5__2__Impl rule__Model__Group_5__3 ;
    public final void rule__Model__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:792:1: ( rule__Model__Group_5__2__Impl rule__Model__Group_5__3 )
            // InternalSynthesizer.g:793:2: rule__Model__Group_5__2__Impl rule__Model__Group_5__3
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
    // InternalSynthesizer.g:800:1: rule__Model__Group_5__2__Impl : ( ( rule__Model__ConnectionsAssignment_5_2 )* ) ;
    public final void rule__Model__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:804:1: ( ( ( rule__Model__ConnectionsAssignment_5_2 )* ) )
            // InternalSynthesizer.g:805:1: ( ( rule__Model__ConnectionsAssignment_5_2 )* )
            {
            // InternalSynthesizer.g:805:1: ( ( rule__Model__ConnectionsAssignment_5_2 )* )
            // InternalSynthesizer.g:806:2: ( rule__Model__ConnectionsAssignment_5_2 )*
            {
             before(grammarAccess.getModelAccess().getConnectionsAssignment_5_2()); 
            // InternalSynthesizer.g:807:2: ( rule__Model__ConnectionsAssignment_5_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==29) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSynthesizer.g:807:3: rule__Model__ConnectionsAssignment_5_2
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
    // InternalSynthesizer.g:815:1: rule__Model__Group_5__3 : rule__Model__Group_5__3__Impl ;
    public final void rule__Model__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:819:1: ( rule__Model__Group_5__3__Impl )
            // InternalSynthesizer.g:820:2: rule__Model__Group_5__3__Impl
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
    // InternalSynthesizer.g:826:1: rule__Model__Group_5__3__Impl : ( '}' ) ;
    public final void rule__Model__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:830:1: ( ( '}' ) )
            // InternalSynthesizer.g:831:1: ( '}' )
            {
            // InternalSynthesizer.g:831:1: ( '}' )
            // InternalSynthesizer.g:832:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5_3()); 
            match(input,15,FOLLOW_2); 
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
    // InternalSynthesizer.g:842:1: rule__RotaryKnob__Group__0 : rule__RotaryKnob__Group__0__Impl rule__RotaryKnob__Group__1 ;
    public final void rule__RotaryKnob__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:846:1: ( rule__RotaryKnob__Group__0__Impl rule__RotaryKnob__Group__1 )
            // InternalSynthesizer.g:847:2: rule__RotaryKnob__Group__0__Impl rule__RotaryKnob__Group__1
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
    // InternalSynthesizer.g:854:1: rule__RotaryKnob__Group__0__Impl : ( 'rotaryKnob' ) ;
    public final void rule__RotaryKnob__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:858:1: ( ( 'rotaryKnob' ) )
            // InternalSynthesizer.g:859:1: ( 'rotaryKnob' )
            {
            // InternalSynthesizer.g:859:1: ( 'rotaryKnob' )
            // InternalSynthesizer.g:860:2: 'rotaryKnob'
            {
             before(grammarAccess.getRotaryKnobAccess().getRotaryKnobKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalSynthesizer.g:869:1: rule__RotaryKnob__Group__1 : rule__RotaryKnob__Group__1__Impl rule__RotaryKnob__Group__2 ;
    public final void rule__RotaryKnob__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:873:1: ( rule__RotaryKnob__Group__1__Impl rule__RotaryKnob__Group__2 )
            // InternalSynthesizer.g:874:2: rule__RotaryKnob__Group__1__Impl rule__RotaryKnob__Group__2
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
    // InternalSynthesizer.g:881:1: rule__RotaryKnob__Group__1__Impl : ( ( rule__RotaryKnob__NameAssignment_1 ) ) ;
    public final void rule__RotaryKnob__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:885:1: ( ( ( rule__RotaryKnob__NameAssignment_1 ) ) )
            // InternalSynthesizer.g:886:1: ( ( rule__RotaryKnob__NameAssignment_1 ) )
            {
            // InternalSynthesizer.g:886:1: ( ( rule__RotaryKnob__NameAssignment_1 ) )
            // InternalSynthesizer.g:887:2: ( rule__RotaryKnob__NameAssignment_1 )
            {
             before(grammarAccess.getRotaryKnobAccess().getNameAssignment_1()); 
            // InternalSynthesizer.g:888:2: ( rule__RotaryKnob__NameAssignment_1 )
            // InternalSynthesizer.g:888:3: rule__RotaryKnob__NameAssignment_1
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
    // InternalSynthesizer.g:896:1: rule__RotaryKnob__Group__2 : rule__RotaryKnob__Group__2__Impl rule__RotaryKnob__Group__3 ;
    public final void rule__RotaryKnob__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:900:1: ( rule__RotaryKnob__Group__2__Impl rule__RotaryKnob__Group__3 )
            // InternalSynthesizer.g:901:2: rule__RotaryKnob__Group__2__Impl rule__RotaryKnob__Group__3
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
    // InternalSynthesizer.g:908:1: rule__RotaryKnob__Group__2__Impl : ( '(' ) ;
    public final void rule__RotaryKnob__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:912:1: ( ( '(' ) )
            // InternalSynthesizer.g:913:1: ( '(' )
            {
            // InternalSynthesizer.g:913:1: ( '(' )
            // InternalSynthesizer.g:914:2: '('
            {
             before(grammarAccess.getRotaryKnobAccess().getLeftParenthesisKeyword_2()); 
            match(input,19,FOLLOW_2); 
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
    // InternalSynthesizer.g:923:1: rule__RotaryKnob__Group__3 : rule__RotaryKnob__Group__3__Impl rule__RotaryKnob__Group__4 ;
    public final void rule__RotaryKnob__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:927:1: ( rule__RotaryKnob__Group__3__Impl rule__RotaryKnob__Group__4 )
            // InternalSynthesizer.g:928:2: rule__RotaryKnob__Group__3__Impl rule__RotaryKnob__Group__4
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
    // InternalSynthesizer.g:935:1: rule__RotaryKnob__Group__3__Impl : ( 'x' ) ;
    public final void rule__RotaryKnob__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:939:1: ( ( 'x' ) )
            // InternalSynthesizer.g:940:1: ( 'x' )
            {
            // InternalSynthesizer.g:940:1: ( 'x' )
            // InternalSynthesizer.g:941:2: 'x'
            {
             before(grammarAccess.getRotaryKnobAccess().getXKeyword_3()); 
            match(input,20,FOLLOW_2); 
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
    // InternalSynthesizer.g:950:1: rule__RotaryKnob__Group__4 : rule__RotaryKnob__Group__4__Impl rule__RotaryKnob__Group__5 ;
    public final void rule__RotaryKnob__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:954:1: ( rule__RotaryKnob__Group__4__Impl rule__RotaryKnob__Group__5 )
            // InternalSynthesizer.g:955:2: rule__RotaryKnob__Group__4__Impl rule__RotaryKnob__Group__5
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
    // InternalSynthesizer.g:962:1: rule__RotaryKnob__Group__4__Impl : ( ( rule__RotaryKnob__XAssignment_4 ) ) ;
    public final void rule__RotaryKnob__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:966:1: ( ( ( rule__RotaryKnob__XAssignment_4 ) ) )
            // InternalSynthesizer.g:967:1: ( ( rule__RotaryKnob__XAssignment_4 ) )
            {
            // InternalSynthesizer.g:967:1: ( ( rule__RotaryKnob__XAssignment_4 ) )
            // InternalSynthesizer.g:968:2: ( rule__RotaryKnob__XAssignment_4 )
            {
             before(grammarAccess.getRotaryKnobAccess().getXAssignment_4()); 
            // InternalSynthesizer.g:969:2: ( rule__RotaryKnob__XAssignment_4 )
            // InternalSynthesizer.g:969:3: rule__RotaryKnob__XAssignment_4
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
    // InternalSynthesizer.g:977:1: rule__RotaryKnob__Group__5 : rule__RotaryKnob__Group__5__Impl rule__RotaryKnob__Group__6 ;
    public final void rule__RotaryKnob__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:981:1: ( rule__RotaryKnob__Group__5__Impl rule__RotaryKnob__Group__6 )
            // InternalSynthesizer.g:982:2: rule__RotaryKnob__Group__5__Impl rule__RotaryKnob__Group__6
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
    // InternalSynthesizer.g:989:1: rule__RotaryKnob__Group__5__Impl : ( 'y' ) ;
    public final void rule__RotaryKnob__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:993:1: ( ( 'y' ) )
            // InternalSynthesizer.g:994:1: ( 'y' )
            {
            // InternalSynthesizer.g:994:1: ( 'y' )
            // InternalSynthesizer.g:995:2: 'y'
            {
             before(grammarAccess.getRotaryKnobAccess().getYKeyword_5()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSynthesizer.g:1004:1: rule__RotaryKnob__Group__6 : rule__RotaryKnob__Group__6__Impl rule__RotaryKnob__Group__7 ;
    public final void rule__RotaryKnob__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1008:1: ( rule__RotaryKnob__Group__6__Impl rule__RotaryKnob__Group__7 )
            // InternalSynthesizer.g:1009:2: rule__RotaryKnob__Group__6__Impl rule__RotaryKnob__Group__7
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
    // InternalSynthesizer.g:1016:1: rule__RotaryKnob__Group__6__Impl : ( ( rule__RotaryKnob__YAssignment_6 ) ) ;
    public final void rule__RotaryKnob__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1020:1: ( ( ( rule__RotaryKnob__YAssignment_6 ) ) )
            // InternalSynthesizer.g:1021:1: ( ( rule__RotaryKnob__YAssignment_6 ) )
            {
            // InternalSynthesizer.g:1021:1: ( ( rule__RotaryKnob__YAssignment_6 ) )
            // InternalSynthesizer.g:1022:2: ( rule__RotaryKnob__YAssignment_6 )
            {
             before(grammarAccess.getRotaryKnobAccess().getYAssignment_6()); 
            // InternalSynthesizer.g:1023:2: ( rule__RotaryKnob__YAssignment_6 )
            // InternalSynthesizer.g:1023:3: rule__RotaryKnob__YAssignment_6
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
    // InternalSynthesizer.g:1031:1: rule__RotaryKnob__Group__7 : rule__RotaryKnob__Group__7__Impl rule__RotaryKnob__Group__8 ;
    public final void rule__RotaryKnob__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1035:1: ( rule__RotaryKnob__Group__7__Impl rule__RotaryKnob__Group__8 )
            // InternalSynthesizer.g:1036:2: rule__RotaryKnob__Group__7__Impl rule__RotaryKnob__Group__8
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
    // InternalSynthesizer.g:1043:1: rule__RotaryKnob__Group__7__Impl : ( 'width' ) ;
    public final void rule__RotaryKnob__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1047:1: ( ( 'width' ) )
            // InternalSynthesizer.g:1048:1: ( 'width' )
            {
            // InternalSynthesizer.g:1048:1: ( 'width' )
            // InternalSynthesizer.g:1049:2: 'width'
            {
             before(grammarAccess.getRotaryKnobAccess().getWidthKeyword_7()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSynthesizer.g:1058:1: rule__RotaryKnob__Group__8 : rule__RotaryKnob__Group__8__Impl rule__RotaryKnob__Group__9 ;
    public final void rule__RotaryKnob__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1062:1: ( rule__RotaryKnob__Group__8__Impl rule__RotaryKnob__Group__9 )
            // InternalSynthesizer.g:1063:2: rule__RotaryKnob__Group__8__Impl rule__RotaryKnob__Group__9
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
    // InternalSynthesizer.g:1070:1: rule__RotaryKnob__Group__8__Impl : ( ( rule__RotaryKnob__WidthAssignment_8 ) ) ;
    public final void rule__RotaryKnob__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1074:1: ( ( ( rule__RotaryKnob__WidthAssignment_8 ) ) )
            // InternalSynthesizer.g:1075:1: ( ( rule__RotaryKnob__WidthAssignment_8 ) )
            {
            // InternalSynthesizer.g:1075:1: ( ( rule__RotaryKnob__WidthAssignment_8 ) )
            // InternalSynthesizer.g:1076:2: ( rule__RotaryKnob__WidthAssignment_8 )
            {
             before(grammarAccess.getRotaryKnobAccess().getWidthAssignment_8()); 
            // InternalSynthesizer.g:1077:2: ( rule__RotaryKnob__WidthAssignment_8 )
            // InternalSynthesizer.g:1077:3: rule__RotaryKnob__WidthAssignment_8
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
    // InternalSynthesizer.g:1085:1: rule__RotaryKnob__Group__9 : rule__RotaryKnob__Group__9__Impl rule__RotaryKnob__Group__10 ;
    public final void rule__RotaryKnob__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1089:1: ( rule__RotaryKnob__Group__9__Impl rule__RotaryKnob__Group__10 )
            // InternalSynthesizer.g:1090:2: rule__RotaryKnob__Group__9__Impl rule__RotaryKnob__Group__10
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
    // InternalSynthesizer.g:1097:1: rule__RotaryKnob__Group__9__Impl : ( 'height' ) ;
    public final void rule__RotaryKnob__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1101:1: ( ( 'height' ) )
            // InternalSynthesizer.g:1102:1: ( 'height' )
            {
            // InternalSynthesizer.g:1102:1: ( 'height' )
            // InternalSynthesizer.g:1103:2: 'height'
            {
             before(grammarAccess.getRotaryKnobAccess().getHeightKeyword_9()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSynthesizer.g:1112:1: rule__RotaryKnob__Group__10 : rule__RotaryKnob__Group__10__Impl rule__RotaryKnob__Group__11 ;
    public final void rule__RotaryKnob__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1116:1: ( rule__RotaryKnob__Group__10__Impl rule__RotaryKnob__Group__11 )
            // InternalSynthesizer.g:1117:2: rule__RotaryKnob__Group__10__Impl rule__RotaryKnob__Group__11
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
    // InternalSynthesizer.g:1124:1: rule__RotaryKnob__Group__10__Impl : ( ( rule__RotaryKnob__HeightAssignment_10 ) ) ;
    public final void rule__RotaryKnob__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1128:1: ( ( ( rule__RotaryKnob__HeightAssignment_10 ) ) )
            // InternalSynthesizer.g:1129:1: ( ( rule__RotaryKnob__HeightAssignment_10 ) )
            {
            // InternalSynthesizer.g:1129:1: ( ( rule__RotaryKnob__HeightAssignment_10 ) )
            // InternalSynthesizer.g:1130:2: ( rule__RotaryKnob__HeightAssignment_10 )
            {
             before(grammarAccess.getRotaryKnobAccess().getHeightAssignment_10()); 
            // InternalSynthesizer.g:1131:2: ( rule__RotaryKnob__HeightAssignment_10 )
            // InternalSynthesizer.g:1131:3: rule__RotaryKnob__HeightAssignment_10
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
    // InternalSynthesizer.g:1139:1: rule__RotaryKnob__Group__11 : rule__RotaryKnob__Group__11__Impl ;
    public final void rule__RotaryKnob__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1143:1: ( rule__RotaryKnob__Group__11__Impl )
            // InternalSynthesizer.g:1144:2: rule__RotaryKnob__Group__11__Impl
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
    // InternalSynthesizer.g:1150:1: rule__RotaryKnob__Group__11__Impl : ( ')' ) ;
    public final void rule__RotaryKnob__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1154:1: ( ( ')' ) )
            // InternalSynthesizer.g:1155:1: ( ')' )
            {
            // InternalSynthesizer.g:1155:1: ( ')' )
            // InternalSynthesizer.g:1156:2: ')'
            {
             before(grammarAccess.getRotaryKnobAccess().getRightParenthesisKeyword_11()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSynthesizer.g:1166:1: rule__Slider__Group__0 : rule__Slider__Group__0__Impl rule__Slider__Group__1 ;
    public final void rule__Slider__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1170:1: ( rule__Slider__Group__0__Impl rule__Slider__Group__1 )
            // InternalSynthesizer.g:1171:2: rule__Slider__Group__0__Impl rule__Slider__Group__1
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
    // InternalSynthesizer.g:1178:1: rule__Slider__Group__0__Impl : ( 'slider' ) ;
    public final void rule__Slider__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1182:1: ( ( 'slider' ) )
            // InternalSynthesizer.g:1183:1: ( 'slider' )
            {
            // InternalSynthesizer.g:1183:1: ( 'slider' )
            // InternalSynthesizer.g:1184:2: 'slider'
            {
             before(grammarAccess.getSliderAccess().getSliderKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSynthesizer.g:1193:1: rule__Slider__Group__1 : rule__Slider__Group__1__Impl rule__Slider__Group__2 ;
    public final void rule__Slider__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1197:1: ( rule__Slider__Group__1__Impl rule__Slider__Group__2 )
            // InternalSynthesizer.g:1198:2: rule__Slider__Group__1__Impl rule__Slider__Group__2
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
    // InternalSynthesizer.g:1205:1: rule__Slider__Group__1__Impl : ( ( rule__Slider__NameAssignment_1 ) ) ;
    public final void rule__Slider__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1209:1: ( ( ( rule__Slider__NameAssignment_1 ) ) )
            // InternalSynthesizer.g:1210:1: ( ( rule__Slider__NameAssignment_1 ) )
            {
            // InternalSynthesizer.g:1210:1: ( ( rule__Slider__NameAssignment_1 ) )
            // InternalSynthesizer.g:1211:2: ( rule__Slider__NameAssignment_1 )
            {
             before(grammarAccess.getSliderAccess().getNameAssignment_1()); 
            // InternalSynthesizer.g:1212:2: ( rule__Slider__NameAssignment_1 )
            // InternalSynthesizer.g:1212:3: rule__Slider__NameAssignment_1
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
    // InternalSynthesizer.g:1220:1: rule__Slider__Group__2 : rule__Slider__Group__2__Impl rule__Slider__Group__3 ;
    public final void rule__Slider__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1224:1: ( rule__Slider__Group__2__Impl rule__Slider__Group__3 )
            // InternalSynthesizer.g:1225:2: rule__Slider__Group__2__Impl rule__Slider__Group__3
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
    // InternalSynthesizer.g:1232:1: rule__Slider__Group__2__Impl : ( '(' ) ;
    public final void rule__Slider__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1236:1: ( ( '(' ) )
            // InternalSynthesizer.g:1237:1: ( '(' )
            {
            // InternalSynthesizer.g:1237:1: ( '(' )
            // InternalSynthesizer.g:1238:2: '('
            {
             before(grammarAccess.getSliderAccess().getLeftParenthesisKeyword_2()); 
            match(input,19,FOLLOW_2); 
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
    // InternalSynthesizer.g:1247:1: rule__Slider__Group__3 : rule__Slider__Group__3__Impl rule__Slider__Group__4 ;
    public final void rule__Slider__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1251:1: ( rule__Slider__Group__3__Impl rule__Slider__Group__4 )
            // InternalSynthesizer.g:1252:2: rule__Slider__Group__3__Impl rule__Slider__Group__4
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
    // InternalSynthesizer.g:1259:1: rule__Slider__Group__3__Impl : ( 'x' ) ;
    public final void rule__Slider__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1263:1: ( ( 'x' ) )
            // InternalSynthesizer.g:1264:1: ( 'x' )
            {
            // InternalSynthesizer.g:1264:1: ( 'x' )
            // InternalSynthesizer.g:1265:2: 'x'
            {
             before(grammarAccess.getSliderAccess().getXKeyword_3()); 
            match(input,20,FOLLOW_2); 
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
    // InternalSynthesizer.g:1274:1: rule__Slider__Group__4 : rule__Slider__Group__4__Impl rule__Slider__Group__5 ;
    public final void rule__Slider__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1278:1: ( rule__Slider__Group__4__Impl rule__Slider__Group__5 )
            // InternalSynthesizer.g:1279:2: rule__Slider__Group__4__Impl rule__Slider__Group__5
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
    // InternalSynthesizer.g:1286:1: rule__Slider__Group__4__Impl : ( ( rule__Slider__XAssignment_4 ) ) ;
    public final void rule__Slider__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1290:1: ( ( ( rule__Slider__XAssignment_4 ) ) )
            // InternalSynthesizer.g:1291:1: ( ( rule__Slider__XAssignment_4 ) )
            {
            // InternalSynthesizer.g:1291:1: ( ( rule__Slider__XAssignment_4 ) )
            // InternalSynthesizer.g:1292:2: ( rule__Slider__XAssignment_4 )
            {
             before(grammarAccess.getSliderAccess().getXAssignment_4()); 
            // InternalSynthesizer.g:1293:2: ( rule__Slider__XAssignment_4 )
            // InternalSynthesizer.g:1293:3: rule__Slider__XAssignment_4
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
    // InternalSynthesizer.g:1301:1: rule__Slider__Group__5 : rule__Slider__Group__5__Impl rule__Slider__Group__6 ;
    public final void rule__Slider__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1305:1: ( rule__Slider__Group__5__Impl rule__Slider__Group__6 )
            // InternalSynthesizer.g:1306:2: rule__Slider__Group__5__Impl rule__Slider__Group__6
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
    // InternalSynthesizer.g:1313:1: rule__Slider__Group__5__Impl : ( 'y' ) ;
    public final void rule__Slider__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1317:1: ( ( 'y' ) )
            // InternalSynthesizer.g:1318:1: ( 'y' )
            {
            // InternalSynthesizer.g:1318:1: ( 'y' )
            // InternalSynthesizer.g:1319:2: 'y'
            {
             before(grammarAccess.getSliderAccess().getYKeyword_5()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSynthesizer.g:1328:1: rule__Slider__Group__6 : rule__Slider__Group__6__Impl rule__Slider__Group__7 ;
    public final void rule__Slider__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1332:1: ( rule__Slider__Group__6__Impl rule__Slider__Group__7 )
            // InternalSynthesizer.g:1333:2: rule__Slider__Group__6__Impl rule__Slider__Group__7
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
    // InternalSynthesizer.g:1340:1: rule__Slider__Group__6__Impl : ( ( rule__Slider__YAssignment_6 ) ) ;
    public final void rule__Slider__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1344:1: ( ( ( rule__Slider__YAssignment_6 ) ) )
            // InternalSynthesizer.g:1345:1: ( ( rule__Slider__YAssignment_6 ) )
            {
            // InternalSynthesizer.g:1345:1: ( ( rule__Slider__YAssignment_6 ) )
            // InternalSynthesizer.g:1346:2: ( rule__Slider__YAssignment_6 )
            {
             before(grammarAccess.getSliderAccess().getYAssignment_6()); 
            // InternalSynthesizer.g:1347:2: ( rule__Slider__YAssignment_6 )
            // InternalSynthesizer.g:1347:3: rule__Slider__YAssignment_6
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
    // InternalSynthesizer.g:1355:1: rule__Slider__Group__7 : rule__Slider__Group__7__Impl rule__Slider__Group__8 ;
    public final void rule__Slider__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1359:1: ( rule__Slider__Group__7__Impl rule__Slider__Group__8 )
            // InternalSynthesizer.g:1360:2: rule__Slider__Group__7__Impl rule__Slider__Group__8
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
    // InternalSynthesizer.g:1367:1: rule__Slider__Group__7__Impl : ( 'width' ) ;
    public final void rule__Slider__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1371:1: ( ( 'width' ) )
            // InternalSynthesizer.g:1372:1: ( 'width' )
            {
            // InternalSynthesizer.g:1372:1: ( 'width' )
            // InternalSynthesizer.g:1373:2: 'width'
            {
             before(grammarAccess.getSliderAccess().getWidthKeyword_7()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSynthesizer.g:1382:1: rule__Slider__Group__8 : rule__Slider__Group__8__Impl rule__Slider__Group__9 ;
    public final void rule__Slider__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1386:1: ( rule__Slider__Group__8__Impl rule__Slider__Group__9 )
            // InternalSynthesizer.g:1387:2: rule__Slider__Group__8__Impl rule__Slider__Group__9
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
    // InternalSynthesizer.g:1394:1: rule__Slider__Group__8__Impl : ( ( rule__Slider__WidthAssignment_8 ) ) ;
    public final void rule__Slider__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1398:1: ( ( ( rule__Slider__WidthAssignment_8 ) ) )
            // InternalSynthesizer.g:1399:1: ( ( rule__Slider__WidthAssignment_8 ) )
            {
            // InternalSynthesizer.g:1399:1: ( ( rule__Slider__WidthAssignment_8 ) )
            // InternalSynthesizer.g:1400:2: ( rule__Slider__WidthAssignment_8 )
            {
             before(grammarAccess.getSliderAccess().getWidthAssignment_8()); 
            // InternalSynthesizer.g:1401:2: ( rule__Slider__WidthAssignment_8 )
            // InternalSynthesizer.g:1401:3: rule__Slider__WidthAssignment_8
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
    // InternalSynthesizer.g:1409:1: rule__Slider__Group__9 : rule__Slider__Group__9__Impl rule__Slider__Group__10 ;
    public final void rule__Slider__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1413:1: ( rule__Slider__Group__9__Impl rule__Slider__Group__10 )
            // InternalSynthesizer.g:1414:2: rule__Slider__Group__9__Impl rule__Slider__Group__10
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
    // InternalSynthesizer.g:1421:1: rule__Slider__Group__9__Impl : ( 'height' ) ;
    public final void rule__Slider__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1425:1: ( ( 'height' ) )
            // InternalSynthesizer.g:1426:1: ( 'height' )
            {
            // InternalSynthesizer.g:1426:1: ( 'height' )
            // InternalSynthesizer.g:1427:2: 'height'
            {
             before(grammarAccess.getSliderAccess().getHeightKeyword_9()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSynthesizer.g:1436:1: rule__Slider__Group__10 : rule__Slider__Group__10__Impl rule__Slider__Group__11 ;
    public final void rule__Slider__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1440:1: ( rule__Slider__Group__10__Impl rule__Slider__Group__11 )
            // InternalSynthesizer.g:1441:2: rule__Slider__Group__10__Impl rule__Slider__Group__11
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
    // InternalSynthesizer.g:1448:1: rule__Slider__Group__10__Impl : ( ( rule__Slider__HeightAssignment_10 ) ) ;
    public final void rule__Slider__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1452:1: ( ( ( rule__Slider__HeightAssignment_10 ) ) )
            // InternalSynthesizer.g:1453:1: ( ( rule__Slider__HeightAssignment_10 ) )
            {
            // InternalSynthesizer.g:1453:1: ( ( rule__Slider__HeightAssignment_10 ) )
            // InternalSynthesizer.g:1454:2: ( rule__Slider__HeightAssignment_10 )
            {
             before(grammarAccess.getSliderAccess().getHeightAssignment_10()); 
            // InternalSynthesizer.g:1455:2: ( rule__Slider__HeightAssignment_10 )
            // InternalSynthesizer.g:1455:3: rule__Slider__HeightAssignment_10
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
    // InternalSynthesizer.g:1463:1: rule__Slider__Group__11 : rule__Slider__Group__11__Impl rule__Slider__Group__12 ;
    public final void rule__Slider__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1467:1: ( rule__Slider__Group__11__Impl rule__Slider__Group__12 )
            // InternalSynthesizer.g:1468:2: rule__Slider__Group__11__Impl rule__Slider__Group__12
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
    // InternalSynthesizer.g:1475:1: rule__Slider__Group__11__Impl : ( 'sound' ) ;
    public final void rule__Slider__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1479:1: ( ( 'sound' ) )
            // InternalSynthesizer.g:1480:1: ( 'sound' )
            {
            // InternalSynthesizer.g:1480:1: ( 'sound' )
            // InternalSynthesizer.g:1481:2: 'sound'
            {
             before(grammarAccess.getSliderAccess().getSoundKeyword_11()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSynthesizer.g:1490:1: rule__Slider__Group__12 : rule__Slider__Group__12__Impl rule__Slider__Group__13 ;
    public final void rule__Slider__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1494:1: ( rule__Slider__Group__12__Impl rule__Slider__Group__13 )
            // InternalSynthesizer.g:1495:2: rule__Slider__Group__12__Impl rule__Slider__Group__13
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
    // InternalSynthesizer.g:1502:1: rule__Slider__Group__12__Impl : ( ( rule__Slider__SoundAssignment_12 ) ) ;
    public final void rule__Slider__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1506:1: ( ( ( rule__Slider__SoundAssignment_12 ) ) )
            // InternalSynthesizer.g:1507:1: ( ( rule__Slider__SoundAssignment_12 ) )
            {
            // InternalSynthesizer.g:1507:1: ( ( rule__Slider__SoundAssignment_12 ) )
            // InternalSynthesizer.g:1508:2: ( rule__Slider__SoundAssignment_12 )
            {
             before(grammarAccess.getSliderAccess().getSoundAssignment_12()); 
            // InternalSynthesizer.g:1509:2: ( rule__Slider__SoundAssignment_12 )
            // InternalSynthesizer.g:1509:3: rule__Slider__SoundAssignment_12
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
    // InternalSynthesizer.g:1517:1: rule__Slider__Group__13 : rule__Slider__Group__13__Impl rule__Slider__Group__14 ;
    public final void rule__Slider__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1521:1: ( rule__Slider__Group__13__Impl rule__Slider__Group__14 )
            // InternalSynthesizer.g:1522:2: rule__Slider__Group__13__Impl rule__Slider__Group__14
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
    // InternalSynthesizer.g:1529:1: rule__Slider__Group__13__Impl : ( 'effect' ) ;
    public final void rule__Slider__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1533:1: ( ( 'effect' ) )
            // InternalSynthesizer.g:1534:1: ( 'effect' )
            {
            // InternalSynthesizer.g:1534:1: ( 'effect' )
            // InternalSynthesizer.g:1535:2: 'effect'
            {
             before(grammarAccess.getSliderAccess().getEffectKeyword_13()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSynthesizer.g:1544:1: rule__Slider__Group__14 : rule__Slider__Group__14__Impl rule__Slider__Group__15 ;
    public final void rule__Slider__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1548:1: ( rule__Slider__Group__14__Impl rule__Slider__Group__15 )
            // InternalSynthesizer.g:1549:2: rule__Slider__Group__14__Impl rule__Slider__Group__15
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
    // InternalSynthesizer.g:1556:1: rule__Slider__Group__14__Impl : ( ( rule__Slider__TypeAssignment_14 ) ) ;
    public final void rule__Slider__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1560:1: ( ( ( rule__Slider__TypeAssignment_14 ) ) )
            // InternalSynthesizer.g:1561:1: ( ( rule__Slider__TypeAssignment_14 ) )
            {
            // InternalSynthesizer.g:1561:1: ( ( rule__Slider__TypeAssignment_14 ) )
            // InternalSynthesizer.g:1562:2: ( rule__Slider__TypeAssignment_14 )
            {
             before(grammarAccess.getSliderAccess().getTypeAssignment_14()); 
            // InternalSynthesizer.g:1563:2: ( rule__Slider__TypeAssignment_14 )
            // InternalSynthesizer.g:1563:3: rule__Slider__TypeAssignment_14
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
    // InternalSynthesizer.g:1571:1: rule__Slider__Group__15 : rule__Slider__Group__15__Impl ;
    public final void rule__Slider__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1575:1: ( rule__Slider__Group__15__Impl )
            // InternalSynthesizer.g:1576:2: rule__Slider__Group__15__Impl
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
    // InternalSynthesizer.g:1582:1: rule__Slider__Group__15__Impl : ( ')' ) ;
    public final void rule__Slider__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1586:1: ( ( ')' ) )
            // InternalSynthesizer.g:1587:1: ( ')' )
            {
            // InternalSynthesizer.g:1587:1: ( ')' )
            // InternalSynthesizer.g:1588:2: ')'
            {
             before(grammarAccess.getSliderAccess().getRightParenthesisKeyword_15()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSynthesizer.g:1598:1: rule__Button__Group__0 : rule__Button__Group__0__Impl rule__Button__Group__1 ;
    public final void rule__Button__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1602:1: ( rule__Button__Group__0__Impl rule__Button__Group__1 )
            // InternalSynthesizer.g:1603:2: rule__Button__Group__0__Impl rule__Button__Group__1
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
    // InternalSynthesizer.g:1610:1: rule__Button__Group__0__Impl : ( 'button' ) ;
    public final void rule__Button__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1614:1: ( ( 'button' ) )
            // InternalSynthesizer.g:1615:1: ( 'button' )
            {
            // InternalSynthesizer.g:1615:1: ( 'button' )
            // InternalSynthesizer.g:1616:2: 'button'
            {
             before(grammarAccess.getButtonAccess().getButtonKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalSynthesizer.g:1625:1: rule__Button__Group__1 : rule__Button__Group__1__Impl rule__Button__Group__2 ;
    public final void rule__Button__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1629:1: ( rule__Button__Group__1__Impl rule__Button__Group__2 )
            // InternalSynthesizer.g:1630:2: rule__Button__Group__1__Impl rule__Button__Group__2
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
    // InternalSynthesizer.g:1637:1: rule__Button__Group__1__Impl : ( ( rule__Button__NameAssignment_1 ) ) ;
    public final void rule__Button__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1641:1: ( ( ( rule__Button__NameAssignment_1 ) ) )
            // InternalSynthesizer.g:1642:1: ( ( rule__Button__NameAssignment_1 ) )
            {
            // InternalSynthesizer.g:1642:1: ( ( rule__Button__NameAssignment_1 ) )
            // InternalSynthesizer.g:1643:2: ( rule__Button__NameAssignment_1 )
            {
             before(grammarAccess.getButtonAccess().getNameAssignment_1()); 
            // InternalSynthesizer.g:1644:2: ( rule__Button__NameAssignment_1 )
            // InternalSynthesizer.g:1644:3: rule__Button__NameAssignment_1
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
    // InternalSynthesizer.g:1652:1: rule__Button__Group__2 : rule__Button__Group__2__Impl rule__Button__Group__3 ;
    public final void rule__Button__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1656:1: ( rule__Button__Group__2__Impl rule__Button__Group__3 )
            // InternalSynthesizer.g:1657:2: rule__Button__Group__2__Impl rule__Button__Group__3
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
    // InternalSynthesizer.g:1664:1: rule__Button__Group__2__Impl : ( '(' ) ;
    public final void rule__Button__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1668:1: ( ( '(' ) )
            // InternalSynthesizer.g:1669:1: ( '(' )
            {
            // InternalSynthesizer.g:1669:1: ( '(' )
            // InternalSynthesizer.g:1670:2: '('
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
    // InternalSynthesizer.g:1679:1: rule__Button__Group__3 : rule__Button__Group__3__Impl rule__Button__Group__4 ;
    public final void rule__Button__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1683:1: ( rule__Button__Group__3__Impl rule__Button__Group__4 )
            // InternalSynthesizer.g:1684:2: rule__Button__Group__3__Impl rule__Button__Group__4
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
    // InternalSynthesizer.g:1691:1: rule__Button__Group__3__Impl : ( 'x' ) ;
    public final void rule__Button__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1695:1: ( ( 'x' ) )
            // InternalSynthesizer.g:1696:1: ( 'x' )
            {
            // InternalSynthesizer.g:1696:1: ( 'x' )
            // InternalSynthesizer.g:1697:2: 'x'
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
    // InternalSynthesizer.g:1706:1: rule__Button__Group__4 : rule__Button__Group__4__Impl rule__Button__Group__5 ;
    public final void rule__Button__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1710:1: ( rule__Button__Group__4__Impl rule__Button__Group__5 )
            // InternalSynthesizer.g:1711:2: rule__Button__Group__4__Impl rule__Button__Group__5
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
    // InternalSynthesizer.g:1718:1: rule__Button__Group__4__Impl : ( ( rule__Button__XAssignment_4 ) ) ;
    public final void rule__Button__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1722:1: ( ( ( rule__Button__XAssignment_4 ) ) )
            // InternalSynthesizer.g:1723:1: ( ( rule__Button__XAssignment_4 ) )
            {
            // InternalSynthesizer.g:1723:1: ( ( rule__Button__XAssignment_4 ) )
            // InternalSynthesizer.g:1724:2: ( rule__Button__XAssignment_4 )
            {
             before(grammarAccess.getButtonAccess().getXAssignment_4()); 
            // InternalSynthesizer.g:1725:2: ( rule__Button__XAssignment_4 )
            // InternalSynthesizer.g:1725:3: rule__Button__XAssignment_4
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
    // InternalSynthesizer.g:1733:1: rule__Button__Group__5 : rule__Button__Group__5__Impl rule__Button__Group__6 ;
    public final void rule__Button__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1737:1: ( rule__Button__Group__5__Impl rule__Button__Group__6 )
            // InternalSynthesizer.g:1738:2: rule__Button__Group__5__Impl rule__Button__Group__6
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
    // InternalSynthesizer.g:1745:1: rule__Button__Group__5__Impl : ( 'y' ) ;
    public final void rule__Button__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1749:1: ( ( 'y' ) )
            // InternalSynthesizer.g:1750:1: ( 'y' )
            {
            // InternalSynthesizer.g:1750:1: ( 'y' )
            // InternalSynthesizer.g:1751:2: 'y'
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
    // InternalSynthesizer.g:1760:1: rule__Button__Group__6 : rule__Button__Group__6__Impl rule__Button__Group__7 ;
    public final void rule__Button__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1764:1: ( rule__Button__Group__6__Impl rule__Button__Group__7 )
            // InternalSynthesizer.g:1765:2: rule__Button__Group__6__Impl rule__Button__Group__7
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
    // InternalSynthesizer.g:1772:1: rule__Button__Group__6__Impl : ( ( rule__Button__YAssignment_6 ) ) ;
    public final void rule__Button__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1776:1: ( ( ( rule__Button__YAssignment_6 ) ) )
            // InternalSynthesizer.g:1777:1: ( ( rule__Button__YAssignment_6 ) )
            {
            // InternalSynthesizer.g:1777:1: ( ( rule__Button__YAssignment_6 ) )
            // InternalSynthesizer.g:1778:2: ( rule__Button__YAssignment_6 )
            {
             before(grammarAccess.getButtonAccess().getYAssignment_6()); 
            // InternalSynthesizer.g:1779:2: ( rule__Button__YAssignment_6 )
            // InternalSynthesizer.g:1779:3: rule__Button__YAssignment_6
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
    // InternalSynthesizer.g:1787:1: rule__Button__Group__7 : rule__Button__Group__7__Impl rule__Button__Group__8 ;
    public final void rule__Button__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1791:1: ( rule__Button__Group__7__Impl rule__Button__Group__8 )
            // InternalSynthesizer.g:1792:2: rule__Button__Group__7__Impl rule__Button__Group__8
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
    // InternalSynthesizer.g:1799:1: rule__Button__Group__7__Impl : ( 'width' ) ;
    public final void rule__Button__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1803:1: ( ( 'width' ) )
            // InternalSynthesizer.g:1804:1: ( 'width' )
            {
            // InternalSynthesizer.g:1804:1: ( 'width' )
            // InternalSynthesizer.g:1805:2: 'width'
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
    // InternalSynthesizer.g:1814:1: rule__Button__Group__8 : rule__Button__Group__8__Impl rule__Button__Group__9 ;
    public final void rule__Button__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1818:1: ( rule__Button__Group__8__Impl rule__Button__Group__9 )
            // InternalSynthesizer.g:1819:2: rule__Button__Group__8__Impl rule__Button__Group__9
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
    // InternalSynthesizer.g:1826:1: rule__Button__Group__8__Impl : ( ( rule__Button__WidthAssignment_8 ) ) ;
    public final void rule__Button__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1830:1: ( ( ( rule__Button__WidthAssignment_8 ) ) )
            // InternalSynthesizer.g:1831:1: ( ( rule__Button__WidthAssignment_8 ) )
            {
            // InternalSynthesizer.g:1831:1: ( ( rule__Button__WidthAssignment_8 ) )
            // InternalSynthesizer.g:1832:2: ( rule__Button__WidthAssignment_8 )
            {
             before(grammarAccess.getButtonAccess().getWidthAssignment_8()); 
            // InternalSynthesizer.g:1833:2: ( rule__Button__WidthAssignment_8 )
            // InternalSynthesizer.g:1833:3: rule__Button__WidthAssignment_8
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
    // InternalSynthesizer.g:1841:1: rule__Button__Group__9 : rule__Button__Group__9__Impl rule__Button__Group__10 ;
    public final void rule__Button__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1845:1: ( rule__Button__Group__9__Impl rule__Button__Group__10 )
            // InternalSynthesizer.g:1846:2: rule__Button__Group__9__Impl rule__Button__Group__10
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
    // InternalSynthesizer.g:1853:1: rule__Button__Group__9__Impl : ( 'height' ) ;
    public final void rule__Button__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1857:1: ( ( 'height' ) )
            // InternalSynthesizer.g:1858:1: ( 'height' )
            {
            // InternalSynthesizer.g:1858:1: ( 'height' )
            // InternalSynthesizer.g:1859:2: 'height'
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
    // InternalSynthesizer.g:1868:1: rule__Button__Group__10 : rule__Button__Group__10__Impl rule__Button__Group__11 ;
    public final void rule__Button__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1872:1: ( rule__Button__Group__10__Impl rule__Button__Group__11 )
            // InternalSynthesizer.g:1873:2: rule__Button__Group__10__Impl rule__Button__Group__11
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
    // InternalSynthesizer.g:1880:1: rule__Button__Group__10__Impl : ( ( rule__Button__HeightAssignment_10 ) ) ;
    public final void rule__Button__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1884:1: ( ( ( rule__Button__HeightAssignment_10 ) ) )
            // InternalSynthesizer.g:1885:1: ( ( rule__Button__HeightAssignment_10 ) )
            {
            // InternalSynthesizer.g:1885:1: ( ( rule__Button__HeightAssignment_10 ) )
            // InternalSynthesizer.g:1886:2: ( rule__Button__HeightAssignment_10 )
            {
             before(grammarAccess.getButtonAccess().getHeightAssignment_10()); 
            // InternalSynthesizer.g:1887:2: ( rule__Button__HeightAssignment_10 )
            // InternalSynthesizer.g:1887:3: rule__Button__HeightAssignment_10
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
    // InternalSynthesizer.g:1895:1: rule__Button__Group__11 : rule__Button__Group__11__Impl rule__Button__Group__12 ;
    public final void rule__Button__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1899:1: ( rule__Button__Group__11__Impl rule__Button__Group__12 )
            // InternalSynthesizer.g:1900:2: rule__Button__Group__11__Impl rule__Button__Group__12
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
    // InternalSynthesizer.g:1907:1: rule__Button__Group__11__Impl : ( 'sound' ) ;
    public final void rule__Button__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1911:1: ( ( 'sound' ) )
            // InternalSynthesizer.g:1912:1: ( 'sound' )
            {
            // InternalSynthesizer.g:1912:1: ( 'sound' )
            // InternalSynthesizer.g:1913:2: 'sound'
            {
             before(grammarAccess.getButtonAccess().getSoundKeyword_11()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSynthesizer.g:1922:1: rule__Button__Group__12 : rule__Button__Group__12__Impl rule__Button__Group__13 ;
    public final void rule__Button__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1926:1: ( rule__Button__Group__12__Impl rule__Button__Group__13 )
            // InternalSynthesizer.g:1927:2: rule__Button__Group__12__Impl rule__Button__Group__13
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
    // InternalSynthesizer.g:1934:1: rule__Button__Group__12__Impl : ( ( rule__Button__SoundAssignment_12 ) ) ;
    public final void rule__Button__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1938:1: ( ( ( rule__Button__SoundAssignment_12 ) ) )
            // InternalSynthesizer.g:1939:1: ( ( rule__Button__SoundAssignment_12 ) )
            {
            // InternalSynthesizer.g:1939:1: ( ( rule__Button__SoundAssignment_12 ) )
            // InternalSynthesizer.g:1940:2: ( rule__Button__SoundAssignment_12 )
            {
             before(grammarAccess.getButtonAccess().getSoundAssignment_12()); 
            // InternalSynthesizer.g:1941:2: ( rule__Button__SoundAssignment_12 )
            // InternalSynthesizer.g:1941:3: rule__Button__SoundAssignment_12
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
    // InternalSynthesizer.g:1949:1: rule__Button__Group__13 : rule__Button__Group__13__Impl ;
    public final void rule__Button__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1953:1: ( rule__Button__Group__13__Impl )
            // InternalSynthesizer.g:1954:2: rule__Button__Group__13__Impl
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
    // InternalSynthesizer.g:1960:1: rule__Button__Group__13__Impl : ( ')' ) ;
    public final void rule__Button__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1964:1: ( ( ')' ) )
            // InternalSynthesizer.g:1965:1: ( ')' )
            {
            // InternalSynthesizer.g:1965:1: ( ')' )
            // InternalSynthesizer.g:1966:2: ')'
            {
             before(grammarAccess.getButtonAccess().getRightParenthesisKeyword_13()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSynthesizer.g:1976:1: rule__ConnectionElement__Group__0 : rule__ConnectionElement__Group__0__Impl rule__ConnectionElement__Group__1 ;
    public final void rule__ConnectionElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1980:1: ( rule__ConnectionElement__Group__0__Impl rule__ConnectionElement__Group__1 )
            // InternalSynthesizer.g:1981:2: rule__ConnectionElement__Group__0__Impl rule__ConnectionElement__Group__1
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
    // InternalSynthesizer.g:1988:1: rule__ConnectionElement__Group__0__Impl : ( 'linear' ) ;
    public final void rule__ConnectionElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1992:1: ( ( 'linear' ) )
            // InternalSynthesizer.g:1993:1: ( 'linear' )
            {
            // InternalSynthesizer.g:1993:1: ( 'linear' )
            // InternalSynthesizer.g:1994:2: 'linear'
            {
             before(grammarAccess.getConnectionElementAccess().getLinearKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSynthesizer.g:2003:1: rule__ConnectionElement__Group__1 : rule__ConnectionElement__Group__1__Impl rule__ConnectionElement__Group__2 ;
    public final void rule__ConnectionElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2007:1: ( rule__ConnectionElement__Group__1__Impl rule__ConnectionElement__Group__2 )
            // InternalSynthesizer.g:2008:2: rule__ConnectionElement__Group__1__Impl rule__ConnectionElement__Group__2
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
    // InternalSynthesizer.g:2015:1: rule__ConnectionElement__Group__1__Impl : ( ( rule__ConnectionElement__CeAssignment_1 ) ) ;
    public final void rule__ConnectionElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2019:1: ( ( ( rule__ConnectionElement__CeAssignment_1 ) ) )
            // InternalSynthesizer.g:2020:1: ( ( rule__ConnectionElement__CeAssignment_1 ) )
            {
            // InternalSynthesizer.g:2020:1: ( ( rule__ConnectionElement__CeAssignment_1 ) )
            // InternalSynthesizer.g:2021:2: ( rule__ConnectionElement__CeAssignment_1 )
            {
             before(grammarAccess.getConnectionElementAccess().getCeAssignment_1()); 
            // InternalSynthesizer.g:2022:2: ( rule__ConnectionElement__CeAssignment_1 )
            // InternalSynthesizer.g:2022:3: rule__ConnectionElement__CeAssignment_1
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
    // InternalSynthesizer.g:2030:1: rule__ConnectionElement__Group__2 : rule__ConnectionElement__Group__2__Impl ;
    public final void rule__ConnectionElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2034:1: ( rule__ConnectionElement__Group__2__Impl )
            // InternalSynthesizer.g:2035:2: rule__ConnectionElement__Group__2__Impl
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
    // InternalSynthesizer.g:2041:1: rule__ConnectionElement__Group__2__Impl : ( ( rule__ConnectionElement__SeAssignment_2 ) ) ;
    public final void rule__ConnectionElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2045:1: ( ( ( rule__ConnectionElement__SeAssignment_2 ) ) )
            // InternalSynthesizer.g:2046:1: ( ( rule__ConnectionElement__SeAssignment_2 ) )
            {
            // InternalSynthesizer.g:2046:1: ( ( rule__ConnectionElement__SeAssignment_2 ) )
            // InternalSynthesizer.g:2047:2: ( rule__ConnectionElement__SeAssignment_2 )
            {
             before(grammarAccess.getConnectionElementAccess().getSeAssignment_2()); 
            // InternalSynthesizer.g:2048:2: ( rule__ConnectionElement__SeAssignment_2 )
            // InternalSynthesizer.g:2048:3: rule__ConnectionElement__SeAssignment_2
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
    // InternalSynthesizer.g:2057:1: rule__SawToothOscillator__Group__0 : rule__SawToothOscillator__Group__0__Impl rule__SawToothOscillator__Group__1 ;
    public final void rule__SawToothOscillator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2061:1: ( rule__SawToothOscillator__Group__0__Impl rule__SawToothOscillator__Group__1 )
            // InternalSynthesizer.g:2062:2: rule__SawToothOscillator__Group__0__Impl rule__SawToothOscillator__Group__1
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
    // InternalSynthesizer.g:2069:1: rule__SawToothOscillator__Group__0__Impl : ( 'sawToothOscillator' ) ;
    public final void rule__SawToothOscillator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2073:1: ( ( 'sawToothOscillator' ) )
            // InternalSynthesizer.g:2074:1: ( 'sawToothOscillator' )
            {
            // InternalSynthesizer.g:2074:1: ( 'sawToothOscillator' )
            // InternalSynthesizer.g:2075:2: 'sawToothOscillator'
            {
             before(grammarAccess.getSawToothOscillatorAccess().getSawToothOscillatorKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSynthesizer.g:2084:1: rule__SawToothOscillator__Group__1 : rule__SawToothOscillator__Group__1__Impl rule__SawToothOscillator__Group__2 ;
    public final void rule__SawToothOscillator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2088:1: ( rule__SawToothOscillator__Group__1__Impl rule__SawToothOscillator__Group__2 )
            // InternalSynthesizer.g:2089:2: rule__SawToothOscillator__Group__1__Impl rule__SawToothOscillator__Group__2
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
    // InternalSynthesizer.g:2096:1: rule__SawToothOscillator__Group__1__Impl : ( ( rule__SawToothOscillator__NameAssignment_1 ) ) ;
    public final void rule__SawToothOscillator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2100:1: ( ( ( rule__SawToothOscillator__NameAssignment_1 ) ) )
            // InternalSynthesizer.g:2101:1: ( ( rule__SawToothOscillator__NameAssignment_1 ) )
            {
            // InternalSynthesizer.g:2101:1: ( ( rule__SawToothOscillator__NameAssignment_1 ) )
            // InternalSynthesizer.g:2102:2: ( rule__SawToothOscillator__NameAssignment_1 )
            {
             before(grammarAccess.getSawToothOscillatorAccess().getNameAssignment_1()); 
            // InternalSynthesizer.g:2103:2: ( rule__SawToothOscillator__NameAssignment_1 )
            // InternalSynthesizer.g:2103:3: rule__SawToothOscillator__NameAssignment_1
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
    // InternalSynthesizer.g:2111:1: rule__SawToothOscillator__Group__2 : rule__SawToothOscillator__Group__2__Impl rule__SawToothOscillator__Group__3 ;
    public final void rule__SawToothOscillator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2115:1: ( rule__SawToothOscillator__Group__2__Impl rule__SawToothOscillator__Group__3 )
            // InternalSynthesizer.g:2116:2: rule__SawToothOscillator__Group__2__Impl rule__SawToothOscillator__Group__3
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
    // InternalSynthesizer.g:2123:1: rule__SawToothOscillator__Group__2__Impl : ( '(' ) ;
    public final void rule__SawToothOscillator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2127:1: ( ( '(' ) )
            // InternalSynthesizer.g:2128:1: ( '(' )
            {
            // InternalSynthesizer.g:2128:1: ( '(' )
            // InternalSynthesizer.g:2129:2: '('
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
    // InternalSynthesizer.g:2138:1: rule__SawToothOscillator__Group__3 : rule__SawToothOscillator__Group__3__Impl rule__SawToothOscillator__Group__4 ;
    public final void rule__SawToothOscillator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2142:1: ( rule__SawToothOscillator__Group__3__Impl rule__SawToothOscillator__Group__4 )
            // InternalSynthesizer.g:2143:2: rule__SawToothOscillator__Group__3__Impl rule__SawToothOscillator__Group__4
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
    // InternalSynthesizer.g:2150:1: rule__SawToothOscillator__Group__3__Impl : ( 'frequency' ) ;
    public final void rule__SawToothOscillator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2154:1: ( ( 'frequency' ) )
            // InternalSynthesizer.g:2155:1: ( 'frequency' )
            {
            // InternalSynthesizer.g:2155:1: ( 'frequency' )
            // InternalSynthesizer.g:2156:2: 'frequency'
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
    // InternalSynthesizer.g:2165:1: rule__SawToothOscillator__Group__4 : rule__SawToothOscillator__Group__4__Impl rule__SawToothOscillator__Group__5 ;
    public final void rule__SawToothOscillator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2169:1: ( rule__SawToothOscillator__Group__4__Impl rule__SawToothOscillator__Group__5 )
            // InternalSynthesizer.g:2170:2: rule__SawToothOscillator__Group__4__Impl rule__SawToothOscillator__Group__5
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
    // InternalSynthesizer.g:2177:1: rule__SawToothOscillator__Group__4__Impl : ( ( rule__SawToothOscillator__FrequencyAssignment_4 ) ) ;
    public final void rule__SawToothOscillator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2181:1: ( ( ( rule__SawToothOscillator__FrequencyAssignment_4 ) ) )
            // InternalSynthesizer.g:2182:1: ( ( rule__SawToothOscillator__FrequencyAssignment_4 ) )
            {
            // InternalSynthesizer.g:2182:1: ( ( rule__SawToothOscillator__FrequencyAssignment_4 ) )
            // InternalSynthesizer.g:2183:2: ( rule__SawToothOscillator__FrequencyAssignment_4 )
            {
             before(grammarAccess.getSawToothOscillatorAccess().getFrequencyAssignment_4()); 
            // InternalSynthesizer.g:2184:2: ( rule__SawToothOscillator__FrequencyAssignment_4 )
            // InternalSynthesizer.g:2184:3: rule__SawToothOscillator__FrequencyAssignment_4
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
    // InternalSynthesizer.g:2192:1: rule__SawToothOscillator__Group__5 : rule__SawToothOscillator__Group__5__Impl rule__SawToothOscillator__Group__6 ;
    public final void rule__SawToothOscillator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2196:1: ( rule__SawToothOscillator__Group__5__Impl rule__SawToothOscillator__Group__6 )
            // InternalSynthesizer.g:2197:2: rule__SawToothOscillator__Group__5__Impl rule__SawToothOscillator__Group__6
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
    // InternalSynthesizer.g:2204:1: rule__SawToothOscillator__Group__5__Impl : ( 'amplitude' ) ;
    public final void rule__SawToothOscillator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2208:1: ( ( 'amplitude' ) )
            // InternalSynthesizer.g:2209:1: ( 'amplitude' )
            {
            // InternalSynthesizer.g:2209:1: ( 'amplitude' )
            // InternalSynthesizer.g:2210:2: 'amplitude'
            {
             before(grammarAccess.getSawToothOscillatorAccess().getAmplitudeKeyword_5()); 
            match(input,12,FOLLOW_2); 
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
    // InternalSynthesizer.g:2219:1: rule__SawToothOscillator__Group__6 : rule__SawToothOscillator__Group__6__Impl rule__SawToothOscillator__Group__7 ;
    public final void rule__SawToothOscillator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2223:1: ( rule__SawToothOscillator__Group__6__Impl rule__SawToothOscillator__Group__7 )
            // InternalSynthesizer.g:2224:2: rule__SawToothOscillator__Group__6__Impl rule__SawToothOscillator__Group__7
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
    // InternalSynthesizer.g:2231:1: rule__SawToothOscillator__Group__6__Impl : ( ( rule__SawToothOscillator__AmplitudeAssignment_6 ) ) ;
    public final void rule__SawToothOscillator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2235:1: ( ( ( rule__SawToothOscillator__AmplitudeAssignment_6 ) ) )
            // InternalSynthesizer.g:2236:1: ( ( rule__SawToothOscillator__AmplitudeAssignment_6 ) )
            {
            // InternalSynthesizer.g:2236:1: ( ( rule__SawToothOscillator__AmplitudeAssignment_6 ) )
            // InternalSynthesizer.g:2237:2: ( rule__SawToothOscillator__AmplitudeAssignment_6 )
            {
             before(grammarAccess.getSawToothOscillatorAccess().getAmplitudeAssignment_6()); 
            // InternalSynthesizer.g:2238:2: ( rule__SawToothOscillator__AmplitudeAssignment_6 )
            // InternalSynthesizer.g:2238:3: rule__SawToothOscillator__AmplitudeAssignment_6
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
    // InternalSynthesizer.g:2246:1: rule__SawToothOscillator__Group__7 : rule__SawToothOscillator__Group__7__Impl ;
    public final void rule__SawToothOscillator__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2250:1: ( rule__SawToothOscillator__Group__7__Impl )
            // InternalSynthesizer.g:2251:2: rule__SawToothOscillator__Group__7__Impl
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
    // InternalSynthesizer.g:2257:1: rule__SawToothOscillator__Group__7__Impl : ( ')' ) ;
    public final void rule__SawToothOscillator__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2261:1: ( ( ')' ) )
            // InternalSynthesizer.g:2262:1: ( ')' )
            {
            // InternalSynthesizer.g:2262:1: ( ')' )
            // InternalSynthesizer.g:2263:2: ')'
            {
             before(grammarAccess.getSawToothOscillatorAccess().getRightParenthesisKeyword_7()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSynthesizer.g:2273:1: rule__SineOscillator__Group__0 : rule__SineOscillator__Group__0__Impl rule__SineOscillator__Group__1 ;
    public final void rule__SineOscillator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2277:1: ( rule__SineOscillator__Group__0__Impl rule__SineOscillator__Group__1 )
            // InternalSynthesizer.g:2278:2: rule__SineOscillator__Group__0__Impl rule__SineOscillator__Group__1
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
    // InternalSynthesizer.g:2285:1: rule__SineOscillator__Group__0__Impl : ( 'sineOscillator' ) ;
    public final void rule__SineOscillator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2289:1: ( ( 'sineOscillator' ) )
            // InternalSynthesizer.g:2290:1: ( 'sineOscillator' )
            {
            // InternalSynthesizer.g:2290:1: ( 'sineOscillator' )
            // InternalSynthesizer.g:2291:2: 'sineOscillator'
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
    // InternalSynthesizer.g:2300:1: rule__SineOscillator__Group__1 : rule__SineOscillator__Group__1__Impl rule__SineOscillator__Group__2 ;
    public final void rule__SineOscillator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2304:1: ( rule__SineOscillator__Group__1__Impl rule__SineOscillator__Group__2 )
            // InternalSynthesizer.g:2305:2: rule__SineOscillator__Group__1__Impl rule__SineOscillator__Group__2
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
    // InternalSynthesizer.g:2312:1: rule__SineOscillator__Group__1__Impl : ( ( rule__SineOscillator__NameAssignment_1 ) ) ;
    public final void rule__SineOscillator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2316:1: ( ( ( rule__SineOscillator__NameAssignment_1 ) ) )
            // InternalSynthesizer.g:2317:1: ( ( rule__SineOscillator__NameAssignment_1 ) )
            {
            // InternalSynthesizer.g:2317:1: ( ( rule__SineOscillator__NameAssignment_1 ) )
            // InternalSynthesizer.g:2318:2: ( rule__SineOscillator__NameAssignment_1 )
            {
             before(grammarAccess.getSineOscillatorAccess().getNameAssignment_1()); 
            // InternalSynthesizer.g:2319:2: ( rule__SineOscillator__NameAssignment_1 )
            // InternalSynthesizer.g:2319:3: rule__SineOscillator__NameAssignment_1
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
    // InternalSynthesizer.g:2327:1: rule__SineOscillator__Group__2 : rule__SineOscillator__Group__2__Impl rule__SineOscillator__Group__3 ;
    public final void rule__SineOscillator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2331:1: ( rule__SineOscillator__Group__2__Impl rule__SineOscillator__Group__3 )
            // InternalSynthesizer.g:2332:2: rule__SineOscillator__Group__2__Impl rule__SineOscillator__Group__3
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
    // InternalSynthesizer.g:2339:1: rule__SineOscillator__Group__2__Impl : ( '(' ) ;
    public final void rule__SineOscillator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2343:1: ( ( '(' ) )
            // InternalSynthesizer.g:2344:1: ( '(' )
            {
            // InternalSynthesizer.g:2344:1: ( '(' )
            // InternalSynthesizer.g:2345:2: '('
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
    // InternalSynthesizer.g:2354:1: rule__SineOscillator__Group__3 : rule__SineOscillator__Group__3__Impl rule__SineOscillator__Group__4 ;
    public final void rule__SineOscillator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2358:1: ( rule__SineOscillator__Group__3__Impl rule__SineOscillator__Group__4 )
            // InternalSynthesizer.g:2359:2: rule__SineOscillator__Group__3__Impl rule__SineOscillator__Group__4
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
    // InternalSynthesizer.g:2366:1: rule__SineOscillator__Group__3__Impl : ( 'frequency' ) ;
    public final void rule__SineOscillator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2370:1: ( ( 'frequency' ) )
            // InternalSynthesizer.g:2371:1: ( 'frequency' )
            {
            // InternalSynthesizer.g:2371:1: ( 'frequency' )
            // InternalSynthesizer.g:2372:2: 'frequency'
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
    // InternalSynthesizer.g:2381:1: rule__SineOscillator__Group__4 : rule__SineOscillator__Group__4__Impl rule__SineOscillator__Group__5 ;
    public final void rule__SineOscillator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2385:1: ( rule__SineOscillator__Group__4__Impl rule__SineOscillator__Group__5 )
            // InternalSynthesizer.g:2386:2: rule__SineOscillator__Group__4__Impl rule__SineOscillator__Group__5
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
    // InternalSynthesizer.g:2393:1: rule__SineOscillator__Group__4__Impl : ( ( rule__SineOscillator__FrequencyAssignment_4 ) ) ;
    public final void rule__SineOscillator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2397:1: ( ( ( rule__SineOscillator__FrequencyAssignment_4 ) ) )
            // InternalSynthesizer.g:2398:1: ( ( rule__SineOscillator__FrequencyAssignment_4 ) )
            {
            // InternalSynthesizer.g:2398:1: ( ( rule__SineOscillator__FrequencyAssignment_4 ) )
            // InternalSynthesizer.g:2399:2: ( rule__SineOscillator__FrequencyAssignment_4 )
            {
             before(grammarAccess.getSineOscillatorAccess().getFrequencyAssignment_4()); 
            // InternalSynthesizer.g:2400:2: ( rule__SineOscillator__FrequencyAssignment_4 )
            // InternalSynthesizer.g:2400:3: rule__SineOscillator__FrequencyAssignment_4
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
    // InternalSynthesizer.g:2408:1: rule__SineOscillator__Group__5 : rule__SineOscillator__Group__5__Impl rule__SineOscillator__Group__6 ;
    public final void rule__SineOscillator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2412:1: ( rule__SineOscillator__Group__5__Impl rule__SineOscillator__Group__6 )
            // InternalSynthesizer.g:2413:2: rule__SineOscillator__Group__5__Impl rule__SineOscillator__Group__6
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
    // InternalSynthesizer.g:2420:1: rule__SineOscillator__Group__5__Impl : ( 'amplitude' ) ;
    public final void rule__SineOscillator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2424:1: ( ( 'amplitude' ) )
            // InternalSynthesizer.g:2425:1: ( 'amplitude' )
            {
            // InternalSynthesizer.g:2425:1: ( 'amplitude' )
            // InternalSynthesizer.g:2426:2: 'amplitude'
            {
             before(grammarAccess.getSineOscillatorAccess().getAmplitudeKeyword_5()); 
            match(input,12,FOLLOW_2); 
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
    // InternalSynthesizer.g:2435:1: rule__SineOscillator__Group__6 : rule__SineOscillator__Group__6__Impl rule__SineOscillator__Group__7 ;
    public final void rule__SineOscillator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2439:1: ( rule__SineOscillator__Group__6__Impl rule__SineOscillator__Group__7 )
            // InternalSynthesizer.g:2440:2: rule__SineOscillator__Group__6__Impl rule__SineOscillator__Group__7
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
    // InternalSynthesizer.g:2447:1: rule__SineOscillator__Group__6__Impl : ( ( rule__SineOscillator__AmplitudeAssignment_6 ) ) ;
    public final void rule__SineOscillator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2451:1: ( ( ( rule__SineOscillator__AmplitudeAssignment_6 ) ) )
            // InternalSynthesizer.g:2452:1: ( ( rule__SineOscillator__AmplitudeAssignment_6 ) )
            {
            // InternalSynthesizer.g:2452:1: ( ( rule__SineOscillator__AmplitudeAssignment_6 ) )
            // InternalSynthesizer.g:2453:2: ( rule__SineOscillator__AmplitudeAssignment_6 )
            {
             before(grammarAccess.getSineOscillatorAccess().getAmplitudeAssignment_6()); 
            // InternalSynthesizer.g:2454:2: ( rule__SineOscillator__AmplitudeAssignment_6 )
            // InternalSynthesizer.g:2454:3: rule__SineOscillator__AmplitudeAssignment_6
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
    // InternalSynthesizer.g:2462:1: rule__SineOscillator__Group__7 : rule__SineOscillator__Group__7__Impl ;
    public final void rule__SineOscillator__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2466:1: ( rule__SineOscillator__Group__7__Impl )
            // InternalSynthesizer.g:2467:2: rule__SineOscillator__Group__7__Impl
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
    // InternalSynthesizer.g:2473:1: rule__SineOscillator__Group__7__Impl : ( ')' ) ;
    public final void rule__SineOscillator__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2477:1: ( ( ')' ) )
            // InternalSynthesizer.g:2478:1: ( ')' )
            {
            // InternalSynthesizer.g:2478:1: ( ')' )
            // InternalSynthesizer.g:2479:2: ')'
            {
             before(grammarAccess.getSineOscillatorAccess().getRightParenthesisKeyword_7()); 
            match(input,24,FOLLOW_2); 
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


    // $ANTLR start "rule__TriangleOscillator__Group__0"
    // InternalSynthesizer.g:2489:1: rule__TriangleOscillator__Group__0 : rule__TriangleOscillator__Group__0__Impl rule__TriangleOscillator__Group__1 ;
    public final void rule__TriangleOscillator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2493:1: ( rule__TriangleOscillator__Group__0__Impl rule__TriangleOscillator__Group__1 )
            // InternalSynthesizer.g:2494:2: rule__TriangleOscillator__Group__0__Impl rule__TriangleOscillator__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__TriangleOscillator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TriangleOscillator__Group__1();

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
    // $ANTLR end "rule__TriangleOscillator__Group__0"


    // $ANTLR start "rule__TriangleOscillator__Group__0__Impl"
    // InternalSynthesizer.g:2501:1: rule__TriangleOscillator__Group__0__Impl : ( 'triangleOscillator' ) ;
    public final void rule__TriangleOscillator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2505:1: ( ( 'triangleOscillator' ) )
            // InternalSynthesizer.g:2506:1: ( 'triangleOscillator' )
            {
            // InternalSynthesizer.g:2506:1: ( 'triangleOscillator' )
            // InternalSynthesizer.g:2507:2: 'triangleOscillator'
            {
             before(grammarAccess.getTriangleOscillatorAccess().getTriangleOscillatorKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTriangleOscillatorAccess().getTriangleOscillatorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriangleOscillator__Group__0__Impl"


    // $ANTLR start "rule__TriangleOscillator__Group__1"
    // InternalSynthesizer.g:2516:1: rule__TriangleOscillator__Group__1 : rule__TriangleOscillator__Group__1__Impl rule__TriangleOscillator__Group__2 ;
    public final void rule__TriangleOscillator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2520:1: ( rule__TriangleOscillator__Group__1__Impl rule__TriangleOscillator__Group__2 )
            // InternalSynthesizer.g:2521:2: rule__TriangleOscillator__Group__1__Impl rule__TriangleOscillator__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__TriangleOscillator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TriangleOscillator__Group__2();

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
    // $ANTLR end "rule__TriangleOscillator__Group__1"


    // $ANTLR start "rule__TriangleOscillator__Group__1__Impl"
    // InternalSynthesizer.g:2528:1: rule__TriangleOscillator__Group__1__Impl : ( ( rule__TriangleOscillator__NameAssignment_1 ) ) ;
    public final void rule__TriangleOscillator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2532:1: ( ( ( rule__TriangleOscillator__NameAssignment_1 ) ) )
            // InternalSynthesizer.g:2533:1: ( ( rule__TriangleOscillator__NameAssignment_1 ) )
            {
            // InternalSynthesizer.g:2533:1: ( ( rule__TriangleOscillator__NameAssignment_1 ) )
            // InternalSynthesizer.g:2534:2: ( rule__TriangleOscillator__NameAssignment_1 )
            {
             before(grammarAccess.getTriangleOscillatorAccess().getNameAssignment_1()); 
            // InternalSynthesizer.g:2535:2: ( rule__TriangleOscillator__NameAssignment_1 )
            // InternalSynthesizer.g:2535:3: rule__TriangleOscillator__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TriangleOscillator__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTriangleOscillatorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriangleOscillator__Group__1__Impl"


    // $ANTLR start "rule__TriangleOscillator__Group__2"
    // InternalSynthesizer.g:2543:1: rule__TriangleOscillator__Group__2 : rule__TriangleOscillator__Group__2__Impl rule__TriangleOscillator__Group__3 ;
    public final void rule__TriangleOscillator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2547:1: ( rule__TriangleOscillator__Group__2__Impl rule__TriangleOscillator__Group__3 )
            // InternalSynthesizer.g:2548:2: rule__TriangleOscillator__Group__2__Impl rule__TriangleOscillator__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__TriangleOscillator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TriangleOscillator__Group__3();

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
    // $ANTLR end "rule__TriangleOscillator__Group__2"


    // $ANTLR start "rule__TriangleOscillator__Group__2__Impl"
    // InternalSynthesizer.g:2555:1: rule__TriangleOscillator__Group__2__Impl : ( '(' ) ;
    public final void rule__TriangleOscillator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2559:1: ( ( '(' ) )
            // InternalSynthesizer.g:2560:1: ( '(' )
            {
            // InternalSynthesizer.g:2560:1: ( '(' )
            // InternalSynthesizer.g:2561:2: '('
            {
             before(grammarAccess.getTriangleOscillatorAccess().getLeftParenthesisKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTriangleOscillatorAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriangleOscillator__Group__2__Impl"


    // $ANTLR start "rule__TriangleOscillator__Group__3"
    // InternalSynthesizer.g:2570:1: rule__TriangleOscillator__Group__3 : rule__TriangleOscillator__Group__3__Impl rule__TriangleOscillator__Group__4 ;
    public final void rule__TriangleOscillator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2574:1: ( rule__TriangleOscillator__Group__3__Impl rule__TriangleOscillator__Group__4 )
            // InternalSynthesizer.g:2575:2: rule__TriangleOscillator__Group__3__Impl rule__TriangleOscillator__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__TriangleOscillator__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TriangleOscillator__Group__4();

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
    // $ANTLR end "rule__TriangleOscillator__Group__3"


    // $ANTLR start "rule__TriangleOscillator__Group__3__Impl"
    // InternalSynthesizer.g:2582:1: rule__TriangleOscillator__Group__3__Impl : ( 'frequency' ) ;
    public final void rule__TriangleOscillator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2586:1: ( ( 'frequency' ) )
            // InternalSynthesizer.g:2587:1: ( 'frequency' )
            {
            // InternalSynthesizer.g:2587:1: ( 'frequency' )
            // InternalSynthesizer.g:2588:2: 'frequency'
            {
             before(grammarAccess.getTriangleOscillatorAccess().getFrequencyKeyword_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getTriangleOscillatorAccess().getFrequencyKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriangleOscillator__Group__3__Impl"


    // $ANTLR start "rule__TriangleOscillator__Group__4"
    // InternalSynthesizer.g:2597:1: rule__TriangleOscillator__Group__4 : rule__TriangleOscillator__Group__4__Impl rule__TriangleOscillator__Group__5 ;
    public final void rule__TriangleOscillator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2601:1: ( rule__TriangleOscillator__Group__4__Impl rule__TriangleOscillator__Group__5 )
            // InternalSynthesizer.g:2602:2: rule__TriangleOscillator__Group__4__Impl rule__TriangleOscillator__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__TriangleOscillator__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TriangleOscillator__Group__5();

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
    // $ANTLR end "rule__TriangleOscillator__Group__4"


    // $ANTLR start "rule__TriangleOscillator__Group__4__Impl"
    // InternalSynthesizer.g:2609:1: rule__TriangleOscillator__Group__4__Impl : ( ( rule__TriangleOscillator__FrequencyAssignment_4 ) ) ;
    public final void rule__TriangleOscillator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2613:1: ( ( ( rule__TriangleOscillator__FrequencyAssignment_4 ) ) )
            // InternalSynthesizer.g:2614:1: ( ( rule__TriangleOscillator__FrequencyAssignment_4 ) )
            {
            // InternalSynthesizer.g:2614:1: ( ( rule__TriangleOscillator__FrequencyAssignment_4 ) )
            // InternalSynthesizer.g:2615:2: ( rule__TriangleOscillator__FrequencyAssignment_4 )
            {
             before(grammarAccess.getTriangleOscillatorAccess().getFrequencyAssignment_4()); 
            // InternalSynthesizer.g:2616:2: ( rule__TriangleOscillator__FrequencyAssignment_4 )
            // InternalSynthesizer.g:2616:3: rule__TriangleOscillator__FrequencyAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__TriangleOscillator__FrequencyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTriangleOscillatorAccess().getFrequencyAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriangleOscillator__Group__4__Impl"


    // $ANTLR start "rule__TriangleOscillator__Group__5"
    // InternalSynthesizer.g:2624:1: rule__TriangleOscillator__Group__5 : rule__TriangleOscillator__Group__5__Impl rule__TriangleOscillator__Group__6 ;
    public final void rule__TriangleOscillator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2628:1: ( rule__TriangleOscillator__Group__5__Impl rule__TriangleOscillator__Group__6 )
            // InternalSynthesizer.g:2629:2: rule__TriangleOscillator__Group__5__Impl rule__TriangleOscillator__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__TriangleOscillator__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TriangleOscillator__Group__6();

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
    // $ANTLR end "rule__TriangleOscillator__Group__5"


    // $ANTLR start "rule__TriangleOscillator__Group__5__Impl"
    // InternalSynthesizer.g:2636:1: rule__TriangleOscillator__Group__5__Impl : ( 'amplitude' ) ;
    public final void rule__TriangleOscillator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2640:1: ( ( 'amplitude' ) )
            // InternalSynthesizer.g:2641:1: ( 'amplitude' )
            {
            // InternalSynthesizer.g:2641:1: ( 'amplitude' )
            // InternalSynthesizer.g:2642:2: 'amplitude'
            {
             before(grammarAccess.getTriangleOscillatorAccess().getAmplitudeKeyword_5()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTriangleOscillatorAccess().getAmplitudeKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriangleOscillator__Group__5__Impl"


    // $ANTLR start "rule__TriangleOscillator__Group__6"
    // InternalSynthesizer.g:2651:1: rule__TriangleOscillator__Group__6 : rule__TriangleOscillator__Group__6__Impl rule__TriangleOscillator__Group__7 ;
    public final void rule__TriangleOscillator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2655:1: ( rule__TriangleOscillator__Group__6__Impl rule__TriangleOscillator__Group__7 )
            // InternalSynthesizer.g:2656:2: rule__TriangleOscillator__Group__6__Impl rule__TriangleOscillator__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__TriangleOscillator__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TriangleOscillator__Group__7();

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
    // $ANTLR end "rule__TriangleOscillator__Group__6"


    // $ANTLR start "rule__TriangleOscillator__Group__6__Impl"
    // InternalSynthesizer.g:2663:1: rule__TriangleOscillator__Group__6__Impl : ( ( rule__TriangleOscillator__AmplitudeAssignment_6 ) ) ;
    public final void rule__TriangleOscillator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2667:1: ( ( ( rule__TriangleOscillator__AmplitudeAssignment_6 ) ) )
            // InternalSynthesizer.g:2668:1: ( ( rule__TriangleOscillator__AmplitudeAssignment_6 ) )
            {
            // InternalSynthesizer.g:2668:1: ( ( rule__TriangleOscillator__AmplitudeAssignment_6 ) )
            // InternalSynthesizer.g:2669:2: ( rule__TriangleOscillator__AmplitudeAssignment_6 )
            {
             before(grammarAccess.getTriangleOscillatorAccess().getAmplitudeAssignment_6()); 
            // InternalSynthesizer.g:2670:2: ( rule__TriangleOscillator__AmplitudeAssignment_6 )
            // InternalSynthesizer.g:2670:3: rule__TriangleOscillator__AmplitudeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__TriangleOscillator__AmplitudeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTriangleOscillatorAccess().getAmplitudeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriangleOscillator__Group__6__Impl"


    // $ANTLR start "rule__TriangleOscillator__Group__7"
    // InternalSynthesizer.g:2678:1: rule__TriangleOscillator__Group__7 : rule__TriangleOscillator__Group__7__Impl ;
    public final void rule__TriangleOscillator__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2682:1: ( rule__TriangleOscillator__Group__7__Impl )
            // InternalSynthesizer.g:2683:2: rule__TriangleOscillator__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TriangleOscillator__Group__7__Impl();

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
    // $ANTLR end "rule__TriangleOscillator__Group__7"


    // $ANTLR start "rule__TriangleOscillator__Group__7__Impl"
    // InternalSynthesizer.g:2689:1: rule__TriangleOscillator__Group__7__Impl : ( ')' ) ;
    public final void rule__TriangleOscillator__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2693:1: ( ( ')' ) )
            // InternalSynthesizer.g:2694:1: ( ')' )
            {
            // InternalSynthesizer.g:2694:1: ( ')' )
            // InternalSynthesizer.g:2695:2: ')'
            {
             before(grammarAccess.getTriangleOscillatorAccess().getRightParenthesisKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTriangleOscillatorAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriangleOscillator__Group__7__Impl"


    // $ANTLR start "rule__SquareOscillator__Group__0"
    // InternalSynthesizer.g:2705:1: rule__SquareOscillator__Group__0 : rule__SquareOscillator__Group__0__Impl rule__SquareOscillator__Group__1 ;
    public final void rule__SquareOscillator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2709:1: ( rule__SquareOscillator__Group__0__Impl rule__SquareOscillator__Group__1 )
            // InternalSynthesizer.g:2710:2: rule__SquareOscillator__Group__0__Impl rule__SquareOscillator__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__SquareOscillator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SquareOscillator__Group__1();

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
    // $ANTLR end "rule__SquareOscillator__Group__0"


    // $ANTLR start "rule__SquareOscillator__Group__0__Impl"
    // InternalSynthesizer.g:2717:1: rule__SquareOscillator__Group__0__Impl : ( 'squareOscillator' ) ;
    public final void rule__SquareOscillator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2721:1: ( ( 'squareOscillator' ) )
            // InternalSynthesizer.g:2722:1: ( 'squareOscillator' )
            {
            // InternalSynthesizer.g:2722:1: ( 'squareOscillator' )
            // InternalSynthesizer.g:2723:2: 'squareOscillator'
            {
             before(grammarAccess.getSquareOscillatorAccess().getSquareOscillatorKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSquareOscillatorAccess().getSquareOscillatorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquareOscillator__Group__0__Impl"


    // $ANTLR start "rule__SquareOscillator__Group__1"
    // InternalSynthesizer.g:2732:1: rule__SquareOscillator__Group__1 : rule__SquareOscillator__Group__1__Impl rule__SquareOscillator__Group__2 ;
    public final void rule__SquareOscillator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2736:1: ( rule__SquareOscillator__Group__1__Impl rule__SquareOscillator__Group__2 )
            // InternalSynthesizer.g:2737:2: rule__SquareOscillator__Group__1__Impl rule__SquareOscillator__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__SquareOscillator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SquareOscillator__Group__2();

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
    // $ANTLR end "rule__SquareOscillator__Group__1"


    // $ANTLR start "rule__SquareOscillator__Group__1__Impl"
    // InternalSynthesizer.g:2744:1: rule__SquareOscillator__Group__1__Impl : ( ( rule__SquareOscillator__NameAssignment_1 ) ) ;
    public final void rule__SquareOscillator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2748:1: ( ( ( rule__SquareOscillator__NameAssignment_1 ) ) )
            // InternalSynthesizer.g:2749:1: ( ( rule__SquareOscillator__NameAssignment_1 ) )
            {
            // InternalSynthesizer.g:2749:1: ( ( rule__SquareOscillator__NameAssignment_1 ) )
            // InternalSynthesizer.g:2750:2: ( rule__SquareOscillator__NameAssignment_1 )
            {
             before(grammarAccess.getSquareOscillatorAccess().getNameAssignment_1()); 
            // InternalSynthesizer.g:2751:2: ( rule__SquareOscillator__NameAssignment_1 )
            // InternalSynthesizer.g:2751:3: rule__SquareOscillator__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SquareOscillator__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSquareOscillatorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquareOscillator__Group__1__Impl"


    // $ANTLR start "rule__SquareOscillator__Group__2"
    // InternalSynthesizer.g:2759:1: rule__SquareOscillator__Group__2 : rule__SquareOscillator__Group__2__Impl rule__SquareOscillator__Group__3 ;
    public final void rule__SquareOscillator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2763:1: ( rule__SquareOscillator__Group__2__Impl rule__SquareOscillator__Group__3 )
            // InternalSynthesizer.g:2764:2: rule__SquareOscillator__Group__2__Impl rule__SquareOscillator__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__SquareOscillator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SquareOscillator__Group__3();

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
    // $ANTLR end "rule__SquareOscillator__Group__2"


    // $ANTLR start "rule__SquareOscillator__Group__2__Impl"
    // InternalSynthesizer.g:2771:1: rule__SquareOscillator__Group__2__Impl : ( '(' ) ;
    public final void rule__SquareOscillator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2775:1: ( ( '(' ) )
            // InternalSynthesizer.g:2776:1: ( '(' )
            {
            // InternalSynthesizer.g:2776:1: ( '(' )
            // InternalSynthesizer.g:2777:2: '('
            {
             before(grammarAccess.getSquareOscillatorAccess().getLeftParenthesisKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSquareOscillatorAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquareOscillator__Group__2__Impl"


    // $ANTLR start "rule__SquareOscillator__Group__3"
    // InternalSynthesizer.g:2786:1: rule__SquareOscillator__Group__3 : rule__SquareOscillator__Group__3__Impl rule__SquareOscillator__Group__4 ;
    public final void rule__SquareOscillator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2790:1: ( rule__SquareOscillator__Group__3__Impl rule__SquareOscillator__Group__4 )
            // InternalSynthesizer.g:2791:2: rule__SquareOscillator__Group__3__Impl rule__SquareOscillator__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__SquareOscillator__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SquareOscillator__Group__4();

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
    // $ANTLR end "rule__SquareOscillator__Group__3"


    // $ANTLR start "rule__SquareOscillator__Group__3__Impl"
    // InternalSynthesizer.g:2798:1: rule__SquareOscillator__Group__3__Impl : ( 'frequency' ) ;
    public final void rule__SquareOscillator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2802:1: ( ( 'frequency' ) )
            // InternalSynthesizer.g:2803:1: ( 'frequency' )
            {
            // InternalSynthesizer.g:2803:1: ( 'frequency' )
            // InternalSynthesizer.g:2804:2: 'frequency'
            {
             before(grammarAccess.getSquareOscillatorAccess().getFrequencyKeyword_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getSquareOscillatorAccess().getFrequencyKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquareOscillator__Group__3__Impl"


    // $ANTLR start "rule__SquareOscillator__Group__4"
    // InternalSynthesizer.g:2813:1: rule__SquareOscillator__Group__4 : rule__SquareOscillator__Group__4__Impl rule__SquareOscillator__Group__5 ;
    public final void rule__SquareOscillator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2817:1: ( rule__SquareOscillator__Group__4__Impl rule__SquareOscillator__Group__5 )
            // InternalSynthesizer.g:2818:2: rule__SquareOscillator__Group__4__Impl rule__SquareOscillator__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__SquareOscillator__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SquareOscillator__Group__5();

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
    // $ANTLR end "rule__SquareOscillator__Group__4"


    // $ANTLR start "rule__SquareOscillator__Group__4__Impl"
    // InternalSynthesizer.g:2825:1: rule__SquareOscillator__Group__4__Impl : ( ( rule__SquareOscillator__FrequencyAssignment_4 ) ) ;
    public final void rule__SquareOscillator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2829:1: ( ( ( rule__SquareOscillator__FrequencyAssignment_4 ) ) )
            // InternalSynthesizer.g:2830:1: ( ( rule__SquareOscillator__FrequencyAssignment_4 ) )
            {
            // InternalSynthesizer.g:2830:1: ( ( rule__SquareOscillator__FrequencyAssignment_4 ) )
            // InternalSynthesizer.g:2831:2: ( rule__SquareOscillator__FrequencyAssignment_4 )
            {
             before(grammarAccess.getSquareOscillatorAccess().getFrequencyAssignment_4()); 
            // InternalSynthesizer.g:2832:2: ( rule__SquareOscillator__FrequencyAssignment_4 )
            // InternalSynthesizer.g:2832:3: rule__SquareOscillator__FrequencyAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SquareOscillator__FrequencyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSquareOscillatorAccess().getFrequencyAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquareOscillator__Group__4__Impl"


    // $ANTLR start "rule__SquareOscillator__Group__5"
    // InternalSynthesizer.g:2840:1: rule__SquareOscillator__Group__5 : rule__SquareOscillator__Group__5__Impl rule__SquareOscillator__Group__6 ;
    public final void rule__SquareOscillator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2844:1: ( rule__SquareOscillator__Group__5__Impl rule__SquareOscillator__Group__6 )
            // InternalSynthesizer.g:2845:2: rule__SquareOscillator__Group__5__Impl rule__SquareOscillator__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__SquareOscillator__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SquareOscillator__Group__6();

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
    // $ANTLR end "rule__SquareOscillator__Group__5"


    // $ANTLR start "rule__SquareOscillator__Group__5__Impl"
    // InternalSynthesizer.g:2852:1: rule__SquareOscillator__Group__5__Impl : ( 'amplitude' ) ;
    public final void rule__SquareOscillator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2856:1: ( ( 'amplitude' ) )
            // InternalSynthesizer.g:2857:1: ( 'amplitude' )
            {
            // InternalSynthesizer.g:2857:1: ( 'amplitude' )
            // InternalSynthesizer.g:2858:2: 'amplitude'
            {
             before(grammarAccess.getSquareOscillatorAccess().getAmplitudeKeyword_5()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSquareOscillatorAccess().getAmplitudeKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquareOscillator__Group__5__Impl"


    // $ANTLR start "rule__SquareOscillator__Group__6"
    // InternalSynthesizer.g:2867:1: rule__SquareOscillator__Group__6 : rule__SquareOscillator__Group__6__Impl rule__SquareOscillator__Group__7 ;
    public final void rule__SquareOscillator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2871:1: ( rule__SquareOscillator__Group__6__Impl rule__SquareOscillator__Group__7 )
            // InternalSynthesizer.g:2872:2: rule__SquareOscillator__Group__6__Impl rule__SquareOscillator__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__SquareOscillator__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SquareOscillator__Group__7();

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
    // $ANTLR end "rule__SquareOscillator__Group__6"


    // $ANTLR start "rule__SquareOscillator__Group__6__Impl"
    // InternalSynthesizer.g:2879:1: rule__SquareOscillator__Group__6__Impl : ( ( rule__SquareOscillator__AmplitudeAssignment_6 ) ) ;
    public final void rule__SquareOscillator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2883:1: ( ( ( rule__SquareOscillator__AmplitudeAssignment_6 ) ) )
            // InternalSynthesizer.g:2884:1: ( ( rule__SquareOscillator__AmplitudeAssignment_6 ) )
            {
            // InternalSynthesizer.g:2884:1: ( ( rule__SquareOscillator__AmplitudeAssignment_6 ) )
            // InternalSynthesizer.g:2885:2: ( rule__SquareOscillator__AmplitudeAssignment_6 )
            {
             before(grammarAccess.getSquareOscillatorAccess().getAmplitudeAssignment_6()); 
            // InternalSynthesizer.g:2886:2: ( rule__SquareOscillator__AmplitudeAssignment_6 )
            // InternalSynthesizer.g:2886:3: rule__SquareOscillator__AmplitudeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__SquareOscillator__AmplitudeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSquareOscillatorAccess().getAmplitudeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquareOscillator__Group__6__Impl"


    // $ANTLR start "rule__SquareOscillator__Group__7"
    // InternalSynthesizer.g:2894:1: rule__SquareOscillator__Group__7 : rule__SquareOscillator__Group__7__Impl ;
    public final void rule__SquareOscillator__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2898:1: ( rule__SquareOscillator__Group__7__Impl )
            // InternalSynthesizer.g:2899:2: rule__SquareOscillator__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SquareOscillator__Group__7__Impl();

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
    // $ANTLR end "rule__SquareOscillator__Group__7"


    // $ANTLR start "rule__SquareOscillator__Group__7__Impl"
    // InternalSynthesizer.g:2905:1: rule__SquareOscillator__Group__7__Impl : ( ')' ) ;
    public final void rule__SquareOscillator__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2909:1: ( ( ')' ) )
            // InternalSynthesizer.g:2910:1: ( ')' )
            {
            // InternalSynthesizer.g:2910:1: ( ')' )
            // InternalSynthesizer.g:2911:2: ')'
            {
             before(grammarAccess.getSquareOscillatorAccess().getRightParenthesisKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSquareOscillatorAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquareOscillator__Group__7__Impl"


    // $ANTLR start "rule__PulseOscillator__Group__0"
    // InternalSynthesizer.g:2921:1: rule__PulseOscillator__Group__0 : rule__PulseOscillator__Group__0__Impl rule__PulseOscillator__Group__1 ;
    public final void rule__PulseOscillator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2925:1: ( rule__PulseOscillator__Group__0__Impl rule__PulseOscillator__Group__1 )
            // InternalSynthesizer.g:2926:2: rule__PulseOscillator__Group__0__Impl rule__PulseOscillator__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__PulseOscillator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PulseOscillator__Group__1();

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
    // $ANTLR end "rule__PulseOscillator__Group__0"


    // $ANTLR start "rule__PulseOscillator__Group__0__Impl"
    // InternalSynthesizer.g:2933:1: rule__PulseOscillator__Group__0__Impl : ( 'pulseOscillator' ) ;
    public final void rule__PulseOscillator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2937:1: ( ( 'pulseOscillator' ) )
            // InternalSynthesizer.g:2938:1: ( 'pulseOscillator' )
            {
            // InternalSynthesizer.g:2938:1: ( 'pulseOscillator' )
            // InternalSynthesizer.g:2939:2: 'pulseOscillator'
            {
             before(grammarAccess.getPulseOscillatorAccess().getPulseOscillatorKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getPulseOscillatorAccess().getPulseOscillatorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PulseOscillator__Group__0__Impl"


    // $ANTLR start "rule__PulseOscillator__Group__1"
    // InternalSynthesizer.g:2948:1: rule__PulseOscillator__Group__1 : rule__PulseOscillator__Group__1__Impl rule__PulseOscillator__Group__2 ;
    public final void rule__PulseOscillator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2952:1: ( rule__PulseOscillator__Group__1__Impl rule__PulseOscillator__Group__2 )
            // InternalSynthesizer.g:2953:2: rule__PulseOscillator__Group__1__Impl rule__PulseOscillator__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__PulseOscillator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PulseOscillator__Group__2();

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
    // $ANTLR end "rule__PulseOscillator__Group__1"


    // $ANTLR start "rule__PulseOscillator__Group__1__Impl"
    // InternalSynthesizer.g:2960:1: rule__PulseOscillator__Group__1__Impl : ( ( rule__PulseOscillator__NameAssignment_1 ) ) ;
    public final void rule__PulseOscillator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2964:1: ( ( ( rule__PulseOscillator__NameAssignment_1 ) ) )
            // InternalSynthesizer.g:2965:1: ( ( rule__PulseOscillator__NameAssignment_1 ) )
            {
            // InternalSynthesizer.g:2965:1: ( ( rule__PulseOscillator__NameAssignment_1 ) )
            // InternalSynthesizer.g:2966:2: ( rule__PulseOscillator__NameAssignment_1 )
            {
             before(grammarAccess.getPulseOscillatorAccess().getNameAssignment_1()); 
            // InternalSynthesizer.g:2967:2: ( rule__PulseOscillator__NameAssignment_1 )
            // InternalSynthesizer.g:2967:3: rule__PulseOscillator__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PulseOscillator__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPulseOscillatorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PulseOscillator__Group__1__Impl"


    // $ANTLR start "rule__PulseOscillator__Group__2"
    // InternalSynthesizer.g:2975:1: rule__PulseOscillator__Group__2 : rule__PulseOscillator__Group__2__Impl rule__PulseOscillator__Group__3 ;
    public final void rule__PulseOscillator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2979:1: ( rule__PulseOscillator__Group__2__Impl rule__PulseOscillator__Group__3 )
            // InternalSynthesizer.g:2980:2: rule__PulseOscillator__Group__2__Impl rule__PulseOscillator__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__PulseOscillator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PulseOscillator__Group__3();

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
    // $ANTLR end "rule__PulseOscillator__Group__2"


    // $ANTLR start "rule__PulseOscillator__Group__2__Impl"
    // InternalSynthesizer.g:2987:1: rule__PulseOscillator__Group__2__Impl : ( '(' ) ;
    public final void rule__PulseOscillator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2991:1: ( ( '(' ) )
            // InternalSynthesizer.g:2992:1: ( '(' )
            {
            // InternalSynthesizer.g:2992:1: ( '(' )
            // InternalSynthesizer.g:2993:2: '('
            {
             before(grammarAccess.getPulseOscillatorAccess().getLeftParenthesisKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPulseOscillatorAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PulseOscillator__Group__2__Impl"


    // $ANTLR start "rule__PulseOscillator__Group__3"
    // InternalSynthesizer.g:3002:1: rule__PulseOscillator__Group__3 : rule__PulseOscillator__Group__3__Impl rule__PulseOscillator__Group__4 ;
    public final void rule__PulseOscillator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3006:1: ( rule__PulseOscillator__Group__3__Impl rule__PulseOscillator__Group__4 )
            // InternalSynthesizer.g:3007:2: rule__PulseOscillator__Group__3__Impl rule__PulseOscillator__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__PulseOscillator__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PulseOscillator__Group__4();

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
    // $ANTLR end "rule__PulseOscillator__Group__3"


    // $ANTLR start "rule__PulseOscillator__Group__3__Impl"
    // InternalSynthesizer.g:3014:1: rule__PulseOscillator__Group__3__Impl : ( 'frequency' ) ;
    public final void rule__PulseOscillator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3018:1: ( ( 'frequency' ) )
            // InternalSynthesizer.g:3019:1: ( 'frequency' )
            {
            // InternalSynthesizer.g:3019:1: ( 'frequency' )
            // InternalSynthesizer.g:3020:2: 'frequency'
            {
             before(grammarAccess.getPulseOscillatorAccess().getFrequencyKeyword_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getPulseOscillatorAccess().getFrequencyKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PulseOscillator__Group__3__Impl"


    // $ANTLR start "rule__PulseOscillator__Group__4"
    // InternalSynthesizer.g:3029:1: rule__PulseOscillator__Group__4 : rule__PulseOscillator__Group__4__Impl rule__PulseOscillator__Group__5 ;
    public final void rule__PulseOscillator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3033:1: ( rule__PulseOscillator__Group__4__Impl rule__PulseOscillator__Group__5 )
            // InternalSynthesizer.g:3034:2: rule__PulseOscillator__Group__4__Impl rule__PulseOscillator__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__PulseOscillator__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PulseOscillator__Group__5();

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
    // $ANTLR end "rule__PulseOscillator__Group__4"


    // $ANTLR start "rule__PulseOscillator__Group__4__Impl"
    // InternalSynthesizer.g:3041:1: rule__PulseOscillator__Group__4__Impl : ( ( rule__PulseOscillator__FrequencyAssignment_4 ) ) ;
    public final void rule__PulseOscillator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3045:1: ( ( ( rule__PulseOscillator__FrequencyAssignment_4 ) ) )
            // InternalSynthesizer.g:3046:1: ( ( rule__PulseOscillator__FrequencyAssignment_4 ) )
            {
            // InternalSynthesizer.g:3046:1: ( ( rule__PulseOscillator__FrequencyAssignment_4 ) )
            // InternalSynthesizer.g:3047:2: ( rule__PulseOscillator__FrequencyAssignment_4 )
            {
             before(grammarAccess.getPulseOscillatorAccess().getFrequencyAssignment_4()); 
            // InternalSynthesizer.g:3048:2: ( rule__PulseOscillator__FrequencyAssignment_4 )
            // InternalSynthesizer.g:3048:3: rule__PulseOscillator__FrequencyAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__PulseOscillator__FrequencyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPulseOscillatorAccess().getFrequencyAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PulseOscillator__Group__4__Impl"


    // $ANTLR start "rule__PulseOscillator__Group__5"
    // InternalSynthesizer.g:3056:1: rule__PulseOscillator__Group__5 : rule__PulseOscillator__Group__5__Impl rule__PulseOscillator__Group__6 ;
    public final void rule__PulseOscillator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3060:1: ( rule__PulseOscillator__Group__5__Impl rule__PulseOscillator__Group__6 )
            // InternalSynthesizer.g:3061:2: rule__PulseOscillator__Group__5__Impl rule__PulseOscillator__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__PulseOscillator__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PulseOscillator__Group__6();

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
    // $ANTLR end "rule__PulseOscillator__Group__5"


    // $ANTLR start "rule__PulseOscillator__Group__5__Impl"
    // InternalSynthesizer.g:3068:1: rule__PulseOscillator__Group__5__Impl : ( 'amplitude' ) ;
    public final void rule__PulseOscillator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3072:1: ( ( 'amplitude' ) )
            // InternalSynthesizer.g:3073:1: ( 'amplitude' )
            {
            // InternalSynthesizer.g:3073:1: ( 'amplitude' )
            // InternalSynthesizer.g:3074:2: 'amplitude'
            {
             before(grammarAccess.getPulseOscillatorAccess().getAmplitudeKeyword_5()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPulseOscillatorAccess().getAmplitudeKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PulseOscillator__Group__5__Impl"


    // $ANTLR start "rule__PulseOscillator__Group__6"
    // InternalSynthesizer.g:3083:1: rule__PulseOscillator__Group__6 : rule__PulseOscillator__Group__6__Impl rule__PulseOscillator__Group__7 ;
    public final void rule__PulseOscillator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3087:1: ( rule__PulseOscillator__Group__6__Impl rule__PulseOscillator__Group__7 )
            // InternalSynthesizer.g:3088:2: rule__PulseOscillator__Group__6__Impl rule__PulseOscillator__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__PulseOscillator__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PulseOscillator__Group__7();

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
    // $ANTLR end "rule__PulseOscillator__Group__6"


    // $ANTLR start "rule__PulseOscillator__Group__6__Impl"
    // InternalSynthesizer.g:3095:1: rule__PulseOscillator__Group__6__Impl : ( ( rule__PulseOscillator__AmplitudeAssignment_6 ) ) ;
    public final void rule__PulseOscillator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3099:1: ( ( ( rule__PulseOscillator__AmplitudeAssignment_6 ) ) )
            // InternalSynthesizer.g:3100:1: ( ( rule__PulseOscillator__AmplitudeAssignment_6 ) )
            {
            // InternalSynthesizer.g:3100:1: ( ( rule__PulseOscillator__AmplitudeAssignment_6 ) )
            // InternalSynthesizer.g:3101:2: ( rule__PulseOscillator__AmplitudeAssignment_6 )
            {
             before(grammarAccess.getPulseOscillatorAccess().getAmplitudeAssignment_6()); 
            // InternalSynthesizer.g:3102:2: ( rule__PulseOscillator__AmplitudeAssignment_6 )
            // InternalSynthesizer.g:3102:3: rule__PulseOscillator__AmplitudeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__PulseOscillator__AmplitudeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPulseOscillatorAccess().getAmplitudeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PulseOscillator__Group__6__Impl"


    // $ANTLR start "rule__PulseOscillator__Group__7"
    // InternalSynthesizer.g:3110:1: rule__PulseOscillator__Group__7 : rule__PulseOscillator__Group__7__Impl ;
    public final void rule__PulseOscillator__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3114:1: ( rule__PulseOscillator__Group__7__Impl )
            // InternalSynthesizer.g:3115:2: rule__PulseOscillator__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PulseOscillator__Group__7__Impl();

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
    // $ANTLR end "rule__PulseOscillator__Group__7"


    // $ANTLR start "rule__PulseOscillator__Group__7__Impl"
    // InternalSynthesizer.g:3121:1: rule__PulseOscillator__Group__7__Impl : ( ')' ) ;
    public final void rule__PulseOscillator__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3125:1: ( ( ')' ) )
            // InternalSynthesizer.g:3126:1: ( ')' )
            {
            // InternalSynthesizer.g:3126:1: ( ')' )
            // InternalSynthesizer.g:3127:2: ')'
            {
             before(grammarAccess.getPulseOscillatorAccess().getRightParenthesisKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPulseOscillatorAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PulseOscillator__Group__7__Impl"


    // $ANTLR start "rule__Model__ControlsAssignment_2"
    // InternalSynthesizer.g:3137:1: rule__Model__ControlsAssignment_2 : ( ruleControlElement ) ;
    public final void rule__Model__ControlsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3141:1: ( ( ruleControlElement ) )
            // InternalSynthesizer.g:3142:2: ( ruleControlElement )
            {
            // InternalSynthesizer.g:3142:2: ( ruleControlElement )
            // InternalSynthesizer.g:3143:3: ruleControlElement
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
    // InternalSynthesizer.g:3152:1: rule__Model__SoundsAssignment_4_2 : ( ruleSoundElement ) ;
    public final void rule__Model__SoundsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3156:1: ( ( ruleSoundElement ) )
            // InternalSynthesizer.g:3157:2: ( ruleSoundElement )
            {
            // InternalSynthesizer.g:3157:2: ( ruleSoundElement )
            // InternalSynthesizer.g:3158:3: ruleSoundElement
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
    // InternalSynthesizer.g:3167:1: rule__Model__ConnectionsAssignment_5_2 : ( ruleConnectionElement ) ;
    public final void rule__Model__ConnectionsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3171:1: ( ( ruleConnectionElement ) )
            // InternalSynthesizer.g:3172:2: ( ruleConnectionElement )
            {
            // InternalSynthesizer.g:3172:2: ( ruleConnectionElement )
            // InternalSynthesizer.g:3173:3: ruleConnectionElement
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
    // InternalSynthesizer.g:3182:1: rule__RotaryKnob__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RotaryKnob__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3186:1: ( ( RULE_ID ) )
            // InternalSynthesizer.g:3187:2: ( RULE_ID )
            {
            // InternalSynthesizer.g:3187:2: ( RULE_ID )
            // InternalSynthesizer.g:3188:3: RULE_ID
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
    // InternalSynthesizer.g:3197:1: rule__RotaryKnob__XAssignment_4 : ( RULE_INT ) ;
    public final void rule__RotaryKnob__XAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3201:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:3202:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:3202:2: ( RULE_INT )
            // InternalSynthesizer.g:3203:3: RULE_INT
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
    // InternalSynthesizer.g:3212:1: rule__RotaryKnob__YAssignment_6 : ( RULE_INT ) ;
    public final void rule__RotaryKnob__YAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3216:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:3217:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:3217:2: ( RULE_INT )
            // InternalSynthesizer.g:3218:3: RULE_INT
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
    // InternalSynthesizer.g:3227:1: rule__RotaryKnob__WidthAssignment_8 : ( RULE_INT ) ;
    public final void rule__RotaryKnob__WidthAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3231:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:3232:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:3232:2: ( RULE_INT )
            // InternalSynthesizer.g:3233:3: RULE_INT
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
    // InternalSynthesizer.g:3242:1: rule__RotaryKnob__HeightAssignment_10 : ( RULE_INT ) ;
    public final void rule__RotaryKnob__HeightAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3246:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:3247:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:3247:2: ( RULE_INT )
            // InternalSynthesizer.g:3248:3: RULE_INT
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
    // InternalSynthesizer.g:3257:1: rule__Slider__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Slider__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3261:1: ( ( RULE_ID ) )
            // InternalSynthesizer.g:3262:2: ( RULE_ID )
            {
            // InternalSynthesizer.g:3262:2: ( RULE_ID )
            // InternalSynthesizer.g:3263:3: RULE_ID
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
    // InternalSynthesizer.g:3272:1: rule__Slider__XAssignment_4 : ( RULE_INT ) ;
    public final void rule__Slider__XAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3276:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:3277:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:3277:2: ( RULE_INT )
            // InternalSynthesizer.g:3278:3: RULE_INT
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
    // InternalSynthesizer.g:3287:1: rule__Slider__YAssignment_6 : ( RULE_INT ) ;
    public final void rule__Slider__YAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3291:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:3292:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:3292:2: ( RULE_INT )
            // InternalSynthesizer.g:3293:3: RULE_INT
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
    // InternalSynthesizer.g:3302:1: rule__Slider__WidthAssignment_8 : ( RULE_INT ) ;
    public final void rule__Slider__WidthAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3306:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:3307:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:3307:2: ( RULE_INT )
            // InternalSynthesizer.g:3308:3: RULE_INT
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
    // InternalSynthesizer.g:3317:1: rule__Slider__HeightAssignment_10 : ( RULE_INT ) ;
    public final void rule__Slider__HeightAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3321:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:3322:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:3322:2: ( RULE_INT )
            // InternalSynthesizer.g:3323:3: RULE_INT
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
    // InternalSynthesizer.g:3332:1: rule__Slider__SoundAssignment_12 : ( ( RULE_ID ) ) ;
    public final void rule__Slider__SoundAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3336:1: ( ( ( RULE_ID ) ) )
            // InternalSynthesizer.g:3337:2: ( ( RULE_ID ) )
            {
            // InternalSynthesizer.g:3337:2: ( ( RULE_ID ) )
            // InternalSynthesizer.g:3338:3: ( RULE_ID )
            {
             before(grammarAccess.getSliderAccess().getSoundSoundElementCrossReference_12_0()); 
            // InternalSynthesizer.g:3339:3: ( RULE_ID )
            // InternalSynthesizer.g:3340:4: RULE_ID
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
    // InternalSynthesizer.g:3351:1: rule__Slider__TypeAssignment_14 : ( ruleEffect ) ;
    public final void rule__Slider__TypeAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3355:1: ( ( ruleEffect ) )
            // InternalSynthesizer.g:3356:2: ( ruleEffect )
            {
            // InternalSynthesizer.g:3356:2: ( ruleEffect )
            // InternalSynthesizer.g:3357:3: ruleEffect
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
    // InternalSynthesizer.g:3366:1: rule__Button__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Button__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3370:1: ( ( RULE_ID ) )
            // InternalSynthesizer.g:3371:2: ( RULE_ID )
            {
            // InternalSynthesizer.g:3371:2: ( RULE_ID )
            // InternalSynthesizer.g:3372:3: RULE_ID
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
    // InternalSynthesizer.g:3381:1: rule__Button__XAssignment_4 : ( RULE_INT ) ;
    public final void rule__Button__XAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3385:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:3386:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:3386:2: ( RULE_INT )
            // InternalSynthesizer.g:3387:3: RULE_INT
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
    // InternalSynthesizer.g:3396:1: rule__Button__YAssignment_6 : ( RULE_INT ) ;
    public final void rule__Button__YAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3400:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:3401:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:3401:2: ( RULE_INT )
            // InternalSynthesizer.g:3402:3: RULE_INT
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
    // InternalSynthesizer.g:3411:1: rule__Button__WidthAssignment_8 : ( RULE_INT ) ;
    public final void rule__Button__WidthAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3415:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:3416:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:3416:2: ( RULE_INT )
            // InternalSynthesizer.g:3417:3: RULE_INT
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
    // InternalSynthesizer.g:3426:1: rule__Button__HeightAssignment_10 : ( RULE_INT ) ;
    public final void rule__Button__HeightAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3430:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:3431:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:3431:2: ( RULE_INT )
            // InternalSynthesizer.g:3432:3: RULE_INT
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
    // InternalSynthesizer.g:3441:1: rule__Button__SoundAssignment_12 : ( ( RULE_ID ) ) ;
    public final void rule__Button__SoundAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3445:1: ( ( ( RULE_ID ) ) )
            // InternalSynthesizer.g:3446:2: ( ( RULE_ID ) )
            {
            // InternalSynthesizer.g:3446:2: ( ( RULE_ID ) )
            // InternalSynthesizer.g:3447:3: ( RULE_ID )
            {
             before(grammarAccess.getButtonAccess().getSoundSoundElementCrossReference_12_0()); 
            // InternalSynthesizer.g:3448:3: ( RULE_ID )
            // InternalSynthesizer.g:3449:4: RULE_ID
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
    // InternalSynthesizer.g:3460:1: rule__ConnectionElement__CeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ConnectionElement__CeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3464:1: ( ( ( RULE_ID ) ) )
            // InternalSynthesizer.g:3465:2: ( ( RULE_ID ) )
            {
            // InternalSynthesizer.g:3465:2: ( ( RULE_ID ) )
            // InternalSynthesizer.g:3466:3: ( RULE_ID )
            {
             before(grammarAccess.getConnectionElementAccess().getCeControlElementCrossReference_1_0()); 
            // InternalSynthesizer.g:3467:3: ( RULE_ID )
            // InternalSynthesizer.g:3468:4: RULE_ID
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
    // InternalSynthesizer.g:3479:1: rule__ConnectionElement__SeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ConnectionElement__SeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3483:1: ( ( ( RULE_ID ) ) )
            // InternalSynthesizer.g:3484:2: ( ( RULE_ID ) )
            {
            // InternalSynthesizer.g:3484:2: ( ( RULE_ID ) )
            // InternalSynthesizer.g:3485:3: ( RULE_ID )
            {
             before(grammarAccess.getConnectionElementAccess().getSeSoundElementCrossReference_2_0()); 
            // InternalSynthesizer.g:3486:3: ( RULE_ID )
            // InternalSynthesizer.g:3487:4: RULE_ID
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
    // InternalSynthesizer.g:3498:1: rule__SawToothOscillator__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SawToothOscillator__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3502:1: ( ( RULE_ID ) )
            // InternalSynthesizer.g:3503:2: ( RULE_ID )
            {
            // InternalSynthesizer.g:3503:2: ( RULE_ID )
            // InternalSynthesizer.g:3504:3: RULE_ID
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
    // InternalSynthesizer.g:3513:1: rule__SawToothOscillator__FrequencyAssignment_4 : ( RULE_INT ) ;
    public final void rule__SawToothOscillator__FrequencyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3517:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:3518:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:3518:2: ( RULE_INT )
            // InternalSynthesizer.g:3519:3: RULE_INT
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
    // InternalSynthesizer.g:3528:1: rule__SawToothOscillator__AmplitudeAssignment_6 : ( RULE_INT ) ;
    public final void rule__SawToothOscillator__AmplitudeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3532:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:3533:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:3533:2: ( RULE_INT )
            // InternalSynthesizer.g:3534:3: RULE_INT
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
    // InternalSynthesizer.g:3543:1: rule__SineOscillator__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SineOscillator__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3547:1: ( ( RULE_ID ) )
            // InternalSynthesizer.g:3548:2: ( RULE_ID )
            {
            // InternalSynthesizer.g:3548:2: ( RULE_ID )
            // InternalSynthesizer.g:3549:3: RULE_ID
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
    // InternalSynthesizer.g:3558:1: rule__SineOscillator__FrequencyAssignment_4 : ( RULE_INT ) ;
    public final void rule__SineOscillator__FrequencyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3562:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:3563:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:3563:2: ( RULE_INT )
            // InternalSynthesizer.g:3564:3: RULE_INT
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
    // InternalSynthesizer.g:3573:1: rule__SineOscillator__AmplitudeAssignment_6 : ( RULE_INT ) ;
    public final void rule__SineOscillator__AmplitudeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3577:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:3578:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:3578:2: ( RULE_INT )
            // InternalSynthesizer.g:3579:3: RULE_INT
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


    // $ANTLR start "rule__TriangleOscillator__NameAssignment_1"
    // InternalSynthesizer.g:3588:1: rule__TriangleOscillator__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TriangleOscillator__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3592:1: ( ( RULE_ID ) )
            // InternalSynthesizer.g:3593:2: ( RULE_ID )
            {
            // InternalSynthesizer.g:3593:2: ( RULE_ID )
            // InternalSynthesizer.g:3594:3: RULE_ID
            {
             before(grammarAccess.getTriangleOscillatorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTriangleOscillatorAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriangleOscillator__NameAssignment_1"


    // $ANTLR start "rule__TriangleOscillator__FrequencyAssignment_4"
    // InternalSynthesizer.g:3603:1: rule__TriangleOscillator__FrequencyAssignment_4 : ( RULE_INT ) ;
    public final void rule__TriangleOscillator__FrequencyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3607:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:3608:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:3608:2: ( RULE_INT )
            // InternalSynthesizer.g:3609:3: RULE_INT
            {
             before(grammarAccess.getTriangleOscillatorAccess().getFrequencyINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTriangleOscillatorAccess().getFrequencyINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriangleOscillator__FrequencyAssignment_4"


    // $ANTLR start "rule__TriangleOscillator__AmplitudeAssignment_6"
    // InternalSynthesizer.g:3618:1: rule__TriangleOscillator__AmplitudeAssignment_6 : ( RULE_INT ) ;
    public final void rule__TriangleOscillator__AmplitudeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3622:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:3623:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:3623:2: ( RULE_INT )
            // InternalSynthesizer.g:3624:3: RULE_INT
            {
             before(grammarAccess.getTriangleOscillatorAccess().getAmplitudeINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTriangleOscillatorAccess().getAmplitudeINTTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriangleOscillator__AmplitudeAssignment_6"


    // $ANTLR start "rule__SquareOscillator__NameAssignment_1"
    // InternalSynthesizer.g:3633:1: rule__SquareOscillator__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SquareOscillator__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3637:1: ( ( RULE_ID ) )
            // InternalSynthesizer.g:3638:2: ( RULE_ID )
            {
            // InternalSynthesizer.g:3638:2: ( RULE_ID )
            // InternalSynthesizer.g:3639:3: RULE_ID
            {
             before(grammarAccess.getSquareOscillatorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSquareOscillatorAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquareOscillator__NameAssignment_1"


    // $ANTLR start "rule__SquareOscillator__FrequencyAssignment_4"
    // InternalSynthesizer.g:3648:1: rule__SquareOscillator__FrequencyAssignment_4 : ( RULE_INT ) ;
    public final void rule__SquareOscillator__FrequencyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3652:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:3653:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:3653:2: ( RULE_INT )
            // InternalSynthesizer.g:3654:3: RULE_INT
            {
             before(grammarAccess.getSquareOscillatorAccess().getFrequencyINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSquareOscillatorAccess().getFrequencyINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquareOscillator__FrequencyAssignment_4"


    // $ANTLR start "rule__SquareOscillator__AmplitudeAssignment_6"
    // InternalSynthesizer.g:3663:1: rule__SquareOscillator__AmplitudeAssignment_6 : ( RULE_INT ) ;
    public final void rule__SquareOscillator__AmplitudeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3667:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:3668:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:3668:2: ( RULE_INT )
            // InternalSynthesizer.g:3669:3: RULE_INT
            {
             before(grammarAccess.getSquareOscillatorAccess().getAmplitudeINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSquareOscillatorAccess().getAmplitudeINTTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquareOscillator__AmplitudeAssignment_6"


    // $ANTLR start "rule__PulseOscillator__NameAssignment_1"
    // InternalSynthesizer.g:3678:1: rule__PulseOscillator__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PulseOscillator__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3682:1: ( ( RULE_ID ) )
            // InternalSynthesizer.g:3683:2: ( RULE_ID )
            {
            // InternalSynthesizer.g:3683:2: ( RULE_ID )
            // InternalSynthesizer.g:3684:3: RULE_ID
            {
             before(grammarAccess.getPulseOscillatorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPulseOscillatorAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PulseOscillator__NameAssignment_1"


    // $ANTLR start "rule__PulseOscillator__FrequencyAssignment_4"
    // InternalSynthesizer.g:3693:1: rule__PulseOscillator__FrequencyAssignment_4 : ( RULE_INT ) ;
    public final void rule__PulseOscillator__FrequencyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3697:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:3698:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:3698:2: ( RULE_INT )
            // InternalSynthesizer.g:3699:3: RULE_INT
            {
             before(grammarAccess.getPulseOscillatorAccess().getFrequencyINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPulseOscillatorAccess().getFrequencyINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PulseOscillator__FrequencyAssignment_4"


    // $ANTLR start "rule__PulseOscillator__AmplitudeAssignment_6"
    // InternalSynthesizer.g:3708:1: rule__PulseOscillator__AmplitudeAssignment_6 : ( RULE_INT ) ;
    public final void rule__PulseOscillator__AmplitudeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3712:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:3713:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:3713:2: ( RULE_INT )
            // InternalSynthesizer.g:3714:3: RULE_INT
            {
             before(grammarAccess.getPulseOscillatorAccess().getAmplitudeINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPulseOscillatorAccess().getAmplitudeINTTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PulseOscillator__AmplitudeAssignment_6"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000012048000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000012040002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000007C0008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000007C0000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000001000L});

}