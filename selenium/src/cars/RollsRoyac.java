package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RollsRoyac 
{
	@Test(groups="smoke")
	public void launchRollsRoyac()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rolls-roycemotorcars.com/en_GB/home.html");
		
		Reporter.log("RollsRoyac launched successfully",true);
				
	}

}
