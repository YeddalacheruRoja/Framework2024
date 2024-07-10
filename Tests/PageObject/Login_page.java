package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page 
{
	WebDriver driver;
	public Login_page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "username")
	private WebElement username;
	
	@FindBy(name = "pwd")
	private WebElement password;
	
	@FindBy(id = "loginButton")
	private WebElement login_btn;
	
	public WebElement login()
	{
		return login_btn;
	}
	public WebElement get_username()
	{
		return username;
	}
	
	public WebElement get_password()
	{
		return password;
	}
}
