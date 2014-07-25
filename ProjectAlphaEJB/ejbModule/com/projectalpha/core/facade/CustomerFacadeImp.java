package com.projectalpha.core.facade;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.projectalpha.core.dao.CustomerDAO;
import com.projectalpha.core.model.Customer;


@Stateless
public class CustomerFacadeImp implements CustomerFacade {
	
	@EJB
	private CustomerDAO customerDAO;
	
	@Override
	public void save(Customer customer) {
		//implementar métodos para verificar os atributos do objeto
		//isDogWithAllData(dog);
		
		customerDAO.save(customer);
	}

	@Override
	public Customer update(Customer customer) {
		//isDogWithAllData(dog);
		
		return customerDAO.update(customer);
	}
	
	@Override
	public void delete(Customer customer) {
		customerDAO.delete(customer);
	}

	@Override
	public Customer find(int entityID) {
		return customerDAO.find(entityID);
	}

	@Override
	public List<Customer> findAll() {
		return customerDAO.findAll();
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