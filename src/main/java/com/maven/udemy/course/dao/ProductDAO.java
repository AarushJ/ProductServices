package com.maven.udemy.course.dao;

import com.maven.udemy.course.dto.Product;

public interface ProductDAO {
	
	void create(Product product);
	
	Product read(int id);
	
	void update(Product product);
	
	void delete(int id);
}
