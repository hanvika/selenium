package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;



public class gmaillogin {


	public static void main(String[] args) throws InterruptedException {
	
		//System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
		
		//System.setProperty("Webdriver.chrome.driver"‪,"C:\\chromedriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com");
		WebElement username=driver.findElement(By.xpath("//*[@id='Email']"));
		username.sendKeys("prassi.prassi@gmail.com");
		driver.findElement(By.xpath("//*[@id='next']")).click();
		Thread.sleep(5000);
		
		WebElement password=driver.findElement(By.xpath("//*[@id='Passwd']"));
		password.sendKeys("9948410000");
		Sleeper.sleepTightInSeconds(2);
		driver.findElement(By.xpath(".//*[@id='signIn']")).click();

	}


	

}