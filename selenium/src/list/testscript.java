package list;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;

public class testscript extends Baseclass 
{
	public void clickonbooks()
	{
		driver.findElement(By.linkText("Books")).click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Books" ,"books page is not displayed");
		Reporter.log("books page is displayed",true);
	}

}
