package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/");
		String parentId = driver.getWindowHandle();
		Thread.sleep(20000);
		driver.findElement(By.id("compare")).click();
		Set<String>  allwindowsId = driver.getWindowHandles();
		for(String id : allwindowsId)
		{
			String url = driver.switchTo().window(id).getCurrentUrl();
			if(!url.contains("shoppersstack"))
			{
				driver.close();
			}
		}
		driver.switchTo().window(parentId);
		String title = driver.getTitle();
		System.out.println(title);
	}

}
