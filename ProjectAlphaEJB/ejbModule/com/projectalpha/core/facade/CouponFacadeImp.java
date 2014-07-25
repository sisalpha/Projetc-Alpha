package com.projectalpha.core.facade;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.projectalpha.core.dao.CouponDAO;
import com.projectalpha.core.model.Coupon;


@Stateless
public class CouponFacadeImp implements CouponFacade {
	
	@EJB
	private CouponDAO couponDAO;
	
	@Override
	public void save(Coupon coupon) {
		//implementar métodos para verificar os atributos do objeto
		//isDogWithAllData(dog);
		
		couponDAO.save(coupon);
	}

	@Override
	public Coupon update(Coupon coupon) {
		//isDogWithAllData(dog);
		
		return couponDAO.update(coupon);
	}
	
	@Override
	public void delete(Coupon coupon) {
		couponDAO.delete(coupon);
	}

	@Override
	public Coupon find(int entityID) {
		return couponDAO.find(entityID);
	}

	@Override
	public List<Coupon> findAll() {
		return couponDAO.findAll();
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