package com.projectalpha.ml.facade;

import javax.ejb.Local;

@Local
public interface LoginMLFacade {

	public abstract String login();
}
