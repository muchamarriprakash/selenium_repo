package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsonMethod 
{
	@Test(dependsOnMethods = "Register")
	public void login()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demowebshop.tricentis.com/login");
		Reporter.log("login is successfull",true);
	}
	
	@Test
	public void Register()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demowebshop.tricentis.com/register");
		Reporter.log("register is successful",true);
	}
	@Test(dependsOnMethods = {"Register","login"})
	public void product()
	{
		Reporter.log("product added successful",true);		
	}

}
