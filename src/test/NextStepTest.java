package test;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.UserDetails;
import defined.Functions;
import pages.GmailHomePage;
import pages.GmailSigninPage;
import pages.LandingPage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.RegisterPage;
import pages.ResetPasswordPage;
import utilities.PropertyConfig;
import utilities.ExcelConfig;





public class NextStepTest extends TestConfig{
	

	String username;
	String email;
	String password;
	String acctype;
	
	

	@Test (enabled = true, priority = 1)
	public void register(){
		
		username = pc.getUsernameFromProperty();
		email = pc.getEmailFromProperty();
		password = ud.getPassword();
		acctype = "Job Seeker";
		
		
		
		
		try{
			

			lp.locate_register_link();
			lp.click_register_link();
			
			/*
			
			rp.register_page_locator();
			
			//rp = PageFactory.initElements(driver, RegisterPage.class);
			
			//rp.register_page_locator();
			rp.register_user(username, email, password, acctype);
			
			ec.getSheet(0);
			ec.getNextRow();
			
			String details[] = {username, email, password, acctype};
			
			def.add_new_user(details);
			//ec.addNewUser(username, email, password);
			
			ec.closeFile();
			
			
			/*
			map = new MyAccountPage(driver);
			map = PageFactory.initElements(driver, MyAccountPage.class);
			map.locate_logout_link();
			map.logout_user();
			lp.locate_login_link();
			
			
			*/
			
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
			
	
		
	}
	
	
	/*
	
	
	@Test (dataProvider = "loginCredits", enabled = false, priority = 2)
	public void login(String username, String password){
		
		try{
			lp = new LandingPage(driver);
			lp = PageFactory.initElements(driver, LandingPage.class);
			lp.locate_login_link();
			lp.click_login_link();
			
			lip = new LoginPage(driver);
			lip = PageFactory.initElements(driver, LoginPage.class);
			lip.login_page_locator();
			lip.login_user(username, password);
			
			map = new MyAccountPage(driver);
			map = PageFactory.initElements(driver, MyAccountPage.class);
			map.locate_logout_link();
			map.logout_user();
			lp.locate_login_link();
			
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	
	@DataProvider(name = "loginCredits")
	  public Object[][] loginDetails(){
		  
		  Object [][] loginData = null;
		  String uname = "";
		  String pass = "";

		 
		  try{
			  ec.getSheet(0);
			  int the_rows = ec.getAllRowCount();
			  
			  loginData  = new Object[1][2];
			  
		
			  for(int i=the_rows-1; i<the_rows; i++){
				   uname = ec.readData(i, 0);
				   pass = ec.readData(i, 2);
				  
				  loginData[i-i][0] = uname;
				  loginData[i-i][1] = pass;


			  }
			
		  }
		  catch(Exception e){
			  e.printStackTrace();
		  }
			  
		return loginData;
		  
		  
	  }
	
	
	@Test (enabled = false, priority=3)
	public void resetPassword(){
		

		try{
			
			ec.getSheet(1);
			String gmail_email = ec.readData(1, 1);
			String gmail_password = ec.readData(1, 5);
			
			String existing_uname = ec.readData(1, 0);
			String old_pass = ec.readData(1, 3);
			String new_pass = null;
	
			lp = new LandingPage(driver);
			lp = PageFactory.initElements(driver, LandingPage.class);
			lp.locate_login_link();
			lp.click_login_link();
			
			lip = new LoginPage(driver);
			lip = PageFactory.initElements(driver, LoginPage.class);
			lip.login_page_locator();
			lip.click_forgot_password();
			
			rpp = new ResetPasswordPage(driver);
			rpp = PageFactory.initElements(driver, ResetPasswordPage.class);
			rpp.resetPassword_page_locator();
			rpp.enter_current_email(gmail_email);
			
			gsp = new GmailSigninPage(driver);
			gsp = PageFactory.initElements(driver, GmailSigninPage.class);
			gsp.initialize_gmail_signin_page();
			gsp.login_user_gmail(gmail_email, gmail_password);
			
			ghp = new GmailHomePage(driver);
			ghp = PageFactory.initElements(driver, GmailHomePage.class);
			new_pass = ghp.init_gmail_homepage();
			
			System.out.println("New password is :>" + new_pass);
			
			ghp.check_new_password_verification();
			
		    
			ec.getCurrentRow();
			ec.addNewPassword(old_pass, 2);
			ec.addNewPassword(new_pass, 3);
			ec.closeFile();
			

			
			driver.get(cf.getAppUrl());
			
			lp.locate_login_link();
			lp.click_login_link();
			
			lip.login_page_locator();
			lip.login_user(existing_uname, new_pass);
			
			map = new MyAccountPage(driver);
			map = PageFactory.initElements(driver, MyAccountPage.class);
			map.locate_logout_link();
			map.logout_user();
			lp.locate_login_link();
			
			
			
			
			
			
			
			
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		
		
	}
	
	
	*/
	
	


		

		
		

}
