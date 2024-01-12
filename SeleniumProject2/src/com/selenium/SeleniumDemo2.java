package com.selenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SeleniumDemo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver",
				"D:\\Selenium_Project\\SData3\\geckodriver.exe");
		//FirefoxOptions fo=new FirefoxOptions();
		//co.setBrowserVersion("120");
		WebDriver d1=new FirefoxDriver();
		//d1.manage().window().maximize();
		d1.get("https://chromedriver.chromium.org/");
		d1.get("https://www.google.com");
		//d1.get("https://demo.guru99.com/");
      //  System.out.println(d1.getTitle());
		System.out.println(d1.getCurrentUrl());
		System.out.println("==============================");
		System.out.println(d1.getTitle());
		System.out.println("==============================");
		//System.out.println(d1.getPageSource());
		System.out.println("==============================");
		String s="Welcome";
		String s1=d1.getTitle();
		if(s.equals(s1)){
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
