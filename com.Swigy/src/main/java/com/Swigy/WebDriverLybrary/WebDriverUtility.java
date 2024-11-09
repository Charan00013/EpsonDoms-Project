package com.Swigy.WebDriverLybrary;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;



/**
 * This Class Provides the Reusable Methods To Perform All Browser Related Actions
 *
 * 
 * @author lenovo*/
public class WebDriverUtility {

	public WebDriver driver;
	public static WebDriver driver_static;
	public Select selectobj;
	public Actions actionobj;
	public Robot robotobj;
	WebDriverWait wait;
	
	
	
	/**
	 * This Methods Is Used To Launch the Specific Browser 
	 * 
	 * @param String Browser Name
	 * @return void*/
	public void launchBrowser(String browser)
	{
		//Launch the browser ------> Chrome, Edge, firefox
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver_static=driver;
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver_static=driver;
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver_static=driver;
			break;
		default:
			System.out.println("invalid input");
			driver_static=driver;
			break;
		}
	}
	
	
	/**
	 * This Methods Is Used To Navigate To the Particular Application 
	 * 
	 * @param String Url 
	 * @return void*/
	
	public void NavigateToApplication(String url)
	{
		driver.get(url);
	}
	
	/**
	 * This Methods Is Used To Maximize The Specific Browser
	 * 
	 * @return void*/
	
	
	public void maximizeTheBroser()
	{
		driver.manage().window().maximize();
	}
	
	/**
	 * This Methods Is Used To Close The Specific Browser
	 * 
	 * @return void*/
	
	public void closeTheBroser()
	{
		driver.close();
	}
	
	/**
	 * This Methods Is Used To Close All The Specific Browser
	 * 
	 * @return void*/
	
	public void closeAllTheBroser()
	{
		driver.quit();
	}
	
	/**
	 * This Methods Is Used To WaitImplicitly purpose
	 * 
	 * @param duration
	 * @return void*/
	
	public void waitImplicitly(long duration)
	{
		driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
	}
	
	/**
	 * This Methods Is Used To Waitexplicitly purpose
	 * 
	 * @param duration, element
	 * @return void*/
	
	
	public void waitexplicitly(long duration, WebElement element)
	{
		wait=new WebDriverWait(driver, duration);
				 
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	/**
	 * This Methods Is Used To Select Option In Dropdown
	 * 
	 * @param element, index
	 * @return void*/
	
	
	public void selectOptionInDropdown(WebElement element, int index)
	{
		selectobj.selectByIndex(index);
	}
	
	/**
	 * This Methods Is Used To Select Option In Dropdown
	 * 
	 * @param element, visibletext
	 * @return void*/
	
	public void selectOptionInDropdown(WebElement element, String visibletext)
	{
		selectobj.selectByVisibleText(visibletext);
	}
	
	/**
	 * This Methods Is Used To Select Option In Dropdown
	 * 
	 * @param element, value
	 * @return void*/
	
	public void selectOptionInDropdown(String value, WebElement element)
	{
		selectobj.selectByValue(value);
	}
	
	/**
	 * This Methods Is Used To MouseHovering
	 * 
	 * @param element
	 * @return void*/
	public void mouseHovering(WebElement element)
	{
		actionobj.moveToElement(element).perform();
	}
	
	/**
	 * This Methods Is Used To Press The Key
	 * 
	 * @return void*/
	
	public void pressTheKey_pageDown()
	{
		robotobj.keyPress(KeyEvent.VK_PAGE_DOWN);
	}
	
	/**
	 * This Methods Is Used To Release The Key
	 * 
	 * @return void*/
	
	public void ReleaseTheKey_pageDown()
	{
		robotobj.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}
	
	/**
	 * This Methods Is Used To Accept The alertPopup
	 * 
	 * @return void*/
	
	public void alertPopupAccept()
	{
		driver.switchTo().alert().accept();
	}
	
	/**
	 * This Methods Is Used To Dismiss The alertPopup
	 * 
	 * @return void*/
	
	public void alertPopupDismiss()
	{
		driver.switchTo().alert().dismiss();;
	}
	
	/**
	 * This Methods Is Used To switch The Control To Frame
	 * 
	 * @param index
	 * @return void*/
	
	public void switchControlToFrame(int index)
	{
		driver.switchTo().frame(index);
	}
	
	/**
	 * This Methods Is Used To switch The Control To Frame
	 * 
	 * @param element
	 * @return void*/
	
	public void switchControlToFrame(WebElement element)
	{
		driver.switchTo().frame(element);
	}
	
	/**
	 * This Methods Is Used To switch The Control Back To Frame
	 * 
	 * @return void*/
	
	public void switchBackControlToMain()
	{
		driver.switchTo().defaultContent();
	}
	
	/**
	 * This Methods Is Used To switch The Control To Window
	 * 
	 * @param windowaddress
	 * @return void*/
	
	public void switchControlToWindow(String windowaddress)
	{
		
		driver.switchTo().window(windowaddress);
	}
	
	
	
	
	
	
	
}
