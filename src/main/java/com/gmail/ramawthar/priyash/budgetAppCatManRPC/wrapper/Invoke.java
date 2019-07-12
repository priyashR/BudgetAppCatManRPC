package com.gmail.ramawthar.priyash.budgetAppCatManRPC.wrapper;

import java.util.List;

import org.springframework.web.client.RestTemplate;

public class Invoke {

	public String getParent(String category){
		RestTemplate restTemplate = new RestTemplate();
		
		CategoryList response = restTemplate.getForObject(
				  "http://localhost:8080/employees", // need to resolve this URL dynamically
				  CategoryList.class);
				List<Categories> employees = response.getCategories();
		String parent = "Not Found";
		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).getCategory().equalsIgnoreCase(category)){
				parent = employees.get(i).getParent();
			}
			System.out.println(employees.get(i).parent);
		}
				
		return parent;
		
	}
}
