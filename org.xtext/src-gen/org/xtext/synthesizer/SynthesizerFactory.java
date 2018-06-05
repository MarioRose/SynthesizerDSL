/**
 * generated by Xtext 2.12.0
 */
package org.xtext.synthesizer;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.synthesizer.SynthesizerPackage
 * @generated
 */
public interface SynthesizerFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SynthesizerFactory eINSTANCE = org.xtext.synthesizer.impl.SynthesizerFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Control Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Control Element</em>'.
   * @generated
   */
  ControlElement createControlElement();

  /**
   * Returns a new object of class '<em>Rotary Knob</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rotary Knob</em>'.
   * @generated
   */
  RotaryKnob createRotaryKnob();

  /**
   * Returns a new object of class '<em>Slider</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slider</em>'.
   * @generated
   */
  Slider createSlider();

  /**
   * Returns a new object of class '<em>Sound Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sound Element</em>'.
   * @generated
   */
  SoundElement createSoundElement();

  /**
   * Returns a new object of class '<em>Button</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Button</em>'.
   * @generated
   */
  Button createButton();

  /**
   * Returns a new object of class '<em>Connection Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Connection Element</em>'.
   * @generated
   */
  ConnectionElement createConnectionElement();

  /**
   * Returns a new object of class '<em>Saw Tooth Oscillator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Saw Tooth Oscillator</em>'.
   * @generated
   */
  SawToothOscillator createSawToothOscillator();

  /**
   * Returns a new object of class '<em>Sine Oscillator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sine Oscillator</em>'.
   * @generated
   */
  SineOscillator createSineOscillator();

  /**
   * Returns a new object of class '<em>Triangle Oscillator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Triangle Oscillator</em>'.
   * @generated
   */
  TriangleOscillator createTriangleOscillator();

  /**
   * Returns a new object of class '<em>Square Oscillator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Square Oscillator</em>'.
   * @generated
   */
  SquareOscillator createSquareOscillator();

  /**
   * Returns a new object of class '<em>Pulse Oscillator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pulse Oscillator</em>'.
   * @generated
   */
  PulseOscillator createPulseOscillator();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SynthesizerPackage getSynthesizerPackage();

} //SynthesizerFactory
