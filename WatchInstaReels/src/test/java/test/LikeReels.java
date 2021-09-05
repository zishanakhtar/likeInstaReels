package test;

import org.openqa.selenium.*;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

import org.apache.logging.log4j.*;

public class LikeReels extends BaseClass
{
	Logger logger = LogManager.getLogger(this.getClass());
	
	@SuppressWarnings("rawtypes")
	@Test
	public void likeReels() throws Exception
	{	
		Waiting.withPartialText("Log", 20);
		driver.findElement(By.id("com.instagram.android:id/log_in_button")).click();
		Thread.sleep(1500);
		driver.findElement(By.id("login_username")).sendKeys("username"); //Your Insta username 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@text=\"Password\"]")).sendKeys("Abcd@1234"); //Your Insta password
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@text=\"Log In\"]")).click();
		
		try
		{
			Waiting.withID("android:id/autofill_save_no", 5);
			driver.findElement(By.id("android:id/autofill_save_no")).click();
		} catch (Exception e)
		{
			logger.info("No Google popup appeared");
		}
		
		Waiting.withID("com.instagram.android:id/search_tab", 10);
		driver.findElement(By.id("com.instagram.android:id/search_tab")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("com.instagram.android:id/image_preview")).click();
		Thread.sleep(2000);
	
		Dimension dimension = AppDriver.getDriver().manage().window().getSize();
		int x = (int) (dimension.getWidth() * 0.5);
		int y = (int) (dimension.getHeight() * 0.5);
		
		int noOfReelsLiked = 1;
		while(true) //Infinite loop of watching and liking reel
		{
			logger.info("Playing reel: " + noOfReelsLiked);
			Thread.sleep(10000); //Play a reel for 10 seconds
			new TouchAction(driver).press(PointOption.point(x,y)).release().perform().waitAction().press(PointOption.point(x,y)).release().perform();
			logger.info("Number of reels liked: " + noOfReelsLiked);
			scrolling.scrollDown();
			noOfReelsLiked++;
		}
		
	}
	
}
