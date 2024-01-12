package demopack;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class NewTest2 {
	 WebDriver d1;
  @Test(dataProvider = "dp")
  public void login(String n, String s) throws Exception {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Project\\Ddata1\\chromedriver-win32\\chromedriver.exe");
	  d1=new ChromeDriver();
	  d1.get("https://demo.guru99.com/Agile_Project/Agi_V1/index.php");
		
		// enter valid input
		d1.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys(n);
		d1.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys(s);
		d1.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();
		Thread.sleep(1000);
		Alert a=d1.switchTo().alert();
		a.accept();
		Thread.sleep(1000);
		d1.close();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "kj123", "abc" },
      //new Object[] { 2, "b" },
    };
  }
}
