package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import data.UserDetails;
import defined.Functions;
import pages.GmailHomePage;
import pages.GmailSigninPage;
import pages.LandingPage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.RegisterPage;
import pages.ResetPasswordPage;
import utility.DriverInitializer;
import utility.ExcelConfig;
import utility.PropertyConfig;



public class NextStepTestInitializer{

  
	    PropertyConfig cf;
		ExcelConfig ec;
		UserDetails ud;
		Functions def;
		
		LandingPage lp;
		RegisterPage rp;
		LoginPage lip;
		MyAccountPage map;
		ResetPasswordPage rpp;
		GmailSigninPage gsp;
		GmailHomePage ghp;
		
		protected WebDriver driver;
		

	@BeforeTest
	public void setuUp() {
		
		
			cf = new PropertyConfig(driver);
			ec = new ExcelConfig();
			ud = new UserDetails();
			def = new Functions();
			
			lp = new LandingPage(driver);
			lip = new LoginPage(driver);
			rp = new RegisterPage(driver);
			
		
			driver = cf.getChromeDriver();
			driver.get(cf.getAppUrl());
			
			   	
		}
		
		
		
	

	@AfterTest
	public void closeBrowser() {
		driver.quit();
		
	}

}
