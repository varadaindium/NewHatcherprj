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
import pages.RegistrationInvestmentHistoryPage;
import pages.LoginPage;
import pages.UserProfilePage;
import pages.HomePage;
import pages.SettingsPage;

public class HTCHR_ES_SCR_005_TC_181_To_189_Test extends ApplicationKeywords{
	private Boolean status = false;

	BaseClass obj;

	MainPage mainPage;
	RegistrationPage registrationPage;
	EmailSentConfirmationPage emailSentConfirmationPage;
	EmailReaderPage emailReaderPage;
	RegistrationCompanyPage registrationCompanyPage;
	RegistrationFounderPage registrationFounderPage;
	RegistrationInvestmentHistoryPage registrationInvestmentHistoryPage;
	LoginPage loginPage;
	UserProfilePage userProfilePage;
	HomePage homePage;
	SettingsPage settingsPage;

	public HTCHR_ES_SCR_005_TC_181_To_189_Test(BaseClass obj) {
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

			String founderBioLessThan100Characters = retrieve("founderBioLessThan100Characters");
			String founderBio100Characters = retrieve("founderBio100Characters");
			String founderBioSpecialCharacters = retrieve("founderBioSpecialCharacters");
			String proffesionalQualificationsUppercase="MCA";
			String proffesionalQualificationsLowercase="diploma";
			String founderBioblank=" ";
			String salutationSpecialCharacters = retrieve("salutationSpecialCharacters");
			String invalid23DigitMobileNumber = retrieve("invalid23DigitMobileNumber");
			String highestEducationSpecialCharacters = retrieve("highestEducationSpecialCharacters");
			String proffesionalQualificationsSpecialCharacters = retrieve("proffesionalQualificationsSpecialCharacters");
			String jobTitleSpeciaCharcaters = generateRandomSpecialCharacterString();

			String searchProfile = firstName;
			String profileNameFull = lastName+" "+firstName;
			String profileNameFull2 = firstName+" "+lastName;

			testStepPassed("Admin Mail Id : "+adminEmailId);
			testStepPassed("Admin Password : "+adminPassword);

			testStepPassed("");
			testStepPassed("Page Option : "+pageOption);

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
			testStepPassed("Founder Bio Less Than 100 Characters : "+founderBioLessThan100Characters);
			testStepPassed("Founder Bio 100 Characters : "+founderBio100Characters);
			testStepPassed("Founder Bio Special Characters : "+founderBioSpecialCharacters);
			testStepPassed("Salutation Special Characters : "+salutationSpecialCharacters);
			testStepPassed("Invalid 23 Digit Mobile Number : "+invalid23DigitMobileNumber);
			testStepPassed("Highest Education Special Characters : "+highestEducationSpecialCharacters);
			testStepPassed("Proffesional Qualifications Special Characters : "+proffesionalQualificationsSpecialCharacters);

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
			click_Settings_Users_Fixed_SideBar_HamburgerMenu();			
			settingsPage.verify_SettingsPage_UserPage_UsersTab_Section_displayed();			
			settingsPage.verify_Users_DisplayedinApplication_DeleteUser(emailAddress);			
			logoutFromApplication();
			mainPage.verify_MainPage_displayed();

			/**********Checking Mail Id all registered in App and if exists deleting the profile with that Mail Id**********/

			mainPage.click_FindInvestors_QuickLink();
			registrationPage.verify_SignUpPage_displayed();
			registrationPage.fillSignUpForm(firstName, lastName, emailAddress, password);
			registrationPage.submitSignUpForm();
			emailSentConfirmationPage.verify_InvestorResigtrationEmailSentConfirmPage_displayed();
			String investorActivateUrl = emailReaderPage.getInvestorAccountActivateURL(emailServer, emailId, emailPassword, emailSubject);
			driver.get(investorActivateUrl);
			registrationCompanyPage.verify_Registration_Company_displayed();
			pressPageDowntillelementVisibleforCompanyForm(investorActivateUrl);

			registrationCompanyPage.fillCompanyInformation(legalName, website, city, country, companyDescription, incorporationDate, businessStatus, industries, UNSDGs);
			registrationCompanyPage.click_Next_CompanyInformation();
			//////////////////////////////////////////////////////////////////////////
			testStepInfo("Company Details form filled successfully");
			
			registrationFounderPage.verify_Registration_Founder_displayed();	
			registrationFounderPage.fillFounderInformation(salutation, jobTitle, mobileNumber, founderBio, highestEducation, proffesionalQualifications);
			//registrationFounderPage.verify_Registration_Founder_Next_Button_disabled();
			registrationFounderPage.clear_FounderInformation_Form();
			testStepInfo("Founder Information form filled successfully");
			refreshPage();
			//HTCHR_ES_SCR_004_TC_185-added
			testStepInfo("HTCHR_ES_SCR_004_TC_185-->"+"Verify on clicking shift + tab key, cursor navigates to the previous fields consistently ");
			registrationFounderPage.enter_MobileNumber(mobileNumber);
			registrationFounderPage.verify_PlaceHolderFounderPage_After_Pressing_ShiftAndTab();
			registrationFounderPage.clear_FounderInformation_Form();
			refreshPage();
			//HTCHR_ES_SCR_004_TC_184-added
			testStepInfo("HTCHR_ES_SCR_004_TC_184-->"+"Verify on clicking tab key, cursor navigates to the next fields consistently.");
			registrationFounderPage.enter_MobileNumber(mobileNumber);
			registrationFounderPage.verify_PlaceHolderFounderPage_After_Pressing_Tab();
			registrationFounderPage.clear_FounderInformation_Form();
			refreshPage();
						//HTCHR_ES_SCR_004_TC_162
			testStepInfo("HTCHR_ES_SCR_004_TC_162 -->"+"Verify the mandatory field ( Founder bio) as blank and other non mandatory fields with valid data ");
			registrationFounderPage.fillFounderInformation_NonMandatoryFields(salutation,jobTitle,mobileNumber,highestEducation,proffesionalQualifications);
			//registrationFounderPage.verify_Registration_Founder_Next_Button_enabled();
			registrationFounderPage.clear_FounderInformation_Form();
			
			
			//HTCHR_ES_SCR_004_TC_170,
			testStepInfo("HTCHR_ES_SCR_004_TC_170- -->"+"Verify the salutation dropdown values can be filtered using relevant alphabets  ");
	
			registrationFounderPage.select_Salutation1(salutation);
			registrationFounderPage.clear_FounderInformation_Form();
			
			testStepInfo("HTCHR_ES_SCR_004_TC_188-->"+"Verify the page navigation by clicking Next button.-keystrokes");
			registrationFounderPage.verify_Registration_Founder_displayed();	
			registrationFounderPage.fillFounderInformation(salutation, jobTitle, mobileNumber, founderBio, highestEducation, proffesionalQualifications);
			

			testStepInfo("HTCHR_ES_SCR_004_TC_181-->"+"Verify the non mandatory field ( Professional qualifications) with alphanumeric ,special characters, lower case, upper case & spaces ");
			registrationFounderPage.enter_ProfessionalQualifications(proffesionalQualificationsSpecialCharacters);
		
			registrationFounderPage.click_Next_FounderInformation();	
			
			registrationInvestmentHistoryPage.verify_Registration_InvestmentHistory_displayed();		
			
			testStepInfo("HTCHR_ES_SCR_004_TC_189-->"+"Verify the page navigation by clicking Next button.");
			registrationInvestmentHistoryPage.click_Back_InvestmentHistory();			
			registrationFounderPage.verify_Registration_Founder_displayed();			
					
			
			logoutFromApplication();
			mainPage.verify_MainPage_displayed();
			
			/**********Deleting User Profile from App**********/

			mainPage.verify_MainPage_displayed();
			mainPage.click_login_button();			
			loginPage.verify_LoginPage_displayed();			
			loginPage.loginIntoApplication(adminEmailId, adminPassword);

			search_ValuesinSearchBar(searchProfile);
			verify_Searched_UserProfile_displayed_and_Open_UserProfilePage(profileNameFull);			
			userProfilePage.verify_UserProfilePage_displayed();
			userProfilePage.verify_UserProfilePage_ProfileTab_displayed();			
			userProfilePage.verify_CorrespondingUserProfilePage_displayed_by_ProfileName(profileNameFull2);			
			userProfilePage.deleteUserProfile();

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
			if(this.testFailure||this.obj.testFailure||mainPage.testFailure||registrationPage.testFailure||emailSentConfirmationPage.testFailure||emailReaderPage.testFailure||registrationCompanyPage.testFailure||registrationFounderPage.testFailure||registrationInvestmentHistoryPage.testFailure||loginPage.testFailure||userProfilePage.testFailure||homePage.testFailure||settingsPage.testFailure)
			{
				this.testFailure = true;
			}
		}
	}
}