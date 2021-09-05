package test;

import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import io.appium.java_client.AppiumDriver;
import org.apache.logging.log4j.*;

public class BaseClass
{
	static AppiumDriver<WebElement> driver;

	@BeforeSuite
	public static void openApp() throws Exception
	{
		Logger logger = LogManager.getLogger(BaseClass.class);
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Samsung M51");
		cap.setCapability("udid", "AIEJ4J2JAJDJEKNES3G");	//Change udid according to your android device
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11");
		cap.setCapability("newCommandTimeout", 60 * 5);		//prevents application from force stop

		cap.setCapability("appPackage", "com.instagram.android");
		cap.setCapability("appActivity", "com.instagram.mainactivity.MainActivity");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<WebElement>(url, cap);
		AppDriver.setDriver(driver);

		logger.info("App Started");
	}

	@AfterSuite
	public static void tearDown()
	{
		driver.quit();
	}

}
