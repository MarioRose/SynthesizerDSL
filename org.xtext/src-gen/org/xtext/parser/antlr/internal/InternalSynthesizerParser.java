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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Controls{'", "'}'", "'rotaryKnob'", "'('", "'x'", "'y'", "'width'", "'height'", "')'", "'slider'", "'button'", "'frequency'"
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
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
    // InternalSynthesizer.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'Controls{' ( (lv_controls_1_0= ruleControlElement ) )* otherlv_2= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_controls_1_0 = null;



        	enterRule();

        try {
            // InternalSynthesizer.g:77:2: ( (otherlv_0= 'Controls{' ( (lv_controls_1_0= ruleControlElement ) )* otherlv_2= '}' ) )
            // InternalSynthesizer.g:78:2: (otherlv_0= 'Controls{' ( (lv_controls_1_0= ruleControlElement ) )* otherlv_2= '}' )
            {
            // InternalSynthesizer.g:78:2: (otherlv_0= 'Controls{' ( (lv_controls_1_0= ruleControlElement ) )* otherlv_2= '}' )
            // InternalSynthesizer.g:79:3: otherlv_0= 'Controls{' ( (lv_controls_1_0= ruleControlElement ) )* otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getControlsKeyword_0());
            		
            // InternalSynthesizer.g:83:3: ( (lv_controls_1_0= ruleControlElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13||(LA1_0>=20 && LA1_0<=21)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSynthesizer.g:84:4: (lv_controls_1_0= ruleControlElement )
            	    {
            	    // InternalSynthesizer.g:84:4: (lv_controls_1_0= ruleControlElement )
            	    // InternalSynthesizer.g:85:5: lv_controls_1_0= ruleControlElement
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getControlsControlElementParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_controls_1_0=ruleControlElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"controls",
            	    						lv_controls_1_0,
            	    						"org.xtext.Synthesizer.ControlElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_2());
            		

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
    // InternalSynthesizer.g:110:1: entryRuleControlElement returns [EObject current=null] : iv_ruleControlElement= ruleControlElement EOF ;
    public final EObject entryRuleControlElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlElement = null;


        try {
            // InternalSynthesizer.g:110:55: (iv_ruleControlElement= ruleControlElement EOF )
            // InternalSynthesizer.g:111:2: iv_ruleControlElement= ruleControlElement EOF
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
    // InternalSynthesizer.g:117:1: ruleControlElement returns [EObject current=null] : (this_Button_0= ruleButton | this_RotaryKnob_1= ruleRotaryKnob | this_Slider_2= ruleSlider ) ;
    public final EObject ruleControlElement() throws RecognitionException {
        EObject current = null;

        EObject this_Button_0 = null;

        EObject this_RotaryKnob_1 = null;

        EObject this_Slider_2 = null;



        	enterRule();

        try {
            // InternalSynthesizer.g:123:2: ( (this_Button_0= ruleButton | this_RotaryKnob_1= ruleRotaryKnob | this_Slider_2= ruleSlider ) )
            // InternalSynthesizer.g:124:2: (this_Button_0= ruleButton | this_RotaryKnob_1= ruleRotaryKnob | this_Slider_2= ruleSlider )
            {
            // InternalSynthesizer.g:124:2: (this_Button_0= ruleButton | this_RotaryKnob_1= ruleRotaryKnob | this_Slider_2= ruleSlider )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 20:
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
                    // InternalSynthesizer.g:125:3: this_Button_0= ruleButton
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
                    // InternalSynthesizer.g:134:3: this_RotaryKnob_1= ruleRotaryKnob
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
                    // InternalSynthesizer.g:143:3: this_Slider_2= ruleSlider
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
    // InternalSynthesizer.g:155:1: entryRuleRotaryKnob returns [EObject current=null] : iv_ruleRotaryKnob= ruleRotaryKnob EOF ;
    public final EObject entryRuleRotaryKnob() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotaryKnob = null;


        try {
            // InternalSynthesizer.g:155:51: (iv_ruleRotaryKnob= ruleRotaryKnob EOF )
            // InternalSynthesizer.g:156:2: iv_ruleRotaryKnob= ruleRotaryKnob EOF
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
    // InternalSynthesizer.g:162:1: ruleRotaryKnob returns [EObject current=null] : (otherlv_0= 'rotaryKnob' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= 'width' ( (lv_width_8_0= RULE_INT ) ) otherlv_9= 'height' ( (lv_height_10_0= RULE_INT ) ) otherlv_11= ')' ) ;
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


        	enterRule();

        try {
            // InternalSynthesizer.g:168:2: ( (otherlv_0= 'rotaryKnob' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= 'width' ( (lv_width_8_0= RULE_INT ) ) otherlv_9= 'height' ( (lv_height_10_0= RULE_INT ) ) otherlv_11= ')' ) )
            // InternalSynthesizer.g:169:2: (otherlv_0= 'rotaryKnob' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= 'width' ( (lv_width_8_0= RULE_INT ) ) otherlv_9= 'height' ( (lv_height_10_0= RULE_INT ) ) otherlv_11= ')' )
            {
            // InternalSynthesizer.g:169:2: (otherlv_0= 'rotaryKnob' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= 'width' ( (lv_width_8_0= RULE_INT ) ) otherlv_9= 'height' ( (lv_height_10_0= RULE_INT ) ) otherlv_11= ')' )
            // InternalSynthesizer.g:170:3: otherlv_0= 'rotaryKnob' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= 'width' ( (lv_width_8_0= RULE_INT ) ) otherlv_9= 'height' ( (lv_height_10_0= RULE_INT ) ) otherlv_11= ')'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRotaryKnobAccess().getRotaryKnobKeyword_0());
            		
            // InternalSynthesizer.g:174:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSynthesizer.g:175:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSynthesizer.g:175:4: (lv_name_1_0= RULE_ID )
            // InternalSynthesizer.g:176:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getRotaryKnobAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getRotaryKnobAccess().getXKeyword_3());
            		
            // InternalSynthesizer.g:200:3: ( (lv_x_4_0= RULE_INT ) )
            // InternalSynthesizer.g:201:4: (lv_x_4_0= RULE_INT )
            {
            // InternalSynthesizer.g:201:4: (lv_x_4_0= RULE_INT )
            // InternalSynthesizer.g:202:5: lv_x_4_0= RULE_INT
            {
            lv_x_4_0=(Token)match(input,RULE_INT,FOLLOW_8); 

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

            otherlv_5=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getRotaryKnobAccess().getYKeyword_5());
            		
            // InternalSynthesizer.g:222:3: ( (lv_y_6_0= RULE_INT ) )
            // InternalSynthesizer.g:223:4: (lv_y_6_0= RULE_INT )
            {
            // InternalSynthesizer.g:223:4: (lv_y_6_0= RULE_INT )
            // InternalSynthesizer.g:224:5: lv_y_6_0= RULE_INT
            {
            lv_y_6_0=(Token)match(input,RULE_INT,FOLLOW_9); 

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

            otherlv_7=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getRotaryKnobAccess().getWidthKeyword_7());
            		
            // InternalSynthesizer.g:244:3: ( (lv_width_8_0= RULE_INT ) )
            // InternalSynthesizer.g:245:4: (lv_width_8_0= RULE_INT )
            {
            // InternalSynthesizer.g:245:4: (lv_width_8_0= RULE_INT )
            // InternalSynthesizer.g:246:5: lv_width_8_0= RULE_INT
            {
            lv_width_8_0=(Token)match(input,RULE_INT,FOLLOW_10); 

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

            otherlv_9=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getRotaryKnobAccess().getHeightKeyword_9());
            		
            // InternalSynthesizer.g:266:3: ( (lv_height_10_0= RULE_INT ) )
            // InternalSynthesizer.g:267:4: (lv_height_10_0= RULE_INT )
            {
            // InternalSynthesizer.g:267:4: (lv_height_10_0= RULE_INT )
            // InternalSynthesizer.g:268:5: lv_height_10_0= RULE_INT
            {
            lv_height_10_0=(Token)match(input,RULE_INT,FOLLOW_11); 

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

            otherlv_11=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getRotaryKnobAccess().getRightParenthesisKeyword_11());
            		

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
    // InternalSynthesizer.g:292:1: entryRuleSlider returns [EObject current=null] : iv_ruleSlider= ruleSlider EOF ;
    public final EObject entryRuleSlider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlider = null;


        try {
            // InternalSynthesizer.g:292:47: (iv_ruleSlider= ruleSlider EOF )
            // InternalSynthesizer.g:293:2: iv_ruleSlider= ruleSlider EOF
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
    // InternalSynthesizer.g:299:1: ruleSlider returns [EObject current=null] : (otherlv_0= 'slider' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= 'width' ( (lv_width_8_0= RULE_INT ) ) otherlv_9= 'height' ( (lv_height_10_0= RULE_INT ) ) otherlv_11= ')' ) ;
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


        	enterRule();

        try {
            // InternalSynthesizer.g:305:2: ( (otherlv_0= 'slider' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= 'width' ( (lv_width_8_0= RULE_INT ) ) otherlv_9= 'height' ( (lv_height_10_0= RULE_INT ) ) otherlv_11= ')' ) )
            // InternalSynthesizer.g:306:2: (otherlv_0= 'slider' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= 'width' ( (lv_width_8_0= RULE_INT ) ) otherlv_9= 'height' ( (lv_height_10_0= RULE_INT ) ) otherlv_11= ')' )
            {
            // InternalSynthesizer.g:306:2: (otherlv_0= 'slider' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= 'width' ( (lv_width_8_0= RULE_INT ) ) otherlv_9= 'height' ( (lv_height_10_0= RULE_INT ) ) otherlv_11= ')' )
            // InternalSynthesizer.g:307:3: otherlv_0= 'slider' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= 'width' ( (lv_width_8_0= RULE_INT ) ) otherlv_9= 'height' ( (lv_height_10_0= RULE_INT ) ) otherlv_11= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSliderAccess().getSliderKeyword_0());
            		
            // InternalSynthesizer.g:311:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSynthesizer.g:312:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSynthesizer.g:312:4: (lv_name_1_0= RULE_ID )
            // InternalSynthesizer.g:313:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getSliderAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getSliderAccess().getXKeyword_3());
            		
            // InternalSynthesizer.g:337:3: ( (lv_x_4_0= RULE_INT ) )
            // InternalSynthesizer.g:338:4: (lv_x_4_0= RULE_INT )
            {
            // InternalSynthesizer.g:338:4: (lv_x_4_0= RULE_INT )
            // InternalSynthesizer.g:339:5: lv_x_4_0= RULE_INT
            {
            lv_x_4_0=(Token)match(input,RULE_INT,FOLLOW_8); 

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

            otherlv_5=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getSliderAccess().getYKeyword_5());
            		
            // InternalSynthesizer.g:359:3: ( (lv_y_6_0= RULE_INT ) )
            // InternalSynthesizer.g:360:4: (lv_y_6_0= RULE_INT )
            {
            // InternalSynthesizer.g:360:4: (lv_y_6_0= RULE_INT )
            // InternalSynthesizer.g:361:5: lv_y_6_0= RULE_INT
            {
            lv_y_6_0=(Token)match(input,RULE_INT,FOLLOW_9); 

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

            otherlv_7=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getSliderAccess().getWidthKeyword_7());
            		
            // InternalSynthesizer.g:381:3: ( (lv_width_8_0= RULE_INT ) )
            // InternalSynthesizer.g:382:4: (lv_width_8_0= RULE_INT )
            {
            // InternalSynthesizer.g:382:4: (lv_width_8_0= RULE_INT )
            // InternalSynthesizer.g:383:5: lv_width_8_0= RULE_INT
            {
            lv_width_8_0=(Token)match(input,RULE_INT,FOLLOW_10); 

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

            otherlv_9=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getSliderAccess().getHeightKeyword_9());
            		
            // InternalSynthesizer.g:403:3: ( (lv_height_10_0= RULE_INT ) )
            // InternalSynthesizer.g:404:4: (lv_height_10_0= RULE_INT )
            {
            // InternalSynthesizer.g:404:4: (lv_height_10_0= RULE_INT )
            // InternalSynthesizer.g:405:5: lv_height_10_0= RULE_INT
            {
            lv_height_10_0=(Token)match(input,RULE_INT,FOLLOW_11); 

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

            otherlv_11=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getSliderAccess().getRightParenthesisKeyword_11());
            		

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


    // $ANTLR start "entryRuleButton"
    // InternalSynthesizer.g:429:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // InternalSynthesizer.g:429:47: (iv_ruleButton= ruleButton EOF )
            // InternalSynthesizer.g:430:2: iv_ruleButton= ruleButton EOF
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
    // InternalSynthesizer.g:436:1: ruleButton returns [EObject current=null] : (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= 'width' ( (lv_width_8_0= RULE_INT ) ) otherlv_9= 'height' ( (lv_height_10_0= RULE_INT ) ) otherlv_11= 'frequency' ( (lv_frequency_12_0= RULE_INT ) ) otherlv_13= ')' ) ;
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
            // InternalSynthesizer.g:442:2: ( (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= 'width' ( (lv_width_8_0= RULE_INT ) ) otherlv_9= 'height' ( (lv_height_10_0= RULE_INT ) ) otherlv_11= 'frequency' ( (lv_frequency_12_0= RULE_INT ) ) otherlv_13= ')' ) )
            // InternalSynthesizer.g:443:2: (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= 'width' ( (lv_width_8_0= RULE_INT ) ) otherlv_9= 'height' ( (lv_height_10_0= RULE_INT ) ) otherlv_11= 'frequency' ( (lv_frequency_12_0= RULE_INT ) ) otherlv_13= ')' )
            {
            // InternalSynthesizer.g:443:2: (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= 'width' ( (lv_width_8_0= RULE_INT ) ) otherlv_9= 'height' ( (lv_height_10_0= RULE_INT ) ) otherlv_11= 'frequency' ( (lv_frequency_12_0= RULE_INT ) ) otherlv_13= ')' )
            // InternalSynthesizer.g:444:3: otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= 'width' ( (lv_width_8_0= RULE_INT ) ) otherlv_9= 'height' ( (lv_height_10_0= RULE_INT ) ) otherlv_11= 'frequency' ( (lv_frequency_12_0= RULE_INT ) ) otherlv_13= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getButtonAccess().getButtonKeyword_0());
            		
            // InternalSynthesizer.g:448:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSynthesizer.g:449:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSynthesizer.g:449:4: (lv_name_1_0= RULE_ID )
            // InternalSynthesizer.g:450:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getButtonAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getButtonAccess().getXKeyword_3());
            		
            // InternalSynthesizer.g:474:3: ( (lv_x_4_0= RULE_INT ) )
            // InternalSynthesizer.g:475:4: (lv_x_4_0= RULE_INT )
            {
            // InternalSynthesizer.g:475:4: (lv_x_4_0= RULE_INT )
            // InternalSynthesizer.g:476:5: lv_x_4_0= RULE_INT
            {
            lv_x_4_0=(Token)match(input,RULE_INT,FOLLOW_8); 

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

            otherlv_5=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getButtonAccess().getYKeyword_5());
            		
            // InternalSynthesizer.g:496:3: ( (lv_y_6_0= RULE_INT ) )
            // InternalSynthesizer.g:497:4: (lv_y_6_0= RULE_INT )
            {
            // InternalSynthesizer.g:497:4: (lv_y_6_0= RULE_INT )
            // InternalSynthesizer.g:498:5: lv_y_6_0= RULE_INT
            {
            lv_y_6_0=(Token)match(input,RULE_INT,FOLLOW_9); 

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

            otherlv_7=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getButtonAccess().getWidthKeyword_7());
            		
            // InternalSynthesizer.g:518:3: ( (lv_width_8_0= RULE_INT ) )
            // InternalSynthesizer.g:519:4: (lv_width_8_0= RULE_INT )
            {
            // InternalSynthesizer.g:519:4: (lv_width_8_0= RULE_INT )
            // InternalSynthesizer.g:520:5: lv_width_8_0= RULE_INT
            {
            lv_width_8_0=(Token)match(input,RULE_INT,FOLLOW_10); 

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

            otherlv_9=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getButtonAccess().getHeightKeyword_9());
            		
            // InternalSynthesizer.g:540:3: ( (lv_height_10_0= RULE_INT ) )
            // InternalSynthesizer.g:541:4: (lv_height_10_0= RULE_INT )
            {
            // InternalSynthesizer.g:541:4: (lv_height_10_0= RULE_INT )
            // InternalSynthesizer.g:542:5: lv_height_10_0= RULE_INT
            {
            lv_height_10_0=(Token)match(input,RULE_INT,FOLLOW_12); 

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

            otherlv_11=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_11, grammarAccess.getButtonAccess().getFrequencyKeyword_11());
            		
            // InternalSynthesizer.g:562:3: ( (lv_frequency_12_0= RULE_INT ) )
            // InternalSynthesizer.g:563:4: (lv_frequency_12_0= RULE_INT )
            {
            // InternalSynthesizer.g:563:4: (lv_frequency_12_0= RULE_INT )
            // InternalSynthesizer.g:564:5: lv_frequency_12_0= RULE_INT
            {
            lv_frequency_12_0=(Token)match(input,RULE_INT,FOLLOW_11); 

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

            otherlv_13=(Token)match(input,19,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000303000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});

}