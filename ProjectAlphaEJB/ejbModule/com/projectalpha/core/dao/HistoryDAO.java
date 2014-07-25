package com.projectalpha.core.dao;

import java.util.List;

import javax.ejb.Stateless;

import com.projectalpha.core.model.History;

@Stateless
public class HistoryDAO extends GenericDAO<History> {

	public HistoryDAO() {
		super(History.class);
	}

	public void save(History history) {
		super.save(history);
	}
	
	public History update(History history) {
		return super.update(history);
	}
	
	public void delete(History history) {
		super.delete(history.getId(), History.class);
	}
	
	public History find(int id) {
		return super.find(id);
	}
	
	public List<History> findAll(){
		return super.findAll();
	}
}
