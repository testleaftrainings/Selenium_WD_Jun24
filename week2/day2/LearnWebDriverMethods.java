package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebDriverMethods {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/button.xhtml");
		
		WebElement clickWE = driver.findElement(By.xpath("//span[text()='Click']"));
		boolean displayed = clickWE.isDisplayed();
		boolean enabled = clickWE.isEnabled();
		System.out.println("The click WebElement is Displayed "+displayed);
		System.out.println("The click WebElement is Enabled "+enabled);
		
		WebElement disabledWE = driver.findElement(By.name("j_idt88:j_idt92"));
		boolean displayed2 = disabledWE.isDisplayed();
		boolean enabled2 = disabledWE.isEnabled();
		
		System.out.println("The disabled WE is displayed "+ displayed2);
		System.out.println("The disabled WE is Enabled "+ enabled2);
		
		driver.get("https://leafground.com/checkbox.xhtml");
		
		WebElement basicCheckBox = driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']"));
		basicCheckBox.click();									//ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-active
		boolean selected = basicCheckBox.isSelected();
		System.out.println("The Checkbox is selected "+selected);
		
		Thread.sleep(2000);
		WebElement basciCB = driver .findElement(By.xpath("//input[@aria-label='Basic']"));
		boolean selected2 = basciCB.isSelected();
		System.out.println("The check is selected after click "+selected2);
		System.out.println(basciCB.getTagName());
		String text = driver.findElement(By.xpath("//span[@class='ui-chkbox-label']")).getText();
		System.out.println(text);
		System.out.println(driver.getTitle());
		
		driver.get("https://leafground.com/button.xhtml");
		
		clickWE = driver.findElement(By.xpath("//span[text()='Click']"));
		clickWE.click();
		
		/*
		 * String name  = "Testleaf";
		 * name = "qeagle";
		 * **/
		//To get the url --> currenr url
		
		System.out.println(driver.getCurrentUrl());
		WebElement sendBtn = driver.findElement(By.name("j_idt130"));
		String backgroundClr = sendBtn.getCssValue("background-color");
		System.out.println(backgroundClr);
		
		driver.get("https://leafground.com/input.xhtml;");
		String placeHolder = driver.findElement(By.name("j_idt88:name")).getAttribute("placeholder");
		System.out.println(placeHolder);
		
		
		driver.findElement(By.name("j_idt88:j_idt95")).clear();
		Point location = driver.findElement(By.name("j_idt88:j_idt95")).getLocation();
		System.out.println(location);
		
		Rectangle textBoxSize = driver.findElement(By.name("j_idt88:j_idt95")).getRect();
		System.out.println(textBoxSize);
		
		Dimension size = driver.findElement(By.name("j_idt88:j_idt95")).getSize();
		System.out.println(size);
		
		/*
		 * driver.get("http://leaftaps.com/opentaps/");
		 * 
		 * driver.findElement(By.id("username")).sendKeys("Demo"); String userNameValue
		 * = driver.findElement(By.id("username")).getAttribute("value");
		 * System.out.println(userNameValue);
		 */
		String title = driver.getTitle();
		
		if(title.equals("Input Components")) {
			System.out.println("The Title is verified suceessfully");
		}else {
			System.out.println("The title is wrong");
		}
		
		
		
		
		
	}
	
	
}
