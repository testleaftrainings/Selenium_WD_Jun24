package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWaits {

	public static void main(String[] args) throws InterruptedException  {
		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		// Implicitly wait --> Selenium Wait
			// Defualt timeout of implicitly wait is zero seconds
			// Implicitly wait works only for findElement() and findElements()
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//		driver.findElement(By.linkText("Create new account")).click();
//		Thread.sleep(10000); --> Java Wait --> very less in real time , it will wait for entire timoute which we mentioned in milliseconds
//		driver.findElement(By.className("first name")).sendKeys("Gokul");
		
		
		driver.get("http://leaftaps.com/opentaps/");
		
		//Login to the leaftaps
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// Click on crmsfa link
		driver.findElement(By.partialLinkText("CRM")).click();
		
		//Click on the leads tab
		driver.findElement(By.linkText("Leads")).click();
		
		//Click on find leads
		driver.findElement(By.linkText("Find Leads")).click();
		
		//Click on phno tab
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		//Enter the phno
		driver.findElement(By.name("phoneNumber")).sendKeys("99");
		
		//Click on find leads btn
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
//		Thread.sleep(2000);
		
		// Click on the first resulting lead id
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
//		driver.findElement(By.xpath("//a[text()='14239']")).click();
		
		String leadId = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		
		System.out.println(leadId);
		
		driver.close();
		
	}
	
}
