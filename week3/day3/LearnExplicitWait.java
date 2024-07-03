package week3.day3;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicitWait {

	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/window.xhtml");
		//Step1: Create an object for WebDriverWait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//Step2: Write a conditon for Explicit wait
		Boolean until = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[text()='I am about to hide']")));
		System.out.println(until);
		
		
		/*
		driver.get("https://www.leafground.com/waits.xhtml");
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String text = driver.findElement(By.name("j_idt87:j_idt90")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("(//span[text()='Click'])[2]")).click();
		
		

		driver.findElement(By.xpath("//span[text()='Click First Button']")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@aria-live='polite']")));
		driver.findElement(By.xpath("//span[text()='Click Second']")).click();
		
		driver.findElement(By.xpath("(//span[text()='Click'])[3]")).click();
		
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath("//button[@name='j_idt87:j_idt99']/span"), "Did you notice?"));
		
		*/
		
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles.size());
		
	}
	
}
