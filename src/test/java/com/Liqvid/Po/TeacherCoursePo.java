package com.Liqvid.Po;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.kirwa.nxgreport.NXGReports;
import com.kirwa.nxgreport.logging.LogAs;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen.ScreenshotOf;


import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class TeacherCoursePo {
	WebDriver driver;
	WebDriverWait wait;
	TeacherSignPo teachersigninpo;
	TeacherCoursePo teachercoursepo;
	public TeacherCoursePo(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
//To verify course icon	in the home page
  @FindBy(xpath="//i[@class='fa fa-gears icon']")
   private WebElement eleCourseIcon;
   public WebElement getEleCourseIcon()
   {
	   return eleCourseIcon;
   }
//To verify course tab in home page
   @FindBy(xpath="//span[contains(text(),'Courses')]")
   private WebElement eleCourseTab;
   public WebElement getEleCourseTab()
   {
	   return eleCourseTab;
   }
//To verify instruction how to start in the courses page
   @FindBy(xpath="//p[contains(text(),'To start course perform following steps')]")
   private WebElement eleInstructionText;
   public WebElement getEleInstructionText()
   {
	   return eleInstructionText;
   }
//To verify step text in the courses page
   @FindBy(xpath="(//div[text()='Step'])[1]")
   private WebElement eleStepText;
   public WebElement getEleStepText()
   {
	   return eleStepText;
   }
//To verify step 1 circle in the course page
   @FindBy(xpath="(//div[@class='timelineCircle'])[1]")
   private WebElement eleStep1Circle;
   public WebElement getEleStep1Circle()
   {
	   return eleStep1Circle;
   }
   //to verify the select batch text in the course page
   @FindBy(xpath="//div[text()='Select Batch']")
   private WebElement eleSelectBatchText;
   public WebElement getEleSelectBatchText()
   {
	   return eleSelectBatchText;
   }
 //to verify the click start course course text in the course page
   @FindBy(xpath="//div[text()='Click Start Course']")
   private WebElement eleClickcourseText;
   public WebElement getEleClickcourseText()
   {
	   return eleClickcourseText;
   }
 //to verify the select course text in the course page
   @FindBy(xpath="//div[text()='Select Course']")
   private WebElement eleSelectcourseText;
   public WebElement getEleSelectcourseText()
   {
	   return eleSelectcourseText;
   }
  
   
//To verify batch text in the course page
   @FindBy(xpath="//label[contains(text(),'Batch')]")
   private WebElement eleBatchText;
   public WebElement getEleBatchText()
   {
	   return eleBatchText;
   }
//To select batch from batch list in the course page
   @FindBy(id="class_select")
   private WebElement eleBatchSelected;
   public WebElement getEleBatchSelected()
   {
	   return eleBatchSelected;
   }
//To verify course text in the course page
   @FindBy(xpath="//label[contains(text(),'Course')]")
   private WebElement eleCourseText;
   public WebElement getEleCourseText()
   {
	   return eleCourseText;
   }
//To verify course under course list in the course page
   @FindBy(id="course_select")
   private WebElement eleCourseSelected;
   public WebElement getEleCourseSelected()
   {
	   return eleCourseSelected;
   }
//To verify start course button in the course page
   @FindBy(xpath="//input[@value='Start Course']")
   private WebElement eleStartCourseButton;
   public WebElement getEleStartCourseButton()
   {
	   return eleStartCourseButton;
   }
 //To verify all session in course page
   @FindBy(xpath="//div[@class='divMiddle']")
   private WebElement eleSession;
   public WebElement getEleSession()
   {
	   return eleSession;
   }
   
//To verify Preassessment link in the course page
   @FindBy(xpath="//a[contains(text(),'Pre Assessment')]")
   private WebElement elePreAssessmentLink;
   public WebElement getElePreAssessmentLink()
   {
	   return elePreAssessmentLink;
   }
 //To verify PostAssessment link in the course page
   @FindBy(xpath="//a[contains(text(),'Post Assessment')]")
   private WebElement elePostAssessmentLink;
   public WebElement getElePostAssessmentLink()
   {
	   return elePostAssessmentLink;
   }   
 //To verify Mid1 Assessment  Link in the Course
   @FindBy(xpath="//a[contains(text(),'Mid-1 Assessment')]")
   private WebElement eleMid1AssessmentLink;
   public WebElement getEleMid1AssessmentLink()
   {
	   return eleMid1AssessmentLink;
   } 
   //To verify Mid2 Assessment  Link in the Course
   @FindBy(xpath="//a[contains(text(),'Mid-2 Assessment')]")
   private WebElement eleMid2AssessmentLink;
   public WebElement getEleMid2AssessmentLink()
   {
	   return eleMid2AssessmentLink;
   } 
//To verify english edge text in the course page
   @FindBy(xpath="//h3[contains(text(),'English Edge Assessments')]")
   private WebElement eleEnglishEdgeText;
   public WebElement getEleEnglishEdgeText()
   {
	   return eleEnglishEdgeText;
   }
//To verify Instruction text in the course page
   @FindBy(xpath="//h1[contains(text(),'Instructions')]")
   private WebElement eleInstructiontText;
   public WebElement getEleInstructiontText()
   {
	   return eleInstructiontText;
   }
//To verify start text button in the course page
   @FindBy(xpath="//a[contains(text(),'Start')]")
   private WebElement eleStartTextButton;
   public WebElement getEleStartTextButton()
   {
	   return eleStartTextButton;
   }
 //To verify start text button in the course page
   @FindBy(xpath="//iframe[@id='iframes']")
   private WebElement eleframe;
   public WebElement getEleframe()
   {
	   return eleframe;
   }
 //iframe[@id='iframes']
//To verify class1 pre assessment text in the course page
   @FindBy(xpath="//b[contains(text(),'Class 1 Pre Assessment')]")
   private WebElement eleClass1PreAssessmentText;
   public WebElement getEleClass1PreAssessmentText()
   {
	   return eleClass1PreAssessmentText;
   }
 //To verify class1 Mid 1 assessment text in the course page
   @FindBy(xpath="//b[contains(text(),'Class 2 Mid 1 Assessment')]")
   private WebElement eleClass2Mid1AssessmentText;
   public WebElement getEleClass2Mid1AssessmentText()
   {
	   return eleClass2Mid1AssessmentText;
   }  
   //To verify class1 Mid 2 assessment text in the course page
   @FindBy(xpath="//b[contains(text(),'Class 2 Mid 2 Assessment')]")
   private WebElement eleClass2Mid2AssessmentText;
   public WebElement getEleClass2Mid2AssessmentText()
   {
	   return eleClass2Mid2AssessmentText;
   }    
   //To verify class1 Post assessment text in the course page
   @FindBy(xpath="//b[contains(text(),'Class 2 Post Assessment')]")
   private WebElement eleClass2PostAssessmentText;
   public WebElement getEleClass2PostAssessmentText()
   {
	   return eleClass2PostAssessmentText;
   }   
//To verify All the best text in the course page
   @FindBy(className="text-muted")
   private WebElement eleAllTheBestText;
   public WebElement getEleAllTheBestText()
   {
	   return eleAllTheBestText;
   }
//To verify test start time in the course page
   @FindBy(xpath="//section[@class='scrollable wrapper']/../div/div[1]/div")
   private WebElement eleStartTimeText;
   public WebElement getEleStartTimeText()
   {
	   return eleStartTimeText;
   }
//To verify test end time in the course page
   @FindBy(xpath="//section[@class='scrollable wrapper']/../div/div[2]/div")
   private WebElement eleEndTimeText;
   public WebElement getEleEndTimeText()
   {
	   return eleEndTimeText;
   }
//To verify previous button in the course page
   @FindBy(xpath="//button[@id='prebtn']")
   private WebElement elePreviousButton;
   public WebElement getElePreviousButton()
   {
	   return elePreviousButton;
   }
//To verify recent number in the course page
   @FindBy(id="quesCount")
   private WebElement eleRecentPageNumber;
   public WebElement getEleRecentPageNumber()
   {
	   return eleRecentPageNumber;
   }
//To verify page number out of total page in the course page
   @FindBy(xpath="//span[@id='showFinish']")
   private WebElement elePageNumber;
   public WebElement getElePageNumber()
   {
	   return elePageNumber;
   }
//To verify next button in the course page
   @FindBy(xpath="(//div[@class='actions']/..//button)[2][contains(text(),'Next')]")
   private WebElement eleNextButton;
   public WebElement getEleNextButton()
   {
	   return eleNextButton;
   }
 
//To verify radio button in the course page
   @FindBy(xpath="(//div[@class='step-content']//div//div//i)[1]")
   private WebElement eleRaduioButton;
   public WebElement getEleRaduioButton()
   {
	   return eleRaduioButton;
   }
//To verify finish text in the course page
   @FindBy(id="showFinish")
   private WebElement eleFinishText;
   public WebElement getEleFinishText()
   {
	   return eleFinishText;
   }
//To verify finish button in the course page
   @FindBy(id="netbtn")
   private WebElement eleFinishbutton;
   public WebElement getEleFinishbutton()
   {
	   return eleFinishbutton;
    }
//To verify the instruction in last page in the course page
   @FindBy(id="completeText")
   private WebElement eleFinishInstruction;
   public WebElement getEleFinishInstruction()
   {
	   return eleFinishInstruction;
   }
//To verify score at the end in the course page
   @FindBy(id="ram")
   private WebElement eleScoreText;
   public WebElement getEleScoreText()
   {
	   return eleScoreText;
   }
/*//To verify back button in the course page
   @FindBy(id="btnBack")
   private WebElement eleBackButton;
   public WebElement getEleBackButton()
   {
	   return eleBackButton;
   }*/
//To verify speaker in the course page
   @FindBy(id="buttonDispElem134")
   private WebElement elespeaker;
   public WebElement getElespeaker()
   {
	   return elespeaker;
   }
 //to verify instruction 
   @FindBy(xpath="//div[@id='slimScrollDiv1']")
   private List<WebElement> eleInstruction;
   public List<WebElement> getEleInstruction(){
	   return eleInstruction;
   }
  //to verify the completed message text
   @FindBy(id="ram")
   private WebElement eleResultMessageText;
   public WebElement getEleResultMessageText(){
	   return eleResultMessageText;
   }
  /* //to verify the back button is dispalyed
   @FindBy(id="btnBackDiv")
   private WebElement eleBackBtn;
   public WebElement getEleBackBtn(){
	   return eleBackBtn;
   }*/
   @FindBy(xpath="//a[contains(text(),'The Goat Eater')]")
   private WebElement eleTheGoatEaterLink;
   public WebElement getEleTheGoatEaterLink()
   {
	   return eleTheGoatEaterLink;
   }
   //-------------for games---------------------------------- 
   //-------------header part
   //title of game
   @FindBy(id="spnTitle")
   private WebElement eleTitleOfgame;
   public WebElement getEleTitleOfgame()
   {
	   return eleTitleOfgame;
   }
   // text in header part
   @FindBy(xpath="//span[@id='spnTitle2']")
   private WebElement eleIntroductionText;
   public WebElement getEleIntroductionText()
   {
	   return eleIntroductionText;
   }
   //about us icon
   @FindBy(id="imgAboutUs")
   private WebElement eleAboutUsIcon;
   public WebElement eleAboutUsIcon()
   {
	   return eleAboutUsIcon;
   }
   //home icon
   @FindBy(id="imgHome")
   private WebElement eleHomeIcon;
   public WebElement getEleAboutUsIcon()
   {
	   return eleHomeIcon;
   }
   //exit icon
   @FindBy(id="imgExit")
   private WebElement eleExitIcon;
   public WebElement getEleExitIcon()
   {
	   return eleExitIcon;
   }
   //welcome text
   @FindBy(id="instructionText")
   private WebElement eleWelcomeText;
   public WebElement getEleWelcomeText()
   {
	   return eleWelcomeText;
   }
   //A.R.t icon
   @FindBy(xpath="(//img[@id='imgArt'])[1]")
   private WebElement eleARTIcon;
   public WebElement getEleARTIcon()
   {
	   return eleARTIcon;
   }
   //English edge logo in footer
   @FindBy(xpath="//div[@id='divFooter']")
   private WebElement eleEnglishEdgeLogo;
   public WebElement getEleEnglishEdgeLogo()
   {
	   return eleEnglishEdgeLogo;
   }
   //refresh icon
   @FindBy(xpath="//div[@id='btnRefDiv']/../div[8]/a/img[@id='imgRef']")
   private WebElement eleRefreshIcon;
   public WebElement getEleRefreshIcon()
   {
	   return eleRefreshIcon;
   }
   //next icon
   @FindBy(xpath="//div[@id='btnNextDiv']//img[@id='imgNext']")
   private WebElement eleNextIcon;
   public WebElement getEleNextIcon()
   {
	   return eleNextIcon;
   }
   //page value
   @FindBy(id="pgValue")
   private WebElement elePageValue;
   public WebElement getElePageValue()
   {
	   return elePageValue;
   }
   //back button
   @FindBy(xpath="//div[@id='btnBackDiv']//img[@id='imgBack']")
   private WebElement eleBackButton;
   public WebElement getEleBackButton()
   {
	   return eleBackButton;
   }
public void NextAndPrevButton() throws InterruptedException
{
	teachersigninpo=new TeacherSignPo(driver);
	Thread.sleep(7000);
	driver.switchTo().frame(driver.findElement(By.id("frabotbar")));
	String page = driver.findElement(By.id("pgValue")).getText().toString();
	Thread.sleep(3000);
	System.out.println(page);
	String totalpage = page.substring(10);
	int count = Integer.parseInt(totalpage);
	System.out.println("total number of pages:"+count);
	for(int i=1;i<=count;i++)
      {
    	  if(i==count)
		     {
    		    driver.switchTo().parentFrame();
    		    System.out.println("Switched to parent frame");
	     		driver.switchTo().frame(driver.findElement(By.id("content")));
				Thread.sleep(6000);
	    		System.out.println(getEleWelcomeText().getText());
			    Thread.sleep(7000);
			    driver.switchTo().parentFrame();
			    driver.switchTo().frame(driver.findElement(By.id("frabotbar")));
			    System.out.println(getElePageValue().getText());
			    Thread.sleep(5000);
			    driver.switchTo().parentFrame();
			    driver.switchTo().frame(driver.findElement(By.id("fraheader")));
			    getEleExitIcon().sendKeys(Keys.ENTER);
			    Thread.sleep(2000);
			    break;
		     }
    	driver.switchTo().parentFrame();
    	driver.switchTo().frame(driver.findElement(By.id("fraheader")));
    	System.out.println(getEleIntroductionText().getText());
    	driver.switchTo().parentFrame();	
    	driver.switchTo().frame(driver.findElement(By.id("content")));
    	System.out.println(getEleWelcomeText().getText());
        driver.switchTo().parentFrame();
        driver.switchTo().frame(driver.findElement(By.id("frabotbar")));
        System.out.println(getElePageValue().getText());
        Thread.sleep(15000);
        int ok_size=driver.findElements(By.xpath("//div[@id='btnRefDiv']/../div[8]/a/img[@id='imgRef']")).size();
        wait=new WebDriverWait(driver,90);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='btnRefDiv']/../div[8]/a/img[@id='imgRef']")));
        getEleRefreshIcon().click();
        Thread.sleep(10000);
        getEleNextIcon().click();
        Thread.sleep(10000);
        getEleBackButton().click();
        Thread.sleep(3000);
       getEleNextIcon().click();
       // driver.switchTo().parentFrame();
        Thread.sleep(7000);
        
      }
     driver.close();
    
   }	
 
public void verifyIncompleteSession() throws Exception
{
	teachersigninpo=new TeacherSignPo(driver);
	teachercoursepo=new TeacherCoursePo(driver);
    for(int i=1;i<=4;i++)
      {
    	  if(i==2)
		     {
    		    Thread.sleep(2000);
		        Set<String> TotalWindowhandles = driver.getWindowHandles();// returns child and parent windows 
		        Thread.sleep(2000);
	            String ChildWinHandle = driver.getWindowHandle();//returns child window , since control is in child window 
				for(String CurrentWindow : TotalWindowhandles)
	            {
	            	if(!(CurrentWindow.equals(ChildWinHandle)))
	            	{
	            	driver.switchTo().window(CurrentWindow);
	                }
	            }
	               System.out.println(driver.getCurrentUrl());
	               Thread.sleep(10000);
	              //driver.switchTo().frame(0);
	               teachercoursepo.getEleTheGoatEaterLink().sendKeys(Keys.ENTER);
	               for (String winHandle : driver.getWindowHandles())
	               {
	                driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
	                }
	              System.out.println(driver.getCurrentUrl());
	              driver.switchTo().defaultContent();
	              driver.switchTo().frame(driver.findElement(By.id("frabotbar")));
	              teachersigninpo.elementStatus(teachercoursepo.getElePageValue(),"starting page is","dispalyed");
	               break;
		     }
    	driver.switchTo().parentFrame();
    	driver.switchTo().frame(driver.findElement(By.id("fraheader")));
    	System.out.println(getEleIntroductionText().getText());
    	driver.switchTo().parentFrame();	
    	driver.switchTo().frame(driver.findElement(By.id("content")));
    	System.out.println(getEleWelcomeText().getText());
        driver.switchTo().parentFrame();
        driver.switchTo().frame(driver.findElement(By.id("frabotbar")));
        System.out.println(getElePageValue().getText());
        Thread.sleep(15000);
        int ok_size=driver.findElements(By.xpath("//div[@id='btnRefDiv']/../div[8]/a/img[@id='imgRef']")).size();
        wait=new WebDriverWait(driver,90);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='btnRefDiv']/../div[8]/a/img[@id='imgRef']")));
        Thread.sleep(10000);
        getEleNextIcon().click();
        Thread.sleep(10000);
      }
   }
 }





   





