package am.qa.itu.ucom.page.personal;

import static am.qa.itu.ucom.page.personal.UcomPersonalPageConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import am.qa.itu.ucom.page.base.UcomBasePage;
import am.qa.itu.ucom.page.shop.UcomShopPage;


public class UcomPersonalPage extends UcomBasePage {

	public UcomPersonalPage(WebDriver driver)
	{
		super(driver);
		}
	
	@FindBy(xpath = HOME_SERVICES_XPATH)
	WebElement homeServiceLink;
	
	@FindBy(xpath = MOBILE_SERVICES_XPATH)
	WebElement MobileService;
	
	@FindBy(xpath = SPECIAL_OFFER_LINK_XPATH)
	WebElement specialOfferLink;
	
	@FindBy (xpath = UCOM_SHOP_LINK_XPATH)
	WebElement ucomShopLink;
	
	
	public boolean isHomeServiceLinkPresent() {
		return homeServiceLink.isDisplayed();
		}
	
	public UcomForHomePage clickOnHomeServices() {
		homeServiceLink.click();
		return new UcomForHomePage(driver);
		}
		
	public boolean isMobileServiceDisplayed() {
         return MobileService.isDisplayed();
         }

	public UcomMobilePage clickOnMobileServices() {
		MobileService.click();
		return new UcomMobilePage(driver);
		}
	
	public UcomSpecialOfferPage clickOnSpecialOffers() {
		specialOfferLink.click();
		return new UcomSpecialOfferPage(driver);
		}
	
	public UcomShopPage clickOnUcomShop() {
		ucomShopLink.click();
		return new UcomShopPage(driver);
		}
}
