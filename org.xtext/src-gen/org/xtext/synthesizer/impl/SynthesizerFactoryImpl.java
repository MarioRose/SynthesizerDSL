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
      case SynthesizerPackage.CONTROLS: return createControls();
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
  public Controls createControls()
  {
    ControlsImpl controls = new ControlsImpl();
    return controls;
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
