package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;
	@FindBy(xpath="//div/span/input[@type='text']")
	WebElement usernameTextBox;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement passwordTextBox;
	
	@FindBy(xpath="//div[text()='LOGIN']")
	WebElement loginButton;
	
	@FindBy(xpath="//label[text()= 'Verification Code']")
	WebElement verificationCodeLabel;
	
	
	public void LoginToEDGE(String username, String password) throws Exception {
		
		usernameTextBox.sendKeys(username);
		passwordTextBox.sendKeys(password);
		loginButton.click();
		
		Thread.sleep(5000);

		if (verificationCodeLabel.isDisplayed()) {
			System.out.println("Login button is clicked");
		}
	}
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	

}
