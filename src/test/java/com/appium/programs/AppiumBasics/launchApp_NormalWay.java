package com.appium.programs.AppiumBasics;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.automation.appium.AppiumAutomation.Appconstants;

import io.appium.java_client.AppiumDriver;

public class launchApp_NormalWay 
{
    @Test
	public void launchapp() throws MalformedURLException
	{
		DesiredCapabilities desiredCaps;
		AppiumDriver<WebElement> driver;
		 
		desiredCaps=new DesiredCapabilities();
		desiredCaps.setCapability("appPackage", Appconstants.appPackage);
		desiredCaps.setCapability("appActivity", Appconstants.appActivity);
		desiredCaps.setCapability("deviceName", Appconstants.device);
		desiredCaps.setCapability("udid", Appconstants.udId);
		desiredCaps.setCapability("platformName", Appconstants.platformName);
		desiredCaps.setCapability("platformVersion", Appconstants.platformVersion);
		 URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver=new AppiumDriver<WebElement>(url,desiredCaps);
		 String sessionId = driver.getSessionId().toString();
		System.out.println(sessionId);
		
	}
}                                                                                         
