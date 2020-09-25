package gridtest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	
	protected WebDriver driver;

	@BeforeTest
	public void before() throws MalformedURLException {
		


		String host ="localhost";
		if(System.getProperty("HUB_HOST") != null) {
			host = System.getProperty("HUB_HOST");
		}
		
		String newurl = "http://" + host+":4444/wd/hub";
		

		
		if(System.getProperty("BROWSER")!= null 
				&& System.getProperty("BROWSER").equalsIgnoreCase("firefox")) {
//			ChromeOptions option = new ChromeOptions();
			FirefoxOptions option = new FirefoxOptions();
			driver = new RemoteWebDriver(new URL(newurl),option);
		}
		
		else
		{
			ChromeOptions option = new ChromeOptions();
			driver = new RemoteWebDriver(new URL(newurl),option);
		}
		
//		if(System.getProperty("BROWSER")!= null 
//				&& System.getProperty("BROWSER").equalsIgnoreCase("chrome"))
		
		
//		else {
//			FirefoxOptions option = new FirefoxOptions();
//			driver = new RemoteWebDriver(new URL(newurl),option);
//		}
		
//		if(System.getProperty("HUB_HOST") != null) {
//			host = System.getProperty("HUB_HOST");
//		}
//		
//		String newurl = "http://" + host+":4444/wd/hub";
//		
//		driver = new RemoteWebDriver(new URL(newurl),option);
//		
		
//		
//		driver = new RemoteWebDriver(new URL("http://172.22.0.1:4444/wd/hub"),cap);
//	
//		  System.out.println(" at setup");
//		  System.setProperty("webdriver.gecko.driver", "/home/nirupam/Documents/geckodriver/geckodriver");
//		  driver = new FirefoxDriver();
		
	}
	

	@AfterTest
	public void after() {
		driver.quit();
	}
	
	
	
	
}
