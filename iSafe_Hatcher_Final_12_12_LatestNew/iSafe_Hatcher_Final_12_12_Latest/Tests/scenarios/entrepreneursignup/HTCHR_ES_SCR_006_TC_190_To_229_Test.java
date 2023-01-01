package scenarios.entrepreneursignup;

import iSAFE.ApplicationKeywords;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;

import pages.MainPage;
import pages.RegistrationPage;
import pages.EmailSentConfirmationPage;
import pages.EmailReaderPage;
import pages.RegistrationCompanyPage;
import pages.RegistrationFounderPage;
import pages.RegistrationInvestmentHistoryPage;
import pages.RegistrationVideoInterviewPage;
import pages.LoginPage;
import pages.UserProfilePage;
import pages.HomePage;
import pages.SettingsPage;



public class HTCHR_ES_SCR_006_TC_190_To_229_Test extends ApplicationKeywords
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
	LoginPage loginPage;
	UserProfilePage userProfilePage;
	HomePage homePage;
	SettingsPage settingsPage;
	


	public HTCHR_ES_SCR_006_TC_190_To_229_Test(BaseClass obj) 
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
			
			String capitalAmount = retrieve("capitalAmount");
			String currentInvestmentRound = retrieve("currentInvestmentRound");
			String capitalExchangePercentage = retrieve("capitalExchangePercentage");
			String fundingRounds = retrieve("fundingRounds");
			
			String specialCharacterText = retrieve("specialCharacterText");
			
			String stageSpecialCharacters = retrieve("stageSpecialCharacters");
			String investorsDuringThisRoundSpecialCharacters = retrieve("investorsDuringThisRoundSpecialCharacters");
			String howMuchCapitalDidYouRaise = retrieve("howMuchCapitalDidYouRaise");
			String percentageofYourBusinessinExchangeofCapital = retrieve("percentageofYourBusinessinExchangeofCapital");
			String currencySpecialCharacters = retrieve("currencySpecialCharacters");
			

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
			testStepPassed("Capital Amount : "+capitalAmount);
			testStepPassed("Current Investment Round : "+currentInvestmentRound);
			testStepPassed("Capital Exchange Percentage : "+capitalExchangePercentage);
			testStepPassed("Funding Rounds : "+fundingRounds);
			
			testStepPassed("");
			testStepPassed("Stage Special Characters : "+stageSpecialCharacters);
			testStepPassed("Investors During This Round Special Characters : "+investorsDuringThisRoundSpecialCharacters);
			testStepPassed("How Much Capital Did You Raise : "+howMuchCapitalDidYouRaise);
			testStepPassed("Percentage of Your Business in Exchange of Capital : "+percentageofYourBusinessinExchangeofCapital);
			testStepPassed("Currency Special Characters : "+currencySpecialCharacters);
			
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
			registrationCompanyPage.fillCompanyInformation(legalName, website, city, country, companyDescription, incorporationDate, businessStatus, industries, UNSDGs);

			registrationCompanyPage.click_Next_CompanyInformation();
			registrationFounderPage.verify_Registration_Founder_displayed();			
			registrationFounderPage.fillFounderInformation(salutation, jobTitle, mobileNumber, founderBio, highestEducation, proffesionalQualifications);
			
			registrationFounderPage.click_Next_FounderInformation();
			
			//HTCHR_ES_SCR_004_TC_190
			testStepInfo("HTCHR_ES_SCR_006_TC_190 -->"+"Verify the investment history UI gets loaded successfully ");
			registrationInvestmentHistoryPage.verify_Registration_InvestmentHistory_displayed();			
			registrationInvestmentHistoryPage.click_Back_button();			
			registrationFounderPage.verify_Registration_Founder_displayed();			
			registrationFounderPage.click_Next_FounderInformation();			
			registrationInvestmentHistoryPage.verify_Registration_InvestmentHistory_displayed();			
			registrationInvestmentHistoryPage.click_Next_InvestmentHistory();
			
			//HTCHR_ES_SCR_004_TC_228, HTCHR_ES_SCR_004_TC_229
			testStepInfo("HTCHR_ES_SCR_006_TC_228 and 229-->"+"Verify all fields , dropdown as blank ,navigate to next page by clicking next button ");
			registrationVideoInterviewPage.verify_Registration_VideoInterview_displayed();			
			registrationVideoInterviewPage.Click_Back_VideoInterview();			
			registrationInvestmentHistoryPage.verify_Registration_InvestmentHistory_displayed();
			refreshPage();
			
			//HTCHR_ES_SCR_004_TC_193
			testStepInfo("HTCHR_ES_SCR_006_TC_193 and 201-->"+"Verify the label name, place holder text begins with first letter as CAPS ");
			registrationInvestmentHistoryPage.verify_Registration_InvestmentHistoryPage_Elements_displayed();			
	
			refreshPage();
		
			//HTCHR_ES_SCR_003_TC_194
			testStepInfo("HTCHR_ES_SCR_006_TC_194 -->"+"Verify if the cursor swaps to next field on clicking tab");
			registrationInvestmentHistoryPage.verify_PlaceHolderInvestmentHistory_After_Pressing_Tab();

			
			//HTCHR_ES_SCR_004_TC_199, HTCHR_ES_SCR_004_TC_202, HTCHR_ES_SCR_004_TC_214, HTCHR_ES_SCR_004_TC_217
			testStepInfo("HTCHR_ES_SCR_006_TC_199,202,214,217,197,210--->Verify How much capital are you seeking? field accepts alphabets,numerical,special character and  decimal values");
			registrationInvestmentHistoryPage.fillInvestmentInformation(capitalAmount, currentInvestmentRound, capitalExchangePercentage, fundingRounds);			
			
			//HTCHR_ES_SCR_004_TC_205
			testStepInfo("HTCHR_ES_SCR_006_TC_205,211,213--->Verify the previousFundingRounds Yes Option and fields relevant to it.");
			registrationInvestmentHistoryPage.select_PreviousFundingRounds_Yes_Option();
			registrationInvestmentHistoryPage.verify_Stage_ErrorMessage_displayed_InvalidHighestEducation(stageSpecialCharacters);	
			
			registrationInvestmentHistoryPage.verify_Registration_InvestmentHistoryPage_Elements_WithSelect_Round_Yes_displayed();
			registrationInvestmentHistoryPage.verifyDateClosed();
			registrationInvestmentHistoryPage.click_Next_InvestmentHistory();			
			registrationVideoInterviewPage.verify_Registration_VideoInterview_displayed();
			
			
			//HTCHR_ES_SCR_005_TC_230-244-Automation Not possible -UI Video 
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
			System.out.println(obj.testFailure);
			if(this.testFailure||this.obj.testFailure||mainPage.testFailure||registrationPage.testFailure||emailSentConfirmationPage.testFailure||emailReaderPage.testFailure||registrationCompanyPage.testFailure||registrationFounderPage.testFailure||registrationInvestmentHistoryPage.testFailure||registrationVideoInterviewPage.testFailure||loginPage.testFailure||userProfilePage.testFailure||homePage.testFailure||settingsPage.testFailure)
			{
				this.testFailure = true;
			}
		}
	}
}