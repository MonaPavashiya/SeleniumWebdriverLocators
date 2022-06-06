package cssLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocators1 {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mS\\Documents\\MonaQAjars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//to launch website
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//to maximize window
		driver.manage().window().maximize();
		
		//tag and id #
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");
		//driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("admin123");
		
		//tag and class .
		driver.findElement(By.cssSelector(".button")).click();		
		
		
		
		

	}

}
