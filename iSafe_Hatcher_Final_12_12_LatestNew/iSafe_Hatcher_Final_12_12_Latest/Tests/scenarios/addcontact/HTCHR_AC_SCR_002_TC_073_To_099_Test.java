package scenarios.addcontact;

import iSAFE.ApplicationKeywords;

import baseClass.BaseClass;

import pages.MainPage;
import pages.LoginPage;
import pages.PopupDialogWindows;
import pages.EmailReaderPage;
import pages.CreatePasswordPage;
import pages.RegistrationCompanyPage;
import pages.RegistrationFounderPage;
import pages.RegistrationInvestmentHistoryPage;
import pages.RegistrationVideoInterviewPage;
import pages.UserProfilePage;
import pages.HomePage;
import pages.CompanyProfilePage;
import pages.SettingsPage;
import pages.ProfileUpdateRegistrationPage;



public class HTCHR_AC_SCR_002_TC_073_To_099_Test extends ApplicationKeywords
{
	BaseClass obj;

	MainPage mainPage;
	LoginPage loginPage;
	PopupDialogWindows popupDialogWindows;
	EmailReaderPage emailReaderPage;
	CreatePasswordPage createPasswordPage;
	RegistrationCompanyPage registrationCompanyPage;
	RegistrationFounderPage registrationFounderPage;
	RegistrationInvestmentHistoryPage registrationInvestmentHistoryPage;
	RegistrationVideoInterviewPage registrationVideoInterviewPage;
	UserProfilePage userProfilePage;
	HomePage homePage;
	CompanyProfilePage companyProfilePage;
	SettingsPage settingsPage;
	ProfileUpdateRegistrationPage profileUpdateRegistrationPage;
	

	public HTCHR_AC_SCR_002_TC_073_To_099_Test(BaseClass obj) 
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
			emailReaderPage = new EmailReaderPage(obj);
			createPasswordPage = new CreatePasswordPage(obj);
			registrationCompanyPage = new RegistrationCompanyPage(obj);
			registrationFounderPage = new RegistrationFounderPage(obj);
			registrationInvestmentHistoryPage = new RegistrationInvestmentHistoryPage(obj);
			registrationVideoInterviewPage = new RegistrationVideoInterviewPage(obj);
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
			
			String emailServer = retrieve("emailServer");
			String emailId = retrieve("emailId");
			String emailPassword = retrieve("emailPassword");
			String emailSubject = retrieve("emailSubject");
			
			String newContactSalutation = retrieve("newContactSalutation");
			String tempVariable2 = generateRandomString();
			String newContactFirstNameData = retrieve("newContactFirstName");
			String newContactFirstName = newContactFirstNameData+tempVariable2;
			String tempVariable3 = generateRandomString();
			String newContactLastNameData = retrieve("newContactLastName");
			String newContactLastName = newContactLastNameData+tempVariable3;
			String newContactEmailAddress = retrieve("newContactEmailAddress");
			String newContactJobTitle = retrieve("newContactJobTitle");
			String newContactPhoneNumber = retrieve("newContactPhoneNumber");
			String newContactLinkedIn = retrieve("newContactLinkedIn");
			String newContactAboutPerson = retrieve("newContactAboutPerson");
			String newContactAddress = retrieve("newContactAddress");
			String newContactApartment = retrieve("newContactApartment");
			String newContactCity = retrieve("newContactCity");
			String newContactState = retrieve("newContactState");
			String newContactPostalCode = retrieve("newContactPostalCode");
			String newContactCountry = retrieve("newContactCountry");
			String newContactAccountType = retrieve("newContactAccountType");
			String newContactTypeOfBusiness = retrieve("newContactTypeOfBusiness");
			String newContactListingAddedby = "";
			String newContactSendInvite = retrieve("newContactSendInvite");
			String newContactSendInviteNo = "No";
			String newContactIndustry = retrieve("newContactIndustry");
			
			String newContactPassword = retrieve("newContactPassword");
			String newContactConfirmPassword = retrieve("newContactConfirmPassword");

