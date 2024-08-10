package cars;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ambasidor
{
	@Test(groups="smoke")
	public void launchRollsRoyac()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.audi.com/en.html");
		
		Reporter.log("audi launched successfully",true);
				
	}

}
