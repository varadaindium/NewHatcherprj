package scenarios.investorsignup;

import iSAFE.ApplicationKeywords;

import org.openqa.selenium.By;

import baseClass.BaseClass;

import pages.MainPage;
import pages.RegistrationPage;
import pages.EmailSentConfirmationPage;
import pages.LoginPage;
import pages.UserProfilePage;
import pages.SettingsPage;
import pages.HomePage;


public class HTCHR_IS_SCR_001_TC_001_To_009_Test extends ApplicationKeywords
{
	private Boolean status = false;

	BaseClass obj;

	MainPage mainPage;
	RegistrationPage registrationPage;
	EmailSentConfirmationPage emailSentConfirmationPage;
	LoginPage loginPage;
	UserProfilePage userProfilePage;
	SettingsPage settingsPage;
	HomePage homePage;

	public HTCHR_IS_SCR_001_TC_001_To_009_Test(BaseClass obj) 
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
			loginPage = new LoginPage(obj);
			userProfilePage = new UserProfilePage(obj);
			settingsPage = new SettingsPage(obj);
			homePage = new HomePage(obj);

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

			String invalidShortCharacterPassword = retrieve("invalidShortCharacterPassword");	
			String invalidLongCharacterPassword = retrieve("invalidLongCharacterPassword");
			String valid12DigitPassword = retrieve("valid12DigitPassword");
			String alreadyRegisteredEmailAddress = retrieve("alreadyRegisteredEmailAddress");
			String emailIdSpecialCharacters = retrieve("emailIdSpecialCharacters");

			String specialCharacterText = retrieve("specialCharacterText");
			String firstnameSpecialCharacters = specialCharacterText;
			String lastnameSpecialCharacters = specialCharacterText;
			String passwordSpecialCharacters = specialCharacterText;

			String emptyFirstName = "";
			String emptyLastName = "";
			String emptyemailAddress = "";
			String emptyPassword = "";

			String searchProfile = firstName;
			String profileNameFull = lastName+" "+firstName;
			String profileNameFull2 = firstName+" "+lastName;

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
			testStepInfo("Invalid Short Character Password : "+invalidShortCharacterPassword);
			testStepInfo("Invalid Long Character Password : "+invalidLongCharacterPassword);
			testStepInfo("Valid 12 Digit Password : "+valid12DigitPassword);
			testStepInfo("Already Registered Email Address : "+alreadyRegisteredEmailAddress);
			testStepInfo("Special Character Text : "+specialCharacterText);
			testStepInfo("First Name Special Characters : "+firstnameSpecialCharacters);
			testStepInfo("Last Name Special Characters : "+lastnameSpecialCharacters);
			testStepInfo("Email Id Special Characters : "+emailIdSpecialCharacters);
			testStepInfo("Password Special Characters : "+passwordSpecialCharacters);
			testStepInfo("Empty First Name : "+emptyFirstName);
			testStepInfo("Empty Last Name : "+emptyLastName);
			testStepInfo("Empty Email Address : "+emptyemailAddress);
			testStepInfo("Empty Password : "+emptyPassword);

			testStepInfo("");
			testStepInfo("Search Profile : "+searchProfile);
			testStepInfo("Profile Name Full : "+profileNameFull);
			testStepInfo("Profile Name Full 2 : "+profileNameFull2);

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
			
			testStepInfo("HTCHR_IS_SCR_001_TC_001  -->"+"Verify UI of the signup page gets loaded and landed successfully");
			mainPage.verify_MainPage_displayed();
			mainPage.click_CreateaFund_QuickLink();
			registrationPage.verify_SignUpPage_displayed();
			registrationPage.verify_SignUp_Page_elements_displayed();
			
