package com.projectalpha.core.dao;

import java.util.List;

import javax.ejb.Stateless;

import com.projectalpha.core.model.StatusOrder;

@Stateless
public class StatusOrderDAO extends GenericDAO<StatusOrder> {

	public StatusOrderDAO() {
		super(StatusOrder.class);
	}

	public void save(StatusOrder statusOrder) {
		super.save(statusOrder);
	}
	
	public StatusOrder update(StatusOrder statusOrder) {
		return super.update(statusOrder);
	}
	
	public void delete(StatusOrder statusOrder) {
		super.delete(statusOrder.getId(), StatusOrder.class);
	}
	
	public StatusOrder find(int id) {
		return super.find(id);
	}
	
	public List<StatusOrder> findAll(){
		return super.findAll();
	}
}
