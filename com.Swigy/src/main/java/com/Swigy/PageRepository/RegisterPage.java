package com.Swigy.PageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	
	//Intitialization
			public RegisterPage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}

}
