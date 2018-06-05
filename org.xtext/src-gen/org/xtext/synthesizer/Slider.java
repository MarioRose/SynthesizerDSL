/**
 * generated by Xtext 2.12.0
 */
package org.xtext.synthesizer;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.synthesizer.Slider#getSound <em>Sound</em>}</li>
 *   <li>{@link org.xtext.synthesizer.Slider#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.synthesizer.SynthesizerPackage#getSlider()
 * @model
 * @generated
 */
public interface Slider extends ControlElement
{
  /**
   * Returns the value of the '<em><b>Sound</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sound</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sound</em>' reference.
   * @see #setSound(SoundElement)
   * @see org.xtext.synthesizer.SynthesizerPackage#getSlider_Sound()
   * @model
   * @generated
   */
  SoundElement getSound();

  /**
   * Sets the value of the '{@link org.xtext.synthesizer.Slider#getSound <em>Sound</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sound</em>' reference.
   * @see #getSound()
   * @generated
   */
  void setSound(SoundElement value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.xtext.synthesizer.SynthesizerPackage#getSlider_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.xtext.synthesizer.Slider#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

} // Slider
