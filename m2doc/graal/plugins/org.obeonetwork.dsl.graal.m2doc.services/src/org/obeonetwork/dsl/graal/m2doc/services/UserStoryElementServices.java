/*******************************************************************************
 * Copyright (c) 2017 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.obeonetwork.dsl.graal.m2doc.services;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.obeonetwork.graal.Transition;
import org.obeonetwork.graal.UserStoryElement;
import org.obeonetwork.graal.provider.GraalItemProviderAdapterFactory;

public class UserStoryElementServices {

	/**
	 * 
	 * @param element
	 * @return the label for {@code element}.
	 */
	public String getLabel(UserStoryElement element) {
		if (element instanceof Transition) {
			return new TransitionServices().getLabel((Transition) element);
		} else {
			AdapterFactoryLabelProvider adapterFactory = new AdapterFactoryLabelProvider(
					new GraalItemProviderAdapterFactory());
			return adapterFactory.getText(element);
		}
	}

}
