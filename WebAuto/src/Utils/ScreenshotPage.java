package Utils;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import io.qameta.allure.Allure;
import java.io.ByteArrayInputStream;
public class ScreenshotPage {
	


		public class ScreenshotUtil {

		    public static byte[] takeScreenshot(WebDriver driver) {
		        return ((TakesScreenshot) driver)
		                .getScreenshotAs(OutputType.BYTES);
		    }
		}
	}

