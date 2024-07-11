package week4.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethod {
	ChromeDriver driver;
	@Parameters({"password", "url", "username"})// order is random we can provide, but the name attribute values is case sensitive
	@BeforeMethod
	public void preCondition(String pwd, String url, String uname) {// The order should be same as Parameters annotation, varibale name can be any name
		//Launch the browser
		driver = new ChromeDriver();
		
		//Load the url
		driver.get(url);
		
		// maximize the window 
		driver.manage().window().maximize();
		
		//Login to the leaftaps
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// Click on crmsfa link
		driver.findElement(By.partialLinkText("CRM")).click();
		
		//Click on the leads tab
		driver.findElement(By.linkText("Leads")).click();
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	
	
}
