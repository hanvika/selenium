package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class implicitwait {
	FirefoxDriver driver;
   @BeforeMethod
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("https://pvrcinemas.com");
	}
	@Test
	public void waittest()
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='carousel-example-generic']/div/div[2]/div/div/div/span/a/i")).click();;
		
	}

}
