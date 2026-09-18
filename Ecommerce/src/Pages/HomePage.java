package Pages;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Utility.ExplicitW;
import Utility.Scroll;

public class HomePage {
	WebDriver driver;
public HomePage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements( driver,this);
}

@FindBy(xpath="//div[@id='toast-container']")
WebElement CartAdded;

@FindBy(xpath="//button[@routerlink='/dashboard/cart']")
WebElement CartItem;

@FindBy(xpath="//button[normalize-space()='Buy Now']")
WebElement BuyProd;

@FindBy(xpath="//body//app-root//select[1]")
WebElement month;

@FindBy(xpath="//body//app-root//select[2]")
WebElement dated;

@FindBy(xpath="(//input[@type='text'])[3]")
WebElement CardName;

@FindBy(xpath="//input[@placeholder='Select Country']")
WebElement country;


@FindBy(xpath="(//input[@type='text'])[2]")
WebElement CVnum;

ExplicitW Ewait=new ExplicitW();

public void AddTocart(String name)
{
	//ExplicitW Ewait=new ExplicitW();
	List<WebElement> products =
	        driver.findElements(By.xpath("//div[@class='row']//div[contains(@class,'mb-3')]"));

	for(WebElement product : products)
	{
	    String productName = product.findElement(By.tagName("b")).getText();

	    if(productName.equalsIgnoreCase(name))
	    {
	    	/*  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    	  wait.until(ExpectedConditions.invisibilityOfElementLocated(
	    			  
	    			  By.id("toast-container")));
	    			  
		      wait.until(ExpectedConditions.invisibilityOfElementLocated(
		                By.cssSelector(".ng-animating")));
		                */
	        WebElement addToCartBtn =
	                product.findElement(By.xpath(".//button[contains(text(),'Add To Cart')]"));
	       

	        ((JavascriptExecutor)driver)
	                .executeScript("arguments[0].scrollIntoView(true);", addToCartBtn);
	       Ewait.ExplicitlyWait( driver, addToCartBtn) ;	        
	        addToCartBtn.click();
	    }	  	    
	}
}
public String AddedTocart()
{	
	    WebDriverWait wait =
	            new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement toast = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(
	                    By.xpath("//div[@aria-label='Product Added To Cart']")));
	
	    return toast.getText();
	}

public void CheckCart()
{ 	
	    ((JavascriptExecutor) driver)
	            .executeScript("window.scrollTo(0,0);");

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    WebElement cartBtn = wait.until(
	            ExpectedConditions.elementToBeClickable(
	                    By.xpath("//button[contains(text(),'Cart')]")));

	    cartBtn.click();
	   

	}

public String Buyproduct(String card,String countryy,String CVnumb) throws InterruptedException
{
	 List<WebElement> options =
	            driver.findElements(By.cssSelector(".cartSection"));

	    for (WebElement option : options)
	    {
	        String name =
	                option.findElement(By.tagName("h3")).getText();

	        if (name.equalsIgnoreCase("ADIDAS ORIGINAL"))
	        {
	            option.findElement(
	                    By.xpath("//button[normalize-space()='Buy Now']"))
	                    .click();

	            break;
	        }
	    }
	
	month.click();
	Select dropdown=new Select(month);
	dropdown.selectByVisibleText("05");
	dated.click();
	Select dropdown2=new Select(dated);
	dropdown.selectByVisibleText("03");
	CVnum.sendKeys(CVnumb);
	 Thread.sleep(5000);
	Scroll s=new Scroll();
	s.scrollIntoView(CardName,driver);
	CardName.sendKeys(card);
	 Thread.sleep(5000);
	 country.sendKeys( countryy);
	 List<WebElement> options1 =
	            driver.findElements(By.xpath("//div[@class='payment__shipping']//button"));
	 for (WebElement option : options1)
	    {
		 if(option.getText().equalsIgnoreCase("India"))
		 {
			 option.click();
		 }
	    }
	 driver.findElement(By.xpath("//a[normalize-space()='Place Order']")).click();
	 Thread.sleep(5000);
	 String name=driver.findElement(By.xpath("//h1[@class='hero-primary']")).getText();
	return name;
	 }
public String Buyproducts(String card,String countryy,String CVnumb) throws InterruptedException
{
	WebElement checkout=driver.findElement(By.xpath("//button[normalize-space()='Checkout']"));
	Scroll s=new Scroll();
	s.scrollIntoView(checkout,driver);
	checkout.click();
	month.click();
	Select dropdown=new Select(month);
	dropdown.selectByVisibleText("05");
	dated.click();
	Select dropdown2=new Select(dated);
	dropdown.selectByVisibleText("03");
	CVnum.sendKeys(CVnumb);
	 Thread.sleep(5000);
	
	s.scrollIntoView(CardName,driver);
	CardName.sendKeys(card);
	 Thread.sleep(5000);
	 country.sendKeys( countryy);
	 List<WebElement> options1 =
	            driver.findElements(By.xpath("//div[@class='payment__shipping']//button"));
	 for (WebElement option : options1)
	    {
		 if(option.getText().equalsIgnoreCase("India"))
		 {
			 option.click();
		 }
	    }
	 driver.findElement(By.xpath("//a[normalize-space()='Place Order']")).click();
	 Thread.sleep(5000);
	 String name=driver.findElement(By.xpath("//h1[@class='hero-primary']")).getText();
	return name;
	
}
public String Emptycart()
{
	 List<WebElement> options =
	            driver.findElements(By.cssSelector(".cartSection"));

	    for (WebElement option : options)
	    {
	        String name =
	                option.findElement(By.tagName("h3")).getText();

	        if (name.equalsIgnoreCase("ADIDAS ORIGINAL"))
	        {
	            option.findElement(
	                    By.xpath("//button[@class='btn btn-danger']"))
	                    .click();

	            break;
	        }
	    }
	String name=driver.findElement(By.xpath("//div[@class='ng-star-inserted']")).getText();
	return name;
}
}
