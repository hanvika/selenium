package selenium;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class LoginusingKeywords {
	@Test
	public void loginTest() throws IOException
	{
		Loginkeywords Keys=new Loginkeywords();
		FileInputStream f=new FileInputStream("C:\\Users\\streenidhi.sys\\Downloads\\eclipse-jee-mars-1-win32\\eclipse\\prassi_selenium\\selenium\\src\\com\\qedge\\keywords\\loginKeywords.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Iterator<Row> row=ws.iterator();
		while(row.hasNext())
		{
			Row r=row.next();
			String action=r.getCell(3).getStringCellValue();
			if(action.equals("launchbrowser"))
			{
				Keys.launchbrowser();
			}
			else if(action.equals("navigate"))
			{
				Keys.navigate();
			}
			else if(action.equals("enterusername"))
			{
				Keys.enterusername();
			}
			else if(action.equals("enterpassword"))
			{
				Keys.enterpassword();
			}
			else if(action.equals("clicklogin"))
			{
				Keys.clicklogin();
			}
			
			
			
			
			
			}
			
		}
		
		
	}


