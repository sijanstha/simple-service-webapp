package com.sijan.mapper;

import java.util.List;

import com.sijan.model.Product;

public interface ProductMapper {
	void insertProduct(Product product);
	Product getProductById(int id);
	List<Product> getAllProducts();
	void updateProduct(Product product);
	void deleteProduct(int id);
}
