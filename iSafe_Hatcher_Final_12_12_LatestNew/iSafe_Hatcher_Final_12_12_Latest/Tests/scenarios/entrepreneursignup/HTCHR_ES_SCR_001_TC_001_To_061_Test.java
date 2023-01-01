package scenarios.entrepreneursignup;

import iSAFE.ApplicationKeywords;
import baseClass.BaseClass;

import pages.MainPage;
import pages.RegistrationPage;
import pages.EmailSentConfirmationPage;
import pages.LoginPage;
import pages.UserProfilePage;
import pages.SettingsPage;
import pages.HomePage;


public class HTCHR_ES_SCR_001_TC_001_To_061_Test extends ApplicationKeywords
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


	public HTCHR_ES_SCR_001_TC_001_To_061_Test(BaseClass obj) 
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
			String passwordUpperCase = retrieve("passwordUpperAndLowerCase");

			String invalidShortCharacterPassword = retrieve("invalidShortCharacterPassword");	
			String invalidLongCharacterPassword = retrieve("invalidLongCharacterPassword");
			String valid12DigitPassword = retrieve("valid12DigitPassword");
			String alreadyRegisteredEmailAddress = retrieve("alreadyRegisteredEmailAddress");

			String firstNameNumbers = generateRandomNumbersasString(10);
			String lastNameNumbers = generateRandomNumbersasString(10);
			String emailNumbers = generateRandomEmailAddressWithNumbers();

			String specialCharacterText = retrieve("specialCharacterText");
			String firstNameSpecialCharacters = specialCharacterText;
			String lastNameSpecialCharacters = specialCharacterText;
			String emailIdSpecialCharacters = specialCharacterText+"test.com";
			String passwordSpecialCharacters = specialCharacterText;
			String invalidemailId = "testg.@com";
			String emailIddotcodomain = generateRandomStringbothUpperandLowerCase(12)+"@gmail.co";
			String emailIddifferentdomain = generateRandomStringbothUpperandLowerCase(12)+"@gmail.po";
			String emailIdwithSpace = generateRandomString(12)+"T F@gmail.co m";
			String emailIdwithSymbols = generateRandomString(12)+"#!$%@gmail.com";
			String firstNamewithSpace = "test test";
			String lastNamewithSpace = "test test";
			String passwordSpace = " ";

			String firstNameUpperCaseLoweerCase = generateRandomStringbothUpperandLowerCase(5);
			String lastNameUpperCaseLoweerCase = generateRandomStringbothUpperandLowerCase(6);
			String emailUpperCaseLoweerCase = generateRandomStringbothUpperandLowerCase(6)+"@test.com";

			String firstNameAlphanumericwithSpace = generateRandomAlphaNumericCharacterString(5)+" "+"check";
			String lastNameAlphanumericwithSpace = generateRandomAlphaNumericCharacterString(5)+" "+"check";


			String firstNameSpecialCharcterswithSpace = generateRandomSpecialCharacterString()+" "+"check";
			String lastNameSpecialCharcterswithSpace = generateRandomSpecialCharacterString()+" "+"check";

			String firstNameInvalid = "testttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt";
			String lastNameInvalid = "testttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt";


			String emptyFirstName = "";
			String emptyLastName = "";
			String emptyEmailAddress = "";
			String emptyPassword = "";

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
			testStepPassed("Invalid Short Character Password : "+invalidShortCharacterPassword);
			testStepPassed("Invalid Long Character Password : "+invalidLongCharacterPassword);
			testStepPassed("Valid 12 Digit Password : "+valid12DigitPassword);
			testStepPassed("Already Registered Email Address : "+alreadyRegisteredEmailAddress);
			testStepPassed("Special Character Text : "+specialCharacterText);
			testStepPassed("First Name Special Characters : "+firstNameSpecialCharacters);
			testStepPassed("Last Name Special Characters : "+lastNameSpecialCharacters);
			testStepPassed("Email Id Special Characters : "+emailIdSpecialCharacters);
			testStepPassed("Password Special Characters : "+passwordSpecialCharacters);
			testStepPassed("Empty First Name : "+emptyFirstName);
			testStepPassed("Empty Last Name : "+emptyLastName);
			testStepPassed("Empty Email Address : "+emptyEmailAddress);
			testStepPassed("Empty Password : "+emptyPassword);

			testStepPassed("First Name Numbers : "+firstNameNumbers);
			testStepPassed("Last Name Numbers : "+lastNameNumbers);
			testStepPassed("Email Id Numbers : "+emailNumbers);

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

			mainPage.verify_MainPage_displayed();


			//HTCHR_ES_SCR_001_TC_001
			testStepInfo("HTCHR_ES_SCR_001_TC_001  -->"+"Verify UI of the signup page gets loaded and landed successfully");

			mainPage.click_FindInvestors_QuickLink();
			registrationPage.verify_SignUpPage_displayed();
			registrationPage.verify_SignUp_Page_elements_displayed();
			String randomMailAddress = generateRandomEmailAddress();


			//HTCHR_ES_SCR_001_TC_002
			testStepInfo("HTCHR_ES_SCR_001_TC_002  -->"+"Verify 'First Name' field accepts blank value");
			registrationPage.fillSignUpForm(emptyFirstName, lastName, randomMailAddress, password);
			registrationPage.submitSignUpForm();
			registrationPage.verify_SignUpPage_displayed();
			refreshPage();
			registrationPage.clear_Signupform();
			String randomMailAddress2 = generateRandomEmailAddress();


			//HTCHR_ES_SCR_001_TC_003
			testStepInfo("HTCHR_ES_SCR_001_TC_003  -->"+"Verify 'Last Name' field accepts blank value");
			registrationPage.fillSignUpForm(firstName, emptyLastName, randomMailAddress2, password);
			registrationPage.submitSignUpForm();
			registrationPage.verify_SignUpPage_displayed();
			refreshPage();
			registrationPage.clear_Signupform();


			//HTCHR_ES_SCR_001_TC_004
			testStepInfo("HTCHR_ES_SCR_001_TC_004  -->"+"Verify 'email' field accepts blank value");
			registrationPage.fillSignUpForm(firstName, lastName, emptyEmailAddress, password);
			registrationPage.submitSignUpForm();
			registrationPage.verify_SignUpPage_displayed();
			refreshPage();
			registrationPage.clear_Signupform();
			String randomMailAddress3 = generateRandomEmailAddress();


			//HTCHR_ES_SCR_001_TC_005
			testStepInfo("HTCHR_IS_SCR_001_TC_005  -->"+"Verify 'Password' field accepts blank value");
			registrationPage.fillSignUpForm(firstName, lastName, randomMailAddress3, emptyPassword);
			registrationPage.submitSignUpForm();
			registrationPage.verify_SignUpPage_displayed();
			refreshPage();
			String randomMailAddress4 = generateRandomEmailAddress();
			registrationPage.clear_Signupform();


			//HTCHR_ES_SCR_001_TC_006
			testStepInfo("HTCHR_IS_SCR_001_TC_006  -->"+"Verify if the mandatory field 'First Name' accepts the combination of alphabets, special characters, numerical");
			registrationPage.fillSignUpForm(firstNameSpecialCharacters, lastName, randomMailAddress4, password);

			registrationPage.submitSignUpForm();

			emailSentConfirmationPage.verify_InvestorResigtrationEmailSentConfirmPage_displayed();

			navigateBack();

			refreshPage();

			registrationPage.verify_SignUpPage_displayed();

			refreshPage();

			registrationPage.clear_Signupform();

			String randomMailAddress5 = generateRandomEmailAddress();

			registrationPage.clear_Signupform();



			//HTCHR_ES_SCR_001_TC_007
			testStepInfo("HTCHR_ES_SCR_001_TC_007  -->"+"Verify if the mandatory field 'Last Name' accepts the combination of alphabets, special characters, numerical");
			registrationPage.fillSignUpForm(firstName, lastNameSpecialCharacters, randomMailAddress5, password);

			registrationPage.submitSignUpForm();

			emailSentConfirmationPage.verify_InvestorResigtrationEmailSentConfirmPage_displayed();

			navigateBack();

			refreshPage();

			registrationPage.clear_Signupform();


			//HTCHR_ES_SCR_001_TC_008
			testStepInfo("HTCHR_ES_SCR_001_TC_008  -->"+"Verify if the mandatory field 'Email' accepts the combination of alphabets, special characters, numerical");
			registrationPage.fillSignUpForm(firstName, lastName, emailIdSpecialCharacters, password);

			registrationPage.submitSignUpForm();

			registrationPage.verify_Email_inValid_errormessage_displayed();

			registrationPage.verify_SignUpPage_displayed();

			refreshPage();

			registrationPage.clear_Signupform();

			String randomMailAddress6 = generateRandomEmailAddress();

			// HTCHR_ES_SCR_001_TC_009
			testStepInfo("HTCHR_ES_SCR_001_TC_009  -->"+"Verify if the mandatory field 'Password' accepts the combination of alphabets, special characters, numerical");
			registrationPage.fillSignUpForm(firstName, lastName, randomMailAddress6, passwordSpecialCharacters);

			registrationPage.submitSignUpForm();

			emailSentConfirmationPage.verify_InvestorResigtrationEmailSentConfirmPage_displayed();

			navigateBack();

			refreshPage();

			registrationPage.verify_SignUpPage_displayed();

			refreshPage();

			registrationPage.clear_Signupform();

			//TC_11 & 12 Newly Added

			//HTCHR_ES_SCR_001_TC_013
			testStepInfo("HTCHR_ES_SCR_001_TC_013  -->"+"Verify if all the fields on sign up page has place holder text.");
			registrationPage.verify_elements_placeholderText_displayed();

			registrationPage.verify_SignUpPage_displayed();


			//HTCHR_ES_SCR_001_TC_014
			testStepInfo("HTCHR_ES_SCR_001_TC_014  -->"+"Verify if mandatory symbol indications - * displayed");
			registrationPage.verify_elements_mandatory_asterisk_mark_displayed();

			registrationPage.verify_SignUpPage_displayed();

			registrationPage.clear_Signupform();

			String randomMailAddress7 = generateRandomEmailAddress();

			registrationPage.fillSignUpForm(firstName, lastName, randomMailAddress7, password);

			registrationPage.submitSignUpForm();

			emailSentConfirmationPage.verify_InvestorResigtrationEmailSentConfirmPage_displayed();

			navigateBack();

			refreshPage();

			registrationPage.verify_SignUpPage_displayed();

			registrationPage.clear_Signupform();

			//TC_15,16,17,18-Automation Feasibility-No-Deffered.

			//HTCHR_ES_SCR_001_TC_019
			testStepInfo("HTCHR_ES_SCR_001_TC_019  -->"+"Verify only numerical value for all the fields.");
			registrationPage.fillSignUpForm(firstNameNumbers, lastNameNumbers, emailNumbers, password);

			registrationPage.submitSignUpForm();

			emailSentConfirmationPage.verify_InvestorResigtrationEmailSentConfirmPage_displayed();

			navigateBack();

			refreshPage();

			registrationPage.verify_SignUpPage_displayed();

			registrationPage.clear_Signupform();


			//HTCHR_ES_SCR_001_TC_020
			testStepInfo("HTCHR_ES_SCR_001_TC_020  -->"+"Verify Email ID has @ and .com,");
			registrationPage.fillSignUpForm(firstName, lastName, invalidemailId, password);

			registrationPage.verify_Email_inValid_errormessage_displayed();

			registrationPage.clear_Signupform();

			refreshPage();

			//HTCHR_ES_SCR_001_TC_021
			testStepInfo("HTCHR_ES_SCR_001_TC_021  -->"+"Verify the Email ID field should accept both .com as well as .co with @ symbol");
			registrationPage.fillSignUpForm(firstName, lastName, emailIddotcodomain, password);

			registrationPage.submitSignUpForm();

			emailSentConfirmationPage.verify_InvestorResigtrationEmailSentConfirmPage_displayed();

			navigateBack();

			refreshPage();

			registrationPage.verify_SignUpPage_displayed();

			registrationPage.clear_Signupform();

			//HTCHR_ES_SCR_001_TC_022
			testStepInfo("HTCHR_ES_SCR_001_TC_022  -->"+"Verify the email field with invalid inputs");
			registrationPage.fillSignUpForm(firstName, lastName, invalidemailId, password);

			registrationPage.submitSignUpForm();

			registrationPage.verify_Email_inValid_errormessage_displayed();

			registrationPage.clear_Signupform();

			refreshPage();

			//HTCHR_ES_SCR_001_TC_023
			testStepInfo("HTCHR_ES_SCR_001_TC_023  -->"+"Verify all mandatory fields with spl characters");
			registrationPage.fillSignUpForm(firstNameSpecialCharacters, lastNameSpecialCharacters, emailIdSpecialCharacters, passwordSpecialCharacters);

			registrationPage.verify_Email_inValid_errormessage_displayed();

			registrationPage.clear_Signupform();

			refreshPage();

			//HTCHR_ES_SCR_001_TC_024
			testStepInfo("HTCHR_ES_SCR_001_TC_024  -->"+"Verify first name, last name, Email Id is valid with an invalid password field");
			String randomMailAddress9 = generateRandomEmailAddress();
			registrationPage.fillSignUpForm(firstName, lastName, randomMailAddress9, invalidShortCharacterPassword);

			registrationPage.verify_Password_inValid_errormessage_displayed();

			registrationPage.clear_Signupform();

			//HTCHR_ES_SCR_001_TC_025
			testStepInfo("HTCHR_ES_SCR_001_TC_025  -->"+"Verify all the fields are with valid inputs.");

			String randomMailAddress8 = generateRandomEmailAddress2();

			registrationPage.fillSignUpForm(firstName, lastName, randomMailAddress8, password);

			registrationPage.submitSignUpForm();

			emailSentConfirmationPage.verify_InvestorResigtrationEmailSentConfirmPage_displayed();

			navigateBack();

			refreshPage();

			registrationPage.verify_SignUpPage_displayed();

			registrationPage.clear_Signupform();

			//HTCHR_ES_SCR_001_TC_027
			testStepInfo("HTCHR_ES_SCR_001_TC_027  -->"+"Verify password field accepts combination of both upper case and lower case alphabets.");
			registrationPage.fillSignUpForm(firstNameUpperCaseLoweerCase, lastNameUpperCaseLoweerCase, emailUpperCaseLoweerCase, passwordUpperCase);

			registrationPage.submitSignUpForm();

			emailSentConfirmationPage.verify_InvestorResigtrationEmailSentConfirmPage_displayed();

			navigateBack();

			refreshPage();

			registrationPage.verify_SignUpPage_displayed();

			registrationPage.clear_Signupform();



			//HTCHR_ES_SCR_001_TC_028
			testStepInfo("HTCHR_ES_SCR_001_TC_028  -->"+"Verify mandatory fields accepts alphanumeric and spl chars");
			String randomMailAddress21 = generateRandomEmailAddress();

			registrationPage.fillSignUpForm(firstNameSpecialCharacters, lastNameSpecialCharacters, randomMailAddress21, password);

			registrationPage.submitSignUpForm();

			emailSentConfirmationPage.verify_InvestorResigtrationEmailSentConfirmPage_displayed();

			navigateBack();

			refreshPage();

			registrationPage.verify_SignUpPage_displayed();

			refreshPage();

			registrationPage.clear_Signupform();




			//HTCHR_ES_SCR_001_TC_029
			testStepInfo("HTCHR_ES_SCR_001_TC_029  -->"+"Verify First & last Name has the combination of alphanumeric and spaces"); 
			String randomMailAddress22 = generateRandomEmailAddress();

			registrationPage.fillSignUpForm(firstNameAlphanumericwithSpace, lastNameAlphanumericwithSpace, randomMailAddress22, password);

			registrationPage.submitSignUpForm();

			emailSentConfirmationPage.verify_InvestorResigtrationEmailSentConfirmPage_displayed();

			navigateBack();

			refreshPage();

			registrationPage.verify_SignUpPage_displayed();

			refreshPage();

			registrationPage.clear_Signupform();



			//HTCHR_ES_SCR_001_TC_030
			testStepInfo("HTCHR_ES_SCR_001_TC_030 -->"+"Verify if the mandatory field First & last Name has special characters, symbols and spaces in it.");
			String randomMailAddress15 = generateRandomEmailAddressWithNumbers();

			registrationPage.fillSignUpForm(firstNameSpecialCharcterswithSpace, lastNameSpecialCharcterswithSpace, randomMailAddress15, password);

			registrationPage.submitSignUpForm();

			emailSentConfirmationPage.verify_InvestorResigtrationEmailSentConfirmPage_displayed();

			navigateBack();

			refreshPage();

			registrationPage.verify_SignUpPage_displayed();

			refreshPage();

			registrationPage.clear_Signupform();


			//HTCHR_ES_SCR_001_TC_031
			testStepInfo("HTCHR_ES_SCR_001_TC_031  -->"+"Verify the email with different domains");
			registrationPage.fillSignUpForm(firstName, lastName, emailIddifferentdomain, password);

			registrationPage.submitSignUpForm();

			emailSentConfirmationPage.verify_InvestorResigtrationEmailSentConfirmPage_displayed();

			navigateBack();

			refreshPage();

			registrationPage.verify_SignUpPage_displayed();

			refreshPage();

			registrationPage.clear_Signupform();


			//HTCHR_ES_SCR_001_TC_032
			testStepInfo("HTCHR_ES_SCR_001_TC_032  -->"+"Verify the email field accepts multiple spl chars.");
			registrationPage.fillSignUpForm(firstName, lastName, emailIdSpecialCharacters, password);

			registrationPage.verify_Email_inValid_errormessage_displayed();

			registrationPage.verify_SignUpPage_displayed();

			refreshPage();

			registrationPage.clear_Signupform();



			//HTCHR_ES_SCR_001_TC_033
			testStepInfo("HTCHR_ES_SCR_001_TC_033  -->"+"Verify whether the email field accepts symbols.");
			registrationPage.fillSignUpForm(firstName, lastName, emailIdwithSymbols, password);

			registrationPage.submitSignUpForm();

			emailSentConfirmationPage.verify_InvestorResigtrationEmailSentConfirmPage_displayed();

			navigateBack();

			refreshPage();

			registrationPage.clear_Signupform();


			//HTCHR_ES_SCR_001_TC_034
			testStepInfo("HTCHR_ES_SCR_001_TC_034  -->"+"Verify the form with invalid last name and other field with valid data.");
			String randomMailAddress16 = generateRandomEmailAddress();

			registrationPage.fillSignUpForm(firstNameInvalid, lastNameInvalid, randomMailAddress16, password);

			registrationPage.submitSignUpForm();

			emailSentConfirmationPage.verify_InvestorResigtrationEmailSentConfirmPage_displayed();

			navigateBack();

			refreshPage();

			registrationPage.verify_SignUpPage_displayed();

			refreshPage();

			registrationPage.clear_Signupform();

			//HTCHR_ES_SCR_001_TC_035
			testStepInfo("HTCHR_ES_SCR_001_TC_035  -->"+"Verify the form throws error if already existing email is entered.");
			registrationPage.fillSignUpForm(firstName, lastName, alreadyRegisteredEmailAddress, password);

			registrationPage.submitSignUpForm();

			registrationPage.verify_email_already_registered_errormessage_displayed();

			waitTime(2);

			registrationPage.verify_SignUpPage_displayed();

			registrationPage.clear_Signupform();


		/*	//HTCHR_ES_SCR_001_TC_037
			testStepInfo("HTCHR_ES_SCR_001_TC_037 -->"+"Verify first name, last name, Email ID with valid data and show password displays the encrypted data");
					

			String randomMailAddress13 = generateRandomEmailAddress3();

			registrationPage.fillSignUpForm(firstName, lastName, randomMailAddress13, password);

			registrationPage.verify_password_textbox_passwordType_displayed();

			registrationPage.verify_SignUpPage_displayed();

			registrationPage.clear_Signupform();*/

			//HTCHR_ES_SCR_001_TC_039

			testStepInfo("HTCHR_ES_SCR_001_TC_039 -->"+"Verify first name, last name, Email ID with valid data and password strength should not be displayed as weak for lesser than the minimum range (i.e.) lesser than 8 digits");
			

			String randomMailAddress19 = generateRandomEmailAddress();

			registrationPage.fillSignUpForm(firstName, lastName, randomMailAddress19, invalidShortCharacterPassword);

			registrationPage.verify_Password_inValid_errormessage_displayed();

			registrationPage.verify_SignUpPage_displayed();

			registrationPage.click_Application_Logo();

			mainPage.verify_MainPage_displayed();

			mainPage.click_FindInvestors_QuickLink();

			registrationPage.verify_SignUpPage_displayed();

			registrationPage.click_login_button();

			loginPage.verify_LoginPage_displayed();

			navigateBack();

			refreshPage();

			registrationPage.verify_SignUpPage_displayed();



			//HTCHR_ES_SCR_001_TC_040
			testStepInfo("HTCHR_ES_SCR_001_TC_040-->"+"Verify password with invalid data and punctuation mark for alert message");
			String randomMailAddress10 = generateRandomEmailAddress();

			registrationPage.fillSignUpForm(firstName, lastName, randomMailAddress10, invalidLongCharacterPassword);

			registrationPage.verify_Password_inValid_errormessage_displayed();

			registrationPage.verify_SignUpPage_displayed();

			registrationPage.clear_Signupform();

			String randomMailAddress11 = generateRandomEmailAddress();

			registrationPage.fillSignUpForm(firstName, lastName, randomMailAddress11, valid12DigitPassword);

			registrationPage.submitSignUpForm();

			emailSentConfirmationPage.verify_InvestorResigtrationEmailSentConfirmPage_displayed();

			navigateBack();

			refreshPage();

			registrationPage.verify_SignUpPage_displayed();

			registrationPage.clear_Signupform();

			//HTCHR_ES_SCR_001_TC_040	- Failed 

			//HTCHR_ES_SCR_001_TC_042 - Deferred
			//HTCHR_ES_SCR_001_TC_044 to 46 - Automation Feasibility no.



			//HTCHR_ES_SCR_001_TC_047
			testStepInfo("HTCHR_ES_SCR_001_TC_047  -->"+"Verify Home button of the signup page gets clicked and landed successfully redirects to the home page. ");
			registrationPage.click_Application_Logo();

			mainPage.verify_MainPage_displayed();
			mainPage.click_FindInvestors_QuickLink();

			//HTCHR_ES_SCR_001_TC_049
			testStepInfo("HTCHR_ES_SCR_001_TC_049  -->"+"Verify the place holder text doesnt have any spell check");
			registrationPage.verify_elements_placeholderText_displayed();

			registrationPage.verify_SignUpPage_displayed();


			//HTCHR_ES_SCR_001_TC_050
			testStepInfo("HTCHR_ES_SCR_001_TC_050  -->"+"Verify the login button is clicked.");
			registrationPage.click_login_button();

			loginPage.verify_LoginPage_displayed();

			navigateBack();

			refreshPage();

			registrationPage.verify_SignUpPage_displayed();

			registrationPage.clear_Signupform();

			//HTCHR_ES_SCR_001_TC_054
			testStepInfo("HTCHR_ES_SCR_001_TC_054 -->"+"Verify all validations and alert messages color");
			String randomMailAddress17 = generateRandomEmailAddress();

			registrationPage.fillSignUpForm(firstName, lastName, randomMailAddress17, password);

			registrationPage.submitSignUpForm();

			emailSentConfirmationPage.verify_InvestorResigtrationEmailSentConfirmPage_displayed();

			navigateBack();

			refreshPage();

			registrationPage.verify_SignUpPage_displayed();

			registrationPage.clear_Signupform();

			//TC_055-automation feasibility -No
			//HTCHR_ES_SCR_001_TC_056, HTCHR_ES_SCR_001_TC_057, HTCHR_ES_SCR_001_TC_058
			testStepInfo("HTCHR_ES_SCR_001_TC_056,57 and 58  -->"+"Verify all the fields except password contain spaces");
			registrationPage.fillSignUpForm(firstNamewithSpace, lastNamewithSpace, emailIdwithSpace, password);

			registrationPage.submitSignUpForm();

			emailSentConfirmationPage.verify_InvestorResigtrationEmailSentConfirmPage_displayed();

			navigateBack();

			refreshPage();

			registrationPage.verify_SignUpPage_displayed();

			refreshPage();

			registrationPage.clear_Signupform();


			//HTCHR_ES_SCR_001_TC_059
			testStepInfo("HTCHR_ES_SCR_001_TC_059-->"+"Verify password accepts spaces.");
			String randomMailAddress14 = generateRandomEmailAddress();

			registrationPage.fillSignUpForm(firstName, lastName, randomMailAddress14, invalidShortCharacterPassword);

			registrationPage.verify_Password_inValid_errormessage_displayed();

			registrationPage.verify_SignUpPage_displayed();

			registrationPage.clear_Signupform();

			//HTCHR_ES_SCR_001_TC_060
			testStepInfo("HTCHR_ES_SCR_001_TC_060-->"+"Verify ");
			String randomMailAddress12 = generateRandomEmailAddress3();

			registrationPage.fillSignUpForm(firstName, lastName, randomMailAddress12, password);

			registrationPage.submitSignUpForm();

			emailSentConfirmationPage.verify_InvestorResigtrationEmailSentConfirmPage_displayed();

			navigateBack();

			refreshPage();

			registrationPage.verify_SignUpPage_displayed();

			registrationPage.clear_Signupform();

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