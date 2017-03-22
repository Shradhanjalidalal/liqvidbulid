package com.Liqvid.Po;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.Liqvid.Library.GenericLib;



public class TeacherHomePo {
	WebDriver driver = null;
	public static int sStatusCnt=0;
	public static String sLiquidInstallerFile = GenericLib.sDirPath+"\\resources\\Image\\Liqvid.png";	
	public TeacherHomePo(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	// To identify 'English Edge' Logo in the home page
	@FindBy(xpath="//a[@ class='navbar-brand']//img")
	private WebElement eleLogo;
	public WebElement getEleLogo(){
		return eleLogo;
	}
	// To identify 'English Edge' Version in the home page
	@FindBy(xpath="//p[@class='codeVersion']")
	private WebElement eleBulidVersion;
	public WebElement getEleBulidVersion(){
		return eleBulidVersion;
	}
	// To identify count of 'Total Sessions' in the home page
	@FindBy(id="totalSession")
	private WebElement eleTotalSessionCount;
	public WebElement getEleTotalSessionCount(){
		return eleTotalSessionCount;
	}
	//To identify 'Total Sessions' text in the home page
	@FindBy(xpath="//span[text()='Total Sessions']")
	private WebElement eleTotalSessionText;
	public WebElement getEleTotalSessionText(){
		return eleTotalSessionText;
	}
	//To identify count of 'Completed Sessions' in the home page
	@FindBy(id="attemptedSession")
	private WebElement eleCompletedSessionCount;
	public WebElement getEleCompletedSessionCount(){
		return eleCompletedSessionCount;
	}
	//To identify 'Completed' text in the home page
	@FindBy(xpath="//span[text()='Completed']")
	private WebElement eleCompletedText;
	public WebElement getEleCompletedText(){
		return eleCompletedText;
	}
	//To identify count of 'Remaining Sessions' in the home page
	@FindBy(id="remainingSession")
	private WebElement eleRemainingSessionCount;
	public WebElement getEleRemainingSessionCount(){
		return eleRemainingSessionCount;
	}
	//To identify 'Remaining' text in the home page
	@FindBy(xpath="//span[text()='Remaining']")
	private WebElement eleRemainingText;
	public WebElement getEleRemainingText(){
		return eleRemainingText;
	}
	//To identify 'Home' icon in the home page
	@FindBy(xpath="//li[@ class='nav active']//i")
	private WebElement eleHomeIcon;
	public WebElement getEleHomeIcon(){
		return eleHomeIcon;
	}
	//To identify 'Home' Tab in the home page
	@FindBy(xpath="//span[text()='Home']")
	private WebElement eleHomeTab;
	public WebElement getEleHomeTab(){
		return eleHomeTab;
	}
	//To identify 'Welcome' Text in the home page
	@FindBy(xpath="//div[@class='col-sm-12 h4 font-bold htitle']")
	private WebElement eleWelcomeText;
	public WebElement getEleWelcomeText(){
		return eleWelcomeText;
	}
	
	// To identify 'student Name' in the home page
	@FindBy(className="name")
	private WebElement eleStudentName;
	public WebElement getEleStudentName(){
		return eleStudentName;
	}
	// To identify 'Center Name' in the home page
	@FindBy(className="name")
	private WebElement eleCenterName;
	public WebElement getEleCenterName(){
		return eleCenterName;
	}
	// To identify 'EmailId' icon in the home page
	@FindBy(xpath="//div[@ class='emailId']/i")
	private WebElement eleEmailIdIcon;
	public WebElement getEleEmailIdIcon(){
		return eleEmailIdIcon;
	}
	//To identify 'EmailId' Text in the stduent home page
	@FindBy(className="emailId")
	private WebElement eleEmailId;
	public WebElement getEleEmailId(){
		return eleEmailId;
	}
	//To identify 'Last Login' in the home page
	@FindBy(xpath="//div[contains(text(),'Last Login')]")
	private WebElement eleLastLogin;
	public WebElement getEleLastLogin(){
		return eleLastLogin;
	}
	//To identify 'Last Course taken' in the home page
	@FindBy(xpath="//div[contains(text(),'Last Course')]")
	private WebElement eleLastCourse;
	public WebElement getEleLastCourse(){
		return eleLastCourse;
	}
	//To identify 'Last Session taken' in the home page
	@FindBy(xpath="//div[contains(text(),'Last Session')]")
	private WebElement eleLastSession;
	public WebElement getEleLastSession(){
		return eleLastSession;
	}
	// To identify 'Profile Drop down' in the home page
	@FindBy(className="dropdown-toggle")
	private WebElement eleProfileDropdown;
	public WebElement getEleProfileDropdown(){
		return eleProfileDropdown;
	}
	//To identify 'Profile image' in the Dropdown
	@FindBy(xpath="//span[@class='thumb-sm avatar pull-left']/img")
	private WebElement eleProfileImgInDropdown;
	public WebElement getEleProfileImgInDropdown(){
		return eleProfileImgInDropdown;
	}
	// To identify "teacher Name" in the Dropdown
	@FindBy(xpath="(//a[@class='dropdown-toggle']//span)[2]")
	private WebElement eleProfileTextDropdown;
	public WebElement getEleProfileTextDropdown(){
		return eleProfileTextDropdown;
	}
	//to identify "profile option in the home page dropdown
	@FindBy(xpath="//a[text()='Profile']")
	private WebElement eleProfileOption;
	public WebElement getEleProfileOption(){
		return eleProfileOption;
	}
	//to identify "logout option in the home page dropdown
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement eleLogoutOption;
	public WebElement getEleLogoutOption(){
		return eleLogoutOption;
	}
	//to identify 'Courses' tab in the home page
	@FindBy(xpath="//span[contains(text(),'Courses')]")
	private WebElement eleCoursesTab;
	public WebElement getEleCoursesTab(){
		return eleCoursesTab;
	}
	
	//to identify 'Resources' tab in the home page
	@FindBy(xpath="//span[text()='Resources']")
	private WebElement eleResourcesTab;
	public WebElement getEleResourcesTab(){
		return eleResourcesTab;
		}
	//to identify the profile photo option in home page
	@FindBy(xpath="//label[@for='file-input']")
	private WebElement eleStudentProfilePhoto;
	public WebElement getEleStudentProfilePhoto()
	{
		return eleStudentProfilePhoto;
	}
	//to identify the browse button in home page
	@FindBy(xpath="//input[@type='file']")
	private WebElement eleBrowseBtn;
	public WebElement getEleBrowseBtn()
	{
		return eleBrowseBtn;
	}
	//to identify the Submit button in home page
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement eleSubmitBtn;
	public WebElement getEleSubmitBtn()
	{
		return eleSubmitBtn;
	}
	//to identify the Edit button in home page
	@FindBy(xpath="//div[text()='Edit']")
	private WebElement eleEditBtn;
	public WebElement getEleEditBtn()
	{
		return eleEditBtn;
	}
	//to identify the image is displayed in home page
	@FindBy(xpath="//span[@class='thumb-sm avatar pull-left']//img")
	private WebElement eleStudentProfileimage;
	public WebElement getEleStudentProfileimage()
	{
		return eleStudentProfileimage;
	}
	//to identify the cancel button in home page
	@FindBy(xpath="//a[@class='btn btn-success btn-default']")
	private WebElement eleCancelBtn;
	public WebElement getEleCancelBtn()
	{
		return eleCancelBtn;
	}
	//to identify the Removeimage button in home page
	@FindBy(xpath="//a[contains(text(),'Remove Image')]")
	private WebElement eleRemoveImageBtn;
	public WebElement getEleRemoveImageBtn()
	{
		return eleRemoveImageBtn;
	}
	//To identify 'Courses' icon in the home page
	@FindBy(xpath="(//li[@ class='nav']//i)[1]")
	private WebElement eleCoursesIcon;
	public WebElement getEleCoursesIcon(){
		return eleCoursesIcon;
	}
	//To identify 'Resourses' icon in the home page
	@FindBy(xpath="(//li[@ class='nav']//i)[2]")
	private WebElement eleResoursesIcon;
	public WebElement getEleResoursesIcon(){
		return eleResoursesIcon;
	}
	
	//To identify 'Student details' in the home page
	@FindBy(xpath="//span[@class='InfoBg']")
	private List<WebElement> eleStudentDetails;
	public List<WebElement> getEleStudentDetails(){
		return eleStudentDetails;
	}
	
	//To identify 'Last Login, Course and Session'Details  in the home page
	@FindBy(xpath="//div[@ class='col-md-5 col-sm-5 col-xs-12 profileTopRight']")
	private List<WebElement> eleLastDetails;
	public List<WebElement> getEleLastDetails(){
		return eleLastDetails;
	}
	//To identify 'Course text  in the home page
	@FindBy(xpath="//div//small[text()='Courses']")
	private WebElement eleCoursesText;
	public WebElement getEleCoursesText(){
		return eleCoursesText;
	}
	//To identify 'Course count  in the home page
	@FindBy(xpath="(//div[@class='h3  m-t-xs'])[1]")
	private WebElement eleCourseCount;
	public WebElement getEleCourseCount(){
		return eleCourseCount;
	}
	
	//To identify 'Session count  in the home page
	@FindBy(xpath="(//div[@class='h3  m-t-xs'])[2]")
	private WebElement eleSessionCount;
	public WebElement getEleSessionCount(){
		return eleSessionCount;
	}
	//To identify 'Course text  in the home page
	@FindBy(xpath="//div//small[text()='Courses']")
	private WebElement eleSessionText;
	public WebElement getEleSessionText(){
	return eleSessionText;
	}
	//To verify in veritical Timespent is showing or n't
	@FindBy(xpath="//h4[text()='Time Spent']")  
	private WebElement eleTimeSpent;
	public WebElement getEleTimeSpent()
	{
		 return eleTimeSpent;
	}
	//To verify horzontal Course is shwing or n't
	@FindBy(xpath="//h4[text()='Courses']")
	private WebElement eleCourse;
	public WebElement getEleCourse()
	{
		return eleCourse;
	}
	//To verify Time Spent (min.)/Courses
	@FindBy(xpath="//td[text()='Time Spent (min.)/Courses']")
	private WebElement eleTimeSpentPerCourse;
	public WebElement getEleTimeSpentPerCourse()
	{
		return eleTimeSpentPerCourse;
	}
	//To verify the graph
	@FindBy(className="flot-overlay")
	private WebElement eleGraph;
	public WebElement getEleGraph()
	{
		return eleGraph;
	}
	//Click on profile photo
	@FindBy(xpath="//input[@class='col-sm-7 form-control inline input-s btn btn-default']")
	private WebElement elePhotoPath;
	public WebElement getElePhotoPath()
	{
		return elePhotoPath;
	}

}
