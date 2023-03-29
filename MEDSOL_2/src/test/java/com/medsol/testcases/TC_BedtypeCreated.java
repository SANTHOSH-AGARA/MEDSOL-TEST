package com.medsol.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.medsol.pageobject.Bedtypepage;
import com.medsol.pageobject.Loginpage;

public class TC_BedtypeCreated extends baseclass {

	Loginpage OBlogin;
	Bedtypepage Obbedtype;
	public String BedType = Readprop.getBedType();
	public String BedTypeDescription = Readprop.getBedTypeDescription();

	@Test
	public void BedTypedeleted(){
		OBlogin = new Loginpage(driver);
		OBlogin.clickonlogin();
		OBlogin.setemail(Email);
		OBlogin.setpassword(pw);
		OBlogin.clickonloginsubmit();
		Assert.assertTrue(driver.findElement(By.xpath("(//a[@class='nav-link  d-flex align-items-center py-3'])[1]"))
				.isDisplayed());

		Obbedtype = new Bedtypepage(driver);
		Obbedtype.Bedmanagement();
		Obbedtype.NewBedType();
		Obbedtype.Enterbedtype(BedType);
		Obbedtype.Descreption(BedTypeDescription);
		Obbedtype.save();
	}
}
