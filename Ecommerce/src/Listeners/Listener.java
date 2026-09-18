
	package Listeners;
	
	import java.io.ByteArrayInputStream;

	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.testng.ITestListener;
	import org.testng.ITestResult;

	import Base.BaseTest;
import Utility.ScreenShot;
import io.qameta.allure.Allure;

	public class Listener implements ITestListener {

	    @Override
	    public void onTestFailure(ITestResult result) {
	    
	    	    try {
	    	      
	    	    	WebDriver driver = ((BaseTest) result.getInstance()).driver;

	    	        ScreenShot.getScreenshot(
	    	                result.getMethod().getMethodName(),
	    	                driver);

	    	    } catch (Exception e) {
	    	        e.printStackTrace();
	    	    }}}
	    	
/*
	        Object currentClass = result.getInstance();

	        WebDriver driver =
	                ((BaseTest) currentClass).getDriver();

	        if (driver != null) {

	            byte[] screenshot =
	                    ((TakesScreenshot) driver)
	                            .getScreenshotAs(OutputType.BYTES);

	            Allure.addAttachment(
	                    "Failure Screenshot",
	                    "image/png",
	                    new ByteArrayInputStream(screenshot),
	                    ".png"
	            );
	        }
	    }
	}
*/



