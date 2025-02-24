package com.bbva.wikj.lib.r788.impl;

import com.bbva.elara.configuration.manager.application.ApplicationConfigurationService;
import com.bbva.elara.library.AbstractLibrary;
import com.bbva.wikj.lib.r788.WIKJR788;
import com.bbva.wikj.lib.r789.WIKJR789;

/**
 * This class automatically defines the libraries and utilities that it will use.
 */
public abstract class WIKJR788Abstract extends AbstractLibrary implements WIKJR788 {

	protected ApplicationConfigurationService applicationConfigurationService;

	protected WIKJR789 wikjR789;


	/**
	* @param applicationConfigurationService the this.applicationConfigurationService to set
	*/
	public void setApplicationConfigurationService(ApplicationConfigurationService applicationConfigurationService) {
		this.applicationConfigurationService = applicationConfigurationService;
	}

	/**
	* @param wikjR789 the this.wikjR789 to set
	*/
	public void setWikjR789(WIKJR789 wikjR789) {
		this.wikjR789 = wikjR789;
	}

}