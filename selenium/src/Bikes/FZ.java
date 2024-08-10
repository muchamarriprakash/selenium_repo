package Bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FZ 
{
	@Test(groups="smoke")
	public void FZlaunched() 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bikewale.com/yamaha-bikes/fz/");
		
		Reporter.log("FZ launched successfully");
		
	}

}
