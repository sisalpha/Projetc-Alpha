package com.projectalpha.core.facade;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.projectalpha.core.dao.PaymentStatusDAO;
import com.projectalpha.core.model.PaymentStatus;


@Stateless
public class PaymentStatusFacadeImp implements PaymentStatusFacade {
	
	@EJB
	private PaymentStatusDAO paymentStatusDAO;
	
	@Override
	public void save(PaymentStatus paymentStatus) {
		//implementar métodos para verificar os atributos do objeto
		//isDogWithAllData(dog);
		
		paymentStatusDAO.save(paymentStatus);
	}

	@Override
	public PaymentStatus update(PaymentStatus paymentStatus) {
		//isDogWithAllData(dog);
		
		return paymentStatusDAO.update(paymentStatus);
	}
	
	@Override
	public void delete(PaymentStatus paymentStatus) {
		paymentStatusDAO.delete(paymentStatus);
	}

	@Override
	public PaymentStatus find(int entityID) {
		return paymentStatusDAO.find(entityID);
	}

	@Override
	public List<PaymentStatus> findAll() {
		return paymentStatusDAO.findAll();
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