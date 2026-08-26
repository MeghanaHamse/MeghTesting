package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Exwait;
import Utils.Scrolldown;

public class ProfilePage {
	WebDriver driver;
public ProfilePage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//p[normalize-space()='Profile']")
WebElement ProfileM;


@FindBy(xpath="//input[@id='public-nickname']")
WebElement NickName;

@FindBy(xpath="//div[@id='section-certificates']//span[@class='chakra-switch__track css-stuqe4']")
WebElement Certificate;

@FindBy(xpath="//div[@id='section-spaces']//div[@class='css-108b6b1']//span[@class='chakra-switch__track css-stuqe4']")
WebElement Profile;

@FindBy(xpath="//input[@placeholder='First Name']")
WebElement FirstName;

@FindBy(xpath="//input[@placeholder='Last Name']")
WebElement LastName;

//@FindBy(xpath="//button[@class='chakra-button css-1kt4yns']")
//WebElement button;

public void Prof(String firstN,String LastN) throws InterruptedException
{	
	Thread.sleep(4000);
	ProfileM.click();
	Scrolldown sd=new Scrolldown();
	sd.scrollToElement(driver,NickName) ;
	Thread.sleep(5000);
	NickName.sendKeys("macko");
	Thread.sleep(5000);
	Certificate.click();
	Profile.click();
	Thread.sleep(5000);
	//Scrolldown sd=new Scrolldown();
	/*sd.scrollToElement(driver,FirstName) ;
	FirstName.sendKeys(firstN);
	LastName.sendKeys(LastN);
	*/
	Thread.sleep(5000);
	//sd.scrollToElement(driver,button);
	//button.click();
	//Exwait ewait=new Exwait();
	//ewait.clickWhenClickable(driver, button);
}
}
