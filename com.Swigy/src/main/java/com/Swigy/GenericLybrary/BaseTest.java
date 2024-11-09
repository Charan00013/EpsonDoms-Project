package com.Swigy.GenericLybrary;

/**
 * This Class is used for Configure all the PreCondition and PostCondition for TestScript
 * And Also initializing All the Library_utility class
 * 
 * 
 * @author lenovo*/

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.Swigy.ExcelFileLybrary.ReadExcelFile;
import com.Swigy.PageRepository.PageManagement;
import com.Swigy.PropertyFileLybrery.ReadPropertyFile;
import com.Swigy.WebDriverLybrary.WebDriverUtility;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public PageManagement PageManagementobj;
	public WebDriverUtility webdriverobj;
	public ReadExcelFile excelutilityobj;
	public ReadPropertyFile Propertyfileobj;
	public String username; 
	public ExtentSparkReporter spark;
	public ExtentReports report;
	public ExtentTest test;
	
	
	@BeforeSuite
	public void Suitesetup()
	{
		
		//Create the sparkreport
		 spark=new ExtentSparkReporter("./AdvanceReports/report.html");
				
				//Configure the Sparkreport informtion
				
				spark.config().setDocumentTitle("Regresstion Testing for the Learning Selenium page");
				spark.config().setReportName("RegresstonSuite||Verification of WelcomePage");
				spark.config().setTheme(Theme.STANDARD);
				
				//Create the Extent Report
				
				report=new ExtentReports();
				
				//Attach the Spark Report and ExtentReport
				report.attachReporter(spark);
				
				//Configure the System Information in Extent Report
				report.setSystemInfo("DeviceName;", "Charan");
				report.setSystemInfo("OperatingSystem", "Windows10");
				report.setSystemInfo("Browser", "chrome");
				report.setSystemInfo("BrowserVersion", "chrome-123.0.6312.106");
	
	}
	
	
	@AfterSuite
	public void suiteTerminateSetup()
	{
		
		//Flush the Report information
		report.flush();
	}
	
	
	@Parameters({"browsername","weburl"})
	@BeforeClass
	public void BrowserSetup(String browser, String url) {
		
		//Create Object for all the repository/Utility
		createObjects();

		//Fetch the Username
		username=excelutilityobj.readSingleData("RegisterData", 1, 1);
		//Launch the browser
		webdriverobj.launchBrowser(browser);

		
		Reporter.log("succefully launched the browser", true);
		// Maximize the browser
		webdriverobj.maximizeTheBroser();

		Reporter.log("maximize the browser", true);
		// Step-2 Navigating to the PPlication via url
		//String url=ReadPropertyFile.readData("weburl");
		webdriverobj.NavigateToApplication(url);
	
		Reporter.log("Succefully navigated to the given url", true);

	}

	@AfterClass
	public void terminateBrowser() {
		
		webdriverobj.closeAllTheBroser();
		Reporter.log("close the browser success", true);
	}
	
	public void createObjects()
	{
		 webdriverobj = new WebDriverUtility();
		 excelutilityobj = new ReadExcelFile();
		 Propertyfileobj =new ReadPropertyFile();
		 
	}
	

}
