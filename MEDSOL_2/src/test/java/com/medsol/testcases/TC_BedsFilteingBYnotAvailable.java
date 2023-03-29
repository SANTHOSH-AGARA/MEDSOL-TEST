package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Bedspage;
import com.medsol.pageobject.Loginpage;

public class TC_BedsFilteingBYnotAvailable  extends baseclass {
	Loginpage OBlogin;
	Bedspage ObNewBed;
		
	@Test
	public void BedsfilteringNotAvailableBeds() throws InterruptedException {
		OBlogin = new Loginpage(driver);
		OBlogin.clickonlogin();
		OBlogin.setemail(Email);
		OBlogin.setpassword(pw);
		OBlogin.clickonloginsubmit();

		ObNewBed = new Bedspage(driver);
		ObNewBed.Bedmanagement();
		ObNewBed.Beds();
		ObNewBed.Filterbtn();
		Thread.sleep(100);
		ObNewBed.FilterDropDown();
		ObNewBed.FilterNotAvailable();
		ObNewBed.Filterbtn();
		}


}
