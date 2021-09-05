package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class scrolling extends BaseClass
{
	@SuppressWarnings("rawtypes")
	public static void scrollDown()
	{
		Dimension dimension = AppDriver.getDriver().manage().window().getSize();
		int scrollStart = (int) (dimension.getHeight() * 0.8);
		int scrollEnd = (int) (dimension.getHeight() * 0.2);
		
		new TouchAction((PerformsTouchActions) AppDriver.getDriver())
		.press(PointOption.point(0, scrollStart))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
		.moveTo(PointOption.point(0, scrollEnd))
		.release().perform();
	}
	
	@SuppressWarnings("rawtypes")
	public static void scrollDownShort()
	{
		Dimension dimension = AppDriver.getDriver().manage().window().getSize();
		int scrollStart = (int) (dimension.getHeight() * 0.7);
		int scrollEnd = (int) (dimension.getHeight() * 0.2);
		
		new TouchAction((PerformsTouchActions) AppDriver.getDriver())
		.press(PointOption.point(0, scrollStart))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
		.moveTo(PointOption.point(0, scrollEnd))
		.release().perform();
	}

	
	public static void scrollUp()
	{
		Dimension dimension = AppDriver.getDriver().manage().window().getSize();
		int scrollStart = (int) (dimension.getHeight() * 0.2);
		int scrollEnd = (int) (dimension.getHeight() * 0.7);
		
		new TouchAction((PerformsTouchActions) AppDriver.getDriver())
		.press(PointOption.point(0, scrollStart))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
		.moveTo(PointOption.point(0, scrollEnd))
		.release().perform();
	}
	
	public static void scrollRight()
	{
		Dimension dimension = AppDriver.getDriver().manage().window().getSize();
		int scrollStart = (int) (dimension.getWidth() * 0.8);
		int scrollEnd = (int) (dimension.getWidth() * 0.3);
		
		new TouchAction((PerformsTouchActions) AppDriver.getDriver())
		.press(PointOption.point(scrollStart, (int) (dimension.getHeight() * 0.7)))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
		.moveTo(PointOption.point(scrollEnd,  (int) (dimension.getHeight() * 0.7)))
		.release().perform();
	}
	
	public static void toText(String text) throws Exception
	{
		for(int scroll=1; scroll<=15; scroll++)
		{
			
			try 
			{
				if(driver.findElement(By.xpath("//*[@text=\""+text+"\"]")).isDisplayed())
				{
					break;
				}
			} 
			catch (Exception e) 
			{
				scrollDown();
			}
		} Thread.sleep(500);
	}
	
	public static void toPartialText(String partialText) throws Exception
	{
		for(int scroll=1; scroll<=15; scroll++)
		{
			
			try 
			{
				if(driver.findElement(By.xpath("//*[contains(@text,"+"'"+partialText+"'"+")]")).isDisplayed())
				//if(driver.findElement("//*[contains(@text,'Blood')]")).isDisplayed())
				{
					break;
				}
			} 
			catch (Exception e) 
			{
				scrollDown();
			}
		} Thread.sleep(500);
	}
	
	public static void toID(String ID) throws Exception
	{
		for(int scroll=1; scroll<=15; scroll++)
		{
			
			try 
			{
				if(driver.findElement(By.id(ID)).isDisplayed())
				{
					break;
				}
			} 
			catch (Exception e) 
			{
				scrollDown();
			}
		} Thread.sleep(500);
	}
	
	public static void toElement(WebElement element) throws Exception
	{
		for(int scroll=1; scroll<=15; scroll++)
		{
			
			try 
			{
				if(element.isDisplayed())
				{
					break;
				}
			} 
			catch (Exception e) 
			{
				scrollDown();
			}
		} Thread.sleep(500);
	}
	
}
