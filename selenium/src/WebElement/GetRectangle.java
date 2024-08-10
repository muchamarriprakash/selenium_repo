package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectangle {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Rectangle rectangle = driver.findElement(By.xpath("//input[@value='Vote']")).getRect();
		
		System.out.println("height:"+rectangle.getHeight());
		
		System.out.println("width:"+rectangle.getWidth());
		
		System.out.println("x:"+rectangle.getX());
		
		System.out.println("y:"+rectangle.getY());
	
		

	}

}
