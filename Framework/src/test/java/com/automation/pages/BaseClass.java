package com.automation.pages;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.automation.utility.Browserfactory;
import com.automation.utility.Helper;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
//import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import java.util.*;
import java.io.*;

public class BaseClass {
	public WebDriver driver;
	public LoginPage loginPage;
	public ExtentReports report;
	public ExtentTest logger;
	public FileReader reader;
	public Properties p;

	public void setupsuit() {
		Reporter.log("Setting up the configuration", true);
		// ExtentHtmlReporter extent = new ExtentHtmlReporter(new
		// File(System.getProperty("user.dir")+"/Reports/testreport _ "+
		// Helper.getCurrentDateTime() +".html"));
		ExtentHtmlReporter extent = new ExtentHtmlReporter(
				new File(System.getProperty("user.dir") + "/Reports/testreport.html"));
		report = new ExtentReports();
		report.attachReporter(extent);
		Reporter.log("Configuration completed , Test is starting", true);

	}

	@BeforeClass
	public void beforeClassSetup() throws Exception {

		Reporter.log("Trying to Start Browser and starting Application", true);
		// String baseUrl = p.getProperty("baseUrl");
		String baseUrl = "https://uat-wubs.cs18.force.com/managecash/CommunityLogin";
		// driver = Browserfactory.startBrowser(driver,p.getProperty("Browser"),
		// baseUrl);
		driver = Browserfactory.startBrowser(driver, "Chrome", baseUrl);
		Reporter.log("Browser and Application is up and running", true);

	}

	@AfterClass
	public void closeBrowser() {
		Browserfactory.quitBrowser(driver);
	}

	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException {
		Reporter.log("Test is about to complete", true);

		if (result.getStatus() == ITestResult.FAILURE) {
			Helper.captureScreenshots(driver);
			logger.fail("Failed",
					MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshots(driver)).build());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			Helper.captureScreenshots(driver);
			logger.pass("PASS",
					MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshots(driver)).build());
		}
		report.flush();

		Reporter.log("Test completed ........... Reports are generated", true);
	}

}
