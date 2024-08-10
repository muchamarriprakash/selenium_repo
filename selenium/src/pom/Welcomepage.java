package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcomepage
{
	//initialization
	public Welcomepage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//declaration
	@FindBy(linkText = "Register")
	private WebElement registerLink;
	 
	@FindBy(linkText = "Log in")
	private WebElement loginLink;
	
	//getter
	public WebElement getLoginLink() 
	{
		return loginLink;
	}

	//getter
	public WebElement getRegisterLink() 
	{
		return registerLink;
	}
	
}
