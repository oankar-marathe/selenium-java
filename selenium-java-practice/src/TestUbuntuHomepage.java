
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;


public class TestUbuntuHomepage {
	public static FirefoxDriver driver;
	
	@BeforeClass
	public static void SetUp() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void CheckTitle() {
		driver.get("http://www.google.com/");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String page_title = driver.getTitle();
		System.out.println("Page Title for this page is: "+page_title);
//		if (page_title.contains("ghghghhhhg")) {
//		} else {
//			System.out.println("Title does not contain this word");
//		}
//		try {
//			Assert.assertTrue(page_title.contains("hjhjhjhjhj"));
//		} catch (AssertionError e) {
//			e.printStackTrace();
//		}
		Assert.assertTrue(page_title.contains("Google"));
		}
	
	@AfterClass
	public static void TearDown() {
		driver.close();
	}
}
