package Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scrolldown {
	
	public static void scrollToBottomSlowly(WebDriver driver) {

	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    long pageHeight = (Long) js.executeScript(
	            "return document.body.scrollHeight");

	    for (int i = 0; i < pageHeight; i += 200) {
	        js.executeScript("window.scrollBy(0, 200)");
	        try {
	            Thread.sleep(300); // wait 300ms between scrolls
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	        }
	    }
	}

	
	public void scrollToElement(WebDriver driver, WebElement element) {		
		

		    System.out.println("Driver: " + driver);

		    JavascriptExecutor js = (JavascriptExecutor) driver;

		    System.out.println("JS: " + js);

		    js.executeScript("arguments[0].scrollIntoView(true);", element);
		}
	
}
