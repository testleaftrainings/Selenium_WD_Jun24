package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandles {

	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// To get the current window address the return type is String and method is getWindowHandle
		String currentWindow = driver.getWindowHandle();
		System.out.println(currentWindow);
		// 1st --> 948452AD60208E9B8578485439FFF04B
		// 2nd --> 082D52ACA4AFC084A9630AAC6E52D16E
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		System.out.println(driver.getTitle());
		// To transfer the driver control to another window , we have to know the window address. To get all the window address 
				// Use a getWindowHandles() and the return type Set<String>
		
		//Step 1: Get all the windows address by using getWindowHandles()
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles.size());
		
		//Step 2: Convert the Set into List 
		List<String> windows = new ArrayList<String>(windowHandles);
		// Get the window address by using get method
		//Step3:
		driver.switchTo().window(windows.get(1));
		System.out.println("Child window title is "+driver.getTitle());
		driver.switchTo().window(windows.get(0));
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		// If any window is opened or closed --> It is mandatory to use getWindowHandles() again --> After that it will be possible to get the address of all the available windows
		Set<String> windowHandles2 = driver.getWindowHandles();
		for (String window : windowHandles2) {
			driver.switchTo().window(window);
			System.out.println(driver.getTitle());
		}
		
		driver.close();// --> By using driver.close() --> it will close the current window(where the driver control is present.
		
		driver.quit();// --> By using driver.quit()--> It will close all the opened windows and kill the driver instance
	}
	
	
}
