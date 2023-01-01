package pages;
import iSAFE.ApplicationKeywords;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;

public class SettingsPage extends ApplicationKeywords
{	
	private static final String lbl_SettingsPage_Heading = "Settings Page Heading#xpath=(//div[contains(@class,'section')]//div[contains(@id,'admin-users-header')]//*[contains(text(),'Settings')])[1]";
	private static final String lbl_SettingsPage_BrandingTab_Label= "Branding Tab label in Settings Page#xpath=//div[contains(@class,'section')]//div[contains(@class,'midnav')]//a[contains(text(),'Branding')]";
	private static final String lbl_SettingsPage_CustomPagesTab_Label= "Custom Pages Tab label in Settings Page#xpath=//div[contains(@class,'section')]//div[contains(@class,'midnav')]//a[contains(text(),'Custom Pages')]";
	private static final String lbl_SettingsPage_EmailsTab_Label= "Emails Tab label in Settings Page#xpath=//div[contains(@class,'section')]//div[contains(@class,'midnav')]//a[contains(text(),'Emails')]";
	private static final String lbl_SettingsPage_BrandingTab_Active= "Branding Tab Active label in Settings Page#xpath=//div[contains(@class,'section')]//div[contains(@class,'midnav')]//a[contains(@class,'active') and contains(text(),'Branding')]";
	private static final String lbl_SettingsPage_CustomPagesTab_Active= "Custom Pages Tab Active label in Settings Page#xpath=//div[contains(@class,'section')]//div[contains(@class,'midnav')]//a[contains(@class,'active') and contains(text(),'Custom Pages')]";
	private static final String lbl_SettingsPage_EmailsTab_Active= "Emails Tab Active label in Settings Page#xpath=//div[contains(@class,'section')]//div[contains(@class,'midnav')]//a[contains(@class,'active') and contains(text(),'Emails')]";
	private static final String drp_SettingsPage_Pages= "Pages Dropdown in Settings Page#xpath=//div[contains(@class,'section')]//div[contains(@id,'admin-users-header')]//select";
	private static final String lnk_SettingsPage_StaffTab= "Staff Tab Link in Settings Page#xpath=//div[contains(@class,'section')]//div[contains(@class,'midnav')]//a[contains(text(),'staff')]";
	private static final String lnk_SettingsPage_UsersTab= "Users Tab Link in Settings Page#xpath=//div[contains(@class,'section')]//div[contains(@class,'midnav')]//a[contains(text(),'users')]";
	private static final String lbl_SettingsPage_UsersPage_StaffTab_Active= "Staff Tab Active label of Users Page in Settings Page#xpath=//div[contains(@class,'section')]//div[contains(@class,'midnav')]//a[contains(@class,'active') and contains(text(),'staff')]";
	private static final String lbl_SettingsPage_UsersPage_UsersTab_Active= "Users Tab Active label of Users Page in Settings Page#xpath=//div[contains(@class,'section')]//div[contains(@class,'midnav')]//a[contains(@class,'active') and contains(text(),'users')]";
	private static final String lbl_SettingsPage_UsersPage_StaffTab_Page_Section= "Staff Tab Section of Users Page in Settings Page#xpath=//div[contains(@class,'section')]//div[contains(@id,'admin-staff-page')]";
	private static final String lbl_SettingsPage_UsersPage_UsersTab_Page_Section= "Users Tab Section of Users Page in Settings Page#xpath=//div[contains(@class,'section')]//div[contains(@id,'admin-user-page')]";
	private static final String txt_SettingsPage_UsersPage_UsersTab_Section_Search= "Search Textbox in Users Tab Section of Users Page in Settings Page#xpath=(//div[contains(@class,'section')]//div[contains(@id,'admin-user-page')]//input[contains(@placeholder,'Search')])[1]";
	private static final String tbl_SettingsPage_UsersPage_UsersTab_Section_SearchResults= "Search Results Table in Users Tab Section of Users Page in Settings Page#xpath=//div[contains(@class,'section')]//div[contains(@id,'admin-user-page')]//*[contains(text(),'Users')]//small[contains(text(),'1') or contains(text(),'0')]";


	private static final String lst_SettingsPage_UsersPage_UsersTab_Section_Dropdown_ToggleDots= "Dropdown Toggle Dots in Users Tab Section of Users Page in Settings Page#xpath=//div[contains(@id,'admin-user-page')]//div[contains(@class,'dropdown text-right dropleft')]";
	private static final String lst_SettingsPage_UsersPage_UsersTab_Section_Dropdown_ToggleDots_List= "Dropdown Toggle Dots List in Users Tab Section of Users Page in Settings Page#xpath=//ul[contains(@class,'dropdown-menu') and contains(@class,'v-dropdown show')]";
	private static final String lnk_SettingsPage_UsersPage_UsersTab_Section_Dropdown_AddNewUser= "Add New User Link in Dropdown in Users Tab Section of Users Page in Settings Page#xpath=//ul[contains(@class,'dropdown-menu') and contains(@class,'v-dropdown show')]//li//a[contains(text(),'Add New User')]";

