package com.Liqvid.Script;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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
	@Test(priority=3,enabled=false, description="Display of elements on teacher Home Page")
	public void TeacherHomepage() throws Exception{
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
	@Test(priority=4,enabled=false, description="Display of elements on teacher Profile Page")
	public void TeacherProfilePage() throws Exception{
		teacherpo=new TeacherSignPo(driver);
		teacherprofilepo=new TeacherProfilePo(driver);
		teacherhomepo=new TeacherHomePo (driver);
		try{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			teacherpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
			Thread.sleep(7000);
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
	@Test(priority=5,enabled=false, description="Display of elements on teacher Courses page")
	public void TeacherCourses() throws Exception{
		teacherpo=new TeacherSignPo(driver);
		teachercoursepo=new TeacherCoursePo(driver);
		try{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			teacherpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
			Thread.sleep(4000);
			teachercoursepo.getEleCourseTab().click();
			Thread.sleep(2000);
			teacherpo.elementStatus(teachercoursepo.getEleCourseText(),"Course text is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleInstructionText(),"Course instruction text is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleStepText(),"step text is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleStep1Circle(),"step circle symbol is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleBatchText(),"Batch text is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleStep1Circle(),"step circle symbol is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleSelectBatchText(),"Select batch text is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleSelectcourseText(),"Select course text is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleClickcourseText(),"Click course text is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleCourseText(),"course text is", "displayed");
		
		}catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	@Test(priority=6,enabled=false, description="Display of elements on teacher session page in course module")
	public void TeacherSession() throws Exception{
		teacherpo=new TeacherSignPo(driver);
		teachercoursepo=new TeacherCoursePo(driver);
		try{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			teacherpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
			Thread.sleep(4000);
			teachercoursepo.getEleCourseTab().click();
			Thread.sleep(2000);
			teacherpo.elementStatus(teachercoursepo.getEleCourseText(),"Course text is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleInstructionText(),"Course instruction text is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleStepText(),"step text is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleStep1Circle(),"step circle symbol is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleBatchText(),"Batch text is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleStep1Circle(),"step circle symbol is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleSelectBatchText(),"Select batch text is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleSelectcourseText(),"Select course text is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleClickcourseText(),"Click course text is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleCourseText(),"course text is", "displayed");
			Thread.sleep(6000);	
			Select select=new Select(teachercoursepo.getEleBatchSelected());
			select.selectByIndex(0);
			Thread.sleep(6000);
			Select select1=new Select(teachercoursepo.getEleCourseSelected());
			select1.selectByIndex(0);
			Thread.sleep(2000);
			teachercoursepo.getEleStartCourseButton().click();
			teacherpo.scrolldown();
			Thread.sleep(4000);
			driver.switchTo().frame(0);
			teacherpo.elementStatus(teachercoursepo.getEleSession(),"all session is","displayed");
		
		}catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	@Test(priority=7,enabled=false, description="Display of all sessions on teacher session page")
	public void AllSession() throws Exception{
		teacherpo=new TeacherSignPo(driver);
		teachercoursepo=new TeacherCoursePo(driver);
		try{
			loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
			teacherpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
			Thread.sleep(4000);
			teachercoursepo.getEleCourseTab().click();
			Thread.sleep(2000);
			teacherpo.elementStatus(teachercoursepo.getEleCourseText(),"Course text is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleInstructionText(),"Course instruction text is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleStepText(),"step text is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleStep1Circle(),"step circle symbol is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleBatchText(),"Batch text is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleStep1Circle(),"step circle symbol is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleSelectBatchText(),"Select batch text is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleSelectcourseText(),"Select course text is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleClickcourseText(),"Click course text is", "displayed");
			teacherpo.elementStatus(teachercoursepo.getEleCourseText(),"course text is", "displayed");
		    Thread.sleep(6000);	
			Select select=new Select(teachercoursepo.getEleBatchSelected());
			select.selectByIndex(0);
			Thread.sleep(6000);
			Select select1=new Select(teachercoursepo.getEleCourseSelected());
			select1.selectByIndex(0);
			Thread.sleep(2000);
			teachercoursepo.getEleStartCourseButton().click();
			teacherpo.scrolldown();
			Thread.sleep(4000);
			driver.switchTo().frame(0);
			teacherpo.elementStatus(teachercoursepo.getEleSession(),"all session is","displayed");
		    WebElement table = driver.findElement(By.xpath("//div[@class='divMiddle']"));
			List<WebElement>links = table.findElements(By.tagName("a")); 
			for(WebElement tdElement : links) 
			{ 
			 System.out.println(tdElement.getText()); 
			} 
		
		}catch(AssertionError e)
		{
			NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	@Test(priority=8,enabled=true, description="Display of Elements in  Pre Assessment Instructions Page")
	public void preAssessmentInstruction() throws Exception{
	teacherpo=new TeacherSignPo(driver);
	teachercoursepo=new TeacherCoursePo(driver);
	
	try{
		loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile, "REGISTRATIONURL"));
		teacherpo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "TEACHERPASSWORD"));
		Thread.sleep(4000);	
		teachercoursepo.getEleCourseTab().click();
		Thread.sleep(2000);	
		teacherpo.elementStatus(teachercoursepo.getEleBatchSelected(), "List of Batches is ", "displayed");
		Select select=new Select(teachercoursepo.getEleBatchSelected());
		select.selectByIndex(0);
		Thread.sleep(2000);
		teacherpo.elementStatus(teachercoursepo.getEleCourseSelected(), "List of Courses is ", "displayed");
		Select select1=new Select(teachercoursepo.getEleCourseSelected());
		select1.selectByIndex(0);
		teacherpo.elementStatus(teachercoursepo.getEleStartCourseButton(), "Start Course is ", "displayed");
		teachercoursepo.getEleStartCourseButton().click();
		Thread.sleep(2000);
		driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(0); 
		teacherpo.elementStatus(teachercoursepo.getElePreAssessmentLink(),"PreAssessmentlink","enabled");
		teachercoursepo.getElePreAssessmentLink().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		teacherpo.verifyAssessmentinstruction();
	}catch(AssertionError e)
	{
		NXGReports.addStep("Testcase Failed.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		throw e;
	}
	}
	
	
}
