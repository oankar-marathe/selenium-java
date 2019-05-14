package seleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) {
//		System.setProperty("webdriver.firefox.marionette","/home/synerzip/Downloads/geckordriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com/");
		driver.close();
	}

}
