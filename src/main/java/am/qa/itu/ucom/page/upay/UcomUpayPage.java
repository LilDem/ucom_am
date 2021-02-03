package am.qa.itu.ucom.page.upay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static am.qa.itu.ucom.page.upay.UcomUpayPageConstants.*;

import am.qa.itu.ucom.page.header.UcomHeaderPage;

public class UcomUpayPage extends UcomHeaderPage{

	public UcomUpayPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = UPAY_BOX_XPATH)
	WebElement upayBox;
	
	public boolean checkUpayBoxPresents() {
		return upayBox.isDisplayed();
	}

}
