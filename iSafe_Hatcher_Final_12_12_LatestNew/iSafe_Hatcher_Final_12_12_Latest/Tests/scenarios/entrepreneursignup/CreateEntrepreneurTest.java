package scenarios.entrepreneursignup;

import iSAFE.ApplicationKeywords;
import baseClass.BaseClass;

import pages.MainPage;
import pages.RegistrationPage;
import pages.EmailSentConfirmationPage;
import pages.EmailReaderPage;
import pages.RegistrationCompanyPage;
import pages.RegistrationFounderPage;
import pages.RegistrationInvestmentHistoryPage;
import pages.RegistrationVideoInterviewPage;
import pages.WelcomeDashboardPage;
import pages.LoginPage;
import pages.UserProfilePage;
import pages.HomePage;
import pages.CompanyProfilePage;
import pages.SettingsPage;
import pages.ProfileUpdateRegistrationPage;


public class CreateEntrepreneurTest extends ApplicationKeywords
{
	private Boolean status = false;

	BaseClass obj;

	MainPage mainPage;
	RegistrationPage registrationPage;
	EmailSentConfirmationPage emailSentConfirmationPage;
	EmailReaderPage emailReaderPage;
	RegistrationCompanyPage registrationCompanyPage;
	RegistrationFounderPage registrationFounderPage;
	RegistrationInvestmentHistoryPage registrationInvestmentHistoryPage;
	RegistrationVideoInterviewPage registrationVideoInterviewPage;
	WelcomeDashboardPage welcomeDashboardPage;
	LoginPage loginPage;
	UserProfilePage userProfilePage;
	HomePage homePage;
	CompanyProfilePage companyProfilePage;
	SettingsPage settingsPage;
	ProfileUpdateRegistrationPage profileUpdateRegistrationPage;

	public CreateEntrepreneurTest(BaseClass obj) 
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
			registrationFounderPage = new RegistrationFounderPage(obj);
			registrationInvestmentHistoryPage = new RegistrationInvestmentHistoryPage(obj);
			registrationVideoInterviewPage = new RegistrationVideoInterviewPage(obj);
			welcomeDashboardPage = new WelcomeDashboardPage(obj);
			loginPage = new LoginPage(obj);
			userProfilePage = new UserProfilePage(obj);
			homePage = new HomePage(obj);
			companyProfilePage = new CompanyProfilePage(obj);
			settingsPage = new SettingsPage(obj);
			profileUpdateRegistrationPage = new ProfileUpdateRegistrationPage(obj);
		
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
			String companyDescription = retrieve("companyDescription");
			String tempVariable = getCurrentDateinYearMonthDateFormat();
			String incorporationDate = tempVariable;
			String businessStatus = retrieve("businessStatus");
			String industries = retrieve("industries");
			String UNSDGs = retrieve("UNSDGs");

			String salutation = retrieve("salutation");
			String jobTitle = retrieve("jobTitle");
			String mobileNumber = retrieve("mobileNumber");
			String founderBio = retrieve("founderBio");
			String highestEducation = retrieve("highestEducation");
			String proffesionalQualifications = retrieve("proffesionalQualifications");

			
			String capitalAmount = retrieve("capitalAmount");
			String currentInvestmentRound = retrieve("currentInvestmentRound");
			String capitalExchangePercentage = retrieve("capitalExchangePercentage");
			String fundingRounds = retrieve("fundingRounds");

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
			testStepPassed("Company Description : "+companyDescription);
			testStepPassed("Incorporation Date : "+incorporationDate);
			testStepPassed("Business Status : "+businessStatus);
			testStepPassed("Industries : "+industries);
			testStepPassed("UNSDGs : "+UNSDGs);

			testStepPassed("");
			testStepPassed("Salutation : "+salutation);
			testStepPassed("Job Title : "+jobTitle);
			testStepPassed("Mobile Number : "+mobileNumber);
			testStepPassed("Founder Bio : "+founderBio);
			testStepPassed("Highest Education : "+highestEducation);
			testStepPassed("Proffesional Qualifications : "+proffesionalQualifications);

			testStepPassed("");
			testStepPassed("Capital Amount : "+capitalAmount);
			testStepPassed("Current Investment Round : "+currentInvestmentRound);
			testStepPassed("Capital Exchange Percentage : "+capitalExchangePercentage);
			testStepPassed("Funding Rounds : "+fundingRounds);
			
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
			
			
			
			/**********Checking Mail Id all registered in App and if exists deleting the profile with that Mail Id**********/

