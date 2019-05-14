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

public class TestOrangeHRMLogin {
	
	WebDriver driver;
	
	@BeforeTest
    public void setup() throws InterruptedException{
      driver = new FirefoxDriver();
//    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    
    @Test
    public void test_login_to_dashboard() throws InterruptedException{
    	LoginPage objLogin = new LoginPage(driver);
    	
	    //login to application
    	objLogin.loginToOrangeHRM("admin", "admin123");
    	
    	DashboardPage objDashboard = new DashboardPage(driver);

	    //Verify Dashboard title
	    Assert.assertTrue(objDashboard.getDashboardTitle().contains("Dashboard"));
	    Thread.sleep(3000);
	    
	    objDashboard.DashboardLinks();
	    Thread.sleep(2000);
	    
	    objDashboard.Logout();
    }
    
    @AfterTest
    public void tearDown(){
        driver.close();
    }

}
