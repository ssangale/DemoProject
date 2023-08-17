package com.Test;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Pages.DashboardPage;
import com.Pages.LoginPage;

public class LoginTest 
{
	WebDriver driver = null;
	LoginPage lp = null;
	DashboardPage dp = null;
//	@Test
	
//	public void test01() 
	@BeforeSuite
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Selenium/Offline%20Website/index.html");
		driver.manage().window().maximize();
		lp = new LoginPage(driver);
		
//		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("123456");
//		driver.findElement(By.xpath("//button")).click();
//		((WebElement) driver.findElements(By.xpath("/html/body/div/aside/section/ul/li[3]/a/span"))).click();
		
//		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}
	@Test
	
	public void test01() {
		dp = lp.validLogin();
//		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
//		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}
	@Test
	public void test02() {
		ArrayList<String> expectedcourses = new ArrayList<String>();
		expectedcourses.add("Selenium");
		expectedcourses.add("Java / J2EE");
		expectedcourses.add("Python");
		expectedcourses.add("Php");
		
		ArrayList<String> actualCourses = dp.verifyCourses();
		Assert.assertEquals(actualCourses, expectedcourses);
	}
	@Test
	public void test03() {
		boolean flage = dp.verifycourses1();
		Assert.assertTrue(flage);
				
	}
}
