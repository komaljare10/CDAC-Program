package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2Day2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium_Project\\Ddata1\\chromedriver-win32\\chromedriver.exe");

		WebDriver d1=new ChromeDriver();
		d1.get("https://pixabay.com/images/search/nature/");
		String fw=d1.getWindowHandle();
		d1.switchTo().newWindow(WindowType.TAB);
		//d1.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(5000);
		d1.switchTo().window(fw);
	
	}

}
