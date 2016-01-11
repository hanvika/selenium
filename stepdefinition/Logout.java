package stepdefinition;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Logout {
	FirefoxDriver driver;
	@Test
	public void logoutTest()
	{
		driver.findElement(By.linkText("Welcome Admin")).click();
		Sleeper.sleepTightInSeconds(2);
		driver.findElement(By.linkText("Logout")).click();
	}

}
