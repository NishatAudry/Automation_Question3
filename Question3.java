package com.bd.WebAutomationExam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Question3 extends BaseDriver2 {
	
		@Test(priority = 0)
		public void startWebSite() throws InterruptedException {
			driver.get(url1);
			driver.manage().window().maximize();
			Thread.sleep(2000);
		}
		@Test(priority = 1)
	public void radioButton() throws InterruptedException{
			
			WebElement genderFemale = driver.findElement(By.id("female"));
			genderFemale.click();
			
			
			WebElement tuesday = driver.findElement(By.id("tuesday"));
			tuesday.click();
			
			
			WebElement friday = driver.findElement(By.id("friday"));
			friday.click();
			Thread.sleep(5000);
		
	}
}

