import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	public static FirefoxDriver driver;
	
  @Test
  public void CheckTitle() {
	  driver.get("https://www.ubuntu.com/");
	  Thread.sleep(3000);
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		String page_title = driver.getTitle();
		System.out.println("Page Title for this page is: "+page_title);
		Assert.assertTrue(page_title.contains("Ubuntu"));
  }
  @BeforeClass
  public void beforeClass() {
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
