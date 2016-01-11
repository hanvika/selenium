package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Brokenlinks {

	public static void main(String[] args) throws Throwable {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{
			String response=brokenlinks(new URL(links.get(i).getAttribute("href")));
			System.out.println(links.get(i).getText()+"......"+response);
		}
	}
	public static String brokenlinks(URL url) throws IOException
	{
		String response=null;
		HttpURLConnection conn=(HttpURLConnection)url.openConnection();
		try
		{
			conn.connect();
			response=conn.getResponseMessage();
		}
		catch(Exception e)
		{
			response=e.getMessage();
		}
		return response;
	
			
		
			
			
		}

		}


