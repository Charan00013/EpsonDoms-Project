package Demo;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class DemoTest {

	@Test
	public void demoTest1()
	{
		//Create the sparkreport
		ExtentSparkReporter spark=new ExtentSparkReporter("./AdvanceReports/report.html");
		
		//Configure the Sparkreport informtion
		
		spark.config().setDocumentTitle("Regresstion Testing for the Learning Selenium page");
		spark.config().setReportName("RegresstonSuite||Verification of WelcomePage");
		spark.config().setTheme(Theme.DARK);
		
		//Create the Extent Report
		
		ExtentReports report=new ExtentReports();
		
		//Attach the Spark Report and ExtentReport
		report.attachReporter(spark);
		
		//Configure the Syatem Information in Extent Report
		report.setSystemInfo("DeviceName;", "Charan");
		report.setSystemInfo("OperatingSystem", "Windows10");
		report.setSystemInfo("Browser", "chrome");
		report.setSystemInfo("BrowserVersion", "chrome-123.0.6312.106");
		
		
		//Create the Test Information
		
		ExtentTest test=report.createTest("RegresstionTest");
		
		//Steps Information
		test.log(Status.INFO, "Step1:Launching the browser succeful");
		test.log(Status.INFO, "Step2:navigating to Application via URL Sucessful");
		test.log(Status.PASS, "Step3:Verified the Webpage Sucessful");
		
		if("Charan".equals("Charan"))
		{
			test.log(Status.PASS, "Step4:Verified the WebElementis Displayed");
			
		}
		else
		{
			test.log(Status.FAIL, "Step4:Verified the WebElemetis not Displayed");
		}
		
		//
		//test.log(Status.SKIP, "Step5:Element is Hidden");
		
		//Flush the Report information
		report.flush();
		
		System.out.println("Execution done");
	}
	
	@Test
	public void DemoTest2()
	{
		
		
	}
	
	@Test
	public void DemoTest3()
	{
		
		
	}
	
	@Test
	public void DemoTest4()
	{
		
		
	}
	
	@Test
	public void DemoTest5()
	{
		
		
	}
	
	@Test
	public void DemoTest6()
	{
		
		
	}
}
