package com.projectalpha.core.dao;

import java.util.List;

import javax.ejb.Stateless;

import com.projectalpha.core.model.Order;

@Stateless
public class OrderDAO extends GenericDAO<Order> {

	public OrderDAO() {
		super(Order.class);
	}

	public void save(Order order) {
		super.save(order);
	}
	
	public Order update(Order order) {
		return super.update(order);
	}
	
	public void delete(Order order) {
		super.delete(order.getId(), Order.class);
	}
	
	public Order find(int id) {
		return super.find(id);
	}
	
	public List<Order> findAll(){
		return super.findAll();
	}
}
