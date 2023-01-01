package pages;
import iSAFE.ApplicationKeywords;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import baseClass.BaseClass;

public class ProfileUpdateRegistrationPage extends ApplicationKeywords
{	
	private static final String lbl_ProfileUpdateRegistration = "Profile Update Registration Page label#xpath=//div[contains(@class,'application-form')]//*[contains(text(),'Thank you for completing the application; these are the investors and accelerators on Hatcher+ VAAST that are of the highest relevance')]";
	private static final String lst_ProfileUpdateRegistration_InvestorandAccelerator = "Investor and Accelerator loist in Profile Update Registration Page#xpath=//div[contains(@class,'application-form')]//div[contains(@class,'match-success-card')]//div[contains(@class,'match-success-container')]";
	private static final String btn_ProfileUpdateRegistration_UpdateYourProfile = "Update Your Profile in Profile Update Registration Page#xpath=//div[contains(@class,'application-form')]//a[contains(text(),'Update Your Profile')]";
	
	public ProfileUpdateRegistrationPage(BaseClass obj) 
	{
		super(obj);
	}
	/**
	*This method is used to verify the display of the update profile
	*
	*@author VijayaKumar.U
	*/
	public void verify_ProfileUpdateRegistration_Page_displayed()
	{
	
		waitForElementToDisplay(lbl_ProfileUpdateRegistration, this.elementLoadWaitTime);
		if(isElementDisplayed(lbl_ProfileUpdateRegistration))
		{
			testStepPassed("Profile Update Registration Page is displayed");	
		}
		else
		{
			testStepFailed("Profile Update Registration Page is not displayed");
		}
	}
	//newly added Priyav
	public void verify_ProfileUpdateRegistration_Page_displayed_Updated()
	{
	try {
		waitForElementToDisplay(lbl_ProfileUpdateRegistration, this.elementLoadWaitTime);
		if(isElementDisplayed(lbl_ProfileUpdateRegistration))
		{
			testStepPassed("Profile Update Registration Page is displayed");	
		}
		else
		{
			testStepFailed("Profile Update Registration Page is not displayed");
		}}
		catch(Exception e) {
			testStepFailed("Profile Update Registration Page element is not displayed"+e.getClass());e.printStackTrace();
		}}
	
	/**
	*This method is used to get the investor accelerator list 
	*
	*@author VijayaKumar.U
	*/
	public void get_InvestorandAccelerator_List()
	{
		waitForElementToDisplay(lst_ProfileUpdateRegistration_InvestorandAccelerator, this.elementLoadWaitTime);
		List<WebElement> investorandacceleratorlist = driver.findElements(By.xpath("//div[contains(@class,'application-form')]//div[contains(@class,'match-success-card')]//div[contains(@class,'match-success-container')]"));
		int investorandacceleratorlistCount = investorandacceleratorlist.size();
		testStepPassed("No.of Best Matching Investors and Accelerators : "+investorandacceleratorlistCount);
		testStepPassed("Investors and Accelerators Name :");
		for (int i = 1; i <= investorandacceleratorlistCount; i++) 
		{
			String companyName = driver.findElement(By.xpath("(//div[contains(@class,'application-form')]//div[contains(@class,'match-success-card')]//div[contains(@class,'match-success-container')]//a[contains(@class,'match-success-contents-name')])["+i+"]")).getText();
			testStepPassed("Company Name in "+i+" container : "+companyName);
		}
	}
	/**
	*This method is used to enable the update profile button
	*
	*@author VijayaKumar.U
	*/	//newly added Priyav
	public void click_UpdateYourProfile_button_Updated()
	{
		try {
			
			if(isElementDisplayed(lbl_ProfileUpdateRegistration))
			{
		clickOn(btn_ProfileUpdateRegistration_UpdateYourProfile);
		}
		else {
			testStepFailed("Profile Update Registration Page element is not verified");
		}}
		catch(Exception e) {
			testStepFailed("Profile Update Registration Page element is not displayed"+e.getClass());e.printStackTrace();
		}
	}
	public void click_UpdateYourProfile_button()
	{
		waitForElementToDisplay(btn_ProfileUpdateRegistration_UpdateYourProfile, this.elementLoadWaitTime);
		clickOn(btn_ProfileUpdateRegistration_UpdateYourProfile);
	}
}