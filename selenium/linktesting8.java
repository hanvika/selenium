package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linktesting8 {

	public static void main(String[] args) {
		//ProfilesIni pr=new ProfilesIni();
		//FirefoxProfile fp=pr.getProfile("prasanna");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{
			if(links.get(i).isDisplayed())
			{
				String linkname=links.get(i).getText();
				String expurl=links.get(i).getAttribute("href");
				links.get(i).click();
				String acturl=driver.getCurrentUrl();
				if(acturl.contains(expurl))
				{
					System.out.println(linkname+"is working correctly");
				}
				else
				{
					System.out.println(linkname+"is not working correctly");
				}
				driver.navigate().back();
				links=driver.findElements(By.tagName("a"));
				}
			}
		}
			
	}


