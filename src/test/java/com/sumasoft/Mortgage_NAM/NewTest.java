package com.sumasoft.Mortgage_NAM;


import org.testng.annotations.Test;

import Maven_demo.Maven_demo1.SignUp;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.sumasoft.com");
		driver.manage().window().maximize();
	}
	@Test
	public void f() {
		System.out.println("This is test");
		Services service=new Services(driver);				//for Sign up
		service.home();
	}
	@AfterTest
	public void afterTest() {
		System.out.println("This is afterTest");
		driver.quit();
	}

}
