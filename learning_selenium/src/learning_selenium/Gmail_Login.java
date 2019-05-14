package learning_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_Login {
	public static void main(String[] args) {
		// objects and variables instantiation
		WebDriver driver = new FirefoxDriver();
		String appUrl = "https://accounts.google.com";
		
		// launch the firefox browser and open the application url
		driver.get(appUrl);
		
		// maximize the browser window
		driver.manage().window().maximize();
		
		// declare and initialize the variable to store the expected title of the webpage.
		String expectedTitle = "Sign in – Google accounts";
		
		// fetch the title of the web page and save it into a string variable
		String actualTitle = driver.getTitle();
		
		// compare the expected title of the page with the actual title of the page and print the result
		if (expectedTitle.equals(actualTitle)){
			System.out.println("Verification Successful - The correct title is displayed on the web page.");
		} else {
			System.out.println("Verification Failed - An incorrect title is displayed on the web page.");
		}
		
		// enter a valid username in the email textbox
		WebElement username = driver.findElement(By.id("identifierId"));
		username.clear();
		username.sendKeys("TestSelenium");
		
		// click on next button
		WebElement NextBtn = driver.findElement(By.id("identifierNext"));
		NextBtn.click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// enter a valid password in the password textbox
		WebElement password = driver.findElement(By.name("password"));
		password.clear();
		password.sendKeys("password123");
		
		// click on the Next button after adding password
		WebElement SignInButton = driver.findElement(By.id("passwordNext"));
		SignInButton.click();
		
		// wait for some time
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// close the web browser
		if (driver.getTitle().contains("Account")) {
			System.out.println("Test script executed successfully.");
		} else {
			System.out.println("Error occurred while running the script.");
		}
		driver.close();
		
		// terminate the program
		System.exit(0);

		}
	}