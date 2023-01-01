package pages;
import iSAFE.ApplicationKeywords;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;

public class RegistrationPage extends ApplicationKeywords
{	
	private static final String lnk_Application_Logo = "Application Logo#xpath=//nav[contains(@class,'navbar')]//div[contains(@class,'header-syndicate-logo-wrapper')]//a";
	private static final String btn_Login = "Login Button#xpath=//nav[contains(@class,'navbar')]//a[contains(@href,'login')]";
	private static final String lbl_signUp_Header = "Sign up Header#xpath=//h2[contains(text(),'Sign up')]";
	private static final String lbl_SignUpForm_FirstName = "First Name Label in Sign Up Form#xpath=//div[contains(@class,'application-form-container')]//label[contains(@for,'apply_first_name')]";
	private static final String lbl_SignUpForm_LastName = "Last Name Label in Sign Up Form#xpath=//div[contains(@class,'application-form-container')]//label[contains(@for,'apply_last_name')]";
	private static final String lbl_SignUpForm_EmailAddress = "Email Address Label in Sign Up Form#xpath=//div[contains(@class,'application-form-container')]//label[contains(@for,'email-address')]";
	private static final String lbl_SignUpForm_Password = "Password Label in Sign Up Form#xpath=//div[contains(@class,'application-form-container')]//div[contains(@class,'password-component')]//label";
	private static final String txt_signUpForm_FirstName = "First Name Textbox in Sign Up Form#id=apply_first_name";
	private static final String txt_signUpForm_LastName = "Last Name Textbox in Sign Up Form#id=apply_last_name";
	private static final String txt_signUpForm_EmailAddress = "Email Address Textbox in Sign Up Form#xpath=//input[@placeholder='Enter email address']";
	private static final String txt_signUpForm_Password = "Password Textbox in Sign Up Form#xpath=//input[@placeholder='Enter Password']";
	private static final String btn_signUpForm_SignUp = "Sign Up button in Sign Up Form#xpath=//button[contains(text(),'Sign Up')]";
	private static final String btn_signUp_InLoginForm = "Sign Up button in Sign Up Form#xpath=//a[contains(text(),'Sign up')]";
	private static final String lnk_login = "Login Link in Sign Up#xpath=//div[contains(@class,'application-form-container')]//a[contains(text(),'Log In')]";
	private static final String lbl_signUp_InValid_Email_Error_Message = "Invalid Email Address Error message label#xpath=//span[contains(text(),'Must be a valid email')]";
	private static final String lbl_signUp_InValid_Password_Error_Message = "Invalid Password Address Error message label#xpath=//span[contains(text(),'Password should be min. 8 and max. 20 characters')]";
	private static final String lbl_signUp_Email_AlreadyRegistered_Error_Message = "email already registered Error message label#xpath=//span[contains(text(),'Account already exists. Click')]";
	private static final String lbl_firstNamePlaceholdertext = "First Name Placeholder in Sign Up Form#id=apply_first_name";
	private static final String lbl_lastNamePlaceholdertext = "Last Name Placeholder in Sign Up Form#id=apply_last_name";
	private static final String lbl_emailPlaceholdertext = "Email Address Placeholder in Sign Up Form#xpath=//input[@placeholder='Enter email address']";
	private static final String lbl_passwordPlaceholdertext = "Password Placeholder in Sign Up Form#xpath=//input[@placeholder='Enter Password']";
	private static final String lbl_firstNameMandatoryMark = "First Name Mandatory Mark#xpath=//span[contains(text(),'First Name')]";
	private static final String lbl_lastNameMandatoryMark = "Last Name Mandatory Mark #xpath=//span[contains(text(),'Last Name')]";
	private static final String lbl_emailAddressMandatoryMark = "Email Mandatory Mark #xpath=//span[contains(text(),'Email Address')]";
	private static final String lbl_passwordMandatoryMark = "Password Mandatory Mark#xpath=//label[contains(text(),'Password')]";
	private static final String txt_passwordtype = "Password Type#xpath=/input[contains(@label,'Password')]";
	private static final String lbl_verifyEmailAddress = "Verify Email Address#xpath=//h2[contains(text(),'Verify your email address')]";
	
	
	public RegistrationPage(BaseClass obj) 
	{
		super(obj);
	}

