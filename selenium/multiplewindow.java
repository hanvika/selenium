package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class multiplewindow {
	FirefoxDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver= new FirefoxDriver();
		driver.get("https://bing.com");
	}
	@Test
	public void multiplewindowtest()
	{
		String title1=driver.getTitle();
		driver.findElement(By.linkText("Help")).click();
		Set<String> windowids=driver.getWindowHandles();
		Iterator<String> it=windowids.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			String title2=driver.getTitle();
			if(!title1.equals(title2))
				{
				driver.findElement(By.xpath("//*[@id='privacyLabel']")).click();
					
				}
		}
		
		
		
	}

	
	

}
