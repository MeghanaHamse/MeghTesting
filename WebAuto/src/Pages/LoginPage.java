package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utils.Scrolldown;

public class LoginPage {
	WebDriver driver;
public LoginPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//div[@id='tnb-login-btn']//span[@class='button-text'][normalize-space()='Sign In']")
WebElement Signin;

@FindBy(xpath="//input[@id='tnb-login-dropdown-email']")
WebElement email;

@FindBy(xpath="//input[@id='tnb-login-dropdown-password']")
WebElement password;

@FindBy(xpath="//form[@id='loginFormElement']//button[@type='submit']")
WebElement submit;

@FindBy(xpath="//button[@id='toggle-password-visibility']")
WebElement visibility;

//@FindBy(xpath="//div[@id='loginStatus")
//WebElement errorM;

public void loginP(String Email,String Password) throws InterruptedException
{
	
	Signin.click();
	email.sendKeys(Email);
	password.sendKeys(Password);
	submit.click();
	visibility.click();
	Thread.sleep(5000);
	//String actualError = errorM.getText();
	List<WebElement> loginStatus =
	        driver.findElements(By.xpath("//div[@id='loginStatus']"));

	if (!loginStatus.isEmpty() && loginStatus.get(0).isDisplayed()) {
	    Assert.fail("Login failed due to invalid password.");
	}
	
}
}
