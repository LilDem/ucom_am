package am.qa.itu.ucom.page.business;
import static am.qa.itu.ucom.page.business.UcomBusinessPageConstants.*;
import static am.qa.itu.ucom.page.header.UcomHeaderPageConstants.UCOM_PERSONAL_XPATH;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;
import org.openqa.selenium.support.FindBy;
import am.qa.itu.ucom.page.base.UcomBasePage;
import am.qa.itu.ucom.page.personal.UcomPersonalPage;

public class UcomBusinessPage extends UcomBasePage {

	public UcomBusinessPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = BUSINESS_SOLUTIONS_LINK_XPATH)
	WebElement businessSolutionsLink;
	
	@FindBy(xpath = BUSINESS_MOBILE_SERVICE_LINK_XPATH)
	WebElement businessMobileLink;
	
	@FindBy (xpath =BUSINESS_FIX_SERVICE_LINK_XPATH)
	WebElement businessFixLink;
	
	@FindBy (xpath = BUSINESS_TV_LINK_XPATH)
	WebElement businessTvLink;
	
		
	public boolean isBusinessSolutionsPresent() {
		return businessSolutionsLink.isDisplayed();
	}
	
	public boolean isBusinessTvPresent() {
		return businessTvLink.isDisplayed();
	}
   
	public UcomBusinessTvPage clickOnBusinessTv() {
		businessTvLink.click();
		
		return new UcomBusinessTvPage(driver);
	}
	
	
	public boolean isMobileServiceLinkPresents() {
	   return businessMobileLink.isDisplayed();
   }
   
	public boolean isFixServiceLinkPresents() {
	   return businessFixLink.isDisplayed();
   }
	
	public UcomBusinessSolutions clickOnBusinessSolutions() {
		businessSolutionsLink.click();
		return new UcomBusinessSolutions(driver);
	}
	public UcomBusinessMobileCommunication clickOnBusinessMobile() {
         businessMobileLink.click();
         
         return new UcomBusinessMobileCommunication(driver);
	}
	
	public UcomBusinessFixPage clickOnBusinessFix() {
		businessFixLink.click();
		return new UcomBusinessFixPage(driver);
	}
}     
         