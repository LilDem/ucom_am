package am.qa.itu.ucom.page.personal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static am.qa.itu.ucom.page.personal.UcomPersonalPageConstants.*;

public class UcomMobilePage extends UcomPersonalPage {

	public UcomMobilePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy (xpath = REVOLUTIONARY_OFFER_XPATH)
	WebElement revolution;
	
	public boolean isRevolutionaryOfferDisplayed() {
		return revolution.isDisplayed();
	}
	

}
