package com.projectalpha.core.facade;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.projectalpha.core.dao.UserDAO;
import com.projectalpha.core.model.User;


@Stateless
public class UserFacadeImp implements UserFacade {
	
	@EJB
	private UserDAO userDAO;
	
	@Override
	public void save(User user) {
		//implementar métodos para verificar os atributos do objeto
		//isDogWithAllData(dog);
		
		userDAO.save(user);
	}

	@Override
	public User update(User user) {
		//isDogWithAllData(dog);
		
		return userDAO.update(user);
	}
	
	@Override
	public void delete(User user) {
		userDAO.delete(user);
	}

	@Override
	public User find(int entityID) {
		return userDAO.find(entityID);
	}

	@Override
	public List<User> findAll() {
		return userDAO.findAll();
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