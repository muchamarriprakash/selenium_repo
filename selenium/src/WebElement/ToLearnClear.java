package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnClear
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		 WebElement usernameTf = driver.findElement(By.id("username"));
		 
		 Thread.sleep(2000);
		 usernameTf.clear();
		 Thread.sleep(2000);
		 usernameTf.sendKeys("selenium");
	}

}
