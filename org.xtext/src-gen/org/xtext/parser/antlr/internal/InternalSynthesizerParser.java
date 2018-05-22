package org.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.SynthesizerGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSynthesizerParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Controls'", "'{'", "'}'", "'Sound'", "'Connections'", "'linear'", "'Rot'", "'button'", "'('", "'x'", "'y'", "'width'", "'height'", "'frequency'", "')'", "'sawToothOscillator'", "'min'", "'max'", "'default'", "'sineOscillator'", "'amplitude'"
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

        public InternalSynthesizerParser(TokenStream input, SynthesizerGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected SynthesizerGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalSynthesizer.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalSynthesizer.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalSynthesizer.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSynthesizer.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'Controls' otherlv_1= '{' ( (lv_controls_2_0= ruleControlElement ) )* otherlv_3= '}' (otherlv_4= 'Sound' otherlv_5= '{' ( (lv_sounds_6_0= ruleSoundElement ) )* otherlv_7= '}' )? (otherlv_8= 'Connections' otherlv_9= '{' ( (lv_connections_10_0= ruleConnectionElement ) )* otherlv_11= '}' )? ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_controls_2_0 = null;

        EObject lv_sounds_6_0 = null;

        EObject lv_connections_10_0 = null;



        	enterRule();

        try {
            // InternalSynthesizer.g:77:2: ( (otherlv_0= 'Controls' otherlv_1= '{' ( (lv_controls_2_0= ruleControlElement ) )* otherlv_3= '}' (otherlv_4= 'Sound' otherlv_5= '{' ( (lv_sounds_6_0= ruleSoundElement ) )* otherlv_7= '}' )? (otherlv_8= 'Connections' otherlv_9= '{' ( (lv_connections_10_0= ruleConnectionElement ) )* otherlv_11= '}' )? ) )
            // InternalSynthesizer.g:78:2: (otherlv_0= 'Controls' otherlv_1= '{' ( (lv_controls_2_0= ruleControlElement ) )* otherlv_3= '}' (otherlv_4= 'Sound' otherlv_5= '{' ( (lv_sounds_6_0= ruleSoundElement ) )* otherlv_7= '}' )? (otherlv_8= 'Connections' otherlv_9= '{' ( (lv_connections_10_0= ruleConnectionElement ) )* otherlv_11= '}' )? )
            {
            // InternalSynthesizer.g:78:2: (otherlv_0= 'Controls' otherlv_1= '{' ( (lv_controls_2_0= ruleControlElement ) )* otherlv_3= '}' (otherlv_4= 'Sound' otherlv_5= '{' ( (lv_sounds_6_0= ruleSoundElement ) )* otherlv_7= '}' )? (otherlv_8= 'Connections' otherlv_9= '{' ( (lv_connections_10_0= ruleConnectionElement ) )* otherlv_11= '}' )? )
            // InternalSynthesizer.g:79:3: otherlv_0= 'Controls' otherlv_1= '{' ( (lv_controls_2_0= ruleControlElement ) )* otherlv_3= '}' (otherlv_4= 'Sound' otherlv_5= '{' ( (lv_sounds_6_0= ruleSoundElement ) )* otherlv_7= '}' )? (otherlv_8= 'Connections' otherlv_9= '{' ( (lv_connections_10_0= ruleConnectionElement ) )* otherlv_11= '}' )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getControlsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSynthesizer.g:87:3: ( (lv_controls_2_0= ruleControlElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=17 && LA1_0<=18)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSynthesizer.g:88:4: (lv_controls_2_0= ruleControlElement )
            	    {
            	    // InternalSynthesizer.g:88:4: (lv_controls_2_0= ruleControlElement )
            	    // InternalSynthesizer.g:89:5: lv_controls_2_0= ruleControlElement
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getControlsControlElementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_controls_2_0=ruleControlElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"controls",
            	    						lv_controls_2_0,
            	    						"org.xtext.Synthesizer.ControlElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3());
            		
            // InternalSynthesizer.g:110:3: (otherlv_4= 'Sound' otherlv_5= '{' ( (lv_sounds_6_0= ruleSoundElement ) )* otherlv_7= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSynthesizer.g:111:4: otherlv_4= 'Sound' otherlv_5= '{' ( (lv_sounds_6_0= ruleSoundElement ) )* otherlv_7= '}'
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getModelAccess().getSoundKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalSynthesizer.g:119:4: ( (lv_sounds_6_0= ruleSoundElement ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==26||LA2_0==30) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalSynthesizer.g:120:5: (lv_sounds_6_0= ruleSoundElement )
                    	    {
                    	    // InternalSynthesizer.g:120:5: (lv_sounds_6_0= ruleSoundElement )
                    	    // InternalSynthesizer.g:121:6: lv_sounds_6_0= ruleSoundElement
                    	    {

                    	    						newCompositeNode(grammarAccess.getModelAccess().getSoundsSoundElementParserRuleCall_4_2_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_sounds_6_0=ruleSoundElement();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getModelRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"sounds",
                    	    							lv_sounds_6_0,
                    	    							"org.xtext.Synthesizer.SoundElement");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4_3());
                    			

                    }
                    break;

            }

            // InternalSynthesizer.g:143:3: (otherlv_8= 'Connections' otherlv_9= '{' ( (lv_connections_10_0= ruleConnectionElement ) )* otherlv_11= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSynthesizer.g:144:4: otherlv_8= 'Connections' otherlv_9= '{' ( (lv_connections_10_0= ruleConnectionElement ) )* otherlv_11= '}'
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getModelAccess().getConnectionsKeyword_5_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalSynthesizer.g:152:4: ( (lv_connections_10_0= ruleConnectionElement ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==16) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalSynthesizer.g:153:5: (lv_connections_10_0= ruleConnectionElement )
                    	    {
                    	    // InternalSynthesizer.g:153:5: (lv_connections_10_0= ruleConnectionElement )
                    	    // InternalSynthesizer.g:154:6: lv_connections_10_0= ruleConnectionElement
                    	    {

                    	    						newCompositeNode(grammarAccess.getModelAccess().getConnectionsConnectionElementParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_connections_10_0=ruleConnectionElement();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getModelRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"connections",
                    	    							lv_connections_10_0,
                    	    							"org.xtext.Synthesizer.ConnectionElement");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5_3());
                    			

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleControlElement"
    // InternalSynthesizer.g:180:1: entryRuleControlElement returns [EObject current=null] : iv_ruleControlElement= ruleControlElement EOF ;
    public final EObject entryRuleControlElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlElement = null;


        try {
            // InternalSynthesizer.g:180:55: (iv_ruleControlElement= ruleControlElement EOF )
            // InternalSynthesizer.g:181:2: iv_ruleControlElement= ruleControlElement EOF
            {
             newCompositeNode(grammarAccess.getControlElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleControlElement=ruleControlElement();

            state._fsp--;

             current =iv_ruleControlElement; 
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
    // $ANTLR end "entryRuleControlElement"


    // $ANTLR start "ruleControlElement"
    // InternalSynthesizer.g:187:1: ruleControlElement returns [EObject current=null] : (this_Button_0= ruleButton | ruleRotaryKnob ) ;
    public final EObject ruleControlElement() throws RecognitionException {
        EObject current = null;

        EObject this_Button_0 = null;



        	enterRule();

        try {
            // InternalSynthesizer.g:193:2: ( (this_Button_0= ruleButton | ruleRotaryKnob ) )
            // InternalSynthesizer.g:194:2: (this_Button_0= ruleButton | ruleRotaryKnob )
            {
            // InternalSynthesizer.g:194:2: (this_Button_0= ruleButton | ruleRotaryKnob )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            else if ( (LA6_0==17) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSynthesizer.g:195:3: this_Button_0= ruleButton
                    {

                    			newCompositeNode(grammarAccess.getControlElementAccess().getButtonParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Button_0=ruleButton();

                    state._fsp--;


                    			current = this_Button_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSynthesizer.g:204:3: ruleRotaryKnob
                    {

                    			newCompositeNode(grammarAccess.getControlElementAccess().getRotaryKnobParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    ruleRotaryKnob();

                    state._fsp--;


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
    // $ANTLR end "ruleControlElement"


    // $ANTLR start "entryRuleSoundElement"
    // InternalSynthesizer.g:215:1: entryRuleSoundElement returns [EObject current=null] : iv_ruleSoundElement= ruleSoundElement EOF ;
    public final EObject entryRuleSoundElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoundElement = null;


        try {
            // InternalSynthesizer.g:215:53: (iv_ruleSoundElement= ruleSoundElement EOF )
            // InternalSynthesizer.g:216:2: iv_ruleSoundElement= ruleSoundElement EOF
            {
             newCompositeNode(grammarAccess.getSoundElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSoundElement=ruleSoundElement();

            state._fsp--;

             current =iv_ruleSoundElement; 
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
    // $ANTLR end "entryRuleSoundElement"


    // $ANTLR start "ruleSoundElement"
    // InternalSynthesizer.g:222:1: ruleSoundElement returns [EObject current=null] : (this_SawToothOscillator_0= ruleSawToothOscillator | this_SineOscillator_1= ruleSineOscillator ) ;
    public final EObject ruleSoundElement() throws RecognitionException {
        EObject current = null;

        EObject this_SawToothOscillator_0 = null;

        EObject this_SineOscillator_1 = null;



        	enterRule();

        try {
            // InternalSynthesizer.g:228:2: ( (this_SawToothOscillator_0= ruleSawToothOscillator | this_SineOscillator_1= ruleSineOscillator ) )
            // InternalSynthesizer.g:229:2: (this_SawToothOscillator_0= ruleSawToothOscillator | this_SineOscillator_1= ruleSineOscillator )
            {
            // InternalSynthesizer.g:229:2: (this_SawToothOscillator_0= ruleSawToothOscillator | this_SineOscillator_1= ruleSineOscillator )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            else if ( (LA7_0==30) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSynthesizer.g:230:3: this_SawToothOscillator_0= ruleSawToothOscillator
                    {

                    			newCompositeNode(grammarAccess.getSoundElementAccess().getSawToothOscillatorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SawToothOscillator_0=ruleSawToothOscillator();

                    state._fsp--;


                    			current = this_SawToothOscillator_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSynthesizer.g:239:3: this_SineOscillator_1= ruleSineOscillator
                    {

                    			newCompositeNode(grammarAccess.getSoundElementAccess().getSineOscillatorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SineOscillator_1=ruleSineOscillator();

                    state._fsp--;


                    			current = this_SineOscillator_1;
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
    // $ANTLR end "ruleSoundElement"


    // $ANTLR start "entryRuleConnectionElement"
    // InternalSynthesizer.g:251:1: entryRuleConnectionElement returns [EObject current=null] : iv_ruleConnectionElement= ruleConnectionElement EOF ;
    public final EObject entryRuleConnectionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectionElement = null;


        try {
            // InternalSynthesizer.g:251:58: (iv_ruleConnectionElement= ruleConnectionElement EOF )
            // InternalSynthesizer.g:252:2: iv_ruleConnectionElement= ruleConnectionElement EOF
            {
             newCompositeNode(grammarAccess.getConnectionElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnectionElement=ruleConnectionElement();

            state._fsp--;

             current =iv_ruleConnectionElement; 
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
    // $ANTLR end "entryRuleConnectionElement"


    // $ANTLR start "ruleConnectionElement"
    // InternalSynthesizer.g:258:1: ruleConnectionElement returns [EObject current=null] : (otherlv_0= 'linear' ( (lv_ce_1_0= ruleControlElement ) ) ( (lv_se_2_0= ruleSoundElement ) ) ) ;
    public final EObject ruleConnectionElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ce_1_0 = null;

        EObject lv_se_2_0 = null;



        	enterRule();

        try {
            // InternalSynthesizer.g:264:2: ( (otherlv_0= 'linear' ( (lv_ce_1_0= ruleControlElement ) ) ( (lv_se_2_0= ruleSoundElement ) ) ) )
            // InternalSynthesizer.g:265:2: (otherlv_0= 'linear' ( (lv_ce_1_0= ruleControlElement ) ) ( (lv_se_2_0= ruleSoundElement ) ) )
            {
            // InternalSynthesizer.g:265:2: (otherlv_0= 'linear' ( (lv_ce_1_0= ruleControlElement ) ) ( (lv_se_2_0= ruleSoundElement ) ) )
            // InternalSynthesizer.g:266:3: otherlv_0= 'linear' ( (lv_ce_1_0= ruleControlElement ) ) ( (lv_se_2_0= ruleSoundElement ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getConnectionElementAccess().getLinearKeyword_0());
            		
            // InternalSynthesizer.g:270:3: ( (lv_ce_1_0= ruleControlElement ) )
            // InternalSynthesizer.g:271:4: (lv_ce_1_0= ruleControlElement )
            {
            // InternalSynthesizer.g:271:4: (lv_ce_1_0= ruleControlElement )
            // InternalSynthesizer.g:272:5: lv_ce_1_0= ruleControlElement
            {

            					newCompositeNode(grammarAccess.getConnectionElementAccess().getCeControlElementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_ce_1_0=ruleControlElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectionElementRule());
            					}
            					set(
            						current,
            						"ce",
            						lv_ce_1_0,
            						"org.xtext.Synthesizer.ControlElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSynthesizer.g:289:3: ( (lv_se_2_0= ruleSoundElement ) )
            // InternalSynthesizer.g:290:4: (lv_se_2_0= ruleSoundElement )
            {
            // InternalSynthesizer.g:290:4: (lv_se_2_0= ruleSoundElement )
            // InternalSynthesizer.g:291:5: lv_se_2_0= ruleSoundElement
            {

            					newCompositeNode(grammarAccess.getConnectionElementAccess().getSeSoundElementParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_se_2_0=ruleSoundElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectionElementRule());
            					}
            					set(
            						current,
            						"se",
            						lv_se_2_0,
            						"org.xtext.Synthesizer.SoundElement");
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
    // $ANTLR end "ruleConnectionElement"


    // $ANTLR start "entryRuleRotaryKnob"
    // InternalSynthesizer.g:312:1: entryRuleRotaryKnob returns [String current=null] : iv_ruleRotaryKnob= ruleRotaryKnob EOF ;
    public final String entryRuleRotaryKnob() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRotaryKnob = null;


        try {
            // InternalSynthesizer.g:312:50: (iv_ruleRotaryKnob= ruleRotaryKnob EOF )
            // InternalSynthesizer.g:313:2: iv_ruleRotaryKnob= ruleRotaryKnob EOF
            {
             newCompositeNode(grammarAccess.getRotaryKnobRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRotaryKnob=ruleRotaryKnob();

            state._fsp--;

             current =iv_ruleRotaryKnob.getText(); 
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
    // $ANTLR end "entryRuleRotaryKnob"


    // $ANTLR start "ruleRotaryKnob"
    // InternalSynthesizer.g:319:1: ruleRotaryKnob returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Rot' ;
    public final AntlrDatatypeRuleToken ruleRotaryKnob() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSynthesizer.g:325:2: (kw= 'Rot' )
            // InternalSynthesizer.g:326:2: kw= 'Rot'
            {
            kw=(Token)match(input,17,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getRotaryKnobAccess().getRotKeyword());
            	

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
    // $ANTLR end "ruleRotaryKnob"


    // $ANTLR start "entryRuleButton"
    // InternalSynthesizer.g:334:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // InternalSynthesizer.g:334:47: (iv_ruleButton= ruleButton EOF )
            // InternalSynthesizer.g:335:2: iv_ruleButton= ruleButton EOF
            {
             newCompositeNode(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleButton=ruleButton();

            state._fsp--;

             current =iv_ruleButton; 
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
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // InternalSynthesizer.g:341:1: ruleButton returns [EObject current=null] : (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= 'width' ( (lv_width_8_0= RULE_INT ) ) otherlv_9= 'height' ( (lv_height_10_0= RULE_INT ) ) otherlv_11= 'frequency' ( (lv_frequency_12_0= RULE_INT ) ) otherlv_13= ')' ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_x_4_0=null;
        Token otherlv_5=null;
        Token lv_y_6_0=null;
        Token otherlv_7=null;
        Token lv_width_8_0=null;
        Token otherlv_9=null;
        Token lv_height_10_0=null;
        Token otherlv_11=null;
        Token lv_frequency_12_0=null;
        Token otherlv_13=null;


        	enterRule();

        try {
            // InternalSynthesizer.g:347:2: ( (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= 'width' ( (lv_width_8_0= RULE_INT ) ) otherlv_9= 'height' ( (lv_height_10_0= RULE_INT ) ) otherlv_11= 'frequency' ( (lv_frequency_12_0= RULE_INT ) ) otherlv_13= ')' ) )
            // InternalSynthesizer.g:348:2: (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= 'width' ( (lv_width_8_0= RULE_INT ) ) otherlv_9= 'height' ( (lv_height_10_0= RULE_INT ) ) otherlv_11= 'frequency' ( (lv_frequency_12_0= RULE_INT ) ) otherlv_13= ')' )
            {
            // InternalSynthesizer.g:348:2: (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= 'width' ( (lv_width_8_0= RULE_INT ) ) otherlv_9= 'height' ( (lv_height_10_0= RULE_INT ) ) otherlv_11= 'frequency' ( (lv_frequency_12_0= RULE_INT ) ) otherlv_13= ')' )
            // InternalSynthesizer.g:349:3: otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= 'width' ( (lv_width_8_0= RULE_INT ) ) otherlv_9= 'height' ( (lv_height_10_0= RULE_INT ) ) otherlv_11= 'frequency' ( (lv_frequency_12_0= RULE_INT ) ) otherlv_13= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getButtonAccess().getButtonKeyword_0());
            		
            // InternalSynthesizer.g:353:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSynthesizer.g:354:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSynthesizer.g:354:4: (lv_name_1_0= RULE_ID )
            // InternalSynthesizer.g:355:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getButtonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getButtonAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getButtonAccess().getXKeyword_3());
            		
            // InternalSynthesizer.g:379:3: ( (lv_x_4_0= RULE_INT ) )
            // InternalSynthesizer.g:380:4: (lv_x_4_0= RULE_INT )
            {
            // InternalSynthesizer.g:380:4: (lv_x_4_0= RULE_INT )
            // InternalSynthesizer.g:381:5: lv_x_4_0= RULE_INT
            {
            lv_x_4_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_x_4_0, grammarAccess.getButtonAccess().getXINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getButtonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getButtonAccess().getYKeyword_5());
            		
            // InternalSynthesizer.g:401:3: ( (lv_y_6_0= RULE_INT ) )
            // InternalSynthesizer.g:402:4: (lv_y_6_0= RULE_INT )
            {
            // InternalSynthesizer.g:402:4: (lv_y_6_0= RULE_INT )
            // InternalSynthesizer.g:403:5: lv_y_6_0= RULE_INT
            {
            lv_y_6_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_y_6_0, grammarAccess.getButtonAccess().getYINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getButtonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getButtonAccess().getWidthKeyword_7());
            		
            // InternalSynthesizer.g:423:3: ( (lv_width_8_0= RULE_INT ) )
            // InternalSynthesizer.g:424:4: (lv_width_8_0= RULE_INT )
            {
            // InternalSynthesizer.g:424:4: (lv_width_8_0= RULE_INT )
            // InternalSynthesizer.g:425:5: lv_width_8_0= RULE_INT
            {
            lv_width_8_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            					newLeafNode(lv_width_8_0, grammarAccess.getButtonAccess().getWidthINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getButtonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"width",
            						lv_width_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_9=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_9, grammarAccess.getButtonAccess().getHeightKeyword_9());
            		
            // InternalSynthesizer.g:445:3: ( (lv_height_10_0= RULE_INT ) )
            // InternalSynthesizer.g:446:4: (lv_height_10_0= RULE_INT )
            {
            // InternalSynthesizer.g:446:4: (lv_height_10_0= RULE_INT )
            // InternalSynthesizer.g:447:5: lv_height_10_0= RULE_INT
            {
            lv_height_10_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            					newLeafNode(lv_height_10_0, grammarAccess.getButtonAccess().getHeightINTTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getButtonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"height",
            						lv_height_10_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_11=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_11, grammarAccess.getButtonAccess().getFrequencyKeyword_11());
            		
            // InternalSynthesizer.g:467:3: ( (lv_frequency_12_0= RULE_INT ) )
            // InternalSynthesizer.g:468:4: (lv_frequency_12_0= RULE_INT )
            {
            // InternalSynthesizer.g:468:4: (lv_frequency_12_0= RULE_INT )
            // InternalSynthesizer.g:469:5: lv_frequency_12_0= RULE_INT
            {
            lv_frequency_12_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            					newLeafNode(lv_frequency_12_0, grammarAccess.getButtonAccess().getFrequencyINTTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getButtonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"frequency",
            						lv_frequency_12_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_13=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getButtonAccess().getRightParenthesisKeyword_13());
            		

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
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleSawToothOscillator"
    // InternalSynthesizer.g:493:1: entryRuleSawToothOscillator returns [EObject current=null] : iv_ruleSawToothOscillator= ruleSawToothOscillator EOF ;
    public final EObject entryRuleSawToothOscillator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSawToothOscillator = null;


        try {
            // InternalSynthesizer.g:493:59: (iv_ruleSawToothOscillator= ruleSawToothOscillator EOF )
            // InternalSynthesizer.g:494:2: iv_ruleSawToothOscillator= ruleSawToothOscillator EOF
            {
             newCompositeNode(grammarAccess.getSawToothOscillatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSawToothOscillator=ruleSawToothOscillator();

            state._fsp--;

             current =iv_ruleSawToothOscillator; 
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
    // $ANTLR end "entryRuleSawToothOscillator"


    // $ANTLR start "ruleSawToothOscillator"
    // InternalSynthesizer.g:500:1: ruleSawToothOscillator returns [EObject current=null] : (otherlv_0= 'sawToothOscillator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'min' ( (lv_min_4_0= RULE_INT ) ) otherlv_5= 'max' ( (lv_max_6_0= RULE_INT ) ) otherlv_7= 'default' ( (lv_default_8_0= RULE_INT ) ) otherlv_9= ')' ) ;
    public final EObject ruleSawToothOscillator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_min_4_0=null;
        Token otherlv_5=null;
        Token lv_max_6_0=null;
        Token otherlv_7=null;
        Token lv_default_8_0=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalSynthesizer.g:506:2: ( (otherlv_0= 'sawToothOscillator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'min' ( (lv_min_4_0= RULE_INT ) ) otherlv_5= 'max' ( (lv_max_6_0= RULE_INT ) ) otherlv_7= 'default' ( (lv_default_8_0= RULE_INT ) ) otherlv_9= ')' ) )
            // InternalSynthesizer.g:507:2: (otherlv_0= 'sawToothOscillator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'min' ( (lv_min_4_0= RULE_INT ) ) otherlv_5= 'max' ( (lv_max_6_0= RULE_INT ) ) otherlv_7= 'default' ( (lv_default_8_0= RULE_INT ) ) otherlv_9= ')' )
            {
            // InternalSynthesizer.g:507:2: (otherlv_0= 'sawToothOscillator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'min' ( (lv_min_4_0= RULE_INT ) ) otherlv_5= 'max' ( (lv_max_6_0= RULE_INT ) ) otherlv_7= 'default' ( (lv_default_8_0= RULE_INT ) ) otherlv_9= ')' )
            // InternalSynthesizer.g:508:3: otherlv_0= 'sawToothOscillator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'min' ( (lv_min_4_0= RULE_INT ) ) otherlv_5= 'max' ( (lv_max_6_0= RULE_INT ) ) otherlv_7= 'default' ( (lv_default_8_0= RULE_INT ) ) otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getSawToothOscillatorAccess().getSawToothOscillatorKeyword_0());
            		
            // InternalSynthesizer.g:512:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSynthesizer.g:513:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSynthesizer.g:513:4: (lv_name_1_0= RULE_ID )
            // InternalSynthesizer.g:514:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSawToothOscillatorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSawToothOscillatorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getSawToothOscillatorAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getSawToothOscillatorAccess().getMinKeyword_3());
            		
            // InternalSynthesizer.g:538:3: ( (lv_min_4_0= RULE_INT ) )
            // InternalSynthesizer.g:539:4: (lv_min_4_0= RULE_INT )
            {
            // InternalSynthesizer.g:539:4: (lv_min_4_0= RULE_INT )
            // InternalSynthesizer.g:540:5: lv_min_4_0= RULE_INT
            {
            lv_min_4_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            					newLeafNode(lv_min_4_0, grammarAccess.getSawToothOscillatorAccess().getMinINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSawToothOscillatorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"min",
            						lv_min_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getSawToothOscillatorAccess().getMaxKeyword_5());
            		
            // InternalSynthesizer.g:560:3: ( (lv_max_6_0= RULE_INT ) )
            // InternalSynthesizer.g:561:4: (lv_max_6_0= RULE_INT )
            {
            // InternalSynthesizer.g:561:4: (lv_max_6_0= RULE_INT )
            // InternalSynthesizer.g:562:5: lv_max_6_0= RULE_INT
            {
            lv_max_6_0=(Token)match(input,RULE_INT,FOLLOW_22); 

            					newLeafNode(lv_max_6_0, grammarAccess.getSawToothOscillatorAccess().getMaxINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSawToothOscillatorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"max",
            						lv_max_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,29,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getSawToothOscillatorAccess().getDefaultKeyword_7());
            		
            // InternalSynthesizer.g:582:3: ( (lv_default_8_0= RULE_INT ) )
            // InternalSynthesizer.g:583:4: (lv_default_8_0= RULE_INT )
            {
            // InternalSynthesizer.g:583:4: (lv_default_8_0= RULE_INT )
            // InternalSynthesizer.g:584:5: lv_default_8_0= RULE_INT
            {
            lv_default_8_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            					newLeafNode(lv_default_8_0, grammarAccess.getSawToothOscillatorAccess().getDefaultINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSawToothOscillatorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"default",
            						lv_default_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_9=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getSawToothOscillatorAccess().getRightParenthesisKeyword_9());
            		

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
    // $ANTLR end "ruleSawToothOscillator"


    // $ANTLR start "entryRuleSineOscillator"
    // InternalSynthesizer.g:608:1: entryRuleSineOscillator returns [EObject current=null] : iv_ruleSineOscillator= ruleSineOscillator EOF ;
    public final EObject entryRuleSineOscillator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSineOscillator = null;


        try {
            // InternalSynthesizer.g:608:55: (iv_ruleSineOscillator= ruleSineOscillator EOF )
            // InternalSynthesizer.g:609:2: iv_ruleSineOscillator= ruleSineOscillator EOF
            {
             newCompositeNode(grammarAccess.getSineOscillatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSineOscillator=ruleSineOscillator();

            state._fsp--;

             current =iv_ruleSineOscillator; 
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
    // $ANTLR end "entryRuleSineOscillator"


    // $ANTLR start "ruleSineOscillator"
    // InternalSynthesizer.g:615:1: ruleSineOscillator returns [EObject current=null] : (otherlv_0= 'sineOscillator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) otherlv_5= 'amplitude' ( (lv_amplitude_6_0= RULE_INT ) ) otherlv_7= ')' ) ;
    public final EObject ruleSineOscillator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_frequency_4_0=null;
        Token otherlv_5=null;
        Token lv_amplitude_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalSynthesizer.g:621:2: ( (otherlv_0= 'sineOscillator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) otherlv_5= 'amplitude' ( (lv_amplitude_6_0= RULE_INT ) ) otherlv_7= ')' ) )
            // InternalSynthesizer.g:622:2: (otherlv_0= 'sineOscillator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) otherlv_5= 'amplitude' ( (lv_amplitude_6_0= RULE_INT ) ) otherlv_7= ')' )
            {
            // InternalSynthesizer.g:622:2: (otherlv_0= 'sineOscillator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) otherlv_5= 'amplitude' ( (lv_amplitude_6_0= RULE_INT ) ) otherlv_7= ')' )
            // InternalSynthesizer.g:623:3: otherlv_0= 'sineOscillator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) otherlv_5= 'amplitude' ( (lv_amplitude_6_0= RULE_INT ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getSineOscillatorAccess().getSineOscillatorKeyword_0());
            		
            // InternalSynthesizer.g:627:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSynthesizer.g:628:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSynthesizer.g:628:4: (lv_name_1_0= RULE_ID )
            // InternalSynthesizer.g:629:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSineOscillatorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSineOscillatorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getSineOscillatorAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getSineOscillatorAccess().getFrequencyKeyword_3());
            		
            // InternalSynthesizer.g:653:3: ( (lv_frequency_4_0= RULE_INT ) )
            // InternalSynthesizer.g:654:4: (lv_frequency_4_0= RULE_INT )
            {
            // InternalSynthesizer.g:654:4: (lv_frequency_4_0= RULE_INT )
            // InternalSynthesizer.g:655:5: lv_frequency_4_0= RULE_INT
            {
            lv_frequency_4_0=(Token)match(input,RULE_INT,FOLLOW_23); 

            					newLeafNode(lv_frequency_4_0, grammarAccess.getSineOscillatorAccess().getFrequencyINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSineOscillatorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"frequency",
            						lv_frequency_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,31,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getSineOscillatorAccess().getAmplitudeKeyword_5());
            		
            // InternalSynthesizer.g:675:3: ( (lv_amplitude_6_0= RULE_INT ) )
            // InternalSynthesizer.g:676:4: (lv_amplitude_6_0= RULE_INT )
            {
            // InternalSynthesizer.g:676:4: (lv_amplitude_6_0= RULE_INT )
            // InternalSynthesizer.g:677:5: lv_amplitude_6_0= RULE_INT
            {
            lv_amplitude_6_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            					newLeafNode(lv_amplitude_6_0, grammarAccess.getSineOscillatorAccess().getAmplitudeINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSineOscillatorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"amplitude",
            						lv_amplitude_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSineOscillatorAccess().getRightParenthesisKeyword_7());
            		

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
    // $ANTLR end "ruleSineOscillator"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000062000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000044002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});

}