package com.maven.udemy.course.bo;

import com.maven.udemy.course.dao.ProductDAO;
import com.maven.udemy.course.dto.Product;

public class ProductBOImpl implements ProductBO {

	private ProductDAO dao;
	
	@Override
	public void createProduct(Product product) {
		dao.create(product);
	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

	public void setDao(ProductDAO dao) {
		this.dao = dao;
	}

}
