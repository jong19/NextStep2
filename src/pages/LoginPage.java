package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utility.PropertyConfig;
import utility.DriverInitializer;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(how=How.ID, using="userName")
    WebElement username_field;
	
	@FindBy(how=How.ID, using="userPassword")
    WebElement password_field;
	
	@FindBy(how=How.XPATH, using="/html/body/section[2]/div/div/div[2]/div[1]/form/input[4]")
    WebElement login_button;
	
	@FindBy(how=How.LINK_TEXT, using="Forgot Password")
    WebElement forgot_password_link;
	
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
		
	}
	
	
	public void login_page_locator() throws InterruptedException{
		new DriverInitializer(driver);
		PropertyConfig.wdw.until(ExpectedConditions.visibilityOf(login_button));
		Thread.sleep(3000);
		
	}
	
	public void login_user(String username, String password){
		username_field.sendKeys(username);
		password_field.sendKeys(password);
		login_button.click();
		
		
	}
	
	public void click_forgot_password(){
		forgot_password_link.click();
	}
	


}
