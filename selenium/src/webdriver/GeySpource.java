package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GeySpource 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");	
		
		String source = driver.getPageSource();
		
		System.out.println(source);
	}

}
