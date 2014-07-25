package com.projectalpha.core.facade;

import java.util.List;

import javax.ejb.Local;

import com.projectalpha.core.model.PaymentMethod;

@Local
public interface PaymentMethodFacade {

	public abstract void save(PaymentMethod dog);

	public abstract PaymentMethod update(PaymentMethod dog);
	
	public abstract void delete(PaymentMethod dog);

	public abstract PaymentMethod find(int entityID);

	public abstract List<PaymentMethod> findAll();
}