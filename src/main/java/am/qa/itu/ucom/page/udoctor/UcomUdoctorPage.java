package am.qa.itu.ucom.page.udoctor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static am.qa.itu.ucom.page.udoctor.UcomUdoctorPageConstants.*;

import am.qa.itu.ucom.page.base.UcomBasePage;

public class UcomUdoctorPage extends UcomBasePage {

	public UcomUdoctorPage(WebDriver driver) {
		super(driver);
		}

	@FindBy(xpath = UDOCTOR_PHONE_XPATH)
	WebElement Udoctorphone;
	
	@FindBy(xpath = NO_SEARCH_RESULT_XPATH)
	WebElement Noresult;
	
	@FindBy(xpath = UDOCTOR_LOGIN_LINK_XPATH)
	WebElement Loginlink;
	
	@FindBy(xpath = DOCTORS_LINK_XPATH)
	WebElement Doctorslink;
	
	@FindBy(xpath = DOCTORS_VISIT_XPATH)
	WebElement Visitlink;
	
	@FindBy(xpath = DOCTORS_INFO_BLOCK)
	WebElement DoctorsInfo;
	
	@FindBy(xpath = INPUT_DOCTORS_NAME_XPATH)
	WebElement DoctorsName;
	
	@FindBy(xpath = DOCTORS_IMG_XPATH)
	WebElement DoctorsImg;
	
	public boolean isUdoctorPhoneDisplayed() {
		return Udoctorphone.isDisplayed();
	}
	
	public boolean noResultisDisplayed() {
		return Noresult.isDisplayed();
	}
	
	public void makeAnAppointment() {
		Doctorslink.click();
		Visitlink.click();
	}
	public boolean isDoctorsInfoDisplayed() {
		return DoctorsInfo.isDisplayed();
	}
	public void typeDoctorsNameWrong(String texttosearch) {
		DoctorsName.click();
		DoctorsName.sendKeys(texttosearch);
		try {		
			Thread.sleep(5000);		
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void typeDoctorsNameRight(String texttosearch) { 	
		DoctorsName.sendKeys(texttosearch);
		DoctorsName.submit();
		}
	
	public boolean isDoctorsIMgDisplayed() {
		return DoctorsImg.isDisplayed();
	}
	
	public UdoctorLoginPage clickOnLoginBtn() {
		Loginlink.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		return new UdoctorLoginPage(driver);
	}
	
	
}
