package week3.day4;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {

	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
		fromStation.clear();
		fromStation.sendKeys("MAS"+Keys.ENTER);
		WebElement toStation = driver.findElement(By.id("txtStationTo"));
		toStation.clear();
		toStation.sendKeys("MDU"+Keys.ENTER);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		//Get the row count
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr"));
		int rowCount = rows.size();
		Set<String> trainNames = new LinkedHashSet<String>();
		Set<String> duplicateTrainNames = new LinkedHashSet<String>();
		for (int i = 2; i <=rowCount; i++) {
			String trainName = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr["+i+"]/td[2]")).getText();
			if(trainNames.add(trainName)==false) {
				duplicateTrainNames.add(trainName);
			}
		}
		int totalNoOfTrains = rowCount-1;
		if(totalNoOfTrains==trainNames.size()) {
			System.out.println("There is no duplicate trains");
			
		}else {
			System.out.println("There is duplicate trains");
		}
		
		System.out.println("The duplicated train names are : "+ duplicateTrainNames);
	}
	
}
