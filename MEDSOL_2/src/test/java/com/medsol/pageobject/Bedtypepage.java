package com.medsol.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Bedtypepage  {
	public Bedtypepage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@class='nav-link  d-flex align-items-center py-3'])[6]")
	private WebElement btnBedManagement;

	@FindBy(xpath = "//a[@class='btn btn-primary']")
	private WebElement btnNewBedtype;

	@FindBy(xpath = "//input[@id='BedTypeTitle']")
	private WebElement tbBedtype;

	@FindBy(xpath = "//textarea[@id='BedTypeDescription']")
	private WebElement tbDescreption;

	@FindBy(xpath = "//button[@id='BedTypesBtnSave']")
	private WebElement btnSave;

	@FindBy(xpath = "(//button[@class='btn btn-secondary'])[1]")
	private WebElement btnCancel;

	@FindBy(xpath = "(//li[@class='nav-item position-relative mx-xl-3 mb-3 mb-xl-0 '])[1]")
	private WebElement btnBedTypes;

	@FindBy(xpath = "//input[@class='form-control w-250px ps-10']")
	private WebElement btnbedtypeSearch;

	@FindBy(xpath = "//span[@class='position-absolute d-flex align-items-center top-0 bottom-0 left-0 text-gray-600 ms-3']")
	private WebElement btnbedtypeSearchimage;

	
	@FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
	private WebElement BtnconfirmDelete;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/a[2]/*[name()='svg'][1]/*[name()='path'][1]")
	private WebElement BtnDelete;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/a[1]/*[name()='svg'][1]")
	private WebElement btnEdit;

	@FindBy(xpath = "//input[@id='BedTypeEditTitle']")
	private WebElement tbEditbedtype;

	@FindBy(xpath = "//textArea[@id='BedTypeEditDescription']")
	private WebElement tbeditdes;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[2]/button[1]")
	private WebElement btnsaveEdit;


	
	public void Bedmanagement() {
		this.btnBedManagement.click();
	}

	public void NewBedType() {
		this.btnNewBedtype.click();
	}

	public void Enterbedtype(String BT) {
		this.tbBedtype.sendKeys(BT);
	}

	public void Descreption(String DES) {
		this.tbDescreption.sendKeys(DES);
	}

	public void DescreptionEdit(String Description) {
	this.tbeditdes.clear();
	this.tbeditdes.sendKeys(Description);
	}
	public void save() {
		this.btnSave.submit();
	}

	public void Cancel() {
		this.btnCancel.click();
	}

	public void Bedtypes() {
		this.btnBedTypes.click();
	}
	
	public void Bedtypesdelete(String Bedtype) throws InterruptedException {
		this.btnbedtypeSearch.sendKeys(Bedtype);
		this.btnbedtypeSearchimage.click();
		this.BtnDelete.click();
		this.BtnconfirmDelete.click();
	}
	
	public void BedtypesEdit(String BT,String Bedtype) throws InterruptedException {
		this.btnbedtypeSearch.sendKeys(BT);
		this.btnbedtypeSearchimage.click();
		this.btnEdit.click();
		this.tbEditbedtype.clear();
	    this.tbEditbedtype.sendKeys(Bedtype);	
	}
	public void saveEdit() {
		this.btnsaveEdit.submit();
	}

	
}



