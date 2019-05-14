package test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.AdminPage;
import pages.DashboardPage;
import pages.PIMPage;

public class TestPIMPage {
	
	WebDriver driver;
	
	@BeforeTest
    public void setup() throws InterruptedException{
//		driver = new FirefoxDriver();
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
	
	@Test
    public void test_search_employee() throws InterruptedException{
    	LoginPage objLogin = new LoginPage(driver);
    	
	    //login to application
    	objLogin.loginToOrangeHRM("admin", "admin123");
    	
    	DashboardPage objDashboard = new DashboardPage(driver);

	    //Verify Dashboard title
	    Assert.assertTrue(objDashboard.getDashboardTitle().contains("Dashboard"));
	    Thread.sleep(3000);
	    
	    objDashboard.GotoPIMPage();
	    Thread.sleep(2000);
	    
	    PIMPage objPIM = new PIMPage(driver);
	    objPIM.SearchEmployee();
	    
	    objDashboard.Logout();
    }
    
//    @Test
    public void test_add_employee () throws InterruptedException{
    	LoginPage objLogin = new LoginPage(driver);
    	
	    //login to application
    	objLogin.loginToOrangeHRM("admin", "admin123");
    	
    	DashboardPage objDashboard = new DashboardPage(driver);

	    //Verify Dashboard title
	    Assert.assertTrue(objDashboard.getDashboardTitle().contains("Dashboard"));
	    Thread.sleep(3000);
	    
	    objDashboard.GotoPIMPage();
	    Thread.sleep(2000);
	    
	    PIMPage objPIM = new PIMPage(driver);
	    objPIM.AddEmployee();
	    
	    objDashboard.Logout();
    }
    	
	@AfterTest
    public void tearDown(){
        driver.close();
    }

}
