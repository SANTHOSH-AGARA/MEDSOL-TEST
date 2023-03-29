package com.medsol.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;

	public ReadConfig() {
		File src = new File("./Confoguration/Config.properties");

		try {
			FileInputStream file = new FileInputStream(src);
			pro = new Properties();
			pro.load(file);
		} catch (Exception e) {
			System.out.println("Exception is" + e.getMessage());
		}
	}

	public String getApplicationUrl() {
		String url = pro.getProperty("URL");
		return url;
	}

	public String getemail() {
		String email = pro.getProperty("E-MAil");
		return email;
	}

	public String getpassword() {
		String pw = pro.getProperty("PW");
		return pw;
	}

	public String getEmployeePayrollSLNO() {
		String EmployeePayrollSLNO = pro.getProperty("EmployeePayrollSLNO");
		return EmployeePayrollSLNO;
	}

	public String getEmployeePayroll_Role() {
		String EmployeePayroll_Role = pro.getProperty("EmployeePayroll_Role");
		return EmployeePayroll_Role;
	}

	public String getEmployeePayroll_month() {
		String EmployeePayroll_month = pro.getProperty("EmployeePayroll_month");
		return EmployeePayroll_month;
	}

	public String getEmployeePayroll_year() {
		String EmployeePayroll_year = pro.getProperty("EmployeePayroll_year");
		return EmployeePayroll_year;
	}

	public String getEmployeePayroll_BasicSalary() {
		String EmployeePayroll_BasicSalary = pro.getProperty("EmployeePayroll_BasicSalary");
		return EmployeePayroll_BasicSalary;
	}

	public String getEmployeePayroll_Allowance() {
		String EmployeePayroll_Allowance = pro.getProperty("EmployeePayroll_Allowance");
		return EmployeePayroll_Allowance;
	}

	public String getEmployeePayroll_Deduction() {
		String EmployeePayroll_Deduction = pro.getProperty("EmployeePayroll_Deduction");
		return EmployeePayroll_Deduction;
	}

	public String getEmployeePayroll_Status() {
		String EmployeePayroll_Status = pro.getProperty("EmployeePayroll_Status");
		return EmployeePayroll_Status;
	}

	public String getEmployeePayroll_Status1() {
		String EmployeePayroll_Status1 = pro.getProperty("EmployeePayroll_Status1");
		return EmployeePayroll_Status1;
	}

	public String getPayments_selectAccount() {
		String Payments_selectAccount = pro.getProperty("Payments_selectAccount");
		return Payments_selectAccount;
	}

	public String getPayments_PaymentDate_month() {
		String Payments_PaymentDate_month = pro.getProperty("Payments_PaymentDate_month");
		return Payments_PaymentDate_month;
	}

	public String getPayments_PaymentDate_year() {
		String Payments_PaymentDate_year = pro.getProperty("Payments_PaymentDate_year");
		return Payments_PaymentDate_year;
	}

	public String getPayments_Amount() {
		String Payments_Amount = pro.getProperty("Payments_Amount");
		return Payments_Amount;
	}

	public String getPayments_Description() {
		String Payments_Description = pro.getProperty("Payments_Description");
		return Payments_Description;
	}

	public String getPayments_date() {
		String Payments_date = pro.getProperty("Payments_date");
		return Payments_date;
	}

	public String getpayment_payto() {
		String payment_payto = pro.getProperty("payment_payto");
		return payment_payto;
	}

	public String getBedType() {
		String BedType = pro.getProperty("BedType");
		return BedType;
	}

	public String getBedTypeDescription() {
		String BedTypeDescription = pro.getProperty("BedTypeDescription");
		return BedTypeDescription;
	}

	public String getBedmanagementBedName() {
		String BedmanagementBedName = pro.getProperty("BedmanagementBedName");
		return BedmanagementBedName;
	}

	public String getBedmanagementCharge() {
		String BedmanagementCharge = pro.getProperty("BedmanagementCharge");
		return BedmanagementCharge;
	}

	public String getBedmanagementDescription() {
		String BedmanagementDescription = pro.getProperty("BedmanagementDescription");
		return BedmanagementDescription;
	}

	public String getBedmanagementBedtype() {
		String BedmanagementBedtype = pro.getProperty("BedmanagementBedtype");
		return BedmanagementBedtype;
	}

	public String getBedmanagementBedEditBedname() {
		String BedmanagementBedEditBedname = pro.getProperty("BedmanagementBedEditBedname");
		return BedmanagementBedEditBedname;
	}

	public String getBedmanagementBedEditcharges() {
		String BedmanagementBedEditcharges = pro.getProperty("BedmanagementBedEditcharges");
		return BedmanagementBedEditcharges;
	}

	public String getBedmanagementBedEditbedtype() {
		String BedmanagementBedEditbedtype = pro.getProperty("BedmanagementBedEditbedtype");
		return BedmanagementBedEditbedtype;
	}

	public String getBedmanagementBedEditdescription() {
		String BedmanagementBedEditdescription = pro.getProperty("BedmanagementBedEditdescription");
		return BedmanagementBedEditdescription;
	}

	public String getBulkbedname() {
		String Bulkbedname = pro.getProperty("Bulkbedname");
		return Bulkbedname;
	}

	public String getBulkbedtype() {
		String Bulkbedtype = pro.getProperty("Bulkbedtype");
		return Bulkbedtype;
	}

	public String getBulkbedCharges() {
		String BulkbedCharges = pro.getProperty("BulkbedCharges");
		return BulkbedCharges;
	}

	public String getBulkbedDescription() {
		String BulkbedDescription = pro.getProperty("BulkbedDescription");
		return BulkbedDescription;
	}

	public String getBulkbednameEdit() {
		String BulkbednameEdit = pro.getProperty("BulkbednameEdit");
		return BulkbednameEdit;
	}

	public String getBulkbedtypeEdit() {
		String BulkbedtypeEdit = pro.getProperty("BulkbedtypeEdit");
		return BulkbedtypeEdit;
	}

	public String getBulkbedChargesEdit() {
		String BulkbedChargesEdit = pro.getProperty("BulkbedChargesEdit");
		return BulkbedChargesEdit;
	}

	public String getBulkbedDescriptionEdit() {
		String BulkbedDescriptionEdit = pro.getProperty("BulkbedDescriptionEdit");
		return BulkbedDescriptionEdit;
	}

}