			testStepInfo("HTCHR_IS_SCR_001_TC_002  -->"+"Verify 'First Name' field accepts blank value");
			String randomMailAddress = generateRandomEmailAddress();
			registrationPage.fillSignUpForm(emptyFirstName, lastName, randomMailAddress, password);
			registrationPage.verify_SignUp_button_isDisabled();
			refreshPage();
			registrationPage.clear_Signupform();
			
			testStepInfo("HTCHR_IS_SCR_001_TC_003  -->"+"Verify 'Last Name' field accepts blank value");
			String randomMailAddress2 = generateRandomEmailAddress();
			registrationPage.fillSignUpForm(firstName, emptyLastName, randomMailAddress2, password);
			registrationPage.verify_SignUp_button_isDisabled();
			refreshPage();
			registrationPage.clear_Signupform();

			testStepInfo("HTCHR_IS_SCR_001_TC_004  -->"+"Verify 'email' field accepts blank value");
			registrationPage.fillSignUpForm(firstName, lastName, emptyemailAddress, password);
			registrationPage.verify_SignUp_button_isDisabled();
			refreshPage();

			testStepInfo("HTCHR_IS_SCR_001_TC_005  -->"+"Verify 'Password' field accepts blank value");
			registrationPage.clear_Signupform();
			String randomMailAddress3 = generateRandomEmailAddress();
			registrationPage.fillSignUpForm(firstName, lastName, randomMailAddress3, emptyPassword);
			registrationPage.verify_SignUp_button_isDisabled();
			refreshPage();
			registrationPage.clear_Signupform();

			testStepInfo("HTCHR_IS_SCR_001_TC_006  -->"+"Verify if the mandatory field 'First Name' accepts the combination of alphabets, special characters, numerical");
			String randomMailAddress4 = generateRandomEmailAddress();
			registrationPage.fillSignUpForm(firstnameSpecialCharacters, lastName, randomMailAddress4, password);
			registrationPage.submitSignUpForm();
			registrationPage.verifySignupSuccesfully();
			registrationPage.openSignUpPage();
			registrationPage.verify_SignUpPage_displayed();

			testStepInfo("HTCHR_IS_SCR_001_TC_007  -->"+"Verify if the mandatory field 'Last Name' accepts the combination of alphabets, special characters, numerical");
			String randomMailAddress5 = generateRandomEmailAddress();
			registrationPage.fillSignUpForm(firstName, lastnameSpecialCharacters, randomMailAddress5, password);
			registrationPage.submitSignUpForm();
			registrationPage.verifySignupSuccesfully();
			registrationPage.openSignUpPage();
			registrationPage.verify_SignUpPage_displayed();
		
			testStepInfo("HTCHR_IS_SCR_001_TC_008  -->"+"Verify if the mandatory field 'Email' accepts the combination of alphabets, special characters, numerical");
			String randomMailAddress6 = generateRandomEmailAddressWithSpecialCharacter();			
			registrationPage.fillSignUpForm(firstName, lastName, randomMailAddress6, password);
			registrationPage.submitSignUpForm();
			registrationPage.verifySignupSuccesfully();
			registrationPage.openSignUpPage();
			registrationPage.verify_SignUpPage_displayed();
			
			testStepInfo("HTCHR_IS_SCR_001_TC_009  -->"+"Verify if the mandatory field 'Password' accepts the combination of alphabets, special characters, numerical");
			String randomMailAddress7 = generateRandomEmailAddress();
			registrationPage.fillSignUpForm(firstName, lastName, randomMailAddress7, passwordSpecialCharacters);
			registrationPage.submitSignUpForm();
			registrationPage.verifySignupSuccesfully();
			registrationPage.openSignUpPage();
			registrationPage.verify_SignUpPage_displayed();
			
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
			if(this.testFailure||this.obj.testFailure||mainPage.testFailure||registrationPage.testFailure||emailSentConfirmationPage.testFailure||loginPage.testFailure||userProfilePage.testFailure||settingsPage.testFailure||homePage.testFailure)
			{
				this.testFailure = true;
			}
		}
	}
}