package com.Liqvid.Po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataBasePo {
	WebDriver driver;
	public DataBasePo(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="input_username")
	private WebElement eleUserNameTxtFld;
	public WebElement getEleUserNameTxtFld(){
		return eleUserNameTxtFld;
	}
	@FindBy(id="input_password")
	private WebElement eledatabasePasswordTxtFld;
	public WebElement getEledatabasePasswordTxtFld(){
		return eledatabasePasswordTxtFld;
	}
	@FindBy(id="input_go")
	private WebElement eleGoBtn;
	public WebElement getEleGoBtn(){
		return eleGoBtn;
	}
	@FindBy(xpath=".//*[@id='databaseList']/li[8]/ul/li[1]/a")
	private WebElement eleTeslaText;
	public WebElement getEleTeslaText(){
		return eleTeslaText;
	}
	
	@FindBy(id="tesla_555.test_instance")
	private WebElement eleTestInstanceIcon;
	public WebElement getEleTestInstanceIcon(){
		return eleTestInstanceIcon;
	}
	@FindBy(id="frame_navigation")
	private WebElement eleFrame;
	public WebElement getEleFrame(){
		return eleFrame;
	}
	@FindBy(id="tesla_555.test_instance")
	private WebElement eleTestInstance;
	public WebElement getEleTestInstance(){
		return eleTestInstance;
	}
	@FindBy(id="frame_content")
	private WebElement eleFrameContent;
	public WebElement getEleFrameContent(){
		return eleFrameContent;
	}
	@FindBy(xpath=".//*[@id='rowsDeleteForm']/button[2]")
	private WebElement eleDeleteIcon;
	public WebElement getEleDeleteIcon(){
		return eleDeleteIcon;
	}
	
	@FindBy(xpath="//a[contains(text(),'Check All')]")
	private WebElement eleCheckAllLink;
	public WebElement getEleCheckAllLink(){
		return eleCheckAllLink;
	}
	@FindBy(id="buttonYes")
	private WebElement eleYesBtn;
	public WebElement getEleYesBtn(){
		return eleYesBtn;
	}

	@FindBy(xpath=".//*[@id='tablesForm']/table/tbody[1]/tr[33]/td[2]/a/img")
	private WebElement eleBrowse;
	public WebElement getEleBrowse(){
		return eleBrowse;
	}
	//
	
	public void databaseLogin(String username,String password) throws InterruptedException{
		getEleUserNameTxtFld().sendKeys(username);
		Thread.sleep(2000);
		getEledatabasePasswordTxtFld().sendKeys(password);
		Thread.sleep(2000);
		getEleGoBtn().click();
	}


}
