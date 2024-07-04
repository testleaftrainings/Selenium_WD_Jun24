package week3.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWebTable {

	
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("gokul.sekar@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Leaf$123"+Keys.ENTER);
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']/../../..")).click();
		WebElement opportunityTab = driver.findElement(By.xpath("//a[@title='Opportunities']"));
		driver.executeScript("arguments[0].click();", opportunityTab);
		//To get the header/column count 
		List<WebElement> header = driver.findElements(By.xpath("//table/thead/tr/th"));
		System.out.println(header.size());
		for (int i = 0; i < header.size(); i++) {
			String headerName = header.get(i).getText();
			System.out.println(headerName);
		}
		
		List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr"));
		int rowCount = row.size();
		System.out.println(rowCount);
		
		for(int i =1; i<=rowCount; i++) {
			String opportunityName = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/th")).getText();
			System.out.println(opportunityName);
		}
		
		
		//Print all the data present in the 10th row 
		List<WebElement> tenthRow = driver.findElements(By.xpath("//table/tbody/tr[10]/td"));
		for(int i=1; i<=tenthRow.size();i++) {
			String text = driver.findElement(By.xpath("//table/tbody/tr[10]/td["+i+"]")).getText();
			System.out.println(text);
		}
	}
	
	
}
