package com.SauceDemo.TestClass;

import org.testng.annotations.Test;

import com.SauceDemo.PomClass.HomePagePomClass;

public class TC002VerifyLogOutFunct extends TestBaseClass {

	@Test
	
	public void verifyLogout()
	{
		//Home page
		//setting Button +LogOut Button-->HomePom
		
		
		HomePagePomClass hp= new HomePagePomClass(driver);
		hp.ClicksettingButton();
		System.out.println("Click on Setting Button");
		
		hp.ClickLogOut();
		System.out.println("Click onlogOut Button");
		
		//login page validation
		
		String ExpectedResult="Swag Labs";
		String ActualResult=driver.getTitle();
		
		if (ExpectedResult.equals(ActualResult))
		{
			System.out.println("Test Case is passed ");
		}
		else 
		{
			System.out.println("Test case is failed");
		}
		
		
	}
}
