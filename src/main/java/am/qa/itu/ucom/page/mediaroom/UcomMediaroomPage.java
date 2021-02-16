package am.qa.itu.ucom.page.mediaroom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.qa.itu.ucom.page.header.UcomHeaderPage;
import static am.qa.itu.ucom.page.mediaroom.UcomMediaroomPageConstants.*;

public class UcomMediaroomPage extends UcomHeaderPage {

	public UcomMediaroomPage(WebDriver driver) {
		super(driver);
		}
	@FindBy(xpath = UMEDIAROOM_QR_XPATH)
	WebElement qrLink;
	
	public boolean IsQrDisplayed() {
		return qrLink.isDisplayed();
	}

}
