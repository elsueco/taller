package com.satellite.dao;

import java.util.List;

import com.satellite.domain.Model;
import com.satellite.domain.Product;

interface ProductDao {
	void insertProduct(Model modelo) ;
	List<Product> getAllProduct();
	Product getProduct(Integer id);
	void deleteProduct(Integer id);

}
