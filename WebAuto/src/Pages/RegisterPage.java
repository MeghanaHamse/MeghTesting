package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	WebDriver driver;
public RegisterPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//div[@id='tnb-login-btn']//span[@class='button-text'][normalize-space()='Sign In']")
WebElement Signin;
@FindBy(xpath="//a[@id='tnb-login-dropdown-signup-link']")
WebElement Register;
@FindBy(xpath="//input[@id='tnb-signup-email']")
WebElement email;
@FindBy(xpath="//input[@id='tnb-signup-first-name']")
WebElement FirstName;
@FindBy(xpath="//input[@id='tnb-signup-last-name']")
WebElement LastName;
@FindBy(xpath="//input[@id='tnb-signup-password']")
WebElement Password;
@FindBy(xpath="//button[@id='signup-toggle-password-visibility']")
WebElement Visibility;

public void Regs(String emailId,String Firstname,String Lastname,String Spassword)
{
	Signin.click();
	Register.click();
	email.sendKeys(emailId);
	FirstName.sendKeys(Firstname);
	LastName.sendKeys(Lastname);
	Password.sendKeys(Spassword);	
	Visibility.click();
}
}
