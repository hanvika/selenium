package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport {

	public static void main(String[] args) throws IOException {
		ExtentReports reports=new ExtentReports("D:\\Downloads\\eclipse-jee-mars-1-win32\\eclipse\\prassi_selenium\\selenium\\src\\com\\qedge\\reports\\sample1.html",true);
		ExtentTest test=reports.startTest("sampleTest");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		test.log(LogStatus.INFO,"Navigated to url");
		driver.findElement(By.name("q")).sendKeys("selenium");
		test.log(LogStatus.INFO, "entered selenium in search box");
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile,new File("D:\\Downloads\\eclipse-jee-mars-1-win32\\eclipse\\prassi_selenium\\selenium\\google.png"));
		test.addScreenCapture("D:\\Downloads\\eclipse-jee-mars-1-win32\\eclipse\\prassi_selenium\\selenium");
	reports.endTest(test);
		reports.flush();
		
		
				

	}

}
