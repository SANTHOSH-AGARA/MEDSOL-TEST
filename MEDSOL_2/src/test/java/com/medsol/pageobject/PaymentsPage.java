package com.medsol.pageobject;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PaymentsPage {

	public PaymentsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@class='nav-link  d-flex align-items-center py-3'])[5]")
	WebElement btnBilling;

	@FindBy(xpath = "(//li[@class='nav-item position-relative mx-xl-3 mb-3 mb-xl-0 '])[4]")
	private WebElement payments;

	@FindBy(xpath = "//a[@id='dropdownMenuButton']")
	private WebElement btnactions;

	@FindBy(xpath = "(//a[@class='dropdown-item text-left'])[1]")
	private WebElement btnNewpayment;

	@FindBy(xpath = "//a[normalize-space()='Export to Excel']")
	private WebElement btnExporttoExcel;

	@FindBy(xpath = "//body/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/span[2]/span[1]/span[1]")
	private WebElement tbselectaccount;

	@FindBy(xpath = "//input[@role='searchbox']")
	private WebElement tbsearchaccount;

	@FindBy(id = "paymentDate")
	private WebElement paymentdate;

	@FindBy(xpath = "//select[@aria-label='Month']")
	private WebElement tbselectmonth;

	@FindBy(xpath = "//input[@aria-label='Year']")
	private WebElement tbselectyear;

	@FindBy(xpath = "//span[@class='arrowUp']")
	private WebElement ArrowUp;

	@FindBy(xpath = "//span[@class='arrowDown']")
	private WebElement ArrowDown;

	@FindBy(xpath = "//div[@class='dayContainer']/span")
	private List<WebElement> tbselectdate;

	@FindBy(id = "amount")
	private WebElement tbamount;

	@FindBy(xpath = "//input[@id='pay_to']")
	private WebElement tbpayto;

	@FindBy(xpath = "//textarea[@id='description']")
	private WebElement tbdescription;

	@FindBy(xpath = "//input[@id='btnPaymentSave']")
	private WebElement btnsave;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/"
			+ "div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")
	private WebElement tbSearchingPaymentAccount;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]"
			+ "/div[3]/table[1]/tbody[1]/tr[1]/td[5]/a[2]/*[name()='svg'][1]")
	private WebElement btnEdit;

	@FindBy(xpath = "//a[@data-id='12'][@title='Delete']")
	private WebElement btnDelet;

	@FindBy(xpath = "(//a[@href='javascript:void(0)'])[7]")
	private WebElement btnView;

	@FindBy(xpath = "//a[@class='btn btn-secondary']")
	private WebElement btnCancel;

	@FindBy(xpath = "//a[@class='btn btn-outline-primary']")
	private WebElement btnback;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[4]/div[1]/button[1]")
	private WebElement confirmdelete;

	public void SearchingPaymentAccount(String AccountName) {
		this.tbSearchingPaymentAccount.sendKeys(AccountName);
		this.tbSearchingPaymentAccount.sendKeys(Keys.ENTER);

	}

	public void modifyPayment() {
		this.btnEdit.click();
		this.tbamount.clear();
		this.tbamount.sendKeys("15000");
		this.tbpayto.clear();
		this.tbpayto.sendKeys("blood checkup");
		this.tbdescription.clear();
		this.tbdescription.sendKeys("payment Balance");
		this.btnsave.submit();
	}

	public void billing() {
		this.btnBilling.click();
	}

	public void action() {
		this.btnactions.click();
	}

	public void payment() {
		this.payments.click();
	}

	public void newpayment() {
		this.btnNewpayment.click();
	}

	public void selectaccount(String Account) {
		this.tbselectaccount.click();
		this.tbsearchaccount.click();
		this.tbsearchaccount.sendKeys(Account);
		this.tbsearchaccount.sendKeys(Keys.ENTER);
	}

	public void date(String MM, String YYYY, String DD) {
		this.paymentdate.click();
		boolean flag = true;
		while (flag) {
			String currentYear = tbselectyear.getText();
			String expectedYear = YYYY;
			if (currentYear.contentEquals(expectedYear)) {
				this.ArrowDown.click();
			} else {
				flag = false;
			}
		}

		Select monthDropdown = new Select(tbselectmonth);
		monthDropdown.selectByVisibleText(MM);

		for (WebElement el : tbselectdate) {
			String Date = el.getText();
			if (Date.equals(DD)) {
				el.click();
				break;
			}
		}

	}

	public void payto(String payto) {
		this.tbpayto.sendKeys(payto);
	}

	public void amount(String Amount) {
		this.tbamount.sendKeys(Amount);
	}

	public void description(String Description) {
		this.tbdescription.sendKeys(Description);
	}

	public void cancel() {
		this.btnCancel.click();
	}

	public void back() {
		this.btnback.click();
	}

	public void save() {
		this.btnsave.submit();
	}

	public void view() {
		this.btnView.click();
	}

	public void ExporttoExcel() {
		this.btnExporttoExcel.click();
	}

	public void delete() throws InterruptedException {
		try {
			this.btnDelet.click();

		} catch (Exception e) {
		}
		Thread.sleep(10);
		this.confirmdelete.click();
	}

}
