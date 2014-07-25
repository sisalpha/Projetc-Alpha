package com.projectalpha.core.facade;

import java.util.List;

import javax.ejb.Local;

import com.projectalpha.core.model.Product;

@Local
public interface ProductFacade {

	public abstract void save(Product dog);

	public abstract Product update(Product dog);
	
	public abstract void delete(Product dog);

	public abstract Product find(int entityID);

	public abstract List<Product> findAll();
}