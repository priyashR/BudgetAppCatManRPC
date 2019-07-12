package com.gmail.ramawthar.priyash.budgetAppCatManRPC.wrapper;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Invoke {

	public String getParent(String category){
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<List<Categories>> catResponse = restTemplate.exchange("http://localhost:9875/categories", //need to do this dynamically
																		  HttpMethod.GET, 
																		  null, 
																		  new ParameterizedTypeReference<List<Categories>>() {});
		List<Categories> cats = catResponse.getBody();
		String parent = "Not Found";
		for (int i = 0; i < cats.size(); i++) {
			if (cats.get(i).getCategory().equalsIgnoreCase(category)){
				parent = cats.get(i).getParent();
			}
		//System.out.println(cats.get(i).parent);
		}
				
		return parent;
		
	}
}
