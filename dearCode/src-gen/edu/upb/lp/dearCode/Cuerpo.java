/**
 * generated by Xtext 2.39.0
 */
package edu.upb.lp.dearCode;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cuerpo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.upb.lp.dearCode.Cuerpo#getInstrucciones <em>Instrucciones</em>}</li>
 * </ul>
 *
 * @see edu.upb.lp.dearCode.DearCodePackage#getCuerpo()
 * @model
 * @generated
 */
public interface Cuerpo extends EObject
{
  /**
   * Returns the value of the '<em><b>Instrucciones</b></em>' containment reference list.
   * The list contents are of type {@link edu.upb.lp.dearCode.Instruccion}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instrucciones</em>' containment reference list.
   * @see edu.upb.lp.dearCode.DearCodePackage#getCuerpo_Instrucciones()
   * @model containment="true"
   * @generated
   */
  EList<Instruccion> getInstrucciones();

} // Cuerpo
