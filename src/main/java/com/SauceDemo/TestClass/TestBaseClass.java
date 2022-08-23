package com.SauceDemo.TestClass;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.SauceDemo.PomClass.LoginPagePomClass;
import com.SauceDemo.UtilityClass.ScreenShot;



public class TestBaseClass {

	WebDriver driver;
	@BeforeMethod
	public void Setup() throws IOException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL open");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		//Create object of pom class
		LoginPagePomClass lp=new LoginPagePomClass(driver);
		
		lp.sendUsername();
		System.out.println("username is entered");
		
		lp.sendPassword();
		System.out.println("password is entered");
		
		lp.clickLoginButton();
		System.out.println("loginButton is clicked");
		
		ScreenShot.takescrrenshot(driver);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		System.out.println("Browser closed");
	}
	
}
