package scenarios.investorsignup;

import iSAFE.ApplicationKeywords;
import baseClass.BaseClass;

import pages.MainPage;
import pages.RegistrationPage;
import pages.EmailSentConfirmationPage;
import pages.EmailReaderPage;
import pages.LoginPage;
import pages.WelcomeDashboardPage;
import pages.UserProfilePage;
import pages.HomePage;
import pages.CompanyProfilePage;
import pages.SettingsPage;
import pages.RegistrationCompanyPage;
import pages.RegistrationInvestorDetailsPage;
import pages.RegistrationInvestmentPage;


public class CreateInvestorTest extends ApplicationKeywords
{
	private Boolean status = false;

	BaseClass obj;

	MainPage mainPage;
	RegistrationPage registrationPage;
	EmailSentConfirmationPage emailSentConfirmationPage;
	EmailReaderPage emailReaderPage;
	RegistrationCompanyPage registrationCompanyPage;
	RegistrationInvestorDetailsPage registrationInvestorDetailsPage;
	RegistrationInvestmentPage registrationInvestmentPage;
	LoginPage loginPage;
	WelcomeDashboardPage welcomeDashboardPage;
	UserProfilePage userProfilePage;
	HomePage homePage;
	CompanyProfilePage companyProfilePage;
	SettingsPage settingsPage;

	public CreateInvestorTest(BaseClass obj) 
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
			registrationPage = new RegistrationPage(obj);
			emailSentConfirmationPage = new EmailSentConfirmationPage(obj);
			emailReaderPage = new EmailReaderPage(obj);
			registrationCompanyPage = new RegistrationCompanyPage(obj);
			registrationInvestorDetailsPage = new RegistrationInvestorDetailsPage(obj);
			registrationInvestmentPage = new RegistrationInvestmentPage(obj);
			loginPage = new LoginPage(obj);
			welcomeDashboardPage = new WelcomeDashboardPage(obj);
			userProfilePage = new UserProfilePage(obj);
			homePage = new HomePage(obj);
			companyProfilePage = new CompanyProfilePage(obj);
			settingsPage = new SettingsPage(obj);
			
			testStepInfo("");
			testStepInfo("*******************************");
			testStepInfo("Data Inputs");
			testStepInfo("*******************************");
			testStepInfo("");

			String adminEmailId = retrieve("adminEmailId");
			String adminPassword = retrieve("adminPassword");
			
			String pageOption = retrieve("pageOption");
			
			String tempVariable1 = generateRandomString();
			String firstNameData = retrieve("firstName");
			String firstName = firstNameData+tempVariable1;
			String tempVariable2 = generateRandomString();
			String lastNameData = retrieve("lastName");
			String lastName = lastNameData+tempVariable2;
			String emailAddress = retrieve("emailAddress");
			String password = retrieve("password");

			String emailServer = retrieve("emailServer");
			String emailId = retrieve("emailId");
			String emailPassword = retrieve("emailPassword");
			String emailSubject = retrieve("emailSubject");

			String tempVariable3 = generateRandomString();
			String legalNameData = retrieve("legalName");
			String legalName = legalNameData+tempVariable3;
			String website = retrieve("website");
			String city = retrieve("city");
			String country = retrieve("country");
			
			String salutation = retrieve("salutation");
			String jobTitle = retrieve("jobTitle");
			String mobileNumber = retrieve("mobileNumber");
			String investorType = retrieve("investorType");
			
			String industries = retrieve("industries");
			String preferredInvestmentStage = retrieve("preferredInvestmentStage");
			String investmentSize = retrieve("investmentSize");

			String searchProfile = firstNameData;
			String profileNameFull = lastName+" "+firstName;
			String profileNameFull2 = firstName+" "+lastName;

			testStepPassed("");
			testStepPassed("Admin Mail Id : "+adminEmailId);
			testStepPassed("Admin Password : "+adminPassword);
			
			testStepPassed("");
			testStepPassed("Page Option : "+pageOption);
			
			testStepPassed("");
			testStepPassed("Firstname : "+firstName);
			testStepPassed("LastName : "+lastName);
			testStepPassed("Email Address : "+emailAddress);
			testStepPassed("Password : "+password);
			
			testStepPassed("");
			testStepPassed("Email Server : "+emailServer);
			testStepPassed("Email Id : "+emailId);
			testStepPassed("Email Password : "+emailPassword);
			testStepPassed("Email Subject : "+emailSubject);

			testStepPassed("");
			testStepPassed("Legal Name : "+legalName);
			testStepPassed("Website : "+website);
			testStepPassed("City : "+city);
			testStepPassed("Country : "+country);
			
			testStepPassed("");
			testStepPassed("Salutation : "+salutation);
			testStepPassed("Job Title : "+jobTitle);
			testStepPassed("Mobile Number : "+mobileNumber);
			testStepPassed("Investor Type : "+investorType);
			
			testStepPassed("");
			testStepPassed("Industries : "+industries);
			testStepPassed("Preferred Investment Stage : "+preferredInvestmentStage);
			testStepPassed("Investment Size : "+investmentSize);

