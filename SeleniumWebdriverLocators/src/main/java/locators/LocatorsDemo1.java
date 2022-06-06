package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mS\\Documents\\MonaQAjars\\Chromdriver\\chromedriver.exe");

		// instantiate chromeDriver class
		WebDriver driver = new ChromeDriver();

		// Launch website
		driver.get("https://opensource-demo.orangehrmlive.com/");
		// use this method for multiple website
		// driver.navigate().to("https://opensource-demo.orangehrmlive.com/");

		// maximize web page
		driver.manage().window().maximize();

		// id locators
		WebElement searchbox = driver.findElement(By.id("txtUsername"));
		searchbox.sendKeys("Admin");

		// name locators
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	
		driver.findElement(By.id("btnLogin")).click();

	}
}
