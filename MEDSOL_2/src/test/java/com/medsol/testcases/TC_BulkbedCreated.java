package com.medsol.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.medsol.pageobject.Bedspage;
import com.medsol.pageobject.Loginpage;

public class TC_BulkbedCreated extends baseclass {
	Loginpage OBlogin;
	Bedspage ObNewBed;
	public String bedname = Readprop.getBulkbedname();
	public String charges = Readprop.getBulkbedCharges();
	public String des = Readprop.getBulkbedDescription();
	public String bedtype = Readprop.getBulkbedtype();

	@Test
	public void NewBedCreated() throws InterruptedException {
		OBlogin = new Loginpage(driver);
		OBlogin.clickonlogin();
		OBlogin.setemail(Email);
		OBlogin.setpassword(pw);
		OBlogin.clickonloginsubmit();
		Assert.assertTrue(driver.findElement(By.xpath("(//a[@class='nav-link  d-flex align-items-center py-3'])[1]"))
				.isDisplayed());

		ObNewBed = new Bedspage(driver);
		ObNewBed.Bedmanagement();
		ObNewBed.Beds();
		ObNewBed.BedsAction();
		ObNewBed.NewBulkbed();
		ObNewBed.BulkBedname(bedname);
		ObNewBed.BedtypeDropDown();
		ObNewBed.BulkbedtypeSearchTB(bedtype);
		ObNewBed.bulkBedcharges(charges);
		ObNewBed.BulkbedDescription(des);
		// ObNewBed.BulkbedAdd();
		ObNewBed.Bilkbedsave();
		// ObNewBed.BulkbedDelete();

	}
}
