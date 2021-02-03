package amq.qa.itu.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	protected WebDriver driver;
	
	public void goToMainPage() {
		driver.get("https://ucom.am");
	}
	
	@BeforeClass
	public void browserGenerator() {
		 driver = new ChromeDriver();
		 driver.get("https://ucom.am");
		 driver.manage().window().maximize();
		 System.out.println("after wait");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
}

