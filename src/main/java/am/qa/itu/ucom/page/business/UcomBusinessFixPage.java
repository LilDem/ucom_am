package am.qa.itu.ucom.page.business;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static am.qa.itu.ucom.page.business.UcomBusinessPageConstants.*;

public class UcomBusinessFixPage extends UcomBusinessPage {

	public UcomBusinessFixPage(WebDriver driver) {
		super(driver);
		}
	@FindBy(xpath = BUSINESS_UPHONE_IMG_XPATH)
	WebElement businessUPhone;
	
	public boolean isBusinessUphoneDisplayed() {
		 return businessUPhone.isDisplayed();

}
}
