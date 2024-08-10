package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		Welcomepage wp = new Welcomepage(driver);
		wp.getRegisterLink().click();
		wp.getLoginLink().click();
		
		Loginpage lp = new Loginpage(driver);
		lp.getEmaliTextfield().sendKeys("muchamarriprakash@gmail.com");
		lp.getPasswordTextfield().sendKeys("Prakash@1");
		lp.getLoginButton().click();

	}

}
