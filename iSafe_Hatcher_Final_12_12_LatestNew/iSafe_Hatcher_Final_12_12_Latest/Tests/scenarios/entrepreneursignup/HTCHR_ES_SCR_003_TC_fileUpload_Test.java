package scenarios.entrepreneursignup;

import iSAFE.ApplicationKeywords;

import org.openqa.selenium.By;
import baseClass.BaseClass;

import pages.MainPage;
import pages.RegistrationPage;
import pages.EmailSentConfirmationPage;
import pages.EmailReaderPage;
import pages.RegistrationCompanyPage;
import pages.RegistrationFounderPage;
import pages.LoginPage;
import pages.UserProfilePage;
import pages.HomePage;
import pages.SettingsPage;


public class HTCHR_ES_SCR_003_TC_fileUpload_Test extends ApplicationKeywords
{
	private Boolean status = false;

	BaseClass obj;

	MainPage mainPage;
	RegistrationPage registrationPage;
	EmailSentConfirmationPage emailSentConfirmationPage;
	EmailReaderPage emailReaderPage;
	RegistrationCompanyPage registrationCompanyPage;
	RegistrationFounderPage registrationFounderPage;
	LoginPage loginPage;
	UserProfilePage userProfilePage;
	HomePage homePage;
	SettingsPage settingsPage;

	public HTCHR_ES_SCR_003_TC_fileUpload_Test(BaseClass obj) 
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
			loginPage = new LoginPage(obj);
			userProfilePage = new UserProfilePage(obj);
			homePage = new HomePage(obj);
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

			String tempVariable4 = generateRandomString();
			String legalNameData2 = retrieve("legalName");
			String legalName2 = legalNameData2+tempVariable4;

			String tempVariable5 = generateRandomString();
			String legalNameData3 = retrieve("legalName");
			String legalName3 = legalNameData3+tempVariable5;

			String tempVariable6 = generateRandomString();
			String legalNameData4 = retrieve("legalName");
			String legalName4 = legalNameData4+tempVariable6;

			String website = retrieve("website");
			String city = retrieve("city");
			String country = retrieve("country");
			String companyDescription = retrieve("companyDescription");
			String tempVariable = getCurrentDateinYearMonthDateFormat();
			String incorporationDate = tempVariable;
			String businessStatus = retrieve("businessStatus");
			String industries = retrieve("industries");
			String UNSDGs = retrieve("UNSDGs");

			String legalNameSpecialCharacters = generateRandomSpecialCharacterString();
			String countrySpecialCharacters = generateRandomSpecialCharacterString();
			String businessStatusSpecialCharacters = generateRandomSpecialCharacterString();
			String industriesStatusSpecialCharacters = generateRandomSpecialCharacterString();
			String UNSDGsSpecialCharacters = generateRandomSpecialCharacterString();
			String websiteSpecialCharacters = retrieve("websiteSpecialCharacters");
			String companyDescriptionSpecialCharacters = retrieve("companyDescriptionSpecialCharacters");
			String citySpecialCharacters = retrieve("citySpecialCharacters");
			String companyDescriptionSpaceSpecialCharacters = retrieve("companyDescriptionSpaceSpecialCharacters");
			String companyDescriptionLessThan100Characters = retrieve("companyDescriptionLessThan100Characters");
			String companyDescription100Characters = retrieve("companyDescription100Characters");
			String UNSDGs1 = retrieve("UNSDGs1");
			String UNSDGs2 = retrieve("UNSDGs2");
			String UNSDGs3 = retrieve("UNSDGs3");
			String filename_PNG = retrieve("filename_png");
			String filename_JPEG = retrieve("filename_jpeg");

			String legalNameAlreadyExists = retrieve("legalNameAlreadyExists");

			String searchProfile = firstName;
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
			testStepPassed("Legal Name Special Characters : "+legalNameSpecialCharacters);
			testStepPassed("Website Special Characters : "+websiteSpecialCharacters);
			testStepPassed("Company Description Special Characters : "+companyDescriptionSpecialCharacters);
			testStepPassed("Company Description Special Characters : "+citySpecialCharacters);
			testStepPassed("Company Description Space Special Characters : "+companyDescriptionSpaceSpecialCharacters);
			testStepPassed("Company Description Less Than 100 Characters : "+companyDescriptionLessThan100Characters);
			testStepPassed("Company Description 100 Characters : "+companyDescription100Characters);
			testStepPassed("UNSDGs 1 : "+UNSDGs1);
			testStepPassed("UNSDGs 2 : "+UNSDGs2);
			testStepPassed("UNSDGs 3 : "+UNSDGs3);
			testStepPassed("Legal Name Already Exists : "+legalNameAlreadyExists);

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