	/**
	 *This method is used to verify the Sign Up page.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_SignUpPage_displayed()	{

		try {
			waitForElementToDisplay(lbl_signUp_Header, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_signUp_Header))
			{
				testStepPassed("Sign Up page is displayed");	
			}	else testStepFailed("Sign Up page is not displayed");	} 
		catch (Exception e) 		{

			testStepFailed("Element could not verified."+e.getClass());
			e.printStackTrace();
		}	}

	public void verify_PlaceHolder_After_Pressing_Tab() {
		try 
		{      
			waitForElementToDisplay(txt_signUpForm_FirstName, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_signUpForm_FirstName)) {
				clickOn(txt_signUpForm_FirstName);
				String press = Keys.chord(Keys.TAB);
				enter_FirstName(press);
				String value = driver.switchTo().activeElement().getAttribute("placeholder");       
				if (value.equalsIgnoreCase("Enter last name")) 
				{
					testStepPassed(value+" place holder text is displayed After tab in first name text box");
				}
			}

		}

		catch (NoSuchElementException e) 
		{
			e.printStackTrace();
			testStepFailed("Signup button is not in disabled state in SignUp Page");
		}
	}

	public void verify_PlaceHolder_After_Pressing_Shift_And_Tab() {
		try 
		{      
			waitForElementToDisplay(txt_signUpForm_LastName, this.elementLoadWaitTime);
			if (isElementDisplayed(txt_signUpForm_LastName)) {
				clickOn(txt_signUpForm_LastName);
				String press = Keys.chord(Keys.SHIFT,Keys.TAB);
				enter_LastName(press);
				String value = driver.switchTo().activeElement().getAttribute("placeholder");       
				if (value.equalsIgnoreCase("Enter first name")) 
				{
					testStepPassed(value+" place holder text is displayed After Shift + tab in Last name text box");
				}
			}

		}

		catch (NoSuchElementException e) 
		{
			e.printStackTrace();
			testStepFailed("Signup button is not in disabled state in SignUp Page");
		}
	}


	/**
	 *This method is used to verify the logo.
	 *
	 *@author VijayaKumar.U
	 */
	//--------------------Edited By Priya.V--If-Else -Block-----------//
	public void click_Application_Logo()	{
		try {
			waitForElementToDisplay(lnk_Application_Logo, this.elementLoadWaitTime);
			if(isElementDisplayed(lnk_Application_Logo))
			{
				testStepPassed("Hatcher Application Logo is displayed");	
				clickOn(lnk_Application_Logo); //Newly added
			}	else testStepFailed("Hatcher Application Logo is not displayed");	} 
		catch (Exception e) 		{

			testStepFailed("Element could not verified."+e.getClass());
			e.printStackTrace();
		}	}
	/**
	 *This method is used to verify the login button.
	 *
	 *@author VijayaKumar.U
	 */
	public void click_login_button()	{
		try {
			waitForElementToDisplay(btn_Login, this.elementLoadWaitTime);
			clickOn(btn_Login);
		}
		catch (Exception e) 		{
			testStepFailed("Login button is not displayed"+e.getClass());
		}	}
	/**
	 *This method is used to enter the first name.
	 *
	 *@param firstname.
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_FirstName(String firstName)	{
		try {
			waitForElementToDisplay(txt_signUpForm_FirstName, this.elementLoadWaitTime);
			if(!firstName.isEmpty()) {
				typeIn(txt_signUpForm_FirstName, firstName);
				testStepPassed("The firstname is entered.");	
			}
		}
		catch (Exception e) 		{
			testStepFailed("could not enter the firstname."+e.getClass());
		}	}
	/**
	 *This method is used to enter the last name.
	 *
	 *@param last name.
	 *@author VijayaKumar.U
	 */
	public void enter_LastName(String lastName)	{
		try {
			waitForElementToDisplay(txt_signUpForm_LastName, this.elementLoadWaitTime);
			if(!lastName.isEmpty()) {
				typeIn(txt_signUpForm_LastName, lastName);
				testStepPassed("The lastname is entered.");
			}
		}
		catch (Exception e){
			testStepFailed("could not enter the last name ."+e.getClass());
		}	}
	/**
	 *This method is used to enter the email.
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_Email(String email)	{
		try {
			waitForElementToDisplay(txt_signUpForm_EmailAddress, this.elementLoadWaitTime);
			typeIn(txt_signUpForm_EmailAddress, email);
			testStepPassed("Email is entered.");
		}
		catch (Exception e) 		{
			testStepFailed("could not enter emaildetails ."+e.getClass());
		}	}	
	/**
	 *This method is used to enter the password.
	 *
	 *@author VijayaKumar.U
	 */
	public void enter_Password(String password)	{
		try {
			waitForElementToDisplay(txt_signUpForm_Password, this.elementLoadWaitTime);
		
			//typeInMaskedData(txt_signUpForm_Password, password);
		
		typeIn(txt_signUpForm_Password, password);
			testStepPassed("Password is entered.");
		}
		catch (Exception e) 		{
			testStepFailed("could not enter the password in the form ."+e.getClass());
		}	}
	/**
	 *This method is used to click sign Up button.
	 *
	 *@author VijayaKumar.U
	 */
	//--------------Edited By Priya.V--------If-Else-Blcok added---------//
	public void click_SignUp_button()	{
		try {
			scrolltoElementView(findWebElement(btn_signUpForm_SignUp));   //newly added			
			waitForElementToDisplay(btn_signUpForm_SignUp, this.elementLoadWaitTime);
			if(isElementDisplayed(btn_signUpForm_SignUp)) {
				clickOn(btn_signUpForm_SignUp);
				testStepPassed("Successfully Signed in.");
			}else {
				testStepFailed("could not signin.Try Again");
			}
		}
		catch (Exception e) 		{
			testStepFailed("could not verify sign up element ."+e.getClass());
			e.printStackTrace();
		}	}	
	
