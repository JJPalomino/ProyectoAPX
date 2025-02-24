package com.bbva.wikj;

import com.bbva.elara.transaction.AbstractTransaction;
import com.bbva.wikj.dto.client.DtoIn;
import com.bbva.wikj.dto.client.DtoOut;

public abstract class AbstractWIKJT78801MXTransaction extends AbstractTransaction {

	public AbstractWIKJT78801MXTransaction(){
	}

	protected DtoIn getDtoin(){
		return (DtoIn)this.getParameter("dtoIn");
	}

	protected void setDtoout(final DtoOut field){
		this.addParameter("dtoOut", field);
	}
}
