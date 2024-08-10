package cars;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class tata
{
	@Test(groups="system")
	public void launchRollsRoyac()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.tata.com/");
		
		Reporter.log("tata launched successfully",true);
				
	}

}
