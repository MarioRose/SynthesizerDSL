/*
 * generated by Xtext 2.12.0
 */
grammar InternalSynthesizer;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Controls'
		{
			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getControlsKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getControlsControlElementParserRuleCall_2_0());
				}
				lv_controls_2_0=ruleControlElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"controls",
						lv_controls_2_0,
						"org.xtext.Synthesizer.ControlElement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3());
		}
		(
			otherlv_4='Sound'
			{
				newLeafNode(otherlv_4, grammarAccess.getModelAccess().getSoundKeyword_4_0());
			}
			otherlv_5='{'
			{
				newLeafNode(otherlv_5, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_4_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getSoundsSoundElementParserRuleCall_4_2_0());
					}
					lv_sounds_6_0=ruleSoundElement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						add(
							$current,
							"sounds",
							lv_sounds_6_0,
							"org.xtext.Synthesizer.SoundElement");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_7='}'
			{
				newLeafNode(otherlv_7, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4_3());
			}
		)?
		(
			otherlv_8='Connections'
			{
				newLeafNode(otherlv_8, grammarAccess.getModelAccess().getConnectionsKeyword_5_0());
			}
			otherlv_9='{'
			{
				newLeafNode(otherlv_9, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_5_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getConnectionsConnectionElementParserRuleCall_5_2_0());
					}
					lv_connections_10_0=ruleConnectionElement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						add(
							$current,
							"connections",
							lv_connections_10_0,
							"org.xtext.Synthesizer.ConnectionElement");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_11='}'
			{
				newLeafNode(otherlv_11, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5_3());
			}
		)?
	)
;

// Entry rule entryRuleControlElement
entryRuleControlElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getControlElementRule()); }
	iv_ruleControlElement=ruleControlElement
	{ $current=$iv_ruleControlElement.current; }
	EOF;

// Rule ControlElement
ruleControlElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getControlElementAccess().getButtonParserRuleCall_0());
		}
		this_Button_0=ruleButton
		{
			$current = $this_Button_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getControlElementAccess().getRotaryKnobParserRuleCall_1());
		}
		this_RotaryKnob_1=ruleRotaryKnob
		{
			$current = $this_RotaryKnob_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getControlElementAccess().getSliderParserRuleCall_2());
		}
		this_Slider_2=ruleSlider
		{
			$current = $this_Slider_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleRotaryKnob
entryRuleRotaryKnob returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRotaryKnobRule()); }
	iv_ruleRotaryKnob=ruleRotaryKnob
	{ $current=$iv_ruleRotaryKnob.current; }
	EOF;