			String tempVariable4 = generateRandomString();
			String companyLegalNameData = retrieve("companyLegalName");
			String companyLegalName = companyLegalNameData+tempVariable4;
			String companyWebsite = retrieve("companyWebsite");
			String companyCity = retrieve("companyCity");
			String companyCountry = retrieve("companyCountry");
			String companyDescription = retrieve("companyDescription");
			String tempVariable = getCurrentDateinYearMonthDateFormat();
			String companyIncorporationDate = tempVariable;
			String companyBusinessStatus = retrieve("companyBusinessStatus");
			String companyIndustries = retrieve("companyIndustries");
			String companyUNSDGs = retrieve("companyUNSDGs");

			String founderSalutation = retrieve("founderSalutation");
			String founderJobTitle = retrieve("founderJobTitle");
			String founderMobileNumber = retrieve("founderMobileNumber");
			String founderBio = retrieve("founderBio");
			String founderHighestEducation = retrieve("founderHighestEducation");
			String founderProffesionalQualifications = retrieve("founderProffesionalQualifications");

			String investmentCapitalAmount = retrieve("investmentCapitalAmount");
			String investmentCurrentInvestmentRound = retrieve("investmentCurrentInvestmentRound");
			String investmentCapitalExchangePercentage = retrieve("investmentCapitalExchangePercentage");
			String investmentFundingRounds = retrieve("investmentFundingRounds");
			
			String newContactInvalidPassword = retrieve("newContactInvalidPassword");
			String newContactConfirmInvalidPassword = retrieve("newContactConfirmInvalidPassword");
			
			String searchProfile = newContactFirstNameData;
			String profileNameFull = newContactLastName+" "+newContactFirstName;
			String profileNameFull2 = newContactFirstName+" "+newContactLastName;

			
			testStepPassed("");
			testStepPassed("Admin Mail Id : "+adminEmailId);
			testStepPassed("Admin Password : "+adminPassword);
			
			testStepPassed("");
			testStepPassed("Page Option : "+pageOption);

			testStepPassed("");
			testStepPassed("New Contact Salutation : "+newContactSalutation);
			testStepPassed("New Contact First Name : "+newContactFirstName);
			testStepPassed("New Contact Last Name : "+newContactLastName);
			testStepPassed("New Contact Email Address : "+newContactEmailAddress);
			testStepPassed("New Contact Job Title : "+newContactJobTitle);
			testStepPassed("New Contact Phone Number : "+newContactPhoneNumber);
			testStepPassed("New Contact LinkedIn : "+newContactLinkedIn);
			testStepPassed("New Contact About Person : "+newContactAboutPerson);
			testStepPassed("New Contact Address : "+newContactAddress);
			testStepPassed("New Contact Apartment : "+newContactApartment);
			testStepPassed("New Contact City : "+newContactCity);
			testStepPassed("New Contact State : "+newContactState);
			testStepPassed("New Contact Postal Code : "+newContactPostalCode);
			testStepPassed("New Contact Country : "+newContactCountry);
			testStepPassed("New Contact Account Type : "+newContactAccountType);
			testStepPassed("New Contact Type Of Business : "+newContactTypeOfBusiness);
			testStepPassed("New Contact Send Invite : "+newContactSendInvite);
			testStepPassed("New Contact Industry : "+newContactIndustry);

			testStepPassed("");
			testStepPassed("New Contact Password : "+newContactPassword);
			testStepPassed("New Contact Confirm Password : "+newContactConfirmPassword);
			
			testStepPassed("");
			testStepPassed("Company Legal Name : "+companyLegalName);
			testStepPassed("Company Website : "+companyWebsite);
			testStepPassed("Company City : "+companyCity);
			testStepPassed("Company Country : "+companyCountry);
			testStepPassed("CompanyDescription : "+companyDescription);
			testStepPassed("Company Incorporation Date : "+companyIncorporationDate);
			testStepPassed("Company Business Status : "+companyBusinessStatus);
			testStepPassed("Company Industries : "+companyIndustries);
			testStepPassed("Company UNSDGs : "+companyUNSDGs);

