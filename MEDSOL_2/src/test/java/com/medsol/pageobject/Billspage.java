package com.medsol.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Billspage {
	public Billspage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@class='nav-link  d-flex align-items-center py-3'])[5]")
	private WebElement btnBilling;

	@FindBy(xpath="(//li[@class='nav-item position-relative mx-xl-3 mb-3 mb-xl-0 '])[7]")
	private WebElement btnbills;

	@FindBy(xpath="//input[@data-datatable-filter='search']")
	private WebElement tbSearchBoxOfBills;

	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/a[1]")
	private WebElement btnBewbill;

	@FindBy(xpath="//span[@aria-labelledby='select2-patientAdmissionId-container']")
	private WebElement AdmissionIDdropdown;

	@FindBy(xpath="/html[1]/body[1]/span[1]/span[1]/span[1]/input[1]")
	private WebElement SearchBoxofAdmissionID;

	@FindBy(xpath="//a[text()='Back']")
	private WebElement BtnBackOfNewBill;

	@FindBy(xpath="//button[@id='addBillItem']")
	private WebElement BtnAddofNewBill;

	@FindBy(xpath="//input[@name='item_name[]']")
	private WebElement tbItemname;

	@FindBy(xpath="//input[@name='qty[]']")
	private WebElement tbQuantity;

	@FindBy(xpath="//input[@name='price[]']")
	private WebElement tbPrice;

	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/"
			+ "div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[2]/table[1]"
			+ "/tbody[1]/tr[1]/td[6]/*[name()='svg'][1]/*[name()='path'][1]")
	private WebElement BtnDelete;

	@FindBy(xpath="//input[@id='billSave']")
	private WebElement BtnSave;

	@FindBy(xpath="//a[text()='Cancel']")
	private WebElement Btncancel;

	@FindBy(xpath="//input[@id='genderMale']")
	private WebElement maleRadiobutton;

	@FindBy(xpath="//input[@id='genderFemale']")
	private WebElement femaleRadiobutton;

	
	
	
}



