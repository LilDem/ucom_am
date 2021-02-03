package am.qa.itu.ucom.page.business;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static am.qa.itu.ucom.page.business.UcomBusinessPageConstants.*;


public class UcomBusinessTvPage extends UcomBusinessPage {

	public UcomBusinessTvPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = BUSINESS_TV_EXTRA_IMG_XPATH)
	WebElement TvExtraImg;
	
	public boolean isTvExtraImgPresents() {
		return TvExtraImg.isDisplayed();
				}
	}
	
