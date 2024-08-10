package list;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listenerimplementation extends Baseclass implements ITestListener 
{
	public void onTestfailure(ITestResult result)
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/images.png");
		try
		{
			FileHandler.copy(temp, dest);
		} catch (IOException e)
		{

			e.printStackTrace();
		}
	}

}
