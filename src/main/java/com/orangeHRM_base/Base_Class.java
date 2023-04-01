package com.orangeHRM_base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Base_Class {
	
	
	public String burl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public String uname="Admin";
	public String paswrd="admin123";
	public static WebDriver driver;
	
	
	
	@BeforeClass
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();	
	}
	
	@AfterClass
	public void closedBrowser() {
		driver.close();
	}	 
}



