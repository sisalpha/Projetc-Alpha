package com.projectalpha.core.facade;

import java.util.List;

import javax.ejb.Local;

import com.projectalpha.core.model.PaymentStatus;

@Local
public interface PaymentStatusFacade {

	public abstract void save(PaymentStatus dog);

	public abstract PaymentStatus update(PaymentStatus dog);
	
	public abstract void delete(PaymentStatus dog);

	public abstract PaymentStatus find(int entityID);

	public abstract List<PaymentStatus> findAll();
}