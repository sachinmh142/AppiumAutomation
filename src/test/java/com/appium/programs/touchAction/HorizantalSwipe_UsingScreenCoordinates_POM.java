package com.appium.programs.touchAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.appium.programs.Pages.HomePage;
import com.automation.appium.AppiumAutomation.AppUtils;

public class HorizantalSwipe_UsingScreenCoordinates_POM extends AppUtils
{

	@Test
	public void pomExample() throws InterruptedException
	{
		
		HomePage homepage=new HomePage(driver);
		

		 
		verticalSwipe_FindandClickWebElement(homepage.views);
		
		 
		verticalSwipe_FindandClickWebElement(homepage.Gallery);
		
	 
		verticalSwipe_FindandClickWebElement(homepage.Photos);
		
		Thread.sleep(5000);
		String gallery="io.appium.android.apis:id/gallery";
		WebElement galleryElement = driver.findElement(By.id(gallery));
	}
}