			testStepPassed("");
			testStepPassed("Search Profile : "+searchProfile);
			testStepPassed("Profile Name Full : "+profileNameFull);
			testStepPassed("Profile Name Full 2 : "+profileNameFull2);
			
			testStepInfo("");
			testStepInfo("************************************");
			testStepInfo("Execution Steps Started");
			testStepInfo("************************************");
			testStepInfo("");
			
			clearCookies();
			
			openApplicationMainPageByHittingURL();			
			mainPage.verify_MainPage_displayed();			
			mainPage.click_login_button();			
			loginPage.verify_LoginPage_displayed();			
			loginPage.loginIntoApplication(adminEmailId, adminPassword);
			click_Settings_Fixed_SideBar_HamburgerMenu();			
			settingsPage.clickOnSettings();   //newly added click
			settingsPage.verify_SettingsPage_displayed();			
			settingsPage.select_Pages_dropdown(pageOption);			
			settingsPage.verify_SettingsPage_UserPage_UsersTab_displayed();			
			settingsPage.click_SettingsPage_UserPage_UsersTab();			
			settingsPage.verify_SettingsPage_UserPage_UsersTab_Section_displayed();			
			settingsPage.verify_Users_DisplayedinApplication_DeleteUser(emailAddress);			
			logoutFromApplication();

			mainPage.verify_MainPage_displayed();
			mainPage.click_CreateaFund_QuickLink();
			registrationPage.verify_SignUpPage_displayed();
			registrationPage.fillSignUpForm(firstName, lastName, emailAddress, password);
			registrationPage.submitSignUpForm();
			emailSentConfirmationPage.verify_InvestorResigtrationEmailSentConfirmPage_displayed();
			String investorActivateUrl = emailReaderPage .getInvestorAccountActivateURL(emailServer, emailId, emailPassword, emailSubject);
			driver.get(investorActivateUrl);
			registrationCompanyPage.verify_Registration_Company_displayed();			
			registrationCompanyPage.fillInvestorCompanyInformation(legalName, website, city, country);			
			registrationCompanyPage.click_Next_CompanyInformation();			
			registrationInvestorDetailsPage.verify_Registration_InvestorDetailsForm_displayed();			
			registrationInvestorDetailsPage.fillInvestorDetailsInformation(salutation, jobTitle, mobileNumber, investorType);			
			registrationInvestorDetailsPage.click_Next_InvestorDetailsInformation();			
			registrationInvestmentPage.verify_Registration_Investment_displayed();			
			registrationInvestmentPage.fillInvestmentForm(industries, preferredInvestmentStage);			
			registrationInvestmentPage.click_Next_InvestmentForm();			
			companyProfilePage.verify_CompanyProfilePage_displayed();
			companyProfilePage.verify_ProfileTab_CompanyProfilePage_displayed();
			companyProfilePage.verify_CorrespondingCompanyProfilePage_displayed_by_CompanyName(legalName);			
			logoutFromApplication();
			
			
			

			/**********Deleting User Profile from App**********/

			mainPage.verify_MainPage_displayed();

			mainPage.click_login_button();

			loginPage.verify_LoginPage_displayed();

			loginPage.loginIntoApplication(adminEmailId, adminPassword);

			welcomeDashboardPage.verify_WelcomeDashboardPage_displayed();

			search_ValuesinSearchBar(searchProfile);

			verify_Searched_UserProfile_displayed_and_Open_UserProfilePage(profileNameFull);

			userProfilePage.verify_UserProfilePage_displayed();

			userProfilePage.verify_UserProfilePage_ProfileTab_displayed();

			userProfilePage.verify_CorrespondingUserProfilePage_displayed_by_ProfileName(profileNameFull2);

			userProfilePage.deleteUserProfile();
			
			//verify_delete_action_completed_successfully();
			
			/**********Deleting User Profile from App**********/
			
			
			
			/**********Deleting Company Profile from App**********/
			
			homePage.verify_HomePage_displayed();
			
			search_ValuesinSearchBar(legalName);
			
			verify_Searched_Company_displayed_and_Open_CompanyProfilePage(legalName);
			
			companyProfilePage.verify_CompanyProfilePage_displayed();

			companyProfilePage.verify_ProfileTab_CompanyProfilePage_displayed();

			companyProfilePage.verify_CorrespondingCompanyProfilePage_displayed_by_CompanyName(legalName);
			
			companyProfilePage.deleteCompanyProfile();
			
	//verify_delete_action_completed_successfully();
			
			logoutFromApplication();
			
			mainPage.verify_MainPage_displayed();
			
			/**********Deleting Company Profile from App**********/


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
			System.err.println(e.toString());
		}
		finally
		{
			if(this.testFailure||this.obj.testFailure||mainPage.testFailure||registrationPage.testFailure||emailSentConfirmationPage.testFailure||emailReaderPage.testFailure||registrationCompanyPage.testFailure||registrationInvestorDetailsPage.testFailure||registrationInvestmentPage.testFailure||loginPage.testFailure||welcomeDashboardPage.testFailure||userProfilePage.testFailure||homePage.testFailure||companyProfilePage.testFailure||settingsPage.testFailure)
			{
				this.testFailure = true;
			}
		}
	}
}