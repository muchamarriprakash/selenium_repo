package Bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class R15 
{
	@Test(groups="system")
	public void R15launched()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.yamaha-motor-india.com/yamaha-r15v4.html");
		
		Reporter.log("R15 launched successfully");
	}

}
