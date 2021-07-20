package com.appium.programs.touchAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.automation.appium.AppiumAutomation.AppUtils;
import com.appium.programs.Pages.HomePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

/**
 * @author Sachin
 * It's always not recommended to use tap/click directly using co-ordinate  
 * because ,  x and y co-ordinates will get change based on screen size
 */


public class TapUsingCoordinates_HardCodedcoordinates extends AppUtils
{
 
	 

	@Test
	 public void tapUsingCoordinates() throws InterruptedException 
	{
 
	 
	Thread.sleep(5000);
	
	  
	int x=	183;
	int y=	225;
	System.out.println(x);
	System.out.println(y);
	new TouchAction(driver).tap(PointOption.point(x,y))
	.release()
	.perform();
		
	 
	
	
	}
}
