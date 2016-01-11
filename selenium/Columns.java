package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Columns {
	static FirefoxDriver driver=null;
	@BeforeTest
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://enterprise.demo.orangehrmlive.com/");
	}
	@Test
	public void logintest()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin" )).click();
	}
	@Test
	public void webtableTest()
	{
		Actions action=new Actions(driver);
		WebElement event=driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/b"));
		action.moveToElement(event).build().perform();
		Sleeper.sleepTightInSeconds(3);
		driver.findElement(By.linkText("Employee List")).click();
		Sleeper.sleepTightInSeconds(3);
		WebElement table=driver.findElement(By.id("resultTable"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		for(int i=1; i<rows.size(); i++)
		{
			String FirstName = driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr["+i+"]/td[3]")).getText();
			String LastName = driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr["+i+"]/td[4]")).getText();
			System.out.println(FirstName + "   "+ LastName );
		}



	}
}
