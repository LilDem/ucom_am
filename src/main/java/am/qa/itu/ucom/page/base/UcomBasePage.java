package am.qa.itu.ucom.page.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UcomBasePage {
	
	protected WebDriver driver;
	
	public UcomBasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);	
		
	}
	
	
}
