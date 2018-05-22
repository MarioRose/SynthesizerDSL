/*
 * generated by Xtext 2.12.0
 */
grammar InternalSynthesizer;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getGroup()); }
		(rule__Model__Group__0)
		{ after(grammarAccess.getModelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleControlElement
entryRuleControlElement
:
{ before(grammarAccess.getControlElementRule()); }
	 ruleControlElement
{ after(grammarAccess.getControlElementRule()); } 
	 EOF 
;

// Rule ControlElement
ruleControlElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getControlElementAccess().getAlternatives()); }
		(rule__ControlElement__Alternatives)
		{ after(grammarAccess.getControlElementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRotaryKnob
entryRuleRotaryKnob
:
{ before(grammarAccess.getRotaryKnobRule()); }
	 ruleRotaryKnob
{ after(grammarAccess.getRotaryKnobRule()); } 
	 EOF 
;

// Rule RotaryKnob
ruleRotaryKnob 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRotaryKnobAccess().getRotKeyword()); }
		'Rot'
		{ after(grammarAccess.getRotaryKnobAccess().getRotKeyword()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleButton
entryRuleButton
:
{ before(grammarAccess.getButtonRule()); }
	 ruleButton
{ after(grammarAccess.getButtonRule()); } 
	 EOF 
;

// Rule Button
ruleButton 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getButtonAccess().getGroup()); }
		(rule__Button__Group__0)
		{ after(grammarAccess.getButtonAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ControlElement__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getControlElementAccess().getButtonParserRuleCall_0()); }
		ruleButton
		{ after(grammarAccess.getControlElementAccess().getButtonParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getControlElementAccess().getRotaryKnobParserRuleCall_1()); }
		ruleRotaryKnob
		{ after(grammarAccess.getControlElementAccess().getRotaryKnobParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__0__Impl
	rule__Model__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getControlsKeyword_0()); }
	'Controls{'
	{ after(grammarAccess.getModelAccess().getControlsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__1__Impl
	rule__Model__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getControlsAssignment_1()); }
	(rule__Model__ControlsAssignment_1)*
	{ after(grammarAccess.getModelAccess().getControlsAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_2()); }
	'}'
	{ after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Button__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Button__Group__0__Impl
	rule__Button__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Button__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getButtonAccess().getButtonKeyword_0()); }
	'button'
	{ after(grammarAccess.getButtonAccess().getButtonKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Button__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Button__Group__1__Impl
	rule__Button__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Button__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getButtonAccess().getNameAssignment_1()); }
	(rule__Button__NameAssignment_1)
	{ after(grammarAccess.getButtonAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Button__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Button__Group__2__Impl
	rule__Button__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Button__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getButtonAccess().getLeftParenthesisKeyword_2()); }
	'('
	{ after(grammarAccess.getButtonAccess().getLeftParenthesisKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Button__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Button__Group__3__Impl
	rule__Button__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Button__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getButtonAccess().getXKeyword_3()); }
	'x'
	{ after(grammarAccess.getButtonAccess().getXKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Button__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Button__Group__4__Impl
	rule__Button__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Button__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getButtonAccess().getXAssignment_4()); }
	(rule__Button__XAssignment_4)
	{ after(grammarAccess.getButtonAccess().getXAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Button__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Button__Group__5__Impl
	rule__Button__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Button__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getButtonAccess().getYKeyword_5()); }
	'y'
	{ after(grammarAccess.getButtonAccess().getYKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Button__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Button__Group__6__Impl
	rule__Button__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Button__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getButtonAccess().getYAssignment_6()); }
	(rule__Button__YAssignment_6)
	{ after(grammarAccess.getButtonAccess().getYAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Button__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Button__Group__7__Impl
	rule__Button__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Button__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getButtonAccess().getWidthKeyword_7()); }
	'width'
	{ after(grammarAccess.getButtonAccess().getWidthKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Button__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Button__Group__8__Impl
	rule__Button__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Button__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getButtonAccess().getWidthAssignment_8()); }
	(rule__Button__WidthAssignment_8)
	{ after(grammarAccess.getButtonAccess().getWidthAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Button__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Button__Group__9__Impl
	rule__Button__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__Button__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getButtonAccess().getHeightKeyword_9()); }
	'height'
	{ after(grammarAccess.getButtonAccess().getHeightKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Button__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Button__Group__10__Impl
	rule__Button__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__Button__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getButtonAccess().getHeightAssignment_10()); }
	(rule__Button__HeightAssignment_10)
	{ after(grammarAccess.getButtonAccess().getHeightAssignment_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Button__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Button__Group__11__Impl
	rule__Button__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__Button__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getButtonAccess().getFrequencyKeyword_11()); }
	'frequency'
	{ after(grammarAccess.getButtonAccess().getFrequencyKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Button__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Button__Group__12__Impl
	rule__Button__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__Button__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getButtonAccess().getFrequencyAssignment_12()); }
	(rule__Button__FrequencyAssignment_12)
	{ after(grammarAccess.getButtonAccess().getFrequencyAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Button__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Button__Group__13__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Button__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getButtonAccess().getRightParenthesisKeyword_13()); }
	')'
	{ after(grammarAccess.getButtonAccess().getRightParenthesisKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__ControlsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getControlsControlElementParserRuleCall_1_0()); }
		ruleControlElement
		{ after(grammarAccess.getModelAccess().getControlsControlElementParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Button__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Button__XAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getButtonAccess().getXINTTerminalRuleCall_4_0()); }
		RULE_INT
		{ after(grammarAccess.getButtonAccess().getXINTTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Button__YAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getButtonAccess().getYINTTerminalRuleCall_6_0()); }
		RULE_INT
		{ after(grammarAccess.getButtonAccess().getYINTTerminalRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Button__WidthAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getButtonAccess().getWidthINTTerminalRuleCall_8_0()); }
		RULE_INT
		{ after(grammarAccess.getButtonAccess().getWidthINTTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Button__HeightAssignment_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getButtonAccess().getHeightINTTerminalRuleCall_10_0()); }
		RULE_INT
		{ after(grammarAccess.getButtonAccess().getHeightINTTerminalRuleCall_10_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Button__FrequencyAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getButtonAccess().getFrequencyINTTerminalRuleCall_12_0()); }
		RULE_INT
		{ after(grammarAccess.getButtonAccess().getFrequencyINTTerminalRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
