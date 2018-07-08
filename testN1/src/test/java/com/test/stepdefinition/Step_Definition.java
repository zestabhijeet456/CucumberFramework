
package com.test.stepdefinition;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Step_Definition {
	
	
    public static  WebDriver driver;
	public static Properties properties;
	public static final String driverPath = "C:\\Users\\priya\\Desktop\\ChromeDriver\\";
	public static final String operatingSystem = System.getProperty("os.name").toUpperCase();
	public static final String systemArchitecture = System.getProperty("os.arch");
	public static String workingDir = System.getProperty("user.dir");
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page()  {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hi");
		System.setProperty("webdriver.chrome.driver", driverPath +"chromedriver_2.40.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page()  {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hi");
	   
	}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hi");
	    
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully()  {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hi");
	   
	}









}
