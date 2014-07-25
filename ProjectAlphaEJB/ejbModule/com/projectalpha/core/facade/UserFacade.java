package com.projectalpha.core.facade;

import java.util.List;

import javax.ejb.Local;

import com.projectalpha.core.model.User;

@Local
public interface UserFacade {

	public abstract void save(User dog);

	public abstract User update(User dog);
	
	public abstract void delete(User dog);

	public abstract User find(int entityID);

	public abstract List<User> findAll();
}