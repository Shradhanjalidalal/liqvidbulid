package com.Liqvid.Po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TeacherContentPO 
{
public WebDriver driver=null;
	public TeacherContentPO(WebDriver driver){
		this.driver=driver;
	}
	public void content() throws InterruptedException
   {
		 driver.switchTo().parentFrame();
	     driver.switchTo().frame(driver.findElement(By.id("frabotbar")));
	     String page = driver.findElement(By.id("pgValue")).getText();
	     String p= page.substring(10);
	     int count = Integer.parseInt(p);
	     System.out.println(count);
	for(int i=1;i<=count;i++)
     {
    	 if(i==count)
	     {
    		 
    		 Thread.sleep(4000);
    		 driver.switchTo().parentFrame();	
		     driver.switchTo().frame(driver.findElement(By.id("fraheader")));
		     System.out.println(driver.findElement(By.id("spnTitle2")).getText());
		     driver.switchTo().parentFrame();
     		 driver.switchTo().frame(driver.findElement(By.id("content")));
			 Thread.sleep(6000);
    		 String a = driver.findElement(By.id("instructionText")).getText();
    		 System.out.println(a);
		     Thread.sleep(7000);
		     driver.switchTo().parentFrame();
		     driver.switchTo().frame(driver.findElement(By.id("frabotbar")));
		     System.out.println(driver.findElement(By.id("pgValue")).getText());
		     Thread.sleep(8000);
		     break;
	     }
     driver.switchTo().parentFrame();	
     driver.switchTo().frame(driver.findElement(By.id("fraheader")));
     System.out.println(driver.findElement(By.id("spnTitle2")).getText());
     driver.switchTo().parentFrame();
	 driver.switchTo().frame(driver.findElement(By.id("content")));
	 Thread.sleep(6000);
	 String a = driver.findElement(By.id("instructionText")).getText();
	 System.out.println(a);
     Thread.sleep(7000);
     driver.switchTo().parentFrame();
     driver.switchTo().frame(driver.findElement(By.id("frabotbar")));
     System.out.println(driver.findElement(By.id("pgValue")).getText());
   
     Thread.sleep(10000);
     driver.findElement(By.id("imgNext")).click();
	 driver.findElement(By.id("imgRef")).click();
     Thread.sleep(10000);
     driver.switchTo().parentFrame();
     Thread.sleep(7000);
     }
    
     }
}
