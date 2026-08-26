package Utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Exwait {
	
public static void Ewait(WebDriver driver,WebElement ele)
{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
	wait.until(ExpectedConditions.visibilityOf(ele));
}

public static void clickWhenClickable(WebDriver driver, WebElement button) {
	// TODO Auto-generated method stub
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement element = wait.until(
	ExpectedConditions.elementToBeClickable(button));
	element.click();
}
}
