package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
	public Loginpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getEmaliTextfield()
	{
		return emaliTextfield;
	}

	public WebElement getPasswordTextfield() 
	{
		return passwordTextfield;
	}

	public WebElement getLoginButton() 
	{
		return loginButton;
	}
	@FindBy(id = "Email")
	private WebElement emaliTextfield;

	@FindBy(id = "Password")
	private WebElement passwordTextfield;

	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButton;

}
