package com.appium.programs.AppiumBasics;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.automation.appium.AppiumAutomation.Appconstants;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class LaunchApp_usingAppiumDriverLocalService 
{
	    @Test
		public void launchapp() throws MalformedURLException
		{
			DesiredCapabilities desiredCaps;
			AppiumDriver<WebElement> driver;
			AppiumDriverLocalService service;
			service=AppiumDriverLocalService.buildDefaultService();
			service.start();
			desiredCaps=new DesiredCapabilities();
			desiredCaps.setCapability("appPackage", Appconstants.appPackage);
			desiredCaps.setCapability("appActivity", Appconstants.appActivity);
			desiredCaps.setCapability("deviceName", Appconstants.device);
			desiredCaps.setCapability("udid", Appconstants.udId);
			desiredCaps.setCapability("platformName", Appconstants.platformName);
			desiredCaps.setCapability("platformVersion", Appconstants.platformVersion);
			driver=new AppiumDriver<WebElement>(service.getUrl(),desiredCaps);
			System.out.println(driver.getStatus()); 
		}
}
