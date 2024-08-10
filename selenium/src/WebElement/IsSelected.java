package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
		
		WebElement price = driver.findElement(By.xpath("//option[@value='199 ']"));
		
		System.out.println(price.isSelected());
		
		price.click();
		
		System.out.println("------after click------");
		
		System.out.println("price is selected");

	}

}
