package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabs {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		driver.findElement(By.linkText("instagram")).click();
		Set<String> allwindowIds = driver.getWindowHandles();
		
		for(String id : allwindowIds)
		{
			System.out.println(id);
		}
		
	}

}
