package com.Epsondoms.WelcomeTest;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.Swigy.GenericLybrary.BaseTest;
import com.Swigy.JavaLybrary.JavaUtility;
import com.Swigy.PageRepository.PageManagement;
import com.aventstack.extentreports.Status;


public class VerifyWelcomePageTest extends BaseTest {

	@Test(priority = 1)
	public void verifyWelcomepageWithValidInput() {

		// Create the Test Information
		test = report.createTest("verifyWelcomepageWithValidInput");
		
		// Steps Information
		test.log(Status.INFO, "Execution Starts succefully----->>");
		// Execute the precondition---->1.Launch the broser, 2. navigating to url
		test.log(Status.INFO, "Step1:Launching the browser succeful");

		// implicitlywait
		webdriverobj.waitImplicitly(20);
		
		// Verify the Welcome page title
		Assert.assertEquals("Learning Selenium",webdriverobj.driver.getTitle());
		test.log(Status.PASS, "Title Verified-pass");

		// create object for Pagemanagement
		PageManagementobj = new PageManagement(webdriverobj.driver);

		// verify the name Textfield
		boolean result = PageManagementobj.initWelcomepage().getName().isDisplayed();

		Assert.assertTrue(result);
		test.log(Status.PASS, "name textfield is displayed");

		// step-3 perform action -clear
		PageManagementobj.initWelcomepage().getName().clear();
		test.log(Status.INFO, "Clear Action done Succefully -name");
		JavaUtility.pause(2000);
		// Step-4 perform Action--sendkeys
		PageManagementobj.initWelcomepage().getName().sendKeys(username);
		test.log(Status.INFO, "Sendkeys Action done Succefully -name");
		JavaUtility.pause(2000);

		boolean email = PageManagementobj.initWelcomepage().getName().isDisplayed();

		Assert.assertTrue(email);
		test.log(Status.PASS, "email textfield is displayed");

		PageManagementobj.initWelcomepage().getEmail().sendKeys("charan00013@gmail.com");
		JavaUtility.pause(2000);
		boolean pswd = PageManagementobj.initWelcomepage().getName().isDisplayed();

		Assert.assertTrue(pswd);
		test.log(Status.INFO, "pswd textfield is displayed");

		PageManagementobj.initWelcomepage().getPassword().sendKeys("Ch@ran0013");
		JavaUtility.pause(2000);
		boolean Mobile = PageManagementobj.initWelcomepage().getName().isDisplayed();

		Assert.assertTrue(Mobile);
		Reporter.log("Mobile textfield is displayed", true);

		PageManagementobj.initWelcomepage().getMobile().sendKeys("9959536894");
		JavaUtility.pause(2000);
		boolean Dob = PageManagementobj.initWelcomepage().getName().isDisplayed();

		Assert.assertTrue(Dob);
		test.log(Status.INFO, "Dob textfield is displayed");

		PageManagementobj.initWelcomepage().getDob().sendKeys("18-jun-1996");
		JavaUtility.pause(2000);
		boolean Male = PageManagementobj.initWelcomepage().getName().isDisplayed();

		Assert.assertTrue(Male);
		test.log(Status.INFO, "Male radiao button is displayed");

		PageManagementobj.initWelcomepage().getMale().click();
		JavaUtility.pause(2000);
		boolean place = PageManagementobj.initWelcomepage().getName().isDisplayed();
		if (result) {
			test.log(Status.INFO, "place radiao buttons are displayed");
		} else {
			test.log(Status.INFO, "place radiao buttons are not displayed");
		}
		PageManagementobj.initWelcomepage().getPlaces().click();
		JavaUtility.pause(2000);
		boolean INDIA = PageManagementobj.initWelcomepage().getName().isDisplayed();
		if (result) {
			test.log(Status.INFO, "INDIA dropdown is displayed");
		} else {
			test.log(Status.INFO, "INDIA dropdown is not displayed");
		}
		PageManagementobj.initWelcomepage().getINDIA().click();
		JavaUtility.pause(2000);
		boolean INDIA1 = PageManagementobj.initWelcomepage().getName().isSelected();
		if (result) {
			test.log(Status.INFO, "INDIA1 dropdown is Selected");
		} else {
			test.log(Status.INFO, "INDIA1 dropdown is not Selected");
		}
		JavaUtility.pause(2000);
		boolean Feedback = PageManagementobj.initWelcomepage().getName().isDisplayed();
		if (result) {
			test.log(Status.INFO, "Feedback textfield is displayed");
		} else {
			test.log(Status.INFO, "Feedback textfield is not displayed");
		}
		PageManagementobj.initWelcomepage().getFeedback().sendKeys("hello welcome to these page");
		JavaUtility.pause(2000);
		boolean Register = PageManagementobj.initWelcomepage().getName().isDisplayed();
		if (result) {
			test.log(Status.INFO, "Register submit button is displayed");
		} else {
			test.log(Status.INFO, "Register submit button is not displayed");
		}
		PageManagementobj.initWelcomepage().getRegister().click();
		JavaUtility.pause(2000);
		

		// Soft Asset Statement
		SoftAssert softassertobj = new SoftAssert();

		// verify the contact us HyperLink
		softassertobj.assertEquals("Contact Us", PageManagementobj.initWelcomepage().getContact().getText());
		Reporter.log("Verified text Succefully contact us HyperLink", true);

		softassertobj.assertAll();

		// Execution log or status
		Reporter.log("Execution completed succefully---", true);

	}

	@Test(priority = 2, invocationCount = 2, dependsOnMethods = "verifyWelcomepageWithValidInput")
	public void VerifyWelcomepageWithInvalidInput() {
		// Create the Test Information

		test = report.createTest("verifyWelcomepageWithInValidInput");
		test.log(Status.INFO, "Execution Starts succefully----->>");

		webdriverobj.waitImplicitly(20);

		// verify Title-HardAssertion
		String Exptitle = "Learning Selenium";
		String Acttile = webdriverobj.driver.getTitle();

		Assert.assertEquals(Acttile, Exptitle);
		Reporter.log("Title Verified-pass", true);

		// Create the Test Information
				test = report.createTest("verifyWelcomepageWithValidInput");
				
				// Steps Information
				test.log(Status.INFO, "Execution Starts succefully----->>");
				// Execute the precondition---->1.Launch the broser, 2. navigating to url
				test.log(Status.INFO, "Step1:Launching the browser succeful");

				// implicitlywait
				webdriverobj.waitImplicitly(20);
				
				// Verify the Welcome page title
				Assert.assertEquals("Learning Selenium",webdriverobj.driver.getTitle());
				test.log(Status.PASS, "Title Verified-pass");

				// create object for Pagemanagement
				PageManagementobj = new PageManagement(webdriverobj.driver);

				// verify the name Textfield
				boolean result = PageManagementobj.initWelcomepage().getName().isDisplayed();

				Assert.assertTrue(result);
				test.log(Status.PASS, "name textfield is displayed");

				// step-3 perform action -clear
				PageManagementobj.initWelcomepage().getName().clear();
				test.log(Status.INFO, "Clear Action done Succefully -name");
				JavaUtility.pause(2000);
				// Step-4 perform Action--sendkeys
				PageManagementobj.initWelcomepage().getName().sendKeys("Randamtst");
				test.log(Status.INFO, "Sendkeys Action done Succefully -name");
				JavaUtility.pause(2000);
				
		// to Make
		// Assert.fail();
		Reporter.log("Execution completed succefully---->>", true);
		
		
		
		
	}

}
