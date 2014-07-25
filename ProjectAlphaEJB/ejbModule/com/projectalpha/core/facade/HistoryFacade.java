package com.projectalpha.core.facade;

import java.util.List;

import javax.ejb.Local;

import com.projectalpha.core.model.History;

@Local
public interface HistoryFacade {

	public abstract void save(History dog);

	public abstract History update(History dog);
	
	public abstract void delete(History dog);

	public abstract History find(int entityID);

	public abstract List<History> findAll();
}