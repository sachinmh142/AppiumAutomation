package com.appium.programs.touchAction;

import org.testng.annotations.Test;
import com.automation.appium.AppiumAutomation.AppUtils;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;


 
 
public class Tap_Click_BasedOnResolution extends AppUtils
{
	@Test
	 public void tapUsingCoordinates() throws InterruptedException 
	{
       
		int screenHeight = driver.manage().window().getSize().getHeight();
		int screenWidth = driver.manage().window().getSize().getWidth();
		
		System.out.println(screenHeight);
		System.out.println(screenWidth);
		int clickHeight=(int)(screenHeight*0.145);
		System.out.println("clickHeight "+clickHeight);
		int clickWidth=(int)(screenWidth*0.3);
		System.out.println("clickWidth "+clickWidth);
		TouchAction action =new TouchAction(driver);
		Thread.sleep(2000);
		action.press(PointOption.point(clickWidth, clickHeight)).release().perform();
		
	
	}
}