	public void click_SignUp_buttonwithEnterKey()	{
		try {
			scrolltoElementView(findWebElement(btn_signUpForm_SignUp));   //newly added			
			waitForElementToDisplay(btn_signUpForm_SignUp, this.elementLoadWaitTime);
			if(isElementDisplayed(btn_signUpForm_SignUp)) {
				String press = Keys.chord(Keys.ENTER);
				driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).sendKeys(press);
				testStepPassed("Successfully Signed in.");
			}else {
				testStepFailed("could not signin.Try Again");
			}
		}
		catch (Exception e) 		{
			testStepFailed("could not verify sign up element ."+e.getClass());
			e.printStackTrace();
		}	}
	/**
	 *This method is used to verify the login link.
	 *
	 *@author VijayaKumar.U
	 */
	//-----------Edited by Priya.V----------If-Else block added---------//
	public void click_login_Link()	{
		try {
			waitForElementToDisplay(lnk_login, this.elementLoadWaitTime);
			if(isElementDisplayed(lnk_login)) {
				clickOn(lnk_login);
				testStepPassed("Login link is verified.");
			}else {
				testStepFailed("could not Login.Try Again");}
		}
		catch (Exception e) 		{
			testStepFailed("could not verify the login link."+e.getClass());
			e.printStackTrace();
		}	}
	/**
	 *This method is used to clear the signup form.
	 *
	 *@author VijayaKumar.U
	 */
	public void clear_Signupform()	{
		try {
			clearEditBox(txt_signUpForm_FirstName);
			clearEditBox(txt_signUpForm_LastName);
			clearEditBox(txt_signUpForm_EmailAddress);
			clearEditBox(txt_signUpForm_Password);
			testStepPassed("Successfully cleared the sign up form.");
		}
		catch (Exception e) 		{
			testStepFailed("could not verify whether values are clear in the signup form."+e.getClass());
		}	}	

	/**
	 *This method is used to fill or edit the Sign UpForm
	 *
	 *@param firstName,lastName
	 *@param emailAddress,password
	 *@author VijayaKumar.U
	 */
	
	public void fillSignUpForm(String firstName, String lastName, String emailAddress, String password)
	{
		try {
			enter_FirstName(firstName);
			enter_LastName(lastName);
			enter_Email(emailAddress);
			enter_Password(password);
			testStepPassed("Successfully entered the Sign up form.");
		}
		catch (Exception e) 		{
			testStepFailed("could not verify whether values entered in the signup form."+e.getClass());
		}	}	
	
	
	public void verify_elements_placeholderText_InUpperCase()  {

        try {

               String[] allplaceholderElements = {lbl_firstNamePlaceholdertext,lbl_lastNamePlaceholdertext,lbl_emailPlaceholdertext,lbl_passwordPlaceholdertext};

               for (String pageholderElement : allplaceholderElements) {

                     if (isElementDisplayed(pageholderElement)) {

                            String value = getAttributeValue(pageholderElement, "placeholder");

                            char[] charArray = value.toCharArray();

                            if(Character.isUpperCase(charArray[0]))      {

                                  testStepPassed(value+ " - placeholder value is begin with upper case");

                            }          } else {

                            testStepFailed(pageholderElement.split("#xpath")[0] + " placeholder was not displayed.");

                     }    }

        } catch (Exception e) {

               e.printStackTrace();

               testStepFailed("Could not verify placeholder elements" + e.getClass());

        }     }
	
		public void fillSignUpFormforInvalidEmailAddress(String firstName, String lastName, String emailAddress, String password)
		{
			try {
				enter_FirstName(firstName);
				enter_LastName(lastName);
				enter_Password(password);
				enter_Email(emailAddress);
				
				testStepPassed("Successfully entered the Sign up form.");
			}
			catch (Exception e) 		{
				testStepFailed("could not verify whether values entered in the signup form."+e.getClass());
			}	}	
	/**
	 *This method is used to submit the sign up form.
	 *
	 *@author VijayaKumar.U
	 */
	public void submitSignUpForm()	{
		try {
			click_SignUp_button();
			testStepPassed("Successfully submitted the Sign up form.");
		}
		catch (Exception e) 	
		{
			testStepFailed("could not verify submission of the signup form."+e.getClass());
		}	}

	public void verifySignupSuccesfully()	{
		try {
			waitForElement(lbl_verifyEmailAddress);
			if(isElementDisplayed(lbl_verifyEmailAddress)) {
				testStepPassed("Email has been sent to provided mail id");				
			}
		}
		catch (Exception e) 	
		{
			testStepFailed("could not verify submission of the signup form."+e.getClass());
		}	}
	/**
	 *This method is used to verify the display of elements .
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_elements_displayed()	{
		String elements = "apply_first_name,apply_last_name,Email Address,Password";
		String[] elementText = elements.split(",");
		int elementCount = elementText.length;
		for (int i = 0; i < elementCount; i++) 
		{
			String elementname = elementText[i];
			String locator = "//div[contains(@class,'application-form-container')]//input[contains(@id,'apply_first_name')]";
		}	}
	/**
	 *This method is used to verify display of the signup page elements.
	 *
	 *@author VijayaKumar.U
	 */
	//------------------Edited by Priya.V------Code enhancement using for loop-----------//
	//Display of SignUp Page Elements//

	public void verify_SignUp_Page_elements_displayed()	{
		try {
			String[] allSignUpPageElements = {txt_signUpForm_FirstName,txt_signUpForm_LastName,txt_signUpForm_EmailAddress,txt_signUpForm_Password,btn_signUpForm_SignUp,lnk_login};
			scrolltoElementView(findWebElement(btn_signUpForm_SignUp));   //newly added			

			for (String elementTobeVerified : allSignUpPageElements) {
				if (isElementDisplayed(elementTobeVerified)) {

					testStepPassed(elementTobeVerified.split("#xpath")[0] + " was displayed on the Sign In page");
				} else {
					testStepFailed(elementTobeVerified.split("#xpath")[0] + " was not displayed on the Sign In page");
				}	

			} }
		catch (Exception e) {
			testStepFailed("sign up Page elements could not be verified");
			e.printStackTrace();
		}}

	/**
	 *This method is used to verify the disable of the signup button.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_SignUp_button_isDisabled(){
		try 		{
			String signUpButtonStatus = getAttributeValue(btn_signUpForm_SignUp, "disabled");
			if (signUpButtonStatus.equals("true")){
				testStepPassed("Signup button is in disabled state in SignUp Page");
			}		} 
		catch (Exception e) {
			testStepFailed("Signup button is not in disabled state in SignUp Page");
		}
	}
	/**
	 *This method is used to verify display of elements in placeholder text.
	 *
	 *@author VijayaKumar.U
	 */
	//-------Edited by Priya.V-----placeholder display method-----//
	//placeholder display//
	public void verify_elements_placeholderText_displayed()	{
		try {
			String[] allplaceholderElements = {lbl_firstNamePlaceholdertext,lbl_lastNamePlaceholdertext,lbl_emailPlaceholdertext,lbl_passwordPlaceholdertext};
			for (String pageholderElement : allplaceholderElements) {
				if (isElementDisplayed(pageholderElement)) {
					testStepPassed(pageholderElement.split("#xpath")[0] + " placeholder was displayed .");
				} else {
					testStepFailed(pageholderElement.split("#xpath")[0] + " placeholder was not displayed.");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			testStepFailed("Could not verify placeholder elements" + e.getClass());
		}
	}
	/*try 		{
			waitForElementToDisplay(txt_SignUpForm_FirstName, this.elementLoadWaitTime);
			String firstNamePlaceholdertext =  getAttributeValue(lbl_firstNamePlaceholdertext, "placeholder");
			if (firstNamePlaceholdertext.equalsIgnoreCase("Enter first name")) 
			{
				testStepPassed("First Name place holder text is displayed in SignUp Page");
			}	else testStepFailed("First Name place holder text is not displayed in SignUp Page");	} 
		catch (Exception e)	{
			testStepFailed("First Name place holder text is not displayed in SignUp Page" + e.getClass());
		}

		try 	{
			waitForElementToDisplay(txt_SignUpForm_LastName, this.elementLoadWaitTime);
			String lastNamePlaceholdertext = getAttributeValue(lbl_lastNamePlaceholdertext, "placeholder");		
			if (lastNamePlaceholdertext.equalsIgnoreCase("Enter last name")) 
			{
				testStepPassed("Last Name place holder text is displayed in SignUp Page");
			}	else testStepFailed("Last Name place holder text is not displayed in SignUp Page");	} 
		catch (Exception e)		{
			testStepFailed("Last Name place holder text is not displayed in SignUp Page" + e.getClass());
		}

		try 	{
			waitForElementToDisplay(txt_SignUpForm_EmailAddress, this.elementLoadWaitTime);
			String emailPlaceholdertext =  getAttributeValue(lbl_emailPlaceholdertext, "placeholder");
			if (emailPlaceholdertext.equalsIgnoreCase("Enter email address")) 
			{
				testStepPassed("Email Address place holder text is displayed in SignUp Page");
			}		else testStepFailed("Email place holder text is not displayed in SignUp Page");} 
		catch (Exception e) 	{
			testStepFailed("Email Address place holder text is not displayed in SignUp Page" + e.getClass());
		}

		try 	{
			waitForElementToDisplay(txt_SignUpForm_Password, this.elementLoadWaitTime);
			String passwordPlaceholdertext =  getAttributeValue(lbl_passwordPlaceholdertext, "placeholder");
			if (passwordPlaceholdertext.equalsIgnoreCase("Enter Password")) 
			{
				testStepPassed("Password place holder text is displayed in SignUp Page");
			}	else testStepFailed("Password place holder text is not displayed in SignUp Page");	} 
		catch (Exception e) 		{
			testStepFailed("Password place holder text is not displayed in SignUp Page" + e.getClass());
		}	}*/

	/**
	 *This method is used to verify the display of elements mandatory.
	 *
	 *@author VijayaKumar.U
	 */
	//--------------Edited by Priya.V -----mandatory_asterisk_mark method--------//
	public void verify_elements_mandatory_asterisk_mark_displayed()	{
		try {
			String[] allAsteriskMarkElements = {lbl_firstNameMandatoryMark,lbl_lastNameMandatoryMark,lbl_emailAddressMandatoryMark,lbl_passwordMandatoryMark,};
			for (String asteriskElement : allAsteriskMarkElements) {
				if (isElementDisplayed(asteriskElement)) {
					testStepPassed(asteriskElement.split("#xpath")[0] + " (Asterisk Mark) Elements was displayed .");
				} else {
					testStepFailed(asteriskElement.split("#xpath")[0] + "(Asterisk Mark) Elements  was not displayed .");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			testStepFailed("Could not verify asterisk_mark elements" + e.getClass());
		}
	}
	/*public void verify_elements_mandatory_asterisk_mark_displayed()	{
		try 		{
			waitForElementToDisplay(lbl_SignUpForm_FirstName, this.elementLoadWaitTime);

			if (getText(lbl_firstNameMandatoryMark).contains("*")) 		{
				testStepPassed("Mandatory Asterisk mark is displayed for First Name in Sign Up Page");
			}	else testStepFailed("Mandatory Asterisk mark is not displayed for First Name in Sign Up Page"); } 
		catch (Exception e)	{
			testStepFailed("Mandatory Asterisk mark is not displayed for First Name in Sign Up Page " + e.getClass());
		}

		try {
			waitForElementToDisplay(lbl_SignUpForm_LastName, this.elementLoadWaitTime);
			if (getText(lbl_lastNameMandatoryMark).contains("*")) 
			{
				testStepPassed("Mandatory Asterisk mark is displayed for Last Name in Sign Up Page");
			}else testStepFailed("Mandatory Asterisk mark is not displayed for Last Name in Sign Up Page");	} 
		catch (Exception e) 	{
			testStepFailed("Mandatory Asterisk mark is not displayed for Last Name in Sign Up Page" + e.getClass());
		}

		try 	{
			waitForElementToDisplay(lbl_SignUpForm_EmailAddress, this.elementLoadWaitTime);
			if (getText(lbl_emailAddressMandatoryMark).contains("*")) 
			{
				testStepPassed("Mandatory Asterisk mark is displayed for Email Address in Sign Up Page");
			}	else testStepFailed("Mandatory Asterisk mark is not displayed for Email Address in Sign Up Page");	} 
		catch (Exception e) 		{
			testStepFailed("Mandatory Asterisk mark is not displayed for Email Address in Sign Up Page" + e.getClass());
		}

		try 		{
			waitForElementToDisplay(lbl_SignUpForm_Password, this.elementLoadWaitTime);
			if (getText(lbl_passwordMandatoryMark).contains("*")) 
			{
				testStepPassed("Mandatory Asterisk mark is displayed for Password in Sign Up Page");
			}	else testStepFailed("Mandatory Asterisk mark is not displayed for Password in Sign Up Page");	} 
		catch (Exception e)	{
			testStepFailed("Mandatory Asterisk mark is not displayed for Password in Sign Up Page" + e.getClass());
		}
	}*/

	/**
	 *This method is used to verify the error message for invalid email entries.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_Email_inValid_errormessage_displayed()	{
		try 		{
			waitForElementToDisplay(lbl_signUp_InValid_Email_Error_Message, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_signUp_InValid_Email_Error_Message))
			{
				testStepPassed("'Must be a valid email' - error message is displayed in Sign Up Page");	
			}
			else testStepFailed("'Must be a valid email' - error message is not displayed in Sign Up Page");
		} 
		catch (Exception e) 
		{
			testStepFailed("'Must be a valid email' - error message is not displayed in Sign Up Page" + e.getClass());
			e.printStackTrace();
		}
	}
	/**
	 *This method is used to verify the display of the error message for invalid password.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_Password_inValid_errormessage_displayed()
	{
		try 
		{scrolltoElementView(findWebElement(lbl_signUp_InValid_Password_Error_Message));
		waitForElementToDisplay(lbl_signUp_InValid_Password_Error_Message, this.elementLoadWaitTime);
		if(isElementDisplayed(lbl_signUp_InValid_Password_Error_Message))
		{
			testStepPassed("'Password should be min. 8 and max. 20 characters' - error message is displayed in Sign Up Page");	
		}
		else testStepFailed("'Password should be min. 8 and max. 20 characters' - error message is not displayed in Sign Up Page");
		} 
		catch (Exception e) 
		{
			testStepFailed("'Password should be min. 8 and max. 20 characters' - error message is not displayed in Sign Up Page "  + e.getClass());
			e.printStackTrace();
		}
	}

	/**
	 *This method is used to verify the error message for atleast exist of email.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_email_already_registered_errormessage_displayed()
	{
		try 
		{
			waitForElementToDisplay(lbl_signUp_Email_AlreadyRegistered_Error_Message, this.elementLoadWaitTime);
			if(isElementDisplayed(lbl_signUp_Email_AlreadyRegistered_Error_Message))
			{
				testStepPassed("Email already registered error message is displayed in Sign Up Page");	
			}
			else testStepFailed("Email already registered error message is not displayed in Sign Up Page");
		} 
		catch (Exception e) 
		{	
			e.printStackTrace();
			testStepFailed("Email already registered error message is not displayed in Sign Up Page " + e.getClass());
		}
	}
	/**
	 *This method is used to verify the display of the password text box.
	 *
	 *@author VijayaKumar.U
	 */
	public void verify_password_textbox_passwordType_displayed()
	{
		try 
		{
			waitForElementToDisplay(txt_signUpForm_Password, this.elementLoadWaitTime);
			String passwordtype =	getAttributeValue(txt_passwordtype, "type");
			if(passwordtype.equalsIgnoreCase("password"))
			{
				testStepPassed("Password text is shown in encrypted format in Sign up Page");	
			}
			else testStepFailed("Password text is not shown in encrypted format in Sign up Page");
		} 
		catch (Exception e) 
		{   e.printStackTrace();
		testStepFailed("Password text is not shown in encrypted format in Sign up Page" + e.getClass());
		}
	}

	//Newly Added - Start

	/**
	 *This method is used to clear, enter data in sign up form
	 *
	 *@author VijayaKumar.U
	 */
	public void clearAndEnterDataInSignUpForm(String firstName, String lastName,String mailAddress, String password, String submitStatus_yesOrNo)
	{
		try 
		{
			clear_Signupform();			
			if(!mailAddress.equals("generateNewMailId")) {
				fillSignUpForm(firstName, lastName, mailAddress, password);}
			else {String randomMailAddress = generateRandomEmailAddress();
			fillSignUpForm(firstName, lastName, randomMailAddress, password);}
			if(submitStatus_yesOrNo.equalsIgnoreCase("Yes")){
				submitSignUpForm();}

		} 
		catch (Exception e) 
		{   e.printStackTrace();
		testStepFailed("Failed to clear and enter data in signup form " + e.getClass());
		}
	}


	/**
	 *This method is used to verify signuppage and refresh that page
	 *
	 *@author VijayaKumar.U
	 */
	public void verifySignUpPageAndRefreshThatPage()
	{
		try 
		{
			verify_SignUpPage_displayed();
			refreshPage();			
		} 
		catch (Exception e) 
		{   e.printStackTrace();
		testStepFailed("Failed to verify and refresh signup page " + e.getClass());
		}
	}
	public void openSignUpPage()
	{
		try 
		{
			clickOnSpecialElement(btn_Login);
			clickOn(btn_signUp_InLoginForm);
		} 
		catch (Exception e) 
		{   e.printStackTrace();
		testStepFailed("Failed to verify and refresh signup page " + e.getClass());
		}
	}
	/**
	 *This method is used to navigate back and refresh that page
	 *
	 *@author VijayaKumar.U
	 */
	public void navigateBackAndRefreshThatPage()
	{
		try 
		{
			navigateBack();			
			refreshPage();	
		} 
		catch (Exception e) 
		{   e.printStackTrace();
		testStepFailed("Failed to navigate back and refresh the page " + e.getClass());
		}
	}
	
	

	}
	//Newly Added - End
