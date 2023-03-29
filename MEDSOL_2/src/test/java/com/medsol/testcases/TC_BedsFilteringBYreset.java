package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Bedspage;
import com.medsol.pageobject.Loginpage;

public class TC_BedsFilteringBYreset  extends baseclass {
	Loginpage OBlogin;
	Bedspage ObNewBed;
		
		@Test(priority=3)
	public void BedsfilteringReset() throws InterruptedException {
		OBlogin = new Loginpage(driver);
		OBlogin.clickonlogin();
		OBlogin.setemail(Email);
		OBlogin.setpassword(pw);
		OBlogin.clickonloginsubmit();

		ObNewBed = new Bedspage(driver);
		ObNewBed.Bedmanagement();
		ObNewBed.Beds();
		Thread.sleep(100);
		ObNewBed.Filterbtn();
		ObNewBed.FilterDropDown();
		ObNewBed.FilterReset();
		ObNewBed.Filterbtn();

		}

	
}
