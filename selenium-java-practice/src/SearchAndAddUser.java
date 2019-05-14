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


public class SearchAndAddUser {
	public static ChromeDriver driver;
	
	@BeforeClass
	public static void SetUp() {
		driver = new ChromeDriver();
//		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	public void UserLogin() {
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
	}

	@Test
	public void SearchUser() {
		UserLogin();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Actions action1 = new Actions(driver); 
//		WebElement AdminTab = driver.findElement(By.linkText("Admin"));
		WebElement AdminTab = driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']/b"));
		System.out.println("First Element found is: "+AdminTab);
        Action first_hov_perf= action1.moveToElement(AdminTab).build();
        first_hov_perf.perform(); 
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        Actions action2 = new Actions(driver);
        WebElement UsrMgmtTab = driver.findElement(By.linkText("User Management"));
		System.out.println("Second Element found is: "+UsrMgmtTab);
		Action second_hov_perf = action2.moveToElement(UsrMgmtTab).build();
		second_hov_perf.perform();
		try {
			Thread.sleep(2000); 
		 } catch (InterruptedException e) { 
		  // TODO Auto-generated catch block 
        	e.printStackTrace(); 
		  }
		 driver.findElement(By.linkText("Users")).click();
		 try { 
		 	Thread.sleep(2000); 
		 } catch (InterruptedException e) { 
		  // TODO Auto-generated catch block
		  e.printStackTrace(); }
		 WebElement user_searchbox = driver.findElement(By.id("searchSystemUser_userName"));
		 user_searchbox.clear(); user_searchbox.sendKeys("oankar");
		 driver.findElement(By.id("searchBtn")).click(); 
		 try { 
		 	 Thread.sleep(2000); 
		 } catch (InterruptedException e) { 
		 // TODO Auto-generated catch block
		 e.printStackTrace(); 
		 }
		 WebElement result_msg = driver.findElement(By.xpath("//*[@id=\'resultTable\']/tbody/tr/td"));
		 Assert.assertTrue(result_msg.getText().contains("No Records Found"));
		}
	
	@Test
	public void AddUser() {
		UserLogin();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement element1 = driver.findElement(By.linkText("Admin"));
		System.out.println("First Element found is: "+element1);
        Actions action1 = new Actions(driver); 
        action1.moveToElement(element1).build().perform();
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement element2 = driver.findElement(By.linkText("User Management"));
		System.out.println("Second Element found is: "+element2);
        Actions action2 = new Actions(driver);
        action2.moveToElement(element2).build().perform();
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        driver.findElement(By.linkText("Users")).click();
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        driver.findElement(By.id("btnAdd")).click();
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        String page_heading = driver.findElement(By.id("UserHeading")).getText();
        Assert.assertTrue(page_heading.contains("Add User"));
        Select role_dropdown = new Select (driver.findElement(By.id("systemUser_userType")));
        role_dropdown.selectByValue("1");
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        WebElement emp_name = driver.findElement(By.id("systemUser_employeeName_empName"));
        emp_name.clear();
        emp_name.sendKeys("Oankar Marathe");
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        WebElement user_name = driver.findElement(By.id("systemUser_userName"));
        user_name.clear();
        user_name.sendKeys("oankar");
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        Select status_dropdown = new Select (driver.findElement(By.id("systemUser_status")));
        status_dropdown.selectByValue("0");
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        WebElement pwd = driver.findElement(By.id("systemUser_password"));
        pwd.clear();
        pwd.sendKeys("test1234");
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        WebElement cnf_pwd = driver.findElement(By.id("systemUser_confirmPassword"));
        cnf_pwd.clear();
        cnf_pwd.sendKeys("test1234");
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@AfterClass
	public static void TearDown() {
		driver.close();
	}

}
