package am.qa.itu.ucom.page.header;

import static am.qa.itu.ucom.page.header.UcomHeaderPageConstants.*;

import javax.naming.directory.SearchResult;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import am.qa.itu.ucom.page.base.UcomBasePage;
import am.qa.itu.ucom.page.business.UcomBusinessPage;
import am.qa.itu.ucom.page.lang.UcomRussianPage;
import am.qa.itu.ucom.page.personal.UcomPersonalPage;
import am.qa.itu.ucom.page.results.UcomSearchResultPage;
import am.qa.itu.ucom.page.udoctor.UcomUdoctorPage;
import am.qa.itu.ucom.page.upay.UcomUpayPage;

public class UcomHeaderPage extends UcomBasePage {

	public UcomHeaderPage(WebDriver driver) {
		super(driver);
		}
	
	@FindBy(xpath = UCOM_PAYMENT_LINK_XPATH)
	WebElement ucomPaymentLink;
	
	@FindBy(xpath = UPAY_LINK_XPATH)
	WebElement upayLink;
	
	@FindBy(xpath = UCOM_LOGO_XPATH)
	WebElement ucomLogoLink;
	
	@FindBy(xpath = UCOM_BUSINESS_XPATH)
	WebElement businessLink;
	
	@FindBy(xpath = UCOM_PERSONAL_XPATH)
	WebElement personalLink;
	
	@FindBy(xpath = SEARCH_BTN_XPATH)
	WebElement searchlink;
	
	@FindBy(xpath = SEARCH_INPUT_XPATH)
	WebElement searchinputlink;
	
	@FindBy(xpath = LANGUAGE_CHANGE_LINK_XPATH)
	WebElement lngChangeLink;
	
	@FindBy(xpath = RUSSIAN_LNG_LINK_XPATH)
	WebElement russianLngLink;
	
	@FindBy(xpath = ARM_LNG_LINK_XPATH)
	WebElement armLngLink;
	
	@FindBy(xpath = UDOCTOR_LINK_XPATH)
	WebElement uDoctorLink;
	
	public UcomPersonalPage clickOnUcomLogo() {
		ucomLogoLink.click();
		
		return new UcomPersonalPage(driver);
	}
	public UcomUdoctorPage clickOnUDoctor() {
		uDoctorLink.click();
		
		return new UcomUdoctorPage(driver);
	}
	
	public UcomBusinessPage navigateToBusinessPage() {
		businessLink.click();
		
		return new UcomBusinessPage(driver);
	}
	
	public UcomPersonalPage navigateToPersonalPage() {
		personalLink.click();
		
		return new UcomPersonalPage(driver);
	}
	
    public UcomSearchResultPage searchOption(String texttosearch){
    	searchlink.click();
    	searchinputlink.sendKeys(texttosearch);
    	searchinputlink.submit();
    	
    	return new UcomSearchResultPage(driver);
                	
    }
    
   
    public void checkLanguage() {
    	lngChangeLink.click();
    	 }
    
    public UcomRussianPage changeLanguage() {
    	russianLngLink.click();
    	
    	return new UcomRussianPage(driver);
    }
	
    public UcomPersonalPage changeLngArm() {
    	armLngLink.click();
    	
    	return new UcomPersonalPage(driver);
    	
    }
    
    public UcomUpayPage goToUpay() {
    	ucomPaymentLink.click();
    	upayLink.click();
    	
    	return new UcomUpayPage(driver);
    }
	}
	

