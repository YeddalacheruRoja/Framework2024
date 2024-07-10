package Tasks;

import org.testng.annotations.Test;

import Base.Actitime_web_Login;
import Dataprovider.Customer_dp;
import PageObject.Tasks_page;
import PageObject.Time_Track_page;

public class Customer extends Actitime_web_Login
{
	private Time_Track_page time_track = null;
	private Tasks_page task = null;
	@Test(dataProvider = "createcustomer", dataProviderClass = Customer_dp.class)
	public void create_Customer(String customer, String customer_description) throws InterruptedException
	{
		time_track = new Time_Track_page(driver);
		task = new Tasks_page(driver);
		time_track.tasks().click();
		Thread.sleep(2000);
		task.project_cust().click();
		task.create_new_cust().click();
		task.cust_name().sendKeys(customer);
		task.cust_desc().sendKeys(customer_description);
		task.create_cust_btn().click();
		Thread.sleep(2000);
	}
	
}
