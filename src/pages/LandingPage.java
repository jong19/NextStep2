package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.PageObjectConfig;


public class LandingPage extends PageObjectConfig {
	
	
	
	@FindBy(how=How.LINK_TEXT, using="REGISTER")
	WebElement register_link;
	
	@FindBy(how=How.LINK_TEXT, using="LOGIN")
	WebElement login_link;
	
	
	
	public LandingPage(WebDriver driver){
		super(driver);
				
	}
	
	public LandingPage(WebDriverWait wdw){
		
		super(wdw);
		
	}
	
	
	
    


	
public void locate_register_link() throws InterruptedException{
		
        
        
		try{
		   
		
			new LandingPage(wdw);
			
			if(wdw != null){
				wdw.until(ExpectedConditions.elementToBeClickable(register_link));
				System.out.println("Register Link Clickable");
				Thread.sleep(3000);	
			}
			else{
				System.out.println("WDW is null -> LandingPage.java");
			}
			
			
		}
		catch(Exception e){
			System.out.println("Error in LandingPage => " + e.getMessage());
			System.out.println("-----------------------");
			e.printStackTrace();
			
		}
		
		
		
		

		
		
			
	}
	
	
	
	
	public RegisterPage click_register_link(){
		
		register_link.click();
		
        System.out.println("Register Link CLICKED !");
		
        return new RegisterPage(driver);

		
		
	}
	
	
	public void locate_login_link() throws InterruptedException{
		
		

		wdw.until(ExpectedConditions.elementToBeClickable(login_link));
		Thread.sleep(3000);
			
	}
	
	public void click_login_link(){
		login_link.click();
		System.out.println("Clicked! Success");

		
	}
	
	
  
	
	
	
	
	
	
	
	
	
	

}
