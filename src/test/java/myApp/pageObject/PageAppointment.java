package myApp.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class PageAppointment {
	
	
	@FindBy(xpath = "//option[@value='Hongkong CURA Healthcare Center']")
	public WebElement facility_list_hongkong;
	
	@FindBy(xpath = "//input[@id='chk_hospotal_readmission']")
	public WebElement apply_hospital;
	
	@FindBy(xpath = "//input[@id='radio_program_medicaid']")
	public WebElement medicaid_button;
	

	@FindBy(xpath = "//input[@id='txt_visit_date']")
	public WebElement visite_date_field;
	
	@FindBy(xpath = "//textarea[@id='txt_comment']")
	public WebElement comment_field;
	
	@FindBy(xpath = "//button[@id='btn-book-appointment']")
	public WebElement book_appointment_button;
	
	
}
	