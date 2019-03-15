package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.PageObjectConfig;
import utility.PropertyConfig;
import utility.DriverInitializer;

public class RegisterPage extends PageObjectConfig {
	
	
	
	@FindBy(how=How.ID, using="userName")
	WebElement username_field;
	
	@FindBy(how=How.ID, using="userEmail")
	WebElement email_field;
	
	@FindBy(how=How.ID, using="userPassword")
	WebElement password_field;
	
	@FindBy(how=How.ID, using="userConfirmPassword")
	WebElement repeat_password_field;
	
	@FindBy(how=How.ID, using="account_type")
	WebElement account_type_field;
	
	@FindBy(how=How.XPATH, using="/html/body/section[2]/div/div/div[2]/div[1]/form/input[4]")
	WebElement register_button;
	
	@FindBy(how=How.LINK_TEXT, using="LOG OUT")
	WebElement logout_link;
	
	
	
	
	public RegisterPage(WebDriver driver){
		super(driver);
		get_wdw();
	
	}
	

	
	
	public void register_page_locator() throws InterruptedException{
		
		

		wdw.until(ExpectedConditions.visibilityOf(username_field));
		
		Thread.sleep(3000);
		
		
		
		
	}
	
	public void register_user(String username, String email, String password, String acctype){
		
	
		username_field.sendKeys(username);
		email_field.sendKeys(email);
		password_field.sendKeys(password);
		repeat_password_field.sendKeys(password);
		
		Select type = new Select(account_type_field);
		type.selectByVisibleText(acctype);
		
		
		register_button.click();
		

		
		
			
	}
	
	public void logout() throws InterruptedException{
		
		init_webdriver_wait();

		wdw.until(ExpectedConditions.visibilityOf(logout_link));
		Thread.sleep(3000);
		logout_link.click();
		
		
		
	}
	
	
	

}
