package seleniumGrid;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExcel {
	@DataProvider(parallel=true)
	public Object[][] sendData() throws IOException
	{
		FileInputStream f=new FileInputStream("C:\\Users\\streenidhi.sys\\Downloads\\eclipse-jee-mars-1-win32\\eclipse\\prassi_selenium\\selenium\\src\\com\\qedge\\excelfiles\\dprovider1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		int r=ws.getLastRowNum();
		Row row=ws.getRow(0);
		int c=row.getLastCellNum();
	Object[][] data=new Object[r+1][c];
			for(int i=0;i<=r;i++)
			{
				for(int j=0;j<c;j++)
				{
					data[i][j]=ws.getRow(i).getCell(j).getStringCellValue();
				}
			}
			return data;
	
	}
	
	@Test(dataProvider="sendData")
	public void loginTest(String u,String p,String b) throws MalformedURLException
	{
		System.out.println(b);
		DesiredCapabilities cap=null;
		if(b.equals("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		else if(b.equals("chrome"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		}
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		driver.get("http://opensource.demo.orangehrm.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(u);
		driver.findElement(By.id("txtPassword")).sendKeys(p);
		driver.findElement(By.id("btnLogin" )).click();
		
		
		
		
	
	
}

}
