package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"D:\\Selenium_Project\\Ddata1\\chromedriver-win32\\chromedriver.exe");

	WebDriver d1=new ChromeDriver();
	d1.get("https://jpetstore.aspectran.com/account/signonForm");
	d1.manage().window().maximize();
	d1.findElement(By.xpath("//body/section[1]/div[2]/div[2]/div[1]/form[1]/div[1]/label[1]/input[1]")).sendKeys("");
d1.findElement(By.xpath("//body/section[1]/div[2]/div[2]/div[1]/form[1]/div[1]/label[2]/input[1]")).sendKeys("");
	d1.findElement(By.xpath("//div[@id='Header']")).click();
}
}
