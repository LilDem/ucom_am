package am.qa.itu.ucom.page.shop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static am.qa.itu.ucom.page.shop.UcomShopPageConstants.*;
import static am.qa.itu.ucom.page.ukid.UcomUkidPageConstants.ADD_TO_BAG_LINK_XPATH;
import static am.qa.itu.ucom.page.ukid.UcomUkidPageConstants.BUY_OPTIONS_XPATH;

import am.qa.itu.ucom.page.personal.UcomPersonalPage;

public class UcomShopPage extends UcomPersonalPage{

	public UcomShopPage(WebDriver driver) {
		super(driver);
		
	}
	
 @FindBy(xpath = SHOP_PHONE_LINK_XPATH)
 WebElement shopPhone;
 
 @FindBy(xpath = SHOP_GADGETS_LINK_XPATH)
 WebElement shopGadgets;
 
 @FindBy(xpath = SHOP_BIKES_LINK_XPATH)
 WebElement shopBikes;
 
 @FindBy(xpath = ADD_TO_BAG_LINK_XPATH)
	WebElement addToBag;
	
 @FindBy(xpath = BUY_OPTIONS_XPATH)
	WebElement buyOptions;
 
 
 public boolean isShopPhoneDisplayed() {
	 return shopPhone.isDisplayed();
	 }
  
 public boolean isShopGadgetsDisplayed() {
	 return shopGadgets.isDisplayed();
	 }
 
 public boolean isShopBikesDisplayed() {
	 return shopBikes.isDisplayed();
	 }
public void addToBag() {
	addToBag.click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
	
public boolean isBuyOptionDisplayed() {
	return buyOptions.isDisplayed();
}
}