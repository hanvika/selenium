package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginandlogout {
	static FirefoxDriver driver;
	@Given("^the browser is launched and navigated to url$")
	public void the_browser_is_launched_and_navigated_to_url() throws Throwable {
	    driver=new FirefoxDriver();
	    driver.get("http://enterprise.demo.orangehrmlive.com/");
	    throw new PendingException();
	}

	@When("^we enter the username and password$")
	public void we_enter_the_username_and_password() throws Throwable {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
	    throw new PendingException();
	}

	@When("^click on login button$")
	public void click_on_login_button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	    throw new PendingException();
	}

	@Then("^Welcome Admin msg should be displayed$")
	public void welcome_Admin_msg_should_be_displayed() throws Throwable {
		String expmsg="Welcome Admin";
		String actmsg=driver.findElement(By.id("welcome")).getText();
		Assert.assertEquals(actmsg, expmsg);
	    
	    throw new PendingException();
	}

	@When("^we click on Welcome Admin$")
	public void we_click_on_Welcome_Admin() throws Throwable {
	    driver.findElement(By.linkText("Welcome Admin")).getText();
	    throw new PendingException();
	}

	@When("^click on Logout$")
	public void click_on_Logout() throws Throwable {
		driver.findElement(By.linkText("Logout")).click();
	    throw new PendingException();
	}

	@Then("^App should come to home page$")
	public void app_should_come_to_home_page() throws Throwable {
	    String exptitle="OrangeHRM";
	    String acttitle=driver.getTitle();
	    Assert.assertEquals(acttitle, exptitle);
	    throw new PendingException();
	}



}
