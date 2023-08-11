package achyuthacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class cli {
	
	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.browserstack.com/");
		System.out.println("Driver1 value is "+driver);
		Actions a = new Actions(driver);
		System.out.println("Driver2 value is "+driver);
		WebElement Contactus = driver.findElement(By.xpath("//button[normalize-space()='Contact Us']"));		
//		WebElement trialaction = driver.findElement(By.xpath("//a[@id='free-trial-link-anchor']"));
//		a.doubleClick(trialaction).perform();
    	a.moveToElement(Contactus).build().perform();
		Thread.sleep(2000);
		WebElement testimonials = driver.findElement(By.xpath("//a[@id='view-all-testimonials']"));
		a.moveToElement(testimonials).build().perform();
		Thread.sleep(2000);
		WebElement ViewPricing = driver.findElement(By.xpath("//a[normalize-space()='View Pricing']"));
		a.contextClick(ViewPricing).build().perform();
		driver.close();
  }
}