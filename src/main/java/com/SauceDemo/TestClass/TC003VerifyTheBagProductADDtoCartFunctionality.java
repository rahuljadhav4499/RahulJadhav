package com.SauceDemo.TestClass;

import org.testng.annotations.Test;

import com.SauceDemo.PomClass.HomePagePomClass;



public class TC003VerifyTheBagProductADDtoCartFunctionality extends TestBaseClass {

	
	@Test
	public void AddtoBagProduct()
	{
		HomePagePomClass hp=new HomePagePomClass(driver);
		hp.clickBagButton();
		System.out.println("Click on Bag product");
		
		String ExpectedCount="1";
		String ActualCount=hp.getTextFromAddToCart();
		System.out.println(ActualCount);
		
		if(ExpectedCount.equals(ActualCount))
		{
			System.out.println("Test case is Pass");
		}
		else
		{
			System.out.println("Test case is failed");
		}
	}
}
