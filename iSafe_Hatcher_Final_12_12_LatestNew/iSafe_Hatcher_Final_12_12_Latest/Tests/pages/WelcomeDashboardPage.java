package pages;
import iSAFE.ApplicationKeywords;

import org.openqa.selenium.By;

import baseClass.BaseClass;

public class WelcomeDashboardPage extends ApplicationKeywords
{	
	private static final String lbl_WelcomeDashboardPage_Heading = "Welcome Dashboard Page Heading#xpath=//div[contains(text(),'Welcome')]";
	private static final String lnk_WelcomeDashboardPage_Opportunities = "Opportunities Link in Welcome Dashboard Page#xpath=//div[contains(@class,'section')]//div[contains(@class,'nav midnav')]//a[contains(text(),'Opportunities')]";
	private static final String lnk_WelcomeDashboardPage_Profile = "Profile Link in Welcome Dashboard Page#xpath=//div[contains(@class,'section')]//div[contains(@class,'nav midnav')]//a[contains(text(),'Profile')]";
	private static final String lnk_WelcomeDashboardPage_Portfolio = "Portfolio Link in Welcome Dashboard Page#xpath=//div[contains(@class,'section')]//div[contains(@class,'nav midnav')]//a[contains(text(),'Portfolio')]";
	private static final String lbl_WelcomeDashboardPage_OpportunitiesTab = "Opportunities Tab Heading Label in Welcome Dashboard Page#xpath=//div[contains(@class,'section')]//div[contains(@class,'nav midnav')]//a[contains(@class,'nav-link active') and contains(text(),'Opportunities')]";
	private static final String lbl_WelcomeDashboardPage_ProfileTab = "Profile Tab Heading Label in Welcome Dashboard Page#xpath=//div[contains(@class,'section')]//div[contains(@class,'nav midnav')]//a[contains(@class,'nav-link active') and contains(text(),'Profile')]";
	private static final String lbl_WelcomeDashboardPage_PortfolioTab = "Portfolio Tab Heading Label in Welcome Dashboard Page#xpath=//div[contains(@class,'section')]//div[contains(@class,'nav midnav')]//a[contains(@class,'nav-link active') and contains(text(),'Portfolio')]";
	private static final String lbl_NewlyRegistered_WelcomeDashboardPage_Heading = "Newly Registered Welcome Dashboard Page Heading#xpath=//div[contains(@class,'section')]//div[contains(@class,'midnav')]//a[contains(@class,' active') and contains(text(),'Profile')]";
	private static final String txt_EmailAddressApp="EmailAddressApp#xpath=//div[contains(@id,'tab-overview')]//div[contains(@class,'hatcher-box')]//*[contains(text(),'Contact')])[3]/following-sibling::div[contains(@class,'hatcher-box-border')]//tr[2]//a";
	private static final String txt_ProfileNameInApplication="profileNameinApplication#xpath=//div[contains(@class,'section')]//*[contains(@class,'post-title')]";
	public WelcomeDashboardPage(BaseClass obj) 
	{
		super(obj);
	}
	/**
	*This method is used to verify the display of elements in the WelcomeDashboard page.
	*
	*@author VijayaKumar.U
	*/

