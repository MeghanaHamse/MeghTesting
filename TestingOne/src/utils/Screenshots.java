package utils;

	import org.openqa.selenium.*;
	import java.io.File;
	import org.apache.commons.io.FileUtils;

	public class Screenshots {

	    public static String captureScreenshot(WebDriver driver, String testName) {
	        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        String path = "screenshots/" + testName + ".png";

	        try {
	            FileUtils.copyFile(src, new File(path));
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        return path;
	    }
	}

