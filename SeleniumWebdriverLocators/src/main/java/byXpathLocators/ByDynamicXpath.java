package byXpathLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByDynamicXpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\mS\\\\Documents\\\\MonaQAjars\\\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.ca/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		//xpath with OR 
		/*driver.findElement(By.xpath("//input[@class='gLFyf gsfi' or @name='p']")).sendKeys("javatpoint");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='gNO89b' or @name='btK']")).click();
		*/
		
		//xpath with and
		/*driver.findElement(By.xpath("//input[@class='gLFyf gsfi' and @name='q']")).sendKeys("javatpoint");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='gNO89b' and @name='btnK']")).click();
		*/
		
		
		/*//xpath with contains()
		driver.findElement(By.xpath("//input[contains(@title,'ea')]")).sendKeys("javatpoint");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'tn')]")).click();
		*/
		
		//xpath with starts-with()
		/*driver.findElement(By.xpath("//input[starts-with(@title,'Se')]")).sendKeys("javatpoint");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@name,'bt')]")).click();*/
		
		//xpath with text()
		//driver.findElement(By.xpath("//a[text()='About']")).click();
		
		//chained xpath
		driver.findElement(By.xpath("//style[@data-iml='1654466324172']//input[@class='gLFyf gsfi']")).sendKeys("javatpoint");
		
	}

}
