package pages;
import iSAFE.ApplicationKeywords;

import baseClass.BaseClass;

public class HomePage extends ApplicationKeywords
{	
	private static final String lbl_HomePage_Heading = "Home Page Heading#xpath=//span[contains(text(),'About Hatcher+')]";
		
	
	public HomePage(BaseClass obj) 
	{
		super(obj);
	}

	/**
	*This method is used to verify the display of elements in home page.
	*
	*@author VijayaKumar.U
	*/
	
	public void verify_HomePage_displayed(){
		try {
			waitForElementToDisplay(lbl_HomePage_Heading, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_HomePage_Heading))			{
				testStepPassed("Home Page heading is displayed");	
			}	
			else {
				testStepFailed("Home Page heading is not displayed");
			}} 
		catch (Exception e) 		{
			testStepFailed("Couldnot verify the home page heading."+e.getClass());
			e.printStackTrace();
		}
	}
}
