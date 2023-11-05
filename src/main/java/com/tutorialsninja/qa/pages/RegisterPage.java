package com.tutorialsninja.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.qa.base.TestBase;

public class RegisterPage extends TestBase {

	@FindBy(xpath = "//span[text()='My Account']")
	WebElement myAccount;

	@FindBy(xpath = "//a[text()='Register']")
	WebElement registry;

	@FindBy(css = "input#input-firstname")
	WebElement firstName;

	@FindBy(css = "input#input-lastname")
	WebElement lastName;

	@FindBy(css = "input#input-email")
	WebElement eMail;

	@FindBy(css = "input#input-telephone")
	WebElement telephone;

	@FindBy(css = "input#input-password")
	WebElement pwd;

	@FindBy(css = "input#input-confirm")
	WebElement confirmPwd;

	@FindBy(xpath = "//input[@name='agree']")
	WebElement agree;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement submit;

	// Initialize

	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}

	// Methods
	public ConfirmPage register(String fname, String lname, String email, String tele, String password,
			String confirmpassword) {
		myAccount.click();
		registry.click();
		firstName.sendKeys(fname);
		lastName.sendKeys(lname);
		eMail.sendKeys(email);
		telephone.sendKeys(tele);
		pwd.sendKeys(password);
		confirmPwd.sendKeys(confirmpassword);
		agree.click();
		submit.click();
		return new ConfirmPage();
	}
	
	public String getTitle()
	{
		myAccount.click();
		registry.click();
		return driver.getTitle();
	}
	
	public String getHomeTitle()
	{
		return driver.getTitle();
		
	}
}
