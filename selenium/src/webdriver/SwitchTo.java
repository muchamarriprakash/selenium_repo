package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo 
{

	public static void main(String[] args) throws InterruptedException
	
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		driver.findElement(By.id("null")).click();
		Set<String> allwindowIds = driver.getWindowHandles();
		
		for(String id : allwindowIds)
		{
			driver.switchTo().window(id).close();
			Thread.sleep(1000);
		
		}
	

	}

}
