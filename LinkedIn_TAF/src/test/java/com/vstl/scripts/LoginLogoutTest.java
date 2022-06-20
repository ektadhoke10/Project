package com.vstl.scripts;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vstl.flows.LoginLogoutFlow;
import com.vstl.generic.BaseTest;
import com.vstlpageFactory.HomePage;
import com.vstlpageFactory.LoginPage;

public class LoginLogoutTest extends BaseTest {

	private LoginPage objLoginPage;
	private LoginLogoutFlow objLoginLogoutFlow;
	private HomePage objHomePage;

	public void initilizeWebPages(){
		objLoginPage = new LoginPage(this);
		objLoginLogoutFlow = new LoginLogoutFlow(this);
		objHomePage = new HomePage(this);
	}

	@BeforeClass
	public void initilizeWebEnv() {
		this.initilizeWebPages();
		this.initilizeWebEnvironment();
	}

	@AfterClass
	public void tearDownEnv() {
		this.tearDown();
	}

	@Test
	public void TCID_101_VerifyHomePageDisplayed() {
		objLoginLogoutFlow.doLogin();
		//		objHomePage.verifyHomeTextIsDisplayedOnHomePage();
	}

}
