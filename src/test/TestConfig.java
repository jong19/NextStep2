package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import data.UserDetails;
import pages.LandingPage;
import pages.RegisterPage;
import utilities.ExcelConfig;
import utilities.PropertyConfig;



public class TestConfig {
	
	protected WebDriver driver;

	protected PropertyConfig pc;
	protected ExcelConfig ec;
	protected UserDetails ud;
	
	protected LandingPage lp;
	protected RegisterPage rp;
	
	
	@BeforeTest
	public void setup(){
		
		pc = new PropertyConfig();
		ec = new ExcelConfig();
		ud = new UserDetails();
		
		lp = new LandingPage(driver);
	
		
		driver = pc.getChromeDriver();
		driver.get(pc.getAppUrl());
		
		
	}
	
	
	@AfterTest
	public void closeBrowser(){
		driver.quit();
		
	}
	

	

}
