package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import PageObject.Login_page;
import PageObject.Time_Track_page;

public class Actitime_web_Login {
	public static WebDriver driver;
	
	
	@BeforeClass
	@Parameters({"browser"})
	public void launchbrowser(String browser)
	{
		switch(browser)
		{
		    case "chrome":
			driver = new ChromeDriver();
			break;
		    case "edge":
		    driver = new EdgeDriver();
		}
	}
	
	@BeforeMethod
	@Parameters({"url", "username", "password"})
	public void login(String url, String username, String password) throws InterruptedException {
		driver.get(url);
		Login_page lgn = new Login_page(driver);
		lgn.get_username().sendKeys(username);
		lgn.get_password().sendKeys(password);
		lgn.login().click();
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void logout()
	{
		Time_Track_page time_track = new Time_Track_page(driver);
		time_track.logout().click();
	}
	
	@AfterClass
	public void closebrowser()
	{
		driver.close();
	}
}
