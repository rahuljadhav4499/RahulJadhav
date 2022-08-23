package com.SauceDemo.TestClass;

import org.testng.annotations.Test;

import com.SauceDemo.PomClass.HomePagePomClass;

public class TC004VerifyTheMultipleProductAddToCartFunctionality extends TestBaseClass {

	
	@Test
	public void VerifyMultipleProductAddtoCart()
	{
		HomePagePomClass hp=new HomePagePomClass(driver);
		hp.clickAllProducts();
		System.out.println("Click on Multiple Product");
		
		String ExpectedCount="6";
		String ActualCount=hp.getTextFromAddToCart();
		System.out.println(ActualCount);
		
		// validation
		if(ExpectedCount.equals(ActualCount))
		{
			System.out.println("tc is passed");
		}
		else
		{
			System.out.println(" tc is failed");
		}
	
	}
}
