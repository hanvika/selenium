package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class chromedriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://google.com");

	}

}
