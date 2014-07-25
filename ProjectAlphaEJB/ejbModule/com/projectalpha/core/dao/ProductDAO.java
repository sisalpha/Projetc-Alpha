package com.projectalpha.core.dao;

import java.util.List;

import javax.ejb.Stateless;

import com.projectalpha.core.model.Product;

@Stateless
public class ProductDAO extends GenericDAO<Product> {

	public ProductDAO() {
		super(Product.class);
	}

	public void save(Product product) {
		super.save(product);
	}
	
	public Product update(Product product) {
		return super.update(product);
	}
	
	public void delete(Product product) {
		super.delete(product.getId(), Product.class);
	}
	
	public Product find(int id) {
		return super.find(id);
	}
	
	public List<Product> findAll(){
		return super.findAll();
	}
}
