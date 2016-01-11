package keywordDrivenTesting;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Loginusingproperties {
	FirefoxDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://enterprise.demo.orangehrmlive.com/");
	}
	@Test
	public void loginTest() throws IOException
	{
		FileInputStream f=new FileInputStream("C:\\Users\\streenidhi.sys\\Downloads\\eclipse-jee-mars-1-win32\\eclipse\\prassi_selenium\\selenium\\OrangeHrm.properties");
	Properties pr=new Properties();
	pr.load(f);
	driver.findElement(By.id(pr.getProperty("Username"))).sendKeys("Admin");
	driver.findElement(By.id(pr.getProperty("Password"))).sendKeys("admin");
	driver.findElement(By.id(pr.getProperty("login"))).click();
	
	
	}
	
	
	

}
