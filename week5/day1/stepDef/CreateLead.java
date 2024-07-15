package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead {
public ChromeDriver driver;

		@Given("Launch the browser and load the url")
		public void preCondition() {
			driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		
		@Given ("Enter the username")
		public void username() {
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		}
		
		@Given("Enter the password")
		public void password() {
			driver.findElement(By.id("password")).sendKeys("crmsfa");
		}
		
		@When ("Click on the Login button")
		public void login() {
			driver.findElement(By.className("decorativeSubmit")).click();
		}
		
		@Then ("Verify the login is Successfull")
		public void verify() {
			System.out.println(driver.getTitle());
		}
	
		
		@When ("Click on the crmsfa")
		public void clickCrmsfa() {
			driver.findElement(By.linkText("CRM/SFA")).click();
		}
		
		
		
		
		@Given("Close the browser")
		public void close() {
			driver.close();
		}
}
