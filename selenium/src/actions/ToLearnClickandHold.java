package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnClickandHold 

{

	public static void main(String[] args)
	
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://yonobusiness.sbi/");
		
		driver.findElement(By.partialLinkText("Login")).click();
		
		driver.findElement(By.id("password")).sendKeys("test@12343");
		
		WebElement eyeicon = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));
		
		Actions act = new Actions(driver);
		
		act.clickAndHold(eyeicon).perform();
		
		
		
	}

}
