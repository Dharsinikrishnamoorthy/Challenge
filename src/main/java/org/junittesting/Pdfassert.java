package org.junittesting;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pdfassert extends Base {
	public  Pdfassert() {
		   PageFactory.initElements(driver, this);
			}
	@FindBy(id ="identifierId")
	private WebElement email;
	
	@FindBy(xpath = "(//button[@type='button'])[3]")
	private WebElement next;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getNext() {
		return next;
	}
	
	
}
