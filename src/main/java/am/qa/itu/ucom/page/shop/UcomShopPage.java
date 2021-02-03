package am.qa.itu.ucom.page.shop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static am.qa.itu.ucom.page.shop.UcomShopPageConstants.*;
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
 
 
 public boolean isShopPhoneDisplayed() {
	 return shopPhone.isDisplayed();
	 }
  
 public boolean isShopGadgetsDisplayed() {
	 return shopGadgets.isDisplayed();
	 }
 
 public boolean isShopBikesDisplayed() {
	 return shopBikes.isDisplayed();
	 }
 
 }
