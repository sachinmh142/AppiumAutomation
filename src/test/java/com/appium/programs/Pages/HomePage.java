package com.appium.programs.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.aop.support.AopUtils;

import com.automation.appium.AppiumAutomation.AppUtils;

import io.appium.java_client.AppiumDriver;

public class HomePage extends AppUtils
{
	AppiumDriver<WebElement> driver; 
	public HomePage(AppiumDriver driver)
	{
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='Access'ibility']")
	public WebElement accessibility;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='Views']")
	public WebElement views;
	 
	 
	@FindBy(xpath="//android.widget.TextView[@content-desc='Gallery']")
	public WebElement Gallery;
	
	
	 
	@FindBy(xpath="//android.widget.TextView[@content-desc='1. Photos']")
	public WebElement Photos;
 
	
}
