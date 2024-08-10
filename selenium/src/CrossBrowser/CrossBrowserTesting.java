package CrossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting 
{
	public WebDriver driver;

	@Parameters("browser")
	@Test
	public void launch(String browsername)
	{
		if(browsername.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browsername.equals("firefox"))
		{
			driver = new ChromeDriver();
		}
		else if (browsername.equals("edge"))
		{
			driver = new ChromeDriver();
		}
		driver.get("https://demowebshop.tricentis.com/");
	}

}
