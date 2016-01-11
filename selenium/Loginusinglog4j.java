package selenium;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.log4testng.Logger;

public class Loginusinglog4j {
	private static Logger log=Logger.getLogger(Loginusinglog4j.class);

	public static void main(String[] args) {
		DOMConfigurator.configure("log4j.xml");
		FirefoxDriver driver=new FirefoxDriver();
		log.info("browser launched");
		driver.get("http://enterprise.demo.orangehrmlive.com/");
		log.info("open orange HRM");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		log.info("enter username");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		log.info("enter password");
		driver.findElement(By.id("btnLogin")).click();
		log.info("click on login");

		
		
	
		
	}
			
		}
		
	
		

	


