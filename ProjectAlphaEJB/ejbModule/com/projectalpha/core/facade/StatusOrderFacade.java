package com.projectalpha.core.facade;

import java.util.List;

import javax.ejb.Local;

import com.projectalpha.core.model.StatusOrder;

@Local
public interface StatusOrderFacade {

	public abstract void save(StatusOrder dog);

	public abstract StatusOrder update(StatusOrder dog);
	
	public abstract void delete(StatusOrder dog);

	public abstract StatusOrder find(int entityID);

	public abstract List<StatusOrder> findAll();
}