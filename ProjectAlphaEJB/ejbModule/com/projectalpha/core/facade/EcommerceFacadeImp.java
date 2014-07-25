package com.projectalpha.core.facade;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.projectalpha.core.dao.EcommerceDAO;
import com.projectalpha.core.model.Ecommerce;


@Stateless
public class EcommerceFacadeImp implements EcommerceFacade {
	
	@EJB
	private EcommerceDAO ecommerceDAO;
	
	@Override
	public void save(Ecommerce ecommerce) {
		//implementar métodos para verificar os atributos do objeto
		//isDogWithAllData(dog);
		
		ecommerceDAO.save(ecommerce);
	}

	@Override
	public Ecommerce update(Ecommerce ecommerce) {
		//isDogWithAllData(dog);
		
		return ecommerceDAO.update(ecommerce);
	}
	
	@Override
	public void delete(Ecommerce ecommerce) {
		ecommerceDAO.delete(ecommerce);
	}

	@Override
	public Ecommerce find(int entityID) {
		return ecommerceDAO.find(entityID);
	}

	@Override
	public List<Ecommerce> findAll() {
		return ecommerceDAO.findAll();
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