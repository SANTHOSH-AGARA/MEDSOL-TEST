package com.medsol.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.medsol.pageobject.Employeepayrollpage;
import com.medsol.pageobject.Loginpage;

public class TC_EmployeepayrollFilterdbyReset  extends baseclass {
	Loginpage OBlogin;
	Employeepayrollpage OBEmpPayroll;

		@Test
	public void bedCreated() throws InterruptedException {
		OBlogin = new Loginpage(driver);
		OBlogin.clickonlogin();
		OBlogin.setemail(Email);
		OBlogin.setpassword(pw);
		OBlogin.clickonloginsubmit();
		Assert.assertTrue(driver.findElement(By.xpath("(//a[@class='nav-link  d-flex align-items-center py-3'])[1]"))
				.isDisplayed());

		OBEmpPayroll = new Employeepayrollpage(driver);
		OBEmpPayroll.Billing();
		OBEmpPayroll.Epmloyeepayroll();
		OBEmpPayroll.Filterbtn();
		OBEmpPayroll.ResetBtn();
		OBEmpPayroll.Filterbtn();
		}


}
