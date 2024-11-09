package com.Swigy.JavaLybrary;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * This Class Provides the Reusable Methods To Perform All java Related Actions
 *
 * 
 * @author lenovo*/

public class JavaUtility {

	/**
	 * This Methods Is Used To pause the Execution
	 * 
	 * @param time
	 * @return void*/	
	
	public static void pause(long time)
	{
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This Methods Is Used To generateRandomNum
	 * 
	 * @param limit
	 * @return int*/
	
	public int generateRandomNum(int limit)
	{
		Random random=new Random();
		return random.nextInt(limit);
	}
	
	/**
	 * This Methods Is Used To Read Current Time
	 * 
	 * @return String*/
	
	public String getCurrentTime()
	{
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
		return sdf.format(date);
	}
	
}
