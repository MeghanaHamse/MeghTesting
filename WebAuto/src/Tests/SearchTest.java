package Tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.LoginPage;
import Pages.SearchP;
import Utils.DataP;

public class SearchTest extends BaseTest {

@BeforeClass(alwaysRun=true)
public void doLogin() throws InterruptedException { 
	Object[][] data = new DataP().RegP(); // grab the data directly
String email = (String) data[0][0]; // "meghanahamse0724@gmail.com"
String password = (String) data[0][1]; // "Meghana@2407"
LoginPage login = new LoginPage(driver); 
login.loginP(email, password);
}

@Test(priority=1,groups={"home"})
public void SearchPerform() throws InterruptedException
{
	SearchP sp=new SearchP(driver);
	sp.SearchM();
}
}