	public void verify_WelcomeDashboardPage_displayed(){
		try 	{
			waitForElementToDisplay(lbl_WelcomeDashboardPage_Heading, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_WelcomeDashboardPage_Heading))
			{
				testStepPassed("Welcome Dashboard Page is displayed");	
			}		} 
		catch (Exception e) 		{
			testStepFailed("Welcome Dashboard Page is not displayed");
		}	}
	/**
	*This method is used to verify the display of newly registered dashboard
	*
	*@author VijayaKumar.U
	*/
	public void verify_Newlyregistered_WelcomeDashboardPage_displayed()	{
			try {
			waitForElementToDisplay(lbl_NewlyRegistered_WelcomeDashboardPage_Heading, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_NewlyRegistered_WelcomeDashboardPage_Heading))
			{
				testStepPassed("Newly Regsitered Welcome Dashboard Page is displayed");	
			}		} 
		catch (Exception e) 		{
			testStepFailed("Newly Regsitered Welcome Dashboard Page is not displayed");
		}	}
	/**
	*This method is used to verify the opportunities link.
	*
	*@author VijayaKumar.U
	*/
	public void click_MidNav_Opportunities()
	{
		waitForElementToDisplay(lnk_WelcomeDashboardPage_Opportunities, this.elementLoadWaitTime);
		clickOn(lnk_WelcomeDashboardPage_Opportunities);
	}
	/**
	*This method is used to verify the profile link in the corresponding page.
	*
	*@author VijayaKumar.U
	*/
	public void click_MidNav_Profile()
	{
		waitForElementToDisplay(lnk_WelcomeDashboardPage_Profile, this.elementLoadWaitTime);
		clickOn(lnk_WelcomeDashboardPage_Profile);
	}
	/**
	*This method is used to verify the Portfolio link in the corresponding page.
	*
	*@author VijayaKumar.U
	*/
	public void click_MidNav_Portfolio()
	{
		waitForElementToDisplay(lnk_WelcomeDashboardPage_Portfolio, this.elementLoadWaitTime);
		clickOn(lnk_WelcomeDashboardPage_Portfolio);
	}
	/**
	*This method is used to verify the Opportunities Tab.
	*
	*@author VijayaKumar.U
	*/
	public void verify_WelcomeDashboardPage_OpportunitiesTab_displayed(){
		try 	{
			waitForElementToDisplay(lbl_WelcomeDashboardPage_OpportunitiesTab, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_WelcomeDashboardPage_OpportunitiesTab))
			{
				testStepPassed("Opportunities Tab is displayed in Welcome Dashboard Page");	
			}		} 
		catch (Exception e) 	{
			testStepFailed("Opportunities Tab is not displayed in Welcome Dashboard Page");
		}
	}
	/**
	*This method is used to verify the Profile Tab in the Dashboard page.
	*
	*@author VijayaKumar.U
	*/
	public void verify_WelcomeDashboardPage_ProfileTab_displayed()
	{
		try 
		{
			waitForElementToDisplay(lbl_WelcomeDashboardPage_ProfileTab, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_WelcomeDashboardPage_ProfileTab))
			{
				testStepPassed("Profile Tab is displayed in Welcome Dashboard Page");	
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Profile Tab is not displayed in Welcome Dashboard Page");
		}
	}
	/**
	*This method is used to verify the display of the portfolio tab.
	*
	*@author VijayaKumar.U
	*/	
	public void verify_WelcomeDashboardPage_PortfolioTab_displayed()
	{
		try 	{
			waitForElementToDisplay(lbl_WelcomeDashboardPage_PortfolioTab, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_WelcomeDashboardPage_PortfolioTab))
			{
				testStepPassed("Protfolio Tab is displayed in Welcome Dashboard Page");	
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Protfolio Tab is not displayed in Welcome Dashboard Page");
		}
	}
	/**
	*This method is used to verify the email address of the corresponding page.
	*
	*@author VijayaKumar.U
	*/
	
	public void verify_CorrespondingProfilePage_displayed(String emailAddressWhileLogin)	{
		String emailAddressinApplication = getText(txt_EmailAddressApp).trim();
		try 		{
			if (emailAddressinApplication.equalsIgnoreCase(emailAddressWhileLogin)) 
			{
				testStepPassed("Correct Dashboard page is displayed for the User with email address "+emailAddressWhileLogin);
			}		} 
		catch (Exception e) 		{
			testStepFailed("Correct Dashboard page is not displayed for the User with email address "+emailAddressWhileLogin);
		}	}
	/**
	*This method is used to verify the email address registered.
	*
	*@author VijayaKumar.U
	*/
	public void verify_NewlyRegistered_CorrespondingProfilePage_displayed(String emailAddressRegistered)	{
		String emailAddressinApplication = getText(txt_EmailAddressApp).trim();
		System.out.println("emailAddressinApplication : "+emailAddressinApplication);
		testStepPassed("emailAddressinApplication : "+emailAddressinApplication);
		try 
		{
			if (emailAddressinApplication.equalsIgnoreCase(emailAddressRegistered)) 
			{
				testStepPassed("Newly registered Correct Dashboard page is displayed for the User with email address "+emailAddressRegistered);
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Newly registered Correct Dashboard page is not displayed for the User with email address "+emailAddressRegistered);
		}
	}	
	/**
	*This method is used to verify the the profile name in the corresponding page of the application.
	*
	*@author VijayaKumar.U
	*/
	
	public void verify_NewlyRegistered_CorrespondingProfilePage_displayed_By_ProfileName(String profileName)
	{
		String profileNameinApplication =getText(txt_ProfileNameInApplication).trim();
		System.out.println("profileNameinApplication : "+profileNameinApplication);
		testStepPassed("profileNameinApplication : "+profileNameinApplication);
		try 
		{
			if (profileNameinApplication.contains(profileName)) 
			{
				testStepPassed("Newly registered Correct Dashboard page is displayed for the User with Profile Name "+profileName);
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Newly registered Correct Dashboard page is not displayed for the User with Profile Name "+profileName);
		}
	}	
}
