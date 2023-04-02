package com.orangeHRM.TestCase;

import org.testng.annotations.Test;
import com.orangeHRM.Pom.LogoutPage;

public class TC_Logout_001 extends TC_login_002 {
	
	@Test
	public void Logout() throws InterruptedException {
		Thread.sleep(10000);
		
		LogoutPage lg= new LogoutPage(driver);
		lg.clickontxt();
		Thread.sleep(10000);
		lg.clickonLogout();
		Thread.sleep(10000);
		System.out.println("Logout Successful");
	}

}
