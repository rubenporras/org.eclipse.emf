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
 * $Id: XSDPatternFacetImpl.java,v 1.10 2005/11/25 13:13:59 emerks Exp $
 */
package org.eclipse.xsd.impl;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.w3c.dom.Element;
import org.w3c.dom.Node;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.xml.type.internal.RegEx.ParseException;
import org.eclipse.emf.ecore.xml.type.internal.RegEx.RegularExpression;

import org.eclipse.xsd.XSDAnnotation;
import org.eclipse.xsd.XSDConcreteComponent;
import org.eclipse.xsd.XSDDiagnostic;
import org.eclipse.xsd.XSDDiagnosticSeverity;
import org.eclipse.xsd.XSDFactory;
import org.eclipse.xsd.XSDPackage;
import org.eclipse.xsd.XSDPatternFacet;
import org.eclipse.xsd.XSDPlugin;
import org.eclipse.xsd.XSDSimpleTypeDefinition;
import org.eclipse.xsd.util.XSDConstants;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Facet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xsd.impl.XSDPatternFacetImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XSDPatternFacetImpl 
  extends XSDRepeatableFacetImpl 
  implements XSDPatternFacet
{
  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected EList value = null;

  public static XSDPatternFacet createPatternFacet(Node node)
  {
    if (XSDConstants.nodeType(node) == XSDConstants.PATTERN_ELEMENT)
    {
      XSDPatternFacet xsdPatternFacet = XSDFactory.eINSTANCE.createXSDPatternFacet();
      xsdPatternFacet.setElement((Element)node);
      return xsdPatternFacet;
    }

    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XSDPatternFacetImpl()
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
    return XSDPackage.Literals.XSD_PATTERN_FACET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getValue()
  {
    if (value == null)
    {
      value = new EDataTypeUniqueEList(String.class, this, XSDPackage.XSD_PATTERN_FACET__VALUE);
    }
    return value;
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
      case XSDPackage.XSD_PATTERN_FACET__VALUE:
        return getValue();
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
      case XSDPackage.XSD_PATTERN_FACET__VALUE:
        getValue().clear();
        getValue().addAll((Collection)newValue);
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
      case XSDPackage.XSD_PATTERN_FACET__VALUE:
        getValue().clear();
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
      case XSDPackage.XSD_PATTERN_FACET__VALUE:
        return value != null && !value.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

  public Element createElement()
  {
    Element newElement = createElement(XSDConstants.PATTERN_ELEMENT);
    setElement(newElement);
    return newElement;
  }

  protected Collection patterns;
  public Collection getPatterns(boolean withDiagnostics)
  {
    if (patterns == null || withDiagnostics)
    {
      patterns = new ArrayList();
      Collection theValues = getValue();
      if (theValues.isEmpty())
      {
        XSDSimpleTypeDefinition xsdSimpleTypeDefinition = (XSDSimpleTypeDefinition)getContainer();
        if (xsdSimpleTypeDefinition != null && !xsdSimpleTypeDefinition.getSyntheticFacets().contains(this))
        {
          createRequiredAttributeDiagnostic(XSDConstants.PART1, "element-pattern", getElement(), XSDConstants.VALUE_ATTRIBUTE);
        }
      }
      else
      {
        for (Iterator values = theValues.iterator(); values.hasNext(); )
        {
          String value = (String)values.next();
          try
          {
            patterns.add(new RegularExpression(value, "X"));
          }
          catch (ParseException parseException)
          {
            if (withDiagnostics)
            {
              createPatternDiagnostic(parseException.getMessage(), parseException.getLocation());
            }
          }
        }
      }
    }
    return patterns;
  }

  public void validateValue()
  {
    getPatterns(true);
  }

  protected XSDDiagnostic createPatternDiagnostic(String parseError, int location)
  {
    XSDDiagnostic result = getXSDFactory().createXSDDiagnostic();
    result.setSeverity(XSDDiagnosticSeverity.ERROR_LITERAL);
    result.setMessage
      (XSDPlugin.INSTANCE.getString
         ("_UI_XSDError_message", 
          new Object [] 
          { 
            XSDPlugin.INSTANCE.getString("dt-regex", new Object [] { getLexicalValue(), new Integer(location), parseError })
          }));
    result.setAnnotationURI(XSDConstants.PART1 + "#dt-regex");
    result.setPrimaryComponent(this);
    result.setNode(getElement());
    getDiagnostics().add(result);
    return result;
  }

  protected boolean analyze()
  {
    super.analyze();
    XSDSimpleTypeDefinition xsdSimpleTypeDefinition = (XSDSimpleTypeDefinition)getContainer();
    if (xsdSimpleTypeDefinition != null && !xsdSimpleTypeDefinition.getSyntheticFacets().contains(this))
    {
      Object newValue = getLexicalValue();
      if (!getValue().contains(newValue))
      {
        getValue().clear();
        if (newValue != null)
        {
          getValue().add(newValue);
        }
        patterns = null;
      }
    }
    return true;
  }

  protected void changeAttribute(EAttribute eAttribute)
  {
    super.changeAttribute(eAttribute);
    if (eAttribute == XSDPackage.Literals.XSD_FACET__LEXICAL_VALUE)
    {
      traverseToRootForAnalysis();
      patterns = null;
    }
  }
  public boolean isConstraintSatisfied(Object value)
  {
    for (Iterator thePatterns = getPatterns(false).iterator(); thePatterns.hasNext(); )
    {
      RegularExpression pattern = (RegularExpression)thePatterns.next();
      if (!pattern.matches((String)value))
      {
        return false;
      }
    }
    return true;
  }

  public Object getEffectiveValue()
  {
    return getValue();
  }

  public XSDConcreteComponent cloneConcreteComponent(boolean deep, boolean shareDOM)
  {
    XSDPatternFacetImpl clonedPatternFacet =
      (XSDPatternFacetImpl)getXSDFactory().createXSDPatternFacet();
    clonedPatternFacet.isReconciling = true;

    if (getLexicalValue() != null)
    {
      clonedPatternFacet.setLexicalValue(getLexicalValue());
    }

    if (shareDOM && getElement() != null)
    {
      clonedPatternFacet.setElement(getElement());
    }

    if (deep)
    {
      if (getAnnotation() != null)
      {
        clonedPatternFacet.setAnnotation((XSDAnnotation)getAnnotation().cloneConcreteComponent(deep, shareDOM));
      }
    }

    clonedPatternFacet.isReconciling = shareDOM;
    return clonedPatternFacet;
  }
}
