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
package com.agiletec.plugins.jacms.aps.system.services.resource.model.util;

import java.io.InputStream;

import com.agiletec.aps.system.exception.ApsSystemException;
import com.agiletec.plugins.jacms.aps.system.services.resource.model.ResourceDataBean;
import com.agiletec.plugins.jacms.aps.system.services.resource.model.ResourceInterface;

/**
 * Interfaccia base per le classi Helper per la gestione delle istanze delle risorse.
 * @author E.Santoboni
 * @deprecated Since Entando 3.2.1. Use IStorageManager
 */
public interface IResourceInstanceHelper {
	
	/**
     * Salva un file (ralativo ad un'istanza).
     * Metodo utilizzato da tutti i tipi di risorsa.
     * @param filePath Il path assoluto su disco dove salvare la risorsa.
     * @param bean L'oggetto detentore dei dati della risorsa da inserire.
     * @throws ApsSystemException In caso di errore nel salvataggio del file.
	 * @deprecated 
     */
	public void save(String filePath, ResourceDataBean bean) throws ApsSystemException;
    
	@Deprecated
    public void save(String filePath, InputStream is) throws ApsSystemException;
	
    @Deprecated
    public String getFileExtension(String fileName);
	
    /**
     * Restituisce il path assoluto su disco della cartella di destinazione della risorsa specificata.
     * La posizione su disco dipende (oltre che dai parametri base di configurazione del sistema) dal 
     * tipo di risorsa e dal suo gruppo proprietario.
     * @param resource La risorsa cui ricavare il path assoluto su disco.
     * @return Il path assoluto su disco della risorsa.
	 * @deprecated 
     */
	public String getResourceDiskFolder(ResourceInterface resource);
	
	@Deprecated
    public boolean delete(String filePath) throws ApsSystemException;
	
	@Deprecated
    public boolean exists(String filePath) throws ApsSystemException;
	
}