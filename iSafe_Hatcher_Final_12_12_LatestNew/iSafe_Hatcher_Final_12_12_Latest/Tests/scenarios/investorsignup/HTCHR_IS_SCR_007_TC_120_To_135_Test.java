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
import pages.CompanyProfilePage;


public class HTCHR_IS_SCR_007_TC_120_To_135_Test extends ApplicationKeywords
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
	CompanyProfilePage companyProfilePage;
	


	public HTCHR_IS_SCR_007_TC_120_To_135_Test(BaseClass obj) 
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
			companyProfilePage = new CompanyProfilePage(obj);
			

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
			settingsPage.clickOnSettings();   //newly added click
			settingsPage.verify_SettingsPage_displayed();
			
			//HTCHR_IS_SCR_004_TC_131
			
			/*testStepInfo("HTCHR_IS_SCR_003_TC_131  -->"+"Verify Preferred Investment Stage should be filtered using relevant data.");
			settingsPage.select_Pages_dropdown(pageOption);
			settingsPage.verify_SettingsPage_UserPage_UsersTab_displayed();
			settingsPage.click_SettingsPage_UserPage_UsersTab();
			settingsPage.verify_SettingsPage_UserPage_UsersTab_Section_displayed();
			settingsPage.verify_Users_DisplayedinApplication_DeleteUser(emailAddress);
			logoutFromApplication();
			
			//HTCHR_IS_SCR_003_TC_120
			testStepInfo("HTCHR_IS_SCR_003_TC_120  -->"+"Verify the investment page UI gets loaded successfully"); 
			mainPage.verify_MainPage_displayed();
			
			/**********Checking Mail Id all registered in App and if exists deleting the profile with that Mail Id**********/
			
			mainPage.click_CreateaFund_QuickLink();			
			registrationPage.verify_SignUpPage_displayed();
			
			//HTCHR_IS_SCR_003_TC_123
			testStepInfo("HTCHR_IS_SCR_003_TC_123  -->"+"Verify the label name, place holder text begins with first letter as CAPS");			
			registrationPage.verify_elements_placeholderText_InUpperCase();			
			registrationPage.fillSignUpForm(firstName, lastName, emailAddress, password);
			registrationPage.submitSignUpForm();
			emailSentConfirmationPage.verify_InvestorResigtrationEmailSentConfirmPage_displayed();
			String investorActivateUrl = emailReaderPage.getInvestorAccountActivateURL(emailServer, emailId, emailPassword, emailSubject);
			driver.get(investorActivateUrl);			
			registrationCompanyPage.verify_Registration_Company_displayed();
			
			//HTCHR_IS_SCR_004_TC_129
			testStepInfo("HTCHR_IS_SCR_004_TC_129  -->"+"Verify the Industries  dropdown field should be filtered using relevant data.");
			registrationCompanyPage.fillInvestorCompanyInformation(legalName, website, city, country);	
			pressPageDowntillelementVisibleforCompanyForm(investorActivateUrl);
			registrationCompanyPage.click_Next_CompanyInformation();			
			registrationInvestorDetailsPage.verify_Registration_InvestorDetailsForm_displayed();			
			registrationInvestorDetailsPage.fillInvestorDetailsInformation(salutation, jobTitle, mobileNumber, investorType);
			
			//HTCHR_IS_SCR_003_TC_118
			testStepInfo("HTCHR_IS_SCR_004_TC_118,135-->"+"Verify on clicking Next button, Page gets reloaded to investment  page+J970");			
			registrationInvestorDetailsPage.click_Next_InvestorDetailsInformation();			
			registrationInvestmentPage.verify_Registration_Investment_displayed();			
			registrationInvestmentPage.verify_Investor_Registration_InvestmentPage_Elements_labels_displayed();			
			registrationInvestmentPage.verify_Investor_Registration_InvestmentPage_Elements_displayed();			
			registrationInvestmentPage.click_Next_InvestmentForm();			
			companyProfilePage.verify_CompanyProfilePage_displayed();
			companyProfilePage.verify_ProfileTab_CompanyProfilePage_displayed();
			companyProfilePage.verify_CorrespondingCompanyProfilePage_displayed_by_CompanyName(legalName);			
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
			if(this.testFailure||this.obj.testFailure||mainPage.testFailure||registrationPage.testFailure||emailSentConfirmationPage.testFailure||emailReaderPage.testFailure||loginPage.testFailure||userProfilePage.testFailure||homePage.testFailure||settingsPage.testFailure||registrationCompanyPage.testFailure||registrationInvestorDetailsPage.testFailure||registrationInvestmentPage.testFailure||companyProfilePage.testFailure)
			{
				this.testFailure = true;
			}
		}
	}
}