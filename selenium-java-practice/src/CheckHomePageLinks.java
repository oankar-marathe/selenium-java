import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class CheckHomePageLinks {
	public static FirefoxDriver driver;
	
	@BeforeClass
	public void SetUp() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void CheckHomePageLinks() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement admin_username = driver.findElement(By.id("txtUsername"));
		admin_username.clear();
		admin_username.sendKeys("Admin");
		
		WebElement admin_password = driver.findElement(By.id("txtPassword"));
		admin_password.clear();
		admin_password.sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(driver.getTitle().contains("OrangeHRM"));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String link_texts [] = {"Admin", "PIM", "Leave", "Time", "Recruitment", "Dashboard", "Directory", "Maintenance"};
		for (int i=0;i<link_texts.length;i++) {
			driver.findElement(By.linkText(link_texts[i])).click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				Assert.assertTrue(driver.getTitle().contains("OrangeHRM"));
			}
		}
		driver.findElement(By.id("welcome")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.linkText("Logout")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
		
	@AfterClass
	public void TearDown() {
		driver.close();
	}

}
