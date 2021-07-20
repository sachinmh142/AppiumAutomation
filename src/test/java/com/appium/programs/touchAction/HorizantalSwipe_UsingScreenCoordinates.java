package com.appium.programs.touchAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automation.appium.AppiumAutomation.AppUtils;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class HorizantalSwipe_UsingScreenCoordinates extends AppUtils
{
 
	@Test
	public void horizantalSwipe() throws InterruptedException
	{
		
		int height=driver.manage().window().getSize().getHeight();
		System.out.println(height);
		int width=driver.manage().window().getSize().getWidth();
		System.out.println(width);
		
		
		String views="//android.widget.TextView[@content-desc='Views']";	
		verticalSwipe_FindandClickLocator(views);
		
		String Gallery="//android.widget.TextView[@content-desc='Gallery']";	
		verticalSwipe_FindandClickLocator(Gallery);
		
		String Photos="//android.widget.TextView[@content-desc='1. Photos']";	
		verticalSwipe_FindandClickLocator(Photos);
		 
		TouchAction action=new TouchAction(driver);
		
		int fixedHeight=(int) (height*0.193452);
		System.out.println(fixedHeight);
		int startwPoint=(int) (width*0.8458);
		int endwPoint=(int) (width*0.13888);
		System.out.println(startwPoint);
		System.out.println(endwPoint);
		action.press(PointOption.point(startwPoint,fixedHeight))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
		.moveTo(PointOption.point(endwPoint, fixedHeight))
		.release().perform();
		
		
		
		
		
	}
}
