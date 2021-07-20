package com.automation.appium.AppiumAutomation;
 

public class Appconstants
{

     public static  String appPackage="io.appium.android.apis";
     public static  String appActivity="io.appium.android.apis.ApiDemos";
     public static  String device="Redmi 7A";
     public static  String udId="0a58b8ba0206";
     public static  String platformName="Android";
     public static  String platformVersion="10";
     public static  String unlockType="pin";
     public static  String unlockKey="0852";
     public static  String browserName="Chrome";
     public static  String ignoreHiddenApiPolicyError="true";  //public static  String ignoreHiddenApiPolicyError="false";
     public static  String adbExecTimeout="10000"; 
     public static final boolean no_fullReset = true; //public static final boolean no_fullReset = false;
     
 	 public static final boolean fullReset = true;
 	 //public static final boolean fullReset = false;
     /**
      * ChromDriver :  chromebrowser version should match with chromedriver , to 
      * do this we have to cross check the versions both before launching chrome browser 
      * for this machine path of the driver is ->
      * C:\Users\Sachin\AppData\Roaming\npm\node_modules\appium\node_modules\appium-chromedriver\chromedriver\win
      */
 	 
 	 // To accept all permission from device : true , if not make it as false
 	 public static final String autoGrantPermissions="true";
 	// public static final String autoGrantPermissions="false";
     
     
     
     
     
}
