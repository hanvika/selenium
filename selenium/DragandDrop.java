package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragandDrop {
FirefoxDriver driver;
@BeforeMethod
public void setup()
{
	driver=new FirefoxDriver();
	driver.get("https://jqueryui.com/droppable/");
}
@Test
public void draganddroptest()
{
	Actions action =new Actions(driver);
	driver.switchTo().frame(0);
	WebElement source=driver.findElement(By.id("draggable"));
	WebElement target=driver.findElement(By.id("droppable"));
	action.dragAndDrop(source, target).build().perform();
}

	
	
}


