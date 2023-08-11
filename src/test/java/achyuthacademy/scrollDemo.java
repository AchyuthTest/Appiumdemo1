package achyuthacademy;

import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;

public class scrollDemo extends basetest {
	@Test
	public void scrollDemoTest() {
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		System.out.println("driver value in scrolldemo test"+driver);
driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView3\"));"));	
	}

}