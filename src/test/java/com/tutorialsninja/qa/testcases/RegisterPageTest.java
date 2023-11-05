package com.tutorialsninja.qa.testcases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sun.tools.sjavac.Log;
import com.tutorialsninja.qa.base.TestBase;
import com.tutorialsninja.qa.pages.ConfirmPage;
import com.tutorialsninja.qa.pages.RegisterPage;

public class RegisterPageTest extends TestBase {

	RegisterPage registerPage;
	ConfirmPage confirmPage;
	

	public RegisterPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		init();
		registerPage = new RegisterPage();
	}
	
	
	@Test(priority = 1)
	public void verifyHomeTitle()
	{
		String HomeTitle = registerPage.getHomeTitle();
		Assert.assertEquals("Your Store", HomeTitle , "Home title is matching" );
	}
	
	@Test(priority = 2)
	public void verifyTitle()
	{
		String registerTitle = registerPage.getTitle();
		Assert.assertEquals("Register Account", registerTitle , "Title is matching");	
		log.info(registerTitle + "Is the registerTitle message");
	}
	
	@Test(priority = 3)
	public void verifyRegister()
	{
		confirmPage= registerPage.register(prop.getProperty("fName"), prop.getProperty("lName"), prop.getProperty("email"),
				prop.getProperty("phoneNumber"),prop.getProperty("pwd"), prop.getProperty("pwd"));
	}

	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
