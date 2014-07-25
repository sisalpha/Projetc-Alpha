package com.projectalpha.core.facade;

import java.util.List;

import javax.ejb.Local;

import com.projectalpha.core.model.Order;

@Local
public interface OrderFacade {

	public abstract void save(Order dog);

	public abstract Order update(Order dog);
	
	public abstract void delete(Order dog);

	public abstract Order find(int entityID);

	public abstract List<Order> findAll();
}