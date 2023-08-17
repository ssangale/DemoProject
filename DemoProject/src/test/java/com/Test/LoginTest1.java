package com.Test;

import org.testng.annotations.Test;

import com.Pages.LoginPage;
import com.Pages.LoginPage1;

import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest1 
{
	WebDriver driver = null;
	@Test
	public void test01() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///D:/Selenium/Offline%20Website/index.html");
		driver.manage().window().maximize();
		
//		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("123456");
//		driver.findElement(By.xpath("//button")).click();
//		((WebElement) driver.findElements(By.xpath("/html/body/div/aside/section/ul/li[3]/a/span"))).click();
		
//		LoginPage lp= new LoginPage(driver);
//		lp.LoginToApplication("kiran@gmail.com", "123456");
		
		LoginPage1 lp = new LoginPage1 (driver);
		lp.LoginToApplication1("kiran@gmail.com", "123456");
		
		AssertJUnit.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}
}
