package pages;
import iSAFE.ApplicationKeywords;
import baseClass.BaseClass;

public class EmailSentConfirmationPage extends ApplicationKeywords
{	
	private static final String lbl_InvestorResigtrationEmailSentConfirmPage_Heading = "Investor Resigtration Email Sent Confirm Page Heading #xpath=//div[contains(@class,'application-form')]//div[contains(@id,'tab-verify-email')]//*[contains(text(),'Verify your email address')]";
	
	public EmailSentConfirmationPage(BaseClass obj) 
	{
		super(obj);
	}
	/**
     * This method is used to .verify the investor resigtration email Confirm page.
     *
     * @param 
     * @author VijayaKumar.U
     * 
     */

	public void verify_InvestorResigtrationEmailSentConfirmPage_displayed()
	{
		
		try 
		{
			waitForElementToDisplay(lbl_InvestorResigtrationEmailSentConfirmPage_Heading, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_InvestorResigtrationEmailSentConfirmPage_Heading))
			{
				testStepPassed("Investor Resigtration Email Sent Confirm Page is displayed");	
			}
			else testStepFailed("Investor Resigtration Email Sent Confirm Page is not displayed");
		} 
		catch (Exception e) 
		{
			testStepFailed("Investor Resigtration Email Sent Confirm Page is not displayed"+ e.getClass());
			e.printStackTrace();
		}
	}
}
