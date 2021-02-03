package am.qa.itu.ucom.page.personal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.qa.itu.ucom.page.business.UcomBusinessSolutions;

import static am.qa.itu.ucom.page.personal.UcomPersonalPageConstants.*;

public class UcomForHomePage extends UcomPersonalPage {

	public UcomForHomePage(WebDriver driver) {
		super(driver);
		}
	 
	@FindBy(xpath = INTERACTIVE_SERVICE_XPATH)
	WebElement InteractiveService;
	
	public boolean isInteractiveIconDisplayed() {
		 return InteractiveService.isDisplayed();
		}
	
	@FindBy(xpath = UPHONE_SERVICE_XPATH)
	WebElement UPhoneService;
	
	public boolean isUPhoneIconDisplayed() {
		return UPhoneService.isDisplayed();
	}
	
	@FindBy(xpath = UTV_SERVICE_XPATH)
	WebElement UTvService;
	
	public boolean isUtvIconDisplayed() {
		return UTvService.isDisplayed();
		}
	
	@FindBy(xpath = UNET_SERVICE_XPATH)
	WebElement UNetService;
	
	public boolean isUNetIconDisplayed() {
		return UNetService.isDisplayed();
	}
		
	@FindBy(xpath = UMIX_SERVICE_XPATH)
	WebElement UMixService;
	
	public boolean isUMixIconDisplayed() {
		return UMixService.isDisplayed();
	}
	
}