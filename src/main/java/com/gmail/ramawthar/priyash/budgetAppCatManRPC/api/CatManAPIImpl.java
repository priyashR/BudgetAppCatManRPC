package com.gmail.ramawthar.priyash.budgetAppCatManRPC.api;


import com.gmail.ramawthar.priyash.budgetAppCatManRPC.wrapper.Invoke;
import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImpl;
import org.springframework.stereotype.Service;

@Service
@AutoJsonRpcServiceImpl
public class CatManAPIImpl implements CatManAPI{
    @Override
    public String getParent(String cat) {
    	String response = "Cool";
    	//call he webservice here
    	//make sure the source application(budgetAppCatMan) is running first
    	Invoke invocation = new Invoke();
    	response = invocation.getParent(cat);
        return response;
    }
    //cURL example
    //curl -H "Content-Type:application/json" -d '{"id":"1","jsonrpc":"2.0","method":"getParent","params":{"cat":"test"}}' http://localhost:8080/categories


}