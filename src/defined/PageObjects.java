package defined;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.LandingPage;

public class PageObjects {
	
	static WebDriver driver;
	
	
	public static void init_landing_page(){
		
		LandingPage lp = new LandingPage(driver);
		
		lp = new LandingPage(driver);
		lp = PageFactory.initElements(driver, LandingPage.class);
		
	}

}
