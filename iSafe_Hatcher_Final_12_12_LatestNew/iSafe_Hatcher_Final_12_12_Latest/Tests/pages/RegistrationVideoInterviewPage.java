package pages;
import iSAFE.ApplicationKeywords;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;

public class RegistrationVideoInterviewPage extends ApplicationKeywords
{	
	private static final String lbl_VideoInterview = "Video Interview Heading#xpath=//div[contains(@class,'application-form')]//*[text()='Video Interview']";
	private static final String btn_VideoInterview_StartRecording = "Start Recording Button in Video Interview Form#xpath=//div[contains(@class,'application-form')]//button[contains(text(),'START RECORDING')]";
	private static final String btn_VideoInterview_SkipVideo = "Skip Video Button in Video Interview Form#xpath=//div[contains(@class,'application-form')]//a[contains(text(),'Skip Video')]";
	private static final String btn_VideoInterview_Back = "Back button in Video Interview Form#xpath=//div[contains(@class,'application-form')]//a[contains(text(),'Back')]";

	
	public RegistrationVideoInterviewPage(BaseClass obj) 
	{
		super(obj);
	}
	/**
	*This method is used to verify the videoInterview display.
	*
	*@author VijayaKumar.U
	*/
	public void verify_Registration_VideoInterview_displayed()
	{
		
		try 
		{
			waitForElementToDisplay(lbl_VideoInterview, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_VideoInterview))
			{
				testStepPassed("Video Interview page is displayed");	
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Video Interview page is not displayed");
		}
	}
	/**
	*This method is used to verify the start recording button.
	*
	*@author VijayaKumar.U
	*/
	public void click_StartRecording_button()
	{
		waitForElementToDisplay(btn_VideoInterview_StartRecording, this.elementLoadWaitTime);
		clickOn(btn_VideoInterview_StartRecording);
	}
	/**
	*This method is used to verify the skip video button.
	*
	*@author VijayaKumar.U
	*/
	public void click_SkipVideo_button()
	{
		waitForElementToDisplay(btn_VideoInterview_SkipVideo, this.elementLoadWaitTime);
		clickOn(btn_VideoInterview_SkipVideo);
	}
	/**
	*This method is used to verify the back button in the corresponding window.
	*
	*@author VijayaKumar.U
	*/
	public void click_Back_button()
	{
		waitForElementToDisplay(btn_VideoInterview_Back, this.elementLoadWaitTime);
		clickOn(btn_VideoInterview_Back);
	}
	/**
	*This method is used to verify the skip video interview element.
	*
	*@author VijayaKumar.U
	*/
	public void skipVideoInterview()
	{
		//scrollToWebpageSkipVideoElement(locator);
		WebElement ele = findWebElement(btn_VideoInterview_SkipVideo);
        scrolltoElementView(ele);
		click_SkipVideo_button();
	}
	/**
	*This method is used to verify the back button in the videointerview.
	*
	*@author VijayaKumar.U
	*/
	public void Click_Back_VideoInterview()
	{
		//scrollToWebpageBackVideoElement(locator);
		WebElement ele = findWebElement(btn_VideoInterview_Back);
        scrolltoElementView(ele);
		click_Back_button();
	}
}