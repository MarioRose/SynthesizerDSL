/**
 * generated by Xtext 2.12.0
 */
package org.xtext.synthesizer.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.synthesizer.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SynthesizerFactoryImpl extends EFactoryImpl implements SynthesizerFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SynthesizerFactory init()
  {
    try
    {
      SynthesizerFactory theSynthesizerFactory = (SynthesizerFactory)EPackage.Registry.INSTANCE.getEFactory(SynthesizerPackage.eNS_URI);
      if (theSynthesizerFactory != null)
      {
        return theSynthesizerFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SynthesizerFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SynthesizerFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SynthesizerPackage.MODEL: return createModel();
      case SynthesizerPackage.CONTROL_ELEMENT: return createControlElement();
      case SynthesizerPackage.ROTARY_KNOB: return createRotaryKnob();
      case SynthesizerPackage.SLIDER: return createSlider();
      case SynthesizerPackage.BUTTON: return createButton();
      case SynthesizerPackage.SOUND_ELEMENT: return createSoundElement();
      case SynthesizerPackage.CONNECTION_ELEMENT: return createConnectionElement();
      case SynthesizerPackage.SAW_TOOTH_OSCILLATOR: return createSawToothOscillator();
      case SynthesizerPackage.SINE_OSCILLATOR: return createSineOscillator();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ControlElement createControlElement()
  {
    ControlElementImpl controlElement = new ControlElementImpl();
    return controlElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RotaryKnob createRotaryKnob()
  {
    RotaryKnobImpl rotaryKnob = new RotaryKnobImpl();
    return rotaryKnob;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Slider createSlider()
  {
    SliderImpl slider = new SliderImpl();
    return slider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Button createButton()
  {
    ButtonImpl button = new ButtonImpl();
    return button;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SoundElement createSoundElement()
  {
    SoundElementImpl soundElement = new SoundElementImpl();
    return soundElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConnectionElement createConnectionElement()
  {
    ConnectionElementImpl connectionElement = new ConnectionElementImpl();
    return connectionElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SawToothOscillator createSawToothOscillator()
  {
    SawToothOscillatorImpl sawToothOscillator = new SawToothOscillatorImpl();
    return sawToothOscillator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SineOscillator createSineOscillator()
  {
    SineOscillatorImpl sineOscillator = new SineOscillatorImpl();
    return sineOscillator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SynthesizerPackage getSynthesizerPackage()
  {
    return (SynthesizerPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SynthesizerPackage getPackage()
  {
    return SynthesizerPackage.eINSTANCE;
  }

} //SynthesizerFactoryImpl
