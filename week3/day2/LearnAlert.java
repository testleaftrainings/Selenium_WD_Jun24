package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Modal Alert
		//Simple Alert --> able to get text from alert and only possible to accept
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		
		// Confirmation Alert --> able to get text from alert and either accept or dismiss the alert
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		System.out.println(alert.getText());
		alert.dismiss();
		
		//Prompt Alert --> able to getText, pass input to the alert, either accept or dismiss.
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		System.out.println(alert.getText());
		alert.sendKeys("Gokul");
		alert.accept();
		
		//Non modal alert --> Sweet alert --> Consider as normal WebElement
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		String sweetAlertTxt = driver.findElement(By.className("ui-confirm-dialog-message")).getText();
		System.out.println(sweetAlertTxt);
		driver.findElement(By.name("j_idt88:j_idt109")).click();
		
		
	}
	
}
