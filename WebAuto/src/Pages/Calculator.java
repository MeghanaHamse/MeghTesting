package Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.Exwait;
import Utils.Scrolldown;

public class Calculator {
	WebDriver driver;
	public Calculator(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy(xpath="//button[text()='Create Space']")
	//WebElement createspace;
		
	@FindBy(xpath="//iframe[@title='Simple Calculator']")
	WebElement iframe;
	
	@FindBy(xpath="//p[text()='Simple Calculator']")
	WebElement calculator;
	
	@FindBy(xpath="//button[normalize-space()='2']")
	WebElement NumTwo;
	
	@FindBy(xpath="//button[normalize-space()='+']")
	WebElement NumPlus;
	
	@FindBy(xpath="//button[normalize-space()='8']")
	WebElement NumEight;
	
	@FindBy(xpath="//button[normalize-space()='=']")
	WebElement NumEqual;
	
	public void calc() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(
		    By.xpath("//button[text()='Create Space']"))).click();
		calculator.click();
		driver.switchTo().frame(iframe);
		NumTwo.click();
		NumPlus.click();
		NumEight.click();
		NumEqual.click();
		driver.switchTo().defaultContent();
	    List<WebElement> closeButtons =
	    		driver.findElements(By.xpath("//button[@aria-label='Close']"));
	    		for(WebElement btn : closeButtons) {
	    		    if(btn.isDisplayed()) {
	    		        btn.click();
	    		        break;
	    		    }
	    		}	
	Thread.sleep(3000);
}}
