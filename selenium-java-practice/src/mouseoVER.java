import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseoVER {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\girishk\\Desktop\\New folder (3)\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		Thread.sleep(5000);
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(3000);
			
		WebElement  adminTab = driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[1]/a/b"));
		   Actions builder = new Actions(driver);
//           Action mouseOverHome = builder.moveToElement(adminTab).build();
//           mouseOverHome.perform(); 
		   
		System.out.println("Execution Completed..!!!");
		builder.moveToElement(adminTab);
		
		try {
			
			builder.perform();
			
		} catch (Exception e) {
			System.out.println("Exception..........."+ e);
		}

	}

}
