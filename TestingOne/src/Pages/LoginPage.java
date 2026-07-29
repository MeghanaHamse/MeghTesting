package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriver driver;
public LoginPage(WebDriver driver)
{
	this.driver=driver;
}
By Signin=By.xpath("//button[@type='submit']");
By loginButton=By.xpath("//div[@id='tnb-login-btn']//span[@class='button-text'][normalize-space()='Sign In']");
By loginId=By.xpath("//input[@id='tnb-login-dropdown-email']");
By passwrd=By.xpath("//input[@id='tnb-login-dropdown-password']");
public void login(String username,String password)
{
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 driver.findElement(loginButton).click();
	 wait.until(ExpectedConditions.visibilityOfElementLocated( loginId));
	driver.findElement(loginId).sendKeys(username);
	 wait.until(ExpectedConditions.visibilityOfElementLocated( passwrd));
	driver.findElement(passwrd).sendKeys(password);
	driver.findElement(Signin).click();
}
}
