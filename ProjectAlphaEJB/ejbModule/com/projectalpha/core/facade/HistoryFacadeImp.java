package com.projectalpha.core.facade;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.projectalpha.core.dao.HistoryDAO;
import com.projectalpha.core.model.History;


@Stateless
public class HistoryFacadeImp implements HistoryFacade {
	
	@EJB
	private HistoryDAO historyDAO;
	
	@Override
	public void save(History history) {
		//implementar métodos para verificar os atributos do objeto
		//isDogWithAllData(dog);
		
		historyDAO.save(history);
	}

	@Override
	public History update(History history) {
		//isDogWithAllData(dog);
		
		return historyDAO.update(history);
	}
	
	@Override
	public void delete(History history) {
		historyDAO.delete(history);
	}

	@Override
	public History find(int entityID) {
		return historyDAO.find(entityID);
	}

	@Override
	public List<History> findAll() {
		return historyDAO.findAll();
	}

//	private void isDogWithAllData(Adress dog){
//		boolean hasError = false;
//		
//		if(dog == null){
//			hasError = true;
//		}
//		
//		if (dog.getName() == null || "".equals(dog.getName().trim())){
//			hasError = true;
//		}
//		
//		if(dog.getWeight() <= 0){
//			hasError = true;
//		}
//		
//		if (hasError){
//			throw new IllegalArgumentException("The dog is missing data. Check the name and weight, they should have value.");
//		}
//	}
}