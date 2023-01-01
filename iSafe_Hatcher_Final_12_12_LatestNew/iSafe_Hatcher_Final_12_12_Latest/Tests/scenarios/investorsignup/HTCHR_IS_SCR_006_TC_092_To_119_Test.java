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
import pages.RegistrationInvestmentPage;


public class HTCHR_IS_SCR_006_TC_092_To_119_Test extends ApplicationKeywords
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
	RegistrationInvestmentPage registrationInvestmentPage;
	
	public HTCHR_IS_SCR_006_TC_092_To_119_Test(BaseClass obj) 
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
			registrationInvestmentPage = new RegistrationInvestmentPage(obj);
			
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
			
			String searchProfile = firstName;
			String profileNameFull = lastName+" "+firstName;
			String profileNameFull2 = firstName+" "+lastName;
			
			String investorTypeSpecialCharacters = retrieve("investorTypeSpecialCharacters");
			String salutationSpecialCharacters = retrieve("salutationSpecialCharacters");
			String jobTitleSpaceSpecialCharacters = retrieve("jobTitleSpaceSpecialCharacters");

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
			testStepPassed("Search Profile : "+searchProfile);
			testStepPassed("Profile Name Full : "+profileNameFull);
			testStepPassed("Profile Name Full 2 : "+profileNameFull2);
			
			testStepPassed("");
			testStepPassed("Investor Type Special Characters : "+investorTypeSpecialCharacters);
			testStepPassed("Salutation Special Characters : "+salutationSpecialCharacters);
			testStepPassed("Job Title Space Special Characters : "+jobTitleSpaceSpecialCharacters);

			
			testStepInfo("");
			testStepInfo("************************************");
			testStepInfo("Execution Steps Started");
			testStepInfo("************************************");
			testStepInfo("");

			clearCookies();
			
			openApplicationMainPageByHittingURL();
			
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

			
			/**********Checking Mail Id all registered in App and if exists deleting the profile with that Mail Id**********/
			
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

			//HTCHR_IS_SCR_002_TC_088
			testStepInfo("HTCHR_IS_SCR_002_TC_088  -->"+"Verify the user can navigate to next page ( Investor details) on clicking Next button by filling all mandatory and non mandatory fields");
			
			registrationCompanyPage.fillInvestorCompanyInformation(legalName, website, city, country);
			clickOn("Application Form#xpath=(//div[contains(@class,'application-form-container')])[1]");
			
			pressPageDown();
			registrationCompanyPage.click_Next_CompanyInformation();
			
			//HTCHR_IS_SCR_003_TC_092 
			testStepInfo("HTCHR_IS_SCR_003_TC_092  -->"+"Verify the investor details page gets loaded and landed successfully");
			
			registrationInvestorDetailsPage.verify_Registration_InvestorDetailsForm_displayed();
			
			//HTCHR_IS_SCR_003_TC_097
			testStepInfo("HTCHR_IS_SCR_003_TC_097 - 98 , HTCHR_IS_SCR_003_TC_107-->"+"Verify the labels, place holder text, buttons first letter  must be in upper case");			
			registrationInvestorDetailsPage.verify_Investor_Registration_InvestorDetailsPage_Elements_displayed();
			
			//HTCHR_IS_SCR_003_TC_101
			testStepInfo("HTCHR_IS_SCR_003_TC_101,107 -->"+"Verify the mandatory field ( Investor type) can be filtered using alphabets alone (Upper and lower case as well)");			
			registrationInvestorDetailsPage.verify_elements_Label_InUpperCase();
			
			//HTCHR_IS_SCR_003_TC_099
			testStepInfo("HTCHR_IS_SCR_003_TC_099  -->"+"Verify the mandatory field ( Investor type) as blank and other non mandatory fields with valid data");			
			registrationInvestorDetailsPage.fillInvestorDetails_NonMandatoryInformation(salutation, jobTitle, mobileNumber);			
			registrationInvestorDetailsPage.verifyNextButton_isdisabled();
			
			//HTCHR_IS_SCR_003_TC_100 - 102 ,103 - Automation Dropdown
			testStepInfo("HTCHR_IS_SCR_003_TC_100-103  -->"+"Verify the salutation dropdown values gets displayed when user clicks on textbox");			
			registrationInvestorDetailsPage.verify_Salutation_Dropdown_Values_displayed();
				
			//	HTCHR_IS_SCR_003_TC_106
			testStepInfo("HTCHR_IS_SCR_003_TC_106  -->"+"Verify the salutation dropdown values cannot be filtered using irrelevant data.");			
			registrationInvestorDetailsPage.verify_Investor_Salutation_ErrorMessage_displayed_InvalidSalutation(salutationSpecialCharacters);		
			System.out.println(this.obj.testFailure);
			
			//HTCHR_IS_SCR_003_TC_117
			testStepInfo("HTCHR_IS_SCR_003_TC_117  -->"+"Verify on clicking Enter button on keyboard, Page gets reloaded to investment page");			
			registrationInvestorDetailsPage.fillInvestorDetailsInformation(salutation, jobTitle, mobileNumber, investorType);			
			registrationInvestorDetailsPage.click_Next_InvestorDetailsInformationwithEnterKey();
			registrationInvestmentPage.verify_Registration_Investment_displayed();
			
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
			System.out.println(this.testFailure);
			System.out.println(this.obj.testFailure);
			if(this.testFailure||this.obj.testFailure||mainPage.testFailure||registrationPage.testFailure||emailSentConfirmationPage.testFailure||emailReaderPage.testFailure||loginPage.testFailure||userProfilePage.testFailure||homePage.testFailure||settingsPage.testFailure||registrationCompanyPage.testFailure||registrationInvestorDetailsPage.testFailure||registrationInvestmentPage.testFailure)
			{
				this.testFailure = true;
			}
		}
	}
}