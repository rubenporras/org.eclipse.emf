/**
 * <copyright>
 *
 * Copyright (c) 2002-2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: XSDTypeDefinitionImpl.java,v 1.8 2005/11/25 13:14:00 emerks Exp $
 */
package org.eclipse.xsd.impl;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.w3c.dom.Node;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.xsd.XSDAnnotation;
import org.eclipse.xsd.XSDComplexTypeDefinition;
import org.eclipse.xsd.XSDPackage;
import org.eclipse.xsd.XSDParticle;
import org.eclipse.xsd.XSDSimpleTypeDefinition;
import org.eclipse.xsd.XSDTypeDefinition;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xsd.impl.XSDTypeDefinitionImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.eclipse.xsd.impl.XSDTypeDefinitionImpl#getDerivationAnnotation <em>Derivation Annotation</em>}</li>
 *   <li>{@link org.eclipse.xsd.impl.XSDTypeDefinitionImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.xsd.impl.XSDTypeDefinitionImpl#getRootType <em>Root Type</em>}</li>
 *   <li>{@link org.eclipse.xsd.impl.XSDTypeDefinitionImpl#getBaseType <em>Base Type</em>}</li>
 *   <li>{@link org.eclipse.xsd.impl.XSDTypeDefinitionImpl#getSimpleType <em>Simple Type</em>}</li>
 *   <li>{@link org.eclipse.xsd.impl.XSDTypeDefinitionImpl#getComplexType <em>Complex Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class XSDTypeDefinitionImpl 
  extends XSDRedefinableComponentImpl 
  implements XSDTypeDefinition
{
  /**
   * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnotation()
   * @generated
   * @ordered
   */
  protected XSDAnnotation annotation = null;

  /**
   * The cached value of the '{@link #getDerivationAnnotation() <em>Derivation Annotation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDerivationAnnotation()
   * @generated
   * @ordered
   */
  protected XSDAnnotation derivationAnnotation = null;

  /**
   * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnotations()
   * @generated
   * @ordered
   */
  protected EList annotations = null;

  public static XSDTypeDefinition createTypeDefinition(Node node)
  {
    XSDSimpleTypeDefinition xsdSimpleTypeDefinition = XSDSimpleTypeDefinitionImpl.createSimpleTypeDefinition(node);
    if (xsdSimpleTypeDefinition != null)
    {
      return xsdSimpleTypeDefinition;
    }
    XSDComplexTypeDefinition xsdComplexTypeDefinition = XSDComplexTypeDefinitionImpl.createComplexTypeDefinition(node);
    if (xsdComplexTypeDefinition != null)
    {
      return xsdComplexTypeDefinition;
    }
    return null;
  }

  protected int analysisState;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XSDTypeDefinitionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EClass eStaticClass()
  {
    return XSDPackage.Literals.XSD_TYPE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XSDAnnotation getAnnotation()
  {
    return annotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnnotation(XSDAnnotation newAnnotation)
  {
    if (newAnnotation != annotation)
    {
      NotificationChain msgs = null;
      if (annotation != null)
        msgs = ((InternalEObject)annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XSDPackage.XSD_TYPE_DEFINITION__ANNOTATION, null, msgs);
      if (newAnnotation != null)
        msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XSDPackage.XSD_TYPE_DEFINITION__ANNOTATION, null, msgs);
      msgs = basicSetAnnotation(newAnnotation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XSDPackage.XSD_TYPE_DEFINITION__ANNOTATION, newAnnotation, newAnnotation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnnotation(XSDAnnotation newAnnotation, NotificationChain msgs)
  {
    XSDAnnotation oldAnnotation = annotation;
    annotation = newAnnotation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XSDPackage.XSD_TYPE_DEFINITION__ANNOTATION, oldAnnotation, newAnnotation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XSDAnnotation getDerivationAnnotation()
  {
    return derivationAnnotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDerivationAnnotation(XSDAnnotation newDerivationAnnotation)
  {
    if (newDerivationAnnotation != derivationAnnotation)
    {
      NotificationChain msgs = null;
      if (derivationAnnotation != null)
        msgs = ((InternalEObject)derivationAnnotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XSDPackage.XSD_TYPE_DEFINITION__DERIVATION_ANNOTATION, null, msgs);
      if (newDerivationAnnotation != null)
        msgs = ((InternalEObject)newDerivationAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XSDPackage.XSD_TYPE_DEFINITION__DERIVATION_ANNOTATION, null, msgs);
      msgs = basicSetDerivationAnnotation(newDerivationAnnotation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XSDPackage.XSD_TYPE_DEFINITION__DERIVATION_ANNOTATION, newDerivationAnnotation, newDerivationAnnotation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDerivationAnnotation(XSDAnnotation newDerivationAnnotation, NotificationChain msgs)
  {
    XSDAnnotation oldDerivationAnnotation = derivationAnnotation;
    derivationAnnotation = newDerivationAnnotation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XSDPackage.XSD_TYPE_DEFINITION__DERIVATION_ANNOTATION, oldDerivationAnnotation, newDerivationAnnotation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getAnnotations()
  {
    if (annotations == null)
    {
      annotations = new EObjectEList(XSDAnnotation.class, this, XSDPackage.XSD_TYPE_DEFINITION__ANNOTATIONS);
    }
    return annotations;
  }

  protected void patch()
  {
    analysisState = UNANALYZED;
    super.patch();
  }

  protected boolean analyze()
  {
    switch (analysisState)
    {
      case UNANALYZED:
      {
        analysisState = ANALYZING;

        handleAnalysis();
        if (analysisState == ANALYZING)
        {
          analysisState = ANALYZED;
          return true;
        }
        else
        {
          return analysisState == ANALYZED;
        }
      }
      case ANALYZED:
      {
        return true;
      }
      case ANALYZING:
      case CIRCULAR:
      default:
      {
        analysisState = CIRCULAR;
        return false;
      }
    }
  }

  protected void handleAnalysis()
  {
    super.analyze();
  }

  public static XSDTypeDefinition getLowestCommonAncestor(Collection xsdTypeDefinitions)
  {
    XSDTypeDefinition result = null;

    if (!xsdTypeDefinitions.isEmpty())
    {
      List listOfLists = new ArrayList();
      for (Iterator typeDefinitions = xsdTypeDefinitions.iterator(); typeDefinitions.hasNext(); )
      {
        List list = new ArrayList();
        listOfLists.add(list);

        for (XSDTypeDefinition xsdTypeDefinition = (XSDTypeDefinition)typeDefinitions.next();  
             xsdTypeDefinition != null; 
             xsdTypeDefinition = xsdTypeDefinition.getBaseType())
        {
          if (list.contains(xsdTypeDefinition))
          {
            break;
          }
          list.add(0, xsdTypeDefinition);
        }
/*
System.out.println("========");
for (Iterator i = list.iterator(); i.hasNext(); )
{
  XSDTypeDefinition t = (XSDTypeDefinition)i.next();
  if (t.getName() != null)
  {
    System.out.println("  : " + t.getName());
  }
  else 
  {
    for (org.eclipse.xsd.XSDConcreteComponent xsdConcreteComponent = t.getContainer(); 
         xsdConcreteComponent != null; 
         xsdConcreteComponent = xsdConcreteComponent.getContainer())
    {
      if (xsdConcreteComponent instanceof XSDNamedComponent)
      {
        System.out.println("  * " + ((XSDNamedComponent)xsdConcreteComponent).getName());
        break;
      }
    }
  }
  if (t.getSchema() == null)
  {
    System.out.println("!!!!");
  }
}
*/
      }
  
      List firstList = (List)listOfLists.get(0);
      LOOP: for (int index = 0, size = firstList.size(); index < size; ++index)
      {
        Object candidate = firstList.get(index);
        for (Iterator lists = listOfLists.listIterator(1); lists.hasNext(); )
        {
          List list = (List)lists.next();
          if (list.size() <= index || list.get(index) != candidate)
          {
            break LOOP;
          }
        }
        result = (XSDTypeDefinition)candidate;
      }
    }

    return result;
  }

  public XSDTypeDefinition getBaseType()
  {
    return null;
  }

  public XSDTypeDefinition getRootType()
  {
    return null;
  }

  public XSDSimpleTypeDefinition getSimpleType()
  {
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated modifiable
   */
  public XSDParticle getComplexType() 
  {
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case XSDPackage.XSD_TYPE_DEFINITION__ANNOTATION:
        return basicSetAnnotation(null, msgs);
      case XSDPackage.XSD_TYPE_DEFINITION__DERIVATION_ANNOTATION:
        return basicSetDerivationAnnotation(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case XSDPackage.XSD_TYPE_DEFINITION__ANNOTATION:
        return getAnnotation();
      case XSDPackage.XSD_TYPE_DEFINITION__DERIVATION_ANNOTATION:
        return getDerivationAnnotation();
      case XSDPackage.XSD_TYPE_DEFINITION__ANNOTATIONS:
        return getAnnotations();
      case XSDPackage.XSD_TYPE_DEFINITION__ROOT_TYPE:
        return getRootType();
      case XSDPackage.XSD_TYPE_DEFINITION__BASE_TYPE:
        return getBaseType();
      case XSDPackage.XSD_TYPE_DEFINITION__SIMPLE_TYPE:
        return getSimpleType();
      case XSDPackage.XSD_TYPE_DEFINITION__COMPLEX_TYPE:
        return getComplexType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case XSDPackage.XSD_TYPE_DEFINITION__ANNOTATION:
        setAnnotation((XSDAnnotation)newValue);
        return;
      case XSDPackage.XSD_TYPE_DEFINITION__DERIVATION_ANNOTATION:
        setDerivationAnnotation((XSDAnnotation)newValue);
        return;
      case XSDPackage.XSD_TYPE_DEFINITION__ANNOTATIONS:
        getAnnotations().clear();
        getAnnotations().addAll((Collection)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case XSDPackage.XSD_TYPE_DEFINITION__ANNOTATION:
        setAnnotation((XSDAnnotation)null);
        return;
      case XSDPackage.XSD_TYPE_DEFINITION__DERIVATION_ANNOTATION:
        setDerivationAnnotation((XSDAnnotation)null);
        return;
      case XSDPackage.XSD_TYPE_DEFINITION__ANNOTATIONS:
        getAnnotations().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case XSDPackage.XSD_TYPE_DEFINITION__ANNOTATION:
        return annotation != null;
      case XSDPackage.XSD_TYPE_DEFINITION__DERIVATION_ANNOTATION:
        return derivationAnnotation != null;
      case XSDPackage.XSD_TYPE_DEFINITION__ANNOTATIONS:
        return annotations != null && !annotations.isEmpty();
      case XSDPackage.XSD_TYPE_DEFINITION__ROOT_TYPE:
        return getRootType() != null;
      case XSDPackage.XSD_TYPE_DEFINITION__BASE_TYPE:
        return getBaseType() != null;
      case XSDPackage.XSD_TYPE_DEFINITION__SIMPLE_TYPE:
        return getSimpleType() != null;
      case XSDPackage.XSD_TYPE_DEFINITION__COMPLEX_TYPE:
        return getComplexType() != null;
    }
    return super.eIsSet(featureID);
  }

  public boolean isCircular()
  {
    return analysisState == CIRCULAR;
  }

  public XSDTypeDefinition getBadTypeDerivation(XSDTypeDefinition xsdTypeDefinition, boolean extension, boolean restriction)
  {
    throw new UnsupportedOperationException();
  }
}
