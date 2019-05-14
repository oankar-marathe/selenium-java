package learning_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstWebDriverClass {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        String appUrl = "https://google.com";
        
        driver.get(appUrl);
        driver.manage().window().maximize();
        
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";
        
        System.out.print("Actual Title is:");
        System.out.println(actualTitle);
        System.out.print("Expected Title is:");
        System.out.println(expectedTitle);
       
        
        if ( expectedTitle.equalsIgnoreCase(actualTitle)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
        driver.quit();
	}
}
