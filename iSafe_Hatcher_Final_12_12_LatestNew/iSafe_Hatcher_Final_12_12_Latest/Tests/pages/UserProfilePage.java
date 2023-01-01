package pages;
import iSAFE.ApplicationKeywords;

import org.openqa.selenium.By;

import baseClass.BaseClass;

public class UserProfilePage extends ApplicationKeywords
{	
	private static final String lbl_UserProfilePage_Heading = "User Profile Page Heading#xpath=//div[contains(@class,'section')]//div[contains(@class,'nav midnav')]//a[contains(@class,'nav-link active') and contains(text(),'Profile')]";
	private static final String lnk_UserProfilePage_Profile = "Profile Link in User Profile Page#xpath=//div[contains(@class,'section')]//div[contains(@class,'nav midnav')]//a[contains(text(),'Profile')]";
	private static final String lnk_UserProfilePage_Portfolio = "Portfolio Link in User Profile Page#xpath=//div[contains(@class,'section')]//div[contains(@class,'nav midnav')]//a[contains(text(),'Portfolio')]";
	private static final String lbl_UserProfilePage_ProfileTab = "Profile Tab Heading Label in User Profile Page#xpath=//div[contains(@class,'section')]//div[contains(@class,'nav midnav')]//a[contains(@class,'nav-link active') and contains(text(),'Profile')]";
	private static final String lbl_UserProfilePage_PortfolioTab = "Portfolio Tab Heading Label in User Profile Page#xpath=//div[contains(@class,'section')]//div[contains(@class,'nav midnav')]//a[contains(@class,'nav-link active') and contains(text(),'Portfolio')]";
	private static final String lnk_UserProfilePage_TopMenu_ToggleDots = "Top Menu Toggle Dots Link in User Profile Page#xpath=//div[contains(@class,'section')]//a[contains(@id,'dropdownMenuTop')]//i";
	private static final String lbl_UserProfilePage_TopMenu_ToggleDots_MenuContainer = "Top Menu Toggle Dots Menu container label in User Profile Page#xpath=(//ul[contains(@class,'dropdown-menu bg-light show')])[1]";
	private static final String lnk_UserProfilePage_TopMenu_ToggleDots_MenuContainer_DeleteUser = "Delete User in  Menu container label in User Profile Page#xpath=(//ul[contains(@class,'dropdown-menu bg-light show')])[1]//li//a[contains(@title,'Delete User')]";
	private static final String lbl_UserProfilePage_DeleteUserConfirmDialog = "Delete User Confirm Dialog in User Profile Page#xpath=//div[contains(@id,'delete-confirmation')]//div[contains(@class,'modal-dialog modal')]";
	private static final String btn_UserProfilePage_DeleteUserConfirmDialog_Delete = "Delete Button in Delete User Confirm Dialog in User Profile Page#xpath=//button[contains(text(),'Delete')]";
//	private static final String btn_UserProfilePage_DeleteUserConfirmDialog_Delete = "Delete Button in Delete User Confirm Dialog in User Profile Page#xpath=//div[contains(@id,'delete-confirmation')]//div[contains(@class,'modal-dialog modal')]//button[contains(text(),'Delete')]";
	private static final String  txt_companyNameinApplication= "companyNameinApplication#xpath=//div[contains(@id,'tab-overview')]//*[contains(text(),'Companies')])[2]//parent::div//div[contains(@class,'hatcher-box-flex')]//div[contains(@class,'hatcher-box-flex-right')]//a[contains(@title,'')])[1]";
	private static final String  txt_emailAddressinApplication_index4="Email Address index4#xpath=//div[contains(@id,'profile-panel')]//div[contains(@class,'hatcher-box')]//*[contains(text(),'Contact')])[3]/following-sibling::div[contains(@class,'hatcher-box-border')]//tr[4]//a";
	private static final String  txt_emailAddressinApplication_index2="Email Address index1#xpath=//div[contains(@id,'tab-overview')]//div[contains(@class,'hatcher-box')]//*[contains(text(),'Contact')])[3]/following-sibling::div[contains(@class,'hatcher-box-border')]//tr[2]//a";
	
	private static final String  txt_profileNameinApplication="Profile Name#xpath=//div[contains(@class,'section')]//span[contains(@class,'member-user-full-name')]";
	public UserProfilePage(BaseClass obj) 
	{
		super(obj);
	}

