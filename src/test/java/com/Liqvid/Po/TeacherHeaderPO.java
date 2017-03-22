package com.Liqvid.Po;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class TeacherHeaderPO 
{
	public WebDriver driver=null;
	public TeacherHeaderPO(WebDriver driver){
		this.driver=driver;

	}
 
     public void header() throws InterruptedException
     {
    	
       Set<String> handles = driver.getWindowHandles();
	   String firstWinHandle = driver.getWindowHandle();
	   handles.remove(firstWinHandle);
	   Thread.sleep(1000);
       String winHandle=handles.iterator().next();
       if (winHandle!=firstWinHandle)
	   {
         //To retrieve the handle of second window, extracting the handle which does not match to first window handle
           String secondWinHandle = winHandle; //Storing handle of second window handle
         //Switch control to new window
           driver.switchTo().window(secondWinHandle);
	   }
	   Thread.sleep(3000);
	  /* driver.switchTo().frame(driver.findElement(By.id("fraheader")));
	   System.out.println(driver.findElement(By.id("spnTitle")).getText());
	   System.out.println(driver.findElement(By.xpath("//span[@id='spnTitle2']")).getText());
	   driver.findElement(By.id("imgAboutUs")).click();
       driver.findElement(By.id("imgHome")).click();*/
	   Thread.sleep(6000);
	   driver.switchTo().parentFrame();
	   driver.switchTo().frame(driver.findElement(By.id("content")));
	   Thread.sleep(6000);
//	   driver.findElement(By.id("imgArt")).click();
	   System.out.println(driver.findElement(By.id("instructionText")).getText()); 
	  
 }
    
}
