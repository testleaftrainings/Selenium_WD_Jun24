package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActionsClass {

	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.leafground.com/menu.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions action = new Actions(driver);
//		action.contextClick().perform();
		/*
		WebElement profileWE = driver.findElement(By.xpath("//span[text()='Profile']"));
		
		action.contextClick(profileWE).pause(5000).perform();
		WebElement saveBtn = driver.findElement(By.xpath("(//span[text()='Save'])[2]"));
		action.click(saveBtn).perform();
		
		driver.get("https://leafground.com/table.xhtml");
		
		WebElement nameCol = driver.findElement(By.xpath("//span[text()='Name']/.."));
		WebElement countryCol = driver.findElement(By.xpath("//span[text()='Country']/.."));
		WebElement representativeCol = driver.findElement(By.xpath("//span[text()='Representative']/.."));
		WebElement joinDateCol = driver.findElement(By.xpath("//span[text()='Join Date']/.."));
		WebElement statusCol = driver.findElement(By.xpath("//span[text()='Status']/.."));
		WebElement activityCol = driver.findElement(By.xpath("//span[text()='Activity']/.."));
		//KeyDown() --> press a key
		//keyUp() --> release a key
		action.keyDown(Keys.CONTROL).click(nameCol).click(countryCol).click(representativeCol).click(joinDateCol).click(statusCol).click(activityCol).keyUp(Keys.CONTROL).perform();
	
		driver.get("https://leafground.com/messages.xhtml");
		WebElement firstNameField = driver.findElement(By.name("j_idt100:firstname"));
		action.sendKeys(firstNameField, "Gokul").perform();
		action.keyDown(Keys.SHIFT).keyDown(Keys.HOME).keyUp(Keys.HOME).keyUp(Keys.SHIFT).perform();
		
		driver.get("https://leafground.com/drag.xhtml");
		action.scrollByAmount(0, -100000).perform();
		WebElement element = driver.findElement(By.xpath("//h5[text()='Progress Bar']"));
		action.moveToElement(element).perform();
		WebElement bambooWatch = driver.findElement(By.xpath("(//td[text()='Bamboo Watch'])[2]"));
		WebElement chakraBraclet = driver.findElement(By.xpath("(//td[text()='Chakra Bracelet'])[2]"));
//		action.clickAndHold(bambooWatch).moveToElement(chakraBraclet).release(bambooWatch).perform();
		
		
		
		driver.get("https://www.amazon.in/");
		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Back to top')]"));
		action.moveToElement(element).perform();
		
		*/
		driver.get("https://www.myntra.com/");
		WebElement men = driver.findElement(By.xpath("//a[text()='Men']"));
//		action.moveToElement(men).perform();
		action.scrollToElement(men).perform();
		
		
	}
	
}
