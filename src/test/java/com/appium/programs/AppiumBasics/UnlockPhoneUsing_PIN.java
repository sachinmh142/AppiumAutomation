package com.appium.programs.AppiumBasics;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.automation.appium.AppiumAutomation.Appconstants;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class UnlockPhoneUsing_PIN 
{
	  @Test
			public void unlockUsingPIN() throws MalformedURLException
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
				desiredCaps.setCapability("unlockType", Appconstants.unlockType);
				desiredCaps.setCapability("unlockKey", Appconstants.unlockKey);
				driver=new AppiumDriver<WebElement>(service.getUrl(),desiredCaps);
				 
			}
}
