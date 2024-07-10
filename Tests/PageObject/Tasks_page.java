package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tasks_page 
{
	WebDriver driver;
	public Tasks_page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[normalize-space()='Projects & Customers']")
	private WebElement projects_customer;
	
	@FindBy(xpath = "//input[@value='Create New Customer']")
	private WebElement create_new_cust;
	
	@FindBy(xpath = "//input[@name='name']")
	private WebElement cust_name;
	
	@FindBy(xpath = "//textarea[@name='description']")
	private WebElement cust_description;
	
	@FindBy(xpath = "//input[@name='createCustomerSubmit']")
	private WebElement create_cust_btn;
	
	
	public WebElement project_cust()
	{
		return projects_customer;
	}
	
	public WebElement create_new_cust() 
	{
		return create_new_cust;
	}
	
	public WebElement cust_name()
	{
		return cust_name;
	}
	
	public WebElement cust_desc()
	{
		return cust_description;
	}
	
	public WebElement create_cust_btn()
	{
		return create_cust_btn;
	}
}
