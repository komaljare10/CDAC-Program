package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoDay2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium_Project\\Ddata1\\chromedriver-win32\\chromedriver.exe");

		WebDriver d1=new ChromeDriver();
		d1.get("https://demo.automationtesting.in/Register.html");
         d1.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("laxmi");
         d1.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]")).sendKeys("Patil");
         
		d1.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]")).sendKeys("Solapur, Maharastra");
		d1.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]")).sendKeys("lax.b.patil@gmail.com");
		d1.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]")).sendKeys("7499541617");
		d1.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/label[2]")).click();
	     d1.findElement(By.xpath("//input[@id='checkbox1']")).click();
	     d1.findElement(By.xpath("//input[@id='checkbox2']")).click();
	  
			Select skill=new Select(d1.findElement(By.id("Skills")));
			skill.selectByIndex(3);
			Select year=new Select(d1.findElement(By.id("yearbox")));
			year.selectByVisibleText("2001");
			Select month=new Select(d1.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[11]/div[2]/select[1]")));
			month.selectByIndex(8);
			Select date=new Select(d1.findElement(By.id("daybox")));
			date.selectByVisibleText("27");

	}

}
