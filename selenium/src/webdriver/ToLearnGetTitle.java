package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetTitle
{

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String title = driver.getTitle();
		System.out.println("amazon");
		if(title.equals("amazon"))
		{
			System.out.println("user navigated successfully");
		}
		else
		{
			System.out.println("user not defined");
		}

	}

}
