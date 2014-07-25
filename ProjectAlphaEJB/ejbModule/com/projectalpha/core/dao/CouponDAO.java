package com.projectalpha.core.dao;

import java.util.List;

import javax.ejb.Stateless;

import com.projectalpha.core.model.Coupon;

@Stateless
public class CouponDAO extends GenericDAO<Coupon> {

	public CouponDAO() {
		super(Coupon.class);
	}

	public void save(Coupon coupon) {
		super.save(coupon);
	}
	
	public Coupon update(Coupon coupon) {
		return super.update(coupon);
	}
	
	public void delete(Coupon coupon) {
		super.delete(coupon.getId(), Coupon.class);
	}
	
	public Coupon find(int id) {
		return super.find(id);
	}
	
	public List<Coupon> findAll(){
		return super.findAll();
	}
}
