package com.maven.udemy.course.bo;

import com.maven.udemy.course.dto.Product;

public interface ProductBO {
	
	public void createProduct(Product product);
	
	public Product findProduct(int id);
}
