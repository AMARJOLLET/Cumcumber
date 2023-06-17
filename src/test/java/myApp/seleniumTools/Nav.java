package myApp.seleniumTools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Nav {
	

    public static WebDriver driver = null;

    public void initialize() {

    	System.setProperty("webdriver.gecko.driver", "rsc/geckodriver.exe");
    	driver = new FirefoxDriver();
    	driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.manage().window().maximize();
        
    }
}

