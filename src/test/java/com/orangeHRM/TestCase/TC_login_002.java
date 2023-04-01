package com.orangeHRM.TestCase;



import org.testng.Assert;
import org.testng.annotations.Test;
import com.orangeHRM.Pom.LoginPage;
import com.orangeHRM_base.Base_Class;

public class TC_login_002 extends BS{
 

		@Test
		public void LoginTest() throws InterruptedException {
			
			driver.get(burl);
			Thread.sleep(10000);
			logger.info("Url is opened");
			
			LoginPage lp = new LoginPage(driver);
			
			lp.setupUserName(uname);
			logger.info("UserName Entered");
			
			lp.setupnPassword(paswrd);
			logger.info("Passward Entered");
			
			lp.clickOnLogin();
		
			
			if(driver.getTitle().equals("OrangeHRM"))
			{
			 Assert.assertTrue(true);
			 logger.info("Assertion is passed");
			}
			else
			{
			 Assert.assertTrue(false);
			 logger.info("Assertion is failed ");
		    }
			 
		}	
	}

