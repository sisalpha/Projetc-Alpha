package com.projectalpha.core.dao;

import java.util.List;

import javax.ejb.Stateless;

import com.projectalpha.core.model.Ecommerce;

@Stateless
public class EcommerceDAO extends GenericDAO<Ecommerce> {

	public EcommerceDAO() {
		super(Ecommerce.class);
	}

	public void save(Ecommerce ecommerce) {
		super.save(ecommerce);
	}
	
	public Ecommerce update(Ecommerce ecommerce) {
		return super.update(ecommerce);
	}
	
	public void delete(Ecommerce ecommerce) {
		super.delete(ecommerce.getId(), Ecommerce.class);
	}
	
	public Ecommerce find(int id) {
		return super.find(id);
	}
	
	public List<Ecommerce> findAll(){
		return super.findAll();
	}
}
