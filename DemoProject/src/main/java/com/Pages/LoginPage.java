package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver lpdriver = null;
	public LoginPage(WebDriver driver) {
		this.lpdriver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "email")
	WebElement username;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(xpath = "//button")
	WebElement loginBtn;
	
	public void LoginToApplication(String uname, String pass) {
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginBtn.click();
	}
	
	public DashboardPage validLogin() {
		username.sendKeys("kiran@gmail.com");
		password.sendKeys("123456");
		loginBtn.click();
		return new DashboardPage(lpdriver);
	}
	
	
	
//	public LoginPage (WebDriver driver) 
//	{
//		this.lpdriver = driver;
//	}
//	public WebElement getUsrename() {
//		return lpdriver.findElement(By.id("email"));
//		
//	}
//	public WebElement getPassword() {
//		return lpdriver.findElement(By.id("password"));
//	}
//	public WebElement getLoginBtn() {
//		return lpdriver.findElement(By.xpath("//button"));
//	}
//	public void LoginToApplication(String uname, String pass) {
//		getUsrename().sendKeys(uname);
//		getPassword().sendKeys(pass);
//		getLoginBtn().click();
	}
//}