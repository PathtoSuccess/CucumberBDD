package com.typesofwait;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTypes {
	
	//implicit wait
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//explicit wait
	//WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
	//WebElement product=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='search']/span/div/h1/div/div[1]/div/div/span[3]")));
		
	// Fluent wait
		   // mywait1 = new FluentWait(driver);
		//   mywait1.withTimeout(Duration.ofSeconds(30));
		//   mywait1.pollingEvery(Duration.ofSeconds(5));
		 //  mywait1.ignoring(NoSuchElementException.class);

		 //  WebElement productS=(WebElement)mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='search']/span/div/h1/div/div[1]/div/div/span[3]")));
		//	productS.sendKeys("");
}
