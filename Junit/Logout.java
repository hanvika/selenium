package Junit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.server.browserlaunchers.Sleeper;


public class Logout extends Constants {
	@Test
	public void logoutTest()
	{
		driver.findElement(By.linkText("Welcome Admin")).click();
		Sleeper.sleepTightInSeconds(2);
		driver.findElement(By.linkText("Logout")).click();
	}

}
