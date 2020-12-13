package com.acro.cms.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public interface ScreenshotDemo {
	
	 public static void takeScreenShot(WebDriver driver) throws Exception{
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		String path = "C:\\Users\\SM\\Desktop\\Testscreen.xls"+System.currentTimeMillis()+".jpg";
		 File DestFile=new File(path);
		 FileInputStream fi = new FileInputStream(SrcFile);
		 FileOutputStream fo = new FileOutputStream(DestFile);
		 fo.write(fi.readAllBytes());
		 fi.close();
		 fo.close();
		 System.out.println("Done");
		 
		 
		 
	 }
	}

