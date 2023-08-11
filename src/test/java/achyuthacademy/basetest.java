package achyuthacademy;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class basetest {
	
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	boolean canScrollMore;
	@BeforeClass
	public void configure() throws MalformedURLException {

		service = new AppiumServiceBuilder()
				.withAppiumJS(new File("C://Users//DELL//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();                    				                   			
		service.start();
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("avd3");
		options.setApp("C:\\Users\\DELL\\eclipse-workspace\\tests\\src\\test\\java\\resources\\ApiDemos-debug.apk");
		//  we are running or device we are creating android object
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
		System.out.println("driver value after object creation="+driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	//Appium github Gestures(attaching keyValue pairs)
	public void longPressAction(WebElement element) 
	{
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
		    "elementId", ((RemoteWebElement) element).getId(), "Duration", 2000
		));
	}
	
	public void scrolldemotest() {
		do{canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			    "left", 20, "top", 100, "width", 200, "height", 200,
			    "direction", "down",
			    "percent", 1.0
			));}
		while(canScrollMore);
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
		service.stop();
	}
}

//String[] command = {"cmd"};
//Process p;
//
//
//try{
//	p = Runtime.getRuntime().exec(command);
//	PrintWriter stdin = new PrintWriter(p.getOutputStream());
//	stdin.println("C:\\Users\\DELL\\AppData\\Local\\Android\\Sdk\\emulator>emulator -avd achyut_avd2");
//	//stdin.println("emulator -avd achyut_avd2");
//	Thread.sleep(3000);
//	stdin.close();
//	p.waitFor();
//	}catch(Exception e) {
//		e.printStackTrace();
//	}
	
//File f =  new File("src");
//File fs =  new File(f,"ApiDemos-debug.apk");
//DesiredCapabilities cap1 = new DesiredCapabilities();
//cap1.setCapability(MobileCapabilityType.DEVICE_NAME, "achyuth_avd2");
//cap1.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
//System.out.println(fs.getAbsolutePath());