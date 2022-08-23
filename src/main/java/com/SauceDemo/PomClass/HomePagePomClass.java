package com.SauceDemo.PomClass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePagePomClass {

			 WebDriver driver;
		
		
		@FindBy(xpath="//button[@id='react-burger-menu-btn']")
		private WebElement settingButton;
		
		public void ClicksettingButton()
		{
			settingButton.click();
		}
		
		@FindBy(xpath="//a[@id='logout_sidebar_link']")
		private WebElement LogOut;
		
		public void ClickLogOut()
		{
			LogOut.click();
		}
		
		//bagButton
			@FindBy(xpath="(//button[text()='Add to cart'])[1]")
			private WebElement bagButton;
			
			public void clickBagButton()
			{
				bagButton.click();
			}
			
			//addToCartButton
			@FindBy(xpath="//a[@class='shopping_cart_link']")
			private WebElement addToCartButton;
			
			public String getTextFromAddToCart()
			{
				String totalProducts= addToCartButton.getText();
				return totalProducts;
			}

			//allProduct Elements
			@FindBy(xpath="//button[text()='Add to cart']")
			private List<WebElement> allProducts;
			
		
			public void clickAllProducts()
			{
			
							
				for (WebElement product:allProducts) {
					
					product.click();
				}
			}
			
			

		public HomePagePomClass (WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}



		
}
