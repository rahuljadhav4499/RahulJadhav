package com.SauceDemo.UtilityClass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

public static void takescrrenshot(WebDriver driver) throws IOException {
		
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat ("ddMMYYYY_HHmmsss");
		String timeStamp=sdf.format(d);
		
			TakesScreenshot ts=(TakesScreenshot)driver;
			File sourceFile=ts.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(sourceFile,new File("./Screenshot//Rahul"+timeStamp+".jpg"));
		System.out.println("ScrenShot is Taken");
	}
}
//"C:\\Users\\rahul\\OneDrive\\Pictures\\Saved Pictures\\rahul"+timeStamp+".jpg"