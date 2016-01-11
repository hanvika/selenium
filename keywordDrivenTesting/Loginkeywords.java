package keywordDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Loginkeywords {
	FirefoxDriver driver;
	public void launchbrowser()
	{
		driver=new FirefoxDriver();
	}
	public void navigate()
	{
		driver.get("http://enterprise.demo.orangehrmlive.com/auth/login");
	}
	public void enterusername()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	}
	public void enterpassword()
	{
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		
	}
     public void clicklogin()
    {
	driver.findElement(By.id("btnLogin")).click();
    }
}
