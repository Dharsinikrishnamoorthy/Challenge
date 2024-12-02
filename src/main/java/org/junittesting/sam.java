package org.junittesting;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sam extends Base {

	public  sam() {
   PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement email;

	@FindBy(xpath = "//input[@aria-label='Password']")
	private WebElement password;

	@FindBy(name = "login")
	private WebElement login;

	// getters to access webelemnt
	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

}
