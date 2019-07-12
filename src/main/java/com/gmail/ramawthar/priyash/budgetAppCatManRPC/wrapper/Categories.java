package com.gmail.ramawthar.priyash.budgetAppCatManRPC.wrapper;



public class Categories {
	public String _id;
	
	public String category;
	public String description;
	public String parent;
	
	public Categories(){}
	
	public String get_id() { return _id; }
	public void set_id(String _id) { this._id = _id; }

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}
	
	
	

}
