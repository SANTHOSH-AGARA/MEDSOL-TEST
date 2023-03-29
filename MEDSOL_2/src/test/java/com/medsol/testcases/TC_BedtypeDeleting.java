package com.medsol.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.medsol.pageobject.Bedtypepage;
import com.medsol.pageobject.Loginpage;

public class TC_BedtypeDeleting  extends baseclass{

	Loginpage OBlogin;
	Bedtypepage Obbedtype;
	public String BedType = Readprop.getBedType();
	public String BedType1 = Readprop.getBedmanagementBedtype();

	@Test
	public void BedTypeCreated(){
		OBlogin = new Loginpage(driver);
		OBlogin.clickonlogin();
		OBlogin.setemail(Email);
		OBlogin.setpassword(pw);
		OBlogin.clickonloginsubmit();
		Assert.assertTrue(driver.findElement(By.xpath("(//a[@class='nav-link  d-flex align-items-center py-3'])[1]"))
				.isDisplayed());

		Obbedtype = new Bedtypepage(driver);
		Obbedtype.Bedmanagement();
		try {
			Obbedtype.Bedtypesdelete(BedType);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
