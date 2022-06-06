package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mS\\Documents\\MonaQAjars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//to launch website
		driver.get("https://www.amazon.com/");
		
		//to maximize window
		driver.manage().window().maximize();
		
		// by classname
		int sliders = driver.findElements(By.className("a-carousel-card")).size();
		System.out.println(sliders); //shows how many slider have on this website
		
		//by tagname
		int links = driver.findElements(By.tagName("a")).size();
		System.out.println(links);
		
	}

}
