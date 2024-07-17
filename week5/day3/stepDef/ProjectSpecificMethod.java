package stepDef;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class ProjectSpecificMethod extends AbstractTestNGCucumberTests{

	public static ChromeDriver driver;
	
	
	  @BeforeMethod
	  public void launchBrowser() {
	  driver = new ChromeDriver();
	  driver.get("http://leaftaps.com/opentaps/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  }
	  
	  @AfterMethod
	  public void closeBrowser() {
	  driver.close(); 
	  }
	 
}
