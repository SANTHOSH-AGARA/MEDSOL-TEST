package com.medsol.testcases;

import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.medsol.utilities.ReadConfig;

public class baseclass{

	public static final String useDir = System.getProperty("user.dir");
	public static final String chromeKey = "webdriver.chrome.driver";
	public static final String geckoKey = "webdriver.gecko.driver";
	public static final String IEKey = "webdriver.ie.driver";
	public static final String chromeValue = useDir + "//drivers//chromedriver.exe";
	public static final String geckoValue = useDir + "//drivers//geckodriver.exe";
	public static final String IEValue = useDir + "//drivers//IEDriverServer.exe";
	//public static final String excelPath = useDir + "//data//excel.xlsx";
	public static WebDriver driver;
	public static ExtentReports report;
	public static ExtentTest Etest;
	public static Properties prop;
	public ReadConfig Readprop = new ReadConfig();
	public String Url = Readprop.getApplicationUrl();
	public String Email = Readprop.getemail();
	public String pw= Readprop.getpassword();


	@BeforeClass
	public void setPath() {
		System.setProperty(chromeKey, chromeValue);
		System.setProperty(geckoKey, geckoValue);
	}

	@Parameters("browser")
	@BeforeMethod
	public void launchBrowser(String bn) {
		if (bn.equals("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
		} else if (bn.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (bn.equals("IE")) {
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get(Url);
	}

	
	
	/*@AfterMethod
	public void getResults(ITestResult result) {
		if (result.getStatus()==ITestResult.FAILURE) {
			Etest.log(LogStatus.FAIL,"Test case failed"+result.getStatus());
			Etest.log(LogStatus.FAIL,"Test case failed"+result.getThrowable());
		}
		else if (result.getStatus()==ITestResult.SKIP) {
			Etest.log(LogStatus.SKIP,"Test case failed"+result.getStatus());
			Etest.log(LogStatus.SKIP,"Test case failed"+result.getThrowable());
		}
		report.endTest(Etest);
	}
	
	
	
	
	/* closes the browser */
	@AfterClass
	public void closebrowser() {
		driver.quit();
	}	
	public String randomstring()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return (generatedstring);
	}
	
	public String randomnum()
	{
		String generatedstring2=RandomStringUtils.randomNumeric(5);
		return (generatedstring2);
	}
		//report.endTest(Etest);
		//report.flush();
	

	
	
	/* kills the driver executables running in the background */
	@AfterSuite
	public void killDriver() {
		try {
			Runtime.getRuntime().exec("taskkill /in chromedriver.exe /t /f");
			Runtime.getRuntime().exec("taskkill /in geckodriver.exe /t /f");
		} catch (Exception e) {
		//report.flush();

		}
	}
}

	
