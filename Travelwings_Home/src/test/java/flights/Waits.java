package flights;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	
	public static void ewait(WebDriver driver, WebElement element) {
		WebDriverWait wait= new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	
}
