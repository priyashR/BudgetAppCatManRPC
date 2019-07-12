package com.gmail.ramawthar.priyash.budgetAppCatManRPC.api;

import com.googlecode.jsonrpc4j.JsonRpcParam;
import com.googlecode.jsonrpc4j.JsonRpcService;

@JsonRpcService("/categories")
public interface CatManAPI {
	String getParent(@JsonRpcParam(value = "cat") String cat);
}
