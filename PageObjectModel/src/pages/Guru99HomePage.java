package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Guru99HomePage {

    WebDriver driver;
    
    public Guru99HomePage(WebDriver driver){
    	this.driver = driver;
    }
    
    //Get the User name from Home Page]
    public String getHomePageDashboardUserName(){
    	WebElement homePageUserName = driver.findElement(By.xpath("//table//tr[@class='heading3']"));
    	return homePageUserName.getText();
	}
}