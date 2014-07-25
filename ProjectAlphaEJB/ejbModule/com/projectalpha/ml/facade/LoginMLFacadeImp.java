package com.projectalpha.ml.facade;

import javax.ejb.Stateless;

import com.projectalpha.ml.api.Meli;
import com.projectalpha.ml.model.LoginML;

@Stateless
public class LoginMLFacadeImp implements LoginMLFacade{
	
	@Override
	public String login() {
		String clientId = LoginML.getInstance().getClientId();
		String clientSecret = LoginML.getInstance().getClientSecret();
		Meli meli = new Meli(clientId, clientSecret);
		
		return meli.getAuthUrl("http://localhost:8080/ProjectAlphaJSF/pages/testeML.xhtml");
	}

}
