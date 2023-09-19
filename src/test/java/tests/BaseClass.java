package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

@SuppressWarnings("unused")
public class BaseClass {
	
	static AppiumDriver driver;
	
	
	@BeforeTest
	public static void setup() {
		
		try {
			
			DesiredCapabilities caps = new DesiredCapabilities();
			
			caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "S22 Ultra");        
			caps.setCapability(MobileCapabilityType.UDID, "emulator-5554._tcp");
			caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
			caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
			//caps.setCapability(MobileCapabilityType.APP, "");
			caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
			
			//caps.setCapability("appPackage","com.android.app.popupcalculator");
			//caps.setCapability("appActivity","com.sec.android.app.popupcalculator.Calculator");
	
	        URL url = new URL("http://10.0.0.178:4723/");
	        driver = new AppiumDriver(url, caps);
	        //driver = new AndroidDriver(url, caps);
	        //driver = new IOSDriver(url, caps);
        
		}catch(Exception exp) {
			System.out.println("Cause is : "+ exp.getCause());
			System.out.println("Message is : "+exp.getMessage());
			exp.printStackTrace();
		}
	}

	@AfterTest
	public void tearDown() {
		
		//driver.close();
		//driver.quit();
		
	}

}
