package com.orangeHRM.TestCase;



import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.orangeHRM.Pom.LoginPage;
import com.orangeHRM_base.Base_Class;

public class TC_login_002 extends BS{
 

		@BeforeMethod
		public void LoginTest() throws InterruptedException {
			
			driver.get(burl);
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			logger.info(" Base_Url is opened");
			
			LoginPage lp = new LoginPage(driver);
			
			lp.setupUserName(uname);
			logger.info("UserName Entered");
			
			lp.setupnPassword(paswrd);
			logger.info("Passward Entered");
			
			lp.clickOnLogin();
		
			if(driver.getTitle().equals("OrangeHRM"))
			{
			 Assert.assertTrue(true);
			 logger.info("Assertion is passed : Title Found OrangeHRM ");
			}
			else
			{
			 Assert.assertTrue(false);
			 logger.info("Assertion is failed : Title Not Found");
		    }
			System.out.println("Login Successful");
		}	
		
	}

