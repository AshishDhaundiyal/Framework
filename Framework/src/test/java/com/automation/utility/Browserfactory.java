package com.automation.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserfactory {
	// static WebDriver driver;

	public static WebDriver startBrowser(WebDriver driver, String browserName, String url) {
		if (browserName.equals("firefox")) {
			System.setProperty("webdriver.geckodriver.driver", ".//drivers//geckodriver.exe");
			driver = new FirefoxDriver();
		}

		else if (browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browserName.equals("IE")) {
			System.setProperty("webdriver.ie.driver", ".//drivers//IEDriverServer.exe");
			driver = new ChromeDriver();
		}

		else {
			System.out.println("No a valid Browser");
		}

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		return driver;
	}

	public static void quitBrowser(WebDriver driver) {

		driver.quit();
	}

}
