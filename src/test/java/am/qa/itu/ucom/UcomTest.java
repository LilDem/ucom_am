package am.qa.itu.ucom;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beust.jcommander.converters.ISO8601DateConverter;

import am.qa.itu.ucom.page.business.UcomBusinessFixPage;
import am.qa.itu.ucom.page.business.UcomBusinessMobileCommunication;
import am.qa.itu.ucom.page.business.UcomBusinessPage;
import am.qa.itu.ucom.page.business.UcomBusinessSolutions;
import am.qa.itu.ucom.page.business.UcomBusinessTvPage;
import am.qa.itu.ucom.page.header.UcomHeaderLanguagePage;
import am.qa.itu.ucom.page.header.UcomHeaderPage;
import am.qa.itu.ucom.page.lang.UcomRussianPage;
import am.qa.itu.ucom.page.personal.UcomForHomePage;
import am.qa.itu.ucom.page.personal.UcomMobilePage;
import am.qa.itu.ucom.page.personal.UcomPersonalPage;
import am.qa.itu.ucom.page.personal.UcomSpecialOfferPage;
import am.qa.itu.ucom.page.results.UcomSearchResultPage;
import am.qa.itu.ucom.page.shop.UcomShopPage;
import am.qa.itu.ucom.page.udoctor.UcomUdoctorPage;
import am.qa.itu.ucom.page.udoctor.UdoctorLoginPage;
import am.qa.itu.ucom.page.upay.UcomUpayPage;
import amq.qa.itu.base.BaseTest;

public class UcomTest extends BaseTest{
	
	@Test
	  public void openBusinessPage() {
		//1. from header page go to business page
		UcomHeaderPage business = new UcomHeaderPage(driver);
		UcomBusinessPage bsn = business.navigateToBusinessPage();
		//make sure that in this section BusinessSolution part exists
		Assert.assertTrue(bsn.isBusinessSolutionsPresent());
	    UcomBusinessPage businesss = new UcomBusinessPage(driver);
	    //click on business solutions 
		UcomBusinessSolutions uFleet = businesss.clickOnBusinessSolutions();
		//make sure that u fleet img exists
		Assert.assertTrue(uFleet.isUFleetImgDisplayed());
	    }
	
	@Test 
	 public void checkHomeServiceLink() { 
		  UcomHeaderPage main = new UcomHeaderPage(driver);
		  // go to personal part of ucom.am
		  UcomPersonalPage personal = main.navigateToPersonalPage();
		  //make sure that home service link exist
		  Assert.assertTrue(personal.isHomeServiceLinkPresent());
		  }
       
	@Test
	 public void checkInteractiveIcon() {
		  UcomPersonalPage personal = new UcomPersonalPage(driver);
		  // from personal page click on home service
		  UcomForHomePage result = personal.clickOnHomeServices();
		  // make sure that Unet, Uphone... parts exist
		  Assert.assertTrue(result.isInteractiveIconDisplayed());
		  Assert.assertTrue(result.isUPhoneIconDisplayed());
		  Assert.assertTrue(result.isUNetIconDisplayed());
		  Assert.assertTrue(result.isUtvIconDisplayed());
		  Assert.assertTrue(result.isUMixIconDisplayed());
		  }
	  
	  @Test
	 public void checkRevolutionaryOfferIcon() {
		  UcomPersonalPage personal = new UcomPersonalPage(driver); 
		  // from personal page click on mobile services
		  UcomMobilePage mobile = personal.clickOnMobileServices();
		  // make sure that revolutionary offer link exists in the current page
		  Assert.assertTrue(mobile.isRevolutionaryOfferDisplayed());
		  }
	
	  @Test
		  public void checkSearchInput() {
			 UcomHeaderPage search= new UcomHeaderPage(driver);
			 // in the search field search the word Samsung
			 UcomSearchResultPage result = search.searchOption("Samsung");
			 //  make sure there is an article with the title there is a love....
			 Assert.assertTrue(result.isSmartphoneLoveLinkPresents());
			 }
	  @Test
	       public void checkSearchResult() {
		   UcomHeaderPage search = new UcomHeaderPage(driver);
		   // in the search field search the word sssdgg
		   UcomSearchResultPage result = search.searchOption("sssdgg");
		   // make sure there is no result
		   Assert.assertTrue(result.isResultCountDisplayed());
		   }
	  
	  @Test
	      public void changeLanguage() {
		  UcomHeaderPage header = new UcomHeaderPage(driver);
		  // from the header part click on language changer
		  header.checkLanguage();
		  UcomHeaderLanguagePage lng = new UcomHeaderLanguagePage(driver);
		  //make sure lng change drop down appears
		  Assert.assertTrue(lng.isDropDownDisplayed());
		  // change language into Russian
		  lng.changeLanguage();
		  UcomRussianPage rsn = new UcomRussianPage(driver);
		  //make sure the page turned into Russian
		  Assert.assertTrue(rsn.isPageInRussian());
		  }
	  
