package Listeners;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListernerImplimentation.class)
public class TestScript 
{
	@Test
	public void login() 
	{
		Reporter.log("open browser",true);
		Reporter.log("navigate to url",true);
		Reporter.log("click on login link",true);
		Reporter.log("enter email",true);
		Reporter.log("enter password",true);
		Reporter.log("click on login button",true);
		Assert.assertEquals(true, false);
	}
}
