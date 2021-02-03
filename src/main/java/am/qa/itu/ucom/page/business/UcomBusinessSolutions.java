package am.qa.itu.ucom.page.business;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static am.qa.itu.ucom.page.business.UcomBusinessPageConstants.*;

public class UcomBusinessSolutions extends UcomBusinessPage {

	public UcomBusinessSolutions(WebDriver driver) {
		super(driver);
		}
	
	@FindBy(xpath = BUSINESS_UFLEET_IMG_XPATH)
	WebElement uFleetImg;
	
public boolean isUFleetImgDisplayed() {
 return uFleetImg.isDisplayed();
}
}
