package Tasks;

import java.io.IOException;

import org.testng.annotations.Test;

import Base.Actitime_web_Login;
import Dataprovider.Customer_dp;
import PageObject.Tasks_page;
import PageObject.Time_Track_page;
import Utility.Screenshot;
import Utility.WaitUtility;

public class Customer extends Actitime_web_Login
{
	private Time_Track_page time_track = null;
	private Tasks_page task = null;
	@Test(dataProvider = "createcustomer", dataProviderClass = Customer_dp.class)
	public void create_Customer(String customer, String customer_description) throws IOException
	{
		WaitUtility utility = new WaitUtility();
		Screenshot sh = new Screenshot();
		time_track = new Time_Track_page(driver);
		task = new Tasks_page(driver);
		time_track.tasks().click();
		utility.getexplicitwaitforelement(10,task.project_cust());
		task.project_cust().click();
		task.create_new_cust().click();
		utility.getexplicitwaitforelement(10,task.cust_name());
		task.cust_name().sendKeys(customer);
		task.cust_desc().sendKeys(customer_description);
		task.create_cust_btn().click();
		sh.getScreenshot(customer);
		utility.getimplicitwait(10);
	}
	
}
