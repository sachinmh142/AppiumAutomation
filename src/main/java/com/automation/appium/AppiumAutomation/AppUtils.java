package com.automation.appium.AppiumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.SessionId;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class AppUtils 
{
	public AppiumDriver driver;
	public AppiumDriverLocalService service;
	
	@BeforeMethod
    public AppiumDriver startServer() throws InterruptedException 
	{

		service=AppiumDriverLocalService.buildDefaultService();
		if(service.isRunning()==true)
		{
			service.stop();
			System.out.println("stop");

		} 
		Thread.sleep(5000);
		service.start();
		DesiredCapabilities desiredCaps=new DesiredCapabilities();
		desiredCaps.setCapability("appPackage", Appconstants.appPackage);
		desiredCaps.setCapability("appActivity", Appconstants.appActivity);
		desiredCaps.setCapability("deviceName", Appconstants.device);
		desiredCaps.setCapability("udid", Appconstants.udId);
		desiredCaps.setCapability("platformName", Appconstants.platformName);
		desiredCaps.setCapability("platformVersion", Appconstants.platformVersion);
		desiredCaps.setCapability("unlockType", Appconstants.unlockType);
		desiredCaps.setCapability("unlockKey", Appconstants.unlockKey);
		desiredCaps.setCapability("adbExecTimeout", Appconstants.adbExecTimeout);
		desiredCaps.setCapability("ignoreHiddenApiPolicyError", Appconstants.ignoreHiddenApiPolicyError);
		driver=new AppiumDriver<WebElement>(service.getUrl(),desiredCaps);



		SessionId sessionid = driver.getSessionId();
		System.out.println(sessionid);

		return driver;
	}

	@AfterMethod
	public void stopServer()
	{
		service.stop(); 
	}

	public void verticalSwipeDown(double StartPoint , double EndPoint)
	{
		try
		{
			int screenHeight = driver.manage().window().getSize().getHeight();
			int screenWidth = driver.manage().window().getSize().getWidth();

			//Used for horizantal point 
			int widthPoint=(int) (screenWidth/2);

			//Start Point
			int startPoint=(int)(screenHeight*StartPoint);
			int endPoint=(int)(screenHeight*EndPoint);

			new	TouchAction(driver)
			.press(PointOption.point(widthPoint,startPoint))
			.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
			.moveTo(PointOption.point(widthPoint, endPoint))
			.release()
			.perform(); 
		}catch(Exception e)
		{

		}
	}

	public void verticalSwipeUp(double StartPoint , double EndPoint)
	{
		try
		{
			int screenHeight = driver.manage().window().getSize().getHeight();
			int screenWidth = driver.manage().window().getSize().getWidth();

			//Used for horizantal point 
			int widthPoint=(int) (screenWidth/2);

			//Start Point
			int startPoint=(int)(screenHeight*StartPoint);
			int endPoint=(int)(screenHeight*EndPoint);

			new	TouchAction(driver)
			.press(PointOption.point(widthPoint,endPoint))
			.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
			.moveTo(PointOption.point(widthPoint,startPoint ))
			.release()
			.perform(); 
		}catch(Exception e)
		{

		}
	}

	public void verticalSwipe_TillElementFound(String xpath) throws InterruptedException 
	{

		int screenHeight = driver.manage().window().getSize().getHeight();
		int screenWidth = driver.manage().window().getSize().getWidth();
        //Used for horizantal point 
		int widthPoint=(int) (screenWidth/2);

		//Start Point
		int startPoint=(int)(screenHeight*0.8);
		int endPoint=(int)(screenHeight*0.2);

		for(int i=0;i<200;i++)	
		{
			try 
			{
				Thread.sleep(5000);
				if(driver.findElement(By.xpath(xpath)).isDisplayed());
				System.out.println("Tab Element Found");
				break;
			} catch (Exception e) 
			{
				new	TouchAction(driver)
				.press(PointOption.point(widthPoint,startPoint ))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
				.moveTo(PointOption.point(widthPoint, endPoint))
				.release()
				.perform();
			}
		}


	}

	public void verticalSwipe_FindandClickLocator(String xpath) throws InterruptedException 
	{

		int screenHeight = driver.manage().window().getSize().getHeight();
		int screenWidth = driver.manage().window().getSize().getWidth();
        //Used for horizantal point 
		int widthPoint=(int) (screenWidth/2);

		//Start Point
		int startPoint=(int)(screenHeight*0.8);
		int endPoint=(int)(screenHeight*0.2);

		for(int i=0;i<200;i++)	
		{
			try 
			{
				Thread.sleep(5000);
				if(driver.findElement(By.xpath(xpath)).isDisplayed());
				System.out.println("Tab Element Found");
				driver.findElement(By.xpath(xpath)).click();;
				break;
			} catch (Exception e) 
			{
				new	TouchAction(driver)
				.press(PointOption.point(widthPoint,startPoint ))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
				.moveTo(PointOption.point(widthPoint, endPoint))
				.release()
				.perform();
			}
		}


	}


	public void verticalSwipe_FindandClickWebElement(WebElement xpath) throws InterruptedException 
	{

		int screenHeight = driver.manage().window().getSize().getHeight();
		int screenWidth = driver.manage().window().getSize().getWidth();
        //Used for horizantal point 
		int widthPoint=(int) (screenWidth/2);

		//Start Point
		int startPoint=(int)(screenHeight*0.8);
		int endPoint=(int)(screenHeight*0.2);

		for(int i=0;i<200;i++)	
		{
			try 
			{
				Thread.sleep(5000);
				if(xpath.isDisplayed());
				System.out.println("Tab Element Found");
				xpath.click();;
				break;
			} catch (Exception e) 
			{
				new	TouchAction(driver)
				.press(PointOption.point(widthPoint,startPoint ))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
				.moveTo(PointOption.point(widthPoint, endPoint))
				.release()
				.perform();
			}
		}


	}

}
