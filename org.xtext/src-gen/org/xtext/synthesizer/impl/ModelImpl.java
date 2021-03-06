/**
 * generated by Xtext 2.12.0
 */
package org.xtext.synthesizer.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.synthesizer.ConnectionElement;
import org.xtext.synthesizer.ControlElement;
import org.xtext.synthesizer.Model;
import org.xtext.synthesizer.SoundElement;
import org.xtext.synthesizer.SynthesizerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.synthesizer.impl.ModelImpl#getControls <em>Controls</em>}</li>
 *   <li>{@link org.xtext.synthesizer.impl.ModelImpl#getSounds <em>Sounds</em>}</li>
 *   <li>{@link org.xtext.synthesizer.impl.ModelImpl#getConnections <em>Connections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getControls() <em>Controls</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControls()
   * @generated
   * @ordered
   */
  protected EList<ControlElement> controls;

  /**
   * The cached value of the '{@link #getSounds() <em>Sounds</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSounds()
   * @generated
   * @ordered
   */
  protected EList<SoundElement> sounds;

  /**
   * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnections()
   * @generated
   * @ordered
   */
  protected EList<ConnectionElement> connections;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SynthesizerPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ControlElement> getControls()
  {
    if (controls == null)
    {
      controls = new EObjectContainmentEList<ControlElement>(ControlElement.class, this, SynthesizerPackage.MODEL__CONTROLS);
    }
    return controls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SoundElement> getSounds()
  {
    if (sounds == null)
    {
      sounds = new EObjectContainmentEList<SoundElement>(SoundElement.class, this, SynthesizerPackage.MODEL__SOUNDS);
    }
    return sounds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConnectionElement> getConnections()
  {
    if (connections == null)
    {
      connections = new EObjectContainmentEList<ConnectionElement>(ConnectionElement.class, this, SynthesizerPackage.MODEL__CONNECTIONS);
    }
    return connections;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SynthesizerPackage.MODEL__CONTROLS:
        return ((InternalEList<?>)getControls()).basicRemove(otherEnd, msgs);
      case SynthesizerPackage.MODEL__SOUNDS:
        return ((InternalEList<?>)getSounds()).basicRemove(otherEnd, msgs);
      case SynthesizerPackage.MODEL__CONNECTIONS:
        return ((InternalEList<?>)getConnections()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SynthesizerPackage.MODEL__CONTROLS:
        return getControls();
      case SynthesizerPackage.MODEL__SOUNDS:
        return getSounds();
      case SynthesizerPackage.MODEL__CONNECTIONS:
        return getConnections();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SynthesizerPackage.MODEL__CONTROLS:
        getControls().clear();
        getControls().addAll((Collection<? extends ControlElement>)newValue);
        return;
      case SynthesizerPackage.MODEL__SOUNDS:
        getSounds().clear();
        getSounds().addAll((Collection<? extends SoundElement>)newValue);
        return;
      case SynthesizerPackage.MODEL__CONNECTIONS:
        getConnections().clear();
        getConnections().addAll((Collection<? extends ConnectionElement>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SynthesizerPackage.MODEL__CONTROLS:
        getControls().clear();
        return;
      case SynthesizerPackage.MODEL__SOUNDS:
        getSounds().clear();
        return;
      case SynthesizerPackage.MODEL__CONNECTIONS:
        getConnections().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SynthesizerPackage.MODEL__CONTROLS:
        return controls != null && !controls.isEmpty();
      case SynthesizerPackage.MODEL__SOUNDS:
        return sounds != null && !sounds.isEmpty();
      case SynthesizerPackage.MODEL__CONNECTIONS:
        return connections != null && !connections.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
