package week1.day4;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowser {

	
	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();// Shortcut to import --> ctrl+shift+o --> import organize --> it will import multiple import at a time and also remove the unused import statements
//		FirefoxDriver driver = new FirefoxDriver();
//		EdgeDriver driver= new EdgeDriver();
//		InternetExplorerDriver driver = new InternetExplorerDriver();
		
		//Load the url --> get()
		driver.get("http://leaftaps.com/opentaps");
		
		//To Maximize the window
		driver.manage().window().maximize();
		
		//To Pause the execution
		Thread.sleep(2000);// pass the timout value in milliseconds 1000millisecond is equal to 1sec
		
		//To close the browser window
		driver.close();
	}
	
}
