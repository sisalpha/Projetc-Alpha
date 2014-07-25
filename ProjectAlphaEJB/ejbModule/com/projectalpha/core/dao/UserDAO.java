package com.projectalpha.core.dao;

import java.util.List;

import javax.ejb.Stateless;

import com.projectalpha.core.model.User;

@Stateless
public class UserDAO extends GenericDAO<User> {

	public UserDAO() {
		super(User.class);
	}

	public void save(User user) {
		super.save(user);
	}
	
	public User update(User user) {
		return super.update(user);
	}
	
	public void delete(User user) {
		super.delete(user.getId(), User.class);
	}
	
	public User find(int id) {
		return super.find(id);
	}
	
	public List<User> findAll(){
		return super.findAll();
	}
}
