package Dataprovider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import Datacontroller.Customer_dc;

public class Customer_dp {
	
	
	
	@DataProvider(name = "createcustomer")
	public Object[][] Create_customer() throws IOException
	{
		return new Customer_dc().create_customer("customer", "createcustomer");
	}
}
