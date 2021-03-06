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
package com.agiletec.apsadmin.tags;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.components.Component;
import org.apache.struts2.views.jsp.ComponentTagSupport;

import com.agiletec.apsadmin.tags.util.ApsActionParamComponent;
import com.opensymphony.xwork2.util.ValueStack;

/**
 * Handle the submit in the administration interface.
 * The name of the action is built with a defined sequence of parameters that
 * are retrieved from the action itself.
 * Parameters are inserted in sequence in the correspondence of the name of the action that you want
 * to execute, thus assuming the form:<br />
 * &#60;ACTION_NAME&#62;?&#60;PARAM_NAME_1&#62;=&#60;PARAM_VALUE_1&#62;;&#60;PARAM_NAME_2&#62;=&#60;PARAM_VALUE_2&#62;;....;&#60;PARAM_NAME_N&#62;=&#60;PARAM_VALUE_N&#62;
 * <br />
 * The single parameters are added using the "actionSubParam" tag.
 * @author E.Santoboni
 */
@SuppressWarnings("serial")
public class ApsActionParamTag extends ComponentTagSupport {
	
	@Override
	public Component getBean(ValueStack stack, HttpServletRequest req, HttpServletResponse resp) {
		return new ApsActionParamComponent(stack, req);
	}
	
	@Override
	protected void populateParams() {
		super.populateParams();
		ApsActionParamComponent actionParam = (ApsActionParamComponent) component;
		actionParam.setAction(this.getAction());
		actionParam.setVar(this.getVar());
	}

	/**
	 * Return the name of the variable in the value stack where to store the result.
	 * @return The variable name.
	 */
	public String getVar() {
		return _var;
	}
	
	/**
	 * Set the name of the variable in the value stack where to store the result.
	 * @param var The variable name.
	 */
	public void setVar(String var) {
		this._var = var;
	}
	
	/**
	 * Get the action name.
	 * @return The action name
	 */
	public String getAction() {
		return _action;
	}
	
	/**
	 * Set the action name.
	 * @param action
	 */
	public void setAction(String action) {
		this._action = action;
	}
	
	protected String _var;
	protected String _action;
	
}