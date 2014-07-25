package com.projectalpha.core.facade;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.projectalpha.core.dao.StatusOrderDAO;
import com.projectalpha.core.model.StatusOrder;


@Stateless
public class StatusOrderFacadeImp implements StatusOrderFacade {
	
	@EJB
	private StatusOrderDAO statusOrderDAO;
	
	@Override
	public void save(StatusOrder statusOrder) {
		//implementar métodos para verificar os atributos do objeto
		//isDogWithAllData(dog);
		
		statusOrderDAO.save(statusOrder);
	}

	@Override
	public StatusOrder update(StatusOrder statusOrder) {
		//isDogWithAllData(dog);
		
		return statusOrderDAO.update(statusOrder);
	}
	
	@Override
	public void delete(StatusOrder statusOrder) {
		statusOrderDAO.delete(statusOrder);
	}

	@Override
	public StatusOrder find(int entityID) {
		return statusOrderDAO.find(entityID);
	}

	@Override
	public List<StatusOrder> findAll() {
		return statusOrderDAO.findAll();
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