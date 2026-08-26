package Tests;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Base.BaseTest;
import Pages.RegisterPage;

import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {
	@DataProvider(name = "RegisterP")
	public Object[][] RegP() {
	    return new Object[][] {
	        {"dude24077@gmail.com", "Sharath", "Gowda", "Sharat@12"}
	    };
	}
	@Test(priority=1,dataProvider="RegisterP")
public void regTest(String emailId,String Firstname,String Lastname,String Spassword)
{
	RegisterPage reg=new RegisterPage(driver);
	reg.Regs(emailId,Firstname,Lastname,Spassword);
}
}
