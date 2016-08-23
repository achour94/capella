/*******************************************************************************
 * Copyright (c) 2006, 2016 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.core.data.cs.ui.quickfix.resolver;

import org.polarsys.capella.core.data.cs.ExchangeItemAllocation;
import org.polarsys.capella.core.validation.ui.ide.quickfix.AbstractDeleteCommandResolver;

/**
 * Delete given element
 */
public class DFW_I_11_Delete_Resolver extends AbstractDeleteCommandResolver {

 
  
  /**
   * {@inheritDoc}
   */
  @Override
  public Object getElementToDelete(Object obj) {
    if (obj instanceof ExchangeItemAllocation) {
      return obj;
    }
    return null;
  }
  

}
