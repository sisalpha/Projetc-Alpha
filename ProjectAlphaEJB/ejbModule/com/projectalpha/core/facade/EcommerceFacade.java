package com.projectalpha.core.facade;

import java.util.List;

import javax.ejb.Local;

import com.projectalpha.core.model.Ecommerce;


@Local
public interface EcommerceFacade {

	public abstract void save(Ecommerce ecommerce);

	public abstract Ecommerce update(Ecommerce ecommerce);
	
	public abstract void delete(Ecommerce ecommerce);

	public abstract Ecommerce find(int entityID);

	public abstract List<Ecommerce> findAll();
}