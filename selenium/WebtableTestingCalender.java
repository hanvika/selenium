package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebtableTestingCalender {
	static FirefoxDriver driver=null;
	@BeforeMethod
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.cleartrip.com");
	}
	@Test
	public void Calendertest()
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.id("OneWay")).click();
		driver.findElement(By.id("FromTag")).sendKeys("Hyderabad, IN - Rajiv Gandhi International (HYD)");
		driver.findElement(By.id("ToTag")).sendKeys("Islamabad, PK - Islamabad (ISB)");
		driver.findElement(By.xpath("//*[@id='ORtrip']/section[2]/div[1]/dl/dd/div/a/i")).click();
		 String doj="12/05/2017";
		 String[] a=doj.split("/");
		 String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"};
		 int x=Integer.parseInt(a[1]);
		 String month=months[x-1];
		 String day=a[0];
		 String year=a[2];
		 String calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		 System.out.println(calyear);
		 while(!calyear.equals(year))
		 {
			 driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a")).click();
			 calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		 }
		 
		 String  calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		 while(!calmonth.equals(month))
		 {
			 driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a")).click();
			 calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		 }
		 WebElement table=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]"));
		 List<WebElement>rows=table.findElements(By.tagName("tr"));
		 for(int i=0;i<rows.size();i++)
		 {
			 List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
			 for(int j=0;j<cols.size();j++)
			 {
				 if(cols.get(j).getText().equals(day))
				 {
					 cols.get(j).click();
				 }
			 }
		 }
		 driver.findElement(By.id("SearchBtn")).click();
		 
				 
			 
		 
		 
			 
			 
		 }
		 
			 
		 }
		 
		 
		 
		 
				 
		
	
	


