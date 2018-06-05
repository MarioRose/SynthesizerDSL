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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Controls'", "'{'", "'}'", "'Sound'", "'Connections'", "'rotaryKnob'", "'('", "'x'", "'y'", "'width'", "'height'", "'sound'", "'effect'", "')'", "'slider'", "'frequency'", "'amplitude'", "'button'", "'linear'", "'sawToothOscillator'", "'sineOscillator'", "'triangleOscillator'", "'squareOscillator'", "'pulseOscillator'"
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

                if ( (LA1_0==16||LA1_0==25||LA1_0==28) ) {
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

                        if ( ((LA2_0>=30 && LA2_0<=35)) ) {
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

                        if ( (LA4_0==29) ) {
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
    // InternalSynthesizer.g:187:1: ruleControlElement returns [EObject current=null] : (this_Button_0= ruleButton | this_RotaryKnob_1= ruleRotaryKnob | this_Slider_2= ruleSlider ) ;
    public final EObject ruleControlElement() throws RecognitionException {
        EObject current = null;

        EObject this_Button_0 = null;

        EObject this_RotaryKnob_1 = null;

        EObject this_Slider_2 = null;



        	enterRule();

        try {
            // InternalSynthesizer.g:193:2: ( (this_Button_0= ruleButton | this_RotaryKnob_1= ruleRotaryKnob | this_Slider_2= ruleSlider ) )
            // InternalSynthesizer.g:194:2: (this_Button_0= ruleButton | this_RotaryKnob_1= ruleRotaryKnob | this_Slider_2= ruleSlider )
            {
            // InternalSynthesizer.g:194:2: (this_Button_0= ruleButton | this_RotaryKnob_1= ruleRotaryKnob | this_Slider_2= ruleSlider )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt6=1;
                }
                break;
            case 16:
                {
                alt6=2;
                }
                break;
            case 25:
                {
                alt6=3;
                }
                break;
            default:
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
                    // InternalSynthesizer.g:204:3: this_RotaryKnob_1= ruleRotaryKnob
                    {

                    			newCompositeNode(grammarAccess.getControlElementAccess().getRotaryKnobParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RotaryKnob_1=ruleRotaryKnob();

                    state._fsp--;


                    			current = this_RotaryKnob_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSynthesizer.g:213:3: this_Slider_2= ruleSlider
                    {

                    			newCompositeNode(grammarAccess.getControlElementAccess().getSliderParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Slider_2=ruleSlider();

                    state._fsp--;


                    			current = this_Slider_2;
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


    // $ANTLR start "entryRuleRotaryKnob"
    // InternalSynthesizer.g:225:1: entryRuleRotaryKnob returns [EObject current=null] : iv_ruleRotaryKnob= ruleRotaryKnob EOF ;
    public final EObject entryRuleRotaryKnob() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotaryKnob = null;


        try {
            // InternalSynthesizer.g:225:51: (iv_ruleRotaryKnob= ruleRotaryKnob EOF )
            // InternalSynthesizer.g:226:2: iv_ruleRotaryKnob= ruleRotaryKnob EOF
            {
             newCompositeNode(grammarAccess.getRotaryKnobRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRotaryKnob=ruleRotaryKnob();

            state._fsp--;

             current =iv_ruleRotaryKnob; 
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
    // InternalSynthesizer.g:232:1: ruleRotaryKnob returns [EObject current=null] : (otherlv_0= 'rotaryKnob' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= 'width' ( (lv_width_8_0= RULE_INT ) ) otherlv_9= 'height' ( (lv_height_10_0= RULE_INT ) ) otherlv_11= 'sound' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'effect' ( (lv_type_14_0= ruleEffect ) ) otherlv_15= ')' ) ;
    public final EObject ruleRotaryKnob() throws RecognitionException {
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
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_type_14_0 = null;



        	enterRule();

        try {
            // InternalSynthesizer.g:238:2: ( (otherlv_0= 'rotaryKnob' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= 'width' ( (lv_width_8_0= RULE_INT ) ) otherlv_9= 'height' ( (lv_height_10_0= RULE_INT ) ) otherlv_11= 'sound' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'effect' ( (lv_type_14_0= ruleEffect ) ) otherlv_15= ')' ) )
            // InternalSynthesizer.g:239:2: (otherlv_0= 'rotaryKnob' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= 'width' ( (lv_width_8_0= RULE_INT ) ) otherlv_9= 'height' ( (lv_height_10_0= RULE_INT ) ) otherlv_11= 'sound' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'effect' ( (lv_type_14_0= ruleEffect ) ) otherlv_15= ')' )
            {
            // InternalSynthesizer.g:239:2: (otherlv_0= 'rotaryKnob' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= 'width' ( (lv_width_8_0= RULE_INT ) ) otherlv_9= 'height' ( (lv_height_10_0= RULE_INT ) ) otherlv_11= 'sound' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'effect' ( (lv_type_14_0= ruleEffect ) ) otherlv_15= ')' )
            // InternalSynthesizer.g:240:3: otherlv_0= 'rotaryKnob' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= 'width' ( (lv_width_8_0= RULE_INT ) ) otherlv_9= 'height' ( (lv_height_10_0= RULE_INT ) ) otherlv_11= 'sound' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'effect' ( (lv_type_14_0= ruleEffect ) ) otherlv_15= ')'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRotaryKnobAccess().getRotaryKnobKeyword_0());
            		
            // InternalSynthesizer.g:244:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSynthesizer.g:245:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSynthesizer.g:245:4: (lv_name_1_0= RULE_ID )
            // InternalSynthesizer.g:246:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRotaryKnobAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRotaryKnobRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getRotaryKnobAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getRotaryKnobAccess().getXKeyword_3());
            		
            // InternalSynthesizer.g:270:3: ( (lv_x_4_0= RULE_INT ) )
            // InternalSynthesizer.g:271:4: (lv_x_4_0= RULE_INT )
            {
            // InternalSynthesizer.g:271:4: (lv_x_4_0= RULE_INT )
            // InternalSynthesizer.g:272:5: lv_x_4_0= RULE_INT
            {
            lv_x_4_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_x_4_0, grammarAccess.getRotaryKnobAccess().getXINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRotaryKnobRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getRotaryKnobAccess().getYKeyword_5());
            		
            // InternalSynthesizer.g:292:3: ( (lv_y_6_0= RULE_INT ) )
            // InternalSynthesizer.g:293:4: (lv_y_6_0= RULE_INT )
            {
            // InternalSynthesizer.g:293:4: (lv_y_6_0= RULE_INT )
            // InternalSynthesizer.g:294:5: lv_y_6_0= RULE_INT
            {
            lv_y_6_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            					newLeafNode(lv_y_6_0, grammarAccess.getRotaryKnobAccess().getYINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRotaryKnobRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getRotaryKnobAccess().getWidthKeyword_7());
            		
            // InternalSynthesizer.g:314:3: ( (lv_width_8_0= RULE_INT ) )
            // InternalSynthesizer.g:315:4: (lv_width_8_0= RULE_INT )
            {
            // InternalSynthesizer.g:315:4: (lv_width_8_0= RULE_INT )
            // InternalSynthesizer.g:316:5: lv_width_8_0= RULE_INT
            {
            lv_width_8_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_width_8_0, grammarAccess.getRotaryKnobAccess().getWidthINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRotaryKnobRule());
            					}
            					setWithLastConsumed(
            						current,
            						"width",
            						lv_width_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_9=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getRotaryKnobAccess().getHeightKeyword_9());
            		
            // InternalSynthesizer.g:336:3: ( (lv_height_10_0= RULE_INT ) )
            // InternalSynthesizer.g:337:4: (lv_height_10_0= RULE_INT )
            {
            // InternalSynthesizer.g:337:4: (lv_height_10_0= RULE_INT )
            // InternalSynthesizer.g:338:5: lv_height_10_0= RULE_INT
            {
            lv_height_10_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_height_10_0, grammarAccess.getRotaryKnobAccess().getHeightINTTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRotaryKnobRule());
            					}
            					setWithLastConsumed(
            						current,
            						"height",
            						lv_height_10_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_11=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_11, grammarAccess.getRotaryKnobAccess().getSoundKeyword_11());
            		
            // InternalSynthesizer.g:358:3: ( (otherlv_12= RULE_ID ) )
            // InternalSynthesizer.g:359:4: (otherlv_12= RULE_ID )
            {
            // InternalSynthesizer.g:359:4: (otherlv_12= RULE_ID )
            // InternalSynthesizer.g:360:5: otherlv_12= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRotaryKnobRule());
            					}
            				
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_12, grammarAccess.getRotaryKnobAccess().getSoundSoundElementCrossReference_12_0());
            				

            }


            }

            otherlv_13=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_13, grammarAccess.getRotaryKnobAccess().getEffectKeyword_13());
            		
            // InternalSynthesizer.g:375:3: ( (lv_type_14_0= ruleEffect ) )
            // InternalSynthesizer.g:376:4: (lv_type_14_0= ruleEffect )
            {
            // InternalSynthesizer.g:376:4: (lv_type_14_0= ruleEffect )
            // InternalSynthesizer.g:377:5: lv_type_14_0= ruleEffect
            {

            					newCompositeNode(grammarAccess.getRotaryKnobAccess().getTypeEffectParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_19);
            lv_type_14_0=ruleEffect();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotaryKnobRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_14_0,
            						"org.xtext.Synthesizer.Effect");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getRotaryKnobAccess().getRightParenthesisKeyword_15());
            		

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
    // $ANTLR end "ruleRotaryKnob"


    // $ANTLR start "entryRuleSlider"
    // InternalSynthesizer.g:402:1: entryRuleSlider returns [EObject current=null] : iv_ruleSlider= ruleSlider EOF ;
    public final EObject entryRuleSlider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlider = null;


        try {
            // InternalSynthesizer.g:402:47: (iv_ruleSlider= ruleSlider EOF )
            // InternalSynthesizer.g:403:2: iv_ruleSlider= ruleSlider EOF
            {
             newCompositeNode(grammarAccess.getSliderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSlider=ruleSlider();

            state._fsp--;

             current =iv_ruleSlider; 
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
    // $ANTLR end "entryRuleSlider"


    // $ANTLR start "ruleSlider"
    // InternalSynthesizer.g:409:1: ruleSlider returns [EObject current=null] : (otherlv_0= 'slider' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= 'width' ( (lv_width_8_0= RULE_INT ) ) otherlv_9= 'height' ( (lv_height_10_0= RULE_INT ) ) otherlv_11= 'sound' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'effect' ( (lv_type_14_0= ruleEffect ) ) otherlv_15= ')' ) ;
    public final EObject ruleSlider() throws RecognitionException {
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
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_type_14_0 = null;



        	enterRule();

        try {
            // InternalSynthesizer.g:415:2: ( (otherlv_0= 'slider' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= 'width' ( (lv_width_8_0= RULE_INT ) ) otherlv_9= 'height' ( (lv_height_10_0= RULE_INT ) ) otherlv_11= 'sound' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'effect' ( (lv_type_14_0= ruleEffect ) ) otherlv_15= ')' ) )
            // InternalSynthesizer.g:416:2: (otherlv_0= 'slider' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= 'width' ( (lv_width_8_0= RULE_INT ) ) otherlv_9= 'height' ( (lv_height_10_0= RULE_INT ) ) otherlv_11= 'sound' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'effect' ( (lv_type_14_0= ruleEffect ) ) otherlv_15= ')' )
            {
            // InternalSynthesizer.g:416:2: (otherlv_0= 'slider' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= 'width' ( (lv_width_8_0= RULE_INT ) ) otherlv_9= 'height' ( (lv_height_10_0= RULE_INT ) ) otherlv_11= 'sound' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'effect' ( (lv_type_14_0= ruleEffect ) ) otherlv_15= ')' )
            // InternalSynthesizer.g:417:3: otherlv_0= 'slider' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= 'width' ( (lv_width_8_0= RULE_INT ) ) otherlv_9= 'height' ( (lv_height_10_0= RULE_INT ) ) otherlv_11= 'sound' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'effect' ( (lv_type_14_0= ruleEffect ) ) otherlv_15= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSliderAccess().getSliderKeyword_0());
            		
            // InternalSynthesizer.g:421:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSynthesizer.g:422:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSynthesizer.g:422:4: (lv_name_1_0= RULE_ID )
            // InternalSynthesizer.g:423:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSliderAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSliderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getSliderAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getSliderAccess().getXKeyword_3());
            		
            // InternalSynthesizer.g:447:3: ( (lv_x_4_0= RULE_INT ) )
            // InternalSynthesizer.g:448:4: (lv_x_4_0= RULE_INT )
            {
            // InternalSynthesizer.g:448:4: (lv_x_4_0= RULE_INT )
            // InternalSynthesizer.g:449:5: lv_x_4_0= RULE_INT
            {
            lv_x_4_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_x_4_0, grammarAccess.getSliderAccess().getXINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSliderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getSliderAccess().getYKeyword_5());
            		
            // InternalSynthesizer.g:469:3: ( (lv_y_6_0= RULE_INT ) )
            // InternalSynthesizer.g:470:4: (lv_y_6_0= RULE_INT )
            {
            // InternalSynthesizer.g:470:4: (lv_y_6_0= RULE_INT )
            // InternalSynthesizer.g:471:5: lv_y_6_0= RULE_INT
            {
            lv_y_6_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            					newLeafNode(lv_y_6_0, grammarAccess.getSliderAccess().getYINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSliderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getSliderAccess().getWidthKeyword_7());
            		
            // InternalSynthesizer.g:491:3: ( (lv_width_8_0= RULE_INT ) )
            // InternalSynthesizer.g:492:4: (lv_width_8_0= RULE_INT )
            {
            // InternalSynthesizer.g:492:4: (lv_width_8_0= RULE_INT )
            // InternalSynthesizer.g:493:5: lv_width_8_0= RULE_INT
            {
            lv_width_8_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_width_8_0, grammarAccess.getSliderAccess().getWidthINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSliderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"width",
            						lv_width_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_9=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getSliderAccess().getHeightKeyword_9());
            		
            // InternalSynthesizer.g:513:3: ( (lv_height_10_0= RULE_INT ) )
            // InternalSynthesizer.g:514:4: (lv_height_10_0= RULE_INT )
            {
            // InternalSynthesizer.g:514:4: (lv_height_10_0= RULE_INT )
            // InternalSynthesizer.g:515:5: lv_height_10_0= RULE_INT
            {
            lv_height_10_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_height_10_0, grammarAccess.getSliderAccess().getHeightINTTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSliderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"height",
            						lv_height_10_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_11=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_11, grammarAccess.getSliderAccess().getSoundKeyword_11());
            		
            // InternalSynthesizer.g:535:3: ( (otherlv_12= RULE_ID ) )
            // InternalSynthesizer.g:536:4: (otherlv_12= RULE_ID )
            {
            // InternalSynthesizer.g:536:4: (otherlv_12= RULE_ID )
            // InternalSynthesizer.g:537:5: otherlv_12= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSliderRule());
            					}
            				
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_12, grammarAccess.getSliderAccess().getSoundSoundElementCrossReference_12_0());
            				

            }


            }

            otherlv_13=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_13, grammarAccess.getSliderAccess().getEffectKeyword_13());
            		
            // InternalSynthesizer.g:552:3: ( (lv_type_14_0= ruleEffect ) )
            // InternalSynthesizer.g:553:4: (lv_type_14_0= ruleEffect )
            {
            // InternalSynthesizer.g:553:4: (lv_type_14_0= ruleEffect )
            // InternalSynthesizer.g:554:5: lv_type_14_0= ruleEffect
            {

            					newCompositeNode(grammarAccess.getSliderAccess().getTypeEffectParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_19);
            lv_type_14_0=ruleEffect();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSliderRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_14_0,
            						"org.xtext.Synthesizer.Effect");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getSliderAccess().getRightParenthesisKeyword_15());
            		

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
    // $ANTLR end "ruleSlider"


    // $ANTLR start "entryRuleEffect"
    // InternalSynthesizer.g:579:1: entryRuleEffect returns [String current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final String entryRuleEffect() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEffect = null;


        try {
            // InternalSynthesizer.g:579:46: (iv_ruleEffect= ruleEffect EOF )
            // InternalSynthesizer.g:580:2: iv_ruleEffect= ruleEffect EOF
            {
             newCompositeNode(grammarAccess.getEffectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffect=ruleEffect();

            state._fsp--;

             current =iv_ruleEffect.getText(); 
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
    // $ANTLR end "entryRuleEffect"


    // $ANTLR start "ruleEffect"
    // InternalSynthesizer.g:586:1: ruleEffect returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'frequency' | kw= 'amplitude' ) ;
    public final AntlrDatatypeRuleToken ruleEffect() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSynthesizer.g:592:2: ( (kw= 'frequency' | kw= 'amplitude' ) )
            // InternalSynthesizer.g:593:2: (kw= 'frequency' | kw= 'amplitude' )
            {
            // InternalSynthesizer.g:593:2: (kw= 'frequency' | kw= 'amplitude' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            else if ( (LA7_0==27) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSynthesizer.g:594:3: kw= 'frequency'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEffectAccess().getFrequencyKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSynthesizer.g:600:3: kw= 'amplitude'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEffectAccess().getAmplitudeKeyword_1());
                    		

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
    // $ANTLR end "ruleEffect"


    // $ANTLR start "entryRuleSoundElement"
    // InternalSynthesizer.g:609:1: entryRuleSoundElement returns [EObject current=null] : iv_ruleSoundElement= ruleSoundElement EOF ;
    public final EObject entryRuleSoundElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoundElement = null;


        try {
            // InternalSynthesizer.g:609:53: (iv_ruleSoundElement= ruleSoundElement EOF )
            // InternalSynthesizer.g:610:2: iv_ruleSoundElement= ruleSoundElement EOF
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
    // InternalSynthesizer.g:616:1: ruleSoundElement returns [EObject current=null] : (this_SawToothOscillator_0= ruleSawToothOscillator | this_SineOscillator_1= ruleSineOscillator | this_TriangleOscillator_2= ruleTriangleOscillator | this_SquareOscillator_3= ruleSquareOscillator | this_PulseOscillator_4= rulePulseOscillator ) ;
    public final EObject ruleSoundElement() throws RecognitionException {
        EObject current = null;

        EObject this_SawToothOscillator_0 = null;

        EObject this_SineOscillator_1 = null;

        EObject this_TriangleOscillator_2 = null;

        EObject this_SquareOscillator_3 = null;

        EObject this_PulseOscillator_4 = null;

        EObject this_ImpulseOscillator_5 = null;



        	enterRule();

        try {
            // InternalSynthesizer.g:622:2: ( (this_SawToothOscillator_0= ruleSawToothOscillator | this_SineOscillator_1= ruleSineOscillator | this_TriangleOscillator_2= ruleTriangleOscillator | this_SquareOscillator_3= ruleSquareOscillator | this_PulseOscillator_4= rulePulseOscillator ) )
            // InternalSynthesizer.g:623:2: (this_SawToothOscillator_0= ruleSawToothOscillator | this_SineOscillator_1= ruleSineOscillator | this_TriangleOscillator_2= ruleTriangleOscillator | this_SquareOscillator_3= ruleSquareOscillator | this_PulseOscillator_4= rulePulseOscillator )
            {
            // InternalSynthesizer.g:623:2: (this_SawToothOscillator_0= ruleSawToothOscillator | this_SineOscillator_1= ruleSineOscillator | this_TriangleOscillator_2= ruleTriangleOscillator | this_SquareOscillator_3= ruleSquareOscillator | this_PulseOscillator_4= rulePulseOscillator )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt8=1;
                }
                break;
            case 31:
                {
                alt8=2;
                }
                break;
            case 32:
                {
                alt8=3;
                }
                break;
            case 33:
                {
                alt8=4;
                }
                break;
            case 34:
                {
                alt8=5;
                }
                break;
            case 35:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalSynthesizer.g:624:3: this_SawToothOscillator_0= ruleSawToothOscillator
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
                    // InternalSynthesizer.g:633:3: this_SineOscillator_1= ruleSineOscillator
                    {

                    			newCompositeNode(grammarAccess.getSoundElementAccess().getSineOscillatorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SineOscillator_1=ruleSineOscillator();

                    state._fsp--;


                    			current = this_SineOscillator_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSynthesizer.g:642:3: this_TriangleOscillator_2= ruleTriangleOscillator
                    {

                    			newCompositeNode(grammarAccess.getSoundElementAccess().getTriangleOscillatorParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_TriangleOscillator_2=ruleTriangleOscillator();

                    state._fsp--;


                    			current = this_TriangleOscillator_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSynthesizer.g:651:3: this_SquareOscillator_3= ruleSquareOscillator
                    {

                    			newCompositeNode(grammarAccess.getSoundElementAccess().getSquareOscillatorParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_SquareOscillator_3=ruleSquareOscillator();

                    state._fsp--;


                    			current = this_SquareOscillator_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSynthesizer.g:660:3: this_PulseOscillator_4= rulePulseOscillator
                    {

                    			newCompositeNode(grammarAccess.getSoundElementAccess().getPulseOscillatorParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_PulseOscillator_4=rulePulseOscillator();

                    state._fsp--;


                    			current = this_PulseOscillator_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSynthesizer.g:629:3: this_ImpulseOscillator_5= ruleImpulseOscillator
                    {

                    			newCompositeNode(grammarAccess.getSoundElementAccess().getImpulseOscillatorParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImpulseOscillator_5=ruleImpulseOscillator();

                    state._fsp--;


                    			current = this_ImpulseOscillator_5;
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


    // $ANTLR start "entryRuleButton"
    // InternalSynthesizer.g:672:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // InternalSynthesizer.g:672:47: (iv_ruleButton= ruleButton EOF )
            // InternalSynthesizer.g:673:2: iv_ruleButton= ruleButton EOF
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
    // InternalSynthesizer.g:679:1: ruleButton returns [EObject current=null] : (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= 'width' ( (lv_width_8_0= RULE_INT ) ) otherlv_9= 'height' ( (lv_height_10_0= RULE_INT ) ) otherlv_11= 'sound' ( (otherlv_12= RULE_ID ) ) otherlv_13= ')' ) ;
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
        Token otherlv_12=null;
        Token otherlv_13=null;


        	enterRule();

        try {
            // InternalSynthesizer.g:685:2: ( (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= 'width' ( (lv_width_8_0= RULE_INT ) ) otherlv_9= 'height' ( (lv_height_10_0= RULE_INT ) ) otherlv_11= 'sound' ( (otherlv_12= RULE_ID ) ) otherlv_13= ')' ) )
            // InternalSynthesizer.g:686:2: (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= 'width' ( (lv_width_8_0= RULE_INT ) ) otherlv_9= 'height' ( (lv_height_10_0= RULE_INT ) ) otherlv_11= 'sound' ( (otherlv_12= RULE_ID ) ) otherlv_13= ')' )
            {
            // InternalSynthesizer.g:686:2: (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= 'width' ( (lv_width_8_0= RULE_INT ) ) otherlv_9= 'height' ( (lv_height_10_0= RULE_INT ) ) otherlv_11= 'sound' ( (otherlv_12= RULE_ID ) ) otherlv_13= ')' )
            // InternalSynthesizer.g:687:3: otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= 'width' ( (lv_width_8_0= RULE_INT ) ) otherlv_9= 'height' ( (lv_height_10_0= RULE_INT ) ) otherlv_11= 'sound' ( (otherlv_12= RULE_ID ) ) otherlv_13= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getButtonAccess().getButtonKeyword_0());
            		
            // InternalSynthesizer.g:691:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSynthesizer.g:692:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSynthesizer.g:692:4: (lv_name_1_0= RULE_ID )
            // InternalSynthesizer.g:693:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getButtonAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getButtonAccess().getXKeyword_3());
            		
            // InternalSynthesizer.g:717:3: ( (lv_x_4_0= RULE_INT ) )
            // InternalSynthesizer.g:718:4: (lv_x_4_0= RULE_INT )
            {
            // InternalSynthesizer.g:718:4: (lv_x_4_0= RULE_INT )
            // InternalSynthesizer.g:719:5: lv_x_4_0= RULE_INT
            {
            lv_x_4_0=(Token)match(input,RULE_INT,FOLLOW_13); 

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

            otherlv_5=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getButtonAccess().getYKeyword_5());
            		
            // InternalSynthesizer.g:739:3: ( (lv_y_6_0= RULE_INT ) )
            // InternalSynthesizer.g:740:4: (lv_y_6_0= RULE_INT )
            {
            // InternalSynthesizer.g:740:4: (lv_y_6_0= RULE_INT )
            // InternalSynthesizer.g:741:5: lv_y_6_0= RULE_INT
            {
            lv_y_6_0=(Token)match(input,RULE_INT,FOLLOW_14); 

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

            otherlv_7=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getButtonAccess().getWidthKeyword_7());
            		
            // InternalSynthesizer.g:761:3: ( (lv_width_8_0= RULE_INT ) )
            // InternalSynthesizer.g:762:4: (lv_width_8_0= RULE_INT )
            {
            // InternalSynthesizer.g:762:4: (lv_width_8_0= RULE_INT )
            // InternalSynthesizer.g:763:5: lv_width_8_0= RULE_INT
            {
            lv_width_8_0=(Token)match(input,RULE_INT,FOLLOW_15); 

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

            otherlv_9=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getButtonAccess().getHeightKeyword_9());
            		
            // InternalSynthesizer.g:783:3: ( (lv_height_10_0= RULE_INT ) )
            // InternalSynthesizer.g:784:4: (lv_height_10_0= RULE_INT )
            {
            // InternalSynthesizer.g:784:4: (lv_height_10_0= RULE_INT )
            // InternalSynthesizer.g:785:5: lv_height_10_0= RULE_INT
            {
            lv_height_10_0=(Token)match(input,RULE_INT,FOLLOW_16); 

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

            otherlv_11=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_11, grammarAccess.getButtonAccess().getSoundKeyword_11());
            		
            // InternalSynthesizer.g:805:3: ( (otherlv_12= RULE_ID ) )
            // InternalSynthesizer.g:806:4: (otherlv_12= RULE_ID )
            {
            // InternalSynthesizer.g:806:4: (otherlv_12= RULE_ID )
            // InternalSynthesizer.g:807:5: otherlv_12= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getButtonRule());
            					}
            				
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_12, grammarAccess.getButtonAccess().getSoundSoundElementCrossReference_12_0());
            				

            }


            }

            otherlv_13=(Token)match(input,24,FOLLOW_2); 

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


    // $ANTLR start "entryRuleConnectionElement"
    // InternalSynthesizer.g:826:1: entryRuleConnectionElement returns [EObject current=null] : iv_ruleConnectionElement= ruleConnectionElement EOF ;
    public final EObject entryRuleConnectionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectionElement = null;


        try {
            // InternalSynthesizer.g:826:58: (iv_ruleConnectionElement= ruleConnectionElement EOF )
            // InternalSynthesizer.g:827:2: iv_ruleConnectionElement= ruleConnectionElement EOF
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
    // InternalSynthesizer.g:833:1: ruleConnectionElement returns [EObject current=null] : (otherlv_0= 'linear' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleConnectionElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSynthesizer.g:839:2: ( (otherlv_0= 'linear' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ) )
            // InternalSynthesizer.g:840:2: (otherlv_0= 'linear' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalSynthesizer.g:840:2: (otherlv_0= 'linear' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) )
            // InternalSynthesizer.g:841:3: otherlv_0= 'linear' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getConnectionElementAccess().getLinearKeyword_0());
            		
            // InternalSynthesizer.g:845:3: ( (otherlv_1= RULE_ID ) )
            // InternalSynthesizer.g:846:4: (otherlv_1= RULE_ID )
            {
            // InternalSynthesizer.g:846:4: (otherlv_1= RULE_ID )
            // InternalSynthesizer.g:847:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectionElementRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_1, grammarAccess.getConnectionElementAccess().getCeControlElementCrossReference_1_0());
            				

            }


            }

            // InternalSynthesizer.g:858:3: ( (otherlv_2= RULE_ID ) )
            // InternalSynthesizer.g:859:4: (otherlv_2= RULE_ID )
            {
            // InternalSynthesizer.g:859:4: (otherlv_2= RULE_ID )
            // InternalSynthesizer.g:860:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectionElementRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getConnectionElementAccess().getSeSoundElementCrossReference_2_0());
            				

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


    // $ANTLR start "entryRuleSawToothOscillator"
    // InternalSynthesizer.g:875:1: entryRuleSawToothOscillator returns [EObject current=null] : iv_ruleSawToothOscillator= ruleSawToothOscillator EOF ;
    public final EObject entryRuleSawToothOscillator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSawToothOscillator = null;


        try {
            // InternalSynthesizer.g:875:59: (iv_ruleSawToothOscillator= ruleSawToothOscillator EOF )
            // InternalSynthesizer.g:876:2: iv_ruleSawToothOscillator= ruleSawToothOscillator EOF
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
    // InternalSynthesizer.g:882:1: ruleSawToothOscillator returns [EObject current=null] : (otherlv_0= 'sawToothOscillator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) otherlv_5= 'amplitude' ( (lv_amplitude_6_0= RULE_INT ) ) otherlv_7= ')' ) ;
    public final EObject ruleSawToothOscillator() throws RecognitionException {
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
            // InternalSynthesizer.g:888:2: ( (otherlv_0= 'sawToothOscillator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) otherlv_5= 'amplitude' ( (lv_amplitude_6_0= RULE_INT ) ) otherlv_7= ')' ) )
            // InternalSynthesizer.g:889:2: (otherlv_0= 'sawToothOscillator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) otherlv_5= 'amplitude' ( (lv_amplitude_6_0= RULE_INT ) ) otherlv_7= ')' )
            {
            // InternalSynthesizer.g:889:2: (otherlv_0= 'sawToothOscillator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) otherlv_5= 'amplitude' ( (lv_amplitude_6_0= RULE_INT ) ) otherlv_7= ')' )
            // InternalSynthesizer.g:890:3: otherlv_0= 'sawToothOscillator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) otherlv_5= 'amplitude' ( (lv_amplitude_6_0= RULE_INT ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSawToothOscillatorAccess().getSawToothOscillatorKeyword_0());
            		
            // InternalSynthesizer.g:894:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSynthesizer.g:895:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSynthesizer.g:895:4: (lv_name_1_0= RULE_ID )
            // InternalSynthesizer.g:896:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getSawToothOscillatorAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getSawToothOscillatorAccess().getFrequencyKeyword_3());
            		
            // InternalSynthesizer.g:920:3: ( (lv_frequency_4_0= RULE_INT ) )
            // InternalSynthesizer.g:921:4: (lv_frequency_4_0= RULE_INT )
            {
            // InternalSynthesizer.g:921:4: (lv_frequency_4_0= RULE_INT )
            // InternalSynthesizer.g:922:5: lv_frequency_4_0= RULE_INT
            {
            lv_frequency_4_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            					newLeafNode(lv_frequency_4_0, grammarAccess.getSawToothOscillatorAccess().getFrequencyINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSawToothOscillatorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"frequency",
            						lv_frequency_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getSawToothOscillatorAccess().getAmplitudeKeyword_5());
            		
            // InternalSynthesizer.g:942:3: ( (lv_amplitude_6_0= RULE_INT ) )
            // InternalSynthesizer.g:943:4: (lv_amplitude_6_0= RULE_INT )
            {
            // InternalSynthesizer.g:943:4: (lv_amplitude_6_0= RULE_INT )
            // InternalSynthesizer.g:944:5: lv_amplitude_6_0= RULE_INT
            {
            lv_amplitude_6_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            					newLeafNode(lv_amplitude_6_0, grammarAccess.getSawToothOscillatorAccess().getAmplitudeINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSawToothOscillatorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"amplitude",
            						lv_amplitude_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSawToothOscillatorAccess().getRightParenthesisKeyword_7());
            		

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
    // InternalSynthesizer.g:968:1: entryRuleSineOscillator returns [EObject current=null] : iv_ruleSineOscillator= ruleSineOscillator EOF ;
    public final EObject entryRuleSineOscillator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSineOscillator = null;


        try {
            // InternalSynthesizer.g:968:55: (iv_ruleSineOscillator= ruleSineOscillator EOF )
            // InternalSynthesizer.g:969:2: iv_ruleSineOscillator= ruleSineOscillator EOF
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
    // InternalSynthesizer.g:975:1: ruleSineOscillator returns [EObject current=null] : (otherlv_0= 'sineOscillator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) otherlv_5= 'amplitude' ( (lv_amplitude_6_0= RULE_INT ) ) otherlv_7= ')' ) ;
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
            // InternalSynthesizer.g:981:2: ( (otherlv_0= 'sineOscillator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) otherlv_5= 'amplitude' ( (lv_amplitude_6_0= RULE_INT ) ) otherlv_7= ')' ) )
            // InternalSynthesizer.g:982:2: (otherlv_0= 'sineOscillator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) otherlv_5= 'amplitude' ( (lv_amplitude_6_0= RULE_INT ) ) otherlv_7= ')' )
            {
            // InternalSynthesizer.g:982:2: (otherlv_0= 'sineOscillator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) otherlv_5= 'amplitude' ( (lv_amplitude_6_0= RULE_INT ) ) otherlv_7= ')' )
            // InternalSynthesizer.g:983:3: otherlv_0= 'sineOscillator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) otherlv_5= 'amplitude' ( (lv_amplitude_6_0= RULE_INT ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSineOscillatorAccess().getSineOscillatorKeyword_0());
            		
            // InternalSynthesizer.g:987:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSynthesizer.g:988:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSynthesizer.g:988:4: (lv_name_1_0= RULE_ID )
            // InternalSynthesizer.g:989:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getSineOscillatorAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getSineOscillatorAccess().getFrequencyKeyword_3());
            		
            // InternalSynthesizer.g:1013:3: ( (lv_frequency_4_0= RULE_INT ) )
            // InternalSynthesizer.g:1014:4: (lv_frequency_4_0= RULE_INT )
            {
            // InternalSynthesizer.g:1014:4: (lv_frequency_4_0= RULE_INT )
            // InternalSynthesizer.g:1015:5: lv_frequency_4_0= RULE_INT
            {
            lv_frequency_4_0=(Token)match(input,RULE_INT,FOLLOW_21); 

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

            otherlv_5=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getSineOscillatorAccess().getAmplitudeKeyword_5());
            		
            // InternalSynthesizer.g:1035:3: ( (lv_amplitude_6_0= RULE_INT ) )
            // InternalSynthesizer.g:1036:4: (lv_amplitude_6_0= RULE_INT )
            {
            // InternalSynthesizer.g:1036:4: (lv_amplitude_6_0= RULE_INT )
            // InternalSynthesizer.g:1037:5: lv_amplitude_6_0= RULE_INT
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

            otherlv_7=(Token)match(input,24,FOLLOW_2); 

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


    // $ANTLR start "entryRuleTriangleOscillator"
    // InternalSynthesizer.g:1061:1: entryRuleTriangleOscillator returns [EObject current=null] : iv_ruleTriangleOscillator= ruleTriangleOscillator EOF ;
    public final EObject entryRuleTriangleOscillator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriangleOscillator = null;


        try {
            // InternalSynthesizer.g:1061:59: (iv_ruleTriangleOscillator= ruleTriangleOscillator EOF )
            // InternalSynthesizer.g:1062:2: iv_ruleTriangleOscillator= ruleTriangleOscillator EOF
            {
             newCompositeNode(grammarAccess.getTriangleOscillatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTriangleOscillator=ruleTriangleOscillator();

            state._fsp--;

             current =iv_ruleTriangleOscillator; 
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
    // $ANTLR end "entryRuleTriangleOscillator"


    // $ANTLR start "ruleTriangleOscillator"
    // InternalSynthesizer.g:1068:1: ruleTriangleOscillator returns [EObject current=null] : (otherlv_0= 'triangleOscillator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) otherlv_5= 'amplitude' ( (lv_amplitude_6_0= RULE_INT ) ) otherlv_7= ')' ) ;
    public final EObject ruleTriangleOscillator() throws RecognitionException {
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
            // InternalSynthesizer.g:1074:2: ( (otherlv_0= 'triangleOscillator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) otherlv_5= 'amplitude' ( (lv_amplitude_6_0= RULE_INT ) ) otherlv_7= ')' ) )
            // InternalSynthesizer.g:1075:2: (otherlv_0= 'triangleOscillator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) otherlv_5= 'amplitude' ( (lv_amplitude_6_0= RULE_INT ) ) otherlv_7= ')' )
            {
            // InternalSynthesizer.g:1075:2: (otherlv_0= 'triangleOscillator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) otherlv_5= 'amplitude' ( (lv_amplitude_6_0= RULE_INT ) ) otherlv_7= ')' )
            // InternalSynthesizer.g:1076:3: otherlv_0= 'triangleOscillator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) otherlv_5= 'amplitude' ( (lv_amplitude_6_0= RULE_INT ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getTriangleOscillatorAccess().getTriangleOscillatorKeyword_0());
            		
            // InternalSynthesizer.g:1080:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSynthesizer.g:1081:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSynthesizer.g:1081:4: (lv_name_1_0= RULE_ID )
            // InternalSynthesizer.g:1082:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTriangleOscillatorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTriangleOscillatorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getTriangleOscillatorAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getTriangleOscillatorAccess().getFrequencyKeyword_3());
            		
            // InternalSynthesizer.g:1106:3: ( (lv_frequency_4_0= RULE_INT ) )
            // InternalSynthesizer.g:1107:4: (lv_frequency_4_0= RULE_INT )
            {
            // InternalSynthesizer.g:1107:4: (lv_frequency_4_0= RULE_INT )
            // InternalSynthesizer.g:1108:5: lv_frequency_4_0= RULE_INT
            {
            lv_frequency_4_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            					newLeafNode(lv_frequency_4_0, grammarAccess.getTriangleOscillatorAccess().getFrequencyINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTriangleOscillatorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"frequency",
            						lv_frequency_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getTriangleOscillatorAccess().getAmplitudeKeyword_5());
            		
            // InternalSynthesizer.g:1128:3: ( (lv_amplitude_6_0= RULE_INT ) )
            // InternalSynthesizer.g:1129:4: (lv_amplitude_6_0= RULE_INT )
            {
            // InternalSynthesizer.g:1129:4: (lv_amplitude_6_0= RULE_INT )
            // InternalSynthesizer.g:1130:5: lv_amplitude_6_0= RULE_INT
            {
            lv_amplitude_6_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            					newLeafNode(lv_amplitude_6_0, grammarAccess.getTriangleOscillatorAccess().getAmplitudeINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTriangleOscillatorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"amplitude",
            						lv_amplitude_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getTriangleOscillatorAccess().getRightParenthesisKeyword_7());
            		

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
    // $ANTLR end "ruleTriangleOscillator"


    // $ANTLR start "entryRuleSquareOscillator"
    // InternalSynthesizer.g:1154:1: entryRuleSquareOscillator returns [EObject current=null] : iv_ruleSquareOscillator= ruleSquareOscillator EOF ;
    public final EObject entryRuleSquareOscillator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSquareOscillator = null;


        try {
            // InternalSynthesizer.g:1154:57: (iv_ruleSquareOscillator= ruleSquareOscillator EOF )
            // InternalSynthesizer.g:1155:2: iv_ruleSquareOscillator= ruleSquareOscillator EOF
            {
             newCompositeNode(grammarAccess.getSquareOscillatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSquareOscillator=ruleSquareOscillator();

            state._fsp--;

             current =iv_ruleSquareOscillator; 
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
    // $ANTLR end "entryRuleSquareOscillator"


    // $ANTLR start "ruleSquareOscillator"
    // InternalSynthesizer.g:1161:1: ruleSquareOscillator returns [EObject current=null] : (otherlv_0= 'squareOscillator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) otherlv_5= 'amplitude' ( (lv_amplitude_6_0= RULE_INT ) ) otherlv_7= ')' ) ;
    public final EObject ruleSquareOscillator() throws RecognitionException {
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
            // InternalSynthesizer.g:1167:2: ( (otherlv_0= 'squareOscillator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) otherlv_5= 'amplitude' ( (lv_amplitude_6_0= RULE_INT ) ) otherlv_7= ')' ) )
            // InternalSynthesizer.g:1168:2: (otherlv_0= 'squareOscillator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) otherlv_5= 'amplitude' ( (lv_amplitude_6_0= RULE_INT ) ) otherlv_7= ')' )
            {
            // InternalSynthesizer.g:1168:2: (otherlv_0= 'squareOscillator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) otherlv_5= 'amplitude' ( (lv_amplitude_6_0= RULE_INT ) ) otherlv_7= ')' )
            // InternalSynthesizer.g:1169:3: otherlv_0= 'squareOscillator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) otherlv_5= 'amplitude' ( (lv_amplitude_6_0= RULE_INT ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSquareOscillatorAccess().getSquareOscillatorKeyword_0());
            		
            // InternalSynthesizer.g:1173:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSynthesizer.g:1174:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSynthesizer.g:1174:4: (lv_name_1_0= RULE_ID )
            // InternalSynthesizer.g:1175:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSquareOscillatorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSquareOscillatorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getSquareOscillatorAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getSquareOscillatorAccess().getFrequencyKeyword_3());
            		
            // InternalSynthesizer.g:1199:3: ( (lv_frequency_4_0= RULE_INT ) )
            // InternalSynthesizer.g:1200:4: (lv_frequency_4_0= RULE_INT )
            {
            // InternalSynthesizer.g:1200:4: (lv_frequency_4_0= RULE_INT )
            // InternalSynthesizer.g:1201:5: lv_frequency_4_0= RULE_INT
            {
            lv_frequency_4_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            					newLeafNode(lv_frequency_4_0, grammarAccess.getSquareOscillatorAccess().getFrequencyINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSquareOscillatorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"frequency",
            						lv_frequency_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getSquareOscillatorAccess().getAmplitudeKeyword_5());
            		
            // InternalSynthesizer.g:1221:3: ( (lv_amplitude_6_0= RULE_INT ) )
            // InternalSynthesizer.g:1222:4: (lv_amplitude_6_0= RULE_INT )
            {
            // InternalSynthesizer.g:1222:4: (lv_amplitude_6_0= RULE_INT )
            // InternalSynthesizer.g:1223:5: lv_amplitude_6_0= RULE_INT
            {
            lv_amplitude_6_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            					newLeafNode(lv_amplitude_6_0, grammarAccess.getSquareOscillatorAccess().getAmplitudeINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSquareOscillatorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"amplitude",
            						lv_amplitude_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSquareOscillatorAccess().getRightParenthesisKeyword_7());
            		

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
    // $ANTLR end "ruleSquareOscillator"


    // $ANTLR start "entryRulePulseOscillator"
    // InternalSynthesizer.g:1247:1: entryRulePulseOscillator returns [EObject current=null] : iv_rulePulseOscillator= rulePulseOscillator EOF ;
    public final EObject entryRulePulseOscillator() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePulseOscillator = null;


        try {
            // InternalSynthesizer.g:1247:56: (iv_rulePulseOscillator= rulePulseOscillator EOF )
            // InternalSynthesizer.g:1248:2: iv_rulePulseOscillator= rulePulseOscillator EOF
            {
             newCompositeNode(grammarAccess.getPulseOscillatorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePulseOscillator=rulePulseOscillator();

            state._fsp--;

             current =iv_rulePulseOscillator; 
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
    // $ANTLR end "entryRulePulseOscillator"


    // $ANTLR start "rulePulseOscillator"
    // InternalSynthesizer.g:1254:1: rulePulseOscillator returns [EObject current=null] : (otherlv_0= 'pulseOscillator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) otherlv_5= 'amplitude' ( (lv_amplitude_6_0= RULE_INT ) ) otherlv_7= ')' ) ;
    public final EObject rulePulseOscillator() throws RecognitionException {
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
            // InternalSynthesizer.g:1260:2: ( (otherlv_0= 'pulseOscillator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) otherlv_5= 'amplitude' ( (lv_amplitude_6_0= RULE_INT ) ) otherlv_7= ')' ) )
            // InternalSynthesizer.g:1261:2: (otherlv_0= 'pulseOscillator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) otherlv_5= 'amplitude' ( (lv_amplitude_6_0= RULE_INT ) ) otherlv_7= ')' )
            {
            // InternalSynthesizer.g:1261:2: (otherlv_0= 'pulseOscillator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) otherlv_5= 'amplitude' ( (lv_amplitude_6_0= RULE_INT ) ) otherlv_7= ')' )
            // InternalSynthesizer.g:1262:3: otherlv_0= 'pulseOscillator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) otherlv_5= 'amplitude' ( (lv_amplitude_6_0= RULE_INT ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPulseOscillatorAccess().getPulseOscillatorKeyword_0());
            		
            // InternalSynthesizer.g:1266:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSynthesizer.g:1267:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSynthesizer.g:1267:4: (lv_name_1_0= RULE_ID )
            // InternalSynthesizer.g:1268:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPulseOscillatorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPulseOscillatorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getPulseOscillatorAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getPulseOscillatorAccess().getFrequencyKeyword_3());
            		
            // InternalSynthesizer.g:1292:3: ( (lv_frequency_4_0= RULE_INT ) )
            // InternalSynthesizer.g:1293:4: (lv_frequency_4_0= RULE_INT )
            {
            // InternalSynthesizer.g:1293:4: (lv_frequency_4_0= RULE_INT )
            // InternalSynthesizer.g:1294:5: lv_frequency_4_0= RULE_INT
            {
            lv_frequency_4_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            					newLeafNode(lv_frequency_4_0, grammarAccess.getPulseOscillatorAccess().getFrequencyINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPulseOscillatorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"frequency",
            						lv_frequency_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getPulseOscillatorAccess().getAmplitudeKeyword_5());
            		
            // InternalSynthesizer.g:1314:3: ( (lv_amplitude_6_0= RULE_INT ) )
            // InternalSynthesizer.g:1315:4: (lv_amplitude_6_0= RULE_INT )
            {
            // InternalSynthesizer.g:1315:4: (lv_amplitude_6_0= RULE_INT )
            // InternalSynthesizer.g:1316:5: lv_amplitude_6_0= RULE_INT
            {
            lv_amplitude_6_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            					newLeafNode(lv_amplitude_6_0, grammarAccess.getPulseOscillatorAccess().getAmplitudeINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPulseOscillatorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"amplitude",
            						lv_amplitude_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getPulseOscillatorAccess().getRightParenthesisKeyword_7());
            		

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
    // $ANTLR end "rulePulseOscillator"


    // $ANTLR start "entryRuleImpulseOscillator"
    // InternalSynthesizer.g:1309:1: entryRuleImpulseOscillator returns [EObject current=null] : iv_ruleImpulseOscillator= ruleImpulseOscillator EOF ;
    public final EObject entryRuleImpulseOscillator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpulseOscillator = null;


        try {
            // InternalSynthesizer.g:1309:58: (iv_ruleImpulseOscillator= ruleImpulseOscillator EOF )
            // InternalSynthesizer.g:1310:2: iv_ruleImpulseOscillator= ruleImpulseOscillator EOF
            {
             newCompositeNode(grammarAccess.getImpulseOscillatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImpulseOscillator=ruleImpulseOscillator();

            state._fsp--;

             current =iv_ruleImpulseOscillator; 
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
    // $ANTLR end "entryRuleImpulseOscillator"


    // $ANTLR start "ruleImpulseOscillator"
    // InternalSynthesizer.g:1316:1: ruleImpulseOscillator returns [EObject current=null] : (otherlv_0= 'impulseOscillator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) otherlv_5= 'amplitude' ( (lv_amplitude_6_0= RULE_INT ) ) otherlv_7= ')' ) ;
    public final EObject ruleImpulseOscillator() throws RecognitionException {
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
            // InternalSynthesizer.g:1322:2: ( (otherlv_0= 'impulseOscillator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) otherlv_5= 'amplitude' ( (lv_amplitude_6_0= RULE_INT ) ) otherlv_7= ')' ) )
            // InternalSynthesizer.g:1323:2: (otherlv_0= 'impulseOscillator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) otherlv_5= 'amplitude' ( (lv_amplitude_6_0= RULE_INT ) ) otherlv_7= ')' )
            {
            // InternalSynthesizer.g:1323:2: (otherlv_0= 'impulseOscillator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) otherlv_5= 'amplitude' ( (lv_amplitude_6_0= RULE_INT ) ) otherlv_7= ')' )
            // InternalSynthesizer.g:1324:3: otherlv_0= 'impulseOscillator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) otherlv_5= 'amplitude' ( (lv_amplitude_6_0= RULE_INT ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getImpulseOscillatorAccess().getImpulseOscillatorKeyword_0());
            		
            // InternalSynthesizer.g:1328:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSynthesizer.g:1329:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSynthesizer.g:1329:4: (lv_name_1_0= RULE_ID )
            // InternalSynthesizer.g:1330:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getImpulseOscillatorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImpulseOscillatorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getImpulseOscillatorAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getImpulseOscillatorAccess().getFrequencyKeyword_3());
            		
            // InternalSynthesizer.g:1354:3: ( (lv_frequency_4_0= RULE_INT ) )
            // InternalSynthesizer.g:1355:4: (lv_frequency_4_0= RULE_INT )
            {
            // InternalSynthesizer.g:1355:4: (lv_frequency_4_0= RULE_INT )
            // InternalSynthesizer.g:1356:5: lv_frequency_4_0= RULE_INT
            {
            lv_frequency_4_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            					newLeafNode(lv_frequency_4_0, grammarAccess.getImpulseOscillatorAccess().getFrequencyINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImpulseOscillatorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"frequency",
            						lv_frequency_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getImpulseOscillatorAccess().getAmplitudeKeyword_5());
            		
            // InternalSynthesizer.g:1376:3: ( (lv_amplitude_6_0= RULE_INT ) )
            // InternalSynthesizer.g:1377:4: (lv_amplitude_6_0= RULE_INT )
            {
            // InternalSynthesizer.g:1377:4: (lv_amplitude_6_0= RULE_INT )
            // InternalSynthesizer.g:1378:5: lv_amplitude_6_0= RULE_INT
            {
            lv_amplitude_6_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_amplitude_6_0, grammarAccess.getImpulseOscillatorAccess().getAmplitudeINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImpulseOscillatorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"amplitude",
            						lv_amplitude_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getImpulseOscillatorAccess().getRightParenthesisKeyword_7());
            		

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
    // $ANTLR end "ruleImpulseOscillator"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000012012000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000FC0002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000020002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});

}