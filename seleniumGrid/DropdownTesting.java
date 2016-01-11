package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DropdownTesting {
	@Parameters("browser")
	@Test
	public void dropdowntest(String b) throws MalformedURLException
	{
		System.out.println(b);
	
	DesiredCapabilities cap=null;
	if(b.equals("firefox"))
	{
		cap=DesiredCapabilities.firefox();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.ANY);
	}
	else if(b.equals("chrome"))
	{
		cap=DesiredCapabilities.firefox();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
	}
	RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
	driver.get("http://opensource.demo.orangehrm.com/");
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin");
	driver.findElement(By.id("btnLogin" )).click();
	
	

}
}