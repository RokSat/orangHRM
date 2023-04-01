package com.orangeHRM.Pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
 

public class LoginPage {
	
	 WebDriver ldriver;

	
	@FindBy(how=How.NAME, using="username")
	WebElement txtusername;
	
	@FindBy(xpath="//input[@type='password']")
	 WebElement txtpassword;
	
	@FindBy(xpath="//button [@type='submit']")
	 WebElement txtlogin;
	
	 public LoginPage(WebDriver rdriver)
		{ 
			ldriver=rdriver;
		 PageFactory.initElements(rdriver, this);

		}
		public void setupUserName(String uname) throws InterruptedException{
			txtusername.sendKeys(uname);
		}
		public void setupnPassword(String paswrd) {
			txtpassword.sendKeys(paswrd);
			
		}

		public void clickOnLogin() {
			txtlogin.click();
			
		}
	
	}

