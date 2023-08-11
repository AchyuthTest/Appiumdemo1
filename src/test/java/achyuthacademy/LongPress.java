package achyuthacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;

public class  LongPress extends basetest {
	@Test
	public void longPressGesture() throws InterruptedException {
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Expandable Lists\"]")).click();
		driver.findElement(By.id("android:id/text1")).click();
		Thread.sleep(2000);
		WebElement element1 = driver.findElement(By.id("android:id/action_bar"));
		longPressAction(element1);
		
		
	}

}
