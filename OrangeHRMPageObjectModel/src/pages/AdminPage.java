package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AdminPage {
	WebDriver driver;
    
    public AdminPage(WebDriver driver){
    	this.driver = driver;
    }
    
    public void SearchUser() throws InterruptedException {
    	
    	DashboardPage objdashboard = new DashboardPage(driver);
    	
    	objdashboard.GotoAdminPage();
    	Thread.sleep(3000);
    	
    	Actions action = new Actions(driver);
        WebElement UsrMgmtTab = driver.findElement(By.linkText("User Management"));
		System.out.println("Second Element found is: "+UsrMgmtTab);
		Action hov_perf = action.moveToElement(UsrMgmtTab).build();
		hov_perf.perform();
		Thread.sleep(2000); 
		driver.findElement(By.linkText("Users")).click();
		Thread.sleep(2000); 
		
		 WebElement AdminTitle = driver.findElement(By.xpath("//*[@id=\"systemUser-information\"]/div[1]/h1"));
		 Assert.assertTrue(AdminTitle.getText().contains("System Users"));
		 
		 WebElement user_searchbox = driver.findElement(By.id("searchSystemUser_userName"));
		 user_searchbox.clear(); user_searchbox.sendKeys("oankar");
		 driver.findElement(By.id("searchBtn")).click(); 
		 Thread.sleep(2000);
		 
		 WebElement result_msg = driver.findElement(By.xpath("//*[@id=\'resultTable\']/tbody/tr/td"));
		 Assert.assertTrue(result_msg.getText().contains("No Records Found"));
    }
    
    
    public void AddUser() throws InterruptedException {
    	
    	DashboardPage objdashboard = new DashboardPage(driver);
    	
    	objdashboard.GotoAdminPage();
    	Thread.sleep(3000);
    	
    	Actions action = new Actions(driver);
        WebElement UsrMgmtTab = driver.findElement(By.linkText("User Management"));
		Action hov_perf = action.moveToElement(UsrMgmtTab).build();
		hov_perf.perform();
		Thread.sleep(2000); 
		driver.findElement(By.linkText("Users")).click();
		Thread.sleep(2000); 
		
		WebElement AdminTitle = driver.findElement(By.xpath("//*[@id=\"systemUser-information\"]/div[1]/h1"));
		Assert.assertTrue(AdminTitle.getText().contains("System Users"));
		 
		WebElement add_btn = driver.findElement(By.id("btnAdd"));
		add_btn.click();
		Thread.sleep(2000);
		 
		WebElement add_usr_title = driver.findElement(By.id("UserHeading"));
		Assert.assertTrue(add_usr_title.getText().contains("Add User"));
		 
		WebElement save_btn = driver.findElement(By.id("btnSave"));
		save_btn.click();
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"frmSystemUser\"]/fieldset/ol/li[2]/span")).getText().contains("Employee does not exist"));
		Thread.sleep(2000);
		
		Select role_dropdown = new Select (driver.findElement(By.id("systemUser_userType")));
		role_dropdown.selectByValue("1");
		Thread.sleep(2000);
		
		WebElement emp_name = driver.findElement(By.id("systemUser_employeeName_empName"));
		emp_name.clear();
		emp_name.sendKeys("Oankar Marathe");
		Thread.sleep(2000);
		
		WebElement user_name = driver.findElement(By.id("systemUser_userName"));
		user_name.clear();
		user_name.sendKeys("oankar");
		Thread.sleep(2000);
		
		Select status_dropdown = new Select (driver.findElement(By.id("systemUser_status")));
		status_dropdown.selectByValue("0");
		Thread.sleep(2000);
		
		WebElement pwd = driver.findElement(By.id("systemUser_password"));
		pwd.clear();
		pwd.sendKeys("test1234");
		Thread.sleep(2000);
		
		WebElement cnf_pwd = driver.findElement(By.id("systemUser_confirmPassword"));
		cnf_pwd.clear();
		cnf_pwd.sendKeys("test1234");
		Thread.sleep(2000);
	}
}
