package com.medsol.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	
	//WebDriver ldriver;

	public Loginpage(WebDriver driver) {
		
		//ldriver=rdriver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//a[contains(@class,'btn btn-success me-2 mb-3 mb-xl-0')]")
	WebElement loginbutton;
	
	@FindBy(name="email")
	WebElement txtemail;
	
	@FindBy(name="password")
	WebElement txtpassword;
	
	@FindBy(xpath="//button[contains(@class,'btn btn-primary')]")
	WebElement loginbuttonsubmit;
	
	@FindBy(xpath="//div[@class='dropdown d-flex align-items-center py-4']//button[@id='dropdownMenuButton1']//*[name()='svg']")
	WebElement logoutdropdown;
	
	@FindBy(xpath="//a[normalize-space()='Logout']")
	WebElement logoutbutton;
	
	public void clickonlogin() {
		loginbutton.click();
	}
	
	public void setemail(String userid) {
		txtemail.sendKeys(userid);
		
	}
	
	public void setpassword(String pwd) {
		txtpassword.sendKeys(pwd);
		
	}
	
	public void clickonloginsubmit() {
		loginbuttonsubmit.click();
	}
	
	public void clickonlogoutdropdown() {
		logoutdropdown.click();
	}
	
	public void clickonlogoutbutton() {
		logoutbutton.click();
	}
	
	
	
}



