package com.medsol.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medsol.testcases.baseclass;

public class Bedspage extends baseclass {

	WebDriver driver;

	public Bedspage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@class='nav-link  d-flex align-items-center py-3'])[6]")
	private WebElement btnBedManagement;

	@FindBy(xpath = "(//li[@class='nav-item position-relative mx-xl-3 mb-3 mb-xl-0 '])[2]")
	private WebElement btnBeds;

	@FindBy(xpath = "//input[@data-datatable-filter='search']")
	private WebElement SearchBoxOfBedType;

	@FindBy(xpath = "(//button[@id='dropdownMenuButton1'])[4]")
	private WebElement btnBedsAction;

	@FindBy(xpath = "//input[@class='form-control w-250px ps-10']")
	private WebElement btnbedsSearch;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/span[1]/*[name()='svg'][1]/*[name()='path'][1]")
	private WebElement btnbedsSearchImage;

	@FindBy(xpath = "(//a[@class='dropdown-item'])[1]")
	private WebElement btnNewbed;

	@FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
	private WebElement btnNewBulkbed;

	@FindBy(xpath = "//input[@id='BedName']")
	private WebElement tbnewBedname;

	@FindBy(xpath = "//span[@aria-controls='select2-bedType-container']")
	private WebElement btnSelectBedType;

	@FindBy(xpath = "//li[@id='select2-bedType-result-m99l-43']")
	private WebElement btnSelectSemiElectric;

	@FindBy(xpath = "//input[@id='bedCharges']")
	private WebElement tbCharges;

	@FindBy(xpath = "//textarea[@id='BedDescription']")
	private WebElement tbDescreption;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]")
	private WebElement btnSave;

	@FindBy(xpath = "(//button[@class='btn btn-secondary'])[2]")
	private WebElement btncancel;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[6]/a[1]/*[name()='svg'][1]/*[name()='path'][1]")
	private WebElement btnEdit;

	@FindBy(xpath = "//a[@title='Delete'and@data-id='6']")
	private WebElement btnDelete;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")
	WebElement searchboxofbedtype;

	@FindBy(xpath = "//input[@id='editBedName']")
	WebElement tbBednameedit;

	@FindBy(xpath = "//span[@aria-labelledby='select2-editBedType-container']")
	WebElement dropdowntoeditbedtype;

	@FindBy(xpath = "//input[@aria-controls='select2-editBedType-results']")
	WebElement SearchEditBedtype;

	@FindBy(xpath = "//input[@id='editBedCharge']")
	WebElement EditCharges;

	@FindBy(xpath = "//textarea[@id='editBedDescription']")
	WebElement EditDiscription;

	@FindBy(xpath = "//button[@id='btnEditSave']")
	WebElement btneditSave;

	@FindBy(xpath = "(//button[text()='Cancel'])[2]")
	WebElement btneditcancel;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[6]/a[2]/*[name()='svg'][1]/*[name()='path'][1]")
	WebElement btnDeleteBed;

	@FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
	WebElement btnconfirmDeleteBed;

	@FindBy(xpath = "(//button[@id='dropdownMenuButton1'])[3]")
	WebElement btnfilter;

	@FindBy(xpath = "//span[@aria-labelledby='select2-bed_filter_status-container']")
	WebElement filterStatusDropdown;

	@FindBy(xpath = "//input[@aria-controls='select2-bed_filter_status-results']")
	WebElement tbSearchfilter;

	@FindBy(xpath = "//li[@id='select2-bed_filter_status-result-59rk-1']")
	WebElement filterOptionAvailable;

	@FindBy(xpath = "//li[@id='select2-bed_filter_status-result-cxcw-2']")
	WebElement filterOptionNotAvailable;

	@FindBy(xpath = "//button[@id='bedResetFilter']")
	WebElement filterOptionReset;

	/*--------------------------------------------------------------------------------------------------------*/

	@FindBy(xpath = "//input[@name='name[]']")
	WebElement tbBulkBedname;

	@FindBy(xpath = "//span[@aria-labelledby='select2-BulkBedType-container']")
	WebElement BedtypeDropDown;

	@FindBy(xpath = "//input[@aria-controls='select2-BulkBedType-results']")
	WebElement BulkbedtypeSearchTB;

	@FindBy(xpath = "//input[@name='charge[]']")
	WebElement bulkBedcharges;

	@FindBy(xpath = "//textarea[@name='description[]']")
	WebElement BulkbedDescription;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]"
			+ "/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]")
	WebElement Bilkbedsave;

	@FindBy(xpath = "//a[text()='Cancel']")
	WebElement BulkbedCancel;

	@FindBy(xpath = "//button[@id='addNewBedItem']")
	WebElement BulkbedAdd;

	@FindBy(xpath = "//a[text()='Back']")
	WebElement BulkbedBack;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]"
			+ "/div[2]/div[1]/form[1]/div[1]/div[1]/table[1]/tbody[1]"
			+ "/tr[1]/td[6]/a[1]/*[name()='svg'][1]/*[name()='path'][1]")
	WebElement btnDeleteAddedBed;

	@FindBy(xpath = "//input[@id='editBedName']")
	WebElement BulkbednameEdit;

	@FindBy(xpath = "//span[@aria-labelledby='select2-editBedType-container']")
	WebElement BulkbedtypeDropDownEdit;

	@FindBy(xpath = "//input[@aria-controls='select2-editBedType-results']")
	WebElement BulkbedTypeSearchboxEdit;

	@FindBy(xpath = "//input[@id='editBedCharge']")
	WebElement BulkbedChargesEdit;

	@FindBy(xpath = "//textarea[@id='editBedDescription']")
	WebElement BulkbedDescriptionEdit;

	@FindBy(xpath = "//button[@id='btnEditSave']")
	WebElement BulkbedEditSave;

	@FindBy(xpath = "//a[text()='Back']")
	WebElement BulkbedEditCancel;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[6]/a[2]/*[name()='svg'][1]/*[name()='path'][1]")
	WebElement btnDeleteBulkbed;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[4]/div[1]/button[1]")
	WebElement btnConfirmDeleteBulkbed;

	public void NewBulkbed() {
		this.btnNewBulkbed.click();
	}

	public void BulkBedname(String bedname) {
		this.tbBulkBedname.sendKeys(bedname);
	}

	public void BedtypeDropDown() {
		this.BedtypeDropDown.click();
	}

	public void BulkbedtypeSearchTB(String bedtype) {
		this.BulkbedtypeSearchTB.sendKeys(bedtype);
		this.BulkbedtypeSearchTB.sendKeys(Keys.ENTER);

	}

	public void bulkBedcharges(String charges) {
		this.bulkBedcharges.sendKeys(charges);
	}

	public void BulkbedDescription(String des) {
		this.BulkbedDescription.sendKeys(des);
	}

	public void Bilkbedsave() {
		this.Bilkbedsave.submit();
	}

	public void BulkbedCancel() {
		this.BulkbedCancel.click();
	}

	public void BulkbedAdd() {
		this.BulkbedAdd.click();
	}

	public void BulkbedBack() {
		this.BulkbedBack.click();
	}

	public void BulkbedDeleteByadding() {
		this.btnDeleteAddedBed.click();
	}

	public void BulkbednameEdit(String bednameEdit) {
		this.BulkbednameEdit.clear();
		this.BulkbednameEdit.sendKeys(bednameEdit);

	}

	public void BulkbedtypeEdit(String bedtypeEdit) {
		this.BulkbedtypeDropDownEdit.click();
		try {
			this.BulkbedTypeSearchboxEdit.sendKeys(bedtypeEdit);
			this.BulkbedTypeSearchboxEdit.sendKeys(Keys.ENTER);

		} catch (Exception e) {
		}
	}

	public void BulkbedChargesEdit(String chargesEdit) {
		this.BulkbedChargesEdit.clear();
		this.BulkbedChargesEdit.sendKeys(chargesEdit);
	}

	public void BulkbedDescriptionEdit(String desEdit) {
		this.BulkbedDescriptionEdit.clear();
		this.BulkbedDescriptionEdit.sendKeys(desEdit);

	}

	public void BulkbedEditSave() {
		this.BulkbedEditSave.submit();
	}

	public void BulkbedEditCancel() {
		this.BulkbedEditCancel.click();
	}

	public void BulkbedDelete() {
		this.btnDeleteBulkbed.click();
	}

	public void ConfirmBulkBedDelete() {
		this.btnConfirmDeleteBulkbed.click();
	}

	/*--------------------------------------------------------------------------*/
	public void Bedmanagement() {
		this.btnBedManagement.click();
	}

	public void Beds() {
		this.btnBeds.click();
	}

	public void BedsAction() {
		this.btnBedsAction.click();
	}

	public void Searchbox() {
		this.btnbedsSearch.sendKeys("single bed1");
		this.btnbedsSearch.sendKeys(Keys.ENTER);
	}

	public void clickonsearchImg() {
		this.btnbedsSearchImage.click();
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// wait.until(ExpectedConditions.elementToBeSelected(btnbedsSearchImage));
	}

	public void newBed() {
		this.btnNewbed.click();
	}

	public void NewBedName(String bedname) {
		this.tbnewBedname.sendKeys(bedname);
	}

	public void Searchbedtype(String bt) {
		// this.btnSelectBedType.click();
		try {
			this.btnSelectBedType.click();

			this.searchboxofbedtype.sendKeys(bt);
			this.searchboxofbedtype.sendKeys(Keys.ENTER);

		} catch (Exception e) {
		}
		// this.searchboxofbedtype.sendKeys(bt);
		// this.searchboxofbedtype.sendKeys(Keys.ENTER);

	}

	public void selectSemielectrical() {
		this.btnSelectSemiElectric.click();
	}

	public void charges(String charges) {
		this.tbCharges.sendKeys(charges);
	}

	public void description(String des) {
		this.tbDescreption.sendKeys(des);
	}

	public void save() {
		try {
			this.btnSave.submit();

		} catch (Exception e) {
		}
		// this.btnSave.submit();
	}

	public void SearchExistingBed(String bedname) {
		this.searchboxofbedtype.click();
		this.searchboxofbedtype.sendKeys(bedname);
		this.searchboxofbedtype.sendKeys(Keys.ENTER);
	}

	public void EditExistingBeds() {
		this.btnEdit.click();
	}

	public void Bednameedit(String editbedname) {
		this.tbBednameedit.clear();
		this.tbBednameedit.sendKeys(editbedname);

	}

	public void dropdowntoeditbedtype(String editBedtype) {
		this.dropdowntoeditbedtype.click();
		try {
			this.SearchEditBedtype.sendKeys(editBedtype);
			this.SearchEditBedtype.sendKeys(Keys.ENTER);
	
		} catch (Exception e) {
			// TODO: handle exception
		}
			}

	public void EditCharges(String editCharge) {
		this.EditCharges.clear();
		this.EditCharges.sendKeys(editCharge);
	}

	public void EditDiscription(String editdes) {
		this.EditDiscription.clear();
		this.EditDiscription.sendKeys(editdes);

	}

	public void editSave() {
		this.btneditSave.submit();
	}

	public void editcancel() {
		this.btneditcancel.click();
	}

	public void deleteBed() {
		this.btnDeleteBed.click();
		this.btnconfirmDeleteBed.click();
	}

	public void Filterbtn() {
		this.btnfilter.click();
	}

	public void FilterDropDown() {
		this.filterStatusDropdown.click();
	}

	public void FilterAvailable() {
		// this.filterOptionAvailable.click();
		try {
			this.tbSearchfilter.sendKeys("Available");
			this.tbSearchfilter.sendKeys(Keys.ENTER);

		} catch (Exception e) {
		}

	}

	public void FilterNotAvailable() {
		// this.filterOptionNotAvailable.click();
		try {
			this.tbSearchfilter.sendKeys("Not Available");
			this.tbSearchfilter.sendKeys(Keys.ENTER);
	
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void FilterReset() {
		// this.filterOptionReset.click();
		this.filterStatusDropdown.sendKeys("All");
		this.filterStatusDropdown.sendKeys(Keys.ENTER);

	}

}
