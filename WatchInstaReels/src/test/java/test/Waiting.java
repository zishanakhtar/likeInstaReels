package test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiting extends BaseClass
{
	public static void withID (String resourceId, long time) throws Exception
	{
		WebDriverWait wait = new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(resourceId)));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(resourceId)));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(resourceId)));
		Thread.sleep(500);
	}
	
	public static void withText(String text, long time) throws Exception
	{
		WebDriverWait wait = new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text=\""+text+"\"]")));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text=\""+text+"\"]")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text=\""+text+"\"]")));
		Thread.sleep(500);
	}
	
	public static void withPartialText(String partialText, long time) throws Exception
	{
		WebDriverWait wait = new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text,"+"'"+partialText+"'"+")]")));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(@text,"+"'"+partialText+"'"+")]")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@text,"+"'"+partialText+"'"+")]")));
		Thread.sleep(500);
	}

}
