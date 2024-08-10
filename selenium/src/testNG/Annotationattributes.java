package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Annotationattributes 
{	
	@Test(priority = 2,invocationCount = 4,threadPoolSize = 3,dependsOnMethods = "Register")
	public void login()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demowebshop.tricentis.com/login");
		Reporter.log("login is successfull",true);
	}
	
	@Test(priority = 1,enabled = true)
	public void Register()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demowebshop.tricentis.com/register");
		Reporter.log("register is successful",true);
	}
}
