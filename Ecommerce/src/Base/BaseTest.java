package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseTest {

    
    public WebDriver driver;
    @Parameters("browser")
    @BeforeClass(alwaysRun=true)
    public void setup(String browser) throws IOException {
    	Properties prop = new Properties();

         FileInputStream fis = new FileInputStream(
                 "C:\\Users\\MEGHANR\\prodg\\Prodg\\s3\\s4\\s5\\Ecommerce\\src\\TestData\\config.properties");
         prop.load(fis);  
         String Url=prop.getProperty("url");
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("Edge"))
        {
        	driver= new EdgeDriver();
        }
        else if(browser.equalsIgnoreCase("Firefox"))
        {
        	driver= new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(Url);
    }
    @AfterClass(alwaysRun=true)
    public void teardown()
    {
    	if(driver!=null)
    	{
    		driver.close();
    	}
    }
	public WebDriver getDriver() {
		// TODO Auto-generated method stub
		return driver;
	}
}