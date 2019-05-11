package flights;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
		private static WebDriver driver;
		
		public static WebDriver openBrowser() {
			String browsername = "chrome";
			
			if(browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
			 driver = new ChromeDriver();
			} else if(browsername.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
				 driver = new FirefoxDriver();
			}
			return driver;
		}

	}
