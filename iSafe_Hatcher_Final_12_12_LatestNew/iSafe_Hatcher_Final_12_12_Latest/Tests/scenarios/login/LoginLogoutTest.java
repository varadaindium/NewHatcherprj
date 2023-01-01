package scenarios.login;

import iSAFE.ApplicationKeywords;
import baseClass.BaseClass;

import pages.MainPage;
import pages.LoginPage;
import pages.WelcomeDashboardPage;
import pages.UserProfilePage;
import pages.SettingsPage;


public class LoginLogoutTest extends ApplicationKeywords
{

	BaseClass obj;
	
	MainPage mainPage;
	LoginPage loginPage;
	WelcomeDashboardPage welcomeDashboardPage;
	UserProfilePage userProfilePage;
	SettingsPage settingsPage;
	
	public LoginLogoutTest(BaseClass obj) 
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
			welcomeDashboardPage = new WelcomeDashboardPage(obj);
			userProfilePage = new UserProfilePage(obj);
			settingsPage = new SettingsPage(obj);
			
			testStepInfo("");
			testStepInfo("*******************************");
			testStepInfo("Data Inputs");
			testStepInfo("*******************************");
			testStepInfo("");
			
			String email = retrieve("Email");
			String password = retrieve("Password");			
			testStepPassed("Email : "+email);
			testStepPassed("Password : "+password);
			
			
			testStepInfo("");
			testStepInfo("*******************************");
			testStepInfo("Execution Steps Started");
			testStepInfo("*******************************");
			testStepInfo("");
			
			clearCookies();
			
			openApplicationMainPageByHittingURL();
			
			mainPage.verify_MainPage_displayed();
			
			mainPage.click_login_button();
			
			loginPage.verify_LoginPage_displayed();
			
			loginPage.loginIntoApplication(email, password);
			
			userProfilePage.verify_UserProfilePage_OppurtunitiesTab_displayed();

			click_Settings_Fixed_SideBar_HamburgerMenu();
			
			settingsPage.verify_SettingsPage_displayed();
			
			settingsPage.verify_SettingsPage_BrandingTab_displayed();
			
			settingsPage.select_Pages_dropdown("Users");
			
			settingsPage.verify_SettingsPage_UserPage_UsersTab_displayed();
			
			settingsPage.click_SettingsPage_UserPage_UsersTab();
			
			settingsPage.verify_SettingsPage_UserPage_UsersTab_Section_displayed();
			
			settingsPage.verify_Users_DisplayedinApplication_DeleteUser("hatcherautomationn@gmail.com");
			
			
			
			logoutFromApplication();

			mainPage.verify_MainPage_displayed();
			
			clearCookies();
			
			testStepInfo("");
			testStepInfo("*******************************");
			testStepInfo("Execution Steps Completed");
			testStepInfo("*******************************");
			testStepInfo("");
			
			testStepInfo("");
			testStepInfo("*******************************");
			testStepInfo("Test Execution Completed");
			testStepInfo("*******************************");
		}
		catch(Exception e)
		{
			testStepInfo("e.toString()");
		}
		finally
		{
			if (this.testFailure||this.obj.testFailure||mainPage.testFailure||loginPage.testFailure||welcomeDashboardPage.testFailure||userProfilePage.testFailure||settingsPage.testFailure) 
			{
				this.testFailure = true;
			}
		}
	}
}