package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage1 
{
private WebDriver driver;
//	WebDriver driver = null;
//	
//	public LoginPage1 (WebDriver driver) {
//		this.driver = driver;
//	}
//	public WebElement getUsername() {
//		return driver.findElement(By.id("email"));
//	}
//	public WebElement getPassword() {
//		return driver.findElement(By.id("Password"));
//	}
//	public WebElement getLoginBtn() {
//		return driver.findElement(By.xpath("//button"));
//	}
//	
//	public void LoginToApplication1(String uname, String pass) {
//		getUsername().sendKeys("uname");
//		getPassword().sendKeys("pass");
//		getLoginBtn().click();
//	}
	public LoginPage1 (WebDriver driver) 
	{
		this.driver = driver;
	}
	public WebElement getUsrename() {
		return driver.findElement(By.id("email"));
		
	}
	public WebElement getPassword() {
		return driver.findElement(By.id("password"));
	}
	public WebElement getLoginBtn() {
		return driver.findElement(By.xpath("//button"));
	}
	public void LoginToApplication1(String uname, String pass) {
		getUsrename().sendKeys(uname);
		getPassword().sendKeys(pass);
		getLoginBtn().click();
	}
	
}
