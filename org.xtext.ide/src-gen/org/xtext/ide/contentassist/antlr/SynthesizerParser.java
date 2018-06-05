/*
 * generated by Xtext 2.12.0
 */
package org.xtext.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.ide.contentassist.antlr.internal.InternalSynthesizerParser;
import org.xtext.services.SynthesizerGrammarAccess;

public class SynthesizerParser extends AbstractContentAssistParser {

	@Inject
	private SynthesizerGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalSynthesizerParser createParser() {
		InternalSynthesizerParser result = new InternalSynthesizerParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getControlElementAccess().getAlternatives(), "rule__ControlElement__Alternatives");
					put(grammarAccess.getEffectAccess().getAlternatives(), "rule__Effect__Alternatives");
					put(grammarAccess.getSoundElementAccess().getAlternatives(), "rule__SoundElement__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getModelAccess().getGroup_4(), "rule__Model__Group_4__0");
					put(grammarAccess.getModelAccess().getGroup_5(), "rule__Model__Group_5__0");
					put(grammarAccess.getRotaryKnobAccess().getGroup(), "rule__RotaryKnob__Group__0");
					put(grammarAccess.getSliderAccess().getGroup(), "rule__Slider__Group__0");
					put(grammarAccess.getButtonAccess().getGroup(), "rule__Button__Group__0");
					put(grammarAccess.getConnectionElementAccess().getGroup(), "rule__ConnectionElement__Group__0");
					put(grammarAccess.getSawToothOscillatorAccess().getGroup(), "rule__SawToothOscillator__Group__0");
					put(grammarAccess.getSineOscillatorAccess().getGroup(), "rule__SineOscillator__Group__0");
					put(grammarAccess.getTriangleOscillatorAccess().getGroup(), "rule__TriangleOscillator__Group__0");
					put(grammarAccess.getSquareOscillatorAccess().getGroup(), "rule__SquareOscillator__Group__0");
					put(grammarAccess.getPulseOscillatorAccess().getGroup(), "rule__PulseOscillator__Group__0");
					put(grammarAccess.getModelAccess().getControlsAssignment_2(), "rule__Model__ControlsAssignment_2");
					put(grammarAccess.getModelAccess().getSoundsAssignment_4_2(), "rule__Model__SoundsAssignment_4_2");
					put(grammarAccess.getModelAccess().getConnectionsAssignment_5_2(), "rule__Model__ConnectionsAssignment_5_2");
					put(grammarAccess.getRotaryKnobAccess().getNameAssignment_1(), "rule__RotaryKnob__NameAssignment_1");
					put(grammarAccess.getRotaryKnobAccess().getXAssignment_4(), "rule__RotaryKnob__XAssignment_4");
					put(grammarAccess.getRotaryKnobAccess().getYAssignment_6(), "rule__RotaryKnob__YAssignment_6");
					put(grammarAccess.getRotaryKnobAccess().getWidthAssignment_8(), "rule__RotaryKnob__WidthAssignment_8");
					put(grammarAccess.getRotaryKnobAccess().getHeightAssignment_10(), "rule__RotaryKnob__HeightAssignment_10");
					put(grammarAccess.getSliderAccess().getNameAssignment_1(), "rule__Slider__NameAssignment_1");
					put(grammarAccess.getSliderAccess().getXAssignment_4(), "rule__Slider__XAssignment_4");
					put(grammarAccess.getSliderAccess().getYAssignment_6(), "rule__Slider__YAssignment_6");
					put(grammarAccess.getSliderAccess().getWidthAssignment_8(), "rule__Slider__WidthAssignment_8");
					put(grammarAccess.getSliderAccess().getHeightAssignment_10(), "rule__Slider__HeightAssignment_10");
					put(grammarAccess.getSliderAccess().getSoundAssignment_12(), "rule__Slider__SoundAssignment_12");
					put(grammarAccess.getSliderAccess().getTypeAssignment_14(), "rule__Slider__TypeAssignment_14");
					put(grammarAccess.getButtonAccess().getNameAssignment_1(), "rule__Button__NameAssignment_1");
					put(grammarAccess.getButtonAccess().getXAssignment_4(), "rule__Button__XAssignment_4");
					put(grammarAccess.getButtonAccess().getYAssignment_6(), "rule__Button__YAssignment_6");
					put(grammarAccess.getButtonAccess().getWidthAssignment_8(), "rule__Button__WidthAssignment_8");
					put(grammarAccess.getButtonAccess().getHeightAssignment_10(), "rule__Button__HeightAssignment_10");
					put(grammarAccess.getButtonAccess().getSoundAssignment_12(), "rule__Button__SoundAssignment_12");
					put(grammarAccess.getConnectionElementAccess().getCeAssignment_1(), "rule__ConnectionElement__CeAssignment_1");
					put(grammarAccess.getConnectionElementAccess().getSeAssignment_2(), "rule__ConnectionElement__SeAssignment_2");
					put(grammarAccess.getSawToothOscillatorAccess().getNameAssignment_1(), "rule__SawToothOscillator__NameAssignment_1");
					put(grammarAccess.getSawToothOscillatorAccess().getFrequencyAssignment_4(), "rule__SawToothOscillator__FrequencyAssignment_4");
					put(grammarAccess.getSawToothOscillatorAccess().getAmplitudeAssignment_6(), "rule__SawToothOscillator__AmplitudeAssignment_6");
					put(grammarAccess.getSineOscillatorAccess().getNameAssignment_1(), "rule__SineOscillator__NameAssignment_1");
					put(grammarAccess.getSineOscillatorAccess().getFrequencyAssignment_4(), "rule__SineOscillator__FrequencyAssignment_4");
					put(grammarAccess.getSineOscillatorAccess().getAmplitudeAssignment_6(), "rule__SineOscillator__AmplitudeAssignment_6");
					put(grammarAccess.getTriangleOscillatorAccess().getNameAssignment_1(), "rule__TriangleOscillator__NameAssignment_1");
					put(grammarAccess.getTriangleOscillatorAccess().getFrequencyAssignment_4(), "rule__TriangleOscillator__FrequencyAssignment_4");
					put(grammarAccess.getTriangleOscillatorAccess().getAmplitudeAssignment_6(), "rule__TriangleOscillator__AmplitudeAssignment_6");
					put(grammarAccess.getSquareOscillatorAccess().getNameAssignment_1(), "rule__SquareOscillator__NameAssignment_1");
					put(grammarAccess.getSquareOscillatorAccess().getFrequencyAssignment_4(), "rule__SquareOscillator__FrequencyAssignment_4");
					put(grammarAccess.getSquareOscillatorAccess().getAmplitudeAssignment_6(), "rule__SquareOscillator__AmplitudeAssignment_6");
					put(grammarAccess.getPulseOscillatorAccess().getNameAssignment_1(), "rule__PulseOscillator__NameAssignment_1");
					put(grammarAccess.getPulseOscillatorAccess().getFrequencyAssignment_4(), "rule__PulseOscillator__FrequencyAssignment_4");
					put(grammarAccess.getPulseOscillatorAccess().getAmplitudeAssignment_6(), "rule__PulseOscillator__AmplitudeAssignment_6");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SynthesizerGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SynthesizerGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
