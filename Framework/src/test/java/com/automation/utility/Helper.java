package com.automation.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	
	// screenshots , alerts , Frames,  windows, sync issues
	
	public static String captureScreenshots(WebDriver driver) {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String screenshotPath = System.getProperty("user.dir")+"/Screenshots/EdgeTest"+ getCurrentDateTime() +".png";
		
		try {
			FileHandler.copy(src, new File(screenshotPath));
		System.out.println("Screenshot captured");
		
		}
		
		catch (IOException e)
		{
			System.out.println("Unable to capture Screenshot " +e.getMessage());
		
		}
		return screenshotPath;
	}
	
	public static String getCurrentDateTime() {
		DateFormat customFormat=new SimpleDateFormat("MM_DD_YYYY_HH_MM_SS");
		Date currnetDate = new Date();
		return customFormat.format(currnetDate);	
		
		
	}

}
