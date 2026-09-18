package Tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

import Base.BaseTest;
import Pages.LoginPage;
import Utility.JSONFile;

public class LoginTest extends BaseTest {
	

	@Test(priority=1,groups="megh")
	public void LoginCorrect()
	{
		LoginPage login=new LoginPage(driver);
		login.Login("meghanahamse07@gmail.com","Meghana@1234");
		//Assert.assertTrue(login.correctLogin().isDisplayed());
	}
	/*
	 //JSON
	 
@Test(priority=2)
	public void LoginT() throws IOException
	{
		LoginPage login=new LoginPage(driver);
		String email = JSONFile.getData("email");
     String password = JSONFile.getData("password");

	
		login.Login(email,password);
		Assert.assertEquals("Incorrect email or password.",login.ErrorMsg());;
	}
	
@Test(priority=3)

public void LoginError()
{
	LoginPage login=new LoginPage(driver);
	login.Login("","");
	Assert.assertEquals(
	        login.EmptyField(),
	        "*Email is required | *Password is required"
	);
}
	
@Test(priority=4,groups="megh")
public void NoUsername()
{
	LoginPage login=new LoginPage(driver);
	login.Login("","meghana@1234");
	Assert.assertEquals("*Email is required",login.EmptyUser());
}
@Test(priority=5)
public void NoPassword()
{
	LoginPage login=new LoginPage(driver);
	login.Login("meghanahamse07@gmail.com","");
	Assert.assertEquals("*Password is required",login.Emptypassword());
}
*/
}
