package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethod{

	@Test
	public void runCreateLead() {
		
		
	/*	//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Load the url
		driver.get("http://leaftaps.com/opentaps");
		
		// maximize the window 
		driver.manage().window().maximize();
		
		//Login to the leaftaps
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// Click on crmsfa link
		driver.findElement(By.partialLinkText("CRM")).click();
		
		//Click on the leads tab
		driver.findElement(By.linkText("Leads")).click();
		
		*/
		
		//Click on create lead from menu
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter the company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		//Enter the first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gokul");
		
		//Enter the last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sekar");
		
		// Enter the phno 
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		
		//Source dropdown 
			//Step 1 : Locate the dropdown WebElement
		WebElement sourceWE = driver.findElement(By.id("createLeadForm_dataSourceId"));
			// Step 2: Create an object for Select class (from selenium)
		Select sourceDD = new Select(sourceWE);
			//step 3: Use select method 
		sourceDD.selectByIndex(4);// index starts from zero, select employee from source dropdown
		
		
		//marketingCampaignId dropdown
		WebElement marketingCampaignWE = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select marketingCampaignDD = new Select(marketingCampaignWE);
		marketingCampaignDD.selectByVisibleText("eCommerce Site Internal Campaign");// select the eCommerce Site Internal Campaign by using text
		
		
		// createLeadForm_currencyUomId dropdown 
		WebElement currencyWE = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select currencyDD = new Select(currencyWE);
		currencyDD.selectByValue("INR");
		
		
		//Click on the Create lead btn
		driver.findElement(By.name("submitButton")).click();
		
//		driver.close();
	}
	
}
