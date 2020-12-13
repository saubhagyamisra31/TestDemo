package com.acro.cms.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.acro.cms.util.BundleReaders;


public class DasboardTest {


public static void main(String[] args) throws InterruptedException {
	System.setProperty(BundleReaders.getValue("drivername"), BundleReaders.getValue("driverpath"));
	WebDriver driver= new ChromeDriver();
	driver.get(BundleReaders.getValue("url"));
	driver.manage().window().maximize();
	driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();
	driver.findElement(By.id("email")).sendKeys("Saubhagyatest@gmail.com");
	driver.findElement(By.id("passwd")).sendKeys("Saubhagya@12345");
	driver.findElement(By.id("SubmitLogin")).click();
	driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a")).click();
	
	try {

		  ScreenshotDemo.takeScreenShot(driver);

		 } catch (Exception e) {

		  // TODO Auto-generated catch block

		  e.printStackTrace();

		 }
}



}


