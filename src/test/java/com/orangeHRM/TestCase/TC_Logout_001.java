package com.orangeHRM.TestCase;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.Test;
import com.orangeHRM.Pom.LogoutPage;

public class TC_Logout_001 extends TC_HomePage_01{
	
	@AfterMethod
	public void Logout() throws InterruptedException {
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		LogoutPage lg= new LogoutPage(driver);
		
		lg.clickontxt();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		logger.info("clicked on logout button");
		
		lg.clickonLogout();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		logger.info("Logout Successful");
		
		System.out.println("Logout Successful");
	}

}
