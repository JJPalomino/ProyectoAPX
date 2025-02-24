package com.bbva.wikj.lib.r788.impl;

import com.bbva.apx.exception.db.NoResultException;
import com.bbva.wikj.dto.client.DtoIn;
import com.bbva.wikj.dto.client.DtoOut;
import java.util.HashMap;
import java.util.Map;

public class WIKJR788Impl extends WIKJR788Abstract {

	@Override
	public DtoOut execute(DtoIn dtoIn) {

		DtoOut dtoOut = new DtoOut();
		Map<String, Object> args = new HashMap<>();

		args.put("id", dtoIn.getId());
		args.put("nuip", dtoIn.getNuip());
		args.put("full_name", dtoIn.getFullname());
		args.put("phone", dtoIn.getPhone());
		args.put("address", dtoIn.getAddress());

		Map<String, Object> response = null;
		try {
			response = this.wikjR789.executeSelect(dtoIn.getNuip());
			if(response==null ){
				int result = this.wikjR789.executeInsert(args);
				if(result==1) {
					response = this.wikjR789.executeSelect(dtoIn.getNuip());
					mapData(dtoOut, response);
				}
			}
		} catch (NoResultException e) {
			return null;
		}
		return dtoOut;
	}

	public DtoOut mapData(DtoOut dtoOut, Map<String, Object> entrada){
		dtoOut.setId(entrada.get("id").toString());
		dtoOut.setNuip(entrada.get("nuip").toString());
		dtoOut.setFullname(entrada.get("full_name").toString());
		dtoOut.setPhone(entrada.get("phone").toString());
		dtoOut.setAddress(entrada.get("address").toString());
		return dtoOut;
	}
}
