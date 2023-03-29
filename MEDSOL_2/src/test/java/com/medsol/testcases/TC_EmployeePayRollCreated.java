package com.medsol.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.medsol.pageobject.Employeepayrollpage;
import com.medsol.pageobject.Loginpage;

public class TC_EmployeePayRollCreated extends baseclass {
	Loginpage OBlogin;
	Employeepayrollpage OBEmpPayroll;
	public String SlNO = Readprop.getEmployeePayrollSLNO();
	public String Role = Readprop.getEmployeePayroll_Role();
	public String Mon = Readprop.getEmployeePayroll_month();
	public String YY = Readprop.getEmployeePayroll_year();
	public String BaseSal = Readprop.getEmployeePayroll_BasicSalary();
	public String Allowance = Readprop.getEmployeePayroll_Allowance();
	public String Deduc = Readprop.getEmployeePayroll_Deduction();
	public String Status = Readprop.getEmployeePayroll_Status();

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
		OBEmpPayroll.NewemployeePayrollbtn();
		OBEmpPayroll.SL_NOTb(SlNO);
		OBEmpPayroll.rollDropDown();
		OBEmpPayroll.rollSearchbox(Role);
		OBEmpPayroll.EpmloyeeDropDown();
		//OBEmpPayroll.EmployeeSearchbox(Emp);
		OBEmpPayroll.MonthDropDown();
		OBEmpPayroll.MonthSearchBox(Mon);
		OBEmpPayroll.YearTb(YY);
		OBEmpPayroll.StatusDropDown();
		OBEmpPayroll.StatusSearch(Status);
		OBEmpPayroll.BAsicsalTB(BaseSal);
		OBEmpPayroll.AllowanceTB(Allowance);
		OBEmpPayroll.DeductionTB(Deduc);
		OBEmpPayroll.Save();

	}
}
