package demopack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametrizationDropDown {
	WebDriver d1;
	@Parameters({"skill"})
  @Test
  public void f(String skill) throws Exception {
	  //d1.manage().window().maximize();
	  //d1.findElement(By.xpath("//select[@id='Skills']")).click();
	  Select drpSkills = new Select(d1.findElement(By.xpath("//select[@id='Skills']")));
	  Thread.sleep(5000);
	  drpSkills.selectByVisibleText(skill);
	  Thread.sleep(5000);
	  
  }
  
  @BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Project\\Ddata1\\chromedriver-win32\\chromedriver.exe");
		  
		d1 = new ChromeDriver();
		d1.get("https://demo.automationtesting.in/Register.html");

	}

	@AfterTest
	public void afterTest() {
		d1.close();
	}
}
