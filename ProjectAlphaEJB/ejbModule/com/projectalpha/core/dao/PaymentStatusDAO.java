package com.projectalpha.core.dao;

import java.util.List;

import javax.ejb.Stateless;

import com.projectalpha.core.model.PaymentStatus;

@Stateless
public class PaymentStatusDAO extends GenericDAO<PaymentStatus> {

	public PaymentStatusDAO() {
		super(PaymentStatus.class);
	}

	public void save(PaymentStatus paymentStatus) {
		super.save(paymentStatus);
	}
	
	public PaymentStatus update(PaymentStatus paymentStatus) {
		return super.update(paymentStatus);
	}
	
	public void delete(PaymentStatus paymentStatus) {
		super.delete(paymentStatus.getId(), PaymentStatus.class);
	}
	
	public PaymentStatus find(int id) {
		return super.find(id);
	}
	
	public List<PaymentStatus> findAll(){
		return super.findAll();
	}
}
