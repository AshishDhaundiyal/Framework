package com.automation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.pages.BaseClass;
import com.automation.pages.LoginPage;
import com.automation.utility.Browserfactory;
import com.automation.utility.ExcelDataProvider;

public class LoginTest extends BaseClass {
	
	@Test
	public void LoginToEDGEPortal() throws Exception {
		logger = report.createTest("Login To EDGE");
		ExcelDataProvider excel= new ExcelDataProvider();
		excel.getStringData("Login", 0, 0);
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		logger.info("Login to EDGE");
		
//		loginPage.LoginToEDGE(excel.getStringData("Login", 2, 0), excel.getStringData("Login", 2, 1), excel.getNumericData("Login", 2,2));
		loginPage.LoginToEDGE(excel.getStringData("Login", 2, 0), excel.getStringData("Login", 2, 1));
		logger.pass("Login Successfully"); 
	}


}
	