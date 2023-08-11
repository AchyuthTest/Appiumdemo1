package achyuthacademy;

import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;

public class  AppiumBasics extends basetest {
	@Test
	public void wifiSettingName() throws MalformedURLException {
		
//for using xpath (i)tagName[@attribute="value"] or (ii)//tagName
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		String actual_alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(actual_alertTitle, "WiFi settings");
		driver.findElement(By.id("android:id/edit")).sendKeys("Achyuth Wifi");
		driver.findElements(By.className("android.widget.Button")).get(1).click();
		//lnc unjsbc
	}

}
