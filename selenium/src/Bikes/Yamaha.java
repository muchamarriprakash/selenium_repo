package Bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Yamaha
{
	@Test(groups="smoke")
	public void YamahaLaunched()
	{
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://www.yamaha.com/en/");
		
		Reporter.log("yamaha successfully launched");
	}

}