			testStepPassed("");
			testStepPassed("Founder Salutation : "+founderSalutation);
			testStepPassed("Founder Job Title : "+founderJobTitle);
			testStepPassed("Founder Mobile Number : "+founderMobileNumber);
			testStepPassed("Founder Bio : "+founderBio);
			testStepPassed("Founder Highest Education : "+founderHighestEducation);
			testStepPassed("Founder Proffesional Qualifications : "+founderProffesionalQualifications);

			testStepPassed("");
			testStepPassed("Investment Capital Amount : "+investmentCapitalAmount);
			testStepPassed("Investment Current Investment Round : "+investmentCurrentInvestmentRound);
			testStepPassed("Investment Capital Exchange Percentage : "+investmentCapitalExchangePercentage);
			testStepPassed("Investment Funding Rounds : "+investmentFundingRounds);

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
			
			settingsPage.verify_Users_DisplayedinApplication_DeleteUser(newContactEmailAddress);
			
			logoutFromApplication();

			mainPage.verify_MainPage_displayed();
			
			/**********Checking Mail Id all registered in App and if exists deleting the profile with that Mail Id**********/
			
			
			mainPage.click_login_button();

			loginPage.verify_LoginPage_displayed();

			loginPage.loginIntoApplication(adminEmailId, adminPassword);

			userProfilePage.verify_UserProfilePage_OppurtunitiesTab_displayed();
			
			
			click_AddContact_Actions_Menu();
			
			popupDialogWindows.verify_CreateContact_ModalDialog_Window_displayed();
			
			popupDialogWindows.select_Salutation_CreateContact_ModalDialog_Window(newContactSalutation);
			
			popupDialogWindows.enter_JobTitle_CreateContact_ModalDialog_Window(newContactJobTitle);
			popupDialogWindows.enter_PhoneNo_CreateContact_ModalDialog_Window(newContactPhoneNumber);
			popupDialogWindows.enter_LinkedIn_CreateContact_ModalDialog_Window(newContactLinkedIn);
			popupDialogWindows.enter_AboutPerson_CreateContact_ModalDialog_Window(newContactAboutPerson);
			popupDialogWindows.enter_Address_CreateContact_ModalDialog_Window(newContactAddress);
			popupDialogWindows.enter_Apartment_CreateContact_ModalDialog_Window(newContactApartment);
			popupDialogWindows.enter_City_CreateContact_ModalDialog_Window(newContactCity);
			popupDialogWindows.enter_State_CreateContact_ModalDialog_Window(newContactState);
			popupDialogWindows.enter_PostalCode_CreateContact_ModalDialog_Window(newContactPostalCode);
		
			popupDialogWindows.select_AccountType_CreateContact_ModalDialog_Window(newContactAccountType);
			popupDialogWindows.select_TypeOfBusiness_CreateContact_ModalDialog_Window(newContactTypeOfBusiness);
			
			popupDialogWindows.select_SendInvite_CreateContact_ModalDialog_Window(newContactSendInviteNo);
			popupDialogWindows.select_Industry_CreateContact_ModalDialog_Window(newContactIndustry);
			
			popupDialogWindows.verify_AddIndividual_Button_Disabled_CreateContact_ModalDialog_Window_displayed();
			
			popupDialogWindows.click_Close_CreateContact_ModalDialog_Window();
			
			
			logoutFromApplication();
			
			mainPage.verify_MainPage_displayed();
			
			mainPage.click_login_button();

			loginPage.verify_LoginPage_displayed();

			loginPage.loginIntoApplication(adminEmailId, adminPassword);

			userProfilePage.verify_UserProfilePage_OppurtunitiesTab_displayed();
			
			
			
			click_AddContact_Actions_Menu();
			
			popupDialogWindows.verify_CreateContact_ModalDialog_Window_displayed();
			
			popupDialogWindows.fillCreateNewContact(newContactSalutation, newContactFirstName, newContactLastName, newContactEmailAddress, newContactJobTitle, newContactPhoneNumber, newContactLinkedIn, newContactAboutPerson, newContactAddress, newContactApartment, newContactCity, newContactState, newContactPostalCode, newContactCountry, newContactAccountType,newContactTypeOfBusiness, newContactListingAddedby, newContactSendInvite, newContactIndustry);
			
