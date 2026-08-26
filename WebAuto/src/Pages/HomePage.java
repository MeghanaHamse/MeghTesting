package Pages;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utils.Exwait;
import Utils.ScreenshotPage;
import Utils.Scrolldown;

public class HomePage {
	WebDriver driver;
public HomePage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//button[text()='Create Space']")
WebElement createspace;

@FindBy(xpath="//p[normalize-space()='To-Do List']")
WebElement Todo;

@FindBy(xpath="//input[@id='taskInput']")
WebElement NewTask;

@FindBy(xpath="//button[@id='addBtn']")
WebElement AddP;

@FindBy(xpath="//iframe[@title='To-Do List']")
WebElement iframe;

//@FindBy(xpath="(//button[@aria-label='Close'])[1]")
//WebElement CloseP;

public void macB() throws InterruptedException
{
	Scrolldown sd=new Scrolldown();
	sd.scrollToElement(driver,createspace) ;
	Thread.sleep(2000);
	createspace.click();
	Thread.sleep(2000);
	Todo.click();		
	driver.switchTo().frame(iframe);
	AddP.click();
	driver.switchTo().alert().accept();
	//Thread.sleep(5000);
	NewTask.sendKeys("hi hello");
	//ScreenshotPage sp=new ScreenshotPage();
	//sp.takeScreenshot(driver);
	AddP.click();	
	driver.switchTo().defaultContent();
    List<WebElement> closeButtons =
    		driver.findElements(By.xpath("//button[@aria-label='Close']"));
    		for(WebElement btn : closeButtons) {
    		    if(btn.isDisplayed()) {
    		        btn.click();
    		        break;
    		    }
    		}
    		//driver.switchTo().defaultContent();
    		System.out.println(driver.getTitle());
}
}