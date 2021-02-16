package am.qa.itu.ucom.page.results;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static am.qa.itu.ucom.page.results.UcomSearchResultsPageConstants.*;

import am.qa.itu.ucom.page.base.UcomBasePage;
import am.qa.itu.ucom.page.ukid.UcomUkidPage;

public class UcomSearchResultPage extends UcomBasePage {

	public UcomSearchResultPage(WebDriver driver) {
		super(driver);
		
	}
 @FindBy(xpath = SMARTPHONE_LOVE_LINK_XPATH)
 WebElement smartphonelink;
 
 @FindBy(xpath = RESULT_COUNT_XPATH)
 WebElement resultCount;
 
 @FindBy(xpath = UKID_RESULT_XPATH)
 WebElement uKidLink;

 public boolean isSmartphoneLoveLinkPresents() {
     return smartphonelink.isDisplayed();	 
     }
 
 public boolean isResultCountDisplayed() {
	 return resultCount.isDisplayed();
	 }
 public UcomUkidPage clickOnUkid() {
	 uKidLink.click();
	return new UcomUkidPage(driver);
 }
 }

