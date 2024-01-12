package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4Day2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium_Project\\Ddata1\\chromedriver-win32\\chromedriver.exe");

		WebDriver d1=new ChromeDriver();
		d1.get("https://demo.guru99.com/Agile_Project/Agi_V1/index.php");
		Thread.sleep(1);
		d1.findElement(By.xpath("//body/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
		d1.findElement(By.linkText("Radio & Checkbox Demo")).click();
	//	d1.findElement(By.xpath("//a[contains(text(),'Radio & Checkbox Demo')]")).click();
		
		//*****************************************************************************************************************************************
		//how to generate my own xpath
		//website:https://demo.guru99.com/Agile_Project/Agi_V1/
		//tagname[@key='value']
		//==>//input[@name='uid']<== for username
		//==>//input[@name='password']<==for password
		//==>//input[@name='btnLogin']<== for login Button
		//==>//input[@name='btnReset']<== for reset Button
		//---------------------------------------------------------
		//for 1st to below field===>use 'following'
		//==>//input[@name='uid']//following::input
	
		
		
	}

}
