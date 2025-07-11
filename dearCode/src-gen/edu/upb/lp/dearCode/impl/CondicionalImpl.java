/**
 * generated by Xtext 2.39.0
 */
package edu.upb.lp.dearCode.impl;

import edu.upb.lp.dearCode.Condicion;
import edu.upb.lp.dearCode.Condicional;
import edu.upb.lp.dearCode.DearCodePackage;
import edu.upb.lp.dearCode.Instruccion;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condicional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.upb.lp.dearCode.impl.CondicionalImpl#getCondicion <em>Condicion</em>}</li>
 *   <li>{@link edu.upb.lp.dearCode.impl.CondicionalImpl#getInstruccionesThen <em>Instrucciones Then</em>}</li>
 *   <li>{@link edu.upb.lp.dearCode.impl.CondicionalImpl#getInstruccionesElse <em>Instrucciones Else</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CondicionalImpl extends InstruccionImpl implements Condicional
{
  /**
   * The cached value of the '{@link #getCondicion() <em>Condicion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondicion()
   * @generated
   * @ordered
   */
  protected Condicion condicion;

  /**
   * The cached value of the '{@link #getInstruccionesThen() <em>Instrucciones Then</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstruccionesThen()
   * @generated
   * @ordered
   */
  protected EList<Instruccion> instruccionesThen;

  /**
   * The cached value of the '{@link #getInstruccionesElse() <em>Instrucciones Else</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstruccionesElse()
   * @generated
   * @ordered
   */
  protected EList<Instruccion> instruccionesElse;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CondicionalImpl()
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
    return DearCodePackage.Literals.CONDICIONAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Condicion getCondicion()
  {
    return condicion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondicion(Condicion newCondicion, NotificationChain msgs)
  {
    Condicion oldCondicion = condicion;
    condicion = newCondicion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DearCodePackage.CONDICIONAL__CONDICION, oldCondicion, newCondicion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCondicion(Condicion newCondicion)
  {
    if (newCondicion != condicion)
    {
      NotificationChain msgs = null;
      if (condicion != null)
        msgs = ((InternalEObject)condicion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DearCodePackage.CONDICIONAL__CONDICION, null, msgs);
      if (newCondicion != null)
        msgs = ((InternalEObject)newCondicion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DearCodePackage.CONDICIONAL__CONDICION, null, msgs);
      msgs = basicSetCondicion(newCondicion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DearCodePackage.CONDICIONAL__CONDICION, newCondicion, newCondicion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Instruccion> getInstruccionesThen()
  {
    if (instruccionesThen == null)
    {
      instruccionesThen = new EObjectContainmentEList<Instruccion>(Instruccion.class, this, DearCodePackage.CONDICIONAL__INSTRUCCIONES_THEN);
    }
    return instruccionesThen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Instruccion> getInstruccionesElse()
  {
    if (instruccionesElse == null)
    {
      instruccionesElse = new EObjectContainmentEList<Instruccion>(Instruccion.class, this, DearCodePackage.CONDICIONAL__INSTRUCCIONES_ELSE);
    }
    return instruccionesElse;
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
      case DearCodePackage.CONDICIONAL__CONDICION:
        return basicSetCondicion(null, msgs);
      case DearCodePackage.CONDICIONAL__INSTRUCCIONES_THEN:
        return ((InternalEList<?>)getInstruccionesThen()).basicRemove(otherEnd, msgs);
      case DearCodePackage.CONDICIONAL__INSTRUCCIONES_ELSE:
        return ((InternalEList<?>)getInstruccionesElse()).basicRemove(otherEnd, msgs);
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
      case DearCodePackage.CONDICIONAL__CONDICION:
        return getCondicion();
      case DearCodePackage.CONDICIONAL__INSTRUCCIONES_THEN:
        return getInstruccionesThen();
      case DearCodePackage.CONDICIONAL__INSTRUCCIONES_ELSE:
        return getInstruccionesElse();
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
      case DearCodePackage.CONDICIONAL__CONDICION:
        setCondicion((Condicion)newValue);
        return;
      case DearCodePackage.CONDICIONAL__INSTRUCCIONES_THEN:
        getInstruccionesThen().clear();
        getInstruccionesThen().addAll((Collection<? extends Instruccion>)newValue);
        return;
      case DearCodePackage.CONDICIONAL__INSTRUCCIONES_ELSE:
        getInstruccionesElse().clear();
        getInstruccionesElse().addAll((Collection<? extends Instruccion>)newValue);
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
      case DearCodePackage.CONDICIONAL__CONDICION:
        setCondicion((Condicion)null);
        return;
      case DearCodePackage.CONDICIONAL__INSTRUCCIONES_THEN:
        getInstruccionesThen().clear();
        return;
      case DearCodePackage.CONDICIONAL__INSTRUCCIONES_ELSE:
        getInstruccionesElse().clear();
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
      case DearCodePackage.CONDICIONAL__CONDICION:
        return condicion != null;
      case DearCodePackage.CONDICIONAL__INSTRUCCIONES_THEN:
        return instruccionesThen != null && !instruccionesThen.isEmpty();
      case DearCodePackage.CONDICIONAL__INSTRUCCIONES_ELSE:
        return instruccionesElse != null && !instruccionesElse.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CondicionalImpl
