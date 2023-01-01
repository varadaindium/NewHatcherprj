package scenarios.investorsignup;

import iSAFE.ApplicationKeywords;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import baseClass.BaseClass;

import pages.MainPage;
import pages.RegistrationPage;
import pages.EmailSentConfirmationPage;
import pages.LoginPage;
import pages.UserProfilePage;
import pages.SettingsPage;
import pages.HomePage;


public class HTCHR_IS_SCR_003_TC_018_To_060_Test extends ApplicationKeywords
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

	public HTCHR_IS_SCR_003_TC_018_To_060_Test(BaseClass obj) 
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

			String randomNumberForFirstName = generateRandomNumbersasString(7);
			String randomNumberForLastName = generateRandomNumbersasString(7);

			String emailAddressWithSpace = retrieve("emailAddressWithSpace");
			String firstNamewithSpaceAndNumeric =  retrieve("firstNamewithSpaceAndNumeric");
			String lastNamewithSpaceAndNumeric =  retrieve("lastNamewithSpaceAndNumeric");

			String invalidShortCharacterPassword = retrieve("invalidShortCharacterPassword");	
			String invalidLongCharacterPassword = retrieve("invalidLongCharacterPassword");
			String valid12DigitPassword = retrieve("valid12DigitPassword");
			String alreadyRegisteredEmailAddress = retrieve("alreadyRegisteredEmailAddress");
			String emailIdSpecialCharacters = retrieve("emailIdSpecialCharacters");

			String invalidShortEmailID = retrieve("invalidShortEmailID");
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
			mainPage.verify_MainPage_displayed();
			mainPage.click_CreateaFund_QuickLink();
			testStepInfo("HTCHR_IS_SCR_003_TC_018  -->"+"Verify the fields on sign up page has character restrictions in Password field as per requirement");
			registrationPage.verify_SignUpPage_displayed();
			String randomMailAddress = generateRandomEmailAddress();
			registrationPage.fillSignUpForm(firstName, lastName, randomMailAddress, invalidLongCharacterPassword);
			registrationPage.verify_Password_inValid_errormessage_displayed();
			refreshPage();
			registrationPage.clear_Signupform();

			testStepInfo("HTCHR_IS_SCR_003_TC_019  -->"+"Verify if all the fields on sign up page has only numerical alone ( First, Last name)");
			registrationPage.fillSignUpForm(randomNumberForFirstName, randomNumberForLastName, generateRandomEmailAddress(), password);
			registrationPage.submitSignUpForm();
			registrationPage.verifySignupSuccesfully();
			
			testStepInfo("HTCHR_IS_SCR_003_TC_020  -->"+"Verify if the mandatory field Email ID has @ and .com In the allowed sequence");
			registrationPage.openSignUpPage();
			registrationPage.verify_SignUpPage_displayed();
			registrationPage.fillSignUpFormforInvalidEmailAddress(firstName, lastName, invalidShortEmailID, password);
			registrationPage.verify_Email_inValid_errormessage_displayed();
			refreshPage();
			registrationPage.clear_Signupform();
			registrationPage.verify_SignUpPage_displayed();
			registrationPage.fillSignUpForm(firstName, lastName, generateRandomEmailAddress(), password);
			registrationPage.submitSignUpForm();
			registrationPage.verifySignupSuccesfully();
		
			testStepInfo("HTCHR_IS_SCR_003_TC_021  -->"+"Verify the Email ID field should accept both .com as well as .co with @ symbol");
			registrationPage.openSignUpPage();
			registrationPage.verify_SignUpPage_displayed();
			registrationPage.fillSignUpForm(firstName, lastName, generateRandomEmailAddresswithCo(), password);
			registrationPage.submitSignUpForm();
			registrationPage.verifySignupSuccesfully();
		
			testStepInfo("HTCHR_IS_SCR_003_TC_022  -->"+"Verify all fields ( First , Last name, Password) are valid and Email is invalid");
			registrationPage.openSignUpPage();
			registrationPage.verify_SignUpPage_displayed();
			registrationPage.fillSignUpFormforInvalidEmailAddress(firstName, lastName, invalidShortEmailID, password);
			registrationPage.verify_Email_inValid_errormessage_displayed();			

			testStepInfo("HTCHR_IS_SCR_003_TC_023  -->"+"Verify if all the fields on sign up page has only special characters alone ( First, Last name, Email Id )");
			refreshPage();
			registrationPage.clear_Signupform();
			registrationPage.verify_SignUpPage_displayed();
			registrationPage.fillSignUpFormforInvalidEmailAddress(firstnameSpecialCharacters, lastnameSpecialCharacters, specialCharacterText, password);
			registrationPage.verify_Email_inValid_errormessage_displayed();

			testStepInfo("HTCHR_IS_SCR_003_TC_024  -->"+"Verify first name, last name, Email Id is valid with an invalid password field");
			refreshPage();
			registrationPage.clear_Signupform();
			registrationPage.verify_SignUpPage_displayed();
			registrationPage.fillSignUpFormforInvalidEmailAddress(firstName, lastName, emailAddress, invalidLongCharacterPassword);
			registrationPage.verify_Password_inValid_errormessage_displayed();
			
			testStepInfo("HTCHR_IS_SCR_003_TC_025  -->"+"Verify first name, last name, Email Id is valid with an valid password field");
			refreshPage();
			registrationPage.clear_Signupform();
			registrationPage.verify_SignUpPage_displayed();
			registrationPage.fillSignUpForm(firstName, lastName, generateRandomEmailAddress(), password);
			registrationPage.submitSignUpForm();
			registrationPage.verifySignupSuccesfully();

			testStepInfo("HTCHR_IS_SCR_003_TC_027  -->"+"Verify if the mandatory field First & last Name, Email ID, Password accepts the combination of both upper case and lower case alphabets");
			registrationPage.openSignUpPage();
			registrationPage.verify_SignUpPage_displayed();
			registrationPage.fillSignUpForm(firstName, lastName, generateRandomEmailAddress(), password);
			registrationPage.submitSignUpForm();
			registrationPage.verifySignupSuccesfully();

			testStepInfo("HTCHR_IS_SCR_003_TC_028  -->"+"Verify if the mandatory field First & last Name has the combination of alphanumeric and special characters");
			registrationPage.openSignUpPage();
			registrationPage.verify_SignUpPage_displayed();
			registrationPage.fillSignUpForm(firstName+randomNumberForFirstName+specialCharacterText, lastName+randomNumberForLastName+specialCharacterText, generateRandomEmailAddress(), password);
			registrationPage.submitSignUpForm();
			registrationPage.verifySignupSuccesfully();

			testStepInfo("HTCHR_IS_SCR_003_TC_029  -->"+"Verify if the mandatory field \"First & last Name\" has the combination of alphanumeric and spaces in between");
			registrationPage.openSignUpPage();
			registrationPage.verify_SignUpPage_displayed();
			registrationPage.fillSignUpForm(firstNamewithSpaceAndNumeric, lastNamewithSpaceAndNumeric, generateRandomEmailAddress(), password);
			registrationPage.submitSignUpForm();
			registrationPage.verifySignupSuccesfully();

			testStepInfo("HTCHR_IS_SCR_003_TC_030  -->"+"Verify if the mandatory field First & last Name has the combination of special characters, symbols and spaces in between both");
			registrationPage.openSignUpPage();
			registrationPage.verify_SignUpPage_displayed();
			registrationPage.fillSignUpForm(firstNamewithSpaceAndNumeric+ " " +specialCharacterText, lastNamewithSpaceAndNumeric+ " " +specialCharacterText, generateRandomEmailAddress(), password);
			registrationPage.submitSignUpForm();
			registrationPage.verifySignupSuccesfully();

			testStepInfo("HTCHR_IS_SCR_003_TC_031  -->"+"Verify if the Email ID field has some other domain name apart from (.com and .co)");
			registrationPage.openSignUpPage();
			registrationPage.verify_SignUpPage_displayed();
			registrationPage.fillSignUpForm(firstName,lastName,generateRandomEmailAddressWithOtherDomain(),password);
			registrationPage.submitSignUpForm();
			registrationPage.verifySignupSuccesfully();
			
			testStepInfo("HTCHR_IS_SCR_003_TC_032  -->"+"Verify if the Email ID field has multiple special characters");
			registrationPage.openSignUpPage();
			registrationPage.verify_SignUpPage_displayed();
			registrationPage.fillSignUpForm(firstName,lastName,generateRandomEmailAddressWithSpecialCharacter(),password);
			registrationPage.submitSignUpForm();
			registrationPage.verifySignupSuccesfully();

			//HTCHR_IS_SCR_003_TC_033  - functional issue
			//HTCHR_IS_SCR_003_TC_034  - functional issue

			testStepInfo("HTCHR_IS_SCR_003_TC_035  -->"+"Verify the Email ID field restricts when same Email ID been used again");
			registrationPage.openSignUpPage();
			registrationPage.verify_SignUpPage_displayed();
			registrationPage.fillSignUpForm(firstName, lastName, alreadyRegisteredEmailAddress, password);
			registrationPage.submitSignUpForm();
			registrationPage.verify_email_already_registered_errormessage_displayed();
			//HTCHR_IS_SCR_001_TC_036 -  HTCHR_IS_SCR_001_TC_037 - HTCHR_IS_SCR_001_TC_038 - HTCHR_IS_SCR_001_TC_039

			//HTCHR_IS_SCR_001_TC_040

			testStepInfo("HTCHR_IS_SCR_003_TC_040  -->"+"Verify first name, last name, Email ID with password field as invalid data, Validations, alert messages doesn't include any unwanted punctuations");			

			registrationPage.openSignUpPage();
			registrationPage.verify_SignUpPage_displayed();
			registrationPage.fillSignUpForm(firstName, lastName, generateRandomEmailAddress(), invalidShortCharacterPassword);
			registrationPage.verify_Password_inValid_errormessage_displayed();

			//HTCHR_IS_SCR_001_TC_041 //HTCHR_IS_SCR_001_TC_042 //HTCHR_IS_SCR_001_TC_043,44,45,46

			//HTCHR_IS_SCR_001_TC_047
			testStepInfo("HTCHR_IS_SCR_003_TC_047  -->"+"Verify the home button which is on left side of signup redirects to the homepage");			
			registrationPage.openSignUpPage();
			registrationPage.click_Application_Logo();
			mainPage.verify_MainPage_displayed();			

			//HTCHR_IS_SCR_001_TC_048

			//HTCHR_IS_SCR_001_TC_049 - placeholder

			//HTCHR_IS_SCR_001_TC_050 - Deferred

			//HTCHR_IS_SCR_001_TC_051 - Copy Url to New tab
			//HTCHR_IS_SCR_001_TC_052 , 53, 54, 55 - Deferred

		//HTCHR_IS_SCR_001_TC_056

			testStepInfo("HTCHR_IS_SCR_003_TC_056  -->"+"Verify First Name field accepts space value");			

			registrationPage.openSignUpPage();
			registrationPage.verify_SignUpPage_displayed();
			registrationPage.fillSignUpForm(firstNamewithSpaceAndNumeric, lastName, generateRandomEmailAddress(), password);
			registrationPage.submitSignUpForm();
			registrationPage.verifySignupSuccesfully();

			//HTCHR_IS_SCR_001_TC_057

			testStepInfo("HTCHR_IS_SCR_003_TC_057  -->"+"Verify Last Name field accepts space value");			

			registrationPage.openSignUpPage();
			registrationPage.verify_SignUpPage_displayed();
			registrationPage.fillSignUpForm(firstName, lastNamewithSpaceAndNumeric, generateRandomEmailAddress(), password);
			registrationPage.submitSignUpForm();
			registrationPage.verifySignupSuccesfully();
		//HTCHR_IS_SCR_001_TC_058

			testStepInfo("HTCHR_IS_SCR_003_TC_058  -->"+"Verify email field accepts space value");		
			registrationPage.openSignUpPage();
			registrationPage.verify_SignUpPage_displayed();
			registrationPage.fillSignUpForm(firstName, lastName, emailAddressWithSpace, password);
			registrationPage.submitSignUpForm();

			//HTCHR_IS_SCR_001_TC_059

			testStepInfo("HTCHR_IS_SCR_003_TC_059  -->"+"Verify password field accepts space value");			
			registrationPage.openSignUpPage();
			registrationPage.verify_SignUpPage_displayed();
			registrationPage.fillSignUpForm(firstName, lastName, generateRandomEmailAddress(), password+" ");
			registrationPage.submitSignUpForm();
			registrationPage.verifySignupSuccesfully();

			//HTCHR_IS_SCR_001_TC_060

			testStepInfo("HTCHR_IS_SCR_003_TC_060  -->"+"Verify first name, last name, Email ID with password field as valid data and sign up by Enter button");			
			registrationPage.openSignUpPage();
			registrationPage.verify_SignUpPage_displayed();
			registrationPage.fillSignUpForm(firstName, lastName, generateRandomEmailAddress(), password);
			registrationPage.click_SignUp_buttonwithEnterKey();
			registrationPage.verifySignupSuccesfully();

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