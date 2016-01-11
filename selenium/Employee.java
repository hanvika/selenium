package selenium;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Employee {
static FirefoxDriver driver=null;
@BeforeTest
public void setup()
{
	driver=new FirefoxDriver();
	driver.get("http://enterprise.demo.orangehrmlive.com/");
	driver.manage().window().maximize();

}
@Test
public void logintest()
{
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin");
	driver.findElement(By.id("btnLogin" )).click();
}
@Test
public void webtableTest() throws IOException
{
	FileInputStream f=new FileInputStream("C:\\Users\\streenidhi.sys\\Desktop\\AddEmployee.xls");
	XSSFWorkbook wb=new XSSFWorkbook(f);
	XSSFSheet ws=wb.getSheet("Sheet1");
	Iterator<Row> row=ws.iterator();
	while(row.hasNext())
	{
		
		Actions action=new Actions(driver);
		//Sleeper.sleepTightInSeconds(2);
		WebElement event=driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/b"));
		action.moveToElement(event).build().perform();
		Sleeper.sleepTightInSeconds(3);
		driver.findElement(By.linkText("Add Employee")).click();
		Row r=row.next();
		Sleeper.sleepTightInSeconds(3);
		driver.findElement(By.id("firstName")).sendKeys(r.getCell(0).getStringCellValue());
		//driver.findElement(By.id("middleName")).sendKeys(r.getCell(1).getStringCellValue());
		driver.findElement(By.id("lastName")).sendKeys(r.getCell(2).getStringCellValue());;
		driver.findElement(By.id("employeeId")).sendKeys(r.getCell(3).getStringCellValue());
		 WebElement check=driver.findElement(By.id("chkLogin"));
		
		
		if(r.getCell(4).getStringCellValue().equals("Y"))
			
		{
			if(!check.isSelected())
		
		{
		     check.click();
		}
			driver.findElement(By.id("user_name")).sendKeys(r.getCell(5).getStringCellValue());
			driver.findElement(By.id("user_password")).sendKeys(r.getCell(6).getStringCellValue());
			driver.findElement(By.id("re_password")).sendKeys(r.getCell(7).getStringCellValue());
			driver.findElement(By.id("status")).sendKeys(r.getCell(8).getStringCellValue());
		
		}
		else
		{
			if(check.isSelected())
			{
				check.click();
			}				
		}
		WebElement drop=driver.findElement(By.id("location"));
		Sleeper.sleepTightInSeconds(2);
		if(drop.isDisplayed())
		{
			Select select=new Select(drop);
			select.selectByVisibleText(r.getCell(9).getStringCellValue());
		}
		driver.findElement(By.id("btnSave")).click();
		
		
		}				
			
		
			
		
			}
			
				
			}

		
	
	


