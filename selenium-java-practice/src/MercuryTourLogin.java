import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MercuryTourLogin {
	public static ChromeDriver driver;
	
	@BeforeClass
	public void SetUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void MercuryLogin() throws InterruptedException {
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.name("userName"));
		username.clear();
		username.sendKeys("oankar");
		WebElement password = driver.findElement(By.name("password"));
		password.clear();
		password.sendKeys("test123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		assert driver.getTitle().contains("Mercury Tours:");
		Select passanger_dropdown = new Select (driver.findElement(By.name("passCount")));
		passanger_dropdown.selectByVisibleText("2");
		Select departure_dropdown = new Select (driver.findElement(By.name("fromPort")));
		departure_dropdown.selectByVisibleText("New York");
		Select frommonth_dropdown = new Select (driver.findElement(By.name("fromMonth")));
		frommonth_dropdown.selectByValue("6");
		Select fromdate_dropdown = new Select (driver.findElement(By.name("fromDay")));
		fromdate_dropdown.selectByValue("18");
		Select arrival_dropdown = new Select (driver.findElement(By.name("toPort")));
		arrival_dropdown.selectByVisibleText("San Francisco");
		Select returnmonth_dropdown = new Select (driver.findElement(By.name("toMonth")));
		returnmonth_dropdown.selectByValue("6");
		Select returndate_dropdown = new Select (driver.findElement(By.name("toDay")));
		returndate_dropdown.selectByValue("26");
		driver.findElement(By.xpath(("(//input[@name='servClass'])[2]"))).click();
		Thread.sleep(5000);
		driver.findElement(By.name("findFlights")).click();
		Thread.sleep(5000);
		String caption1 = driver.findElement(By.xpath("(//td[@class='title'])[1]")).getText();
		System.out.println(caption1);
		assert driver.findElement(By.xpath("(//td[@class='title'])[1]")).getText().equals("DEPART");
//		assert driver.findElementByXPath("(//td[@class='title'])[1]").getText().equals("DEPART");
		assert driver.findElementByXPath("(//td[@class='title'])[3]").getText().equals("New York to San Francisco");
		driver.findElement(By.xpath(("(//input[@name='outFlight'])[2]"))).click();
		assert driver.findElementByXPath("(//td[@class='title'])[5]").getText().equals("RETURN");
		assert driver.findElementByXPath("(//td[@class='title'])[7]").getText().equals("San Francisco to New York");
//		driver.findElement(By.xpath(("(//input[@name='inFlight'])[2]"))).click();
		Thread.sleep(5000);
//		driver.findElement(By.name("reserveFlights")).click();
//		Thread.sleep(5000);
//		WebElement passfirstname = driver.findElement(By.name("passFirst0"));
//		passfirstname.clear();
//		passfirstname.sendKeys("Oankar");
//		WebElement passlastname = driver.findElement(By.name("passLast0"));
//		passlastname.clear();
//		passlastname.sendKeys("M");
//		WebElement creditcardno = driver.findElement(By.name("creditnumber"));
//		creditcardno.clear();
//		creditcardno.sendKeys("1234567890");
//		driver.findElement(By.name("buyFlights")).click();
//		Thread.sleep(5000);
		
//		assert driver.findElementByXPath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/p/font/b/font[2]").getText().equals("Your itinerary has been booked!");
//		assert driver.findElementByXPath("(//td[@class='frame_header_info'])[3]/font/b").getText().equals("New York to San Francisco");
//		assert driver.findElementByXPath("(//td[@class='frame_header_info'])[5]/font/b").getText().equals("San Francisco to New York");
//		assert driver.findElementByXPath("(//td[@class='data_left'])[2]/font").getText().equals("2 passengers");
	}
	
	@AfterClass
	public void TearDown() {
		driver.quit();
	}
	
}
