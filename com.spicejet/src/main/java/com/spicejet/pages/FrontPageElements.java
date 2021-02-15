package com.spicejet.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spicejet.testBase.Driver;

public class FrontPageElements {

	
	

	@FindBy(xpath = "//*[@id=\"header\"]/div[1]/div[1]/a")
	public WebElement spiceJetLogo;

	@FindBy(xpath = "//*[@id=\"highlight-book\"]")
	public WebElement bookBtn;

	@FindBy(xpath = "//*[@id=\"highlight-addons\"]")
	public WebElement addOnBtn;

	@FindBy(xpath = "//*[@id=\"header-vacations\"]/a")
	public WebElement dealsBtn;
	
	@FindBy(xpath = "//*[@id=\"highlight-gift-card\"]")
	public WebElement giftCardBtn;
	
	@FindBy(xpath = "//*[@id=\"SpecialAssistanceToPLink\"]/a")
	public WebElement spiceClubBtn;
	
	@FindBy(xpath = "//*[@id=\"cargoheader\"]/a")
	public WebElement cargoBtn;
	
	@FindBy(xpath = "//*[@id=\"spicestyleheader\"]/a")
	public WebElement spiceStyleBtn;
	
	@FindBy(xpath = "//*[@id=\"spiceshuttle\"]/a")
	public WebElement spiceShuttleBtn;
	
	@FindBy(xpath = "//*[@id=\"charterreq\"]/a")
	public WebElement CharterBtn;
	
	@FindBy(xpath = "//*[@id=\"ctl00_HyperLinkLogin\"]")
	public WebElement loginSignUpBtn;
	
	@FindBy(xpath = "//*[@id=\"buttons\"]/div/div/ul/li[1]/a")
	public WebElement flightsBtn;
	
	@FindBy(xpath = "//*[@id=\"buttons\"]/div/div/ul/li[2]/a/span[2]")
	public WebElement hotelsBtn;
	
	@FindBy(xpath = "//*[@id=\"Covid19info\"]")
	public WebElement covid19InfoBtn;
	
	@FindBy(xpath = "//*[@id=\"buttons\"]/div/div/ul/li[4]/a/span[2]")
	public WebElement flightStatusBtn;
	
	@FindBy(xpath = "//*[@id=\"buttons\"]/div/div/ul/li[5]/a/span[2]")
	public WebElement checkInBtn;
	
	@FindBy(xpath = "//*[@id=\"buttons\"]/div/div/ul/li[6]/a")
	public WebElement manageBookingBtn;
	
	@FindBy(xpath = "//*[@id=\"ctl00_mainContent_rbtnl_Trip\"]/tbody/tr/td[1]/label")
	public WebElement oneWayBtn;
	
	@FindBy(xpath = "//*[@id=\"ctl00_mainContent_rbtnl_Trip_1\"]")
	public WebElement roundTripBtn;
	
	@FindBy(xpath = "//*[@id=\"ctl00_mainContent_rbtnl_Trip\"]/tbody/tr/td[3]/label")
	public WebElement multicityBtn;
	
	@FindBy(xpath = "//*[@id=\\\"ctl00_mainContent_ddl_originStation1_CTXT\\\"]")
	public WebElement fromBoxSelect;
	
	@FindBy(xpath = "//*[@id=\"dropdownGroup1\"]/div/ul[*]/li[*]/a")
	public List<WebElement> fromSelectBoxElementsList1of2;
	
	@FindBy(xpath = "//*[@id=\"dropdownGroup2\"]/div/ul[*]/li[*]/a")
	public List<WebElement> fromSelectBoxElementsList2of2;
	
	@FindBy(xpath = "//*[@id=\"ctl00_mainContent_ddl_destinationStation1_CTXT\"]")
	public WebElement toSelectBox;
	
	@FindBy(xpath = "//*[@id=\"dropdownGroup1\"]/div/ul[*]/li[*]/a")
	public WebElement toSelectBoxElementsList1of2;
	
	@FindBy(xpath = "//*[@id=\"dropdownGroup2\"]/div/ul[*]/li[*]/a")
	public WebElement toSelectBoxElementsList2of2;
	
	@FindBy(xpath = "//*[@id=\"ctl00_mainContent_view_date1\"]")
	public WebElement departDateBox;

	@FindBy(xpath = "//*[@id=\"ctl00_mainContent_view_date2\"]")
	public WebElement returnDateBox;

	@FindBy(xpath = "//*[@id=\"divpaxinfo\"]")
	public WebElement passagersSelect;
	
	@FindBy(xpath = "//*[@id=\"ctl00_mainContent_DropDownListCurrency\"]")
	public WebElement currencySelect;
	
	@FindBy(xpath = "//*[@id=\"ctl00_mainContent_btn_FindFlights\"]")
	public WebElement searchBtn;
	
	@FindBy(xpath = "//*[@id=\"ctl00_mainContent_chk_friendsandfamily\"]")
	public WebElement familyFriendsBtn;
	
	@FindBy(xpath = "//*[@id=\"ctl00_mainContent_chk_SeniorCitizenDiscount\"]")
	public WebElement seniorCitizenBtn;
	
	@FindBy(xpath = "//*[@id=\"ctl00_mainContent_IndArm\"]")
	public WebElement armedForcesBtn;
	
	@FindBy(xpath = "//*[@id=\"ctl00_mainContent_chk_Ltc\"]")
	public WebElement LtcFareBtn;
	
	@FindBy(xpath = "//*[@id=\"ctl00_mainContent_chk_StudentDiscount\"]")
	public WebElement studentBtn;

	@FindBy(xpath = "//*[@id=\"ctl00_mainContent_chk_Unmr\"]")
	public WebElement minorBtn;
	
	@FindBy(xpath = "//*[@id=\"discount-checkbox\"]/span/a")
	public WebElement specialAssistanceInfoBtn;
	
	@FindBy(xpath = "//*[@id=\"home_banner\"]/div[3]/div[*]/div[*]/a/img")
	public List<WebElement> frontPageSlider;
	
	@FindBy(xpath = "")
	public WebElement x;
	
	@FindBy(xpath = "")
	public WebElement x;
	
	@FindBy(xpath = "")
	public WebElement x;
	
	@FindBy(xpath = "")
	public WebElement x;
	
	@FindBy(xpath = "")
	public WebElement x;
	
	@FindBy(xpath = "")
	public WebElement x;
	
	@FindBy(xpath = "")
	public WebElement x;
	
	@FindBy(xpath = "")
	public WebElement x;
	
	@FindBy(xpath = "")
	public WebElement x;
	
	@FindBy(xpath = "")
	public WebElement x;
	
	@FindBy(xpath = "")
	public WebElement x;
	
	@FindBy(xpath = "")
	public WebElement x;
	
	@FindBy(xpath = "")
	public WebElement x;
	
	@FindBy(xpath = "")
	public WebElement x;
	
	@FindBy(xpath = "")
	public WebElement x;
	
	@FindBy(xpath = "")
	public WebElement x;
	
	@FindBy(xpath = "")
	public WebElement x;
	
	@FindBy(xpath = "")
	public WebElement x;
	
	@FindBy(xpath = "")
	public WebElement x;

	
	
	public FrontPageElements() {
		
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	//menu_admin_nationality
}
