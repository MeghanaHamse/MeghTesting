package Tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.BaseTest;
import Listeners.Retry;
import Pages.HomePage;
import Pages.LoginPage;
import Utility.DataP;
import Utility.ExcelUtility;

public class HomeTest extends BaseTest {
	
	//EXCELpackage TestData;


    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {

        return ExcelUtility.readExcelData("Sheet1");
    }

		
	@Test(priority=1,retryAnalyzer=Retry.class,dataProvider="loginData")
public void addTocart(String email,String password) throws IOException
{
	LoginPage login=new LoginPage(driver);  
	login.Login(email,password);
	HomePage hp=new HomePage(driver);
	hp.AddTocart("ADIDAS ORIGINAL");
//	hp.AddTocart("ZARA COAT 3");	
	//Assert.assertEquals(name, "Product Added To Cart");
	hp.CheckCart();
	
}
}	/*
	 //DATAPROVIDER
	 
	@Test(dependsOnMethods="addTocart",dataProvider="locals",dataProviderClass=DataP.class)
	public void buy(String name1,String country,String cv) throws InterruptedException
	{
		//addTocart();
		HomePage hp=new HomePage(driver);
		String name=hp.Buyproducts( name1,country,cv );
		Assert.assertEquals(name, "THANKYOU FOR THE ORDER.");
	}
	
/*	@Test(dependsOnMethods="addTocart")
	public void emptyCart()
	{
		HomePage hp=new HomePage(driver);
		String name=hp.Emptycart();
		Assert.assertEquals(name, "No Products in Your Cart !");
	}
	*/
