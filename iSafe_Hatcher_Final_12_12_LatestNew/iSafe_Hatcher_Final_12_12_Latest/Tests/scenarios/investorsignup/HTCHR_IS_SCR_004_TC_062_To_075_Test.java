package scenarios.investorsignup;

import iSAFE.ApplicationKeywords;


import baseClass.BaseClass;

import pages.MainPage;
import pages.RegistrationPage;
import pages.RegistrationCompanyPage;
import pages.EmailSentConfirmationPage;
import pages.EmailReaderPage;
import pages.LoginPage;
import pages.UserProfilePage;
import pages.HomePage;
import pages.SettingsPage;
import pages.RegistrationInvestorDetailsPage;


public class HTCHR_IS_SCR_004_TC_062_To_075_Test extends ApplicationKeywords
{
	private Boolean status = false;

	BaseClass obj;

	MainPage mainPage;
	RegistrationPage registrationPage;
	EmailSentConfirmationPage emailSentConfirmationPage;
	EmailReaderPage emailReaderPage;
	LoginPage loginPage;
	UserProfilePage userProfilePage;
	HomePage homePage;
	SettingsPage settingsPage;
	RegistrationCompanyPage registrationCompanyPage;
	RegistrationInvestorDetailsPage registrationInvestorDetailsPage;

	public HTCHR_IS_SCR_004_TC_062_To_075_Test(BaseClass obj) 
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
			loginPage = new LoginPage(obj);
			userProfilePage = new UserProfilePage(obj);
			homePage = new HomePage(obj);
			settingsPage = new SettingsPage(obj);
			registrationCompanyPage = new RegistrationCompanyPage(obj);
			registrationInvestorDetailsPage = new RegistrationInvestorDetailsPage(obj);


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

			String legalNameSpecialCharacters = generateRandomSpecialCharacterString();
			String websiteSpecialCharacters = retrieve("websiteSpecialCharacters");
			String citySpecialCharacters = retrieve("citySpecialCharacters");
			String countrySpecialCharacters = retrieve("countrySpecialCharacters");
			String legalNameAlreadyExists = retrieve("legalNameAlreadyExists");
			String searchProfile = firstName;
			String profileNameFull = lastName+" "+firstName;
			String profileNameFull2 = firstName+" "+lastName;
			String legalNameSpaceSpecialCharacters = retrieve("legalNameSpaceSpecialCharacters");
			String websiteSpaceSpecialCharacters = retrieve("websiteSpaceSpecialCharacters");

			testStepInfo("");
			testStepInfo("Admin Mail Id : "+adminEmailId);
			testStepInfo("Admin Password : "+adminPassword);

			testStepInfo("");
			testStepInfo("Page Option : "+pageOption);

			testStepInfo("");
			testStepInfo("Firstname : "+firstName);
			testStepInfo("LastName : "+lastName);
			testStepInfo("Email Address : "+emailAddress);
			testStepInfo("Password : "+password);

			testStepInfo("");
			testStepInfo("Email Server : "+emailServer);
			testStepInfo("Email Id : "+emailId);
			testStepInfo("Email Password : "+emailPassword);
			testStepInfo("Email Subject : "+emailSubject);

			testStepInfo("");
			testStepInfo("Legal Name : "+legalName);
			testStepInfo("Legal Name 2 : "+legalName2);
			testStepInfo("Legal Name 3 : "+legalName3);
			testStepInfo("Legal Name 4 : "+legalName4);
			testStepInfo("Website : "+website);
			testStepInfo("City : "+city);
			testStepInfo("Country : "+country);

			testStepInfo("");
			testStepInfo("Legal Name Special Characters : "+legalNameSpecialCharacters);
			testStepInfo("Website Special Characters : "+websiteSpecialCharacters);
			testStepInfo("City Special Characters : "+citySpecialCharacters);
			testStepInfo("Country Special Characters : "+countrySpecialCharacters);
			testStepInfo("Legal Name Already Exists : "+legalNameAlreadyExists);

			testStepInfo("");
			testStepInfo("Search Profile : "+searchProfile);
			testStepInfo("Profile Name Full : "+profileNameFull);
			testStepInfo("Profile Name Full 2 : "+profileNameFull2);
			testStepInfo("Legal Name Space Special Characters : "+legalNameSpaceSpecialCharacters);
			testStepInfo("Website Space Special Characters : "+websiteSpaceSpecialCharacters);

			testStepInfo("");
			testStepInfo("************************************");
			testStepInfo("Execution Steps Started");
			testStepInfo("************************************");
			testStepInfo("");

			clearCookies();

			openApplicationMainPageByHittingURL();

			//Pre-requiste for the test case --- 

			//**********Checking Mail Id all registered in App and if exists deleting the profile with that Mail Id**********//*

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
		//HTCHR_IS_SCR_002_TC_062
			testStepInfo("HTCHR_IS_SCR_002_TC_062  -->"+"Verify the mandatory fields validation and the respective alert messages for Company page");

