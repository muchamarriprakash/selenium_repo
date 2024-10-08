package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Point size = driver.findElement(By.xpath("//input[@value='Search']")).getLocation();
		
		System.out.println(size.getX());
		
		System.out.println(size.getY());
		
		Point position = driver.findElement(By.id("id=\"vote-poll-1\"")).getLocation();
		
		System.out.println(position.getX());
		
		System.out.println(position.getY());
	}

}
