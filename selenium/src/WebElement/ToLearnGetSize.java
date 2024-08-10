package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetSize 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/register");
		
		org.openqa.selenium.Dimension size = driver.findElement(By.xpath("//input[@value='Search']")).getSize();
				
		System.out.println(size.getHeight());
		
		System.out.println(size.getWidth());
		
	}

}
