package myApp.definitionSteps;

import org.openqa.selenium.support.PageFactory;
import myApp.pageObject.PageAppointment;
import myApp.seleniumTools.Nav;
import io.cucumber.java.en.When;

public class EtapeRendezVous extends Nav {


	@When("Je prends un rdv médical Medicaid")
	public void je_prends_un_rdv_médical_Medicaid() {
	
	PageAppointment page_appointment = PageFactory.initElements(driver,PageAppointment.class);
	page_appointment.facility_list_hongkong.click();
	page_appointment.apply_hospital.click();
	page_appointment.medicaid_button.click();
	page_appointment.visite_date_field.sendKeys("02/11/2023");
	page_appointment.comment_field.sendKeys("ceci est un commentaire");
	page_appointment.book_appointment_button.click();
}

}