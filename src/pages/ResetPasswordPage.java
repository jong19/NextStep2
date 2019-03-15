package pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.sun.jna.platform.win32.Wdm.KEY_BASIC_INFORMATION;

import utility.PropertyConfig;
import utility.DriverInitializer;

public class ResetPasswordPage {
	
	WebDriver driver;
	
	
	@FindBy(how=How.ID, using="userEmail")
	WebElement email_textfield;
	
	@FindBy(how=How.CLASS_NAME, using="input-submit")
	WebElement submit_button;
	
	@FindBy(how=How.ID, using="success")
	WebElement check_email_notif;
	
	
	public ResetPasswordPage(WebDriver driver){
		this.driver = driver;
		
	}
	
	
	public void resetPassword_page_locator() throws InterruptedException{
		
		String page_title = driver.getTitle();
		
		
		if(page_title.contains("Reset Password")){
			Thread.sleep(3000);
			System.out.println(page_title);
			new DriverInitializer(driver);
			PropertyConfig.wdw.until(ExpectedConditions.visibilityOf(email_textfield));
		}
		
		else{
			System.out.println("Page Not Found");
		    driver.quit();
		}
		
				
	}
	
	public void enter_current_email(String gmail_email){
		
		email_textfield.sendKeys(gmail_email);
		submit_button.sendKeys(Keys.ENTER);
		PropertyConfig.wdw.until(ExpectedConditions.visibilityOf(check_email_notif));
		
		
	}
	
	
	
	
	
	

}
