package testcases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ObjectCollection;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001 {
	
	public static String baseURL = "https://www.glassdoor.com/index.htm";
	static WebDriver driver;
	
	
	@BeforeTest
	public void setDriver()  {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(baseURL);
		driver.manage().window().maximize();
	}
		
	
	@Test(priority=1)
	public void SignInClick() {
		ObjectCollection oc= new ObjectCollection(driver);
		oc.SignInButton().click();		
	}	
	
	@Test(priority=2)
	public void SignIn() {
		ObjectCollection oc= new ObjectCollection(driver);
		oc.enterEmail("clarissa.frey@tmi.com");
		oc.enterPassword("something");
		oc.findButton().click();
		oc.closePopUp();
	}
	
	@Test(priority=3)
	public void clickSeeJobs() {
		ObjectCollection oc= new ObjectCollection(driver);
		oc.seeJobs();
	}
	

	@AfterTest
	public void closeUp() {
		
		driver.close();
	}

}
