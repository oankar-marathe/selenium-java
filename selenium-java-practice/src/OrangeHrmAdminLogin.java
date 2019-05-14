import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class OrangeHrmAdminLogin {
	public static ChromeDriver driver;
	
	@BeforeClass
	public static void SetUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void OrangeHrmAdminLogin() {
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
		Assert.assertTrue(driver.getTitle().contains("OrangeHRM"));
		}
	
	@AfterClass
	public static void TearDown() {
		driver.close();
	}
}
