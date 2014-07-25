package com.projectalpha.mb;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import com.projectalpha.core.facade.AdressFacade;
import com.projectalpha.core.facade.CustomerFacade;
import com.projectalpha.core.facade.EcommerceFacade;
import com.projectalpha.core.model.Customer;

@ManagedBean
@RequestScoped
public class TesteEJBMB {

	@EJB
	private AdressFacade adressFacade;
	@EJB
	private CustomerFacade customerFacade;
	@EJB
	private EcommerceFacade ecommerceFacade;

	public void buttonAction(ActionEvent actionEvent) {

		
		Customer customer = new Customer();
		
		customer = customerFacade.find(8);
		
		System.out.println(customer.toString());
	
	}

	private void sendErrorMessageToUser(String message) {
		FacesContext context = getContext();
		context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
				message, message));
	}

	private FacesContext getContext() {
		FacesContext context = FacesContext.getCurrentInstance();
		return context;
	}
}