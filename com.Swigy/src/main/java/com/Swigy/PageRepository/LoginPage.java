package com.Swigy.PageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//Declaration of elements
	
	//Intitialization
		public LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
}
