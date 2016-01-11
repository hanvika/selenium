package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Rightclick {
	FirefoxDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://google.com");
	}
	@Test
	public void rightclickTest()
	{
		Actions action=new Actions(driver);
		WebElement event=driver.findElement(By.linkText("Gmail"));
		action.contextClick(event).sendKeys("W").build().perform();
	}

}
