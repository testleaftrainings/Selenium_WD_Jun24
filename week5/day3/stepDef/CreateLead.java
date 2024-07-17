package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends ProjectSpecificMethod {
	

		
	
		
		@When ("Click on the crmsfa")
		public void clickCrmsfa() {
			driver.findElement(By.linkText("CRM/SFA")).click();
		}
		
		
		@When ("Click on the leads tab")
		public void clickLeadsTab() {
			driver.findElement(By.linkText("Leads")).click();
		}
		
		@When ("Click on the CreateLead link")
		public void clickCreateLeadLink() {
			driver.findElement(By.linkText("Create Lead")).click();
		} 
		
		//(.*)$ --> represent as object
		
		@Given ("Enter the company name as (.*)$")
		public void enterCname(String cname) {
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		}
		
		@Given ("Enter the firstname as (.*)$")
		public void enterFname(String fname) {
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		}
		
		@Given ("Enter the lastname as (.*)$")
		public void enterLname(String lname) {
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		}
		
		@When ("Click on the create lead btn")
		public void clickSubmit() {
			driver.findElement(By.name("submitButton")).click();
		}
		
		@Then("Verify the create lead is successfull")
		public void verifyCreateLead() {
			System.out.println(driver.getTitle());
		}
		
}
