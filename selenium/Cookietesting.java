package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Cookietesting {
	FirefoxDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://facebook.com");
	}
	@Test
	public void cookiestest()
	{
		Set<Cookie> mycookies=driver.manage().getCookies();
		System.out.println(mycookies.size());
		Iterator<Cookie> it=mycookies.iterator();
		while(it.hasNext())
		{
			Cookie c=it.next();
		System.out.println(c.getName()+"......."+c.getDomain());
//		System.out.println("hcvbcbcv");
		}
		driver.manage().deleteAllCookies();
	}
}
		
		
		
		
		
		
		
		
		
		
	
	


