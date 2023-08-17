package com.Pages;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage 
{
	WebDriver dpdriver = null;
	
	public DashboardPage(WebDriver driver) {
		this.dpdriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h3")
	List<WebElement> courses;
	
	public ArrayList<String> verifyCourses(){
		ArrayList<String> actualCourses = new ArrayList<String>();
		for (WebElement course : courses) {
			String text = course.getText();
			actualCourses.add(text);
		}
		return actualCourses;
	}
	 	public boolean verifycourses1() {
	 		ArrayList<String> actualCourses = new ArrayList<String>();
			for (WebElement course : courses) {
				String text = course.getText();
				actualCourses.add(text);
	 	}
			ArrayList<String> expectedcourses = new ArrayList<String>();
			expectedcourses.add("Selenium");
			expectedcourses.add("Java / J2EE");
			expectedcourses.add("Python");
			expectedcourses.add("Php");
			
			if(actualCourses.equals(expectedcourses))
				return true;
			else
				return false;
	
	 	}	
}
