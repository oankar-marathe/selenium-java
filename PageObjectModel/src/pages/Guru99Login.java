package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Guru99Login {

    WebDriver driver;
    
    public Guru99Login(WebDriver driver){
    	this.driver = driver;
    }

    //Enter user name in textbox
    public void enterUserName(String strUserName){
    	WebElement user99GuruName = driver.findElement(By.name("uid"));
    	user99GuruName.sendKeys(strUserName);
    }

    //Enter password in password textbox
    public void enterPassword(String strPassword){
    	WebElement password99Guru = driver.findElement(By.name("password"));
    	password99Guru.sendKeys(strPassword);
    }

    //Click on login button
    public void clickLogin(){
    	WebElement login = driver.findElement(By.name("btnLogin"));
    	login.click();
	}

    //Get the title of Login Page
    public String getLoginTitle(){
    	WebElement titleText = driver.findElement(By.xpath("/html/body/div[2]/h2"));
    	return titleText.getText();
    }

    public void loginToGuru99(String strUserName,String strPasword){
        this.enterUserName(strUserName);
        this.enterPassword(strPasword);
        this.clickLogin();        
    }

}