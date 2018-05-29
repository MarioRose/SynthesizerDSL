/**
 * generated by Xtext 2.12.0
 */
package org.xtext.synthesizer;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.synthesizer.SynthesizerFactory
 * @model kind="package"
 * @generated
 */
public interface SynthesizerPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "synthesizer";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/Synthesizer";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "synthesizer";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SynthesizerPackage eINSTANCE = org.xtext.synthesizer.impl.SynthesizerPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.synthesizer.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.synthesizer.impl.ModelImpl
   * @see org.xtext.synthesizer.impl.SynthesizerPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Controls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__CONTROLS = 0;

  /**
   * The feature id for the '<em><b>Sounds</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__SOUNDS = 1;

  /**
   * The feature id for the '<em><b>Connections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__CONNECTIONS = 2;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.synthesizer.impl.ControlElementImpl <em>Control Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.synthesizer.impl.ControlElementImpl
   * @see org.xtext.synthesizer.impl.SynthesizerPackageImpl#getControlElement()
   * @generated
   */
  int CONTROL_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ELEMENT__X = 1;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ELEMENT__Y = 2;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ELEMENT__WIDTH = 3;

  /**
   * The feature id for the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ELEMENT__HEIGHT = 4;

  /**
   * The number of structural features of the '<em>Control Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ELEMENT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.synthesizer.impl.RotaryKnobImpl <em>Rotary Knob</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.synthesizer.impl.RotaryKnobImpl
   * @see org.xtext.synthesizer.impl.SynthesizerPackageImpl#getRotaryKnob()
   * @generated
   */
  int ROTARY_KNOB = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROTARY_KNOB__NAME = CONTROL_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROTARY_KNOB__X = CONTROL_ELEMENT__X;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROTARY_KNOB__Y = CONTROL_ELEMENT__Y;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROTARY_KNOB__WIDTH = CONTROL_ELEMENT__WIDTH;

  /**
   * The feature id for the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROTARY_KNOB__HEIGHT = CONTROL_ELEMENT__HEIGHT;

  /**
   * The number of structural features of the '<em>Rotary Knob</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROTARY_KNOB_FEATURE_COUNT = CONTROL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.synthesizer.impl.SliderImpl <em>Slider</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.synthesizer.impl.SliderImpl
   * @see org.xtext.synthesizer.impl.SynthesizerPackageImpl#getSlider()
   * @generated
   */
  int SLIDER = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIDER__NAME = CONTROL_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIDER__X = CONTROL_ELEMENT__X;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIDER__Y = CONTROL_ELEMENT__Y;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIDER__WIDTH = CONTROL_ELEMENT__WIDTH;

  /**
   * The feature id for the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIDER__HEIGHT = CONTROL_ELEMENT__HEIGHT;

  /**
   * The number of structural features of the '<em>Slider</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIDER_FEATURE_COUNT = CONTROL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.synthesizer.impl.ButtonImpl <em>Button</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.synthesizer.impl.ButtonImpl
   * @see org.xtext.synthesizer.impl.SynthesizerPackageImpl#getButton()
   * @generated
   */
  int BUTTON = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__NAME = CONTROL_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__X = CONTROL_ELEMENT__X;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__Y = CONTROL_ELEMENT__Y;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__WIDTH = CONTROL_ELEMENT__WIDTH;

  /**
   * The feature id for the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__HEIGHT = CONTROL_ELEMENT__HEIGHT;

  /**
   * The feature id for the '<em><b>Frequency</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__FREQUENCY = CONTROL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Button</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_FEATURE_COUNT = CONTROL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.synthesizer.impl.SoundElementImpl <em>Sound Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.synthesizer.impl.SoundElementImpl
   * @see org.xtext.synthesizer.impl.SynthesizerPackageImpl#getSoundElement()
   * @generated
   */
  int SOUND_ELEMENT = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOUND_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Sound Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOUND_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.synthesizer.impl.ConnectionElementImpl <em>Connection Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.synthesizer.impl.ConnectionElementImpl
   * @see org.xtext.synthesizer.impl.SynthesizerPackageImpl#getConnectionElement()
   * @generated
   */
  int CONNECTION_ELEMENT = 6;

  /**
   * The feature id for the '<em><b>Ce</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION_ELEMENT__CE = 0;

  /**
   * The feature id for the '<em><b>Se</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION_ELEMENT__SE = 1;

  /**
   * The number of structural features of the '<em>Connection Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION_ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.synthesizer.impl.SawToothOscillatorImpl <em>Saw Tooth Oscillator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.synthesizer.impl.SawToothOscillatorImpl
   * @see org.xtext.synthesizer.impl.SynthesizerPackageImpl#getSawToothOscillator()
   * @generated
   */
  int SAW_TOOTH_OSCILLATOR = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SAW_TOOTH_OSCILLATOR__NAME = SOUND_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SAW_TOOTH_OSCILLATOR__MIN = SOUND_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SAW_TOOTH_OSCILLATOR__MAX = SOUND_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SAW_TOOTH_OSCILLATOR__DEFAULT = SOUND_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Saw Tooth Oscillator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SAW_TOOTH_OSCILLATOR_FEATURE_COUNT = SOUND_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.synthesizer.impl.SineOscillatorImpl <em>Sine Oscillator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.synthesizer.impl.SineOscillatorImpl
   * @see org.xtext.synthesizer.impl.SynthesizerPackageImpl#getSineOscillator()
   * @generated
   */
  int SINE_OSCILLATOR = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINE_OSCILLATOR__NAME = SOUND_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Frequency</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINE_OSCILLATOR__FREQUENCY = SOUND_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Amplitude</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINE_OSCILLATOR__AMPLITUDE = SOUND_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Sine Oscillator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINE_OSCILLATOR_FEATURE_COUNT = SOUND_ELEMENT_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link org.xtext.synthesizer.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.synthesizer.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.synthesizer.Model#getControls <em>Controls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Controls</em>'.
   * @see org.xtext.synthesizer.Model#getControls()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Controls();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.synthesizer.Model#getSounds <em>Sounds</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sounds</em>'.
   * @see org.xtext.synthesizer.Model#getSounds()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Sounds();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.synthesizer.Model#getConnections <em>Connections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Connections</em>'.
   * @see org.xtext.synthesizer.Model#getConnections()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Connections();

  /**
   * Returns the meta object for class '{@link org.xtext.synthesizer.ControlElement <em>Control Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Control Element</em>'.
   * @see org.xtext.synthesizer.ControlElement
   * @generated
   */
  EClass getControlElement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.synthesizer.ControlElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.synthesizer.ControlElement#getName()
   * @see #getControlElement()
   * @generated
   */
  EAttribute getControlElement_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.synthesizer.ControlElement#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see org.xtext.synthesizer.ControlElement#getX()
   * @see #getControlElement()
   * @generated
   */
  EAttribute getControlElement_X();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.synthesizer.ControlElement#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see org.xtext.synthesizer.ControlElement#getY()
   * @see #getControlElement()
   * @generated
   */
  EAttribute getControlElement_Y();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.synthesizer.ControlElement#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width</em>'.
   * @see org.xtext.synthesizer.ControlElement#getWidth()
   * @see #getControlElement()
   * @generated
   */
  EAttribute getControlElement_Width();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.synthesizer.ControlElement#getHeight <em>Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Height</em>'.
   * @see org.xtext.synthesizer.ControlElement#getHeight()
   * @see #getControlElement()
   * @generated
   */
  EAttribute getControlElement_Height();

  /**
   * Returns the meta object for class '{@link org.xtext.synthesizer.RotaryKnob <em>Rotary Knob</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rotary Knob</em>'.
   * @see org.xtext.synthesizer.RotaryKnob
   * @generated
   */
  EClass getRotaryKnob();

  /**
   * Returns the meta object for class '{@link org.xtext.synthesizer.Slider <em>Slider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slider</em>'.
   * @see org.xtext.synthesizer.Slider
   * @generated
   */
  EClass getSlider();

  /**
   * Returns the meta object for class '{@link org.xtext.synthesizer.Button <em>Button</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Button</em>'.
   * @see org.xtext.synthesizer.Button
   * @generated
   */
  EClass getButton();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.synthesizer.Button#getFrequency <em>Frequency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Frequency</em>'.
   * @see org.xtext.synthesizer.Button#getFrequency()
   * @see #getButton()
   * @generated
   */
  EAttribute getButton_Frequency();

  /**
   * Returns the meta object for class '{@link org.xtext.synthesizer.SoundElement <em>Sound Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sound Element</em>'.
   * @see org.xtext.synthesizer.SoundElement
   * @generated
   */
  EClass getSoundElement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.synthesizer.SoundElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.synthesizer.SoundElement#getName()
   * @see #getSoundElement()
   * @generated
   */
  EAttribute getSoundElement_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.synthesizer.ConnectionElement <em>Connection Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Connection Element</em>'.
   * @see org.xtext.synthesizer.ConnectionElement
   * @generated
   */
  EClass getConnectionElement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.synthesizer.ConnectionElement#getCe <em>Ce</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ce</em>'.
   * @see org.xtext.synthesizer.ConnectionElement#getCe()
   * @see #getConnectionElement()
   * @generated
   */
  EReference getConnectionElement_Ce();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.synthesizer.ConnectionElement#getSe <em>Se</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Se</em>'.
   * @see org.xtext.synthesizer.ConnectionElement#getSe()
   * @see #getConnectionElement()
   * @generated
   */
  EReference getConnectionElement_Se();

  /**
   * Returns the meta object for class '{@link org.xtext.synthesizer.SawToothOscillator <em>Saw Tooth Oscillator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Saw Tooth Oscillator</em>'.
   * @see org.xtext.synthesizer.SawToothOscillator
   * @generated
   */
  EClass getSawToothOscillator();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.synthesizer.SawToothOscillator#getMin <em>Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min</em>'.
   * @see org.xtext.synthesizer.SawToothOscillator#getMin()
   * @see #getSawToothOscillator()
   * @generated
   */
  EAttribute getSawToothOscillator_Min();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.synthesizer.SawToothOscillator#getMax <em>Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max</em>'.
   * @see org.xtext.synthesizer.SawToothOscillator#getMax()
   * @see #getSawToothOscillator()
   * @generated
   */
  EAttribute getSawToothOscillator_Max();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.synthesizer.SawToothOscillator#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default</em>'.
   * @see org.xtext.synthesizer.SawToothOscillator#getDefault()
   * @see #getSawToothOscillator()
   * @generated
   */
  EAttribute getSawToothOscillator_Default();

  /**
   * Returns the meta object for class '{@link org.xtext.synthesizer.SineOscillator <em>Sine Oscillator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sine Oscillator</em>'.
   * @see org.xtext.synthesizer.SineOscillator
   * @generated
   */
  EClass getSineOscillator();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.synthesizer.SineOscillator#getFrequency <em>Frequency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Frequency</em>'.
   * @see org.xtext.synthesizer.SineOscillator#getFrequency()
   * @see #getSineOscillator()
   * @generated
   */
  EAttribute getSineOscillator_Frequency();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.synthesizer.SineOscillator#getAmplitude <em>Amplitude</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Amplitude</em>'.
   * @see org.xtext.synthesizer.SineOscillator#getAmplitude()
   * @see #getSineOscillator()
   * @generated
   */
  EAttribute getSineOscillator_Amplitude();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SynthesizerFactory getSynthesizerFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.synthesizer.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.synthesizer.impl.ModelImpl
     * @see org.xtext.synthesizer.impl.SynthesizerPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Controls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__CONTROLS = eINSTANCE.getModel_Controls();

    /**
     * The meta object literal for the '<em><b>Sounds</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__SOUNDS = eINSTANCE.getModel_Sounds();

    /**
     * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__CONNECTIONS = eINSTANCE.getModel_Connections();

    /**
     * The meta object literal for the '{@link org.xtext.synthesizer.impl.ControlElementImpl <em>Control Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.synthesizer.impl.ControlElementImpl
     * @see org.xtext.synthesizer.impl.SynthesizerPackageImpl#getControlElement()
     * @generated
     */
    EClass CONTROL_ELEMENT = eINSTANCE.getControlElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTROL_ELEMENT__NAME = eINSTANCE.getControlElement_Name();

    /**
     * The meta object literal for the '<em><b>X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTROL_ELEMENT__X = eINSTANCE.getControlElement_X();

    /**
     * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTROL_ELEMENT__Y = eINSTANCE.getControlElement_Y();

    /**
     * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTROL_ELEMENT__WIDTH = eINSTANCE.getControlElement_Width();

    /**
     * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTROL_ELEMENT__HEIGHT = eINSTANCE.getControlElement_Height();

    /**
     * The meta object literal for the '{@link org.xtext.synthesizer.impl.RotaryKnobImpl <em>Rotary Knob</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.synthesizer.impl.RotaryKnobImpl
     * @see org.xtext.synthesizer.impl.SynthesizerPackageImpl#getRotaryKnob()
     * @generated
     */
    EClass ROTARY_KNOB = eINSTANCE.getRotaryKnob();

    /**
     * The meta object literal for the '{@link org.xtext.synthesizer.impl.SliderImpl <em>Slider</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.synthesizer.impl.SliderImpl
     * @see org.xtext.synthesizer.impl.SynthesizerPackageImpl#getSlider()
     * @generated
     */
    EClass SLIDER = eINSTANCE.getSlider();

    /**
     * The meta object literal for the '{@link org.xtext.synthesizer.impl.ButtonImpl <em>Button</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.synthesizer.impl.ButtonImpl
     * @see org.xtext.synthesizer.impl.SynthesizerPackageImpl#getButton()
     * @generated
     */
    EClass BUTTON = eINSTANCE.getButton();

    /**
     * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUTTON__FREQUENCY = eINSTANCE.getButton_Frequency();

    /**
     * The meta object literal for the '{@link org.xtext.synthesizer.impl.SoundElementImpl <em>Sound Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.synthesizer.impl.SoundElementImpl
     * @see org.xtext.synthesizer.impl.SynthesizerPackageImpl#getSoundElement()
     * @generated
     */
    EClass SOUND_ELEMENT = eINSTANCE.getSoundElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SOUND_ELEMENT__NAME = eINSTANCE.getSoundElement_Name();

    /**
     * The meta object literal for the '{@link org.xtext.synthesizer.impl.ConnectionElementImpl <em>Connection Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.synthesizer.impl.ConnectionElementImpl
     * @see org.xtext.synthesizer.impl.SynthesizerPackageImpl#getConnectionElement()
     * @generated
     */
    EClass CONNECTION_ELEMENT = eINSTANCE.getConnectionElement();

    /**
     * The meta object literal for the '<em><b>Ce</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTION_ELEMENT__CE = eINSTANCE.getConnectionElement_Ce();

    /**
     * The meta object literal for the '<em><b>Se</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTION_ELEMENT__SE = eINSTANCE.getConnectionElement_Se();

    /**
     * The meta object literal for the '{@link org.xtext.synthesizer.impl.SawToothOscillatorImpl <em>Saw Tooth Oscillator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.synthesizer.impl.SawToothOscillatorImpl
     * @see org.xtext.synthesizer.impl.SynthesizerPackageImpl#getSawToothOscillator()
     * @generated
     */
    EClass SAW_TOOTH_OSCILLATOR = eINSTANCE.getSawToothOscillator();

    /**
     * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SAW_TOOTH_OSCILLATOR__MIN = eINSTANCE.getSawToothOscillator_Min();

    /**
     * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SAW_TOOTH_OSCILLATOR__MAX = eINSTANCE.getSawToothOscillator_Max();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SAW_TOOTH_OSCILLATOR__DEFAULT = eINSTANCE.getSawToothOscillator_Default();

    /**
     * The meta object literal for the '{@link org.xtext.synthesizer.impl.SineOscillatorImpl <em>Sine Oscillator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.synthesizer.impl.SineOscillatorImpl
     * @see org.xtext.synthesizer.impl.SynthesizerPackageImpl#getSineOscillator()
     * @generated
     */
    EClass SINE_OSCILLATOR = eINSTANCE.getSineOscillator();

    /**
     * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SINE_OSCILLATOR__FREQUENCY = eINSTANCE.getSineOscillator_Frequency();

    /**
     * The meta object literal for the '<em><b>Amplitude</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SINE_OSCILLATOR__AMPLITUDE = eINSTANCE.getSineOscillator_Amplitude();

  }

} //SynthesizerPackage
