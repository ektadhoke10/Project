package com.vstl.flows;

import com.vstl.generic.Pojo;
import com.vstlpageFactory.LoginPage;

public class LoginLogoutFlow {
	
	private Pojo objPojo;
	private LoginPage objLoginPage;
	
	public LoginLogoutFlow(Pojo pojo) {
		this.objPojo=pojo;
		objLoginPage = new LoginPage(objPojo);
	}
	
	public void doLogin() {
		objLoginPage.setEmail("ektadhoke100@gmail.com");
		objLoginPage.setPassword("Ekta@9960");
		objLoginPage.clickSignIn();
	}
	
}
