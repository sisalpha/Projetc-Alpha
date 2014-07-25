package com.projectalpha.core.facade;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.projectalpha.core.dao.PaymentMethodDAO;
import com.projectalpha.core.model.PaymentMethod;


@Stateless
public class PaymentMethodFacadeImp implements PaymentMethodFacade {
	
	@EJB
	private PaymentMethodDAO paymentMethodDAO;
	
	@Override
	public void save(PaymentMethod paymentMethod) {
		//implementar métodos para verificar os atributos do objeto
		//isDogWithAllData(dog);
		
		paymentMethodDAO.save(paymentMethod);
	}

	@Override
	public PaymentMethod update(PaymentMethod paymentMethod) {
		//isDogWithAllData(dog);
		
		return paymentMethodDAO.update(paymentMethod);
	}
	
	@Override
	public void delete(PaymentMethod paymentMethod) {
		paymentMethodDAO.delete(paymentMethod);
	}

	@Override
	public PaymentMethod find(int entityID) {
		return paymentMethodDAO.find(entityID);
	}

	@Override
	public List<PaymentMethod> findAll() {
		return paymentMethodDAO.findAll();
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