			mainPage.verify_MainPage_displayed();			
			mainPage.click_login_button();			
			loginPage.verify_LoginPage_displayed();			
			loginPage.loginIntoApplication(adminEmailId, adminPassword);
			userProfilePage.verify_UserProfilePage_OppurtunitiesTab_displayed();
			click_Settings_Fixed_SideBar_HamburgerMenu();			
			settingsPage.verify_SettingsPage_displayed();			
			settingsPage.verify_SettingsPage_BrandingTab_displayed();			
			settingsPage.select_Pages_dropdown(pageOption);			
			settingsPage.verify_SettingsPage_UserPage_UsersTab_displayed();			
			settingsPage.click_SettingsPage_UserPage_UsersTab();			
			settingsPage.verify_SettingsPage_UserPage_UsersTab_Section_displayed();			
			settingsPage.verify_Users_DisplayedinApplication_DeleteUser(emailAddress);			
			logoutFromApplication();

			mainPage.verify_MainPage_displayed();
			
			/**********Checking Mail Id all registered in App and if exists deleting the profile with that Mail Id**********/

			
			

			mainPage.verify_MainPage_displayed();
			mainPage.click_FindInvestors_QuickLink();
			registrationPage.verify_SignUpPage_displayed();
			registrationPage.fillSignUpForm(firstName, lastName, emailAddress, password);
			registrationPage.submitSignUpForm();
			emailSentConfirmationPage.verify_InvestorResigtrationEmailSentConfirmPage_displayed();
			String investorActivateUrl = emailReaderPage.getInvestorAccountActivateURL(emailServer, emailId, emailPassword, emailSubject);
			driver.get(investorActivateUrl);
			registrationCompanyPage.verify_Registration_Company_displayed();
			registrationCompanyPage.fillCompanyInformation(legalName, website, city, country, companyDescription, incorporationDate, businessStatus, industries, UNSDGs);
			registrationCompanyPage.click_Next_CompanyInformation();
			registrationFounderPage.verify_Registration_Founder_displayed();
			registrationFounderPage.fillFounderInformation(salutation, jobTitle, mobileNumber, founderBio, highestEducation, proffesionalQualifications);
			registrationFounderPage.click_Next_FounderInformation();
			registrationInvestmentHistoryPage.verify_Registration_InvestmentHistory_displayed();
			registrationInvestmentHistoryPage.fillInvestmentInformation(capitalAmount, currentInvestmentRound, capitalExchangePercentage, fundingRounds);
			registrationInvestmentHistoryPage.click_Next_InvestmentHistory();
			registrationVideoInterviewPage.verify_Registration_VideoInterview_displayed();
			registrationVideoInterviewPage.skipVideoInterview();
			
			profileUpdateRegistrationPage.verify_ProfileUpdateRegistration_Page_displayed();			
			profileUpdateRegistrationPage.get_InvestorandAccelerator_List();			
			profileUpdateRegistrationPage.click_UpdateYourProfile_button();			
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
			verify_delete_action_completed_successfully();
			
			/**********Deleting User Profile from App**********/
			
			
			
			/**********Deleting Company Profile from App**********/
			
			homePage.verify_HomePage_displayed();			
			search_ValuesinSearchBar(legalName);			
			verify_Searched_Company_displayed_and_Open_CompanyProfilePage(legalName);			
			companyProfilePage.verify_CompanyProfilePage_displayed();
			companyProfilePage.verify_ProfileTab_CompanyProfilePage_displayed();
			companyProfilePage.verify_CorrespondingCompanyProfilePage_displayed_by_CompanyName(legalName);			
			companyProfilePage.deleteCompanyProfile();			
			verify_delete_action_completed_successfully();
			
			/**********Deleting Company Profile from App**********/
			
			
			
			homePage.verify_HomePage_displayed();			
			logoutFromApplication();			
			mainPage.verify_MainPage_displayed();
			
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
			if(this.testFailure||this.obj.testFailure||mainPage.testFailure||registrationPage.testFailure||emailSentConfirmationPage.testFailure||emailReaderPage.testFailure||registrationCompanyPage.testFailure||registrationFounderPage.testFailure||registrationInvestmentHistoryPage.testFailure||registrationVideoInterviewPage.testFailure||welcomeDashboardPage.testFailure||loginPage.testFailure||userProfilePage.testFailure||homePage.testFailure||companyProfilePage.testFailure||settingsPage.testFailure||profileUpdateRegistrationPage.testFailure)
			{
				this.testFailure = true;
			}
		}
	}
}