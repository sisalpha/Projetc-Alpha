package com.projectalpha.core.facade;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.projectalpha.core.dao.OrderDAO;
import com.projectalpha.core.model.Order;


@Stateless
public class OrderFacadeImp implements OrderFacade {
	
	@EJB
	private OrderDAO orderDAO;
	
	@Override
	public void save(Order order) {
		//implementar métodos para verificar os atributos do objeto
		//isDogWithAllData(dog);
		
		orderDAO.save(order);
	}

	@Override
	public Order update(Order order) {
		//isDogWithAllData(dog);
		
		return orderDAO.update(order);
	}
	
	@Override
	public void delete(Order order) {
		orderDAO.delete(order);
	}

	@Override
	public Order find(int entityID) {
		return orderDAO.find(entityID);
	}

	@Override
	public List<Order> findAll() {
		return orderDAO.findAll();
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