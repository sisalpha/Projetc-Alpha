package com.projectalpha.core.dao;

import java.util.List;

import javax.ejb.Stateless;

import com.projectalpha.core.model.PaymentMethod;

@Stateless
public class PaymentMethodDAO extends GenericDAO<PaymentMethod> {

	public PaymentMethodDAO() {
		super(PaymentMethod.class);
	}

	public void save(PaymentMethod paymentMethod) {
		super.save(paymentMethod);
	}
	
	public PaymentMethod update(PaymentMethod paymentMethod) {
		return super.update(paymentMethod);
	}
	
	public void delete(PaymentMethod paymentMethod) {
		super.delete(paymentMethod.getId(), PaymentMethod.class);
	}
	
	public PaymentMethod find(int id) {
		return super.find(id);
	}
	
	public List<PaymentMethod> findAll(){
		return super.findAll();
	}
}
