package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo5Day2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium_Project\\Ddata1\\chromedriver-win32\\chromedriver.exe");

		WebDriver d1=new ChromeDriver();
		d1.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement drag=d1.findElement(By.xpath("//body/section[@id='g-container-main']/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]"));
		WebElement drop=d1.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/ol[1]/li[1]"));
		Actions act=new Actions(d1);
		act.dragAndDrop(drag, drop).build().perform();//build().perform() compoulsory 
		
	//	//a[contains(text(),'BANK')]
       //=============================================================
		WebElement drag1=d1.findElement(By.xpath("//a[contains(text(),'BANK')]"));
		WebElement drop1=d1.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/ol[1]/li[1]"));
		Actions act1=new Actions(d1);
		act1.dragAndDrop(drag1, drop1).build().perform();//build().perform() compoulsory 
		
		//=======================================================================================
		
		WebElement drag2=d1.findElement(By.xpath("//a[contains(text(),'SALES')]"));
		WebElement drop2=d1.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/ol[1]/li[1]"));
		Actions act2=new Actions(d1);
		act2.dragAndDrop(drag2, drop2).build().perform();//build().perform() compoulsory 
		
		
	}

}
