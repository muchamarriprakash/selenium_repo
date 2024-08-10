package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnclick
{

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("(https://demowebshop.tricentis.com/e");
		
		WebElement searchButton = driver.findElement(By.xpath("//input[@value='Search']"));
		
        searchButton.click();
	}
			
}