			popupDialogWindows.click_AddIndividual_Button_CreateContact();
			
			userProfilePage.verify_UserProfilePage_ProfileTab_displayed();

			userProfilePage.verify_UserProfilePage_ProfileTab_displayed();
			
			userProfilePage.verify_CorrespondingUserProfilePage_displayed_by_ProfileName(profileNameFull2);

			logoutFromApplication();

			String addNewContactActivateUrl = emailReaderPage.getNewContactActivateURL(emailServer, emailId, emailPassword, emailSubject);

			driver.get(addNewContactActivateUrl);

			createPasswordPage.verify_CreatePassword_Page_displayed();
			
			createPasswordPage.verify_CreatePassword_elements_placeholderText_displayed();
			
					
			createPasswordPage.enter_Password(newContactInvalidPassword);
			
			createPasswordPage.verify_PasswordTextboxInSufficientErrorMessage_CreatePassword_displayed();
			
			createPasswordPage.enter_Password(newContactPassword);
			
			createPasswordPage.enter_ConfirmPassword(newContactConfirmInvalidPassword);
			
			createPasswordPage.verify_CreatePassword_PasswordIcon_functionality();
			
			createPasswordPage.verify_ConfirmPasswordTextboxNotMatchErrorMessage_CreatePassword_displayed();
			
			createPasswordPage.fillPasswordForm(newContactPassword, newContactConfirmPassword);
			
			createPasswordPage.click_CreatePassword_CreatePasswordPage();

			registrationCompanyPage.verify_Registration_Company_displayed();

			registrationCompanyPage.fillCompanyInformation(companyLegalName, companyWebsite, companyCity, companyCountry, companyDescription, companyIncorporationDate, companyBusinessStatus, companyIndustries, companyUNSDGs);

			registrationCompanyPage.click_Next_CompanyInformation();

			registrationFounderPage.verify_Registration_Founder_displayed();

			registrationFounderPage.fillFounderInformation(founderSalutation, founderJobTitle, founderMobileNumber, founderBio, founderHighestEducation, founderProffesionalQualifications);

			registrationFounderPage.click_Next_FounderInformation();

			registrationInvestmentHistoryPage.verify_Registration_InvestmentHistory_displayed();

			registrationInvestmentHistoryPage.fillInvestmentInformation(investmentCapitalAmount, investmentCurrentInvestmentRound, investmentCapitalExchangePercentage, investmentFundingRounds);

			registrationInvestmentHistoryPage.click_Next_InvestmentHistory();

			registrationVideoInterviewPage.verify_Registration_VideoInterview_displayed();

			registrationVideoInterviewPage.skipVideoInterview();
			
			profileUpdateRegistrationPage.verify_ProfileUpdateRegistration_Page_displayed();
			
			profileUpdateRegistrationPage.get_InvestorandAccelerator_List();
						
			profileUpdateRegistrationPage.click_UpdateYourProfile_button();
			
			companyProfilePage.verify_CompanyProfilePage_displayed();
			
			companyProfilePage.verify_ProfileTab_CompanyProfilePage_displayed();
			
			companyProfilePage.verify_CorrespondingCompanyProfilePage_displayed_by_CompanyName(companyLegalName);
			
			logoutFromApplication();
				
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
			if(this.testFailure||this.obj.testFailure||mainPage.testFailure||loginPage.testFailure||popupDialogWindows.testFailure||emailReaderPage.testFailure||createPasswordPage.testFailure||registrationCompanyPage.testFailure||registrationFounderPage.testFailure||registrationInvestmentHistoryPage.testFailure||registrationVideoInterviewPage.testFailure||userProfilePage.testFailure||homePage.testFailure||companyProfilePage.testFailure||settingsPage.testFailure||profileUpdateRegistrationPage.testFailure)
			{
				this.testFailure = true;
			}
		}
	}
}