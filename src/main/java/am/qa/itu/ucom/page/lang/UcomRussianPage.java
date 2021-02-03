package am.qa.itu.ucom.page.lang;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static am.qa.itu.ucom.page.lang.UcomRussianPageConstants.*;

import am.qa.itu.ucom.page.base.UcomBasePage;

public class UcomRussianPage extends UcomBasePage {

	public UcomRussianPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath = SPECIAL_OFFERS_RUSSIAN_XPATH)
	WebElement RussianSpecialOffer;

	public boolean isPageInRussian() {
		return RussianSpecialOffer.isDisplayed();
	}
	
}