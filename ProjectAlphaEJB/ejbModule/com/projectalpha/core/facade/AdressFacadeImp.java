package com.projectalpha.core.facade;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.projectalpha.core.dao.AdressDAO;
import com.projectalpha.core.model.Adress;


@Stateless
public class AdressFacadeImp implements AdressFacade {
	
	@EJB
	private AdressDAO adressDAO;
	
	@Override
	public void save(Adress adress)  {
		
		isAdressWithAllData(adress);
		
		adressDAO.save(adress);
	}

	@Override
	public Adress update(Adress adress) {
		isAdressWithAllData(adress);
		
		return adressDAO.update(adress);
	}
	
	@Override
	public void delete(Adress adress) {
		adressDAO.delete(adress);
	}

	@Override
	public Adress find(int entityID) {
		return adressDAO.find(entityID);
	}

	@Override
	public List<Adress> findAll() {
		return adressDAO.findAll();
	}

	private void isAdressWithAllData(Adress adress) throws IllegalArgumentException {
		boolean hasError = false;
		
		if(adress == null){
			hasError = true;
		}
		
			throw new IllegalArgumentException();
	
	}

}