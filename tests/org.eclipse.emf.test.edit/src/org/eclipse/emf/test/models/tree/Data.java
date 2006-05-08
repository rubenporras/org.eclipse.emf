/**
 * <copyright>
 * </copyright>
 *
 * $Id: Data.java,v 1.1 2006/05/08 21:59:44 davidms Exp $
 */
package org.eclipse.emf.test.models.tree;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.test.models.tree.Data#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.test.models.tree.Data#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.test.models.tree.TreePackage#getData()
 * @model
 * @generated
 */
public interface Data extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.emf.test.models.tree.TreePackage#getData_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.emf.test.models.tree.Data#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Node</b></em>' reference.
   * It is bidirectional and its opposite is '{@link org.eclipse.emf.test.models.tree.Node#getData <em>Data</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node</em>' reference.
   * @see #setNode(Node)
   * @see org.eclipse.emf.test.models.tree.TreePackage#getData_Node()
   * @see org.eclipse.emf.test.models.tree.Node#getData
   * @model opposite="data" required="true"
   * @generated
   */
  Node getNode();

  /**
   * Sets the value of the '{@link org.eclipse.emf.test.models.tree.Data#getNode <em>Node</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node</em>' reference.
   * @see #getNode()
   * @generated
   */
  void setNode(Node value);

} // Data