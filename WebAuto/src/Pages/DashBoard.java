package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoard {
	WebDriver driver;
public DashBoard(WebDriver driver)
{
	this.driver=driver;
}
@FindBy(xpath="//a[@id='navbtn_tutorials']")
WebElement Tutorial;

public void prefere()
{
	Tutorial.click();
}
}
