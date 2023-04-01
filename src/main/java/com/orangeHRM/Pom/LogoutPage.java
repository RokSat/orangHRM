package com.orangeHRM.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	WebDriver ldriver;
	
	@FindBy(xpath="//span [@class='oxd-userdropdown-tab']")
	WebElement txt1;
	
	/*@FindBy(linkText="Logout")
	WebElement txt2;
	*/
	//or
	@FindBy(how=How.LINK_TEXT, using="Logout")
	WebElement txt2;
	
	
	
	public LogoutPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this); 
		
	}
	public void clickontxt() {
		txt1.click();
	}
	public void clickonLogout() {
		txt2.click();
	}

}