	  @Test 
	      public void checkSpecialOffer() {
		  UcomPersonalPage personal = new UcomPersonalPage(driver);
		  //from personal page click on special offers
		  UcomSpecialOfferPage offer = personal.clickOnSpecialOffers();
		  // make sure Ucom Bonds exists  
		  Assert.assertTrue(offer.isUcomBondDisplayed());
		  }
	  
	  @Test
	      public void checkUcomShopPhone() {
		  UcomPersonalPage personal = new UcomPersonalPage(driver);
		  //from personal page click on online shop
		  UcomShopPage shop = personal.clickOnUcomShop();
		  //make sure phone department exists
		  Assert.assertTrue(shop.isShopPhoneDisplayed());
		  }
	  
	  @Test
	     public void checkUcomShopBikes() {
		 UcomPersonalPage personal = new UcomPersonalPage(driver);
		 //from personal page click on online shop
         UcomShopPage shop = personal.clickOnUcomShop();
		 //make sure bike department exists
         Assert.assertTrue(shop.isShopBikesDisplayed());
		 }
		  
	  @Test
	      public void checkUcomShopGadgets() {
		  UcomPersonalPage personal = new UcomPersonalPage(driver);
		  //make sure phone department exists
          UcomShopPage shop = personal.clickOnUcomShop();
          //make sure bike gadgets exists
		  Assert.assertTrue(shop.isShopGadgetsDisplayed());
		  }
	  
	  @Test
	      public void checkBusinessMobile() {
		  UcomHeaderPage business = new UcomHeaderPage(driver);
		  //from the main page go to business part
		  UcomBusinessPage bsns = business.navigateToBusinessPage();
		  // make sure mobile service appears
		  Assert.assertTrue(bsns.isMobileServiceLinkPresents());
		  }  
	
	  @Test
		  public void CheckMobileTable() {
		  UcomHeaderPage business = new UcomHeaderPage(driver);
		  //from the main page go to business part
		  UcomBusinessPage bsn = business.navigateToBusinessPage();
		  // opens business page, click on business mobile link 
		  UcomBusinessMobileCommunication table = bsn.clickOnBusinessMobile();
		  // make sure mobile offer table appears
		  Assert.assertTrue(table.isMobileOfferTableDisplayed());
		  }
	  
	 @Test
	     public void checkBusinessFix() {
		 UcomHeaderPage business = new UcomHeaderPage(driver);
		  //from the main page go to business part
		  UcomBusinessPage bsns = business.navigateToBusinessPage();
		  // make sure fix service appears
		  Assert.assertTrue(bsns.isFixServiceLinkPresents());
		 }
	
	 @Test
	     public void checkBusinessUphoneImg() {
	     UcomHeaderPage business = new UcomHeaderPage(driver);
		  //from the main page go to business part
         UcomBusinessPage bsn = business.navigateToBusinessPage();
         // click on business fix link
		 UcomBusinessFixPage phone = bsn.clickOnBusinessFix();
		 // make sure business Uphone offer appears
		 Assert.assertTrue(phone.isBusinessUphoneDisplayed());
		 }
	
	@Test
		public void checkUcomTv() {
		UcomHeaderPage business = new UcomHeaderPage(driver);
		//from the main page go to business part
		UcomBusinessPage bsns = business.navigateToBusinessPage();
		// make sure business tv service appears
		Assert.assertTrue(bsns.isBusinessTvPresent());
		}
	
	@Test
	    public void checkBusinessTvExtraImg() {
		UcomHeaderPage business = new UcomHeaderPage(driver);
		//from the main page go to business part
		UcomBusinessPage bsn = business.navigateToBusinessPage();
		// click on business tv offer
		UcomBusinessTvPage tv = bsn.clickOnBusinessTv();
		// on the opened page utv extra offer's present
		Assert.assertTrue(tv.isTvExtraImgPresents());
		}
	
	@Test
	   public void checkUdoctorPhone() {
		UcomHeaderPage main = new UcomHeaderPage(driver);
		UcomUdoctorPage doctor = main.clickOnUDoctor();
		Assert.assertTrue(doctor.isUdoctorPhoneDisplayed());
	}
	
	@Test
	   public void checkUdoctorLogin() {
		UcomHeaderPage main = new UcomHeaderPage(driver);
		UcomUdoctorPage doctor = main.clickOnUDoctor();
		UdoctorLoginPage login = doctor.clickOnLoginBtn();
		login.logIn("3333");
		Assert.assertTrue(login.isInputErrorDisplayed());
		
	}
	
	@Test
	public void checkNameTyping() {
		UcomHeaderPage main = new UcomHeaderPage(driver);
		main.clickOnUDoctor();
		UcomUdoctorPage dc = new UcomUdoctorPage(driver);
		dc.typeDoctorsNameWrong("aaa");
		Assert.assertTrue(dc.noResultisDisplayed());
		}
	
	@BeforeMethod
	public void navigateToMainPage() {
		goToMainPage();
	}
}
	   