	private static final String lst_SettingsPage_UsersPage_StaffTab_Section_Dropdown_ToggleDots= "Dropdown Toggle Dots in Staff Tab Section of Users Page in Settings Page#xpath=//div[contains(@id,'admin-staff-page')]//div[contains(@class,'dropdown text-right dropleft')]";
	private static final String lst_SettingsPage_UsersPage_StaffTab_Section_Dropdown_ToggleDots_List= "Dropdown Toggle Dots List in Staff Tab Section of Users Page in Settings Page#xpath=//ul[contains(@class,'dropdown-menu') and contains(@class,'v-dropdown show')]";
	private static final String lnk_SettingsPage_UsersPage_StaffTab_Section_Dropdown_AddTeamMember= "Add Team Member Link in Dropdown in Staff Tab Section of Users Page in Settings Page#xpath=//ul[contains(@class,'dropdown-menu') and contains(@class,'v-dropdown show')]//li//a[contains(text(),'Add Team Member')]";


	private static final String lst_SettingsPage_UsersPage_UsersTab_Section_User_Action_DoogleDots= "User Action Toggle Dots in Users Tab Section of Users Page in Settings Page#xpath=";
	private static final String lst_SettingsPage_UsersPage_UsersTab_Section_User_Action_List= "User Action List in Users Tab Section of Users Page in Settings Page#xpath=//ul[contains(@aria-labelledby,'dropdownMenuButton') and contains(@class,'dropdown show')]";
	private static final String lnk_SettingsPage_UsersPage_UsersTab_Section_User_Action_List_Settings= "Settings Link in User Action List of Users Tab Section of Users Page in Settings Page#xpath=//ul[contains(@aria-labelledby,'dropdownMenuButton') and contains(@class,'dropdown show')]//li//a[contains(text(),'Settings')]";
	private static final String lnk_SettingsPage_UsersPage_UsersTab_Section_User_Action_List_SendNewPassword= "Send New Password Link in User Action List of Users Tab Section of Users Page in Settings Page#xpath=//ul[contains(@aria-labelledby,'dropdownMenuButton') and contains(@class,'dropdown show')]//li//a[contains(text(),'Send New Password')]";
	private static final String lnk_SettingsPage_UsersPage_UsersTab_Section_User_Action_List_LoginAsUser= "Login As User Link in User Action List of Users Tab Section of Users Page in Settings Page#xpath=//ul[contains(@aria-labelledby,'dropdownMenuButton') and contains(@class,'dropdown show')]//li//a[contains(text(),'Login as User')]";
	private static final String lnk_SettingsPage_UsersPage_UsersTab_Section_User_Action_List_EditProfile= "Edit Profile Link in User Action List of Users Tab Section of Users Page in Settings Page#xpath=//ul[contains(@aria-labelledby,'dropdownMenuButton') and contains(@class,'dropdown show')]//li//a[contains(text(),'Edit Profile')]";
	private static final String lnk_SettingsPage_UsersPage_UsersTab_Section_User_Action_List_DeleteUser= "Delete User Link in User Action List of Users Tab Section of Users Page in Settings Page#xpath=//ul[contains(@aria-labelledby,'dropdownMenuButton') and contains(@class,'dropdown show')]//li//a[contains(text(),'Delete User')]";
	private static final String txt_SettingsPage_UsersPage_StaffTab_Section_Search= "Search Textbox in Staff Tab Section of Users Page in Settings Page#xpath=(//div[contains(@class,'section')]//div[contains(@id,'admin-staff-page')]//input[contains(@placeholder,'Search')])[1]";
	private static final String tbl_SettingsPage_UsersPage_StaffTab_Section_SearchResults= "Search Results Table in Staff Tab Section of Users Page in Settings Page#xpath=//div[contains(@class,'section')]//div[contains(@id,'admin-staff-page')]//*[contains(text(),'Staff')]//small[contains(text(),'1') or contains(text(),'0')]";
	private static final String lst_SettingsPage_UsersPage_StaffTab_Section_Staff_Action_DoogleDots= "Staff Action Toggle Dots in Staf Tab Section of Users Page in Settings Page#xpath=";
	private static final String lst_SettingsPage_UsersPage_StaffTab_Section_Staff_Action_List= "User Action List in Users Tab Section of Users Page in Settings Page#xpath=//ul[contains(@aria-labelledby,'dropdownMenuButton') and contains(@class,'dropdown show')]";
	private static final String lnk_SettingsPage_UsersPage_StaffTab_Section_Staff_Action_List_Settings= "Settings Link in User Action List of Users Tab Section of Users Page in Settings Page#xpath=//ul[contains(@aria-labelledby,'dropdownMenuButton') and contains(@class,'dropdown show')]//li//a[contains(text(),'Settings')]";
	private static final String lnk_SettingsPage_UsersPage_StaffTab_Section_Staff_Action_ListSendNewPassword_= "Send New Password Link in User Action List of Users Tab Section of Users Page in Settings Page#xpath=//ul[contains(@aria-labelledby,'dropdownMenuButton') and contains(@class,'dropdown show')]//li//a[contains(text(),'Send New Password')]";
	private static final String lnk_SettingsPage_UsersPage_StaffTab_Section_Staff_Action_List_LoginAsUser= "Login As User Link in User Action List of Users Tab Section of Users Page in Settings Page#xpath=//ul[contains(@aria-labelledby,'dropdownMenuButton') and contains(@class,'dropdown show')]//li//a[contains(text(),'Login As User')]";
	private static final String lnk_SettingsPage_UsersPage_StaffTab_Section_Staff_Action_List_EditProfile= "Edit Profile Link in User Action List of Users Tab Section of Users Page in Settings Page#xpath=//ul[contains(@aria-labelledby,'dropdownMenuButton') and contains(@class,'dropdown show')]//li//a[contains(text(),'Edit Profile')]";
	private static final String lnk_SettingsPage_UsersPage_StaffTab_Section_Staff_Action_List_DeleteStaff= "Delete Staff Link in User Action List of Users Tab Section of Users Page in Settings Page#xpath=//ul[contains(@aria-labelledby,'dropdownMenuButton') and contains(@class,'dropdown show')]//li//a[contains(text(),'Delete Staff')]";
	private static final String lbl_DeleteUserorStaff_Dialog_Window= "Delete User or Staff Dialog Window of Users Page in Settings Page#xpath=(//div[contains(@id,'modal-delete-admin-user')])[1]//div[contains(@class,'modal-content')]";
	private static final String lbl_DeleteUserorStaff_Dialog_Window_User_Heading= "Delete User or Staff Dialog Window User Heading Labelof Users Page in Settings Page#xpath=(//div[contains(@id,'modal-delete-admin-user')])[1]//div[contains(@class,'modal-content')]//*[contains(text(),'Delete User')]";
	private static final String lbl_DeleteUserorStaff_Dialog_Window_Staff_Heading= "Delete User or Staff Dialog Window Staff Heading Label of Users Page in Settings Page#xpath=(//div[contains(@id,'modal-delete-admin-user')])[1]//div[contains(@class,'modal-content')]//*[contains(text(),'Delete Staff')]";
	private static final String btn_DeleteUserorStaff_Dialog_Window_Delete= "Delete Button in Delete User or Staff Dialog Window of Users Page in Settings Page#xpath=(//div[contains(@id,'modal-delete-admin-user')])[1]//div[contains(@class,'modal-content')]//button[contains(text(),'Delete')]";
	private static final String lbl_DeleteUserorStaff_Dialog_Window_UserorStaff_Deleted_Success_Message= "User or Staff Deleted Success Message of Users Page in Settings Page#xpath=//div[contains(@class,'icon-success')]//div[contains(text(),' User Profile deleted successfully')]";
	private static final String btn_DeleteUserorStaff_Dialog_Window_UserorStaff_Deleted_Success_Message_Ok= "Ok Button in User or Staff Deleted Success Message of Users Page in Settings Page#xpath=//div[contains(@class,'icon-success')]//button[contains(text(),'Ok')]";

