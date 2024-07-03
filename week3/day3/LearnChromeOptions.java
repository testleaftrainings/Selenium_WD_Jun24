package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnChromeOptions {

	
	public static void main(String[] args) {
		
		//Steps to handle browser notification
		//Step1: Create an object for ChromeOptions class
		ChromeOptions options = new ChromeOptions();
		//Step2: add arguments in addArguments() to disable the notification
		options.addArguments("--disable-notifications");
		//Step3: Pass the ChromeOptions object into the ChromeDriver Construcor
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Click on Flights tab
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();	
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> window = new ArrayList<String>(windowHandles);
		driver.switchTo().window(window.get(1));
		System.out.println(driver.getTitle());
		driver.switchTo().window(window.get(0));
		driver.close();
		
		
	}
	
}
