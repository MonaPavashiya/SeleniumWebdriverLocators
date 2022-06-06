package byXpathLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByXpathLocator {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mS\\Documents\\MonaQAjars\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.google.ca/");
	driver.manage().window().maximize();
	
	//Absolute xpath
	/*driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("javatpoint");
	Thread.sleep(2000);
	driver.findElement(By.xpath(" /html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[2]/div[2]/div[5]/center[1]/input[1]")).click();
	
	*/
	
	//Relative xpath
	
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("javatpoint");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='btnK']")).click();
	

	}

}
