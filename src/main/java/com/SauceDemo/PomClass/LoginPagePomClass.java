package com.SauceDemo.PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePomClass {

	//1.WebDriver declared
			WebDriver driver;      //global
			private Actions act;
			
			//2. Elements find
			//3.Element action-method create
			
			//do not follow this method to find element

		//	@FindBy -->annotation-->@ -->function-->method act
		//findElement -element inspect --> @FindBy
			
			@FindBy(xpath="//form//div[1]//input")
			private WebElement username;
				
			public void sendUsername()
			{
				username.sendKeys("standard_user");
			}
			
			@FindBy(xpath="//form//div[2]//input")
			private WebElement password;
			
			public void sendPassword()
			{
				password.sendKeys("secret_sauce");
			}
			
			
			@FindBy(xpath="/html/body/div/div/div[2]/div[1]/div[1]/div/form/input")
			private WebElement loginButton;
			
			public void clickLoginButton()
			{
//				loginButton.click();
				
				//mouse action
				act.click(loginButton).perform();
				
			}
			
			
			//4.constrctor of class
			                                  //local
			public LoginPagePomClass(WebDriver driver)
			{
				this.driver = driver;
				
				PageFactory.initElements(driver, this);
				act=new Actions(driver);
			}
			
			
			//POM Class
//			1.WebDriver declare
//			2.WebElement inspect -->@FindBy
//			3.WebElement action-->method-->encapsulation
//			4.Class constructor-->WebDriver driver arg;
			
		  //POM clas --No main method
			//i m not executing this class
			//class use--> webElement inspect + eleAcction
}
