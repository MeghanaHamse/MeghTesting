/*package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsP {
	
	public void hover(WebDriver driver,WebElement menu)
	{
Actions act = new Actions(driver);
act.moveToElement(menu).perform();
	
	//right click
	act.contextClick(element).perform();
	
	act.doubleClick(button).perform();
	
	WebElement source =
	        driver.findElement(By.id("source"));

	WebElement target =
	        driver.findElement(By.id("target"));

	act.dragAndDrop(source, target)
	   .perform();
	
	// sendkeys
	act.sendKeys("Hello World").perform();
}
}
*/