package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	protected WebDriver driver;
	@BeforeClass
	public void setup()
	{
		 WebDriverManager.chromedriver().setup();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.w3schools.com");
}
	 @AfterClass
     public void tearDown() {
         if (driver != null) {
             driver.quit();
         }
     }}
