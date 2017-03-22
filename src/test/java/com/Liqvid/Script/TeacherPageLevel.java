package com.Liqvid.Script;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Liqvid.Library.BaseLib;
import com.Liqvid.Library.GenericLib;
import com.Liqvid.Po.TeacherCoursePo;
import com.Liqvid.Po.TeacherHomePo;
import com.Liqvid.Po.TeacherProfilePo;
import com.Liqvid.Po.TeacherResourcesPo;
import com.Liqvid.Po.TeacherSignPo;
import com.kirwa.nxgreport.NXGReports;
import com.kirwa.nxgreport.logging.LogAs;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen.ScreenshotOf;



public class TeacherPageLevel extends BaseLib
{
	String sTestData=null;
	String[] sData=null;
	
	TeacherSignPo teacherpo;
	TeacherHomePo teacherhomepo;
	TeacherProfilePo teacherprofilepo;
	TeacherCoursePo teachercoursepo;
	TeacherResourcesPo teacherresourcespo;
	
	@Test(priority=1,enabled=false,description="To clear the databases of Assessment")
	public void sampleDatabaseTest(){
		try
		{
		  databaseTest();
		}
		catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	@Test(priority=2,enabled=false,description="Display of elements on Login Page")
	public void LogInPageElement() throws Exception
	{
		teacherpo=new TeacherSignPo(driver);
		try{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			Thread.sleep(2000);
			teacherpo.elementStatus(teacherpo.getEleLogo(),"The English Edge logo is", "displayed");
			teacherpo.elementStatus(teacherpo.getEleSignInText(),"The Sign in text is", "displayed");
			teacherpo.elementStatus(teacherpo.getEleSignInInstrText(),"The Sign in instruction text is", "displayed");
			teacherpo.elementStatus(teacherpo.getEleUserNameText(),"The Username text is", "displayed");
			teacherpo.elementStatus(teacherpo.getEleUserNameTextField(),"The Username textfield is", "displayed");
			teacherpo.elementStatus(teacherpo.getElePwdText(),"The password text is", "displayed");
			teacherpo.elementStatus(teacherpo.getElePasswordTextFiled(),"The password textfield is", "displayed");
			teacherpo.elementStatus(teacherpo.getEleSignInBtn(),"The Sign in button is", "displayed");
			teacherpo.elementStatus(teacherpo.getEleForgotPwdLink(),"The forgot password link is", "displayed");
			teacherpo.elementStatus(teacherpo.getEleRegisterInstrText(),"The register instruction text is", "displayed");
			teacherpo.elementStatus(teacherpo.getEleRegisterBtn(),"The register button is", "displayed");
			teacherpo.elementStatus(teacherpo.getCodeVersionDateText(),"the copyright version text is", "displayed");
			teacherpo.elementStatus(teacherpo.getEleBulidVersionDateText(),"the bulid version text is", "displayed");
	
		}catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	@Test(priority=3,enabled=true, description="Display of elements on Student Home Page")
	public void studentHomepage() throws Exception{
		teacherpo=new TeacherSignPo(driver);
		teacherhomepo=new TeacherHomePo (driver);
		try{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			teacherpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
			Thread.sleep(4000);
			teacherpo.elementStatus(teacherhomepo.getEleLogo(),"The English Edge logo is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleBulidVersion(),"The English Edge bulid version is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleTotalSessionCount(),"The total session count is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleTotalSessionText(),"The total session text is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleCompletedSessionCount(),"The completed session count is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleCompletedText(),"The completed session text is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleRemainingSessionCount(),"The remaining session count is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleRemainingText(),"The remaining session text is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleHomeIcon(),"The home icon is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleHomeTab(),"The home tab is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleCoursesIcon(),"The courses icon is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleCoursesTab(),"The courses tab is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleResoursesIcon(),"The resources icon is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleResourcesTab(),"The resources tab is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleWelcomeText(),"The Welcome text is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleStudentProfileimage(),"The Student profile image option is", "displayed");
			for(WebElement eleProductlist:teacherhomepo.getEleStudentDetails())
			{
				teacherpo.elementStatus(eleProductlist,"The Student details is ", "displayed");
			}
			for(WebElement eleProductlist:teacherhomepo.getEleLastDetails())
			{
				teacherpo.elementStatus(eleProductlist,"The Last Login, Course and Session details is ", "displayed");
			}
			teacherpo.elementStatus(teacherhomepo.getEleProfileDropdown(),"The Profile Dropdown is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleProfileImgInDropdown(),"The Profile Dropdown is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleProfileTextDropdown(),"The Profile text Dropdown is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleCourseCount(),"The Courses count is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleCoursesText(),"The Courses text is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleSessionCount(),"The session count is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleSessionText(),"The session text is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleTimeSpent(),"The timespent text in y axis", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleCourse(),"The course text in x axis", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleTimeSpentPerCourse(),"The timespentpercourse text is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleTimeSpentPerCourse(),"The timespentpercourse text is", "displayed");
			teacherpo.elementStatus(teacherhomepo.getEleGraph(),"The Graph is", "displayed");
			
		}catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	@Test(priority=4,enabled=true, description="Display of elements on Student Profile Page")
	public void studentProfilePage() throws Exception{
		teacherpo=new TeacherSignPo(driver);
		
		teacherprofilepo=new TeacherProfilePo(driver);
		try{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			teacherpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
			Thread.sleep(4000);
			teacherhomepo.getEleProfileTextDropdown().click();
			teacherhomepo.getEleProfileOption().click();
		    teacherpo.elementStatus(teacherprofilepo.getEleProfileText(),"The Profile text is", "displayed");
			teacherpo.elementStatus(teacherprofilepo.getEleFirstNameText(),"The firstname text is", "displayed");
			teacherpo.elementStatus(teacherprofilepo.getEleFirstNameTextBox(),"The firstname textbox is", "displayed");
			teacherpo.elementStatus(teacherprofilepo.getEleLastNameText(),"The lastname text is", "displayed");
			teacherpo.elementStatus(teacherprofilepo.getEleLastNameTextBox(),"The lastname textbox is", "displayed");
			teacherpo.elementStatus(teacherprofilepo.getEleEmailIdText(),"The Email id text is", "displayed");
			teacherpo.elementStatus(teacherprofilepo.getEleEmailIdTextBox(),"The Emailid textbox is", "displayed");
			teacherpo.elementStatus(teacherprofilepo.getElePhoneText(),"The phone text is", "displayed");
			teacherpo.elementStatus(teacherprofilepo.getElePhoneTextBox(),"The phone textbox is", "displayed");
			teacherpo.elementStatus(teacherprofilepo.getEleDateOfBirthText(),"The dateofBirth text is", "displayed");
			teacherpo.elementStatus(teacherprofilepo.getEleDateOfBirthTextBox(),"The dateofBirth textbox is", "displayed");
			teacherpo.elementStatus(teacherprofilepo.getEleDateOfBirthTextBox(),"The dateofBirth textbox is", "displayed");
			teacherpo.elementStatus(teacherprofilepo.getEleCalendarIcon(),"The Calander icon is", "displayed");
			teacherpo.elementStatus(teacherprofilepo.getEleGenderText(),"The Gender Text is", "displayed");
			teacherpo.elementStatus(teacherprofilepo.getEleGenderDropDown(),"The Gender dropdown is", "displayed");
			teacherpo.elementStatus(teacherprofilepo.getElePlusIcon(),"The plus icon is", "displayed");
			teacherpo.elementStatus(teacherprofilepo.getEleChangePwd(),"The change password link is", "displayed");
			Thread.sleep(3000);
			teacherprofilepo.getEleChangePwd().click();
			teacherpo.elementStatus(teacherprofilepo.getEleMinusIcon(),"The minus icon is", "displayed");
			teacherpo.elementStatus(teacherprofilepo.getEleOldPasswordText(),"The old password text is", "displayed");
			teacherpo.elementStatus(teacherprofilepo.getEleOldPasswordTextBox(),"The old password textbox is", "displayed");
			teacherpo.elementStatus(teacherprofilepo.getEleNewPasswordText(),"The new password text is", "displayed");
			teacherpo.elementStatus(teacherprofilepo.getEleNewPasswordTextBox(),"The new password textbox is", "displayed");
			teacherpo.elementStatus(teacherprofilepo.getEleConfirmPasswordText(),"The confirm password text is", "displayed");
			teacherpo.elementStatus(teacherprofilepo.getEleConfirmNewPasswordTextBox(),"Theconfirm password textbox is", "displayed");
			teacherpo.elementStatus(teacherprofilepo.getEleUpdateButton(),"Update button is", "displayed");
		}
		catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	
}
