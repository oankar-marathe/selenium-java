import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

	
public class AddEmployee {
		public static ChromeDriver driver;
		
		@BeforeClass
		public static void SetUp() {
			driver = new ChromeDriver();
//			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		
		public void UserLogin() throws InterruptedException {
			driver.get("https://opensource-demo.orangehrmlive.com/");
//			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			Thread.sleep(3000);
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			WebElement admin_username = driver.findElement(By.id("txtUsername"));
			admin_username.clear();
			admin_username.sendKeys("Admin");
			
			WebElement admin_password = driver.findElement(By.id("txtPassword"));
			admin_password.clear();
			admin_password.sendKeys("admin123");
			
			driver.findElement(By.id("btnLogin")).click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			Assert.assertTrue(driver.getTitle().contains("OrangeHRM"));
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}

		@Test
		public void AddEmployeeUser() throws InterruptedException {
			UserLogin();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
			Actions action1 = new Actions(driver); 
//			WebElement AdminTab = driver.findElement(By.linkText("PIM"));
			WebElement PIMTab = driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/b"));
	        Action first_hov_perf= action1.moveToElement(PIMTab).build();
	        first_hov_perf.perform(); 
	        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//	        try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
	        driver.findElement(By.linkText("Add Employee")).click();
	        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//			 try { 
//			 	Thread.sleep(2000); 
//			 } catch (InterruptedException e) { 
//			  // TODO Auto-generated catch block
//			  e.printStackTrace(); }
			 WebElement first_name = driver.findElement(By.id("firstName"));
			 first_name.clear();
			 first_name.sendKeys("Oankar");
			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//			 try {
//					Thread.sleep(5000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
			 WebElement last_name = driver.findElement(By.id("lastName"));
			 last_name.clear();
			 last_name.sendKeys("M");
			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	        try {
//				Thread.sleep(5000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
	        WebElement login_chk = driver.findElement(By.id("chkLogin"));
	        login_chk.click();
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	        try {
//				Thread.sleep(5000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//	        WebElement save_btn = driver.findElement(By.id("btnSave")).click();
//	        save_btn.click();
	        driver.findElement(By.id("welcome")).click();
	        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			driver.findElement(By.linkText("Logout")).click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}	
		}
		
		@AfterClass
		public static void TearDown() {
			driver.close();
		}
}
