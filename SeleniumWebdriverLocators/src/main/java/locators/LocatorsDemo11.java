package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo11 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mS\\Documents\\MonaQAjars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//to launch website
		driver.get("https://www.amazon.com/");
		               //OR
		//driver.navigate().to("https://www.amazon.com/");
		
		
		//to maximize window
		driver.manage().window().maximize();
		
		//search by ID webelement
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("T-shirts");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//search by linktext
		driver.findElement(By.linkText("Today's deals")).click();
		
		
		//search by partial linktext
		//driver.findElement(By.partialLinkText("deals")).click();
		
		

	}

}
