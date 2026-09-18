package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.ExplicitW;

public class LoginPage {
	WebDriver driver;
public LoginPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//input[@id='userEmail']") 
WebElement username;

@FindBy(xpath="//input[@id='userPassword']")
WebElement Password;

@FindBy(xpath="//input[@id='login']")
WebElement LoginButton;

@FindBy(xpath="//div[@id='toast-container']")
WebElement LoginError;

public void Login(String Uname,String password)
{
	username.sendKeys(Uname);
	Password.sendKeys(password);
	LoginButton.click();
}
public WebElement correctLogin()
{
	
	WebElement name=driver.findElement(
            By.xpath("//p[normalize-space()='Automation Practice']"));
	ExplicitW Ewait=new ExplicitW();
	Ewait.ExplicitlyWait( driver,name);
	return name;
}
public String ErrorMsg()
{
	ExplicitW Ewait=new ExplicitW();
	Ewait.ExplicitlyWait( driver,LoginError);
	return LoginError.getText();
}       
public String EmptyField() {

    String errormsg = driver.findElement(
            By.xpath("/html/body/app-root/app-login/div[1]/section[2]/div/div[2]/form/div[1]/div"))
            .getText();

    String errorpwd = driver.findElement(
            By.xpath("/html/body/app-root/app-login/div[1]/section[2]/div/div[2]/form/div[2]/div/div"))
            .getText();

    return errormsg + " | " + errorpwd;
}

public String EmptyUser()
{
	String errormsg = driver.findElement(
            By.xpath("/html/body/app-root/app-login/div[1]/section[2]/div/div[2]/form/div[1]/div"))
            .getText();
	return errormsg;
}

public String Emptypassword()
{
	 String errorpwd = driver.findElement(
	            By.xpath("/html/body/app-root/app-login/div[1]/section[2]/div/div[2]/form/div[2]/div/div"))
	            .getText();

	    return errorpwd;
}
}