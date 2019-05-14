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

public class TestAdminPage {
	
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
    public void test_search_user() throws InterruptedException{
    	LoginPage objLogin = new LoginPage(driver);
    	
	    //login to application
    	objLogin.loginToOrangeHRM("admin", "admin123");
    	
    	DashboardPage objDashboard = new DashboardPage(driver);

	    //Verify Dashboard title
	    Assert.assertTrue(objDashboard.getDashboardTitle().contains("Dashboard"));
	    Thread.sleep(3000);
	    
	    objDashboard.GotoAdminPage();
	    Thread.sleep(2000);
	    
	    AdminPage objAdmin = new AdminPage(driver);
	    
	    objAdmin.SearchUser();
	    Thread.sleep(3000);
	    
	    objDashboard.Logout();
    }
    
    @Test
    public void test_add_user () throws InterruptedException{
    	LoginPage objLogin = new LoginPage(driver);
    	
	    //login to application
    	objLogin.loginToOrangeHRM("admin", "admin123");
    	
    	DashboardPage objDashboard = new DashboardPage(driver);

	    //Verify Dashboard title
	    Assert.assertTrue(objDashboard.getDashboardTitle().contains("Dashboard"));
	    Thread.sleep(3000);
	    
	    objDashboard.GotoAdminPage();
	    Thread.sleep(2000);
	    
	    AdminPage objAdmin = new AdminPage(driver);
	    
	    objAdmin.AddUser();;
	    Thread.sleep(3000);
	    
	    objDashboard.Logout();
    }
    
    @AfterTest
    public void tearDown(){
        driver.close();
    }

}
