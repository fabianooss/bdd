package bdd.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
	
	private static WebDriver driver = null;
	
	
	public static WebDriver get() {
		if (driver == null) {
			System.setProperty("webdriver.gecko.driver", "c:/temp/geckodriver.exe");
			driver = new FirefoxDriver();
			
/*			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setJavascriptEnabled(true);                
			caps.setCapability("takesScreenshot", true);  
			caps.setCapability(
			                        PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
			                        "S://phantomjs-2.1.1-windows/bin/phantomjs.exe"
			                    );
			driver = new PhantomJSDriver(caps); */
			driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);	
		}
		return driver;
	}
	
	public static void close() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
	
	

}
