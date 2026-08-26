package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.Exwait;
import Utils.Scrolldown;

import java.time.Duration;
import java.util.List;

public class SearchP {
	WebDriver driver;
	public SearchP(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
//	@FindBy(xpath="//input[@id='tnb-google-search-input']")
//	WebElement SearchButton;
	
	//@FindBy(xpath="//a[@class='ref-box'][normalize-space()='Java Keywords']")
	//WebElement JavaK;
		
	@FindBy(xpath="//a[text()='Next ❯']")
	WebElement Home;
	
	public void SearchM() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement SearchButton = wait.until(
		    ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='tnb-google-search-input']"))
		);
	 
		   SearchButton.sendKeys("java");

		    List<WebElement> suggestions =
		    		driver.findElements(
		    		    By.xpath("//div[@id='tnb-search-suggestions']//a"));
		   // System.out.println("Count: " + suggestions.size());
		    for(WebElement suggestion : suggestions)
		    {
		    	//System.out.println("Text = [" + suggestion.getText() + "]");
		        if(suggestion.getText().equals("JavaScript Tutorial"))
		        {
		        	//System.out.println("Clicking dropdown option: " + suggestion.getText());	        	
		            suggestion.click();
		            break;
		        }
		    }
           Home.click();
		   // Exwait ewait=new Exwait();
		  //  ewait.Ewait(driver,JavaK); 
		  //  Scrolldown sc = new Scrolldown();
		  //  sc.scrollToElement(driver, JavaK);
		 
		// ewait.clickWhenClickable(driver, JavaK);
				Thread.sleep(5000); 
				driver.navigate().back();
		   // JavaK.click();
		    
		}
	}

