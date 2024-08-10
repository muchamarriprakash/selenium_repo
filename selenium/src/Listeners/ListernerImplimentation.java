package Listeners;

import java.io.File;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListernerImplimentation extends BaseCLassListeners implements ITestListener
{
	@Override
	public void onTestStart(ITestResult result) 
	{
		Reporter.log("test script is failed",true);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/listimage.png");
	    try {
			FileHandler.copy(temp, dest);
		} catch (java.io.IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}
}