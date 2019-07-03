package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class LoginPage  {

	WebDriver driver;
	@FindBy(xpath="//input[contains(@id,'usernameInput')]")
	WebElement usernameTextBox;
	
	@FindBy(xpath="//input[contains(@id,'passwordInput')]")
	WebElement passwordTextBox;
	
	@FindBy(xpath="//div[text()='LOGIN']")
	WebElement loginButton;
	
	@FindBy(xpath="//label[text()= 'Verification Code']")
	WebElement verificationCodeLabel;
	
	@FindBy(xpath="//label[text()='Verification Code']/following-sibling::input")
	WebElement Inputverificationcode;
	
	@FindBy(xpath="//input[@value='Verify']")
	WebElement InputVerifyButton;
	
	
		
	//public void LoginToEDGE(String username, String password, double vCode) throws Exception {
	public void LoginToEDGE(String username, String password) throws Exception {
		
		usernameTextBox.sendKeys(username);
		passwordTextBox.sendKeys(password);
		loginButton.click();
		
		
		Thread.sleep(5000);			

		if (verificationCodeLabel.isDisplayed()) {
			System.out.println("Login button is clicked");
			Inputverificationcode.sendKeys("12345678");
			InputVerifyButton.click();
			
		}
	}
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	

}
