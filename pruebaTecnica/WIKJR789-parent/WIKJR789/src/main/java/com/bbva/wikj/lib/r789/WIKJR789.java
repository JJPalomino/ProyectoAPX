package com.bbva.wikj.lib.r789;

import java.util.Map;

public interface WIKJR789 {

	Map<String, Object> executeSelect(String nuip);

	int executeInsert(Map<String,Object> args);

}
