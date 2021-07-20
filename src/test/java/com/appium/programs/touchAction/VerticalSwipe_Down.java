package com.appium.programs.touchAction;

import java.time.Duration;

import org.testng.annotations.Test;
import com.automation.appium.AppiumAutomation.AppUtils;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class VerticalSwipe_Down extends AppUtils
{
	
	@Test
	 public void verticalSwipe_Down() throws InterruptedException 
	{
             
		int screenHeight = driver.manage().window().getSize().getHeight();
		int screenWidth = driver.manage().window().getSize().getWidth();
		
		//Used for horizantal point 
		int widthPoint=(int) (screenWidth/2);
		
		//Start Point
		int startPoint=(int)(screenHeight*0.8);
		int endPoint=(int)(screenHeight*0.2);
		
	 new	TouchAction(driver)
	.press(PointOption.point(widthPoint,startPoint))
	.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
	.moveTo(PointOption.point(widthPoint, endPoint))
	.release()
	.perform();
		
		
	}

}
