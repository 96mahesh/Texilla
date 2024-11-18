package com.texila.utils;

import java.io.IOException;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.model.Media;

public class ITestListener implements org.testng.ITestListener {
  
	public void onTestStart(ITestResult result) {
		//ExtentReportManager.extent.createTest(result.getMethod().getMethodName());
		ExtentReportManager.startTest(result.getMethod().getMethodName(), result.getMethod().getDescription(), "Smoke");
	}

	public void onTestSuccess(ITestResult result) {
		ExtentReportManager.logPass(result.getMethod().getMethodName()+" Test Case passed successfully");
		try {
			Media mediaModel = MediaEntityBuilder.createScreenCaptureFromBase64String(Browser.takeScreenShot()).build();
			ExtentReportManager.logScreenshot(mediaModel);
			MediaEntityBuilder.createScreenCaptureFromPath(Browser.capcturingPicture("image 1"), "Hr process");
			ExtentReportManager.logScreenshot(mediaModel);
		} catch (IOException e) {
			
		}
		
	}

	public void onTestFailure(ITestResult result) {
		ExtentReportManager.logFail(result.getThrowable().getMessage());
		
		try {
			Media mediaModel = MediaEntityBuilder.createScreenCaptureFromBase64String(Browser.takeScreenShot()).build();
			ExtentReportManager.logScreenshot(mediaModel);
		} catch (IOException e) {
			
		}
		//new code added by kanvitha
		try {
			Browser.takeScreenShot();
		}catch(Exception e) {
			
		}
	}
	
	
//	public void onTestSkipped(ITestResult result) {
//		
//	}

	
	
	

}
