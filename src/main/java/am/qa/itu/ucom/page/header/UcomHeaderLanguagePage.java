package am.qa.itu.ucom.page.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static am.qa.itu.ucom.page.header.UomHeaderPageConstants.*;

public class UcomHeaderLanguagePage extends UcomHeaderPage {

	public UcomHeaderLanguagePage(WebDriver driver) {
		super(driver);
		}

	@FindBy(xpath= LANGUAGE_DROP_DOWN_XPATH)
	WebElement lngDropDown;
	
	public boolean isDropDownDisplayed() {
		return lngDropDown.isDisplayed();
	}
	
	
}
