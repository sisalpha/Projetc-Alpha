package com.projectalpha.core.dao;

import java.util.List;

import javax.ejb.Stateless;

import com.projectalpha.core.model.Customer;

@Stateless
public class CustomerDAO extends GenericDAO<Customer> {

	public CustomerDAO() {
		super(Customer.class);
	}

	public void save(Customer customer) {
		super.save(customer);
	}
	
	public Customer update(Customer customer) {
		return super.update(customer);
	}
	
	public void delete(Customer customer) {
		super.delete(customer.getId(), Customer.class);
	}
	
	public Customer find(int id) {
		return super.find(id);
	}
	
	public List<Customer> findAll(){
		return super.findAll();
	}
}
