package com.medsol.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.PaymentsPage;

public class TC_Payment_cancelButtonVerifiing extends baseclass {
	Loginpage OBlogin;
	PaymentsPage ObPayment;

	@Test
	public void PaymentCreated() {
		OBlogin = new Loginpage(driver);
		OBlogin.clickonlogin();
		OBlogin.setemail(Email);
		OBlogin.setpassword(pw);
		OBlogin.clickonloginsubmit();

		Assert.assertTrue(driver.findElement(By.xpath("(//a[@class='nav-link  d-flex align-items-center py-3'])[1]"))
				.isDisplayed());

		ObPayment = new PaymentsPage(driver);
		ObPayment.billing();
		ObPayment.payment();
		ObPayment.action();
		ObPayment.newpayment();
		ObPayment.cancel();
	}

}
