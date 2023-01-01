package scenarios.captcha;

import iSAFE.ApplicationKeywords;
import baseClass.BaseClass;

import pages.MainPage;
import pages.LoginPage;
import pages.PopupDialogWindows;
import pages.UserProfilePage;
import pages.SettingsPage;
import pages.GooglePage;


public class CaptchaDisableTest extends ApplicationKeywords
{
	BaseClass obj;

	MainPage mainPage;
	LoginPage loginPage;
	PopupDialogWindows popupDialogWindows;
	UserProfilePage userProfilePage;
	SettingsPage settingsPage;
	GooglePage googlePage;
	

	public CaptchaDisableTest(BaseClass obj) 
	{
		super(obj);
		this.obj = obj;
	}

	public void mainTest() 
	{
		try
		{
			testStepInfo("");
			testStepInfo("*******************************");
			testStepInfo("Test Execution Started");
			testStepInfo("*******************************");
			testStepInfo("");

			obj.driver = driver;

			mainPage = new MainPage(obj);
			loginPage = new LoginPage(obj);
			popupDialogWindows = new PopupDialogWindows(obj);
			userProfilePage = new UserProfilePage(obj);
			settingsPage = new SettingsPage(obj);
			googlePage = new GooglePage(obj);
			
			testStepInfo("");
			testStepInfo("*******************************");
			testStepInfo("Data Inputs");
			testStepInfo("*******************************");
			testStepInfo("");

			String adminEmailId = retrieve("adminEmailId");
			String adminPassword = retrieve("adminPassword");
			
			String pageOption = retrieve("pageOption");
			
			String googleAddress = retrieve("googleAddress");

			testStepPassed("");
			testStepPassed("Admin Mail Id : "+adminEmailId);
			testStepPassed("Admin Password : "+adminPassword);
			
			testStepPassed("");
			testStepPassed("Page Option : "+pageOption);

			testStepPassed("");
			testStepPassed("Google Address : "+googleAddress);
			
			
			testStepInfo("");
			testStepInfo("************************************");
			testStepInfo("Execution Steps Started");
			testStepInfo("************************************");
			testStepInfo("");

			clearCookies();
			
			driver.get(googleAddress);
			
			googlePage.verify_Google_Page_displayed();
			
			String myPublicIpAddress = googlePage.get_MyIPAddress();
			
			testStepInfo("My Ip Address : "+myPublicIpAddress);
			
			
			openApplicationMainPageByHittingURL();
			
			
			/**********Add IP Address to avoid Captcha**********/

			mainPage.verify_MainPage_displayed();
			
			mainPage.click_login_button();
			
			loginPage.verify_LoginPage_displayed();
			
			loginPage.loginIntoApplication(adminEmailId, adminPassword);

			userProfilePage.verify_UserProfilePage_OppurtunitiesTab_displayed();

			click_Settings_Fixed_SideBar_HamburgerMenu();
			
			settingsPage.verify_SettingsPage_displayed();
			
			settingsPage.verify_SettingsPage_BrandingTab_displayed();
			
			settingsPage.select_Pages_dropdown(pageOption);
			
			settingsPage.verify_SettingsPage_SystemTab_displayed();
				
			settingsPage.click_SettingsPage_AppsTab();
			
			settingsPage.verify_SettingsPage_AppsTab_Section_displayed();
			
			settingsPage.click_AddCaptchaLink_SettingsPage_AppsTab();
			
			popupDialogWindows.verify_AddCaptcha_ModalDialog_Window_displayed();
			
			popupDialogWindows.submit_IpAddress_AddCaptcha_DialogWindow(myPublicIpAddress);
			
			logoutFromApplication();
			
			mainPage.verify_MainPage_displayed();
			
			/**********Add IP Address to avoid Captcha**********/
	
			testStepInfo("");
			testStepInfo("************************************");
			testStepInfo("Execution Steps Completed");
			testStepInfo("************************************");
			testStepInfo("");

			testStepInfo("");
			testStepInfo("*******************************");
			testStepInfo("Test Execution Completed");
			testStepInfo("*******************************");
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
		finally
		{
			if(this.testFailure||this.obj.testFailure||mainPage.testFailure||loginPage.testFailure||popupDialogWindows.testFailure||userProfilePage.testFailure||settingsPage.testFailure||googlePage.testFailure)
			{
				this.testFailure = true;
			}
		}
	}
}