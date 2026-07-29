package Tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.LoginPage;

public class TestOne extends BaseClass {
	@DataProvider(name="loginname")
	public Object[][] login()
	{
		return new Object[][]
		{
			{"meghanahamse0724@gmail.com", "Dhanu@1234"}
		};
	}
	@Test(priority=1,dataProvider="loginname")
	public void loginm(String username,String password)
	{
		LoginPage p=new LoginPage(driver);
		p.login(username,password);
		
	}
}


