package com.projectalpha.ml.mb;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;

import com.projectalpha.ml.facade.LoginMLFacade;

@ManagedBean
public class LoginMLMB {

	@EJB
	LoginMLFacade loginMLFacade;

	public void login(ActionEvent actionEvent) {
		System.out.println("Executando Login");

		String url = loginMLFacade.login();
		System.out.println(url);
//		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
//
//		try {
//			externalContext.redirect(url);
//		} catch (IOException e) {
//			System.out.println("ERRO Redirecionamento: " + e.getMessage());
//		}

	}

	public void teste(ActionEvent actionEvent) {
		System.out.println("Executando Auth");
		// loginMLFacade.auth();
	}

}