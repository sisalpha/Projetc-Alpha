package com.projectalpha.core.facade;

import java.util.List;

import javax.ejb.Local;

import com.projectalpha.core.model.Customer;


@Local
public interface CustomerFacade {

	public abstract void save(Customer customer);

	public abstract Customer update(Customer customer);
	
	public abstract void delete(Customer customer);

	public abstract Customer find(int entityID);

	public abstract List<Customer> findAll();
}