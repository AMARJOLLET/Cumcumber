package myApp.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PageLogin {


	@FindBy(xpath = "//a[@id='btn-make-appointment']")
	public WebElement make_appointment;

	@FindBy(xpath = "//input[@id='txt-username']")
	public WebElement username_field;

	@FindBy(xpath = "//input[@id='txt-password']")
	public WebElement password_field;

	@FindBy(xpath = "//button[@id='btn-login']")
	public WebElement submit_button;

}

