package com.appium.programs.touchAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.automation.appium.AppiumAutomation.AppUtils;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class VerticalSwipe_TillElementFound extends AppUtils
{

	 @Test
	 public void verticalSwipe_TillElementFound() throws InterruptedException 
	{
           
		int screenHeight = driver.manage().window().getSize().getHeight();
		int screenWidth = driver.manage().window().getSize().getWidth();
		
		//Used for horizantal point 
		int widthPoint=(int) (screenWidth/2);
		
		//Start Point
		int startPoint=(int)(screenHeight*0.8);
		int endPoint=(int)(screenHeight*0.2);
	
	String views="//android.widget.TextView[@content-desc='Views']";	
	Thread.sleep(5000);
	driver.findElement(By.xpath(views)).click();
	Thread.sleep(5000);
		
	 for(int i=0;i<200;i++)	
	 {
	 try 
	 {
	   
		  String tabs="//android.widget.TextView[@content-desc='Tabs']";
		    Thread.sleep(5000);
			if(driver.findElement(By.xpath(tabs)).isDisplayed());
		 
			System.out.println("Tab Element Found");
			break;
		 
		 
	 } catch (Exception e) {
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