// Rule RotaryKnob
ruleRotaryKnob returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='rotaryKnob'
		{
			newLeafNode(otherlv_0, grammarAccess.getRotaryKnobAccess().getRotaryKnobKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getRotaryKnobAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRotaryKnobRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getRotaryKnobAccess().getLeftParenthesisKeyword_2());
		}
		otherlv_3='x'
		{
			newLeafNode(otherlv_3, grammarAccess.getRotaryKnobAccess().getXKeyword_3());
		}
		(
			(
				lv_x_4_0=RULE_INT
				{
					newLeafNode(lv_x_4_0, grammarAccess.getRotaryKnobAccess().getXINTTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRotaryKnobRule());
					}
					setWithLastConsumed(
						$current,
						"x",
						lv_x_4_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_5='y'
		{
			newLeafNode(otherlv_5, grammarAccess.getRotaryKnobAccess().getYKeyword_5());
		}
		(
			(
				lv_y_6_0=RULE_INT
				{
					newLeafNode(lv_y_6_0, grammarAccess.getRotaryKnobAccess().getYINTTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRotaryKnobRule());
					}
					setWithLastConsumed(
						$current,
						"y",
						lv_y_6_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_7='width'
		{
			newLeafNode(otherlv_7, grammarAccess.getRotaryKnobAccess().getWidthKeyword_7());
		}
		(
			(
				lv_width_8_0=RULE_INT
				{
					newLeafNode(lv_width_8_0, grammarAccess.getRotaryKnobAccess().getWidthINTTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRotaryKnobRule());
					}
					setWithLastConsumed(
						$current,
						"width",
						lv_width_8_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_9='height'
		{
			newLeafNode(otherlv_9, grammarAccess.getRotaryKnobAccess().getHeightKeyword_9());
		}
		(
			(
				lv_height_10_0=RULE_INT
				{
					newLeafNode(lv_height_10_0, grammarAccess.getRotaryKnobAccess().getHeightINTTerminalRuleCall_10_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRotaryKnobRule());
					}
					setWithLastConsumed(
						$current,
						"height",
						lv_height_10_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_11=')'
		{
			newLeafNode(otherlv_11, grammarAccess.getRotaryKnobAccess().getRightParenthesisKeyword_11());
		}
	)
;

// Entry rule entryRuleSlider
entryRuleSlider returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSliderRule()); }
	iv_ruleSlider=ruleSlider
	{ $current=$iv_ruleSlider.current; }
	EOF;

// Rule Slider
ruleSlider returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='slider'
		{
			newLeafNode(otherlv_0, grammarAccess.getSliderAccess().getSliderKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getSliderAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSliderRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getSliderAccess().getLeftParenthesisKeyword_2());
		}
		otherlv_3='x'
		{
			newLeafNode(otherlv_3, grammarAccess.getSliderAccess().getXKeyword_3());
		}
		(
			(
				lv_x_4_0=RULE_INT
				{
					newLeafNode(lv_x_4_0, grammarAccess.getSliderAccess().getXINTTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSliderRule());
					}
					setWithLastConsumed(
						$current,
						"x",
						lv_x_4_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_5='y'
		{
			newLeafNode(otherlv_5, grammarAccess.getSliderAccess().getYKeyword_5());
		}
		(
			(
				lv_y_6_0=RULE_INT
				{
					newLeafNode(lv_y_6_0, grammarAccess.getSliderAccess().getYINTTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSliderRule());
					}
					setWithLastConsumed(
						$current,
						"y",
						lv_y_6_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_7='width'
		{
			newLeafNode(otherlv_7, grammarAccess.getSliderAccess().getWidthKeyword_7());
		}
		(
			(
				lv_width_8_0=RULE_INT
				{
					newLeafNode(lv_width_8_0, grammarAccess.getSliderAccess().getWidthINTTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSliderRule());
					}
					setWithLastConsumed(
						$current,
						"width",
						lv_width_8_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_9='height'
		{
			newLeafNode(otherlv_9, grammarAccess.getSliderAccess().getHeightKeyword_9());
		}
		(
			(
				lv_height_10_0=RULE_INT
				{
					newLeafNode(lv_height_10_0, grammarAccess.getSliderAccess().getHeightINTTerminalRuleCall_10_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSliderRule());
					}
					setWithLastConsumed(
						$current,
						"height",
						lv_height_10_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_11=')'
		{
			newLeafNode(otherlv_11, grammarAccess.getSliderAccess().getRightParenthesisKeyword_11());
		}
	)
;

// Entry rule entryRuleSoundElement
entryRuleSoundElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSoundElementRule()); }
	iv_ruleSoundElement=ruleSoundElement
	{ $current=$iv_ruleSoundElement.current; }
	EOF;

// Rule SoundElement
ruleSoundElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getSoundElementAccess().getSawToothOscillatorParserRuleCall_0());
		}
		this_SawToothOscillator_0=ruleSawToothOscillator
		{
			$current = $this_SawToothOscillator_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getSoundElementAccess().getSineOscillatorParserRuleCall_1());
		}
		this_SineOscillator_1=ruleSineOscillator
		{
			$current = $this_SineOscillator_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleButton
entryRuleButton returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getButtonRule()); }
	iv_ruleButton=ruleButton
	{ $current=$iv_ruleButton.current; }
	EOF;

// Rule Button
ruleButton returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='button'
		{
			newLeafNode(otherlv_0, grammarAccess.getButtonAccess().getButtonKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getButtonRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getButtonAccess().getLeftParenthesisKeyword_2());
		}
		otherlv_3='x'
		{
			newLeafNode(otherlv_3, grammarAccess.getButtonAccess().getXKeyword_3());
		}
		(
			(
				lv_x_4_0=RULE_INT
				{
					newLeafNode(lv_x_4_0, grammarAccess.getButtonAccess().getXINTTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getButtonRule());
					}
					setWithLastConsumed(
						$current,
						"x",
						lv_x_4_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_5='y'
		{
			newLeafNode(otherlv_5, grammarAccess.getButtonAccess().getYKeyword_5());
		}
		(
			(
				lv_y_6_0=RULE_INT
				{
					newLeafNode(lv_y_6_0, grammarAccess.getButtonAccess().getYINTTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getButtonRule());
					}
					setWithLastConsumed(
						$current,
						"y",
						lv_y_6_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_7='width'
		{
			newLeafNode(otherlv_7, grammarAccess.getButtonAccess().getWidthKeyword_7());
		}
		(
			(
				lv_width_8_0=RULE_INT
				{
					newLeafNode(lv_width_8_0, grammarAccess.getButtonAccess().getWidthINTTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getButtonRule());
					}
					setWithLastConsumed(
						$current,
						"width",
						lv_width_8_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_9='height'
		{
			newLeafNode(otherlv_9, grammarAccess.getButtonAccess().getHeightKeyword_9());
		}
		(
			(
				lv_height_10_0=RULE_INT
				{
					newLeafNode(lv_height_10_0, grammarAccess.getButtonAccess().getHeightINTTerminalRuleCall_10_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getButtonRule());
					}
					setWithLastConsumed(
						$current,
						"height",
						lv_height_10_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_11='sound'
		{
			newLeafNode(otherlv_11, grammarAccess.getButtonAccess().getSoundKeyword_11());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getButtonRule());
					}
				}
				otherlv_12=RULE_ID
				{
					newLeafNode(otherlv_12, grammarAccess.getButtonAccess().getSoundSoundElementCrossReference_12_0());
				}
			)
		)
		otherlv_13=')'
		{
			newLeafNode(otherlv_13, grammarAccess.getButtonAccess().getRightParenthesisKeyword_13());
		}
	)
;

// Entry rule entryRuleConnectionElement
entryRuleConnectionElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConnectionElementRule()); }
	iv_ruleConnectionElement=ruleConnectionElement
	{ $current=$iv_ruleConnectionElement.current; }
	EOF;

// Rule ConnectionElement
ruleConnectionElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='linear'
		{
			newLeafNode(otherlv_0, grammarAccess.getConnectionElementAccess().getLinearKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConnectionElementRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getConnectionElementAccess().getCeControlElementCrossReference_1_0());
				}
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConnectionElementRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getConnectionElementAccess().getSeSoundElementCrossReference_2_0());
				}
			)
		)
	)
;

// Entry rule entryRuleSawToothOscillator
entryRuleSawToothOscillator returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSawToothOscillatorRule()); }
	iv_ruleSawToothOscillator=ruleSawToothOscillator
	{ $current=$iv_ruleSawToothOscillator.current; }
	EOF;

// Rule SawToothOscillator
ruleSawToothOscillator returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='sawToothOscillator'
		{
			newLeafNode(otherlv_0, grammarAccess.getSawToothOscillatorAccess().getSawToothOscillatorKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getSawToothOscillatorAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSawToothOscillatorRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getSawToothOscillatorAccess().getLeftParenthesisKeyword_2());
		}
		otherlv_3='min'
		{
			newLeafNode(otherlv_3, grammarAccess.getSawToothOscillatorAccess().getMinKeyword_3());
		}
		(
			(
				lv_min_4_0=RULE_INT
				{
					newLeafNode(lv_min_4_0, grammarAccess.getSawToothOscillatorAccess().getMinINTTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSawToothOscillatorRule());
					}
					setWithLastConsumed(
						$current,
						"min",
						lv_min_4_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_5='max'
		{
			newLeafNode(otherlv_5, grammarAccess.getSawToothOscillatorAccess().getMaxKeyword_5());
		}
		(
			(
				lv_max_6_0=RULE_INT
				{
					newLeafNode(lv_max_6_0, grammarAccess.getSawToothOscillatorAccess().getMaxINTTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSawToothOscillatorRule());
					}
					setWithLastConsumed(
						$current,
						"max",
						lv_max_6_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_7='default'
		{
			newLeafNode(otherlv_7, grammarAccess.getSawToothOscillatorAccess().getDefaultKeyword_7());
		}
		(
			(
				lv_default_8_0=RULE_INT
				{
					newLeafNode(lv_default_8_0, grammarAccess.getSawToothOscillatorAccess().getDefaultINTTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSawToothOscillatorRule());
					}
					setWithLastConsumed(
						$current,
						"default",
						lv_default_8_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_9=')'
		{
			newLeafNode(otherlv_9, grammarAccess.getSawToothOscillatorAccess().getRightParenthesisKeyword_9());
		}
	)
;

// Entry rule entryRuleSineOscillator
entryRuleSineOscillator returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSineOscillatorRule()); }
	iv_ruleSineOscillator=ruleSineOscillator
	{ $current=$iv_ruleSineOscillator.current; }
	EOF;

// Rule SineOscillator
ruleSineOscillator returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='sineOscillator'
		{
			newLeafNode(otherlv_0, grammarAccess.getSineOscillatorAccess().getSineOscillatorKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getSineOscillatorAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSineOscillatorRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getSineOscillatorAccess().getLeftParenthesisKeyword_2());
		}
		otherlv_3='frequency'
		{
			newLeafNode(otherlv_3, grammarAccess.getSineOscillatorAccess().getFrequencyKeyword_3());
		}
		(
			(
				lv_frequency_4_0=RULE_INT
				{
					newLeafNode(lv_frequency_4_0, grammarAccess.getSineOscillatorAccess().getFrequencyINTTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSineOscillatorRule());
					}
					setWithLastConsumed(
						$current,
						"frequency",
						lv_frequency_4_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_5='amplitude'
		{
			newLeafNode(otherlv_5, grammarAccess.getSineOscillatorAccess().getAmplitudeKeyword_5());
		}
		(
			(
				lv_amplitude_6_0=RULE_INT
				{
					newLeafNode(lv_amplitude_6_0, grammarAccess.getSineOscillatorAccess().getAmplitudeINTTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSineOscillatorRule());
					}
					setWithLastConsumed(
						$current,
						"amplitude",
						lv_amplitude_6_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_7=')'
		{
			newLeafNode(otherlv_7, grammarAccess.getSineOscillatorAccess().getRightParenthesisKeyword_7());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
