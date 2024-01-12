package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1Day2 {

	public static void main(String[] args) throws InterruptedException {
		//tbody/tr[1]/td[2]/input[1]
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Project\\Ddata1\\chromedriver-win32\\chromedriver.exe");

		WebDriver d1=new ChromeDriver();
		d1.get("https://demo.guru99.com/Agile_Project/Agi_V1/");
		
//		d1.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).click();
//		d1.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("ABCD");
//		Thread.sleep(5000);
//		d1.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).clear();
//		d1.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("Laxmi");
// 
		
		//============================================================================
		
//		d1.manage().window().maximize();
//		WebElement obj=d1.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]"));//used to perform multiple operations
//		obj.click();
//		obj.sendKeys("laxmi");
//		Thread.sleep(5000);
//		obj.clear();
//		obj.sendKeys("laxmipatil");
		//============================================================
		//to fetch data from textbox in console
//		obj.getAttribute("value");
//		System.out.println(obj.getAttribute("value"));
//		
		
		//================================================================
//		WebElement obj=d1.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]"));
//		obj.click();
//		WebElement obj1=d1.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]"));
//		obj1.click();
//	  WebElement s= d1.findElement(By.xpath("//label[@id='message23']"));
//	  WebElement s1= d1.findElement(By.xpath("//label[@id='message18']"));
//	  s.click();
//	  String str=s.getText();
//	  s1.click();
//	  String str1=s1.getText();
//	  System.out.println(str+"\n"+str1);
	 
		//obj.sendKeys("laxmi");
	  //================================================================================
	  //alert handling
	  
		d1.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();
	  Alert a=d1.switchTo().alert();
	  String sa=a.getText();
	  System.out.println(sa);
	  a.accept();
	}

}
