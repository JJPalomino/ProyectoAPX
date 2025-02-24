package com.bbva.wikj;

import com.bbva.wikj.dto.client.DtoOut;
import com.bbva.wikj.lib.r788.WIKJR788;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WIKJT78801MXTransaction extends AbstractWIKJT78801MXTransaction {

	private static final Logger LOGGER = LoggerFactory.getLogger(WIKJT78801MXTransaction.class);

	@Override
	public void execute() {
		WIKJR788 wikjR788 = this.getServiceLibrary(WIKJR788.class);
		DtoOut dtoOut = wikjR788.execute(this.getDtoin());
		this.setDtoout(dtoOut);
	}

}
