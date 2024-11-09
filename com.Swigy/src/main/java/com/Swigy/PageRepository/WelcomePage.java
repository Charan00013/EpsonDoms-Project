package com.Swigy.PageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	//Initialization 
	
	public WelcomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);//this is refering search
	}
	public WebElement getSearch() {
		return name;
}

	//Declaration
	
	@FindBy(id="name")
	private WebElement name;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="mobile")
	private WebElement mobile;
	
	@FindBy(partialLinkText="Contact")
	private WebElement Contact;
	
	////input[@type='datetime-local']
	
	@FindBy(xpath="//input[@type='datetime-local']")
	private WebElement dob;
	
	@FindBy(xpath="//input[@value='male']")
	private WebElement male;
	
	@FindBy(xpath="//input[@value='bangalore']")
	private WebElement places;
	
	@FindBy(xpath="(//option[@value='ind'])[1]")
	private WebElement INDIA;
	
	@FindBy(xpath="//textarea[@placeholder='Enter feedback']")
	private WebElement Feedback;
	
	@FindBy(xpath="///input[@type='file']")
	private WebElement choosefile;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement register;
	
	
	//Utilization
	
	public WebElement getDob() {
		return dob;
	}
	public WebElement getMale() {
		return male;
	}
	public WebElement getPlaces() {
		return places;
	}
	public WebElement getINDIA() {
		return INDIA;
	}
	public WebElement getFeedback() {
		return Feedback;
	}
	public WebElement getChoosefile() {
		return choosefile;
	}
	public WebElement getRegister() {
		return register;
	}
	public WebElement getName() {
		return name;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getMobile() {
		return mobile;
	}
	public WebElement getContact() {
		return Contact;
	}

	

}
