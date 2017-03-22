package com.Liqvid.Po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TeacherResourcesPo {
	WebDriver driver = null;
	public TeacherResourcesPo(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//to identify 'Resource' text in the resource page
	@FindBy(xpath="//div[text()='Resources']")
	private WebElement eleResourcesText;
	public WebElement getEleResourcesText(){
		return eleResourcesText;
	}
	// to identify Image in the resource page
	@FindBy(xpath="//div[@class='col-sm-12 resourceTab text-center']//div//div//a//img")
	private WebElement eleResourcesImage;
	public WebElement getEleResourcesImage(){
		return eleResourcesImage;
	}
	// to identify 'Student Manual' Text in the resource page
	@FindBy(xpath="//div[text()='Student Manual']")
	private WebElement eleStudentManualText;
	public WebElement getEleStudentManualText(){
		return eleStudentManualText;
	}
}
