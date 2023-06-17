package myApp.definitionSteps;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import myApp.pageObject.PageLogin;
import myApp.seleniumTools.Nav;
import io.cucumber.java.en.Given;


public class EtapeConnexion extends Nav {

	
	@Given("Je suis sur la page d accueil")
	public void je_suis_sur_la_page_d_accueil() {

		System.setProperty("webdriver.gecko.driver", "rsc/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.manage().window().maximize();

	}

	@Given("Je me connecte")
	public void je_me_connecte() {
		PageLogin page_login = PageFactory.initElements(driver,PageLogin.class);
		page_login.make_appointment.click();
		page_login.username_field.sendKeys("John Doe");
		page_login.password_field.sendKeys("ThisIsNotAPassword");
		//page_login.clickConnexion(driver);
		page_login.submit_button.click();
		}
	}