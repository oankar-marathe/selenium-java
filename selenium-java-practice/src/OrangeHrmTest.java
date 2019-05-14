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

public class OrangeHrmTest {
public static ChromeDriver driver;
	
	@BeforeClass
	public static void SetUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void CheckHomePageLinks() {
		String links [] = {"Services", "Success Stories", "Partners", "Blog"};
		driver.get("https://www.orangehrm.com/");
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String page_title = driver.getTitle();
		Assert.assertTrue(page_title.contains("OrangeHRM"));
		for (int i=0;i<links.length;i++) {	
			driver.findElementByLinkText(links[i]).click();
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			Assert.assertTrue(page_title.contains("Orange"));
			}
		}
	
	@AfterClass
	public static void TearDown() {
		driver.close();
	}
}
