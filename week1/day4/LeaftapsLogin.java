package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeaftapsLogin {

	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();// Shortcut to import --> ctrl+shift+o --> import organize --> it will import multiple import at a time and also remove the unused import statements
		
		//Load the url --> get()
		driver.get("http://leaftaps.com/opentaps");
		
		//To Maximize the window
		driver.manage().window().maximize();
		
		
		//To Locate the WebElement --> findElement()
		WebElement usernameField = driver.findElement(By.id("username"));
		// To enter the value to the WebElement --> sendKeys()
		usernameField.sendKeys("demosalesmanager");
		
		//Locate the password field and enter the password as crmsfa
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		//Locate the Login button and click on the WebElement
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Locate the CRM/SFA link and click 
//		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.partialLinkText("CRM")).click();
		
		
		  //To Pause the execution
		Thread.sleep(2000);
		// pass the timout value in  milliseconds 1000millisecond is equal to 1sec
		  
		  //To close the browser window
		driver.close();
		 	}
	
	
}
