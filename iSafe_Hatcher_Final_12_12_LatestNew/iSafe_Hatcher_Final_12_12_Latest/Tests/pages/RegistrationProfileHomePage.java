package pages;
import iSAFE.ApplicationKeywords;
import baseClass.BaseClass;

public class RegistrationProfileHomePage extends ApplicationKeywords
{	
	private static final String lbl_ProfileHomePage = "Profile Home Page#xpath=//div[contains(@class,'section')]//div[contains(@class,'tabs')]//div[contains(@class,'hatcher-box-padded contact')]";
	private static final String lbl_profileNameinApp_index1="Profile Name With index1//div[contains(@class,'section')]//div[contains(@class,'tabs')]//div[contains(@class,'hatcher-box-padded contact')]//table//tr[1]//a";
	public RegistrationProfileHomePage(BaseClass obj) 
	{
		super(obj);
	}
	/**
	*This method is used to verify the display of label in profile home page.
	*
	*@author VijayaKumar.U
	*/
	public void verify_Registration_ProfileHomePage_displayed()
	{
		
		try 
		{
			waitForElementToDisplay(lbl_ProfileHomePage, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_ProfileHomePage))
			{
				testStepPassed("Profile Home Page is displayed");	
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Profile Home Page is not displayed");
		}
	}
	/**
	*This method is used to verify the display the investment history in the registration.
	*
	*@author VijayaKumar.U
	*/
	public void verify_UserisRegistered(String profileName)
	{
	
		String profileNameinApp =getText(lbl_profileNameinApp_index1);
		try 
		{
			if(profileNameinApp.equalsIgnoreCase(profileName))
			{
				testStepPassed(profileName+" user is registered successfully");	
			}
		} 
		catch (Exception e) 
		{
			testStepFailed(profileName+" user is not registered successfully");
		}
	}
}