	private static final String lbl_SearchResults_FirstRow_UsersPage_StaffTab_Page_Section= "Search Results First Row of Staff Tab Section of Users Page in Settings Page#xpath=//div[contains(@class,'section')]//div[contains(@id,'admin-staff-page')]//div[contains(@id,'staff-table')]//tr[1]";

	private static final String lbl_SettingsPage_SystemTab_Active= "System Tab Active label in Settings Page#xpath=//div[contains(@class,'section')]//div[contains(@class,'midnav')]//a[contains(@class,'active') and contains(text(),'System')]";
	private static final String lbl_SettingsPage_AppsTab_Active= "Apps Tab Active label in Settings Page#xpath=//div[contains(@class,'section')]//div[contains(@class,'midnav')]//a[contains(@class,'active') and contains(text(),'Apps')]";
	private static final String lbl_SettingsPage_ExternalPipelineTab_Active= "External Pipeline Tab Active label in Settings Page#xpath=//div[contains(@class,'section')]//div[contains(@class,'midnav')]//a[contains(@class,'active') and contains(text(),'External Pipeline')]";

	private static final String lnk_SettingsPage_SystemTab= "System Tab Link in Settings Page#xpath=//div[contains(@class,'section')]//div[contains(@class,'midnav')]//a[contains(text(),'System')]";
	private static final String lnk_SettingsPage_AppsTab= "Apps Tab Link in Settings Page#xpath=//div[contains(@class,'section')]//div[contains(@class,'midnav')]//a[contains(text(),'Apps')]";
	private static final String lnk_SettingsPage_ExternalPipelineTab= "External Pipeline Tab Link in Settings Page#xpath=//div[contains(@class,'section')]//div[contains(@class,'midnav')]//a[contains(text(),'External Pipeline')]";


	private static final String img_SettingsPage_Box= "Box Image in Settings Page#xpath=//div[contains(@id,'tab-apps')]//div[contains(@class,'hatcher-box')]//div[contains(@class,'row')]//img[contains(@alt,'Box  Logo')]";
	private static final String img_SettingsPage_Captcha= "Captcha Image in Settings Page#xpath=//div[contains(@id,'tab-apps')]//div[contains(@class,'hatcher-box')]//div[contains(@class,'row')]//img[contains(@alt,' CAPTCHA  Logo')]";
	private static final String lnk_SettingsPage_Captcha_Plus= "Captcha Plus symbol in Settings Page#xpath=//div[contains(@id,'tab-apps')]//div[contains(@class,'hatcher-box')]//div[contains(@class,'row')]//img[contains(@alt,' CAPTCHA  Logo')]/parent::div/parent::div//div[contains(@class,'item-desc')]//a";

