package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class PIMPage {
	
	WebDriver driver;
    
    public PIMPage(WebDriver driver){
    	this.driver = driver;
    }
    
    public void SearchEmployee() throws InterruptedException {
    	
    	DashboardPage objdashboard = new DashboardPage(driver);
    	
    	objdashboard.GotoPIMPage();
    	Thread.sleep(3000);
    	
		driver.findElement(By.linkText("Employee List")).click();
		Thread.sleep(2000); 
		
		 WebElement PIMTitle = driver.findElement(By.xpath("//*[@id=\"employee-information\"]/div[1]/h1"));
		 Assert.assertTrue(PIMTitle.getText().contains("Employee Information"));
		 
		 WebElement emp_name_searchbox = driver.findElement(By.id("empsearch_employee_name_empName"));
		 emp_name_searchbox.clear(); emp_name_searchbox.sendKeys("oankar");
		 driver.findElement(By.id("searchBtn")).click(); 
		 Thread.sleep(2000);
		 
		 WebElement result_msg = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td"));
		 Assert.assertTrue(result_msg.getText().contains("No Records Found"));
		 Thread.sleep(5000);
		 
		 WebElement emp_name_searchbox1 = driver.findElement(By.id("empsearch_employee_name_empName"));
		 emp_name_searchbox1.clear();
		 emp_name_searchbox1.sendKeys("ste");
		 Thread.sleep(2000);
		 WebElement emp_name = driver.findElement(By.xpath("/html/body/div[4]/ul/li"));
		 emp_name.click();
		 driver.findElement(By.id("searchBtn")).click(); 
		 Thread.sleep(2000);
		 WebElement search_result = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[3]/a"));
		 Assert.assertTrue(search_result.getText().contains("Steven"));
	}
    
    public void AddEmployee() throws InterruptedException {
    	
    	DashboardPage objdashboard = new DashboardPage(driver);
    	
    	objdashboard.GotoPIMPage();
    	Thread.sleep(3000);
    	
    	driver.findElement(By.linkText("Employee List")).click();
		Thread.sleep(2000); 
		
		 WebElement PIMTitle = driver.findElement(By.xpath("//*[@id=\"employee-information\"]/div[1]/h1"));
		 Assert.assertTrue(PIMTitle.getText().contains("Employee Information"));
		 
		WebElement add_btn = driver.findElement(By.id("btnAdd"));
		add_btn.click();
		Thread.sleep(2000);
		 
		WebElement add_emp_title = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/h1"));
		Assert.assertTrue(add_emp_title.getText().contains("Add Employee"));
		 
		WebElement save_btn = driver.findElement(By.id("btnSave"));
		save_btn.click();
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"frmAddEmp\"]/fieldset/ol/li[1]/ol/li[1]/span")).getText().contains("Required"));
		Thread.sleep(2000);
		
		WebElement first_name = driver.findElement(By.id("firstName"));
		first_name.clear();
		first_name.sendKeys("Oankar");
		Thread.sleep(2000);		
		
		WebElement last_name = driver.findElement(By.id("lastName"));
		last_name.clear();
		last_name.sendKeys("M");
		Thread.sleep(2000);
		
		WebElement emp_id = driver.findElement(By.id("employeeId"));
		emp_id.clear();
		emp_id.sendKeys("12345");
		Thread.sleep(2000);
	}
}
