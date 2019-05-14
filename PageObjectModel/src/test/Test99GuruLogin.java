package test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Guru99HomePage;
import pages.Guru99Login;

public class Test99GuruLogin {

    WebDriver driver;
//    Guru99Login objLogin;
//    Guru99HomePage objHomePage;

    @BeforeTest
    public void setup() throws InterruptedException{
//      driver = new FirefoxDriver();
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/V4/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    
    @Test
    public void test_Home_Page_Appear_Correct() throws InterruptedException{

	    //Create Login Page object
    	Guru99Login objLogin = new Guru99Login(driver);
	
	    //Verify login page title
	    String loginPageTitle = objLogin.getLoginTitle();
	    Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
	
	    //login to application
	    objLogin.loginToGuru99("mgr123", "mgr!23");
	
	    // go the next page
	    Guru99HomePage objHomePage = new Guru99HomePage(driver);
	    //Verify home page
	    Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));
	    Thread.sleep(3000);
    }
    
    @AfterTest
    public void tearDown(){
        driver.close();
    }
}
