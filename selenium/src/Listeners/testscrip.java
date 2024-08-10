package Listeners;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;

public class testscrip extends BaseCLassListeners
{
	public void login()
	{
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop.Login", "Login page is not dispalyed");
		Reporter.log("Login page is displayed",true);
		
		driver.findElement(By.id("Email")).sendKeys("muchamarriprakash@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Prakash@1");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop", "home page is not displayed");
	}

}
