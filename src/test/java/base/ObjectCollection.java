package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class ObjectCollection {
	
	public WebDriver driver;
	//public String baseURL = "https://www.glassdoor.com/index.htm";
	


	public ObjectCollection(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement SignInButton() {
		return driver.findElement(By.xpath("//header/nav[1]/div[2]/div[1]/div[1]/div[1]/button[1]"));
	}
	
	public void enterEmail(String email) {
		driver.findElement(By.cssSelector("label[for='modalUserEmail']")).click();
		driver.findElement(By.cssSelector("input[id='modalUserEmail']")).sendKeys(email);
	}
	
	public void enterPassword(String password) {
		driver.findElement(By.cssSelector("label[for='modalUserPassword']")).click();
		driver.findElement(By.cssSelector("input[id='modalUserPassword']")).sendKeys(password);
	}
	
	public WebElement findButton() {
		return driver.findElement(By.cssSelector("button[name='submit']"));
	}
	
	public void closePopUp() {
		driver.findElement(By.cssSelector("span[alt='Close']")).click();
	}
	
	public void seeJobs() {
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/article[1]/a[1]/div[1]/span[1]/span[1]/b[1]")).click();
	}
	
	

}
