package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class FirstTestNGClass {
  WebDriver d1;
  @Test
  public void f() throws Exception {//f name of the Testcase
  System.out.println("i am in Test");
  
    d1.manage().window().maximize();
	d1.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("1303");
	d1.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("Guru99");
	Thread.sleep(1000);
	d1.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();
	Thread.sleep(5000);
	
	d1.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
	Thread.sleep(5000);
	Alert a=d1.switchTo().alert();
	 
	a.accept();
  }
	
//  @Test
//  public void f1() {//f name of the Testcase
//	  System.out.println("i am in Test1");
//  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("i am in beforeMethod()");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("i am in afterMethod()");
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("i am in beforeClass()");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("i am in afterClass()");
  }
  

  @BeforeTest
  public void beforeTest() {
	  System.out.println("i am in beforeTest()");
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Project\\Ddata1\\chromedriver-win32\\chromedriver.exe");
	  d1=new ChromeDriver();
	  d1.get("https://demo.guru99.com/Agile_Project/Agi_V1/index.php");
		
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("i am in afterTest()");
	  
	  d1.close();
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("i am in beforeSuite()");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("i am in afterSuite()");
  }

}
