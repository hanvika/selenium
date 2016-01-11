package autoit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class FileDownload {

	public static void main(String[] args) throws IOException 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://docs.seleniumhq.org/download/");
		driver.findElement(By.linkText("Download")).click();
		Sleeper.sleepTightInSeconds(7);
		driver.findElement(By.linkText("2.48.2")).click();
		Sleeper.sleepTightInSeconds(2);
		java.lang.Runtime.getRuntime().exec("‪D:\\download.exe");

	}

}
