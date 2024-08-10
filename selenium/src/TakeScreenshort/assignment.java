package TakeScreenshort;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class assignment
{

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://crmaccess.vtiger.com/log-in/");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File temp = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./screenshots/assign.png");
		
		FileHandler.copy(temp,dest);
	
		
	}

}
