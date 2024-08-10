package Bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RoyalEnfiled
{
	@Test(groups="smoke")
	public void launchRoyalEnfiled()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.royalenfield.com/in/en/motorcycles/classic-350/");
		
		Reporter.log("RoyalEnfiled successfully launched");
				
	}
}
