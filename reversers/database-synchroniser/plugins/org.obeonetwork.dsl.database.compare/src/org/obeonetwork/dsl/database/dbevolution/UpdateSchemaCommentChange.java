/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.database.dbevolution;

import org.eclipse.emf.compare.AttributeChange;
import org.obeonetwork.dsl.database.Schema;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Schema Comment Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.database.dbevolution.UpdateSchemaCommentChange#getNewSchema <em>New Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.database.dbevolution.DbevolutionPackage#getUpdateSchemaCommentChange()
 * @model
 * @generated
 */
public interface UpdateSchemaCommentChange extends SchemaChange {

	/**
	 * Returns the value of the '<em><b>New Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Schema</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Schema</em>' reference.
	 * @see #setNewSchema(Schema)
	 * @see org.obeonetwork.dsl.database.dbevolution.DbevolutionPackage#getUpdateSchemaCommentChange_NewSchema()
	 * @model required="true"
	 * @generated
	 */
	Schema getNewSchema();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.database.dbevolution.UpdateSchemaCommentChange#getNewSchema <em>New Schema</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Schema</em>' reference.
	 * @see #getNewSchema()
	 * @generated
	 */
	void setNewSchema(Schema value);
} // UpdateSchemaCommentChange