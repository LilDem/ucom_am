package amq.qa.itu.sovats.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import amq.qa.itu.sovats.base.SovatsBaseTest;

public class LoginTest extends SovatsBaseTest {


	@Test
	public void loginTestWithoutPassword() {
		System.out.println("Login without password");
		driver.get("https://sovats.am");
	}

	@Test
	public void searchITUAMInGoogle() {
		driver.get("https://google.com");
		// 2. type ituniversity.am and press enter
		
		Assert.assertTrue(driver.findElements(By.xpath("//input[@name='qq']")).size()== 0);
		System.out.println(driver.findElement(By.xpath("//input[@name='q']")).isDisplayed());
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("ituniversity.am");
		driver.findElement(By.xpath("//input[@name='q']")).submit();
		// 3. in google search results page click on ituniversity.am - Safeguarde your
		// Future link
		driver.findElement(By.xpath("//a[@href='https://www.ituniversity.am/']")).click();
		// Expected results:
		// After step 3. ITU page is diplayed with the Logo
		Assert.assertTrue(driver.findElement(By.xpath("//img[contains(@src, 'itu-logo.png')]")).isDisplayed());
	}

}
