/*
 * Copyright 2013-Present Entando Corporation (http://www.entando.com) All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
package com.agiletec.plugins.jacms.apsadmin.resource;

import java.util.List;

/**
 * Interfaccia base per le Action gestrici delle interfaccie di lista risorse.
 * @version 1.0
 * @author E.Santoboni
 */
public interface IResourceFinderAction {
	
	/**
	 * Restituisce la lista di identificativi delle risorse che 
	 * soddisfano i parametri di ricerca immessi.
	 * @return La lista di identificativi di risorse.
	 * @throws Throwable In caso di errore.
	 */
	public List<String> getResources() throws Throwable;
	
}
