package com.Liqvid.Po;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class TeacherExitPO 
{
	public WebDriver driver=null;
	public TeacherExitPO(WebDriver driver){
		this.driver=driver;
	}
public void exit() throws InterruptedException
{
	driver.switchTo().parentFrame();
    driver.switchTo().frame(driver.findElement(By.id("fraheader")));
    driver.findElement(By.id("imgExit")).sendKeys(Keys.ENTER);
    Thread.sleep(5000);
    //driver.switchTo().window(firstWinHandle);
    System.out.println("finish");
    Thread.sleep(3000);
    driver.close();
}
}