	/**
	*This method is used to verify the heading of the user profile page.
	*
	*@author VijayaKumar.U
	*/
	//--------------Edited by Priya.V------------Else ,catch block enhanced part added----//
	public void verify_UserProfilePage_displayed()	{
	
		try 		{
			waitForElementToDisplay(lbl_UserProfilePage_Heading, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_UserProfilePage_Heading))
			{
				testStepPassed("User Profile Page is displayed");	
			}	
			else
			{
				testStepFailed("User Profile Page is not displayed");
			}		
		} 
		catch (Exception e) 		{
			testStepFailed("Unable to verify the element."+e.getClass());
		}	}
	/**
	*This method is used to verify the Profile link
	*
	*@author VijayaKumar.U
	*/	
	//--------------Edited by Priya.V------------try ,catch block enhanced part added----//
	public void click_MidNav_Profile()	{
		try {
		waitForElementToDisplay(lnk_UserProfilePage_Profile, this.elementLoadWaitTime);
		clickOn(lnk_UserProfilePage_Profile);
		}
		catch (Exception e) 		{
			testStepFailed("Unable to verify the element."+e.getClass());
		}	
	}
	/**
	*This method is used to verify the display of the Porfolio link.
	*
	*@author VijayaKumar.U
	*/
	public void click_MidNav_Portfolio()	{
		waitForElementToDisplay(lnk_UserProfilePage_Portfolio, this.elementLoadWaitTime);
		clickOn(lnk_UserProfilePage_Portfolio);
	}
	/**
	*This method is used to verify the Profile Tab in the User Profile PAge.
	*
	*@author VijayaKumar.U
	*/
	//------------Edited by Priya.V ---added else part and try/catch -enhancement---//
	public void verify_UserProfilePage_ProfileTab_displayed()
	{
		try 
		{
			waitForElementToDisplay(lbl_UserProfilePage_ProfileTab, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_UserProfilePage_ProfileTab))
			{
				testStepPassed("Profile Tab is displayed in User Profile Page");	
			}
			else {
				testStepFailed("Profile Tab is not displayed in User Profile Page");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Profile Tab is not displayed in User Profile Page"+e.getClass());
		}
	}
	/**
	*This method is used to verify the display of the Portfolio Tab in user portfolio page.
	*
	*@author VijayaKumar.U
	*/
	//------------Edited by Priya.V ---added else part and try/catch -enhancement---//
	public void verify_UserProfilePage_PortfolioTab_displayed()	{		
		try {
			waitForElementToDisplay(lbl_UserProfilePage_PortfolioTab, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_UserProfilePage_PortfolioTab))
			{
				testStepPassed("Protfolio Tab is displayed in User Profile Page");	
			}
			else {
				testStepFailed("Protfolio Tab  is not displayed in User Profile Page");
			}
		} 
		catch (Exception e) 	{
			testStepFailed("Could not display element in User Profile Page"+e.getClass());
		}
	}
	/**
	*This method is used to verify the display of the opportunities tab in user page.
	*
	*@author VijayaKumar.U
	*/
	public void verify_UserProfilePage_OppurtunitiesTab_displayed()    {
        try         {
    
}
catch (Exception e)         {
    e.printStackTrace();
    testStepFailed("Opportunities Tab is not displayed in User Profile Page " + e.getClass());
}
}
	/**
	*This method is used to verify the correctness of the email address in the corresponding page
	*
	*@author VijayaKumar.U
	*/
	//----------------Edited by Priya.V -----Added Else part-----------//
	public void verify_CorrespondingUserProfilePage_displayed(String emailAddressWhileLogin)	{
		String emailAddressinApplication = getText(txt_emailAddressinApplication_index2).trim();
				try {		
					if (emailAddressinApplication.equalsIgnoreCase(emailAddressWhileLogin)) 
			{
				testStepPassed("Correct Dashboard page is displayed for the User with email address "+emailAddressWhileLogin);
			}
					else {
						testStepFailed("Correct Dashboard page is not displayed for the User with email address "+emailAddressWhileLogin);
					}
		} 
		catch (Exception e) 
		{
			testStepFailed("Unable to verify. "+e.getClass());
		}
	}
	/**
	*This method is used to verify the profile name is displayed correctly in the Profile page.
	*
	*@author VijayaKumar.U
	*/
	//----------------Edited by Priya.V -----Added Else part-----------//
	public void verify_CorrespondingUserProfilePage_displayed_by_ProfileName(String profileName)
	{
		String profileNameinApplication =getText(txt_profileNameinApplication).trim();
		
		try 
		{
			if (profileNameinApplication.contains(profileName)) 
			{
				testStepPassed("Correct User Profile page is displayed for the User with Profile Name "+profileName);
			}
			
			else {
				testStepFailed("Correct User Profile page is not displayed for the User with Profile Name ");
				}}
		catch (Exception e) 
		{
			testStepFailed("Element could not be verified."+e.getClass());e.printStackTrace();
		}
	}
	/**
	*This method is used to verify the display of the address registered 
	*
	*@author VijayaKumar.U
	*/
	//----------------Edited by Priya.V -----Added Else part------try/catch-----//
	public void verify_NewlyRegistered_CorrespondingUserProfilePage_displayed(String emailAddressRegistered)
	{
		String emailAddressinApplication = getText(txt_emailAddressinApplication_index4).trim();
		
		try 
		{
			if (emailAddressinApplication.equalsIgnoreCase(emailAddressRegistered)) 
			{
				testStepPassed("Newly registered Correct Dashboard page is displayed for the User with email address "+emailAddressRegistered);
			}
			else
			{
				testStepFailed("Newly registered Correct Dashboard page is not displayed for the User with email address ");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Could not verify the element."+e.getClass());e.printStackTrace();
		}
	}
	/**
	*This method is used to verify the toggle dots menu.
	*
	*@author VijayaKumar.U
	*/
	public void click_TopNavMenu_ToggleDots()
	{
		waitForElementToDisplay(lnk_UserProfilePage_TopMenu_ToggleDots, this.elementLoadWaitTime);
		clickOn(lnk_UserProfilePage_TopMenu_ToggleDots);
	}
	/**
	*This method is used verify the display of the menu in toggle dots
	*
	*@author VijayaKumar.U
	*/
	//----------------Edited by Priya.V -----Added Else part------try/catch-----//
	public void click_TopNavMenu_ToggleDots_MenuContainer_displayed()
	{
	
		try 
		{
			waitForElementToDisplay(lbl_UserProfilePage_TopMenu_ToggleDots_MenuContainer, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_UserProfilePage_TopMenu_ToggleDots_MenuContainer))
			{
				testStepPassed("User Profile Page Top Menu Conatiner is displayed");	
			}
			else
			{
				testStepFailed("User Profile Page Top Menu Conatiner is not displayed");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Could not verify the element."+e.getClass());e.printStackTrace();
		}
	}
	/**
	*This method is used to verify the toggle dots menu for delete option
	*
	*@author VijayaKumar.U
	*/
	public void click_DeleteUser_ToggleDots_TopNavMenu()
	{
		waitForElementToDisplay(lnk_UserProfilePage_TopMenu_ToggleDots_MenuContainer_DeleteUser, this.elementLoadWaitTime);
		clickOn(lnk_UserProfilePage_TopMenu_ToggleDots_MenuContainer_DeleteUser);
	}
	/**
	*This method is used to verify the delete button
	*
	*@author VijayaKumar.U
	*/
	//----------------Edited by Priya.V -----Added Else part------try/catch-----//
	public void click_DeleteButton_Confirm_DeleteUser_Dialog()
	{
		
		try 
		{
			waitForElementToDisplay(lbl_UserProfilePage_DeleteUserConfirmDialog, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_UserProfilePage_DeleteUserConfirmDialog))
			{
				testStepPassed("Delete User Confirm Dialog is displayed");
				clickOn(btn_UserProfilePage_DeleteUserConfirmDialog_Delete);
			}
			else
			{
				testStepFailed("Delete User Confirm Dialog is not displayed");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Could not verify the elements."+e.getClass());e.printStackTrace();
		}
	}
	/**
	*This method is used to delete the user profile
	*
	*@author VijayaKumar.U
	*/
	public void deleteUserProfile()
	{
		click_TopNavMenu_ToggleDots();
		click_TopNavMenu_ToggleDots_MenuContainer_displayed();
		click_DeleteUser_ToggleDots_TopNavMenu();
		click_DeleteButton_Confirm_DeleteUser_Dialog();
	}
	
	/**
	*This method is used to verify the display of the company name in the corresponding window
	*
	*@author VijayaKumar.U
	*/
	//----------------Edited by Priya.V -----Added Else part------try/catch-----//
	public void verify_Corresponding_Company_displayed_UserProfilePage(String companyName)	{
		String companyNameinApplication = getText(txt_companyNameinApplication).trim();
		
		try {
			if (companyNameinApplication.contains(companyName)) 
			{
				testStepPassed("Correct Added Company Name is displayed in User Profile page "+companyName);
			}		
			else {
				testStepFailed("Correct Added Company Name is not displayed in User Profile page ");
			}	
		} 
		catch (Exception e) 		{
			testStepFailed("Could not verify the elements."+e.getClass());e.printStackTrace();
		}
	}
}
