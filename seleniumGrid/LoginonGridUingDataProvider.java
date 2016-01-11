package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginonGridUingDataProvider {
	@DataProvider(parallel=true)
	public Object[][] sendData()
	{
		Object[][] data=new Object[2][3];
		data[0][0]="Admin";
		data[0][1]="admin";
		data[0][2]="firefox";
				
				
		data[1][0]="Admin";
		data[1][1]="admin";
		data[1][2]="chrome";
	return data;
	}
	@Test(dataProvider="sendData")
	public void loginTest(String u,String p,String b) throws MalformedURLException
	{
		System.out.println(b);
		DesiredCapabilities cap=null;
		if(b.equals("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		else if(b.equals("chrome"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		}
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		driver.get("http://opensource.demo.orangehrm.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(u);
		driver.findElement(By.id("txtPassword")).sendKeys(p);
		driver.findElement(By.id("btnLogin" )).click();
		
		
				
				
		
		
		
	}
	

}
