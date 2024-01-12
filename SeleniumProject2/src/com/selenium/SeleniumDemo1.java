package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumDemo1 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"D:\\Selenium_Project\\Ddata1\\chromedriver-win32\\chromedriver.exe");

	WebDriver d1=new ChromeDriver();
	//WebDriver d2=new ChromeDriver();
	//d1.get("https://www.gmail.com");
	//d1.get("https://chromedriver.chromium.org/");
//d1.navigate().to("https://www.gmail.com");

	//Thread.sleep(5000);
	//d1.navigate().refresh();
//	d1.navigate().back();
//	d1.manage().window().maximize();
   //d2.get("https://www.google.com");
	
	//d2.manage().window().minimize();
	//d1.get("https://demo.guru99.com/Agile_Project/Agi_V1/");
	d1.get("https://www.saucedemo.com/v1/");
	d1.findElement(By.name("input")).sendKeys("standard_user");
	d1.findElement(By.name("input")).sendKeys("secret_sauce");
	//d1.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
// d1.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	
	//------------------------------------------------------
	
	d1.findElement(By.name("input")).click();
 //  System.out.println(d1.getTitle());
	//System.out.println(d1.getCurrentUrl());
	//System.out.println("==============================");
	//System.out.println(d1.getTitle());
	//System.out.println("==============================");
	//System.out.println(d1.getPageSource());
	//System.out.println("==============================");
	//Thread.sleep(5000);
	//d1.close();
//	String s="Welcome";
//	String s1=d1.getTitle();
//	if(s.equals(s1)){
//		System.out.println("pass");
//	}
//	else
//	{
//		System.out.println("fail");
//	}
	}
                                                                                                                                                                                                                                                                                                         
}
