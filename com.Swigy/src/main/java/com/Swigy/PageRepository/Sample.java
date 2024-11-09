package com.Swigy.PageRepository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Sample {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/lenovo/eclipse-workspace/com.Swigy/src/main/resources/Softwares/webpage.html");
		if(driver.getCurrentUrl().equals("file:///C:/Users/lenovo/eclipse-workspace/com.Swigy/src/main/resources/Softwares/webpage.html"))
		{
			Reporter.log("test case is pass", true);
		}
		else
		{
			Reporter.log("test case is fail", true);
		}
		
		WelcomePage g1=new WelcomePage(driver);
		g1.getName().sendKeys("charan");
		Thread.sleep(2000);
		g1.getEmail().sendKeys("charan00013@gmail.com");
		Thread.sleep(2000);
		g1.getPassword().sendKeys("Ch@ran0013");
		Thread.sleep(2000);
		g1.getMobile().sendKeys("9959536894");
		Thread.sleep(2000);
		g1.getDob().sendKeys("18-06-1996");
		Thread.sleep(2000);
		g1.getMale().click();
		Thread.sleep(2000);
		g1.getPlaces().click();
		Thread.sleep(2000);
		g1.getINDIA().click();
		Thread.sleep(2000);
		g1.getFeedback().sendKeys("gjjddnd");
		Thread.sleep(2000);
		g1.getRegister().click();
		Thread.sleep(2000);
		
		g1.getContact().click();
		
		
		
	}

}
