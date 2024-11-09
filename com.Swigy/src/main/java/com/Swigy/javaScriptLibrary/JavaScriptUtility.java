package com.Swigy.javaScriptLibrary;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.Swigy.WebDriverLybrary.WebDriverUtility;

/**
 * This Class Provides the Reusable Methods To Perform javaScript Related Actions
 *
 * 
 * @author lenovo*/

public class JavaScriptUtility {
	
	
	public static JavascriptExecutor javascriptobj;
	
	/**
	 * This Methods Is Used To EnterData_DisabledElement
	 * 
	 * @param element, data
	 * @return void*/
	
	public void enterData_DisabledElement(WebElement element, String data)
	{
		javascriptobj=(JavascriptExecutor)WebDriverUtility.driver_static;
		javascriptobj.executeScript("arguments[0].value="+data+"'", element);
	}
	
	/**
	 * This Methods Is Used To click_DisabledElement
	 * 
	 * @param element
	 * @return void*/
	
	public void click_DisabledElement(WebElement element)
	{
		javascriptobj=(JavascriptExecutor)WebDriverUtility.driver_static;
		javascriptobj.executeScript("arguments[0].click()", element);
	}
	
	/**
	 * This Methods Is Used To defaultVerticalScrollBy
	 * 
	 * @return void*/
	
	public void defaultVerticalScrollBy()
	{
		javascriptobj=(JavascriptExecutor)WebDriverUtility.driver_static;
		javascriptobj.executeScript("Window.scrollBy(1000,1000)");
	}
	
	/**
	 * This Methods Is Used To defaultVerticalScrollTo
	 * 
	 * @return void*/
	public void defaultVerticalScrollTo()
	{
		javascriptobj=(JavascriptExecutor)WebDriverUtility.driver_static;
		javascriptobj.executeScript("Window.scrollTo(1000,1000)");
	}

	/**
	 * This Methods Is Used To scrollUsingView
	 * 
	 * @param element, value
	 * @return void*/
	
	public void scrollUsingView(WebElement element, boolean value)
	{
		javascriptobj=(JavascriptExecutor)WebDriverUtility.driver_static;
		javascriptobj.executeScript("arguments[0].scrollIntoView("+value+");", element);
	}
}
