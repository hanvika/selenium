package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class AddEmployee extends Constants {
@Test
public  void addEmployeeTest()
{
	Actions action=new Actions(driver);
	WebElement event=driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/b"));
	action.moveToElement(event).build().perform();
	Sleeper.sleepTightInSeconds(3);
	driver.findElement(By.linkText("Add Employee")).click();
	Sleeper.sleepTightInSeconds(3);
	driver.findElement(By.id("firstName")).sendKeys("prassi");
	driver.findElement(By.id("middleName")).sendKeys("prasanna");
	driver.findElement(By.id("lastName")).sendKeys("ch");
	driver.findElement(By.id("employeeId")).sendKeys("1111");
	driver.findElement(By.id("btnSave")).click();
	
	
	
}
	

}
