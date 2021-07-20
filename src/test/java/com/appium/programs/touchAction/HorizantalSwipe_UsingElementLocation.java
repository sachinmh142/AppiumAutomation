package com.appium.programs.touchAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automation.appium.AppiumAutomation.AppUtils;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class HorizantalSwipe_UsingElementLocation extends AppUtils
{ 
	@Test
	public void horizantalSwipe_UsingElementLocation() throws InterruptedException
	{

		
		String views="//android.widget.TextView[@content-desc='Views']";	
		verticalSwipe_FindandClickLocator(views);
		
		String Gallery="//android.widget.TextView[@content-desc='Gallery']";	
		verticalSwipe_FindandClickLocator(Gallery);
		
		String Photos="//android.widget.TextView[@content-desc='1. Photos']";	
		verticalSwipe_FindandClickLocator(Photos);
		
		Thread.sleep(5000);
		String gallery="io.appium.android.apis:id/gallery";
		WebElement galleryElement = driver.findElement(By.id(gallery));
		
		//Here user first getting element width , height 
	     
		 int width1=(int) ((int )(galleryElement.getLocation().getX())+(galleryElement.getSize().getWidth()*0.8));
		 System.out.println(galleryElement.getLocation().getX());
		 System.out.println(galleryElement.getSize().getWidth()*0.8);
		 System.out.println("***********************************************");
		 int width2=(int) ((int )(galleryElement.getLocation().getX())+(galleryElement.getSize().getWidth()*0.1));
		 System.out.println(galleryElement.getLocation().getX());
		 System.out.println(galleryElement.getSize().getWidth()*0.1);
		 System.out.println("***********************************************");
		 int height=(int) ((int )(galleryElement.getLocation().getY())+(galleryElement.getSize().getHeight()*0.5));
		 System.out.println(galleryElement.getLocation().getY());
		 System.out.println(galleryElement.getSize().getHeight()*0.5);
		 System.out.println("***********************************************");
		 
		 TouchAction action=new TouchAction(driver);
		      action.press(PointOption.point(width1,height))
			.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
			.moveTo(PointOption.point(width2, height))
			.release().perform();
		
		
		
	}
}
