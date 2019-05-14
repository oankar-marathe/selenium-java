package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import org.testng.Assert;

public class DashboardPage {
	
	WebDriver driver;
    
    public DashboardPage(WebDriver driver){
    	this.driver = driver;
    }
    
    //Get the title from dashboard
    public String getDashboardTitle(){
    	WebElement title = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/h1"));
    	return title.getText();
	}
    
    public void DashboardLinks() throws InterruptedException {
    	String allLinks [] = new String[] {"Admin", "PIM", "Leave", "Time", "Recruitment",
    			"Performance", "Directory", "Maintenance"};
    	for (int i=0; i<allLinks.length;i++) {
    		driver.findElement(By.linkText(allLinks[i])).click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				Assert.assertTrue(driver.getTitle().contains("OrangeHRM"));
			}
    	}
    }
    
    public void GotoAdminPage() throws InterruptedException{
    	Actions action1 = new Actions(driver); 
//		WebElement AdminTab = driver.findElement(By.linkText("Admin"));
		WebElement AdminTab = driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']/b"));
        Action first_hov_perf= action1.moveToElement(AdminTab).build();
        first_hov_perf.perform(); 
    }
    
    public void GotoPIMPage() throws InterruptedException{
    	Actions action1 = new Actions(driver); 
//		WebElement AdminTab = driver.findElement(By.linkText("PIM"));
		WebElement AdminTab = driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b"));
        Action first_hov_perf= action1.moveToElement(AdminTab).build();
        first_hov_perf.perform(); 
    }
    
    public void GotoLeavePage() throws InterruptedException{
    	Actions action1 = new Actions(driver); 
//		WebElement AdminTab = driver.findElement(By.linkText("Leave"));
		WebElement AdminTab = driver.findElement(By.xpath("//*[@id=\"menu_leave_viewLeaveModule\"]/b"));
        Action first_hov_perf= action1.moveToElement(AdminTab).build();
        first_hov_perf.perform(); 
    }
    
    public void GotoTimePage() throws InterruptedException{
    	Actions action1 = new Actions(driver); 
//		WebElement AdminTab = driver.findElement(By.linkText("Time"));
		WebElement AdminTab = driver.findElement(By.xpath("//*[@id=\"menu_time_viewTimeModule\"]/b"));
        Action first_hov_perf= action1.moveToElement(AdminTab).build();
        first_hov_perf.perform(); 
    }
    
    public void GotoRecruitmentPage() throws InterruptedException{
    	Actions action1 = new Actions(driver); 
//		WebElement AdminTab = driver.findElement(By.linkText("Recruitment"));
		WebElement AdminTab = driver.findElement(By.xpath("//*[@id=\"menu_recruitment_viewRecruitmentModule\"]/b"));
        Action first_hov_perf= action1.moveToElement(AdminTab).build();
        first_hov_perf.perform(); 
    }
    
    public void GotoDirectoryPage() throws InterruptedException{
    	Actions action1 = new Actions(driver); 
//		WebElement AdminTab = driver.findElement(By.linkText("Directory"));
		WebElement AdminTab = driver.findElement(By.xpath("//*[@id=\"menu_directory_viewDirectory\"]/b"));
        Action first_hov_perf= action1.moveToElement(AdminTab).build();
        first_hov_perf.perform(); 
    }
    
    public void GotoMaintenancePage() throws InterruptedException{
    	Actions action1 = new Actions(driver); 
//		WebElement AdminTab = driver.findElement(By.linkText("Maintenence"));
		WebElement AdminTab = driver.findElement(By.xpath("//*[@id=\"menu_maintenance_purgeEmployee\"]/b"));
		System.out.println("First Element found is: "+AdminTab);
        Action first_hov_perf= action1.moveToElement(AdminTab).build();
        first_hov_perf.perform(); 
    }
    public void Logout() throws InterruptedException {
    	WebElement WelcomeLink = driver.findElement(By.id("welcome"));
    	WelcomeLink.click();
    	Thread.sleep(2000);
    	WebElement LogoutLink = driver.findElement(By.linkText("Logout"));
    	LogoutLink.click();
    	Thread.sleep(2000);
    }

}
