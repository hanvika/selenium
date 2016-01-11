package selenium;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxlaunch {

	public static void main(String[] args) {
		//FirefoxDriver driver=new FirefoxDriver();
		//ChromeDriver driver=new ChromeDriver();
		//System.setProperty("Webdriver.ie.driver", "C:\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("http://google.com");

	}

}
