package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utility.PropertyConfig;
import utility.DriverInitializer;

public class MyAccountPage {
	WebDriver driver;
	
	@FindBy(how=How.LINK_TEXT, using="LOG OUT")
    WebElement logout_link;
	
	
	public MyAccountPage(WebDriver driver){
		this.driver = driver;
		
	}
	
	
	public void locate_logout_link() throws InterruptedException{
		
		new DriverInitializer(driver);
		PropertyConfig.wdw.until(ExpectedConditions.elementToBeClickable(logout_link));
		Thread.sleep(3000);
		
	}
	
	public void logout_user(){
		
		logout_link.click();
		
	}
	
	

	
	

}
