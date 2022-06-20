package com.vstl.generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest extends Pojo{

	private static WebDriver driver;
	private String strBaseUrl;
	private Utilities objUtilities;
	private SeleniumWrapperFunctions objSeleniumWrapperFunctions;


	public void initilizeWebEnvironment() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		strBaseUrl= "https://www.linkedin.com/";
		this.setBaseUrl(strBaseUrl);
		driver.get(this.getBaseUrl());
		this.setDriver(driver);
		objUtilities=new Utilities();
		this.setObjUtilities(objUtilities);
		objSeleniumWrapperFunctions = new SeleniumWrapperFunctions(this);
		this.setObjSeleniumWrapperFunctions(objSeleniumWrapperFunctions);
		driver.manage().window().maximize();
	}


	public void tearDown() {
		driver.quit();
	}

	public void implicitWait(int intTimeInSecond) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(intTimeInSecond));

	}

}
