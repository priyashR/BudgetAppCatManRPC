package com.gmail.ramawthar.priyash.budgetAppCatManRPC.wrapper;

import java.util.ArrayList;
import java.util.List;

public class CategoryList {
	private List<Categories> categories;

	
	
	public CategoryList(){
		this.categories = new ArrayList<>();
	}

	public List<Categories> getCategories() {
		return categories;
	}

	public void setCategories(List<Categories> categories) {
		this.categories = categories;
	}

	
}
