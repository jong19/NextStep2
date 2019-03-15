package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utility.PropertyConfig;
import utility.DriverInitializer;

public class GmailSigninPage {
	public WebDriver driver;
	
	@FindBy(how=How.ID, using="Email")
	WebElement email_textfield;
	
	@FindBy(how=How.ID, using="next")
	WebElement next_button;
	
	@FindBy(how=How.ID, using="Passwd")
	WebElement password_textfield;
	
	@FindBy(how=How.ID, using="signIn")
	WebElement signin_button;
	
	
	
	
	public GmailSigninPage(WebDriver driver){
		this.driver = driver;
		
	}
	
	
	public void initialize_gmail_signin_page(){
		
		driver.get("http://www.gmail.com");
		String page_title = driver.getTitle();
		
		if(page_title.contains("Gmail")){
			System.out.println(page_title);
			new DriverInitializer(driver);
			PropertyConfig.wdw.until(ExpectedConditions.visibilityOf(email_textfield));
			
		}
		else{
			System.out.println("NOT REDIRECTED TO GMAIL.COM");
			driver.quit();
			
		}
		
		
	}
	
	public void login_user_gmail(String gmail_email, String gmail_password){
		
		email_textfield.sendKeys(gmail_email);
		next_button.click();
		
		PropertyConfig.wdw.until(ExpectedConditions.visibilityOf(password_textfield));

		password_textfield.sendKeys(gmail_password);
		signin_button.click();
		
	}
	
	
	
}
