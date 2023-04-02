package com.orangeHRM.TestCase;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.orangeHRM.Utility.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BS {
	
	ReadConfig readconfig =new ReadConfig();
	public String burl=readconfig.get_Url();
	public String uname=readconfig.getUser_Name();
	public String paswrd=readconfig.getUser_Paass();
	public static WebDriver driver;
	public static Logger logger;
	
	
	@Parameters("Browser")
	@BeforeClass
	public void setUp(String browser) {
		
		
	
	if(browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver();
			driver =new FirefoxDriver();
		}
		
		else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver =new EdgeDriver();
			
		}
	logger=LogManager.getLogger(TC_login_002.class);
		System.out.println("Setup is open");
	}
	
	@AfterClass
	public void browserClosed() {
		driver.close();
		
	}
	

}
