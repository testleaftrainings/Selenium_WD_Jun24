package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		//Transfer the driver control into the frame
		
		driver.switchTo().frame(0); // swtich to frame by using index, Index starts from Zero
		
		driver.findElement(By.xpath("//button[@id='Click']")).click(); // Click me 
		
		// Transfer driver control from frame to WebPage --> defaultContent()
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//h5[text()=' How many frames in this page?']/following-sibling::iframe")));
		
		String text = driver.findElement(By.xpath("//button[@id='Click']")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		
		//Outer frame
		driver.switchTo().frame(2);
		
		//Inner frame
		driver.switchTo().frame("frame2");
//		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@id='Click']")).click();
		
		//Parent frame
		driver.switchTo().parentFrame();// transfer driver from inner frame to outer frame
		driver.switchTo().parentFrame(); // transfer driver from outer frame to main web page
//		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//h5[text()=' Click Me (Inside frame)']"));
		
		
		
	}
	
}
