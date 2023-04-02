package com.orangeHRM.TestCase;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangeHRM.Pom.Homepage;
import com.orangeHRM.Pom.LoginPage;

public class TC_HomePage_01 extends TC_login_002 {
	
	@Test
	public void HomePage() throws InterruptedException {
		Thread.sleep(10000);
		Homepage hp =new Homepage(driver);
		
		hp.clickonAdmin();
		Thread.sleep(10000);
			if(driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers"))
			{
			Assert.assertTrue(true);
			System.out.println("Admin Assertion Pass");
			}
			else {
			Assert.assertTrue(false);
			System.out.println("Admin Assertion fail");
		}
		
		hp.clickonPIM();
		Thread.sleep(10000);
			if(driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList"))
			{
			Assert.assertTrue(true);
			System.out.println("PIM Assertion Pass");
			}
			else {
			Assert.assertTrue(false);
			System.out.println("PIM Assertion fail");
			
		}
			hp.clickonLeave();
			String url=driver.getCurrentUrl();
			Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewLeaveList");
			System.out.println("Leave Assertion Pass");
	}

}
