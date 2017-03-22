package com.Liqvid.Po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kirwa.nxgreport.NXGReports;
import com.kirwa.nxgreport.logging.LogAs;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen.ScreenshotOf;

public class TeacherProfilePo {
	WebDriver driver = null;
	public TeacherProfilePo(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	// To identify 'Profile' Text in student profile page
	@FindBy(xpath="//div[text()='Profile']")
	private WebElement eleProfileText;
	public WebElement getEleProfileText(){
		return eleProfileText;
	}
	//To identify 'First Name' Text in student profile page
	@FindBy(xpath="//label[text()='First Name']")
	private WebElement eleFirstNameText;
	public WebElement getEleFirstNameText(){
		return eleFirstNameText;
	}
	//To identify 'First Name' Text box in student profile page
	@FindBy(name="first_name")
	private WebElement eleFirstNameTextBox;
	public WebElement getEleFirstNameTextBox(){
		return eleFirstNameTextBox;
	}
	//To identify 'Last Name' Text in student profile page
	@FindBy(xpath="//label[text()='Last Name']")
	private WebElement eleLastNameText;
	public WebElement getEleLastNameText(){
		return eleLastNameText;
	}
	//To identify 'Last Name' Text box in student profile page
	@FindBy(name="last_name")
	private WebElement eleLastNameTextBox;
	public WebElement getEleLastNameTextBox(){
		return eleLastNameTextBox;
	}
	//To identify 'Email Id' Text in student profile page
	@FindBy(xpath="//label[text()='Email ID']")
	private WebElement eleEmailIdText;
	public WebElement getEleEmailIdText(){
		return eleEmailIdText;
	}
	//To identify 'Email Id' Text box in student profile page
	@FindBy(name="email_id")
	private WebElement eleEmailIdTextBox;
	public WebElement getEleEmailIdTextBox(){
		return eleEmailIdTextBox;
	}
	//To identify 'Phone' Text in student profile page
	@FindBy(xpath="//label[text()='Phone']")
	private WebElement elePhoneText;
	public WebElement getElePhoneText(){
		return elePhoneText;
	}
	//To identify 'Phone' Text box in student profile page
	@FindBy(name="phone")
	private WebElement elePhoneTextBox;
	public WebElement getElePhoneTextBox(){
		return elePhoneTextBox;
	}
	//To identify 'Date Of Birth' Text in student profile page
	@FindBy(xpath="//label[text()='Date Of Birth']")
	private WebElement eleDateOfBirthText;
	public WebElement getEleDateOfBirthText(){
		return eleDateOfBirthText;
	}
	// To identify 'Calendar' icon in student profile page
	@FindBy(xpath="//i[@ class='fa fa-calendar']")
	private WebElement eleCalendarIcon;
	public WebElement getEleCalendarIcon(){
		return eleCalendarIcon;
	}
    //select a date from calender
	@FindBy(xpath="(//table[contains(@class,'table-condensed')])[1]/tbody/tr[3]/td[2]")
	private WebElement eleDateSelected;
	public WebElement getEleDateSelected()
	{
	return eleDateSelected;
	}		
	// To identify 'Date of Birth' Text box in student profile page
	@FindBy(id="date_of_birth")
	private WebElement eleDateOfBirthTextBox;
	public WebElement getEleDateOfBirthTextBox(){
		return eleDateOfBirthTextBox;
	}
	//To identify 'Gender' Text in student profile page
	@FindBy(xpath="//label[text()='Gender']")
	private WebElement eleGenderText;
	public WebElement getEleGenderText(){
		return eleGenderText;
	}
	//To identify 'Gender'Drop Down in student profile page
	@FindBy(id="gender")
	private WebElement eleGenderDropDown;
	public WebElement getEleGenderDropDown(){
		return eleGenderDropDown;
	}
	// To identify Change Password Text in student profile page
	@FindBy(id="chPassword")
	private WebElement eleChangePwd;
	public WebElement getEleChangePwd(){
		return eleChangePwd;
	}
	//To identify 'Plus(+)'icon in student profile page
	@FindBy(xpath="//a[@id='chPassword']//i")
	private WebElement elePlusIcon;
	public WebElement getElePlusIcon(){
		return elePlusIcon;
	}
	//To identify 'minus(-)'icon in student profile page
	@FindBy(xpath="//a[@id='chPassword']//i")
	private WebElement eleMinusIcon;
	public WebElement getEleMinusIcon(){
		return eleMinusIcon;
	}
	//To identify 'Old Password' Text in student profile page
	@FindBy(xpath="//label[text()='Old Password']")
	private WebElement eleOldPasswordText;
	public WebElement getEleOldPasswordText(){
		return eleOldPasswordText;
	}
	//To identify 'Old Password' Text Box in student profile page
	@FindBy(id="old_password")
	private WebElement eleOldPasswordTextBox;
	public WebElement getEleOldPasswordTextBox(){
		return eleOldPasswordTextBox;
	}
	//To identify 'New password' Text in student profile page
	@FindBy(xpath="//label[text()='New password']")
	private WebElement eleNewPasswordText;
	public WebElement getEleNewPasswordText(){
		return eleNewPasswordText;
	}
	//To identify 'New Password' Text box in student profile page
	@FindBy(id="pwd")
	private WebElement eleNewPasswordTextBox;
	public WebElement getEleNewPasswordTextBox(){
		return eleNewPasswordTextBox;
	}
	//To identify 'Confirm password' Text in student profile page
	@FindBy(xpath="//label[text()='Confirm password']")
	private WebElement eleConfirmPasswordText;
	public WebElement getEleConfirmPasswordText(){
		return eleConfirmPasswordText;
	}
	//To identify 'Confirm password' Text box in student profile page
	@FindBy(id="cpwd")
	private WebElement eleConfirmNewPasswordTextBox;
	public WebElement getEleConfirmNewPasswordTextBox(){
		return eleConfirmNewPasswordTextBox;
	}
	//To identify 'Update' Button in student profile page
	@FindBy(name="update")
	private WebElement eleUpdateButton;
	public WebElement getEleUpdateButton(){
		return eleUpdateButton;
	}
	//To identify "The Value is required." error message in student profile page
	@FindBy(xpath="//li[contains(text(),'This value is required.')]")
	private WebElement eleValueRequiredErrMsg;
	public WebElement getEeleValueRequiredErrMsg(){
		return eleValueRequiredErrMsg;
	}
	// To identify "Invalid Old password " error message in student profile page
	@FindBy(id="errMsg")
	private WebElement eleInvalidOldPwdErrMsg;
	public WebElement getEleInvalidOldPwdErrMsg(){
	return eleInvalidOldPwdErrMsg;
	}
	// To identify "This value should be a valid email." error message in student profile page
	@FindBy(xpath="//li[text()='This value should be a valid email.']")
	private WebElement eleEmailIdErrorMsg;
	public WebElement getEleEmailIdErrorMsg(){
	return eleEmailIdErrorMsg;
	}	
	
	// To identify "This value should be a valid phone number." error message in student profile page
	@FindBy(xpath="//li[text()='This value should be a valid phone number.']")
	private WebElement elePhoneNumberErrorMsg;
	public WebElement getElePhoneNumberErrorMsg(){
	return elePhoneNumberErrorMsg;
	}	
	// To identify "This value is too short. It should have 6 characters or more." error message in student profile page
	@FindBy(xpath="//li[text()='This value is too short. It should have 6 characters or more.']")
	private WebElement eleValueIsShortErrorMsg;
	public WebElement getEleValueIsShortErrorMsg(){
	return eleValueIsShortErrorMsg;
	}	
	// To identify "This value should be the same." error message in student profile page
	@FindBy(xpath="//li[text()='This value should be the same.']")
	private WebElement eleValueShouldSameErrorMsg;
	public WebElement getEleValueShouldSameErrorMsg(){
	return eleValueShouldSameErrorMsg;
	}
	//update sucessfull message
	@FindBy(xpath="//p[@id='errMsg']")
	private WebElement eleUpdateSucessFullMsg;
	public WebElement getEleUpdateSucessFullMsg()
	{
	return eleUpdateSucessFullMsg;
	}
	@FindBy(xpath="//li[contains(text(),'This value should be the same')]")
	private WebElement eleValueShouldbeSameMsg;
	public WebElement getEleValueShouldbeSameMsg()
	{
	return eleValueShouldbeSameMsg;
	}
	public void UpdateProfile(String firstname,String lastname,String email,String phoneno) throws InterruptedException
	{
		TeacherSignPo teachersigninpo=new TeacherSignPo(driver);
		try
		{
			teachersigninpo.elementStatus(getEleFirstNameTextBox(), "The Firstname text field","displayed");
			getEleFirstNameTextBox().sendKeys(firstname);
			teachersigninpo.elementStatus(getEleLastNameTextBox(), "The Lastname text field","displayed");
			getEleLastNameTextBox().sendKeys(lastname);
			teachersigninpo.elementStatus(getEleEmailIdTextBox(), "The Email id text field","displayed");
			getEleEmailIdTextBox().sendKeys(email);
			teachersigninpo.elementStatus(getElePhoneTextBox(), "The Phone number text field","displayed");
			getElePhoneTextBox().sendKeys(phoneno);
			
		}
		catch(Exception e)
		{
			 NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			 throw e;
		}
	}
	
			
	
	

}
