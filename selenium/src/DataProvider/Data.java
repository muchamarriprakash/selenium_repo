package DataProvider;

import org.testng.annotations.DataProvider;

public class Data 
{
	@DataProvider
	public String[][] Login()
	{
		String[][] data= 
		{
				{"admin","admin"},
				{"user","user"},
				{"prakash123","prakash@123"}
		};
		return data;
	}
	@DataProvider
	public String[][] Register()
	{
		String[][] data= 
			{
					{"admin","admin"},
					{"user","user"},
					{"prakash123","prakash@123"}
			};
			return data;
	}

}
