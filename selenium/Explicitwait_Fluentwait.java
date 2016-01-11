package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Explicitwait_Fluentwait {

public class Explicitwait_webdriverwait{
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
		FluentWait<WebDriver> fwait=new FluentWait<WebDriver>(driver).withTimeout(30,TimeUnit.SECONDS)
				                                                     .pollingEvery(2,TimeUnit.SECONDS)
				                                                     .ignoring(NoSuchElementException.class);
		
		fwait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='carousel-example-generic']/div/div[1]/div/div/div/span/a")));
		fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='carousel-example-generic']/div/div[2]/div/div/div/span/a/i"))).click();
		
	}
}

}
