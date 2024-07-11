package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Base {

	public RemoteWebDriver driver;
	
	@Parameters({"url","username","password", "browser"})
	@BeforeMethod
	public void  preCondition(String url, String uname, String pwd, String browser) {
		
		
		switch(browser) {
		
		case "chrome":
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--disable-notifications");
			driver = new ChromeDriver(option);
			break;
			
		case "edge":
			EdgeOptions eo = new EdgeOptions();
			eo.addArguments("--disable-notifications");
			driver = new EdgeDriver(eo);
			break;
			
		default:
			driver = new InternetExplorerDriver ();
		
			
		}
		
		
		 
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("Login")).click();
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	
	
	
}
