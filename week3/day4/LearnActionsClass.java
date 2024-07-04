package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActionsClass {

	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		String cssValue = driver.findElement(By.xpath("//span[text()='Success']/..")).getCssValue("background-color");
		System.out.println("Before Mouse Hover "+cssValue);
		//Step1: Create an object for Actions class
		Actions action = new Actions(driver);
		WebElement successBtn = driver.findElement(By.xpath("//span[text()='Success']/.."));
		action.moveToElement(successBtn).perform();
		Thread.sleep(2000);
		String cssValue2 = successBtn.getCssValue("background-color");
		System.out.println("After mouse hover "+cssValue2);
		
		driver.get("https://leafground.com/drag.xhtml");
		WebElement dragableWE = driver.findElement(By.id("form:conpnl"));
		Thread.sleep(2000);
		action.dragAndDropBy(dragableWE, 500, 0).perform();
		Thread.sleep(2000);
		action.dragAndDropBy(dragableWE, -150, 0).perform();
		
		WebElement targetWE = driver.findElement(By.id("form:drag_content"));
		Thread.sleep(2000);
		action.dragAndDropBy(targetWE, -100, -50).perform();
		Thread.sleep(2000);
		WebElement drop = driver.findElement(By.id("form:drop"));
		action.dragAndDrop(targetWE, drop).perform();
	}
	
}
