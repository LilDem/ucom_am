package am.qa.itu.ucom.page.udoctor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.qa.itu.ucom.page.base.UcomBasePage;
import static am.qa.itu.ucom.page.udoctor.UcomUdoctorPageConstants.*;


public class UdoctorLoginPage extends UcomBasePage {

	public UdoctorLoginPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = INPUT_NUMBER_XPATH)
	WebElement Inputlink;
	
	@FindBy(xpath = CONTINUE_BTN_XPATH)
	WebElement Continuebtn;
	
	@FindBy (xpath = INPUT_ERROR_XPATH)
	WebElement Inputerror;
	
	public void logIn(String texttosearch) {
		Inputlink.sendKeys(texttosearch);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Continuebtn.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public boolean isInputErrorDisplayed() {
		return Inputerror.isDisplayed();
	}
	
	public boolean isInputDisplayed() {
		return Inputlink.isDisplayed();
	}
	
	

}
