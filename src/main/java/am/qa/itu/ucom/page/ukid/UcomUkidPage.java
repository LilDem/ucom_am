package am.qa.itu.ucom.page.ukid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static am.qa.itu.ucom.page.ukid.UcomUkidPageConstants.*;


import am.qa.itu.ucom.page.base.UcomBasePage;
import am.qa.itu.ucom.page.shop.UcomShopPage;

public class UcomUkidPage extends UcomBasePage {

	public UcomUkidPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = BUY_NOW_LNIK_XPATH)
	WebElement buyNow;
	

public UcomShopPage clickOnBuyNow() {
	buyNow.click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	return new UcomShopPage(driver);
}

	
}

