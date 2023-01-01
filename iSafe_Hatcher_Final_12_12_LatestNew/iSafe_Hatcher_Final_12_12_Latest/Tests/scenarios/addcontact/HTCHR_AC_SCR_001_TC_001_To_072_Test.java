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

public class HTCHR_AC_SCR_001_TC_001_To_072_Test extends ApplicationKeywords
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
	
	
	public HTCHR_AC_SCR_001_TC_001_To_072_Test(BaseClass obj) 
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
			
			String newContactSalutation = retrieve("newContactSalutation");
			String newContactFirstName = retrieve("newContactFirstName");
			String newContactLastName = retrieve("newContactLastName");
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
			String newContactInvalidIndustry = retrieve("newContactInvalidIndustry");
			
			
			String firstName100Characters = generateRandomString(100);
			String lastName100Characters = generateRandomString(100);
			String jobTitle255Characters = generateRandomString(255);
			String linkedIn128Characters = generateRandomString(128);
			String address256Characters = generateRandomString(256);
			String apartment128Characters = generateRandomString(128);
			String city128Characters = generateRandomString(128);
			String state128Characters = generateRandomString(128);
			String postalCode16Characters = generateRandomNumbersasString(16);
			
			String firstNameSpecialCharacters = generateRandomSpecialCharacterString();
			String lastNameSpecialCharacters = generateRandomSpecialCharacterString();
			
						
			String randomEmailAddress1 = generateRandomEmailAddress();
			String randomEmailAddress2 = generateRandomEmailAddress();
			String randomEmailAddress3 = generateRandomEmailAddress();
			String randomEmailAddress4 = generateRandomEmailAddress();
			String randomEmailAddress5 = generateRandomEmailAddress();
			String randomEmailAddress6 = generateRandomEmailAddress();
			String randomEmailAddress7 = generateRandomEmailAddress();
			String randomEmailAddress8 = generateRandomEmailAddress();
			String randomEmailAddress9 = generateRandomEmailAddress();
			String randomEmailAddress10 = generateRandomEmailAddress();
			
			String newContactEmptyFirstName = "";
			String newContactEmptyLastName = "";
			String newContactEmptyEmailAddress = "";
			String newContactEmptyCountry = "";
			
			testStepPassed("");
			testStepPassed("Admin Mail Id : "+adminEmailId);
			testStepPassed("Admin Password : "+adminPassword);
			
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
			testStepPassed("First Name 100 Characters : "+firstName100Characters);
			testStepPassed("Last Name 100 Characters : "+lastName100Characters);
			testStepPassed("Job Title 255 Characters : "+jobTitle255Characters);
			testStepPassed("LinkedIn 128 Characters : "+linkedIn128Characters);
			testStepPassed("Address 256 Characters : "+address256Characters);
			testStepPassed("Apartment 128 Characters : "+apartment128Characters);
			testStepPassed("City 128 Characters : "+city128Characters);
			testStepPassed("State 128 Characters : "+state128Characters);
			testStepPassed("Postal Code 16 Characters : "+postalCode16Characters);
			testStepPassed("Random Email Address 1 : "+randomEmailAddress1);
			testStepPassed("Random Email Address 2 : "+randomEmailAddress2);
			testStepPassed("Random Email Address 3 : "+randomEmailAddress3);
			testStepPassed("Random Email Address 4 : "+randomEmailAddress4);
			testStepPassed("Random Email Address 5 : "+randomEmailAddress5);
			testStepPassed("Random Email Address 6 : "+randomEmailAddress6);
			testStepPassed("Random Email Address 7 : "+randomEmailAddress7);
			testStepPassed("Random Email Address 8 : "+randomEmailAddress8);
			testStepPassed("Random Email Address 9 : "+randomEmailAddress9);
			testStepPassed("Random Email Address 10 : "+randomEmailAddress10);
						
			testStepInfo("");
			testStepInfo("************************************");
			testStepInfo("Execution Steps Started");
			testStepInfo("************************************");
			testStepInfo("");

			clearCookies();

			openApplicationMainPageByHittingURL();
						
			mainPage.click_login_button();

			loginPage.verify_LoginPage_displayed();

			loginPage.loginIntoApplication(adminEmailId, adminPassword);

			userProfilePage.verify_UserProfilePage_OppurtunitiesTab_displayed();
			
			click_AddContact_Actions_Menu();
			
			popupDialogWindows.verify_CreateContact_ModalDialog_Window_displayed();
			
			popupDialogWindows.verify_CreateContact_elements_placeholderText_displayed();
			
			popupDialogWindows.verify_CreateContact_elements_MandatorySymbol_displayed();
			
			String salutationValue = popupDialogWindows.get_CreateContact_Salutation_Value();
			
			try 
			{
				if (salutationValue.equalsIgnoreCase("Mr")) 
				{
					testStepPassed("Mr value is selected and default value in Salutation dropdown is displayed in Add Contact Dialog Window");
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Mr value is not selected and default value in Salutation dropdown is displayed in Add Contact Dialog Window");
			}
			
						
			testStepPassed("");
			
			testStepPassed("First Name 100 Characters");
			
			testStepPassed("*******************************");
			
			popupDialogWindows.fillCreateNewContact(newContactSalutation, firstName100Characters, newContactLastName, randomEmailAddress1, newContactJobTitle, newContactPhoneNumber, newContactLinkedIn, newContactAboutPerson, newContactAddress, newContactApartment, newContactCity, newContactState, newContactPostalCode, newContactCountry, newContactAccountType,newContactTypeOfBusiness, newContactListingAddedby, newContactSendInviteNo, newContactIndustry);
			
			popupDialogWindows.click_AddIndividual_Button_CreateContact();
			
			userProfilePage.verify_UserProfilePage_ProfileTab_displayed();

			userProfilePage.deleteUserProfile();
			
			verify_User_Profile_Account_Deleted_Successfully();
			
			homePage.verify_HomePage_displayed();
			
						
			testStepPassed("");
			
			testStepPassed("Last Name 100 Characters");
			
			testStepPassed("*******************************");
			
			click_AddContact_Actions_Menu();
			
			popupDialogWindows.verify_CreateContact_ModalDialog_Window_displayed();

			popupDialogWindows.fillCreateNewContact(newContactSalutation, newContactFirstName, lastName100Characters, randomEmailAddress1, newContactJobTitle, newContactPhoneNumber, newContactLinkedIn, newContactAboutPerson, newContactAddress, newContactApartment, newContactCity, newContactState, newContactPostalCode, newContactCountry, newContactAccountType,newContactTypeOfBusiness, newContactListingAddedby, newContactSendInviteNo, newContactIndustry);
			
			popupDialogWindows.click_AddIndividual_Button_CreateContact();
			
			userProfilePage.verify_UserProfilePage_ProfileTab_displayed();

			userProfilePage.deleteUserProfile();
			
			verify_User_Profile_Account_Deleted_Successfully();
			
			homePage.verify_HomePage_displayed();
			
			
			testStepPassed("");
			
			testStepPassed("Job Title 255 Characters");
			
			testStepPassed("*******************************");
			
			click_AddContact_Actions_Menu();
			
			popupDialogWindows.verify_CreateContact_ModalDialog_Window_displayed();

			popupDialogWindows.fillCreateNewContact(newContactSalutation, newContactFirstName, newContactLastName, randomEmailAddress1, jobTitle255Characters, newContactPhoneNumber, newContactLinkedIn, newContactAboutPerson, newContactAddress, newContactApartment, newContactCity, newContactState, newContactPostalCode, newContactCountry, newContactAccountType,newContactTypeOfBusiness, newContactListingAddedby, newContactSendInviteNo, newContactIndustry);
			
			popupDialogWindows.click_AddIndividual_Button_CreateContact();
			
			userProfilePage.verify_UserProfilePage_ProfileTab_displayed();

			userProfilePage.deleteUserProfile();
			
			verify_User_Profile_Account_Deleted_Successfully();
			
			homePage.verify_HomePage_displayed();
			
			
			testStepPassed("");
			
			testStepPassed("LinkedIn 128 Characters");
			
			testStepPassed("*******************************");
			
			click_AddContact_Actions_Menu();
			
			popupDialogWindows.verify_CreateContact_ModalDialog_Window_displayed();

			popupDialogWindows.fillCreateNewContact(newContactSalutation, newContactFirstName, newContactLastName, randomEmailAddress1, newContactJobTitle, newContactPhoneNumber, linkedIn128Characters, newContactAboutPerson, newContactAddress, newContactApartment, newContactCity, newContactState, newContactPostalCode, newContactCountry, newContactAccountType,newContactTypeOfBusiness, newContactListingAddedby, newContactSendInviteNo, newContactIndustry);
			
			popupDialogWindows.click_AddIndividual_Button_CreateContact();
			
			userProfilePage.verify_UserProfilePage_ProfileTab_displayed();

			userProfilePage.deleteUserProfile();
			
			verify_User_Profile_Account_Deleted_Successfully();
			
			homePage.verify_HomePage_displayed();

						
			testStepPassed("");
			
			testStepPassed("Address 256 Characters");
			
			testStepPassed("*******************************");
			
			click_AddContact_Actions_Menu();
			
			popupDialogWindows.verify_CreateContact_ModalDialog_Window_displayed();

			popupDialogWindows.fillCreateNewContact(newContactSalutation, newContactFirstName, newContactLastName, randomEmailAddress1, newContactJobTitle, newContactPhoneNumber, newContactLinkedIn, newContactAboutPerson, address256Characters, newContactApartment, newContactCity, newContactState, newContactPostalCode, newContactCountry, newContactAccountType,newContactTypeOfBusiness, newContactListingAddedby, newContactSendInviteNo, newContactIndustry);
			
			popupDialogWindows.click_AddIndividual_Button_CreateContact();
			
			userProfilePage.verify_UserProfilePage_ProfileTab_displayed();

			userProfilePage.deleteUserProfile();
			
			verify_User_Profile_Account_Deleted_Successfully();
			
			homePage.verify_HomePage_displayed();

						
			testStepPassed("");
			
			testStepPassed("Apartment 128 Characters");
			
			testStepPassed("*******************************");
			
			click_AddContact_Actions_Menu();
			
			popupDialogWindows.verify_CreateContact_ModalDialog_Window_displayed();

			popupDialogWindows.fillCreateNewContact(newContactSalutation, newContactFirstName, newContactLastName, randomEmailAddress1, newContactJobTitle, newContactPhoneNumber, newContactLinkedIn, newContactAboutPerson, newContactAddress, apartment128Characters, newContactCity, newContactState, newContactPostalCode, newContactCountry, newContactAccountType,newContactTypeOfBusiness, newContactListingAddedby, newContactSendInviteNo, newContactIndustry);
			
			popupDialogWindows.click_AddIndividual_Button_CreateContact();
			
			userProfilePage.verify_UserProfilePage_ProfileTab_displayed();

			userProfilePage.deleteUserProfile();
			
			verify_User_Profile_Account_Deleted_Successfully();
			
			homePage.verify_HomePage_displayed();
			
						
			testStepPassed("");
			
			testStepPassed("City 128 Characters");
			
			testStepPassed("*******************************");
			
			click_AddContact_Actions_Menu();
			
			popupDialogWindows.verify_CreateContact_ModalDialog_Window_displayed();

			popupDialogWindows.fillCreateNewContact(newContactSalutation, newContactFirstName, newContactLastName, randomEmailAddress1, newContactJobTitle, newContactPhoneNumber, newContactLinkedIn, newContactAboutPerson, newContactAddress, newContactApartment, city128Characters, newContactState, newContactPostalCode, newContactCountry, newContactAccountType,newContactTypeOfBusiness, newContactListingAddedby, newContactSendInviteNo, newContactIndustry);
			
			popupDialogWindows.click_AddIndividual_Button_CreateContact();
			
			userProfilePage.verify_UserProfilePage_ProfileTab_displayed();

			userProfilePage.deleteUserProfile();
			
			verify_User_Profile_Account_Deleted_Successfully();
			
			homePage.verify_HomePage_displayed();

					
			testStepPassed("");
			
			testStepPassed("State 128 Characters");
			
			testStepPassed("*******************************");
			
			click_AddContact_Actions_Menu();
			
			popupDialogWindows.verify_CreateContact_ModalDialog_Window_displayed();

			popupDialogWindows.fillCreateNewContact(newContactSalutation, newContactFirstName, newContactLastName, randomEmailAddress1, newContactJobTitle, newContactPhoneNumber, newContactLinkedIn, newContactAboutPerson, newContactAddress, newContactApartment, newContactCity, state128Characters, newContactPostalCode, newContactCountry, newContactAccountType,newContactTypeOfBusiness, newContactListingAddedby, newContactSendInviteNo, newContactIndustry);
			
			popupDialogWindows.click_AddIndividual_Button_CreateContact();
			
			userProfilePage.verify_UserProfilePage_ProfileTab_displayed();

			userProfilePage.deleteUserProfile();
			
			verify_User_Profile_Account_Deleted_Successfully();
			
			homePage.verify_HomePage_displayed();

						
			testStepPassed("");
			
			testStepPassed("Postal Code 16 Characters");
			
			testStepPassed("*******************************");
			
			click_AddContact_Actions_Menu();
			
			popupDialogWindows.verify_CreateContact_ModalDialog_Window_displayed();

			popupDialogWindows.fillCreateNewContact(newContactSalutation, newContactFirstName, newContactLastName, randomEmailAddress1, newContactJobTitle, newContactPhoneNumber, newContactLinkedIn, newContactAboutPerson, newContactAddress, newContactApartment, newContactCity, newContactState, postalCode16Characters, newContactCountry, newContactAccountType,newContactTypeOfBusiness, newContactListingAddedby, newContactSendInviteNo, newContactIndustry);
			
			popupDialogWindows.click_AddIndividual_Button_CreateContact();
			
			userProfilePage.verify_UserProfilePage_ProfileTab_displayed();

			userProfilePage.deleteUserProfile();
			
			verify_User_Profile_Account_Deleted_Successfully();
			
			homePage.verify_HomePage_displayed();

						
			testStepPassed("");
			
			testStepPassed("Invalid Industry");
			
			testStepPassed("*******************************");
			
			click_AddContact_Actions_Menu();
			
			popupDialogWindows.verify_CreateContact_ModalDialog_Window_displayed();

			popupDialogWindows.fillCreateNewContact(newContactSalutation, newContactFirstName, newContactLastName, randomEmailAddress1, newContactJobTitle, newContactPhoneNumber, newContactLinkedIn, newContactAboutPerson, newContactAddress, newContactApartment, newContactCity, newContactState, newContactPostalCode, newContactCountry, newContactAccountType,newContactTypeOfBusiness, newContactListingAddedby, newContactSendInviteNo, newContactInvalidIndustry);
			
			popupDialogWindows.verify_InvalidIndustry_Message_CreateContact_ModalDialog_Window_displayed();
						
			popupDialogWindows.click_Close_CreateContact_ModalDialog_Window();
			
			
			logoutFromApplication();
			
			mainPage.verify_MainPage_displayed();
			
			mainPage.click_login_button();

			loginPage.verify_LoginPage_displayed();

			loginPage.loginIntoApplication(adminEmailId, adminPassword);

			userProfilePage.verify_UserProfilePage_OppurtunitiesTab_displayed();
			
						
			testStepPassed("");
			
			testStepPassed("Empty First Name");
			
			testStepPassed("*******************************");
			
			click_AddContact_Actions_Menu();
			
			popupDialogWindows.verify_CreateContact_ModalDialog_Window_displayed();

			popupDialogWindows.fillCreateNewContact(newContactSalutation, newContactEmptyFirstName, newContactLastName, randomEmailAddress1, newContactJobTitle, newContactPhoneNumber, newContactLinkedIn, newContactAboutPerson, newContactAddress, newContactApartment, newContactCity, newContactState, newContactPostalCode, newContactCountry, newContactAccountType,newContactTypeOfBusiness, newContactListingAddedby, newContactSendInviteNo, newContactInvalidIndustry);

			popupDialogWindows.verify_AddIndividual_Button_Disabled_CreateContact_ModalDialog_Window_displayed();
			
			popupDialogWindows.click_Close_CreateContact_ModalDialog_Window();
			
			
			
			logoutFromApplication();
			
			mainPage.verify_MainPage_displayed();
			
			mainPage.click_login_button();

			loginPage.verify_LoginPage_displayed();

			loginPage.loginIntoApplication(adminEmailId, adminPassword);

			userProfilePage.verify_UserProfilePage_OppurtunitiesTab_displayed();

			
			
			testStepPassed("");
			
			testStepPassed("Empty Last Name");
			
			testStepPassed("*******************************");
			
			click_AddContact_Actions_Menu();
			
			popupDialogWindows.verify_CreateContact_ModalDialog_Window_displayed();

			popupDialogWindows.fillCreateNewContact(newContactSalutation, newContactFirstName, newContactEmptyLastName, randomEmailAddress1, newContactJobTitle, newContactPhoneNumber, newContactLinkedIn, newContactAboutPerson, newContactAddress, newContactApartment, newContactCity, newContactState, newContactPostalCode, newContactCountry, newContactAccountType,newContactTypeOfBusiness, newContactListingAddedby, newContactSendInviteNo, newContactInvalidIndustry);

			popupDialogWindows.verify_AddIndividual_Button_Disabled_CreateContact_ModalDialog_Window_displayed();
			
			popupDialogWindows.click_Close_CreateContact_ModalDialog_Window();

			
			
			logoutFromApplication();
			
			mainPage.verify_MainPage_displayed();
			
			mainPage.click_login_button();

			loginPage.verify_LoginPage_displayed();

			loginPage.loginIntoApplication(adminEmailId, adminPassword);

			userProfilePage.verify_UserProfilePage_OppurtunitiesTab_displayed();

			
			
			testStepPassed("");
			
			testStepPassed("Empty Email Addess");
			
			testStepPassed("*******************************");
			
			click_AddContact_Actions_Menu();
			
			popupDialogWindows.verify_CreateContact_ModalDialog_Window_displayed();

			popupDialogWindows.fillCreateNewContact(newContactSalutation, newContactFirstName, newContactLastName, newContactEmptyEmailAddress, newContactJobTitle, newContactPhoneNumber, newContactLinkedIn, newContactAboutPerson, newContactAddress, newContactApartment, newContactCity, newContactState, newContactPostalCode, newContactCountry, newContactAccountType,newContactTypeOfBusiness, newContactListingAddedby, newContactSendInviteNo, newContactInvalidIndustry);

			popupDialogWindows.verify_AddIndividual_Button_Disabled_CreateContact_ModalDialog_Window_displayed();
			
			popupDialogWindows.click_Close_CreateContact_ModalDialog_Window();

			
			
			logoutFromApplication();
			
			mainPage.verify_MainPage_displayed();
			
			mainPage.click_login_button();

			loginPage.verify_LoginPage_displayed();

			loginPage.loginIntoApplication(adminEmailId, adminPassword);

			userProfilePage.verify_UserProfilePage_OppurtunitiesTab_displayed();
		
			
			testStepPassed("");
			
			testStepPassed("First Name Special Characters");
			
			testStepPassed("***********************************************");
			
			click_AddContact_Actions_Menu();
			
			popupDialogWindows.verify_CreateContact_ModalDialog_Window_displayed();

			popupDialogWindows.fillCreateNewContact(newContactSalutation, firstNameSpecialCharacters, newContactLastName, randomEmailAddress1, newContactJobTitle, newContactPhoneNumber, newContactLinkedIn, newContactAboutPerson, newContactAddress, newContactApartment, newContactCity, newContactState, newContactPostalCode, newContactCountry, newContactAccountType,newContactTypeOfBusiness, newContactListingAddedby, newContactSendInviteNo, newContactIndustry);
			
			popupDialogWindows.click_AddIndividual_Button_CreateContact();
			
			userProfilePage.verify_UserProfilePage_ProfileTab_displayed();

			userProfilePage.deleteUserProfile();
			
			verify_User_Profile_Account_Deleted_Successfully();
			
			homePage.verify_HomePage_displayed();
			
			
			
			logoutFromApplication();
			
			mainPage.verify_MainPage_displayed();
			
			mainPage.click_login_button();

			loginPage.verify_LoginPage_displayed();

			loginPage.loginIntoApplication(adminEmailId, adminPassword);

			userProfilePage.verify_UserProfilePage_OppurtunitiesTab_displayed();

			
			
			testStepPassed("");
			
			testStepPassed("Last Name Special Characters");
			
			testStepPassed("***********************************************");
			
			click_AddContact_Actions_Menu();
			
			popupDialogWindows.verify_CreateContact_ModalDialog_Window_displayed();

			popupDialogWindows.fillCreateNewContact(newContactSalutation, newContactFirstName, lastNameSpecialCharacters, randomEmailAddress1, newContactJobTitle, newContactPhoneNumber, newContactLinkedIn, newContactAboutPerson, newContactAddress, newContactApartment, newContactCity, newContactState, newContactPostalCode, newContactCountry, newContactAccountType,newContactTypeOfBusiness, newContactListingAddedby, newContactSendInviteNo, newContactIndustry);
			
			popupDialogWindows.click_AddIndividual_Button_CreateContact();
			
			userProfilePage.verify_UserProfilePage_ProfileTab_displayed();

			userProfilePage.deleteUserProfile();
			
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
			if(this.testFailure||this.obj.testFailure||mainPage.testFailure||loginPage.testFailure||popupDialogWindows.testFailure||emailReaderPage.testFailure||createPasswordPage.testFailure||registrationCompanyPage.testFailure||registrationFounderPage.testFailure||registrationInvestmentHistoryPage.testFailure||registrationVideoInterviewPage.testFailure||userProfilePage.testFailure||homePage.testFailure||companyProfilePage.testFailure||settingsPage.testFailure||profileUpdateRegistrationPage.testFailure)
			{
				this.testFailure = true;
			}
		}
	}
}