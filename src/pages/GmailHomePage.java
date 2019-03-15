package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utility.PropertyConfig;
import utility.DriverInitializer;

public class GmailHomePage {
	
	public WebDriver driver;
	
	
	@FindBy(how=How.XPATH, using="/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div[1]/div/div")
	WebElement compose_button;
	
	@FindBy(how=How.XPATH, using="/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div[1]/div[1]/div/div/div[7]/div/div[1]/div[2]/div/table/tbody/tr[1]/td[6]/div/div/div/span[2]")
	WebElement reset_password_verification;
	
	@FindBy(how=How.XPATH, using="/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div[1]/div[1]/div/div[2]/div/table/tr/td[1]/div[2]/div[1]/div[2]/div[1]/h2")
	WebElement password_verification_header;
	

	
	
	public GmailHomePage(WebDriver driver){
		this.driver = driver;
		
	}
	
	
	public String init_gmail_homepage(){
		
		new DriverInitializer(driver);
		PropertyConfig.wdw.until(ExpectedConditions.elementToBeClickable(compose_button));
		
		String str = reset_password_verification.getText();
		String new_pass = str.substring(52, 64);
		
		System.out.println("In GmailHomePage class :>" + new_pass);

		//driver.navigate().refresh();
		reset_password_verification.click();
		
	   return new_pass;

		
	}
	
	public void check_new_password_verification(){
		
		PropertyConfig.wdw.until(ExpectedConditions.visibilityOf(password_verification_header));
	
		
		

		
		
		
		
		
	}
	
	
	

}
