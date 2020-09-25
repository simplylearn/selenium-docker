package gridtest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Node2 extends BaseTest{

	
	//https://www.youtube.com/watch?v=kAvzKA9wsbo
	
//	WebDriver driver;
	
	
	@Test
	public void testnode2() throws MalformedURLException {
		
//		String host ="localhost";
//		DesiredCapabilities cap =  DesiredCapabilities.chrome();
		
//		cap.setBrowserName("chrome");
//		ChromeOptions option = new ChromeOptions();
//		FirefoxOptions option = new FirefoxOptions();
		
		
//		if(System.getProperty("HUB_HOST") != null) {
//			host = System.getProperty("HUB_HOST");
//		}
//		
//		String newurl = "http://" + host+":4444/wd/hub";
//		
//		driver = new RemoteWebDriver(new URL(newurl),option);
		
		
//		driver = new RemoteWebDriver(new URL("http://172.22.0.1:4444/wd/hub"),option);
		
		
		
		
		driver.get("https://www.yatra.com");
		
		System.out.println("page title is ;; "+driver.getTitle());
		
		
	}
	
	

//	@AfterClass
//	public void after() {
//		driver.quit();
//	}
}
