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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'frequency'", "'amplitude'", "'Controls'", "'{'", "'}'", "'Sound'", "'Connections'", "'rotaryKnob'", "'('", "'x'", "'y'", "'width'", "'height'", "')'", "'slider'", "'sound'", "'effect'", "'button'", "'linear'", "'sawToothOscillator'", "'sineOscillator'", "'triangleOscillator'", "'squareOscillator'", "'pulseOscillator'", "'impulseOscillator'"
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
    public static final int T__35=35;
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


    // $ANTLR start "entryRuleImpulseOscillator"
    // InternalSynthesizer.g:378:1: entryRuleImpulseOscillator : ruleImpulseOscillator EOF ;
    public final void entryRuleImpulseOscillator() throws RecognitionException {
        try {
            // InternalSynthesizer.g:379:1: ( ruleImpulseOscillator EOF )
            // InternalSynthesizer.g:380:1: ruleImpulseOscillator EOF
            {
             before(grammarAccess.getImpulseOscillatorRule()); 
            pushFollow(FOLLOW_1);
            ruleImpulseOscillator();

            state._fsp--;

             after(grammarAccess.getImpulseOscillatorRule()); 
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
    // $ANTLR end "entryRuleImpulseOscillator"


    // $ANTLR start "ruleImpulseOscillator"
    // InternalSynthesizer.g:387:1: ruleImpulseOscillator : ( ( rule__ImpulseOscillator__Group__0 ) ) ;
    public final void ruleImpulseOscillator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:391:2: ( ( ( rule__ImpulseOscillator__Group__0 ) ) )
            // InternalSynthesizer.g:392:2: ( ( rule__ImpulseOscillator__Group__0 ) )
            {
            // InternalSynthesizer.g:392:2: ( ( rule__ImpulseOscillator__Group__0 ) )
            // InternalSynthesizer.g:393:3: ( rule__ImpulseOscillator__Group__0 )
            {
             before(grammarAccess.getImpulseOscillatorAccess().getGroup()); 
            // InternalSynthesizer.g:394:3: ( rule__ImpulseOscillator__Group__0 )
            // InternalSynthesizer.g:394:4: rule__ImpulseOscillator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImpulseOscillator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImpulseOscillatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImpulseOscillator"


    // $ANTLR start "rule__ControlElement__Alternatives"
    // InternalSynthesizer.g:402:1: rule__ControlElement__Alternatives : ( ( ruleButton ) | ( ruleRotaryKnob ) | ( ruleSlider ) );
    public final void rule__ControlElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:406:1: ( ( ruleButton ) | ( ruleRotaryKnob ) | ( ruleSlider ) )
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
                    // InternalSynthesizer.g:407:2: ( ruleButton )
                    {
                    // InternalSynthesizer.g:407:2: ( ruleButton )
                    // InternalSynthesizer.g:408:3: ruleButton
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
                    // InternalSynthesizer.g:413:2: ( ruleRotaryKnob )
                    {
                    // InternalSynthesizer.g:413:2: ( ruleRotaryKnob )
                    // InternalSynthesizer.g:414:3: ruleRotaryKnob
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
                    // InternalSynthesizer.g:419:2: ( ruleSlider )
                    {
                    // InternalSynthesizer.g:419:2: ( ruleSlider )
                    // InternalSynthesizer.g:420:3: ruleSlider
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
    // InternalSynthesizer.g:429:1: rule__Effect__Alternatives : ( ( 'frequency' ) | ( 'amplitude' ) );
    public final void rule__Effect__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:433:1: ( ( 'frequency' ) | ( 'amplitude' ) )
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
                    // InternalSynthesizer.g:434:2: ( 'frequency' )
                    {
                    // InternalSynthesizer.g:434:2: ( 'frequency' )
                    // InternalSynthesizer.g:435:3: 'frequency'
                    {
                     before(grammarAccess.getEffectAccess().getFrequencyKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEffectAccess().getFrequencyKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSynthesizer.g:440:2: ( 'amplitude' )
                    {
                    // InternalSynthesizer.g:440:2: ( 'amplitude' )
                    // InternalSynthesizer.g:441:3: 'amplitude'
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
    // InternalSynthesizer.g:450:1: rule__SoundElement__Alternatives : ( ( ruleSawToothOscillator ) | ( ruleSineOscillator ) | ( ruleTriangleOscillator ) | ( ruleSquareOscillator ) | ( rulePulseOscillator ) | ( ruleImpulseOscillator ) );
    public final void rule__SoundElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:454:1: ( ( ruleSawToothOscillator ) | ( ruleSineOscillator ) | ( ruleTriangleOscillator ) | ( ruleSquareOscillator ) | ( rulePulseOscillator ) | ( ruleImpulseOscillator ) )
            int alt3=6;
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
            case 35:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSynthesizer.g:455:2: ( ruleSawToothOscillator )
                    {
                    // InternalSynthesizer.g:455:2: ( ruleSawToothOscillator )
                    // InternalSynthesizer.g:456:3: ruleSawToothOscillator
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
                    // InternalSynthesizer.g:461:2: ( ruleSineOscillator )
                    {
                    // InternalSynthesizer.g:461:2: ( ruleSineOscillator )
                    // InternalSynthesizer.g:462:3: ruleSineOscillator
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
                    // InternalSynthesizer.g:467:2: ( ruleTriangleOscillator )
                    {
                    // InternalSynthesizer.g:467:2: ( ruleTriangleOscillator )
                    // InternalSynthesizer.g:468:3: ruleTriangleOscillator
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
                    // InternalSynthesizer.g:473:2: ( ruleSquareOscillator )
                    {
                    // InternalSynthesizer.g:473:2: ( ruleSquareOscillator )
                    // InternalSynthesizer.g:474:3: ruleSquareOscillator
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
                    // InternalSynthesizer.g:479:2: ( rulePulseOscillator )
                    {
                    // InternalSynthesizer.g:479:2: ( rulePulseOscillator )
                    // InternalSynthesizer.g:480:3: rulePulseOscillator
                    {
                     before(grammarAccess.getSoundElementAccess().getPulseOscillatorParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    rulePulseOscillator();

                    state._fsp--;

                     after(grammarAccess.getSoundElementAccess().getPulseOscillatorParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSynthesizer.g:485:2: ( ruleImpulseOscillator )
                    {
                    // InternalSynthesizer.g:485:2: ( ruleImpulseOscillator )
                    // InternalSynthesizer.g:486:3: ruleImpulseOscillator
                    {
                     before(grammarAccess.getSoundElementAccess().getImpulseOscillatorParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleImpulseOscillator();

                    state._fsp--;

                     after(grammarAccess.getSoundElementAccess().getImpulseOscillatorParserRuleCall_5()); 

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
    // InternalSynthesizer.g:495:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:499:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalSynthesizer.g:500:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalSynthesizer.g:507:1: rule__Model__Group__0__Impl : ( 'Controls' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:511:1: ( ( 'Controls' ) )
            // InternalSynthesizer.g:512:1: ( 'Controls' )
            {
            // InternalSynthesizer.g:512:1: ( 'Controls' )
            // InternalSynthesizer.g:513:2: 'Controls'
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
    // InternalSynthesizer.g:522:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:526:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalSynthesizer.g:527:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalSynthesizer.g:534:1: rule__Model__Group__1__Impl : ( '{' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:538:1: ( ( '{' ) )
            // InternalSynthesizer.g:539:1: ( '{' )
            {
            // InternalSynthesizer.g:539:1: ( '{' )
            // InternalSynthesizer.g:540:2: '{'
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
    // InternalSynthesizer.g:549:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:553:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalSynthesizer.g:554:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalSynthesizer.g:561:1: rule__Model__Group__2__Impl : ( ( rule__Model__ControlsAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:565:1: ( ( ( rule__Model__ControlsAssignment_2 )* ) )
            // InternalSynthesizer.g:566:1: ( ( rule__Model__ControlsAssignment_2 )* )
            {
            // InternalSynthesizer.g:566:1: ( ( rule__Model__ControlsAssignment_2 )* )
            // InternalSynthesizer.g:567:2: ( rule__Model__ControlsAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getControlsAssignment_2()); 
            // InternalSynthesizer.g:568:2: ( rule__Model__ControlsAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18||LA4_0==25||LA4_0==28) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSynthesizer.g:568:3: rule__Model__ControlsAssignment_2
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
    // InternalSynthesizer.g:576:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:580:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalSynthesizer.g:581:2: rule__Model__Group__3__Impl rule__Model__Group__4
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
    // InternalSynthesizer.g:588:1: rule__Model__Group__3__Impl : ( '}' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:592:1: ( ( '}' ) )
            // InternalSynthesizer.g:593:1: ( '}' )
            {
            // InternalSynthesizer.g:593:1: ( '}' )
            // InternalSynthesizer.g:594:2: '}'
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
    // InternalSynthesizer.g:603:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:607:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalSynthesizer.g:608:2: rule__Model__Group__4__Impl rule__Model__Group__5
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
    // InternalSynthesizer.g:615:1: rule__Model__Group__4__Impl : ( ( rule__Model__Group_4__0 )? ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:619:1: ( ( ( rule__Model__Group_4__0 )? ) )
            // InternalSynthesizer.g:620:1: ( ( rule__Model__Group_4__0 )? )
            {
            // InternalSynthesizer.g:620:1: ( ( rule__Model__Group_4__0 )? )
            // InternalSynthesizer.g:621:2: ( rule__Model__Group_4__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_4()); 
            // InternalSynthesizer.g:622:2: ( rule__Model__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSynthesizer.g:622:3: rule__Model__Group_4__0
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
    // InternalSynthesizer.g:630:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:634:1: ( rule__Model__Group__5__Impl )
            // InternalSynthesizer.g:635:2: rule__Model__Group__5__Impl
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
    // InternalSynthesizer.g:641:1: rule__Model__Group__5__Impl : ( ( rule__Model__Group_5__0 )? ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:645:1: ( ( ( rule__Model__Group_5__0 )? ) )
            // InternalSynthesizer.g:646:1: ( ( rule__Model__Group_5__0 )? )
            {
            // InternalSynthesizer.g:646:1: ( ( rule__Model__Group_5__0 )? )
            // InternalSynthesizer.g:647:2: ( rule__Model__Group_5__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_5()); 
            // InternalSynthesizer.g:648:2: ( rule__Model__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSynthesizer.g:648:3: rule__Model__Group_5__0
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
    // InternalSynthesizer.g:657:1: rule__Model__Group_4__0 : rule__Model__Group_4__0__Impl rule__Model__Group_4__1 ;
    public final void rule__Model__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:661:1: ( rule__Model__Group_4__0__Impl rule__Model__Group_4__1 )
            // InternalSynthesizer.g:662:2: rule__Model__Group_4__0__Impl rule__Model__Group_4__1
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
    // InternalSynthesizer.g:669:1: rule__Model__Group_4__0__Impl : ( 'Sound' ) ;
    public final void rule__Model__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:673:1: ( ( 'Sound' ) )
            // InternalSynthesizer.g:674:1: ( 'Sound' )
            {
            // InternalSynthesizer.g:674:1: ( 'Sound' )
            // InternalSynthesizer.g:675:2: 'Sound'
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
    // InternalSynthesizer.g:684:1: rule__Model__Group_4__1 : rule__Model__Group_4__1__Impl rule__Model__Group_4__2 ;
    public final void rule__Model__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:688:1: ( rule__Model__Group_4__1__Impl rule__Model__Group_4__2 )
            // InternalSynthesizer.g:689:2: rule__Model__Group_4__1__Impl rule__Model__Group_4__2
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
    // InternalSynthesizer.g:696:1: rule__Model__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Model__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:700:1: ( ( '{' ) )
            // InternalSynthesizer.g:701:1: ( '{' )
            {
            // InternalSynthesizer.g:701:1: ( '{' )
            // InternalSynthesizer.g:702:2: '{'
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
    // InternalSynthesizer.g:711:1: rule__Model__Group_4__2 : rule__Model__Group_4__2__Impl rule__Model__Group_4__3 ;
    public final void rule__Model__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:715:1: ( rule__Model__Group_4__2__Impl rule__Model__Group_4__3 )
            // InternalSynthesizer.g:716:2: rule__Model__Group_4__2__Impl rule__Model__Group_4__3
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
    // InternalSynthesizer.g:723:1: rule__Model__Group_4__2__Impl : ( ( rule__Model__SoundsAssignment_4_2 )* ) ;
    public final void rule__Model__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:727:1: ( ( ( rule__Model__SoundsAssignment_4_2 )* ) )
            // InternalSynthesizer.g:728:1: ( ( rule__Model__SoundsAssignment_4_2 )* )
            {
            // InternalSynthesizer.g:728:1: ( ( rule__Model__SoundsAssignment_4_2 )* )
            // InternalSynthesizer.g:729:2: ( rule__Model__SoundsAssignment_4_2 )*
            {
             before(grammarAccess.getModelAccess().getSoundsAssignment_4_2()); 
            // InternalSynthesizer.g:730:2: ( rule__Model__SoundsAssignment_4_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=30 && LA7_0<=35)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSynthesizer.g:730:3: rule__Model__SoundsAssignment_4_2
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
    // InternalSynthesizer.g:738:1: rule__Model__Group_4__3 : rule__Model__Group_4__3__Impl ;
    public final void rule__Model__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:742:1: ( rule__Model__Group_4__3__Impl )
            // InternalSynthesizer.g:743:2: rule__Model__Group_4__3__Impl
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
    // InternalSynthesizer.g:749:1: rule__Model__Group_4__3__Impl : ( '}' ) ;
    public final void rule__Model__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:753:1: ( ( '}' ) )
            // InternalSynthesizer.g:754:1: ( '}' )
            {
            // InternalSynthesizer.g:754:1: ( '}' )
            // InternalSynthesizer.g:755:2: '}'
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
    // InternalSynthesizer.g:765:1: rule__Model__Group_5__0 : rule__Model__Group_5__0__Impl rule__Model__Group_5__1 ;
    public final void rule__Model__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:769:1: ( rule__Model__Group_5__0__Impl rule__Model__Group_5__1 )
            // InternalSynthesizer.g:770:2: rule__Model__Group_5__0__Impl rule__Model__Group_5__1
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
    // InternalSynthesizer.g:777:1: rule__Model__Group_5__0__Impl : ( 'Connections' ) ;
    public final void rule__Model__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:781:1: ( ( 'Connections' ) )
            // InternalSynthesizer.g:782:1: ( 'Connections' )
            {
            // InternalSynthesizer.g:782:1: ( 'Connections' )
            // InternalSynthesizer.g:783:2: 'Connections'
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
    // InternalSynthesizer.g:792:1: rule__Model__Group_5__1 : rule__Model__Group_5__1__Impl rule__Model__Group_5__2 ;
    public final void rule__Model__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:796:1: ( rule__Model__Group_5__1__Impl rule__Model__Group_5__2 )
            // InternalSynthesizer.g:797:2: rule__Model__Group_5__1__Impl rule__Model__Group_5__2
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
    // InternalSynthesizer.g:804:1: rule__Model__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Model__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:808:1: ( ( '{' ) )
            // InternalSynthesizer.g:809:1: ( '{' )
            {
            // InternalSynthesizer.g:809:1: ( '{' )
            // InternalSynthesizer.g:810:2: '{'
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
    // InternalSynthesizer.g:819:1: rule__Model__Group_5__2 : rule__Model__Group_5__2__Impl rule__Model__Group_5__3 ;
    public final void rule__Model__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:823:1: ( rule__Model__Group_5__2__Impl rule__Model__Group_5__3 )
            // InternalSynthesizer.g:824:2: rule__Model__Group_5__2__Impl rule__Model__Group_5__3
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
    // InternalSynthesizer.g:831:1: rule__Model__Group_5__2__Impl : ( ( rule__Model__ConnectionsAssignment_5_2 )* ) ;
    public final void rule__Model__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:835:1: ( ( ( rule__Model__ConnectionsAssignment_5_2 )* ) )
            // InternalSynthesizer.g:836:1: ( ( rule__Model__ConnectionsAssignment_5_2 )* )
            {
            // InternalSynthesizer.g:836:1: ( ( rule__Model__ConnectionsAssignment_5_2 )* )
            // InternalSynthesizer.g:837:2: ( rule__Model__ConnectionsAssignment_5_2 )*
            {
             before(grammarAccess.getModelAccess().getConnectionsAssignment_5_2()); 
            // InternalSynthesizer.g:838:2: ( rule__Model__ConnectionsAssignment_5_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==29) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSynthesizer.g:838:3: rule__Model__ConnectionsAssignment_5_2
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
    // InternalSynthesizer.g:846:1: rule__Model__Group_5__3 : rule__Model__Group_5__3__Impl ;
    public final void rule__Model__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:850:1: ( rule__Model__Group_5__3__Impl )
            // InternalSynthesizer.g:851:2: rule__Model__Group_5__3__Impl
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
    // InternalSynthesizer.g:857:1: rule__Model__Group_5__3__Impl : ( '}' ) ;
    public final void rule__Model__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:861:1: ( ( '}' ) )
            // InternalSynthesizer.g:862:1: ( '}' )
            {
            // InternalSynthesizer.g:862:1: ( '}' )
            // InternalSynthesizer.g:863:2: '}'
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
    // InternalSynthesizer.g:873:1: rule__RotaryKnob__Group__0 : rule__RotaryKnob__Group__0__Impl rule__RotaryKnob__Group__1 ;
    public final void rule__RotaryKnob__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:877:1: ( rule__RotaryKnob__Group__0__Impl rule__RotaryKnob__Group__1 )
            // InternalSynthesizer.g:878:2: rule__RotaryKnob__Group__0__Impl rule__RotaryKnob__Group__1
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
    // InternalSynthesizer.g:885:1: rule__RotaryKnob__Group__0__Impl : ( 'rotaryKnob' ) ;
    public final void rule__RotaryKnob__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:889:1: ( ( 'rotaryKnob' ) )
            // InternalSynthesizer.g:890:1: ( 'rotaryKnob' )
            {
            // InternalSynthesizer.g:890:1: ( 'rotaryKnob' )
            // InternalSynthesizer.g:891:2: 'rotaryKnob'
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
    // InternalSynthesizer.g:900:1: rule__RotaryKnob__Group__1 : rule__RotaryKnob__Group__1__Impl rule__RotaryKnob__Group__2 ;
    public final void rule__RotaryKnob__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:904:1: ( rule__RotaryKnob__Group__1__Impl rule__RotaryKnob__Group__2 )
            // InternalSynthesizer.g:905:2: rule__RotaryKnob__Group__1__Impl rule__RotaryKnob__Group__2
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
    // InternalSynthesizer.g:912:1: rule__RotaryKnob__Group__1__Impl : ( ( rule__RotaryKnob__NameAssignment_1 ) ) ;
    public final void rule__RotaryKnob__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:916:1: ( ( ( rule__RotaryKnob__NameAssignment_1 ) ) )
            // InternalSynthesizer.g:917:1: ( ( rule__RotaryKnob__NameAssignment_1 ) )
            {
            // InternalSynthesizer.g:917:1: ( ( rule__RotaryKnob__NameAssignment_1 ) )
            // InternalSynthesizer.g:918:2: ( rule__RotaryKnob__NameAssignment_1 )
            {
             before(grammarAccess.getRotaryKnobAccess().getNameAssignment_1()); 
            // InternalSynthesizer.g:919:2: ( rule__RotaryKnob__NameAssignment_1 )
            // InternalSynthesizer.g:919:3: rule__RotaryKnob__NameAssignment_1
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
    // InternalSynthesizer.g:927:1: rule__RotaryKnob__Group__2 : rule__RotaryKnob__Group__2__Impl rule__RotaryKnob__Group__3 ;
    public final void rule__RotaryKnob__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:931:1: ( rule__RotaryKnob__Group__2__Impl rule__RotaryKnob__Group__3 )
            // InternalSynthesizer.g:932:2: rule__RotaryKnob__Group__2__Impl rule__RotaryKnob__Group__3
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
    // InternalSynthesizer.g:939:1: rule__RotaryKnob__Group__2__Impl : ( '(' ) ;
    public final void rule__RotaryKnob__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:943:1: ( ( '(' ) )
            // InternalSynthesizer.g:944:1: ( '(' )
            {
            // InternalSynthesizer.g:944:1: ( '(' )
            // InternalSynthesizer.g:945:2: '('
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
    // InternalSynthesizer.g:954:1: rule__RotaryKnob__Group__3 : rule__RotaryKnob__Group__3__Impl rule__RotaryKnob__Group__4 ;
    public final void rule__RotaryKnob__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:958:1: ( rule__RotaryKnob__Group__3__Impl rule__RotaryKnob__Group__4 )
            // InternalSynthesizer.g:959:2: rule__RotaryKnob__Group__3__Impl rule__RotaryKnob__Group__4
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
    // InternalSynthesizer.g:966:1: rule__RotaryKnob__Group__3__Impl : ( 'x' ) ;
    public final void rule__RotaryKnob__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:970:1: ( ( 'x' ) )
            // InternalSynthesizer.g:971:1: ( 'x' )
            {
            // InternalSynthesizer.g:971:1: ( 'x' )
            // InternalSynthesizer.g:972:2: 'x'
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
    // InternalSynthesizer.g:981:1: rule__RotaryKnob__Group__4 : rule__RotaryKnob__Group__4__Impl rule__RotaryKnob__Group__5 ;
    public final void rule__RotaryKnob__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:985:1: ( rule__RotaryKnob__Group__4__Impl rule__RotaryKnob__Group__5 )
            // InternalSynthesizer.g:986:2: rule__RotaryKnob__Group__4__Impl rule__RotaryKnob__Group__5
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
    // InternalSynthesizer.g:993:1: rule__RotaryKnob__Group__4__Impl : ( ( rule__RotaryKnob__XAssignment_4 ) ) ;
    public final void rule__RotaryKnob__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:997:1: ( ( ( rule__RotaryKnob__XAssignment_4 ) ) )
            // InternalSynthesizer.g:998:1: ( ( rule__RotaryKnob__XAssignment_4 ) )
            {
            // InternalSynthesizer.g:998:1: ( ( rule__RotaryKnob__XAssignment_4 ) )
            // InternalSynthesizer.g:999:2: ( rule__RotaryKnob__XAssignment_4 )
            {
             before(grammarAccess.getRotaryKnobAccess().getXAssignment_4()); 
            // InternalSynthesizer.g:1000:2: ( rule__RotaryKnob__XAssignment_4 )
            // InternalSynthesizer.g:1000:3: rule__RotaryKnob__XAssignment_4
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
    // InternalSynthesizer.g:1008:1: rule__RotaryKnob__Group__5 : rule__RotaryKnob__Group__5__Impl rule__RotaryKnob__Group__6 ;
    public final void rule__RotaryKnob__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1012:1: ( rule__RotaryKnob__Group__5__Impl rule__RotaryKnob__Group__6 )
            // InternalSynthesizer.g:1013:2: rule__RotaryKnob__Group__5__Impl rule__RotaryKnob__Group__6
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
    // InternalSynthesizer.g:1020:1: rule__RotaryKnob__Group__5__Impl : ( 'y' ) ;
    public final void rule__RotaryKnob__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1024:1: ( ( 'y' ) )
            // InternalSynthesizer.g:1025:1: ( 'y' )
            {
            // InternalSynthesizer.g:1025:1: ( 'y' )
            // InternalSynthesizer.g:1026:2: 'y'
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
    // InternalSynthesizer.g:1035:1: rule__RotaryKnob__Group__6 : rule__RotaryKnob__Group__6__Impl rule__RotaryKnob__Group__7 ;
    public final void rule__RotaryKnob__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1039:1: ( rule__RotaryKnob__Group__6__Impl rule__RotaryKnob__Group__7 )
            // InternalSynthesizer.g:1040:2: rule__RotaryKnob__Group__6__Impl rule__RotaryKnob__Group__7
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
    // InternalSynthesizer.g:1047:1: rule__RotaryKnob__Group__6__Impl : ( ( rule__RotaryKnob__YAssignment_6 ) ) ;
    public final void rule__RotaryKnob__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1051:1: ( ( ( rule__RotaryKnob__YAssignment_6 ) ) )
            // InternalSynthesizer.g:1052:1: ( ( rule__RotaryKnob__YAssignment_6 ) )
            {
            // InternalSynthesizer.g:1052:1: ( ( rule__RotaryKnob__YAssignment_6 ) )
            // InternalSynthesizer.g:1053:2: ( rule__RotaryKnob__YAssignment_6 )
            {
             before(grammarAccess.getRotaryKnobAccess().getYAssignment_6()); 
            // InternalSynthesizer.g:1054:2: ( rule__RotaryKnob__YAssignment_6 )
            // InternalSynthesizer.g:1054:3: rule__RotaryKnob__YAssignment_6
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
    // InternalSynthesizer.g:1062:1: rule__RotaryKnob__Group__7 : rule__RotaryKnob__Group__7__Impl rule__RotaryKnob__Group__8 ;
    public final void rule__RotaryKnob__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1066:1: ( rule__RotaryKnob__Group__7__Impl rule__RotaryKnob__Group__8 )
            // InternalSynthesizer.g:1067:2: rule__RotaryKnob__Group__7__Impl rule__RotaryKnob__Group__8
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
    // InternalSynthesizer.g:1074:1: rule__RotaryKnob__Group__7__Impl : ( 'width' ) ;
    public final void rule__RotaryKnob__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1078:1: ( ( 'width' ) )
            // InternalSynthesizer.g:1079:1: ( 'width' )
            {
            // InternalSynthesizer.g:1079:1: ( 'width' )
            // InternalSynthesizer.g:1080:2: 'width'
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
    // InternalSynthesizer.g:1089:1: rule__RotaryKnob__Group__8 : rule__RotaryKnob__Group__8__Impl rule__RotaryKnob__Group__9 ;
    public final void rule__RotaryKnob__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1093:1: ( rule__RotaryKnob__Group__8__Impl rule__RotaryKnob__Group__9 )
            // InternalSynthesizer.g:1094:2: rule__RotaryKnob__Group__8__Impl rule__RotaryKnob__Group__9
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
    // InternalSynthesizer.g:1101:1: rule__RotaryKnob__Group__8__Impl : ( ( rule__RotaryKnob__WidthAssignment_8 ) ) ;
    public final void rule__RotaryKnob__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1105:1: ( ( ( rule__RotaryKnob__WidthAssignment_8 ) ) )
            // InternalSynthesizer.g:1106:1: ( ( rule__RotaryKnob__WidthAssignment_8 ) )
            {
            // InternalSynthesizer.g:1106:1: ( ( rule__RotaryKnob__WidthAssignment_8 ) )
            // InternalSynthesizer.g:1107:2: ( rule__RotaryKnob__WidthAssignment_8 )
            {
             before(grammarAccess.getRotaryKnobAccess().getWidthAssignment_8()); 
            // InternalSynthesizer.g:1108:2: ( rule__RotaryKnob__WidthAssignment_8 )
            // InternalSynthesizer.g:1108:3: rule__RotaryKnob__WidthAssignment_8
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
    // InternalSynthesizer.g:1116:1: rule__RotaryKnob__Group__9 : rule__RotaryKnob__Group__9__Impl rule__RotaryKnob__Group__10 ;
    public final void rule__RotaryKnob__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1120:1: ( rule__RotaryKnob__Group__9__Impl rule__RotaryKnob__Group__10 )
            // InternalSynthesizer.g:1121:2: rule__RotaryKnob__Group__9__Impl rule__RotaryKnob__Group__10
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
    // InternalSynthesizer.g:1128:1: rule__RotaryKnob__Group__9__Impl : ( 'height' ) ;
    public final void rule__RotaryKnob__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1132:1: ( ( 'height' ) )
            // InternalSynthesizer.g:1133:1: ( 'height' )
            {
            // InternalSynthesizer.g:1133:1: ( 'height' )
            // InternalSynthesizer.g:1134:2: 'height'
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
    // InternalSynthesizer.g:1143:1: rule__RotaryKnob__Group__10 : rule__RotaryKnob__Group__10__Impl rule__RotaryKnob__Group__11 ;
    public final void rule__RotaryKnob__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1147:1: ( rule__RotaryKnob__Group__10__Impl rule__RotaryKnob__Group__11 )
            // InternalSynthesizer.g:1148:2: rule__RotaryKnob__Group__10__Impl rule__RotaryKnob__Group__11
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
    // InternalSynthesizer.g:1155:1: rule__RotaryKnob__Group__10__Impl : ( ( rule__RotaryKnob__HeightAssignment_10 ) ) ;
    public final void rule__RotaryKnob__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1159:1: ( ( ( rule__RotaryKnob__HeightAssignment_10 ) ) )
            // InternalSynthesizer.g:1160:1: ( ( rule__RotaryKnob__HeightAssignment_10 ) )
            {
            // InternalSynthesizer.g:1160:1: ( ( rule__RotaryKnob__HeightAssignment_10 ) )
            // InternalSynthesizer.g:1161:2: ( rule__RotaryKnob__HeightAssignment_10 )
            {
             before(grammarAccess.getRotaryKnobAccess().getHeightAssignment_10()); 
            // InternalSynthesizer.g:1162:2: ( rule__RotaryKnob__HeightAssignment_10 )
            // InternalSynthesizer.g:1162:3: rule__RotaryKnob__HeightAssignment_10
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
    // InternalSynthesizer.g:1170:1: rule__RotaryKnob__Group__11 : rule__RotaryKnob__Group__11__Impl ;
    public final void rule__RotaryKnob__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1174:1: ( rule__RotaryKnob__Group__11__Impl )
            // InternalSynthesizer.g:1175:2: rule__RotaryKnob__Group__11__Impl
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
    // InternalSynthesizer.g:1181:1: rule__RotaryKnob__Group__11__Impl : ( ')' ) ;
    public final void rule__RotaryKnob__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1185:1: ( ( ')' ) )
            // InternalSynthesizer.g:1186:1: ( ')' )
            {
            // InternalSynthesizer.g:1186:1: ( ')' )
            // InternalSynthesizer.g:1187:2: ')'
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
    // InternalSynthesizer.g:1197:1: rule__Slider__Group__0 : rule__Slider__Group__0__Impl rule__Slider__Group__1 ;
    public final void rule__Slider__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1201:1: ( rule__Slider__Group__0__Impl rule__Slider__Group__1 )
            // InternalSynthesizer.g:1202:2: rule__Slider__Group__0__Impl rule__Slider__Group__1
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
    // InternalSynthesizer.g:1209:1: rule__Slider__Group__0__Impl : ( 'slider' ) ;
    public final void rule__Slider__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1213:1: ( ( 'slider' ) )
            // InternalSynthesizer.g:1214:1: ( 'slider' )
            {
            // InternalSynthesizer.g:1214:1: ( 'slider' )
            // InternalSynthesizer.g:1215:2: 'slider'
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
    // InternalSynthesizer.g:1224:1: rule__Slider__Group__1 : rule__Slider__Group__1__Impl rule__Slider__Group__2 ;
    public final void rule__Slider__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1228:1: ( rule__Slider__Group__1__Impl rule__Slider__Group__2 )
            // InternalSynthesizer.g:1229:2: rule__Slider__Group__1__Impl rule__Slider__Group__2
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
    // InternalSynthesizer.g:1236:1: rule__Slider__Group__1__Impl : ( ( rule__Slider__NameAssignment_1 ) ) ;
    public final void rule__Slider__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1240:1: ( ( ( rule__Slider__NameAssignment_1 ) ) )
            // InternalSynthesizer.g:1241:1: ( ( rule__Slider__NameAssignment_1 ) )
            {
            // InternalSynthesizer.g:1241:1: ( ( rule__Slider__NameAssignment_1 ) )
            // InternalSynthesizer.g:1242:2: ( rule__Slider__NameAssignment_1 )
            {
             before(grammarAccess.getSliderAccess().getNameAssignment_1()); 
            // InternalSynthesizer.g:1243:2: ( rule__Slider__NameAssignment_1 )
            // InternalSynthesizer.g:1243:3: rule__Slider__NameAssignment_1
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
    // InternalSynthesizer.g:1251:1: rule__Slider__Group__2 : rule__Slider__Group__2__Impl rule__Slider__Group__3 ;
    public final void rule__Slider__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1255:1: ( rule__Slider__Group__2__Impl rule__Slider__Group__3 )
            // InternalSynthesizer.g:1256:2: rule__Slider__Group__2__Impl rule__Slider__Group__3
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
    // InternalSynthesizer.g:1263:1: rule__Slider__Group__2__Impl : ( '(' ) ;
    public final void rule__Slider__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1267:1: ( ( '(' ) )
            // InternalSynthesizer.g:1268:1: ( '(' )
            {
            // InternalSynthesizer.g:1268:1: ( '(' )
            // InternalSynthesizer.g:1269:2: '('
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
    // InternalSynthesizer.g:1278:1: rule__Slider__Group__3 : rule__Slider__Group__3__Impl rule__Slider__Group__4 ;
    public final void rule__Slider__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1282:1: ( rule__Slider__Group__3__Impl rule__Slider__Group__4 )
            // InternalSynthesizer.g:1283:2: rule__Slider__Group__3__Impl rule__Slider__Group__4
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
    // InternalSynthesizer.g:1290:1: rule__Slider__Group__3__Impl : ( 'x' ) ;
    public final void rule__Slider__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1294:1: ( ( 'x' ) )
            // InternalSynthesizer.g:1295:1: ( 'x' )
            {
            // InternalSynthesizer.g:1295:1: ( 'x' )
            // InternalSynthesizer.g:1296:2: 'x'
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
    // InternalSynthesizer.g:1305:1: rule__Slider__Group__4 : rule__Slider__Group__4__Impl rule__Slider__Group__5 ;
    public final void rule__Slider__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1309:1: ( rule__Slider__Group__4__Impl rule__Slider__Group__5 )
            // InternalSynthesizer.g:1310:2: rule__Slider__Group__4__Impl rule__Slider__Group__5
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
    // InternalSynthesizer.g:1317:1: rule__Slider__Group__4__Impl : ( ( rule__Slider__XAssignment_4 ) ) ;
    public final void rule__Slider__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1321:1: ( ( ( rule__Slider__XAssignment_4 ) ) )
            // InternalSynthesizer.g:1322:1: ( ( rule__Slider__XAssignment_4 ) )
            {
            // InternalSynthesizer.g:1322:1: ( ( rule__Slider__XAssignment_4 ) )
            // InternalSynthesizer.g:1323:2: ( rule__Slider__XAssignment_4 )
            {
             before(grammarAccess.getSliderAccess().getXAssignment_4()); 
            // InternalSynthesizer.g:1324:2: ( rule__Slider__XAssignment_4 )
            // InternalSynthesizer.g:1324:3: rule__Slider__XAssignment_4
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
    // InternalSynthesizer.g:1332:1: rule__Slider__Group__5 : rule__Slider__Group__5__Impl rule__Slider__Group__6 ;
    public final void rule__Slider__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1336:1: ( rule__Slider__Group__5__Impl rule__Slider__Group__6 )
            // InternalSynthesizer.g:1337:2: rule__Slider__Group__5__Impl rule__Slider__Group__6
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
    // InternalSynthesizer.g:1344:1: rule__Slider__Group__5__Impl : ( 'y' ) ;
    public final void rule__Slider__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1348:1: ( ( 'y' ) )
            // InternalSynthesizer.g:1349:1: ( 'y' )
            {
            // InternalSynthesizer.g:1349:1: ( 'y' )
            // InternalSynthesizer.g:1350:2: 'y'
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
    // InternalSynthesizer.g:1359:1: rule__Slider__Group__6 : rule__Slider__Group__6__Impl rule__Slider__Group__7 ;
    public final void rule__Slider__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1363:1: ( rule__Slider__Group__6__Impl rule__Slider__Group__7 )
            // InternalSynthesizer.g:1364:2: rule__Slider__Group__6__Impl rule__Slider__Group__7
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
    // InternalSynthesizer.g:1371:1: rule__Slider__Group__6__Impl : ( ( rule__Slider__YAssignment_6 ) ) ;
    public final void rule__Slider__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1375:1: ( ( ( rule__Slider__YAssignment_6 ) ) )
            // InternalSynthesizer.g:1376:1: ( ( rule__Slider__YAssignment_6 ) )
            {
            // InternalSynthesizer.g:1376:1: ( ( rule__Slider__YAssignment_6 ) )
            // InternalSynthesizer.g:1377:2: ( rule__Slider__YAssignment_6 )
            {
             before(grammarAccess.getSliderAccess().getYAssignment_6()); 
            // InternalSynthesizer.g:1378:2: ( rule__Slider__YAssignment_6 )
            // InternalSynthesizer.g:1378:3: rule__Slider__YAssignment_6
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
    // InternalSynthesizer.g:1386:1: rule__Slider__Group__7 : rule__Slider__Group__7__Impl rule__Slider__Group__8 ;
    public final void rule__Slider__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1390:1: ( rule__Slider__Group__7__Impl rule__Slider__Group__8 )
            // InternalSynthesizer.g:1391:2: rule__Slider__Group__7__Impl rule__Slider__Group__8
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
    // InternalSynthesizer.g:1398:1: rule__Slider__Group__7__Impl : ( 'width' ) ;
    public final void rule__Slider__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1402:1: ( ( 'width' ) )
            // InternalSynthesizer.g:1403:1: ( 'width' )
            {
            // InternalSynthesizer.g:1403:1: ( 'width' )
            // InternalSynthesizer.g:1404:2: 'width'
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
    // InternalSynthesizer.g:1413:1: rule__Slider__Group__8 : rule__Slider__Group__8__Impl rule__Slider__Group__9 ;
    public final void rule__Slider__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1417:1: ( rule__Slider__Group__8__Impl rule__Slider__Group__9 )
            // InternalSynthesizer.g:1418:2: rule__Slider__Group__8__Impl rule__Slider__Group__9
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
    // InternalSynthesizer.g:1425:1: rule__Slider__Group__8__Impl : ( ( rule__Slider__WidthAssignment_8 ) ) ;
    public final void rule__Slider__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1429:1: ( ( ( rule__Slider__WidthAssignment_8 ) ) )
            // InternalSynthesizer.g:1430:1: ( ( rule__Slider__WidthAssignment_8 ) )
            {
            // InternalSynthesizer.g:1430:1: ( ( rule__Slider__WidthAssignment_8 ) )
            // InternalSynthesizer.g:1431:2: ( rule__Slider__WidthAssignment_8 )
            {
             before(grammarAccess.getSliderAccess().getWidthAssignment_8()); 
            // InternalSynthesizer.g:1432:2: ( rule__Slider__WidthAssignment_8 )
            // InternalSynthesizer.g:1432:3: rule__Slider__WidthAssignment_8
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
    // InternalSynthesizer.g:1440:1: rule__Slider__Group__9 : rule__Slider__Group__9__Impl rule__Slider__Group__10 ;
    public final void rule__Slider__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1444:1: ( rule__Slider__Group__9__Impl rule__Slider__Group__10 )
            // InternalSynthesizer.g:1445:2: rule__Slider__Group__9__Impl rule__Slider__Group__10
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
    // InternalSynthesizer.g:1452:1: rule__Slider__Group__9__Impl : ( 'height' ) ;
    public final void rule__Slider__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1456:1: ( ( 'height' ) )
            // InternalSynthesizer.g:1457:1: ( 'height' )
            {
            // InternalSynthesizer.g:1457:1: ( 'height' )
            // InternalSynthesizer.g:1458:2: 'height'
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
    // InternalSynthesizer.g:1467:1: rule__Slider__Group__10 : rule__Slider__Group__10__Impl rule__Slider__Group__11 ;
    public final void rule__Slider__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1471:1: ( rule__Slider__Group__10__Impl rule__Slider__Group__11 )
            // InternalSynthesizer.g:1472:2: rule__Slider__Group__10__Impl rule__Slider__Group__11
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
    // InternalSynthesizer.g:1479:1: rule__Slider__Group__10__Impl : ( ( rule__Slider__HeightAssignment_10 ) ) ;
    public final void rule__Slider__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1483:1: ( ( ( rule__Slider__HeightAssignment_10 ) ) )
            // InternalSynthesizer.g:1484:1: ( ( rule__Slider__HeightAssignment_10 ) )
            {
            // InternalSynthesizer.g:1484:1: ( ( rule__Slider__HeightAssignment_10 ) )
            // InternalSynthesizer.g:1485:2: ( rule__Slider__HeightAssignment_10 )
            {
             before(grammarAccess.getSliderAccess().getHeightAssignment_10()); 
            // InternalSynthesizer.g:1486:2: ( rule__Slider__HeightAssignment_10 )
            // InternalSynthesizer.g:1486:3: rule__Slider__HeightAssignment_10
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
    // InternalSynthesizer.g:1494:1: rule__Slider__Group__11 : rule__Slider__Group__11__Impl rule__Slider__Group__12 ;
    public final void rule__Slider__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1498:1: ( rule__Slider__Group__11__Impl rule__Slider__Group__12 )
            // InternalSynthesizer.g:1499:2: rule__Slider__Group__11__Impl rule__Slider__Group__12
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
    // InternalSynthesizer.g:1506:1: rule__Slider__Group__11__Impl : ( 'sound' ) ;
    public final void rule__Slider__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1510:1: ( ( 'sound' ) )
            // InternalSynthesizer.g:1511:1: ( 'sound' )
            {
            // InternalSynthesizer.g:1511:1: ( 'sound' )
            // InternalSynthesizer.g:1512:2: 'sound'
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
    // InternalSynthesizer.g:1521:1: rule__Slider__Group__12 : rule__Slider__Group__12__Impl rule__Slider__Group__13 ;
    public final void rule__Slider__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1525:1: ( rule__Slider__Group__12__Impl rule__Slider__Group__13 )
            // InternalSynthesizer.g:1526:2: rule__Slider__Group__12__Impl rule__Slider__Group__13
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
    // InternalSynthesizer.g:1533:1: rule__Slider__Group__12__Impl : ( ( rule__Slider__SoundAssignment_12 ) ) ;
    public final void rule__Slider__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1537:1: ( ( ( rule__Slider__SoundAssignment_12 ) ) )
            // InternalSynthesizer.g:1538:1: ( ( rule__Slider__SoundAssignment_12 ) )
            {
            // InternalSynthesizer.g:1538:1: ( ( rule__Slider__SoundAssignment_12 ) )
            // InternalSynthesizer.g:1539:2: ( rule__Slider__SoundAssignment_12 )
            {
             before(grammarAccess.getSliderAccess().getSoundAssignment_12()); 
            // InternalSynthesizer.g:1540:2: ( rule__Slider__SoundAssignment_12 )
            // InternalSynthesizer.g:1540:3: rule__Slider__SoundAssignment_12
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
    // InternalSynthesizer.g:1548:1: rule__Slider__Group__13 : rule__Slider__Group__13__Impl rule__Slider__Group__14 ;
    public final void rule__Slider__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1552:1: ( rule__Slider__Group__13__Impl rule__Slider__Group__14 )
            // InternalSynthesizer.g:1553:2: rule__Slider__Group__13__Impl rule__Slider__Group__14
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
    // InternalSynthesizer.g:1560:1: rule__Slider__Group__13__Impl : ( 'effect' ) ;
    public final void rule__Slider__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1564:1: ( ( 'effect' ) )
            // InternalSynthesizer.g:1565:1: ( 'effect' )
            {
            // InternalSynthesizer.g:1565:1: ( 'effect' )
            // InternalSynthesizer.g:1566:2: 'effect'
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
    // InternalSynthesizer.g:1575:1: rule__Slider__Group__14 : rule__Slider__Group__14__Impl rule__Slider__Group__15 ;
    public final void rule__Slider__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1579:1: ( rule__Slider__Group__14__Impl rule__Slider__Group__15 )
            // InternalSynthesizer.g:1580:2: rule__Slider__Group__14__Impl rule__Slider__Group__15
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
    // InternalSynthesizer.g:1587:1: rule__Slider__Group__14__Impl : ( ( rule__Slider__TypeAssignment_14 ) ) ;
    public final void rule__Slider__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1591:1: ( ( ( rule__Slider__TypeAssignment_14 ) ) )
            // InternalSynthesizer.g:1592:1: ( ( rule__Slider__TypeAssignment_14 ) )
            {
            // InternalSynthesizer.g:1592:1: ( ( rule__Slider__TypeAssignment_14 ) )
            // InternalSynthesizer.g:1593:2: ( rule__Slider__TypeAssignment_14 )
            {
             before(grammarAccess.getSliderAccess().getTypeAssignment_14()); 
            // InternalSynthesizer.g:1594:2: ( rule__Slider__TypeAssignment_14 )
            // InternalSynthesizer.g:1594:3: rule__Slider__TypeAssignment_14
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
    // InternalSynthesizer.g:1602:1: rule__Slider__Group__15 : rule__Slider__Group__15__Impl ;
    public final void rule__Slider__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1606:1: ( rule__Slider__Group__15__Impl )
            // InternalSynthesizer.g:1607:2: rule__Slider__Group__15__Impl
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
    // InternalSynthesizer.g:1613:1: rule__Slider__Group__15__Impl : ( ')' ) ;
    public final void rule__Slider__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1617:1: ( ( ')' ) )
            // InternalSynthesizer.g:1618:1: ( ')' )
            {
            // InternalSynthesizer.g:1618:1: ( ')' )
            // InternalSynthesizer.g:1619:2: ')'
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
    // InternalSynthesizer.g:1629:1: rule__Button__Group__0 : rule__Button__Group__0__Impl rule__Button__Group__1 ;
    public final void rule__Button__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1633:1: ( rule__Button__Group__0__Impl rule__Button__Group__1 )
            // InternalSynthesizer.g:1634:2: rule__Button__Group__0__Impl rule__Button__Group__1
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
    // InternalSynthesizer.g:1641:1: rule__Button__Group__0__Impl : ( 'button' ) ;
    public final void rule__Button__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1645:1: ( ( 'button' ) )
            // InternalSynthesizer.g:1646:1: ( 'button' )
            {
            // InternalSynthesizer.g:1646:1: ( 'button' )
            // InternalSynthesizer.g:1647:2: 'button'
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
    // InternalSynthesizer.g:1656:1: rule__Button__Group__1 : rule__Button__Group__1__Impl rule__Button__Group__2 ;
    public final void rule__Button__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1660:1: ( rule__Button__Group__1__Impl rule__Button__Group__2 )
            // InternalSynthesizer.g:1661:2: rule__Button__Group__1__Impl rule__Button__Group__2
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
    // InternalSynthesizer.g:1668:1: rule__Button__Group__1__Impl : ( ( rule__Button__NameAssignment_1 ) ) ;
    public final void rule__Button__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1672:1: ( ( ( rule__Button__NameAssignment_1 ) ) )
            // InternalSynthesizer.g:1673:1: ( ( rule__Button__NameAssignment_1 ) )
            {
            // InternalSynthesizer.g:1673:1: ( ( rule__Button__NameAssignment_1 ) )
            // InternalSynthesizer.g:1674:2: ( rule__Button__NameAssignment_1 )
            {
             before(grammarAccess.getButtonAccess().getNameAssignment_1()); 
            // InternalSynthesizer.g:1675:2: ( rule__Button__NameAssignment_1 )
            // InternalSynthesizer.g:1675:3: rule__Button__NameAssignment_1
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
    // InternalSynthesizer.g:1683:1: rule__Button__Group__2 : rule__Button__Group__2__Impl rule__Button__Group__3 ;
    public final void rule__Button__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1687:1: ( rule__Button__Group__2__Impl rule__Button__Group__3 )
            // InternalSynthesizer.g:1688:2: rule__Button__Group__2__Impl rule__Button__Group__3
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
    // InternalSynthesizer.g:1695:1: rule__Button__Group__2__Impl : ( '(' ) ;
    public final void rule__Button__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1699:1: ( ( '(' ) )
            // InternalSynthesizer.g:1700:1: ( '(' )
            {
            // InternalSynthesizer.g:1700:1: ( '(' )
            // InternalSynthesizer.g:1701:2: '('
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
    // InternalSynthesizer.g:1710:1: rule__Button__Group__3 : rule__Button__Group__3__Impl rule__Button__Group__4 ;
    public final void rule__Button__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1714:1: ( rule__Button__Group__3__Impl rule__Button__Group__4 )
            // InternalSynthesizer.g:1715:2: rule__Button__Group__3__Impl rule__Button__Group__4
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
    // InternalSynthesizer.g:1722:1: rule__Button__Group__3__Impl : ( 'x' ) ;
    public final void rule__Button__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1726:1: ( ( 'x' ) )
            // InternalSynthesizer.g:1727:1: ( 'x' )
            {
            // InternalSynthesizer.g:1727:1: ( 'x' )
            // InternalSynthesizer.g:1728:2: 'x'
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
    // InternalSynthesizer.g:1737:1: rule__Button__Group__4 : rule__Button__Group__4__Impl rule__Button__Group__5 ;
    public final void rule__Button__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1741:1: ( rule__Button__Group__4__Impl rule__Button__Group__5 )
            // InternalSynthesizer.g:1742:2: rule__Button__Group__4__Impl rule__Button__Group__5
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
    // InternalSynthesizer.g:1749:1: rule__Button__Group__4__Impl : ( ( rule__Button__XAssignment_4 ) ) ;
    public final void rule__Button__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1753:1: ( ( ( rule__Button__XAssignment_4 ) ) )
            // InternalSynthesizer.g:1754:1: ( ( rule__Button__XAssignment_4 ) )
            {
            // InternalSynthesizer.g:1754:1: ( ( rule__Button__XAssignment_4 ) )
            // InternalSynthesizer.g:1755:2: ( rule__Button__XAssignment_4 )
            {
             before(grammarAccess.getButtonAccess().getXAssignment_4()); 
            // InternalSynthesizer.g:1756:2: ( rule__Button__XAssignment_4 )
            // InternalSynthesizer.g:1756:3: rule__Button__XAssignment_4
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
    // InternalSynthesizer.g:1764:1: rule__Button__Group__5 : rule__Button__Group__5__Impl rule__Button__Group__6 ;
    public final void rule__Button__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1768:1: ( rule__Button__Group__5__Impl rule__Button__Group__6 )
            // InternalSynthesizer.g:1769:2: rule__Button__Group__5__Impl rule__Button__Group__6
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
    // InternalSynthesizer.g:1776:1: rule__Button__Group__5__Impl : ( 'y' ) ;
    public final void rule__Button__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1780:1: ( ( 'y' ) )
            // InternalSynthesizer.g:1781:1: ( 'y' )
            {
            // InternalSynthesizer.g:1781:1: ( 'y' )
            // InternalSynthesizer.g:1782:2: 'y'
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
    // InternalSynthesizer.g:1791:1: rule__Button__Group__6 : rule__Button__Group__6__Impl rule__Button__Group__7 ;
    public final void rule__Button__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1795:1: ( rule__Button__Group__6__Impl rule__Button__Group__7 )
            // InternalSynthesizer.g:1796:2: rule__Button__Group__6__Impl rule__Button__Group__7
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
    // InternalSynthesizer.g:1803:1: rule__Button__Group__6__Impl : ( ( rule__Button__YAssignment_6 ) ) ;
    public final void rule__Button__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1807:1: ( ( ( rule__Button__YAssignment_6 ) ) )
            // InternalSynthesizer.g:1808:1: ( ( rule__Button__YAssignment_6 ) )
            {
            // InternalSynthesizer.g:1808:1: ( ( rule__Button__YAssignment_6 ) )
            // InternalSynthesizer.g:1809:2: ( rule__Button__YAssignment_6 )
            {
             before(grammarAccess.getButtonAccess().getYAssignment_6()); 
            // InternalSynthesizer.g:1810:2: ( rule__Button__YAssignment_6 )
            // InternalSynthesizer.g:1810:3: rule__Button__YAssignment_6
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
    // InternalSynthesizer.g:1818:1: rule__Button__Group__7 : rule__Button__Group__7__Impl rule__Button__Group__8 ;
    public final void rule__Button__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1822:1: ( rule__Button__Group__7__Impl rule__Button__Group__8 )
            // InternalSynthesizer.g:1823:2: rule__Button__Group__7__Impl rule__Button__Group__8
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
    // InternalSynthesizer.g:1830:1: rule__Button__Group__7__Impl : ( 'width' ) ;
    public final void rule__Button__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1834:1: ( ( 'width' ) )
            // InternalSynthesizer.g:1835:1: ( 'width' )
            {
            // InternalSynthesizer.g:1835:1: ( 'width' )
            // InternalSynthesizer.g:1836:2: 'width'
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
    // InternalSynthesizer.g:1845:1: rule__Button__Group__8 : rule__Button__Group__8__Impl rule__Button__Group__9 ;
    public final void rule__Button__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1849:1: ( rule__Button__Group__8__Impl rule__Button__Group__9 )
            // InternalSynthesizer.g:1850:2: rule__Button__Group__8__Impl rule__Button__Group__9
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
    // InternalSynthesizer.g:1857:1: rule__Button__Group__8__Impl : ( ( rule__Button__WidthAssignment_8 ) ) ;
    public final void rule__Button__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1861:1: ( ( ( rule__Button__WidthAssignment_8 ) ) )
            // InternalSynthesizer.g:1862:1: ( ( rule__Button__WidthAssignment_8 ) )
            {
            // InternalSynthesizer.g:1862:1: ( ( rule__Button__WidthAssignment_8 ) )
            // InternalSynthesizer.g:1863:2: ( rule__Button__WidthAssignment_8 )
            {
             before(grammarAccess.getButtonAccess().getWidthAssignment_8()); 
            // InternalSynthesizer.g:1864:2: ( rule__Button__WidthAssignment_8 )
            // InternalSynthesizer.g:1864:3: rule__Button__WidthAssignment_8
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
    // InternalSynthesizer.g:1872:1: rule__Button__Group__9 : rule__Button__Group__9__Impl rule__Button__Group__10 ;
    public final void rule__Button__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1876:1: ( rule__Button__Group__9__Impl rule__Button__Group__10 )
            // InternalSynthesizer.g:1877:2: rule__Button__Group__9__Impl rule__Button__Group__10
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
    // InternalSynthesizer.g:1884:1: rule__Button__Group__9__Impl : ( 'height' ) ;
    public final void rule__Button__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1888:1: ( ( 'height' ) )
            // InternalSynthesizer.g:1889:1: ( 'height' )
            {
            // InternalSynthesizer.g:1889:1: ( 'height' )
            // InternalSynthesizer.g:1890:2: 'height'
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
    // InternalSynthesizer.g:1899:1: rule__Button__Group__10 : rule__Button__Group__10__Impl rule__Button__Group__11 ;
    public final void rule__Button__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1903:1: ( rule__Button__Group__10__Impl rule__Button__Group__11 )
            // InternalSynthesizer.g:1904:2: rule__Button__Group__10__Impl rule__Button__Group__11
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
    // InternalSynthesizer.g:1911:1: rule__Button__Group__10__Impl : ( ( rule__Button__HeightAssignment_10 ) ) ;
    public final void rule__Button__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1915:1: ( ( ( rule__Button__HeightAssignment_10 ) ) )
            // InternalSynthesizer.g:1916:1: ( ( rule__Button__HeightAssignment_10 ) )
            {
            // InternalSynthesizer.g:1916:1: ( ( rule__Button__HeightAssignment_10 ) )
            // InternalSynthesizer.g:1917:2: ( rule__Button__HeightAssignment_10 )
            {
             before(grammarAccess.getButtonAccess().getHeightAssignment_10()); 
            // InternalSynthesizer.g:1918:2: ( rule__Button__HeightAssignment_10 )
            // InternalSynthesizer.g:1918:3: rule__Button__HeightAssignment_10
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
    // InternalSynthesizer.g:1926:1: rule__Button__Group__11 : rule__Button__Group__11__Impl rule__Button__Group__12 ;
    public final void rule__Button__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1930:1: ( rule__Button__Group__11__Impl rule__Button__Group__12 )
            // InternalSynthesizer.g:1931:2: rule__Button__Group__11__Impl rule__Button__Group__12
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
    // InternalSynthesizer.g:1938:1: rule__Button__Group__11__Impl : ( 'sound' ) ;
    public final void rule__Button__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1942:1: ( ( 'sound' ) )
            // InternalSynthesizer.g:1943:1: ( 'sound' )
            {
            // InternalSynthesizer.g:1943:1: ( 'sound' )
            // InternalSynthesizer.g:1944:2: 'sound'
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
    // InternalSynthesizer.g:1953:1: rule__Button__Group__12 : rule__Button__Group__12__Impl rule__Button__Group__13 ;
    public final void rule__Button__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1957:1: ( rule__Button__Group__12__Impl rule__Button__Group__13 )
            // InternalSynthesizer.g:1958:2: rule__Button__Group__12__Impl rule__Button__Group__13
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
    // InternalSynthesizer.g:1965:1: rule__Button__Group__12__Impl : ( ( rule__Button__SoundAssignment_12 ) ) ;
    public final void rule__Button__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1969:1: ( ( ( rule__Button__SoundAssignment_12 ) ) )
            // InternalSynthesizer.g:1970:1: ( ( rule__Button__SoundAssignment_12 ) )
            {
            // InternalSynthesizer.g:1970:1: ( ( rule__Button__SoundAssignment_12 ) )
            // InternalSynthesizer.g:1971:2: ( rule__Button__SoundAssignment_12 )
            {
             before(grammarAccess.getButtonAccess().getSoundAssignment_12()); 
            // InternalSynthesizer.g:1972:2: ( rule__Button__SoundAssignment_12 )
            // InternalSynthesizer.g:1972:3: rule__Button__SoundAssignment_12
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
    // InternalSynthesizer.g:1980:1: rule__Button__Group__13 : rule__Button__Group__13__Impl ;
    public final void rule__Button__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1984:1: ( rule__Button__Group__13__Impl )
            // InternalSynthesizer.g:1985:2: rule__Button__Group__13__Impl
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
    // InternalSynthesizer.g:1991:1: rule__Button__Group__13__Impl : ( ')' ) ;
    public final void rule__Button__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:1995:1: ( ( ')' ) )
            // InternalSynthesizer.g:1996:1: ( ')' )
            {
            // InternalSynthesizer.g:1996:1: ( ')' )
            // InternalSynthesizer.g:1997:2: ')'
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
    // InternalSynthesizer.g:2007:1: rule__ConnectionElement__Group__0 : rule__ConnectionElement__Group__0__Impl rule__ConnectionElement__Group__1 ;
    public final void rule__ConnectionElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2011:1: ( rule__ConnectionElement__Group__0__Impl rule__ConnectionElement__Group__1 )
            // InternalSynthesizer.g:2012:2: rule__ConnectionElement__Group__0__Impl rule__ConnectionElement__Group__1
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
    // InternalSynthesizer.g:2019:1: rule__ConnectionElement__Group__0__Impl : ( 'linear' ) ;
    public final void rule__ConnectionElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2023:1: ( ( 'linear' ) )
            // InternalSynthesizer.g:2024:1: ( 'linear' )
            {
            // InternalSynthesizer.g:2024:1: ( 'linear' )
            // InternalSynthesizer.g:2025:2: 'linear'
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
    // InternalSynthesizer.g:2034:1: rule__ConnectionElement__Group__1 : rule__ConnectionElement__Group__1__Impl rule__ConnectionElement__Group__2 ;
    public final void rule__ConnectionElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2038:1: ( rule__ConnectionElement__Group__1__Impl rule__ConnectionElement__Group__2 )
            // InternalSynthesizer.g:2039:2: rule__ConnectionElement__Group__1__Impl rule__ConnectionElement__Group__2
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
    // InternalSynthesizer.g:2046:1: rule__ConnectionElement__Group__1__Impl : ( ( rule__ConnectionElement__CeAssignment_1 ) ) ;
    public final void rule__ConnectionElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2050:1: ( ( ( rule__ConnectionElement__CeAssignment_1 ) ) )
            // InternalSynthesizer.g:2051:1: ( ( rule__ConnectionElement__CeAssignment_1 ) )
            {
            // InternalSynthesizer.g:2051:1: ( ( rule__ConnectionElement__CeAssignment_1 ) )
            // InternalSynthesizer.g:2052:2: ( rule__ConnectionElement__CeAssignment_1 )
            {
             before(grammarAccess.getConnectionElementAccess().getCeAssignment_1()); 
            // InternalSynthesizer.g:2053:2: ( rule__ConnectionElement__CeAssignment_1 )
            // InternalSynthesizer.g:2053:3: rule__ConnectionElement__CeAssignment_1
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
    // InternalSynthesizer.g:2061:1: rule__ConnectionElement__Group__2 : rule__ConnectionElement__Group__2__Impl ;
    public final void rule__ConnectionElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2065:1: ( rule__ConnectionElement__Group__2__Impl )
            // InternalSynthesizer.g:2066:2: rule__ConnectionElement__Group__2__Impl
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
    // InternalSynthesizer.g:2072:1: rule__ConnectionElement__Group__2__Impl : ( ( rule__ConnectionElement__SeAssignment_2 ) ) ;
    public final void rule__ConnectionElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2076:1: ( ( ( rule__ConnectionElement__SeAssignment_2 ) ) )
            // InternalSynthesizer.g:2077:1: ( ( rule__ConnectionElement__SeAssignment_2 ) )
            {
            // InternalSynthesizer.g:2077:1: ( ( rule__ConnectionElement__SeAssignment_2 ) )
            // InternalSynthesizer.g:2078:2: ( rule__ConnectionElement__SeAssignment_2 )
            {
             before(grammarAccess.getConnectionElementAccess().getSeAssignment_2()); 
            // InternalSynthesizer.g:2079:2: ( rule__ConnectionElement__SeAssignment_2 )
            // InternalSynthesizer.g:2079:3: rule__ConnectionElement__SeAssignment_2
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
    // InternalSynthesizer.g:2088:1: rule__SawToothOscillator__Group__0 : rule__SawToothOscillator__Group__0__Impl rule__SawToothOscillator__Group__1 ;
    public final void rule__SawToothOscillator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2092:1: ( rule__SawToothOscillator__Group__0__Impl rule__SawToothOscillator__Group__1 )
            // InternalSynthesizer.g:2093:2: rule__SawToothOscillator__Group__0__Impl rule__SawToothOscillator__Group__1
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
    // InternalSynthesizer.g:2100:1: rule__SawToothOscillator__Group__0__Impl : ( 'sawToothOscillator' ) ;
    public final void rule__SawToothOscillator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2104:1: ( ( 'sawToothOscillator' ) )
            // InternalSynthesizer.g:2105:1: ( 'sawToothOscillator' )
            {
            // InternalSynthesizer.g:2105:1: ( 'sawToothOscillator' )
            // InternalSynthesizer.g:2106:2: 'sawToothOscillator'
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
    // InternalSynthesizer.g:2115:1: rule__SawToothOscillator__Group__1 : rule__SawToothOscillator__Group__1__Impl rule__SawToothOscillator__Group__2 ;
    public final void rule__SawToothOscillator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2119:1: ( rule__SawToothOscillator__Group__1__Impl rule__SawToothOscillator__Group__2 )
            // InternalSynthesizer.g:2120:2: rule__SawToothOscillator__Group__1__Impl rule__SawToothOscillator__Group__2
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
    // InternalSynthesizer.g:2127:1: rule__SawToothOscillator__Group__1__Impl : ( ( rule__SawToothOscillator__NameAssignment_1 ) ) ;
    public final void rule__SawToothOscillator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2131:1: ( ( ( rule__SawToothOscillator__NameAssignment_1 ) ) )
            // InternalSynthesizer.g:2132:1: ( ( rule__SawToothOscillator__NameAssignment_1 ) )
            {
            // InternalSynthesizer.g:2132:1: ( ( rule__SawToothOscillator__NameAssignment_1 ) )
            // InternalSynthesizer.g:2133:2: ( rule__SawToothOscillator__NameAssignment_1 )
            {
             before(grammarAccess.getSawToothOscillatorAccess().getNameAssignment_1()); 
            // InternalSynthesizer.g:2134:2: ( rule__SawToothOscillator__NameAssignment_1 )
            // InternalSynthesizer.g:2134:3: rule__SawToothOscillator__NameAssignment_1
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
    // InternalSynthesizer.g:2142:1: rule__SawToothOscillator__Group__2 : rule__SawToothOscillator__Group__2__Impl rule__SawToothOscillator__Group__3 ;
    public final void rule__SawToothOscillator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2146:1: ( rule__SawToothOscillator__Group__2__Impl rule__SawToothOscillator__Group__3 )
            // InternalSynthesizer.g:2147:2: rule__SawToothOscillator__Group__2__Impl rule__SawToothOscillator__Group__3
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
    // InternalSynthesizer.g:2154:1: rule__SawToothOscillator__Group__2__Impl : ( '(' ) ;
    public final void rule__SawToothOscillator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2158:1: ( ( '(' ) )
            // InternalSynthesizer.g:2159:1: ( '(' )
            {
            // InternalSynthesizer.g:2159:1: ( '(' )
            // InternalSynthesizer.g:2160:2: '('
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
    // InternalSynthesizer.g:2169:1: rule__SawToothOscillator__Group__3 : rule__SawToothOscillator__Group__3__Impl rule__SawToothOscillator__Group__4 ;
    public final void rule__SawToothOscillator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2173:1: ( rule__SawToothOscillator__Group__3__Impl rule__SawToothOscillator__Group__4 )
            // InternalSynthesizer.g:2174:2: rule__SawToothOscillator__Group__3__Impl rule__SawToothOscillator__Group__4
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
    // InternalSynthesizer.g:2181:1: rule__SawToothOscillator__Group__3__Impl : ( 'frequency' ) ;
    public final void rule__SawToothOscillator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2185:1: ( ( 'frequency' ) )
            // InternalSynthesizer.g:2186:1: ( 'frequency' )
            {
            // InternalSynthesizer.g:2186:1: ( 'frequency' )
            // InternalSynthesizer.g:2187:2: 'frequency'
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
    // InternalSynthesizer.g:2196:1: rule__SawToothOscillator__Group__4 : rule__SawToothOscillator__Group__4__Impl rule__SawToothOscillator__Group__5 ;
    public final void rule__SawToothOscillator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2200:1: ( rule__SawToothOscillator__Group__4__Impl rule__SawToothOscillator__Group__5 )
            // InternalSynthesizer.g:2201:2: rule__SawToothOscillator__Group__4__Impl rule__SawToothOscillator__Group__5
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
    // InternalSynthesizer.g:2208:1: rule__SawToothOscillator__Group__4__Impl : ( ( rule__SawToothOscillator__FrequencyAssignment_4 ) ) ;
    public final void rule__SawToothOscillator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2212:1: ( ( ( rule__SawToothOscillator__FrequencyAssignment_4 ) ) )
            // InternalSynthesizer.g:2213:1: ( ( rule__SawToothOscillator__FrequencyAssignment_4 ) )
            {
            // InternalSynthesizer.g:2213:1: ( ( rule__SawToothOscillator__FrequencyAssignment_4 ) )
            // InternalSynthesizer.g:2214:2: ( rule__SawToothOscillator__FrequencyAssignment_4 )
            {
             before(grammarAccess.getSawToothOscillatorAccess().getFrequencyAssignment_4()); 
            // InternalSynthesizer.g:2215:2: ( rule__SawToothOscillator__FrequencyAssignment_4 )
            // InternalSynthesizer.g:2215:3: rule__SawToothOscillator__FrequencyAssignment_4
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
    // InternalSynthesizer.g:2223:1: rule__SawToothOscillator__Group__5 : rule__SawToothOscillator__Group__5__Impl rule__SawToothOscillator__Group__6 ;
    public final void rule__SawToothOscillator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2227:1: ( rule__SawToothOscillator__Group__5__Impl rule__SawToothOscillator__Group__6 )
            // InternalSynthesizer.g:2228:2: rule__SawToothOscillator__Group__5__Impl rule__SawToothOscillator__Group__6
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
    // InternalSynthesizer.g:2235:1: rule__SawToothOscillator__Group__5__Impl : ( 'amplitude' ) ;
    public final void rule__SawToothOscillator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2239:1: ( ( 'amplitude' ) )
            // InternalSynthesizer.g:2240:1: ( 'amplitude' )
            {
            // InternalSynthesizer.g:2240:1: ( 'amplitude' )
            // InternalSynthesizer.g:2241:2: 'amplitude'
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
    // InternalSynthesizer.g:2250:1: rule__SawToothOscillator__Group__6 : rule__SawToothOscillator__Group__6__Impl rule__SawToothOscillator__Group__7 ;
    public final void rule__SawToothOscillator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2254:1: ( rule__SawToothOscillator__Group__6__Impl rule__SawToothOscillator__Group__7 )
            // InternalSynthesizer.g:2255:2: rule__SawToothOscillator__Group__6__Impl rule__SawToothOscillator__Group__7
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
    // InternalSynthesizer.g:2262:1: rule__SawToothOscillator__Group__6__Impl : ( ( rule__SawToothOscillator__AmplitudeAssignment_6 ) ) ;
    public final void rule__SawToothOscillator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2266:1: ( ( ( rule__SawToothOscillator__AmplitudeAssignment_6 ) ) )
            // InternalSynthesizer.g:2267:1: ( ( rule__SawToothOscillator__AmplitudeAssignment_6 ) )
            {
            // InternalSynthesizer.g:2267:1: ( ( rule__SawToothOscillator__AmplitudeAssignment_6 ) )
            // InternalSynthesizer.g:2268:2: ( rule__SawToothOscillator__AmplitudeAssignment_6 )
            {
             before(grammarAccess.getSawToothOscillatorAccess().getAmplitudeAssignment_6()); 
            // InternalSynthesizer.g:2269:2: ( rule__SawToothOscillator__AmplitudeAssignment_6 )
            // InternalSynthesizer.g:2269:3: rule__SawToothOscillator__AmplitudeAssignment_6
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
    // InternalSynthesizer.g:2277:1: rule__SawToothOscillator__Group__7 : rule__SawToothOscillator__Group__7__Impl ;
    public final void rule__SawToothOscillator__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2281:1: ( rule__SawToothOscillator__Group__7__Impl )
            // InternalSynthesizer.g:2282:2: rule__SawToothOscillator__Group__7__Impl
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
    // InternalSynthesizer.g:2288:1: rule__SawToothOscillator__Group__7__Impl : ( ')' ) ;
    public final void rule__SawToothOscillator__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2292:1: ( ( ')' ) )
            // InternalSynthesizer.g:2293:1: ( ')' )
            {
            // InternalSynthesizer.g:2293:1: ( ')' )
            // InternalSynthesizer.g:2294:2: ')'
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
    // InternalSynthesizer.g:2304:1: rule__SineOscillator__Group__0 : rule__SineOscillator__Group__0__Impl rule__SineOscillator__Group__1 ;
    public final void rule__SineOscillator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2308:1: ( rule__SineOscillator__Group__0__Impl rule__SineOscillator__Group__1 )
            // InternalSynthesizer.g:2309:2: rule__SineOscillator__Group__0__Impl rule__SineOscillator__Group__1
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
    // InternalSynthesizer.g:2316:1: rule__SineOscillator__Group__0__Impl : ( 'sineOscillator' ) ;
    public final void rule__SineOscillator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2320:1: ( ( 'sineOscillator' ) )
            // InternalSynthesizer.g:2321:1: ( 'sineOscillator' )
            {
            // InternalSynthesizer.g:2321:1: ( 'sineOscillator' )
            // InternalSynthesizer.g:2322:2: 'sineOscillator'
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
    // InternalSynthesizer.g:2331:1: rule__SineOscillator__Group__1 : rule__SineOscillator__Group__1__Impl rule__SineOscillator__Group__2 ;
    public final void rule__SineOscillator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2335:1: ( rule__SineOscillator__Group__1__Impl rule__SineOscillator__Group__2 )
            // InternalSynthesizer.g:2336:2: rule__SineOscillator__Group__1__Impl rule__SineOscillator__Group__2
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
    // InternalSynthesizer.g:2343:1: rule__SineOscillator__Group__1__Impl : ( ( rule__SineOscillator__NameAssignment_1 ) ) ;
    public final void rule__SineOscillator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2347:1: ( ( ( rule__SineOscillator__NameAssignment_1 ) ) )
            // InternalSynthesizer.g:2348:1: ( ( rule__SineOscillator__NameAssignment_1 ) )
            {
            // InternalSynthesizer.g:2348:1: ( ( rule__SineOscillator__NameAssignment_1 ) )
            // InternalSynthesizer.g:2349:2: ( rule__SineOscillator__NameAssignment_1 )
            {
             before(grammarAccess.getSineOscillatorAccess().getNameAssignment_1()); 
            // InternalSynthesizer.g:2350:2: ( rule__SineOscillator__NameAssignment_1 )
            // InternalSynthesizer.g:2350:3: rule__SineOscillator__NameAssignment_1
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
    // InternalSynthesizer.g:2358:1: rule__SineOscillator__Group__2 : rule__SineOscillator__Group__2__Impl rule__SineOscillator__Group__3 ;
    public final void rule__SineOscillator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2362:1: ( rule__SineOscillator__Group__2__Impl rule__SineOscillator__Group__3 )
            // InternalSynthesizer.g:2363:2: rule__SineOscillator__Group__2__Impl rule__SineOscillator__Group__3
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
    // InternalSynthesizer.g:2370:1: rule__SineOscillator__Group__2__Impl : ( '(' ) ;
    public final void rule__SineOscillator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2374:1: ( ( '(' ) )
            // InternalSynthesizer.g:2375:1: ( '(' )
            {
            // InternalSynthesizer.g:2375:1: ( '(' )
            // InternalSynthesizer.g:2376:2: '('
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
    // InternalSynthesizer.g:2385:1: rule__SineOscillator__Group__3 : rule__SineOscillator__Group__3__Impl rule__SineOscillator__Group__4 ;
    public final void rule__SineOscillator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2389:1: ( rule__SineOscillator__Group__3__Impl rule__SineOscillator__Group__4 )
            // InternalSynthesizer.g:2390:2: rule__SineOscillator__Group__3__Impl rule__SineOscillator__Group__4
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
    // InternalSynthesizer.g:2397:1: rule__SineOscillator__Group__3__Impl : ( 'frequency' ) ;
    public final void rule__SineOscillator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2401:1: ( ( 'frequency' ) )
            // InternalSynthesizer.g:2402:1: ( 'frequency' )
            {
            // InternalSynthesizer.g:2402:1: ( 'frequency' )
            // InternalSynthesizer.g:2403:2: 'frequency'
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
    // InternalSynthesizer.g:2412:1: rule__SineOscillator__Group__4 : rule__SineOscillator__Group__4__Impl rule__SineOscillator__Group__5 ;
    public final void rule__SineOscillator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2416:1: ( rule__SineOscillator__Group__4__Impl rule__SineOscillator__Group__5 )
            // InternalSynthesizer.g:2417:2: rule__SineOscillator__Group__4__Impl rule__SineOscillator__Group__5
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
    // InternalSynthesizer.g:2424:1: rule__SineOscillator__Group__4__Impl : ( ( rule__SineOscillator__FrequencyAssignment_4 ) ) ;
    public final void rule__SineOscillator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2428:1: ( ( ( rule__SineOscillator__FrequencyAssignment_4 ) ) )
            // InternalSynthesizer.g:2429:1: ( ( rule__SineOscillator__FrequencyAssignment_4 ) )
            {
            // InternalSynthesizer.g:2429:1: ( ( rule__SineOscillator__FrequencyAssignment_4 ) )
            // InternalSynthesizer.g:2430:2: ( rule__SineOscillator__FrequencyAssignment_4 )
            {
             before(grammarAccess.getSineOscillatorAccess().getFrequencyAssignment_4()); 
            // InternalSynthesizer.g:2431:2: ( rule__SineOscillator__FrequencyAssignment_4 )
            // InternalSynthesizer.g:2431:3: rule__SineOscillator__FrequencyAssignment_4
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
    // InternalSynthesizer.g:2439:1: rule__SineOscillator__Group__5 : rule__SineOscillator__Group__5__Impl rule__SineOscillator__Group__6 ;
    public final void rule__SineOscillator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2443:1: ( rule__SineOscillator__Group__5__Impl rule__SineOscillator__Group__6 )
            // InternalSynthesizer.g:2444:2: rule__SineOscillator__Group__5__Impl rule__SineOscillator__Group__6
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
    // InternalSynthesizer.g:2451:1: rule__SineOscillator__Group__5__Impl : ( 'amplitude' ) ;
    public final void rule__SineOscillator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2455:1: ( ( 'amplitude' ) )
            // InternalSynthesizer.g:2456:1: ( 'amplitude' )
            {
            // InternalSynthesizer.g:2456:1: ( 'amplitude' )
            // InternalSynthesizer.g:2457:2: 'amplitude'
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
    // InternalSynthesizer.g:2466:1: rule__SineOscillator__Group__6 : rule__SineOscillator__Group__6__Impl rule__SineOscillator__Group__7 ;
    public final void rule__SineOscillator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2470:1: ( rule__SineOscillator__Group__6__Impl rule__SineOscillator__Group__7 )
            // InternalSynthesizer.g:2471:2: rule__SineOscillator__Group__6__Impl rule__SineOscillator__Group__7
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
    // InternalSynthesizer.g:2478:1: rule__SineOscillator__Group__6__Impl : ( ( rule__SineOscillator__AmplitudeAssignment_6 ) ) ;
    public final void rule__SineOscillator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2482:1: ( ( ( rule__SineOscillator__AmplitudeAssignment_6 ) ) )
            // InternalSynthesizer.g:2483:1: ( ( rule__SineOscillator__AmplitudeAssignment_6 ) )
            {
            // InternalSynthesizer.g:2483:1: ( ( rule__SineOscillator__AmplitudeAssignment_6 ) )
            // InternalSynthesizer.g:2484:2: ( rule__SineOscillator__AmplitudeAssignment_6 )
            {
             before(grammarAccess.getSineOscillatorAccess().getAmplitudeAssignment_6()); 
            // InternalSynthesizer.g:2485:2: ( rule__SineOscillator__AmplitudeAssignment_6 )
            // InternalSynthesizer.g:2485:3: rule__SineOscillator__AmplitudeAssignment_6
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
    // InternalSynthesizer.g:2493:1: rule__SineOscillator__Group__7 : rule__SineOscillator__Group__7__Impl ;
    public final void rule__SineOscillator__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2497:1: ( rule__SineOscillator__Group__7__Impl )
            // InternalSynthesizer.g:2498:2: rule__SineOscillator__Group__7__Impl
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
    // InternalSynthesizer.g:2504:1: rule__SineOscillator__Group__7__Impl : ( ')' ) ;
    public final void rule__SineOscillator__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2508:1: ( ( ')' ) )
            // InternalSynthesizer.g:2509:1: ( ')' )
            {
            // InternalSynthesizer.g:2509:1: ( ')' )
            // InternalSynthesizer.g:2510:2: ')'
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
    // InternalSynthesizer.g:2520:1: rule__TriangleOscillator__Group__0 : rule__TriangleOscillator__Group__0__Impl rule__TriangleOscillator__Group__1 ;
    public final void rule__TriangleOscillator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2524:1: ( rule__TriangleOscillator__Group__0__Impl rule__TriangleOscillator__Group__1 )
            // InternalSynthesizer.g:2525:2: rule__TriangleOscillator__Group__0__Impl rule__TriangleOscillator__Group__1
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
    // InternalSynthesizer.g:2532:1: rule__TriangleOscillator__Group__0__Impl : ( 'triangleOscillator' ) ;
    public final void rule__TriangleOscillator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2536:1: ( ( 'triangleOscillator' ) )
            // InternalSynthesizer.g:2537:1: ( 'triangleOscillator' )
            {
            // InternalSynthesizer.g:2537:1: ( 'triangleOscillator' )
            // InternalSynthesizer.g:2538:2: 'triangleOscillator'
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
    // InternalSynthesizer.g:2547:1: rule__TriangleOscillator__Group__1 : rule__TriangleOscillator__Group__1__Impl rule__TriangleOscillator__Group__2 ;
    public final void rule__TriangleOscillator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2551:1: ( rule__TriangleOscillator__Group__1__Impl rule__TriangleOscillator__Group__2 )
            // InternalSynthesizer.g:2552:2: rule__TriangleOscillator__Group__1__Impl rule__TriangleOscillator__Group__2
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
    // InternalSynthesizer.g:2559:1: rule__TriangleOscillator__Group__1__Impl : ( ( rule__TriangleOscillator__NameAssignment_1 ) ) ;
    public final void rule__TriangleOscillator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2563:1: ( ( ( rule__TriangleOscillator__NameAssignment_1 ) ) )
            // InternalSynthesizer.g:2564:1: ( ( rule__TriangleOscillator__NameAssignment_1 ) )
            {
            // InternalSynthesizer.g:2564:1: ( ( rule__TriangleOscillator__NameAssignment_1 ) )
            // InternalSynthesizer.g:2565:2: ( rule__TriangleOscillator__NameAssignment_1 )
            {
             before(grammarAccess.getTriangleOscillatorAccess().getNameAssignment_1()); 
            // InternalSynthesizer.g:2566:2: ( rule__TriangleOscillator__NameAssignment_1 )
            // InternalSynthesizer.g:2566:3: rule__TriangleOscillator__NameAssignment_1
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
    // InternalSynthesizer.g:2574:1: rule__TriangleOscillator__Group__2 : rule__TriangleOscillator__Group__2__Impl rule__TriangleOscillator__Group__3 ;
    public final void rule__TriangleOscillator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2578:1: ( rule__TriangleOscillator__Group__2__Impl rule__TriangleOscillator__Group__3 )
            // InternalSynthesizer.g:2579:2: rule__TriangleOscillator__Group__2__Impl rule__TriangleOscillator__Group__3
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
    // InternalSynthesizer.g:2586:1: rule__TriangleOscillator__Group__2__Impl : ( '(' ) ;
    public final void rule__TriangleOscillator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2590:1: ( ( '(' ) )
            // InternalSynthesizer.g:2591:1: ( '(' )
            {
            // InternalSynthesizer.g:2591:1: ( '(' )
            // InternalSynthesizer.g:2592:2: '('
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
    // InternalSynthesizer.g:2601:1: rule__TriangleOscillator__Group__3 : rule__TriangleOscillator__Group__3__Impl rule__TriangleOscillator__Group__4 ;
    public final void rule__TriangleOscillator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2605:1: ( rule__TriangleOscillator__Group__3__Impl rule__TriangleOscillator__Group__4 )
            // InternalSynthesizer.g:2606:2: rule__TriangleOscillator__Group__3__Impl rule__TriangleOscillator__Group__4
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
    // InternalSynthesizer.g:2613:1: rule__TriangleOscillator__Group__3__Impl : ( 'frequency' ) ;
    public final void rule__TriangleOscillator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2617:1: ( ( 'frequency' ) )
            // InternalSynthesizer.g:2618:1: ( 'frequency' )
            {
            // InternalSynthesizer.g:2618:1: ( 'frequency' )
            // InternalSynthesizer.g:2619:2: 'frequency'
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
    // InternalSynthesizer.g:2628:1: rule__TriangleOscillator__Group__4 : rule__TriangleOscillator__Group__4__Impl rule__TriangleOscillator__Group__5 ;
    public final void rule__TriangleOscillator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2632:1: ( rule__TriangleOscillator__Group__4__Impl rule__TriangleOscillator__Group__5 )
            // InternalSynthesizer.g:2633:2: rule__TriangleOscillator__Group__4__Impl rule__TriangleOscillator__Group__5
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
    // InternalSynthesizer.g:2640:1: rule__TriangleOscillator__Group__4__Impl : ( ( rule__TriangleOscillator__FrequencyAssignment_4 ) ) ;
    public final void rule__TriangleOscillator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2644:1: ( ( ( rule__TriangleOscillator__FrequencyAssignment_4 ) ) )
            // InternalSynthesizer.g:2645:1: ( ( rule__TriangleOscillator__FrequencyAssignment_4 ) )
            {
            // InternalSynthesizer.g:2645:1: ( ( rule__TriangleOscillator__FrequencyAssignment_4 ) )
            // InternalSynthesizer.g:2646:2: ( rule__TriangleOscillator__FrequencyAssignment_4 )
            {
             before(grammarAccess.getTriangleOscillatorAccess().getFrequencyAssignment_4()); 
            // InternalSynthesizer.g:2647:2: ( rule__TriangleOscillator__FrequencyAssignment_4 )
            // InternalSynthesizer.g:2647:3: rule__TriangleOscillator__FrequencyAssignment_4
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
    // InternalSynthesizer.g:2655:1: rule__TriangleOscillator__Group__5 : rule__TriangleOscillator__Group__5__Impl rule__TriangleOscillator__Group__6 ;
    public final void rule__TriangleOscillator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2659:1: ( rule__TriangleOscillator__Group__5__Impl rule__TriangleOscillator__Group__6 )
            // InternalSynthesizer.g:2660:2: rule__TriangleOscillator__Group__5__Impl rule__TriangleOscillator__Group__6
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
    // InternalSynthesizer.g:2667:1: rule__TriangleOscillator__Group__5__Impl : ( 'amplitude' ) ;
    public final void rule__TriangleOscillator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2671:1: ( ( 'amplitude' ) )
            // InternalSynthesizer.g:2672:1: ( 'amplitude' )
            {
            // InternalSynthesizer.g:2672:1: ( 'amplitude' )
            // InternalSynthesizer.g:2673:2: 'amplitude'
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
    // InternalSynthesizer.g:2682:1: rule__TriangleOscillator__Group__6 : rule__TriangleOscillator__Group__6__Impl rule__TriangleOscillator__Group__7 ;
    public final void rule__TriangleOscillator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2686:1: ( rule__TriangleOscillator__Group__6__Impl rule__TriangleOscillator__Group__7 )
            // InternalSynthesizer.g:2687:2: rule__TriangleOscillator__Group__6__Impl rule__TriangleOscillator__Group__7
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
    // InternalSynthesizer.g:2694:1: rule__TriangleOscillator__Group__6__Impl : ( ( rule__TriangleOscillator__AmplitudeAssignment_6 ) ) ;
    public final void rule__TriangleOscillator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2698:1: ( ( ( rule__TriangleOscillator__AmplitudeAssignment_6 ) ) )
            // InternalSynthesizer.g:2699:1: ( ( rule__TriangleOscillator__AmplitudeAssignment_6 ) )
            {
            // InternalSynthesizer.g:2699:1: ( ( rule__TriangleOscillator__AmplitudeAssignment_6 ) )
            // InternalSynthesizer.g:2700:2: ( rule__TriangleOscillator__AmplitudeAssignment_6 )
            {
             before(grammarAccess.getTriangleOscillatorAccess().getAmplitudeAssignment_6()); 
            // InternalSynthesizer.g:2701:2: ( rule__TriangleOscillator__AmplitudeAssignment_6 )
            // InternalSynthesizer.g:2701:3: rule__TriangleOscillator__AmplitudeAssignment_6
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
    // InternalSynthesizer.g:2709:1: rule__TriangleOscillator__Group__7 : rule__TriangleOscillator__Group__7__Impl ;
    public final void rule__TriangleOscillator__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2713:1: ( rule__TriangleOscillator__Group__7__Impl )
            // InternalSynthesizer.g:2714:2: rule__TriangleOscillator__Group__7__Impl
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
    // InternalSynthesizer.g:2720:1: rule__TriangleOscillator__Group__7__Impl : ( ')' ) ;
    public final void rule__TriangleOscillator__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2724:1: ( ( ')' ) )
            // InternalSynthesizer.g:2725:1: ( ')' )
            {
            // InternalSynthesizer.g:2725:1: ( ')' )
            // InternalSynthesizer.g:2726:2: ')'
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
    // InternalSynthesizer.g:2736:1: rule__SquareOscillator__Group__0 : rule__SquareOscillator__Group__0__Impl rule__SquareOscillator__Group__1 ;
    public final void rule__SquareOscillator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2740:1: ( rule__SquareOscillator__Group__0__Impl rule__SquareOscillator__Group__1 )
            // InternalSynthesizer.g:2741:2: rule__SquareOscillator__Group__0__Impl rule__SquareOscillator__Group__1
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
    // InternalSynthesizer.g:2748:1: rule__SquareOscillator__Group__0__Impl : ( 'squareOscillator' ) ;
    public final void rule__SquareOscillator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2752:1: ( ( 'squareOscillator' ) )
            // InternalSynthesizer.g:2753:1: ( 'squareOscillator' )
            {
            // InternalSynthesizer.g:2753:1: ( 'squareOscillator' )
            // InternalSynthesizer.g:2754:2: 'squareOscillator'
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
    // InternalSynthesizer.g:2763:1: rule__SquareOscillator__Group__1 : rule__SquareOscillator__Group__1__Impl rule__SquareOscillator__Group__2 ;
    public final void rule__SquareOscillator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2767:1: ( rule__SquareOscillator__Group__1__Impl rule__SquareOscillator__Group__2 )
            // InternalSynthesizer.g:2768:2: rule__SquareOscillator__Group__1__Impl rule__SquareOscillator__Group__2
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
    // InternalSynthesizer.g:2775:1: rule__SquareOscillator__Group__1__Impl : ( ( rule__SquareOscillator__NameAssignment_1 ) ) ;
    public final void rule__SquareOscillator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2779:1: ( ( ( rule__SquareOscillator__NameAssignment_1 ) ) )
            // InternalSynthesizer.g:2780:1: ( ( rule__SquareOscillator__NameAssignment_1 ) )
            {
            // InternalSynthesizer.g:2780:1: ( ( rule__SquareOscillator__NameAssignment_1 ) )
            // InternalSynthesizer.g:2781:2: ( rule__SquareOscillator__NameAssignment_1 )
            {
             before(grammarAccess.getSquareOscillatorAccess().getNameAssignment_1()); 
            // InternalSynthesizer.g:2782:2: ( rule__SquareOscillator__NameAssignment_1 )
            // InternalSynthesizer.g:2782:3: rule__SquareOscillator__NameAssignment_1
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
    // InternalSynthesizer.g:2790:1: rule__SquareOscillator__Group__2 : rule__SquareOscillator__Group__2__Impl rule__SquareOscillator__Group__3 ;
    public final void rule__SquareOscillator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2794:1: ( rule__SquareOscillator__Group__2__Impl rule__SquareOscillator__Group__3 )
            // InternalSynthesizer.g:2795:2: rule__SquareOscillator__Group__2__Impl rule__SquareOscillator__Group__3
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
    // InternalSynthesizer.g:2802:1: rule__SquareOscillator__Group__2__Impl : ( '(' ) ;
    public final void rule__SquareOscillator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2806:1: ( ( '(' ) )
            // InternalSynthesizer.g:2807:1: ( '(' )
            {
            // InternalSynthesizer.g:2807:1: ( '(' )
            // InternalSynthesizer.g:2808:2: '('
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
    // InternalSynthesizer.g:2817:1: rule__SquareOscillator__Group__3 : rule__SquareOscillator__Group__3__Impl rule__SquareOscillator__Group__4 ;
    public final void rule__SquareOscillator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2821:1: ( rule__SquareOscillator__Group__3__Impl rule__SquareOscillator__Group__4 )
            // InternalSynthesizer.g:2822:2: rule__SquareOscillator__Group__3__Impl rule__SquareOscillator__Group__4
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
    // InternalSynthesizer.g:2829:1: rule__SquareOscillator__Group__3__Impl : ( 'frequency' ) ;
    public final void rule__SquareOscillator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2833:1: ( ( 'frequency' ) )
            // InternalSynthesizer.g:2834:1: ( 'frequency' )
            {
            // InternalSynthesizer.g:2834:1: ( 'frequency' )
            // InternalSynthesizer.g:2835:2: 'frequency'
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
    // InternalSynthesizer.g:2844:1: rule__SquareOscillator__Group__4 : rule__SquareOscillator__Group__4__Impl rule__SquareOscillator__Group__5 ;
    public final void rule__SquareOscillator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2848:1: ( rule__SquareOscillator__Group__4__Impl rule__SquareOscillator__Group__5 )
            // InternalSynthesizer.g:2849:2: rule__SquareOscillator__Group__4__Impl rule__SquareOscillator__Group__5
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
    // InternalSynthesizer.g:2856:1: rule__SquareOscillator__Group__4__Impl : ( ( rule__SquareOscillator__FrequencyAssignment_4 ) ) ;
    public final void rule__SquareOscillator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2860:1: ( ( ( rule__SquareOscillator__FrequencyAssignment_4 ) ) )
            // InternalSynthesizer.g:2861:1: ( ( rule__SquareOscillator__FrequencyAssignment_4 ) )
            {
            // InternalSynthesizer.g:2861:1: ( ( rule__SquareOscillator__FrequencyAssignment_4 ) )
            // InternalSynthesizer.g:2862:2: ( rule__SquareOscillator__FrequencyAssignment_4 )
            {
             before(grammarAccess.getSquareOscillatorAccess().getFrequencyAssignment_4()); 
            // InternalSynthesizer.g:2863:2: ( rule__SquareOscillator__FrequencyAssignment_4 )
            // InternalSynthesizer.g:2863:3: rule__SquareOscillator__FrequencyAssignment_4
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
    // InternalSynthesizer.g:2871:1: rule__SquareOscillator__Group__5 : rule__SquareOscillator__Group__5__Impl rule__SquareOscillator__Group__6 ;
    public final void rule__SquareOscillator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2875:1: ( rule__SquareOscillator__Group__5__Impl rule__SquareOscillator__Group__6 )
            // InternalSynthesizer.g:2876:2: rule__SquareOscillator__Group__5__Impl rule__SquareOscillator__Group__6
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
    // InternalSynthesizer.g:2883:1: rule__SquareOscillator__Group__5__Impl : ( 'amplitude' ) ;
    public final void rule__SquareOscillator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2887:1: ( ( 'amplitude' ) )
            // InternalSynthesizer.g:2888:1: ( 'amplitude' )
            {
            // InternalSynthesizer.g:2888:1: ( 'amplitude' )
            // InternalSynthesizer.g:2889:2: 'amplitude'
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
    // InternalSynthesizer.g:2898:1: rule__SquareOscillator__Group__6 : rule__SquareOscillator__Group__6__Impl rule__SquareOscillator__Group__7 ;
    public final void rule__SquareOscillator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2902:1: ( rule__SquareOscillator__Group__6__Impl rule__SquareOscillator__Group__7 )
            // InternalSynthesizer.g:2903:2: rule__SquareOscillator__Group__6__Impl rule__SquareOscillator__Group__7
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
    // InternalSynthesizer.g:2910:1: rule__SquareOscillator__Group__6__Impl : ( ( rule__SquareOscillator__AmplitudeAssignment_6 ) ) ;
    public final void rule__SquareOscillator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2914:1: ( ( ( rule__SquareOscillator__AmplitudeAssignment_6 ) ) )
            // InternalSynthesizer.g:2915:1: ( ( rule__SquareOscillator__AmplitudeAssignment_6 ) )
            {
            // InternalSynthesizer.g:2915:1: ( ( rule__SquareOscillator__AmplitudeAssignment_6 ) )
            // InternalSynthesizer.g:2916:2: ( rule__SquareOscillator__AmplitudeAssignment_6 )
            {
             before(grammarAccess.getSquareOscillatorAccess().getAmplitudeAssignment_6()); 
            // InternalSynthesizer.g:2917:2: ( rule__SquareOscillator__AmplitudeAssignment_6 )
            // InternalSynthesizer.g:2917:3: rule__SquareOscillator__AmplitudeAssignment_6
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
    // InternalSynthesizer.g:2925:1: rule__SquareOscillator__Group__7 : rule__SquareOscillator__Group__7__Impl ;
    public final void rule__SquareOscillator__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2929:1: ( rule__SquareOscillator__Group__7__Impl )
            // InternalSynthesizer.g:2930:2: rule__SquareOscillator__Group__7__Impl
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
    // InternalSynthesizer.g:2936:1: rule__SquareOscillator__Group__7__Impl : ( ')' ) ;
    public final void rule__SquareOscillator__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2940:1: ( ( ')' ) )
            // InternalSynthesizer.g:2941:1: ( ')' )
            {
            // InternalSynthesizer.g:2941:1: ( ')' )
            // InternalSynthesizer.g:2942:2: ')'
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
    // InternalSynthesizer.g:2952:1: rule__PulseOscillator__Group__0 : rule__PulseOscillator__Group__0__Impl rule__PulseOscillator__Group__1 ;
    public final void rule__PulseOscillator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2956:1: ( rule__PulseOscillator__Group__0__Impl rule__PulseOscillator__Group__1 )
            // InternalSynthesizer.g:2957:2: rule__PulseOscillator__Group__0__Impl rule__PulseOscillator__Group__1
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
    // InternalSynthesizer.g:2964:1: rule__PulseOscillator__Group__0__Impl : ( 'pulseOscillator' ) ;
    public final void rule__PulseOscillator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2968:1: ( ( 'pulseOscillator' ) )
            // InternalSynthesizer.g:2969:1: ( 'pulseOscillator' )
            {
            // InternalSynthesizer.g:2969:1: ( 'pulseOscillator' )
            // InternalSynthesizer.g:2970:2: 'pulseOscillator'
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
    // InternalSynthesizer.g:2979:1: rule__PulseOscillator__Group__1 : rule__PulseOscillator__Group__1__Impl rule__PulseOscillator__Group__2 ;
    public final void rule__PulseOscillator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2983:1: ( rule__PulseOscillator__Group__1__Impl rule__PulseOscillator__Group__2 )
            // InternalSynthesizer.g:2984:2: rule__PulseOscillator__Group__1__Impl rule__PulseOscillator__Group__2
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
    // InternalSynthesizer.g:2991:1: rule__PulseOscillator__Group__1__Impl : ( ( rule__PulseOscillator__NameAssignment_1 ) ) ;
    public final void rule__PulseOscillator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:2995:1: ( ( ( rule__PulseOscillator__NameAssignment_1 ) ) )
            // InternalSynthesizer.g:2996:1: ( ( rule__PulseOscillator__NameAssignment_1 ) )
            {
            // InternalSynthesizer.g:2996:1: ( ( rule__PulseOscillator__NameAssignment_1 ) )
            // InternalSynthesizer.g:2997:2: ( rule__PulseOscillator__NameAssignment_1 )
            {
             before(grammarAccess.getPulseOscillatorAccess().getNameAssignment_1()); 
            // InternalSynthesizer.g:2998:2: ( rule__PulseOscillator__NameAssignment_1 )
            // InternalSynthesizer.g:2998:3: rule__PulseOscillator__NameAssignment_1
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
    // InternalSynthesizer.g:3006:1: rule__PulseOscillator__Group__2 : rule__PulseOscillator__Group__2__Impl rule__PulseOscillator__Group__3 ;
    public final void rule__PulseOscillator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3010:1: ( rule__PulseOscillator__Group__2__Impl rule__PulseOscillator__Group__3 )
            // InternalSynthesizer.g:3011:2: rule__PulseOscillator__Group__2__Impl rule__PulseOscillator__Group__3
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
    // InternalSynthesizer.g:3018:1: rule__PulseOscillator__Group__2__Impl : ( '(' ) ;
    public final void rule__PulseOscillator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3022:1: ( ( '(' ) )
            // InternalSynthesizer.g:3023:1: ( '(' )
            {
            // InternalSynthesizer.g:3023:1: ( '(' )
            // InternalSynthesizer.g:3024:2: '('
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
    // InternalSynthesizer.g:3033:1: rule__PulseOscillator__Group__3 : rule__PulseOscillator__Group__3__Impl rule__PulseOscillator__Group__4 ;
    public final void rule__PulseOscillator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3037:1: ( rule__PulseOscillator__Group__3__Impl rule__PulseOscillator__Group__4 )
            // InternalSynthesizer.g:3038:2: rule__PulseOscillator__Group__3__Impl rule__PulseOscillator__Group__4
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
    // InternalSynthesizer.g:3045:1: rule__PulseOscillator__Group__3__Impl : ( 'frequency' ) ;
    public final void rule__PulseOscillator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3049:1: ( ( 'frequency' ) )
            // InternalSynthesizer.g:3050:1: ( 'frequency' )
            {
            // InternalSynthesizer.g:3050:1: ( 'frequency' )
            // InternalSynthesizer.g:3051:2: 'frequency'
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
    // InternalSynthesizer.g:3060:1: rule__PulseOscillator__Group__4 : rule__PulseOscillator__Group__4__Impl rule__PulseOscillator__Group__5 ;
    public final void rule__PulseOscillator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3064:1: ( rule__PulseOscillator__Group__4__Impl rule__PulseOscillator__Group__5 )
            // InternalSynthesizer.g:3065:2: rule__PulseOscillator__Group__4__Impl rule__PulseOscillator__Group__5
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
    // InternalSynthesizer.g:3072:1: rule__PulseOscillator__Group__4__Impl : ( ( rule__PulseOscillator__FrequencyAssignment_4 ) ) ;
    public final void rule__PulseOscillator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3076:1: ( ( ( rule__PulseOscillator__FrequencyAssignment_4 ) ) )
            // InternalSynthesizer.g:3077:1: ( ( rule__PulseOscillator__FrequencyAssignment_4 ) )
            {
            // InternalSynthesizer.g:3077:1: ( ( rule__PulseOscillator__FrequencyAssignment_4 ) )
            // InternalSynthesizer.g:3078:2: ( rule__PulseOscillator__FrequencyAssignment_4 )
            {
             before(grammarAccess.getPulseOscillatorAccess().getFrequencyAssignment_4()); 
            // InternalSynthesizer.g:3079:2: ( rule__PulseOscillator__FrequencyAssignment_4 )
            // InternalSynthesizer.g:3079:3: rule__PulseOscillator__FrequencyAssignment_4
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
    // InternalSynthesizer.g:3087:1: rule__PulseOscillator__Group__5 : rule__PulseOscillator__Group__5__Impl rule__PulseOscillator__Group__6 ;
    public final void rule__PulseOscillator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3091:1: ( rule__PulseOscillator__Group__5__Impl rule__PulseOscillator__Group__6 )
            // InternalSynthesizer.g:3092:2: rule__PulseOscillator__Group__5__Impl rule__PulseOscillator__Group__6
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
    // InternalSynthesizer.g:3099:1: rule__PulseOscillator__Group__5__Impl : ( 'amplitude' ) ;
    public final void rule__PulseOscillator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3103:1: ( ( 'amplitude' ) )
            // InternalSynthesizer.g:3104:1: ( 'amplitude' )
            {
            // InternalSynthesizer.g:3104:1: ( 'amplitude' )
            // InternalSynthesizer.g:3105:2: 'amplitude'
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
    // InternalSynthesizer.g:3114:1: rule__PulseOscillator__Group__6 : rule__PulseOscillator__Group__6__Impl rule__PulseOscillator__Group__7 ;
    public final void rule__PulseOscillator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3118:1: ( rule__PulseOscillator__Group__6__Impl rule__PulseOscillator__Group__7 )
            // InternalSynthesizer.g:3119:2: rule__PulseOscillator__Group__6__Impl rule__PulseOscillator__Group__7
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
    // InternalSynthesizer.g:3126:1: rule__PulseOscillator__Group__6__Impl : ( ( rule__PulseOscillator__AmplitudeAssignment_6 ) ) ;
    public final void rule__PulseOscillator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3130:1: ( ( ( rule__PulseOscillator__AmplitudeAssignment_6 ) ) )
            // InternalSynthesizer.g:3131:1: ( ( rule__PulseOscillator__AmplitudeAssignment_6 ) )
            {
            // InternalSynthesizer.g:3131:1: ( ( rule__PulseOscillator__AmplitudeAssignment_6 ) )
            // InternalSynthesizer.g:3132:2: ( rule__PulseOscillator__AmplitudeAssignment_6 )
            {
             before(grammarAccess.getPulseOscillatorAccess().getAmplitudeAssignment_6()); 
            // InternalSynthesizer.g:3133:2: ( rule__PulseOscillator__AmplitudeAssignment_6 )
            // InternalSynthesizer.g:3133:3: rule__PulseOscillator__AmplitudeAssignment_6
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
    // InternalSynthesizer.g:3141:1: rule__PulseOscillator__Group__7 : rule__PulseOscillator__Group__7__Impl ;
    public final void rule__PulseOscillator__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3145:1: ( rule__PulseOscillator__Group__7__Impl )
            // InternalSynthesizer.g:3146:2: rule__PulseOscillator__Group__7__Impl
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
    // InternalSynthesizer.g:3152:1: rule__PulseOscillator__Group__7__Impl : ( ')' ) ;
    public final void rule__PulseOscillator__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3156:1: ( ( ')' ) )
            // InternalSynthesizer.g:3157:1: ( ')' )
            {
            // InternalSynthesizer.g:3157:1: ( ')' )
            // InternalSynthesizer.g:3158:2: ')'
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


    // $ANTLR start "rule__ImpulseOscillator__Group__0"
    // InternalSynthesizer.g:3168:1: rule__ImpulseOscillator__Group__0 : rule__ImpulseOscillator__Group__0__Impl rule__ImpulseOscillator__Group__1 ;
    public final void rule__ImpulseOscillator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3172:1: ( rule__ImpulseOscillator__Group__0__Impl rule__ImpulseOscillator__Group__1 )
            // InternalSynthesizer.g:3173:2: rule__ImpulseOscillator__Group__0__Impl rule__ImpulseOscillator__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__ImpulseOscillator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImpulseOscillator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpulseOscillator__Group__0"


    // $ANTLR start "rule__ImpulseOscillator__Group__0__Impl"
    // InternalSynthesizer.g:3180:1: rule__ImpulseOscillator__Group__0__Impl : ( 'impulseOscillator' ) ;
    public final void rule__ImpulseOscillator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3184:1: ( ( 'impulseOscillator' ) )
            // InternalSynthesizer.g:3185:1: ( 'impulseOscillator' )
            {
            // InternalSynthesizer.g:3185:1: ( 'impulseOscillator' )
            // InternalSynthesizer.g:3186:2: 'impulseOscillator'
            {
             before(grammarAccess.getImpulseOscillatorAccess().getImpulseOscillatorKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getImpulseOscillatorAccess().getImpulseOscillatorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpulseOscillator__Group__0__Impl"


    // $ANTLR start "rule__ImpulseOscillator__Group__1"
    // InternalSynthesizer.g:3195:1: rule__ImpulseOscillator__Group__1 : rule__ImpulseOscillator__Group__1__Impl rule__ImpulseOscillator__Group__2 ;
    public final void rule__ImpulseOscillator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3199:1: ( rule__ImpulseOscillator__Group__1__Impl rule__ImpulseOscillator__Group__2 )
            // InternalSynthesizer.g:3200:2: rule__ImpulseOscillator__Group__1__Impl rule__ImpulseOscillator__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__ImpulseOscillator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImpulseOscillator__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpulseOscillator__Group__1"


    // $ANTLR start "rule__ImpulseOscillator__Group__1__Impl"
    // InternalSynthesizer.g:3207:1: rule__ImpulseOscillator__Group__1__Impl : ( ( rule__ImpulseOscillator__NameAssignment_1 ) ) ;
    public final void rule__ImpulseOscillator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3211:1: ( ( ( rule__ImpulseOscillator__NameAssignment_1 ) ) )
            // InternalSynthesizer.g:3212:1: ( ( rule__ImpulseOscillator__NameAssignment_1 ) )
            {
            // InternalSynthesizer.g:3212:1: ( ( rule__ImpulseOscillator__NameAssignment_1 ) )
            // InternalSynthesizer.g:3213:2: ( rule__ImpulseOscillator__NameAssignment_1 )
            {
             before(grammarAccess.getImpulseOscillatorAccess().getNameAssignment_1()); 
            // InternalSynthesizer.g:3214:2: ( rule__ImpulseOscillator__NameAssignment_1 )
            // InternalSynthesizer.g:3214:3: rule__ImpulseOscillator__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ImpulseOscillator__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImpulseOscillatorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpulseOscillator__Group__1__Impl"


    // $ANTLR start "rule__ImpulseOscillator__Group__2"
    // InternalSynthesizer.g:3222:1: rule__ImpulseOscillator__Group__2 : rule__ImpulseOscillator__Group__2__Impl rule__ImpulseOscillator__Group__3 ;
    public final void rule__ImpulseOscillator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3226:1: ( rule__ImpulseOscillator__Group__2__Impl rule__ImpulseOscillator__Group__3 )
            // InternalSynthesizer.g:3227:2: rule__ImpulseOscillator__Group__2__Impl rule__ImpulseOscillator__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__ImpulseOscillator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImpulseOscillator__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpulseOscillator__Group__2"


    // $ANTLR start "rule__ImpulseOscillator__Group__2__Impl"
    // InternalSynthesizer.g:3234:1: rule__ImpulseOscillator__Group__2__Impl : ( '(' ) ;
    public final void rule__ImpulseOscillator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3238:1: ( ( '(' ) )
            // InternalSynthesizer.g:3239:1: ( '(' )
            {
            // InternalSynthesizer.g:3239:1: ( '(' )
            // InternalSynthesizer.g:3240:2: '('
            {
             before(grammarAccess.getImpulseOscillatorAccess().getLeftParenthesisKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getImpulseOscillatorAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpulseOscillator__Group__2__Impl"


    // $ANTLR start "rule__ImpulseOscillator__Group__3"
    // InternalSynthesizer.g:3249:1: rule__ImpulseOscillator__Group__3 : rule__ImpulseOscillator__Group__3__Impl rule__ImpulseOscillator__Group__4 ;
    public final void rule__ImpulseOscillator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3253:1: ( rule__ImpulseOscillator__Group__3__Impl rule__ImpulseOscillator__Group__4 )
            // InternalSynthesizer.g:3254:2: rule__ImpulseOscillator__Group__3__Impl rule__ImpulseOscillator__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__ImpulseOscillator__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImpulseOscillator__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpulseOscillator__Group__3"


    // $ANTLR start "rule__ImpulseOscillator__Group__3__Impl"
    // InternalSynthesizer.g:3261:1: rule__ImpulseOscillator__Group__3__Impl : ( 'frequency' ) ;
    public final void rule__ImpulseOscillator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3265:1: ( ( 'frequency' ) )
            // InternalSynthesizer.g:3266:1: ( 'frequency' )
            {
            // InternalSynthesizer.g:3266:1: ( 'frequency' )
            // InternalSynthesizer.g:3267:2: 'frequency'
            {
             before(grammarAccess.getImpulseOscillatorAccess().getFrequencyKeyword_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getImpulseOscillatorAccess().getFrequencyKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpulseOscillator__Group__3__Impl"


    // $ANTLR start "rule__ImpulseOscillator__Group__4"
    // InternalSynthesizer.g:3276:1: rule__ImpulseOscillator__Group__4 : rule__ImpulseOscillator__Group__4__Impl rule__ImpulseOscillator__Group__5 ;
    public final void rule__ImpulseOscillator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3280:1: ( rule__ImpulseOscillator__Group__4__Impl rule__ImpulseOscillator__Group__5 )
            // InternalSynthesizer.g:3281:2: rule__ImpulseOscillator__Group__4__Impl rule__ImpulseOscillator__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__ImpulseOscillator__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImpulseOscillator__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpulseOscillator__Group__4"


    // $ANTLR start "rule__ImpulseOscillator__Group__4__Impl"
    // InternalSynthesizer.g:3288:1: rule__ImpulseOscillator__Group__4__Impl : ( ( rule__ImpulseOscillator__FrequencyAssignment_4 ) ) ;
    public final void rule__ImpulseOscillator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3292:1: ( ( ( rule__ImpulseOscillator__FrequencyAssignment_4 ) ) )
            // InternalSynthesizer.g:3293:1: ( ( rule__ImpulseOscillator__FrequencyAssignment_4 ) )
            {
            // InternalSynthesizer.g:3293:1: ( ( rule__ImpulseOscillator__FrequencyAssignment_4 ) )
            // InternalSynthesizer.g:3294:2: ( rule__ImpulseOscillator__FrequencyAssignment_4 )
            {
             before(grammarAccess.getImpulseOscillatorAccess().getFrequencyAssignment_4()); 
            // InternalSynthesizer.g:3295:2: ( rule__ImpulseOscillator__FrequencyAssignment_4 )
            // InternalSynthesizer.g:3295:3: rule__ImpulseOscillator__FrequencyAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ImpulseOscillator__FrequencyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getImpulseOscillatorAccess().getFrequencyAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpulseOscillator__Group__4__Impl"


    // $ANTLR start "rule__ImpulseOscillator__Group__5"
    // InternalSynthesizer.g:3303:1: rule__ImpulseOscillator__Group__5 : rule__ImpulseOscillator__Group__5__Impl rule__ImpulseOscillator__Group__6 ;
    public final void rule__ImpulseOscillator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3307:1: ( rule__ImpulseOscillator__Group__5__Impl rule__ImpulseOscillator__Group__6 )
            // InternalSynthesizer.g:3308:2: rule__ImpulseOscillator__Group__5__Impl rule__ImpulseOscillator__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__ImpulseOscillator__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImpulseOscillator__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpulseOscillator__Group__5"


    // $ANTLR start "rule__ImpulseOscillator__Group__5__Impl"
    // InternalSynthesizer.g:3315:1: rule__ImpulseOscillator__Group__5__Impl : ( 'amplitude' ) ;
    public final void rule__ImpulseOscillator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3319:1: ( ( 'amplitude' ) )
            // InternalSynthesizer.g:3320:1: ( 'amplitude' )
            {
            // InternalSynthesizer.g:3320:1: ( 'amplitude' )
            // InternalSynthesizer.g:3321:2: 'amplitude'
            {
             before(grammarAccess.getImpulseOscillatorAccess().getAmplitudeKeyword_5()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getImpulseOscillatorAccess().getAmplitudeKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpulseOscillator__Group__5__Impl"


    // $ANTLR start "rule__ImpulseOscillator__Group__6"
    // InternalSynthesizer.g:3330:1: rule__ImpulseOscillator__Group__6 : rule__ImpulseOscillator__Group__6__Impl rule__ImpulseOscillator__Group__7 ;
    public final void rule__ImpulseOscillator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3334:1: ( rule__ImpulseOscillator__Group__6__Impl rule__ImpulseOscillator__Group__7 )
            // InternalSynthesizer.g:3335:2: rule__ImpulseOscillator__Group__6__Impl rule__ImpulseOscillator__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__ImpulseOscillator__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImpulseOscillator__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpulseOscillator__Group__6"


    // $ANTLR start "rule__ImpulseOscillator__Group__6__Impl"
    // InternalSynthesizer.g:3342:1: rule__ImpulseOscillator__Group__6__Impl : ( ( rule__ImpulseOscillator__AmplitudeAssignment_6 ) ) ;
    public final void rule__ImpulseOscillator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3346:1: ( ( ( rule__ImpulseOscillator__AmplitudeAssignment_6 ) ) )
            // InternalSynthesizer.g:3347:1: ( ( rule__ImpulseOscillator__AmplitudeAssignment_6 ) )
            {
            // InternalSynthesizer.g:3347:1: ( ( rule__ImpulseOscillator__AmplitudeAssignment_6 ) )
            // InternalSynthesizer.g:3348:2: ( rule__ImpulseOscillator__AmplitudeAssignment_6 )
            {
             before(grammarAccess.getImpulseOscillatorAccess().getAmplitudeAssignment_6()); 
            // InternalSynthesizer.g:3349:2: ( rule__ImpulseOscillator__AmplitudeAssignment_6 )
            // InternalSynthesizer.g:3349:3: rule__ImpulseOscillator__AmplitudeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ImpulseOscillator__AmplitudeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getImpulseOscillatorAccess().getAmplitudeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpulseOscillator__Group__6__Impl"


    // $ANTLR start "rule__ImpulseOscillator__Group__7"
    // InternalSynthesizer.g:3357:1: rule__ImpulseOscillator__Group__7 : rule__ImpulseOscillator__Group__7__Impl ;
    public final void rule__ImpulseOscillator__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3361:1: ( rule__ImpulseOscillator__Group__7__Impl )
            // InternalSynthesizer.g:3362:2: rule__ImpulseOscillator__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImpulseOscillator__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpulseOscillator__Group__7"


    // $ANTLR start "rule__ImpulseOscillator__Group__7__Impl"
    // InternalSynthesizer.g:3368:1: rule__ImpulseOscillator__Group__7__Impl : ( ')' ) ;
    public final void rule__ImpulseOscillator__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3372:1: ( ( ')' ) )
            // InternalSynthesizer.g:3373:1: ( ')' )
            {
            // InternalSynthesizer.g:3373:1: ( ')' )
            // InternalSynthesizer.g:3374:2: ')'
            {
             before(grammarAccess.getImpulseOscillatorAccess().getRightParenthesisKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getImpulseOscillatorAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpulseOscillator__Group__7__Impl"


    // $ANTLR start "rule__Model__ControlsAssignment_2"
    // InternalSynthesizer.g:3384:1: rule__Model__ControlsAssignment_2 : ( ruleControlElement ) ;
    public final void rule__Model__ControlsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3388:1: ( ( ruleControlElement ) )
            // InternalSynthesizer.g:3389:2: ( ruleControlElement )
            {
            // InternalSynthesizer.g:3389:2: ( ruleControlElement )
            // InternalSynthesizer.g:3390:3: ruleControlElement
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
    // InternalSynthesizer.g:3399:1: rule__Model__SoundsAssignment_4_2 : ( ruleSoundElement ) ;
    public final void rule__Model__SoundsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3403:1: ( ( ruleSoundElement ) )
            // InternalSynthesizer.g:3404:2: ( ruleSoundElement )
            {
            // InternalSynthesizer.g:3404:2: ( ruleSoundElement )
            // InternalSynthesizer.g:3405:3: ruleSoundElement
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
    // InternalSynthesizer.g:3414:1: rule__Model__ConnectionsAssignment_5_2 : ( ruleConnectionElement ) ;
    public final void rule__Model__ConnectionsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3418:1: ( ( ruleConnectionElement ) )
            // InternalSynthesizer.g:3419:2: ( ruleConnectionElement )
            {
            // InternalSynthesizer.g:3419:2: ( ruleConnectionElement )
            // InternalSynthesizer.g:3420:3: ruleConnectionElement
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
    // InternalSynthesizer.g:3429:1: rule__RotaryKnob__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RotaryKnob__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3433:1: ( ( RULE_ID ) )
            // InternalSynthesizer.g:3434:2: ( RULE_ID )
            {
            // InternalSynthesizer.g:3434:2: ( RULE_ID )
            // InternalSynthesizer.g:3435:3: RULE_ID
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
    // InternalSynthesizer.g:3444:1: rule__RotaryKnob__XAssignment_4 : ( RULE_INT ) ;
    public final void rule__RotaryKnob__XAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3448:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:3449:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:3449:2: ( RULE_INT )
            // InternalSynthesizer.g:3450:3: RULE_INT
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
    // InternalSynthesizer.g:3459:1: rule__RotaryKnob__YAssignment_6 : ( RULE_INT ) ;
    public final void rule__RotaryKnob__YAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3463:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:3464:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:3464:2: ( RULE_INT )
            // InternalSynthesizer.g:3465:3: RULE_INT
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
    // InternalSynthesizer.g:3474:1: rule__RotaryKnob__WidthAssignment_8 : ( RULE_INT ) ;
    public final void rule__RotaryKnob__WidthAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3478:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:3479:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:3479:2: ( RULE_INT )
            // InternalSynthesizer.g:3480:3: RULE_INT
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
    // InternalSynthesizer.g:3489:1: rule__RotaryKnob__HeightAssignment_10 : ( RULE_INT ) ;
    public final void rule__RotaryKnob__HeightAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3493:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:3494:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:3494:2: ( RULE_INT )
            // InternalSynthesizer.g:3495:3: RULE_INT
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
    // InternalSynthesizer.g:3504:1: rule__Slider__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Slider__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3508:1: ( ( RULE_ID ) )
            // InternalSynthesizer.g:3509:2: ( RULE_ID )
            {
            // InternalSynthesizer.g:3509:2: ( RULE_ID )
            // InternalSynthesizer.g:3510:3: RULE_ID
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
    // InternalSynthesizer.g:3519:1: rule__Slider__XAssignment_4 : ( RULE_INT ) ;
    public final void rule__Slider__XAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3523:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:3524:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:3524:2: ( RULE_INT )
            // InternalSynthesizer.g:3525:3: RULE_INT
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
    // InternalSynthesizer.g:3534:1: rule__Slider__YAssignment_6 : ( RULE_INT ) ;
    public final void rule__Slider__YAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3538:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:3539:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:3539:2: ( RULE_INT )
            // InternalSynthesizer.g:3540:3: RULE_INT
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
    // InternalSynthesizer.g:3549:1: rule__Slider__WidthAssignment_8 : ( RULE_INT ) ;
    public final void rule__Slider__WidthAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3553:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:3554:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:3554:2: ( RULE_INT )
            // InternalSynthesizer.g:3555:3: RULE_INT
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
    // InternalSynthesizer.g:3564:1: rule__Slider__HeightAssignment_10 : ( RULE_INT ) ;
    public final void rule__Slider__HeightAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3568:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:3569:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:3569:2: ( RULE_INT )
            // InternalSynthesizer.g:3570:3: RULE_INT
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
    // InternalSynthesizer.g:3579:1: rule__Slider__SoundAssignment_12 : ( ( RULE_ID ) ) ;
    public final void rule__Slider__SoundAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3583:1: ( ( ( RULE_ID ) ) )
            // InternalSynthesizer.g:3584:2: ( ( RULE_ID ) )
            {
            // InternalSynthesizer.g:3584:2: ( ( RULE_ID ) )
            // InternalSynthesizer.g:3585:3: ( RULE_ID )
            {
             before(grammarAccess.getSliderAccess().getSoundSoundElementCrossReference_12_0()); 
            // InternalSynthesizer.g:3586:3: ( RULE_ID )
            // InternalSynthesizer.g:3587:4: RULE_ID
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
    // InternalSynthesizer.g:3598:1: rule__Slider__TypeAssignment_14 : ( ruleEffect ) ;
    public final void rule__Slider__TypeAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3602:1: ( ( ruleEffect ) )
            // InternalSynthesizer.g:3603:2: ( ruleEffect )
            {
            // InternalSynthesizer.g:3603:2: ( ruleEffect )
            // InternalSynthesizer.g:3604:3: ruleEffect
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
    // InternalSynthesizer.g:3613:1: rule__Button__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Button__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3617:1: ( ( RULE_ID ) )
            // InternalSynthesizer.g:3618:2: ( RULE_ID )
            {
            // InternalSynthesizer.g:3618:2: ( RULE_ID )
            // InternalSynthesizer.g:3619:3: RULE_ID
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
    // InternalSynthesizer.g:3628:1: rule__Button__XAssignment_4 : ( RULE_INT ) ;
    public final void rule__Button__XAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3632:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:3633:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:3633:2: ( RULE_INT )
            // InternalSynthesizer.g:3634:3: RULE_INT
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
    // InternalSynthesizer.g:3643:1: rule__Button__YAssignment_6 : ( RULE_INT ) ;
    public final void rule__Button__YAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3647:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:3648:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:3648:2: ( RULE_INT )
            // InternalSynthesizer.g:3649:3: RULE_INT
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
    // InternalSynthesizer.g:3658:1: rule__Button__WidthAssignment_8 : ( RULE_INT ) ;
    public final void rule__Button__WidthAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3662:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:3663:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:3663:2: ( RULE_INT )
            // InternalSynthesizer.g:3664:3: RULE_INT
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
    // InternalSynthesizer.g:3673:1: rule__Button__HeightAssignment_10 : ( RULE_INT ) ;
    public final void rule__Button__HeightAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3677:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:3678:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:3678:2: ( RULE_INT )
            // InternalSynthesizer.g:3679:3: RULE_INT
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
    // InternalSynthesizer.g:3688:1: rule__Button__SoundAssignment_12 : ( ( RULE_ID ) ) ;
    public final void rule__Button__SoundAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3692:1: ( ( ( RULE_ID ) ) )
            // InternalSynthesizer.g:3693:2: ( ( RULE_ID ) )
            {
            // InternalSynthesizer.g:3693:2: ( ( RULE_ID ) )
            // InternalSynthesizer.g:3694:3: ( RULE_ID )
            {
             before(grammarAccess.getButtonAccess().getSoundSoundElementCrossReference_12_0()); 
            // InternalSynthesizer.g:3695:3: ( RULE_ID )
            // InternalSynthesizer.g:3696:4: RULE_ID
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
    // InternalSynthesizer.g:3707:1: rule__ConnectionElement__CeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ConnectionElement__CeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3711:1: ( ( ( RULE_ID ) ) )
            // InternalSynthesizer.g:3712:2: ( ( RULE_ID ) )
            {
            // InternalSynthesizer.g:3712:2: ( ( RULE_ID ) )
            // InternalSynthesizer.g:3713:3: ( RULE_ID )
            {
             before(grammarAccess.getConnectionElementAccess().getCeControlElementCrossReference_1_0()); 
            // InternalSynthesizer.g:3714:3: ( RULE_ID )
            // InternalSynthesizer.g:3715:4: RULE_ID
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
    // InternalSynthesizer.g:3726:1: rule__ConnectionElement__SeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ConnectionElement__SeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3730:1: ( ( ( RULE_ID ) ) )
            // InternalSynthesizer.g:3731:2: ( ( RULE_ID ) )
            {
            // InternalSynthesizer.g:3731:2: ( ( RULE_ID ) )
            // InternalSynthesizer.g:3732:3: ( RULE_ID )
            {
             before(grammarAccess.getConnectionElementAccess().getSeSoundElementCrossReference_2_0()); 
            // InternalSynthesizer.g:3733:3: ( RULE_ID )
            // InternalSynthesizer.g:3734:4: RULE_ID
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
    // InternalSynthesizer.g:3745:1: rule__SawToothOscillator__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SawToothOscillator__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3749:1: ( ( RULE_ID ) )
            // InternalSynthesizer.g:3750:2: ( RULE_ID )
            {
            // InternalSynthesizer.g:3750:2: ( RULE_ID )
            // InternalSynthesizer.g:3751:3: RULE_ID
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
    // InternalSynthesizer.g:3760:1: rule__SawToothOscillator__FrequencyAssignment_4 : ( RULE_INT ) ;
    public final void rule__SawToothOscillator__FrequencyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3764:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:3765:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:3765:2: ( RULE_INT )
            // InternalSynthesizer.g:3766:3: RULE_INT
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
    // InternalSynthesizer.g:3775:1: rule__SawToothOscillator__AmplitudeAssignment_6 : ( RULE_INT ) ;
    public final void rule__SawToothOscillator__AmplitudeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3779:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:3780:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:3780:2: ( RULE_INT )
            // InternalSynthesizer.g:3781:3: RULE_INT
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
    // InternalSynthesizer.g:3790:1: rule__SineOscillator__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SineOscillator__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3794:1: ( ( RULE_ID ) )
            // InternalSynthesizer.g:3795:2: ( RULE_ID )
            {
            // InternalSynthesizer.g:3795:2: ( RULE_ID )
            // InternalSynthesizer.g:3796:3: RULE_ID
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
    // InternalSynthesizer.g:3805:1: rule__SineOscillator__FrequencyAssignment_4 : ( RULE_INT ) ;
    public final void rule__SineOscillator__FrequencyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3809:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:3810:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:3810:2: ( RULE_INT )
            // InternalSynthesizer.g:3811:3: RULE_INT
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
    // InternalSynthesizer.g:3820:1: rule__SineOscillator__AmplitudeAssignment_6 : ( RULE_INT ) ;
    public final void rule__SineOscillator__AmplitudeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3824:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:3825:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:3825:2: ( RULE_INT )
            // InternalSynthesizer.g:3826:3: RULE_INT
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
    // InternalSynthesizer.g:3835:1: rule__TriangleOscillator__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TriangleOscillator__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3839:1: ( ( RULE_ID ) )
            // InternalSynthesizer.g:3840:2: ( RULE_ID )
            {
            // InternalSynthesizer.g:3840:2: ( RULE_ID )
            // InternalSynthesizer.g:3841:3: RULE_ID
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
    // InternalSynthesizer.g:3850:1: rule__TriangleOscillator__FrequencyAssignment_4 : ( RULE_INT ) ;
    public final void rule__TriangleOscillator__FrequencyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3854:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:3855:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:3855:2: ( RULE_INT )
            // InternalSynthesizer.g:3856:3: RULE_INT
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
    // InternalSynthesizer.g:3865:1: rule__TriangleOscillator__AmplitudeAssignment_6 : ( RULE_INT ) ;
    public final void rule__TriangleOscillator__AmplitudeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3869:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:3870:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:3870:2: ( RULE_INT )
            // InternalSynthesizer.g:3871:3: RULE_INT
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
    // InternalSynthesizer.g:3880:1: rule__SquareOscillator__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SquareOscillator__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3884:1: ( ( RULE_ID ) )
            // InternalSynthesizer.g:3885:2: ( RULE_ID )
            {
            // InternalSynthesizer.g:3885:2: ( RULE_ID )
            // InternalSynthesizer.g:3886:3: RULE_ID
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
    // InternalSynthesizer.g:3895:1: rule__SquareOscillator__FrequencyAssignment_4 : ( RULE_INT ) ;
    public final void rule__SquareOscillator__FrequencyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3899:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:3900:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:3900:2: ( RULE_INT )
            // InternalSynthesizer.g:3901:3: RULE_INT
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
    // InternalSynthesizer.g:3910:1: rule__SquareOscillator__AmplitudeAssignment_6 : ( RULE_INT ) ;
    public final void rule__SquareOscillator__AmplitudeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3914:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:3915:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:3915:2: ( RULE_INT )
            // InternalSynthesizer.g:3916:3: RULE_INT
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
    // InternalSynthesizer.g:3925:1: rule__PulseOscillator__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PulseOscillator__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3929:1: ( ( RULE_ID ) )
            // InternalSynthesizer.g:3930:2: ( RULE_ID )
            {
            // InternalSynthesizer.g:3930:2: ( RULE_ID )
            // InternalSynthesizer.g:3931:3: RULE_ID
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
    // InternalSynthesizer.g:3940:1: rule__PulseOscillator__FrequencyAssignment_4 : ( RULE_INT ) ;
    public final void rule__PulseOscillator__FrequencyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3944:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:3945:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:3945:2: ( RULE_INT )
            // InternalSynthesizer.g:3946:3: RULE_INT
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
    // InternalSynthesizer.g:3955:1: rule__PulseOscillator__AmplitudeAssignment_6 : ( RULE_INT ) ;
    public final void rule__PulseOscillator__AmplitudeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3959:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:3960:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:3960:2: ( RULE_INT )
            // InternalSynthesizer.g:3961:3: RULE_INT
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


    // $ANTLR start "rule__ImpulseOscillator__NameAssignment_1"
    // InternalSynthesizer.g:3970:1: rule__ImpulseOscillator__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ImpulseOscillator__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3974:1: ( ( RULE_ID ) )
            // InternalSynthesizer.g:3975:2: ( RULE_ID )
            {
            // InternalSynthesizer.g:3975:2: ( RULE_ID )
            // InternalSynthesizer.g:3976:3: RULE_ID
            {
             before(grammarAccess.getImpulseOscillatorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getImpulseOscillatorAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpulseOscillator__NameAssignment_1"


    // $ANTLR start "rule__ImpulseOscillator__FrequencyAssignment_4"
    // InternalSynthesizer.g:3985:1: rule__ImpulseOscillator__FrequencyAssignment_4 : ( RULE_INT ) ;
    public final void rule__ImpulseOscillator__FrequencyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:3989:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:3990:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:3990:2: ( RULE_INT )
            // InternalSynthesizer.g:3991:3: RULE_INT
            {
             before(grammarAccess.getImpulseOscillatorAccess().getFrequencyINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getImpulseOscillatorAccess().getFrequencyINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpulseOscillator__FrequencyAssignment_4"


    // $ANTLR start "rule__ImpulseOscillator__AmplitudeAssignment_6"
    // InternalSynthesizer.g:4000:1: rule__ImpulseOscillator__AmplitudeAssignment_6 : ( RULE_INT ) ;
    public final void rule__ImpulseOscillator__AmplitudeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:4004:1: ( ( RULE_INT ) )
            // InternalSynthesizer.g:4005:2: ( RULE_INT )
            {
            // InternalSynthesizer.g:4005:2: ( RULE_INT )
            // InternalSynthesizer.g:4006:3: RULE_INT
            {
             before(grammarAccess.getImpulseOscillatorAccess().getAmplitudeINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getImpulseOscillatorAccess().getAmplitudeINTTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpulseOscillator__AmplitudeAssignment_6"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000012048000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000012040002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000FC0008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000FC0000002L});
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