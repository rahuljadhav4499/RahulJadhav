package com.SauceDemo.TestClass;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC001VerifyLoginActivity extends TestBaseClass {
	
	@Test
	public void  verifyLogin()
	{
		//Home page 
		// validation
		String ExpectedResult="Swag Labs";
		String ActualResult=driver.getTitle();
		
		Assert.assertEquals(ActualResult, ExpectedResult);
		
//		if(ExpectedResult.equals(ActualResult))
//		{
//			System.out.println("Test case is passed");
//		}
//		else
//		{
//			System.out.println("Test case is failed");
//		}
	}

}
