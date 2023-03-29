package com.medsol.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;

public class TC_Login extends baseclass{
Loginpage OBlogin;

@Test
public void Login() {
OBlogin=new Loginpage(driver);
OBlogin.clickonlogin();
OBlogin.setemail(Email);
OBlogin.setpassword(pw);
OBlogin.clickonloginsubmit();
Assert.assertTrue(driver.findElement(By.xpath("(//a[@class='nav-link  d-flex align-items-center py-3'])[1]")).isDisplayed());
}}


