package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3PracticeDay3 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium_Project\\Ddata1\\chromedriver-win32\\chromedriver.exe");

		WebDriver d1=new ChromeDriver();
		
		String fw=d1.getWindowHandle();
		d1.get("https://pixabay.com/images/search/nature/");
		d1.switchTo().newWindow(WindowType.TAB);
		
		String sw=d1.getWindowHandle();
		d1.get("https://demo.automationtesting.in/Alerts.html");
		d1.switchTo().newWindow(WindowType.TAB);
		
		String tw=d1.getWindowHandle();
		d1.get("https://demo.guru99.com/Agile_Project/Agi_V1/index.php");
		//d1.switchTo().newWindow(WindowType.TAB);
		//String fw3=d1.getWindowHandle();
		
		//d1.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(1000);
		d1.switchTo().window(sw);
		
		Thread.sleep(1000);
		d1.switchTo().window(fw);
		
		Thread.sleep(1000);
		d1.switchTo().window(sw);
		
		Thread.sleep(1000);
		d1.switchTo().window(tw);
		
		Thread.sleep(1000);
		d1.switchTo().window(fw);
		
		Thread.sleep(1000);
		d1.close();
		
		Thread.sleep(1000);
		d1.quit();

	}

}
