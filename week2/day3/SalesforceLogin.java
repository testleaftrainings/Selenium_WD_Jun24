package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SalesforceLogin {

	public static void main(String[] args) {
		
		//To Handle browser notification
		
		//Step1 : Create a object for ChromeOptions() class
		ChromeOptions  options  = new ChromeOptions();
		
		//step 2: addArguments to set the notification snippet/code
		options.addArguments("--disable-notifications");
		// step 3: Pass the chromeOptions object into the ChromeDriver constructor
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("username")).sendKeys("gokul.sekar@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Leaf$123");
		driver.findElement(By.id("Login")).click();
		

	}

}
