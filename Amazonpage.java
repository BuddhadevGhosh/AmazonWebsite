package com.qa.AutomateWebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

public class Amazonpage
{
		WebDriver driver;
		
		@FindBy(xpath="//*[@id=\'nav-link-accountList\']")
		WebElement all;
		public WebElement All()
		{
			return all;
		}
		@FindBy(linkText="Sign Out")
		WebElement logout;
		public WebElement Logout()
		{
			return logout;
		}
		@FindBy(xpath="//*[@id=\'nav-hamburger-menu\']")
		WebElement menu;
		public WebElement Menu()
		{
			return menu;
		}
		
		
		
		@FindBy(xpath=".//*[@name='email']")
		WebElement mail;
		public WebElement Username()
		{
			return mail;
		}
		@FindBy(id="continue")
		WebElement Continue;
		public WebElement Continue()
		{
			return Continue;
		}
		@FindBy(xpath=".//*[@type='password']")
		WebElement pass;
		public WebElement Password()
		{
			return pass;
		}
		@FindBy(xpath=".//*[@type='submit']")
		WebElement submit;
		public WebElement Submit()
		{
			return submit;
		}
		
		@FindBy(linkText="Amazon Pay") WebElement amazonpay;
		public WebElement amazonPay()
		{
			return amazonpay;
		}
		@FindBy(xpath="//*[@id=\'MobileRecharge\']/span/a/div[2]/span") WebElement recharge;
		public WebElement mRecharge()
		{
			return recharge;
		}
		
		@FindBy(xpath="//*[@id=\'mobileNumberTextInputId\']") WebElement mnumber;
		public WebElement mNumber()
		{
			return mnumber;
		}
		@FindBy(xpath="") WebElement mnumberinput;
		public WebElement mNumberInput()
		{
			return mnumberinput;
		}
		
		@FindBy(xpath="//*[@id=\'amountTextInputId\']") WebElement mamount;
		public WebElement rAmount()
		{
			return mamount;
		}
		
		
		
		@FindBy(xpath="//*[@id=\"buyButtonNative\"]") WebElement mclick;
		public WebElement rClick()
		{
			return mclick;
		}
		
		@FindBy(linkText="SignIn")
		WebElement signin;
		public WebElement SignIn()
		{
			return signin;
		}
		
		@FindBy(xpath=".//*[@type='text']")
		WebElement searchbox;
		public WebElement SearchBox()
		{
			return searchbox;
		}
		@FindBy(xpath="//*[@id=\'nav-search-submit-button\']")
		WebElement search;
		public WebElement Search()
		{
			return search;
		}
		
		@FindBy(xpath="//*[@id=\'nav-global-location-data-modal-action\']")
		WebElement updateadress;
		public WebElement setAdress()
		{
			return updateadress;
		}
		@FindBy(xpath="//*[@id=\'ya-myab-address-add-link\']/div")
		WebElement newadress;
		public WebElement newAdress()
		{
			return newadress;
		}
		
		@FindBy(xpath="//*[@id=\"GLUXManageAddressLink\"]/a")
		WebElement updateA;
		public WebElement adressNavigate()
		{
			return updateA;
		}
		
		
		
		@FindBy(xpath="//*[@id=\"address-ui-widgets-countryCode\"]/span/span")
		WebElement country;
		public WebElement Country()
		{
			return country;
		}
		@FindBy(xpath="//*[@id=\'address-ui-widgets-countryCode-dropdown-nativeId_101\']")
		WebElement choose;
		public WebElement chooseCountry()
		{
			return choose;
		}
		@FindBy(xpath=".//*[@id=\'address-ui-widgets-enterAddressFullName\']")
		WebElement name;
		public WebElement Name()
		{
			return name;
		}
		@FindBy(xpath=".//*[@id=\'address-ui-widgets-enterAddressPhoneNumber\']")
		WebElement mobile;
		public WebElement Mobile()
		{
			return mobile;
		}
		@FindBy(xpath="//*[@id=\'address-ui-widgets-enterAddressPostalCode\']")
		WebElement pincode;
		public WebElement pinCode()
		{
			return pincode;
		}
		
		@FindBy(xpath="//*[@id=\'address-ui-widgets-enterAddressLine1\']")
		WebElement adressline;
		public WebElement Adressline()
		{
			return adressline;
		}
		
		@FindBy(xpath="//*[@id=\'address-ui-widgets-enterAddressLine2\']")
		WebElement adressline2;
		public WebElement Adressline2()
		{
			return adressline2;
		}
		
		@FindBy(xpath="//*[@id=\'address-ui-widgets-landmark\']")
		WebElement landmark;
		public WebElement Landmark()
		{
			return landmark;
		}
		@FindBy(xpath="//*[@id=\'address-ui-widgets-enterAddressStateOrRegion\']/span/span")
		WebElement state;
		public WebElement State()
		{
			return state;
		}
		@FindBy(xpath="//*[@id=\'address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId_35\']")
		WebElement statechoose;
		public WebElement stateChoose()
		{
			return statechoose;
		}
		@FindBy(xpath=".//*[@area-owns='3_dropdown_combobox']")
		WebElement type;
		public WebElement Type()
		{
			return type;
		}
		
		@FindBy(xpath="//*[@id=\'3_dropdown_combobox\']/li[2]/a")
		WebElement delivery;
		public WebElement Delivery()
		{
			return delivery;
		}
		@FindBy(xpath="//*[@id=\'address-ui-widgets-form-submit-button\']/span/input")
		WebElement addadress;
		public WebElement addAdress()
		{
			return addadress;
		}
		@FindBy()
		WebElement buynow;
		public WebElement Buynow()
		{
			return buynow;
		}	
			
	public Amazonpage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
}