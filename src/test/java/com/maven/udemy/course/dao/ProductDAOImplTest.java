package com.maven.udemy.course.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.maven.udemy.course.dto.Product;

public class ProductDAOImplTest {

	@Test
	public void createShouldCreateAProduct() {
		final ProductDAO dao = new ProductDAOImpl();
		final Product product = createProduct(1, "IPhone", "It's awesome", 800);
		dao.create(product);
		final int idToRead = 1;
		final Product result = dao.read(idToRead);
		final String expectedName = "IPhone";
		assertNotNull(result);
		assertEquals(expectedName, result.getName());
	}
	
	private static Product createProduct(final int id, final String name,
			final String description, final double price) {
		final Product product = new Product();
		product.setId(id);
		product.setName(name);
		product.setDescription(description);
		product.setPrice(price);
		return product;
	}

}
