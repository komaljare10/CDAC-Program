package demopack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterisation {

	WebDriver d1;

	@Parameters({ "uid", "pass" })
	@Test(priority = 1)
	public void loginInvalid(String uid, String pass) throws Exception {
		d1.manage().window().maximize();
		// d1.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("1303");
		d1.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys(uid);
		// d1.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("Guru99");
		d1.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys(pass);
		Thread.sleep(5000);
		d1.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();
		Thread.sleep(1000);

		Alert a = d1.switchTo().alert();
		a.accept();
		// ===============================================================================

	}

	@Parameters({ "u", "p" })
	@Test(priority = 2)
	public void loginValid(String u, String p) throws Exception {
		// clear invalid input
		d1.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).clear();
		d1.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).clear();
		// enter valid input
		d1.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys(u);
		d1.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys(p);
		d1.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();
		Thread.sleep(1000);
		// for logout
		d1.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
		Thread.sleep(1000);
		Alert a1 = d1.switchTo().alert();
		a1.accept();
		

	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Project\\Ddata1\\chromedriver-win32\\chromedriver.exe");
		  
		d1 = new ChromeDriver();
		d1.get("https://demo.guru99.com/Agile_Project/Agi_V1/index.php");

	}

	@AfterTest
	public void afterTest() {
		d1.close();
	}

}
