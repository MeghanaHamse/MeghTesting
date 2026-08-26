package Tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.LoginPage;
import Utils.DataP;
import Utils.ScreenshotPage;

public class LoginTest extends BaseTest{
	

	    @BeforeClass(alwaysRun = true)
	    public void doLogin() throws InterruptedException {

	        Object[][] data = new DataP().RegP();

	        String email = (String) data[0][0];
	        String password = (String) data[0][1];

	        LoginPage login = new LoginPage(driver);
	        login.loginP(email, password);
	    }
	}
	/*@Test(priority=1,dataProvider="RegisterP",dataProviderClass = DataP.class)
	public void LoginP(String email,String password) throws InterruptedException
	{
			
		LoginPage login=new LoginPage(driver);
		login.loginP(email,password);
		
	}
*/	

