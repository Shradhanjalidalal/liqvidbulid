package com.Liqvid.Po;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Liqvid.Library.ParallelBaseLib;
import com.kirwa.nxgreport.NXGReports;
import com.kirwa.nxgreport.logging.LogAs;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen.ScreenshotOf;


public class TeacherSignPo {
	WebDriver driver = null;
	public static int sStatusCnt=0;
	public TeacherSignPo(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// To identify the web element -- Logo
	@FindBy(xpath="//section[@class='main-votex']//img")
	private WebElement eleLogo;
	public WebElement getEleLogo(){
		return eleLogo;
	}
	// To identify the 'Sign in' text
	@FindBy(xpath="//p[@class='student-title']")
	private WebElement eleSignInText;
	public WebElement getEleSignInText(){
	return eleSignInText;
	}
	
	// To identify instructions text in 'Sign in' page
	@FindBy(xpath="//p[contains(text(),'Please register and login with your username and password.')]")
	private WebElement eleSignInInstrText;
	public WebElement getEleSignInInstrText(){
		return eleSignInInstrText;
	}
	// To identify 'Username' text 
	@FindBy(xpath="//label[contains(text(),'Username ')]")
	private WebElement eleUserNameText;
	public WebElement getEleUserNameText(){
		return eleUserNameText;
	}
	// To identify the web element 'UserName' text field
	@FindBy(id="LoginForm_username")//LoginForm_username
	private WebElement eleUserNameTextField;
	public WebElement getEleUserNameTextField(){
		return eleUserNameTextField;
	}
	// To identify 'Password' text in 'Sign In' page
	@FindBy(xpath="//label[contains(text(),'Password')]")
	private WebElement elePwdText;
	public WebElement getElePwdText(){
		return elePwdText;
	}
	//To identify the web element 'Password' text field
	@FindBy(id="LoginForm_password")
	private WebElement elePasswordTextFiled;
	public WebElement getElePasswordTextFiled(){
		return elePasswordTextFiled;			
	}
	// To identify Web element 'Sign In' button
	@FindBy(xpath="//input[@name='yt0' and @value='Sign in']")
	private WebElement  eleSignInBtn;
	public WebElement getEleSignInBtn(){
		return eleSignInBtn;
	}
	// To identify the 'Error Message' displaying at 'UserName' text box
	@FindBy(id="LoginForm_username_em_")
	private WebElement eleUsrErrorMsgLogin;
	public WebElement getEleErrorMsgLogin(){
		return eleUsrErrorMsgLogin;
	}
	// To identify the web element 'Forgot password' link
	@FindBy(xpath="//small[contains(text(),'Forgot password')]")
	private WebElement eleForgotPwdLink;
	public WebElement getEleForgotPwdLink(){
		return eleForgotPwdLink;
	}
	// To identify instruction text to register
	@FindBy(xpath="//p[contains(text(),'First-time user, register here.')]")
	WebElement eleRegisterInstrText;
	public WebElement getEleRegisterInstrText(){
		return eleRegisterInstrText;
	}	
	//To identify the Registration Button in Sign In button 
	@FindBy(xpath="//small[contains(text(),'Registration')]")
	private WebElement eleRegisterBtn;
	public WebElement getEleRegisterBtn(){
		return eleRegisterBtn;
	}
	//To identify code, Version and date
	@FindBy(xpath="//div[@id='footer-terms']//a[contains(text(),'Liqvid English Edge Pvt. Ltd.')]")
	private WebElement eleCodeVersionDateText;
	public WebElement getCodeVersionDateText(){
		return eleCodeVersionDateText;
	}
	//To identify the error message for old password in sign in page
	@FindBy(xpath="//div[contains(text(),'Incorrect username or password.')]")
	private WebElement eleIncorrectUserPwd;
	public WebElement getEleIncorrectUserPwd(){
		return eleIncorrectUserPwd;
	}
	//To identify the bulid version in sign in page
	@FindBy(id="footer-copyright")
	private WebElement eleBulidVersionDateText;
	public WebElement getEleBulidVersionDateText(){
		return eleBulidVersionDateText;
		}
	
	
public void elementStatus(WebElement element, String elementName, String checkType) 
	
	{
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	switch(checkType)
		{
			case "displayed":
				try 
			    {
			        element.isDisplayed();
			        NXGReports.addStep(elementName+ " is displayed", LogAs.PASSED, null);
			    } 
			    catch (Exception e) 
			    {
			    	ParallelBaseLib.sStatusCnt++;
			    	NXGReports.addStep(elementName+ " is not displayed", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			    }
				break;
			case "enabled":
				try 
			    {
			        element.isEnabled();
			        NXGReports.addStep(elementName+ " is enabled", LogAs.PASSED, null);
			    } 
			    catch (Exception e) 
			    {
			    	ParallelBaseLib.sStatusCnt++;
			    	NXGReports.addStep(elementName+ " is not enabled", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			    }
				break;
			case "selected":
				try 
				{
					element.isSelected();
				    NXGReports.addStep(elementName+ " is selected", LogAs.PASSED, null);  
				} 
				catch (Exception e) 
				{
				   	ParallelBaseLib.sStatusCnt++;
				   	NXGReports.addStep(elementName+ " is not selected", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				}
				break;
			}
	}
	
	public void Login(String username,String password) throws Exception{
		try{
		Thread.sleep(6000);	
		elementStatus(getEleUserNameTextField(), "The Username text field","displayed");
			getEleUserNameTextField().sendKeys(username);
			elementStatus(getElePasswordTextFiled(), "The Password text field","displayed");
			getElePasswordTextFiled().sendKeys(password);
			Thread.sleep(4000);
			elementStatus(getEleSignInBtn(), "The Sign in button","displayed");
			getEleSignInBtn().click();
		}catch(Exception e){
			NXGReports.addStep("Login page is not displayed", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}
	}
	public void handleStartTestbutton() throws InterruptedException{
		TeacherCoursePo studentcoursepo=new TeacherCoursePo(driver);
		
		try{
			Thread.sleep(4000);
			driver.switchTo().frame(0);
			Thread.sleep(4000);
			studentcoursepo.getEleStartTextButton().click();
		
		}catch(Exception e){
			List<WebElement> objects = driver.findElements(By.xpath("//div[@id='contentAssessment']//object"));
			String objectId = objects.get(0).getAttribute("id");
			WebElement objectTag = driver.findElement(By.id(objectId));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			String text = (String) js.executeScript("return (((document.getElementById('" + objectId + "')).contentDocument).getElementsByClassName('btn btn-s-md btn-default btn-rounded')[0]).getAttribute('href')", objectTag).toString();
			System.out.println(text);
			driver.get(text);
		}
		catch(Error e){
			Assert.fail();
		}
	}
	public void scrolldown(){
		try{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,Math.max(document.documentElement.scrollHeight,document.body.scrollHeight,document.documentElement.clientHeight));");
		}catch(Exception e){
			NXGReports.addStep("The page is not scrolldown", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}
	}
	public void verifyAssessmentinstruction(){
		try{
		List<WebElement> objects = driver.findElements(By.xpath("//div[@id='contentAssessment']//object"));
		String objectId = objects.get(0).getAttribute("id");
		WebElement objectTag = driver.findElement(By.id(objectId));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String Assessementinstructiontext = (String) js.executeScript("return (((document.getElementById('" + objectId + "')).contentDocument).getElementsByClassName('slimScrollDiv')[0]).innerHTML").toString();
		NXGReports.addStep(Assessementinstructiontext+ " is displayed", LogAs.PASSED, null);
		}catch (Exception e) {
			NXGReports.addStep("the instruction is not displayed", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}
	}
	
}
