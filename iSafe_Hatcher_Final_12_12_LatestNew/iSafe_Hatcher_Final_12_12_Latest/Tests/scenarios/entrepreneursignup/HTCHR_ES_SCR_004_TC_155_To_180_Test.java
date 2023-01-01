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

public class HTCHR_ES_SCR_004_TC_155_To_180_Test extends ApplicationKeywords {
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

	public HTCHR_ES_SCR_004_TC_155_To_180_Test(BaseClass obj) {
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
			
			//HTCHR_ES_SCR_003_TC_155
			testStepInfo("HTCHR_ES_SCR_003_TC_155 -->"+"Verify the founder page gets loaded and landed successfully. ");
			registrationFounderPage.verify_Registration_Founder_displayed();	
			
			//HTCHR_ES_SCR_003_TC_161
			testStepInfo("HTCHR_ES_SCR_003_TC_161 -->"+"Verify the labels, place holder text, buttons doesn't have any misspellings. ");
			registrationFounderPage.verify_Registration_FounderPage_Elements_labels_TextBox_displayed();
			refreshPage();
			
			//HTCHR_ES_SCR_003_TC_160
			testStepInfo("HTCHR_ES_SCR_003_TC_160 -->"+"Verify the labels, place holder text, buttons first letter  must be in upper case ");
			registrationFounderPage.verify_Registration_Founder_displayed();	
			registrationFounderPage.verify_allElementsFirstLetter_InUpperCase();
			registrationFounderPage.verify_labelElementsFirstLetter_InUpperCase();
			refreshPage();
			
			//HTCHR_ES_SCR_003_TC_163
			testStepInfo("HTCHR_ES_SCR_003_TC_163 -->"+"Verify FounderBio with less 100 characters. ");
			registrationFounderPage.enter_FounderBio(founderBioLessThan100Characters);			
			registrationFounderPage.verify_FounderBio_LessThan_100Characters_RedColour_Message_displayed();			
						
			//HTCHR_ES_SCR_003_TC_164
			testStepInfo("HTCHR_ES_SCR_003_TC_164 -->"+"Verify FounderBio is equal to  100 characters. ");
			registrationFounderPage.clear_FounderInformation_Form();			
			registrationFounderPage.enter_FounderBio(founderBio100Characters);			
			registrationFounderPage.verify_FounderBio_100Characters_GreenColour_Message_displayed();			
			registrationFounderPage.clear_FounderInformation_Form();

			//HTCHR_ES_SCR_003_TC_183
			testStepInfo("HTCHR_ES_SCR_003_TC_183 -->"+"Verify non mandatory fields as blank and mandatory field alone with valid data ");
			registrationFounderPage.fillFounderInformation_MandatoryFields(founderBio);
			
			//HTCHR_ES_SCR_003_TC_165
			testStepInfo("HTCHR_ES_SCR_003_TC_165 -->"+"Verify FounderBio with special characters. ");
			registrationFounderPage.enter_FounderBio(founderBioSpecialCharacters);		
			registrationFounderPage.verify_FounderBio_100Characters_GreenColour_Message_displayed();
			registrationFounderPage.clear_FounderInformation_Form();	
				
			//HTCHR_ES_SCR_003_TC_172
			testStepInfo("HTCHR_ES_SCR_003_TC_172 -->"+"Verify jobTitle with special characters.  ");
			registrationFounderPage.enter_JobTitle(jobTitleSpeciaCharcaters);	
			registrationFounderPage.verify_JobTitle_displayed();
			registrationFounderPage.clear_FounderInformation_Form();	
			refreshPage();
						
			//HTCHR_ES_SCR_003_TC_169
			testStepInfo("HTCHR_ES_SCR_003_TC_169 -->"+"Verify non mandatory (Salutation) field with place holder text as Mr");
			registrationFounderPage.select_Salutation(salutation);
			
			registrationFounderPage.clear_FounderInformation_Form();
			refreshPage();
						
		//HTCHR_ES_SCR_003_TC_168
			testStepInfo("HTCHR_ES_SCR_003_TC_168 -->"+"Verify the salutation dropdown values gets displayed when user clicks on textbox ");
			registrationFounderPage.select_Salutation1(salutation);
		
			registrationFounderPage.clear_FounderInformation_Form();	
			registrationFounderPage.enter_JobTitle(jobTitle);	
			registrationFounderPage.enter_FounderBio(founderBio);		
			refreshPage();
			
			//HTCHR_ES_SCR_003_TC_174
			testStepInfo("HTCHR_ES_SCR_003_TC_174 -->"+"Verify non mandatory (mobile number) field with numerical ");
			registrationFounderPage.enter_MobileNumber(invalid23DigitMobileNumber);
			registrationFounderPage.verify_MobileNumber_Invalid_ErrorMessage_displayed();			
			registrationFounderPage.clear_FounderInformation_Form();
			refreshPage();
			
			//HTCHR_ES_SCR_003_TC_178
			testStepInfo("HTCHR_ES_SCR_003_TC_178 -->"+"Verify the highest education dropdown values.");
			registrationFounderPage.verify_HighestEducation_Dropdown_Option_displayed();			
			registrationFounderPage.clear_FounderInformation_Form();
			
			//HTCHR_ES_SCR_003_TC_171
			testStepInfo("HTCHR_ES_SCR_003_TC_171 -->"+"Verify the salutation dropdown values cannot be filtered using numerical, special characters, spaces ");
			registrationFounderPage.fillFounderInformation_NonMandatoryFields(salutation,jobTitle, mobileNumber, highestEducation, proffesionalQualifications);
			registrationFounderPage.verify_Salutation_ErrorMessage_displayed_InvalidSalutation(salutationSpecialCharacters);			
			registrationFounderPage.clear_FounderInformation_Form();
			
			
			/**********Deleting User Profile from App**********/
			logoutFromApplication();
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