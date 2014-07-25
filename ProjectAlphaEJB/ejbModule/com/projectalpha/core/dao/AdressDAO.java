package com.projectalpha.core.dao;

import java.util.List;

import javax.ejb.Stateless;

import com.projectalpha.core.model.Adress;

@Stateless
public class AdressDAO extends GenericDAO<Adress> {

	public AdressDAO() {
		super(Adress.class);
	}

	public void save(Adress adress) {
		super.save(adress);
	}
	
	public Adress update(Adress adress) {
		return super.update(adress);
	}
	
	public void delete(Adress adress) {
		super.delete(adress.getId(), Adress.class);
	}
	
	public Adress find(int id) {
		return super.find(id);
	}
	
	public List<Adress> findAll(){
		return super.findAll();
	}
}
