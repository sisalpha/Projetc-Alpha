package com.projectalpha.core.facade;

import java.util.List;

import javax.ejb.Local;

import com.projectalpha.core.model.Coupon;


@Local
public interface CouponFacade {

	public abstract void save(Coupon dog);

	public abstract Coupon update(Coupon dog);
	
	public abstract void delete(Coupon dog);

	public abstract Coupon find(int entityID);

	public abstract List<Coupon> findAll();
}