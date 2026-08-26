package Tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.LoginPage;
import Pages.ProfilePage;
import Utils.DataP;
import Utils.ScreenshotPage;

public class ProfileTest extends BaseTest {
/*	@Test(priority=1,dataProvider="RegisterP",dataProviderClass = DataP.class)
	public void LoginP(String email,String password) throws InterruptedException
	{
			
		LoginPage login=new LoginPage(driver);
		login.loginP(email,password);
		//ScreenshotPage.takeScreenshot(driver);
	}
*/
	
	@BeforeClass 
	public void doLogin() throws InterruptedException { 
		Object[][] data = new DataP().RegP(); // grab the data directly
	String email = (String) data[0][0]; // "meghanahamse0724@gmail.com"
	String password = (String) data[0][1]; // "Meghana@2407"
	LoginPage login = new LoginPage(driver); 
	login.loginP(email, password);
	}
	
	@Test(priority=2,dataProvider="ProfilePage",dataProviderClass = DataP.class)
	 public void ProfileP(String firstN,String lastN) throws InterruptedException
	 {
		 ProfilePage p=new ProfilePage(driver);
		 p.Prof(firstN,lastN);
	 }
}
