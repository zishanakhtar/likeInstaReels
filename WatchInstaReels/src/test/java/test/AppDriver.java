package test;

import org.openqa.selenium.WebDriver;

public class AppDriver 
{
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	public static WebDriver getDriver()
	{
		return driver.get();
	}

	static void setDriver(WebDriver Driver)
	{	
		driver.set(Driver);	
	}
}
