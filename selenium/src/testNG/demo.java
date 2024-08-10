package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo 
{	//testNG class

	@Test
	public void sample() 
	{ // test case

		//test steps
		Reporter.log("welcome to advance seleminum",true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demowebshop.tricentis.com/");	
	}
	@Test
	public void demo()
	{
		Reporter.log("demo test case executed",true);
	}

	@Test
	public void test()
	{
		Reporter.log("test executed",true);
	}
}
