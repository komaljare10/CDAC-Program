package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoPracticeDay2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium_Project\\Ddata1\\chromedriver-win32\\chromedriver.exe");

		WebDriver d1=new ChromeDriver();
		
		d1.get("https://demo.automationtesting.in/Alerts.html");
        d1.findElement(By.xpath("//button[contains(text(),'alert box:')]")).click();
        Alert a=d1.switchTo().alert();
  	  String sa=a.getText();
  	  System.out.println(sa);
  	  a.accept();
		//===============================================================================
		Thread.sleep(1000);

  	  d1.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
  	  d1.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box')]")).click();
  	  Alert a1=d1.switchTo().alert();
  	  String sa1=a1.getText();
  	  System.out.println(sa1);
  	  a1.accept();
  	  //===============================================================================
		Thread.sleep(1000);

  	  d1.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
  	  d1.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box')]")).click();
  	Alert a2=d1.switchTo().alert();
	  String sa2=a2.getText();
	  System.out.println(sa2);
	  
	  a2.sendKeys("Jim jilly");
	  a2.accept();
	 
	}

}
