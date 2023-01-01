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


public class HTCHR_IS_SCR_002_TC_011_To_014_Test extends ApplicationKeywords
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


	public HTCHR_IS_SCR_002_TC_011_To_014_Test(BaseClass obj) 
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
			testStepInfo("HTCHR_IS_SCR_002_TC_011  -->"+"Verify if the cursor swaps to next field on clicking tab");
			mainPage.verify_MainPage_displayed();
			mainPage.click_CreateaFund_QuickLink();
			registrationPage.verify_SignUpPage_displayed();
			registrationPage.verify_PlaceHolder_After_Pressing_Tab();			
			refreshPage();
			
			testStepInfo("HTCHR_IS_SCR_002_TC_012  -->"+"Verify if the cursor swaps to previous field on clicking Shift+ tab");			
			registrationPage.verify_SignUpPage_displayed();
			registrationPage.verify_PlaceHolder_After_Pressing_Shift_And_Tab();			
			refreshPage();			
			
			testStepInfo("HTCHR_IS_SCR_002_TC_013  -->"+"Verify if all the fields on sign up page has place holder text ( First, Last name, Email Id and password)");			
			registrationPage.verify_SignUpPage_displayed();			
			registrationPage.verify_elements_placeholderText_displayed();			
			refreshPage();
			
			testStepInfo("HTCHR_IS_SCR_002_TC_014  -->"+"Verify if all the fields on sign up page has mandatory symbol indications - *( First, Last name, Email Id and password)");			
			registrationPage.verify_SignUpPage_displayed();			
			registrationPage.verify_elements_mandatory_asterisk_mark_displayed();
						
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