package com.medsol.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Employeepayrollpage {
	public Employeepayrollpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@class='nav-link  d-flex align-items-center py-3'])[5]")
	private WebElement btnBilling;

	@FindBy(xpath = "(//li[@class='nav-item position-relative mx-xl-3 mb-3 mb-xl-0 '])[2]")
	private WebElement btnEpmloyeepayroll;

	@FindBy(xpath = "//input[@placeholder='Search'][@data-datatable-filter='search']")
	private WebElement TbsearchOfEmployeepayroll;

	@FindBy(xpath = "//button[@id='accountantFilterBtn']")
	private WebElement Filterbtn;

	@FindBy(xpath = "//span[@aria-labelledby='select2-employee_payroll_filter_status-container']")
	private WebElement FilterStatusDropdown;

	@FindBy(xpath = "//input[@aria-controls='select2-employee_payroll_filter_status-results']")
	private WebElement FilterOptionSearchTB;

	@FindBy(xpath = "//button[@id='ePayrollResetFilter']")
	private WebElement ResetBtn;

	@FindBy(xpath = "//a[text()='New Employee Payroll']")
	private WebElement NewemployeePayrollbtn;

	@FindBy(xpath = "//input[@id='sr_no']")
	private WebElement SL_NOTb;

	@FindBy(xpath = "//span[@aria-labelledby='select2-type-container']")
	private WebElement rollDropDown;

	@FindBy(xpath = "//input[@aria-controls='select2-type-results']")
	private WebElement rollSearchbox;

	@FindBy(xpath = "//span[@aria-labelledby='select2-ownerType-container']")
	private WebElement EpmloyeeDropDown;

	@FindBy(xpath = "//input[@aria-controls='select2-ownerType-results']")
	private WebElement EmployeeSearchbox;

	@FindBy(xpath = "//span[@aria-labelledby='select2-month-container']")
	private WebElement MonthDropDown;

	@FindBy(xpath = "//input[@aria-controls='select2-month-results']")
	private WebElement MonthSearchBox;

	@FindBy(xpath = "//span[@aria-labelledby='select2-status-container']")
	private WebElement StatusDropDown;

	@FindBy(xpath = "//input[@aria-controls='select2-status-results']")
	private WebElement StatusSearch;

	@FindBy(xpath = "//input[@id='year']")
	private WebElement YearTb;

	@FindBy(xpath = "//input[@id='editBasicSalary']")
	private WebElement BAsicsalTB;

	@FindBy(xpath = "//input[@id='allowance']")
	private WebElement AllowanceTB;

	@FindBy(xpath = "//input[@id='deductions']")
	private WebElement DeductionTB;

	@FindBy(xpath = "//input[@id='empPayrollSave']")
	private WebElement SaveBTN;

	@FindBy(xpath = "//a[text()='Cancel']")
	private WebElement CancelBTn;

	public void searchOfEmployeepayroll() {
		try {
			this.TbsearchOfEmployeepayroll.sendKeys("");
			this.TbsearchOfEmployeepayroll.sendKeys(Keys.ENTER);

		} catch (Exception e) {
		}
	}

	public void Epmloyeepayroll() {
		this.btnEpmloyeepayroll.click();
	}

	public void Billing() {
		this.btnBilling.click();
	}

	public void Filterbtn() {
		this.Filterbtn.click();
	}

	public void FilterStatusDropdown() {
		this.FilterStatusDropdown.click();
	}

	public void FilterOptionSearchTB(String OPtion) {
		try {
			this.FilterOptionSearchTB.sendKeys(OPtion);
			this.FilterOptionSearchTB.sendKeys(Keys.ENTER);

		} catch (Exception e) {
		}
	}

	public void ResetBtn() {
		this.ResetBtn.click();
	}

	public void NewemployeePayrollbtn() {
		this.NewemployeePayrollbtn.click();
	}

	public void YearTb(String Year) {
		this.YearTb.sendKeys(Year);
	}

	public void rollDropDown() {
		this.rollDropDown.click();
	}

	public void rollSearchbox(String Roll) {
		try {
			this.rollSearchbox.sendKeys(Roll);
			this.rollSearchbox.sendKeys(Keys.ENTER);
		} catch (Exception e) {
		}
	}

	public void EpmloyeeDropDown() {
		this.EpmloyeeDropDown.click();
	}

	public void EmployeeSearchbox(String Emp) {
		try {
			this.EmployeeSearchbox.sendKeys(Emp);
			this.EmployeeSearchbox.sendKeys(Keys.ENTER);

		} catch (Exception e) {
		}
	}

	public void MonthDropDown() {
		this.MonthDropDown.click();
	}

	public void MonthSearchBox(String MOn) {
		try {
			this.MonthSearchBox.sendKeys(MOn);
			this.MonthSearchBox.sendKeys(Keys.ENTER);

		} catch (Exception e) {
		}
	}

	public void StatusDropDown() {
		this.StatusDropDown.click();
	}

	public void StatusSearch(String Status) {
		this.StatusSearch.sendKeys(Status);
		this.StatusSearch.sendKeys(Keys.ENTER);
	}

	public void SL_NOTb(String SlnO) {
		this.SL_NOTb.click();
		this.SL_NOTb.sendKeys(SlnO);
	}

	public void BAsicsalTB(String Bsaesal) {
		this.BAsicsalTB.sendKeys(Bsaesal);
	}

	public void AllowanceTB(String Allowance) {
		this.AllowanceTB.sendKeys(Allowance);
	}

	public void DeductionTB(String Deduction) {
		this.DeductionTB.sendKeys(Deduction);
	}

	public void Save() {
		this.SaveBTN.submit();
	}

	public void Cancel() {
		this.CancelBTn.click();
	}

}
