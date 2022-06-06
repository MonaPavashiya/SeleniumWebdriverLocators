package cssLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocators2 {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mS\\Documents\\MonaQAjars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//to launch website
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//to maximize window
		driver.manage().window().maximize();
		
		
		//tag and attribute
		driver.findElement(By.cssSelector("input[name=txtUsername]")).sendKeys("Mona");
		           //OR
		//driver.findElement(By.cssSelector("[name=txtUsername]")).sendKeys("Mona");
		
		driver.findElement(By.cssSelector("input[name=txtPassword]")).sendKeys("123");
		
		
		//tag,class and attribute
		driver.findElement(By.cssSelector("input.button[class=button]")).click();
		                    //OR
		//driver.findElement(By.cssSelector(".button[class=button]")).click();
		
		
		

	}

}
