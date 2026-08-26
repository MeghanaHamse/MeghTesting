package Tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.Calculator;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.ProfilePage;
import Pages.SearchP;
import Utils.DataP;
import Utils.ScreenshotPage;

public class HomeTest extends BaseTest{
	
	/*@Test(priority=1,dataProvider="RegisterP",dataProviderClass = DataP.class)
public void LoginP(String email,String password) throws InterruptedException
{
		
	LoginPage login=new LoginPage(driver);
	login.loginP(email,password);
	//ScreenshotPage.takeScreenshot(driver);
}
*/
	@BeforeClass(alwaysRun=true)
	public void doLogin() throws InterruptedException {
	    System.out.println("Driver in doLogin: " + driver);
	    Object[][] data = new DataP().RegP();
	    String email = (String) data[0][0];
	    String password = (String) data[0][1];

	    LoginPage login = new LoginPage(driver);
	    login.loginP(email, password);
	}

@Test(priority=1,groups={"home"})
public void HomeP() throws InterruptedException
{
	//LoginTest lg=new LoginTest();
	HomePage hp=new HomePage(driver);
	hp.macB();
}

	@Test(priority=2)
	public void Calci() throws InterruptedException
	{
		Calculator cal=new Calculator(driver);
		cal.calc();
	}
}
