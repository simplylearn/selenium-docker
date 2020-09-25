package gridtest;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Launchbrowser extends BaseTest {
	
	
//	public RemoteWebDriver driver;
	
	static String s ="https://www.google.com";
	

//	@BeforeTest
//	public void before() throws MalformedURLException {
//		
//		DesiredCapabilities cap =  DesiredCapabilities.firefox();
//		
//		cap.setBrowserName("firefox");
//		
//		driver = new RemoteWebDriver(new URL("http://172.22.0.1:4444/wd/hub"),cap);	
//		
//	}

	@Test(invocationCount=3)
	public void test() throws InterruptedException {
		
		driver.get(s);
		Thread.sleep(1500);
		System.out.println("page title is ;; "+driver.getTitle());
	}
	
//	@AfterClass
//	public void after() {
//		driver.quit();
//	}
//	
	
	
	
}