			mainPage.click_CreateaFund_QuickLink();
			registrationPage.verify_SignUpPage_displayed();
			registrationPage.fillSignUpForm(firstName, lastName, emailAddress, password);
			registrationPage.submitSignUpForm();
			emailSentConfirmationPage.verify_InvestorResigtrationEmailSentConfirmPage_displayed();
			String investorActivateUrl = emailReaderPage.getInvestorAccountActivateURL(emailServer, emailId, emailPassword, emailSubject);
			driver.get(investorActivateUrl);
			registrationCompanyPage.verify_Registration_Company_displayed();
			registrationCompanyPage.verify_Investor_Registration_CompanyPage_Elements_labels_displayed();
			registrationCompanyPage.verify_Investor_Registration_CompanyPage_Elements_displayed();

			//HTCHR_IS_SCR_002_TC_063 - New tab - Functional Issue.
			//HTCHR_IS_SCR_002_TC_064,65 - Not feasible 

			//HTCHR_IS_SCR_002_TC_066 -
			testStepInfo("HTCHR_IS_SCR_002_TC_066  -->"+"Verify the spellcheck for all individual label name, place holder text,  dropdown values and buttons");

			registrationCompanyPage.verify_Investor_Registration_CompanyPage_Elements_PlaceHolderText_displayed();

			//HTCHR_IS_SCR_002_TC_067 - Placeholder is not in upper case
			testStepInfo("HTCHR_IS_SCR_002_TC_067  -->"+"Verify the first letter for all individual label name, place holder text, dropdown values, buttons should be in UPPER CASE");

			registrationCompanyPage.verify_elements_Label_InUpperCase();

			//HTCHR_IS_SCR_002_TC_068 - Not feasible 	

			//HTCHR_IS_SCR_002_TC_069 -
			testStepInfo("HTCHR_IS_SCR_002_TC_069  -->"+"Verify the mandatory field ( legal name) accepts blank by keeping other fields as valid data");

			registrationCompanyPage.fillInvestorCompanyInformationWithoutLegalname(website, city, country);
			registrationCompanyPage.verifyNextButton_isdisabled();			
			refreshPage();			
			registrationCompanyPage.clear_Investor_CompanyPage_Form();
			
			//HTCHR_IS_SCR_002_TC_070 -
			testStepInfo("HTCHR_IS_SCR_002_TC_070  -->"+"Verify the mandatory field ( website) accepts blank by keeping other fields as valid data");

			registrationCompanyPage.fillInvestorCompanyInformationWithoutWebsiteAddress(legalName, city, country);
			registrationCompanyPage.verifyNextButton_isdisabled();			
			refreshPage();			
			registrationCompanyPage.clear_Investor_CompanyPage_Form();
			
			
			//HTCHR_IS_SCR_002_TC_072 and 78
			testStepInfo("HTCHR_IS_SCR_002_TC_072 and HTCHR_IS_SCR_002_TC_078  -->"+"Verify the mandatory field (Legal name) accepts alphanumeric, special characters, upper case & lower case combinations");

			registrationCompanyPage.fillInvestorCompanyInformation(legalNameSpecialCharacters, website, city, country);
			registrationCompanyPage.verifyNextButton_isenabled();			
			refreshPage();			
			registrationCompanyPage.clear_Investor_CompanyPage_Form();
			
			//HTCHR_IS_SCR_002_TC_073 -
			testStepInfo("HTCHR_IS_SCR_002_TC_073  -->"+"Verify the mandatory field (Website) accepts alphanumeric, special characters, upper case & lower case combinations");

			registrationCompanyPage.fillInvestorCompanyInformation(legalName, websiteSpaceSpecialCharacters, city, country);
			refreshPage();			
			registrationCompanyPage.clear_Investor_CompanyPage_Form();
			
			//HTCHR_IS_SCR_002_TC_075 -
			testStepInfo("HTCHR_IS_SCR_002_TC_075  -->"+"Verify the mandatory field ( legal name, Website &Country) accepts valid data and non mandatory fields as blank");

			registrationCompanyPage.fillInvestorCompanyInformationWithoutCity(legalName, website, country);			
			registrationCompanyPage.verifyNextButton_isenabled();

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
			System.out.println();
			System.err.println(e.toString());
		}
		finally
		{
			if(this.testFailure||this.obj.testFailure||mainPage.testFailure||registrationPage.testFailure||emailSentConfirmationPage.testFailure||emailReaderPage.testFailure||loginPage.testFailure||userProfilePage.testFailure||homePage.testFailure||settingsPage.testFailure||registrationCompanyPage.testFailure||registrationInvestorDetailsPage.testFailure)
			{
				this.testFailure = true;
			}
		}
	}
}