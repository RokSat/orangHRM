package com.orangeHRM.TestCase;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangeHRM.Pom.Homepage;
import com.orangeHRM.Pom.LoginPage;

public class TC_HomePage_01 extends TC_login_002 {
	
	@Test
	public void HomePage() throws InterruptedException {
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		Homepage hp =new Homepage(driver);
		
		hp.clickonAdmin();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
			if(driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers"))
			{
			Assert.assertTrue(true);
			logger.info("Admin Ele Assertion passed : Url is Found correctly");
			}
			else {
			Assert.assertTrue(false);
			logger.info(" Admin Ele Assertion fail : Url is Not-Found correctly");
		}
			logger.info("Admin Element Verified");
		
		hp.clickonPIM();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
			if(driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList"))
			{
			Assert.assertTrue(true);
			
			logger.info("PIM Ele Assertion Passed : Url is Found correctly");
			}
			else {
			Assert.assertTrue(false);
			System.out.println("PIM Assertion fail");
			logger.info("PIM Ele Assertion fail : Url is Not-Found correctly");
			
		}
			logger.info("PIM Element Verified");
			
			hp.clickonLeave();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			String url=driver.getCurrentUrl();
			Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewLeaveList");
			
			logger.info(" Leave Ele Assertion passed : Url Found correctly");
			logger.info("leave Element Verified");
			System.out.println("HomePage Verified");
	}
	

}

