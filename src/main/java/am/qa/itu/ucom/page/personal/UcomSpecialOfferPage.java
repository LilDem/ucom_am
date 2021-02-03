package am.qa.itu.ucom.page.personal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static am.qa.itu.ucom.page.personal.UcomPersonalPageConstants.*;


public class UcomSpecialOfferPage extends UcomPersonalPage{

	public UcomSpecialOfferPage(WebDriver driver) {
		super(driver);
		}
	@FindBy(xpath = SAMSUNG_A21_IMG_XPATH)
	WebElement SamsungImg;
	
	public boolean isSamsungImgDisplayed() {
		return SamsungImg.isDisplayed();
	}
	

}
