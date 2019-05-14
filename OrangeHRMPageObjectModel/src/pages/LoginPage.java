package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
WebDriver driver;
    
    public LoginPage(WebDriver driver){
    	this.driver = driver;
    }

    //Enter user name in textbox
    public void enterUserName(String strUserName){
    	WebElement username = driver.findElement(By.id("txtUsername"));
    	username.sendKeys(strUserName);
    }

    //Enter password in password textbox
    public void enterPassword(String strPassword){
    	WebElement password = driver.findElement(By.id("txtPassword"));
    	password.sendKeys(strPassword);
    }

    //Click on login button
    public void clickLogin(){
    	WebElement login = driver.findElement(By.id("btnLogin"));
    	login.click();
	}

    public void loginToOrangeHRM(String strUserName,String strPasword){
        this.enterUserName(strUserName);
        this.enterPassword(strPasword);
        this.clickLogin();        
    }

}
