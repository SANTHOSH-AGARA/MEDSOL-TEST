package com.medsol.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.medsol.pageobject.Bedspage;
import com.medsol.pageobject.Loginpage;

public class TC_BedDeleted extends baseclass {
	Loginpage OBlogin;
	Bedspage ObNewBed;
	public String bedname = Readprop.getBedmanagementBedName();
	public String editbedname = Readprop.getBedmanagementBedEditBedname();
	
	@Test
	public void bedCreated() throws InterruptedException {
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
		ObNewBed.Beds();
		Thread.sleep(10);
		ObNewBed.SearchExistingBed(editbedname);
		ObNewBed.deleteBed();
	}

}
