package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Time_Track_page {
	
	WebDriver driver;
	public Time_Track_page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='content tasks']//img[@class='sizer']")
	private WebElement tasks;
	
	@FindBy(xpath = "//a[@class='logout']")
	private WebElement logout;
	
	public WebElement tasks()
	{
		return tasks;
	}
	
	public WebElement logout()
	{
		return logout;
	}
}
