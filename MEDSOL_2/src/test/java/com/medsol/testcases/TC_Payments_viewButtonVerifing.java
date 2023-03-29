package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobject.Loginpage;
import com.medsol.pageobject.PaymentsPage;

public class TC_Payments_viewButtonVerifing  extends baseclass {
	Loginpage OBlogin;
	PaymentsPage ObPayment;
	public String Account = Readprop.getPayments_selectAccount();

	@Test
	public void PaymentCreated() {
		OBlogin = new Loginpage(driver);
		OBlogin.clickonlogin();
		OBlogin.setemail(Email);
		OBlogin.setpassword(pw);
		OBlogin.clickonloginsubmit();

		ObPayment = new PaymentsPage(driver);
		ObPayment.billing();
		ObPayment.payment();
		ObPayment.SearchingPaymentAccount(Account);
		ObPayment.view();
	}
}
