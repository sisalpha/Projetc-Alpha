package com.projectalpha.core.facade;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.projectalpha.core.dao.ProductDAO;
import com.projectalpha.core.model.Product;


@Stateless
public class ProductFacadeImp implements ProductFacade {
	
	@EJB
	private ProductDAO productDAO;
	
	@Override
	public void save(Product product) {
		//implementar métodos para verificar os atributos do objeto
		//isDogWithAllData(dog);
		
		productDAO.save(product);
	}

	@Override
	public Product update(Product product) {
		//isDogWithAllData(dog);
		
		return productDAO.update(product);
	}
	
	@Override
	public void delete(Product product) {
		productDAO.delete(product);
	}

	@Override
	public Product find(int entityID) {
		return productDAO.find(entityID);
	}

	@Override
	public List<Product> findAll() {
		return productDAO.findAll();
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