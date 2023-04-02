package com.orangeHRM.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']) [1]")
	 WebElement Admin;
	
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']) [2]")
	 WebElement PIM;
	
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']) [3]")
	 WebElement Leave;
	
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']) [4]")
	 WebElement Time;
	
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']) [5]")
	 WebElement Recruitment;
	
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']) [6]")
 	 WebElement My_info;
	
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']) [7]")
	 WebElement Performance;
	
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']) [8]")
	 WebElement DashBord;
	
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[9]")
	 WebElement Directory;
	
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']) [10]")
	 WebElement Maintanance;
	
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']) [11]")
	 WebElement Buzz;
	
	@FindBy(xpath="//button[@type='button']")
	 WebElement Arw;
	
	@FindBy(xpath="(//div[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--white orangehrm-directory-card'])[2]")
	 WebElement ProfileE;
	
	
	
	
	public Homepage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		}
			public void clickonAdmin() {
			Admin.click();
			}
		
			public void clickonPIM() {
			PIM.click();
			}
			
			public void clickonLeave() {
			Leave.click();
			}
			public void clickonTime() {
				Time.click();
			}
			public void Recruitment() {
				Recruitment.click();
			}
			public void clickonMy_info() {
			My_info.click();
			}
			
			public void clickonPerformance() {
			Performance.click();
			}
			public void clickonDashBord() {
				DashBord.click();
			}
			
			public void clickOnDirectory() {
				Directory.click();
			}
			public void clickOnMaintanance() {
				Maintanance.click();
			}
			public void clickOnBuzz() {
				Buzz.click();
			}
			
			public void clickOnArw(WebDriver driver) {
				//Wait_On_Explicite.wait_for_element(Arw, driver);
				//if(Arw.equals(Arw))
				
				Arw.click();
				boolean AD=Arw.isDisplayed();
				boolean AE=Arw.isEnabled();
				
				if(AD==true && AE==true) {
				System.out.println("WebElement Arw is Displayed and Enabled ");
				}else
				{
				System.out.println("WebElement Arw is not Displayed and UnEnabled ");
				}
			}
			
			}	