	private static final String lbl_SettingsPage_Captcha_ModalDialog_Window= "Captcha Plus Dialog Window in Settings Page#xpath=//div[contains(@class,'modal-dialog modal')]//*[contains(@id,'myModalLabel') and contains(text(),'Settings > CAPTCHA')]";
	private static final String lbl_noUserAccountsFound= "No User Accounts Found#xpath=//div[contains(@class,'section')]//div[contains(@id,'admin-user-page')]//p[contains(text(),'No user accounts found')]";
	private static final String list_allUsersInSearchResult= "All Users Found In Search Result#xpath=//div[contains(@class,'section')]//div[contains(@id,'admin-user-page')]//div[contains(@id,'users-table')]//tr";
	private static final String lbl_deleteConfirmDialogueAlertMessage= "Delete Confirmation Alert#xpath=(//div[contains(@id,'modal-delete-admin-user')])[1]//div[contains(@class,'modal-content')]";
	private static final String btn_settings= "settings#xpath=//a[contains(text() , 'Settings')]";

	
	public SettingsPage(BaseClass obj) 
	{
		super(obj);
	}
	/**
	 *This method is used to verify the display elements in the Settings Page.
	 *
	 *@author VijayaKumar.U
	 */
	
	public void verify_SettingsPage_displayed()	{

		try 		{
			waitForElementToDisplay(lbl_SettingsPage_Heading, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_SettingsPage_Heading))			{
				testStepPassed("Settings Page is displayed");	
			}	
			else testStepFailed("Settings Page is not displayed");} 
		catch (Exception e) 		{
			e.printStackTrace();
			testStepFailed("Settings Page is not displayed " + e.getClass());
		}	}
	
	
	/**
	 *This method is used to click on Settings Page.
	 *
	 *@author VijayaKumar.U
	 */
	public void clickOnSettings()	{

		try 		{
			clickOnSpecialElement(btn_settings);}
		catch (Exception e) 		{
			e.printStackTrace();
			testStepFailed("Failed to clickon Settings " + e.getClass());
		}	}
	
	
	/**
	 *This method is used to verify the display of Branding tab in the settings page
	 *
	 *@author VijayaKumar.U
	 */
	
	public void verify_SettingsPage_BrandingTab_displayed()	{

		try 		{
			waitForElementToDisplay(lbl_SettingsPage_BrandingTab_Active, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_SettingsPage_BrandingTab_Active))
			{
				testStepPassed("Branding Tab is displayed in Settings Page");	
			}	
			else testStepFailed("Branding Tab is not displayed in Settings Page");	} 
		catch (Exception e)		{
			e.printStackTrace();
			testStepFailed("Branding Tab is not displayed in Settings Page "  + e.getClass());
		}	}
	/**
	 *This method is used to verify the display of the custom pages tab in the settings page.
	 *
	 *@author VijayaKumar.U
	 */
	
	public void verify_SettingsPage_CustomPagesTab_displayed()	{
		try 		{
			waitForElementToDisplay(lbl_SettingsPage_CustomPagesTab_Active, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_SettingsPage_CustomPagesTab_Active))
			{
				testStepPassed("Custom Pages Tab is displayed in Settings Page");	
			}		
			else
			{
				testStepFailed("Custom Pages Tab is not displayed in Settings Page");
			}		
		} 
		catch (Exception e) 		{
			testStepFailed("Could not display the element in Settings Page"+e.getClass());e.printStackTrace();
		}	}
	/**
	 *This method is used to verify the email tab in the Settings page.
	 *
	 *@author VijayaKumar.U
	 */

	public void verify_SettingsPage_EmailsTab_displayed()	{
		try 		{
			waitForElementToDisplay(lbl_SettingsPage_EmailsTab_Active, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_SettingsPage_EmailsTab_Active))
			{
				testStepPassed("Emails Tab is displayed in Settings Page");	
			}		
			else 
			{
				testStepFailed("Emails Tab is not displayed in Settings Page");
			}		
		} 
		catch (Exception e)		{
			testStepFailed("Could not verify the Tab element ."+e.getClass());e.printStackTrace();
		}
	}
	/**
	 *This method is used to verify the selection of the dropdown values.
	 *
	 *@param pageOption
	 *@author VijayaKumar.U
	 */
	public void select_Pages_dropdown(String pageOption)	{
		try {
			waitForElementToDisplay(drp_SettingsPage_Pages, this.elementLoadWaitTime);
			selectFromDropdown(drp_SettingsPage_Pages, pageOption);
		}
		catch (Exception e)		{
			e.printStackTrace();
			testStepFailed("Failed to select values from dropdown " + e.getClass());e.printStackTrace();
		}	}
	/**
	 *This method is used to verify the staff tab link in settings page
	 *
	 *@author VijayaKumar.U
	 */
	
	public void verify_SettingsPage_UserPage_StaffTab_displayed()	{
		try 	{
			waitForElementToDisplay(lbl_SettingsPage_UsersPage_StaffTab_Active, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_SettingsPage_UsersPage_StaffTab_Active))
			{
				testStepPassed("Staff Tab of Users Page is displayed in Settings Page");	
			}	
			else
			{
				testStepFailed("Staff Tab of Users Page is not displayed in Settings Page");
			}		
		} 
		catch (Exception e) 		{
			testStepFailed("Could not verify the staff tab element."+e.getClass());e.printStackTrace();
		}	}
	/**
	 *This method is used to verify the User Tab link in the Settings Page 
	 *
	 *@author VijayaKumar.U
	 */
	
	public void verify_SettingsPage_UserPage_UsersTab_displayed()	{

		try 		{
			waitForElementToDisplay(lbl_SettingsPage_UsersPage_UsersTab_Active, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_SettingsPage_UsersPage_UsersTab_Active))
			{
				testStepPassed("Users Tab of Users Page is displayed in Settings Page");	
			}	
			else testStepFailed("Users Tab of Users Page is not displayed in Settings Page");	} 
		catch (Exception e) {
			e.printStackTrace();
			testStepFailed("Users Tab cannot be verified."+ e.getClass());
		}	}
	/**
	 *This method is used to verify the system Tab in the Settings Page.
	 *
	 *@author VijayaKumar.U
	 */
	
	public void verify_SettingsPage_SystemTab_displayed()	{
		try {
			waitForElementToDisplay(lbl_SettingsPage_SystemTab_Active, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_SettingsPage_SystemTab_Active))
			{
				testStepPassed("System Tab is displayed in Settings Page");	
			}	
			else
				{
				testStepFailed("System Tab is not displayed in Settings Page");
				
				}} 
		catch (Exception e) 		{
			testStepFailed("Could not verify the element."+e.getClass());e.printStackTrace();
			e.printStackTrace();
		}	}

	/**
	 *This method is used to verify the Staff Tab in the Settings Page.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_SettingsPage_UserPage_StaffTab()	{
		waitForElementToDisplay(lnk_SettingsPage_StaffTab, this.elementLoadWaitTime);
		clickOn(lnk_SettingsPage_StaffTab);
	}
	/**
	 *This method is used to verify link of User Tab in the User Page 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_SettingsPage_UserPage_UsersTab()	{
		try 		{
			waitForElementToDisplay(lnk_SettingsPage_UsersTab, this.elementLoadWaitTime);
			clickOn(lnk_SettingsPage_UsersTab);
		}
		catch (Exception e)		{
			e.printStackTrace();
			testStepFailed("User Tab is not displayed in User Page " + e.getClass());
		}	}

	/**
	 *This method is used to verify the display of the UserTab active
	 *
	 *@author VijayaKumar.U
	 */
	
	public void verify_SettingsPage_UserPage_UsersTab_Page_displayed()	{
		try 		{
			waitForElementToDisplay(lbl_SettingsPage_UsersPage_UsersTab_Active, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_SettingsPage_UsersPage_UsersTab_Active))
			{
				testStepPassed("Users Tab of Users Page is displayed in Settings Page");	
			}	
			else
			{
				testStepFailed("Users Tab of Users Page is not displayed in Settings Page");
			}		
		} 
		catch (Exception e) 		{
			testStepFailed("Could not verify the element in Settings Page"+e.getClass());e.printStackTrace();
		}	}
	/**
	 *This method is used to verify the display of the staff section of user tab.
	 *
	 *@author VijayaKumar.U
	 */
	//------------Edited by Priya.V added Else-part-enchanced catch block------//
	public void verify_SettingsPage_UserPage_StaffTab_Section_displayed()	{

		try 		{
			waitForElementToDisplay(lbl_SettingsPage_UsersPage_StaffTab_Page_Section, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_SettingsPage_UsersPage_StaffTab_Page_Section))
			{
				testStepPassed("Staff Section of Users Tab of Users Page is displayed in Settings Page");	
			}	
			else
				{
				
				testStepFailed("Staff Section of Users Tab of Users Page is not displayed in Settings Page");
				}} 
		catch (Exception e) 		{
			testStepFailed("Could not verify the element  in Settings Page"+e.getClass());e.printStackTrace();
		}
	}
	/**
	 *This method is used to verify the System Tab link in Settings Page.
	 *
	 *@author VijayaKumar.U
	 */


	public void click_SettingsPage_SystemTab()	{
		waitForElementToDisplay(lnk_SettingsPage_SystemTab, this.elementLoadWaitTime);
		clickOn(lnk_SettingsPage_SystemTab);
	}
	/**
	 *This method is used to verify the Apps Tablink .
	 *
	 *@author VijayaKumar.U
	 */
	public void click_SettingsPage_AppsTab()	{
		waitForElementToDisplay(lnk_SettingsPage_AppsTab, this.elementLoadWaitTime);
		clickOn(lnk_SettingsPage_AppsTab);
	}
	/**
	 *This method is used to 
	 *
	 *@author VijayaKumar.U
	 */
	public void click_SettingsPage_ExternalPipelineTab()	{
		waitForElementToDisplay(lnk_SettingsPage_StaffTab, this.elementLoadWaitTime);
		clickOn(lnk_SettingsPage_ExternalPipelineTab);
	}
	/**
	 *This method is used to verify the display of  Apps Tab in Settings Page. 
	 *
	 *@author VijayaKumar.U
	 */
	//------------Edited by Priya.V added Else-part-enchanced catch block------//
	public void verify_SettingsPage_AppsTab_Section_displayed()	{
		try 		{
			waitForElementToDisplay(lbl_SettingsPage_AppsTab_Active, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_SettingsPage_AppsTab_Active))
			{
				testStepPassed("Apps Tab is displayed in Settings Page");	
			}	
			else
				{
				testStepFailed("Apps Tab is not displayed in Settings Page");
				}} 
		catch (Exception e) 		{
			testStepFailed("Could not verify the tab element ."+e.getClass());e.printStackTrace();
		}	}
	/**
	 *This method is used to click the captcha link in the Apps Tab.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_AddCaptchaLink_SettingsPage_AppsTab()	{
		try {
			WebElement element = driver.findElement(By.xpath("//div[contains(@id,'tab-apps')]//div[contains(@class,'hatcher-box')]//div[contains(@class,'row')]//img[contains(@alt,'Box  Logo')]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			waitForElementToDisplay(img_SettingsPage_Captcha, this.elementLoadWaitTime);
			mouseOver(img_SettingsPage_Captcha);
			waitForElementToDisplay(lnk_SettingsPage_Captcha_Plus, this.elementLoadWaitTime);
			clickOn(lnk_SettingsPage_Captcha_Plus);
			testStepPassed("Captcha displayed in Apps Tab.");
		}
		catch (Exception e) 		{
			testStepFailed("Captcha link not displayed."+e.getClass());
		}	}
	/**
	 *This method is used to verify the display of the user tab.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_SettingsPage_UserPage_UsersTab_Section_displayed()	{
		try 
		{
			waitForElementToDisplay(lbl_SettingsPage_UsersPage_UsersTab_Page_Section, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_SettingsPage_UsersPage_UsersTab_Page_Section))	{	
				testStepPassed("Users Section of Users Tab of Users Page is displayed in Settings Page");	
			}
			else testStepFailed("Users Section of Users Tab of Users Page is not displayed in Settings Page");
		} 
		catch (Exception e) 		{
			e.printStackTrace();
			testStepFailed("Users Section of Users Tab of Users Page is not displayed in Settings Page"+ e.getClass());
		}	}
	/**
	 *This method is used to the enter the user and search.
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_SettingsPage_UserPage_UsersTab_Search(String userNameorEmailAddress)	{
		try {
			waitForElementToDisplay(txt_SettingsPage_UsersPage_UsersTab_Section_Search, this.elementLoadWaitTime);
			typeIn(txt_SettingsPage_UsersPage_UsersTab_Section_Search, userNameorEmailAddress);
			testStepPassed("Succefully search of the user tab.");
		}
		catch (Exception e) 		{
			testStepFailed("Search of user tab in  Settings Page failed."+e.getClass());e.printStackTrace();
		}	}	
	/**
	 *This method is used to verify the display of the deletion of user.
	 *
	 *@param userNameorEmailAddress
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_Users_DisplayedinApplication_DeleteUser(String userNameorEmailAddress)	{
		try 	{ 
			waitForElementToDisplay(txt_SettingsPage_UsersPage_UsersTab_Section_Search, this.elementLoadWaitTime);
			typeIn(txt_SettingsPage_UsersPage_UsersTab_Section_Search, userNameorEmailAddress);		
			if(elementPresent(lbl_noUserAccountsFound))
			{
				testStepPassed(userNameorEmailAddress+" User name or email address is not registered in application");
			}	else {		
				testStepPassed(userNameorEmailAddress+" User name or email address is already registered in application");
				List<WebElement> userNames = findWebElements(list_allUsersInSearchResult);
				int userNamesCount = userNames.size();
				for (int i = 1; i <= userNamesCount; i++)	{
					String lbl_user= "User #xpath=//div[contains(@class,'section')]//div[contains(@id,'admin-user-page')]//div[contains(@id,'users-table')]//tr["+i+"]//td[4]//a[contains(@data-toggle,'dropdown')]";
					clickOnSpecialElement(lbl_user);
					waitForElementToDisplay(lst_SettingsPage_UsersPage_UsersTab_Section_User_Action_List, this.elementLoadWaitTime);				

					if(isElementDisplayed(lst_SettingsPage_UsersPage_UsersTab_Section_User_Action_List))						
					{
						testStepPassed("User Toggle Icon Options is displayed");
						clickOnSpecialElement(lnk_SettingsPage_UsersPage_UsersTab_Section_User_Action_List_DeleteUser);
						waitForElementToDisplay(lbl_DeleteUserorStaff_Dialog_Window, this.elementLoadWaitTime);
						if(isElementDisplayed(lbl_deleteConfirmDialogueAlertMessage))
						{
							testStepPassed("Delete User Confirm Dialog window is displayed");

							clickOn(btn_DeleteUserorStaff_Dialog_Window_Delete);
							waitForElementToDisplay(lbl_DeleteUserorStaff_Dialog_Window_UserorStaff_Deleted_Success_Message, this.elementLoadWaitTime);
							if(isElementDisplayed(lbl_DeleteUserorStaff_Dialog_Window_UserorStaff_Deleted_Success_Message))	
							{
								testStepPassed("User Profile deleted successfully message is displayed");
								clickOn(btn_DeleteUserorStaff_Dialog_Window_UserorStaff_Deleted_Success_Message_Ok);
							}								 
						else{						
							testStepFailed("User Profile deleted successfully message is not displayed.");}
						}	
						else{				
							testStepFailed("Delete User Confirm Dialog window is not displayed.");
						}		
				}else{	testStepFailed("User Toggle Icon Options is not displayed.");}}}
		}
			catch (Exception e)		{
				e.printStackTrace();
				testStepFailed("Failed to delete User " + e.getClass());
			}
			
		}
	/**
	 *This method is used to verify the display of user deletion in application.
	 *@param userNameorEmailAddress
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_Users_DisplayedinApplication_DeleteUser_New(String userNameorEmailAddress)
	{
		waitForElementToDisplay(txt_SettingsPage_UsersPage_UsersTab_Section_Search, this.elementLoadWaitTime);
		typeIn(txt_SettingsPage_UsersPage_UsersTab_Section_Search, userNameorEmailAddress);

		if (driver.findElement(By.xpath("//div[contains(@class,'section')]//div[contains(@id,'admin-user-page')]//p[contains(text(),'No user accounts found')]")).isDisplayed()) 
		{
			testStepPassed(userNameorEmailAddress+" User name or email address is not registered in application");
		}
		else 	{
			testStepPassed(userNameorEmailAddress+" User name or email address is already registered in application");

			List<WebElement> userNames = driver.findElements(By.xpath("//div[contains(@class,'section')]//div[contains(@id,'admin-user-page')]//div[contains(@id,'users-table')]//tr"));
			int userNamesCount = userNames.size();
			for (int i = 1; i <= userNamesCount; i++) {
				
				driver.findElement(By.xpath("//div[contains(@class,'section')]//div[contains(@id,'admin-user-page')]//div[contains(@id,'users-table')]//tr["+i+"]//td[4]//a[contains(@data-toggle,'dropdown')]")).click(); 
				waitForElementToDisplay(lst_SettingsPage_UsersPage_UsersTab_Section_User_Action_List, this.elementLoadWaitTime);

				if (driver.findElement(By.xpath("//ul[contains(@aria-labelledby,'dropdownMenuButton') and contains(@class,'dropdown show')]")).isDisplayed()) 
				{
					testStepPassed("User Toggle Icon Options is displayed");

					clickOn(lnk_SettingsPage_UsersPage_UsersTab_Section_User_Action_List_DeleteUser);

					waitForElementToDisplay(lbl_DeleteUserorStaff_Dialog_Window, this.elementLoadWaitTime);

					if (driver.findElement(By.xpath("(//div[contains(@id,'modal-delete-admin-user')])[1]//div[contains(@class,'modal-content')]")).isDisplayed()) 
					{
						testStepPassed("Delete User Confirm Dialog window is displayed");
						clickOn(btn_DeleteUserorStaff_Dialog_Window_Delete);
						waitForElementToDisplay(lbl_DeleteUserorStaff_Dialog_Window_UserorStaff_Deleted_Success_Message, this.elementLoadWaitTime);

						if (driver.findElement(By.xpath("//div[contains(@class,'icon-success')]//div[contains(text(),' User Profile deleted successfully')]")).isDisplayed())
						{
							testStepPassed("User Profile deleted successfully message is displayed");
							clickOn(btn_DeleteUserorStaff_Dialog_Window_UserorStaff_Deleted_Success_Message_Ok);
						}
						else						{
							testStepFailed("User Profile deleted successfully message is not displayed");
						}		}
					else 	{
						testStepFailed("Delete User Confirm Dialog window is not displayed");
					}	}
				else 	{
					testStepFailed("User Toggle Icon Options is not displayed");
				}	}	}}
	/**
	 *This method is used to verify the Staff deletion display.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_Staff_DisplayedinApplication_DeleteStaff(String userNameorEmailAddress)	{
		waitForElementToDisplay(txt_SettingsPage_UsersPage_StaffTab_Section_Search, this.elementLoadWaitTime);
		typeIn(txt_SettingsPage_UsersPage_StaffTab_Section_Search, userNameorEmailAddress);

		try 		{
			if (driver.findElement(By.xpath("//div[contains(@class,'section')]//div[contains(@id,'admin-staff-page')]//p[contains(text(),'No user accounts found')]")).isDisplayed()) 
			{
				testStepPassed(userNameorEmailAddress+" Staff name or Email address is not registered in application");
			}	
			
		} 
		catch (Exception e) {
			testStepFailed(userNameorEmailAddress+" Staff name or Email address is already registered in application");
			e.printStackTrace();
			List<WebElement> userNames = driver.findElements(By.xpath("//div[contains(@class,'section')]//div[contains(@id,'admin-staff-page')]//div[contains(@id,'staff-table')]//tr"));
			int userNamesCount = userNames.size();
			for (int i = 1; i <= userNamesCount; i++) 	{
				driver.findElement(By.xpath("//div[contains(@class,'section')]//div[contains(@id,'admin-staff-page')]//div[contains(@id,'staff-table')]//tr["+i+"]//td[5]//a[contains(@data-toggle,'dropdown')]")).click();
				try 		{
					waitForElementToDisplay(lst_SettingsPage_UsersPage_StaffTab_Section_Staff_Action_List, this.elementLoadWaitTime);

					if (driver.findElement(By.xpath("//ul[contains(@aria-labelledby,'dropdownMenuButton') and contains(@class,'dropdown show')]")).isDisplayed()) 
					{
						testStepPassed("Staff Toggle Icon Options is displayed");

						clickOn(lnk_SettingsPage_UsersPage_StaffTab_Section_Staff_Action_List_DeleteStaff);
						try		{
							waitForElementToDisplay(lbl_DeleteUserorStaff_Dialog_Window, this.elementLoadWaitTime);

							if (driver.findElement(By.xpath("(//div[contains(@id,'modal-delete-admin-user')])[1]//div[contains(@class,'modal-content')]")).isDisplayed()) 
							{
								testStepPassed("Delete User Confirm Dialog window is displayed");
								clickOn(btn_DeleteUserorStaff_Dialog_Window_Delete);
								try	{
									waitForElementToDisplay(lbl_DeleteUserorStaff_Dialog_Window_UserorStaff_Deleted_Success_Message, this.elementLoadWaitTime);

									if (driver.findElement(By.xpath("//div[contains(@class,'icon-success')]//div[contains(text(),' User Profile deleted successfully')]")).isDisplayed()) 
									{
										testStepPassed("User Profile deleted successfully message is displayed");
										clickOn(btn_DeleteUserorStaff_Dialog_Window_UserorStaff_Deleted_Success_Message_Ok);
									}	} 
								catch (Exception e2) {
									testStepFailed("User Profile deleted successfully message is not displayed");
								}		}		} 
						catch (Exception e2) 	{
							testStepFailed("Delete User Confirm Dialog window is not displayed");
						}		}		} 
				catch (Exception e2)		{
					testStepFailed("User Toggle Icon Options is not displayed");
				}	}	}}

	/**
	 *This method is used to add new user in the Tab.
	 *
	 *@author VijayaKumar.U
	 */
	public void Add_New_User_UsersTab()	{
		try {
			waitForElementToDisplay(lst_SettingsPage_UsersPage_UsersTab_Section_Dropdown_ToggleDots, this.elementLoadWaitTime);
			clickOn(lst_SettingsPage_UsersPage_UsersTab_Section_Dropdown_ToggleDots);

			waitForElementToDisplay(lst_SettingsPage_UsersPage_UsersTab_Section_Dropdown_ToggleDots_List, this.elementLoadWaitTime);

			clickOn(lnk_SettingsPage_UsersPage_UsersTab_Section_Dropdown_AddNewUser);
			testStepPassed("Added user  successfully.");
		}
		catch(Exception e) {
			testStepFailed("User addition failed."+e.getClass());}
	}
	/**
	 *This method is used to verify the add team member in settings page.
	 *
	 *@author VijayaKumar.U
	 */
	public void Add_Team_Member_StaffTab()	{
		try {
			waitForElementToDisplay(lst_SettingsPage_UsersPage_StaffTab_Section_Dropdown_ToggleDots, this.elementLoadWaitTime);
			clickOn(lst_SettingsPage_UsersPage_StaffTab_Section_Dropdown_ToggleDots);

			waitForElementToDisplay(lst_SettingsPage_UsersPage_StaffTab_Section_Dropdown_ToggleDots_List, this.elementLoadWaitTime);

			clickOn(lnk_SettingsPage_UsersPage_StaffTab_Section_Dropdown_AddTeamMember);
			testStepPassed("Added member successfully.");
		}
		catch(Exception e) {
			testStepFailed("Element verification failed."+e.getClass());}
	}
	/**
	 *This method is used to verify the staff with email address added to user settings.
	 *
	 *@author VijayaKumar.U
	 */
	//------------Edited by Priya.V added Else-part-enchanced catch block------//
	public void verify_StaffAdded_displayed_StaffTable_StaffTab_Section_SettingsPage(String emailAddress)	{
		try 		{
			waitForElementToDisplay(lbl_SearchResults_FirstRow_UsersPage_StaffTab_Page_Section, this.elementLoadWaitTime);
			String emailAddressinApp = driver.findElement(By.xpath("//div[contains(@class,'section')]//div[contains(@id,'admin-staff-page')]//div[contains(@id,'staff-table')]//tr[1]")).getText().trim();
			if(emailAddressinApp.equalsIgnoreCase(emailAddress))
			{
				testStepPassed("Staff with email address "+emailAddress+" is added successfully and displayed in Staff Tab of User Settings page");	
			}	
			else
						testStepFailed("Staff with email address "+emailAddress+" is not added successfully and displayed in Staff Tab of User Settings page");
		}		
		catch (Exception e) 		{
			testStepFailed("Could not verify element."+e.getClass());
		}	}}