			click_Settings_Fixed_SideBar_HamburgerMenu();

			settingsPage.clickOnSettings();

			settingsPage.verify_SettingsPage_displayed();

			settingsPage.select_Pages_dropdown(pageOption);

			settingsPage.verify_SettingsPage_UserPage_UsersTab_displayed();

			settingsPage.click_SettingsPage_UserPage_UsersTab();

			settingsPage.verify_SettingsPage_UserPage_UsersTab_Section_displayed();

			settingsPage.verify_Users_DisplayedinApplication_DeleteUser(emailAddress);

			logoutFromApplication();

			/**********Checking Mail Id all registered in App and if exists deleting the profile with that Mail Id**********/

			mainPage.verify_MainPage_displayed();			
			mainPage.click_FindInvestors_QuickLink();
			registrationPage.verify_SignUpPage_displayed();
			registrationPage.fillSignUpForm(firstName, lastName, emailAddress, password);
			registrationPage.submitSignUpForm();
			emailSentConfirmationPage.verify_InvestorResigtrationEmailSentConfirmPage_displayed();

			String investorActivateUrl = emailReaderPage.getInvestorAccountActivateURL(emailServer, emailId, emailPassword, emailSubject);
			driver.get(investorActivateUrl);

			//HTCHR_ES_SCR_002_TC_062
			testStepInfo("HTCHR_ES_SCR_002_TC_062,63  -->"+"Verify the company page UI gets landed successfully");
			registrationCompanyPage.verify_Registration_Company_displayed();

			//HTCHR_ES_SCR_002_TC_064,65 - Not Feasible 
			//HTCHR_ES_SCR_002_TC_066
			testStepInfo("HTCHR_ES_SCR_002_TC_066,089 -->"+"Verify the spellcheck for all individual label name, place holder text, tool tip, dropdown values, hyperlink and buttons");
			registrationCompanyPage.verify_Registration_CompanyPage_ElementsAndLabels_displayed();
		
			registrationCompanyPage.clear_CompanyPage_Form();

			registrationCompanyPage.verify_Registration_CompanyPage_Elements_PlaceHolderText_displayed();
			//HTCHR_ES_SCR_002_TC_071
			testStepInfo("HTCHR_ES_SCR_002_TC_133  -->"+"Cap table: Verify the user can select multiple attachments from file explorer");
			registrationCompanyPage.fillMandatoryCompanyInformation(legalName, website, companyDescription);
		
			registrationCompanyPage.upload(filename_PNG,filename_JPEG);
			logoutFromApplication();

			mainPage.verify_MainPage_displayed();

	


			/**********Deleting User Profile from App**********/

			mainPage.verify_MainPage_displayed();

			mainPage.click_login_button();

			loginPage.verify_LoginPage_displayed();

			loginPage.loginIntoApplication(adminEmailId, adminPassword);

			userProfilePage.verify_UserProfilePage_OppurtunitiesTab_displayed();

			search_ValuesinSearchBar(searchProfile);

			verify_Searched_UserProfile_displayed_and_Open_UserProfilePage(profileNameFull);

			userProfilePage.verify_UserProfilePage_displayed();

			userProfilePage.verify_UserProfilePage_ProfileTab_displayed();

			userProfilePage.verify_CorrespondingUserProfilePage_displayed_by_ProfileName(profileNameFull2);

			userProfilePage.deleteUserProfile();

			verify_User_Profile_Account_Deleted_Successfully();

			homePage.verify_HomePage_displayed();

			logoutFromApplication();

			mainPage.verify_MainPage_displayed();

			/**********Deleting User Profile from App**********/


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
			if(this.testFailure||this.obj.testFailure||mainPage.testFailure||registrationPage.testFailure||emailSentConfirmationPage.testFailure||emailReaderPage.testFailure||registrationCompanyPage.testFailure||registrationFounderPage.testFailure||loginPage.testFailure||userProfilePage.testFailure||homePage.testFailure||settingsPage.testFailure)
			{
				this.testFailure = true;
			}
		}
	}
}