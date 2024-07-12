package Utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.Actitime_web_Login;



public class WaitUtility 
{
	WebDriverWait wait;
  public void getimplicitwait(int n)
   {
	  
	  Actitime_web_Login.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(n));  
   }
  public void getexplicitwaitforelement(int n,WebElement wb)
  {
	  wait=new WebDriverWait(Actitime_web_Login.driver, Duration.ofSeconds(n));
	  wait.until(ExpectedConditions.visibilityOf(wb));
  }
}
