package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

// import org.testng.annotations.Test;

public class TecAdminSeleniumTest {
	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
//		 ChromeOptions chromeOptions = new ChromeOptions();
//		 chromeOptions.addArguments("--headless");
//		 chromeOptions.addArguments("--no-sandbox");

		//WebDriver driver = new ChromeDriver(chromeOptions);
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://google.com");
		driver.manage().window().maximize();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (driver.getPageSource().contains("I'm Feeling Lucky")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		driver.quit();
	}
}