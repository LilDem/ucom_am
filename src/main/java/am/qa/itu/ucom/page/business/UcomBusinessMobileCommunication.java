package am.qa.itu.ucom.page.business;

import static am.qa.itu.ucom.page.business.UcomBusinessPageConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UcomBusinessMobileCommunication extends UcomBusinessPage {

	public UcomBusinessMobileCommunication(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath = MOBILE_OFFER_TABLE_XPATH)
	WebElement mobileOfferTable;
	
	public boolean isMobileOfferTableDisplayed() {
		 return mobileOfferTable.isDisplayed();
}

}